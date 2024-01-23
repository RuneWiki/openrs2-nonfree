import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class175 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
	public boolean aBoolean383;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt5594;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	private int anInt5600;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
	public void method4466(@OriginalArg(0) boolean arg0) {
		this.aBoolean383 = arg0;
		this.method4469();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wi;IIIB)Lclient!gk;")
	public Class13_Sub1 method4467(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5594 != -1) {
			return Static22.method458(this.anInt5594).method4662(arg1, arg3, arg0, arg2);
		}
		@Pc(36) Class13_Sub1 local36 = (Class13_Sub1) Static90.aClass172_42.method4347(this.aLong197);
		if (local36 == null) {
			@Pc(40) boolean local40 = false;
			@Pc(52) int local52;
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local52 = this.anIntArray452[local42];
				if ((local52 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local52) != 0 && !Static25.method554(local52 & 0x3FFFFFFF).method1230()) {
						local40 = true;
					}
				} else if (!Static187.method3128(local52 & 0x3FFFFFFF).method916(this.aBoolean383)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(101) Class13_Sub7[] local101 = new Class13_Sub7[12];
			local52 = 0;
			@Pc(115) int local115;
			for (@Pc(105) int local105 = 0; local105 < 12; local105++) {
				local115 = this.anIntArray452[local105];
				@Pc(134) Class13_Sub7 local134;
				if ((local115 & 0x40000000) != 0) {
					local134 = Static187.method3128(local115 & 0x3FFFFFFF).method917(this.aBoolean383);
					if (local134 != null) {
						local101[local52++] = local134;
					}
				} else if ((local115 & Integer.MIN_VALUE) != 0) {
					local134 = Static25.method554(local115 & 0x3FFFFFFF).method1235();
					if (local134 != null) {
						local101[local52++] = local134;
					}
				}
			}
			@Pc(171) Class13_Sub7 local171 = new Class13_Sub7(local101, local52);
			for (local115 = 0; local115 < 5; local115++) {
				if (this.anIntArray451[local115] < Static56.aShortArrayArray1[local115].length) {
					local171.method4274(Static286.aShortArray93[local115], Static56.aShortArrayArray1[local115][this.anIntArray451[local115]]);
				}
				if (Static264.aShortArrayArray6[local115].length > this.anIntArray451[local115]) {
					local171.method4274(Static35.aShortArray2[local115], Static264.aShortArrayArray6[local115][this.anIntArray451[local115]]);
				}
			}
			local36 = local171.method4270(64, 768, -50, -10, -50);
			Static90.aClass172_42.method4345(local36, this.aLong197);
		}
		if (arg0 != null) {
			local36 = arg0.method4664(arg2, arg3, arg1, local36);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!wi;ILclient!wi;II[Lclient!ui;IIII)Lclient!gk;")
	public Class13_Sub1 method4468(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class186 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class170[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (this.anInt5594 != -1) {
			return Static22.method458(this.anInt5594).method4656(arg2, arg9, arg7, arg6, arg3, arg4, arg5, arg8, arg1);
		}
		@Pc(29) long local29 = this.aLong197;
		@Pc(32) int[] local32 = this.anIntArray452;
		if (arg3 != null && (arg3.anInt5809 >= 0 || arg3.anInt5813 >= 0)) {
			local32 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local32[local51] = this.anIntArray452[local51];
			}
			if (arg3.anInt5809 >= 0) {
				if (arg3.anInt5809 == 65535) {
					local29 ^= 0xFFFFFFFF00000000L;
					local32[5] = 0;
				} else {
					local32[5] = arg3.anInt5809 | 0x40000000;
					local29 ^= (long) local32[5] << 32;
				}
			}
			if (arg3.anInt5813 >= 0) {
				if (arg3.anInt5813 == 65535) {
					local29 ^= 0xFFFFFFFFL;
					local32[3] = 0;
				} else {
					local32[3] = arg3.anInt5813 | 0x40000000;
					local29 ^= local32[3];
				}
			}
		}
		@Pc(148) Class13_Sub1 local148 = (Class13_Sub1) Static159.aClass172_28.method4347(local29);
		@Pc(154) boolean local154;
		@Pc(349) int local349;
		@Pc(342) int local342;
		@Pc(363) int local363;
		@Pc(356) int local356;
		@Pc(370) int local370;
		@Pc(413) int local413;
		@Pc(425) int local425;
		@Pc(437) int local437;
		@Pc(451) int local451;
		@Pc(445) int local445;
		@Pc(335) int local335;
		if (local148 == null) {
			local154 = false;
			@Pc(163) int local163;
			for (@Pc(156) int local156 = 0; local156 < 12; local156++) {
				local163 = local32[local156];
				if ((local163 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local163) != 0 && !Static25.method554(local163 & 0x3FFFFFFF).method1228()) {
						local154 = true;
					}
				} else if (!Static187.method3128(local163 & 0x3FFFFFFF).method911(this.aBoolean383)) {
					local154 = true;
				}
			}
			if (local154) {
				if (this.aLong198 != -1L) {
					local148 = (Class13_Sub1) Static159.aClass172_28.method4347(this.aLong198);
				}
				if (local148 == null) {
					return null;
				}
			}
			if (local148 == null) {
				@Pc(233) Class13_Sub7[] local233 = new Class13_Sub7[12];
				@Pc(242) int local242;
				for (local163 = 0; local163 < 12; local163++) {
					local242 = local32[local163];
					@Pc(260) Class13_Sub7 local260;
					if ((local242 & 0x40000000) != 0) {
						local260 = Static187.method3128(local242 & 0x3FFFFFFF).method912(this.aBoolean383);
						if (local260 != null) {
							local233[local163] = local260;
						}
					} else if ((local242 & Integer.MIN_VALUE) != 0) {
						local260 = Static25.method554(local242 & 0x3FFFFFFF).method1231();
						if (local260 != null) {
							local233[local163] = local260;
						}
					}
				}
				@Pc(290) Class33 local290 = null;
				if (this.anInt5600 != -1) {
					local290 = Static141.method2265(this.anInt5600);
				}
				if (local290 != null && local290.anIntArrayArray11 != null) {
					for (local242 = 0; local242 < local290.anIntArrayArray11.length; local242++) {
						if (local290.anIntArrayArray11[local242] != null && local233[local242] != null) {
							local335 = local290.anIntArrayArray11[local242][0];
							local342 = local290.anIntArrayArray11[local242][2];
							local349 = local290.anIntArrayArray11[local242][1];
							local356 = local290.anIntArrayArray11[local242][4];
							local363 = local290.anIntArrayArray11[local242][3];
							local370 = local290.anIntArrayArray11[local242][5];
							if (this.anIntArrayArray38 == null) {
								this.anIntArrayArray38 = new int[local290.anIntArrayArray11.length][];
							}
							if (this.anIntArrayArray38[local242] == null) {
								@Pc(395) int[] local395 = this.anIntArrayArray38[local242] = new int[15];
								if (local363 == 0 && local356 == 0 && local370 == 0) {
									local395[12] = -local335;
									local395[0] = local395[4] = local395[8] = 32768;
									local395[14] = -local342;
									local395[13] = -local349;
								} else {
									local413 = Class174.anIntArray443[local363] >> 1;
									@Pc(419) int local419 = Class174.anIntArray443[local356] >> 1;
									local425 = Class174.anIntArray444[local363] >> 1;
									@Pc(431) int local431 = Class174.anIntArray444[local356] >> 1;
									local437 = Class174.anIntArray443[local370] >> 1;
									local445 = local437 * local425 + 16384 >> 15;
									local451 = Class174.anIntArray444[local370] >> 1;
									local395[4] = local437 * local413 + 16384 >> 15;
									local395[8] = local413 * local419 + 16384 >> 15;
									local395[5] = -local425;
									local395[7] = local445 * local419 + -local431 * -local451 + 16384 >> 15;
									local395[1] = local431 * local445 + -local451 * local419 + 16384 >> 15;
									local395[3] = local413 * local451 + 16384 >> 15;
									local395[13] = local395[7] * -local342 + local395[1] * -local335 + local395[4] * -local349 + 16384 >> 15;
									@Pc(553) int local553 = local425 * local451 + 16384 >> 15;
									local395[2] = local431 * local413 + 16384 >> 15;
									local395[0] = local431 * local553 + local437 * local419 + 16384 >> 15;
									local395[14] = local395[5] * -local349 + -local335 * local395[2] + local395[8] * -local342 + 16384 >> 15;
									local395[6] = local437 * -local431 + local553 * local419 + 16384 >> 15;
									local395[12] = -local342 * local395[6] + -local335 * local395[0] + local395[3] * -local349 + 16384 >> 15;
								}
								local395[11] = local342;
								local395[9] = local335;
								local395[10] = local349;
							}
							if (local363 != 0 || local356 != 0 || local370 != 0) {
								local233[local242].method4292(local363, local356, local370);
							}
							if (local335 != 0 || local349 != 0 || local342 != 0) {
								local233[local242].method4275(local335, local349, local342);
							}
						}
					}
				}
				@Pc(732) Class13_Sub7 local732 = new Class13_Sub7(local233, local233.length);
				for (local335 = 0; local335 < 5; local335++) {
					if (this.anIntArray451[local335] < Static56.aShortArrayArray1[local335].length) {
						local732.method4274(Static286.aShortArray93[local335], Static56.aShortArrayArray1[local335][this.anIntArray451[local335]]);
					}
					if (this.anIntArray451[local335] < Static264.aShortArrayArray6[local335].length) {
						local732.method4274(Static35.aShortArray2[local335], Static264.aShortArrayArray6[local335][this.anIntArray451[local335]]);
					}
				}
				local148 = local732.method4270(64, 850, -30, -50, -30);
				if (Static251.aBoolean330) {
					((Class13_Sub1_Sub2) local148).method2790(false, false, true, false, false, true);
				}
				if (arg0) {
					Static159.aClass172_28.method4345(local148, local29);
					this.aLong198 = local29;
				}
			}
		}
		local154 = false;
		@Pc(821) boolean local821 = false;
		@Pc(823) boolean local823 = false;
		@Pc(825) boolean local825 = false;
		local335 = arg6 == null ? 0 : arg6.length;
		@Pc(976) int local976;
		for (local349 = 0; local349 < local335; local349++) {
			if (arg6[local349] != null) {
				@Pc(849) Class186 local849 = Static51.method992(arg6[local349].anInt5446);
				if (local849.anIntArray469 != null) {
					local154 = true;
					Static37.aClass186Array2[local349] = local849;
					local363 = arg6[local349].anInt5443;
					local356 = arg6[local349].anInt5447;
					local370 = local849.anIntArray469[local363];
					Static95.aClass4_Sub2_Sub23Array1[local349] = Static295.method4588(local370 >>> 16);
					local370 &= 0xFFFF;
					Static121.anIntArray213[local349] = local370;
					if (Static95.aClass4_Sub2_Sub23Array1[local349] != null) {
						local823 |= Static95.aClass4_Sub2_Sub23Array1[local349].method4705(local370);
						local821 |= Static95.aClass4_Sub2_Sub23Array1[local349].method4713(local370);
						local825 |= local849.aBoolean405;
					}
					if ((local849.aBoolean403 || Static230.aBoolean289) && local356 != -1 && local849.anIntArray469.length > local356) {
						Static159.anIntArray269[local349] = local849.anIntArray470[local363];
						Static43.anIntArray92[local349] = arg6[local349].anInt5445;
						local976 = local849.anIntArray469[local356];
						Static165.aClass4_Sub2_Sub23Array3[local349] = Static295.method4588(local976 >>> 16);
						@Pc(988) int local988 = local976 & 0xFFFF;
						Static16.anIntArray9[local349] = local988;
						if (Static165.aClass4_Sub2_Sub23Array3[local349] != null) {
							local823 |= Static165.aClass4_Sub2_Sub23Array3[local349].method4705(local988);
							local821 |= Static165.aClass4_Sub2_Sub23Array3[local349].method4713(local988);
						}
					} else {
						Static159.anIntArray269[local349] = 0;
						Static43.anIntArray92[local349] = 0;
						Static165.aClass4_Sub2_Sub23Array3[local349] = null;
						Static16.anIntArray9[local349] = -1;
					}
				}
			}
		}
		if (!local154 && arg3 == null && arg1 == null) {
			return local148;
		}
		local349 = -1;
		local342 = -1;
		@Pc(1036) Class4_Sub2_Sub23 local1036 = null;
		@Pc(1038) Class4_Sub2_Sub23 local1038 = null;
		local363 = 0;
		if (arg3 != null) {
			local349 = arg3.anIntArray469[arg2];
			local976 = local349 >>> 16;
			local1038 = Static295.method4588(local976);
			local349 &= 0xFFFF;
			if (local1038 != null) {
				local823 |= local1038.method4705(local349);
				local821 |= local1038.method4713(local349);
				local825 |= arg3.aBoolean405;
			}
			if ((arg3.aBoolean403 || Static230.aBoolean289) && arg7 != -1 && arg7 < arg3.anIntArray469.length) {
				local363 = arg3.anIntArray470[arg2];
				local342 = arg3.anIntArray469[arg7];
				local413 = local342 >>> 16;
				local342 &= 0xFFFF;
				if (local976 == local413) {
					local1036 = local1038;
				} else {
					local1036 = Static295.method4588(local342 >>> 16);
				}
				if (local1036 != null) {
					local823 |= local1036.method4705(local342);
					local821 |= local1036.method4713(local342);
				}
			}
		}
		local976 = -1;
		local413 = -1;
		local425 = 0;
		@Pc(1167) Class4_Sub2_Sub23 local1167 = null;
		@Pc(1169) Class4_Sub2_Sub23 local1169 = null;
		if (arg1 != null) {
			local976 = arg1.anIntArray469[arg9];
			local437 = local976 >>> 16;
			local976 &= 0xFFFF;
			local1167 = Static295.method4588(local437);
			if (local1167 != null) {
				local823 |= local1167.method4705(local976);
				local821 |= local1167.method4713(local976);
				local825 |= arg1.aBoolean405;
			}
			if ((arg1.aBoolean403 || Static230.aBoolean289) && arg5 != -1 && arg5 < arg1.anIntArray469.length) {
				local425 = arg1.anIntArray470[arg9];
				local413 = arg1.anIntArray469[arg5];
				local451 = local413 >>> 16;
				local413 &= 0xFFFF;
				if (local437 == local451) {
					local1169 = local1167;
				} else {
					local1169 = Static295.method4588(local413 >>> 16);
				}
				if (local1169 != null) {
					local823 |= local1169.method4705(local413);
					local821 |= local1169.method4713(local413);
				}
			}
		}
		@Pc(1300) Class13_Sub1 local1300 = local148.method2750(!local821, !local823, !local825);
		local451 = 0;
		local445 = 1;
		while (local335 > local451) {
			if (Static95.aClass4_Sub2_Sub23Array1[local451] != null) {
				local1300.method2754(Static95.aClass4_Sub2_Sub23Array1[local451], Static121.anIntArray213[local451], Static165.aClass4_Sub2_Sub23Array3[local451], Static16.anIntArray9[local451], Static43.anIntArray92[local451] - 1, Static159.anIntArray269[local451], local445, Static37.aClass186Array2[local451].aBoolean405, this.anIntArrayArray38[local451]);
			}
			local451++;
			local445 <<= 0x1;
		}
		if (local1038 != null && local1167 != null) {
			local1300.method2731(local1038, local349, local1036, local342, arg4 - 1, local363, local1167, local976, local1169, local413, arg8 - 1, local425, arg3.aBooleanArray36, arg1.aBoolean405 | arg3.aBoolean405);
		} else if (local1038 != null) {
			local1300.method2748(local1038, local349, local1036, local342, arg4 - 1, local363, arg3.aBoolean405);
		} else if (local1167 != null) {
			local1300.method2748(local1167, local976, local1169, local413, arg8 - 1, local425, arg1.aBoolean405);
		}
		for (local451 = 0; local451 < local335; local451++) {
			Static95.aClass4_Sub2_Sub23Array1[local451] = null;
			Static165.aClass4_Sub2_Sub23Array3[local451] = null;
			Static37.aClass186Array2[local451] = null;
		}
		return local1300;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	private void method4469() {
		@Pc(8) long local8 = this.aLong197;
		@Pc(10) long[] local10 = Class4_Sub1_Sub15_Sub1.aLongArray11;
		this.aLong197 = -1L;
		this.aLong197 = this.aLong197 >>> 8 ^ local10[(int) (((long) (this.anInt5600 >> 8) ^ this.aLong197) & 0xFFL)];
		this.aLong197 = this.aLong197 >>> 8 ^ local10[(int) ((this.aLong197 ^ (long) this.anInt5600) & 0xFFL)];
		@Pc(53) int local53;
		for (local53 = 0; local53 < 12; local53++) {
			this.aLong197 = this.aLong197 >>> 8 ^ local10[(int) ((this.aLong197 ^ (long) (this.anIntArray452[local53] >> 24)) & 0xFFL)];
			this.aLong197 = this.aLong197 >>> 8 ^ local10[(int) (((long) (this.anIntArray452[local53] >> 16) ^ this.aLong197) & 0xFFL)];
			this.aLong197 = local10[(int) (((long) (this.anIntArray452[local53] >> 8) ^ this.aLong197) & 0xFFL)] ^ this.aLong197 >>> 8;
			this.aLong197 = this.aLong197 >>> 8 ^ local10[(int) ((this.aLong197 ^ (long) this.anIntArray452[local53]) & 0xFFL)];
		}
		for (local53 = 0; local53 < 5; local53++) {
			this.aLong197 = local10[(int) (((long) this.anIntArray451[local53] ^ this.aLong197) & 0xFFL)] ^ this.aLong197 >>> 8;
		}
		this.aLong197 = local10[(int) ((this.aLong197 ^ (long) (this.aBoolean383 ? 1 : 0)) & 0xFFL)] ^ this.aLong197 >>> 8;
		if (local8 != 0L && this.aLong197 != local8) {
			Static159.aClass172_28.method4353(local8);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIILclient!wi;III)Lclient!gk;")
	public Class13_Sub1 method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class186 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) long local14 = (long) arg0 | (long) arg3 << 32 | (long) (arg2 << 16);
		@Pc(20) Class13_Sub1 local20 = (Class13_Sub1) Static90.aClass172_42.method4347(local14);
		if (local20 == null) {
			@Pc(29) int local29 = 0;
			@Pc(32) Class13_Sub7[] local32 = new Class13_Sub7[3];
			if (!Static25.method554(arg0).method1230() || !Static25.method554(arg2).method1230() || !Static25.method554(arg3).method1230()) {
				return null;
			}
			@Pc(58) Class13_Sub7 local58 = Static25.method554(arg0).method1235();
			if (local58 != null) {
				local29++;
				local32[0] = local58;
			}
			local58 = Static25.method554(arg2).method1235();
			if (local58 != null) {
				local32[local29++] = local58;
			}
			local58 = Static25.method554(arg3).method1235();
			if (local58 != null) {
				local32[local29++] = local58;
			}
			local58 = new Class13_Sub7(local32, local29);
			for (@Pc(103) int local103 = 0; local103 < 5; local103++) {
				if (this.anIntArray451[local103] < Static56.aShortArrayArray1[local103].length) {
					local58.method4274(Static286.aShortArray93[local103], Static56.aShortArrayArray1[local103][this.anIntArray451[local103]]);
				}
				if (this.anIntArray451[local103] < Static264.aShortArrayArray6[local103].length) {
					local58.method4274(Static35.aShortArray2[local103], Static264.aShortArrayArray6[local103][this.anIntArray451[local103]]);
				}
			}
			local20 = local58.method4270(64, 768, -50, -10, -50);
			Static90.aClass172_42.method4345(local20, local14);
		}
		if (arg4 != null) {
			local20 = arg4.method4664(arg1, arg5, arg6, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public void method4473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static65.anIntArray460[arg0];
		if (this.anIntArray452[local7] != 0 && Static25.method554(arg1) != null) {
			this.anIntArray452[local7] = arg1 | Integer.MIN_VALUE;
			this.method4469();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ[I[III)V")
	public void method4474(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt5600 != arg4) {
			this.anIntArrayArray38 = null;
			this.anInt5600 = arg4;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
				for (@Pc(38) int local38 = 0; local38 < Static30.anInt632; local38++) {
					@Pc(49) Class49 local49 = Static25.method554(local38);
					if (local49 != null && !local49.aBoolean84 && local49.anInt1477 == (arg0 ? Static16.anIntArray10[local31] : Static116.anIntArray438[local31])) {
						arg2[Static65.anIntArray460[local31]] = Integer.MIN_VALUE | local38;
						break;
					}
				}
			}
		}
		this.anIntArray452 = arg2;
		this.anIntArray451 = arg1;
		this.aBoolean383 = arg0;
		this.anInt5594 = arg3;
		this.method4469();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	public int method4475() {
		return this.anInt5594 == -1 ? this.anIntArray452[1] + (this.anIntArray452[11] << 5) + (this.anIntArray452[8] << 10) + (this.anIntArray452[0] << 15) + (this.anIntArray451[4] << 20) + (this.anIntArray451[0] << 25) : 305419896 - -Static22.method458(this.anInt5594).anInt5770;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V")
	public void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray451[arg1] = arg0;
		this.method4469();
	}
}
