import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!w", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray55;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt5491 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public static void method4345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 + 1;
		Static126.method1523(Static22.anIntArrayArray3[arg0], arg2, arg3, arg4);
		@Pc(17) int local17 = arg1 - 1;
		Static126.method1523(Static22.anIntArrayArray3[arg1], arg2, arg3, arg4);
		for (@Pc(31) int local31 = local4; local31 <= local17; local31++) {
			@Pc(42) int[] local42 = Static22.anIntArrayArray3[local31];
			local42[arg4] = local42[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method4346() {
		Static281.anInterface1Array3 = null;
		Static27.method548();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!in;BLjava/lang/String;)Ljava/lang/String;")
	public static String method4348(@OriginalArg(0) Class71 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(15) int local15 = arg1.indexOf("%1");
			if (local15 == -1) {
				while (true) {
					local15 = arg1.indexOf("%2");
					if (local15 == -1) {
						while (true) {
							local15 = arg1.indexOf("%3");
							if (local15 == -1) {
								while (true) {
									local15 = arg1.indexOf("%4");
									if (local15 == -1) {
										while (true) {
											local15 = arg1.indexOf("%5");
											if (local15 == -1) {
												while (true) {
													local15 = arg1.indexOf("%dns");
													if (local15 == -1) {
														return arg1;
													}
													@Pc(189) String local189 = "";
													if (Static215.aClass116_4 != null) {
														if (Static215.aClass116_4.anObject5 == null) {
															local189 = Static279.method4240(Static215.aClass116_4.anInt3811);
														} else {
															local189 = (String) Static215.aClass116_4.anObject5;
														}
													}
													arg1 = arg1.substring(0, local15) + local189 + arg1.substring(local15 + 4);
												}
											}
											arg1 = arg1.substring(0, local15) + Static123.method2168(Static15.method301(4, arg0)) + arg1.substring(local15 + 2);
										}
									}
									arg1 = arg1.substring(0, local15) + Static123.method2168(Static15.method301(3, arg0)) + arg1.substring(local15 + 2);
								}
							}
							arg1 = arg1.substring(0, local15) + Static123.method2168(Static15.method301(2, arg0)) + arg1.substring(local15 + 2);
						}
					}
					arg1 = arg1.substring(0, local15) + Static123.method2168(Static15.method301(1, arg0)) + arg1.substring(local15 + 2);
				}
			}
			arg1 = arg1.substring(0, local15) + Static123.method2168(Static15.method301(0, arg0)) + arg1.substring(local15 + 2);
		}
	}
}
