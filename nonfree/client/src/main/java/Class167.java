import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class167 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	private int anInt5327;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public int anInt5337;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[I")
	public int[] anIntArray481;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!d;ILclient!d;BIIZIIZI[Lclient!de;)Lclient!o;")
	public Class2_Sub1 method4027(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class36[] arg10) {
		if (this.anInt5337 != -1) {
			return Static197.method3172(this.anInt5337).method3706(arg10, arg9, arg0, arg4, arg1, arg3, arg2, arg7, arg6);
		}
		@Pc(30) long local30 = this.aLong204;
		@Pc(33) int[] local33 = this.anIntArray480;
		if (arg2 != null && (arg2.anInt966 >= 0 || arg2.anInt964 >= 0)) {
			local33 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local33[local47] = this.anIntArray480[local47];
			}
			if (arg2.anInt966 >= 0) {
				if (arg2.anInt966 == 65535) {
					local33[5] = 0;
					local30 ^= 0xFFFFFFFF00000000L;
				} else {
					local33[5] = arg2.anInt966 | 0x40000000;
					local30 ^= (long) local33[5] << 32;
				}
			}
			if (arg2.anInt964 >= 0) {
				if (arg2.anInt964 == 65535) {
					local30 ^= 0xFFFFFFFFL;
					local33[3] = 0;
				} else {
					local33[3] = arg2.anInt964 | 0x40000000;
					local30 ^= local33[3];
				}
			}
		}
		@Pc(138) Class2_Sub1 local138 = (Class2_Sub1) Static240.aClass89_37.method2268(local30);
		@Pc(142) boolean local142;
		@Pc(328) int local328;
		@Pc(335) int local335;
		@Pc(342) int local342;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(398) int local398;
		@Pc(392) int local392;
		@Pc(416) int local416;
		@Pc(422) int local422;
		@Pc(482) int local482;
		@Pc(321) int local321;
		if (local138 == null) {
			local142 = false;
			@Pc(153) int local153;
			for (@Pc(144) int local144 = 0; local144 < 12; local144++) {
				local153 = local33[local144];
				if ((local153 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local153) != 0 && !Static81.method1379(local153 & 0x3FFFFFFF).method1878()) {
						local142 = true;
					}
				} else if (!Static56.method1050(local153 & 0x3FFFFFFF).method1335(this.aBoolean332)) {
					local142 = true;
				}
			}
			if (local142) {
				if (this.aLong205 != -1L) {
					local138 = (Class2_Sub1) Static240.aClass89_37.method2268(this.aLong205);
				}
				if (local138 == null) {
					return null;
				}
			}
			if (local138 == null) {
				@Pc(217) Class2_Sub3[] local217 = new Class2_Sub3[12];
				@Pc(226) int local226;
				for (local153 = 0; local153 < 12; local153++) {
					local226 = local33[local153];
					@Pc(243) Class2_Sub3 local243;
					if ((local226 & 0x40000000) != 0) {
						local243 = Static56.method1050(local226 & 0x3FFFFFFF).method1332(this.aBoolean332);
						if (local243 != null) {
							local217[local153] = local243;
						}
					} else if ((local226 & Integer.MIN_VALUE) != 0) {
						local243 = Static81.method1379(local226 & 0x3FFFFFFF).method1880();
						if (local243 != null) {
							local217[local153] = local243;
						}
					}
				}
				@Pc(275) Class91 local275 = null;
				if (this.anInt5327 != -1) {
					local275 = Static251.method4178(this.anInt5327);
				}
				if (local275 != null && local275.anIntArrayArray38 != null) {
					for (local226 = 0; local226 < local275.anIntArrayArray38.length; local226++) {
						if (local275.anIntArrayArray38[local226] != null && local217[local226] != null) {
							local321 = local275.anIntArrayArray38[local226][0];
							local328 = local275.anIntArrayArray38[local226][1];
							local335 = local275.anIntArrayArray38[local226][2];
							local342 = local275.anIntArrayArray38[local226][3];
							local349 = local275.anIntArrayArray38[local226][4];
							local356 = local275.anIntArrayArray38[local226][5];
							if (this.anIntArrayArray67 == null) {
								this.anIntArrayArray67 = new int[local275.anIntArrayArray38.length][];
							}
							if (this.anIntArrayArray67[local226] == null) {
								@Pc(380) int[] local380 = this.anIntArrayArray67[local226] = new int[15];
								if (local342 == 0 && local349 == 0 && local356 == 0) {
									local380[0] = local380[4] = local380[8] = 32768;
									local380[12] = -local321;
									local380[14] = -local335;
									local380[13] = -local328;
								} else {
									local392 = Class146.anIntArray461[local342] >> 1;
									local398 = Class146.anIntArray463[local342] >> 1;
									@Pc(404) int local404 = Class146.anIntArray463[local349] >> 1;
									@Pc(410) int local410 = Class146.anIntArray461[local349] >> 1;
									local416 = Class146.anIntArray463[local356] >> 1;
									local422 = Class146.anIntArray461[local356] >> 1;
									local380[4] = local398 * local416 + 16384 >> 15;
									@Pc(440) int local440 = local392 * local422 + 16384 >> 15;
									local380[0] = local416 * local404 + local410 * local440 + 16384 >> 15;
									local380[3] = local398 * local422 + 16384 >> 15;
									local380[8] = local398 * local404 + 16384 >> 15;
									local482 = local392 * local416 + 16384 >> 15;
									local380[7] = local482 * local404 + -local410 * -local422 + 16384 >> 15;
									local380[2] = local398 * local410 + 16384 >> 15;
									local380[1] = local404 * -local422 + local482 * local410 + 16384 >> 15;
									local380[5] = -local392;
									local380[13] = -local335 * local380[7] + local380[1] * -local321 + -local328 * local380[4] + 16384 >> 15;
									local380[6] = local416 * -local410 + local404 * local440 + 16384 >> 15;
									local380[14] = -local335 * local380[8] + local380[2] * -local321 + -local328 * local380[5] + 16384 >> 15;
									local380[12] = local380[6] * -local335 + -local321 * local380[0] + local380[3] * -local328 + 16384 >> 15;
								}
								local380[9] = local321;
								local380[10] = local328;
								local380[11] = local335;
							}
							if (local342 != 0 || local349 != 0 || local356 != 0) {
								local217[local226].method647(local342, local349, local356);
							}
							if (local321 != 0 || local328 != 0 || local335 != 0) {
								local217[local226].method641(local321, local328, local335);
							}
						}
					}
				}
				@Pc(719) Class2_Sub3 local719 = new Class2_Sub3(local217, local217.length);
				for (local321 = 0; local321 < 5; local321++) {
					if (this.anIntArray481[local321] < Static211.aShortArrayArray9[local321].length) {
						local719.method656(Static186.aShortArray81[local321], Static211.aShortArrayArray9[local321][this.anIntArray481[local321]]);
					}
					if (this.anIntArray481[local321] < Static278.aShortArrayArray13[local321].length) {
						local719.method656(Static248.aShortArray90[local321], Static278.aShortArrayArray13[local321][this.anIntArray481[local321]]);
					}
				}
				local138 = local719.method651(64, 850, -30, -50, -30);
				if (Static294.aBoolean367) {
					((Class2_Sub1_Sub1) local138).method133(false, false, true, false, false, true);
				}
				if (arg5) {
					Static240.aClass89_37.method2272(local30, local138);
					this.aLong205 = local30;
				}
			}
		}
		local142 = false;
		@Pc(810) boolean local810 = false;
		@Pc(812) boolean local812 = false;
		@Pc(814) boolean local814 = false;
		local321 = arg10 == null ? 0 : arg10.length;
		@Pc(943) int local943;
		for (local328 = 0; local328 < local321; local328++) {
			if (arg10[local328] != null) {
				@Pc(839) Class32 local839 = Static202.method3231(arg10[local328].anInt1069);
				if (local839.anIntArray123 != null) {
					Static286.aClass32Array1[local328] = local839;
					local142 = true;
					local349 = arg10[local328].anInt1064;
					local342 = arg10[local328].anInt1066;
					local356 = local839.anIntArray123[local342];
					Static161.aClass1_Sub3_Sub21Array2[local328] = Static256.method3953(local356 >>> 16);
					local356 &= 0xFFFF;
					Static144.anIntArray305[local328] = local356;
					if (Static161.aClass1_Sub3_Sub21Array2[local328] != null) {
						local814 |= Static161.aClass1_Sub3_Sub21Array2[local328].method4311(local356);
						local810 |= Static161.aClass1_Sub3_Sub21Array2[local328].method4307(local356);
						local812 |= local839.aBoolean70;
					}
					if ((local839.aBoolean69 || Static150.aBoolean218) && local349 != -1 && local349 < local839.anIntArray123.length) {
						Static5.anIntArray308[local328] = local839.anIntArray121[local342];
						Static85.anIntArray202[local328] = arg10[local328].anInt1068;
						local943 = local839.anIntArray123[local349];
						Static68.aClass1_Sub3_Sub21Array1[local328] = Static256.method3953(local943 >>> 16);
						@Pc(955) int local955 = local943 & 0xFFFF;
						Static134.anIntArray289[local328] = local955;
						if (Static68.aClass1_Sub3_Sub21Array1[local328] != null) {
							local814 |= Static68.aClass1_Sub3_Sub21Array1[local328].method4311(local955);
							local810 |= Static68.aClass1_Sub3_Sub21Array1[local328].method4307(local955);
						}
					} else {
						Static5.anIntArray308[local328] = 0;
						Static85.anIntArray202[local328] = 0;
						Static68.aClass1_Sub3_Sub21Array1[local328] = null;
						Static134.anIntArray289[local328] = -1;
					}
				}
			}
		}
		if (local142 || arg2 != null || arg0 != null) {
			local335 = -1;
			local342 = 0;
			local328 = -1;
			@Pc(1035) Class1_Sub3_Sub21 local1035 = null;
			@Pc(1037) Class1_Sub3_Sub21 local1037 = null;
			if (arg2 != null) {
				local328 = arg2.anIntArray123[arg4];
				local943 = local328 >>> 16;
				local1035 = Static256.method3953(local943);
				local328 &= 0xFFFF;
				if (local1035 != null) {
					local814 |= local1035.method4311(local328);
					local810 |= local1035.method4307(local328);
					local812 |= arg2.aBoolean70;
				}
				if ((arg2.aBoolean69 || Static150.aBoolean218) && arg6 != -1 && arg6 < arg2.anIntArray123.length) {
					local335 = arg2.anIntArray123[arg6];
					local342 = arg2.anIntArray121[arg4];
					local398 = local335 >>> 16;
					local335 &= 0xFFFF;
					if (local398 == local943) {
						local1037 = local1035;
					} else {
						local1037 = Static256.method3953(local335 >>> 16);
					}
					if (local1037 != null) {
						local814 |= local1037.method4311(local335);
						local810 |= local1037.method4307(local335);
					}
				}
			}
			local943 = -1;
			local398 = -1;
			local392 = 0;
			@Pc(1154) Class1_Sub3_Sub21 local1154 = null;
			@Pc(1156) Class1_Sub3_Sub21 local1156 = null;
			if (arg0 != null) {
				local943 = arg0.anIntArray123[arg7];
				local416 = local943 >>> 16;
				local943 &= 0xFFFF;
				local1154 = Static256.method3953(local416);
				if (local1154 != null) {
					local814 |= local1154.method4311(local943);
					local810 |= local1154.method4307(local943);
					local812 |= arg0.aBoolean70;
				}
				if ((arg0.aBoolean69 || Static150.aBoolean218) && arg3 != -1 && arg0.anIntArray123.length > arg3) {
					local398 = arg0.anIntArray123[arg3];
					local392 = arg0.anIntArray121[arg7];
					local422 = local398 >>> 16;
					local398 &= 0xFFFF;
					if (local422 == local416) {
						local1156 = local1154;
					} else {
						local1156 = Static256.method3953(local398 >>> 16);
					}
					if (local1156 != null) {
						local814 |= local1156.method4311(local398);
						local810 |= local1156.method4307(local398);
					}
				}
			}
			@Pc(1284) Class2_Sub1 local1284 = local138.method560(!local810, !local814, !local812);
			local422 = 0;
			local482 = 1;
			while (local321 > local422) {
				if (Static161.aClass1_Sub3_Sub21Array2[local422] != null) {
					local1284.method566(Static161.aClass1_Sub3_Sub21Array2[local422], Static144.anIntArray305[local422], Static68.aClass1_Sub3_Sub21Array1[local422], Static134.anIntArray289[local422], Static85.anIntArray202[local422] - 1, Static5.anIntArray308[local422], local482, Static286.aClass32Array1[local422].aBoolean70, this.anIntArrayArray67[local422]);
				}
				local422++;
				local482 <<= 0x1;
			}
			if (local1035 != null && local1154 != null) {
				local1284.method547(local1035, local328, local1037, local335, arg9 - 1, local342, local1154, local943, local1156, local398, arg1 - 1, local392, arg2.aBooleanArray9, arg0.aBoolean70 | arg2.aBoolean70);
			} else if (local1035 != null) {
				local1284.method551(local1035, local328, local1037, local335, arg9 - 1, local342, arg2.aBoolean70);
			} else if (local1154 != null) {
				local1284.method551(local1154, local943, local1156, local398, arg1 - 1, local392, arg0.aBoolean70);
			}
			for (local422 = 0; local422 < local321; local422++) {
				Static161.aClass1_Sub3_Sub21Array2[local422] = null;
				Static68.aClass1_Sub3_Sub21Array1[local422] = null;
				Static286.aClass32Array1[local422] = null;
			}
			return local1284;
		} else if (arg8) {
			return local138.method560(false, false, false);
		} else {
			return local138;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIII[IZ)V")
	public void method4028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (arg2 != this.anInt5327) {
			this.anIntArrayArray67 = null;
			this.anInt5327 = arg2;
		}
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				for (@Pc(26) int local26 = 0; local26 < Static162.anInt3543; local26++) {
					@Pc(37) Class79 local37 = Static81.method1379(local26);
					if (local37 != null && !local37.aBoolean156 && (arg4 ? Static166.anIntArray336[local21] : Static247.anIntArray467[local21]) == local37.anInt2500) {
						arg3[Static105.anIntArray234[local21]] = Integer.MIN_VALUE | local26;
						break;
					}
				}
			}
		}
		this.anIntArray480 = arg3;
		this.anInt5337 = arg1;
		this.aBoolean332 = arg4;
		this.anIntArray481 = arg0;
		this.method4031();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!d;III)Lclient!o;")
	public Class2_Sub1 method4029(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5337 != -1) {
			return Static197.method3172(this.anInt5337).method3707(arg2, arg3, arg0, arg1);
		}
		@Pc(35) Class2_Sub1 local35 = (Class2_Sub1) Static263.aClass89_42.method2268(this.aLong204);
		if (local35 == null) {
			@Pc(41) boolean local41 = false;
			@Pc(51) int local51;
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local51 = this.anIntArray480[local43];
				if ((local51 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local51) != 0 && !Static81.method1379(local51 & 0x3FFFFFFF).method1873()) {
						local41 = true;
					}
				} else if (!Static56.method1050(local51 & 0x3FFFFFFF).method1341(this.aBoolean332)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(98) Class2_Sub3[] local98 = new Class2_Sub3[12];
			local51 = 0;
			@Pc(112) int local112;
			for (@Pc(102) int local102 = 0; local102 < 12; local102++) {
				local112 = this.anIntArray480[local102];
				@Pc(132) Class2_Sub3 local132;
				if ((local112 & 0x40000000) != 0) {
					local132 = Static56.method1050(local112 & 0x3FFFFFFF).method1329(this.aBoolean332);
					if (local132 != null) {
						local98[local51++] = local132;
					}
				} else if ((Integer.MIN_VALUE & local112) != 0) {
					local132 = Static81.method1379(local112 & 0x3FFFFFFF).method1870();
					if (local132 != null) {
						local98[local51++] = local132;
					}
				}
			}
			@Pc(167) Class2_Sub3 local167 = new Class2_Sub3(local98, local51);
			for (local112 = 0; local112 < 5; local112++) {
				if (Static211.aShortArrayArray9[local112].length > this.anIntArray481[local112]) {
					local167.method656(Static186.aShortArray81[local112], Static211.aShortArrayArray9[local112][this.anIntArray481[local112]]);
				}
				if (Static278.aShortArrayArray13[local112].length > this.anIntArray481[local112]) {
					local167.method656(Static248.aShortArray90[local112], Static278.aShortArrayArray13[local112][this.anIntArray481[local112]]);
				}
			}
			local35 = local167.method651(64, 768, -50, -10, -50);
			Static263.aClass89_42.method2272(this.aLong204, local35);
		}
		if (arg1 != null) {
			local35 = arg1.method806(local35, arg0, arg3, arg2);
		}
		return local35;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILclient!d;II)Lclient!o;")
	public Class2_Sub1 method4030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class32 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) arg1 | (long) (arg0 << 16) | (long) arg6 << 32;
		@Pc(30) Class2_Sub1 local30 = (Class2_Sub1) Static263.aClass89_42.method2268(local18);
		if (local30 == null) {
			@Pc(36) Class2_Sub3[] local36 = new Class2_Sub3[3];
			@Pc(38) int local38 = 0;
			if (!Static81.method1379(arg1).method1873() || !Static81.method1379(arg0).method1873() || !Static81.method1379(arg6).method1873()) {
				return null;
			}
			@Pc(62) Class2_Sub3 local62 = Static81.method1379(arg1).method1870();
			if (local62 != null) {
				local38++;
				local36[0] = local62;
			}
			local62 = Static81.method1379(arg0).method1870();
			if (local62 != null) {
				local36[local38++] = local62;
			}
			local62 = Static81.method1379(arg6).method1870();
			if (local62 != null) {
				local36[local38++] = local62;
			}
			local62 = new Class2_Sub3(local36, local38);
			for (@Pc(106) int local106 = 0; local106 < 5; local106++) {
				if (this.anIntArray481[local106] < Static211.aShortArrayArray9[local106].length) {
					local62.method656(Static186.aShortArray81[local106], Static211.aShortArrayArray9[local106][this.anIntArray481[local106]]);
				}
				if (this.anIntArray481[local106] < Static278.aShortArrayArray13[local106].length) {
					local62.method656(Static248.aShortArray90[local106], Static278.aShortArrayArray13[local106][this.anIntArray481[local106]]);
				}
			}
			local30 = local62.method651(64, 768, -50, -10, -50);
			Static263.aClass89_42.method2272(local18, local30);
		}
		if (arg4 != null) {
			local30 = arg4.method806(local30, arg5, arg2, arg3);
		}
		return local30;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	private void method4031() {
		@Pc(8) long local8 = this.aLong204;
		this.aLong204 = -1L;
		@Pc(13) long[] local13 = Class193.aLongArray10;
		this.aLong204 = local13[(int) ((this.aLong204 ^ (long) (this.anInt5327 >> 8)) & 0xFFL)] ^ this.aLong204 >>> 8;
		this.aLong204 = this.aLong204 >>> 8 ^ local13[(int) (((long) this.anInt5327 ^ this.aLong204) & 0xFFL)];
		@Pc(61) int local61;
		for (local61 = 0; local61 < 12; local61++) {
			this.aLong204 = this.aLong204 >>> 8 ^ local13[(int) ((this.aLong204 ^ (long) (this.anIntArray480[local61] >> 24)) & 0xFFL)];
			this.aLong204 = this.aLong204 >>> 8 ^ local13[(int) (((long) (this.anIntArray480[local61] >> 16) ^ this.aLong204) & 0xFFL)];
			this.aLong204 = local13[(int) (((long) (this.anIntArray480[local61] >> 8) ^ this.aLong204) & 0xFFL)] ^ this.aLong204 >>> 8;
			this.aLong204 = local13[(int) (((long) this.anIntArray480[local61] ^ this.aLong204) & 0xFFL)] ^ this.aLong204 >>> 8;
		}
		for (local61 = 0; local61 < 5; local61++) {
			this.aLong204 = local13[(int) (((long) this.anIntArray481[local61] ^ this.aLong204) & 0xFFL)] ^ this.aLong204 >>> 8;
		}
		this.aLong204 = this.aLong204 >>> 8 ^ local13[(int) (((long) (this.aBoolean332 ? 1 : 0) ^ this.aLong204) & 0xFFL)];
		if (local8 != 0L && local8 != this.aLong204) {
			Static240.aClass89_37.method2264(local8);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)V")
	public void method4032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray481[arg1] = arg0;
		this.method4031();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)V")
	public void method4033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static105.anIntArray234[arg1];
		if (this.anIntArray480[local15] != 0 && Static81.method1379(arg0) != null) {
			this.anIntArray480[local15] = Integer.MIN_VALUE | arg0;
			this.method4031();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V")
	public void method4036(@OriginalArg(0) boolean arg0) {
		this.aBoolean332 = arg0;
		this.method4031();
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public int method4037() {
		return this.anInt5337 == -1 ? (this.anIntArray481[4] << 20) + ((this.anIntArray481[0] << 25) + (this.anIntArray480[0] << 15)) + (this.anIntArray480[8] << 10) + (this.anIntArray480[11] << 5) + this.anIntArray480[1] : Static197.method3172(this.anInt5337).anInt4945 + 305419896;
	}
}
