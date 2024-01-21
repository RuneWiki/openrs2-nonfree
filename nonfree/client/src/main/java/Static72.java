import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public static int anInt1735;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_598 = Static120.method2057("sl_stars");

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
	public static int[] anIntArray151 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_599 = Static120.method2057("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_600 = aClass81_599;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
	public static int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public static int anInt1734 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)I")
	public static int method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static2.aClass1_Sub2_Sub10_1 != null && Static2.aClass1_Sub2_Sub10_1.aLong148 == local11 ? Static44.aClass1_Sub8_1.anInt446 * 99 / (Static44.aClass1_Sub8_1.aByteArray3.length - Static2.aClass1_Sub2_Sub10_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	public static void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt1849 = arg3;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1259() {
		aClass81_600 = null;
		aClass81_598 = null;
		anIntArray151 = null;
		anIntArray152 = null;
		aClass81_599 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 method1260() {
		@Pc(5) Class1_Sub2_Sub2_Sub3 local5 = new Class1_Sub2_Sub2_Sub3();
		local5.anInt2740 = Static97.anInt2130;
		local5.anInt2741 = Static23.anInt582;
		local5.anInt2737 = Static73.anIntArray155[0];
		local5.anInt2739 = Static155.anIntArray369[0];
		local5.anInt2736 = Static161.anIntArray386[0];
		local5.anInt2738 = Static25.anIntArray37[0];
		@Pc(44) byte[] local44 = Static178.aByteArrayArray10[0];
		@Pc(50) int local50 = local5.anInt2737 * local5.anInt2736;
		local5.anIntArray288 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local5.anIntArray288[local56] = Static73.anIntArray156[local44[local56] & 0xFF];
		}
		Static176.method3057();
		return local5;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!tg;ILclient!rh;)Lclient!tg;")
	public static Class81 method1261(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class77 arg1) {
		if (arg0.method2803(Static141.aClass81_247) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(22) int local22 = arg0.method2803(Static107.aClass81_833);
			if (local22 == -1) {
				while (true) {
					local22 = arg0.method2803(Static20.aClass81_169);
					if (local22 == -1) {
						while (true) {
							local22 = arg0.method2803(Static163.aClass81_1320);
							if (local22 == -1) {
								while (true) {
									local22 = arg0.method2803(Static103.aClass81_794);
									if (local22 == -1) {
										while (true) {
											local22 = arg0.method2803(Static33.aClass81_310);
											if (local22 == -1) {
												while (true) {
													local22 = arg0.method2803(Static46.aClass81_406);
													if (local22 == -1) {
														return arg0;
													}
													@Pc(248) Class81 local248 = Static149.aClass81_1213;
													if (Static151.aClass47_7 != null) {
														local248 = Static38.method764(Static151.aClass47_7.anInt1951);
														try {
															if (Static151.aClass47_7.anObject1 != null) {
																@Pc(264) byte[] local264 = ((String) Static151.aClass47_7.anObject1).getBytes("ISO-8859-1");
																local248 = Static107.method1776(0, local264.length, local264);
															}
														} catch (@Pc(275) UnsupportedEncodingException local275) {
														}
													}
													arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), local248, arg0.method2801(local22 + 4) });
												}
											}
											arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), Static12.method3147(Static155.method2687(4, arg1)), arg0.method2801(local22 + 2) });
										}
									}
									arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), Static12.method3147(Static155.method2687(3, arg1)), arg0.method2801(local22 + 2) });
								}
							}
							arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), Static12.method3147(Static155.method2687(2, arg1)), arg0.method2801(local22 + 2) });
						}
					}
					arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), Static12.method3147(Static155.method2687(1, arg1)), arg0.method2801(local22 + 2) });
				}
			}
			arg0 = Static127.method2169(new Class81[] { arg0.method2823(0, local22), Static12.method3147(Static155.method2687(0, arg1)), arg0.method2801(local22 + 2) });
		}
	}
}
