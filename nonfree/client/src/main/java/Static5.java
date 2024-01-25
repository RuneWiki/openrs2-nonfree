import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static int anInt92;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public static int anInt93;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Lclient!ij;")
	public static Class93 aClass93_5;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	public static int anInt95;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	public static int anInt94 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method87() {
		Static56.aClass93_22 = null;
		Static249.aBoolean518 = false;
		Static297.anInt5809 = -1;
		Static250.anInt4969 = 1;
		anInt95 = 2;
		Static51.anInt966 = 0;
		Static115.anInt2139 = -1;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
	public static void method89() {
		Static189.method3383(Static204.aClass201_8);
		Static104.anInt1997++;
		if (Static322.aBoolean41 && Static205.aBoolean336) {
			@Pc(26) int local26 = Static316.aClass118_3.method4054();
			@Pc(35) int local35 = Static316.aClass118_3.method4050();
			local35 -= Static139.anInt2691;
			local26 -= Static95.anInt1816;
			@Pc(51) int local51;
			@Pc(56) int local56;
			if (Static104.anInt1997 > Static204.aClass201_8.anInt6528) {
				local51 = local26 - Static353.anInt6773;
				local56 = local35 - Static250.anInt4970;
				if (local51 > Static204.aClass201_8.anInt6494 || -Static204.aClass201_8.anInt6494 > local51 || Static204.aClass201_8.anInt6494 < local56 || -Static204.aClass201_8.anInt6494 > local56) {
					Static303.aBoolean489 = true;
				}
			}
			if (local26 < Static331.anInt6418) {
				local26 = Static331.anInt6418;
			}
			if (Static150.anInt2941 > local35) {
				local35 = Static150.anInt2941;
			}
			if (local26 + Static204.aClass201_8.anInt6505 > Static331.anInt6418 - -Static342.aClass201_13.anInt6505) {
				local26 = Static342.aClass201_13.anInt6505 + Static331.anInt6418 - Static204.aClass201_8.anInt6505;
			}
			if (Static342.aClass201_13.anInt6510 + Static150.anInt2941 < local35 - -Static204.aClass201_8.anInt6510) {
				local35 = Static342.aClass201_13.anInt6510 + Static150.anInt2941 - Static204.aClass201_8.anInt6510;
			}
			local51 = Static342.aClass201_13.anInt6558 + local26 - Static331.anInt6418;
			local56 = Static342.aClass201_13.anInt6543 + local35 - Static150.anInt2941;
			@Pc(165) Class5_Sub17 local165;
			if (Static204.aClass201_8.anObjectArray18 != null && Static303.aBoolean489) {
				local165 = new Class5_Sub17();
				local165.anObjectArray1 = Static204.aClass201_8.anObjectArray18;
				local165.anInt1857 = local51;
				local165.anInt1849 = local56;
				local165.aClass201_3 = Static204.aClass201_8;
				Static108.method1907(local165);
			}
			if (!Static316.aClass118_3.method4052()) {
				if (Static303.aBoolean489) {
					if (Static204.aClass201_8.anObjectArray29 != null) {
						local165 = new Class5_Sub17();
						local165.aClass201_2 = Static14.aClass201_1;
						local165.aClass201_3 = Static204.aClass201_8;
						local165.anInt1857 = local51;
						local165.anObjectArray1 = Static204.aClass201_8.anObjectArray29;
						local165.anInt1849 = local56;
						Static108.method1907(local165);
					}
					if (Static14.aClass201_1 != null && Static45.method718(Static204.aClass201_8) != null) {
						Static335.method5817(Static14.aClass201_1, Static204.aClass201_8);
					}
				} else if ((Static267.anInt5259 == 1 || Static245.method4388()) && Static160.anInt3181 > 2) {
					Static168.method3067(Static95.anInt1816 + Static353.anInt6773, Static139.anInt2691 + Static250.anInt4970, 2);
				} else if (Static308.method5392()) {
					Static168.method3067(Static353.anInt6773 + Static95.anInt1816, Static250.anInt4970 + Static139.anInt2691, 0);
				}
				Static204.aClass201_8 = null;
			}
		} else if (Static104.anInt1997 > 1) {
			Static204.aClass201_8 = null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vg;I)Lclient!vg;")
	public static Class201 method91(@OriginalArg(0) Class201 arg0) {
		@Pc(11) Class201 local11 = Static45.method718(arg0);
		if (local11 == null) {
			local11 = arg0.aClass201_12;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!h;B)I")
	public static int method92(@OriginalArg(0) Class5_Sub20 arg0) {
		@Pc(7) String local7 = Static124.method2199(arg0);
		@Pc(9) int[] local9 = null;
		if (Static96.method1758(arg0.anInt2094)) {
			local9 = Static322.method544((int) arg0.aLong73).anIntArray385;
		} else if (Static60.method1846(arg0.anInt2094)) {
			@Pc(69) Class4_Sub5_Sub2_Sub2 local69 = Static280.aClass4_Sub5_Sub2_Sub2Array1[(int) arg0.aLong73];
			if (local69 != null) {
				local9 = local69.aClass106_1.anIntArray323;
			}
		} else if (Static134.method1927(arg0.anInt2094)) {
			if (arg0.anInt2094 == 1011) {
				local9 = Static111.method1967((int) arg0.aLong73).anIntArray436;
			} else {
				local9 = Static111.method1967((int) (arg0.aLong73 >>> 32 & 0x7FFFFFFFL)).anIntArray436;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static7.method121(local9);
		}
		return Static268.aClass36_8.method641(Static303.aClass95Array15, local7);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	public static void method93(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 9);
		local8.method856();
	}
}
