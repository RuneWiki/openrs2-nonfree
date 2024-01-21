import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!kf;")
	public static Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!ff;")
	public static Class11 aClass11_41;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!ff;")
	public static Class11 aClass11_42;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1112 = Static2.method59("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1107 = aClass80_1112;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1108 = Static2.method59("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt2928 = 99;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1109 = Static2.method59("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1110 = aClass80_1109;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1113 = Static2.method59(" more options");

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1111 = aClass80_1113;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!t;")
	public static Class2_Sub17_Sub1 aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method1856() {
		aClass80_1108 = null;
		anIntArray381 = null;
		aClass80_1111 = null;
		aClass2_Sub7_1 = null;
		aClass80_1109 = null;
		aClass80_1112 = null;
		aClass11_42 = null;
		aClass2_Sub17_Sub1_2 = null;
		aClass80_1110 = null;
		aClass80_1113 = null;
		aClass80_1107 = null;
		aClass11_41 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1857() {
		try {
			@Pc(14) Graphics local14 = Static119.aCanvas2.getGraphics();
			Static100.aClass22_18.method1065(local14, 4, 550);
		} catch (@Pc(22) Exception local22) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILclient!cb;)V")
	public static void method1858(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class10 arg1) {
		if (Static51.aClass10_3 != null) {
			try {
				Static51.aClass10_3.method255();
			} catch (@Pc(8) Exception local8) {
			}
			Static51.aClass10_3 = null;
		}
		Static51.aClass10_3 = arg1;
		Static29.method567(arg0);
		Static119.aClass2_Sub17_3.anInt2799 = 0;
		Static71.aClass2_Sub1_Sub15_1 = null;
		Static83.aClass2_Sub17_5 = null;
		Static20.anInt908 = 0;
		while (true) {
			@Pc(38) Class2_Sub1_Sub15 local38 = (Class2_Sub1_Sub15) Static108.aClass41_13.method1061();
			if (local38 == null) {
				while (true) {
					local38 = (Class2_Sub1_Sub15) Static21.aClass41_2.method1061();
					if (local38 == null) {
						if (Static92.aByte4 != 0) {
							try {
								@Pc(90) Class2_Sub17 local90 = new Class2_Sub17(4);
								local90.method1769(4);
								local90.method1769(Static92.aByte4);
								local90.method1757(0);
								Static51.aClass10_3.method256(local90.aByteArray38, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									Static51.aClass10_3.method255();
								} catch (@Pc(116) Exception local116) {
								}
								Static111.anInt2999++;
								Static51.aClass10_3 = null;
							}
						}
						Static104.anInt2705 = 0;
						Static95.aLong75 = Static49.method877();
						return;
					}
					Static111.aClass70_32.method1850(local38);
					Static45.aClass41_10.method1063(local38, local38.aLong91);
					Static57.anInt1735++;
					Static81.anInt2041--;
				}
			}
			Static40.aClass41_4.method1063(local38, local38.aLong91);
			Static55.anInt1309++;
			Static31.anInt1083--;
		}
	}
}
