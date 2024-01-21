import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array11;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!ef;")
	public static Class16 aClass16_130;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
	public static int[] anIntArray344;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!ef;")
	public static Class16 aClass16_131;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!he;")
	private static Class26 aClass26_1541 = Static6.method100(" more options");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
	public static int[] anIntArray341 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public static final int anInt2863 = 7759444;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1542 = Static6.method100("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1543 = Static6.method100("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!he;")
	private static Class26 aClass26_1544 = Static6.method100("(U4");

	@OriginalMember(owner = "client!se", name = "y", descriptor = "Lclient!he;")
	public static Class26 aClass26_1545 = aClass26_1541;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_1546 = Static6.method100("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public static void method1960() {
		anIntArray344 = null;
		aClass26_1543 = null;
		aClass26_1546 = null;
		aClass26_1544 = null;
		anIntArray341 = null;
		anIntArray340 = null;
		aClass26_1545 = null;
		aClass26_1541 = null;
		aClass16_131 = null;
		aClass3_Sub1_Sub4_Sub3Array11 = null;
		anIntArray343 = null;
		aClass16_130 = null;
		aClass26_1542 = null;
		anIntArray342 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!he;Lclient!nc;Z)Lclient!he;")
	public static Class26 method1963(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class3_Sub14 arg1) {
		if (arg0.method817(Static99.aClass26_1488) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method817(Static44.aClass26_706);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method817(Static17.aClass26_256);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method817(Static105.aClass26_1534);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method817(aClass26_1544);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method817(Static118.aClass26_1671);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method817(Static25.aClass26_1717);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(230) Class26 local230 = Static22.aClass26_415;
													if (Static98.aClass22_4 != null) {
														local230 = Static130.method2255(Static98.aClass22_4.anInt1199);
														try {
															if (Static98.aClass22_4.anObject3 != null) {
																@Pc(246) byte[] local246 = ((String) Static98.aClass22_4.anObject3).getBytes("ISO-8859-1");
																local230 = Static101.method1896(local246.length, 0, local246);
															}
														} catch (@Pc(255) UnsupportedEncodingException local255) {
														}
													}
													arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), local230, arg0.method819(local12 + 4) });
												}
											}
											arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), Static94.method1702(Static81.method1418(4, arg1)), arg0.method819(local12 + 2) });
										}
									}
									arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), Static94.method1702(Static81.method1418(3, arg1)), arg0.method819(local12 + 2) });
								}
							}
							arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), Static94.method1702(Static81.method1418(2, arg1)), arg0.method819(local12 + 2) });
						}
					}
					arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), Static94.method1702(Static81.method1418(1, arg1)), arg0.method819(local12 + 2) });
				}
			}
			arg0 = Static119.method2136(new Class26[] { arg0.method843(0, local12), Static94.method1702(Static81.method1418(0, arg1)), arg0.method819(local12 + 2) });
		}
	}
}
