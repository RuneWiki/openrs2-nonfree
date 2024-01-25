import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!gma", name = "h", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!gma", name = "c", descriptor = "Lclient!et;")
	public static Class2_Sub20 aClass2_Sub20_4;

	@OriginalMember(owner = "client!gma", name = "e", descriptor = "I")
	public static int anInt3427 = -1;

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(IIIIIBIIII)Z")
	public static boolean method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 > 2000 || arg2 > 2000 || arg3 > 2000 || arg7 > 2000 || arg4 > 2000 || arg6 > 2000) {
			return false;
		} else if (arg0 >= -2000 && arg2 >= -2000 && arg3 >= -2000 && arg7 >= -2000 && arg4 >= -2000 && arg6 >= -2000) {
			@Pc(90) int local90;
			if (Static637.anInt4095 == 2) {
				local90 = Static451.anInt7308 * arg0 + arg7;
				if (local90 >= 0 && local90 < Static146.anIntArray186.length && Static146.anIntArray186[local90] > (arg1 << 8) - 38400) {
					return false;
				}
				local90 = arg2 * Static451.anInt7308 + arg4;
				if (local90 >= 0 && Static146.anIntArray186.length > local90 && (arg8 << 8) - 38400 < Static146.anIntArray186[local90]) {
					return false;
				}
				local90 = Static451.anInt7308 * arg3 + arg6;
				if (local90 >= 0 && local90 < Static146.anIntArray186.length && Static146.anIntArray186[local90] > (arg5 << 8) - 38400) {
					return false;
				}
			}
			local90 = arg4 - arg7;
			@Pc(196) int local196 = arg2 - arg0;
			@Pc(201) int local201 = arg6 - arg7;
			@Pc(206) int local206 = arg3 - arg0;
			@Pc(210) int local210 = arg8 - arg1;
			@Pc(215) int local215 = arg5 - arg1;
			if (arg2 > arg0 && arg3 > arg3) {
				if (arg2 > arg3) {
					arg2++;
				} else {
					arg3++;
				}
				arg0--;
			} else if (arg3 > arg2) {
				arg2--;
				if (arg3 < arg0) {
					arg0++;
				} else {
					arg3++;
				}
			} else {
				if (arg0 <= arg2) {
					arg2++;
				} else {
					arg0++;
				}
				arg3--;
			}
			@Pc(292) int local292 = 0;
			if (arg2 != arg0) {
				local292 = (arg4 - arg7 << 12) / (arg2 - arg0);
			}
			@Pc(309) int local309 = 0;
			if (arg3 != arg2) {
				local309 = (arg6 - arg4 << 12) / (arg3 - arg2);
			}
			@Pc(326) int local326 = 0;
			if (arg0 != arg3) {
				local326 = (arg7 - arg6 << 12) / (arg0 - arg3);
			}
			@Pc(352) int local352 = local90 * local206 - local196 * local201;
			if (local352 == 0) {
				return false;
			}
			@Pc(373) int local373 = (local206 * local210 - local215 * local196 << 8) / local352;
			@Pc(386) int local386 = (local215 * local90 - local210 * local201 << 8) / local352;
			if (arg2 >= arg0 && arg0 <= arg3) {
				if (arg0 >= Static627.anInt9602) {
					return true;
				}
				arg1 = (arg1 << 8) + local373 - local373 * arg7;
				if (Static627.anInt9602 < arg2) {
					arg2 = Static627.anInt9602;
				}
				if (arg3 > Static627.anInt9602) {
					arg3 = Static627.anInt9602;
				}
				if (arg2 >= arg3) {
					arg4 = arg7 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= local386 * arg0;
						arg4 -= arg0 * local326;
						arg7 -= local292 * arg0;
						arg0 = 0;
					}
					arg6 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= local309 * arg3;
						arg3 = 0;
					}
					if ((arg0 == arg3 || local292 <= local326) && (arg3 != arg0 || local292 >= local309)) {
						arg2 -= arg3;
						arg3 -= arg0;
						arg0 *= Static451.anInt7308;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg6 >> 12) + 1, (arg7 >> 12) + -1, arg0)) {
										return false;
									}
									arg1 += local386;
									arg0 += Static451.anInt7308;
									arg7 += local292;
									arg6 += local309;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg4 >> 12) + 1, (arg7 >> 12) + -1, arg0)) {
								return false;
							}
							arg0 += Static451.anInt7308;
							arg1 += local386;
							arg7 += local292;
							arg4 += local326;
						}
					} else {
						arg2 -= arg3;
						arg3 -= arg0;
						arg0 *= Static451.anInt7308;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg7 >> 12) + 1, (arg6 >> 12) - 1, arg0)) {
										return false;
									}
									arg7 += local292;
									arg6 += local309;
									arg1 += local386;
									arg0 += Static451.anInt7308;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg7 >> 12) + 1, (arg4 >> 12) + -1, arg0)) {
								return false;
							}
							arg7 += local292;
							arg0 += Static451.anInt7308;
							arg1 += local386;
							arg4 += local326;
						}
					}
				} else {
					arg6 = arg7 <<= 0xC;
					arg4 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= local326 * arg0;
						arg7 -= arg0 * local292;
						arg1 -= local386 * arg0;
						arg0 = 0;
					}
					if (arg2 < 0) {
						arg4 -= arg2 * local309;
						arg2 = 0;
					}
					if (arg0 != arg2 && local326 < local292 || arg2 == arg0 && local326 > local309) {
						arg3 -= arg2;
						arg2 -= arg0;
						arg0 = Static451.anInt7308 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg4 >> 12) + 1, (arg6 >> 12) + -1, arg0)) {
										return false;
									}
									arg0 += Static451.anInt7308;
									arg6 += local326;
									arg4 += local309;
									arg1 += local386;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg7 >> 12) + 1, (arg6 >> 12) - 1, arg0)) {
								return false;
							}
							arg7 += local292;
							arg6 += local326;
							arg1 += local386;
							arg0 += Static451.anInt7308;
						}
					} else {
						arg3 -= arg2;
						arg2 -= arg0;
						arg0 = Static451.anInt7308 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg6 >> 12) + 1, (arg4 >> 12) + -1, arg0)) {
										return false;
									}
									arg1 += local386;
									arg0 += Static451.anInt7308;
									arg6 += local326;
									arg4 += local309;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg1, local373, (arg6 >> 12) + 1, (arg7 >> 12) + -1, arg0)) {
								return false;
							}
							arg6 += local326;
							arg0 += Static451.anInt7308;
							arg1 += local386;
							arg7 += local292;
						}
					}
				}
			} else if (arg2 > arg3) {
				if (Static627.anInt9602 <= arg3) {
					return true;
				}
				arg5 = local373 + (arg5 << 8) - arg6 * local373;
				if (arg2 > Static627.anInt9602) {
					arg2 = Static627.anInt9602;
				}
				if (Static627.anInt9602 < arg0) {
					arg0 = Static627.anInt9602;
				}
				if (arg2 > arg0) {
					arg4 = arg6 <<= 0xC;
					arg7 <<= 0xC;
					if (arg3 < 0) {
						arg4 -= local309 * arg3;
						arg6 -= local326 * arg3;
						arg5 -= local386 * arg3;
						arg3 = 0;
					}
					if (arg0 < 0) {
						arg7 -= arg0 * local292;
						arg0 = 0;
					}
					if (local309 >= local326) {
						arg2 -= arg0;
						arg0 -= arg3;
						arg3 = Static451.anInt7308 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg4 >> 12) + 1, (arg7 >> 12) - 1, arg3)) {
										return false;
									}
									arg4 += local309;
									arg7 += local292;
									arg3 += Static451.anInt7308;
									arg5 += local386;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg4 >> 12) + 1, (arg6 >> 12) + -1, arg3)) {
								return false;
							}
							arg3 += Static451.anInt7308;
							arg5 += local386;
							arg6 += local326;
							arg4 += local309;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg3;
						arg3 *= Static451.anInt7308;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg7 >> 12) + 1, (arg4 >> 12) - 1, arg3)) {
										return false;
									}
									arg3 += Static451.anInt7308;
									arg4 += local309;
									arg7 += local292;
									arg5 += local386;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg6 >> 12) + 1, (arg4 >> 12) - 1, arg3)) {
								return false;
							}
							arg3 += Static451.anInt7308;
							arg5 += local386;
							arg4 += local309;
							arg6 += local326;
						}
					}
				} else {
					arg7 = arg6 <<= 0xC;
					arg4 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= local326 * arg3;
						arg5 -= arg3 * local386;
						arg7 -= local309 * arg3;
						arg3 = 0;
					}
					if (arg2 < 0) {
						arg4 -= local292 * arg2;
						arg2 = 0;
					}
					if (local309 >= local326) {
						arg0 -= arg2;
						arg2 -= arg3;
						arg3 = Static451.anInt7308 * arg3;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg4 >> 12) + 1, (arg6 >> 12) + -1, arg3)) {
										return false;
									}
									arg4 += local292;
									arg3 += Static451.anInt7308;
									arg5 += local386;
									arg6 += local326;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg7 >> 12) + 1, (arg6 >> 12) + -1, arg3)) {
								return false;
							}
							arg7 += local309;
							arg3 += Static451.anInt7308;
							arg6 += local326;
							arg5 += local386;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg3;
						arg3 *= Static451.anInt7308;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg6 >> 12) + 1, (arg4 >> 12) - 1, arg3)) {
										return false;
									}
									arg5 += local386;
									arg3 += Static451.anInt7308;
									arg6 += local326;
									arg4 += local292;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg5, local373, (arg6 >> 12) + 1, (arg7 >> 12) + -1, arg3)) {
								return false;
							}
							arg7 += local309;
							arg6 += local326;
							arg3 += Static451.anInt7308;
							arg5 += local386;
						}
					}
				}
			} else if (arg2 >= Static627.anInt9602) {
				return true;
			} else {
				if (Static627.anInt9602 < arg3) {
					arg3 = Static627.anInt9602;
				}
				if (Static627.anInt9602 < arg0) {
					arg0 = Static627.anInt9602;
				}
				arg8 = (arg8 << 8) + local373 - local373 * arg4;
				if (arg3 < arg0) {
					arg7 = arg4 <<= 0xC;
					arg6 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= local386 * arg2;
						arg4 -= arg2 * local309;
						arg7 -= local292 * arg2;
						arg2 = 0;
					}
					if (arg3 < 0) {
						arg6 -= arg3 * local326;
						arg3 = 0;
					}
					if (arg3 != arg2 && local292 < local309 || arg3 == arg2 && local326 < local292) {
						arg0 -= arg3;
						arg3 -= arg2;
						arg2 = Static451.anInt7308 * arg2;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg6 >> 12) + 1, (arg7 >> 12) - 1, arg2)) {
										return false;
									}
									arg2 += Static451.anInt7308;
									arg6 += local326;
									arg8 += local386;
									arg7 += local292;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg4 >> 12) + 1, (arg7 >> 12) + -1, arg2)) {
								return false;
							}
							arg4 += local309;
							arg7 += local292;
							arg2 += Static451.anInt7308;
							arg8 += local386;
						}
					} else {
						arg0 -= arg3;
						arg3 -= arg2;
						arg2 *= Static451.anInt7308;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg7 >> 12) + 1, (arg6 >> 12) - 1, arg2)) {
										return false;
									}
									arg2 += Static451.anInt7308;
									arg6 += local326;
									arg8 += local386;
									arg7 += local292;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg7 >> 12) + 1, (arg4 >> 12) + -1, arg2)) {
								return false;
							}
							arg4 += local309;
							arg8 += local386;
							arg2 += Static451.anInt7308;
							arg7 += local292;
						}
					}
				} else {
					arg6 = arg4 <<= 0xC;
					arg7 <<= 0xC;
					if (arg2 < 0) {
						arg4 -= local309 * arg2;
						arg6 -= arg2 * local292;
						arg8 -= local386 * arg2;
						arg2 = 0;
					}
					if (arg0 < 0) {
						arg7 -= arg0 * local326;
						arg0 = 0;
					}
					if (local309 > local292) {
						arg3 -= arg0;
						arg0 -= arg2;
						arg2 = Static451.anInt7308 * arg2;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg4 >> 12) + 1, (arg7 >> 12) + -1, arg2)) {
										return false;
									}
									arg7 += local326;
									arg8 += local386;
									arg4 += local309;
									arg2 += Static451.anInt7308;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg4 >> 12) + 1, (arg6 >> 12) - 1, arg2)) {
								return false;
							}
							arg2 += Static451.anInt7308;
							arg8 += local386;
							arg6 += local292;
							arg4 += local309;
						}
					} else {
						arg3 -= arg0;
						arg0 -= arg2;
						arg2 = Static451.anInt7308 * arg2;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg7 >> 12) + 1, (arg4 >> 12) + -1, arg2)) {
										return false;
									}
									arg7 += local326;
									arg2 += Static451.anInt7308;
									arg8 += local386;
									arg4 += local309;
								}
							}
							if (!Static221.method3094(Static146.anIntArray186, arg8, local373, (arg6 >> 12) + 1, (arg4 >> 12) + -1, arg2)) {
								return false;
							}
							arg2 += Static451.anInt7308;
							arg6 += local292;
							arg8 += local386;
							arg4 += local309;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gma", name = "c", descriptor = "(I)V")
	public static void method2998() {
		for (@Pc(10) Class2_Sub38 local10 = (Class2_Sub38) Static594.aClass60_191.method1226(7); local10 != null; local10 = (Class2_Sub38) Static594.aClass60_191.method1228()) {
			if (local10.aBoolean544) {
				local10.method5816();
			}
		}
		for (@Pc(42) Class2_Sub38 local42 = (Class2_Sub38) Static171.aClass60_56.method1226(7); local42 != null; local42 = (Class2_Sub38) Static171.aClass60_56.method1228()) {
			if (local42.aBoolean544) {
				local42.method5816();
			}
		}
	}

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(IB)I")
	public static int method3000(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
