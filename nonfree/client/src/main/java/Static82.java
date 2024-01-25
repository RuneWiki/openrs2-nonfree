import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "[[[Lclient!we;")
	public static Class213[][][] aClass213ArrayArrayArray1;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "[I")
	public static final int[] anIntArray185 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!mp;ILclient!he;Lclient!e;Lclient!e;ZIIIIZI)Lclient!gl;")
	public static Class2 method2032(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(17) Class2 local17 = Static280.method5744(arg2, arg3, arg6, arg8, arg1, arg7, arg10);
		if (local17 != null) {
			return local17;
		}
		@Pc(25) Class220 local25 = Static296.method5066(arg6);
		@Pc(35) int local35;
		if (arg8 > 1 && local25.anIntArray645 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local25.anIntArray646[local35] && local25.anIntArray646[local35] != 0) {
					local33 = local25.anIntArray645[local35];
				}
			}
			if (local33 != -1) {
				local25 = Static296.method5066(local33);
			}
		}
		@Pc(79) Class71 local79 = Static222.method3992(local25.anInt6708, Static178.aClass143_73);
		if (local79 == null) {
			return null;
		}
		if (local25.aShortArray126 != null) {
			for (local35 = 0; local35 < local25.aShortArray126.length; local35++) {
				if (local25.aByteArray215 == null || local35 >= local25.aByteArray215.length) {
					local79.method2179(local25.aShortArray123[local35], local25.aShortArray126[local35]);
				} else {
					local79.method2179(Static348.aShortArray105[local25.aByteArray215[local35] & 0xFF], local25.aShortArray126[local35]);
				}
			}
		}
		if (local25.aShortArray124 != null) {
			for (local35 = 0; local35 < local25.aShortArray124.length; local35++) {
				local79.method2190(local25.aShortArray125[local35], local25.aShortArray124[local35]);
			}
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (arg2.anIntArray226[local35] < Static325.aShortArrayArray11[local35].length) {
					local79.method2179(Static325.aShortArrayArray11[local35][arg2.anIntArray226[local35]], Static67.aShortArray23[local35]);
				}
				if (arg2.anIntArray226[local35] < Static257.aShortArrayArray7[local35].length) {
					local79.method2179(Static257.aShortArrayArray7[local35][arg2.anIntArray226[local35]], Static81.aShortArray42[local35]);
				}
			}
		}
		@Pc(232) short local232 = 1024;
		@Pc(234) boolean local234 = false;
		if (local25.anInt6675 != 128 || local25.anInt6671 != 128 || local25.anInt6669 != 128) {
			local232 = 1031;
			local234 = true;
		}
		@Pc(266) Class45 local266 = arg4.method5148(local79, local232, 0, local25.anInt6705 + 64, local25.anInt6702 + 768);
		if (!local266.method1819()) {
			return null;
		}
		if (local234) {
			local266.method1802(local25.anInt6675, local25.anInt6671, local25.anInt6669);
		}
		@Pc(283) Class2 local283 = null;
		if (local25.anInt6651 != -1) {
			local283 = method2032(arg0, 1, arg2, arg3, arg4, true, local25.anInt6653, 0, 10, true, 0);
			if (local283 == null) {
				return null;
			}
		} else if (local25.anInt6656 != -1) {
			local283 = method2032(arg0, arg1, arg2, arg3, arg4, true, local25.anInt6691, 0, arg8, false, arg10);
			if (local283 == null) {
				return null;
			}
		}
		@Pc(333) int local333 = local25.anInt6660;
		arg4.method5178(16, 16, 512, 512);
		if (arg9) {
			local333 = (int) ((double) local333 * 1.5D);
		} else if (arg1 == 2) {
			local333 = (int) ((double) local333 * 1.04D);
		}
		@Pc(363) Class51 local363 = arg4.method5185();
		local363.method3560();
		arg4.method5144(local363);
		arg4.method5121(1.0F);
		arg4.method5180(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(382) Class51 local382 = arg4.method5145();
		local382.method3549(-local25.anInt6661 << 3);
		local382.method3554(local25.anInt6662 << 3);
		local382.method3561(local25.anInt6693, (local333 * Class14_Sub3_Sub34.anIntArray547[local25.anInt6710 << 3] >> 15) + local25.anInt6695 - local266.method1781() / 2, local25.anInt6695 + (Class14_Sub3_Sub34.anIntArray546[local25.anInt6710 << 3] * local333 >> 15));
		local382.method3557(local25.anInt6710 << 3);
		@Pc(444) int local444 = arg4.method5114();
		@Pc(447) int local447 = arg4.method5089();
		arg4.method5111(50, Integer.MAX_VALUE);
		arg4.method5153();
		arg4.method5139();
		arg4.method5110(0, 0, 36, 32, 0, 0);
		local266.method1794(local382, null, 1);
		arg4.method5111(local444, local447);
		@Pc(479) int[] local479 = arg4.method5105();
		if (arg1 >= 1) {
			local479 = Static148.method2975(local479, -16777215);
			if (arg1 >= 2) {
				local479 = Static148.method2975(local479, -1);
			}
		}
		if (arg10 != 0) {
			Static274.method4661(arg10, local479);
		}
		arg4.method5167(local479, 36, 36, 32).method2642(0, 0);
		if (local25.anInt6651 != -1) {
			local283.method2642(0, 0);
		} else if (local25.anInt6656 != -1) {
			local283.method2642(0, 0);
		}
		if (arg7 == 1 || arg7 == 2 && (local25.anInt6659 == 1 || arg8 != 1) && arg8 != -1) {
			arg0.method5572(0, -16777215, -256, 9, Static342.method5834(arg8));
		}
		local479 = arg4.method5105();
		for (@Pc(574) int local574 = 0; local574 < local479.length; local574++) {
			if ((local479[local574] & 0xFFFFFF) == 0) {
				local479[local574] = 0;
			} else {
				local479[local574] |= 0xFF000000;
			}
		}
		@Pc(611) Class2 local611;
		if (arg5) {
			local611 = arg4.method5167(local479, 36, 36, 32);
		} else {
			local611 = arg3.method5167(local479, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(627) Class73 local627 = new Class73();
			local627.anInt2232 = arg7;
			local627.anInt2229 = arg10;
			local627.aBoolean155 = arg2 != null;
			local627.anInt2228 = arg1;
			local627.anInt2220 = arg6;
			local627.anInt2227 = arg3.anInt5722;
			local627.anInt2221 = arg8;
			Static92.aClass139_1.method3700(local627, local611);
		}
		return local611;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2033(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static217.anInt4354; local16++) {
			if (arg0.equalsIgnoreCase(Static326.aStringArray71[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static222.aStringArray58[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V")
	public static void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static98.aClass213ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 | arg0 << 28 | arg1 << 14);
		@Pc(25) Class14_Sub39 local25 = (Class14_Sub39) Static65.aClass25_32.method691(local19);
		if (local25 == null) {
			Static59.method1342(arg0, arg2, arg1);
			return;
		}
		@Pc(39) Class14_Sub42 local39 = (Class14_Sub42) local25.aClass18_45.method459();
		if (local39 == null) {
			Static59.method1342(arg0, arg2, arg1);
			return;
		}
		@Pc(53) Class10_Sub1_Sub1 local53 = (Class10_Sub1_Sub1) Static59.method1342(arg0, arg2, arg1);
		if (local53 == null) {
			local53 = new Class10_Sub1_Sub1();
		} else {
			local53.anInt188 = local53.anInt189 = -1;
		}
		local53.anInt182 = local39.anInt6627;
		local53.anInt187 = local39.anInt6628;
		label44: while (true) {
			@Pc(81) Class14_Sub42 local81 = (Class14_Sub42) local25.aClass18_45.method453();
			if (local81 == null) {
				break;
			}
			if (local81.anInt6628 != local53.anInt187) {
				local53.anInt188 = local81.anInt6628;
				local53.anInt193 = local81.anInt6627;
				while (true) {
					@Pc(106) Class14_Sub42 local106 = (Class14_Sub42) local25.aClass18_45.method453();
					if (local106 == null) {
						break label44;
					}
					if (local53.anInt187 != local106.anInt6628 && local106.anInt6628 != local53.anInt188) {
						local53.anInt189 = local106.anInt6628;
						local53.anInt184 = local106.anInt6627;
					}
				}
			}
		}
		@Pc(154) int local154 = Static279.method4730(arg0, (arg2 << 7) + 64, (arg1 << 7) - -64);
		Static321.method5513(arg0, arg2, arg1, local154, local53);
	}
}
