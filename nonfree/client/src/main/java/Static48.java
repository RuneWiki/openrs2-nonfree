import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!id", name = "M", descriptor = "[I")
	public static int[] anIntArray380;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "I")
	public static int anInt2585;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_18;

	@OriginalMember(owner = "client!id", name = "Rb", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1634 = Static69.method1153("Texturen geladen)3");

	@OriginalMember(owner = "client!id", name = "F", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!id", name = "Ib", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1639 = Static69.method1153("Loading config )2 ");

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1635 = aClass64_1639;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1636 = Static69.method1153("Stufe)2");

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1637 = null;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
	public static int anInt2593 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1638 = Static69.method1153("p11_full");

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
	public static int anInt2603 = 0;

	@OriginalMember(owner = "client!id", name = "Kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1640 = Static69.method1153(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!id", name = "Lb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1641 = Static69.method1153("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ib;")
	public static RuntimeException_Sub1 method1823(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BZLclient!ff;)V")
	public static void method1849(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class27 arg1) {
		if (Static53.aClass27_3 != null) {
			try {
				Static53.aClass27_3.method562();
			} catch (@Pc(17) Exception local17) {
			}
			Static53.aClass27_3 = null;
		}
		Static53.aClass27_3 = arg1;
		Static69.method1140(arg0);
		Static55.anInt2826 = 0;
		Static117.aClass1_Sub6_5.anInt2574 = 0;
		Static105.aClass1_Sub6_4 = null;
		Static83.aClass1_Sub1_Sub16_1 = null;
		while (true) {
			@Pc(38) Class1_Sub1_Sub16 local38 = (Class1_Sub1_Sub16) Static93.aClass58_6.method1373();
			if (local38 == null) {
				while (true) {
					local38 = (Class1_Sub1_Sub16) Static89.aClass58_5.method1373();
					if (local38 == null) {
						if (Static98.aByte3 != 0) {
							try {
								@Pc(93) Class1_Sub6 local93 = new Class1_Sub6(4);
								local93.method1853(4);
								local93.method1853(Static98.aByte3);
								local93.method1839(0);
								Static53.aClass27_3.method560(4, local93.aByteArray27);
							} catch (@Pc(114) IOException local114) {
								try {
									Static53.aClass27_3.method562();
								} catch (@Pc(119) Exception local119) {
								}
								Static53.aClass27_3 = null;
								Static11.anInt427++;
							}
						}
						Static53.anInt1231 = 0;
						Static38.aLong31 = Static80.method1369();
						return;
					}
					Static52.aClass10_33.method267(local38);
					Static58.aClass58_3.method1378(local38.aLong87, local38);
					Static75.anInt1766++;
					Static98.anInt2200--;
				}
			}
			Static110.aClass58_7.method1378(local38.aLong87, local38);
			Static39.anInt915--;
			Static121.anInt2873++;
		}
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
	public static void method1856() {
		aClass64_1635 = null;
		anIntArray380 = null;
		anIntArray381 = null;
		aClass64_1637 = null;
		aClass64_1634 = null;
		aClass64_1641 = null;
		aClass64_1636 = null;
		aClass64_1640 = null;
		aClass1_Sub1_Sub5_Sub3_18 = null;
		aClass64_1639 = null;
		aClass64_1638 = null;
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(B)V")
	public static void method1859() {
		try {
			@Pc(2) Graphics local2 = Static93.aCanvas1.getGraphics();
			Static62.aClass37_22.method1457(0, 4, local2);
			Static71.aClass37_25.method1457(0, 357, local2);
			Static66.aClass37_24.method1457(722, 4, local2);
			Static74.aClass37_26.method1457(743, 205, local2);
			Static41.aClass37_37.method1457(0, 0, local2);
			Static23.aClass37_11.method1457(516, 4, local2);
			Static15.aClass37_5.method1457(516, 205, local2);
			Static45.aClass37_14.method1457(496, 357, local2);
			Static17.aClass37_6.method1457(0, 338, local2);
		} catch (@Pc(62) Exception local62) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(BI)Lclient!rd;")
	public static Class64 method1862(@OriginalArg(1) int arg0) {
		return Static82.method1383(new Class64[] { Static12.method1395(arg0 >> 24 & 0xFF), Static62.aClass64_909, Static12.method1395(arg0 >> 16 & 0xFF), Static62.aClass64_909, Static12.method1395(arg0 >> 8 & 0xFF), Static62.aClass64_909, Static12.method1395(arg0 & 0xFF) });
	}
}
