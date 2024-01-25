import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	private int anInt3155 = 1;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
	private int anInt3156 = 0;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class10_Sub3() {
		this.aLong109 = this.aLong110 = jagmisc.nanoTime();
		if (this.aLong110 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)J")
	private long method3299() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong111;
		this.aLong111 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt3156] = local7;
			if (this.anInt3155 < 1) {
				this.anInt3155++;
			}
			this.anInt3156 = (this.anInt3156 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3155; local56++) {
			local48 += this.aLongArray5[(this.anInt3156 + 10 - local56) % 10];
		}
		return local48 / (long) this.anInt3155;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	@Override
	public void method3298() {
		this.aLong111 = 0L;
		if (this.aLong109 > this.aLong110) {
			this.aLong110 += this.aLong109 - this.aLong110;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)J")
	@Override
	public long method3296() {
		return this.aLong110;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
	@Override
	public int method3295(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong110 += this.method3299();
		if (this.aLong109 > this.aLong110) {
			Static278.method5283((this.aLong109 - this.aLong110) / 1000000L);
			this.aLong111 += this.aLong109 - this.aLong110;
			this.aLong110 += this.aLong109 - this.aLong110;
			this.aLong109 += local10;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong109 += local10;
			local30++;
		} while (local30 < 10 && this.aLong110 > this.aLong109);
		if (this.aLong109 < this.aLong110) {
			this.aLong109 = this.aLong110;
		}
		return local30;
	}
}
