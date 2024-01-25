import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lclient!nf;")
	public static Class102 aClass102_13;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_27 = new Class279(4);

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "Lclient!ws;")
	public static final Class395 aClass395_9 = new Class395();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method4276(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static244.method3914(arg1, arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ct;[[BI)V")
	public static void method4277(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.anInt1959; local15++) {
			Static312.method4827();
			for (@Pc(21) int local21 = 0; local21 < Static251.anInt4680 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static406.anInt6924 >> 3; local25++) {
					@Pc(35) int local35 = Static104.anIntArrayArrayArray3[local15][local21][local25];
					if (local35 != -1) {
						@Pc(45) int local45 = local35 >> 24 & 0x3;
						if (!arg0.aBoolean179 || local45 == 0) {
							@Pc(59) int local59 = local35 >> 1 & 0x3;
							@Pc(65) int local65 = local35 >> 14 & 0x3FF;
							@Pc(71) int local71 = local35 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static442.anIntArray464.length; local83++) {
								if (local81 == Static442.anIntArray464[local83] && arg1[local83] != null) {
									arg0.method1831((local71 & 0x7) * 8, local25 * 8, arg1[local83], Static27.aClass198Array1, local15, (local65 & 0x7) * 8, local45, local59, local21 * 8, Static582.aClass16_12);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIBI)I")
	public static int method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static678.anInt10338 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static574.anInt8361;
		@Pc(26) int local26 = arg0 - Static574.anInt8366;
		for (@Pc(31) Class3_Sub8 local31 = (Class3_Sub8) Static574.aClass193_53.method4457(); local31 != null; local31 = (Class3_Sub8) Static574.aClass193_53.method4459()) {
			if (arg1 == local31.anInt1242) {
				@Pc(52) int local52 = local31.anInt1246;
				@Pc(55) int local55 = local31.anInt1249;
				@Pc(66) int local66 = Static574.anInt8366 + local55 | local52 - -Static574.anInt8361 << 14;
				@Pc(84) int local84 = (local26 - local55) * (-local55 + local26) + (local21 - local52) * (local21 - local52);
				if (local14 < 0 || local16 > local84) {
					local16 = local84;
					local14 = local66;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([I[IIII)V")
	public static void method4279(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(20) int local20 = (arg3 + arg2) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) int local26 = arg1[local20];
		arg1[local20] = arg1[arg2];
		arg1[arg2] = local26;
		@Pc(40) int local40 = arg0[local20];
		arg0[local20] = arg0[arg2];
		arg0[arg2] = local40;
		@Pc(59) int local59 = ~local26 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg3; local61 < arg2; local61++) {
			if (arg1[local61] < local26 + (local61 & local59)) {
				@Pc(77) int local77 = arg1[local61];
				arg1[local61] = arg1[local22];
				arg1[local22] = local77;
				@Pc(91) int local91 = arg0[local61];
				arg0[local61] = arg0[local22];
				arg0[local22++] = local91;
			}
		}
		arg1[arg2] = arg1[local22];
		arg1[local22] = local26;
		arg0[arg2] = arg0[local22];
		arg0[local22] = local40;
		method4279(arg0, arg1, local22 - 1, arg3);
		method4279(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	public static void method4280() {
		@Pc(5) int local5 = 0;
		if (Static227.aClass3_Sub15_11 != null) {
			local5 = Static227.aClass3_Sub15_11.aClass17_Sub8_1.method3305();
		}
		@Pc(29) int local29;
		@Pc(47) int local47;
		if (local5 == 2) {
			local29 = Static83.anInt1901 <= 800 ? Static83.anInt1901 : 800;
			Static654.anInt10064 = local29;
			Static225.anInt4116 = (Static83.anInt1901 - local29) / 2;
			local47 = Static597.anInt9407 <= 600 ? Static597.anInt9407 : 600;
			Static483.anInt8181 = local47;
			Static40.anInt1166 = 0;
		} else if (local5 == 1) {
			local29 = Static83.anInt1901 > 1024 ? 1024 : Static83.anInt1901;
			local47 = Static597.anInt9407 > 768 ? 768 : Static597.anInt9407;
			Static225.anInt4116 = (Static83.anInt1901 - local29) / 2;
			Static654.anInt10064 = local29;
			Static40.anInt1166 = 0;
			Static483.anInt8181 = local47;
		} else {
			Static483.anInt8181 = Static597.anInt9407;
			Static654.anInt10064 = Static83.anInt1901;
			Static40.anInt1166 = 0;
			Static225.anInt4116 = 0;
		}
	}
}
