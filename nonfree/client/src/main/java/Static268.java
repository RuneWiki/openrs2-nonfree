import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public static int anInt4539;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!sm;")
	public static Class7_Sub39 aClass7_Sub39_1;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "Lclient!ya;")
	public static Class51 aClass51_8;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int anInt4537 = 64;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_37 = new Class126(8);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3593(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!dr;I)V")
	public static void method3596(@OriginalArg(0) Class7_Sub14_Sub1 arg0) {
		arg0.method1361();
		@Pc(12) int local12 = 0;
		@Pc(20) int local20;
		@Pc(47) int local47;
		for (@Pc(14) int local14 = 0; local14 < Static36.anInt647; local14++) {
			local20 = Static362.anIntArray533[local14];
			if ((Static245.aByteArray57[local20] & 0x1) == 0) {
				if (local12 > 0) {
					Static245.aByteArray57[local20] = (byte) (Static245.aByteArray57[local20] | 0x2);
					local12--;
				} else {
					local47 = arg0.method1358(1);
					if (local47 == 0) {
						local12 = Static373.method4786(arg0);
						Static245.aByteArray57[local20] = (byte) (Static245.aByteArray57[local20] | 0x2);
					} else {
						Static168.method2452(arg0, local20);
					}
				}
			}
		}
		arg0.method1353();
		if (local12 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1361();
		@Pc(129) int local129;
		for (local20 = 0; local20 < Static36.anInt647; local20++) {
			local47 = Static362.anIntArray533[local20];
			if ((Static245.aByteArray57[local47] & 0x1) != 0) {
				if (local12 > 0) {
					Static245.aByteArray57[local47] = (byte) (Static245.aByteArray57[local47] | 0x2);
					local12--;
				} else {
					local129 = arg0.method1358(1);
					if (local129 == 0) {
						local12 = Static373.method4786(arg0);
						Static245.aByteArray57[local47] = (byte) (Static245.aByteArray57[local47] | 0x2);
					} else {
						Static168.method2452(arg0, local47);
					}
				}
			}
		}
		arg0.method1353();
		if (local12 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1361();
		@Pc(207) int local207;
		for (local47 = 0; local47 < Static233.anInt5380; local47++) {
			local129 = Static233.anIntArray490[local47];
			if ((Static245.aByteArray57[local129] & 0x1) != 0) {
				if (local12 > 0) {
					local12--;
					Static245.aByteArray57[local129] = (byte) (Static245.aByteArray57[local129] | 0x2);
				} else {
					local207 = arg0.method1358(1);
					if (local207 == 0) {
						local12 = Static373.method4786(arg0);
						Static245.aByteArray57[local129] = (byte) (Static245.aByteArray57[local129] | 0x2);
					} else if (Static179.method5738(arg0, local129)) {
						Static245.aByteArray57[local129] = (byte) (Static245.aByteArray57[local129] | 0x2);
					}
				}
			}
		}
		arg0.method1353();
		if (local12 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1361();
		for (local129 = 0; local129 < Static233.anInt5380; local129++) {
			local207 = Static233.anIntArray490[local129];
			if ((Static245.aByteArray57[local207] & 0x1) == 0) {
				if (local12 > 0) {
					local12--;
					Static245.aByteArray57[local207] = (byte) (Static245.aByteArray57[local207] | 0x2);
				} else {
					@Pc(299) int local299 = arg0.method1358(1);
					if (local299 == 0) {
						local12 = Static373.method4786(arg0);
						Static245.aByteArray57[local207] = (byte) (Static245.aByteArray57[local207] | 0x2);
					} else if (Static179.method5738(arg0, local207)) {
						Static245.aByteArray57[local207] = (byte) (Static245.aByteArray57[local207] | 0x2);
					}
				}
			}
		}
		arg0.method1353();
		if (local12 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static233.anInt5380 = 0;
		Static36.anInt647 = 0;
		for (local207 = 1; local207 < 2048; local207++) {
			Static245.aByteArray57[local207] = (byte) (Static245.aByteArray57[local207] >> 1);
			@Pc(367) Class26_Sub2_Sub4_Sub2 local367 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local207];
			if (local367 == null) {
				Static233.anIntArray490[Static233.anInt5380++] = local207;
			} else {
				Static362.anIntArray533[Static36.anInt647++] = local207;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CB)Z")
	public static boolean method3600(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static247.method4214(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static269.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static220.aCharArray5;
			for (@Pc(56) int local56 = 0; local56 < local46.length; local56++) {
				@Pc(62) char local62 = local46[local56];
				if (arg0 == local62) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public static void method3601() {
		if (Static165.anIntArray263 != null) {
			return;
		}
		Static165.anIntArray263 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(72) double local72;
				if (local52 < 0.5D) {
					local72 = (local45 + 1.0D) * local52;
				} else {
					local72 = local45 + local52 - local45 * local52;
				}
				@Pc(90) double local90 = local52 * 2.0D - local72;
				@Pc(94) double local94 = local34 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local34 - 0.3333333333333333D;
				if (local34 * 6.0D < 1.0D) {
					local56 = local90 + local34 * 6.0D * (local72 - local90);
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = (local72 - local90) * 6.0D * (0.6666666666666666D - local34) + local90;
				} else {
					local56 = local90;
				}
				if (local108 < 0.0D) {
					local108++;
				}
				if (local94 * 6.0D < 1.0D) {
					local54 = local90 + (local72 - local90) * 6.0D * local94;
				} else if (local94 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local94 * 3.0D < 2.0D) {
					local54 = (0.6666666666666666D - local94) * 6.0D * (local72 - local90) + local90;
				} else {
					local54 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local58 = (local72 - local90) * 6.0D * local108 + local90;
				} else if (local108 * 2.0D < 1.0D) {
					local58 = local72;
				} else if (local108 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local108) * 6.0D * (local72 - local90) + local90;
				} else {
					local58 = local90;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(288) int local288 = (int) (local54 * 256.0D);
			@Pc(293) int local293 = (int) (local56 * 256.0D);
			@Pc(298) int local298 = (int) (local58 * 256.0D);
			@Pc(309) int local309 = (local293 << 8) + ((local288 << 16) + local298);
			Static165.anIntArray263[local21] = local309;
		}
	}
}
