import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	private int anInt42;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt43 = 256;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	private int anInt40 = 0;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	private int anInt39 = 1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "J")
	private long aLong1 = Static8.method75();

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	@Override
	public void method632() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray1[local11] = 0L;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	@Override
	public int method635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt43;
		this.anInt43 = 300;
		@Pc(14) int local14 = this.anInt39;
		this.anInt39 = 1;
		this.aLong1 = Static8.method75();
		if (this.aLongArray1[this.anInt42] == 0L) {
			this.anInt39 = local14;
			this.anInt43 = local8;
		} else if (this.aLongArray1[this.anInt42] < this.aLong1) {
			this.anInt43 = (int) ((long) (arg0 * 2560) / (this.aLong1 - this.aLongArray1[this.anInt42]));
		}
		if (this.anInt43 < 25) {
			this.anInt43 = 25;
		}
		if (this.anInt43 > 256) {
			this.anInt43 = 256;
			this.anInt39 = (int) ((long) arg0 - (this.aLong1 - this.aLongArray1[this.anInt42]) / 10L);
		}
		if (arg0 < this.anInt39) {
			this.anInt39 = arg0;
		}
		this.aLongArray1[this.anInt42] = this.aLong1;
		this.anInt42 = (this.anInt42 + 1) % 10;
		@Pc(134) int local134;
		if (this.anInt39 > 1) {
			for (local134 = 0; local134 < 10; local134++) {
				if (this.aLongArray1[local134] != 0L) {
					this.aLongArray1[local134] += this.anInt39;
				}
			}
		}
		if (arg1 > this.anInt39) {
			this.anInt39 = arg1;
		}
		Static103.method1711((long) this.anInt39);
		local134 = 0;
		while (this.anInt40 < 256) {
			this.anInt40 += this.anInt43;
			local134++;
		}
		this.anInt40 &= 0xFF;
		return local134;
	}
}
