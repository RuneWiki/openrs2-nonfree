import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array5;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "[Lclient!qg;")
	public static Class87_Sub1[] aClass87_Sub1Array2;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
	public static int anInt3681 = 0;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!rg;")
	public static Class151 aClass151_9 = null;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method3124() {
		Static178.aClass98_29.method2571();
		Static252.aClass98_41.method2571();
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Z")
	public static boolean method3125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(12) Class49 local12 = Static175.method2874(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local12.method1110(arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method3126(@OriginalArg(1) Class10_Sub5 arg0) {
		if (arg0.anInt5017 == 0) {
			return;
		}
		@Pc(15) Class31 local15 = arg0.method4191();
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg0.anInt5076 != -1 && arg0.anInt5076 < 32768) {
			@Pc(30) Class10_Sub5_Sub2 local30 = Static110.aClass10_Sub5_Sub2Array1[arg0.anInt5076];
			if (local30 != null) {
				local39 = arg0.anInt5073 - local30.anInt5073;
				local46 = arg0.anInt5016 - local30.anInt5016;
				if (local39 != 0 || local46 != 0) {
					arg0.anInt5018 = (int) (Math.atan2((double) local39, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(96) int local96;
		@Pc(78) int local78;
		if (arg0.anInt5076 >= 32768) {
			local78 = arg0.anInt5076 - 32768;
			if (Static273.anInt5556 == local78) {
				local78 = 2047;
			}
			@Pc(87) Class10_Sub5_Sub1 local87 = Static52.aClass10_Sub5_Sub1Array1[local78];
			if (local87 != null) {
				local96 = arg0.anInt5016 - local87.anInt5016;
				local46 = arg0.anInt5073 - local87.anInt5073;
				if (local46 != 0 || local96 != 0) {
					arg0.anInt5018 = (int) (Math.atan2((double) local46, (double) local96) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt5083 != 0 || arg0.anInt5052 != 0) && (arg0.anInt5044 == 0 || arg0.anInt5059 > 0)) {
			local78 = arg0.anInt5073 - (arg0.anInt5083 - Static101.anInt1844 - Static101.anInt1844) * 64;
			local39 = arg0.anInt5016 - (arg0.anInt5052 - Static43.anInt798 - Static43.anInt798) * 64;
			if (local78 != 0 || local39 != 0) {
				arg0.anInt5018 = (int) (Math.atan2((double) local78, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt5052 = 0;
			arg0.anInt5083 = 0;
		}
		local78 = arg0.anInt5018 - arg0.anInt5043 & 0x7FF;
		if (local78 == 0) {
			arg0.anInt5011 = 0;
			arg0.anInt5013 = 0;
		} else if (local15.anInt889 == 0) {
			arg0.anInt5011++;
			@Pc(818) boolean local818;
			if (local78 > 1024) {
				arg0.anInt5043 -= arg0.anInt5017;
				local818 = true;
				if (arg0.anInt5017 > local78 || local78 > 2048 - arg0.anInt5017) {
					arg0.anInt5043 = arg0.anInt5018;
					local818 = false;
				}
				if (arg0.anInt5011 > 25 || local818) {
					arg0.anInt5066 = local15.anInt896;
					if (arg0.anInt5044 > 0) {
						if (arg0.aByteArray69[arg0.anInt5044 - 1] == 2) {
							if (local15.anInt880 != -1) {
								arg0.anInt5066 = local15.anInt880;
							} else if (local15.anInt919 != -1) {
								arg0.anInt5066 = local15.anInt919;
							}
						} else if (arg0.aByteArray69[arg0.anInt5044 - 1] == 0) {
							if (local15.anInt897 != -1) {
								arg0.anInt5066 = local15.anInt897;
							} else if (local15.anInt915 != -1) {
								arg0.anInt5066 = local15.anInt915;
							}
						} else if (local15.anInt888 != -1) {
							arg0.anInt5066 = local15.anInt888;
						}
					} else if (local15.anInt900 != -1) {
						arg0.anInt5066 = local15.anInt900;
					}
				}
			} else {
				arg0.anInt5043 += arg0.anInt5017;
				local818 = true;
				if (arg0.anInt5017 > local78 || local78 > 2048 - arg0.anInt5017) {
					local818 = false;
					arg0.anInt5043 = arg0.anInt5018;
				}
				if (arg0.anInt5011 > 25 || local818) {
					arg0.anInt5066 = local15.anInt896;
					if (arg0.anInt5044 > 0) {
						if (arg0.aByteArray69[arg0.anInt5044 - 1] == 2) {
							if (local15.anInt895 != -1) {
								arg0.anInt5066 = local15.anInt895;
							} else if (local15.anInt919 != -1) {
								arg0.anInt5066 = local15.anInt919;
							}
						} else if (arg0.aByteArray69[arg0.anInt5044 - 1] == 0) {
							if (local15.anInt918 != -1) {
								arg0.anInt5066 = local15.anInt918;
							} else if (local15.anInt915 != -1) {
								arg0.anInt5066 = local15.anInt915;
							}
						} else if (local15.anInt917 != -1) {
							arg0.anInt5066 = local15.anInt917;
						}
					} else if (local15.anInt881 != -1) {
						arg0.anInt5066 = local15.anInt881;
					}
				}
			}
			arg0.anInt5043 &= 0x7FF;
		} else {
			local39 = arg0.anInt5018 << 5;
			arg0.anInt5066 = -1;
			if (arg0.anInt5022 != local39) {
				arg0.anInt5037 = 0;
				arg0.anInt5022 = local39;
				local46 = local39 - arg0.anInt5015 & 0xFFFF;
				local96 = arg0.anInt5013 * arg0.anInt5013 / (local15.anInt889 * 2);
				@Pc(280) int local280;
				if (arg0.anInt5013 > 0 && local46 >= local96 && local46 - local96 < 32768) {
					local280 = local15.anInt898 * local15.anInt898 / (local15.anInt889 * 2);
					arg0.aBoolean350 = true;
					if (local280 > 32767) {
						local280 = 32767;
					}
					arg0.anInt5042 = local46 / 2;
					if (local280 < arg0.anInt5042) {
						arg0.anInt5042 = local46 - local280;
					}
				} else if (arg0.anInt5013 < 0 && local96 <= 65536 - local46 && 65536 - local46 - local96 < 32768) {
					arg0.anInt5042 = (65536 - local46) / 2;
					arg0.aBoolean350 = true;
					local280 = local15.anInt898 * local15.anInt898 / (local15.anInt889 * 2);
					if (local280 > 32767) {
						local280 = 32767;
					}
					if (local280 < arg0.anInt5042) {
						arg0.anInt5042 = 65536 - local280 - local46;
					}
				} else {
					arg0.aBoolean350 = false;
				}
			}
			if (arg0.anInt5013 == 0) {
				local46 = arg0.anInt5022 - arg0.anInt5015 & 0xFFFF;
				if (local15.anInt889 <= local46) {
					arg0.aBoolean350 = true;
					local96 = local15.anInt898 * local15.anInt898 / (local15.anInt889 * 2);
					arg0.anInt5037 = 0;
					if (local96 > 32767) {
						local96 = 32767;
					}
					if (local46 < 32768) {
						arg0.anInt5042 = local46 / 2;
						if (local96 < arg0.anInt5042) {
							arg0.anInt5042 = local46 - local96;
						}
						arg0.anInt5013 = local15.anInt889;
					} else {
						arg0.anInt5013 = -local15.anInt889;
						arg0.anInt5042 = (65536 - local46) / 2;
						if (arg0.anInt5042 > local96) {
							arg0.anInt5042 = 65536 - local96 - local46;
						}
					}
				} else {
					arg0.anInt5015 = arg0.anInt5022;
				}
			} else if (arg0.anInt5013 <= 0) {
				if (arg0.anInt5037 >= arg0.anInt5042) {
					arg0.aBoolean350 = false;
				}
				if (!arg0.aBoolean350) {
					arg0.anInt5013 += local15.anInt889;
					if (arg0.anInt5013 > 0) {
						arg0.anInt5013 = 0;
					}
				} else if (-local15.anInt898 < arg0.anInt5013) {
					arg0.anInt5013 -= local15.anInt889;
				}
			} else {
				if (arg0.anInt5042 <= arg0.anInt5037) {
					arg0.aBoolean350 = false;
				}
				if (!arg0.aBoolean350) {
					arg0.anInt5013 -= local15.anInt889;
					if (arg0.anInt5013 < 0) {
						arg0.anInt5013 = 0;
					}
				} else if (local15.anInt898 > arg0.anInt5013) {
					arg0.anInt5013 += local15.anInt889;
				}
			}
			arg0.anInt5015 += arg0.anInt5013;
			arg0.anInt5015 &= 0xFFFF;
			if (arg0.anInt5013 <= 0) {
				arg0.anInt5037 -= arg0.anInt5013;
			} else {
				arg0.anInt5037 += arg0.anInt5013;
			}
			arg0.anInt5043 = arg0.anInt5015 >> 5;
			if (arg0.anInt5013 >= 0) {
				if (arg0.anInt5044 > 0) {
					if (arg0.aByteArray69[arg0.anInt5044 - 1] == 2) {
						if (local15.anInt895 != -1) {
							arg0.anInt5066 = local15.anInt895;
						} else if (local15.anInt919 != -1) {
							arg0.anInt5066 = local15.anInt919;
						}
					} else if (arg0.aByteArray69[arg0.anInt5044 - 1] == 0) {
						if (local15.anInt918 != -1) {
							arg0.anInt5066 = local15.anInt918;
						} else if (local15.anInt915 != -1) {
							arg0.anInt5066 = local15.anInt915;
						}
					}
				}
				if (arg0.anInt5066 == -1) {
					if (local15.anInt917 != -1) {
						arg0.anInt5066 = local15.anInt917;
					} else if (local15.anInt881 != -1) {
						arg0.anInt5066 = local15.anInt881;
					}
				}
			} else {
				if (arg0.anInt5044 > 0) {
					if (arg0.aByteArray69[arg0.anInt5044 - 1] == 2) {
						if (local15.anInt880 != -1) {
							arg0.anInt5066 = local15.anInt880;
						} else if (local15.anInt919 != -1) {
							arg0.anInt5066 = local15.anInt919;
						}
					} else if (arg0.aByteArray69[arg0.anInt5044 - 1] == 0) {
						if (local15.anInt897 != -1) {
							arg0.anInt5066 = local15.anInt897;
						} else if (local15.anInt915 != -1) {
							arg0.anInt5066 = local15.anInt915;
						}
					}
				}
				if (arg0.anInt5066 == -1) {
					if (local15.anInt888 != -1) {
						arg0.anInt5066 = local15.anInt888;
					} else if (local15.anInt900 != -1) {
						arg0.anInt5066 = local15.anInt900;
					}
				}
			}
			if (arg0.anInt5066 == -1) {
				arg0.anInt5066 = local15.anInt896;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = Static220.anInt5204 * arg2 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static175.method2876(local5, arg1, Static161.aClass155_65);
			Static73.aBoolean123 = true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIIB)V")
	public static void method3129(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static306.method4921(false);
		Static146.anInt5851 = arg1;
		Static4.aBoolean287 = arg0;
		Static33.anInt607 = arg3;
		Static228.method1193(arg2);
		Static130.aClass30_15 = new Class30(8);
		Static51.aClass30_8 = new Class30(8);
	}
}
