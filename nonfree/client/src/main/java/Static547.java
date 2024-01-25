import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	public static int anInt9146;

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "Lclient!eg;")
	public static final Class77 aClass77_7 = new Class77();

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
	public static int anInt9149 = 0;

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "[I")
	public static final int[] anIntArray578 = new int[2048];

	@OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
	public static int anInt9151 = 0;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[BIIIII)V")
	public static void method7463(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static166.method6223(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static166.method6223(arg0)) {
			@Pc(33) int local33 = Static476.method6629(arg5);
			@Pc(35) int local35 = 0;
			@Pc(50) int local50 = arg4 >= arg0 ? arg0 : arg4;
			@Pc(54) int local54 = arg4 >> 1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(60) byte[] local60 = arg1;
			@Pc(67) byte[] local67 = new byte[local33 * local58 * local54];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local35, arg2, arg4, arg0, 0, arg5, 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(88) int local88 = arg4 * local33;
				for (@Pc(90) int local90 = 0; local90 < local33; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(100) int local100 = local88 + local90;
					for (@Pc(102) int local102 = 0; local102 < local58; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local54; local106++) {
							@Pc(112) byte local112 = local60[local96];
							local96 += local33;
							@Pc(122) int local122 = local112 + local60[local96];
							@Pc(128) int local128 = local122 + local60[local100];
							local96 += local33;
							local100 += local33;
							@Pc(142) int local142 = local128 + local60[local100];
							local100 += local33;
							local67[local94] = (byte) (local142 >> 2);
							local94 += local33;
						}
						local96 += local88;
						local100 += local88;
					}
				}
				@Pc(187) byte[] local187 = local67;
				local67 = local60;
				local60 = local187;
				arg0 = local58;
				arg4 = local54;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local35++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!ac;BI)Ljava/lang/String;")
	public static String method7466(@OriginalArg(0) Class1_Sub3 arg0) {
		try {
			@Pc(7) int local7 = arg0.method7971();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt9802 += Static231.aClass301_1.method6445(local7, local15, arg0.anInt9802, arg0.aByteArray104, 0);
			return Static8.method4852(local7, local15, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(Z)Z")
	public static boolean method7471() {
		try {
			@Pc(7) Class200 local7 = new Class200();
			@Pc(12) byte[] local12 = local7.method4335(Static572.aByteArray100);
			Static412.method5863(local12);
			return true;
		} catch (@Pc(19) Exception local19) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!ls;Z)V")
	public static void method7474(@OriginalArg(0) Class11_Sub1_Sub1_Sub3 arg0) {
		@Pc(16) Class197 local16;
		if (arg0.anInt7577 != -1) {
			local16 = Static223.aClass245_1.method5312(arg0.anInt7577);
			if (local16 == null || local16.anIntArray284 == null) {
				arg0.aBoolean575 = false;
				arg0.anInt7577 = -1;
			} else {
				label357: {
					arg0.anInt7530++;
					if (local16.anIntArray284.length > arg0.anInt7593 && local16.anIntArray279[arg0.anInt7593] < arg0.anInt7530) {
						arg0.anInt7525++;
						arg0.anInt7530 = 1;
						arg0.anInt7593++;
						if (!arg0.aBoolean577) {
							Static473.method6515(arg0, local16, arg0.anInt7593);
						}
					}
					if (arg0.anInt7593 >= local16.anIntArray284.length) {
						arg0.anInt7530 = 0;
						arg0.anInt7593 = 0;
						if (arg0.aBoolean575) {
							arg0.anInt7577 = arg0.method6073().method2600();
							if (arg0.anInt7577 == -1) {
								arg0.aBoolean575 = false;
								break label357;
							}
							local16 = Static223.aClass245_1.method5312(arg0.anInt7577);
						}
						if (!arg0.aBoolean577) {
							Static473.method6515(arg0, local16, arg0.anInt7593);
						}
					}
					arg0.anInt7525 = arg0.anInt7593 + 1;
					if (local16.anIntArray284 == null) {
						arg0.aBoolean575 = false;
						arg0.anInt7577 = -1;
					} else if (arg0.anInt7525 >= local16.anIntArray284.length) {
						arg0.anInt7525 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(191) Class197 local191;
		@Pc(175) Class134 local175;
		if (arg0.anInt7547 != -1 && arg0.anInt7566 <= Static518.anInt9331) {
			local175 = Static583.aClass256_2.method5466(arg0.anInt7547);
			local178 = local175.anInt3775;
			if (local178 == -1) {
				arg0.anInt7547 = -1;
			} else {
				label358: {
					local191 = Static223.aClass245_1.method5312(local178);
					if (local175.aBoolean272) {
						if (local191.anInt5073 == 3) {
							if (arg0.anInt7607 > 0 && Static518.anInt9331 >= arg0.anInt7584 && arg0.anInt7568 < Static518.anInt9331) {
								arg0.anInt7547 = -1;
								break label358;
							}
						} else if (local191.anInt5073 == 1 && arg0.anInt7607 > 0 && Static518.anInt9331 >= arg0.anInt7584 && arg0.anInt7568 < Static518.anInt9331) {
							arg0.anInt7566 = Static518.anInt9331 + 1;
							break label358;
						}
					}
					if (local191 == null || local191.anIntArray284 == null) {
						arg0.anInt7547 = -1;
					} else {
						if (arg0.anInt7575 < 0) {
							arg0.anInt7575 = 0;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, 0);
							}
						}
						arg0.anInt7574++;
						if (local191.anIntArray284.length > arg0.anInt7575 && arg0.anInt7574 > local191.anIntArray279[arg0.anInt7575]) {
							arg0.anInt7574 = 1;
							arg0.anInt7575++;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, arg0.anInt7575);
							}
						}
						if (arg0.anInt7575 >= local191.anIntArray284.length) {
							if (local175.aBoolean272) {
								arg0.anInt7561++;
								arg0.anInt7575 -= local191.anInt5063;
								if (local191.anInt5069 <= arg0.anInt7561) {
									arg0.anInt7547 = -1;
								} else if (arg0.anInt7575 < 0 || local191.anIntArray284.length <= arg0.anInt7575) {
									arg0.anInt7547 = -1;
								} else if (!arg0.aBoolean577) {
									Static473.method6515(arg0, local191, arg0.anInt7575);
								}
							} else {
								arg0.anInt7547 = -1;
							}
						}
						arg0.anInt7544 = arg0.anInt7575 + 1;
						if (local191.anIntArray284.length <= arg0.anInt7544) {
							if (local175.aBoolean272) {
								arg0.anInt7544 -= local191.anInt5063;
								if (local191.anInt5069 <= arg0.anInt7561 + 1) {
									arg0.anInt7544 = -1;
								} else if (arg0.anInt7544 < 0 || local191.anIntArray284.length <= arg0.anInt7544) {
									arg0.anInt7544 = -1;
								}
							} else {
								arg0.anInt7544 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7570 != -1 && Static518.anInt9331 >= arg0.anInt7585) {
			local175 = Static583.aClass256_2.method5466(arg0.anInt7570);
			local178 = local175.anInt3775;
			if (local178 == -1) {
				arg0.anInt7570 = -1;
			} else {
				label361: {
					local191 = Static223.aClass245_1.method5312(local178);
					if (local175.aBoolean272) {
						if (local191.anInt5073 == 3) {
							if (arg0.anInt7607 > 0 && Static518.anInt9331 >= arg0.anInt7584 && arg0.anInt7568 < Static518.anInt9331) {
								arg0.anInt7570 = -1;
								break label361;
							}
						} else if (local191.anInt5073 == 1 && arg0.anInt7607 > 0 && Static518.anInt9331 >= arg0.anInt7584 && Static518.anInt9331 > arg0.anInt7568) {
							arg0.anInt7585 = Static518.anInt9331 + 1;
							break label361;
						}
					}
					if (local191 == null || local191.anIntArray284 == null) {
						arg0.anInt7570 = -1;
					} else {
						if (arg0.anInt7600 < 0) {
							arg0.anInt7600 = 0;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, 0);
							}
						}
						arg0.anInt7592++;
						if (arg0.anInt7600 < local191.anIntArray284.length && local191.anIntArray279[arg0.anInt7600] < arg0.anInt7592) {
							arg0.anInt7600++;
							arg0.anInt7592 = 1;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, arg0.anInt7600);
							}
						}
						if (arg0.anInt7600 >= local191.anIntArray284.length) {
							if (local175.aBoolean272) {
								arg0.anInt7549++;
								arg0.anInt7600 -= local191.anInt5063;
								if (arg0.anInt7549 >= local191.anInt5069) {
									arg0.anInt7570 = -1;
								} else if (arg0.anInt7600 < 0 || arg0.anInt7600 >= local191.anIntArray284.length) {
									arg0.anInt7570 = -1;
								} else if (!arg0.aBoolean577) {
									Static473.method6515(arg0, local191, arg0.anInt7600);
								}
							} else {
								arg0.anInt7570 = -1;
							}
						}
						arg0.anInt7533 = arg0.anInt7600 + 1;
						if (arg0.anInt7533 >= local191.anIntArray284.length) {
							if (local175.aBoolean272) {
								arg0.anInt7533 -= local191.anInt5063;
								if (arg0.anInt7549 + 1 >= local191.anInt5069) {
									arg0.anInt7533 = -1;
								} else if (arg0.anInt7533 < 0 || local191.anIntArray284.length <= arg0.anInt7533) {
									arg0.anInt7533 = -1;
								}
							} else {
								arg0.anInt7533 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7591 != -1 && arg0.anInt7532 <= 1) {
			local16 = Static223.aClass245_1.method5312(arg0.anInt7591);
			if (local16.anInt5073 == 3) {
				if (arg0.anInt7607 > 0 && arg0.anInt7584 <= Static518.anInt9331 && Static518.anInt9331 > arg0.anInt7568) {
					arg0.anIntArray448 = null;
					arg0.anInt7591 = -1;
				}
			} else if (local16.anInt5073 == 1 && arg0.anInt7607 > 0 && Static518.anInt9331 >= arg0.anInt7584 && Static518.anInt9331 > arg0.anInt7568) {
				arg0.anInt7532 = 2;
			}
		}
		if (arg0.anInt7591 != -1 && arg0.anInt7532 == 0) {
			local16 = Static223.aClass245_1.method5312(arg0.anInt7591);
			if (local16 == null || local16.anIntArray284 == null) {
				arg0.anIntArray448 = null;
				arg0.anInt7591 = -1;
			} else {
				arg0.anInt7580++;
				if (local16.anIntArray284.length > arg0.anInt7558 && arg0.anInt7580 > local16.anIntArray279[arg0.anInt7558]) {
					arg0.anInt7558++;
					arg0.anInt7580 = 1;
					if (!arg0.aBoolean577) {
						Static473.method6515(arg0, local16, arg0.anInt7558);
					}
				}
				if (local16.anIntArray284.length <= arg0.anInt7558) {
					arg0.anInt7558 -= local16.anInt5063;
					arg0.anInt7545++;
					if (local16.anInt5069 <= arg0.anInt7545) {
						arg0.anIntArray448 = null;
						arg0.anInt7591 = -1;
					} else if (arg0.anInt7558 < 0 || arg0.anInt7558 >= local16.anIntArray284.length) {
						arg0.anInt7591 = -1;
						arg0.anIntArray448 = null;
					} else if (!arg0.aBoolean577) {
						Static473.method6515(arg0, local16, arg0.anInt7558);
					}
				}
				arg0.anInt7595 = arg0.anInt7558 + 1;
				if (local16.anIntArray284.length <= arg0.anInt7595) {
					arg0.anInt7595 -= local16.anInt5063;
					if (arg0.anInt7545 + 1 >= local16.anInt5069) {
						arg0.anInt7595 = -1;
					} else if (arg0.anInt7595 < 0 || local16.anIntArray284.length <= arg0.anInt7595) {
						arg0.anInt7595 = -1;
					}
				}
			}
		}
		if (arg0.anInt7532 > 0) {
			arg0.anInt7532--;
		}
		for (@Pc(998) int local998 = 0; local998 < arg0.aClass221Array3.length; local998++) {
			@Pc(1005) Class221 local1005 = arg0.aClass221Array3[local998];
			if (local1005 != null) {
				if (local1005.anInt5856 > 0) {
					local1005.anInt5856--;
				} else {
					local191 = Static223.aClass245_1.method5312(local1005.anInt5858);
					if (local191 == null || local191.anIntArray284 == null) {
						arg0.aClass221Array3[local998] = null;
					} else {
						local1005.anInt5854++;
						if (local191.anIntArray284.length > local1005.anInt5860 && local1005.anInt5854 > local191.anIntArray279[local1005.anInt5860]) {
							local1005.anInt5860++;
							local1005.anInt5854 = 1;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, local1005.anInt5860);
							}
						}
						if (local191.anIntArray284.length <= local1005.anInt5860) {
							local1005.anInt5859++;
							local1005.anInt5860 -= local191.anInt5063;
							if (local1005.anInt5859 >= local191.anInt5069) {
								arg0.aClass221Array3[local998] = null;
							} else if (local1005.anInt5860 < 0 || local1005.anInt5860 >= local191.anIntArray284.length) {
								arg0.aClass221Array3[local998] = null;
							} else if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local191, local1005.anInt5860);
							}
						}
						local1005.anInt5857 = local1005.anInt5860 + 1;
						if (local1005.anInt5857 >= local191.anIntArray284.length) {
							local1005.anInt5857 -= local191.anInt5063;
							if (local1005.anInt5859 + 1 >= local191.anInt5069) {
								local1005.anInt5857 = -1;
							} else if (local1005.anInt5857 < 0 || local1005.anInt5857 >= local191.anIntArray284.length) {
								local1005.anInt5857 = -1;
							}
						}
					}
				}
			}
		}
	}
}
