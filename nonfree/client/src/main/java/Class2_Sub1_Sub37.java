import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	private int anInt4169;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	private int anInt4175;

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
	private int anInt4177;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4175 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt4169 = arg0.method1402();
		} else if (arg1 == 2) {
			this.anInt4177 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			for (@Pc(24) int local24 = 0; local24 < Static120.anInt2812; local24++) {
				@Pc(30) int local30 = Static11.anIntArray8[arg0];
				@Pc(34) int local34 = Static69.anIntArray117[local24];
				@Pc(41) int local41 = this.anInt4169 * local30 >> 12;
				@Pc(51) int local51 = local34 % (4096 / this.anInt4175) * this.anInt4175;
				@Pc(61) int local61 = this.anInt4169 * (local30 % (4096 / this.anInt4169));
				@Pc(68) int local68 = local34 * this.anInt4175 >> 12;
				if (this.anInt4177 > local61) {
					for (local68 -= local41; local68 < 0; local68 += 4) {
					}
					while (local68 > 3) {
						local68 -= 4;
					}
					if (local68 != 1) {
						local11[local24] = 0;
						continue;
					}
					if (this.anInt4177 > local51) {
						local11[local24] = 0;
						continue;
					}
				}
				if (local51 < this.anInt4177) {
					for (local68 -= local41; local68 < 0; local68 += 4) {
					}
					while (local68 > 3) {
						local68 -= 4;
					}
					if (local68 > 0) {
						local11[local24] = 0;
						continue;
					}
				}
				local11[local24] = 4096;
			}
		}
		return local11;
	}
}
