import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "[Lclient!aea;")
	public static final Class8[] aClass8Array1 = new Class8[5];

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "[I")
	public int[] anIntArray309 = new int[] { -1 };

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "[I")
	public int[] anIntArray308 = new int[1];

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass8Array1.length; local8++) {
			aClass8Array1[local8] = new Class8();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!oa;Lclient!wi;IIIBIZILclient!dv;)Lclient!ba;")
	public Class9 method3073(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class355 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class77 arg7) {
		@Pc(7) Class9 local7 = null;
		@Pc(17) int local17 = 2048;
		@Pc(19) Class130 local19 = null;
		if (arg2 != -1) {
			local19 = Static251.aClass127_1.method3342(arg2);
		}
		@Pc(31) int[] local31 = this.anIntArray309;
		if (local19 != null && local19.anIntArray367 != null) {
			local31 = new int[local19.anIntArray367.length];
			for (@Pc(43) int local43 = 0; local43 < local19.anIntArray367.length; local43++) {
				@Pc(50) int local50 = local19.anIntArray367[local43];
				if (local50 >= 0 && local50 < this.anIntArray309.length) {
					local31[local43] = this.anIntArray309[local50];
				} else {
					local31[local43] = -1;
				}
			}
		}
		@Pc(86) boolean local86 = false;
		@Pc(88) boolean local88 = false;
		@Pc(90) boolean local90 = false;
		@Pc(92) boolean local92 = false;
		@Pc(94) int local94 = -1;
		@Pc(96) int local96 = -1;
		@Pc(98) int local98 = 0;
		@Pc(100) Class4_Sub7_Sub19 local100 = null;
		@Pc(102) Class4_Sub7_Sub19 local102 = null;
		if (arg7 != null) {
			local17 = 2080;
			local94 = arg7.anIntArray238[arg6];
			@Pc(117) int local117 = local94 >>> 16;
			local94 &= 0xFFFF;
			local100 = Static168.aClass327_2.method7324(local117);
			if (local100 != null) {
				local88 = local100.method7969(local94) | false;
				local86 = local100.method7967(local94) | false;
				local92 = local100.method7970(local94) | false;
				local90 = arg7.aBoolean207 | false;
			}
			if ((arg7.aBoolean206 || Static244.aBoolean365) && arg4 != -1 && arg7.anIntArray238.length > arg4) {
				local96 = arg7.anIntArray238[arg4];
				local98 = arg7.anIntArray240[arg6];
				@Pc(182) int local182 = local96 >>> 16;
				local96 &= 0xFFFF;
				if (local117 == local182) {
					local102 = local100;
				} else {
					local102 = Static168.aClass327_2.method7324(local96 >>> 16);
				}
				if (local102 != null) {
					local88 |= local102.method7969(local96);
					local86 |= local102.method7967(local96);
					local92 |= local102.method7970(local96);
				}
			}
			if (local88) {
				local17 = 2208;
			}
			if (local86) {
				local17 |= 0x100;
			}
			if (local90) {
				local17 |= 0x200;
			}
			if (local92) {
				local17 |= 0x400;
			}
		}
		@Pc(263) long local263 = this.method3075(local31, arg1 == null ? null : arg1.anIntArray714, arg5, arg2);
		if (Static26.aClass223_36 != null) {
			local7 = (Class9) Static26.aClass223_36.method4943(local263);
		}
		if (local7 == null || arg0.method6831(local7.h(), local17) != 0) {
			if (local7 != null) {
				local17 = arg0.method6818(local17, local7.h());
			}
			@Pc(292) int local292 = local17;
			@Pc(294) boolean local294 = false;
			for (@Pc(296) int local296 = 0; local296 < local31.length; local296++) {
				if (local31[local296] != -1 && !Static195.aClass99_1.method2798(local31[local296]).method4915(arg5)) {
					local294 = true;
				}
			}
			if (local294) {
				return null;
			}
			@Pc(328) Class266[] local328 = new Class266[local31.length];
			for (@Pc(330) int local330 = 0; local330 < local31.length; local330++) {
				if (local31[local330] != -1) {
					local328[local330] = Static195.aClass99_1.method2798(local31[local330]).method4912(arg5);
				}
			}
			@Pc(382) int local382;
			@Pc(389) int local389;
			if (local19 != null && local19.anIntArrayArray47 != null) {
				for (@Pc(362) int local362 = 0; local362 < local19.anIntArrayArray47.length; local362++) {
					if (local19.anIntArrayArray47[local362] != null && local328[local362] != null) {
						local382 = local19.anIntArrayArray47[local362][0];
						local389 = local19.anIntArrayArray47[local362][1];
						@Pc(396) int local396 = local19.anIntArrayArray47[local362][2];
						@Pc(403) int local403 = local19.anIntArrayArray47[local362][3];
						@Pc(410) int local410 = local19.anIntArrayArray47[local362][4];
						@Pc(417) int local417 = local19.anIntArrayArray47[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local328[local362].method5850(local417, local410, local403);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local328[local362].method5851(local396, local382, local389);
						}
					}
				}
			}
			if (arg1 != null) {
				local292 = local17 | 0x4000;
			}
			@Pc(471) Class266 local471 = new Class266(local328, local328.length);
			local7 = arg0.method6779(local471, local292, Static161.anInt3558, 64, 850);
			if (arg1 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					for (local389 = 0; local389 < Static296.aShortArrayArrayArray2.length; local389++) {
						if (Static296.aShortArrayArrayArray2[local389][local382].length > arg1.anIntArray714[local382]) {
							local7.UA(Static356.aShortArrayArray36[local389][local382], Static296.aShortArrayArrayArray2[local389][local382][arg1.anIntArray714[local382]]);
						}
					}
				}
			}
			if (Static26.aClass223_36 != null) {
				local7.ia(local17);
				Static26.aClass223_36.method4938(local263, local7);
			}
		}
		if (arg7 == null || local100 == null) {
			return local7;
		} else {
			@Pc(548) Class9 local548 = local7.method4006((byte) 1, local17, true);
			local548.method4005(arg7.aBoolean207, 0, local98, local96, local102, local94, local100, arg3 - 1);
			return local548;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[I[IZI)J")
	private long method3075(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class219.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local7[(int) ((local9 ^ (long) arg1[local127]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}
}
