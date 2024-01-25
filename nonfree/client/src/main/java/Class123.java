import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class123 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	private int anInt3653;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	public int anInt3658 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILclient!ufa;)V")
	public void method3196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class333 arg2) {
		@Pc(7) int local7 = Static206.anIntArray264[arg1];
		if (arg2.method7238(arg0) != null) {
			this.anIntArray213[local7] = arg0 | Integer.MIN_VALUE;
			this.method3199();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)V")
	public void method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray214[arg1] = arg0;
		this.method3199();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZI[I[I)V")
	public void method3198(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		this.anInt3658 = arg0;
		this.aBoolean251 = arg1;
		this.anIntArray214 = arg4;
		this.anIntArray213 = arg3;
		if (this.anInt3653 != arg2) {
			this.anIntArrayArray22 = null;
			this.anInt3653 = arg2;
		}
		this.method3199();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	private void method3199() {
		@Pc(7) long[] local7 = Class287.aLongArray14;
		this.aLong88 = -1L;
		this.aLong88 = this.aLong88 >>> 8 ^ local7[(int) (((long) (this.anInt3653 >> 8) ^ this.aLong88) & 0xFFL)];
		this.aLong88 = local7[(int) ((this.aLong88 ^ (long) this.anInt3653) & 0xFFL)] ^ this.aLong88 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong88 = local7[(int) ((this.aLong88 ^ (long) (this.anIntArray213[local50] >> 24)) & 0xFFL)] ^ this.aLong88 >>> 8;
			this.aLong88 = this.aLong88 >>> 8 ^ local7[(int) (((long) (this.anIntArray213[local50] >> 16) ^ this.aLong88) & 0xFFL)];
			this.aLong88 = local7[(int) ((this.aLong88 ^ (long) (this.anIntArray213[local50] >> 8)) & 0xFFL)] ^ this.aLong88 >>> 8;
			this.aLong88 = this.aLong88 >>> 8 ^ local7[(int) (((long) this.anIntArray213[local50] ^ this.aLong88) & 0xFFL)];
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong88 = this.aLong88 >>> 8 ^ local7[(int) ((this.aLong88 ^ (long) this.anIntArray214[local144]) & 0xFFL)];
		}
		this.aLong88 = this.aLong88 >>> 8 ^ local7[(int) ((this.aLong88 ^ (long) (this.aBoolean251 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ufa;IILclient!cu;IIIILclient!sa;ILclient!oa;I)Lclient!ba;")
	public Class20 method3200(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class57 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class298 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class14 arg9) {
		@Pc(24) int local24 = 2048;
		@Pc(112) int local112;
		@Pc(55) int local55;
		if (arg3 != null) {
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			@Pc(45) int local45 = arg3.anIntArray132[arg8];
			local24 = 2080;
			local55 = local45 >>> 16;
			@Pc(62) Class6_Sub2_Sub19 local62 = arg7.method6517(local55);
			@Pc(66) int local66 = local45 & 0xFFFF;
			if (local62 != null) {
				local30 = local62.method7102(local66) | false;
				local28 = local62.method7106(local66) | false;
				local34 = local62.method7107(local66) | false;
				local32 = arg3.aBoolean113 | false;
			}
			if ((arg3.aBoolean114 || Static132.aBoolean213) && arg2 != -1 && arg2 < arg3.anIntArray132.length) {
				local112 = arg3.anIntArray132[arg2];
				@Pc(116) int local116 = local112 >>> 16;
				@Pc(120) int local120 = local112 & 0xFFFF;
				@Pc(125) Class6_Sub2_Sub19 local125;
				if (local116 == local55) {
					local125 = local62;
				} else {
					local125 = arg7.method6517(local120 >>> 16);
				}
				if (local125 != null) {
					local30 |= local125.method7102(local120);
					local28 |= local125.method7106(local120);
					local34 |= local125.method7107(local120);
				}
			}
			if (local30) {
				local24 = 2208;
			}
			if (local28) {
				local24 |= 0x100;
			}
			if (local32) {
				local24 |= 0x200;
			}
			if (local34) {
				local24 |= 0x400;
			}
		}
		@Pc(195) long local195 = (long) arg4 | (long) (arg5 << 16) | (long) arg6 << 32;
		@Pc(197) Class136 local197 = Static183.aClass136_44;
		@Pc(205) Class20 local205;
		synchronized (Static183.aClass136_44) {
			local205 = (Class20) Static183.aClass136_44.method3473(local195);
		}
		if (local205 == null || arg9.method6884(local205.h(), local24) != 0) {
			if (local205 != null) {
				local24 = arg9.method6879(local24, local205.h());
			}
			@Pc(235) Class220[] local235 = new Class220[3];
			local112 = 0;
			if (!arg0.method7238(arg4).method6251() || !arg0.method7238(arg5).method6251() || !arg0.method7238(arg6).method6251()) {
				return null;
			}
			@Pc(267) Class220 local267 = arg0.method7238(arg4).method6252();
			if (local267 != null) {
				local112++;
				local235[0] = local267;
			}
			local267 = arg0.method7238(arg5).method6252();
			if (local267 != null) {
				local235[local112++] = local267;
			}
			local267 = arg0.method7238(arg6).method6252();
			if (local267 != null) {
				local235[local112++] = local267;
			}
			local267 = new Class220(local235, local112);
			@Pc(312) int local312 = local24 | 0x4000;
			local205 = arg9.method6833(local267, local312, Static286.anInt5387, 64, 768);
			for (@Pc(322) int local322 = 0; local322 < 5; local322++) {
				for (local55 = 0; local55 < Static336.aShortArrayArrayArray2.length; local55++) {
					if (Static336.aShortArrayArrayArray2[local55][local322].length > this.anIntArray214[local322]) {
						local205.UA(Static155.aShortArrayArray2[local55][local322], Static336.aShortArrayArrayArray2[local55][local322][this.anIntArray214[local322]]);
					}
				}
			}
			local205.ia(local24);
			@Pc(376) Class136 local376 = Static183.aClass136_44;
			synchronized (Static183.aClass136_44) {
				Static183.aClass136_44.method3482(local195, local205);
			}
		}
		if (arg3 == null) {
			return local205;
		} else {
			local205 = local205.method7264((byte) 4, local24, true);
			return arg3.method1453(2048, arg8, local205, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
	public void method3201(@OriginalArg(0) boolean arg0) {
		this.aBoolean251 = arg0;
		this.method3199();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!hb;Lclient!sa;ILclient!oa;Lclient!tr;Lclient!cu;Lclient!ufa;ILclient!ada;III)Lclient!ba;")
	public Class20 method3202(@OriginalArg(0) Class125 arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) Class322 arg3, @OriginalArg(5) Class57 arg4, @OriginalArg(6) Class333 arg5, @OriginalArg(8) Interface2 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.anInt3658 != -1) {
			return arg0.method3229(this.anInt3658).method6155(arg2, arg8, arg4, arg6, arg1, arg7, arg9);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(52) int local52;
		@Pc(118) int local118;
		@Pc(58) int local58;
		@Pc(122) int local122;
		if (arg4 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local27 = 2080;
			local52 = arg4.anIntArray132[arg9];
			local58 = local52 >>> 16;
			@Pc(63) Class6_Sub2_Sub19 local63 = arg1.method6517(local58);
			@Pc(67) int local67 = local52 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method7102(local67) | false;
				local31 = local63.method7106(local67) | false;
				local37 = local63.method7107(local67) | false;
				local35 = arg4.aBoolean113 | false;
			}
			if ((arg4.aBoolean114 || Static132.aBoolean213) && arg8 != -1 && arg4.anIntArray132.length > arg8) {
				local118 = arg4.anIntArray132[arg8];
				local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(142) Class6_Sub2_Sub19 local142 = local58 == local122 ? local63 : arg1.method6517(local122);
				if (local142 != null) {
					local33 |= local142.method7102(local126);
					local31 |= local142.method7106(local126);
					local37 |= local142.method7107(local126);
				}
			}
			if (local33) {
				local27 = 2208;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
			if (local37) {
				local27 |= 0x400;
			}
		}
		@Pc(191) Class136 local191 = Static183.aClass136_44;
		@Pc(200) Class20 local200;
		synchronized (Static183.aClass136_44) {
			local200 = (Class20) Static183.aClass136_44.method3473(this.aLong88);
		}
		if (local200 == null || arg2.method6884(local200.h(), local27) != 0) {
			if (local200 != null) {
				local27 = arg2.method6879(local27, local200.h());
			}
			local35 = false;
			for (@Pc(236) int local236 = 0; local236 < 12; local236++) {
				local52 = this.anIntArray213[local236];
				if ((local52 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local52) != 0 && !arg5.method7238(local52 & 0x3FFFFFFF).method6251()) {
						local35 = true;
					}
				} else if (!arg3.method7141(local52 & 0x3FFFFFFF).method5541(this.aBoolean251)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(291) Class220[] local291 = new Class220[12];
			local118 = 0;
			for (@Pc(295) int local295 = 0; local295 < 12; local295++) {
				@Pc(302) int local302 = this.anIntArray213[local295];
				@Pc(322) Class220 local322;
				if ((local302 & 0x40000000) != 0) {
					local322 = arg3.method7141(local302 & 0x3FFFFFFF).method5530(this.aBoolean251);
					if (local322 != null) {
						local291[local118++] = local322;
					}
				} else if ((Integer.MIN_VALUE & local302) != 0) {
					local322 = arg5.method7238(local302 & 0x3FFFFFFF).method6252();
					if (local322 != null) {
						local291[local118++] = local322;
					}
				}
			}
			@Pc(359) Class220 local359 = new Class220(local291, local118);
			@Pc(363) int local363 = local27 | 0x4000;
			local200 = arg2.method6833(local359, local363, Static286.anInt5387, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local122 = 0; local122 < Static336.aShortArrayArrayArray2.length; local122++) {
					if (Static336.aShortArrayArrayArray2[local122][local58].length > this.anIntArray214[local58]) {
						local200.UA(Static155.aShortArrayArray2[local122][local58], Static336.aShortArrayArrayArray2[local122][local58][this.anIntArray214[local58]]);
					}
				}
			}
			local200.ia(local27);
			@Pc(425) Class136 local425 = Static183.aClass136_44;
			synchronized (Static183.aClass136_44) {
				Static183.aClass136_44.method3482(this.aLong88, local200);
			}
		}
		if (arg4 == null) {
			return local200;
		} else {
			local200.method7264((byte) 4, local27, true);
			return arg4.method1453(2048, arg9, local200, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!tr;I)V")
	public void method3203(@OriginalArg(1) int arg0, @OriginalArg(2) Class322 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == -1) {
			this.anIntArray213[arg2] = 0;
		} else if (arg1.method7141(arg0) != null) {
			this.anIntArray213[arg2] = arg0 | 0x40000000;
			this.method3199();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!tr;ILclient!ufa;IILclient!cu;Lclient!sa;Lclient!hb;ILclient!ada;Lclient!iu;[Lclient!rf;ZILclient!cu;ILclient!oa;)Lclient!ba;")
	public Class20 method3204(@OriginalArg(1) int arg0, @OriginalArg(2) Class322 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class333 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class57 arg6, @OriginalArg(8) Class298 arg7, @OriginalArg(9) Class125 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Interface2 arg10, @OriginalArg(12) Class149 arg11, @OriginalArg(13) Class286[] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) Class57 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class14 arg16) {
		if (this.anInt3658 != -1) {
			return arg8.method3229(this.anInt3658).method6160(arg7, arg9, arg11, arg15, arg12, arg5, arg6, arg14, arg0, arg10, arg4, arg16, arg2, arg13);
		}
		@Pc(33) int local33 = arg0;
		@Pc(36) long local36 = this.aLong88;
		@Pc(39) int[] local39 = this.anIntArray213;
		if (arg6 != null && (arg6.anInt1540 >= 0 || arg6.anInt1539 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray213[local52];
			}
			if (arg6.anInt1540 >= 0) {
				if (arg6.anInt1540 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg6.anInt1540 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg6.anInt1539 >= 0) {
				if (arg6.anInt1539 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg6.anInt1539 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(133) boolean local133 = false;
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(145) boolean local145 = arg6 != null || arg14 != null;
		@Pc(152) int local152 = arg12 == null ? 0 : arg12.length;
		@Pc(186) int local186;
		@Pc(191) int local191;
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			Static348.aClass6_Sub2_Sub19Array5[local154] = null;
			if (arg12[local154] != null) {
				@Pc(172) Class57 local172 = arg7.method6521(arg12[local154].anInt7760);
				if (local172.anIntArray132 != null) {
					Static415.aClass57Array42[local154] = local172;
					local145 = true;
					local186 = arg12[local154].anInt7756;
					local191 = arg12[local154].anInt7762;
					@Pc(196) int local196 = local172.anIntArray132[local186];
					Static348.aClass6_Sub2_Sub19Array5[local154] = arg7.method6517(local196 >>> 16);
					@Pc(209) int local209 = local196 & 0xFFFF;
					Static583.anIntArray709[local154] = local209;
					if (Static348.aClass6_Sub2_Sub19Array5[local154] != null) {
						local135 |= Static348.aClass6_Sub2_Sub19Array5[local154].method7102(local209);
						local133 |= Static348.aClass6_Sub2_Sub19Array5[local154].method7106(local209);
						local137 |= Static348.aClass6_Sub2_Sub19Array5[local154].method7107(local209);
					}
					if ((local172.aBoolean114 || Static132.aBoolean213) && local191 != -1 && local191 < local172.anIntArray132.length) {
						Static100.anIntArray155[local154] = local172.anIntArray130[local186];
						Static255.anIntArray378[local154] = arg12[local154].anInt7761;
						@Pc(276) int local276 = local172.anIntArray132[local191];
						Static254.aClass6_Sub2_Sub19Array6[local154] = arg7.method6517(local276 >>> 16);
						@Pc(289) int local289 = local276 & 0xFFFF;
						Static387.anIntArray503[local154] = local289;
						if (Static254.aClass6_Sub2_Sub19Array6[local154] != null) {
							local135 |= Static254.aClass6_Sub2_Sub19Array6[local154].method7102(local289);
							local133 |= Static254.aClass6_Sub2_Sub19Array6[local154].method7106(local289);
							local137 |= Static254.aClass6_Sub2_Sub19Array6[local154].method7107(local289);
						}
					} else {
						Static100.anIntArray155[local154] = 0;
						Static255.anIntArray378[local154] = 0;
						Static254.aClass6_Sub2_Sub19Array6[local154] = null;
						Static387.anIntArray503[local154] = -1;
					}
				}
			}
		}
		@Pc(348) int local348 = -1;
		local186 = -1;
		local191 = 0;
		@Pc(354) Class6_Sub2_Sub19 local354 = null;
		@Pc(356) Class6_Sub2_Sub19 local356 = null;
		@Pc(358) int local358 = -1;
		@Pc(360) int local360 = -1;
		@Pc(362) int local362 = 0;
		@Pc(364) Class6_Sub2_Sub19 local364 = null;
		@Pc(366) Class6_Sub2_Sub19 local366 = null;
		if (local145) {
			local33 = arg0 | 0x20;
			@Pc(383) int local383;
			@Pc(442) int local442;
			if (arg6 != null) {
				local348 = arg6.anIntArray132[arg4];
				local383 = local348 >>> 16;
				local354 = arg7.method6517(local383);
				local348 &= 0xFFFF;
				if (local354 != null) {
					local135 |= local354.method7102(local348);
					local133 |= local354.method7106(local348);
					local137 |= local354.method7107(local348);
				}
				if ((arg6.aBoolean114 || Static132.aBoolean213) && arg15 != -1 && arg6.anIntArray132.length > arg15) {
					local186 = arg6.anIntArray132[arg15];
					local191 = arg6.anIntArray130[arg4];
					local442 = local186 >>> 16;
					local186 &= 0xFFFF;
					local356 = local442 == local383 ? local354 : arg7.method6517(local442);
					if (local356 != null) {
						local135 |= local356.method7102(local186);
						local133 |= local356.method7106(local186);
						local137 |= local356.method7107(local186);
					}
				}
			}
			if (arg14 != null) {
				local358 = arg14.anIntArray132[arg13];
				local383 = local358 >>> 16;
				local358 &= 0xFFFF;
				local364 = arg7.method6517(local383);
				if (local364 != null) {
					local135 |= local364.method7102(local358);
					local133 |= local364.method7106(local358);
					local137 |= local364.method7107(local358);
				}
				if ((arg14.aBoolean114 || Static132.aBoolean213) && arg2 != -1 && arg14.anIntArray132.length > arg2) {
					local360 = arg14.anIntArray132[arg2];
					local362 = arg14.anIntArray130[arg13];
					local442 = local360 >>> 16;
					local366 = local442 == local383 ? local364 : arg7.method6517(local442);
					local360 &= 0xFFFF;
					if (local366 != null) {
						local135 |= local366.method7102(local360);
						local133 |= local366.method7106(local360);
						local137 |= local366.method7107(local360);
					}
				}
			}
			if (local135) {
				local33 |= 0x80;
			}
			if (local133) {
				local33 |= 0x100;
			}
			if (local137) {
				local33 |= 0x400;
			}
		}
		@Pc(611) Class136 local611 = Static367.aClass136_73;
		@Pc(627) Class20 local627;
		synchronized (Static367.aClass136_73) {
			local627 = (Class20) Static367.aClass136_73.method3473(local36);
		}
		@Pc(635) Class118 local635 = null;
		if (this.anInt3653 != -1) {
			local635 = arg11.method3770(this.anInt3653);
		}
		@Pc(676) int local676;
		@Pc(682) int local682;
		if (local627 == null || arg16.method6884(local627.h(), local33) != 0 || local635 != null && local635.anIntArrayArray20 != null && this.anIntArrayArray22 == null) {
			if (local627 != null) {
				local33 = arg16.method6879(local33, local627.h());
			}
			@Pc(674) boolean local674 = false;
			local676 = 0;
			while (true) {
				if (local676 >= 12) {
					if (local674) {
						if (this.aLong89 != -1L) {
							@Pc(1305) Class136 local1305 = Static367.aClass136_73;
							synchronized (Static367.aClass136_73) {
								local627 = (Class20) Static367.aClass136_73.method3473(this.aLong89);
							}
						}
						if (local627 == null || arg16.method6884(local627.h(), local33) != 0 || local635 != null && local635.anIntArrayArray20 != null && this.anIntArrayArray22 == null) {
							return null;
						}
					} else {
						@Pc(730) Class220[] local730 = new Class220[12];
						@Pc(738) int local738;
						for (@Pc(732) int local732 = 0; local732 < 12; local732++) {
							local738 = local39[local732];
							@Pc(761) Class220 local761;
							if ((local738 & 0x40000000) != 0) {
								local761 = arg1.method7141(local738 & 0x3FFFFFFF).method5535(this.aBoolean251);
								if (local761 != null) {
									local730[local732] = local761;
								}
							} else if ((local738 & Integer.MIN_VALUE) != 0) {
								local761 = arg3.method7238(local738 & 0x3FFFFFFF).method6247();
								if (local761 != null) {
									local730[local732] = local761;
								}
							}
						}
						@Pc(824) int local824;
						@Pc(817) int local817;
						if (local635 != null && local635.anIntArrayArray20 != null) {
							for (local738 = 0; local738 < local635.anIntArrayArray20.length; local738++) {
								if (local635.anIntArrayArray20[local738] != null && local730[local738] != null) {
									local817 = local635.anIntArrayArray20[local738][0];
									local824 = local635.anIntArrayArray20[local738][1];
									@Pc(831) int local831 = local635.anIntArrayArray20[local738][2];
									@Pc(840) int local840 = local635.anIntArrayArray20[local738][3] << 3;
									@Pc(849) int local849 = local635.anIntArrayArray20[local738][4] << 3;
									@Pc(858) int local858 = local635.anIntArrayArray20[local738][5] << 3;
									if (this.anIntArrayArray22 == null) {
										this.anIntArrayArray22 = new int[local635.anIntArrayArray20.length][];
									}
									if (this.anIntArrayArray22[local738] == null) {
										@Pc(880) int[] local880 = this.anIntArrayArray22[local738] = new int[15];
										if (local840 == 0 && local849 == 0 && local858 == 0) {
											local880[12] = -local817;
											local880[0] = local880[4] = local880[8] = 32768;
											local880[13] = -local824;
											local880[14] = -local831;
										} else {
											@Pc(919) int local919 = Class6_Sub2_Sub7.anIntArray177[local840];
											@Pc(923) int local923 = Class6_Sub2_Sub7.anIntArray178[local840];
											@Pc(927) int local927 = Class6_Sub2_Sub7.anIntArray177[local849];
											@Pc(931) int local931 = Class6_Sub2_Sub7.anIntArray178[local849];
											@Pc(935) int local935 = Class6_Sub2_Sub7.anIntArray177[local858];
											@Pc(939) int local939 = Class6_Sub2_Sub7.anIntArray178[local858];
											@Pc(947) int local947 = local923 * local935 + 8192 >> 14;
											@Pc(955) int local955 = local939 * local923 + 8192 >> 14;
											local880[3] = local939 * local919 + 8192 >> 14;
											local880[7] = -local931 * -local939 + local927 * local947 + 8192 >> 14;
											local880[5] = -local923;
											local880[6] = local927 * local955 + -local931 * local935 + 8192 >> 14;
											local880[1] = local947 * local931 + local927 * -local939 + 8192 >> 14;
											local880[8] = local919 * local927 + 8192 >> 14;
											local880[0] = local955 * local931 + local935 * local927 + 8192 >> 14;
											local880[4] = local935 * local919 + 8192 >> 14;
											local880[2] = local919 * local931 + 8192 >> 14;
											local880[13] = local880[7] * -local831 + -local824 * local880[4] + -local817 * local880[1] + 8192 >> 14;
											local880[12] = -local824 * local880[3] + -local817 * local880[0] + -local831 * local880[6] + 8192 >> 14;
											local880[14] = -local824 * local880[5] + local880[2] * -local817 + local880[8] * -local831 + 8192 >> 14;
										}
										local880[9] = local817;
										local880[11] = local831;
										local880[10] = local824;
									}
									if (local840 != 0 || local849 != 0 || local858 != 0) {
										local730[local738].method5302(local858, local849, local840);
									}
									if (local817 != 0 || local824 != 0 || local831 != 0) {
										local730[local738].method5308(local831, local824, local817);
									}
								}
							}
						}
						@Pc(1208) Class220 local1208 = new Class220(local730, local730.length);
						@Pc(1212) int local1212 = local33 | 0x4000;
						local627 = arg16.method6833(local1208, local1212, Static286.anInt5387, 64, 850);
						for (local817 = 0; local817 < 5; local817++) {
							for (local824 = 0; local824 < Static336.aShortArrayArrayArray2.length; local824++) {
								if (this.anIntArray214[local817] < Static336.aShortArrayArrayArray2[local824][local817].length) {
									local627.UA(Static155.aShortArrayArray2[local824][local817], Static336.aShortArrayArrayArray2[local824][local817][this.anIntArray214[local817]]);
								}
							}
						}
						local627.ia(local33);
						@Pc(1280) Class136 local1280 = Static367.aClass136_73;
						synchronized (Static367.aClass136_73) {
							Static367.aClass136_73.method3482(local36, local627);
						}
						this.aLong89 = local36;
					}
					break;
				}
				local682 = local39[local676];
				if ((local682 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local682) != 0 && !arg3.method7238(local682 & 0x3FFFFFFF).method6245()) {
						local674 = true;
					}
				} else if (!arg1.method7141(local682 & 0x3FFFFFFF).method5534(this.aBoolean251)) {
					local674 = true;
				}
				local676++;
			}
		}
		@Pc(1344) Class20 local1344 = local627.method7264((byte) 4, local33, true);
		if (!local145) {
			return local1344;
		}
		@Pc(1350) int local1350 = 0;
		local676 = 1;
		while (local152 > local1350) {
			if (Static348.aClass6_Sub2_Sub19Array5[local1350] != null) {
				local1344.method7268(this.anIntArrayArray22 == null ? null : this.anIntArrayArray22[local1350], Static348.aClass6_Sub2_Sub19Array5[local1350], Static583.anIntArray709[local1350], local676, Static100.anIntArray155[local1350], Static255.anIntArray378[local1350] - 1, false, Static254.aClass6_Sub2_Sub19Array6[local1350], Static387.anIntArray503[local1350]);
			}
			local676 <<= 0x1;
			local1350++;
		}
		if (local354 != null && local364 != null) {
			local1344.method7265(local354, false, local366, local356, local186, local191, local358, arg6.aBooleanArray13, arg5 - 1, arg9 + -1, local348, local360, local362, local364);
		} else if (local354 != null) {
			local1344.method7262(local354, false, local186, local191, local348, local356, arg5 - 1, 0);
		} else if (local364 != null) {
			local1344.method7262(local364, false, local360, local362, local358, local366, arg9 - 1, 0);
		}
		for (local682 = 0; local682 < local152; local682++) {
			Static348.aClass6_Sub2_Sub19Array5[local682] = null;
			Static254.aClass6_Sub2_Sub19Array6[local682] = null;
			Static415.aClass57Array42[local682] = null;
		}
		return local1344;
	}
}
