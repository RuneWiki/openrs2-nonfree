import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public static int anInt4741;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public static int anInt4747;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public static int anInt4751;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public static int anInt4734 = 0;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	public static final int anInt4740 = -1;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
	public static int anInt4749 = 0;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString200 = "Created gameworld";

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public static int anInt4752 = -1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!ja;I[Lclient!c;IZ[BII)[I")
	public static int[] method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class27[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(24) int local24;
		@Pc(29) int local29;
		if (!arg6) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				@Pc(11) Class27 local11 = arg4[local5];
				for (local13 = 0; local13 < 64; local13++) {
					for (local17 = 0; local17 < 64; local17++) {
						local24 = arg8 + local13;
						local29 = arg0 + local17;
						if (local24 >= 0 && local24 < Static153.anInt2883 && local29 >= 0 && Static246.anInt4606 > local29) {
							local11.method521(local29, local24);
						}
					}
				}
			}
		}
		@Pc(75) Class6_Sub10 local75 = new Class6_Sub10(arg7);
		@Pc(80) int local80 = arg3 + arg8;
		local13 = arg0 + arg5;
		for (local17 = 0; local17 < arg1; local17++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local29 = 0; local29 < 64; local29++) {
					Static59.method980(0, arg8 + local24, arg6, false, 0, local80 + local24, 0, arg0 + local29, local17, local75, local13 + local29);
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(149) int local149;
		@Pc(204) int local204;
		@Pc(218) int local218;
		@Pc(222) int local222;
		@Pc(224) int local224;
		@Pc(228) int local228;
		while (local75.anInt4188 < local75.aByteArray67.length) {
			local149 = local75.method3972();
			if (local149 == 128) {
				Static292.anIntArray617[0] = local75.method4021();
				Static292.anIntArray617[1] = local75.method4022();
				Static292.anIntArray617[2] = local75.method4022();
				Static292.anIntArray617[3] = local75.method4022();
				local136 = true;
				Static292.anIntArray617[4] = local75.method4021();
			} else {
				if (local149 != 129) {
					local75.anInt4188--;
					break;
				}
				if (Static270.aByteArrayArrayArray12 == null) {
					Static270.aByteArrayArrayArray12 = new byte[4][][];
				}
				for (local204 = 0; local204 < 4; local204++) {
					@Pc(210) byte local210 = local75.method3992();
					if (local210 == 0 && Static270.aByteArrayArrayArray12[local204] != null) {
						local218 = arg8;
						local222 = arg8 + 64;
						local224 = arg0;
						local228 = arg0 + 64;
						if (arg8 < 0) {
							local218 = 0;
						} else if (arg8 >= Static153.anInt2883) {
							local218 = Static153.anInt2883;
						}
						if (local222 < 0) {
							local222 = 0;
						} else if (local222 >= Static153.anInt2883) {
							local222 = Static153.anInt2883;
						}
						if (arg0 < 0) {
							local224 = 0;
						} else if (Static246.anInt4606 <= arg0) {
							local224 = Static246.anInt4606;
						}
						if (local228 < 0) {
							local228 = 0;
						} else if (Static246.anInt4606 <= local228) {
							local228 = Static246.anInt4606;
						}
						while (local218 < local222) {
							while (local224 < local228) {
								Static270.aByteArrayArrayArray12[local204][local218][local224] = 0;
								local224++;
							}
							local218++;
						}
					} else if (local210 == 1) {
						if (Static270.aByteArrayArrayArray12[local204] == null) {
							Static270.aByteArrayArrayArray12[local204] = new byte[Static153.anInt2883 + 1][Static246.anInt4606 + 1];
						}
						for (local218 = 0; local218 < 64; local218 += 4) {
							for (local222 = 0; local222 < 64; local222 += 4) {
								@Pc(340) byte local340 = local75.method3992();
								for (local228 = arg8 + local218; local228 < local218 + arg8 + 4; local228++) {
									for (@Pc(350) int local350 = arg0 + local222; local350 < arg0 + local222 + 4; local350++) {
										if (local228 >= 0 && local228 < Static153.anInt2883 && local350 >= 0 && Static246.anInt4606 > local350) {
											Static270.aByteArrayArrayArray12[local204][local228][local350] = local340;
										}
									}
								}
							}
						}
					} else if (local210 == 2) {
						if (Static270.aByteArrayArrayArray12[local204] == null) {
							Static270.aByteArrayArrayArray12[local204] = new byte[Static153.anInt2883 + 1][Static246.anInt4606 + 1];
						}
						if (local204 > 0) {
							local218 = arg8;
							local222 = arg8 + 64;
							local224 = arg0;
							if (local222 < 0) {
								local222 = 0;
							} else if (Static153.anInt2883 <= local222) {
								local222 = Static153.anInt2883;
							}
							if (arg0 < 0) {
								local224 = 0;
							} else if (Static246.anInt4606 <= arg0) {
								local224 = Static246.anInt4606;
							}
							if (arg8 < 0) {
								local218 = 0;
							} else if (Static153.anInt2883 <= arg8) {
								local218 = Static153.anInt2883;
							}
							local228 = arg0 + 64;
							if (local228 < 0) {
								local228 = 0;
							} else if (Static246.anInt4606 <= local228) {
								local228 = Static246.anInt4606;
							}
							while (local218 < local222) {
								while (local228 > local224) {
									Static270.aByteArrayArrayArray12[local204][local218][local224] = Static270.aByteArrayArrayArray12[local204 - 1][local218][local224];
									local224++;
								}
								local218++;
							}
						}
					}
				}
				local138 = true;
			}
		}
		@Pc(560) int local560;
		if (!arg6) {
			@Pc(546) Class14 local546 = null;
			label281: while (true) {
				label274: do {
					while (true) {
						while (local75.anInt4188 < local75.aByteArray67.length) {
							local204 = local75.method3972();
							if (local204 == 0) {
								local546 = new Class14(local75);
							} else {
								if (local204 == 1) {
									local560 = local75.method3972();
									continue label274;
								}
								if (local204 != 2) {
									throw new IllegalStateException();
								}
								if (local546 == null) {
									local546 = new Class14();
								}
								local546.method295(local75);
							}
						}
						if (local546 != null) {
							for (local204 = 0; local204 < 8; local204++) {
								for (local560 = 0; local560 < 8; local560++) {
									local218 = (arg8 >> 3) + local204;
									local222 = (arg0 >> 3) + local560;
									if (local218 >= 0 && Static153.anInt2883 >> 3 > local218 && local222 >= 0 && local222 < Static246.anInt4606 >> 3) {
										Static303.method5208(local546, local218, local222);
									}
								}
							}
						}
						break label281;
					}
				} while (local560 <= 0);
				for (local218 = 0; local218 < local560; local218++) {
					@Pc(571) Class6_Sub17_Sub1 local571 = new Class6_Sub17_Sub1(local75);
					if (local571.anInt2328 == 31) {
						@Pc(581) Class129 local581 = Static327.method3200(local75.method4021());
						local571.method2487(local581.anInt3436, local581.anInt3437, local581.anInt3438, local581.anInt3435);
					}
					local571.anInt2317 += arg0 << 7;
					local571.anInt2314 += arg8 << 7;
					local224 = local571.anInt2314 >> 7;
					local228 = local571.anInt2317 >> 7;
					if (local224 >= 0 && local228 >= 0 && Static153.anInt2883 > local224 && local228 < Static246.anInt4606) {
						local571.anInt2316 = Static5.anIntArrayArrayArray1[local571.anInt2324][local224][local228] - local571.anInt2316;
						if (arg2.method3038() > 0) {
							Static297.method5065(local571);
						}
					}
				}
			}
		}
		if (!local138 && Static270.aByteArrayArrayArray12 != null) {
			for (local149 = 0; local149 < 4; local149++) {
				if (Static270.aByteArrayArrayArray12[local149] != null) {
					for (local204 = 0; local204 < 16; local204++) {
						for (local560 = 0; local560 < 16; local560++) {
							local218 = local204 + (arg8 >> 2);
							local222 = (arg0 >> 2) + local560;
							if (local218 >= 0 && local218 < 26 && local222 >= 0 && local222 < 26) {
								Static270.aByteArrayArrayArray12[local149][local218][local222] = 0;
							}
						}
					}
				}
			}
		}
		if (local136) {
			return Static292.anIntArray617;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V")
	public static void method4369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static131.aClass6_Sub10_Sub1_2.method2886(78);
		Static131.aClass6_Sub10_Sub1_2.method3976(arg1);
		Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!td;)V")
	public static void method4373(@OriginalArg(1) Class190 arg0) {
		Static310.aClass190_1 = arg0;
	}
}
