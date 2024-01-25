import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public static int anInt4641 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)Z")
	public static boolean method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static279.anInt5384; local1++) {
			@Pc(6) Class350 local6 = Static346.aClass350Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt9833 == 1) {
				local15 = local6.anInt9835 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt9837 + (local6.anInt9830 * local15 >> 8);
					local37 = local6.anInt9836 + (local6.anInt9820 * local15 >> 8);
					local47 = local6.anInt9831 + (local6.anInt9829 * local15 >> 8);
					local57 = local6.anInt9832 + (local6.anInt9822 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9833 == 2) {
				local15 = arg0 - local6.anInt9835;
				if (local15 > 0) {
					local27 = local6.anInt9837 + (local6.anInt9830 * local15 >> 8);
					local37 = local6.anInt9836 + (local6.anInt9820 * local15 >> 8);
					local47 = local6.anInt9831 + (local6.anInt9829 * local15 >> 8);
					local57 = local6.anInt9832 + (local6.anInt9822 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9833 == 3) {
				local15 = local6.anInt9837 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt9835 + (local6.anInt9819 * local15 >> 8);
					local37 = local6.anInt9834 + (local6.anInt9826 * local15 >> 8);
					local47 = local6.anInt9831 + (local6.anInt9829 * local15 >> 8);
					local57 = local6.anInt9832 + (local6.anInt9822 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9833 == 4) {
				local15 = arg2 - local6.anInt9837;
				if (local15 > 0) {
					local27 = local6.anInt9835 + (local6.anInt9819 * local15 >> 8);
					local37 = local6.anInt9834 + (local6.anInt9826 * local15 >> 8);
					local47 = local6.anInt9831 + (local6.anInt9829 * local15 >> 8);
					local57 = local6.anInt9832 + (local6.anInt9822 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt9833 == 5) {
				local15 = arg1 - local6.anInt9831;
				if (local15 > 0) {
					local27 = local6.anInt9835 + (local6.anInt9819 * local15 >> 8);
					local37 = local6.anInt9834 + (local6.anInt9826 * local15 >> 8);
					local47 = local6.anInt9837 + (local6.anInt9830 * local15 >> 8);
					local57 = local6.anInt9836 + (local6.anInt9820 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIBIIIIILclient!oa;)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class9 arg7) {
		@Pc(11) Interface17 local11 = (Interface17) Static298.method4853(arg6, arg5, arg2);
		@Pc(20) Class31 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static480.aClass57_11.method1469(local11.method8114());
			local26 = local11.method8121() & 0x3;
			local30 = local11.method8119();
			if (local20.anInt1085 == -1) {
				local45 = arg0;
				if (local20.anInt1107 > 0) {
					local45 = arg1;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg7.method5467(local45, arg3, arg4, 4);
					} else if (local26 == 1) {
						arg7.method5397(local45, 4, arg4, arg3);
					} else if (local26 == 2) {
						arg7.method5467(local45, arg3 + 3, arg4, 4);
					} else if (local26 == 3) {
						arg7.method5397(local45, 4, arg4 + 3, arg3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg7.method5409(1, 1, local45, arg4, arg3);
					} else if (local26 == 1) {
						arg7.method5409(1, 1, local45, arg4, arg3 + 3);
					} else if (local26 == 2) {
						arg7.method5409(1, 1, local45, arg4 + 3, arg3 + 3);
					} else if (local26 == 3) {
						arg7.method5409(1, 1, local45, arg4 + 3, arg3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg7.method5397(local45, 4, arg4, arg3);
					} else if (local26 == 1) {
						arg7.method5467(local45, arg3 + 3, arg4, 4);
					} else if (local26 == 2) {
						arg7.method5397(local45, 4, arg4 + 3, arg3);
					} else if (local26 == 3) {
						arg7.method5467(local45, arg3, arg4, 4);
					}
				}
			} else {
				Static215.method3946(local20, arg7, arg4, arg3, local26);
			}
		}
		local11 = (Interface17) Static178.method3532(arg6, arg5, arg2, ql.class);
		if (local11 != null) {
			local20 = Static480.aClass57_11.method1469(local11.method8114());
			local26 = local11.method8121() & 0x3;
			local30 = local11.method8119();
			if (local20.anInt1085 != -1) {
				Static215.method3946(local20, arg7, arg4, arg3, local26);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt1107 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg7.method5434(local45, arg3 + 3, arg3, arg4, arg4 + 3);
				} else {
					arg7.method5434(local45, arg3 + 3, arg3, arg4 + 3, arg4);
				}
			}
		}
		local11 = (Interface17) Static216.method3980(arg6, arg5, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static480.aClass57_11.method1469(local11.method8114());
		local26 = local11.method8121() & 0x3;
		if (local20.anInt1085 != -1) {
			Static215.method3946(local20, arg7, arg4, arg3, local26);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(JJ)J")
	public static long method3991(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
	public static void method3992() {
		Static314.anInt8010 = 0;
		@Pc(11) int local11 = Static345.aClass6_Sub26_Sub2_1.method4983();
		@Pc(20) boolean local20 = Static345.aClass6_Sub26_Sub2_1.method4988() == 1;
		@Pc(24) int local24 = Static345.aClass6_Sub26_Sub2_1.method4988();
		@Pc(28) int local28 = Static345.aClass6_Sub26_Sub2_1.method4999();
		Static145.method2678();
		Static86.method1939(local24);
		@Pc(41) int local41 = (Static462.anInt8534 - Static345.aClass6_Sub26_Sub2_1.anInt5769) / 16;
		Static388.anIntArrayArray49 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static388.anIntArrayArray49[local47][local51] = Static345.aClass6_Sub26_Sub2_1.method5000();
			}
		}
		Static22.aByteArrayArray1 = new byte[local41][];
		Static61.aByteArrayArray4 = new byte[local41][];
		Static150.anIntArray523 = null;
		Static224.anIntArray302 = new int[local41];
		Static204.anIntArray282 = new int[local41];
		Static69.aByteArrayArray5 = null;
		Static74.aByteArrayArray30 = new byte[local41][];
		Static106.anIntArray185 = new int[local41];
		Static341.anIntArray470 = new int[local41];
		Static422.anIntArray560 = new int[local41];
		Static325.aByteArrayArray21 = new byte[local41][];
		local41 = 0;
		for (local51 = (local11 - (Static228.anInt4746 >> 4)) / 8; local51 <= (local11 + (Static228.anInt4746 >> 4)) / 8; local51++) {
			for (@Pc(126) int local126 = (local28 - (Static44.anInt1275 >> 4)) / 8; local126 <= (local28 + (Static44.anInt1275 >> 4)) / 8; local126++) {
				Static341.anIntArray470[local41] = local126 + (local51 << 8);
				Static106.anIntArray185[local41] = Static257.aClass168_64.method4432("m" + local51 + "_" + local126);
				Static204.anIntArray282[local41] = Static257.aClass168_64.method4432("l" + local51 + "_" + local126);
				Static224.anIntArray302[local41] = Static257.aClass168_64.method4432("um" + local51 + "_" + local126);
				Static422.anIntArray560[local41] = Static257.aClass168_64.method4432("ul" + local51 + "_" + local126);
				local41++;
			}
		}
		Static120.method2369(local11, local20, local28, 11);
	}
}
