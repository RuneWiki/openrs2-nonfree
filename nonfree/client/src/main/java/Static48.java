import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array17;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_630 = Static14.method2017(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!kc;")
	private static Class36 aClass36_640 = Static14.method2017("Off");

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_631 = aClass36_640;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt1262 = 0;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray20 = new byte[1000][];

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!kc;")
	private static Class36 aClass36_636 = Static14.method2017("Loading fonts )2 ");

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_632 = aClass36_636;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_633 = Static14.method2017("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt1265 = 0;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!kc;")
	private static Class36 aClass36_635 = Static14.method2017("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_634 = aClass36_635;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_637 = aClass36_635;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public static int anInt1267 = 0;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!kc;")
	private static Class36 aClass36_639 = Static14.method2017("Connecting to friendserver");

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_638 = aClass36_639;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_641 = Static14.method2017("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method918() {
		aClass36_632 = null;
		aClass36_631 = null;
		aClass36_635 = null;
		aClass36_633 = null;
		aClass36_634 = null;
		aClass36_640 = null;
		aByteArrayArray20 = null;
		aClass36_630 = null;
		aClass36_641 = null;
		aClass36_638 = null;
		aClass36_639 = null;
		aClass36_636 = null;
		aClass36_637 = null;
		aClass2_Sub1_Sub1_Sub3Array17 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
	public static boolean method919(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!kc;Lclient!ed;)Lclient!kc;")
	public static Class36 method920(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class2_Sub1_Sub6 arg1) {
		if (arg0.method1009(Static34.aClass36_481) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method1009(Static10.aClass36_148);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method1009(Static104.aClass36_1314);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method1009(Static67.aClass36_826);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method1009(Static7.aClass36_109);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method1009(Static92.aClass36_1152);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method1009(Static99.aClass36_952);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(237) Class36 local237 = Static105.aClass36_1352;
													if (Static58.aClass34_4 != null) {
														local237 = Static73.method1294(Static58.aClass34_4.anInt1270);
														try {
															if (Static58.aClass34_4.anObject2 != null) {
																@Pc(253) byte[] local253 = ((String) Static58.aClass34_4.anObject2).getBytes("ISO-8859-1");
																local237 = Static36.method737(0, local253, local253.length);
															}
														} catch (@Pc(262) UnsupportedEncodingException local262) {
														}
													}
													arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), local237, arg0.method1020(local12 + 4) });
												}
											}
											arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), Static63.method1120(Static74.method1421(arg1, 4)), arg0.method1020(local12 + 2) });
										}
									}
									arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), Static63.method1120(Static74.method1421(arg1, 3)), arg0.method1020(local12 + 2) });
								}
							}
							arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), Static63.method1120(Static74.method1421(arg1, 2)), arg0.method1020(local12 + 2) });
						}
					}
					arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), Static63.method1120(Static74.method1421(arg1, 1)), arg0.method1020(local12 + 2) });
				}
			}
			arg0 = Static49.method949(new Class36[] { arg0.method1018(0, local12), Static63.method1120(Static74.method1421(arg1, 0)), arg0.method1020(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method921() {
		while (true) {
			@Pc(13) Class8 local13 = Static45.aClass8_3;
			@Pc(20) Class2_Sub5 local20;
			synchronized (Static45.aClass8_3) {
				local20 = (Class2_Sub5) Static106.aClass8_9.method189();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass3_Sub1_5.method952(local20.aByteArray8, (int) local20.aLong89, false, local20.aClass10_1);
		}
	}
}
