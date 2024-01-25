import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	public static int anInt7106 = 0;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "[I")
	public static final int[] anIntArray454 = new int[1000];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static163.method5702(arg6)) {
			return;
		}
		if (Static145.aClass82ArrayArray1[arg6] == null) {
			Static54.method1053(Static298.aClass82ArrayArray2[arg6], -1, arg7, arg2, arg3, arg0, arg8, arg1, arg4, arg5);
		} else {
			Static54.method1053(Static145.aClass82ArrayArray1[arg6], -1, arg7, arg2, arg3, arg0, arg8, arg1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Z")
	public static boolean method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIILclient!ik;Lclient!wk;)V")
	public static void method5756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub25_Sub1 arg2, @OriginalArg(4) Class1_Sub2_Sub6_Sub2 arg3) {
		if ((arg0 & 0x8) != 0) {
			Static131.aByteArray47[arg1] = arg2.method4101();
		}
		@Pc(20) byte local20 = -1;
		if ((arg0 & 0x2) != 0) {
			arg3.anInt7647 = arg2.method4067();
			if (arg3.anInt7644 == 0) {
				arg3.method6198(arg3.anInt7647);
				arg3.anInt7647 = -1;
			}
		}
		@Pc(54) int local54;
		@Pc(58) int local58;
		if ((arg0 & 0x4) != 0) {
			local54 = arg2.method4086();
			local58 = arg2.method4095();
			arg3.method6202(local58, local54, Static172.anInt3107);
			arg3.anInt7607 = Static172.anInt3107 + 300;
			arg3.anInt7634 = arg2.method4096();
		}
		if ((arg0 & 0x10) != 0) {
			local54 = arg2.method4067();
			if (local54 == 65535) {
				local54 = -1;
			}
			local58 = arg2.method4095();
			Static49.method920(local54, arg3, local58);
		}
		if ((arg0 & 0x800) != 0) {
			arg3.aBoolean512 = arg2.method4096() == 1;
		}
		@Pc(141) int local141;
		if ((arg0 & 0x40000) != 0) {
			local54 = arg2.method4088();
			if (local54 == 65535) {
				local54 = -1;
			}
			local58 = arg2.method4068();
			local141 = arg2.method4095();
			arg3.method6207(true, local141, local58, local54);
		}
		if ((arg0 & 0x1000) != 0) {
			local54 = Static172.anInt3107;
			local58 = arg2.method4086();
			local141 = arg2.method4076();
			arg3.method6202(local141, local58, local54);
		}
		if ((arg0 & 0x40) != 0) {
			local54 = arg2.method4067();
			local58 = arg2.method4096();
			local141 = arg2.method4076();
			@Pc(190) int local190 = arg2.anInt4974;
			@Pc(198) boolean local198 = (local54 & 0x8000) != 0;
			if (arg3.aString69 != null && arg3.aClass198_1 != null) {
				@Pc(206) boolean local206 = false;
				if (local58 <= 1) {
					if (!local198 && (Static61.aBoolean81 && !Static177.aBoolean251 || Static401.aBoolean449)) {
						local206 = true;
					} else if (Static350.method4880(arg3.aString69)) {
						local206 = true;
					}
				}
				if (!local206 && Static119.anInt2103 == 0) {
					Static337.aClass3_Sub25_7.anInt4974 = 0;
					arg2.method4115(local141, Static337.aClass3_Sub25_7.aByteArray88);
					Static337.aClass3_Sub25_7.anInt4974 = 0;
					@Pc(249) int local249 = -1;
					@Pc(268) String local268;
					if (local198) {
						local54 &= 0x7FFF;
						@Pc(259) Class153 local259 = Static131.method2042(Static337.aClass3_Sub25_7);
						local249 = local259.anInt4352;
						local268 = local259.aClass3_Sub3_Sub18_1.method6111(Static337.aClass3_Sub25_7);
					} else {
						local268 = Static227.method3265(Static223.method3237(Static337.aClass3_Sub25_7));
					}
					arg3.aString68 = local268.trim();
					arg3.anInt7567 = local54 >> 8;
					arg3.lb = local54 & 0xFF;
					arg3.anInt7619 = 150;
					@Pc(307) int local307;
					if (local58 == 1 || local58 == 2) {
						local307 = local198 ? 17 : 1;
					} else {
						local307 = local198 ? 17 : 2;
					}
					if (local58 == 2) {
						Static114.method1846(local268, null, local307, "<img=1>" + arg3.method6213(), local249, "<img=1>" + arg3.method6218(), 0);
					} else if (local58 == 1) {
						Static114.method1846(local268, null, local307, "<img=0>" + arg3.method6213(), local249, "<img=0>" + arg3.method6218(), 0);
					} else {
						Static114.method1846(local268, null, local307, arg3.method6213(), local249, arg3.method6218(), 0);
					}
				}
			}
			arg2.anInt4974 = local141 + local190;
		}
		if ((arg0 & 0x400) != 0) {
			local54 = arg2.method4109();
			arg3.anInt7639 = arg2.method4096();
			arg3.anInt7608 = arg2.method4076();
			arg3.anInt7622 = local54 & 0x7FFF;
			arg3.aBoolean508 = (local54 & 0x8000) != 0;
			arg3.anInt7616 = Static172.anInt3107 + arg3.anInt7622 + arg3.anInt7639;
		}
		if ((arg0 & 0x100) != 0) {
			arg3.anInt7577 = arg2.method4074();
			arg3.anInt7601 = arg2.method4074();
			arg3.anInt7610 = arg2.method4112();
			arg3.anInt7587 = arg2.method4101();
			arg3.anInt7568 = arg2.method4088() + Static172.anInt3107;
			arg3.anInt7611 = arg2.method4083() + Static172.anInt3107;
			arg3.anInt7565 = arg2.method4076();
			arg3.anInt7641 = 0;
			if (arg3.aBoolean514) {
				arg3.anInt7644 = 0;
				arg3.anInt7601 += arg3.anInt7648;
				arg3.anInt7587 += arg3.anInt7648;
				arg3.anInt7610 += arg3.anInt7683;
				arg3.anInt7577 += arg3.anInt7683;
			} else {
				arg3.anInt7644 = 1;
				arg3.anInt7610 += arg3.anIntArray510[0];
				arg3.anInt7577 += arg3.anIntArray510[0];
				arg3.anInt7601 += arg3.anIntArray509[0];
				arg3.anInt7587 += arg3.anIntArray509[0];
			}
		}
		if ((arg0 & 0x8000) != 0) {
			local54 = arg2.method4109();
			local58 = arg2.method4068();
			if (local54 == 65535) {
				local54 = -1;
			}
			local141 = arg2.method4096();
			arg3.method6207(false, local141, local58, local54);
		}
		if ((arg0 & 0x20) != 0) {
			local54 = arg2.method4109();
			if (local54 == 65535) {
				local54 = -1;
			}
			arg3.anInt7580 = local54;
		}
		if ((arg0 & 0x200) != 0) {
			local20 = arg2.method4101();
		}
		if ((arg0 & 0x20000) != 0) {
			local54 = arg2.method4095();
			@Pc(660) int[] local660 = new int[local54];
			@Pc(663) int[] local663 = new int[local54];
			@Pc(666) int[] local666 = new int[local54];
			for (@Pc(668) int local668 = 0; local668 < local54; local668++) {
				@Pc(674) int local674 = arg2.method4109();
				if (local674 == 65535) {
					local674 = -1;
				}
				local660[local668] = local674;
				local663[local668] = arg2.method4096();
				local666[local668] = arg2.method4109();
			}
			Static262.method3639(local666, local663, local660, arg3);
		}
		if ((arg0 & 0x10000) != 0) {
			arg3.aByte104 = arg2.method4112();
			arg3.aByte103 = arg2.method4097();
			arg3.aByte105 = arg2.method4112();
			arg3.aByte102 = (byte) arg2.method4095();
			arg3.anInt7638 = Static172.anInt3107 + arg2.method4083();
			arg3.anInt7633 = Static172.anInt3107 + arg2.method4083();
		}
		if ((arg0 & 0x4000) != 0) {
			arg3.aString68 = arg2.method4073();
			if (arg3.aString68.charAt(0) == '~') {
				arg3.aString68 = arg3.aString68.substring(1);
				Static349.method4875(0, arg3.method6213(), 2, arg3.method6218(), arg3.aString68);
			} else if (arg3 == Static203.aClass1_Sub2_Sub6_Sub2_1) {
				Static349.method4875(0, arg3.method6213(), 2, arg3.method6218(), arg3.aString68);
			}
			arg3.lb = 0;
			arg3.anInt7567 = 0;
			arg3.anInt7619 = 150;
		}
		if ((arg0 & 0x80) != 0) {
			local54 = arg2.method4076();
			@Pc(832) byte[] local832 = new byte[local54];
			@Pc(837) Class3_Sub25 local837 = new Class3_Sub25(local832);
			arg2.method4115(local54, local832);
			Static278.aClass3_Sub25Array1[arg1] = local837;
			arg3.method6214(local837);
		}
		if (!arg3.aBoolean514) {
			return;
		}
		if (local20 == 127) {
			arg3.method6209(arg3.anInt7648, arg3.anInt7683);
			return;
		}
		@Pc(873) byte local873;
		if (local20 == -1) {
			local873 = Static131.aByteArray47[arg1];
		} else {
			local873 = local20;
		}
		arg3.method6212(local873, arg3.anInt7648, arg3.anInt7683);
	}
}
