import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "vc", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!a", name = "ad", descriptor = "I")
	public static int anInt221;

	@OriginalMember(owner = "client!a", name = "bd", descriptor = "J")
	public static long aLong6;

	@OriginalMember(owner = "client!a", name = "Uc", descriptor = "Lclient!jg;")
	public static Class1_Sub8 aClass1_Sub8_1 = new Class1_Sub8(new byte[5000]);

	@OriginalMember(owner = "client!a", name = "Wc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_69 = Static169.method2903("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!a", name = "Yc", descriptor = "I")
	public static int anInt220 = 0;

	@OriginalMember(owner = "client!a", name = "Zc", descriptor = "Lclient!n;")
	public static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!a", name = "gd", descriptor = "Lclient!ed;")
	private static Class23 aClass23_74 = Static169.method2903("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!a", name = "cd", descriptor = "Lclient!ed;")
	public static Class23 aClass23_70 = aClass23_74;

	@OriginalMember(owner = "client!a", name = "dd", descriptor = "Lclient!ed;")
	private static Class23 aClass23_71 = Static169.method2903("level)2");

	@OriginalMember(owner = "client!a", name = "ed", descriptor = "Lclient!ed;")
	public static Class23 aClass23_72 = Static169.method2903("null");

	@OriginalMember(owner = "client!a", name = "fd", descriptor = "Lclient!ed;")
	public static Class23 aClass23_73 = aClass23_71;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	public static void method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static123.aClass80_1.method2664(arg4, arg1, arg2);
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(43) int local43;
		@Pc(65) int local65;
		@Pc(71) int local71;
		if (local11 != 0) {
			local28 = Static123.aClass80_1.method2676(arg4, arg1, arg2, local11);
			local34 = local28 >> 6 & 0x3;
			local38 = local28 & 0x1F;
			@Pc(41) int[] local41 = Static8.aClass1_Sub1_Sub12_Sub1_1.anIntArray374;
			local43 = arg0;
			if (local11 > 0) {
				local43 = arg3;
			}
			local65 = 4 * 512 * (103 - arg2) + arg1 * 4 + 24624;
			local71 = local11 >> 14 & 0x7FFF;
			@Pc(75) Class1_Sub1_Sub3 local75 = Static84.method3155(local71);
			if (local75.anInt663 == -1) {
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						local41[local65] = local43;
						local41[local65 + 512] = local43;
						local41[local65 + 1024] = local43;
						local41[local65 + 1536] = local43;
					} else if (local34 == 1) {
						local41[local65] = local43;
						local41[local65 + 1] = local43;
						local41[local65 + 2] = local43;
						local41[local65 + 3] = local43;
					} else if (local34 == 2) {
						local41[local65 + 3] = local43;
						local41[local65 + 3 + 512] = local43;
						local41[local65 + 1027] = local43;
						local41[local65 + 1539] = local43;
					} else if (local34 == 3) {
						local41[local65 + 1536] = local43;
						local41[local65 + 1536 + 1] = local43;
						local41[local65 + 2 + 1536] = local43;
						local41[local65 + 1536 + 3] = local43;
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						local41[local65] = local43;
					} else if (local34 == 1) {
						local41[local65 + 3] = local43;
					} else if (local34 == 2) {
						local41[local65 + 3 + 1536] = local43;
					} else if (local34 == 3) {
						local41[local65 + 1536] = local43;
					}
				}
				if (local38 == 2) {
					if (local34 == 3) {
						local41[local65] = local43;
						local41[local65 + 512] = local43;
						local41[local65 + 1024] = local43;
						local41[local65 + 1536] = local43;
					} else if (local34 == 0) {
						local41[local65] = local43;
						local41[local65 + 1] = local43;
						local41[local65 + 2] = local43;
						local41[local65 + 3] = local43;
					} else if (local34 == 1) {
						local41[local65 + 3] = local43;
						local41[local65 + 3 + 512] = local43;
						local41[local65 + 3 + 1024] = local43;
						local41[local65 + 1536 + 3] = local43;
					} else if (local34 == 2) {
						local41[local65 + 1536] = local43;
						local41[local65 + 1536 + 1] = local43;
						local41[local65 + 1538] = local43;
						local41[local65 + 1536 + 3] = local43;
					}
				}
			} else {
				@Pc(84) Class1_Sub1_Sub12_Sub4 local84 = Static59.aClass1_Sub1_Sub12_Sub4Array5[local75.anInt663];
				if (local84 != null) {
					@Pc(97) int local97 = (local75.anInt656 * 4 - local84.anInt3905) / 2;
					@Pc(107) int local107 = (local75.anInt657 * 4 - local84.anInt3907) / 2;
					local84.method2746(arg1 * 4 + local97 + 48, (-local75.anInt657 + -arg2 + 104) * 4 + 48 + local107);
				}
			}
		}
		local11 = Static123.aClass80_1.method2688(arg4, arg1, arg2);
		if (local11 != 0) {
			local28 = Static123.aClass80_1.method2676(arg4, arg1, arg2, local11);
			local43 = local11 >> 14 & 0x7FFF;
			local34 = local28 >> 6 & 0x3;
			@Pc(475) Class1_Sub1_Sub3 local475 = Static84.method3155(local43);
			local38 = local28 & 0x1F;
			@Pc(501) int local501;
			if (local475.anInt663 != -1) {
				@Pc(488) Class1_Sub1_Sub12_Sub4 local488 = Static59.aClass1_Sub1_Sub12_Sub4Array5[local475.anInt663];
				if (local488 != null) {
					local501 = (local475.anInt657 * 4 - local488.anInt3907) / 2;
					local71 = (local475.anInt656 * 4 - local488.anInt3905) / 2;
					local488.method2746(arg1 * 4 + local71 + 48, local501 + (-local475.anInt657 + -arg2 + 104) * 4 + 48);
				}
			} else if (local38 == 9) {
				local65 = 15658734;
				if (local11 > 0) {
					local65 = 15597568;
				}
				local501 = 4 * 512 * (103 - arg2) + arg1 * 4 + 24624;
				@Pc(570) int[] local570 = Static8.aClass1_Sub1_Sub12_Sub1_1.anIntArray374;
				if (local34 == 0 || local34 == 2) {
					local570[local501 + 1536] = local65;
					local570[local501 + 1 + 1024] = local65;
					local570[local501 + 512 + 2] = local65;
					local570[local501 + 3] = local65;
				} else {
					local570[local501] = local65;
					local570[local501 + 512 + 1] = local65;
					local570[local501 + 1026] = local65;
					local570[local501 + 1536 + 3] = local65;
				}
			}
		}
		local11 = Static123.aClass80_1.method2687(arg4, arg1, arg2);
		if (local11 == 0) {
			return;
		}
		local28 = local11 >> 14 & 0x7FFF;
		@Pc(657) Class1_Sub1_Sub3 local657 = Static84.method3155(local28);
		if (local657.anInt663 == -1) {
			return;
		}
		@Pc(667) Class1_Sub1_Sub12_Sub4 local667 = Static59.aClass1_Sub1_Sub12_Sub4Array5[local657.anInt663];
		if (local667 != null) {
			local43 = (local657.anInt656 * 4 - local667.anInt3905) / 2;
			@Pc(690) int local690 = (local657.anInt657 * 4 - local667.anInt3907) / 2;
			local667.method2746(local43 + arg1 * 4 + 48, local690 + (-arg2 + 104 - local657.anInt657) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method94() {
		aClass23_69 = null;
		aClass56_1 = null;
		aClass23_74 = null;
		aClass23_70 = null;
		aClass23_71 = null;
		aClass23_73 = null;
		aByteArrayArray1 = null;
		aClass1_Sub8_1 = null;
		aClass23_72 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([Lclient!ob;II)V")
	public static void method96(@OriginalArg(0) Class60[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class60 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt3032 == 0) {
					if (local9.aClass60Array1 != null) {
						method96(local9.aClass60Array1, arg1);
					}
					@Pc(30) Class1_Sub16 local30 = (Class1_Sub16) Static12.aClass10_1.method256((long) local9.anInt3019);
					if (local30 != null) {
						Static60.method3140(arg1, local30.anInt3207);
					}
				}
				@Pc(49) Class1_Sub13 local49;
				if (arg1 == 0 && local9.anObjectArray7 != null) {
					local49 = new Class1_Sub13();
					local49.anObjectArray3 = local9.anObjectArray7;
					local49.aClass60_6 = local9;
					Static178.method3065(local49);
				}
				if (arg1 == 1 && local9.anObjectArray15 != null) {
					if (local9.anInt3016 >= 0) {
						@Pc(78) Class60 local78 = Static111.method1964(local9.anInt3019);
						if (local78 == null || local78.aClass60Array1 == null || local78.aClass60Array1.length <= local9.anInt3016 || local9 != local78.aClass60Array1[local9.anInt3016]) {
							continue;
						}
					}
					local49 = new Class1_Sub13();
					local49.anObjectArray3 = local9.anObjectArray15;
					local49.aClass60_6 = local9;
					Static178.method3065(local49);
				}
			}
		}
	}
}
