import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!pf", name = "Sb", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!pf", name = "Xb", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!pf", name = "bc", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!og;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3131(@OriginalArg(1) Class127 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(16) int local16 = arg1.indexOf("%1");
			if (local16 == -1) {
				while (true) {
					local16 = arg1.indexOf("%2");
					if (local16 == -1) {
						while (true) {
							local16 = arg1.indexOf("%3");
							if (local16 == -1) {
								while (true) {
									local16 = arg1.indexOf("%4");
									if (local16 == -1) {
										while (true) {
											local16 = arg1.indexOf("%5");
											if (local16 == -1) {
												while (true) {
													local16 = arg1.indexOf("%dns");
													if (local16 == -1) {
														return arg1;
													}
													@Pc(188) String local188 = "";
													if (Static294.aClass118_8 != null) {
														if (Static294.aClass118_8.anObject3 == null) {
															local188 = Static143.method2252(Static294.aClass118_8.anInt3189);
														} else {
															local188 = (String) Static294.aClass118_8.anObject3;
														}
													}
													arg1 = arg1.substring(0, local16) + local188 + arg1.substring(local16 + 4);
												}
											}
											arg1 = arg1.substring(0, local16) + Static219.method3491(Static129.method3069(arg0, 4)) + arg1.substring(local16 + 2);
										}
									}
									arg1 = arg1.substring(0, local16) + Static219.method3491(Static129.method3069(arg0, 3)) + arg1.substring(local16 + 2);
								}
							}
							arg1 = arg1.substring(0, local16) + Static219.method3491(Static129.method3069(arg0, 2)) + arg1.substring(local16 + 2);
						}
					}
					arg1 = arg1.substring(0, local16) + Static219.method3491(Static129.method3069(arg0, 1)) + arg1.substring(local16 + 2);
				}
			}
			arg1 = arg1.substring(0, local16) + Static219.method3491(Static129.method3069(arg0, 0)) + arg1.substring(local16 + 2);
		}
	}
}
