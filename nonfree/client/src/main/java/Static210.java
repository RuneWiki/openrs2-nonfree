import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public static int anInt4510 = 0;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[[[Lclient!cf;")
	public static final Class20[][][] aClass20ArrayArrayArray1 = new Class20[4][104][104];

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2066 = Static187.method3089(")1");

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2067 = Static187.method3089("gleiten:");

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2068 = Static187.method3089("title)3jpg");

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
	public static int anInt4516 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIILclient!e;IJ)Z")
	public static boolean method3416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static110.method1656(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIII)I")
	public static int method3418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * local13 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg0 + local13 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ba;Lclient!vd;)Lclient!vd;")
	public static Class92 method3419(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class92 arg1) {
		if (arg1.method3234(Static41.aClass92_425) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.method3234(Static109.aClass92_1057);
			if (local21 == -1) {
				while (true) {
					local21 = arg1.method3234(Static26.aClass92_263);
					if (local21 == -1) {
						while (true) {
							local21 = arg1.method3234(Static160.aClass92_1622);
							if (local21 == -1) {
								while (true) {
									local21 = arg1.method3234(Static166.aClass92_1674);
									if (local21 == -1) {
										while (true) {
											local21 = arg1.method3234(Static31.aClass92_335);
											if (local21 == -1) {
												while (true) {
													local21 = arg1.method3234(Static124.aClass92_1219);
													if (local21 == -1) {
														return arg1;
													}
													@Pc(246) Class92 local246 = Static26.aClass92_268;
													if (Static117.aClass65_7 != null) {
														local246 = Static102.method1550(Static117.aClass65_7.anInt2680);
														try {
															if (Static117.aClass65_7.anObject3 != null) {
																@Pc(262) byte[] local262 = ((String) Static117.aClass65_7.anObject3).getBytes("ISO-8859-1");
																local246 = Static66.method1032(local262, local262.length, 0);
															}
														} catch (@Pc(271) UnsupportedEncodingException local271) {
														}
													}
													arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), local246, arg1.method3232(local21 + 4) });
												}
											}
											arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), Static164.method2560(Static142.method2098(4, arg0)), arg1.method3232(local21 + 2) });
										}
									}
									arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), Static164.method2560(Static142.method2098(3, arg0)), arg1.method3232(local21 + 2) });
								}
							}
							arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), Static164.method2560(Static142.method2098(2, arg0)), arg1.method3232(local21 + 2) });
						}
					}
					arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), Static164.method2560(Static142.method2098(1, arg0)), arg1.method3232(local21 + 2) });
				}
			}
			arg1 = Static208.method787(new Class92[] { arg1.method3208(local21, 0), Static164.method2560(Static142.method2098(0, arg0)), arg1.method3232(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
	public static boolean method3420(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BD)V")
	public static void method3421(@OriginalArg(1) double arg0) {
		if (arg0 == Static23.aDouble1) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static42.anIntArray85[local15] = local27 <= 255 ? local27 : 255;
		}
		Static23.aDouble1 = arg0;
	}
}
