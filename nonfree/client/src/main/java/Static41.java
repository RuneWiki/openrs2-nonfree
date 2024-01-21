import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 aClass3_Sub2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt1106 = 0;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_360 = Static170.method3101("au");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
	public static void method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static90.anInt2564 * 128) {
			arg0 = Static90.anInt2564 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static87.anInt2536 * 128) {
			arg2 = Static87.anInt2536 * 128 - 1;
		}
		Static38.anInt1098++;
		Static168.anInt4089 = Class3_Sub2_Sub2_Sub2.anIntArray127[arg3];
		Static129.anInt3280 = Class3_Sub2_Sub2_Sub2.anIntArray129[arg3];
		Static38.anInt1088 = Class3_Sub2_Sub2_Sub2.anIntArray127[arg4];
		Static141.anInt3613 = Class3_Sub2_Sub2_Sub2.anIntArray129[arg4];
		Static15.aBooleanArrayArray2 = Static34.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static34.anInt1037 = arg0;
		Static125.anInt3217 = arg1;
		Static76.anInt2272 = arg2;
		Static145.anInt3635 = arg0 / 128;
		Static46.anInt1291 = arg2 / 128;
		Static140.anInt3583 = arg5;
		Static48.anInt1372 = Static145.anInt3635 - Static175.anInt4185;
		if (Static48.anInt1372 < 0) {
			Static48.anInt1372 = 0;
		}
		Static126.anInt3249 = Static46.anInt1291 - Static175.anInt4185;
		if (Static126.anInt3249 < 0) {
			Static126.anInt3249 = 0;
		}
		Static38.anInt1091 = Static145.anInt3635 + Static175.anInt4185;
		if (Static38.anInt1091 > Static90.anInt2564) {
			Static38.anInt1091 = Static90.anInt2564;
		}
		Static179.anInt4268 = Static46.anInt1291 + Static175.anInt4185;
		if (Static179.anInt4268 > Static87.anInt2536) {
			Static179.anInt4268 = Static87.anInt2536;
		}
		Static16.method535();
		Static150.anInt3718 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static30.anInt948; local118 < Static7.anInt228; local118++) {
			@Pc(123) Class3_Sub20[][] local123 = Static149.aClass3_Sub20ArrayArrayArray1[local118];
			for (local125 = Static48.anInt1372; local125 < Static38.anInt1091; local125++) {
				for (local128 = Static126.anInt3249; local128 < Static179.anInt4268; local128++) {
					@Pc(135) Class3_Sub20 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt3343 <= arg5 && (Static15.aBooleanArrayArray2[local125 + Static175.anInt4185 - Static145.anInt3635][local128 + Static175.anInt4185 - Static46.anInt1291] || Static35.anIntArrayArrayArray17[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean158 = true;
							local135.aBoolean161 = true;
							if (local135.anInt3336 > 0) {
								local135.aBoolean159 = true;
							} else {
								local135.aBoolean159 = false;
							}
							Static150.anInt3718++;
						} else {
							local135.aBoolean158 = false;
							local135.aBoolean161 = false;
							local135.anInt3344 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static30.anInt948; local210 < Static7.anInt228; local210++) {
			@Pc(215) Class3_Sub20[][] local215 = Static149.aClass3_Sub20ArrayArrayArray1[local210];
			for (local128 = -Static175.anInt4185; local128 <= 0; local128++) {
				local223 = Static145.anInt3635 + local128;
				local227 = Static145.anInt3635 - local128;
				if (local223 >= Static48.anInt1372 || local227 < Static38.anInt1091) {
					for (local236 = -Static175.anInt4185; local236 <= 0; local236++) {
						local241 = Static46.anInt1291 + local236;
						local245 = Static46.anInt1291 - local236;
						@Pc(257) Class3_Sub20 local257;
						if (local223 >= Static48.anInt1372) {
							if (local241 >= Static126.anInt3249) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean158) {
									Static165.method3034(local257, true);
								}
							}
							if (local245 < Static179.anInt4268) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean158) {
									Static165.method3034(local257, true);
								}
							}
						}
						if (local227 < Static38.anInt1091) {
							if (local241 >= Static126.anInt3249) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean158) {
									Static165.method3034(local257, true);
								}
							}
							if (local245 < Static179.anInt4268) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean158) {
									Static165.method3034(local257, true);
								}
							}
						}
						if (Static150.anInt3718 == 0) {
							Static163.aBoolean187 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static30.anInt948; local125 < Static7.anInt228; local125++) {
			@Pc(341) Class3_Sub20[][] local341 = Static149.aClass3_Sub20ArrayArrayArray1[local125];
			for (local223 = -Static175.anInt4185; local223 <= 0; local223++) {
				local227 = Static145.anInt3635 + local223;
				local236 = Static145.anInt3635 - local223;
				if (local227 >= Static48.anInt1372 || local236 < Static38.anInt1091) {
					for (local241 = -Static175.anInt4185; local241 <= 0; local241++) {
						local245 = Static46.anInt1291 + local241;
						@Pc(371) int local371 = Static46.anInt1291 - local241;
						@Pc(383) Class3_Sub20 local383;
						if (local227 >= Static48.anInt1372) {
							if (local245 >= Static126.anInt3249) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean158) {
									Static165.method3034(local383, false);
								}
							}
							if (local371 < Static179.anInt4268) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean158) {
									Static165.method3034(local383, false);
								}
							}
						}
						if (local236 < Static38.anInt1091) {
							if (local245 >= Static126.anInt3249) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean158) {
									Static165.method3034(local383, false);
								}
							}
							if (local371 < Static179.anInt4268) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean158) {
									Static165.method3034(local383, false);
								}
							}
						}
						if (Static150.anInt3718 == 0) {
							Static163.aBoolean187 = false;
							return;
						}
					}
				}
			}
		}
		Static163.aBoolean187 = false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIBI)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) long local8 = Static80.method2760(arg4, arg1, arg0);
		@Pc(19) int local19;
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (local8 != 0L) {
			local19 = (int) local8 >> 20 & 0x3;
			local26 = (int) local8 >> 14 & 0x1F;
			local28 = arg3;
			@Pc(31) int[] local31 = Static4.aClass3_Sub2_Sub2_Sub4_1.anIntArray222;
			local47 = (103 - arg0) * 4 * 512 + arg1 * 4 + 24624;
			local54 = Integer.MAX_VALUE & (int) (local8 >>> 32);
			if (local8 > 0L) {
				local28 = arg2;
			}
			@Pc(68) Class3_Sub2_Sub18 local68 = Static86.method1991(local54);
			if (local68.anInt4246 == -1) {
				if (local26 == 0 || local26 == 2) {
					if (local19 == 0) {
						local31[local47] = local28;
						local31[local47 + 512] = local28;
						local31[local47 + 1024] = local28;
						local31[local47 + 1536] = local28;
					} else if (local19 == 1) {
						local31[local47] = local28;
						local31[local47 + 1] = local28;
						local31[local47 + 2] = local28;
						local31[local47 + 3] = local28;
					} else if (local19 == 2) {
						local31[local47 + 3] = local28;
						local31[local47 + 512 + 3] = local28;
						local31[local47 + 1024 + 3] = local28;
						local31[local47 + 1539] = local28;
					} else if (local19 == 3) {
						local31[local47 + 1536] = local28;
						local31[local47 + 1536 + 1] = local28;
						local31[local47 + 1536 + 2] = local28;
						local31[local47 + 1539] = local28;
					}
				}
				if (local26 == 3) {
					if (local19 == 0) {
						local31[local47] = local28;
					} else if (local19 == 1) {
						local31[local47 + 3] = local28;
					} else if (local19 == 2) {
						local31[local47 + 3 + 1536] = local28;
					} else if (local19 == 3) {
						local31[local47 + 1536] = local28;
					}
				}
				if (local26 == 2) {
					if (local19 == 3) {
						local31[local47] = local28;
						local31[local47 + 512] = local28;
						local31[local47 + 1024] = local28;
						local31[local47 + 1536] = local28;
					} else if (local19 == 0) {
						local31[local47] = local28;
						local31[local47 + 1] = local28;
						local31[local47 + 2] = local28;
						local31[local47 + 3] = local28;
					} else if (local19 == 1) {
						local31[local47 + 3] = local28;
						local31[local47 + 515] = local28;
						local31[local47 + 1027] = local28;
						local31[local47 + 1536 + 3] = local28;
					} else if (local19 == 2) {
						local31[local47 + 1536] = local28;
						local31[local47 + 1537] = local28;
						local31[local47 + 1536 + 2] = local28;
						local31[local47 + 3 + 1536] = local28;
					}
				}
			} else {
				@Pc(77) Class3_Sub2_Sub2_Sub3 local77 = Static122.aClass3_Sub2_Sub2_Sub3Array8[local68.anInt4246];
				if (local77 != null) {
					@Pc(90) int local90 = (local68.anInt4226 * 4 - local77.anInt1014) / 2;
					@Pc(101) int local101 = (local68.anInt4242 * 4 - local77.anInt1013) / 2;
					local77.method840(local101 + arg1 * 4 + 48, local90 + (48 - -((104 - arg0 - local68.anInt4226) * 4)));
				}
			}
		}
		local8 = Static172.method3138(arg4, arg1, arg0);
		if (local8 != 0L) {
			local19 = (int) local8 >> 20 & 0x3;
			local26 = (int) local8 >> 14 & 0x1F;
			local28 = (int) (local8 >>> 32) & Integer.MAX_VALUE;
			@Pc(451) Class3_Sub2_Sub18 local451 = Static86.method1991(local28);
			@Pc(486) int local486;
			if (local451.anInt4246 != -1) {
				@Pc(552) Class3_Sub2_Sub2_Sub3 local552 = Static122.aClass3_Sub2_Sub2_Sub3Array8[local451.anInt4246];
				if (local552 != null) {
					local54 = (local451.anInt4242 * 4 - local552.anInt1013) / 2;
					local486 = (local451.anInt4226 * 4 - local552.anInt1014) / 2;
					local552.method840(arg1 * 4 + local54 + 48, local486 + 48 + (-local451.anInt4226 + -arg0 + 104) * 4);
				}
			} else if (local26 == 9) {
				local47 = 15658734;
				if (local8 > 0L) {
					local47 = 15597568;
				}
				@Pc(471) int[] local471 = Static4.aClass3_Sub2_Sub2_Sub4_1.anIntArray222;
				local486 = arg1 * 4 + (52736 - arg0 * 512) * 4 + 24624;
				if (local19 == 0 || local19 == 2) {
					local471[local486 + 1536] = local47;
					local471[local486 + 1 + 1024] = local47;
					local471[local486 + 514] = local47;
					local471[local486 + 3] = local47;
				} else {
					local471[local486] = local47;
					local471[local486 + 1 + 512] = local47;
					local471[local486 + 2 + 1024] = local47;
					local471[local486 + 3 + 1536] = local47;
				}
			}
		}
		local8 = Static74.method1709(arg4, arg1, arg0);
		if (local8 == 0L) {
			return;
		}
		local19 = Integer.MAX_VALUE & (int) (local8 >>> 32);
		@Pc(631) Class3_Sub2_Sub18 local631 = Static86.method1991(local19);
		if (local631.anInt4246 == -1) {
			return;
		}
		@Pc(641) Class3_Sub2_Sub2_Sub3 local641 = Static122.aClass3_Sub2_Sub2_Sub3Array8[local631.anInt4246];
		if (local641 != null) {
			@Pc(654) int local654 = (local631.anInt4242 * 4 - local641.anInt1013) / 2;
			local47 = (local631.anInt4226 * 4 - local641.anInt1014) / 2;
			local641.method840(arg1 * 4 + local654 + 48, local47 + (-local631.anInt4226 + 104 + -arg0) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V")
	public static void method925() {
		aClass7_Sub1_5 = null;
		aClass28_360 = null;
		aCanvas1 = null;
		aClass3_Sub2_Sub2_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)I")
	public static int method928() {
		@Pc(1) int local1 = 3;
		if (Static169.anInt683 < 310) {
			@Pc(10) int local10 = Static28.anInt900 >> 7;
			@Pc(14) int local14 = Static85.anInt2512 >> 7;
			if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][local10][local14] & 0x4) != 0) {
				local1 = Static171.anInt4109;
			}
			@Pc(34) int local34 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7;
			@Pc(42) int local42;
			if (local34 > local14) {
				local42 = local34 - local14;
			} else {
				local42 = local14 - local34;
			}
			@Pc(53) int local53 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7;
			@Pc(61) int local61;
			if (local53 <= local10) {
				local61 = local10 - local53;
			} else {
				local61 = local53 - local10;
			}
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (local61 <= local42) {
				local76 = local61 * 65536 / local42;
				local78 = 32768;
				while (local34 != local14) {
					local78 += local76;
					if (local14 < local34) {
						local14++;
					} else if (local14 > local34) {
						local14--;
					}
					if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][local10][local14] & 0x4) != 0) {
						local1 = Static171.anInt4109;
					}
					if (local78 >= 65536) {
						if (local10 < local53) {
							local10++;
						} else if (local10 > local53) {
							local10--;
						}
						if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][local10][local14] & 0x4) != 0) {
							local1 = Static171.anInt4109;
						}
						local78 -= 65536;
					}
				}
			} else {
				local76 = local42 * 65536 / local61;
				local78 = 32768;
				while (local53 != local10) {
					local78 += local76;
					if (local10 < local53) {
						local10++;
					} else if (local10 > local53) {
						local10--;
					}
					if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][local10][local14] & 0x4) != 0) {
						local1 = Static171.anInt4109;
					}
					if (local78 >= 65536) {
						if (local14 < local34) {
							local14++;
						} else if (local34 < local14) {
							local14--;
						}
						local78 -= 65536;
						if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][local10][local14] & 0x4) != 0) {
							local1 = Static171.anInt4109;
						}
					}
				}
			}
		}
		if ((Static157.aByteArrayArrayArray41[Static171.anInt4109][Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7][Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7] & 0x4) != 0) {
			local1 = Static171.anInt4109;
		}
		return local1;
	}
}
