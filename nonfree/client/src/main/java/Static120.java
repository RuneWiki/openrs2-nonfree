import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!vb;")
	public static Class82 aClass82_45;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lclient!tg;")
	private static Class81 aClass81_971 = method2057("Please use a different world)3");

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_970 = aClass81_971;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	public static int anInt2668 = 0;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
	public static int anInt2671 = 1;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array14 = new Class81[1000];

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!oc", name = "ib", descriptor = "Lclient!tg;")
	public static Class81 aClass81_972 = aClass81_971;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public static void method2056() {
		if (Static158.aClass41_3 != null) {
			Static158.aClass41_3.method1340();
			Static158.aClass41_3 = null;
		}
		Static11.method564();
		Static163.method2852();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static141.aClass28Array2[local17].method1044();
		}
		System.gc();
		Static107.method1775();
		Static7.anInt158 = -1;
		Static141.aBoolean23 = false;
		Static3.method73();
		Static142.method2392(10);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tg;")
	public static Class81 method2057(@OriginalArg(0) String arg0) {
		@Pc(7) byte[] local7 = arg0.getBytes();
		@Pc(10) int local10 = local7.length;
		@Pc(18) Class81 local18 = new Class81();
		@Pc(20) int local20 = 0;
		local18.aByteArray41 = new byte[local10];
		while (local20 < local10) {
			@Pc(32) int local32 = local7[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local10 <= local20) {
					break;
				}
				@Pc(52) int local52 = local7[local20++] & 0xFF;
				local18.aByteArray41[local18.anInt3691++] = (byte) ((local32 - 40) * 43 + local52 - 48);
			} else if (local32 != 0) {
				local18.aByteArray41[local18.anInt3691++] = (byte) local32;
			}
		}
		local18.method2825();
		return local18.method2797();
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)I")
	public static int method2058(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local9 * local27 >> 12;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public static void method2059() {
		aClass82_45 = null;
		aClass81_971 = null;
		aClass81_970 = null;
		aClass81_972 = null;
		aClass81Array14 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
	public static void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static21.method421(arg0, arg3, arg2);
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(56) int local56;
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (local10 != 0L) {
			local23 = (int) local10 >> 20 & 0x3;
			local30 = (int) local10 >> 14 & 0x1F;
			@Pc(33) int[] local33 = Static114.aClass1_Sub2_Sub2_Sub3_7.anIntArray288;
			local47 = arg3 * 4 + 4 * 512 * (103 - arg2) + 24624;
			local54 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local56 = arg4;
			@Pc(60) Class1_Sub2_Sub8 local60 = Static14.method220(local54);
			if (local10 > 0L) {
				local56 = arg1;
			}
			if (local60.anInt1278 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local23 == 0) {
						local33[local47] = local56;
						local33[local47 + 512] = local56;
						local33[local47 + 1024] = local56;
						local33[local47 + 1536] = local56;
					} else if (local23 == 1) {
						local33[local47] = local56;
						local33[local47 + 1] = local56;
						local33[local47 + 2] = local56;
						local33[local47 + 3] = local56;
					} else if (local23 == 2) {
						local33[local47 + 3] = local56;
						local33[local47 + 512 + 3] = local56;
						local33[local47 + 1024 + 3] = local56;
						local33[local47 + 1536 + 3] = local56;
					} else if (local23 == 3) {
						local33[local47 + 1536] = local56;
						local33[local47 + 1 + 1536] = local56;
						local33[local47 + 2 + 1536] = local56;
						local33[local47 + 1539] = local56;
					}
				}
				if (local30 == 3) {
					if (local23 == 0) {
						local33[local47] = local56;
					} else if (local23 == 1) {
						local33[local47 + 3] = local56;
					} else if (local23 == 2) {
						local33[local47 + 3 + 1536] = local56;
					} else if (local23 == 3) {
						local33[local47 + 1536] = local56;
					}
				}
				if (local30 == 2) {
					if (local23 == 3) {
						local33[local47] = local56;
						local33[local47 + 512] = local56;
						local33[local47 + 1024] = local56;
						local33[local47 + 1536] = local56;
					} else if (local23 == 0) {
						local33[local47] = local56;
						local33[local47 + 1] = local56;
						local33[local47 + 2] = local56;
						local33[local47 + 3] = local56;
					} else if (local23 == 1) {
						local33[local47 + 3] = local56;
						local33[local47 + 515] = local56;
						local33[local47 + 1024 + 3] = local56;
						local33[local47 + 1536 + 3] = local56;
					} else if (local23 == 2) {
						local33[local47 + 1536] = local56;
						local33[local47 + 1537] = local56;
						local33[local47 + 1538] = local56;
						local33[local47 + 3 + 1536] = local56;
					}
				}
			} else {
				@Pc(75) Class1_Sub2_Sub2_Sub4 local75 = Static178.aClass1_Sub2_Sub2_Sub4Array12[local60.anInt1278];
				if (local75 != null) {
					@Pc(88) int local88 = (local60.anInt1237 * 4 - local75.anInt3358) / 2;
					@Pc(99) int local99 = (local60.anInt1277 * 4 - local75.anInt3361) / 2;
					local75.method2581(local88 + arg3 * 4 + 48, (-local60.anInt1277 + 104 - arg2) * 4 - -local99 + 48);
				}
			}
		}
		local10 = Static104.method1707(arg0, arg3, arg2);
		if ((long) 0 != local10) {
			local23 = (int) local10 >> 20 & 0x3;
			local56 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			local30 = (int) local10 >> 14 & 0x1F;
			@Pc(462) Class1_Sub2_Sub8 local462 = Static14.method220(local56);
			@Pc(497) int local497;
			if (local462.anInt1278 != -1) {
				@Pc(567) Class1_Sub2_Sub2_Sub4 local567 = Static178.aClass1_Sub2_Sub2_Sub4Array12[local462.anInt1278];
				if (local567 != null) {
					local54 = (local462.anInt1237 * 4 - local567.anInt3358) / 2;
					local497 = (local462.anInt1277 * 4 - local567.anInt3361) / 2;
					local567.method2581(arg3 * 4 + local54 + 48, local497 + (-local462.anInt1277 + -arg2 + 104) * 4 + 48);
				}
			} else if (local30 == 9) {
				local47 = 15658734;
				@Pc(476) int[] local476 = Static114.aClass1_Sub2_Sub2_Sub3_7.anIntArray288;
				if (local10 > 0L) {
					local47 = 15597568;
				}
				local497 = arg3 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
				if (local23 == 0 || local23 == 2) {
					local476[local497 + 1536] = local47;
					local476[local497 + 1024 + 1] = local47;
					local476[local497 + 512 + 2] = local47;
					local476[local497 + 3] = local47;
				} else {
					local476[local497] = local47;
					local476[local497 + 1 + 512] = local47;
					local476[local497 + 1024 + 2] = local47;
					local476[local497 + 3 + 1536] = local47;
				}
			}
		}
		local10 = Static48.method2781(arg0, arg3, arg2);
		if (local10 == 0L) {
			return;
		}
		local23 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(635) Class1_Sub2_Sub8 local635 = Static14.method220(local23);
		if (local635.anInt1278 == -1) {
			return;
		}
		@Pc(644) Class1_Sub2_Sub2_Sub4 local644 = Static178.aClass1_Sub2_Sub2_Sub4Array12[local635.anInt1278];
		if (local644 != null) {
			@Pc(657) int local657 = (local635.anInt1237 * 4 - local644.anInt3358) / 2;
			local47 = (local635.anInt1277 * 4 - local644.anInt3361) / 2;
			local644.method2581(arg3 * 4 + local657 + 48, (-arg2 + 104 + -local635.anInt1277) * 4 + 48 + local47);
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Lclient!af;")
	public static Class1_Sub4 method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub4 local7 = new Class1_Sub4();
		local7.anInt155 = arg2;
		local7.anInt157 = arg0;
		Static119.aClass5_8.method138(local7, (long) arg1);
		Static136.method2284(arg2);
		Static167.method2977(arg2);
		@Pc(29) Class77 local29 = Static41.method800(arg1);
		if (local29 != null) {
			Static51.method913(local29);
		}
		if (Static46.aClass77_7 != null) {
			Static51.method913(Static46.aClass77_7);
			Static46.aClass77_7 = null;
		}
		Static149.aBoolean145 = false;
		Static118.anInt2616 = 0;
		Static67.method1208(Static61.anInt1539, Static100.anInt2176, Static110.anInt2512, Static48.anInt3638);
		if (Static97.anInt2134 != -1) {
			Static162.method2839(1, Static97.anInt2134);
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)V")
	public static void method2062(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static53.aBooleanArray5[arg0]) {
			return;
		}
		Static106.aClass82_38.method2954(arg0);
		if (Static131.aClass77ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(32) int local32 = 0; local32 < Static131.aClass77ArrayArray1[arg0].length; local32++) {
			if (Static131.aClass77ArrayArray1[arg0][local32] != null) {
				if (Static131.aClass77ArrayArray1[arg0][local32].anInt3226 == 2) {
					local25 = false;
				} else {
					Static131.aClass77ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local25) {
			Static131.aClass77ArrayArray1[arg0] = null;
		}
		Static53.aBooleanArray5[arg0] = false;
	}
}
