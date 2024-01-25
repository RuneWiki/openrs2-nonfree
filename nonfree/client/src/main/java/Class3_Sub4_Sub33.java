import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class3_Sub4_Sub33 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub33() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(21) int[] local21 = this.method6139(0, arg0);
			@Pc(27) int[] local27 = this.method6139(1, arg0);
			@Pc(33) int[] local33 = this.method6139(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static148.anInt2687; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local27[local35] * (4096 - local41) + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(21) int[] local21 = this.method6139(2, arg0);
			@Pc(27) int[][] local27 = this.method6138(arg0, 0);
			@Pc(33) int[][] local33 = this.method6138(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static148.anInt2687; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(126) int local126 = 4096 - local77;
					local37[local71] = local49[local71] * local77 + local126 * local61[local71] >> 12;
					local41[local71] = local77 * local53[local71] + local65[local71] * local126 >> 12;
					local45[local71] = local57[local71] * local77 + local126 * local69[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
