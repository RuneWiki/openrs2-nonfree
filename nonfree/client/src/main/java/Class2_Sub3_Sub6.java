import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(17) int[] local17 = this.method2901(2, arg0);
			@Pc(23) int[][] local23 = this.method2900(arg0, 0);
			@Pc(29) int[][] local29 = this.method2900(arg0, 1);
			@Pc(33) int[] local33 = local7[1];
			@Pc(37) int[] local37 = local7[0];
			@Pc(41) int[] local41 = local7[2];
			@Pc(45) int[] local45 = local23[1];
			@Pc(49) int[] local49 = local23[0];
			@Pc(53) int[] local53 = local23[2];
			@Pc(57) int[] local57 = local29[1];
			@Pc(61) int[] local61 = local29[0];
			@Pc(65) int[] local65 = local29[2];
			for (@Pc(67) int local67 = 0; local67 < Static54.anInt1423; local67++) {
				@Pc(73) int local73 = local17[local67];
				if (local73 == 4096) {
					local37[local67] = local49[local67];
					local33[local67] = local45[local67];
					local41[local67] = local53[local67];
				} else if (local73 == 0) {
					local37[local67] = local61[local67];
					local33[local67] = local57[local67];
					local41[local67] = local65[local67];
				} else {
					@Pc(123) int local123 = 4096 - local73;
					local37[local67] = local73 * local49[local67] + local61[local67] * local123 >> 12;
					local33[local67] = local57[local67] * local123 + local45[local67] * local73 >> 12;
					local41[local67] = local123 * local65[local67] + local73 * local53[local67] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(21) int[] local21 = this.method2901(0, arg0);
			@Pc(29) int[] local29 = this.method2901(1, arg0);
			@Pc(35) int[] local35 = this.method2901(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static54.anInt1423; local37++) {
				@Pc(43) int local43 = local35[local37];
				if (local43 == 4096) {
					local11[local37] = local21[local37];
				} else if (local43 == 0) {
					local11[local37] = local29[local37];
				} else {
					local11[local37] = local29[local37] * (4096 - local43) + local43 * local21[local37] >> 12;
				}
			}
		}
		return local11;
	}
}
