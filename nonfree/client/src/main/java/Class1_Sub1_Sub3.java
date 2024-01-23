import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(21) int[] local21 = this.method4450(2, arg0);
			@Pc(27) int[][] local27 = this.method4457(0, arg0);
			@Pc(33) int[][] local33 = this.method4457(1, arg0);
			@Pc(37) int[] local37 = local11[2];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static131.anInt2513; local71++) {
				@Pc(78) int local78 = local21[local71];
				if (local78 == 4096) {
					local45[local71] = local49[local71];
					local41[local71] = local53[local71];
					local37[local71] = local57[local71];
				} else if (local78 == 0) {
					local45[local71] = local61[local71];
					local41[local71] = local65[local71];
					local37[local71] = local69[local71];
				} else {
					@Pc(113) int local113 = 4096 - local78;
					local45[local71] = local61[local71] * local113 + local49[local71] * local78 >> 12;
					local41[local71] = local78 * local53[local71] + local65[local71] * local113 >> 12;
					local37[local71] = local69[local71] * local113 + local57[local71] * local78 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(27) int[] local27 = this.method4450(0, arg0);
			@Pc(33) int[] local33 = this.method4450(1, arg0);
			@Pc(39) int[] local39 = this.method4450(2, arg0);
			for (@Pc(41) int local41 = 0; local41 < Static131.anInt2513; local41++) {
				@Pc(52) int local52 = local39[local41];
				if (local52 == 4096) {
					local17[local41] = local27[local41];
				} else if (local52 == 0) {
					local17[local41] = local33[local41];
				} else {
					local17[local41] = local27[local41] * local52 + (4096 - local52) * local33[local41] >> 12;
				}
			}
		}
		return local17;
	}
}
