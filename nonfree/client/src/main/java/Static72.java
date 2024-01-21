import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_17;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array6;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1066 = Static80.method1463("backright1");

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "[I")
	public static int[] anIntArray232 = new int[1000];

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!aa;")
	public static Class2 aClass2_8 = new Class2(32);

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public static int anInt2044 = 0;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
	public static int[] anIntArray233 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1067 = Static80.method1463("Registrierter Benutzer");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public static int anInt2046 = 0;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Z")
	public static final boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	public static int anInt2047 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1381() {
		anIntArray232 = null;
		aClass63_1067 = null;
		anIntArray233 = null;
		aClass6_Sub3_Sub3_Sub2Array6 = null;
		aClass63_1066 = null;
		aClass6_Sub3_Sub3_Sub3_17 = null;
		aClass2_8 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1382() {
		try {
			@Pc(2) Graphics local2 = Static38.aCanvas1.getGraphics();
			Static57.aClass29_9.method1428(205, 553, local2);
		} catch (@Pc(15) Exception local15) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1383() {
		Static43.anInt129 = 0;
		Static69.anInt2002 = 0;
		Static81.method1483();
		Static92.method1673();
		Static1.method7();
		@Pc(19) int local19;
		for (@Pc(13) int local13 = 0; local13 < Static69.anInt2002; local13++) {
			local19 = Static89.anIntArray282[local13];
			if (Static73.anInt2064 != Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local19].anInt2324) {
				Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local19].aClass6_Sub3_Sub2_1 = null;
				Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local19] = null;
			}
		}
		if (Static88.aClass6_Sub4_Sub1_5.anInt1949 != Static14.anInt464) {
			throw new RuntimeException("gnp1 pos:" + Static88.aClass6_Sub4_Sub1_5.anInt1949 + " psize:" + Static14.anInt464);
		}
		for (local19 = 0; local19 < Static22.anInt689; local19++) {
			if (Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local19]] == null) {
				throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static22.anInt689);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lclient!wa;")
	public static Class6_Sub3_Sub17 method1384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub3_Sub17 local9 = Static12.method339(arg1);
		if (arg0 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass6_Sub3_Sub17Array2 == null || arg0 >= local9.aClass6_Sub3_Sub17Array2.length) {
			return null;
		} else {
			return local9.aClass6_Sub3_Sub17Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIIII)Z")
	public static boolean method1385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static36.method866(arg3)) {
			return false;
		}
		Static64.aClass6_Sub3_Sub17Array1 = null;
		@Pc(30) boolean local30 = Static84.method1574(Static68.aClass6_Sub3_Sub17ArrayArray1[arg3], 0, arg1, arg0, 0, arg2, 0, 0, -1);
		if (Static64.aClass6_Sub3_Sub17Array1 != null) {
			Static84.method1574(Static64.aClass6_Sub3_Sub17Array1, 0, arg1, arg0, Static87.anInt2411, arg2, 0, Static31.anInt1012, -1412584499);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BILclient!rd;Lclient!rd;Lclient!ge;ZI)V")
	public static void method1387(@OriginalArg(2) Class63 arg0, @OriginalArg(3) Class63 arg1, @OriginalArg(4) Class7 arg2) {
		@Pc(14) int local14 = arg2.method91(arg1);
		@Pc(22) int local22 = arg2.method107(local14, arg0);
		Static60.method1174(local22, local14, arg2, 255);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public static void method1388() {
		if (Static117.anInt3000 == 2) {
			Static89.method1604(Static23.anInt2350 * 2, Static5.anInt54 + (Static46.anInt1428 - Static91.anInt2560 << 7), (-Static80.anInt2169 + Static97.anInt2727 << 7) + Static78.anInt2152);
			if (Static99.anInt2785 > -1 && Static73.anInt2064 % 20 < 10) {
				Static2.aClass6_Sub3_Sub3_Sub2Array1[0].method1252(Static99.anInt2785 - 12, Static120.anInt3217 - 28);
			}
		}
	}
}
