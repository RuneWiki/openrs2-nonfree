import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_24 = new Class154(50);

	@OriginalMember(owner = "client!en", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[112];

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	public static int anInt1681 = 0;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString53 = "Allocating memory";

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!vm;III[BZBI[Lclient!qs;)[I")
	public static int[] method1404(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class174[] arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(32) int local32;
		if (!arg6) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class174 local15 = arg8[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg4;
						local32 = arg0 + local21;
						if (local27 >= 0 && local27 < Static92.anInt2048 && local32 >= 0 && Static290.anInt5893 > local32) {
							local15.method4664(local27, local32);
						}
					}
				}
			}
		}
		@Pc(69) Class4_Sub7 local69 = new Class4_Sub7(arg5);
		@Pc(74) int local74 = arg7 + arg4;
		local17 = arg3 + arg0;
		for (local21 = 0; local21 < arg2; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local32 = 0; local32 < 64; local32++) {
					Static280.method4790(0, local69, 0, arg6, 0, local74 + local27, arg4 + local27, local21, local32 + local17, false, arg0 + local32);
				}
			}
		}
		@Pc(128) boolean local128 = false;
		@Pc(130) boolean local130 = false;
		@Pc(136) int local136;
		@Pc(191) int local191;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(338) int local338;
		@Pc(238) int local238;
		while (local69.aByteArray42.length > local69.anInt2667) {
			local136 = local69.method2380();
			if (local136 == 128) {
				Static56.anIntArray140[0] = local69.method2404();
				Static56.anIntArray140[1] = local69.method2396();
				Static56.anIntArray140[2] = local69.method2396();
				Static56.anIntArray140[3] = local69.method2396();
				Static56.anIntArray140[4] = local69.method2404();
				local128 = true;
			} else {
				if (local136 != 129) {
					local69.anInt2667--;
					break;
				}
				if (Static142.aByteArrayArrayArray4 == null) {
					Static142.aByteArrayArrayArray4 = new byte[4][][];
				}
				for (local191 = 0; local191 < 4; local191++) {
					@Pc(197) byte local197 = local69.method2393();
					if (local197 == 0 && Static142.aByteArrayArrayArray4[local191] != null) {
						local224 = arg4;
						local228 = arg4 + 64;
						local338 = arg0;
						if (arg4 < 0) {
							local224 = 0;
						} else if (arg4 >= Static92.anInt2048) {
							local224 = Static92.anInt2048;
						}
						if (local228 < 0) {
							local228 = 0;
						} else if (Static92.anInt2048 <= local228) {
							local228 = Static92.anInt2048;
						}
						local238 = arg0 + 64;
						if (arg0 < 0) {
							local338 = 0;
						} else if (Static290.anInt5893 <= arg0) {
							local338 = Static290.anInt5893;
						}
						if (local238 < 0) {
							local238 = 0;
						} else if (local238 >= Static290.anInt5893) {
							local238 = Static290.anInt5893;
						}
						while (local224 < local228) {
							while (local238 > local338) {
								Static142.aByteArrayArrayArray4[local191][local224][local338] = 0;
								local338++;
							}
							local224++;
						}
					} else if (local197 == 1) {
						if (Static142.aByteArrayArrayArray4[local191] == null) {
							Static142.aByteArrayArrayArray4[local191] = new byte[Static92.anInt2048 + 1][Static290.anInt5893 + 1];
						}
						for (local224 = 0; local224 < 64; local224 += 4) {
							for (local228 = 0; local228 < 64; local228 += 4) {
								@Pc(234) byte local234 = local69.method2393();
								for (local238 = arg4 + local224; local238 < local224 + arg4 + 4; local238++) {
									for (@Pc(244) int local244 = arg0 + local228; local244 < arg0 + local228 + 4; local244++) {
										if (local238 >= 0 && Static92.anInt2048 > local238 && local244 >= 0 && local244 < Static290.anInt5893) {
											Static142.aByteArrayArrayArray4[local191][local238][local244] = local234;
										}
									}
								}
							}
						}
					} else if (local197 == 2) {
						if (Static142.aByteArrayArrayArray4[local191] == null) {
							Static142.aByteArrayArrayArray4[local191] = new byte[Static92.anInt2048 + 1][Static290.anInt5893 + 1];
						}
						if (local191 > 0) {
							local224 = arg4;
							local228 = arg4 + 64;
							local338 = arg0;
							if (arg4 < 0) {
								local224 = 0;
							} else if (Static92.anInt2048 <= arg4) {
								local224 = Static92.anInt2048;
							}
							if (arg0 < 0) {
								local338 = 0;
							} else if (Static290.anInt5893 <= arg0) {
								local338 = Static290.anInt5893;
							}
							local238 = arg0 + 64;
							if (local228 < 0) {
								local228 = 0;
							} else if (Static92.anInt2048 <= local228) {
								local228 = Static92.anInt2048;
							}
							if (local238 < 0) {
								local238 = 0;
							} else if (local238 >= Static290.anInt5893) {
								local238 = Static290.anInt5893;
							}
							while (local228 > local224) {
								while (local338 < local238) {
									Static142.aByteArrayArrayArray4[local191][local224][local338] = Static142.aByteArrayArrayArray4[local191 - 1][local224][local338];
									local338++;
								}
								local224++;
							}
						}
					}
				}
				local130 = true;
			}
		}
		@Pc(584) int local584;
		if (!arg6) {
			@Pc(539) Class100 local539 = null;
			while (true) {
				while (local69.aByteArray42.length > local69.anInt2667) {
					local191 = local69.method2380();
					if (local191 == 0) {
						local539 = new Class100(local69);
					} else if (local191 == 1) {
						local584 = local69.method2380();
						if (local584 > 0) {
							for (local224 = 0; local224 < local584; local224++) {
								@Pc(598) Class4_Sub12_Sub1 local598 = new Class4_Sub12_Sub1(local69);
								if (local598.anInt6088 == 31) {
									@Pc(610) Class136 local610 = Static325.method5355(local69.method2404());
									local598.method5111(local610.anInt4330, local610.anInt4335, local610.anInt4332, local610.anInt4339);
								}
								local598.anInt6081 += arg0 << 7;
								local598.anInt6082 += arg4 << 7;
								local338 = local598.anInt6082 >> 7;
								local238 = local598.anInt6081 >> 7;
								if (local338 >= 0 && local238 >= 0 && Static92.anInt2048 > local338 && local238 < Static290.anInt5893) {
									local598.anInt6079 = Static57.anIntArrayArrayArray4[local598.anInt6093][local338][local238] - local598.anInt6079;
									if (arg1.method4499() > 0) {
										Static13.method306(local598);
									}
								}
							}
						}
					} else if (local191 == 2) {
						if (local539 == null) {
							local539 = new Class100();
						}
						local539.method2727(local69);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local539 != null) {
					for (local191 = 0; local191 < 8; local191++) {
						for (local584 = 0; local584 < 8; local584++) {
							local224 = local191 + (arg4 >> 3);
							local228 = (arg0 >> 3) + local584;
							if (local224 >= 0 && local224 < Static92.anInt2048 >> 3 && local228 >= 0 && Static290.anInt5893 >> 3 > local228) {
								Static144.method2829(local224, local228, local539);
							}
						}
					}
				}
				break;
			}
		}
		if (!local130 && Static142.aByteArrayArrayArray4 != null) {
			for (local136 = 0; local136 < 4; local136++) {
				if (Static142.aByteArrayArrayArray4[local136] != null) {
					for (local191 = 0; local191 < 16; local191++) {
						for (local584 = 0; local584 < 16; local584++) {
							local224 = (arg4 >> 2) + local191;
							local228 = local584 + (arg0 >> 2);
							if (local224 >= 0 && local224 < 26 && local228 >= 0 && local228 < 26) {
								Static142.aByteArrayArrayArray4[local136][local224][local228] = 0;
							}
						}
					}
				}
			}
		}
		if (local128) {
			return Static56.anIntArray140;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public static void method1407(@OriginalArg(1) int arg0) {
		Static290.anInt5894 = 100;
		Static214.anInt4451 = arg0;
		Static153.anInt3426 = 3;
		Static213.anInt4432 = -1;
	}
}
