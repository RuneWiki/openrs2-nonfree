import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public static int anInt4711;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	public static int anInt4712;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public static int anInt4722;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public static int anInt4715 = 0;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "[I")
	public static int[] anIntArray354 = new int[32];

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "Lclient!f;")
	public static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3558(@OriginalArg(0) int arg0) {
		@Pc(4) String local4 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local4.length() - 3; local19 > 0; local19 -= 3) {
			local4 = local4.substring(0, local19) + "," + local4.substring(local19);
		}
		if (local4.length() <= 9) {
			return local4.length() > 6 ? " <col=ffffff>" + local4.substring(0, local4.length() - 4) + Static91.aString74 + " (" + local4 + ")</col>" : " <col=ffff00>" + local4 + "</col>";
		} else {
			return " <col=00ff80>" + local4.substring(0, local4.length() - 8) + Static169.aString118 + " (" + local4 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Lclient!vd;")
	public static Class170 method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4857; local13++) {
			@Pc(22) Class170 local22 = local7.aClass170Array3[local13];
			if ((local22.aLong196 >> 29 & 0x3L) == 2L && local22.anInt5463 == arg1 && local22.anInt5460 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)Z")
	public static boolean method3561(@OriginalArg(0) int arg0) {
		@Pc(7) Class13_Sub1 local7 = Static39.method611(arg0);
		if (local7 == null) {
			return false;
		} else if (Static26.anInt662 == 1 || Static26.anInt662 == 2 || Static147.anInt2995 == 2) {
			Static224.aString162 = local7.aString123;
			Static11.anInt2977 = local7.anInt3528;
			if (Static147.anInt2995 != 0) {
				Static190.anInt3820 = Static11.anInt2977 + 50000;
				Static2.anInt8 = Static11.anInt2977 + 40000;
				Static159.anInt3248 = Static2.anInt8;
			}
			return true;
		} else {
			@Pc(47) String local47 = "";
			if (Static147.anInt2995 != 0) {
				local47 = ":" + (local7.anInt3528 + 7000);
			}
			@Pc(67) String local67 = "";
			if (Static73.aString61 != null) {
				local67 = "/p=" + Static73.aString61;
			}
			@Pc(126) String local126 = "http://" + local7.aString123 + local47 + "/l=" + Static184.anInt3648 + "/a=" + Static270.anInt5329 + local67 + "/j" + (Static282.aBoolean65 ? "1" : "0") + ",o" + (Static119.aBoolean204 ? "1" : "0") + ",a2,m" + (Static218.aBoolean362 ? "1" : "0");
			try {
				Static249.aClient1.getAppletContext().showDocument(new URL(local126), "_self");
				return true;
			} catch (@Pc(141) Exception local141) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3563(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static173.anInt3444; local11++) {
			if (arg0.equalsIgnoreCase(Static47.aStringArray15[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!lk;Z)V")
	public static void method3566(@OriginalArg(0) Class36_Sub3 arg0) {
		if (arg0.anInt4129 == 0) {
			return;
		}
		@Pc(19) Class12 local19 = arg0.method3105();
		@Pc(44) int local44;
		@Pc(51) int local51;
		if (arg0.anInt4139 != -1 && arg0.anInt4139 < 32768) {
			@Pc(34) Class36_Sub3_Sub2 local34 = Static48.aClass36_Sub3_Sub2Array1[arg0.anInt4139];
			if (local34 != null) {
				local44 = arg0.anInt4117 - local34.anInt4117;
				local51 = arg0.anInt4118 - local34.anInt4118;
				if (local44 != 0 || local51 != 0) {
					arg0.anInt4081 = (int) (Math.atan2((double) local44, (double) local51) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(114) int local114;
		@Pc(83) int local83;
		if (arg0.anInt4139 >= 32768) {
			local83 = arg0.anInt4139 - 32768;
			if (Static34.anInt765 == local83) {
				local83 = 2047;
			}
			@Pc(97) Class36_Sub3_Sub1 local97 = Static230.aClass36_Sub3_Sub1Array1[local83];
			if (local97 != null) {
				local51 = arg0.anInt4117 - local97.anInt4117;
				local114 = arg0.anInt4118 - local97.anInt4118;
				if (local51 != 0 || local114 != 0) {
					arg0.anInt4081 = (int) (Math.atan2((double) local51, (double) local114) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4066 != 0 || arg0.anInt4105 != 0) && (arg0.anInt4093 == 0 || arg0.anInt4148 > 0)) {
			local83 = arg0.anInt4117 - (arg0.anInt4066 - Static49.anInt1089 - Static49.anInt1089) * 64;
			local44 = arg0.anInt4118 - (arg0.anInt4105 - Static130.anInt2601 - Static130.anInt2601) * 64;
			if (local83 != 0 || local44 != 0) {
				arg0.anInt4081 = (int) (Math.atan2((double) local83, (double) local44) * 325.949D) & 0x7FF;
			}
			arg0.anInt4105 = 0;
			arg0.anInt4066 = 0;
		}
		local83 = arg0.anInt4081 - arg0.anInt4128 & 0x7FF;
		if (local83 == 0) {
			arg0.anInt4133 = 0;
			arg0.anInt4123 = 0;
		} else if (local19.anInt409 == 0) {
			arg0.anInt4133++;
			@Pc(250) boolean local250;
			if (local83 > 1024) {
				arg0.anInt4128 -= arg0.anInt4129;
				local250 = true;
				if (arg0.anInt4129 > local83 || 2048 - arg0.anInt4129 < local83) {
					arg0.anInt4128 = arg0.anInt4081;
					local250 = false;
				}
				if (arg0.anInt4133 > 25 || local250) {
					arg0.anInt4067 = local19.anInt383;
					if (arg0.anInt4093 > 0) {
						if (arg0.aByteArray36[arg0.anInt4093 - 1] == 2) {
							if (local19.anInt419 != -1) {
								arg0.anInt4067 = local19.anInt419;
							} else if (local19.anInt421 != -1) {
								arg0.anInt4067 = local19.anInt421;
							}
						} else if (arg0.aByteArray36[arg0.anInt4093 - 1] == 0) {
							if (local19.anInt426 != -1) {
								arg0.anInt4067 = local19.anInt426;
							} else if (local19.anInt408 != -1) {
								arg0.anInt4067 = local19.anInt408;
							}
						} else if (local19.anInt410 != -1) {
							arg0.anInt4067 = local19.anInt410;
						}
					} else if (local19.anInt392 != -1) {
						arg0.anInt4067 = local19.anInt392;
					}
				}
			} else {
				local250 = true;
				arg0.anInt4128 += arg0.anInt4129;
				if (local83 < arg0.anInt4129 || 2048 - arg0.anInt4129 < local83) {
					local250 = false;
					arg0.anInt4128 = arg0.anInt4081;
				}
				if (arg0.anInt4133 > 25 || local250) {
					arg0.anInt4067 = local19.anInt383;
					if (arg0.anInt4093 > 0) {
						if (arg0.aByteArray36[arg0.anInt4093 - 1] == 2) {
							if (local19.anInt418 != -1) {
								arg0.anInt4067 = local19.anInt418;
							} else if (local19.anInt421 != -1) {
								arg0.anInt4067 = local19.anInt421;
							}
						} else if (arg0.aByteArray36[arg0.anInt4093 - 1] == 0) {
							if (local19.anInt414 != -1) {
								arg0.anInt4067 = local19.anInt414;
							} else if (local19.anInt408 != -1) {
								arg0.anInt4067 = local19.anInt408;
							}
						} else if (local19.anInt391 != -1) {
							arg0.anInt4067 = local19.anInt391;
						}
					} else if (local19.anInt384 != -1) {
						arg0.anInt4067 = local19.anInt384;
					}
				}
			}
			arg0.anInt4128 &= 0x7FF;
		} else {
			arg0.anInt4067 = -1;
			local44 = arg0.anInt4081 << 5;
			if (arg0.anInt4084 != local44) {
				arg0.anInt4074 = 0;
				local114 = arg0.anInt4123 * arg0.anInt4123 / (local19.anInt409 * 2);
				local51 = local44 - arg0.anInt4077 & 0xFFFF;
				arg0.anInt4084 = local44;
				@Pc(592) int local592;
				if (arg0.anInt4123 > 0 && local114 <= local51 && local51 - local114 < 32768) {
					arg0.anInt4101 = local51 / 2;
					local592 = local19.anInt412 * local19.anInt412 / (local19.anInt409 * 2);
					if (local592 > 32767) {
						local592 = 32767;
					}
					arg0.aBoolean334 = true;
					if (local592 < arg0.anInt4101) {
						arg0.anInt4101 = local51 - local592;
					}
				} else if (arg0.anInt4123 < 0 && local114 <= 65536 - local51 && 65536 - local51 - local114 < 32768) {
					arg0.anInt4101 = (65536 - local51) / 2;
					arg0.aBoolean334 = true;
					local592 = local19.anInt412 * local19.anInt412 / (local19.anInt409 * 2);
					if (local592 > 32767) {
						local592 = 32767;
					}
					if (local592 < arg0.anInt4101) {
						arg0.anInt4101 = 65536 - local51 - local592;
					}
				} else {
					arg0.aBoolean334 = false;
				}
			}
			if (arg0.anInt4123 == 0) {
				local51 = arg0.anInt4084 - arg0.anInt4077 & 0xFFFF;
				if (local19.anInt409 > local51) {
					arg0.anInt4077 = arg0.anInt4084;
				} else {
					local114 = local19.anInt412 * local19.anInt412 / (local19.anInt409 * 2);
					arg0.anInt4074 = 0;
					arg0.aBoolean334 = true;
					if (local114 > 32767) {
						local114 = 32767;
					}
					if (local51 < 32768) {
						arg0.anInt4101 = local51 / 2;
						arg0.anInt4123 = local19.anInt409;
						if (arg0.anInt4101 > local114) {
							arg0.anInt4101 = local51 - local114;
						}
					} else {
						arg0.anInt4101 = (65536 - local51) / 2;
						arg0.anInt4123 = -local19.anInt409;
						if (local114 < arg0.anInt4101) {
							arg0.anInt4101 = 65536 - local114 - local51;
						}
					}
				}
			} else if (arg0.anInt4123 <= 0) {
				if (arg0.anInt4074 >= arg0.anInt4101) {
					arg0.aBoolean334 = false;
				}
				if (!arg0.aBoolean334) {
					arg0.anInt4123 += local19.anInt409;
					if (arg0.anInt4123 > 0) {
						arg0.anInt4123 = 0;
					}
				} else if (arg0.anInt4123 > -local19.anInt412) {
					arg0.anInt4123 -= local19.anInt409;
				}
			} else {
				if (arg0.anInt4101 <= arg0.anInt4074) {
					arg0.aBoolean334 = false;
				}
				if (!arg0.aBoolean334) {
					arg0.anInt4123 -= local19.anInt409;
					if (arg0.anInt4123 < 0) {
						arg0.anInt4123 = 0;
					}
				} else if (local19.anInt412 > arg0.anInt4123) {
					arg0.anInt4123 += local19.anInt409;
				}
			}
			if (arg0.anInt4123 > 0) {
				arg0.anInt4074 += arg0.anInt4123;
			} else {
				arg0.anInt4074 -= arg0.anInt4123;
			}
			arg0.anInt4077 += arg0.anInt4123;
			arg0.anInt4077 &= 0xFFFF;
			arg0.anInt4128 = arg0.anInt4077 >> 5;
			if (arg0.anInt4123 >= 0) {
				if (arg0.anInt4093 > 0) {
					if (arg0.aByteArray36[arg0.anInt4093 - 1] == 2) {
						if (local19.anInt418 != -1) {
							arg0.anInt4067 = local19.anInt418;
						} else if (local19.anInt421 != -1) {
							arg0.anInt4067 = local19.anInt421;
						}
					} else if (arg0.aByteArray36[arg0.anInt4093 - 1] == 0) {
						if (local19.anInt414 != -1) {
							arg0.anInt4067 = local19.anInt414;
						} else if (local19.anInt408 != -1) {
							arg0.anInt4067 = local19.anInt408;
						}
					}
				}
				if (arg0.anInt4067 == -1) {
					if (local19.anInt391 != -1) {
						arg0.anInt4067 = local19.anInt391;
					} else if (local19.anInt384 != -1) {
						arg0.anInt4067 = local19.anInt384;
					}
				}
			} else {
				if (arg0.anInt4093 > 0) {
					if (arg0.aByteArray36[arg0.anInt4093 - 1] == 2) {
						if (local19.anInt419 != -1) {
							arg0.anInt4067 = local19.anInt419;
						} else if (local19.anInt421 != -1) {
							arg0.anInt4067 = local19.anInt421;
						}
					} else if (arg0.aByteArray36[arg0.anInt4093 - 1] == 0) {
						if (local19.anInt426 != -1) {
							arg0.anInt4067 = local19.anInt426;
						} else if (local19.anInt408 != -1) {
							arg0.anInt4067 = local19.anInt408;
						}
					}
				}
				if (arg0.anInt4067 == -1) {
					if (local19.anInt410 != -1) {
						arg0.anInt4067 = local19.anInt410;
					} else if (local19.anInt392 != -1) {
						arg0.anInt4067 = local19.anInt392;
					}
				}
			}
			if (arg0.anInt4067 == -1) {
				arg0.anInt4067 = local19.anInt383;
			}
		}
	}
}
