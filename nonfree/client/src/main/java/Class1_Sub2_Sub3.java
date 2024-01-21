import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(24) int[] local24 = this.method3401(arg0, 0);
			@Pc(30) int[] local30 = this.method3401(arg0, 1);
			@Pc(36) int[] local36 = this.method3401(arg0, 2);
			for (@Pc(38) int local38 = 0; local38 < Static22.anInt596; local38++) {
				@Pc(44) int local44 = local36[local38];
				if (local44 == 4096) {
					local14[local38] = local24[local38];
				} else if (local44 == 0) {
					local14[local38] = local30[local38];
				} else {
					local14[local38] = local24[local38] * local44 + (4096 - local44) * local30[local38] >> 12;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(17) int[] local17 = this.method3401(arg0, 2);
			@Pc(23) int[][] local23 = this.method3390(arg0, 0);
			@Pc(29) int[][] local29 = this.method3390(arg0, 1);
			@Pc(33) int[] local33 = local7[1];
			@Pc(37) int[] local37 = local23[0];
			@Pc(41) int[] local41 = local7[0];
			@Pc(45) int[] local45 = local7[2];
			@Pc(49) int[] local49 = local23[2];
			@Pc(53) int[] local53 = local23[1];
			@Pc(57) int[] local57 = local29[0];
			@Pc(61) int[] local61 = local29[1];
			@Pc(65) int[] local65 = local29[2];
			for (@Pc(67) int local67 = 0; local67 < Static22.anInt596; local67++) {
				@Pc(73) int local73 = local17[local67];
				if (local73 == 4096) {
					local41[local67] = local37[local67];
					local33[local67] = local53[local67];
					local45[local67] = local49[local67];
				} else if (local73 == 0) {
					local41[local67] = local57[local67];
					local33[local67] = local61[local67];
					local45[local67] = local65[local67];
				} else {
					@Pc(103) int local103 = 4096 - local73;
					local41[local67] = local37[local67] * local73 + local103 * local57[local67] >> 12;
					local33[local67] = local73 * local53[local67] + local103 * local61[local67] >> 12;
					local45[local67] = local73 * local49[local67] + local103 * local65[local67] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}
}
