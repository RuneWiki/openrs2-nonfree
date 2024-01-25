import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
	public static int anInt10112;

	@OriginalMember(owner = "client!wfa", name = "C", descriptor = "Lclient!q;")
	public static Class42 aClass42_6;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public static int anInt10107 = 0;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!dh;Z)Ljava/lang/String;")
	public static String method7963(@OriginalArg(0) Class3_Sub13 arg0) {
		return arg0.aString45 == null || arg0.aString45.length() <= 0 ? arg0.aString44 : arg0.aString44 + Static573.aClass350_36.method7730(Static201.anInt4321) + arg0.aString45;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBIIIIIIII)Z")
	public static boolean method7964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg5 > 2000 || arg6 > 2000 || arg7 > 2000 || arg0 > 2000 || arg8 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg5 >= -2000 && arg6 >= -2000 && arg7 >= -2000 && arg0 >= -2000 && arg8 >= -2000) {
			@Pc(70) int local70;
			if (Static412.anInt7415 == 2) {
				local70 = arg7 + Static69.anInt6608 * arg4;
				if (local70 >= 0 && Static543.anIntArray544.length > local70 && (arg3 << 8) - 38400 < Static543.anIntArray544[local70]) {
					return false;
				}
				local70 = arg0 + arg5 * Static69.anInt6608;
				if (local70 >= 0 && Static543.anIntArray544.length > local70 && Static543.anIntArray544[local70] > (arg2 << 8) - 38400) {
					return false;
				}
				local70 = arg6 * Static69.anInt6608 + arg8;
				if (local70 >= 0 && local70 < Static543.anIntArray544.length && Static543.anIntArray544[local70] > (arg1 << 8) - 38400) {
					return false;
				}
			}
			local70 = arg0 - arg7;
			@Pc(150) int local150 = arg5 - arg4;
			@Pc(154) int local154 = arg8 - arg7;
			@Pc(158) int local158 = arg6 - arg4;
			@Pc(163) int local163 = arg2 - arg3;
			@Pc(168) int local168 = arg1 - arg3;
			if (arg5 > arg4 && arg6 > arg6) {
				arg4--;
				if (arg6 < arg5) {
					arg5++;
				} else {
					arg6++;
				}
			} else if (arg6 > arg5) {
				arg5--;
				if (arg6 >= arg4) {
					arg6++;
				} else {
					arg4++;
				}
			} else {
				arg6--;
				if (arg4 <= arg5) {
					arg5++;
				} else {
					arg4++;
				}
			}
			@Pc(219) int local219 = 0;
			if (arg4 != arg5) {
				local219 = (arg0 - arg7 << 12) / (arg5 - arg4);
			}
			@Pc(248) int local248 = 0;
			if (arg6 != arg5) {
				local248 = (arg8 - arg0 << 12) / (arg6 - arg5);
			}
			@Pc(267) int local267 = 0;
			if (arg4 != arg6) {
				local267 = (arg7 - arg8 << 12) / (arg4 - arg6);
			}
			@Pc(295) int local295 = local70 * local158 - local154 * local150;
			if (local295 == 0) {
				return false;
			}
			@Pc(312) int local312 = (local158 * local163 - local168 * local150 << 8) / local295;
			@Pc(325) int local325 = (local70 * local168 - local163 * local154 << 8) / local295;
			if (arg4 <= arg5 && arg6 >= arg4) {
				if (arg4 >= Static510.anInt8799) {
					return true;
				}
				if (Static510.anInt8799 < arg5) {
					arg5 = Static510.anInt8799;
				}
				arg3 = local312 + (arg3 << 8) - local312 * arg7;
				if (arg6 > Static510.anInt8799) {
					arg6 = Static510.anInt8799;
				}
				if (arg6 > arg5) {
					arg8 = arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local219;
						arg3 -= local325 * arg4;
						arg8 -= local267 * arg4;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= local248 * arg5;
						arg5 = 0;
					}
					if (arg5 != arg4 && local267 < local219 || arg5 == arg4 && local248 < local267) {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 *= Static69.anInt6608;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static106.method2188(arg4, (arg0 >> 12) + 1, (arg8 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
										return false;
									}
									arg4 += Static69.anInt6608;
									arg0 += local248;
									arg8 += local267;
									arg3 += local325;
								}
							}
							if (!Static106.method2188(arg4, (arg7 >> 12) + 1, (arg8 >> 12) - 1, arg3, Static543.anIntArray544, local312)) {
								return false;
							}
							arg8 += local267;
							arg3 += local325;
							arg4 += Static69.anInt6608;
							arg7 += local219;
						}
					} else {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 = Static69.anInt6608 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static106.method2188(arg4, (arg8 >> 12) + 1, (arg0 >> 12) - 1, arg3, Static543.anIntArray544, local312)) {
										return false;
									}
									arg4 += Static69.anInt6608;
									arg0 += local248;
									arg8 += local267;
									arg3 += local325;
								}
							}
							if (!Static106.method2188(arg4, (arg8 >> 12) + 1, (arg7 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
								return false;
							}
							arg7 += local219;
							arg8 += local267;
							arg3 += local325;
							arg4 += Static69.anInt6608;
						}
					}
				} else {
					arg0 = arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= local219 * arg4;
						arg3 -= local325 * arg4;
						arg0 -= arg4 * local267;
						arg4 = 0;
					}
					arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= local248 * arg6;
						arg6 = 0;
					}
					if ((arg6 == arg4 || local219 <= local267) && (arg6 != arg4 || local219 >= local248)) {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 = Static69.anInt6608 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static106.method2188(arg4, (arg8 >> 12) + 1, (arg7 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
										return false;
									}
									arg3 += local325;
									arg8 += local248;
									arg4 += Static69.anInt6608;
									arg7 += local219;
								}
							}
							if (!Static106.method2188(arg4, (arg0 >> 12) + 1, (arg7 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
								return false;
							}
							arg3 += local325;
							arg7 += local219;
							arg4 += Static69.anInt6608;
							arg0 += local267;
						}
					} else {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 = Static69.anInt6608 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static106.method2188(arg4, (arg7 >> 12) + 1, (arg8 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
										return false;
									}
									arg4 += Static69.anInt6608;
									arg3 += local325;
									arg7 += local219;
									arg8 += local248;
								}
							}
							if (!Static106.method2188(arg4, (arg7 >> 12) + 1, (arg0 >> 12) + -1, arg3, Static543.anIntArray544, local312)) {
								return false;
							}
							arg0 += local267;
							arg4 += Static69.anInt6608;
							arg3 += local325;
							arg7 += local219;
						}
					}
				}
			} else if (arg5 > arg6) {
				if (arg6 >= Static510.anInt8799) {
					return true;
				}
				if (Static510.anInt8799 < arg4) {
					arg4 = Static510.anInt8799;
				}
				arg1 = local312 + (arg1 << 8) - arg8 * local312;
				if (arg5 > Static510.anInt8799) {
					arg5 = Static510.anInt8799;
				}
				if (arg5 <= arg4) {
					arg7 = arg8 <<= 0xC;
					arg0 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= local248 * arg6;
						arg8 -= arg6 * local267;
						arg1 -= local325 * arg6;
						arg6 = 0;
					}
					if (arg5 < 0) {
						arg0 -= local219 * arg5;
						arg5 = 0;
					}
					if (local248 >= local267) {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 *= Static69.anInt6608;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static106.method2188(arg6, (arg0 >> 12) + 1, (arg8 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
										return false;
									}
									arg0 += local219;
									arg1 += local325;
									arg8 += local267;
									arg6 += Static69.anInt6608;
								}
							}
							if (!Static106.method2188(arg6, (arg7 >> 12) + 1, (arg8 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
								return false;
							}
							arg1 += local325;
							arg7 += local248;
							arg6 += Static69.anInt6608;
							arg8 += local267;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 *= Static69.anInt6608;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static106.method2188(arg6, (arg8 >> 12) + 1, (arg0 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
										return false;
									}
									arg8 += local267;
									arg6 += Static69.anInt6608;
									arg1 += local325;
									arg0 += local219;
								}
							}
							if (!Static106.method2188(arg6, (arg8 >> 12) + 1, (arg7 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
								return false;
							}
							arg7 += local248;
							arg6 += Static69.anInt6608;
							arg8 += local267;
							arg1 += local325;
						}
					}
				} else {
					arg0 = arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= local267 * arg6;
						arg1 -= arg6 * local325;
						arg0 -= arg6 * local248;
						arg6 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local219;
						arg4 = 0;
					}
					if (local248 >= local267) {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 *= Static69.anInt6608;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static106.method2188(arg6, (arg0 >> 12) + 1, (arg7 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
										return false;
									}
									arg6 += Static69.anInt6608;
									arg1 += local325;
									arg0 += local248;
									arg7 += local219;
								}
							}
							if (!Static106.method2188(arg6, (arg0 >> 12) + 1, (arg8 >> 12) - 1, arg1, Static543.anIntArray544, local312)) {
								return false;
							}
							arg1 += local325;
							arg8 += local267;
							arg6 += Static69.anInt6608;
							arg0 += local248;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 = Static69.anInt6608 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static106.method2188(arg6, (arg7 >> 12) + 1, (arg0 >> 12) + -1, arg1, Static543.anIntArray544, local312)) {
										return false;
									}
									arg0 += local248;
									arg6 += Static69.anInt6608;
									arg1 += local325;
									arg7 += local219;
								}
							}
							if (!Static106.method2188(arg6, (arg8 >> 12) + 1, (arg0 >> 12) - 1, arg1, Static543.anIntArray544, local312)) {
								return false;
							}
							arg1 += local325;
							arg8 += local267;
							arg6 += Static69.anInt6608;
							arg0 += local248;
						}
					}
				}
			} else if (Static510.anInt8799 <= arg5) {
				return true;
			} else {
				if (Static510.anInt8799 < arg6) {
					arg6 = Static510.anInt8799;
				}
				arg2 = (arg2 << 8) + local312 - (arg0 * local312);
				if (arg4 > Static510.anInt8799) {
					arg4 = Static510.anInt8799;
				}
				if (arg6 < arg4) {
					arg7 = arg0 <<= 0xC;
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg2 -= local325 * arg5;
						arg7 -= local219 * arg5;
						arg0 -= arg5 * local248;
						arg5 = 0;
					}
					if (arg6 < 0) {
						arg8 -= local267 * arg6;
						arg6 = 0;
					}
					if (arg5 != arg6 && local248 > local219 || arg6 == arg5 && local267 < local219) {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 = Static69.anInt6608 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static106.method2188(arg5, (arg8 >> 12) + 1, (arg7 >> 12) - 1, arg2, Static543.anIntArray544, local312)) {
										return false;
									}
									arg5 += Static69.anInt6608;
									arg7 += local219;
									arg2 += local325;
									arg8 += local267;
								}
							}
							if (!Static106.method2188(arg5, (arg0 >> 12) + 1, (arg7 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
								return false;
							}
							arg7 += local219;
							arg2 += local325;
							arg5 += Static69.anInt6608;
							arg0 += local248;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 = Static69.anInt6608 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static106.method2188(arg5, (arg7 >> 12) + 1, (arg8 >> 12) - 1, arg2, Static543.anIntArray544, local312)) {
										return false;
									}
									arg7 += local219;
									arg2 += local325;
									arg8 += local267;
									arg5 += Static69.anInt6608;
								}
							}
							if (!Static106.method2188(arg5, (arg7 >> 12) + 1, (arg0 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
								return false;
							}
							arg0 += local248;
							arg5 += Static69.anInt6608;
							arg7 += local219;
							arg2 += local325;
						}
					}
				} else {
					arg8 = arg0 <<= 0xC;
					arg7 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= local219 * arg5;
						arg0 -= arg5 * local248;
						arg2 -= local325 * arg5;
						arg5 = 0;
					}
					if (arg4 < 0) {
						arg7 -= local267 * arg4;
						arg4 = 0;
					}
					if (local219 < local248) {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 = Static69.anInt6608 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static106.method2188(arg5, (arg0 >> 12) + 1, (arg7 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
										return false;
									}
									arg2 += local325;
									arg0 += local248;
									arg7 += local267;
									arg5 += Static69.anInt6608;
								}
							}
							if (!Static106.method2188(arg5, (arg0 >> 12) + 1, (arg8 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
								return false;
							}
							arg2 += local325;
							arg0 += local248;
							arg8 += local219;
							arg5 += Static69.anInt6608;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 = Static69.anInt6608 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static106.method2188(arg5, (arg7 >> 12) + 1, (arg0 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
										return false;
									}
									arg0 += local248;
									arg5 += Static69.anInt6608;
									arg7 += local267;
									arg2 += local325;
								}
							}
							if (!Static106.method2188(arg5, (arg8 >> 12) + 1, (arg0 >> 12) + -1, arg2, Static543.anIntArray544, local312)) {
								return false;
							}
							arg5 += Static69.anInt6608;
							arg0 += local248;
							arg8 += local219;
							arg2 += local325;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
	public static void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(16, arg0);
		local8.method7363();
		local8.anInt9381 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)I")
	public static int method7968() {
		return Static372.aClass163_1.method4033();
	}
}
