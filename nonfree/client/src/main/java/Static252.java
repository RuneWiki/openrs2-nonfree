import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	public static int anInt4805;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public static int anInt4800 = 0;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public static int anInt4804 = -1;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIBII)V")
	public static void method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg0; local7++) {
			Static188.method3208(arg4, arg3, arg1, Static349.anIntArrayArray71[local7]);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(JI)V")
	public static void method4190(@OriginalArg(0) long arg0) {
		if (Static348.aClass84ArrayArrayArray5 != null) {
			if (Static407.anInt6909 == 1 || Static407.anInt6909 == 5) {
				Static446.method6386(arg0);
			} else if (Static407.anInt6909 == 4) {
				Static515.method7138(arg0);
			}
		}
		Static291.method4618(Static141.aClass13_27, (long) Static389.anInt6694);
		if (Static592.anInt9857 != -1) {
			Static343.method5202(Static592.anInt9857);
		}
		for (@Pc(39) int local39 = 0; local39 < Static509.anInt8223; local39++) {
			if (Static377.aBooleanArray14[local39]) {
				Static375.aBooleanArray13[local39] = true;
			}
			Static205.aBooleanArray16[local39] = Static377.aBooleanArray14[local39];
			Static377.aBooleanArray14[local39] = false;
		}
		Static48.anInt1286 = Static389.anInt6694;
		Static90.method1856((Class303) null, -1, -1);
		Static577.method8013((Class303) null, -1, -1);
		if (Static592.anInt9857 != -1) {
			Static509.anInt8223 = 0;
			Static34.method762();
		}
		Static141.aClass13_27.la();
		Static377.method5630(Static141.aClass13_27);
		@Pc(94) int local94 = Static228.method3701();
		if (local94 == -1) {
			local94 = Static398.anInt6843;
		}
		if (local94 == -1) {
			local94 = Static492.anInt7871;
		}
		Static165.method2815(local94);
		@Pc(119) int local119 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() << 8;
		Static386.method5692(Static190.anInt3789, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 + local119, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 + local119);
		Static190.anInt3789 = 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!mca;")
	public static Class221 method4191(@OriginalArg(0) Component arg0) {
		return new Class221_Sub1(arg0);
	}
}
