import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!cka;")
	public static Class63 aClass63_4;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!uu;")
	public static Class239 aClass239_4;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_15 = new Class83(512);

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_35 = new Class165(3000000, 200);

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method4619() {
		Static567.anInt5924 = 0;
		@Pc(18) int local18 = Static210.aClass3_Sub25_Sub1_3.method8639();
		@Pc(24) int local24 = Static210.aClass3_Sub25_Sub1_3.method8615();
		@Pc(35) boolean local35 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
		@Pc(39) int local39 = Static210.aClass3_Sub25_Sub1_3.method8592();
		Static283.method4526();
		Static628.method8786(local24);
		@Pc(51) int local51 = (Static467.anInt7682 - Static210.aClass3_Sub25_Sub1_3.anInt9765) / 16;
		Static597.anIntArrayArray58 = new int[local51][4];
		@Pc(61) int local61;
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static597.anIntArrayArray58[local57][local61] = Static210.aClass3_Sub25_Sub1_3.method8618();
			}
		}
		Static635.aByteArrayArray28 = null;
		Static460.anIntArray648 = null;
		Static198.anIntArray945 = new int[local51];
		Static281.anIntArray439 = new int[local51];
		Static250.anIntArray410 = new int[local51];
		Static585.aByteArrayArray25 = new byte[local51][];
		Static654.aByteArrayArray30 = new byte[local51][];
		Static73.aByteArrayArray6 = new byte[local51][];
		Static77.anIntArray125 = new int[local51];
		Static647.anIntArray907 = new int[local51];
		Static134.aByteArrayArray10 = new byte[local51][];
		local51 = 0;
		for (local61 = (local18 - (Static158.anInt927 >> 4)) / 8; local61 <= ((Static158.anInt927 >> 4) + local18) / 8; local61++) {
			for (@Pc(140) int local140 = (local39 - (Static515.anInt8292 >> 4)) / 8; local140 <= ((Static515.anInt8292 >> 4) + local39) / 8; local140++) {
				Static77.anIntArray125[local51] = (local61 << 8) + local140;
				Static647.anIntArray907[local51] = Static590.aClass15_146.method514("m" + local61 + "_" + local140);
				Static250.anIntArray410[local51] = Static590.aClass15_146.method514("l" + local61 + "_" + local140);
				Static198.anIntArray945[local51] = Static590.aClass15_146.method514("um" + local61 + "_" + local140);
				Static281.anIntArray439[local51] = Static590.aClass15_146.method514("ul" + local61 + "_" + local140);
				local51++;
			}
		}
		Static65.method1331(local18, local35, local39, 11);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4621(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V")
	public static void method4622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static55.aClass118_2 == Static68.aClass118_3) {
			if (!Static471.method6829(0, 1, -2, arg1, arg0, 1, 0, false)) {
				Static471.method6829(0, 1, -3, arg1, arg0, 1, 0, false);
			}
		} else if (!Static471.method6829(0, 1, -3, arg1, arg0, 1, 0, false)) {
			Static471.method6829(0, 1, -2, arg1, arg0, 1, 0, false);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method4623() {
		return Static43.aBoolean74 || Static150.aClass3_Sub11_Sub14_2 == null ? "" : Static150.aClass3_Sub11_Sub14_2.aString65;
	}
}
