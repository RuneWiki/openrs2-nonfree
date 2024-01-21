import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array38;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Ljava/awt/Image;")
	public static Image anImage34;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1412 = method2017("Feb");

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1417 = method2017("Checking for updates )2 ");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1413 = aClass36_1417;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1414 = method2017("Loading )2 please wait)3");

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt2900 = 0;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1415 = method2017("Jan");

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1416 = method2017("Mar");

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1418 = method2017("Oct");

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1419 = method2017("Jul");

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1420 = method2017("Mem:");

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1421 = aClass36_1414;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1422 = method2017("Nov");

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public static int anInt2903 = 0;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1423 = method2017("Sep");

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1424 = method2017("Aug");

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1425 = method2017("Apr");

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1426 = method2017("May");

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray41 = new byte[250][];

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1427 = method2017("Dec");

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1428 = method2017("Jun");

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array51 = new Class36[] { aClass36_1415, aClass36_1412, aClass36_1416, aClass36_1425, aClass36_1426, aClass36_1428, aClass36_1419, aClass36_1424, aClass36_1423, aClass36_1418, aClass36_1422, aClass36_1427 };

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!kc;")
	public static Class36 method2017(@OriginalArg(0) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(18) Class36 local18 = new Class36();
		local18.aByteArray9 = new byte[local14];
		@Pc(24) int local24 = 0;
		while (local14 > local24) {
			@Pc(32) int local32 = local11[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local24) {
					break;
				}
				@Pc(69) int local69 = local11[local24++] & 0xFF;
				local18.aByteArray9[local18.anInt1442++] = (byte) (local69 + (local32 + -40) * 43 - 48);
			} else if (local32 != 0) {
				local18.aByteArray9[local18.anInt1442++] = (byte) local32;
			}
		}
		local18.method1019();
		return local18.method1013();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method2018() {
		aClass36_1412 = null;
		aClass36_1424 = null;
		aClass36_1417 = null;
		aClass36_1421 = null;
		aClass2_Sub1_Sub1_Sub3Array38 = null;
		aClass36_1414 = null;
		aClass36_1418 = null;
		aClass36_1416 = null;
		aClass36_1425 = null;
		aClass36Array51 = null;
		aClass36_1423 = null;
		anImage34 = null;
		aClass36_1422 = null;
		aClass36_1419 = null;
		aClass36_1426 = null;
		aClass36_1420 = null;
		aClass36_1413 = null;
		aClass36_1428 = null;
		aClass36_1427 = null;
		aByteArrayArray41 = null;
		anIntArray346 = null;
		aClass36_1415 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!r;I)V")
	public static void method2019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub13 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.anInt1154 = arg3.anInt2322;
		local7.anInt1149 = arg3.anInt2301 * 128;
		@Pc(20) int local20 = arg3.anInt2288;
		local7.anInt1139 = arg4;
		local7.anInt1144 = arg0 * 128;
		local7.anInt1150 = arg3.anInt2295;
		local7.anInt1137 = arg1 * 128;
		@Pc(45) int local45 = arg3.anInt2326;
		if (arg2 == 1 || arg2 == 3) {
			local20 = arg3.anInt2326;
			local45 = arg3.anInt2288;
		}
		local7.anInt1135 = (arg0 + local45) * 128;
		local7.anInt1142 = arg3.anInt2291;
		local7.anInt1153 = (local20 + arg1) * 128;
		local7.anIntArray160 = arg3.anIntArray269;
		if (arg3.anIntArray275 != null) {
			local7.aClass2_Sub1_Sub13_1 = arg3;
			local7.method836();
		}
		Static20.aClass8_1.method187(local7);
		if (local7.anIntArray160 != null) {
			local7.anInt1138 = local7.anInt1142 + (int) (Math.random() * (double) (local7.anInt1154 - local7.anInt1142));
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method2020() {
		for (@Pc(3) int local3 = 0; local3 < Static115.anInt1793; local3++) {
			@Pc(9) int local9 = Static74.anIntArray237[local3]--;
			if (Static74.anIntArray237[local3] >= -10) {
				@Pc(78) Class7 local78 = Static101.aClass7Array1[local3];
				if (local78 == null) {
					local78 = Static120.method150(Static57.aClass3_Sub1_6, Static111.anIntArray344[local3]);
					if (local78 == null) {
						continue;
					}
					Static74.anIntArray237[local3] += local78.method151();
					Static101.aClass7Array1[local3] = local78;
				}
				if (Static74.anIntArray237[local3] < 0) {
					@Pc(201) int local201;
					if (Static59.anIntArray197[local3] == 0) {
						local201 = Static51.anInt2599;
					} else {
						@Pc(122) int local122 = (Static59.anIntArray197[local3] & 0xFF) * 128;
						@Pc(130) int local130 = Static59.anIntArray197[local3] >> 16 & 0xFF;
						@Pc(140) int local140 = local130 * 128 + 64 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204;
						@Pc(148) int local148 = Static59.anIntArray197[local3] >> 8 & 0xFF;
						if (local140 < 0) {
							local140 = -local140;
						}
						@Pc(165) int local165 = local148 * 128 + 64 - Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149;
						if (local165 < 0) {
							local165 = -local165;
						}
						@Pc(179) int local179 = local165 + local140 - 128;
						if (local122 < local179) {
							Static74.anIntArray237[local3] = -100;
							continue;
						}
						if (local179 < 0) {
							local179 = 0;
						}
						local201 = (local122 - local179) * Static42.anInt1116 / local122;
					}
					@Pc(210) Class2_Sub2_Sub1 local210 = local78.method152().method255(Static17.aClass54_1);
					@Pc(215) Class2_Sub3_Sub1 local215 = Static121.method407(local210, local201);
					local215.method405(Static80.anIntArray246[local3] - 1);
					Static100.aClass2_Sub3_Sub2_1.method2065(local215);
					Static74.anIntArray237[local3] = -100;
				}
			} else {
				Static115.anInt1793--;
				for (@Pc(25) int local25 = local3; local25 < Static115.anInt1793; local25++) {
					Static111.anIntArray344[local25] = Static111.anIntArray344[local25 + 1];
					Static101.aClass7Array1[local25] = Static101.aClass7Array1[local25 + 1];
					Static80.anIntArray246[local25] = Static80.anIntArray246[local25 + 1];
					Static74.anIntArray237[local25] = Static74.anIntArray237[local25 + 1];
					Static59.anIntArray197[local25] = Static59.anIntArray197[local25 + 1];
				}
				local3--;
			}
		}
		if (Static118.anInt3000 <= 0) {
			return;
		}
		Static118.anInt3000 -= 20;
		if (Static118.anInt3000 < 0) {
			Static118.anInt3000 = 0;
		}
		if (Static118.anInt3000 == 0 && Static78.anInt2039 != 0 && Static22.anInt579 != -1) {
			Static113.method2046(Static111.aClass3_Sub1_14, Static22.anInt579, 0, Static78.anInt2039);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method2021() {
		Static66.aClass31_3 = new Class31(32);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ac;II)Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 method2022(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) int arg2) {
		return method2024(arg1, arg2, arg0) ? Static100.method1850() : null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ac;Lclient!kc;Lclient!kc;B)Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 method2023(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class36 arg2) {
		@Pc(10) int local10 = arg0.method932(arg2);
		@Pc(18) int local18 = arg0.method936(local10, arg1);
		return Static20.method374(local18, local10, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!ac;II)Z")
	public static boolean method2024(@OriginalArg(1) Class3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method928(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static11.method223(local9);
			return true;
		}
	}
}
