import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
	public static int anInt1362 = 0;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "Lclient!je;")
	public static Class40 aClass40_692 = Static69.method1231("mapedge");

	@OriginalMember(owner = "client!ja", name = "ub", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[112];

	@OriginalMember(owner = "client!ja", name = "zb", descriptor = "Lclient!je;")
	public static Class40 aClass40_693 = Static69.method1231("<col=ffff00>");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)V")
	public static void method920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static57.aClass2_Sub9_Sub1_2.method673(68);
		Static57.aClass2_Sub9_Sub1_2.method629(arg0);
		Static57.aClass2_Sub9_Sub1_2.method646(arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method921() {
		aClass40_693 = null;
		aClass40_692 = null;
		aBooleanArray14 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!kc;Lclient!je;I)Lclient!je;")
	public static Class40 method922(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) Class40 arg1) {
		if (arg1.method977(Static79.aClass40_1042) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(23) int local23 = arg1.method977(Static115.aClass40_1443);
			if (local23 == -1) {
				while (true) {
					local23 = arg1.method977(Static80.aClass40_1057);
					if (local23 == -1) {
						while (true) {
							local23 = arg1.method977(Static100.aClass40_1319);
							if (local23 == -1) {
								while (true) {
									local23 = arg1.method977(Static57.aClass40_738);
									if (local23 == -1) {
										while (true) {
											local23 = arg1.method977(Static8.aClass40_179);
											if (local23 == -1) {
												while (true) {
													local23 = arg1.method977(Static97.aClass40_1280);
													if (local23 == -1) {
														return arg1;
													}
													@Pc(238) Class40 local238 = Static43.aClass40_568;
													if (Static12.aClass26_69 != null) {
														local238 = Static72.method1227(Static12.aClass26_69.anInt832);
														try {
															if (Static12.aClass26_69.anObject2 != null) {
																@Pc(254) byte[] local254 = ((String) Static12.aClass26_69.anObject2).getBytes("ISO-8859-1");
																local238 = Static74.method651(local254.length, local254, 0);
															}
														} catch (@Pc(263) UnsupportedEncodingException local263) {
														}
													}
													arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), local238, arg1.method968(local23 + 4) });
												}
											}
											arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), Static55.method979(Static114.method1896(4, arg0)), arg1.method968(local23 + 2) });
										}
									}
									arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), Static55.method979(Static114.method1896(3, arg0)), arg1.method968(local23 + 2) });
								}
							}
							arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), Static55.method979(Static114.method1896(2, arg0)), arg1.method968(local23 + 2) });
						}
					}
					arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), Static55.method979(Static114.method1896(1, arg0)), arg1.method968(local23 + 2) });
				}
			}
			arg1 = Static40.method722(new Class40[] { arg1.method953(0, local23), Static55.method979(Static114.method1896(0, arg0)), arg1.method968(local23 + 2) });
		}
	}
}
