import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt9247;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[[Lclient!pn;")
	public static Class25_Sub2[][] aClass25_Sub2ArrayArray5;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[200];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt9251 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public static void method7269(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static121.aBooleanArray7[arg0]) {
			Static117.aClass284_36.method6327(arg0);
			Static449.aClass251ArrayArray1[arg0] = null;
			Static516.aClass251ArrayArray2[arg0] = null;
			Static121.aBooleanArray7[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method7270() {
		try {
			@Pc(15) int local15;
			if (anInt9251 == 1) {
				local15 = Static548.aClass3_Sub16_Sub3_4.method6121();
				if (local15 > 0 && Static548.aClass3_Sub16_Sub3_4.method6106()) {
					local15 -= Static426.anInt7533;
					if (local15 < 0) {
						local15 = 0;
					}
					Static548.aClass3_Sub16_Sub3_4.method6105(local15);
					return;
				}
				Static548.aClass3_Sub16_Sub3_4.method6125();
				Static548.aClass3_Sub16_Sub3_4.method6124();
				if (Static130.aClass284_126 == null) {
					anInt9251 = 0;
				} else {
					anInt9251 = 2;
				}
				Static459.aClass3_Sub22_2 = null;
				Static352.aClass20_1 = null;
			}
			if (anInt9251 == 3) {
				local15 = Static548.aClass3_Sub16_Sub3_4.method6121();
				if (Static213.anInt4459 > local15 && Static548.aClass3_Sub16_Sub3_4.method6106()) {
					local15 += Static288.anInt5396;
					if (local15 > Static213.anInt4459) {
						local15 = Static213.anInt4459;
					}
					Static548.aClass3_Sub16_Sub3_4.method6105(local15);
				} else {
					Static288.anInt5396 = 0;
					anInt9251 = 0;
				}
			}
		} catch (@Pc(92) Exception local92) {
			local92.printStackTrace();
			Static548.aClass3_Sub16_Sub3_4.method6125();
			Static130.aClass284_126 = null;
			anInt9251 = 0;
			Static459.aClass3_Sub22_2 = null;
			Static352.aClass20_1 = null;
			Static533.aClass3_Sub16_Sub3_3 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!sp;)I")
	public static int method7272(@OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub2 arg0) {
		@Pc(8) Class213 local8 = arg0.aClass213_1;
		if (local8.anIntArray345 != null) {
			local8 = local8.method4998(Static206.aClass143_3);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt6201;
		@Pc(32) Class122 local32 = arg0.method6683();
		if (arg0.anInt8516 == -1 || arg0.aBoolean579) {
			local28 = local8.anInt6190;
		} else if (local32.anInt4206 == arg0.anInt8516 || local32.anInt4221 == arg0.anInt8516 || arg0.anInt8516 == local32.anInt4195 || arg0.anInt8516 == local32.anInt4225) {
			local28 = local8.anInt6207;
		} else if (local32.anInt4187 == arg0.anInt8516 || local32.anInt4205 == arg0.anInt8516 || local32.anInt4211 == arg0.anInt8516 || arg0.anInt8516 == local32.anInt4198) {
			local28 = local8.anInt6178;
		}
		return local28;
	}
}
