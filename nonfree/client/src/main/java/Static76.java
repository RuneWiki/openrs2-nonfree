import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "[C")
	public static final char[] aCharArray1 = new char[128];

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString58 = "wave2:";

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	public static int anInt1569 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1299(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method1300() {
		Static158.aClass207_24.method5562();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!nj;)Lclient!dn;")
	public static Class49_Sub1 method1301(@OriginalArg(1) Class1_Sub21 arg0) {
		return new Class49_Sub1(arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5705(), arg0.method5720());
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/lang/Object;I[JBI)V")
	public static void method1302(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg3) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) Object local35 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg3; local47++) {
			if (arg2[local47] < local21 + (long) (local47 & 0x1)) {
				@Pc(65) long local65 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local65;
				@Pc(79) Object local79 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17++] = local79;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg0[arg3] = arg0[local17];
		arg0[local17] = local35;
		method1302(arg0, arg1, arg2, local17 - 1);
		method1302(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[Lclient!ba;[BIIILclient!ii;IZ)[I")
	public static int[] method1303(@OriginalArg(1) int arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class105 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg8) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class17 local15 = arg1[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = arg3 + local17;
						local31 = local21 + arg5;
						if (local27 >= 0 && local27 < Static43.anInt1151 && local31 >= 0 && Static260.anInt5348 > local31) {
							local15.method324(local31, local27);
						}
					}
				}
			}
		}
		@Pc(70) Class1_Sub21 local70 = new Class1_Sub21(arg2);
		@Pc(74) int local74 = arg7 + arg3;
		local17 = arg4 + arg5;
		for (local21 = 0; local21 < arg0; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static41.method881(0, false, arg3 + local27, arg5 + local31, 0, local74 + local27, 0, local17 + local31, local21, arg8, local70);
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(145) int local145;
		@Pc(160) int local160;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(185) int local185;
		@Pc(200) int local200;
		while (local70.aByteArray82.length > local70.anInt6611) {
			local145 = local70.method5720();
			if (local145 == 128) {
				Static338.anIntArray660[0] = local70.method5715();
				Static338.anIntArray660[1] = local70.method5691();
				Static338.anIntArray660[2] = local70.method5691();
				Static338.anIntArray660[3] = local70.method5691();
				local137 = true;
				Static338.anIntArray660[4] = local70.method5715();
			} else {
				if (local145 != 129) {
					local70.anInt6611--;
					break;
				}
				if (Static223.aByteArrayArrayArray3 == null) {
					Static223.aByteArrayArrayArray3 = new byte[4][][];
				}
				local139 = true;
				for (local160 = 0; local160 < 4; local160++) {
					@Pc(168) byte local168 = local70.method5721();
					if (local168 == 0 && Static223.aByteArrayArrayArray3[local160] != null) {
						local179 = arg3;
						local183 = arg3 + 64;
						local185 = arg5;
						if (arg3 < 0) {
							local179 = 0;
						} else if (Static43.anInt1151 <= arg3) {
							local179 = Static43.anInt1151;
						}
						local200 = arg5 + 64;
						if (arg5 < 0) {
							local185 = 0;
						} else if (arg5 >= Static260.anInt5348) {
							local185 = Static260.anInt5348;
						}
						if (local183 < 0) {
							local183 = 0;
						} else if (Static43.anInt1151 <= local183) {
							local183 = Static43.anInt1151;
						}
						if (local200 < 0) {
							local200 = 0;
						} else if (Static260.anInt5348 <= local200) {
							local200 = Static260.anInt5348;
						}
						while (local179 < local183) {
							while (local185 < local200) {
								Static223.aByteArrayArrayArray3[local160][local179][local185] = 0;
								local185++;
							}
							local179++;
						}
					} else if (local168 == 1) {
						if (Static223.aByteArrayArrayArray3[local160] == null) {
							Static223.aByteArrayArrayArray3[local160] = new byte[Static43.anInt1151 + 1][Static260.anInt5348 + 1];
						}
						for (local179 = 0; local179 < 64; local179 += 4) {
							for (local183 = 0; local183 < 64; local183 += 4) {
								@Pc(295) byte local295 = local70.method5721();
								for (local200 = arg3 + local179; local200 < local179 + arg3 + 4; local200++) {
									for (@Pc(305) int local305 = arg5 + local183; local305 < arg5 + local183 + 4; local305++) {
										if (local200 >= 0 && local200 < Static43.anInt1151 && local305 >= 0 && Static260.anInt5348 > local305) {
											Static223.aByteArrayArrayArray3[local160][local200][local305] = local295;
										}
									}
								}
							}
						}
					} else if (local168 == 2) {
						if (Static223.aByteArrayArrayArray3[local160] == null) {
							Static223.aByteArrayArrayArray3[local160] = new byte[Static43.anInt1151 + 1][Static260.anInt5348 + 1];
						}
						if (local160 > 0) {
							local179 = arg3;
							local183 = arg3 + 64;
							local185 = arg5;
							local200 = arg5 + 64;
							if (arg3 < 0) {
								local179 = 0;
							} else if (Static43.anInt1151 <= arg3) {
								local179 = Static43.anInt1151;
							}
							if (local183 < 0) {
								local183 = 0;
							} else if (Static43.anInt1151 <= local183) {
								local183 = Static43.anInt1151;
							}
							if (arg5 < 0) {
								local185 = 0;
							} else if (Static260.anInt5348 <= arg5) {
								local185 = Static260.anInt5348;
							}
							if (local200 < 0) {
								local200 = 0;
							} else if (Static260.anInt5348 <= local200) {
								local200 = Static260.anInt5348;
							}
							while (local179 < local183) {
								while (local200 > local185) {
									Static223.aByteArrayArrayArray3[local160][local179][local185] = Static223.aByteArrayArrayArray3[local160 - 1][local179][local185];
									local185++;
								}
								local179++;
							}
						}
					}
				}
			}
		}
		@Pc(607) int local607;
		if (!arg8) {
			@Pc(558) Class172 local558 = null;
			while (true) {
				while (local70.anInt6611 < local70.aByteArray82.length) {
					local160 = local70.method5720();
					if (local160 == 0) {
						local558 = new Class172(local70);
					} else if (local160 == 1) {
						local607 = local70.method5720();
						if (local607 > 0) {
							for (local179 = 0; local179 < local607; local179++) {
								@Pc(621) Class1_Sub19_Sub1 local621 = new Class1_Sub19_Sub1(local70);
								if (local621.anInt2491 == 31) {
									@Pc(631) Class181 local631 = Static40.method846(local70.method5715());
									local621.method2021(local631.anInt5620, local631.anInt5614, local631.anInt5612, local631.anInt5615);
								}
								local621.anInt2484 += arg5 << 7;
								local621.anInt2482 += arg3 << 7;
								local185 = local621.anInt2482 >> 7;
								local200 = local621.anInt2484 >> 7;
								if (local185 >= 0 && local200 >= 0 && local185 < Static43.anInt1151 && Static260.anInt5348 > local200) {
									local621.anInt2481 = Static276.anIntArrayArrayArray12[local621.anInt2490][local185][local200] - local621.anInt2481;
									if (arg6.method4279() > 0) {
										Static208.method3738(local621);
									}
								}
							}
						}
					} else if (local160 == 2) {
						if (local558 == null) {
							local558 = new Class172();
						}
						local558.method4542(local70);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local558 != null) {
					for (local160 = 0; local160 < 8; local160++) {
						for (local607 = 0; local607 < 8; local607++) {
							local179 = local160 + (arg3 >> 3);
							local183 = (arg5 >> 3) + local607;
							if (local179 >= 0 && Static43.anInt1151 >> 3 > local179 && local183 >= 0 && Static260.anInt5348 >> 3 > local183) {
								Static186.method3283(local183, local558, local179);
							}
						}
					}
				}
				break;
			}
		}
		if (!local139 && Static223.aByteArrayArrayArray3 != null) {
			for (local145 = 0; local145 < 4; local145++) {
				if (Static223.aByteArrayArrayArray3[local145] != null) {
					for (local160 = 0; local160 < 16; local160++) {
						for (local607 = 0; local607 < 16; local607++) {
							local179 = local160 + (arg3 >> 2);
							local183 = local607 + (arg5 >> 2);
							if (local179 >= 0 && local179 < 26 && local183 >= 0 && local183 < 26) {
								Static223.aByteArrayArrayArray3[local145][local179][local183] = 0;
							}
						}
					}
				}
			}
		}
		if (local137) {
			return Static338.anIntArray660;
		} else {
			return null;
		}
	}
}
