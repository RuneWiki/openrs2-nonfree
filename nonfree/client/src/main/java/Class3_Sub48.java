import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "[I")
	public int[] anIntArray674 = new int[] { -1 };

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
	public int[] anIntArray675 = new int[1];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z[II[IZ)J")
	private long method7570(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class3_Sub49.aLongArray17;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg1[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
				local9 = local7[(int) ((local9 ^ (long) arg3[local138]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!r;IBLclient!efa;IIIZILclient!as;)Lclient!da;")
	public Class57 method7571(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class17 arg7) {
		@Pc(7) Class57 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class267 local11 = null;
		if (arg1 != -1) {
			local11 = Static363.aClass135_1.method3664(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray674;
		if (local11 != null && local11.anIntArray554 != null) {
			local23 = new int[local11.anIntArray554.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray554.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray554[local35];
				if (local42 >= 0 && this.anIntArray674.length > local42) {
					local23[local35] = this.anIntArray674[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(94) int local94 = -1;
		@Pc(96) int local96 = -1;
		@Pc(98) int local98 = 0;
		@Pc(100) Class3_Sub3_Sub15 local100 = null;
		@Pc(102) Class3_Sub3_Sub15 local102 = null;
		if (arg7 != null) {
			local9 = 2080;
			local94 = arg7.anIntArray55[arg3];
			@Pc(117) int local117 = local94 >>> 16;
			local94 &= 0xFFFF;
			local100 = Static330.aClass279_2.method6220(local117);
			if (local100 != null) {
				local83 = local100.method6248(local94) | false;
				local81 = local100.method6250(local94) | false;
				local87 = local100.method6254(local94) | false;
				local85 = arg7.aBoolean45 | false;
			}
			if ((arg7.aBoolean47 || Static233.aBoolean341) && arg6 != -1 && arg7.anIntArray55.length > arg6) {
				local96 = arg7.anIntArray55[arg6];
				local98 = arg7.anIntArray54[arg3];
				@Pc(185) int local185 = local96 >>> 16;
				local96 &= 0xFFFF;
				if (local117 == local185) {
					local102 = local100;
				} else {
					local102 = Static330.aClass279_2.method6220(local96 >>> 16);
				}
				if (local102 != null) {
					local83 |= local102.method6248(local96);
					local81 |= local102.method6250(local96);
					local87 |= local102.method6254(local96);
				}
			}
			if (local83) {
				local9 = 2208;
			}
			if (local81) {
				local9 |= 0x100;
			}
			if (local85) {
				local9 |= 0x200;
			}
			if (local87) {
				local9 |= 0x400;
			}
		}
		@Pc(262) long local262 = this.method7570(arg5, local23, arg1, arg2 == null ? null : arg2.anIntArray193);
		if (Static280.aClass10_27 != null) {
			local7 = (Class57) Static280.aClass10_27.method250(local262);
		}
		if (local7 == null || arg0.method7169(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method7203(local9, local7.PA());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static517.aClass145_1.method3798(local23[local292]).method7304(arg5)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(325) Class226[] local325 = new Class226[local23.length];
			for (@Pc(327) int local327 = 0; local327 < local23.length; local327++) {
				if (local23[local327] != -1) {
					local325[local327] = Static517.aClass145_1.method3798(local23[local327]).method7320(arg5);
				}
			}
			@Pc(382) int local382;
			@Pc(389) int local389;
			if (local11 != null && local11.anIntArrayArray53 != null) {
				for (@Pc(362) int local362 = 0; local362 < local11.anIntArrayArray53.length; local362++) {
					if (local11.anIntArrayArray53[local362] != null && local325[local362] != null) {
						local382 = local11.anIntArrayArray53[local362][0];
						local389 = local11.anIntArrayArray53[local362][1];
						@Pc(396) int local396 = local11.anIntArrayArray53[local362][2];
						@Pc(403) int local403 = local11.anIntArrayArray53[local362][3];
						@Pc(410) int local410 = local11.anIntArrayArray53[local362][4];
						@Pc(417) int local417 = local11.anIntArrayArray53[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local325[local362].method5285(local417, local410, local403);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local325[local362].method5287(local389, local396, local382);
						}
					}
				}
			}
			@Pc(474) Class226 local474 = new Class226(local325, local325.length);
			if (arg2 != null) {
				local288 = local9 | 0x4000;
			}
			local7 = arg0.method7178(local474, local288, Static162.anInt3259, 64, 850);
			if (arg2 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					for (local389 = 0; local389 < Static429.aShortArrayArrayArray3.length; local389++) {
						if (Static429.aShortArrayArrayArray3[local389][local382].length > arg2.anIntArray193[local382]) {
							local7.d(Static295.aShortArrayArray50[local389][local382], Static429.aShortArrayArrayArray3[local389][local382][arg2.anIntArray193[local382]]);
						}
					}
				}
			}
			if (Static280.aClass10_27 != null) {
				local7.SA(local9);
				Static280.aClass10_27.method254(local7, local262);
			}
		}
		if (arg7 == null || local100 == null) {
			return local7;
		} else {
			@Pc(561) Class57 local561 = local7.method7522((byte) 1, local9, true);
			local561.method7527(local102, arg7.aBoolean45, local96, 0, local98, arg4 - 1, local94, local100);
			return local561;
		}
	}
}
