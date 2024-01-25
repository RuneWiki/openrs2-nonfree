import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)Lclient!hn;")
	public static Class94 method5380(@OriginalArg(1) int arg0) {
		@Pc(10) Class94 local10 = (Class94) Static250.aClass107_31.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static44.aClass104_190.method2756(33, arg0);
		local10 = new Class94();
		if (local28 != null) {
			local10.method2506(new Class2_Sub12(local28), arg0);
		}
		Static250.aClass107_31.method3018((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZ[Lclient!ek;ILclient!dr;[BII)[I")
	public static int[] method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class61[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg2) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class61 local15 = arg3[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = arg7 + local17;
						local31 = local21 + arg1;
						if (local27 >= 0 && local27 < Static66.anInt1177 && local31 >= 0 && local31 < Static12.anInt213) {
							local15.method1601(local27, local31);
						}
					}
				}
			}
		}
		@Pc(69) Class2_Sub12 local69 = new Class2_Sub12(arg6);
		@Pc(73) int local73 = arg7 + arg0;
		local17 = arg1 + arg8;
		for (local21 = 0; local21 < arg4; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static281.method4797(arg2, local21, local27 + arg7, local27 + local73, arg1 + local31, local69, false, 0, 0, 0, local31 + local17);
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) int local149;
		@Pc(208) int local208;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(272) int local272;
		@Pc(253) int local253;
		while (local69.aByteArray30.length > local69.anInt3606) {
			local149 = local69.method3124();
			if (local149 == 128) {
				Static311.anIntArray475[0] = local69.method3104();
				Static311.anIntArray475[1] = local69.method3108();
				Static311.anIntArray475[2] = local69.method3108();
				Static311.anIntArray475[3] = local69.method3108();
				Static311.anIntArray475[4] = local69.method3104();
				local139 = true;
			} else {
				if (local149 != 129) {
					local69.anInt3606--;
					break;
				}
				if (Static126.aByteArrayArrayArray4 == null) {
					Static126.aByteArrayArrayArray4 = new byte[4][][];
				}
				local141 = true;
				for (local208 = 0; local208 < 4; local208++) {
					@Pc(214) byte local214 = local69.method3122();
					if (local214 == 0 && Static126.aByteArrayArrayArray4[local208] != null) {
						local247 = arg7;
						local251 = arg7 + 64;
						local253 = arg1;
						local272 = arg1 + 64;
						if (local251 < 0) {
							local251 = 0;
						} else if (Static66.anInt1177 <= local251) {
							local251 = Static66.anInt1177;
						}
						if (arg7 < 0) {
							local247 = 0;
						} else if (Static66.anInt1177 <= arg7) {
							local247 = Static66.anInt1177;
						}
						if (arg1 < 0) {
							local253 = 0;
						} else if (Static12.anInt213 <= arg1) {
							local253 = Static12.anInt213;
						}
						if (local272 < 0) {
							local272 = 0;
						} else if (local272 >= Static12.anInt213) {
							local272 = Static12.anInt213;
						}
						while (local247 < local251) {
							while (local272 > local253) {
								Static126.aByteArrayArrayArray4[local208][local247][local253] = 0;
								local253++;
							}
							local247++;
						}
					} else if (local214 == 1) {
						if (Static126.aByteArrayArrayArray4[local208] == null) {
							Static126.aByteArrayArrayArray4[local208] = new byte[Static66.anInt1177 + 1][Static12.anInt213 + 1];
						}
						for (local247 = 0; local247 < 64; local247 += 4) {
							for (local251 = 0; local251 < 64; local251 += 4) {
								@Pc(369) byte local369 = local69.method3122();
								for (local272 = arg7 + local247; local272 < arg7 + local247 + 4; local272++) {
									for (@Pc(379) int local379 = local251 + arg1; local379 < arg1 + local251 + 4; local379++) {
										if (local272 >= 0 && local272 < Static66.anInt1177 && local379 >= 0 && Static12.anInt213 > local379) {
											Static126.aByteArrayArrayArray4[local208][local272][local379] = local369;
										}
									}
								}
							}
						}
					} else if (local214 == 2) {
						if (Static126.aByteArrayArrayArray4[local208] == null) {
							Static126.aByteArrayArrayArray4[local208] = new byte[Static66.anInt1177 + 1][Static12.anInt213 + 1];
						}
						if (local208 > 0) {
							local247 = arg7;
							local251 = arg7 + 64;
							local253 = arg1;
							if (arg1 < 0) {
								local253 = 0;
							} else if (Static12.anInt213 <= arg1) {
								local253 = Static12.anInt213;
							}
							local272 = arg1 + 64;
							if (arg7 < 0) {
								local247 = 0;
							} else if (arg7 >= Static66.anInt1177) {
								local247 = Static66.anInt1177;
							}
							if (local251 < 0) {
								local251 = 0;
							} else if (Static66.anInt1177 <= local251) {
								local251 = Static66.anInt1177;
							}
							if (local272 < 0) {
								local272 = 0;
							} else if (local272 >= Static12.anInt213) {
								local272 = Static12.anInt213;
							}
							while (local251 > local247) {
								while (local253 < local272) {
									Static126.aByteArrayArrayArray4[local208][local247][local253] = Static126.aByteArrayArrayArray4[local208 - 1][local247][local253];
									local253++;
								}
								local247++;
							}
						}
					}
				}
			}
		}
		@Pc(573) int local573;
		if (!arg2) {
			@Pc(548) Class191 local548 = null;
			while (true) {
				while (local69.anInt3606 < local69.aByteArray30.length) {
					local208 = local69.method3124();
					if (local208 == 0) {
						local548 = new Class191(local69);
					} else if (local208 == 1) {
						local573 = local69.method3124();
						if (local573 > 0) {
							for (local247 = 0; local247 < local573; local247++) {
								@Pc(587) Class2_Sub10_Sub1 local587 = new Class2_Sub10_Sub1(local69);
								if (local587.anInt4060 == 31) {
									@Pc(601) Class126 local601 = Static357.method5712(local69.method3104());
									local587.method3478(local601.anInt4025, local601.anInt4026, local601.anInt4027, local601.anInt4030);
								}
								local587.anInt4039 += arg7 << 7;
								local587.anInt4043 += arg1 << 7;
								local253 = local587.anInt4039 >> 7;
								local272 = local587.anInt4043 >> 7;
								if (local253 >= 0 && local272 >= 0 && Static66.anInt1177 > local253 && Static12.anInt213 > local272) {
									local587.anInt4045 = Static327.anIntArrayArrayArray12[local587.anInt4052][local253][local272] - local587.anInt4045;
									if (arg5.method3740() > 0) {
										Static319.method5305(local587);
									}
								}
							}
						}
					} else if (local208 == 2) {
						if (local548 == null) {
							local548 = new Class191();
						}
						local548.method5156(local69);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local548 != null) {
					for (local208 = 0; local208 < 8; local208++) {
						for (local573 = 0; local573 < 8; local573++) {
							local247 = local208 + (arg7 >> 3);
							local251 = (arg1 >> 3) + local573;
							if (local247 >= 0 && local247 < Static66.anInt1177 >> 3 && local251 >= 0 && Static12.anInt213 >> 3 > local251) {
								Static123.method2393(local548, local247, local251);
							}
						}
					}
				}
				break;
			}
		}
		if (!local141 && Static126.aByteArrayArrayArray4 != null) {
			for (local149 = 0; local149 < 4; local149++) {
				if (Static126.aByteArrayArrayArray4[local149] != null) {
					for (local208 = 0; local208 < 16; local208++) {
						for (local573 = 0; local573 < 16; local573++) {
							local247 = local208 + (arg7 >> 2);
							local251 = local573 + (arg1 >> 2);
							if (local247 >= 0 && local247 < 26 && local251 >= 0 && local251 < 26) {
								Static126.aByteArrayArrayArray4[local149][local247][local251] = 0;
							}
						}
					}
				}
			}
		}
		if (local139) {
			return Static311.anIntArray475;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	public static void method5383(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static197.anInt4298 = 0;
		Static38.anInt553 = arg0;
		Static108.anInt2266 = 0;
		Static205.anInt4504 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	public static void method5384() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static190.anInt6229 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!on;ILclient!on;ZB)I")
	public static int method5385(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg0.anInt5088;
			local14 = arg2.anInt5088;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static289.method4069(arg2.method4324().aString39, Static239.anInt2803, arg0.method4324().aString39);
		} else if (arg1 == 3) {
			if (arg0.aString48.equals("-")) {
				if (arg2.aString48.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString48.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static289.method4069(arg2.aString48, Static239.anInt2803, arg0.aString48);
			}
		} else if (arg1 == 4) {
			if (arg0.method4319()) {
				return arg2.method4319() ? 0 : 1;
			} else if (arg2.method4319()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method4322()) {
				return arg2.method4322() ? 0 : 1;
			} else if (arg2.method4322()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method4323()) {
				return arg2.method4323() ? 0 : 1;
			} else if (arg2.method4323()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method4321()) {
				return arg2.method4321() ? 0 : 1;
			} else if (arg2.method4321()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg0.anInt5097;
			local14 = arg2.anInt5097;
			if (arg3) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt5093 - arg2.anInt5093;
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)Z")
	public static boolean method5387() {
		try {
			if (Static230.anInt5823 == 2) {
				if (Static133.aClass2_Sub42_2 == null) {
					Static133.aClass2_Sub42_2 = Static380.method5556(Static341.aClass104_24, Static139.anInt3012, Static167.anInt3809);
					if (Static133.aClass2_Sub42_2 == null) {
						return false;
					}
				}
				if (Static214.aClass76_1 == null) {
					Static214.aClass76_1 = new Class76(Static155.aClass104_93, Static108.aClass104_71);
				}
				if (Static349.aClass2_Sub11_Sub1_5.method1410(Static214.aClass76_1, Static209.aClass104_194, Static133.aClass2_Sub42_2)) {
					Static349.aClass2_Sub11_Sub1_5.method1409();
					Static349.aClass2_Sub11_Sub1_5.method1429(Static81.anInt1526);
					Static349.aClass2_Sub11_Sub1_5.method1428(Static319.aBoolean562, Static133.aClass2_Sub42_2);
					Static230.anInt5823 = 0;
					Static214.aClass76_1 = null;
					Static341.aClass104_24 = null;
					Static133.aClass2_Sub42_2 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static349.aClass2_Sub11_Sub1_5.method1411();
			Static214.aClass76_1 = null;
			Static341.aClass104_24 = null;
			Static230.anInt5823 = 0;
			Static133.aClass2_Sub42_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ec;ILjava/awt/Canvas;)Lclient!dr;")
	public static Class37 method5388(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class37_Sub2(arg2, arg0, arg1);
	}
}
