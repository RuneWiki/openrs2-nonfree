import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public static final int anInt6023 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "[I")
	public static final int[] anIntArray578 = new int[14];

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static final int anInt6027 = -9017772;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public static int anInt6030 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ps;ILjava/lang/String;)Ljava/lang/String;")
	public static String method5229(@OriginalArg(0) Class163 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.indexOf("%1");
			if (local14 == -1) {
				while (true) {
					local14 = arg1.indexOf("%2");
					if (local14 == -1) {
						while (true) {
							local14 = arg1.indexOf("%3");
							if (local14 == -1) {
								while (true) {
									local14 = arg1.indexOf("%4");
									if (local14 == -1) {
										while (true) {
											local14 = arg1.indexOf("%5");
											if (local14 == -1) {
												while (true) {
													local14 = arg1.indexOf("%dns");
													if (local14 == -1) {
														return arg1;
													}
													@Pc(190) String local190 = "";
													if (Static327.aClass193_8 != null) {
														if (Static327.aClass193_8.anObject7 == null) {
															local190 = Static76.method1299(Static327.aClass193_8.anInt5985);
														} else {
															local190 = (String) Static327.aClass193_8.anObject7;
														}
													}
													arg1 = arg1.substring(0, local14) + local190 + arg1.substring(local14 + 4);
												}
											}
											arg1 = arg1.substring(0, local14) + Static322.method5495(Static315.method5398(4, arg0)) + arg1.substring(local14 + 2);
										}
									}
									arg1 = arg1.substring(0, local14) + Static322.method5495(Static315.method5398(3, arg0)) + arg1.substring(local14 + 2);
								}
							}
							arg1 = arg1.substring(0, local14) + Static322.method5495(Static315.method5398(2, arg0)) + arg1.substring(local14 + 2);
						}
					}
					arg1 = arg1.substring(0, local14) + Static322.method5495(Static315.method5398(1, arg0)) + arg1.substring(local14 + 2);
				}
			}
			arg1 = arg1.substring(0, local14) + Static322.method5495(Static315.method5398(0, arg0)) + arg1.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ)V")
	public static void method5230(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static263.aByteArrayArray19;
			local11 = 1;
		} else {
			local11 = 4;
			local9 = Static41.aByteArrayArray4;
		}
		@Pc(20) int local20 = local9.length;
		@Pc(36) int local36;
		@Pc(49) int local49;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local9[local22];
			local36 = Static146.anIntArray446[local22] >> 8;
			@Pc(42) int local42 = Static146.anIntArray446[local22] & 0xFF;
			local49 = local36 * 64 - Static92.anInt1755;
			@Pc(55) int local55 = local42 * 64 - Static98.anInt1911;
			if (local30 != null) {
				Static310.method5336();
				local26 = Static76.method1303(local11, Static313.aClass17Array1, local30, local49, Static98.anInt1911, local55, Static217.aClass105_5, Static92.anInt1755, arg0);
			}
			if (!arg0 && local36 == Static177.anInt3736 / 8 && local42 == Static232.anInt4829 / 8) {
				if (local26 == null) {
					Static126.aClass199_1 = null;
				} else {
					Static126.aClass199_1 = Static123.method4486(local26[3], local26[2], local26[1], local26[0]);
					Static161.anInt3358 = local26[4];
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < local20; local123++) {
			@Pc(136) int local136 = (Static146.anIntArray446[local123] >> 8) * 64 - Static92.anInt1755;
			local36 = (Static146.anIntArray446[local123] & 0xFF) * 64 - Static98.anInt1911;
			@Pc(151) byte[] local151 = local9[local123];
			if (local151 == null && Static232.anInt4829 < 800) {
				Static310.method5336();
				for (local49 = 0; local49 < local11; local49++) {
					Static253.method4539(local36, local49, 64, 64, local136);
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)Z")
	public static boolean method5231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static235.method5310(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static62.method5782(local10 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg2) + arg3, local14 + 1) && Static62.method5782(local10 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg2) + arg3, local14 + 1) && Static62.method5782(local10 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static62.method5782(local10 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	public static void method5233() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static68.aBooleanArray5[local3] = false;
		}
		Static100.anInt1933 = -1;
		Static342.anInt2478 = -1;
		Static324.anInt6407 = 0;
		Static246.anInt5156 = 1;
		Static275.anInt5626 = 0;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public static void method5234() {
		Static19.aClass37_9.method919();
	}
}
