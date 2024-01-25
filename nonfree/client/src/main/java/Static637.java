import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vha", name = "x", descriptor = "D")
	public static double aDouble34;

	@OriginalMember(owner = "client!vha", name = "G", descriptor = "I")
	public static int anInt9833;

	@OriginalMember(owner = "client!vha", name = "w", descriptor = "Z")
	public static boolean aBoolean724 = false;

	@OriginalMember(owner = "client!vha", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString125 = null;

	@OriginalMember(owner = "client!vha", name = "E", descriptor = "[I")
	public static final int[] anIntArray639 = new int[6];

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IB)V")
	public static void method8372(@OriginalArg(1) byte arg0) {
		if (Static588.aByteArrayArrayArray18 == null) {
			Static588.aByteArrayArrayArray18 = new byte[4][Static251.anInt4680][Static406.anInt6924];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static251.anInt4680; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static406.anInt6924; local22++) {
					Static588.aByteArrayArrayArray18[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!lu;BZZLjava/lang/String;)V")
	public static void method8373(@OriginalArg(0) Class231 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static229.method7980(3, arg0, arg3);
			return;
		}
		@Pc(14) String local14;
		if (Static353.aString80.startsWith("win") && arg0.aBoolean482) {
			local14 = null;
			if (Static287.anApplet2 != null) {
				local14 = Static287.anApplet2.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class129 local32 = Static229.method7980(0, arg0, arg3);
				Static446.aClass231_3 = arg0;
				Static94.aString21 = arg3;
				Static523.aClass129_11 = local32;
				return;
			}
		}
		if (Static353.aString80.startsWith("mac")) {
			local14 = null;
			if (Static287.anApplet2 != null) {
				local14 = Static287.anApplet2.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg2) {
				Static229.method7980(1, arg0, arg3);
				return;
			}
		}
		Static229.method7980(2, arg0, arg3);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I[B)V")
	public static void method8374(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub17 local10 = new Class3_Sub17(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method4888();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(29) int[] local29 = Static379.anIntArray632 = new int[6];
					local29[0] = local10.method4858();
					local29[1] = local10.method4858();
					local29[2] = local10.method4858();
					local29[3] = local10.method4858();
					local29[4] = local10.method4858();
					local29[5] = local10.method4858();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local14 == 4) {
						local76 = local10.method4888();
						Static12.anIntArray6 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static12.anIntArray6[local81] = local10.method4858();
							if (Static12.anIntArray6[local81] == 65535) {
								Static12.anIntArray6[local81] = -1;
							}
						}
					} else if (local14 == 5) {
						local76 = local10.method4888();
						Static173.anIntArray224 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static173.anIntArray224[local81] = local10.method4858();
							if (Static173.anIntArray224[local81] == 65535) {
								Static173.anIntArray224[local81] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!bl;B)I")
	public static int method8376(@OriginalArg(0) Class41 arg0) {
		if (Static233.aClass41_3 == arg0) {
			return 9216;
		} else if (Static95.aClass41_1 == arg0) {
			return 34065;
		} else if (Static383.aClass41_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
