import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!ic;")
	public static Class5_Sub2_Sub8_Sub1_Sub1 aClass5_Sub2_Sub8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public static int anInt2188;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_812 = Static161.method2452("p11_full");

	@OriginalMember(owner = "client!l", name = "d", descriptor = "[Lclient!dj;")
	public static final Class23_Sub1[] aClass23_Sub1Array1 = new Class23_Sub1[256];

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_813 = Static161.method2452("::tele 0)1");

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static final int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
	public static final int[] anIntArray235 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_814 = Static161.method2452("mod_icons");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass86_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[[I)V")
	public static void method1714(@OriginalArg(1) int[][] arg0) {
		Static9.anIntArrayArray1 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!re;I)V")
	public static void method1716(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class1_Sub2 arg2, @OriginalArg(6) int arg3) {
		Static145.method2239(arg0, arg3, arg2.anInt2241, arg1, arg2.anInt2234);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!mf;Lclient!dc;)Lclient!dc;")
	public static Class20 method1717(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class20 arg1) {
		if (arg1.method584(Static41.aClass20_304) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(24) int local24 = arg1.method584(Static53.aClass20_376);
			if (local24 == -1) {
				while (true) {
					local24 = arg1.method584(Static145.aClass20_1135);
					if (local24 == -1) {
						while (true) {
							local24 = arg1.method584(Static35.aClass20_261);
							if (local24 == -1) {
								while (true) {
									local24 = arg1.method584(Static99.aClass20_791);
									if (local24 == -1) {
										while (true) {
											local24 = arg1.method584(Static96.aClass20_750);
											if (local24 == -1) {
												while (true) {
													local24 = arg1.method584(Static140.aClass20_1103);
													if (local24 == -1) {
														return arg1;
													}
													@Pc(245) Class20 local245 = Static215.aClass20_1545;
													if (Static111.aClass65_6 != null) {
														local245 = Static150.method2299(Static111.aClass65_6.anInt2447);
														try {
															if (Static111.aClass65_6.anObject3 != null) {
																@Pc(263) byte[] local263 = ((String) Static111.aClass65_6.anObject3).getBytes("ISO-8859-1");
																local245 = Static92.method1513(local263, local263.length, 0);
															}
														} catch (@Pc(272) UnsupportedEncodingException local272) {
														}
													}
													arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), local245, arg1.method549(local24 + 4) });
												}
											}
											arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), Static72.method1180(Static11.method226(4, arg0)), arg1.method549(local24 + 2) });
										}
									}
									arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), Static72.method1180(Static11.method226(3, arg0)), arg1.method549(local24 + 2) });
								}
							}
							arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), Static72.method1180(Static11.method226(2, arg0)), arg1.method549(local24 + 2) });
						}
					}
					arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), Static72.method1180(Static11.method226(1, arg0)), arg1.method549(local24 + 2) });
				}
			}
			arg1 = Static70.method1166(new Class20[] { arg1.method559(local24, 0), Static72.method1180(Static11.method226(0, arg0)), arg1.method549(local24 + 2) });
		}
	}
}
