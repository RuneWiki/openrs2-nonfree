import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
	public static int[] anIntArray714;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!bi;)Lclient!bi;")
	public static Class26 method4744(@OriginalArg(1) Class26 arg0) {
		@Pc(11) Class26 local11 = Static45.method1028(arg0);
		if (local11 == null) {
			local11 = arg0.aClass26_6;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method4745() {
		Static42.method899((long) Static212.anInt4234, Static128.aClass89_3);
		if (Static161.anInt3337 != -1) {
			Static71.method1393(Static161.anInt3337);
		}
		for (@Pc(27) int local27 = 0; local27 < Static43.anInt1148; local27++) {
			if (Static276.aBooleanArray27[local27]) {
				Static339.aBooleanArray30[local27] = true;
			}
			Static280.aBooleanArray21[local27] = Static276.aBooleanArray27[local27];
			Static276.aBooleanArray27[local27] = false;
		}
		Static286.anInt5635 = Static212.anInt4234;
		if (Static128.aClass89_3.method5393()) {
			Static164.aBoolean249 = true;
		}
		Static162.aClass26_17 = null;
		if (Static161.anInt3337 != -1) {
			Static43.anInt1148 = 0;
			Static118.method5339();
		}
		Static128.aClass89_3.method5425();
		Static291.method4774(Static348.anInt6555);
		Static105.anInt6011 = 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method4746() {
		try {
			if (Static129.anInt2826 == 1) {
				@Pc(16) int local16 = Static214.aClass7_Sub8_Sub2_3.method3122();
				if (local16 > 0 && Static214.aClass7_Sub8_Sub2_3.method3115()) {
					local16 -= Static286.anInt5630;
					if (local16 < 0) {
						local16 = 0;
					}
					Static214.aClass7_Sub8_Sub2_3.method3092(local16);
				} else {
					Static214.aClass7_Sub8_Sub2_3.method3114();
					Static214.aClass7_Sub8_Sub2_3.method3125();
					Static55.aClass7_Sub38_1 = null;
					if (Static98.aClass180_12 == null) {
						Static129.anInt2826 = 0;
					} else {
						Static129.anInt2826 = 2;
					}
					Static10.aClass100_1 = null;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static214.aClass7_Sub8_Sub2_3.method3114();
			Static10.aClass100_1 = null;
			Static55.aClass7_Sub38_1 = null;
			Static98.aClass180_12 = null;
			Static129.anInt2826 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method4747() {
		Static320.anInt6124 = 0;
		@Pc(17) int local17 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7) + Static350.anInt6609;
		@Pc(24) int local24 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7) + Static237.anInt4696;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static320.anInt6124 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static320.anInt6124 = 1;
		}
		if (Static320.anInt6124 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static320.anInt6124 = 0;
		}
	}
}
