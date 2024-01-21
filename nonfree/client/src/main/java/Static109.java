import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt2865;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!te;")
	public static Class3_Sub1_Sub17 aClass3_Sub1_Sub17_5;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	public static int anInt2873;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public static int anInt2875;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	public static int anInt2877;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1283 = Static56.method972("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1284 = Static56.method972("Please use a different world)3");

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public static int anInt2870 = 0;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1285 = Static56.method972("Ausw-=hlen");

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1286 = aClass5_1284;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1287 = aClass5_1284;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
	public static void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class51 local7 = Static24.aClass51ArrayArrayArray1[Static12.anInt480][arg0][arg1];
		if (local7 == null) {
			Static73.aClass42_1.method1029(Static12.anInt480, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub1_Sub4 local23 = null;
		@Pc(28) Class3_Sub1_Sub1_Sub4 local28;
		for (local28 = (Class3_Sub1_Sub1_Sub4) local7.method1316(); local28 != null; local28 = (Class3_Sub1_Sub1_Sub4) local7.method1310()) {
			@Pc(34) Class3_Sub1_Sub3 local34 = Static37.method694(local28.anInt1194);
			@Pc(37) int local37 = local34.anInt695;
			if (local34.anInt676 == 1) {
				local37 *= local28.anInt1191 + 1;
			}
			if (local37 > local21) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static73.aClass42_1.method1029(Static12.anInt480, arg0, arg1);
			return;
		}
		local7.method1313(local23);
		@Pc(80) Class3_Sub1_Sub1_Sub4 local80 = null;
		@Pc(89) int local89 = arg0 + (arg1 << 7) + 1610612736;
		local28 = (Class3_Sub1_Sub1_Sub4) local7.method1316();
		@Pc(101) Class3_Sub1_Sub1_Sub4 local101 = null;
		while (local28 != null) {
			if (local28.anInt1194 != local23.anInt1194) {
				if (local80 == null) {
					local80 = local28;
				}
				if (local28.anInt1194 != local80.anInt1194 && local101 == null) {
					local101 = local28;
				}
			}
			local28 = (Class3_Sub1_Sub1_Sub4) local7.method1310();
		}
		Static73.aClass42_1.method1047(Static12.anInt480, arg0, arg1, Static15.method358(arg1 * 128 + 64, Static12.anInt480, arg0 * 128 + 64), local23, local89, local80, local101);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method1897() {
		anIntArray371 = null;
		aClass5_1284 = null;
		aClass5_1286 = null;
		aClass5_1285 = null;
		aClass5_1287 = null;
		aClass3_Sub1_Sub17_5 = null;
		aClass3_Sub1_Sub2_Sub4_17 = null;
		aClass5_1283 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!te;)[I")
	public static int[] method1898(@OriginalArg(1) Class3_Sub1_Sub17 arg0) {
		@Pc(6) int local6 = arg0.anInt2651 >> 16;
		if (!Static18.method406(local6)) {
			return null;
		}
		@Pc(19) int local19 = arg0.anInt2655;
		@Pc(22) int local22 = arg0.anInt2603;
		@Pc(35) Class3_Sub1_Sub17 local35;
		for (@Pc(25) int local25 = arg0.anInt2621; local25 != -1; local25 = local35.anInt2621) {
			local35 = Static31.aClass3_Sub1_Sub17ArrayArray3[local6][local25 & 0xFFFF];
			local22 += local35.anInt2603 - local35.anInt2583;
			local19 += local35.anInt2655 - local35.anInt2636;
		}
		return new int[] { local19, local22 };
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method1899() {
		@Pc(1) Object local1 = Static5.anObject1;
		synchronized (Static5.anObject1) {
			if (Static32.anInt922 == 0) {
				Static56.aClass23_3.method520(new Class69(), 5);
			}
			Static32.anInt922 = 600;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!ed;Ljava/awt/Component;II)Lclient!cc;")
	public static Class3_Sub2_Sub1 method1900(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Component arg1) {
		Static17.method401(arg1, arg0);
		@Pc(18) Class3_Sub2_Sub1 local18 = new Class3_Sub2_Sub1();
		Static14.method1908(local18);
		return local18;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V")
	public static void method1901(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static17.anInt616 >= 100) {
			Static64.method1084(Static110.aClass5_1307, Static32.aClass5_424, 0);
			return;
		}
		@Pc(27) Class5 local27 = Static82.method1301(arg0).method147();
		for (@Pc(29) int local29 = 0; local29 < Static17.anInt616; local29++) {
			if (arg0 == Static56.aLongArray4[local29]) {
				Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { local27, Static63.aClass5_1321 }), 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static5.anInt346; local70++) {
			if (arg0 == Static94.aLongArray2[local70]) {
				Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { Static89.aClass5_1039, local27, Static21.aClass5_306 }), 0);
				return;
			}
		}
		if (!local27.method163(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765)) {
			Static56.aLongArray4[Static17.anInt616++] = arg0;
			Static116.aBoolean157 = true;
			Static95.aClass3_Sub6_Sub1_3.method1645(198);
			Static95.aClass3_Sub6_Sub1_3.method1606(arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Lclient!ia;")
	public static Class3_Sub1_Sub6 method1902(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub6 local10 = (Class3_Sub1_Sub6) Static95.aClass9_23.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static99.aClass11_62.method1882(5, arg0);
		local10 = new Class3_Sub1_Sub6();
		if (local28 != null) {
			local10.method821(new Class3_Sub6(local28));
		}
		Static95.aClass9_23.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!bf;)V")
	public static void method1903(@OriginalArg(1) Class11 arg0) {
		Static19.aClass11_13 = arg0;
	}
}
