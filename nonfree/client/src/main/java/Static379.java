import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public static int anInt4380;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!fq;")
	public static Class82 aClass82_4;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "J")
	public static long aLong134;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!so", name = "y", descriptor = "I")
	public static int anInt4394 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!wl;I)V")
	public static void method3484(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		arg0.anInt6177 = 0;
		@Pc(19) Class143 local19;
		if (arg0.lb != -1) {
			local19 = Static271.aClass219_4.method4752(arg0.lb);
			if (local19 == null || local19.anIntArray241 == null) {
				arg0.aBoolean410 = false;
				arg0.lb = -1;
			} else {
				label394: {
					arg0.anInt6164++;
					if (local19.anIntArray241.length > arg0.anInt6145 && local19.anIntArray239[arg0.anInt6145] < arg0.anInt6164) {
						arg0.anInt6160++;
						arg0.anInt6145++;
						arg0.anInt6164 = 1;
						Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local19, arg0.anInt7500, arg0.anInt6145, arg0.anInt7502, arg0.aByte105);
					}
					if (local19.anIntArray241.length <= arg0.anInt6145) {
						arg0.anInt6164 = 0;
						arg0.anInt6145 = 0;
						if (arg0.aBoolean410) {
							arg0.lb = arg0.method4910().method2804();
							if (arg0.lb == -1) {
								arg0.aBoolean410 = false;
								break label394;
							}
							local19 = Static271.aClass219_4.method4752(arg0.lb);
						}
						Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0, local19, arg0.anInt7500, arg0.anInt6145, arg0.anInt7502, arg0.aByte105);
					}
					arg0.anInt6160 = arg0.anInt6145 + 1;
					if (local19.anIntArray241.length <= arg0.anInt6160) {
						arg0.anInt6160 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(187) Class143 local187;
		@Pc(176) Class63 local176;
		if (arg0.anInt6125 != -1 && arg0.anInt6152 <= Static85.anInt1536) {
			local176 = Static3.aClass203_1.method4360(arg0.anInt6125);
			local179 = local176.anInt1705;
			if (local179 == -1) {
				arg0.anInt6125 = -1;
			} else {
				label396: {
					local187 = Static271.aClass219_4.method4752(local179);
					if (local176.aBoolean114) {
						if (local187.anInt3786 == 3) {
							if (arg0.anInt6196 > 0 && arg0.anInt6148 <= Static85.anInt1536 && arg0.anInt6144 < Static85.anInt1536) {
								arg0.anInt6125 = -1;
								break label396;
							}
						} else if (local187.anInt3786 == 1 && arg0.anInt6196 > 0 && Static85.anInt1536 >= arg0.anInt6148 && arg0.anInt6144 < Static85.anInt1536) {
							arg0.anInt6152 = Static85.anInt1536 + 1;
							break label396;
						}
					}
					if (local187 == null || local187.anIntArray241 == null) {
						arg0.anInt6125 = -1;
					} else {
						if (arg0.anInt6149 < 0) {
							arg0.anInt6149 = 0;
							Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0, local187, arg0.anInt7500, 0, arg0.anInt7502, arg0.aByte105);
						}
						arg0.anInt6151++;
						if (arg0.anInt6149 < local187.anIntArray241.length && local187.anIntArray239[arg0.anInt6149] < arg0.anInt6151) {
							arg0.anInt6149++;
							arg0.anInt6151 = 1;
							Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0, local187, arg0.anInt7500, arg0.anInt6149, arg0.anInt7502, arg0.aByte105);
						}
						if (arg0.anInt6149 >= local187.anIntArray241.length) {
							if (local176.aBoolean114) {
								arg0.anInt6135++;
								arg0.anInt6149 -= local187.anInt3784;
								if (arg0.anInt6135 >= local187.anInt3779) {
									arg0.anInt6125 = -1;
								} else if (arg0.anInt6149 >= 0 && arg0.anInt6149 < local187.anIntArray241.length) {
									Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local187, arg0.anInt7500, arg0.anInt6149, arg0.anInt7502, arg0.aByte105);
								} else {
									arg0.anInt6125 = -1;
								}
							} else {
								arg0.anInt6125 = -1;
							}
						}
						arg0.anInt6187 = arg0.anInt6149 + 1;
						if (arg0.anInt6187 >= local187.anIntArray241.length) {
							if (local176.aBoolean114) {
								arg0.anInt6187 -= local187.anInt3784;
								if (local187.anInt3779 <= arg0.anInt6135 + 1) {
									arg0.anInt6187 = -1;
								} else if (arg0.anInt6187 < 0 || arg0.anInt6187 >= local187.anIntArray241.length) {
									arg0.anInt6187 = -1;
								}
							} else {
								arg0.anInt6187 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6173 != -1 && Static85.anInt1536 >= arg0.anInt6123) {
			local176 = Static3.aClass203_1.method4360(arg0.anInt6173);
			local179 = local176.anInt1705;
			if (local179 == -1) {
				arg0.anInt6173 = -1;
			} else {
				label399: {
					local187 = Static271.aClass219_4.method4752(local179);
					if (local176.aBoolean114) {
						if (local187.anInt3786 == 3) {
							if (arg0.anInt6196 > 0 && Static85.anInt1536 >= arg0.anInt6148 && arg0.anInt6144 < Static85.anInt1536) {
								arg0.anInt6173 = -1;
								break label399;
							}
						} else if (local187.anInt3786 == 1 && arg0.anInt6196 > 0 && Static85.anInt1536 >= arg0.anInt6148 && arg0.anInt6144 < Static85.anInt1536) {
							arg0.anInt6123 = Static85.anInt1536 + 1;
							break label399;
						}
					}
					if (local187 == null || local187.anIntArray241 == null) {
						arg0.anInt6173 = -1;
					} else {
						if (arg0.anInt6124 < 0) {
							arg0.anInt6124 = 0;
							Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local187, arg0.anInt7500, 0, arg0.anInt7502, arg0.aByte105);
						}
						arg0.anInt6194++;
						if (local187.anIntArray241.length > arg0.anInt6124 && arg0.anInt6194 > local187.anIntArray239[arg0.anInt6124]) {
							arg0.anInt6124++;
							arg0.anInt6194 = 1;
							Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local187, arg0.anInt7500, arg0.anInt6124, arg0.anInt7502, arg0.aByte105);
						}
						if (local187.anIntArray241.length <= arg0.anInt6124) {
							if (local176.aBoolean114) {
								arg0.anInt6181++;
								arg0.anInt6124 -= local187.anInt3784;
								if (arg0.anInt6181 >= local187.anInt3779) {
									arg0.anInt6173 = -1;
								} else if (arg0.anInt6124 >= 0 && local187.anIntArray241.length > arg0.anInt6124) {
									Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0, local187, arg0.anInt7500, arg0.anInt6124, arg0.anInt7502, arg0.aByte105);
								} else {
									arg0.anInt6173 = -1;
								}
							} else {
								arg0.anInt6173 = -1;
							}
						}
						arg0.anInt6185 = arg0.anInt6124 + 1;
						if (local187.anIntArray241.length <= arg0.anInt6185) {
							if (local176.aBoolean114) {
								arg0.anInt6185 -= local187.anInt3784;
								if (local187.anInt3779 <= arg0.anInt6181 + 1) {
									arg0.anInt6185 = -1;
								} else if (arg0.anInt6185 < 0 || arg0.anInt6185 >= local187.anIntArray241.length) {
									arg0.anInt6185 = -1;
								}
							} else {
								arg0.anInt6185 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6193 != -1 && arg0.anInt6147 <= 1) {
			local19 = Static271.aClass219_4.method4752(arg0.anInt6193);
			if (local19.anInt3786 == 3) {
				if (arg0.anInt6196 > 0 && arg0.anInt6148 <= Static85.anInt1536 && arg0.anInt6144 < Static85.anInt1536) {
					arg0.anInt6193 = -1;
				}
			} else if (local19.anInt3786 == 1 && arg0.anInt6196 > 0 && arg0.anInt6148 <= Static85.anInt1536 && arg0.anInt6144 < Static85.anInt1536) {
				arg0.anInt6147 = 2;
			}
		}
		if (arg0.anInt6193 != -1 && arg0.anInt6147 == 0) {
			local19 = Static271.aClass219_4.method4752(arg0.anInt6193);
			if (local19 == null || local19.anIntArray241 == null) {
				arg0.anInt6193 = -1;
			} else {
				arg0.anInt6143++;
				if (arg0.anInt6117 < local19.anIntArray241.length && local19.anIntArray239[arg0.anInt6117] < arg0.anInt6143) {
					arg0.anInt6117++;
					arg0.anInt6143 = 1;
					Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0, local19, arg0.anInt7500, arg0.anInt6117, arg0.anInt7502, arg0.aByte105);
				}
				if (local19.anIntArray241.length <= arg0.anInt6117) {
					arg0.anInt6159++;
					arg0.anInt6117 -= local19.anInt3784;
					if (arg0.anInt6159 >= local19.anInt3779) {
						arg0.anInt6193 = -1;
					} else if (arg0.anInt6117 >= 0 && arg0.anInt6117 < local19.anIntArray241.length) {
						Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local19, arg0.anInt7500, arg0.anInt6117, arg0.anInt7502, arg0.aByte105);
					} else {
						arg0.anInt6193 = -1;
					}
				}
				arg0.anInt6183 = arg0.anInt6117 + 1;
				if (arg0.anInt6183 >= local19.anIntArray241.length) {
					arg0.anInt6183 -= local19.anInt3784;
					if (local19.anInt3779 <= arg0.anInt6159 + 1) {
						arg0.anInt6183 = -1;
					} else if (arg0.anInt6183 < 0 || arg0.anInt6183 >= local19.anIntArray241.length) {
						arg0.anInt6183 = -1;
					}
				}
				arg0.anInt6177 = local19.anInt3776;
			}
		}
		if (arg0.anInt6147 > 0) {
			arg0.anInt6147--;
		}
		for (@Pc(1037) int local1037 = 0; local1037 < arg0.aClass185Array3.length; local1037++) {
			@Pc(1044) Class185 local1044 = arg0.aClass185Array3[local1037];
			if (local1044 != null) {
				if (local1044.anInt4804 > 0) {
					local1044.anInt4804--;
				} else {
					local187 = Static271.aClass219_4.method4752(local1044.anInt4811);
					if (local187 == null || local187.anIntArray241 == null) {
						arg0.aClass185Array3[local1037] = null;
					} else {
						local1044.anInt4808++;
						if (local187.anIntArray241.length > local1044.anInt4809 && local1044.anInt4808 > local187.anIntArray239[local1044.anInt4809]) {
							local1044.anInt4808 = 1;
							local1044.anInt4809++;
							Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local187, arg0.anInt7500, local1044.anInt4809, arg0.anInt7502, arg0.aByte105);
						}
						if (local187.anIntArray241.length <= local1044.anInt4809) {
							local1044.anInt4807++;
							local1044.anInt4809 -= local187.anInt3784;
							if (local1044.anInt4807 >= local187.anInt3779) {
								arg0.aClass185Array3[local1037] = null;
							} else if (local1044.anInt4809 >= 0 && local1044.anInt4809 < local187.anIntArray241.length) {
								Static340.method4406(arg0 == Static220.aClass2_Sub1_Sub3_Sub2_1, local187, arg0.anInt7500, local1044.anInt4809, arg0.anInt7502, arg0.aByte105);
							} else {
								arg0.aClass185Array3[local1037] = null;
							}
						}
						local1044.anInt4806 = local1044.anInt4809 + 1;
						if (local187.anIntArray241.length <= local1044.anInt4806) {
							local1044.anInt4806 -= local187.anInt3784;
							if (local1044.anInt4807 + 1 >= local187.anInt3779) {
								local1044.anInt4806 = -1;
							} else if (local1044.anInt4806 < 0 || local1044.anInt4806 >= local187.anIntArray241.length) {
								local1044.anInt4806 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)V")
	public static void method3485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static153.anInt6266 = arg3;
		Static410.anInt6845 = arg4;
		Static317.anInt4945 = arg5;
		Static140.anInt2491 = arg0;
		Static464.anInt7333 = arg1;
		Static55.anInt1042 = arg2;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IC)Z")
	public static boolean method3487(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method3488(@OriginalArg(1) int arg0) {
		Static350.anInt5747 = 100;
		Static54.anInt944 = -1;
		Static34.anInt675 = arg0;
		Static320.anInt4977 = 3;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!hg;")
	public static Class99 method3489(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class99_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(CI)Z")
	public static boolean method3490(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static319.aCharArray6;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}
}
