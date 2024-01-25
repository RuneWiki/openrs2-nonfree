import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
	public int[] anIntArray263 = new int[] { -1 };

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "[I")
	public int[] anIntArray264 = new int[1];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIZ[IB)J")
	private long method4452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class2_Sub3_Sub28.aLongArray17;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg3[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 8)) & 0xFFL)];
			local9 = local7[(int) (((long) arg3[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local132]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!hg;Lclient!oo;IIIIILclient!ha;ZI)Lclient!ka;")
	public Class166 method4453(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(7) Class166 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class311 local11 = null;
		if (arg2 != -1) {
			local11 = Static415.aClass340_1.method8512(arg2);
		}
		@Pc(22) int[] local22 = this.anIntArray263;
		if (local11 != null && local11.anIntArray609 != null) {
			local22 = new int[local11.anIntArray609.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray609.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray609[local34];
				if (local41 >= 0 && this.anIntArray263.length > local41) {
					local22[local34] = this.anIntArray263[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class2_Sub6_Sub9 local94 = null;
		@Pc(96) Class2_Sub6_Sub9 local96 = null;
		if (arg0 != null) {
			local88 = arg0.anIntArray237[arg3];
			local9 = 2080;
			@Pc(111) int local111 = local88 >>> 16;
			local94 = Static195.aClass193_1.method5577(local111);
			local88 &= 0xFFFF;
			if (local94 != null) {
				local82 = local94.method3992(local88) | false;
				local80 = local94.method3991(local88) | false;
				local86 = local94.method3987(local88) | false;
				local84 = arg0.aBoolean347 | false;
			}
			if ((arg0.aBoolean346 || Static225.aBoolean373) && arg5 != -1 && arg0.anIntArray237.length > arg5) {
				local90 = arg0.anIntArray237[arg5];
				local92 = arg0.anIntArray242[arg3];
				@Pc(177) int local177 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local111 == local177) {
					local96 = local94;
				} else {
					local96 = Static195.aClass193_1.method5577(local90 >>> 16);
				}
				if (local96 != null) {
					local82 |= local96.method3992(local90);
					local80 |= local96.method3991(local90);
					local86 |= local96.method3987(local90);
				}
			}
			if (local82) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
			if (local86) {
				local9 |= 0x400;
			}
		}
		@Pc(258) long local258 = this.method4452(arg1 == null ? null : arg1.anIntArray494, arg2, arg7, local22);
		if (Static482.aClass169_51 != null) {
			local7 = (Class166) Static482.aClass169_51.method5002(local258);
		}
		if (local7 == null || arg6.method7270(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method7282(local9, local7.ua());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local22.length; local290++) {
				if (local22[local290] != -1 && !Static635.aClass336_2.method8424(local22[local290]).method7711(arg7)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(322) Class32[] local322 = new Class32[local22.length];
			for (@Pc(324) int local324 = 0; local324 < local22.length; local324++) {
				if (local22[local324] != -1) {
					local322[local324] = Static635.aClass336_2.method8424(local22[local324]).method7704(arg7);
				}
			}
			@Pc(382) int local382;
			@Pc(389) int local389;
			if (local11 != null && local11.anIntArrayArray52 != null) {
				for (@Pc(362) int local362 = 0; local362 < local11.anIntArrayArray52.length; local362++) {
					if (local11.anIntArrayArray52[local362] != null && local322[local362] != null) {
						local382 = local11.anIntArrayArray52[local362][0];
						local389 = local11.anIntArrayArray52[local362][1];
						@Pc(396) int local396 = local11.anIntArrayArray52[local362][2];
						@Pc(403) int local403 = local11.anIntArrayArray52[local362][3];
						@Pc(410) int local410 = local11.anIntArrayArray52[local362][4];
						@Pc(417) int local417 = local11.anIntArrayArray52[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local322[local362].method1607(local410, local417, local403);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local322[local362].method1599(local396, local382, local389);
						}
					}
				}
			}
			if (arg1 != null) {
				local286 = local9 | 0x4000;
			}
			@Pc(474) Class32 local474 = new Class32(local322, local322.length);
			local7 = arg6.method7228(local474, local286, Static35.anInt773, 64, 850);
			if (arg1 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					for (local389 = 0; local389 < Static411.aShortArrayArrayArray6.length; local389++) {
						if (Static411.aShortArrayArrayArray6[local389][local382].length > arg1.anIntArray494[local382]) {
							local7.ia(Static384.aShortArrayArray22[local389][local382], Static411.aShortArrayArrayArray6[local389][local382][arg1.anIntArray494[local382]]);
						}
					}
				}
			}
			if (Static482.aClass169_51 != null) {
				local7.s(local9);
				Static482.aClass169_51.method5001(local7, local258);
			}
		}
		if (arg0 == null || local94 == null) {
			return local7;
		} else {
			@Pc(555) Class166 local555 = local7.method6684((byte) 1, local9, true);
			local555.method6687(local88, local92, local96, 0, local94, arg0.aBoolean347, local90, arg4 - 1);
			return local555;
		}
	}
}
