import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "Lclient!ke;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!p", name = "sb", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array9;

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1505 = Static169.method2903("blinken3:");

	@OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
	public static int anInt3942 = 0;

	@OriginalMember(owner = "client!p", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1506 = Static169.method2903("scrollbar");

	@OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
	public static int anInt3943 = 2;

	@OriginalMember(owner = "client!p", name = "lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1507 = Static169.method2903("<col=00ffff>");

	@OriginalMember(owner = "client!p", name = "pb", descriptor = "B")
	public static byte aByte9 = 0;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IBI)I")
	public static int method2769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIB)V")
	public static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = arg0 * (arg0 - 32) / arg2;
		Static62.aClass1_Sub1_Sub12_Sub4Array6[0].method2746(arg4, arg1);
		Static62.aClass1_Sub1_Sub12_Sub4Array6[1].method2746(arg4, arg1 + arg0 - 16);
		if (local7 < 8) {
			local7 = 8;
		}
		@Pc(53) int local53 = arg3 * (arg0 - local7 - 32) / (arg2 - arg0);
		Static150.method3024(arg4, arg1 + 16, 16, arg0 - 32, Static138.anInt3535);
		Static150.method3024(arg4, local53 + arg1 + 16, 16, local7, Static74.anInt2028);
		Static150.method3026(arg4, local53 + arg1 + 16, local7, Static65.anInt3650);
		Static150.method3026(arg4 + 1, arg1 - -local53 + 16, local7, Static65.anInt3650);
		Static150.method3018(arg4, arg1 + local53 + 16, 16, Static65.anInt3650);
		Static150.method3018(arg4, local53 + arg1 + 17, 16, Static65.anInt3650);
		Static150.method3026(arg4 + 15, local53 + arg1 + 16, local7, Static152.anInt3546);
		Static150.method3026(arg4 + 14, local53 + (arg1 - -17), local7 - 1, Static152.anInt3546);
		Static150.method3018(arg4, local7 + arg1 + local53 + 15, 16, Static152.anInt3546);
		Static150.method3018(arg4 + 1, local53 + arg1 + (14 - -local7), 15, Static152.anInt3546);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([Lclient!ta;[IBII[I)V")
	public static void method2771(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(23) int local23 = arg2 + 1;
		@Pc(27) int local27 = arg3 - 1;
		@Pc(31) Class78 local31 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local31;
		while (local23 > local27) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(80) int local80;
			@Pc(65) int local65;
			do {
				local23--;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg4[local48] == 2) {
						local65 = local31.anInt3805;
						local80 = arg0[local23].anInt3805;
					} else if (arg4[local48] == 1) {
						local65 = local31.anInt3806;
						if (local65 == -1 && arg1[local48] == 1) {
							local65 = 2001;
						}
						local80 = arg0[local23].anInt3806;
						if (local80 == -1 && arg1[local48] == 1) {
							local80 = 2001;
						}
					} else if (arg4[local48] == 3) {
						local65 = local31.aBoolean194 ? 1 : 0;
						local80 = arg0[local23].aBoolean194 ? 1 : 0;
					} else {
						local80 = arg0[local23].anInt3807;
						local65 = local31.anInt3807;
					}
					if (local65 != local80) {
						if ((arg1[local48] != 1 || local80 <= local65) && (arg1[local48] != 0 || local80 >= local65)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local27++;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg4[local48] == 2) {
						local80 = arg0[local27].anInt3805;
						local65 = local31.anInt3805;
					} else if (arg4[local48] == 1) {
						local80 = arg0[local27].anInt3806;
						if (local80 == -1 && arg1[local48] == 1) {
							local80 = 2001;
						}
						local65 = local31.anInt3806;
						if (local65 == -1 && arg1[local48] == 1) {
							local65 = 2001;
						}
					} else if (arg4[local48] == 3) {
						local80 = arg0[local27].aBoolean194 ? 1 : 0;
						local65 = local31.aBoolean194 ? 1 : 0;
					} else {
						local80 = arg0[local27].anInt3807;
						local65 = local31.anInt3807;
					}
					if (local80 != local65) {
						if ((arg1[local48] != 1 || local65 <= local80) && (arg1[local48] != 0 || local65 >= local80)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local23 > local27) {
				@Pc(330) Class78 local330 = arg0[local27];
				arg0[local27] = arg0[local23];
				arg0[local23] = local330;
			}
		}
		method2771(arg0, arg1, local23, arg3, arg4);
		method2771(arg0, arg1, arg2, local23 + 1, arg4);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method2772() {
		aClass7_2 = null;
		aClass23_1506 = null;
		aClass23_1505 = null;
		aClass1_Sub1_Sub12_Sub1Array9 = null;
		aClass23_1507 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBZI)Lclient!ed;")
	public static Class23 method2773(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(36) int local36 = 1;
		@Pc(40) int local40 = arg0 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(51) int local51 = local36;
		if (arg0 < 0 || arg1) {
			local51 = local36 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local51];
		if (arg0 < 0) {
			local62[0] = 45;
		} else if (arg1) {
			local62[0] = 43;
		}
		for (@Pc(78) int local78 = 0; local78 < local36; local78++) {
			@Pc(84) int local84 = arg0 % 10;
			arg0 /= 10;
			if (local84 < 0) {
				local84 = -local84;
			}
			if (local84 > 9) {
				local84 += 39;
			}
			local62[local51 - local78 - 1] = (byte) (local84 + 48);
		}
		@Pc(119) Class23 local119 = new Class23();
		local119.anInt1053 = local51;
		local119.aByteArray10 = local62;
		return local119;
	}
}
