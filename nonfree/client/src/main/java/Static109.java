import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!pb;")
	public static Class31 aClass31_38;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!pb;")
	public static Class31 aClass31_39;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt2754 = 0;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1460 = Static23.method501("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1461 = Static23.method501("leuchten3:");

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[I")
	public static int[] anIntArray408 = new int[200];

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method1852() {
		aClass42_1461 = null;
		anIntArray408 = null;
		anIntArray407 = null;
		aClass42_1460 = null;
		aClass31_38 = null;
		anIntArray406 = null;
		aClass31_39 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!qc;Lclient!mc;)Lclient!mc;")
	public static Class42 method1853(@OriginalArg(1) Class1_Sub1_Sub12 arg0, @OriginalArg(2) Class42 arg1) {
		if (arg1.method1050(Static25.aClass42_392) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(12) int local12 = arg1.method1050(Static74.aClass42_983);
			if (local12 == -1) {
				while (true) {
					local12 = arg1.method1050(Static57.aClass42_1420);
					if (local12 == -1) {
						while (true) {
							local12 = arg1.method1050(Static45.aClass42_957);
							if (local12 == -1) {
								while (true) {
									local12 = arg1.method1050(Static50.aClass42_897);
									if (local12 == -1) {
										while (true) {
											local12 = arg1.method1050(Static107.aClass42_1424);
											if (local12 == -1) {
												while (true) {
													local12 = arg1.method1050(Static5.aClass42_97);
													if (local12 == -1) {
														return arg1;
													}
													@Pc(227) Class42 local227 = Static11.aClass42_195;
													if (Static84.aClass59_4 != null) {
														local227 = Static97.method1705(Static84.aClass59_4.anInt2520);
														try {
															if (Static84.aClass59_4.anObject3 != null) {
																@Pc(243) byte[] local243 = ((String) Static84.aClass59_4.anObject3).getBytes("ISO-8859-1");
																local227 = Static18.method425(0, local243, local243.length);
															}
														} catch (@Pc(252) UnsupportedEncodingException local252) {
														}
													}
													arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), local227, arg1.method1051(local12 + 4) });
												}
											}
											arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), Static28.method563(Static67.method1150(arg0, 4)), arg1.method1051(local12 + 2) });
										}
									}
									arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), Static28.method563(Static67.method1150(arg0, 3)), arg1.method1051(local12 + 2) });
								}
							}
							arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), Static28.method563(Static67.method1150(arg0, 2)), arg1.method1051(local12 + 2) });
						}
					}
					arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), Static28.method563(Static67.method1150(arg0, 1)), arg1.method1051(local12 + 2) });
				}
			}
			arg1 = Static57.method1822(new Class42[] { arg1.method1053(0, local12), Static28.method563(Static67.method1150(arg0, 0)), arg1.method1051(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1854(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
