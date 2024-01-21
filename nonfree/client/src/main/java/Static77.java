import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!pe;")
	private static Class65 aClass65_736 = Static119.method1462("glow2:");

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_735 = aClass65_736;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_737 = aClass65_736;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_738 = Static119.method1462("Mem:");

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_739 = Static119.method1462("<)4col>");

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public static int anInt1714 = 0;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!pe;")
	private static Class65 aClass65_743 = Static119.method1462("as it was used to break our rules)3");

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_740 = aClass65_743;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_741 = Static119.method1462("Sprites geladen)3");

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!pe;")
	public static Class65 aClass65_742 = Static119.method1462("::qa_op_test");

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	public static int anInt1725 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!na;Ljava/awt/Component;ILclient!na;)V")
	public static void method1289(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class56 arg2) {
		if (Static60.aBoolean18) {
			return;
		}
		Static118.method2065();
		@Pc(15) byte[] local15 = arg0.method1682(Static57.aClass65_629, Static57.aClass65_632);
		Static78.aClass2_Sub1_Sub4_Sub1_4 = new Class2_Sub1_Sub4_Sub1(local15, arg1);
		Static62.aClass2_Sub1_Sub4_Sub1_3 = Static78.aClass2_Sub1_Sub4_Sub1_4.method458();
		Static126.aClass2_Sub1_Sub4_Sub2_40 = Static56.method1073(arg2, Static57.aClass65_629, Static71.aClass65_705);
		Static104.aClass2_Sub1_Sub4_Sub2_45 = Static56.method1073(arg2, Static57.aClass65_629, Static3.aClass65_52);
		Static1.aClass2_Sub1_Sub4_Sub2_1 = Static56.method1073(arg2, Static57.aClass65_629, Static132.aClass65_1253);
		Static112.aClass2_Sub1_Sub4_Sub2Array9 = Static41.method729(arg2, Static93.aClass65_877, Static57.aClass65_629);
		Static122.aClass2_Sub1_Sub4_Sub2Array10 = Static41.method729(arg2, Static26.aClass65_294, Static57.aClass65_629);
		Static21.anIntArray44 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static21.anIntArray44[local61] = local61 * 262144;
		}
		for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
			Static21.anIntArray44[local77 + 64] = local77 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static21.anIntArray44[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
			Static21.anIntArray44[local114 + 192] = 16777215;
		}
		Static41.anIntArray118 = new int[256];
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			Static41.anIntArray118[local133] = local133 * 1024;
		}
		for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
			Static41.anIntArray118[local149 + 64] = local149 * 4 + 65280;
		}
		for (@Pc(167) int local167 = 0; local167 < 64; local167++) {
			Static41.anIntArray118[local167 + 128] = local167 * 262144 + 65535;
		}
		for (@Pc(185) int local185 = 0; local185 < 64; local185++) {
			Static41.anIntArray118[local185 + 192] = 16777215;
		}
		Static11.anIntArray162 = new int[256];
		for (@Pc(202) int local202 = 0; local202 < 64; local202++) {
			Static11.anIntArray162[local202] = local202 * 4;
		}
		for (@Pc(218) int local218 = 0; local218 < 64; local218++) {
			Static11.anIntArray162[local218 + 64] = local218 * 262144 + 255;
		}
		for (@Pc(238) int local238 = 0; local238 < 64; local238++) {
			Static11.anIntArray162[local238 + 128] = local238 * 1024 + 16711935;
		}
		for (@Pc(256) int local256 = 0; local256 < 64; local256++) {
			Static11.anIntArray162[local256 + 192] = 16777215;
		}
		Static12.anIntArray30 = new int[32768];
		Static44.anIntArray126 = new int[256];
		Static4.anIntArray157 = new int[32768];
		Static119.method1469(null);
		Static122.anInt2624 = 0;
		Static57.aClass65_634 = Static57.aClass65_629;
		Static98.anIntArray291 = new int[32768];
		Static22.anIntArray48 = new int[32768];
		Static57.aClass65_627 = Static57.aClass65_629;
		Static63.aBoolean54 = false;
		if (Static39.anInt840 == 0) {
			Static34.aBoolean33 = true;
		} else {
			Static34.aBoolean33 = false;
		}
		if (Static34.aBoolean33) {
			Static63.method1132();
		} else {
			Static130.method1979(Static57.aClass65_629, Static3.aClass65_51, Static88.aClass56_Sub1_19);
		}
		Static102.method1662(false);
		Static60.aBoolean18 = true;
		Static78.aClass2_Sub1_Sub4_Sub1_4.method446(0, 0);
		Static62.aClass2_Sub1_Sub4_Sub1_3.method446(382, 0);
		Static126.aClass2_Sub1_Sub4_Sub2_40.method996(382 - Static126.aClass2_Sub1_Sub4_Sub2_40.anInt1370 / 2, 18);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1290() {
		for (@Pc(7) int local7 = -1; local7 < Static35.anInt795; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static76.anIntArray223[local7];
			}
			@Pc(25) Class2_Sub1_Sub1_Sub4_Sub1 local25 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local17];
			if (local25 != null) {
				Static7.method153(1, local25);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1291() {
		aClass65_735 = null;
		anIntArray225 = null;
		aClass65_740 = null;
		aClass65_737 = null;
		anIntArray226 = null;
		aClass65_738 = null;
		aClass65_736 = null;
		aClass65_742 = null;
		aClass65_741 = null;
		aClass65_739 = null;
		aClass65_743 = null;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public static void method1292() {
		Static22.aClass40_6 = new Class40(32);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method1293(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt1928 == Static10.anInt2951 || arg0.anInt1972 == -1 || arg0.anInt1936 != 0 || arg0.anInt1938 + 1 > Static23.method1313(arg0.anInt1972).anIntArray21[arg0.anInt1970]) {
			@Pc(37) int local37 = arg0.anInt1928 - arg0.anInt1963;
			@Pc(47) int local47 = arg0.anInt1929 * 64 + arg0.anInt1947 * 128;
			@Pc(57) int local57 = arg0.anInt1929 * 64 + arg0.anInt1939 * 128;
			@Pc(67) int local67 = arg0.anInt1929 * 64 + arg0.anInt1952 * 128;
			@Pc(72) int local72 = Static10.anInt2951 - arg0.anInt1963;
			@Pc(82) int local82 = arg0.anInt1929 * 64 + arg0.anInt1941 * 128;
			arg0.anInt1948 = (local72 * local82 + (local37 - local72) * local47) / local37;
			arg0.anInt1958 = (local57 * (local37 - local72) + local67 * local72) / local37;
		}
		if (arg0.anInt1957 == 0) {
			arg0.anInt1962 = 1024;
		}
		if (arg0.anInt1957 == 1) {
			arg0.anInt1962 = 1536;
		}
		arg0.anInt1946 = 0;
		if (arg0.anInt1957 == 2) {
			arg0.anInt1962 = 0;
		}
		if (arg0.anInt1957 == 3) {
			arg0.anInt1962 = 512;
		}
		arg0.anInt1965 = arg0.anInt1962;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public static void method1294() {
		if (Static13.aClass7_3 != null) {
			Static13.aClass7_3.method157();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!be;)V")
	public static void method1295(@OriginalArg(1) Class2_Sub4 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static81.aClass70_5 != null) {
			@Pc(12) int local12;
			try {
				local12 = 0;
				Static81.aClass70_5.method1607(0L);
				Static81.aClass70_5.method1616(local8);
				while (local12 < 24 && local8[local12] == 0) {
					local12++;
				}
				if (local12 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local12 = 0; local12 < 24; local12++) {
					local8[local12] = -1;
				}
			}
		}
		arg0.method936(24, local8);
	}
}
