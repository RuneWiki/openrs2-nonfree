import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_1 = Static60.method1113(" )2> ");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_2 = Static60.method1113("Hierhin gehen");

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_3 = Static60.method1113("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_4 = Static60.method1113("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt4 = 0;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_5 = aClass22_4;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_6 = Static60.method1113("(U(Y");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] method1() {
		@Pc(8) Class4_Sub1_Sub2_Sub2[] local8 = new Class4_Sub1_Sub2_Sub2[Static76.anInt2020];
		for (@Pc(10) int local10 = 0; local10 < Static76.anInt2020; local10++) {
			@Pc(20) Class4_Sub1_Sub2_Sub2 local20 = local8[local10] = new Class4_Sub1_Sub2_Sub2();
			local20.anInt1157 = Static129.anInt3064;
			local20.anInt1159 = Static106.anInt2687;
			local20.anInt1158 = Static57.anIntArray171[local10];
			local20.anInt1162 = Static61.anIntArray175[local10];
			local20.anInt1160 = Static105.anIntArray297[local10];
			local20.anInt1161 = Static30.anIntArray77[local10];
			@Pc(52) int local52 = local20.anInt1161 * local20.anInt1160;
			@Pc(56) byte[] local56 = Static124.aByteArrayArray9[local10];
			local20.anIntArray129 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray129[local62] = Static27.anIntArray75[local56[local62] & 0xFF];
			}
		}
		Static57.method1094();
		return local8;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static4.anInt78 != 0 && Static4.anInt78 != 3 || Static65.anInt1845 != 1) {
			return;
		}
		@Pc(24) int local24 = Static8.anInt2382 - arg0 - 25;
		@Pc(30) int local30 = Static55.anInt1118 - arg1 - 5;
		if (local24 < 0 || local30 < 0 || local24 >= 146 || local30 >= 151) {
			return;
		}
		local24 -= 73;
		local30 -= 75;
		@Pc(53) int local53 = Static111.anInt2754 + Static23.anInt552 & 0x7FF;
		@Pc(57) int local57 = Class4_Sub1_Sub2_Sub1.anIntArray9[local53];
		@Pc(65) int local65 = (Static25.anInt574 + 256) * local57 >> 8;
		@Pc(69) int local69 = Class4_Sub1_Sub2_Sub1.anIntArray12[local53];
		@Pc(77) int local77 = (Static25.anInt574 + 256) * local69 >> 8;
		@Pc(88) int local88 = local30 * local77 - local24 * local65 >> 11;
		@Pc(98) int local98 = local65 * local30 + local24 * local77 >> 11;
		@Pc(106) int local106 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 - local88 >> 7;
		@Pc(113) int local113 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 + local98 >> 7;
		@Pc(133) boolean local133 = Static78.method1305(true, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local113, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local106, 0, 1);
		if (!local133) {
			return;
		}
		Static38.aClass4_Sub11_Sub1_1.method701(local24);
		Static38.aClass4_Sub11_Sub1_1.method701(local30);
		Static38.aClass4_Sub11_Sub1_1.method700(Static111.anInt2754);
		Static38.aClass4_Sub11_Sub1_1.method701(57);
		Static38.aClass4_Sub11_Sub1_1.method701(Static23.anInt552);
		Static38.aClass4_Sub11_Sub1_1.method701(Static25.anInt574);
		Static38.aClass4_Sub11_Sub1_1.method701(89);
		Static38.aClass4_Sub11_Sub1_1.method700(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500);
		Static38.aClass4_Sub11_Sub1_1.method700(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462);
		Static38.aClass4_Sub11_Sub1_1.method701(Static49.anInt1334);
		Static38.aClass4_Sub11_Sub1_1.method701(63);
		return;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		aClass22_4 = null;
		aClass22_3 = null;
		aClass22_6 = null;
		aClass22_2 = null;
		aClass22_5 = null;
		aClass22_1 = null;
		aClass20_Sub1_1 = null;
		aClass4_Sub1_Sub2_Sub2Array1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLclient!ea;)Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		return Static24.method397(arg1, arg2, arg0) ? Static78.method1299() : null;
	}
}
