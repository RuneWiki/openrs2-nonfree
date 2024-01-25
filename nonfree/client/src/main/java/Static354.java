import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_98 = new Class314(84, 8);

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[2];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIIILclient!ni;I)V")
	public static void method5705(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class9_Sub2_Sub1_Sub2 arg2, @OriginalArg(6) int arg3) {
		Static537.method7780(arg2.anInt10158, arg3, arg0, 0, arg2.anInt10152, arg1, arg2.aByte127);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method5707() {
		try {
			@Pc(15) int local15;
			if (Static169.anInt3281 == 1) {
				local15 = Static466.aClass3_Sub3_Sub1_3.method153();
				if (local15 > 0 && Static466.aClass3_Sub3_Sub1_3.method165()) {
					local15 -= Static428.anInt7479;
					if (local15 < 0) {
						local15 = 0;
					}
					Static466.aClass3_Sub3_Sub1_3.method161(local15);
					return;
				}
				Static466.aClass3_Sub3_Sub1_3.method136();
				Static466.aClass3_Sub3_Sub1_3.method149();
				Static475.aClass92_1 = null;
				Static5.aClass3_Sub6_1 = null;
				if (Static240.aClass343_120 == null) {
					Static169.anInt3281 = 0;
				} else {
					Static169.anInt3281 = 2;
				}
			}
			if (Static169.anInt3281 == 3) {
				local15 = Static466.aClass3_Sub3_Sub1_3.method153();
				if (Static229.anInt4628 > local15 && Static466.aClass3_Sub3_Sub1_3.method165()) {
					local15 += Static491.anInt8356;
					if (Static229.anInt4628 < local15) {
						local15 = Static229.anInt4628;
					}
					Static466.aClass3_Sub3_Sub1_3.method161(local15);
				} else {
					Static169.anInt3281 = 0;
					Static491.anInt8356 = 0;
				}
			}
		} catch (@Pc(86) Exception local86) {
			local86.printStackTrace();
			Static466.aClass3_Sub3_Sub1_3.method136();
			Static522.aClass3_Sub3_Sub1_4 = null;
			Static5.aClass3_Sub6_1 = null;
			Static169.anInt3281 = 0;
			Static240.aClass343_120 = null;
			Static475.aClass92_1 = null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!sba;B)Ljava/lang/String;")
	public static String method5709(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		if (arg0.aString84 == null || arg0.aString84.length() == 0) {
			return arg0.aString83 == null || arg0.aString83.length() <= 0 ? arg0.aString82 : arg0.aString82 + Static369.aClass235_35.method5893(Static455.anInt7738) + arg0.aString83;
		} else if (arg0.aString83 == null || arg0.aString83.length() <= 0) {
			return arg0.aString82 + Static369.aClass235_35.method5893(Static455.anInt7738) + arg0.aString84;
		} else {
			return arg0.aString82 + Static369.aClass235_35.method5893(Static455.anInt7738) + arg0.aString83 + Static369.aClass235_35.method5893(Static455.anInt7738) + arg0.aString84;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)Z")
	public static boolean method5710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static471.method6967(arg1, arg0)) {
			return Static595.method8233(arg0, arg1) | (arg1 & 0x9000) != 0 | Static403.method6304(arg1, arg0) ? true : (Static270.method4505(arg0, arg1) | (arg1 & 0x2000) != 0 | Static500.method7264(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
