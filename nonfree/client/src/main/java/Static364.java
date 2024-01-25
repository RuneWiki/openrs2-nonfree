import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	public static int anInt6053;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "[[Lclient!nd;")
	public static Class161[][] aClass161ArrayArray3;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[128][128];

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Lclient!ct;")
	private static final Class48 aClass48_212 = new Class48(57, 3);

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_155 = new Class211(10, -1);

	@OriginalMember(owner = "client!us", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray82 = new String[100];

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method5202() {
		try {
			if (Static271.anInt4720 == 1) {
				@Pc(12) int local12 = Static197.aClass1_Sub7_Sub1_3.method1078();
				if (local12 > 0 && Static197.aClass1_Sub7_Sub1_3.method1055()) {
					local12 -= Static229.anInt3862;
					if (local12 < 0) {
						local12 = 0;
					}
					Static197.aClass1_Sub7_Sub1_3.method1065(local12);
					return;
				}
				Static197.aClass1_Sub7_Sub1_3.method1079();
				Static197.aClass1_Sub7_Sub1_3.method1087();
				Static358.aClass1_Sub15_2 = null;
				if (Static315.aClass230_71 == null) {
					Static271.anInt4720 = 0;
				} else {
					Static271.anInt4720 = 2;
				}
				Static131.aClass82_1 = null;
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static197.aClass1_Sub7_Sub1_3.method1079();
			Static271.anInt4720 = 0;
			Static315.aClass230_71 = null;
			Static358.aClass1_Sub15_2 = null;
			Static131.aClass82_1 = null;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method5203(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static282.method4305(0, arg1, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!se;I)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub40 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static358.aClass17_66.aClass1_15) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt5414;
		@Pc(18) int local18 = arg1.anInt5413;
		@Pc(21) int local21 = arg1.anInt5411;
		@Pc(25) int local25 = (int) arg1.aLong172;
		@Pc(32) long local32 = arg1.aLong172;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(47) Class25_Sub1_Sub1_Sub2 local47;
		if (local21 == 8) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static205.anInt3606 = arg0;
				Static42.anInt828 = arg2;
				Static90.anInt1653 = 0;
				Static6.anInt90 = 2;
				Static177.method1119(Static115.aClass48_69);
				Static209.aClass1_Sub33_Sub2_2.method5138(local25);
				Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		@Pc(108) Class117 local108;
		if (local21 == 46) {
			local108 = Static84.method1246(local18, local15);
			if (local108 != null) {
				Static191.method2733(local108);
			}
		}
		if (local21 == 13 && Static363.aClass117_17 == null) {
			Static56.method906(local18, local15);
			Static363.aClass117_17 = Static84.method1246(local18, local15);
			Static312.method4635(Static363.aClass117_17);
		}
		@Pc(139) Class25_Sub1_Sub1_Sub1 local139;
		if (local21 == 58) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static6.anInt90 = 2;
				Static42.anInt828 = arg2;
				Static177.method1119(Static137.aClass48_84);
				Static209.aClass1_Sub33_Sub2_2.method5138(local25);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 15) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static6.anInt90 = 2;
				Static177.method1119(Static279.aClass48_172);
				Static209.aClass1_Sub33_Sub2_2.method5139(local25);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 11) {
			Static42.anInt828 = arg2;
			Static205.anInt3606 = arg0;
			Static90.anInt1653 = 0;
			Static6.anInt90 = 2;
			Static177.method1119(Static302.aClass48_185);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static256.anInt4410 + local15);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5139(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5139(local25);
			Static254.method3900(local18, local15);
		}
		if (local21 == 17) {
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 2;
			Static177.method1119(Static261.aClass48_159);
			Static209.aClass1_Sub33_Sub2_2.method5139((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static293.anInt5053 + local18);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static256.anInt4410 + local15);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 30) {
			local108 = Static84.method1246(local18, local15);
			if (local108 != null) {
				Static361.method5016();
				@Pc(379) Class1_Sub22 local379 = Static50.method810(local108);
				Static232.method620(local379.anInt3449, local15, local379.method2807(), local108.anInt3073, local108.anInt3096, local18);
				Static114.aString18 = Static24.method369(local108);
				Static28.aString7 = local108.aString28 + "<col=ffffff>";
				if (Static114.aString18 == null) {
					Static114.aString18 = "Null";
				}
			}
			return;
		}
		if (local21 == 25) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static90.anInt1653 = 0;
				Static42.anInt828 = arg2;
				Static205.anInt3606 = arg0;
				Static6.anInt90 = 2;
				Static177.method1119(Static280.aClass48_174);
				Static209.aClass1_Sub33_Sub2_2.method5154(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5139(local25);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 3) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static42.anInt828 = arg2;
				Static90.anInt1653 = 0;
				Static177.method1119(Static278.aClass48_166);
				Static209.aClass1_Sub33_Sub2_2.method5126(local25);
				Static209.aClass1_Sub33_Sub2_2.method5161(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 21) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static177.method1119(Static5.aClass48_5);
				Static209.aClass1_Sub33_Sub2_2.method5161(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5170(local25);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 1012) {
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 2;
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				@Pc(619) Class59 local619 = local47.aClass59_1;
				if (local619.anIntArray186 != null) {
					local619 = local619.method1150(Static230.aClass72_3);
				}
				if (local619 != null) {
					Static177.method1119(Static100.aClass48_220);
					Static209.aClass1_Sub33_Sub2_2.method5138(local619.anInt1425);
				}
			}
		}
		if (local21 == 18) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static177.method1119(Static62.aClass48_35);
				Static209.aClass1_Sub33_Sub2_2.method5138(local25);
				Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 60) {
			Static205.anInt3606 = arg0;
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static177.method1119(Static164.aClass48_100);
			Static209.aClass1_Sub33_Sub2_2.method5126(Static293.anInt5053 + local18);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5139(local25);
			Static209.aClass1_Sub33_Sub2_2.method5170(local15 + Static256.anInt4410);
			Static254.method3900(local18, local15);
		}
		if (local21 == 9) {
			Static90.anInt1653 = 0;
			Static205.anInt3606 = arg0;
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static177.method1119(Static314.aClass48_188);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static293.anInt5053 + local18);
			Static209.aClass1_Sub33_Sub2_2.method5126(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5170(local15 + Static256.anInt4410);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 44) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static177.method1119(Static317.aClass48_191);
				Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5138(local25);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 49) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static6.anInt90 = 2;
				Static90.anInt1653 = 0;
				Static42.anInt828 = arg2;
				Static205.anInt3606 = arg0;
				Static177.method1119(Static335.aClass48_199);
				Static209.aClass1_Sub33_Sub2_2.method5154(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5170(local25);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 12) {
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static205.anInt3606 = arg0;
			Static90.anInt1653 = 0;
			Static177.method1119(Static59.aClass48_34);
			Static209.aClass1_Sub33_Sub2_2.method5154(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static293.anInt5053 + local18);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static256.anInt4410 + local15);
			Static209.aClass1_Sub33_Sub2_2.method5139((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 51) {
			if (Static284.anInt4919 > 0 && Static264.aClass154_1.method3994(82) && Static264.aClass154_1.method3994(81)) {
				Static325.method4730(local15 + Static256.anInt4410, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, local18 + Static293.anInt5053);
			} else {
				Static355.method3869(local25, local18, local15);
				if (local25 == 1) {
					Static209.aClass1_Sub33_Sub2_2.method5165(-1);
					Static209.aClass1_Sub33_Sub2_2.method5165(-1);
					Static209.aClass1_Sub33_Sub2_2.method5138((int) Static386.aFloat82);
					Static209.aClass1_Sub33_Sub2_2.method5165(57);
					Static209.aClass1_Sub33_Sub2_2.method5165(Static246.anInt4136);
					Static209.aClass1_Sub33_Sub2_2.method5165(Static205.anInt3600);
					Static209.aClass1_Sub33_Sub2_2.method5165(89);
					Static209.aClass1_Sub33_Sub2_2.method5138(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080);
					Static209.aClass1_Sub33_Sub2_2.method5138(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077);
					Static209.aClass1_Sub33_Sub2_2.method5165(63);
				} else {
					Static6.anInt90 = 1;
					Static42.anInt828 = arg2;
					Static90.anInt1653 = 0;
					Static205.anInt3606 = arg0;
				}
				Static155.method2334(local18, 1, 1, local15, 0, -4, 0, true);
			}
		}
		if (local21 == 20) {
			Static205.anInt3606 = arg0;
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static177.method1119(Static173.aClass48_106);
			Static209.aClass1_Sub33_Sub2_2.method5170(Static293.anInt5053 + local18);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5126(local15 + Static256.anInt4410);
			Static209.aClass1_Sub33_Sub2_2.method5139(local25);
			Static254.method3900(local18, local15);
		}
		if (local21 == 50 || local21 == 1006) {
			Static306.method4553(local25, arg1.aString63, local15, local18);
		}
		if (local21 == 23) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static42.anInt828 = arg2;
				Static205.anInt3606 = arg0;
				Static6.anInt90 = 2;
				Static90.anInt1653 = 0;
				Static177.method1119(Static173.aClass48_105);
				Static209.aClass1_Sub33_Sub2_2.method5139(local25);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 22) {
			Static42.anInt828 = arg2;
			Static90.anInt1653 = 0;
			Static6.anInt90 = 2;
			Static205.anInt3606 = arg0;
			Static177.method1119(Static288.aClass48_178);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static137.anInt2555);
			Static209.aClass1_Sub33_Sub2_2.method5139(local15 + Static256.anInt4410);
			Static209.aClass1_Sub33_Sub2_2.method5126(Static267.anInt4674);
			Static209.aClass1_Sub33_Sub2_2.method5139(local25);
			Static209.aClass1_Sub33_Sub2_2.method5140(Static119.anInt2128);
			Static209.aClass1_Sub33_Sub2_2.method5138(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static254.method3900(local18, local15);
		}
		if (local21 == 5) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static177.method1119(Static133.aClass48_80);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5126(Static137.anInt2555);
				Static209.aClass1_Sub33_Sub2_2.method5140(Static119.anInt2128);
				Static209.aClass1_Sub33_Sub2_2.method5138(local25);
				Static209.aClass1_Sub33_Sub2_2.method5126(Static267.anInt4674);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 1009) {
			Static42.anInt828 = arg2;
			Static90.anInt1653 = 0;
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 2;
			Static177.method1119(Static34.aClass48_19);
			Static209.aClass1_Sub33_Sub2_2.method5138(local25);
		}
		if (local21 == 10) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static42.anInt828 = arg2;
				Static205.anInt3606 = arg0;
				Static90.anInt1653 = 0;
				Static6.anInt90 = 2;
				Static177.method1119(Static134.aClass48_82);
				Static209.aClass1_Sub33_Sub2_2.method5161(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5170(local25);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 1003 || local21 == 1011 || local21 == 1007 || local21 == 1010 || local21 == 1001) {
			Static276.method4510(local21, local25, local15);
		}
		if (local21 == 2) {
			Static90.anInt1653 = 0;
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 2;
			Static42.anInt828 = arg2;
			Static177.method1119(Class25_Sub1_Sub6.lb);
			Static209.aClass1_Sub33_Sub2_2.method5170(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static209.aClass1_Sub33_Sub2_2.method5126(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5170(local15 + Static256.anInt4410);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 59) {
			Static205.anInt3606 = arg0;
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static90.anInt1653 = 0;
			Static177.method1119(Static132.aClass48_78);
			Static209.aClass1_Sub33_Sub2_2.method5170((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static256.anInt4410 + local15);
			Static209.aClass1_Sub33_Sub2_2.method5138(Static137.anInt2555);
			Static209.aClass1_Sub33_Sub2_2.method5126(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static267.anInt4674);
			Static209.aClass1_Sub33_Sub2_2.method5140(Static119.anInt2128);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 1008) {
			Static90.anInt1653 = 0;
			Static205.anInt3606 = arg0;
			Static42.anInt828 = arg2;
			Static6.anInt90 = 2;
			Static177.method1119(Static50.aClass48_33);
			Static209.aClass1_Sub33_Sub2_2.method5138(local25);
		}
		if (local21 == 57) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static90.anInt1653 = 0;
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static205.anInt3606 = arg0;
				Static177.method1119(Static288.aClass48_177);
				Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5126(Static137.anInt2555);
				Static209.aClass1_Sub33_Sub2_2.method5156(Static119.anInt2128);
				Static209.aClass1_Sub33_Sub2_2.method5139(Static267.anInt4674);
				Static209.aClass1_Sub33_Sub2_2.method5170(local25);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 45) {
			local139 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local25];
			if (local139 != null) {
				Static90.anInt1653 = 0;
				Static205.anInt3606 = arg0;
				Static6.anInt90 = 2;
				Static42.anInt828 = arg2;
				Static177.method1119(aClass48_212);
				Static209.aClass1_Sub33_Sub2_2.method5139(local25);
				Static209.aClass1_Sub33_Sub2_2.method5154(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static155.method2334(local139.anIntArray295[0], local139.method1877(), local139.method1877(), local139.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 1002) {
			Static42.anInt828 = arg2;
			Static90.anInt1653 = 0;
			Static6.anInt90 = 2;
			Static205.anInt3606 = arg0;
			Static177.method1119(Static38.aClass48_24);
			Static209.aClass1_Sub33_Sub2_2.method5126(local15 + Static256.anInt4410);
			Static209.aClass1_Sub33_Sub2_2.method5170((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static209.aClass1_Sub33_Sub2_2.method5138(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static51.method835(local15, local32, local18);
		}
		if (local21 == 47) {
			Static42.anInt828 = arg2;
			Static205.anInt3606 = arg0;
			Static90.anInt1653 = 0;
			Static6.anInt90 = 2;
			Static177.method1119(Static201.aClass48_118);
			Static209.aClass1_Sub33_Sub2_2.method5138(local15 + Static256.anInt4410);
			Static209.aClass1_Sub33_Sub2_2.method5138(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5138(local25);
			Static254.method3900(local18, local15);
		}
		if (local21 == 48) {
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 2;
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			Static177.method1119(Static113.aClass48_68);
			Static209.aClass1_Sub33_Sub2_2.method5161(Static264.aClass154_1.method3994(82) ? 1 : 0);
			Static209.aClass1_Sub33_Sub2_2.method5126(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5126(local25);
			Static209.aClass1_Sub33_Sub2_2.method5126(local15 + Static256.anInt4410);
			Static254.method3900(local18, local15);
		}
		if (local21 == 6) {
			local47 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local25];
			if (local47 != null) {
				Static42.anInt828 = arg2;
				Static6.anInt90 = 2;
				Static90.anInt1653 = 0;
				Static205.anInt3606 = arg0;
				Static177.method1119(Static323.aClass48_194);
				Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
				Static209.aClass1_Sub33_Sub2_2.method5139(local25);
				Static155.method2334(local47.anIntArray295[0], local47.method1877(), local47.method1877(), local47.anIntArray296[0], 0, -2, 0, true);
			}
		}
		if (local21 == 19) {
			if (Static284.anInt4919 > 0 && Static264.aClass154_1.method3994(82) && Static264.aClass154_1.method3994(81)) {
				Static325.method4730(Static256.anInt4410 + local15, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, local18 + Static293.anInt5053);
			} else {
				Static205.anInt3606 = arg0;
				Static6.anInt90 = 1;
				Static42.anInt828 = arg2;
				Static90.anInt1653 = 0;
				Static177.method1119(Static105.aClass48_64);
				Static209.aClass1_Sub33_Sub2_2.method5139(local18 + Static293.anInt5053);
				Static209.aClass1_Sub33_Sub2_2.method5138(Static256.anInt4410 + local15);
			}
		}
		if (local21 == 4) {
			Static205.anInt3606 = arg0;
			Static6.anInt90 = 1;
			Static90.anInt1653 = 0;
			Static42.anInt828 = arg2;
			Static177.method1119(Static159.aClass48_97);
			Static209.aClass1_Sub33_Sub2_2.method5126(Static137.anInt2555);
			Static209.aClass1_Sub33_Sub2_2.method5126(Static256.anInt4410 + local15);
			Static209.aClass1_Sub33_Sub2_2.method5170(local18 + Static293.anInt5053);
			Static209.aClass1_Sub33_Sub2_2.method5139(Static267.anInt4674);
			Static209.aClass1_Sub33_Sub2_2.method5173(Static119.anInt2128);
			Static155.method2334(local18, 1, 1, local15, 0, -4, 0, true);
		}
		if (Static90.aBoolean144) {
			Static361.method5016();
		}
		if (Static230.aClass117_18 != null && Static297.anInt5089 == 0) {
			Static312.method4635(Static230.aClass117_18);
		}
	}
}
