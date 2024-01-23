import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "[Lclient!wa;")
	public static Class180[] aClass180Array1 = new Class180[8];

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "S")
	public static short aShort44 = 320;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString292 = "Please remove ";

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[S")
	public static short[] aShortArray93 = new short[500];

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	public static int anInt6018 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 method4807() {
		@Pc(13) int local13 = Static19.anIntArray30[0] * Static30.anIntArray46[0];
		@Pc(22) byte[] local22 = Static273.aByteArrayArray115[0];
		@Pc(82) Class2_Sub3_Sub1_Sub1 local82;
		if (Static29.aBooleanArray4[0]) {
			@Pc(30) byte[] local30 = Static107.aByteArrayArray52[0];
			@Pc(33) int[] local33 = new int[local13];
			for (@Pc(35) int local35 = 0; local35 < local13; local35++) {
				local33[local35] = Static187.anIntArray314[local22[local35] & 0xFF] | (local30[local35] & 0xFF) << 24;
			}
			local82 = new Class2_Sub3_Sub1_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], local33);
		} else {
			@Pc(87) int[] local87 = new int[local13];
			for (@Pc(89) int local89 = 0; local89 < local13; local89++) {
				local87[local89] = Static187.anIntArray314[local22[local89] & 0xFF];
			}
			local82 = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], local87);
		}
		Static171.method2953();
		return local82;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static171.anIntArray297[arg1] = arg0;
		@Pc(19) Class2_Sub17 local19 = (Class2_Sub17) Static9.aClass79_1.method2002((long) arg1);
		if (local19 == null) {
			local19 = new Class2_Sub17(4611686018427387905L);
			Static9.aClass79_1.method1994((long) arg1, local19);
		} else if (local19.aLong175 != 4611686018427387905L) {
			local19.aLong175 = Static6.method126() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIZII[III)V")
	public static void method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		if (Static160.anInt3387 <= arg9) {
			return;
		}
		if (arg9 < Static160.anInt3389) {
			local7 = Static160.anInt3389;
		}
		@Pc(30) int local30 = arg0 + arg9;
		if (Static160.anInt3389 >= local30) {
			return;
		}
		if (Static160.anInt3387 < local30) {
			local30 = Static160.anInt3387;
		}
		@Pc(50) int local50 = arg1;
		if (Static160.anInt3392 <= arg1) {
			return;
		}
		if (arg1 < Static160.anInt3391) {
			local50 = Static160.anInt3391;
		}
		@Pc(69) int local69 = arg1 + arg8;
		if (Static160.anInt3391 >= local69) {
			return;
		}
		if (arg5 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg5 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		@Pc(105) int local105 = local7 + local50 * Static160.anInt3390;
		if (local69 > Static160.anInt3392) {
			local69 = Static160.anInt3392;
		}
		@Pc(123) int local123 = Static160.anInt3390 + local7 - local30;
		local30 -= arg9;
		local7 -= arg9;
		@Pc(136) int local136 = arg0 - local30;
		@Pc(141) int local141 = arg0 - local7;
		local69 -= arg1;
		local50 -= arg1;
		if (arg5 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg5 = 8;
		}
		@Pc(165) int local165 = arg8 - local50;
		@Pc(169) int local169 = arg8 - local69;
		@Pc(179) int local179;
		@Pc(184) int local184;
		if (arg5 == 1) {
			if (arg3 == 0) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local179 >= local184) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 1) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 <= local179) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 2) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 >= local179) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 3) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 >= local179) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			}
		} else if (arg5 == 2) {
			if (arg3 == 0) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 <= local179 >> 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 1) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local105 >= 0 && arg7.length > local105) {
							if (local184 >= local179 << 1) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						} else {
							local105++;
						}
					}
					local105 += local123;
				}
			} else if (arg3 == 2) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local184 <= local179 >> 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 3) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local184 >= local179 << 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			}
		} else if (arg5 == 3) {
			if (arg3 == 0) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local184 <= local179 >> 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 1) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local179 << 1 <= local184) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 2) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 <= local179 >> 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 3) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local184 >= local179 << 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			}
		} else if (arg5 == 4) {
			if (arg3 == 0) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local179 >> 1 <= local184) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 1) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local179 << 1 >= local184) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 2) {
				for (local179 = local50; local179 < local69; local179++) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local179 >> 1 <= local184) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			} else if (arg3 == 3) {
				for (local179 = local165 - 1; local179 >= local169; local179--) {
					for (local184 = local141 - 1; local184 >= local136; local184--) {
						if (local184 <= local179 << 1) {
							arg7[local105] = arg2;
						} else if (arg4) {
							arg7[local105] = arg6;
						}
						local105++;
					}
					local105 += local123;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg3 == 0) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (arg0 / 2 >= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 1) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local179 <= arg8 / 2) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 2) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 >= arg0 / 2) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 3) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (arg8 / 2 <= local179) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg3 == 0) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 <= local179 - arg8 / 2) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 1) {
					for (local179 = local165 - 1; local179 >= local169; local179--) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local179 - arg8 / 2 >= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 2) {
					for (local179 = local165 - 1; local179 >= local169; local179--) {
						for (local184 = local141 - 1; local184 >= local136; local184--) {
							if (local179 - arg8 / 2 >= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 3) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local141 - 1; local184 >= local136; local184--) {
							if (local179 - arg8 / 2 >= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg3 == 0) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local179 - arg8 / 2 <= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 1) {
					for (local179 = local165 - 1; local179 >= local169; local179--) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 >= local179 - arg8 / 2) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 2) {
					for (local179 = local165 - 1; local179 >= local169; local179--) {
						for (local184 = local141 - 1; local184 >= local136; local184--) {
							if (local179 - arg8 / 2 <= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
				if (arg3 == 3) {
					for (local179 = local50; local179 < local69; local179++) {
						for (local184 = local141 - 1; local184 >= local136; local184--) {
							if (local179 - arg8 / 2 <= local184) {
								arg7[local105] = arg2;
							} else if (arg4) {
								arg7[local105] = arg6;
							}
							local105++;
						}
						local105 += local123;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (local179 = local165 - 1; local179 >= local169; local179--) {
				for (local184 = local141 - 1; local184 >= local136; local184--) {
					if (local184 >= local179 >> 1) {
						arg7[local105] = arg2;
					} else if (arg4) {
						arg7[local105] = arg6;
					}
					local105++;
				}
				local105 += local123;
			}
		} else if (arg3 == 1) {
			for (local179 = local165 - 1; local179 >= local169; local179--) {
				for (local184 = local7; local184 < local30; local184++) {
					if (local179 << 1 >= local184) {
						arg7[local105] = arg2;
					} else if (arg4) {
						arg7[local105] = arg6;
					}
					local105++;
				}
				local105 += local123;
			}
		} else if (arg3 == 2) {
			for (local179 = local50; local179 < local69; local179++) {
				for (local184 = local7; local184 < local30; local184++) {
					if (local184 >= local179 >> 1) {
						arg7[local105] = arg2;
					} else if (arg4) {
						arg7[local105] = arg6;
					}
					local105++;
				}
				local105 += local123;
			}
		} else if (arg3 == 3) {
			for (local179 = local50; local179 < local69; local179++) {
				for (local184 = local141 - 1; local184 >= local136; local184--) {
					if (local184 <= local179 << 1) {
						arg7[local105] = arg2;
					} else if (arg4) {
						arg7[local105] = arg6;
					}
					local105++;
				}
				local105 += local123;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
	public static void method4811() {
		Static174.aClass46_30.method1079();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void method4812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static15.anInt356 = Static96.aClass147ArrayArray1[arg0][arg1].anInt4603;
		Static215.anInt4470 = Static96.aClass147ArrayArray1[arg0][arg1].anInt4597;
		Static63.anInt1425 = Static96.aClass147ArrayArray1[arg0][arg1].anInt4604;
		Static117.method2157((float) Static15.anInt356, (float) Static215.anInt4470, (float) Static63.anInt1425);
	}
}
