import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class5_Sub2_Sub32 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
	private int anInt8861 = 204;

	@OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
	private int anInt8859 = 1;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	private int anInt8864 = 1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8864 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt8859 = arg0.method8645();
		} else if (arg1 == 2) {
			this.anInt8861 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			for (@Pc(17) int local17 = 0; local17 < Static314.anInt6320; local17++) {
				@Pc(23) int local23 = Static68.anIntArray94[local17];
				@Pc(27) int local27 = Static61.anIntArray80[arg0];
				@Pc(34) int local34 = this.anInt8864 * local23 >> 12;
				@Pc(41) int local41 = this.anInt8859 * local27 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt8864) * this.anInt8864;
				@Pc(61) int local61 = local27 % (4096 / this.anInt8859) * this.anInt8859;
				if (this.anInt8861 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt8861) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt8861) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
