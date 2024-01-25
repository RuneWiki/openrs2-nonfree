import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "Lclient!wn;")
	public static Class95 aClass95_2;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "Lclient!ij;")
	public static Class93 aClass93_15;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "Lclient!sd;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public static int anInt918 = -1;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[B")
	public static final byte[] aByteArray7 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[Lclient!i;")
	public static final Class89[] aClass89Array3 = new Class89[14];

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	public static int anInt928 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	public static void method796() {
		Static24.aClass95Array16 = null;
		Static254.aClass95Array13 = null;
		Static204.aClass18_3 = null;
		Static287.aClass95Array14 = null;
		Static132.aClass95Array9 = null;
		Static2.aClass95Array6 = null;
		Static11.aClass95Array2 = null;
		Static77.aClass18_1 = null;
		Static124.aClass95Array8 = null;
		Static86.aClass95_6 = null;
		Static318.aClass95Array17 = null;
		Static20.aClass95Array3 = null;
		Static203.aClass95Array12 = null;
		Static50.aClass95Array5 = null;
		Static333.aClass95Array18 = null;
		Static355.aClass18_4 = null;
		Static144.aClass95Array10 = null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZZLclient!ea;Lclient!ea;ILclient!cc;Lclient!ok;IIZI)Lclient!wn;")
	public static Class95 method797(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) Class18 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class95 local15 = Static194.method3452(arg7, arg2, arg5, arg0, arg4, arg10, arg8);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class130 local23 = Static322.method544(arg0);
		@Pc(35) int local35;
		if (arg8 > 1 && local23.anIntArray383 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray384[local35] <= arg8 && local23.anIntArray384[local35] != 0) {
					local33 = local23.anIntArray383[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static322.method544(local33);
			}
		}
		@Pc(76) Class177 local76 = Static292.method2236(local23.anInt3830, Static153.aClass93_60);
		if (local76 == null) {
			return null;
		}
		if (local23.aShortArray54 != null) {
			for (local35 = 0; local35 < local23.aShortArray54.length; local35++) {
				if (local23.aByteArray56 == null || local35 >= local23.aByteArray56.length) {
					local76.method4858(local23.aShortArray54[local35], local23.aShortArray56[local35]);
				} else {
					local76.method4858(local23.aShortArray54[local35], Static57.aShortArray108[local23.aByteArray56[local35] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray57 != null) {
			for (local35 = 0; local35 < local23.aShortArray57.length; local35++) {
				local76.method4855(local23.aShortArray55[local35], local23.aShortArray57[local35]);
			}
		}
		if (arg5 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (Static352.aShortArrayArray7[local35].length > arg5.anIntArray73[local35]) {
					local76.method4858(Static47.aShortArray8[local35], Static352.aShortArrayArray7[local35][arg5.anIntArray73[local35]]);
				}
				if (Static96.aShortArrayArray3[local35].length > arg5.anIntArray73[local35]) {
					local76.method4858(Static274.aShortArray92[local35], Static96.aShortArrayArray3[local35][arg5.anIntArray73[local35]]);
				}
			}
		}
		@Pc(223) short local223 = 1024;
		@Pc(225) boolean local225 = false;
		if (local23.anInt3834 != 128 || local23.anInt3847 != 128 || local23.anInt3873 != 128) {
			local225 = true;
			local223 = 1031;
		}
		@Pc(259) Class112 local259 = arg3.method5201(local76, local223, 0, local23.anInt3818 + 64, local23.anInt3820 + 768);
		if (!local259.method4327()) {
			return null;
		}
		if (local225) {
			local259.method4332(local23.anInt3834, local23.anInt3847, local23.anInt3873);
		}
		@Pc(276) Class95 local276 = null;
		if (local23.anInt3875 != -1) {
			local276 = method797(local23.anInt3843, true, arg2, arg3, 0, arg5, arg6, 0, 10, true, 1);
			if (local276 == null) {
				return null;
			}
		} else if (local23.anInt3876 != -1) {
			local276 = method797(local23.anInt3854, false, arg2, arg3, 0, arg5, arg6, arg7, arg8, true, arg10);
			if (local276 == null) {
				return null;
			}
		}
		@Pc(327) int local327 = local23.anInt3844;
		if (arg1) {
			local327 = (int) ((double) local327 * 1.5D);
		} else if (arg10 == 2) {
			local327 = (int) ((double) local327 * 1.04D);
		}
		arg3.method5161(16, 16, 512, 512);
		@Pc(357) Class66 local357 = arg3.method5173();
		local357.method5812();
		arg3.method5252(local357);
		arg3.method5223(1.0F);
		arg3.method5221(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(376) Class66 local376 = arg3.method5195();
		local376.method5818(-local23.anInt3871 << 3);
		local376.method5821(local23.anInt3870 << 3);
		local376.method5825(local23.anInt3857, (local327 * Class187.anIntArray571[local23.anInt3829 << 3] >> 15) + local23.anInt3877 - (local259.method4331() / 2), local23.anInt3877 + (local327 * Class187.anIntArray570[local23.anInt3829 << 3] >> 15));
		local376.method5815(local23.anInt3829 << 3);
		@Pc(439) int local439 = arg3.method5217();
		@Pc(442) int local442 = arg3.method5213();
		arg3.method5200(50, Integer.MAX_VALUE);
		arg3.method5256();
		arg3.method5186();
		arg3.method5205(0, 0, 36, 32, 0, 0);
		local259.method4338(local376, null, 1);
		arg3.method5200(local439, local442);
		@Pc(474) int[] local474 = arg3.method5202();
		if (arg10 >= 1) {
			local474 = Static269.method4714(local474, -16777215);
			if (arg10 >= 2) {
				local474 = Static269.method4714(local474, -1);
			}
		}
		if (arg7 != 0) {
			Static264.method4681(arg7, local474);
		}
		arg3.method5210(local474, 36, 36, 32).method5491(0, 0);
		if (local23.anInt3875 != -1) {
			local276.method5491(0, 0);
		} else if (local23.anInt3876 != -1) {
			local276.method5491(0, 0);
		}
		if (arg4 == 1 || arg4 == 2 && (local23.anInt3841 == 1 || arg8 != 1) && arg8 != -1) {
			arg6.method4174(0, -256, 9, -16777215, Static283.method4924(arg8));
		}
		local474 = arg3.method5202();
		for (@Pc(569) int local569 = 0; local569 < local474.length; local569++) {
			if ((local474[local569] & 0xFFFFFF) == 0) {
				local474[local569] = 0;
			} else {
				local474[local569] |= 0xFF000000;
			}
		}
		@Pc(613) Class95 local613;
		if (arg9) {
			local613 = arg3.method5210(local474, 36, 36, 32);
		} else {
			local613 = arg2.method5210(local474, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(629) Class153 local629 = new Class153();
			local629.anInt4668 = arg2.anInt5811;
			local629.anInt4662 = arg10;
			local629.anInt4661 = arg8;
			local629.aBoolean380 = arg5 != null;
			local629.anInt4660 = arg0;
			local629.anInt4659 = arg4;
			local629.anInt4658 = arg7;
			Static311.aClass120_2.method3165(local613, local629);
		}
		return local613;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
	public static void method799() {
		if (Static351.anInt6735 != 2) {
			try {
				Static370.method5989(Static138.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)I")
	public static int method800(@OriginalArg(1) int arg0) {
		if (Static155.aClass41_18 != null) {
			Static155.aClass41_18.method825();
			Static155.aClass41_18 = null;
		}
		Static274.anInt5436++;
		if (Static274.anInt5436 > 4) {
			Static244.anInt4904 = 0;
			Static274.anInt5436 = 0;
			return arg0;
		}
		Static244.anInt4904 = 0;
		if (Static89.anInt1684 == Static347.anInt6685) {
			Static89.anInt1684 = Static309.anInt6049;
		} else {
			Static89.anInt1684 = Static347.anInt6685;
		}
		return -1;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
	public static void method801() {
		Static291.aClass55_11.method5164(Static233.anInt4655, Static34.aBoolean42 ? Static113.anInt2095 + 256 : -1);
	}
}
