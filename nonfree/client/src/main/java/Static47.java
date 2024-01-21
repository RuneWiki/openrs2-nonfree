import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "[I")
	public static int[] anIntArray195 = Class2_Sub2_Sub3_Sub1.anIntArray50;

	@OriginalMember(owner = "client!fe", name = "sb", descriptor = "[I")
	private static int[] anIntArray198 = new int[10000];

	@OriginalMember(owner = "client!fe", name = "Fb", descriptor = "[I")
	private static int[] anIntArray201 = new int[10000];

	@OriginalMember(owner = "client!fe", name = "Hb", descriptor = "I")
	private static int anInt1245 = 0;

	@OriginalMember(owner = "client!fe", name = "Yb", descriptor = "[I")
	public static int[] anIntArray203 = Class2_Sub2_Sub3_Sub1.anIntArray52;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fe;Lclient!fe;IIIZ)V")
	public static void method862(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method872();
		arg0.method875();
		arg1.method872();
		arg1.method875();
		anInt1245++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray199;
		@Pc(19) int local19 = arg1.anInt1244;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1244; local21++) {
			@Pc(27) Class65 local27 = arg0.aClass65Array1[local21];
			if (local27.anInt3114 != 0) {
				local37 = arg0.anIntArray202[local21] - arg3;
				if (local37 >= arg1.aShort32 && local37 <= arg1.aShort26) {
					@Pc(53) int local53 = arg0.anIntArray199[local21] - arg2;
					if (local53 >= arg1.aShort23 && local53 <= arg1.aShort25) {
						@Pc(69) int local69 = arg0.anIntArray200[local21] - arg4;
						if (local69 >= arg1.aShort22 && local69 <= arg1.aShort20) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class65 local86 = arg1.aClass65Array1[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray200[local80] && local37 == arg1.anIntArray202[local80] && local86.anInt3114 != 0) {
									if (arg0.aClass65Array2 == null) {
										arg0.aClass65Array2 = new Class65[arg0.anInt1244];
									}
									if (arg1.aClass65Array2 == null) {
										arg1.aClass65Array2 = new Class65[local19];
									}
									@Pc(126) Class65 local126 = arg0.aClass65Array2[local21];
									if (local126 == null) {
										local126 = arg0.aClass65Array2[local21] = new Class65(local27);
									}
									@Pc(143) Class65 local143 = arg1.aClass65Array2[local80];
									if (local143 == null) {
										local143 = arg1.aClass65Array2[local80] = new Class65(local86);
									}
									local126.anInt3113 += local86.anInt3113;
									local126.anInt3115 += local86.anInt3115;
									local126.anInt3117 += local86.anInt3117;
									local126.anInt3114 += local86.anInt3114;
									local143.anInt3113 += local27.anInt3113;
									local143.anInt3115 += local27.anInt3115;
									local143.anInt3117 += local27.anInt3117;
									local143.anInt3114 += local27.anInt3114;
									local13++;
									anIntArray198[local21] = anInt1245;
									anIntArray201[local80] = anInt1245;
								}
							}
						}
					}
				}
			}
		}
		if (local13 < 3 || !arg5) {
			return;
		}
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt1243; local237++) {
			if (anIntArray198[arg0.anIntArray204[local237]] == anInt1245 && anIntArray198[arg0.anIntArray206[local237]] == anInt1245 && anIntArray198[arg0.anIntArray205[local237]] == anInt1245) {
				if (arg0.aByteArray18 == null) {
					arg0.aByteArray18 = new byte[arg0.anInt1243];
				}
				arg0.aByteArray18[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1243; local37++) {
			if (anIntArray201[arg1.anIntArray204[local37]] == anInt1245 && anIntArray201[arg1.anIntArray206[local37]] == anInt1245 && anIntArray201[arg1.anIntArray205[local37]] == anInt1245) {
				if (arg1.aByteArray18 == null) {
					arg1.aByteArray18 = new byte[arg1.anInt1243];
				}
				arg1.aByteArray18[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "()V")
	public static void method876() {
		anIntArray198 = null;
		anIntArray201 = null;
		anIntArray195 = null;
		anIntArray203 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ke;II)Lclient!fe;")
	public static Class2_Sub2_Sub1_Sub3 method877(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2205(0, arg1);
		return local5 == null ? null : new Class2_Sub2_Sub1_Sub3(local5);
	}
}
