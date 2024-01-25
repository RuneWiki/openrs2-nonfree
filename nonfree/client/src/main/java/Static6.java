import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ada", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString4 = "";

	@OriginalMember(owner = "client!ada", name = "K", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ada", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= Static130.anInt2131 && arg7 <= Static89.anInt1576 && Static130.anInt2131 <= arg5 && Static89.anInt1576 >= arg5 && arg6 >= Static130.anInt2131 && arg6 <= Static89.anInt1576 && Static130.anInt2131 <= arg8 && Static89.anInt1576 >= arg8 && arg0 >= Static275.anInt4756 && Static48.anInt898 >= arg0 && arg2 >= Static275.anInt4756 && Static48.anInt898 >= arg2 && arg4 >= Static275.anInt4756 && Static48.anInt898 >= arg4 && arg3 >= Static275.anInt4756 && arg3 <= Static48.anInt898) {
			Static205.method2541(arg2, arg6, arg3, arg1, arg8, arg7, arg5, arg0, arg4);
		} else {
			Static305.method4396(arg4, arg3, arg0, arg8, arg2, arg5, arg1, arg7, arg6);
		}
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)Lclient!hd;")
	public static Class139 method118() {
		try {
			return (Class139) Class.forName("Class139_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(23) Throwable local23) {
			return new Class139_Sub2();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILclient!mq;ILclient!lr;)V")
	public static void method119(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub2_Sub1_Sub4_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub7_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		if ((arg2 & 0x10) != 0) {
			local18 = arg3.method4464();
			@Pc(21) byte[] local21 = new byte[local18];
			@Pc(26) Class2_Sub7 local26 = new Class2_Sub7(local21);
			arg3.method4504(local18, local21);
			Static316.aClass2_Sub7Array1[arg0] = local26;
			arg1.method4908(local26);
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt5815 = arg3.method4521();
			if (arg1.anInt8431 == 0) {
				arg1.method6763(arg1.anInt5815);
				arg1.anInt5815 = -1;
			}
		}
		@Pc(85) int local85;
		@Pc(91) int local91;
		@Pc(77) int[] local77;
		@Pc(80) int[] local80;
		if ((arg2 & 0x4000) != 0) {
			local18 = arg3.method4466();
			local77 = new int[local18];
			local80 = new int[local18];
			@Pc(83) int[] local83 = new int[local18];
			for (local85 = 0; local85 < local18; local85++) {
				local91 = arg3.method4518();
				if (local91 == 65535) {
					local91 = -1;
				}
				local77[local85] = local91;
				local80[local85] = arg3.method4515();
				local83[local85] = arg3.method4518();
			}
			Static455.method5930(local83, local77, arg1, local80);
		}
		@Pc(141) int local141;
		@Pc(145) int local145;
		if ((arg2 & 0x20000) != 0) {
			local18 = Static532.anInt8757;
			local141 = arg3.method4458();
			local145 = arg3.method4488();
			arg1.method6769(local141, local145, local18);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.aString126 = arg3.method4494();
			if (arg1.aString126.charAt(0) == '~') {
				arg1.aString126 = arg1.aString126.substring(1);
				Static316.method4596(arg1.method4902(), 2, arg1.aString126, arg1.method4906(), arg1.aString76, 0);
			} else if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == arg1) {
				Static316.method4596(arg1.method4902(), 2, arg1.aString126, arg1.method4906(), arg1.aString76, 0);
			}
			arg1.anInt8411 = 0;
			arg1.anInt8417 = 0;
			arg1.anInt8391 = 150;
		}
		if ((arg2 & 0x20) != 0) {
			local18 = arg3.method4518();
			local141 = arg3.method4496();
			if (local18 == 65535) {
				local18 = -1;
			}
			local145 = arg3.method4515();
			arg1.method6779(local145, local141, local18, false);
		}
		if ((arg2 & 0x40) != 0) {
			@Pc(265) int[] local265 = new int[4];
			for (local141 = 0; local141 < 4; local141++) {
				local265[local141] = arg3.method4521();
				if (local265[local141] == 65535) {
					local265[local141] = -1;
				}
			}
			local145 = arg3.method4515();
			Static195.method3585(arg1, local145, local265);
		}
		if ((arg2 & 0x1000) != 0) {
			local18 = arg3.method4518();
			if (local18 == 65535) {
				local18 = -1;
			}
			local141 = arg3.method4490();
			local145 = arg3.method4515();
			arg1.method6779(local145, local141, local18, true);
		}
		if ((arg2 & 0x40000) != 0) {
			local18 = arg3.method4515();
			local77 = new int[local18];
			local80 = new int[local18];
			for (@Pc(343) int local343 = 0; local343 < local18; local343++) {
				local85 = arg3.method4521();
				if ((local85 & 0xC000) == 49152) {
					local91 = arg3.method4465();
					local77[local343] = local91 | local85 << 16;
				} else {
					local77[local343] = local85;
				}
				local80[local343] = arg3.method4517();
			}
			arg1.method6774(local80, local77);
		}
		if ((arg2 & 0x800) != 0) {
			arg1.aBoolean462 = arg3.method4515() == 1;
		}
		if ((arg2 & 0x200) != 0) {
			local7 = arg3.method4522();
		}
		if ((arg2 & 0x400) != 0) {
			local18 = arg3.method4518();
			arg1.anInt8375 = arg3.method4515();
			arg1.anInt8373 = arg3.method4515();
			arg1.anInt8403 = local18 & 0x7FFF;
			arg1.aBoolean708 = (local18 & 0x8000) != 0;
			arg1.anInt8356 = arg1.anInt8375 + Static532.anInt8757 + arg1.anInt8403;
		}
		if ((arg2 & 0x2) != 0) {
			local18 = arg3.method4458();
			local141 = arg3.method4488();
			arg1.method6769(local18, local141, Static532.anInt8757);
			arg1.anInt8354 = Static532.anInt8757 + 300;
			arg1.anInt8348 = arg3.method4466();
		}
		if ((arg2 & 0x80) != 0) {
			Static12.aByteArray5[arg0] = arg3.method4522();
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte121 = arg3.method4505();
			arg1.aByte122 = arg3.method4505();
			arg1.aByte120 = arg3.method4477();
			arg1.aByte119 = (byte) arg3.method4515();
			arg1.anInt8352 = Static532.anInt8757 + arg3.method4465();
			arg1.anInt8422 = Static532.anInt8757 + arg3.method4521();
		}
		if ((arg2 & 0x8000) != 0) {
			arg1.anInt8358 = arg3.method4505();
			arg1.anInt8359 = arg3.method4522();
			arg1.anInt8401 = arg3.method4505();
			arg1.anInt8363 = arg3.method4505();
			arg1.anInt8369 = arg3.method4517() + Static532.anInt8757;
			arg1.anInt8412 = arg3.method4518() + Static532.anInt8757;
			arg1.anInt8426 = arg3.method4488();
			arg1.anInt8430 = 0;
			if (arg1.aBoolean459) {
				arg1.anInt8431 = 0;
				arg1.anInt8401 += arg1.anInt5830;
				arg1.anInt8358 += arg1.anInt5830;
				arg1.anInt8359 += arg1.anInt5833;
				arg1.anInt8363 += arg1.anInt5833;
			} else {
				arg1.anInt8358 += arg1.anIntArray566[0];
				arg1.anInt8401 += arg1.anIntArray566[0];
				arg1.anInt8359 += arg1.anIntArray565[0];
				arg1.anInt8431 = 1;
				arg1.anInt8363 += arg1.anIntArray565[0];
			}
		}
		if ((arg2 & 0x4) != 0) {
			local18 = arg3.method4465();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg1.anInt8424 = local18;
		}
		if (!arg1.aBoolean459) {
			return;
		}
		if (local7 == 127) {
			arg1.method4907(arg1.anInt5830, arg1.anInt5833);
			return;
		}
		@Pc(706) byte local706;
		if (local7 == -1) {
			local706 = Static12.aByteArray5[arg0];
		} else {
			local706 = local7;
		}
		arg1.method4910(arg1.anInt5833, arg1.anInt5830, local706);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZI)I")
	public static int method120(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method122(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static472.method6123(arg1, -1, -1, arg0);
	}
}
