import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
	public static int[] anIntArray224 = new int[2048];

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	public static int anInt1951 = 0;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Lclient!ae;")
	public static Class5 aClass5_899 = Static56.method972("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
	public static int anInt1954 = 0;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	public static int anInt1956 = 0;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	public static int anInt1959 = -1;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
	public static int anInt1961 = 0;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "Lclient!ae;")
	public static Class5 aClass5_900 = Static56.method972("::qa_op_test");

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
	public static int anInt1964 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ[BZ)V")
	public static void method1270(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		if (Static93.aClass25_1 == null) {
			return;
		}
		if (Static42.anInt1188 >= 0) {
			Static93.aClass25_1.method1151();
			Static42.anInt1188 = -1;
			Static109.anInt2872 = 0;
			Static44.aByteArray8 = null;
			anInt1964 = 20;
		}
		if (arg2 == null) {
			return;
		}
		if (anInt1964 > 0) {
			Static93.aClass25_1.method1156(arg0);
			anInt1964 = 0;
		}
		Static42.anInt1188 = arg0;
		Static93.aClass25_1.method1154(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1271() {
		Static45.method853(Static63.anInt2924);
		if (Static27.anInt824 != -1) {
			Static45.method853(Static27.anInt824);
		}
		Static74.anInt1893 = 0;
		Static51.aClass2_19.method1318();
		Static65.anIntArray273 = Static25.method507(Static65.anIntArray273);
		Static66.method1850();
		Static82.method1302(503, 765, Static63.anInt2924, 0);
		if (Static27.anInt824 != -1) {
			Static82.method1302(503, 765, Static27.anInt824, 0);
		}
		if (Static103.aBoolean142) {
			Static1.method5();
		} else {
			Static4.method169();
			Static47.method868();
		}
		try {
			@Pc(61) Graphics local61 = Static62.aCanvas1.getGraphics();
			Static51.aClass2_19.method1322(local61, 0, 0);
		} catch (@Pc(69) Exception local69) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V")
	public static void method1272() {
		aClass5_899 = null;
		anIntArray224 = null;
		anIntArrayArrayArray4 = null;
		aClass5_900 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bf;II)Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 method1273(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1) {
		return Static38.method713(arg0, arg1) ? Static99.method1663() : null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!bf;)I")
	public static int method1274(@OriginalArg(1) Class11 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1869(Static46.aClass5_606, Static89.aClass5_1036)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static70.aClass5_839)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static51.aClass5_1096)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static99.aClass5_1128)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static46.aClass5_611)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static9.aClass5_164)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static100.aClass5_1140)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static111.aClass5_1310)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static22.aClass5_311)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static62.aClass5_788)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static88.aClass5_1018)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static112.aClass5_1328)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static45.aClass5_605)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static70.aClass5_848)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static100.aClass5_1134)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static2.aClass5_83)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static90.aClass5_1059)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static95.aClass5_1121)) {
			local5++;
		}
		if (arg0.method1869(Static46.aClass5_606, Static115.aClass5_1353)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method1275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub15 local7 = Static72.method1211(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local7.method1529(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	public static void method1276(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub13 local12 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray379.length; local21++) {
				local12.anIntArray379[local21] = -1;
				local12.anIntArray378[local21] = 0;
			}
		}
	}
}
