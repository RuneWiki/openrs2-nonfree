import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Qb", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!a", name = "pc", descriptor = "Lclient!pb;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_53 = null;

	@OriginalMember(owner = "client!a", name = "lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_54 = Static15.method178("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!a", name = "Xb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_59 = Static15.method178("M");

	@OriginalMember(owner = "client!a", name = "nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_55 = aClass23_59;

	@OriginalMember(owner = "client!a", name = "zb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_57 = Static15.method178("wave:");

	@OriginalMember(owner = "client!a", name = "wb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_56 = aClass23_57;

	@OriginalMember(owner = "client!a", name = "Eb", descriptor = "I")
	public static int anInt68 = 1;

	@OriginalMember(owner = "client!a", name = "Lb", descriptor = "I")
	public static final int anInt74 = 20;

	@OriginalMember(owner = "client!a", name = "Ob", descriptor = "Lclient!ba;")
	public static Class5 aClass5_3 = new Class5(10);

	@OriginalMember(owner = "client!a", name = "Zb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_60 = Static15.method178("lila:");

	@OriginalMember(owner = "client!a", name = "ac", descriptor = "[I")
	public static int[] anIntArray10 = new int[1000];

	@OriginalMember(owner = "client!a", name = "bc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_61 = Static15.method178("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!a", name = "gc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_62 = Static15.method178("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!a", name = "lc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_63 = Static15.method178(" )2> @lre@");

	@OriginalMember(owner = "client!a", name = "oc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_64 = Static15.method178("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!rc;)Lclient!gd;")
	public static Class23 method29(@OriginalArg(2) Class1_Sub5 arg0) {
		try {
			@Pc(15) Class23 local15 = new Class23();
			local15.anInt965 = arg0.method721();
			if (local15.anInt965 > 32767) {
				local15.anInt965 = 32767;
			}
			local15.aByteArray4 = new byte[local15.anInt965];
			arg0.anInt1266 += Static60.aClass66_1.method1785(arg0.anInt1266, local15.aByteArray4, 0, local15.anInt965, arg0.aByteArray6);
			return local15;
		} catch (@Pc(56) Exception local56) {
			return Static107.aClass23_1594;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!gd;")
	public static Class23 method40(@OriginalArg(0) int arg0) {
		@Pc(9) Class23 local9 = Static19.method274(arg0);
		for (@Pc(15) int local15 = local9.method525() - 3; local15 > 0; local15 -= 3) {
			local9 = Static17.method233(new Class23[] { local9.method512(0, local15), Static71.aClass23_1184, local9.method510(local15) });
		}
		if (local9.method525() > 8) {
			local9 = Static17.method233(new Class23[] { Static55.aClass23_928, local9.method512(0, local9.method525() - 8), Static104.aClass23_1517, Static46.aClass23_851, local9, Static36.aClass23_637 });
		} else if (local9.method525() > 4) {
			local9 = Static17.method233(new Class23[] { Static96.aClass23_975, local9.method512(0, local9.method525() - 4), Static61.aClass23_1046, Static46.aClass23_851, local9, Static36.aClass23_637 });
		}
		return Static17.method233(new Class23[] { Static10.aClass23_172, local9 });
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method41() {
		aClass23_57 = null;
		aClass23_56 = null;
		aClass5_3 = null;
		aClass23_63 = null;
		aClass23_59 = null;
		aClass23_60 = null;
		aClass46_1 = null;
		aClass23_62 = null;
		aClass23_54 = null;
		aClass23_61 = null;
		aClass23_53 = null;
		anIntArray10 = null;
		anIntArray9 = null;
		aClass23_55 = null;
		aClass23_64 = null;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	public static void method42() {
		if (Static60.anInt1806 > 0) {
			Static32.method513();
		} else {
			Static89.method1524(40);
			Static32.aClass68_2 = Static94.aClass68_4;
			Static94.aClass68_4 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public static void method43() {
		for (@Pc(10) Class1_Sub1_Sub2_Sub4 local10 = (Class1_Sub1_Sub2_Sub4) Static20.aClass45_1.method1299(); local10 != null; local10 = (Class1_Sub1_Sub2_Sub4) Static20.aClass45_1.method1288()) {
			if (local10.anInt1586 != Static79.anInt2137 || local10.anInt1592 < Static7.anInt176) {
				local10.method1913();
			} else if (local10.anInt1590 <= Static7.anInt176) {
				if (local10.anInt1579 > 0) {
					@Pc(49) Class1_Sub1_Sub2_Sub1_Sub1 local49 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local10.anInt1579 - 1];
					if (local49 != null && local49.anInt2196 >= 0 && local49.anInt2196 < 13312 && local49.anInt2232 >= 0 && local49.anInt2232 < 13312) {
						local10.method978(local49.anInt2232, local49.anInt2196, Static7.anInt176, Static48.method987(local49.anInt2232, local49.anInt2196, local10.anInt1586) - local10.anInt1593);
					}
				}
				if (local10.anInt1579 < 0) {
					@Pc(101) int local101 = -local10.anInt1579 - 1;
					@Pc(112) Class1_Sub1_Sub2_Sub1_Sub2 local112;
					if (Static84.anInt2353 == local101) {
						local112 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1;
					} else {
						local112 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local101];
					}
					if (local112 != null && local112.anInt2196 >= 0 && local112.anInt2196 < 13312 && local112.anInt2232 >= 0 && local112.anInt2232 < 13312) {
						local10.method978(local112.anInt2232, local112.anInt2196, Static7.anInt176, Static48.method987(local112.anInt2232, local112.anInt2196, local10.anInt1586) - local10.anInt1593);
					}
				}
				local10.method975(Static70.anInt1829);
				Static19.aClass65_1.method1759(Static79.anInt2137, (int) local10.aDouble7, (int) local10.aDouble8, (int) local10.aDouble4, 60, local10, local10.anInt1584, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
	public static int method44(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub15 local12 = Static92.method1914(arg0);
		@Pc(15) int local15 = local12.anInt2683;
		@Pc(18) int local18 = local12.anInt2682;
		@Pc(24) int local24 = Class1_Sub1_Sub2.anIntArray272[local15 - local18];
		@Pc(27) int local27 = local12.anInt2680;
		return local24 & Static40.anIntArray164[local27] >> local18;
	}
}
