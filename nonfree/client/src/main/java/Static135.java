import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIIII)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg0 << 1) - 3);
		@Pc(85) int local85 = local55;
		Static291.method3606(arg3 + arg4, Static133.anIntArrayArray15[arg1], arg2, arg3 - arg4);
		@Pc(104) int local104 = (arg0 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local85;
					local38 += local63;
					local85 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local85;
				local63 += local55;
				local85 += local55;
				local7++;
			}
			local38 += -local104;
			local47 += -local71;
			local71 -= local51;
			local9--;
			local104 -= local51;
			@Pc(178) int local178 = arg1 - local9;
			@Pc(182) int local182 = local9 + arg1;
			@Pc(187) int local187 = arg3 + local7;
			@Pc(192) int local192 = arg3 - local7;
			Static291.method3606(local187, Static133.anIntArrayArray15[local178], arg2, local192);
			Static291.method3606(local187, Static133.anIntArrayArray15[local182], arg2, local192);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!za;IIIII)Lclient!e;")
	public static Class57 method1949(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class57 local12 = (Class57) Static180.aClass44_29.method1028(local6);
		if (local12 == null) {
			@Pc(22) Class74 local22 = Static285.method3518(arg0, Static265.aClass243_145);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt1960 < 13) {
				local22.method1596();
			}
			local12 = arg1.method5882(local22, 2055, Static358.anInt5850, 64, 768);
			Static180.aClass44_29.method1017(local6, local12);
		}
		local12 = local12.method6066((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.ma(arg4);
		}
		if (arg2 != 0) {
			local12.W(arg2);
		}
		if (arg3 != 0) {
			local12.K(arg3);
		}
		if (arg5 != 0) {
			local12.a(0, arg5, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V")
	public static void method1951(@OriginalArg(0) long arg0) {
		Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
		Static281.aClass5_Sub15_Sub2_13.method5583(Static316.aClass210_8.anInt5855);
		Static281.aClass5_Sub15_Sub2_13.method5587(arg0);
		Static281.aClass5_Sub15_Sub2_13.method5583(Static38.anInt4834);
		Static371.anInt6077 = 0;
		Static456.anInt7451 = -3;
		Static274.anInt4304 = 0;
		Static188.anInt3155 = 1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public static void method1952() {
		if (Static10.aFloat7 < 1024.0F) {
			Static10.aFloat7 = 1024.0F;
		}
		if (Static10.aFloat7 > 3072.0F) {
			Static10.aFloat7 = 3072.0F;
		}
		while (Static99.aFloat33 >= 16384.0F) {
			Static99.aFloat33 -= 16384.0F;
		}
		while (Static99.aFloat33 < 0.0F) {
			Static99.aFloat33 += 16384.0F;
		}
		@Pc(46) int local46 = Static300.anInt4681 >> 7;
		@Pc(50) int local50 = Static45.anInt41 >> 7;
		@Pc(56) int local56 = Static192.method2572(Static45.anInt41, Static300.anInt4681, Static6.anInt131);
		@Pc(58) int local58 = 0;
		@Pc(86) int local86;
		if (local46 > 3 && local50 > 3 && Static433.anInt7210 - 4 > local46 && Static418.anInt6969 - 4 > local50) {
			for (local86 = local46 - 4; local86 <= local46 + 4; local86++) {
				for (@Pc(92) int local92 = local50 - 4; local92 <= local50 + 4; local92++) {
					@Pc(96) int local96 = Static6.anInt131;
					if (local96 < 3 && Static118.method1679(local92, local86)) {
						local96++;
					}
					@Pc(107) int local107 = 0;
					if (Static427.aClass113_Sub1_2.aByteArrayArrayArray9 != null && Static427.aClass113_Sub1_2.aByteArrayArrayArray9[local96] != null) {
						local107 = (Static427.aClass113_Sub1_2.aByteArrayArrayArray9[local96][local86][local92] & 0xFF) * 8;
					}
					@Pc(140) int local140 = local56 + local107 - Static410.aClass125Array3[local96].ua(local86, local92);
					if (local140 > local58) {
						local58 = local140;
					}
				}
			}
		}
		local86 = (local58 >> 0) * 1536;
		if (local86 > 786432) {
			local86 = 786432;
		}
		if (local86 < 262144) {
			local86 = 262144;
		}
		if (local86 > Static304.anInt4780) {
			Static304.anInt4780 += (local86 - Static304.anInt4780) / 24;
		} else if (Static304.anInt4780 > local86) {
			Static304.anInt4780 += (local86 - Static304.anInt4780) / 80;
			return;
		}
	}
}
