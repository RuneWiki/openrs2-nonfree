import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt2855;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1838 = Static69.method1153("@or1@");

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1839 = Static69.method1153("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array19 = new Class64[100];

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1843 = Static69.method1153("Hide");

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1840 = aClass64_1843;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1841 = aClass64_1839;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1842 = Static69.method1153("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1844 = Static69.method1153("Passwort: ");

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public static int anInt2867 = 1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2094() {
		aClass64_1838 = null;
		aClass64Array19 = null;
		aClass64_1839 = null;
		aClass64_1841 = null;
		aClass64_1842 = null;
		aClass64_1840 = null;
		aClass64_1844 = null;
		aClass64_1843 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method2096() {
		for (@Pc(3) int local3 = 0; local3 < Static64.anInt1488; local3++) {
			@Pc(14) int local14 = Static13.anIntArray65[local3];
			@Pc(18) Class1_Sub1_Sub2_Sub1_Sub1 local18 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local14];
			if (local18 != null) {
				Static86.method1417(local18.aClass1_Sub1_Sub15_1.anInt2313, local18);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!rd;ILclient!nd;)Lclient!rd;")
	public static Class64 method2099(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Class1_Sub1_Sub11 arg1) {
		if (arg0.method1473(Static102.aClass64_1476) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method1473(Static104.aClass64_1539);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method1473(Static117.aClass64_1802);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method1473(Static10.aClass64_278);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method1473(Static23.aClass64_425);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method1473(Static105.aClass64_1575);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method1473(Static53.aClass64_776);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(228) Class64 local228 = Static60.aClass64_862;
													if (Static37.aClass48_5 != null) {
														local228 = Static48.method1862(Static37.aClass48_5.anInt1533);
														try {
															if (Static37.aClass48_5.anObject5 != null) {
																@Pc(244) byte[] local244 = ((String) Static37.aClass48_5.anObject5).getBytes("ISO-8859-1");
																local228 = Static22.method428(local244, local244.length, 0);
															}
														} catch (@Pc(253) UnsupportedEncodingException local253) {
														}
													}
													arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), local228, arg0.method1481(local12 + 4) });
												}
											}
											arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), Static10.method249(Static44.method803(arg1, 4)), arg0.method1481(local12 + 2) });
										}
									}
									arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), Static10.method249(Static44.method803(arg1, 3)), arg0.method1481(local12 + 2) });
								}
							}
							arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), Static10.method249(Static44.method803(arg1, 2)), arg0.method1481(local12 + 2) });
						}
					}
					arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), Static10.method249(Static44.method803(arg1, 1)), arg0.method1481(local12 + 2) });
				}
			}
			arg0 = Static82.method1383(new Class64[] { arg0.method1475(local12, 0), Static10.method249(Static44.method803(arg1, 0)), arg0.method1481(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZII)Z")
	public static boolean method2100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (!Static1.method35(arg3)) {
			return false;
		}
		Static12.aClass1_Sub1_Sub11Array3 = null;
		@Pc(25) boolean local25 = Static82.method1377(Static65.aClass1_Sub1_Sub11ArrayArray1[arg3], 0, arg0, -1, arg2, 0, arg1, 0, 0);
		if (Static12.aClass1_Sub1_Sub11Array3 != null) {
			Static82.method1377(Static12.aClass1_Sub1_Sub11Array3, Static60.anInt1351, arg0, -1412584499, arg2, 0, arg1, 0, Static6.anInt316);
		}
		return local25;
	}
}
