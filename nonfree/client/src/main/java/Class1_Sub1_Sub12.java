import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(26) int[] local26 = this.method7836(arg0, 2);
			@Pc(34) int[][] local34 = this.method7833(0, arg0);
			@Pc(40) int[][] local40 = this.method7833(1, arg0);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static501.anInt8748; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(95) int local95 = 4096 - local84;
					local44[local78] = local68[local78] * local95 + local84 * local56[local78] >> 12;
					local48[local78] = local95 * local72[local78] + local60[local78] * local84 >> 12;
					local52[local78] = local84 * local64[local78] + local76[local78] * local95 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(26) int[] local26 = this.method7836(arg0, 0);
			@Pc(32) int[] local32 = this.method7836(arg0, 1);
			@Pc(38) int[] local38 = this.method7836(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static501.anInt8748; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local26[local40] * local46 + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local11;
	}
}
