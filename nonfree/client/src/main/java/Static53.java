import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!oca;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_34 = new Class81(69, 12);

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	public static int anInt1363 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III[BIZ)Z")
	public static boolean method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub20 local12 = new Class1_Sub20(arg3);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method4373();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(95) Class306 local95;
				do {
					@Pc(65) int local65;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local12.method4427();
										if (local34 == 0) {
											continue label68;
										}
										local12.method4393();
									}
									local34 = local12.method4427();
									if (local34 == 0) {
										continue label68;
									}
									local26 += local34 - 1;
									@Pc(49) int local49 = local26 & 0x3F;
									@Pc(55) int local55 = local26 >> 6 & 0x3F;
									local61 = local12.method4393() >> 2;
									local65 = arg0 + local55;
									local70 = local49 + arg1;
								} while (local65 <= 0);
							} while (local70 <= 0);
						} while (local65 >= arg2 - 1);
					} while (local70 >= arg4 - 1);
					local95 = Static146.aClass214_1.method4897(local14);
				} while (local61 == 22 && !Static479.aClass1_Sub7_Sub1_1.aBoolean220 && local95.anInt8387 == 0 && local95.anInt8406 != 1 && !local95.aBoolean608);
				local28 = true;
				if (!local95.method6974()) {
					Static30.anInt868++;
					local7 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public static void method1242() {
		Static577.aClass326_57.method7230();
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public static void method1244(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static38.anInt1024 == 2) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[0]);
				Static89.aClass328Array1[1].method7288(Static384.aClass294Array3[1]);
			} else if (Static38.anInt1024 == 3) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[0]);
				Static89.aClass328Array1[1].method7288(Static384.aClass294Array3[1]);
				Static89.aClass328Array1[2].method7288(Static384.aClass294Array3[2]);
			} else {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[0]);
				Static89.aClass328Array1[1].method7288(Static384.aClass294Array3[1]);
				Static89.aClass328Array1[2].method7288(Static384.aClass294Array3[2]);
				Static89.aClass328Array1[3].method7288(Static384.aClass294Array3[3]);
			}
		} else if (arg0 == 1) {
			if (Static38.anInt1024 == 2) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[2]);
			} else if (Static38.anInt1024 == 3) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[3]);
				Static89.aClass328Array1[1].method7288(Static384.aClass294Array3[4]);
			} else {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[4]);
				Static89.aClass328Array1[1].method7288(Static384.aClass294Array3[5]);
				Static89.aClass328Array1[2].method7288(Static384.aClass294Array3[6]);
			}
		} else if (arg0 == 2) {
			if (Static38.anInt1024 == 2) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[3]);
				return;
			}
			if (Static38.anInt1024 == 3) {
				Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[5]);
				return;
			}
			Static89.aClass328Array1[0].method7288(Static384.aClass294Array3[7]);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
	public static int method1246() {
		if (Static294.aBoolean407) {
			return 6;
		} else if (Static323.aClass1_Sub23_1 == null) {
			return 0;
		} else {
			@Pc(20) int local20 = Static323.aClass1_Sub23_1.anInt5147;
			if (Static565.method7632(local20)) {
				return 1;
			} else if (Static228.method3763(local20)) {
				return 2;
			} else if (Static376.method5467(local20)) {
				return 3;
			} else if (Static83.method1702(local20)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(II)Lclient!bda;")
	public static Class27 method1247(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static313.aFloat105 == 3.0D) {
				return Static580.aClass27_8;
			}
			if ((double) Static313.aFloat105 == 4.0D) {
				return Static40.aClass27_5;
			}
			if ((double) Static313.aFloat105 == 6.0D) {
				return Static398.aClass27_6;
			}
			if ((double) Static313.aFloat105 >= 8.0D) {
				return Static143.aClass27_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static313.aFloat105 == 3.0D) {
				return Static398.aClass27_6;
			}
			if ((double) Static313.aFloat105 == 4.0D) {
				return Static143.aClass27_2;
			}
			if ((double) Static313.aFloat105 == 6.0D) {
				return Static592.aClass27_9;
			}
			if ((double) Static313.aFloat105 >= 8.0D) {
				return Static292.aClass27_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static313.aFloat105 == 3.0D) {
				return Static592.aClass27_9;
			}
			if ((double) Static313.aFloat105 == 4.0D) {
				return Static292.aClass27_4;
			}
			if ((double) Static313.aFloat105 == 6.0D) {
				return Static264.aClass27_3;
			}
			if ((double) Static313.aFloat105 >= 8.0D) {
				return Static475.aClass27_7;
			}
		}
		return null;
	}
}
