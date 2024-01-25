import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
	public static final int[] anIntArray410 = new int[4096];

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	public int[] anIntArray408 = new int[] { -1 };

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
	public int[] anIntArray409 = new int[1];

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray410[local10] = Static162.method2684(local10);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!eq;BIIIZILclient!wb;ILclient!jl;)Lclient!va;")
	public Class224 method5270(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) Class259 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class131 arg7) {
		@Pc(15) Class224 local15 = null;
		@Pc(17) int local17 = 2048;
		@Pc(19) Class246 local19 = null;
		if (arg6 != -1) {
			local19 = Static145.aClass27_1.method757(arg6);
		}
		@Pc(31) int[] local31 = this.anIntArray408;
		if (local19 != null && local19.anIntArray500 != null) {
			local31 = new int[local19.anIntArray500.length];
			for (@Pc(43) int local43 = 0; local43 < local19.anIntArray500.length; local43++) {
				@Pc(50) int local50 = local19.anIntArray500[local43];
				if (local50 >= 0 && this.anIntArray408.length > local50) {
					local31[local43] = this.anIntArray408[local50];
				} else {
					local31[local43] = -1;
				}
			}
		}
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) boolean local91 = false;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = -1;
		@Pc(97) int local97 = 0;
		@Pc(99) Class6_Sub2_Sub8 local99 = null;
		@Pc(101) Class6_Sub2_Sub8 local101 = null;
		if (arg7 != null) {
			local93 = arg7.anIntArray235[arg2];
			local17 = 2080;
			@Pc(116) int local116 = local93 >>> 16;
			local93 &= 0xFFFF;
			local99 = Static5.aClass217_1.method5235(local116);
			if (local99 != null) {
				local87 = local99.method3332(local93) | false;
				local85 = local99.method3330(local93) | false;
				local91 = local99.method3329(local93) | false;
				local89 = arg7.aBoolean243 | false;
			}
			if ((arg7.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && arg7.anIntArray235.length > arg1) {
				local95 = arg7.anIntArray235[arg1];
				local97 = arg7.anIntArray233[arg2];
				@Pc(185) int local185 = local95 >>> 16;
				local95 &= 0xFFFF;
				if (local185 == local116) {
					local101 = local99;
				} else {
					local101 = Static5.aClass217_1.method5235(local95 >>> 16);
				}
				if (local101 != null) {
					local87 |= local101.method3332(local95);
					local85 |= local101.method3330(local95);
					local91 |= local101.method3329(local95);
				}
			}
			if (local87) {
				local17 = 2208;
			}
			if (local85) {
				local17 |= 0x100;
			}
			if (local89) {
				local17 |= 0x200;
			}
			if (local91) {
				local17 |= 0x400;
			}
		}
		@Pc(266) long local266 = this.method5273(local31, arg4, arg6, arg5 == null ? null : arg5.anIntArray530);
		if (Static252.aClass44_35 != null) {
			local15 = (Class224) Static252.aClass44_35.method1353(local266);
		}
		if (local15 == null || arg0.method5053(local15.method5811(), local17) != 0) {
			if (local15 != null) {
				local17 = arg0.method5062(local17, local15.method5811());
			}
			@Pc(295) int local295 = local17;
			@Pc(297) boolean local297 = false;
			for (@Pc(299) int local299 = 0; local299 < local31.length; local299++) {
				if (local31[local299] != -1 && !Static380.aClass231_2.method5648(local31[local299]).method76(arg4)) {
					local297 = true;
				}
			}
			if (local297) {
				return null;
			}
			@Pc(335) Class78[] local335 = new Class78[local31.length];
			for (@Pc(337) int local337 = 0; local337 < local31.length; local337++) {
				if (local31[local337] != -1) {
					local335[local337] = Static380.aClass231_2.method5648(local31[local337]).method56(arg4);
				}
			}
			@Pc(393) int local393;
			if (local19 != null && local19.anIntArrayArray51 != null) {
				for (@Pc(373) int local373 = 0; local373 < local19.anIntArrayArray51.length; local373++) {
					if (local19.anIntArrayArray51[local373] != null && local335[local373] != null) {
						local393 = local19.anIntArrayArray51[local373][0];
						@Pc(400) int local400 = local19.anIntArrayArray51[local373][1];
						@Pc(407) int local407 = local19.anIntArrayArray51[local373][2];
						@Pc(414) int local414 = local19.anIntArrayArray51[local373][3];
						@Pc(421) int local421 = local19.anIntArrayArray51[local373][4];
						@Pc(428) int local428 = local19.anIntArrayArray51[local373][5];
						if (local414 != 0 || local421 != 0 || local428 != 0) {
							local335[local373].method1977(local428, local421, local414);
						}
						if (local393 != 0 || local400 != 0 || local407 != 0) {
							local335[local373].method1978(local407, local400, local393);
						}
					}
				}
			}
			@Pc(485) Class78 local485 = new Class78(local335, local335.length);
			if (arg5 != null) {
				local295 = local17 | 0x4000;
			}
			local15 = arg0.method4971(local485, local295, Static219.anInt3948, 64, 850);
			if (arg5 != null) {
				for (local393 = 0; local393 < 5; local393++) {
					if (arg5.anIntArray530[local393] < Static368.aShortArrayArray9[local393].length) {
						local15.method5824(Static28.aShortArray9[local393], Static368.aShortArrayArray9[local393][arg5.anIntArray530[local393]]);
					}
					if (arg5.anIntArray530[local393] < Static350.aShortArrayArray10[local393].length) {
						local15.method5824(Static274.aShortArray66[local393], Static350.aShortArrayArray10[local393][arg5.anIntArray530[local393]]);
					}
				}
			}
			if (Static252.aClass44_35 != null) {
				local15.method5809(local17);
				Static252.aClass44_35.method1349(local15, local266);
			}
		}
		if (arg7 == null || local99 == null) {
			return local15;
		} else {
			@Pc(585) Class224 local585 = local15.method5808((byte) 1, local17, true);
			local585.method5793(0, arg7.aBoolean243, local99, local93, local95, local101, arg3 - 1, local97);
			return local585;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([IZII[I)J")
	private long method5273(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class6_Sub1.aLongArray10;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local12[(int) (((long) (arg2 >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
		local14 = local12[(int) ((local30 ^ (long) arg2) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg0.length; local46++) {
			local14 = local12[(int) (((long) (arg0[local46] >> 24) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local12[(int) (((long) (arg0[local46] >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) arg0[local46]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local14 = local14 >>> 8 ^ local12[(int) (((long) arg3[local131] ^ local14) & 0xFFL)];
			}
		}
		return local14 >>> 8 ^ local12[(int) (((long) (arg1 ? 1 : 0) ^ local14) & 0xFFL)];
	}
}
