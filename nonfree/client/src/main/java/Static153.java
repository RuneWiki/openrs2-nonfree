import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt3033;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	public static int anInt3036;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!bs;")
	public static final Class3_Sub11_Sub1[] aClass3_Sub11_Sub1Array1 = new Class3_Sub11_Sub1[14];

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString28 = "";

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_36 = new Class218(44, 3);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22;
		if (Static27.method666(arg4)) {
			local22 = 0;
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (Static82.aBoolean134) {
				local45 = Static457.anInt7571;
				local41 = Static515.anInt8290;
				local39 = Static554.anInt9044;
				local22 = Static291.anInt4944;
				local43 = Static566.anInt9180;
				Static457.anInt7571 = 1;
			}
			if (Static285.aClass260ArrayArray4[arg4] == null) {
				Static193.method3545(arg0, arg3 < 0, arg6, arg1, arg2, -1, arg7, arg5, arg3, Static489.aClass260ArrayArray3[arg4]);
			} else {
				Static193.method3545(arg0, arg3 < 0, arg6, arg1, arg2, -1, arg7, arg5, arg3, Static285.aClass260ArrayArray4[arg4]);
			}
			if (Static82.aBoolean134) {
				if (arg3 >= 0 && Static457.anInt7571 == 2) {
					Static642.method8919(Static515.anInt8290, Static566.anInt9180, Static554.anInt9044, Static291.anInt4944);
				}
				Static566.anInt9180 = local43;
				Static554.anInt9044 = local39;
				Static515.anInt8290 = local41;
				Static457.anInt7571 = local45;
				Static291.anInt4944 = local22;
			}
		} else if (arg3 == -1) {
			for (local22 = 0; local22 < 100; local22++) {
				Static200.aBooleanArray21[local22] = true;
			}
		} else {
			Static200.aBooleanArray21[arg3] = true;
		}
	}
}
