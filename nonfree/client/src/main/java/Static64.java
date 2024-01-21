import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gf", name = "kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1000 = Static118.method2249("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!gf", name = "sb", descriptor = "Lclient!v;")
	public static final Class91 aClass91_2 = new Class91();

	@OriginalMember(owner = "client!gf", name = "ub", descriptor = "I")
	public static int anInt1666 = 0;

	@OriginalMember(owner = "client!gf", name = "vb", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!gf", name = "wb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1001 = Static118.method2249("");

	@OriginalMember(owner = "client!gf", name = "xb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1002 = Static118.method2249("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!w;I)V")
	public static void method1132(@OriginalArg(0) Class6_Sub4 arg0) {
		arg0.aBoolean159 = false;
		@Pc(11) Class1_Sub2_Sub14 local11;
		if (arg0.anInt3946 != -1) {
			local11 = Static173.method2924(arg0.anInt3946);
			if (local11 == null || local11.anIntArray284 == null) {
				arg0.anInt3946 = -1;
			} else {
				arg0.anInt3979++;
				if (arg0.anInt3933 < local11.anIntArray284.length && arg0.anInt3979 > local11.anIntArray282[arg0.anInt3933]) {
					arg0.anInt3933++;
					arg0.anInt3979 = 1;
					Static18.method348(local11, arg0.anInt3976, arg0.anInt3934, Static201.aClass6_Sub4_Sub1_3 == arg0, arg0.anInt3933);
				}
				if (arg0.anInt3933 >= local11.anIntArray284.length) {
					arg0.anInt3933 = 0;
					arg0.anInt3979 = 0;
					Static18.method348(local11, arg0.anInt3976, arg0.anInt3934, arg0 == Static201.aClass6_Sub4_Sub1_3, arg0.anInt3933);
				}
			}
		}
		if (arg0.anInt3964 != -1 && arg0.anInt3983 <= Static174.anInt3887) {
			if (arg0.anInt3977 < 0) {
				arg0.anInt3977 = 0;
			}
			@Pc(119) int local119 = Static18.method345(arg0.anInt3964).anInt1270;
			if (local119 == -1) {
				arg0.anInt3964 = -1;
			} else {
				@Pc(133) Class1_Sub2_Sub14 local133 = Static173.method2924(local119);
				if (local133 == null || local133.anIntArray284 == null) {
					arg0.anInt3964 = -1;
				} else {
					arg0.anInt3935++;
					if (local133.anIntArray284.length > arg0.anInt3977 && local133.anIntArray282[arg0.anInt3977] < arg0.anInt3935) {
						arg0.anInt3935 = 1;
						arg0.anInt3977++;
						Static18.method348(local133, arg0.anInt3976, arg0.anInt3934, arg0 == Static201.aClass6_Sub4_Sub1_3, arg0.anInt3977);
					}
					if (local133.anIntArray284.length <= arg0.anInt3977) {
						arg0.anInt3964 = -1;
					}
				}
			}
		}
		if (arg0.anInt3945 != -1 && arg0.anInt3956 <= 1) {
			local11 = Static173.method2924(arg0.anInt3945);
			if (local11.anInt2508 == 1 && arg0.anInt3953 > 0 && arg0.anInt3963 <= Static174.anInt3887 && arg0.anInt3984 < Static174.anInt3887) {
				arg0.anInt3956 = 1;
				return;
			}
		}
		if (arg0.anInt3945 != -1 && arg0.anInt3956 == 0) {
			local11 = Static173.method2924(arg0.anInt3945);
			if (local11 == null || local11.anIntArray284 == null) {
				arg0.anInt3945 = -1;
			} else {
				arg0.anInt3970++;
				if (local11.anIntArray284.length > arg0.anInt3968 && local11.anIntArray282[arg0.anInt3968] < arg0.anInt3970) {
					arg0.anInt3970 = 1;
					arg0.anInt3968++;
					Static18.method348(local11, arg0.anInt3976, arg0.anInt3934, Static201.aClass6_Sub4_Sub1_3 == arg0, arg0.anInt3968);
				}
				if (local11.anIntArray284.length <= arg0.anInt3968) {
					arg0.anInt3968 -= local11.anInt2497;
					arg0.anInt3986++;
					if (arg0.anInt3986 >= local11.anInt2496) {
						arg0.anInt3945 = -1;
					} else if (arg0.anInt3968 >= 0 && arg0.anInt3968 < local11.anIntArray284.length) {
						Static18.method348(local11, arg0.anInt3976, arg0.anInt3934, arg0 == Static201.aClass6_Sub4_Sub1_3, arg0.anInt3968);
					} else {
						arg0.anInt3945 = -1;
					}
				}
				arg0.aBoolean159 = local11.aBoolean102;
			}
		}
		if (arg0.anInt3956 > 0) {
			arg0.anInt3956--;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!jh;BLclient!jh;)V")
	public static void method1134(@OriginalArg(0) Class1_Sub2_Sub5_Sub4_Sub1 arg0, @OriginalArg(2) Class1_Sub2_Sub5_Sub4_Sub1 arg1) {
		if (Static96.aClass1_Sub2_Sub5_Sub3Array4 == null) {
			Static96.aClass1_Sub2_Sub5_Sub3Array4 = Static16.method303(0, Static143.aClass60_Sub1_64, Static67.anInt1715);
		}
		if (Static57.aClass1_Sub2_Sub5_Sub1Array6 == null) {
			Static57.aClass1_Sub2_Sub5_Sub1Array6 = Static42.method716(Static143.aClass60_Sub1_64, 0, Static100.anInt2511);
		}
		if (Static115.aClass1_Sub2_Sub5_Sub1Array10 == null) {
			Static115.aClass1_Sub2_Sub5_Sub1Array10 = Static42.method716(Static143.aClass60_Sub1_64, 0, Static104.anInt2560);
		}
		if (Static47.aClass1_Sub2_Sub5_Sub1Array4 == null) {
			Static47.aClass1_Sub2_Sub5_Sub1Array4 = Static42.method716(Static143.aClass60_Sub1_64, 0, Static120.anInt2982);
		}
		Static194.method3096(0, 23, 765, 480, 0);
		Static194.method3109(0, 0, 138, 23, 12425273, 9135624);
		Static194.method3109(138, 0, 640, 23, 5197647, 2697513);
		arg1.method1595(Static97.aClass65_1448, 69, 15, 0, -1);
		if (Static47.aClass1_Sub2_Sub5_Sub1Array4 != null) {
			Static47.aClass1_Sub2_Sub5_Sub1Array4[1].method558(140, 1);
			arg0.method1597(Static113.aClass65_1610, 152, 10, 16777215, -1);
			Static47.aClass1_Sub2_Sub5_Sub1Array4[0].method558(140, 12);
			arg0.method1597(Static54.aClass65_2166, 152, 21, 16777215, -1);
		}
		if (Static115.aClass1_Sub2_Sub5_Sub1Array10 != null) {
			if (Static77.anIntArray217[0] == 0 && Static184.anIntArray462[0] == 0) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[2].method558(280, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[0].method558(280, 4);
			}
			if (Static77.anIntArray217[0] == 0 && Static184.anIntArray462[0] == 1) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[3].method558(295, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[1].method558(295, 4);
			}
			arg1.method1597(Static1.aClass65_2603, 312, 17, 16777215, -1);
			if (Static77.anIntArray217[0] == 1 && Static184.anIntArray462[0] == 0) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[2].method558(390, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[0].method558(390, 4);
			}
			if (Static77.anIntArray217[0] == 1 && Static184.anIntArray462[0] == 1) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[3].method558(405, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[1].method558(405, 4);
			}
			arg1.method1597(Static197.aClass65_2535, 422, 17, 16777215, -1);
			if (Static77.anIntArray217[0] == 2 && Static184.anIntArray462[0] == 0) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[2].method558(500, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[0].method558(500, 4);
			}
			if (Static77.anIntArray217[0] == 2 && Static184.anIntArray462[0] == 1) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[3].method558(515, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[1].method558(515, 4);
			}
			arg1.method1597(Static153.aClass65_2023, 532, 17, 16777215, -1);
			if (Static77.anIntArray217[0] == 3 && Static184.anIntArray462[0] == 0) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[2].method558(610, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[0].method558(610, 4);
			}
			if (Static77.anIntArray217[0] == 3 && Static184.anIntArray462[0] == 1) {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[3].method558(625, 4);
			} else {
				Static115.aClass1_Sub2_Sub5_Sub1Array10[1].method558(625, 4);
			}
			arg1.method1597(Static33.aClass65_632, 642, 17, 16777215, -1);
		}
		Static194.method3096(700, 4, 58, 16, 0);
		arg0.method1595(Static179.aClass65_2404, 729, 16, 16777215, -1);
		Static180.anInt3905 = -1;
		if (Static96.aClass1_Sub2_Sub5_Sub3Array4 == null) {
			return;
		}
		@Pc(380) int local380 = 24;
		@Pc(386) int local386 = 8;
		@Pc(388) int local388;
		@Pc(390) int local390;
		do {
			local388 = local380;
			local390 = local386;
			if ((local386 - 1) * local380 >= Static84.anInt2050) {
				local386--;
			}
			if (Static84.anInt2050 <= (local380 - 1) * local386) {
				local380--;
			}
			if (Static84.anInt2050 <= local386 * (local380 - 1)) {
				local380--;
			}
		} while (local388 != local380 || local386 != local390);
		local388 = (765 - local386 * 88) / (local386 + 1);
		if (local388 > 5) {
			local388 = 5;
		}
		local390 = (480 - local380 * 19) / (local380 - -1);
		@Pc(472) int local472 = (765 - (local386 - 1) * local388 - local386 * 88) / 2;
		if (local390 > 5) {
			local390 = 5;
		}
		@Pc(481) int local481 = local472;
		@Pc(483) int local483 = 0;
		@Pc(499) int local499 = (480 - (local380 - 1) * local390 - local380 * 19) / 2;
		@Pc(503) int local503 = local499 + 23;
		for (@Pc(505) int local505 = 0; local505 < Static84.anInt2050; local505++) {
			@Pc(510) Class3 local510 = Static195.aClass3Array1[local505];
			@Pc(512) boolean local512 = true;
			@Pc(517) Class65 local517 = Static118.method2250(local510.anInt91);
			if (local510.anInt91 == -1) {
				local512 = false;
				local517 = Static23.aClass65_510;
			} else if (local510.anInt91 > 1980) {
				local512 = false;
				local517 = Static5.aClass65_56;
			}
			if (Static53.anInt1441 >= local481 && Static38.anInt1051 >= local503 && Static53.anInt1441 < local481 + 88 && Static38.anInt1051 < local503 + 19 && local512) {
				Static180.anInt3905 = local505;
				Static96.aClass1_Sub2_Sub5_Sub3Array4[local510.aBoolean4 ? 1 : 0].method1321(local481, local503);
			} else {
				Static96.aClass1_Sub2_Sub5_Sub3Array4[local510.aBoolean4 ? 1 : 0].method1314(local481, local503);
			}
			if (Static57.aClass1_Sub2_Sub5_Sub1Array6 != null) {
				Static57.aClass1_Sub2_Sub5_Sub1Array6[(local510.aBoolean4 ? 8 : 0) + local510.anInt89].method558(local481 + 29, local503);
			}
			arg1.method1595(Static118.method2250(local510.anInt93), local481 + 15, local503 + 9 + 5, 0, -1);
			arg0.method1595(local517, local481 + 60, 5 + 9 + local503, 268435455, -1);
			local503 += local390 + 19;
			local483++;
			if (local380 <= local483) {
				local481 += local388 + 88;
				local483 = 0;
				local503 = local499 + 23;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] method1135() {
		@Pc(6) Class1_Sub2_Sub5_Sub1[] local6 = new Class1_Sub2_Sub5_Sub1[Static172.anInt3838];
		for (@Pc(8) int local8 = 0; local8 < Static172.anInt3838; local8++) {
			@Pc(18) Class1_Sub2_Sub5_Sub1 local18 = new Class1_Sub2_Sub5_Sub1();
			local18.anInt845 = Static108.anInt2647;
			local18.anInt850 = Static148.anInt3487;
			local18.anInt847 = Static111.anIntArray308[local8];
			local18.anInt846 = Static127.anIntArray364[local8];
			local18.anInt848 = Static138.anIntArray384[local8];
			local18.anInt849 = Static160.anIntArray328[local8];
			local18.anIntArray82 = Static61.anIntArray154;
			local18.aByteArray11 = Static153.aByteArrayArray33[local8];
			local6[local8] = local18;
		}
		Static84.method1458();
		return local6;
	}
}
