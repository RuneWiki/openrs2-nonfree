import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!nm;")
	public static Class119 aClass119_45;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt2460 = 0;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public static int anInt2463 = 0;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void method2200() {
		Static210.aClass175_33.method4287();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/lang/String;Lclient!si;)Ljava/lang/String;")
	public static String method2201(@OriginalArg(1) String arg0, @OriginalArg(2) Class157 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(14) int local14 = arg0.indexOf("%1");
			if (local14 == -1) {
				while (true) {
					local14 = arg0.indexOf("%2");
					if (local14 == -1) {
						while (true) {
							local14 = arg0.indexOf("%3");
							if (local14 == -1) {
								while (true) {
									local14 = arg0.indexOf("%4");
									if (local14 == -1) {
										while (true) {
											local14 = arg0.indexOf("%5");
											if (local14 == -1) {
												while (true) {
													local14 = arg0.indexOf("%dns");
													if (local14 == -1) {
														return arg0;
													}
													@Pc(185) String local185 = "";
													if (Static21.aClass153_2 != null) {
														if (Static21.aClass153_2.anObject6 == null) {
															local185 = Static268.method4139(Static21.aClass153_2.anInt4613);
														} else {
															local185 = (String) Static21.aClass153_2.anObject6;
														}
													}
													arg0 = arg0.substring(0, local14) + local185 + arg0.substring(local14 + 4);
												}
											}
											arg0 = arg0.substring(0, local14) + Static206.method3441(Static202.method3425(arg1, 4)) + arg0.substring(local14 + 2);
										}
									}
									arg0 = arg0.substring(0, local14) + Static206.method3441(Static202.method3425(arg1, 3)) + arg0.substring(local14 + 2);
								}
							}
							arg0 = arg0.substring(0, local14) + Static206.method3441(Static202.method3425(arg1, 2)) + arg0.substring(local14 + 2);
						}
					}
					arg0 = arg0.substring(0, local14) + Static206.method3441(Static202.method3425(arg1, 1)) + arg0.substring(local14 + 2);
				}
			}
			arg0 = arg0.substring(0, local14) + Static206.method3441(Static202.method3425(arg1, 0)) + arg0.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method2202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static231.anInt4333 && Static218.anInt4086 >= arg3) {
			@Pc(28) int local28 = Static306.method4566(arg0, Static188.anInt3598, Static289.anInt5245);
			@Pc(34) int local34 = Static306.method4566(arg1, Static188.anInt3598, Static289.anInt5245);
			Static314.method4673(arg3, local34, local28, arg2);
		}
	}
}
