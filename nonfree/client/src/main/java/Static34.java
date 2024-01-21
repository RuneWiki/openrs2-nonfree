import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] aClass5_Sub2_Sub6_Sub4Array2;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!sd;")
	public static Class29 aClass29_25;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static int anInt955;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public static int anInt956;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!hc;")
	public static Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!s;")
	public static Class66 aClass66_4 = new Class66(4096);

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_475 = Static63.method1251("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "[Lclient!j;")
	public static Class5_Sub2_Sub4_Sub3_Sub1[] aClass5_Sub2_Sub4_Sub3_Sub1Array1 = new Class5_Sub2_Sub4_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!mb;")
	private static Class45 aClass45_478 = Static63.method1251("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_476 = aClass45_478;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_477 = Static63.method1251("::fpsoff");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lclient!bb;")
	public static Class5_Sub2_Sub1 method688(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub1 local10 = (Class5_Sub2_Sub1) Static54.aClass67_14.method1823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static84.aClass29_55.method733(arg0, 16);
		local10 = new Class5_Sub2_Sub1();
		if (local20 != null) {
			local10.method119(new Class5_Sub9(local20));
		}
		Static54.aClass67_14.method1818(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
	public static void method689(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static16.anIntArray69[arg0];
		@Pc(19) int local19 = Static35.anIntArray163[arg0];
		@Pc(23) int local23 = Static2.anIntArray5[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) int local31 = Static102.anIntArray419[arg0];
		if (Static75.anInt2178 != 0 && local23 != 1003) {
			Static75.anInt2178 = 0;
			Static51.aBoolean81 = true;
		}
		@Pc(79) boolean local79;
		if (local23 == 32) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static88.anInt2499 = Static36.anInt1063;
			Static27.anInt848 = 0;
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static64.aClass5_Sub9_Sub1_2.method1466(44);
			Static64.aClass5_Sub9_Sub1_2.method1399(Static78.anInt2210 + local15);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static40.anInt1179);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			Static64.aClass5_Sub9_Sub1_2.method1424(Static4.anInt95);
			Static64.aClass5_Sub9_Sub1_2.method1432(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static66.anInt1896);
		}
		if (local23 == 7 && Static44.method943(local15, local19, local31)) {
			Static64.aClass5_Sub9_Sub1_2.method1466(139);
			Static64.aClass5_Sub9_Sub1_2.method1424(anInt956);
			Static64.aClass5_Sub9_Sub1_2.method1430(local15 + Static78.anInt2210);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31 >> 14 & 0x7FFF);
			Static64.aClass5_Sub9_Sub1_2.method1432(Static56.anInt1695);
			Static64.aClass5_Sub9_Sub1_2.method1432(Static6.anInt162 + local19);
		}
		if (local23 == 1002) {
			Static27.anInt848 = 0;
			Static88.anInt2499 = Static36.anInt1063;
			Static68.anInt1957 = 2;
			Static4.anInt102 = Static67.anInt1906;
			Static64.aClass5_Sub9_Sub1_2.method1466(159);
			Static64.aClass5_Sub9_Sub1_2.method1455(local31);
		}
		if (local23 == 35) {
			Static64.aClass5_Sub9_Sub1_2.method1466(99);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			Static90.anInt2531 = local15;
			Static100.anInt2698 = local19;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 50) {
			Static64.aClass5_Sub9_Sub1_2.method1466(232);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			Static64.aClass5_Sub9_Sub1_2.method1399(local15);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static90.anInt2531 = local15;
			Static100.anInt2698 = local19;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 44) {
			Static64.aClass5_Sub9_Sub1_2.method1466(123);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1424(local19);
			Static28.anInt879 = 2;
			Static78.anInt2204 = 0;
			Static90.anInt2531 = local15;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
			Static100.anInt2698 = local19;
		}
		@Pc(366) Class5_Sub2_Sub4_Sub3_Sub1 local366;
		if (local23 == 20) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static88.anInt2499 = Static36.anInt1063;
				Static68.anInt1957 = 2;
				Static4.anInt102 = Static67.anInt1906;
				Static27.anInt848 = 0;
				Static64.aClass5_Sub9_Sub1_2.method1466(209);
				Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			}
		}
		if (local23 == 3) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static68.anInt1957 = 2;
			Static4.anInt102 = Static67.anInt1906;
			Static27.anInt848 = 0;
			Static88.anInt2499 = Static36.anInt1063;
			Static64.aClass5_Sub9_Sub1_2.method1466(32);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static78.anInt2210 + local15);
			Static64.aClass5_Sub9_Sub1_2.method1430(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1455(local31);
		}
		if (local23 == 17) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static68.anInt1957 = 2;
				Static27.anInt848 = 0;
				Static64.aClass5_Sub9_Sub1_2.method1466(177);
				Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			}
		}
		@Pc(587) int local587;
		@Pc(569) Class5_Sub2_Sub8 local569;
		if (local23 == 28) {
			Static64.aClass5_Sub9_Sub1_2.method1466(217);
			Static64.aClass5_Sub9_Sub1_2.method1413(local19);
			local569 = Static80.method1507(local19);
			if (local569.anIntArrayArray17 != null && local569.anIntArrayArray17[0][0] == 5) {
				local587 = local569.anIntArrayArray17[0][1];
				Static117.anIntArray483[local587] = 1 - Static117.anIntArray483[local587];
				Static69.method1352(local587);
				Static72.aBoolean99 = true;
			}
		}
		if (local23 == 43) {
			Static44.method943(local15, local19, local31);
			Static64.aClass5_Sub9_Sub1_2.method1466(247);
			Static64.aClass5_Sub9_Sub1_2.method1430(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31 >> 14 & 0x7FFF);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static78.anInt2210 + local15);
		}
		if (local23 == 55) {
			Static64.aClass5_Sub9_Sub1_2.method1466(118);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static56.anInt1695);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1423(anInt956);
			Static90.anInt2531 = local15;
			Static78.anInt2204 = 0;
			Static100.anInt2698 = local19;
			Static28.anInt879 = 2;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 33) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static88.anInt2499 = Static36.anInt1063;
			Static27.anInt848 = 0;
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static64.aClass5_Sub9_Sub1_2.method1466(117);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			Static64.aClass5_Sub9_Sub1_2.method1432(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static78.anInt2210 + local15);
		}
		if (local23 == 26) {
			Static64.aClass5_Sub9_Sub1_2.method1466(190);
			Static64.aClass5_Sub9_Sub1_2.method1423(local19);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			Static64.aClass5_Sub9_Sub1_2.method1430(local15);
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			Static90.anInt2531 = local15;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			Static100.anInt2698 = local19;
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
		}
		@Pc(837) Class5_Sub2_Sub4_Sub3_Sub2 local837;
		if (local23 == 5) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static68.anInt1957 = 2;
				Static27.anInt848 = 0;
				Static64.aClass5_Sub9_Sub1_2.method1466(241);
				Static64.aClass5_Sub9_Sub1_2.method1423(Static4.anInt95);
				Static64.aClass5_Sub9_Sub1_2.method1399(Static40.anInt1179);
				Static64.aClass5_Sub9_Sub1_2.method1399(Static66.anInt1896);
				Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			}
		}
		if (local23 == 52) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static4.anInt102 = Static67.anInt1906;
				Static68.anInt1957 = 2;
				Static88.anInt2499 = Static36.anInt1063;
				Static27.anInt848 = 0;
				Static64.aClass5_Sub9_Sub1_2.method1466(236);
				Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			}
		}
		if (local23 == 15) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static88.anInt2499 = Static36.anInt1063;
			Static27.anInt848 = 0;
			Static64.aClass5_Sub9_Sub1_2.method1466(156);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			Static64.aClass5_Sub9_Sub1_2.method1432(Static6.anInt162 + local19);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15 + Static78.anInt2210);
		}
		if (local23 == 58) {
			Static44.method943(local15, local19, local31);
			Static64.aClass5_Sub9_Sub1_2.method1466(37);
			Static64.aClass5_Sub9_Sub1_2.method1430(local15 + Static78.anInt2210);
			Static64.aClass5_Sub9_Sub1_2.method1430(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 12) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static88.anInt2499 = Static36.anInt1063;
				Static27.anInt848 = 0;
				Static68.anInt1957 = 2;
				Static4.anInt102 = Static67.anInt1906;
				Static64.aClass5_Sub9_Sub1_2.method1466(95);
				Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			}
		}
		if (local23 == 1) {
			Static17.method317(local31, local15, local19);
		}
		if (local23 == 30 && Static44.method943(local15, local19, local31)) {
			Static64.aClass5_Sub9_Sub1_2.method1466(56);
			Static64.aClass5_Sub9_Sub1_2.method1432(Static78.anInt2210 + local15);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31 >> 14 & 0x7FFF);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static40.anInt1179);
			Static64.aClass5_Sub9_Sub1_2.method1432(Static66.anInt1896);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static6.anInt162 + local19);
			Static64.aClass5_Sub9_Sub1_2.method1413(Static4.anInt95);
		}
		if (local23 == 31) {
			Static64.aClass5_Sub9_Sub1_2.method1466(134);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			Static100.anInt2698 = local19;
			Static28.anInt879 = 2;
			Static90.anInt2531 = local15;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
			Static78.anInt2204 = 0;
		}
		if (local23 == 34) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static27.anInt848 = 0;
			Static88.anInt2499 = Static36.anInt1063;
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static64.aClass5_Sub9_Sub1_2.method1466(6);
			Static64.aClass5_Sub9_Sub1_2.method1455(local31);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static78.anInt2210 + local15);
			Static64.aClass5_Sub9_Sub1_2.method1424(anInt956);
			Static64.aClass5_Sub9_Sub1_2.method1455(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static56.anInt1695);
		}
		if (local23 == 51) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static88.anInt2499 = Static36.anInt1063;
			Static27.anInt848 = 0;
			Static64.aClass5_Sub9_Sub1_2.method1466(191);
			Static64.aClass5_Sub9_Sub1_2.method1455(local31);
			Static64.aClass5_Sub9_Sub1_2.method1399(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1399(local15 + Static78.anInt2210);
		}
		@Pc(1407) Class45 local1407;
		if (local23 == 10) {
			local1407 = Static35.aClass45Array10[arg0];
			local587 = local1407.method1328(Static39.aClass45_886);
			if (local587 != -1) {
				if (Static63.anInt1837 == -1) {
					Static110.method1983();
					if (Static117.anInt3065 != -1) {
						Static78.aClass45_922 = local1407.method1296(local587 + 5).method1297();
						Static68.anInt1959 = Static63.anInt1837 = Static117.anInt3065;
						Static14.aBoolean13 = false;
					}
				} else {
					Static7.method138(Static33.aClass45_469, Static78.aClass45_929, 0);
					if (Static53.aClass45_1001 != null) {
						Static7.method138(Static53.aClass45_1001, Static78.aClass45_929, 0);
					}
				}
			}
		}
		if (local23 == 21) {
			local569 = Static38.method798(local19, local15);
			if (local569 != null) {
				Static1.method2();
				Static90.method1705(local19, local15, Static13.method268(Static74.method1700(local569)));
				Static16.anInt502 = 0;
				Static72.aBoolean99 = true;
				Static31.aClass45_445 = Static84.method1590(local569);
				if (Static31.aClass45_445 == null) {
					Static31.aClass45_445 = Static85.aClass45_1018;
				}
				if (local569.aBoolean66) {
					Static3.aClass45_32 = Static39.method1443(new Class45[] { local569.aClass45_545, Static39.aClass45_886 });
				} else {
					Static3.aClass45_32 = Static39.method1443(new Class45[] { Static90.aClass45_1055, local569.aClass45_551, Static39.aClass45_886 });
				}
				if (Static101.anInt1044 == 16 && !local569.aBoolean66) {
					Static53.anInt2372 = 3;
					Static78.aBoolean102 = true;
					Static72.aBoolean99 = true;
				}
			}
			return;
		}
		if (local23 == 48) {
			if (Static2.aBoolean2) {
				Static110.aClass34_1.method902(Static8.anInt262, local15 - 4, local19 + -4);
			} else {
				Static110.aClass34_1.method902(Static8.anInt262, Static67.anInt1906 - 4, Static36.anInt1063 + -4);
			}
		}
		if (local23 == 27) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static88.anInt2499 = Static36.anInt1063;
				Static4.anInt102 = Static67.anInt1906;
				Static27.anInt848 = 0;
				Static68.anInt1957 = 2;
				Static64.aClass5_Sub9_Sub1_2.method1466(23);
				Static64.aClass5_Sub9_Sub1_2.method1455(local31);
				Static64.aClass5_Sub9_Sub1_2.method1398(anInt956);
				Static64.aClass5_Sub9_Sub1_2.method1430(Static56.anInt1695);
			}
		}
		if (local23 == 16) {
			Static44.method943(local15, local19, local31);
			Static64.aClass5_Sub9_Sub1_2.method1466(112);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31 >> 14 & 0x7FFF);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15 + Static78.anInt2210);
			Static64.aClass5_Sub9_Sub1_2.method1399(Static6.anInt162 + local19);
		}
		if (local23 == 1006) {
			Static68.anInt1957 = 2;
			Static4.anInt102 = Static67.anInt1906;
			Static27.anInt848 = 0;
			Static88.anInt2499 = Static36.anInt1063;
			Static64.aClass5_Sub9_Sub1_2.method1466(119);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 2) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static88.anInt2499 = Static36.anInt1063;
				Static27.anInt848 = 0;
				Static4.anInt102 = Static67.anInt1906;
				Static68.anInt1957 = 2;
				Static64.aClass5_Sub9_Sub1_2.method1466(230);
				Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			}
		}
		@Pc(1784) long local1784;
		@Pc(1773) int local1773;
		if (local23 == 39) {
			local1407 = Static35.aClass45Array10[arg0];
			local587 = local1407.method1328(Static39.aClass45_886);
			if (local587 != -1) {
				local1773 = -1;
				local1784 = local1407.method1296(local587 + 5).method1297().method1299();
				for (@Pc(1786) int local1786 = 0; local1786 < Static104.anInt2772; local1786++) {
					if (Static23.aLongArray1[local1786] == local1784) {
						local1773 = local1786;
						break;
					}
				}
				if (local1773 != -1 && Static56.anIntArray257[local1773] > 0) {
					Static78.aClass45_930 = Static78.aClass45_929;
					Static7.anInt191 = 3;
					Static93.aBoolean116 = true;
					Static51.aBoolean81 = true;
					Static75.anInt2178 = 0;
					Static54.aLong78 = Static23.aLongArray1[local1773];
					Static78.aClass45_925 = Static39.method1443(new Class45[] { Static62.aClass45_773, Static21.aClass45Array7[local1773] });
				}
			}
		}
		if (local23 == 22) {
			Static64.aClass5_Sub9_Sub1_2.method1466(7);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			Static90.anInt2531 = local15;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			Static100.anInt2698 = local19;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 57) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static68.anInt1957 = 2;
				Static27.anInt848 = 0;
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static64.aClass5_Sub9_Sub1_2.method1466(128);
				Static64.aClass5_Sub9_Sub1_2.method1432(local31);
			}
		}
		if (local23 == 1005) {
			Static44.method943(local15, local19, local31);
			Static64.aClass5_Sub9_Sub1_2.method1466(254);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15 + Static78.anInt2210);
			Static64.aClass5_Sub9_Sub1_2.method1399(Static6.anInt162 + local19);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 38 || local23 == 9) {
			local1407 = Static35.aClass45Array10[arg0];
			local587 = local1407.method1328(Static39.aClass45_886);
			if (local587 != -1) {
				local1407 = local1407.method1296(local587 + 5).method1297();
				@Pc(2014) Class45 local2014 = local1407.method1315().method1303();
				@Pc(2016) boolean local2016 = false;
				for (local1773 = 0; local1773 < Static56.anInt1694; local1773++) {
					@Pc(2026) Class5_Sub2_Sub4_Sub3_Sub1 local2026 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local1773]];
					if (local2026 != null && local2026.aClass45_629 != null && local2026.aClass45_629.method1330(local2014)) {
						Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local2026.anIntArray350[0], 2, 1, 0, local2026.anIntArray349[0], false);
						local2016 = true;
						if (local23 == 38) {
							Static64.aClass5_Sub9_Sub1_2.method1466(177);
							Static64.aClass5_Sub9_Sub1_2.method1430(Static64.anIntArray283[local1773]);
						}
						if (local23 == 9) {
							Static64.aClass5_Sub9_Sub1_2.method1466(236);
							Static64.aClass5_Sub9_Sub1_2.method1399(Static64.anIntArray283[local1773]);
						}
						break;
					}
				}
				if (!local2016) {
					Static7.method138(Static39.method1443(new Class45[] { Static10.aClass45_160, local2014 }), Static78.aClass45_929, 0);
				}
			}
		}
		if (local23 == 14) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static27.anInt848 = 0;
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static68.anInt1957 = 2;
				Static64.aClass5_Sub9_Sub1_2.method1466(55);
				Static64.aClass5_Sub9_Sub1_2.method1455(local31);
			}
		}
		if (local23 == 53) {
			Static64.aClass5_Sub9_Sub1_2.method1466(131);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1455(local31);
			Static64.aClass5_Sub9_Sub1_2.method1423(local19);
			Static100.anInt2698 = local19;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			Static90.anInt2531 = local15;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 49) {
			Static64.aClass5_Sub9_Sub1_2.method1466(130);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15);
			Static64.aClass5_Sub9_Sub1_2.method1424(local19);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			Static28.anInt879 = 2;
			Static78.anInt2204 = 0;
			Static100.anInt2698 = local19;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			Static90.anInt2531 = local15;
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 29) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static88.anInt2499 = Static36.anInt1063;
				Static27.anInt848 = 0;
				Static68.anInt1957 = 2;
				Static4.anInt102 = Static67.anInt1906;
				Static64.aClass5_Sub9_Sub1_2.method1466(224);
				Static64.aClass5_Sub9_Sub1_2.method1430(local31);
				Static64.aClass5_Sub9_Sub1_2.method1432(Static40.anInt1179);
				Static64.aClass5_Sub9_Sub1_2.method1424(Static4.anInt95);
				Static64.aClass5_Sub9_Sub1_2.method1455(Static66.anInt1896);
			}
		}
		if (local23 == 40) {
			Static44.method943(local15, local19, local31);
			Static64.aClass5_Sub9_Sub1_2.method1466(31);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31 >> 14 & 0x7FFF);
			Static64.aClass5_Sub9_Sub1_2.method1430(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15 + Static78.anInt2210);
		}
		if (local23 == 13 || local23 == 46 || local23 == 6 || local23 == 54) {
			local1407 = Static35.aClass45Array10[arg0];
			local587 = local1407.method1328(Static39.aClass45_886);
			if (local587 != -1) {
				local1784 = local1407.method1296(local587 + 5).method1297().method1299();
				if (local23 == 13) {
					Static80.method1505(local1784);
				}
				if (local23 == 46) {
					Static100.method1843(local1784);
				}
				if (local23 == 6) {
					Static25.method560(local1784);
				}
				if (local23 == 54) {
					Static71.method1386(local1784);
				}
			}
		}
		if (local23 == 24) {
			Static64.aClass5_Sub9_Sub1_2.method1466(140);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15);
			Static100.anInt2698 = local19;
			Static90.anInt2531 = local15;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 8) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static27.anInt848 = 0;
				Static68.anInt1957 = 2;
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static64.aClass5_Sub9_Sub1_2.method1466(64);
				Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			}
		}
		if (local23 == 45) {
			local79 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 0, 0, local19, false);
			if (!local79) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local15, 2, 1, 0, local19, false);
			}
			Static68.anInt1957 = 2;
			Static4.anInt102 = Static67.anInt1906;
			Static88.anInt2499 = Static36.anInt1063;
			Static27.anInt848 = 0;
			Static64.aClass5_Sub9_Sub1_2.method1466(21);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			Static64.aClass5_Sub9_Sub1_2.method1455(local19 + Static6.anInt162);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static78.anInt2210 + local15);
		}
		if (local23 == 56 && Static119.anInt3089 == -1) {
			Static112.method2050(local19, local15);
			Static119.anInt3089 = local19;
			Static54.anInt1637 = local15;
		}
		if (local23 == 42) {
			Static64.aClass5_Sub9_Sub1_2.method1466(217);
			Static64.aClass5_Sub9_Sub1_2.method1413(local19);
			local569 = Static80.method1507(local19);
			if (local569.anIntArrayArray17 != null && local569.anIntArrayArray17[0][0] == 5) {
				local587 = local569.anIntArrayArray17[0][1];
				if (local569.anIntArray206[0] != Static117.anIntArray483[local587]) {
					Static117.anIntArray483[local587] = local569.anIntArray206[0];
					Static69.method1352(local587);
					Static72.aBoolean99 = true;
				}
			}
		}
		if (local23 == 25) {
			Static64.aClass5_Sub9_Sub1_2.method1466(75);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1413(local19);
			Static78.anInt2204 = 0;
			Static100.anInt2698 = local19;
			Static28.anInt879 = 2;
			Static90.anInt2531 = local15;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 47) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static27.anInt848 = 0;
				Static68.anInt1957 = 2;
				Static64.aClass5_Sub9_Sub1_2.method1466(90);
				Static64.aClass5_Sub9_Sub1_2.method1399(local31);
				Static64.aClass5_Sub9_Sub1_2.method1398(anInt956);
				Static64.aClass5_Sub9_Sub1_2.method1430(Static56.anInt1695);
			}
		}
		if (local23 == 37) {
			Static1.method2();
			Static16.anInt502 = 1;
			Static66.anInt1896 = local31;
			Static4.anInt95 = local19;
			Static72.aBoolean99 = true;
			Static40.anInt1179 = local15;
			Static12.aClass45_1357 = Static39.method1443(new Class45[] { Static68.aClass45_830, Static81.method1515(local31).aClass45_108, Static39.aClass45_886 });
			if (Static12.aClass45_1357 == null) {
				Static12.aClass45_1357 = Static75.aClass45_904;
			}
			return;
		}
		if (local23 == 36) {
			local569 = Static80.method1507(local19);
			@Pc(2887) boolean local2887 = true;
			if (local569.anInt1267 > 0) {
				local2887 = Static66.method1288(local569);
			}
			if (local2887) {
				Static64.aClass5_Sub9_Sub1_2.method1466(217);
				Static64.aClass5_Sub9_Sub1_2.method1413(local19);
			}
		}
		if (local23 == 11) {
			Static64.aClass5_Sub9_Sub1_2.method1466(33);
			Static64.aClass5_Sub9_Sub1_2.method1398(Static4.anInt95);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static66.anInt1896);
			Static64.aClass5_Sub9_Sub1_2.method1455(local15);
			Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static40.anInt1179);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static100.anInt2698 = local19;
			Static78.anInt2204 = 0;
			Static28.anInt879 = 2;
			if (local19 >> 16 == Static63.anInt1837) {
				Static28.anInt879 = 1;
			}
			if (Static67.anInt1909 == local19 >> 16) {
				Static28.anInt879 = 3;
			}
			Static90.anInt2531 = local15;
		}
		if (local23 == 19) {
			Static64.aClass5_Sub9_Sub1_2.method1466(154);
			Static64.aClass5_Sub9_Sub1_2.method1413(anInt956);
			Static64.aClass5_Sub9_Sub1_2.method1432(local15);
			Static64.aClass5_Sub9_Sub1_2.method1398(local19);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static56.anInt1695);
		}
		if (local23 == 41) {
			Static110.method1983();
		}
		if (local23 == 1004) {
			local569 = Static80.method1507(local19);
			if (local569 == null || local569.anIntArray208[local15] < 100000) {
				Static64.aClass5_Sub9_Sub1_2.method1466(159);
				Static64.aClass5_Sub9_Sub1_2.method1455(local31);
			} else {
				Static7.method138(Static39.method1443(new Class45[] { Static76.method1476(local569.anIntArray208[local15]), Static73.aClass45_898, Static81.method1515(local31).aClass45_108 }), Static78.aClass45_929, 0);
			}
			Static100.anInt2698 = local19;
			Static28.anInt879 = 2;
			Static90.anInt2531 = local15;
			Static78.anInt2204 = 0;
			if (Static63.anInt1837 == local19 >> 16) {
				Static28.anInt879 = 1;
			}
			if (local19 >> 16 == Static67.anInt1909) {
				Static28.anInt879 = 3;
			}
		}
		if (local23 == 18) {
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local837.anIntArray350[0], 2, 1, 0, local837.anIntArray349[0], false);
				Static68.anInt1957 = 2;
				Static27.anInt848 = 0;
				Static88.anInt2499 = Static36.anInt1063;
				Static4.anInt102 = Static67.anInt1906;
				Static64.aClass5_Sub9_Sub1_2.method1466(226);
				Static64.aClass5_Sub9_Sub1_2.method1399(local31);
			}
		}
		if (local23 == 23) {
			Static5.method79(Static100.anInt2693);
			Static100.anInt2693 = -1;
			Static51.aBoolean81 = true;
		}
		if (local23 == 4) {
			local366 = aClass5_Sub2_Sub4_Sub3_Sub1Array1[local31];
			if (local366 != null) {
				Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local366.anIntArray350[0], 2, 1, 0, local366.anIntArray349[0], false);
				Static68.anInt1957 = 2;
				Static27.anInt848 = 0;
				Static4.anInt102 = Static67.anInt1906;
				Static88.anInt2499 = Static36.anInt1063;
				Static64.aClass5_Sub9_Sub1_2.method1466(30);
				Static64.aClass5_Sub9_Sub1_2.method1430(local31);
			}
		}
		if (local23 == 1001) {
			Static27.anInt848 = 0;
			Static4.anInt102 = Static67.anInt1906;
			Static68.anInt1957 = 2;
			Static88.anInt2499 = Static36.anInt1063;
			local837 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local31];
			if (local837 != null) {
				@Pc(3229) Class5_Sub2_Sub17 local3229 = local837.aClass5_Sub2_Sub17_1;
				if (local3229.anIntArray479 != null) {
					local3229 = local3229.method2122();
				}
				if (local3229 != null) {
					Static64.aClass5_Sub9_Sub1_2.method1466(133);
					Static64.aClass5_Sub9_Sub1_2.method1432(local3229.anInt3079);
				}
			}
		}
		if (Static16.anInt502 != 0) {
			Static16.anInt502 = 0;
			Static72.aBoolean99 = true;
		}
		if (Static13.aBoolean12) {
			Static1.method2();
			Static72.aBoolean99 = true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method690() {
		aClass45_475 = null;
		aClass32_1 = null;
		aClass5_Sub2_Sub4_Sub3_Sub1Array1 = null;
		aClass29_25 = null;
		aClass66_4 = null;
		anIntArray159 = null;
		aClass45_476 = null;
		aClass45_477 = null;
		aClass5_Sub2_Sub6_Sub4Array2 = null;
		aClass45_478 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	public static int method691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(33) int local33 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local33 >> 19 & 0xFF;
	}
}
