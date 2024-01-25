import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class49 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	private int anInt1148;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public int anInt1143 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	public void method900(@OriginalArg(0) boolean arg0) {
		this.aBoolean105 = arg0;
		this.method905();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILclient!ll;)V")
	public void method904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class146 arg2) {
		@Pc(7) int local7 = Static195.anIntArray750[arg0];
		if (this.anIntArray147[local7] != 0 && arg2.method2950(arg1) != null) {
			this.anIntArray147[local7] = arg1 | Integer.MIN_VALUE;
			this.method905();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	private void method905() {
		@Pc(7) long[] local7 = Class43_Sub2.aLongArray4;
		this.aLong25 = -1L;
		this.aLong25 = this.aLong25 >>> 8 ^ local7[(int) (((long) (this.anInt1148 >> 8) ^ this.aLong25) & 0xFFL)];
		this.aLong25 = this.aLong25 >>> 8 ^ local7[(int) ((this.aLong25 ^ (long) this.anInt1148) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong25 = this.aLong25 >>> 8 ^ local7[(int) (((long) (this.anIntArray147[local50] >> 24) ^ this.aLong25) & 0xFFL)];
			this.aLong25 = local7[(int) ((this.aLong25 ^ (long) (this.anIntArray147[local50] >> 16)) & 0xFFL)] ^ this.aLong25 >>> 8;
			this.aLong25 = this.aLong25 >>> 8 ^ local7[(int) (((long) (this.anIntArray147[local50] >> 8) ^ this.aLong25) & 0xFFL)];
			this.aLong25 = local7[(int) ((this.aLong25 ^ (long) this.anIntArray147[local50]) & 0xFFL)] ^ this.aLong25 >>> 8;
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong25 = local7[(int) (((long) this.anIntArray148[local144] ^ this.aLong25) & 0xFFL)] ^ this.aLong25 >>> 8;
		}
		this.aLong25 = local7[(int) (((long) (this.aBoolean105 ? 1 : 0) ^ this.aLong25) & 0xFFL)] ^ this.aLong25 >>> 8;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!pp;ILclient!g;IIILclient!hq;Lclient!qs;Lclient!tq;ILclient!ll;Lclient!ei;)Lclient!ns;")
	public Class22 method908(@OriginalArg(0) Class185 arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class102 arg5, @OriginalArg(7) Class196 arg6, @OriginalArg(8) Class164 arg7, @OriginalArg(10) Class146 arg8, @OriginalArg(11) Class67 arg9) {
		if (this.anInt1143 != -1) {
			return arg6.method4452(this.anInt1143).method1145(arg2, arg4, arg0, arg9, arg1, arg7, arg3);
		}
		@Pc(33) int local33 = 1024;
		@Pc(41) boolean local41;
		@Pc(52) int local52;
		@Pc(116) int local116;
		@Pc(62) int local62;
		@Pc(120) int local120;
		if (arg0 != null) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			local41 = false;
			local52 = arg0.anIntArray579[arg4];
			local33 = 1056;
			local62 = local52 >>> 16;
			@Pc(69) Class1_Sub6_Sub15 local69 = arg9.method1221(local62);
			@Pc(73) int local73 = local52 & 0xFFFF;
			if (local69 != null) {
				local39 = local69.method5015(local73) | false;
				local37 = local69.method5014(local73) | false;
				local41 = arg0.aBoolean466 | false;
			}
			if ((arg0.aBoolean465 || Static261.aBoolean446) && arg2 != -1 && arg0.anIntArray579.length > arg2) {
				local116 = arg0.anIntArray579[arg2];
				local120 = local116 >>> 16;
				@Pc(134) Class1_Sub6_Sub15 local134 = local62 == local120 ? local69 : arg9.method1221(local120);
				@Pc(138) int local138 = local116 & 0xFFFF;
				if (local134 != null) {
					local39 |= local134.method5015(local138);
					local37 |= local134.method5014(local138);
				}
			}
			if (local39) {
				local33 = 1184;
			}
			if (local37) {
				local33 |= 0x100;
			}
			if (local41) {
				local33 |= 0x200;
			}
		}
		@Pc(174) Class227 local174 = Static366.aClass227_46;
		@Pc(183) Class22 local183;
		synchronized (Static366.aClass227_46) {
			local183 = (Class22) Static366.aClass227_46.method4863(this.aLong25);
		}
		if (local183 == null || arg7.method5396(local183.method1563(), local33) != 0) {
			if (local183 != null) {
				local33 = arg7.method5391(local33, local183.method1563());
			}
			local41 = false;
			for (local52 = 0; local52 < 12; local52++) {
				local116 = this.anIntArray147[local52];
				if ((local116 & 0x40000000) == 0) {
					if ((local116 & Integer.MIN_VALUE) != 0 && !arg8.method2950(local116 & 0x3FFFFFFF).method5022()) {
						local41 = true;
					}
				} else if (!arg5.method2172(local116 & 0x3FFFFFFF).method1657(this.aBoolean105)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(271) Class238[] local271 = new Class238[12];
			@Pc(273) int local273 = 0;
			for (@Pc(275) int local275 = 0; local275 < 12; local275++) {
				local62 = this.anIntArray147[local275];
				@Pc(302) Class238 local302;
				if ((local62 & 0x40000000) != 0) {
					local302 = arg5.method2172(local62 & 0x3FFFFFFF).method1667(this.aBoolean105);
					if (local302 != null) {
						local271[local273++] = local302;
					}
				} else if ((Integer.MIN_VALUE & local62) != 0) {
					local302 = arg8.method2950(local62 & 0x3FFFFFFF).method5021();
					if (local302 != null) {
						local271[local273++] = local302;
					}
				}
			}
			@Pc(341) Class238 local341 = new Class238(local271, local273);
			@Pc(345) int local345 = local33 | 0x2000;
			local183 = arg7.method5368(local341, local345, Static86.anInt1593, 64, 768);
			for (local120 = 0; local120 < 5; local120++) {
				if (Static107.aShortArrayArray8[local120].length > this.anIntArray148[local120]) {
					local183.method1581(Static228.aShortArray90[local120], Static107.aShortArrayArray8[local120][this.anIntArray148[local120]]);
				}
				if (Static35.aShortArrayArray1[local120].length > this.anIntArray148[local120]) {
					local183.method1581(Static307.aShortArray99[local120], Static35.aShortArrayArray1[local120][this.anIntArray148[local120]]);
				}
			}
			local183.method1602(local33);
			@Pc(414) Class227 local414 = Static366.aClass227_46;
			synchronized (Static366.aClass227_46) {
				Static366.aClass227_46.method4865(local183, this.aLong25);
			}
		}
		if (arg0 == null) {
			return local183;
		} else {
			local183.method1598((byte) 4, local33, true);
			return arg0.method4228(1024, arg4, arg3, arg2, local183);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBILclient!pp;Lclient!tq;Lclient!ll;IIILclient!ei;II)Lclient!ns;")
	public Class22 method909(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class185 arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class67 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg2 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg2.anIntArray579[arg5];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) int local40 = local26 & 0xFFFF;
			@Pc(45) Class1_Sub6_Sub15 local45 = arg7.method1221(local36);
			if (local45 != null) {
				local13 = local45.method5015(local40) | false;
				local11 = local45.method5014(local40) | false;
				local15 = arg2.aBoolean466 | false;
			}
			if ((arg2.aBoolean465 || Static261.aBoolean446) && arg1 != -1 && arg2.anIntArray579.length > arg1) {
				@Pc(85) int local85 = arg2.anIntArray579[arg1];
				@Pc(89) int local89 = local85 >>> 16;
				@Pc(93) int local93 = local85 & 0xFFFF;
				@Pc(98) Class1_Sub6_Sub15 local98;
				if (local89 == local36) {
					local98 = local45;
				} else {
					local98 = arg7.method1221(local93 >>> 16);
				}
				if (local98 != null) {
					local13 |= local98.method5015(local93);
					local11 |= local98.method5014(local93);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(153) long local153 = (long) arg6 << 32 | (long) (arg8 << 16) | (long) arg9;
		@Pc(155) Class227 local155 = Static366.aClass227_46;
		@Pc(165) Class22 local165;
		synchronized (Static366.aClass227_46) {
			local165 = (Class22) Static366.aClass227_46.method4863(local153);
		}
		if (local165 == null || arg3.method5396(local165.method1563(), local7) != 0) {
			if (local165 != null) {
				local7 = arg3.method5391(local7, local165.method1563());
			}
			@Pc(192) Class238[] local192 = new Class238[3];
			@Pc(194) int local194 = 0;
			if (!arg4.method2950(arg9).method5022() || !arg4.method2950(arg8).method5022() || !arg4.method2950(arg6).method5022()) {
				return null;
			}
			@Pc(228) Class238 local228 = arg4.method2950(arg9).method5021();
			if (local228 != null) {
				local194++;
				local192[0] = local228;
			}
			local228 = arg4.method2950(arg8).method5021();
			if (local228 != null) {
				local192[local194++] = local228;
			}
			local228 = arg4.method2950(arg6).method5021();
			if (local228 != null) {
				local192[local194++] = local228;
			}
			local26 = local7 | 0x2000;
			local228 = new Class238(local192, local194);
			local165 = arg3.method5368(local228, local26, Static86.anInt1593, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray148[local36] < Static107.aShortArrayArray8[local36].length) {
					local165.method1581(Static228.aShortArray90[local36], Static107.aShortArrayArray8[local36][this.anIntArray148[local36]]);
				}
				if (Static35.aShortArrayArray1[local36].length > this.anIntArray148[local36]) {
					local165.method1581(Static307.aShortArray99[local36], Static35.aShortArrayArray1[local36][this.anIntArray148[local36]]);
				}
			}
			local165.method1602(local7);
			@Pc(342) Class227 local342 = Static366.aClass227_46;
			synchronized (Static366.aClass227_46) {
				Static366.aClass227_46.method4865(local165, local153);
			}
		}
		if (arg2 == null) {
			return local165;
		} else {
			local165 = local165.method1598((byte) 4, local7, true);
			return arg2.method4228(1024, arg5, arg0, arg1, local165);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)V")
	public void method910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray148[arg0] = arg1;
		this.method905();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILclient!ei;Lclient!pp;Lclient!g;Lclient!pp;IIIILclient!qs;Lclient!tq;Lclient!ll;Z[Lclient!hs;Lclient!nk;Lclient!hq;I)Lclient!ns;")
	public Class22 method911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) Class185 arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) Class185 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class196 arg10, @OriginalArg(12) Class164 arg11, @OriginalArg(13) Class146 arg12, @OriginalArg(15) Class103[] arg13, @OriginalArg(16) Class163 arg14, @OriginalArg(17) Class102 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt1143 != -1) {
			return arg10.method4452(this.anInt1143).method1147(arg11, arg2, arg6, arg0, arg7, arg4, arg9, arg13, arg5, arg1, arg3, arg16, arg8, arg14);
		}
		@Pc(34) int local34 = arg8;
		@Pc(37) long local37 = this.aLong25;
		@Pc(40) int[] local40 = this.anIntArray147;
		if (arg5 != null && (arg5.anInt4788 >= 0 || arg5.anInt4792 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray147[local56];
			}
			if (arg5.anInt4788 >= 0) {
				if (arg5.anInt4788 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg5.anInt4788 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg5.anInt4792 >= 0) {
				if (arg5.anInt4792 == 65535) {
					local40[3] = 0;
					local37 ^= 0xFFFFFFFFL;
				} else {
					local40[3] = arg5.anInt4792 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg5 != null || arg3 != null;
		@Pc(156) int local156 = arg13 == null ? 0 : arg13.length;
		@Pc(190) int local190;
		@Pc(195) int local195;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Static121.aClass1_Sub6_Sub15Array3[local158] = null;
			if (arg13[local158] != null) {
				@Pc(176) Class185 local176 = arg2.method1227(arg13[local158].anInt2713);
				if (local176.anIntArray579 != null) {
					local149 = true;
					Static382.aClass185Array2[local158] = local176;
					local190 = arg13[local158].anInt2712;
					local195 = arg13[local158].anInt2706;
					@Pc(200) int local200 = local176.anIntArray579[local190];
					Static121.aClass1_Sub6_Sub15Array3[local158] = arg2.method1221(local200 >>> 16);
					@Pc(213) int local213 = local200 & 0xFFFF;
					Static385.anIntArray733[local158] = local213;
					if (Static121.aClass1_Sub6_Sub15Array3[local158] != null) {
						local141 |= Static121.aClass1_Sub6_Sub15Array3[local158].method5015(local213);
						local139 |= Static121.aClass1_Sub6_Sub15Array3[local158].method5014(local213);
					}
					if ((local176.aBoolean465 || Static261.aBoolean446) && local195 != -1 && local176.anIntArray579.length > local195) {
						Static72.anIntArray189[local158] = local176.anIntArray582[local190];
						Static261.anIntArray555[local158] = arg13[local158].anInt2709;
						@Pc(289) int local289 = local176.anIntArray579[local195];
						Static356.aClass1_Sub6_Sub15Array5[local158] = arg2.method1221(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static220.anIntArray469[local158] = local302;
						if (Static356.aClass1_Sub6_Sub15Array5[local158] != null) {
							local141 |= Static356.aClass1_Sub6_Sub15Array5[local158].method5015(local302);
							local139 |= Static356.aClass1_Sub6_Sub15Array5[local158].method5014(local302);
						}
					} else {
						Static72.anIntArray189[local158] = 0;
						Static261.anIntArray555[local158] = 0;
						Static356.aClass1_Sub6_Sub15Array5[local158] = null;
						Static220.anIntArray469[local158] = -1;
					}
				}
			}
		}
		@Pc(338) int local338 = -1;
		local190 = -1;
		local195 = 0;
		@Pc(344) Class1_Sub6_Sub15 local344 = null;
		@Pc(346) Class1_Sub6_Sub15 local346 = null;
		@Pc(348) int local348 = -1;
		@Pc(350) int local350 = -1;
		@Pc(352) int local352 = 0;
		@Pc(354) Class1_Sub6_Sub15 local354 = null;
		@Pc(356) Class1_Sub6_Sub15 local356 = null;
		if (local149) {
			@Pc(369) int local369;
			@Pc(425) int local425;
			if (arg5 != null) {
				local338 = arg5.anIntArray579[arg7];
				local369 = local338 >>> 16;
				local338 &= 0xFFFF;
				local344 = arg2.method1221(local369);
				if (local344 != null) {
					local141 |= local344.method5015(local338);
					local139 |= local344.method5014(local338);
				}
				if ((arg5.aBoolean465 || Static261.aBoolean446) && arg16 != -1 && arg16 < arg5.anIntArray579.length) {
					local190 = arg5.anIntArray579[arg16];
					local195 = arg5.anIntArray582[arg7];
					local425 = local190 >>> 16;
					local190 &= 0xFFFF;
					local346 = local369 == local425 ? local344 : arg2.method1221(local425);
					if (local346 != null) {
						local141 |= local346.method5015(local190);
						local139 |= local346.method5014(local190);
					}
				}
			}
			local34 = arg8 | 0x20;
			if (arg3 != null) {
				local348 = arg3.anIntArray579[arg1];
				local369 = local348 >>> 16;
				local348 &= 0xFFFF;
				local354 = arg2.method1221(local369);
				if (local354 != null) {
					local141 |= local354.method5015(local348);
					local139 |= local354.method5014(local348);
				}
				if ((arg3.aBoolean465 || Static261.aBoolean446) && arg9 != -1 && arg3.anIntArray579.length > arg9) {
					local352 = arg3.anIntArray582[arg1];
					local350 = arg3.anIntArray579[arg9];
					local425 = local350 >>> 16;
					local356 = local425 == local369 ? local354 : arg2.method1221(local425);
					local350 &= 0xFFFF;
					if (local356 != null) {
						local141 |= local356.method5015(local350);
						local139 |= local356.method5014(local350);
					}
				}
			}
			if (local141) {
				local34 |= 0x80;
			}
			if (local139) {
				local34 |= 0x100;
			}
		}
		@Pc(574) Class227 local574 = Static109.aClass227_16;
		@Pc(582) Class22 local582;
		synchronized (Static109.aClass227_16) {
			local582 = (Class22) Static109.aClass227_16.method4863(local37);
		}
		@Pc(590) Class8 local590 = null;
		if (this.anInt1148 != -1) {
			local590 = arg14.method3328(this.anInt1148);
		}
		@Pc(631) int local631;
		@Pc(637) int local637;
		if (local582 == null || arg11.method5396(local582.method1563(), local34) != 0 || local590 != null && local590.anIntArrayArray2 != null && this.anIntArrayArray20 == null) {
			if (local582 != null) {
				local34 = arg11.method5391(local34, local582.method1563());
			}
			@Pc(629) boolean local629 = false;
			local631 = 0;
			while (true) {
				if (local631 >= 12) {
					if (local629) {
						if (this.aLong26 != -1L) {
							@Pc(1262) Class227 local1262 = Static109.aClass227_16;
							synchronized (Static109.aClass227_16) {
								local582 = (Class22) Static109.aClass227_16.method4863(this.aLong26);
							}
						}
						if (local582 == null || arg11.method5396(local582.method1563(), local34) != 0 || local590 != null && local590.anIntArrayArray2 != null && this.anIntArrayArray20 == null) {
							return null;
						}
					} else {
						@Pc(683) Class238[] local683 = new Class238[12];
						@Pc(691) int local691;
						for (@Pc(685) int local685 = 0; local685 < 12; local685++) {
							local691 = local40[local685];
							@Pc(711) Class238 local711;
							if ((local691 & 0x40000000) != 0) {
								local711 = arg15.method2172(local691 & 0x3FFFFFFF).method1666(this.aBoolean105);
								if (local711 != null) {
									local683[local685] = local711;
								}
							} else if ((Integer.MIN_VALUE & local691) != 0) {
								local711 = arg12.method2950(local691 & 0x3FFFFFFF).method5017();
								if (local711 != null) {
									local683[local685] = local711;
								}
							}
						}
						@Pc(767) int local767;
						if (local590 != null && local590.anIntArrayArray2 != null) {
							for (local691 = 0; local691 < local590.anIntArrayArray2.length; local691++) {
								if (local590.anIntArrayArray2[local691] != null && local683[local691] != null) {
									local767 = local590.anIntArrayArray2[local691][0];
									@Pc(774) int local774 = local590.anIntArrayArray2[local691][1];
									@Pc(781) int local781 = local590.anIntArrayArray2[local691][2];
									@Pc(790) int local790 = local590.anIntArrayArray2[local691][3] << 3;
									@Pc(799) int local799 = local590.anIntArrayArray2[local691][4] << 3;
									@Pc(808) int local808 = local590.anIntArrayArray2[local691][5] << 3;
									if (this.anIntArrayArray20 == null) {
										this.anIntArrayArray20 = new int[local590.anIntArrayArray2.length][];
									}
									if (this.anIntArrayArray20[local691] == null) {
										@Pc(830) int[] local830 = this.anIntArrayArray20[local691] = new int[15];
										if (local790 == 0 && local799 == 0 && local808 == 0) {
											local830[14] = -local781;
											local830[13] = -local774;
											local830[12] = -local767;
											local830[0] = local830[4] = local830[8] = 32768;
										} else {
											@Pc(875) int local875 = Class13.anIntArray21[local790];
											@Pc(879) int local879 = Class13.anIntArray20[local790];
											@Pc(883) int local883 = Class13.anIntArray21[local799];
											@Pc(887) int local887 = Class13.anIntArray20[local799];
											@Pc(891) int local891 = Class13.anIntArray21[local808];
											@Pc(895) int local895 = Class13.anIntArray20[local808];
											@Pc(903) int local903 = local891 * local879 + 16384 >> 15;
											@Pc(911) int local911 = local879 * local895 + 16384 >> 15;
											local830[7] = local903 * local883 + -local887 * -local895 + 16384 >> 15;
											local830[5] = -local879;
											local830[4] = local891 * local875 + 16384 >> 15;
											local830[1] = local903 * local887 + local883 * -local895 + 16384 >> 15;
											local830[6] = local911 * local883 + -local887 * local891 + 16384 >> 15;
											local830[2] = local875 * local887 + 16384 >> 15;
											local830[0] = local911 * local887 + local883 * local891 + 16384 >> 15;
											local830[3] = local875 * local895 + 16384 >> 15;
											local830[8] = local883 * local875 + 16384 >> 15;
											local830[13] = -local767 * local830[1] + local830[4] * -local774 + local830[7] * -local781 + 16384 >> 15;
											local830[14] = -local781 * local830[8] + -local774 * local830[5] + -local767 * local830[2] + 16384 >> 15;
											local830[12] = -local781 * local830[6] + local830[3] * -local774 + -local767 * local830[0] + 16384 >> 15;
										}
										local830[11] = local781;
										local830[9] = local767;
										local830[10] = local774;
									}
									if (local790 != 0 || local799 != 0 || local808 != 0) {
										local683[local691].method5221(local799, local790, local808);
									}
									if (local767 != 0 || local774 != 0 || local781 != 0) {
										local683[local691].method5219(local774, local767, local781);
									}
								}
							}
						}
						@Pc(1164) Class238 local1164 = new Class238(local683, local683.length);
						@Pc(1168) int local1168 = local34 | 0x2000;
						local582 = arg11.method5368(local1164, local1168, Static86.anInt1593, 64, 850);
						for (local767 = 0; local767 < 5; local767++) {
							if (this.anIntArray148[local767] < Static107.aShortArrayArray8[local767].length) {
								local582.method1581(Static228.aShortArray90[local767], Static107.aShortArrayArray8[local767][this.anIntArray148[local767]]);
							}
							if (this.anIntArray148[local767] < Static35.aShortArrayArray1[local767].length) {
								local582.method1581(Static307.aShortArray99[local767], Static35.aShortArrayArray1[local767][this.anIntArray148[local767]]);
							}
						}
						local582.method1602(local34);
						@Pc(1237) Class227 local1237 = Static109.aClass227_16;
						synchronized (Static109.aClass227_16) {
							Static109.aClass227_16.method4865(local582, local37);
						}
						this.aLong26 = local37;
					}
					break;
				}
				local637 = local40[local631];
				if ((local637 & 0x40000000) == 0) {
					if ((local637 & Integer.MIN_VALUE) != 0 && !arg12.method2950(local637 & 0x3FFFFFFF).method5018()) {
						local629 = true;
					}
				} else if (!arg15.method2172(local637 & 0x3FFFFFFF).method1656(this.aBoolean105)) {
					local629 = true;
				}
				local631++;
			}
		}
		@Pc(1301) Class22 local1301 = local582.method1598((byte) 4, local34, true);
		if (!local149) {
			return local1301;
		}
		@Pc(1307) int local1307 = 0;
		local631 = 1;
		while (local156 > local1307) {
			if (Static121.aClass1_Sub6_Sub15Array3[local1307] != null) {
				local1301.method1588(Static356.aClass1_Sub6_Sub15Array5[local1307], Static385.anIntArray733[local1307], this.anIntArrayArray20 == null ? null : this.anIntArrayArray20[local1307], false, local631, Static220.anIntArray469[local1307], Static261.anIntArray555[local1307] - 1, Static72.anIntArray189[local1307], Static121.aClass1_Sub6_Sub15Array3[local1307]);
			}
			local1307++;
			local631 <<= 0x1;
		}
		if (local344 != null && local354 != null) {
			local1301.method1601(local344, arg5.aBooleanArray24, local338, local356, local195, local352, local350, local348, local354, false, local190, local346, arg6 - 1, arg0 + -1);
		} else if (local344 != null) {
			local1301.method1571(local344, 0, local346, local190, false, local338, local195, arg0 - 1);
		} else if (local354 != null) {
			local1301.method1571(local354, 0, local356, local350, false, local348, local352, arg6 - 1);
		}
		for (local637 = 0; local637 < local156; local637++) {
			Static121.aClass1_Sub6_Sub15Array3[local637] = null;
			Static356.aClass1_Sub6_Sub15Array5[local637] = null;
			Static382.aClass185Array2[local637] = null;
		}
		return local1301;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([IIIIZ[I)V")
	public void method912(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		this.aBoolean105 = arg3;
		if (this.anInt1148 != arg1) {
			this.anInt1148 = arg1;
			this.anIntArrayArray20 = null;
		}
		this.anInt1143 = arg2;
		this.anIntArray147 = arg0;
		this.anIntArray148 = arg4;
		this.method905();
	}
}
