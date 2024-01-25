import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class158 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
	public boolean aBoolean323;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public int anInt4462 = -1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([II[IZIB)V")
	public void method3945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean323 = arg3;
		this.anIntArray330 = arg2;
		this.anIntArray331 = arg0;
		this.anInt4462 = arg1;
		if (this.anInt4470 != arg4) {
			this.anInt4470 = arg4;
			this.anIntArrayArray24 = null;
		}
		this.method3953();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!oj;Lclient!hu;IIILclient!oi;BILclient!dd;I)Lclient!qh;")
	public Class159 method3946(@OriginalArg(1) int arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) Class102 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class170 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class50 arg8, @OriginalArg(11) int arg9) {
		@Pc(15) int local15 = 1024;
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (arg2 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			local15 = 1056;
			local40 = arg2.anIntArray231[arg5];
			local44 = local40 >>> 16;
			@Pc(49) Class2_Sub7_Sub10 local49 = arg8.method1173(local44);
			@Pc(53) int local53 = local40 & 0xFFFF;
			if (local49 != null) {
				local21 = local49.method2904(local53) | false;
				local19 = local49.method2909(local53) | false;
				local23 = arg2.aBoolean210 | false;
			}
			if ((arg2.aBoolean212 || Static314.aBoolean420) && arg0 != -1 && arg2.anIntArray231.length > arg0) {
				@Pc(93) int local93 = arg2.anIntArray231[arg0];
				@Pc(97) int local97 = local93 >>> 16;
				@Pc(101) int local101 = local93 & 0xFFFF;
				@Pc(110) Class2_Sub7_Sub10 local110;
				if (local97 == local44) {
					local110 = local49;
				} else {
					local110 = arg8.method1173(local101 >>> 16);
				}
				if (local110 != null) {
					local21 |= local110.method2904(local101);
					local19 |= local110.method2909(local101);
				}
			}
			if (local21) {
				local15 = 1184;
			}
			if (local19) {
				local15 |= 0x100;
			}
			if (local23) {
				local15 |= 0x200;
			}
		}
		@Pc(165) long local165 = (long) arg3 | (long) arg9 << 32 | (long) (arg7 << 16);
		@Pc(167) Class41 local167 = Static157.aClass41_40;
		@Pc(175) Class159 local175;
		synchronized (Static157.aClass41_40) {
			local175 = (Class159) Static157.aClass41_40.method823(local165);
		}
		if (local175 == null || arg1.method2448(local175.method4951(), local15) != 0) {
			if (local175 != null) {
				local15 = arg1.method2451(local15, local175.method4951());
			}
			@Pc(202) Class130[] local202 = new Class130[3];
			@Pc(204) int local204 = 0;
			if (!arg6.method4307(arg3).method3286() || !arg6.method4307(arg7).method3286() || !arg6.method4307(arg9).method3286()) {
				return null;
			}
			@Pc(232) Class130 local232 = arg6.method4307(arg3).method3292();
			if (local232 != null) {
				local204++;
				local202[0] = local232;
			}
			local232 = arg6.method4307(arg7).method3292();
			if (local232 != null) {
				local202[local204++] = local232;
			}
			local232 = arg6.method4307(arg9).method3292();
			if (local232 != null) {
				local202[local204++] = local232;
			}
			local40 = local15 | 0x2000;
			local232 = new Class130(local202, local204);
			local175 = arg1.method2540(local232, local40, Static382.anInt6948, 64, 768);
			for (local44 = 0; local44 < 5; local44++) {
				if (this.anIntArray331[local44] < Static64.aShortArrayArray8[local44].length) {
					local175.method4964(Static257.aShortArray90[local44], Static64.aShortArrayArray8[local44][this.anIntArray331[local44]]);
				}
				if (Static1.aShortArrayArray30[local44].length > this.anIntArray331[local44]) {
					local175.method4964(Static57.aShortArray10[local44], Static1.aShortArrayArray30[local44][this.anIntArray331[local44]]);
				}
			}
			local175.method4958(local15);
			@Pc(346) Class41 local346 = Static157.aClass41_40;
			synchronized (Static157.aClass41_40) {
				Static157.aClass41_40.method832(local165, local175);
			}
		}
		if (arg2 == null) {
			return local175;
		} else {
			local175 = local175.method4927((byte) 4, local15, true);
			return arg2.method2414(local175, 1024, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!hu;Lclient!qm;IZLclient!oi;Lclient!oj;III[Lclient!de;ILclient!qr;IILclient!dd;Lclient!hu;ILclient!eh;Lclient!cb;)Lclient!qh;")
	public Class159 method3948(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class170 arg3, @OriginalArg(5) Class48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class51[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class196 arg10, @OriginalArg(12) int arg11, @OriginalArg(14) Class50 arg12, @OriginalArg(15) Class102 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Interface4 arg15, @OriginalArg(18) Class32 arg16) {
		if (this.anInt4462 != -1) {
			return arg16.method579(this.anInt4462).method4836(arg12, arg14, arg15, arg2, arg9, arg4, arg5, arg8, arg13, arg7, arg0, arg11, arg6, arg1);
		}
		@Pc(33) int local33 = arg5;
		@Pc(36) long local36 = this.aLong133;
		@Pc(39) int[] local39 = this.anIntArray330;
		if (arg13 != null && (arg13.anInt2997 >= 0 || arg13.anInt2987 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray330[local55];
			}
			if (arg13.anInt2997 >= 0) {
				if (arg13.anInt2997 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg13.anInt2997 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg13.anInt2987 >= 0) {
				if (arg13.anInt2987 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg13.anInt2987 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg13 != null || arg0 != null;
		@Pc(156) int local156 = arg8 == null ? 0 : arg8.length;
		@Pc(190) int local190;
		@Pc(195) int local195;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Static134.aClass2_Sub7_Sub10Array1[local158] = null;
			if (arg8[local158] != null) {
				@Pc(176) Class102 local176 = arg12.method1175(arg8[local158].anInt1433);
				if (local176.anIntArray231 != null) {
					Static383.aClass102Array2[local158] = local176;
					local149 = true;
					local190 = arg8[local158].anInt1437;
					local195 = arg8[local158].anInt1434;
					@Pc(200) int local200 = local176.anIntArray231[local190];
					Static134.aClass2_Sub7_Sub10Array1[local158] = arg12.method1173(local200 >>> 16);
					@Pc(213) int local213 = local200 & 0xFFFF;
					Static81.anIntArray132[local158] = local213;
					if (Static134.aClass2_Sub7_Sub10Array1[local158] != null) {
						local141 |= Static134.aClass2_Sub7_Sub10Array1[local158].method2904(local213);
						local139 |= Static134.aClass2_Sub7_Sub10Array1[local158].method2909(local213);
					}
					if ((local176.aBoolean212 || Static314.aBoolean420) && local195 != -1 && local176.anIntArray231.length > local195) {
						Static32.anIntArray49[local158] = local176.anIntArray229[local190];
						Static45.anIntArray527[local158] = arg8[local158].anInt1435;
						@Pc(289) int local289 = local176.anIntArray231[local195];
						Static161.aClass2_Sub7_Sub10Array2[local158] = arg12.method1173(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static194.anIntArray302[local158] = local302;
						if (Static161.aClass2_Sub7_Sub10Array2[local158] != null) {
							local141 |= Static161.aClass2_Sub7_Sub10Array2[local158].method2904(local302);
							local139 |= Static161.aClass2_Sub7_Sub10Array2[local158].method2909(local302);
						}
					} else {
						Static32.anIntArray49[local158] = 0;
						Static45.anIntArray527[local158] = 0;
						Static161.aClass2_Sub7_Sub10Array2[local158] = null;
						Static194.anIntArray302[local158] = -1;
					}
				}
			}
		}
		@Pc(334) int local334 = -1;
		local190 = -1;
		local195 = 0;
		@Pc(340) Class2_Sub7_Sub10 local340 = null;
		@Pc(342) Class2_Sub7_Sub10 local342 = null;
		@Pc(344) int local344 = -1;
		@Pc(346) int local346 = -1;
		@Pc(348) int local348 = 0;
		@Pc(375) Class2_Sub7_Sub10 local375 = null;
		@Pc(377) Class2_Sub7_Sub10 local377 = null;
		if (local149) {
			local33 = arg5 | 0x20;
			@Pc(394) int local394;
			@Pc(450) int local450;
			if (arg13 != null) {
				local334 = arg13.anIntArray231[arg14];
				local394 = local334 >>> 16;
				local334 &= 0xFFFF;
				local340 = arg12.method1173(local394);
				if (local340 != null) {
					local141 |= local340.method2904(local334);
					local139 |= local340.method2909(local334);
				}
				if ((arg13.aBoolean212 || Static314.aBoolean420) && arg7 != -1 && arg13.anIntArray231.length > arg7) {
					local190 = arg13.anIntArray231[arg7];
					local195 = arg13.anIntArray229[arg14];
					local450 = local190 >>> 16;
					local190 &= 0xFFFF;
					local342 = local450 == local394 ? local340 : arg12.method1173(local450);
					if (local342 != null) {
						local141 |= local342.method2904(local190);
						local139 |= local342.method2909(local190);
					}
				}
			}
			if (arg0 != null) {
				local344 = arg0.anIntArray231[arg6];
				local394 = local344 >>> 16;
				local344 &= 0xFFFF;
				local375 = arg12.method1173(local394);
				if (local375 != null) {
					local141 |= local375.method2904(local344);
					local139 |= local375.method2909(local344);
				}
				if ((arg0.aBoolean212 || Static314.aBoolean420) && arg9 != -1 && arg9 < arg0.anIntArray231.length) {
					local348 = arg0.anIntArray229[arg6];
					local346 = arg0.anIntArray231[arg9];
					local450 = local346 >>> 16;
					local377 = local450 == local394 ? local375 : arg12.method1173(local450);
					local346 &= 0xFFFF;
					if (local377 != null) {
						local141 |= local377.method2904(local346);
						local139 |= local377.method2909(local346);
					}
				}
			}
			if (local141) {
				local33 |= 0x80;
			}
			if (local139) {
				local33 |= 0x100;
			}
		}
		@Pc(587) Class41 local587 = Static236.aClass41_55;
		@Pc(595) Class159 local595;
		synchronized (Static236.aClass41_55) {
			local595 = (Class159) Static236.aClass41_55.method823(local36);
		}
		@Pc(603) Class227 local603 = null;
		if (this.anInt4470 != -1) {
			local603 = arg1.method4754(this.anInt4470);
		}
		@Pc(643) int local643;
		@Pc(649) int local649;
		if (local595 == null || arg4.method2448(local595.method4951(), local33) != 0 || local603 != null && local603.anIntArrayArray56 != null && this.anIntArrayArray24 == null) {
			if (local595 != null) {
				local33 = arg4.method2451(local33, local595.method4951());
			}
			@Pc(641) boolean local641 = false;
			local643 = 0;
			while (true) {
				if (local643 >= 12) {
					if (local641) {
						if (this.aLong131 != -1L) {
							@Pc(701) Class41 local701 = Static236.aClass41_55;
							synchronized (Static236.aClass41_55) {
								local595 = (Class159) Static236.aClass41_55.method823(this.aLong131);
							}
						}
						if (local595 == null || arg4.method2448(local595.method4951(), local33) != 0 || local603 != null && local603.anIntArrayArray56 != null && this.anIntArrayArray24 == null) {
							return null;
						}
					} else {
						@Pc(737) Class130[] local737 = new Class130[12];
						@Pc(745) int local745;
						for (@Pc(739) int local739 = 0; local739 < 12; local739++) {
							local745 = local39[local739];
							@Pc(765) Class130 local765;
							if ((local745 & 0x40000000) != 0) {
								local765 = arg10.method4827(local745 & 0x3FFFFFFF).method3835(this.aBoolean323);
								if (local765 != null) {
									local737[local739] = local765;
								}
							} else if ((Integer.MIN_VALUE & local745) != 0) {
								local765 = arg3.method4307(local745 & 0x3FFFFFFF).method3288();
								if (local765 != null) {
									local737[local739] = local765;
								}
							}
						}
						@Pc(823) int local823;
						if (local603 != null && local603.anIntArrayArray56 != null) {
							for (local745 = 0; local745 < local603.anIntArrayArray56.length; local745++) {
								if (local603.anIntArrayArray56[local745] != null && local737[local745] != null) {
									local823 = local603.anIntArrayArray56[local745][0];
									@Pc(830) int local830 = local603.anIntArrayArray56[local745][1];
									@Pc(837) int local837 = local603.anIntArrayArray56[local745][2];
									@Pc(846) int local846 = local603.anIntArrayArray56[local745][3] << 3;
									@Pc(855) int local855 = local603.anIntArrayArray56[local745][4] << 3;
									@Pc(864) int local864 = local603.anIntArrayArray56[local745][5] << 3;
									if (this.anIntArrayArray24 == null) {
										this.anIntArrayArray24 = new int[local603.anIntArrayArray56.length][];
									}
									if (this.anIntArrayArray24[local745] == null) {
										@Pc(886) int[] local886 = this.anIntArrayArray24[local745] = new int[15];
										if (local846 == 0 && local855 == 0 && local864 == 0) {
											local886[12] = -local823;
											local886[14] = -local837;
											local886[13] = -local830;
											local886[0] = local886[4] = local886[8] = 32768;
										} else {
											@Pc(928) int local928 = Class106.anIntArray242[local846];
											@Pc(932) int local932 = Class106.anIntArray240[local846];
											@Pc(936) int local936 = Class106.anIntArray242[local855];
											@Pc(940) int local940 = Class106.anIntArray240[local855];
											@Pc(944) int local944 = Class106.anIntArray242[local864];
											@Pc(948) int local948 = Class106.anIntArray240[local864];
											@Pc(956) int local956 = local944 * local932 + 16384 >> 15;
											@Pc(964) int local964 = local932 * local948 + 16384 >> 15;
											local886[3] = local928 * local948 + 16384 >> 15;
											local886[4] = local944 * local928 + 16384 >> 15;
											local886[1] = local940 * local956 + local936 * -local948 + 16384 >> 15;
											local886[5] = -local932;
											local886[8] = local928 * local936 + 16384 >> 15;
											local886[6] = local936 * local964 + local944 * -local940 + 16384 >> 15;
											local886[7] = local956 * local936 + -local948 * -local940 + 16384 >> 15;
											local886[0] = local944 * local936 + local964 * local940 + 16384 >> 15;
											local886[2] = local928 * local940 + 16384 >> 15;
											local886[14] = -local823 * local886[2] + -local830 * local886[5] + -local837 * local886[8] + 16384 >> 15;
											local886[13] = -local823 * local886[1] + local886[4] * -local830 + -local837 * local886[7] + 16384 >> 15;
											local886[12] = -local823 * local886[0] + local886[3] * -local830 + local886[6] * -local837 + 16384 >> 15;
										}
										local886[9] = local823;
										local886[11] = local837;
										local886[10] = local830;
									}
									if (local846 != 0 || local855 != 0 || local864 != 0) {
										local737[local745].method3415(local846, local855, local864);
									}
									if (local823 != 0 || local830 != 0 || local837 != 0) {
										local737[local745].method3412(local837, local823, local830);
									}
								}
							}
						}
						@Pc(1211) int local1211 = local33 | 0x2000;
						@Pc(1218) Class130 local1218 = new Class130(local737, local737.length);
						local595 = arg4.method2540(local1218, local1211, Static382.anInt6948, 64, 850);
						for (local823 = 0; local823 < 5; local823++) {
							if (Static64.aShortArrayArray8[local823].length > this.anIntArray331[local823]) {
								local595.method4964(Static257.aShortArray90[local823], Static64.aShortArrayArray8[local823][this.anIntArray331[local823]]);
							}
							if (this.anIntArray331[local823] < Static1.aShortArrayArray30[local823].length) {
								local595.method4964(Static57.aShortArray10[local823], Static1.aShortArrayArray30[local823][this.anIntArray331[local823]]);
							}
						}
						local595.method4958(local33);
						@Pc(1291) Class41 local1291 = Static236.aClass41_55;
						synchronized (Static236.aClass41_55) {
							Static236.aClass41_55.method832(local36, local595);
						}
						this.aLong131 = local36;
					}
					break;
				}
				local649 = local39[local643];
				if ((local649 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local649) != 0 && !arg3.method4307(local649 & 0x3FFFFFFF).method3290()) {
						local641 = true;
					}
				} else if (!arg10.method4827(local649 & 0x3FFFFFFF).method3839(this.aBoolean323)) {
					local641 = true;
				}
				local643++;
			}
		}
		@Pc(1313) Class159 local1313 = local595.method4927((byte) 4, local33, true);
		if (!local149) {
			return local1313;
		}
		@Pc(1319) int local1319 = 0;
		local643 = 1;
		while (local1319 < local156) {
			if (Static134.aClass2_Sub7_Sub10Array1[local1319] != null) {
				local1313.method4930(Static161.aClass2_Sub7_Sub10Array2[local1319], Static32.anIntArray49[local1319], Static81.anIntArray132[local1319], local643, Static194.anIntArray302[local1319], Static45.anIntArray527[local1319] - 1, this.anIntArrayArray24 == null ? null : this.anIntArrayArray24[local1319], Static134.aClass2_Sub7_Sub10Array1[local1319], false);
			}
			local1319++;
			local643 <<= 0x1;
		}
		if (local340 != null && local375 != null) {
			local1313.method4974(local377, arg13.aBooleanArray14, arg2 - 1, arg11 + -1, local340, local342, local190, local348, local346, false, local344, local375, local334, local195);
		} else if (local340 != null) {
			local1313.method4955(0, local190, false, local195, local342, arg11 - 1, local334, local340);
		} else if (local375 != null) {
			local1313.method4955(0, local346, false, local348, local377, arg2 - 1, local344, local375);
		}
		for (local649 = 0; local649 < local156; local649++) {
			Static134.aClass2_Sub7_Sub10Array1[local649] = null;
			Static161.aClass2_Sub7_Sub10Array2[local649] = null;
			Static383.aClass102Array2[local649] = null;
		}
		return local1313;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZ)V")
	public void method3949(@OriginalArg(0) boolean arg0) {
		this.aBoolean323 = arg0;
		this.method3953();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!cb;Lclient!hu;ILclient!dd;Lclient!eh;IIILclient!oj;Lclient!qr;Lclient!oi;)Lclient!qh;")
	public Class159 method3950(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(5) Interface4 arg5, @OriginalArg(6) int arg6, @OriginalArg(9) Class48 arg7, @OriginalArg(10) Class196 arg8, @OriginalArg(11) Class170 arg9) {
		if (this.anInt4462 != -1) {
			return arg1.method579(this.anInt4462).method4841(arg4, arg5, arg2, arg7, arg0, arg3, arg6);
		}
		@Pc(28) int local28 = 1024;
		@Pc(36) boolean local36;
		@Pc(47) int local47;
		@Pc(112) int local112;
		@Pc(57) int local57;
		@Pc(116) int local116;
		if (arg2 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			local47 = arg2.anIntArray231[arg0];
			local28 = 1056;
			local57 = local47 >>> 16;
			@Pc(61) int local61 = local47 & 0xFFFF;
			@Pc(68) Class2_Sub7_Sub10 local68 = arg4.method1173(local57);
			if (local68 != null) {
				local34 = local68.method2904(local61) | false;
				local32 = local68.method2909(local61) | false;
				local36 = arg2.aBoolean210 | false;
			}
			if ((arg2.aBoolean212 || Static314.aBoolean420) && arg6 != -1 && arg6 < arg2.anIntArray231.length) {
				local112 = arg2.anIntArray231[arg6];
				local116 = local112 >>> 16;
				@Pc(126) Class2_Sub7_Sub10 local126 = local116 == local57 ? local68 : arg4.method1173(local116);
				@Pc(130) int local130 = local112 & 0xFFFF;
				if (local126 != null) {
					local34 |= local126.method2904(local130);
					local32 |= local126.method2909(local130);
				}
			}
			if (local34) {
				local28 = 1184;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
		}
		@Pc(166) Class41 local166 = Static157.aClass41_40;
		@Pc(175) Class159 local175;
		synchronized (Static157.aClass41_40) {
			local175 = (Class159) Static157.aClass41_40.method823(this.aLong133);
		}
		if (local175 == null || arg7.method2448(local175.method4951(), local28) != 0) {
			if (local175 != null) {
				local28 = arg7.method2451(local28, local175.method4951());
			}
			local36 = false;
			for (local47 = 0; local47 < 12; local47++) {
				local112 = this.anIntArray330[local47];
				if ((local112 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local112) != 0 && !arg9.method4307(local112 & 0x3FFFFFFF).method3286()) {
						local36 = true;
					}
				} else if (!arg8.method4827(local112 & 0x3FFFFFFF).method3847(this.aBoolean323)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(265) Class130[] local265 = new Class130[12];
			@Pc(267) int local267 = 0;
			for (@Pc(269) int local269 = 0; local269 < 12; local269++) {
				local57 = this.anIntArray330[local269];
				@Pc(294) Class130 local294;
				if ((local57 & 0x40000000) != 0) {
					local294 = arg8.method4827(local57 & 0x3FFFFFFF).method3844(this.aBoolean323);
					if (local294 != null) {
						local265[local267++] = local294;
					}
				} else if ((Integer.MIN_VALUE & local57) != 0) {
					local294 = arg9.method4307(local57 & 0x3FFFFFFF).method3292();
					if (local294 != null) {
						local265[local267++] = local294;
					}
				}
			}
			@Pc(335) Class130 local335 = new Class130(local265, local267);
			@Pc(339) int local339 = local28 | 0x2000;
			local175 = arg7.method2540(local335, local339, Static382.anInt6948, 64, 768);
			for (local116 = 0; local116 < 5; local116++) {
				if (Static64.aShortArrayArray8[local116].length > this.anIntArray331[local116]) {
					local175.method4964(Static257.aShortArray90[local116], Static64.aShortArrayArray8[local116][this.anIntArray331[local116]]);
				}
				if (this.anIntArray331[local116] < Static1.aShortArrayArray30[local116].length) {
					local175.method4964(Static57.aShortArray10[local116], Static1.aShortArrayArray30[local116][this.anIntArray331[local116]]);
				}
			}
			local175.method4958(local28);
			@Pc(410) Class41 local410 = Static157.aClass41_40;
			synchronized (Static157.aClass41_40) {
				Static157.aClass41_40.method832(this.aLong133, local175);
			}
		}
		if (arg2 == null) {
			return local175;
		} else {
			local175.method4927((byte) 4, local28, true);
			return arg2.method2414(local175, 1024, arg0, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!oi;)V")
	public void method3951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class170 arg2) {
		@Pc(7) int local7 = Static153.anIntArray249[arg0];
		if (this.anIntArray330[local7] != 0 && arg2.method4307(arg1) != null) {
			this.anIntArray330[local7] = arg1 | Integer.MIN_VALUE;
			this.method3953();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	public void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray331[arg0] = arg1;
		this.method3953();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	private void method3953() {
		@Pc(7) long[] local7 = Class70.aLongArray1;
		this.aLong133 = -1L;
		this.aLong133 = this.aLong133 >>> 8 ^ local7[(int) (((long) (this.anInt4470 >> 8) ^ this.aLong133) & 0xFFL)];
		this.aLong133 = local7[(int) ((this.aLong133 ^ (long) this.anInt4470) & 0xFFL)] ^ this.aLong133 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong133 = this.aLong133 >>> 8 ^ local7[(int) (((long) (this.anIntArray330[local50] >> 24) ^ this.aLong133) & 0xFFL)];
			this.aLong133 = this.aLong133 >>> 8 ^ local7[(int) ((this.aLong133 ^ (long) (this.anIntArray330[local50] >> 16)) & 0xFFL)];
			this.aLong133 = local7[(int) ((this.aLong133 ^ (long) (this.anIntArray330[local50] >> 8)) & 0xFFL)] ^ this.aLong133 >>> 8;
			this.aLong133 = local7[(int) ((this.aLong133 ^ (long) this.anIntArray330[local50]) & 0xFFL)] ^ this.aLong133 >>> 8;
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong133 = this.aLong133 >>> 8 ^ local7[(int) ((this.aLong133 ^ (long) this.anIntArray331[local144]) & 0xFFL)];
		}
		this.aLong133 = this.aLong133 >>> 8 ^ local7[(int) ((this.aLong133 ^ (long) (this.aBoolean323 ? 1 : 0)) & 0xFFL)];
	}
}
