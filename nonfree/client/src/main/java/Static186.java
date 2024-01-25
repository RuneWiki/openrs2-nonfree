import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_63 = new Class70(8);

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString143 = "Loaded world list data";

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)I")
	public static int method3515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	public static void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class44_Sub1 local13 = local7.aClass44_Sub1_1;
		@Pc(16) Class44_Sub1 local16 = local7.aClass44_Sub1_2;
		if (local13 != null) {
			local13.anInt5762 = local13.anInt5762 * arg3 / 16;
			local13.anInt5761 = local13.anInt5761 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5762 = local16.anInt5762 * arg3 / 16;
			local16.anInt5761 = local16.anInt5761 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public static void method3518() {
		for (@Pc(1) int local1 = 0; local1 < Static105.anInt1943; local1++) {
			if (!Static29.aBooleanArray9[local1]) {
				@Pc(10) Class6_Sub17_Sub1 local10 = Static240.aClass6_Sub17_Sub1Array4[local1];
				@Pc(13) int local13 = local10.anInt2324;
				@Pc(18) int local18 = local10.anInt2315 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt2314 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt2317 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt2317 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static163.anInt3084) {
					local54 = Static163.anInt3084 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray54[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static310.anInt5828) {
						local101 = Static310.anInt5828 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class44_Sub4 local134 = Static162.method3236(local13, local118, local71, pf.class);
						if (local134 != null && local134.aByte91 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte91 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray54[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray54[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray54[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray54[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static29.aBooleanArray9[local1] = true;
				Static203.aClass106Array3[local13].method5726(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public static void method3519() {
		Static239.aClass70_109.method1397(5);
	}
}
