import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt4724;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	public static int anInt4731;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_68 = new Class171(119, -1);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method4061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 > 2000 || arg4 > 2000 || arg5 > 2000 || arg6 > 2000 || arg0 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg3 >= -2000 && arg4 >= -2000 && arg5 >= -2000 && arg6 >= -2000 && arg0 >= -2000 && arg1 >= -2000) {
			@Pc(70) int local70;
			if (Static499.anInt7885 == 2) {
				local70 = Static218.anInt3743 * arg3 + arg6;
				if (local70 >= 0 && local70 < Static260.anIntArray268.length && (arg8 << 8) - 38400 < Static260.anIntArray268[local70]) {
					return false;
				}
				local70 = Static218.anInt3743 * arg4 + arg0;
				if (local70 >= 0 && local70 < Static260.anIntArray268.length && (arg2 << 8) - 38400 < Static260.anIntArray268[local70]) {
					return false;
				}
				local70 = arg5 * Static218.anInt3743 + arg1;
				if (local70 >= 0 && Static260.anIntArray268.length > local70 && (arg7 << 8) - 38400 < Static260.anIntArray268[local70]) {
					return false;
				}
			}
			local70 = arg0 - arg6;
			@Pc(161) int local161 = arg4 - arg3;
			@Pc(166) int local166 = arg1 - arg6;
			@Pc(170) int local170 = arg5 - arg3;
			@Pc(174) int local174 = arg2 - arg8;
			@Pc(178) int local178 = arg7 - arg8;
			if (arg3 < arg4 && arg5 < arg5) {
				if (arg4 <= arg5) {
					arg5++;
				} else {
					arg4++;
				}
				arg3--;
			} else if (arg5 <= arg4) {
				if (arg4 >= arg3) {
					arg4++;
				} else {
					arg3++;
				}
				arg5--;
			} else {
				arg4--;
				if (arg3 > arg5) {
					arg3++;
				} else {
					arg5++;
				}
			}
			@Pc(225) int local225 = 0;
			if (arg4 != arg3) {
				local225 = (arg0 - arg6 << 12) / (arg4 - arg3);
			}
			@Pc(246) int local246 = 0;
			if (arg5 != arg4) {
				local246 = (arg1 - arg0 << 12) / (arg5 - arg4);
			}
			@Pc(274) int local274 = 0;
			if (arg5 != arg3) {
				local274 = (arg6 - arg1 << 12) / (arg3 - arg5);
			}
			@Pc(297) int local297 = local70 * local170 - local161 * local166;
			if (local297 == 0) {
				return false;
			}
			@Pc(313) int local313 = (local170 * local174 - local178 * local161 << 8) / local297;
			@Pc(326) int local326 = (local70 * local178 - local166 * local174 << 8) / local297;
			if (arg4 >= arg3 && arg5 >= arg3) {
				if (arg3 >= Static483.anInt7683) {
					return true;
				}
				if (Static483.anInt7683 < arg4) {
					arg4 = Static483.anInt7683;
				}
				if (Static483.anInt7683 < arg5) {
					arg5 = Static483.anInt7683;
				}
				arg8 = local313 + (arg8 << 8) - arg6 * local313;
				if (arg5 > arg4) {
					arg1 = arg6 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= arg3 * local225;
						arg1 -= arg3 * local274;
						arg8 -= local326 * arg3;
						arg3 = 0;
					}
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= local246 * arg4;
						arg4 = 0;
					}
					if ((arg4 == arg3 || local274 >= local225) && (arg4 != arg3 || local274 <= local246)) {
						arg5 -= arg4;
						arg4 -= arg3;
						arg3 *= Static218.anInt3743;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static661.method8816((arg1 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg0 >> 12) - 1, local313)) {
										return false;
									}
									arg1 += local274;
									arg3 += Static218.anInt3743;
									arg8 += local326;
									arg0 += local246;
								}
							}
							if (!Static661.method8816((arg1 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg6 >> 12) - 1, local313)) {
								return false;
							}
							arg8 += local326;
							arg6 += local225;
							arg3 += Static218.anInt3743;
							arg1 += local274;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg3;
						arg3 = Static218.anInt3743 * arg3;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static661.method8816((arg0 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg1 >> 12) - 1, local313)) {
										return false;
									}
									arg3 += Static218.anInt3743;
									arg0 += local246;
									arg8 += local326;
									arg1 += local274;
								}
							}
							if (!Static661.method8816((arg6 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg1 >> 12) - 1, local313)) {
								return false;
							}
							arg6 += local225;
							arg3 += Static218.anInt3743;
							arg8 += local326;
							arg1 += local274;
						}
					}
				} else {
					arg0 = arg6 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= arg3 * local274;
						arg8 -= arg3 * local326;
						arg6 -= local225 * arg3;
						arg3 = 0;
					}
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg1 -= arg5 * local246;
						arg5 = 0;
					}
					if (arg5 != arg3 && local274 < local225 || arg5 == arg3 && local225 < local246) {
						arg4 -= arg5;
						arg5 -= arg3;
						arg3 = Static218.anInt3743 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static661.method8816((arg6 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg1 >> 12) - 1, local313)) {
										return false;
									}
									arg8 += local326;
									arg1 += local246;
									arg3 += Static218.anInt3743;
									arg6 += local225;
								}
							}
							if (!Static661.method8816((arg6 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg0 >> 12) - 1, local313)) {
								return false;
							}
							arg0 += local274;
							arg6 += local225;
							arg8 += local326;
							arg3 += Static218.anInt3743;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg3;
						arg3 = Static218.anInt3743 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static661.method8816((arg1 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg6 >> 12) - 1, local313)) {
										return false;
									}
									arg1 += local246;
									arg8 += local326;
									arg3 += Static218.anInt3743;
									arg6 += local225;
								}
							}
							if (!Static661.method8816((arg0 >> 12) + 1, arg8, Static260.anIntArray268, arg3, (arg6 >> 12) - 1, local313)) {
								return false;
							}
							arg8 += local326;
							arg0 += local274;
							arg6 += local225;
							arg3 += Static218.anInt3743;
						}
					}
				}
			} else if (arg4 <= arg5) {
				if (Static483.anInt7683 <= arg4) {
					return true;
				}
				if (arg5 > Static483.anInt7683) {
					arg5 = Static483.anInt7683;
				}
				if (arg3 > Static483.anInt7683) {
					arg3 = Static483.anInt7683;
				}
				arg2 = local313 + (arg2 << 8) - local313 * arg0;
				if (arg3 <= arg5) {
					arg1 = arg0 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= local246 * arg4;
						arg1 -= local225 * arg4;
						arg2 -= local326 * arg4;
						arg4 = 0;
					}
					arg6 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= arg3 * local274;
						arg3 = 0;
					}
					if (local225 < local246) {
						arg5 -= arg3;
						arg3 -= arg4;
						arg4 *= Static218.anInt3743;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static661.method8816((arg0 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg6 >> 12) - 1, local313)) {
										return false;
									}
									arg2 += local326;
									arg0 += local246;
									arg6 += local274;
									arg4 += Static218.anInt3743;
								}
							}
							if (!Static661.method8816((arg0 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg1 >> 12) - 1, local313)) {
								return false;
							}
							arg0 += local246;
							arg4 += Static218.anInt3743;
							arg2 += local326;
							arg1 += local225;
						}
					} else {
						arg5 -= arg3;
						arg3 -= arg4;
						arg4 = Static218.anInt3743 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static661.method8816((arg6 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg0 >> 12) - 1, local313)) {
										return false;
									}
									arg2 += local326;
									arg6 += local274;
									arg4 += Static218.anInt3743;
									arg0 += local246;
								}
							}
							if (!Static661.method8816((arg1 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg0 >> 12) - 1, local313)) {
								return false;
							}
							arg2 += local326;
							arg4 += Static218.anInt3743;
							arg0 += local246;
							arg1 += local225;
						}
					}
				} else {
					arg6 = arg0 <<= 0xC;
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= arg4 * local326;
						arg6 -= arg4 * local225;
						arg0 -= arg4 * local246;
						arg4 = 0;
					}
					if (arg5 < 0) {
						arg1 -= local274 * arg5;
						arg5 = 0;
					}
					if (arg5 != arg4 && local225 < local246 || arg4 == arg5 && local274 < local225) {
						arg3 -= arg5;
						arg5 -= arg4;
						arg4 = Static218.anInt3743 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static661.method8816((arg1 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg6 >> 12) - 1, local313)) {
										return false;
									}
									arg1 += local274;
									arg6 += local225;
									arg4 += Static218.anInt3743;
									arg2 += local326;
								}
							}
							if (!Static661.method8816((arg0 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg6 >> 12) - 1, local313)) {
								return false;
							}
							arg2 += local326;
							arg4 += Static218.anInt3743;
							arg6 += local225;
							arg0 += local246;
						}
					} else {
						arg3 -= arg5;
						arg5 -= arg4;
						arg4 = Static218.anInt3743 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static661.method8816((arg6 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg1 >> 12) - 1, local313)) {
										return false;
									}
									arg2 += local326;
									arg4 += Static218.anInt3743;
									arg6 += local225;
									arg1 += local274;
								}
							}
							if (!Static661.method8816((arg6 >> 12) + 1, arg2, Static260.anIntArray268, arg4, (arg0 >> 12) - 1, local313)) {
								return false;
							}
							arg2 += local326;
							arg6 += local225;
							arg4 += Static218.anInt3743;
							arg0 += local246;
						}
					}
				}
			} else if (Static483.anInt7683 <= arg5) {
				return true;
			} else {
				if (Static483.anInt7683 < arg4) {
					arg4 = Static483.anInt7683;
				}
				if (Static483.anInt7683 < arg3) {
					arg3 = Static483.anInt7683;
				}
				arg7 = (arg7 << 8) + local313 - (local313 * arg1);
				if (arg3 >= arg4) {
					arg6 = arg1 <<= 0xC;
					if (arg5 < 0) {
						arg1 -= arg5 * local274;
						arg7 -= local326 * arg5;
						arg6 -= local246 * arg5;
						arg5 = 0;
					}
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= arg4 * local225;
						arg4 = 0;
					}
					if (local274 <= local246) {
						arg3 -= arg4;
						arg4 -= arg5;
						arg5 = Static218.anInt3743 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static661.method8816((arg0 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg1 >> 12) - 1, local313)) {
										return false;
									}
									arg1 += local274;
									arg7 += local326;
									arg5 += Static218.anInt3743;
									arg0 += local225;
								}
							}
							if (!Static661.method8816((arg6 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg1 >> 12) - 1, local313)) {
								return false;
							}
							arg7 += local326;
							arg5 += Static218.anInt3743;
							arg6 += local246;
							arg1 += local274;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg5;
						arg5 = Static218.anInt3743 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static661.method8816((arg1 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg0 >> 12) - 1, local313)) {
										return false;
									}
									arg0 += local225;
									arg7 += local326;
									arg5 += Static218.anInt3743;
									arg1 += local274;
								}
							}
							if (!Static661.method8816((arg1 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg6 >> 12) - 1, local313)) {
								return false;
							}
							arg5 += Static218.anInt3743;
							arg1 += local274;
							arg7 += local326;
							arg6 += local246;
						}
					}
				} else {
					arg0 = arg1 <<= 0xC;
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local326 * arg5;
						arg0 -= arg5 * local246;
						arg1 -= local274 * arg5;
						arg5 = 0;
					}
					if (arg3 < 0) {
						arg6 -= local225 * arg3;
						arg3 = 0;
					}
					if (local246 >= local274) {
						arg4 -= arg3;
						arg3 -= arg5;
						arg5 = Static218.anInt3743 * arg5;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static661.method8816((arg0 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg6 >> 12) - 1, local313)) {
										return false;
									}
									arg0 += local246;
									arg5 += Static218.anInt3743;
									arg7 += local326;
									arg6 += local225;
								}
							}
							if (!Static661.method8816((arg0 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg1 >> 12) - 1, local313)) {
								return false;
							}
							arg5 += Static218.anInt3743;
							arg0 += local246;
							arg1 += local274;
							arg7 += local326;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg5;
						arg5 = Static218.anInt3743 * arg5;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static661.method8816((arg6 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg0 >> 12) - 1, local313)) {
										return false;
									}
									arg0 += local246;
									arg5 += Static218.anInt3743;
									arg6 += local225;
									arg7 += local326;
								}
							}
							if (!Static661.method8816((arg1 >> 12) + 1, arg7, Static260.anIntArray268, arg5, (arg0 >> 12) - 1, local313)) {
								return false;
							}
							arg1 += local274;
							arg0 += local246;
							arg5 += Static218.anInt3743;
							arg7 += local326;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!dt;)Lclient!rp;")
	public static Class313 method4062(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(12) Class313 local12 = new Class313();
		local12.anInt8328 = arg0.method7951();
		local12.aClass3_Sub5_Sub16_1 = Static116.aClass284_1.method6224(local12.anInt8328);
		return local12;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBII)I")
	public static int method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg2 : arg1;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg2 : arg3) : arg1;
		return ((local7 & 0x2) == 0 ? local33 : -local33) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
	public static int method4064() {
		return Static128.method1921(false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZI)Z")
	public static boolean method4065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
