import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	public static int anInt1671;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_878 = Static23.method501("huffman");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_879 = Static23.method501("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt1652 = 0;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public static int anInt1657 = 0;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!mc;")
	private static Class42 aClass42_880 = Static23.method501("Welcome to RuneScape");

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!mc;")
	private static Class42 aClass42_884 = Static23.method501("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_881 = aClass42_884;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_882 = Static23.method501("Freunde");

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public static int anInt1666 = 0;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_883 = aClass42_880;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public static int anInt1670 = 0;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
	public static int[] anIntArray240 = new int[2048];

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1166() {
		Static75.aBoolean85 = false;
		Static22.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLclient!mc;Lclient!ja;Lclient!mc;)[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] method1167(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(9) int local9 = arg1.method1302(arg2);
		@Pc(19) int local19 = arg1.method1320(arg0, local9);
		return Static37.method628(local19, arg1, local9);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
	public static void method1168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static10.anIntArrayArrayArray1[arg0][arg2 + local7][local11 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static10.anIntArrayArrayArray1[arg0][arg2][local11 + arg1] = Static10.anIntArrayArrayArray1[arg0][arg2 - 1][local11 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static10.anIntArrayArrayArray1[arg0][local11 + arg2][arg1] = Static10.anIntArrayArrayArray1[arg0][local11 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static10.anIntArrayArrayArray1[arg0][arg2 - 1][arg1] != 0) {
			Static10.anIntArrayArrayArray1[arg0][arg2][arg1] = Static10.anIntArrayArrayArray1[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static10.anIntArrayArrayArray1[arg0][arg2][arg1 - 1] != 0) {
			Static10.anIntArrayArrayArray1[arg0][arg2][arg1] = Static10.anIntArrayArrayArray1[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static10.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static10.anIntArrayArrayArray1[arg0][arg2][arg1] = Static10.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method1169() {
		if (!Static91.aBoolean135) {
			return;
		}
		Static20.aClass1_Sub1_Sub1_Sub4_8 = null;
		Static58.anIntArray217 = null;
		Static82.aClass1_Sub1_Sub1_Sub4_21 = null;
		Static67.aClass1_Sub1_Sub1_Sub4_17 = null;
		Static92.aClass1_Sub1_Sub1_Sub4_24 = null;
		Static45.anIntArray257 = null;
		Static79.aClass1_Sub1_Sub1_Sub4_20 = null;
		Static51.anIntArray205 = null;
		Static91.aClass1_Sub1_Sub1_Sub4_23 = null;
		Static84.aClass31_30 = null;
		Static7.aClass1_Sub1_Sub1_Sub4_1 = null;
		Static24.anIntArray70 = null;
		Static31.aClass31_31 = null;
		Static82.anIntArray335 = null;
		Static74.aClass31_27 = null;
		Static87.aClass31_33 = null;
		Static28.aClass31_14 = null;
		Static109.aClass31_39 = null;
		Static99.aClass31_36 = null;
		Static62.aClass1_Sub1_Sub1_Sub4_15 = null;
		Static91.aBoolean135 = false;
		Static29.aClass1_Sub1_Sub1_Sub4_9 = null;
		Static45.aClass31_26 = null;
		Static87.aClass31_34 = null;
		Static77.aClass1_Sub1_Sub1_Sub4_18 = null;
		Static3.aClass31_1 = null;
		Static11.aClass1_Sub1_Sub1_Sub4_4 = null;
		Static33.aClass31_16 = null;
		Static47.aClass31_35 = null;
		Static109.anIntArray407 = null;
		Static43.anIntArray165 = null;
		Static72.aClass1_Sub1_Sub1_Sub4_19 = null;
		Static29.aClass31_15 = null;
		Static108.aClass31_37 = null;
		Static47.aClass1_Sub1_Sub1_Sub4_22 = null;
		Static38.aClass31_18 = null;
		Static16.aClass1_Sub1_Sub1_Sub4_7 = null;
		Static6.aClass31_2 = null;
		Static75.aClass1_Sub1_Sub1_Sub4_14 = null;
		Static51.aClass1_Sub1_Sub1_Sub4_13 = null;
		Static75.aClass1_Sub1_Sub1_Sub4Array4 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!cb;")
	public static Class1_Sub1_Sub3 method1170(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub3 local15 = (Class1_Sub1_Sub3) Static34.aClass37_13.method982((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static29.aClass33_10.method1305(arg0, 1);
		local15 = new Class1_Sub1_Sub3();
		if (local25 != null) {
			local15.method249(new Class1_Sub8(local25), arg0);
		}
		local15.method255();
		Static34.aClass37_13.method981((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method1171() {
		aClass42_878 = null;
		aClass42_884 = null;
		aClass42_881 = null;
		aClass42_882 = null;
		aClass42_883 = null;
		aClass42_880 = null;
		anIntArray240 = null;
		aClass42_879 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method1172(@OriginalArg(1) int arg0) {
		if (!Static15.method396()) {
			return;
		}
		if (Static1.aBoolean1) {
			Static19.anInt640 = arg0;
		} else {
			Static88.method1613(arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method1173() {
		Static93.anInt2456 = 0;
		Static63.anInt1520 = 0;
		Static59.method1427();
		Static79.method1443();
		Static61.method1025();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static93.anInt2456; local21++) {
			local27 = Static64.anIntArray224[local21];
			if (Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local27].anInt2559 != Static27.anInt768) {
				Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local27].aClass1_Sub1_Sub6_1 = null;
				Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local27] = null;
			}
		}
		if (Static20.anInt644 != Static80.aClass1_Sub8_Sub1_2.anInt1692) {
			throw new RuntimeException("gnp1 pos:" + Static80.aClass1_Sub8_Sub1_2.anInt1692 + " psize:" + Static20.anInt644);
		}
		for (local27 = 0; local27 < Static91.anInt2403; local27++) {
			if (Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static98.anIntArray375[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static91.anInt2403);
			}
		}
	}
}
