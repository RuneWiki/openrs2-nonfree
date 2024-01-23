import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "Lclient!tm;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
	public static int anInt240;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "Lclient!gi;")
	public static Class64 aClass64_1 = new Class64(64);

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
	public static int anInt239 = 0;

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString8 = "slide:";

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[B)Z")
	public static boolean method180(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub18 local13 = new Class1_Sub18(arg0);
		@Pc(17) int local17 = local13.method3122();
		if (local17 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local13.method3122() == 1;
		if (local34) {
			Static131.method2057(local13);
		}
		Static287.method4363(local13);
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
	public static int method182(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLclient!t;ILclient!t;ZII)I")
	public static int method183(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class152_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class152_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = Static57.method935(arg5, arg4, arg3, arg1);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static57.method935(arg2, arg0, arg3, arg1);
			return arg0 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!rf;)V")
	public static void method184(@OriginalArg(1) Class6_Sub6 arg0) {
		arg0.aBoolean340 = false;
		@Pc(26) Class133 local26;
		if (arg0.anInt4544 != -1) {
			local26 = Static262.method4031(arg0.anInt4544);
			if (local26 == null || local26.anIntArray461 == null) {
				arg0.anInt4544 = -1;
			} else {
				arg0.anInt4510++;
				if (local26.anIntArray461.length > arg0.anInt4526 && local26.anIntArray460[arg0.anInt4526] < arg0.anInt4510) {
					arg0.anInt4510 = 1;
					arg0.anInt4507++;
					arg0.anInt4526++;
					Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local26, arg0.anInt4569, arg0.anInt4526, arg0.anInt4562);
				}
				if (arg0.anInt4526 >= local26.anIntArray461.length) {
					arg0.anInt4526 = 0;
					arg0.anInt4510 = 0;
					Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local26, arg0.anInt4569, arg0.anInt4526, arg0.anInt4562);
				}
				arg0.anInt4507 = arg0.anInt4526 + 1;
				if (local26.anIntArray461.length <= arg0.anInt4507) {
					arg0.anInt4507 = 0;
				}
			}
		}
		@Pc(162) Class133 local162;
		if (arg0.anInt4580 != -1 && arg0.anInt4548 <= Static261.anInt5259) {
			@Pc(152) Class25 local152 = Static280.method4295(arg0.anInt4580);
			@Pc(155) int local155 = local152.anInt838;
			if (local155 == -1) {
				arg0.anInt4580 = -1;
			} else {
				label304: {
					local162 = Static262.method4031(local155);
					if (local152.aBoolean78) {
						if (local162.anInt4030 == 3) {
							if (arg0.anInt4581 > 0 && Static261.anInt5259 >= arg0.anInt4515 && arg0.anInt4559 < Static261.anInt5259) {
								arg0.anInt4580 = -1;
								break label304;
							}
						} else if (local162.anInt4030 == 1 && arg0.anInt4581 > 0 && Static261.anInt5259 >= arg0.anInt4515 && Static261.anInt5259 > arg0.anInt4559) {
							arg0.anInt4548 = Static261.anInt5259 + 1;
							break label304;
						}
					}
					if (local162 == null || local162.anIntArray461 == null) {
						arg0.anInt4580 = -1;
					} else {
						if (arg0.anInt4578 < 0) {
							arg0.anInt4578 = 0;
							Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local162, arg0.anInt4569, 0, arg0.anInt4562);
						}
						arg0.anInt4525++;
						if (arg0.anInt4578 < local162.anIntArray461.length && local162.anIntArray460[arg0.anInt4578] < arg0.anInt4525) {
							arg0.anInt4578++;
							arg0.anInt4525 = 1;
							Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local162, arg0.anInt4569, arg0.anInt4578, arg0.anInt4562);
						}
						if (arg0.anInt4578 >= local162.anIntArray461.length) {
							if (local152.aBoolean78) {
								arg0.anInt4578 -= local162.anInt4026;
								arg0.anInt4539++;
								if (local162.anInt4022 <= arg0.anInt4539) {
									arg0.anInt4580 = -1;
								} else if (arg0.anInt4578 >= 0 && arg0.anInt4578 < local162.anIntArray461.length) {
									Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local162, arg0.anInt4569, arg0.anInt4578, arg0.anInt4562);
								} else {
									arg0.anInt4580 = -1;
								}
							} else {
								arg0.anInt4580 = -1;
							}
						}
						arg0.anInt4571 = arg0.anInt4578 + 1;
						if (arg0.anInt4571 >= local162.anIntArray461.length) {
							if (local152.aBoolean78) {
								arg0.anInt4571 -= local162.anInt4026;
								if (arg0.anInt4539 + 1 >= local162.anInt4022) {
									arg0.anInt4571 = -1;
								} else if (arg0.anInt4571 < 0 || arg0.anInt4571 >= local162.anIntArray461.length) {
									arg0.anInt4571 = -1;
								}
							} else {
								arg0.anInt4571 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4572 != -1 && arg0.anInt4506 <= 1) {
			local26 = Static262.method4031(arg0.anInt4572);
			if (local26.anInt4030 == 3) {
				if (arg0.anInt4581 > 0 && Static261.anInt5259 >= arg0.anInt4515 && Static261.anInt5259 > arg0.anInt4559) {
					arg0.anInt4572 = -1;
				}
			} else if (local26.anInt4030 == 1 && arg0.anInt4581 > 0 && Static261.anInt5259 >= arg0.anInt4515 && arg0.anInt4559 < Static261.anInt5259) {
				arg0.anInt4506 = 1;
			}
		}
		if (arg0.anInt4572 != -1 && arg0.anInt4506 == 0) {
			local26 = Static262.method4031(arg0.anInt4572);
			if (local26 == null || local26.anIntArray461 == null) {
				arg0.anInt4572 = -1;
			} else {
				arg0.anInt4516++;
				if (arg0.anInt4570 < local26.anIntArray461.length && arg0.anInt4516 > local26.anIntArray460[arg0.anInt4570]) {
					arg0.anInt4570++;
					arg0.anInt4516 = 1;
					Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local26, arg0.anInt4569, arg0.anInt4570, arg0.anInt4562);
				}
				if (arg0.anInt4570 >= local26.anIntArray461.length) {
					arg0.anInt4570 -= local26.anInt4026;
					arg0.anInt4557++;
					if (local26.anInt4022 <= arg0.anInt4557) {
						arg0.anInt4572 = -1;
					} else if (arg0.anInt4570 >= 0 && arg0.anInt4570 < local26.anIntArray461.length) {
						Static128.method1976(arg0 == Static28.aClass6_Sub6_Sub2_1, local26, arg0.anInt4569, arg0.anInt4570, arg0.anInt4562);
					} else {
						arg0.anInt4572 = -1;
					}
				}
				arg0.anInt4549 = arg0.anInt4570 + 1;
				if (arg0.anInt4549 >= local26.anIntArray461.length) {
					arg0.anInt4549 -= local26.anInt4026;
					if (local26.anInt4022 <= arg0.anInt4557 + 1) {
						arg0.anInt4549 = -1;
					} else if (arg0.anInt4549 < 0 || arg0.anInt4549 >= local26.anIntArray461.length) {
						arg0.anInt4549 = -1;
					}
				}
				arg0.aBoolean340 = local26.aBoolean301;
			}
		}
		if (arg0.anInt4506 > 0) {
			arg0.anInt4506--;
		}
		for (@Pc(703) int local703 = 0; local703 < arg0.aClass160Array3.length; local703++) {
			@Pc(713) Class160 local713 = arg0.aClass160Array3[local703];
			if (local713 != null) {
				if (local713.anInt5251 > 0) {
					local713.anInt5251--;
				} else {
					local162 = Static262.method4031(local713.anInt5254);
					if (local162 == null || local162.anIntArray461 == null) {
						arg0.aClass160Array3[local703] = null;
					} else {
						local713.anInt5250++;
						if (local713.anInt5257 < local162.anIntArray461.length && local162.anIntArray460[local713.anInt5257] < local713.anInt5250) {
							local713.anInt5257++;
							local713.anInt5250 = 1;
							Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg0, local162, arg0.anInt4569, local713.anInt5257, arg0.anInt4562);
						}
						if (local713.anInt5257 >= local162.anIntArray461.length) {
							local713.anInt5252++;
							local713.anInt5257 -= local162.anInt4026;
							if (local713.anInt5252 >= local162.anInt4022) {
								arg0.aClass160Array3[local703] = null;
							} else if (local713.anInt5257 >= 0 && local713.anInt5257 < local162.anIntArray461.length) {
								Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg0, local162, arg0.anInt4569, local713.anInt5257, arg0.anInt4562);
							} else {
								arg0.aClass160Array3[local703] = null;
							}
						}
						local713.anInt5253 = local713.anInt5257 + 1;
						if (local162.anIntArray461.length <= local713.anInt5253) {
							local713.anInt5253 -= local162.anInt4026;
							if (local162.anInt4022 <= local713.anInt5252 + 1) {
								local713.anInt5253 = -1;
							} else if (local713.anInt5253 < 0 || local713.anInt5253 >= local162.anIntArray461.length) {
								local713.anInt5253 = -1;
							}
						}
					}
				}
			}
		}
	}
}
