import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString89 = "Loading title screen - ";

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public static int anInt2202 = 0;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "[I")
	public static int[] anIntArray229 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method1920(@OriginalArg(0) int arg0) {
		if (Static156.anIntArray335 == null || arg0 > Static156.anIntArray335.length) {
			Static156.anIntArray335 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
	public static void method1921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static31.anInt572 = Static43.aClass74ArrayArray1[arg1][arg0].anInt2020;
		Static310.anInt6112 = Static43.aClass74ArrayArray1[arg1][arg0].anInt2021;
		Static113.anInt2102 = Static43.aClass74ArrayArray1[arg1][arg0].anInt2022;
		Static226.method3655((float) Static31.anInt572, (float) Static310.anInt6112, (float) Static113.anInt2102);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZ)I")
	public static int method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local12.anIntArray294.length; local21++) {
			if (local12.anIntArray294[local21] >= 0 && local12.anIntArray294[local21] < Static300.anInt5928) {
				@Pc(51) Class21 local51 = Static133.method2309(local12.anIntArray294[local21]);
				if (local51.aClass30_1 != null) {
					@Pc(63) Class3_Sub8 local63 = (Class3_Sub8) local51.aClass30_1.method663((long) arg0);
					if (local63 != null) {
						if (arg2) {
							local19 += local63.anInt1237 * local12.anIntArray293[local21];
						} else {
							local19 += local63.anInt1237;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLjava/lang/String;Lclient!rg;)Ljava/lang/String;")
	public static String method1923(@OriginalArg(1) String arg0, @OriginalArg(2) Class151 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(11) int local11 = arg0.indexOf("%1");
			if (local11 == -1) {
				while (true) {
					local11 = arg0.indexOf("%2");
					if (local11 == -1) {
						while (true) {
							local11 = arg0.indexOf("%3");
							if (local11 == -1) {
								while (true) {
									local11 = arg0.indexOf("%4");
									if (local11 == -1) {
										while (true) {
											local11 = arg0.indexOf("%5");
											if (local11 == -1) {
												while (true) {
													local11 = arg0.indexOf("%dns");
													if (local11 == -1) {
														return arg0;
													}
													@Pc(190) String local190 = "";
													if (Static220.aClass178_5 != null) {
														if (Static220.aClass178_5.anObject6 == null) {
															local190 = Static291.method4772(Static220.aClass178_5.anInt5647);
														} else {
															local190 = (String) Static220.aClass178_5.anObject6;
														}
													}
													arg0 = arg0.substring(0, local11) + local190 + arg0.substring(local11 + 4);
												}
											}
											arg0 = arg0.substring(0, local11) + Static88.method1352(Static39.method565(arg1, 4)) + arg0.substring(local11 + 2);
										}
									}
									arg0 = arg0.substring(0, local11) + Static88.method1352(Static39.method565(arg1, 3)) + arg0.substring(local11 + 2);
								}
							}
							arg0 = arg0.substring(0, local11) + Static88.method1352(Static39.method565(arg1, 2)) + arg0.substring(local11 + 2);
						}
					}
					arg0 = arg0.substring(0, local11) + Static88.method1352(Static39.method565(arg1, 1)) + arg0.substring(local11 + 2);
				}
			}
			arg0 = arg0.substring(0, local11) + Static88.method1352(Static39.method565(arg1, 0)) + arg0.substring(local11 + 2);
		}
	}
}
