import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt213;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt214;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!mb;")
	public static Class42 aClass42_8;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!kb;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt216 = 0;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!v;")
	private static Class62 aClass62_91 = Static45.method753("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_90 = aClass62_91;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array1 = new Class62[100];

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array2 = new Class62[100];

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_92 = Static45.method753("::");

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
	public static int[] anIntArray22 = new int[25];

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_93 = Static45.method753("Duell akzeptieren");

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	public static int anInt228 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!bd;IB)V")
	public static void method174(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static8.method204(arg1, arg0.anInt1887, arg0.anInt1882);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ad;)V")
	public static void method175(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		if (arg0.anInt190 == 0) {
			local5 = Static76.aClass1_1.method47(arg0.anInt188, arg0.anInt174, arg0.anInt189);
		}
		if (arg0.anInt190 == 1) {
			local5 = Static76.aClass1_1.method42(arg0.anInt188, arg0.anInt174, arg0.anInt189);
		}
		@Pc(41) int local41 = 0;
		if (arg0.anInt190 == 2) {
			local5 = Static76.aClass1_1.method26(arg0.anInt188, arg0.anInt174, arg0.anInt189);
		}
		if (arg0.anInt190 == 3) {
			local5 = Static76.aClass1_1.method3(arg0.anInt188, arg0.anInt174, arg0.anInt189);
		}
		if (local5 != 0) {
			local9 = local5 >> 14 & 0x7FFF;
			@Pc(89) int local89 = Static76.aClass1_1.method22(arg0.anInt188, arg0.anInt174, arg0.anInt189, local5);
			local41 = local89 >> 6 & 0x3;
			local7 = local89 & 0x1F;
		}
		arg0.anInt177 = local7;
		arg0.anInt178 = local41;
		arg0.anInt184 = local9;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 method176() {
		@Pc(7) Class3_Sub1_Sub1_Sub1 local7 = new Class3_Sub1_Sub1_Sub1();
		local7.anInt151 = Static39.anInt1163;
		local7.anInt149 = Static14.anInt551;
		local7.anInt153 = Static98.anIntArray281[0];
		local7.anInt150 = Static36.anIntArray78[0];
		local7.anInt152 = Static75.anIntArray228[0];
		local7.anInt148 = Static50.anIntArray310[0];
		local7.anIntArray17 = Static70.anIntArray201;
		local7.aByteArray3 = Static98.aByteArrayArray9[0];
		Static51.method1440();
		return local7;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIIIIII)V")
	public static void method177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg4 & 0x7FF;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = arg5;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local10 != 0) {
			local37 = Static57.anIntArray156[local10];
			local41 = Static57.anIntArray161[local10];
			local52 = local41 * 0 - local37 * arg5 >> 16;
			local31 = arg5 * local41 + local37 * 0 >> 16;
			local29 = local52;
		}
		if (local17 != 0) {
			local37 = Static57.anIntArray156[local17];
			local41 = Static57.anIntArray161[local17];
			local52 = local37 * local31 + local41 * 0 >> 16;
			local31 = local31 * local41 - local37 * 0 >> 16;
			local27 = local52;
		}
		Static69.anInt1904 = arg4;
		Static96.anInt2559 = arg3;
		Static4.anInt187 = arg2 - local31;
		Static96.anInt2555 = arg1 - local27;
		Static23.anInt752 = arg0 - local29;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!fe;Z)Z")
	public static boolean method178(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		@Pc(11) int local11 = arg0.anInt917;
		if (Static31.anInt984 == 2) {
			if (local11 == 201) {
				Static74.anInt1985 = 1;
				Static41.aClass62_516 = Static41.aClass62_513;
				Static86.aBoolean137 = true;
				Static41.aClass62_524 = Static55.aClass62_653;
				Static41.aBoolean69 = true;
				Static71.anInt1943 = 0;
			}
			if (local11 == 202) {
				Static71.anInt1943 = 0;
				Static41.aClass62_516 = Static41.aClass62_513;
				Static74.anInt1985 = 2;
				Static41.aBoolean69 = true;
				Static41.aClass62_524 = Static32.aClass62_445;
				Static86.aBoolean137 = true;
			}
		}
		if (local11 == 205) {
			Static63.anInt2365 = 250;
			return true;
		}
		if (local11 == 501) {
			Static74.anInt1985 = 4;
			Static41.aClass62_524 = Static77.aClass62_906;
			Static86.aBoolean137 = true;
			Static41.aClass62_516 = Static41.aClass62_513;
			Static71.anInt1943 = 0;
			Static41.aBoolean69 = true;
		}
		if (local11 == 502) {
			Static74.anInt1985 = 5;
			Static41.aClass62_516 = Static41.aClass62_513;
			Static41.aClass62_524 = Static77.aClass62_910;
			Static41.aBoolean69 = true;
			Static86.aBoolean137 = true;
			Static71.anInt1943 = 0;
		}
		@Pc(107) int local107;
		@Pc(111) int local111;
		if (local11 >= 300 && local11 <= 313) {
			local107 = (local11 - 300) / 2;
			local111 = local11 & 0x1;
			Static46.aClass53_2.method1259(local107, local111 == 1);
		}
		if (local11 >= 314 && local11 <= 323) {
			local111 = local11 & 0x1;
			local107 = (local11 - 314) / 2;
			Static46.aClass53_2.method1256(local107, local111 == 1);
		}
		if (local11 == 324) {
			Static46.aClass53_2.method1258(false);
		}
		if (local11 == 325) {
			Static46.aClass53_2.method1258(true);
		}
		if (local11 == 326) {
			Static63.aClass3_Sub8_Sub1_6.method1824(62);
			Static46.aClass53_2.method1257(Static63.aClass3_Sub8_Sub1_6);
			return true;
		}
		if (local11 == 620) {
			Static51.aBoolean139 = !Static51.aBoolean139;
		}
		if (local11 >= 601 && local11 <= 613) {
			Static108.method1840();
			if (Static41.aClass62_514.method1688() > 0) {
				Static63.aClass3_Sub8_Sub1_6.method1824(150);
				Static63.aClass3_Sub8_Sub1_6.method1763(Static41.aClass62_514.method1701());
				Static63.aClass3_Sub8_Sub1_6.method1806(local11 - 601);
				Static63.aClass3_Sub8_Sub1_6.method1806(Static51.aBoolean139 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method179() {
		Static29.aClass9_15.method682();
		Static35.aClass3_Sub1_Sub1_Sub1_10.method145(0, 0);
		Static63.anIntArray265 = Static66.method1120(Static63.anIntArray265);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method180() {
		aClass9_5 = null;
		aClass3_Sub1_Sub1_Sub1_4 = null;
		aClass62_90 = null;
		aClass42_8 = null;
		aClass62_91 = null;
		aClass62_93 = null;
		aClass62Array2 = null;
		aClass62Array1 = null;
		aClass62_92 = null;
		anIntArray22 = null;
	}
}
