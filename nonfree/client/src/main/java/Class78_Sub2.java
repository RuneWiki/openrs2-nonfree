import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "J")
	private long aLong135 = 0L;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	private int anInt3605 = 1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	private int anInt3604 = 0;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[J")
	private long[] aLongArray28 = new long[10];

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class78_Sub2() {
		this.aLong135 = this.aLong134 = jagmisc.nanoTime();
		if (this.aLong134 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)J")
	@Override
	public long method3302() {
		return this.aLong134;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J")
	private long method3034() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong136;
		this.aLong136 = local1;
		@Pc(12) long local12 = 0L;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray28[this.anInt3604] = local7;
			if (this.anInt3605 < 1) {
				this.anInt3605++;
			}
			this.anInt3604 = (this.anInt3604 + 1) % 10;
		}
		for (@Pc(52) int local52 = 1; local52 <= this.anInt3605; local52++) {
			local12 += this.aLongArray28[(this.anInt3604 + 10 - local52) % 10];
		}
		return local12 / (long) this.anInt3605;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	@Override
	public int method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static303.method4677((long) arg0);
		@Pc(13) long local13 = (long) arg1 * 1000000L;
		this.aLong134 += this.method3034();
		if (this.aLong134 < this.aLong135) {
			Static303.method4677((this.aLong135 - this.aLong134) / 1000000L);
			this.aLong136 += this.aLong135 - this.aLong134;
			this.aLong134 += this.aLong135 - this.aLong134;
			this.aLong135 += local13;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			this.aLong135 += local13;
			local72++;
		} while (local72 < 10 && this.aLong135 < this.aLong134);
		if (this.aLong135 < this.aLong134) {
			this.aLong135 = this.aLong134;
		}
		return local72;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.aLong136 = 0L;
		if (this.aLong135 > this.aLong134) {
			this.aLong134 += this.aLong135 - this.aLong134;
		}
	}
}
