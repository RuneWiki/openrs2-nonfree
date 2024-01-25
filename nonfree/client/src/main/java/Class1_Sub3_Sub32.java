import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(28) int[] local28 = this.method7128(0, arg0);
			@Pc(34) int[] local34 = this.method7128(1, arg0);
			@Pc(40) int[] local40 = this.method7128(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static452.anInt7734; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local18[local42] = local28[local42];
				} else if (local48 == 0) {
					local18[local42] = local34[local42];
				} else {
					local18[local42] = (4096 - local48) * local34[local42] + local48 * local28[local42] >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(21) int[] local21 = this.method7128(2, arg0);
			@Pc(27) int[][] local27 = this.method7130(arg0, 0);
			@Pc(33) int[][] local33 = this.method7130(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static452.anInt7734; local71++) {
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
					@Pc(106) int local106 = 4096 - local77;
					local37[local71] = local61[local71] * local106 + local49[local71] * local77 >> 12;
					local41[local71] = local53[local71] * local77 + local106 * local65[local71] >> 12;
					local45[local71] = local69[local71] * local106 + local77 * local57[local71] >> 12;
				}
			}
		}
		return local11;
	}
}
