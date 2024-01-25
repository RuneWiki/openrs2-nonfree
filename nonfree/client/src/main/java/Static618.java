import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "Z")
	public static boolean aBoolean707 = false;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIZBII)V")
	public static void method8527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static96.aClass6_Sub22_7.aClass29_Sub5_5.method1502() != 0 && arg2 != 0 && Static505.anInt8479 < 50 && arg1 != -1) {
			Static461.aClass243Array1[Static505.anInt8479++] = new Class243((byte) 2, arg1, arg2, arg3, arg4, arg0, arg5, (Class2_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!ib;ILclient!gs;I)V")
	public static void method8528(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub23_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x8000) != 0) {
			local7 = arg2.method8350();
		}
		if ((arg1 & 0x2) != 0) {
			Static665.aByteArray105[arg3] = arg2.method8341();
		}
		@Pc(38) int local38;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(61) int local61;
		if ((arg1 & 0x10) != 0) {
			local38 = arg2.method8365();
			if (local38 == 65535) {
				local38 = -1;
			}
			local47 = arg2.method8393();
			local51 = arg2.method8374();
			local55 = local51 & 0x7;
			local61 = local51 >> 3 & 0xF;
			if (local61 == 15) {
				local61 = -1;
			}
			arg0.method4333(local38, local55, 0, local47, local61);
		}
		if ((arg1 & 0x20000) != 0) {
			arg0.aBoolean258 = arg2.method8397() == 1;
		}
		if ((arg1 & 0x8) != 0) {
			arg0.anInt4207 = arg2.method8403();
			if (arg0.anInt5119 == 0) {
				arg0.method4327(arg0.anInt4207);
				arg0.anInt4207 = -1;
			}
		}
		@Pc(144) int local144;
		@Pc(130) int[] local130;
		@Pc(133) int[] local133;
		if ((arg1 & 0x4000) != 0) {
			local38 = arg2.method8343();
			local130 = new int[local38];
			local133 = new int[local38];
			@Pc(136) int[] local136 = new int[local38];
			for (local61 = 0; local61 < local38; local61++) {
				local144 = arg2.method8365();
				if (local144 == 65535) {
					local144 = -1;
				}
				local130[local61] = local144;
				local133[local61] = arg2.method8397();
				local136[local61] = arg2.method8403();
			}
			Static453.method1426(local130, arg0, local136, local133);
		}
		if ((arg1 & 0x2000) != 0) {
			arg0.aString66 = arg2.method8354();
			if (arg0.aString66.charAt(0) == '~') {
				arg0.aString66 = arg0.aString66.substring(1);
				Static55.method3549(arg0.method3514(), arg0.method3519(), arg0.aString46, 2, 0, arg0.aString66);
			} else if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == arg0) {
				Static55.method3549(arg0.method3514(), arg0.method3519(), arg0.aString46, 2, 0, arg0.aString66);
			}
			arg0.anInt5098 = 0;
			arg0.anInt5106 = 150;
			arg0.anInt5056 = 0;
		}
		if ((arg1 & 0x80000) != 0) {
			local38 = arg2.method8363();
			if (local38 == 65535) {
				local38 = -1;
			}
			local47 = arg2.method8369();
			local51 = arg2.method8397();
			local55 = local51 & 0x7;
			local61 = local51 >> 3 & 0xF;
			if (local61 == 15) {
				local61 = -1;
			}
			arg0.method4333(local38, local55, 2, local47, local61);
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.aBoolean260 = arg2.method8374() == 1;
		}
		if ((arg1 & 0x40000) != 0) {
			local38 = arg2.method8374();
			local130 = new int[local38];
			local133 = new int[local38];
			for (local55 = 0; local55 < local38; local55++) {
				local61 = arg2.method8403();
				if ((local61 & 0xC000) == 49152) {
					local144 = arg2.method8367();
					local130[local55] = local61 << 16 | local144;
				} else {
					local130[local55] = local61;
				}
				local133[local55] = arg2.method8367();
			}
			arg0.method4322(local133, local130);
		}
		if ((arg1 & 0x1) != 0) {
			@Pc(379) int[] local379 = new int[4];
			for (local47 = 0; local47 < 4; local47++) {
				local379[local47] = arg2.method8363();
				if (local379[local47] == 65535) {
					local379[local47] = -1;
				}
			}
			local51 = arg2.method8343();
			Static453.method1443(local51, arg0, local379);
		}
		if ((arg1 & 0x200) != 0) {
			local38 = arg2.method8365();
			local47 = arg2.method8336();
			if (local38 == 65535) {
				local38 = -1;
			}
			local51 = arg2.method8397();
			local55 = local51 & 0x7;
			local61 = local51 >> 3 & 0xF;
			if (local61 == 15) {
				local61 = -1;
			}
			arg0.method4333(local38, local55, 1, local47, local61);
		}
		if ((arg1 & 0x4) != 0) {
			local38 = arg2.method8397();
			if (local38 > 0) {
				for (local47 = 0; local47 < local38; local47++) {
					local55 = -1;
					local61 = -1;
					local144 = -1;
					local51 = arg2.method8404();
					if (local51 == 32767) {
						local51 = arg2.method8404();
						local61 = arg2.method8404();
						local55 = arg2.method8404();
						local144 = arg2.method8404();
					} else if (local51 == 32766) {
						local51 = -1;
					} else {
						local61 = arg2.method8404();
					}
					@Pc(537) int local537 = arg2.method8404();
					@Pc(541) int local541 = arg2.method8397();
					arg0.method4320(local537, local61, Static90.anInt1698, local55, local541, local144, local51);
				}
			}
		}
		if ((arg1 & 0x400) != 0) {
			arg0.anInt5094 = arg2.method8391();
			arg0.anInt5076 = arg2.method8384();
			arg0.anInt5060 = arg2.method8350();
			arg0.anInt5073 = arg2.method8350();
			arg0.anInt5100 = arg2.method8363() + Static90.anInt1698;
			arg0.anInt5117 = arg2.method8367() + Static90.anInt1698;
			arg0.anInt5069 = arg2.method8374();
			arg0.anInt5120 = 0;
			if (arg0.aBoolean255) {
				arg0.anInt5094 += arg0.anInt4180;
				arg0.anInt5060 += arg0.anInt4180;
				arg0.anInt5119 = 0;
				arg0.anInt5073 += arg0.anInt4179;
				arg0.anInt5076 += arg0.anInt4179;
			} else {
				arg0.anInt5119 = 1;
				arg0.anInt5060 += arg0.anIntArray302[0];
				arg0.anInt5073 += arg0.anIntArray301[0];
				arg0.anInt5094 += arg0.anIntArray302[0];
				arg0.anInt5076 += arg0.anIntArray301[0];
			}
		}
		if ((arg1 & 0x80) != 0) {
			local38 = arg2.method8365();
			if (local38 == 65535) {
				local38 = -1;
			}
			arg0.anInt5066 = local38;
		}
		if ((arg1 & 0x100) != 0) {
			local38 = arg2.method8365();
			arg0.anInt5086 = arg2.method8337();
			arg0.anInt5091 = arg2.method8374();
			arg0.anInt5111 = local38 & 0x7FFF;
			arg0.aBoolean330 = (local38 & 0x8000) != 0;
			arg0.anInt5108 = arg0.anInt5086 + Static90.anInt1698 + arg0.anInt5111;
		}
		if ((arg1 & 0x20) != 0) {
			local38 = arg2.method8337();
			@Pc(754) byte[] local754 = new byte[local38];
			@Pc(759) Class6_Sub23 local759 = new Class6_Sub23(local754);
			arg2.method8353(local754, local38);
			Static346.aClass6_Sub23Array1[arg3] = local759;
			arg0.method3515(local759);
		}
		if ((arg1 & 0x10000) != 0) {
			arg0.aByte90 = arg2.method8341();
			arg0.aByte89 = arg2.method8341();
			arg0.aByte93 = arg2.method8341();
			arg0.aByte92 = (byte) arg2.method8397();
			arg0.anInt5055 = Static90.anInt1698 + arg2.method8367();
			arg0.anInt5116 = Static90.anInt1698 + arg2.method8363();
		}
		if (!arg0.aBoolean255) {
			return;
		}
		if (local7 == 127) {
			arg0.method3508(arg0.anInt4180, arg0.anInt4179);
			return;
		}
		@Pc(834) byte local834;
		if (local7 == -1) {
			local834 = Static665.aByteArray105[arg3];
		} else {
			local834 = local7;
		}
		Static282.method4111(local834, arg0);
		arg0.method3516(arg0.anInt4179, arg0.anInt4180, local834);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;IIIIILclient!ha;I)V")
	public static void method8529(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class132 arg4, @OriginalArg(7) int arg5) {
		if (Static174.aClass9_21 == null || Static256.aClass9_23 == null) {
			if (Static624.aClass8_139.method273(Static136.anInt2378) && Static624.aClass8_139.method273(Static228.anInt3897)) {
				Static174.aClass9_21 = arg4.method7488(Static681.method2327(Static624.aClass8_139, Static136.anInt2378, 0), true);
				@Pc(45) Class112 local45 = Static681.method2327(Static624.aClass8_139, Static228.anInt3897, 0);
				Static256.aClass9_23 = arg4.method7488(local45, true);
				local45.method2320();
				Static154.aClass9_17 = arg4.method7488(local45, true);
			} else {
				arg4.aa(arg1, arg3, arg2, 20, Static365.anInt6243 | 255 - Static210.anInt3621 << 24, 1);
			}
		}
		if (Static174.aClass9_21 != null && Static256.aClass9_23 != null) {
			@Pc(76) int local76 = (arg2 - Static256.aClass9_23.method8938() * 2) / Static174.aClass9_21.method8938();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static174.aClass9_21.method8920(arg1 + Static256.aClass9_23.method8938() + local78 * Static174.aClass9_21.method8938(), arg3);
			}
			Static256.aClass9_23.method8920(arg1, arg3);
			Static154.aClass9_17.method8920(arg2 + arg1 - Static154.aClass9_17.method8938(), arg3);
		}
		Static51.aClass19_4.method6336(arg3 + 14, Static291.anInt4908 | 0xFF000000, -1, arg1 + 3, arg0);
		arg4.aa(arg1, arg3 + 20, arg2, arg5 - 20, -Static210.anInt3621 + 255 << 24 | Static365.anInt6243, 1);
	}
}
