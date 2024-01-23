import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(27) int[] local27 = this.method3514(arg0, 2);
			@Pc(35) int[][] local35 = this.method3501(arg0, 0);
			@Pc(43) int[][] local43 = this.method3501(arg0, 1);
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[2];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local35[1];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local43[1];
			@Pc(75) int[] local75 = local43[2];
			@Pc(79) int[] local79 = local43[0];
			for (@Pc(81) int local81 = 0; local81 < Static105.anInt2391; local81++) {
				@Pc(87) int local87 = local27[local81];
				if (local87 == 4096) {
					local51[local81] = local59[local81];
					local47[local81] = local63[local81];
					local55[local81] = local67[local81];
				} else if (local87 == 0) {
					local51[local81] = local79[local81];
					local47[local81] = local71[local81];
					local55[local81] = local75[local81];
				} else {
					@Pc(117) int local117 = 4096 - local87;
					local51[local81] = local59[local81] * local87 + local117 * local79[local81] >> 12;
					local47[local81] = local71[local81] * local117 + local63[local81] * local87 >> 12;
					local55[local81] = local67[local81] * local87 + local117 * local75[local81] >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(21) int[] local21 = this.method3514(arg0, 0);
			@Pc(27) int[] local27 = this.method3514(arg0, 1);
			@Pc(33) int[] local33 = this.method3514(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static105.anInt2391; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local41) * local27[local35] + local21[local35] * local41 >> 12;
				}
			}
		}
		return local11;
	}
}
