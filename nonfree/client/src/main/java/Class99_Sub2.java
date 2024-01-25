import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "J")
	private long aLong105 = 0L;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
	private int anInt3220 = 1;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "J")
	private long aLong106 = 0L;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	private int anInt3221 = 0;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class99_Sub2() {
		this.aLong104 = this.aLong105 = jagmisc.nanoTime();
		if (this.aLong105 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method2627() {
		if (this.aLong105 < this.aLong104) {
			this.aLong105 += this.aLong104 - this.aLong105;
		}
		this.aLong106 = 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)I")
	@Override
	public int method2624(@OriginalArg(1) int arg0) {
		this.aLong105 += this.method2611();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong105 < this.aLong104) {
			Static214.method2089((this.aLong104 - this.aLong105) / 1000000L);
			this.aLong106 += this.aLong104 - this.aLong105;
			this.aLong105 += this.aLong104 - this.aLong105;
			this.aLong104 += local17;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong104 += local17;
		} while (local25 < 10 && this.aLong105 > this.aLong104);
		if (this.aLong104 < this.aLong105) {
			this.aLong104 = this.aLong105;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)J")
	@Override
	public long method2626() {
		return this.aLong105;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)J")
	private long method2611() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong106;
		this.aLong106 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt3221] = local7;
			if (this.anInt3220 < 1) {
				this.anInt3220++;
			}
			this.anInt3221 = (this.anInt3221 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3220; local56++) {
			local54 += this.aLongArray4[(this.anInt3221 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt3220;
	}
}
