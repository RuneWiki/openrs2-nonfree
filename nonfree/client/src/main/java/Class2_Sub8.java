import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "[I")
	public int[] anIntArray122 = new int[1];

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "[I")
	public int[] anIntArray123 = new int[] { -1 };

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[IZ[I)J")
	private long method1255(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class250.aLongArray28;
		@Pc(9) long local9 = -1L;
		@Pc(31) long local31 = local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local31 >>> 8 ^ local7[(int) ((local31 ^ (long) arg0) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg3.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local47] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local47] >> 16)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg3[local47] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg3[local47] ^ local9) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local7[(int) (((long) arg1[local132] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!ha;IIIZLclient!ec;IIZLclient!me;)Lclient!ka;")
	public Class182 method1257(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class81 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class218 arg7) {
		@Pc(7) Class182 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class334 local11 = null;
		if (arg1 != -1) {
			local11 = Static43.aClass283_1.method6260(arg1);
		}
		@Pc(22) int[] local22 = this.anIntArray123;
		if (local11 != null && local11.anIntArray607 != null) {
			local22 = new int[local11.anIntArray607.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray607.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray607[local34];
				if (local41 >= 0 && local41 < this.anIntArray123.length) {
					local22[local34] = this.anIntArray123[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class2_Sub2_Sub15 local90 = null;
		@Pc(92) Class2_Sub2_Sub15 local92 = null;
		if (arg4 != null) {
			local84 = arg4.anIntArray149[arg5];
			local9 = 2080;
			@Pc(107) int local107 = local84 >>> 16;
			local90 = Static540.aClass173_2.method3793(local107);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local78 = local90.method5015(local84) | false;
				local76 = local90.method5014(local84) | false;
				local82 = local90.method5012(local84) | false;
				local80 = arg4.aBoolean159 | false;
			}
			if ((arg4.aBoolean158 || Static621.aBoolean729) && arg6 != -1 && arg4.anIntArray149.length > arg6) {
				local86 = arg4.anIntArray149[arg6];
				local88 = arg4.anIntArray151[arg5];
				@Pc(175) int local175 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local107 == local175) {
					local92 = local90;
				} else {
					local92 = Static540.aClass173_2.method3793(local86 >>> 16);
				}
				if (local92 != null) {
					local78 |= local92.method5015(local86);
					local76 |= local92.method5014(local86);
					local82 |= local92.method5012(local86);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(256) long local256 = this.method1255(arg1, arg7 == null ? null : arg7.anIntArray370, arg3, local22);
		if (Static630.aClass32_88 != null) {
			local7 = (Class182) Static630.aClass32_88.method630(local256);
		}
		if (local7 == null || arg0.method6963(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method7005(local9, local7.ua());
			}
			@Pc(282) int local282 = local9;
			@Pc(284) boolean local284 = false;
			for (@Pc(286) int local286 = 0; local286 < local22.length; local286++) {
				if (local22[local286] != -1 && !Static72.aClass225_2.method4789(local22[local286]).method700(arg3)) {
					local284 = true;
				}
			}
			if (local284) {
				return null;
			}
			@Pc(318) Class186[] local318 = new Class186[local22.length];
			for (@Pc(320) int local320 = 0; local320 < local22.length; local320++) {
				if (local22[local320] != -1) {
					local318[local320] = Static72.aClass225_2.method4789(local22[local320]).method683(arg3);
				}
			}
			@Pc(376) int local376;
			@Pc(383) int local383;
			if (local11 != null && local11.anIntArrayArray58 != null) {
				for (@Pc(356) int local356 = 0; local356 < local11.anIntArrayArray58.length; local356++) {
					if (local11.anIntArrayArray58[local356] != null && local318[local356] != null) {
						local376 = local11.anIntArrayArray58[local356][0];
						local383 = local11.anIntArrayArray58[local356][1];
						@Pc(390) int local390 = local11.anIntArrayArray58[local356][2];
						@Pc(397) int local397 = local11.anIntArrayArray58[local356][3];
						@Pc(404) int local404 = local11.anIntArrayArray58[local356][4];
						@Pc(411) int local411 = local11.anIntArrayArray58[local356][5];
						if (local397 != 0 || local404 != 0 || local411 != 0) {
							local318[local356].method4002(local411, local404, local397);
						}
						if (local376 != 0 || local383 != 0 || local390 != 0) {
							local318[local356].method4005(local376, local390, local383);
						}
					}
				}
			}
			@Pc(471) Class186 local471 = new Class186(local318, local318.length);
			if (arg7 != null) {
				local282 = local9 | 0x4000;
			}
			local7 = arg0.method6938(local471, local282, Static539.anInt8839, 64, 850);
			if (arg7 != null) {
				for (local376 = 0; local376 < 5; local376++) {
					for (local383 = 0; local383 < Static100.aShortArrayArrayArray5.length; local383++) {
						if (Static100.aShortArrayArrayArray5[local383][local376].length > arg7.anIntArray370[local376]) {
							local7.ia(Static375.aShortArrayArray23[local383][local376], Static100.aShortArrayArrayArray5[local383][local376][arg7.anIntArray370[local376]]);
						}
					}
				}
			}
			if (Static630.aClass32_88 != null) {
				local7.s(local9);
				Static630.aClass32_88.method629(local7, local256);
			}
		}
		if (arg4 == null || local90 == null) {
			return local7;
		} else {
			@Pc(562) Class182 local562 = local7.method6208((byte) 1, local9, true);
			local562.method6200(local90, arg2 - 1, local84, 0, local86, local92, arg4.aBoolean159, local88);
			return local562;
		}
	}
}
