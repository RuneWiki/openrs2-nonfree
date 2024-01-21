import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "Lclient!pb;")
	public static Class71 aClass71_6;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "Lclient!nb;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "[I")
	public static final int[] anIntArray58 = new int[128];

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "Lclient!eg;")
	public static final Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!ci", name = "E", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_184 = Static151.method2243("Your account has been disabled)3");

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_185 = Static151.method2243("cookiehost");

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_186 = Static151.method2243("null");

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "Lclient!mb;")
	public static Class62 aClass62_187 = aClass62_184;

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_188 = Static151.method2243("Wordpack geladen)3");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ii;ILclient!mb;)Lclient!mb;")
	public static Class62 method464(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Class62 arg1) {
		if (arg1.method1869(Static31.aClass62_231) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(20) int local20 = arg1.method1869(Static60.aClass62_416);
			if (local20 == -1) {
				while (true) {
					local20 = arg1.method1869(Static202.aClass62_1452);
					if (local20 == -1) {
						while (true) {
							local20 = arg1.method1869(Static47.aClass62_325);
							if (local20 == -1) {
								while (true) {
									local20 = arg1.method1869(Static136.aClass62_1535);
									if (local20 == -1) {
										while (true) {
											local20 = arg1.method1869(Static142.aClass62_1057);
											if (local20 == -1) {
												while (true) {
													local20 = arg1.method1869(Static2.aClass62_31);
													if (local20 == -1) {
														return arg1;
													}
													@Pc(245) Class62 local245 = Static69.aClass62_484;
													if (Static69.aClass56_6 != null) {
														local245 = Static211.method3087(Static69.aClass56_6.anInt2419);
														try {
															if (Static69.aClass56_6.anObject2 != null) {
																@Pc(261) byte[] local261 = ((String) Static69.aClass56_6.anObject2).getBytes("ISO-8859-1");
																local245 = Static146.method2188(0, local261.length, local261);
															}
														} catch (@Pc(270) UnsupportedEncodingException local270) {
														}
													}
													arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), local245, arg1.method1849(local20 + 4) });
												}
											}
											arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), Static138.method2056(Static3.method95(4, arg0)), arg1.method1849(local20 + 2) });
										}
									}
									arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), Static138.method2056(Static3.method95(3, arg0)), arg1.method1849(local20 + 2) });
								}
							}
							arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), Static138.method2056(Static3.method95(2, arg0)), arg1.method1849(local20 + 2) });
						}
					}
					arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), Static138.method2056(Static3.method95(1, arg0)), arg1.method1849(local20 + 2) });
				}
			}
			arg1 = Static169.method2460(new Class62[] { arg1.method1862(0, local20), Static138.method2056(Static3.method95(0, arg0)), arg1.method1849(local20 + 2) });
		}
	}
}
