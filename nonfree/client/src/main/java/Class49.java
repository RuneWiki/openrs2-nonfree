import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class49 {

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
	public boolean aBoolean63;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
	private int anInt1122;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public int anInt1124 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
	private void method995() {
		@Pc(7) long[] local7 = Class3_Sub1_Sub11.aLongArray3;
		this.aLong24 = -1L;
		this.aLong24 = local7[(int) ((this.aLong24 ^ (long) (this.anInt1122 >> 8)) & 0xFFL)] ^ this.aLong24 >>> 8;
		this.aLong24 = local7[(int) (((long) this.anInt1122 ^ this.aLong24) & 0xFFL)] ^ this.aLong24 >>> 8;
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong24 = this.aLong24 >>> 8 ^ local7[(int) ((this.aLong24 ^ (long) (this.anIntArray100[local56] >> 24)) & 0xFFL)];
			this.aLong24 = this.aLong24 >>> 8 ^ local7[(int) (((long) (this.anIntArray100[local56] >> 16) ^ this.aLong24) & 0xFFL)];
			this.aLong24 = local7[(int) ((this.aLong24 ^ (long) (this.anIntArray100[local56] >> 8)) & 0xFFL)] ^ this.aLong24 >>> 8;
			this.aLong24 = this.aLong24 >>> 8 ^ local7[(int) ((this.aLong24 ^ (long) this.anIntArray100[local56]) & 0xFFL)];
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong24 = local7[(int) ((this.aLong24 ^ (long) this.anIntArray99[local152]) & 0xFFL)] ^ this.aLong24 >>> 8;
		}
		this.aLong24 = local7[(int) (((long) (this.aBoolean63 ? 1 : 0) ^ this.aLong24) & 0xFFL)] ^ this.aLong24 >>> 8;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZI[II[I)V")
	public void method997(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		this.aBoolean63 = arg0;
		this.anInt1124 = arg1;
		this.anIntArray100 = arg2;
		this.anIntArray99 = arg4;
		if (this.anInt1122 != arg3) {
			this.anIntArrayArray8 = null;
			this.anInt1122 = arg3;
		}
		this.method995();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILclient!jj;ILclient!ok;Lclient!qt;IBLclient!ti;[Lclient!fi;Lclient!fd;Lclient!fl;Lclient!ok;IILclient!np;ILclient!cn;)Lclient!f;")
	public Class75 method998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class124 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class177 arg4, @OriginalArg(6) Interface9 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class223 arg7, @OriginalArg(10) Class81[] arg8, @OriginalArg(11) Class78 arg9, @OriginalArg(12) Class83 arg10, @OriginalArg(13) Class177 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) Class155 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class43 arg16) {
		if (this.anInt1124 != -1) {
			return arg10.method1716(this.anInt1124).method1211(arg3, arg1, arg8, arg15, arg0, arg12, arg13, arg16, arg14, arg5, arg6, arg2, arg4, arg11);
		}
		@Pc(33) int local33 = arg12;
		@Pc(36) long local36 = this.aLong24;
		@Pc(39) int[] local39 = this.anIntArray100;
		if (arg11 != null && (arg11.anInt4504 >= 0 || arg11.anInt4505 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray100[local55];
			}
			if (arg11.anInt4504 >= 0) {
				if (arg11.anInt4504 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg11.anInt4504 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg11.anInt4505 >= 0) {
				if (arg11.anInt4505 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg11.anInt4505 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg11 != null || arg4 != null;
		@Pc(155) int local155 = arg8 == null ? 0 : arg8.length;
		@Pc(189) int local189;
		@Pc(194) int local194;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static286.aClass3_Sub7_Sub15Array6[local157] = null;
			if (arg8[local157] != null) {
				@Pc(175) Class177 local175 = arg16.method930(arg8[local157].anInt2042);
				if (local175.anIntArray499 != null) {
					Static193.aClass177Array1[local157] = local175;
					local148 = true;
					local189 = arg8[local157].anInt2045;
					local194 = arg8[local157].anInt2046;
					@Pc(199) int local199 = local175.anIntArray499[local189];
					Static286.aClass3_Sub7_Sub15Array6[local157] = arg16.method931(local199 >>> 16);
					@Pc(212) int local212 = local199 & 0xFFFF;
					Static103.anIntArray203[local157] = local212;
					if (Static286.aClass3_Sub7_Sub15Array6[local157] != null) {
						local140 |= Static286.aClass3_Sub7_Sub15Array6[local157].method5583(local212);
						local138 |= Static286.aClass3_Sub7_Sub15Array6[local157].method5582(local212);
					}
					if ((local175.aBoolean351 || Static120.aBoolean173) && local194 != -1 && local194 < local175.anIntArray499.length) {
						Static117.anIntArray220[local157] = local175.anIntArray501[local189];
						Static238.anIntArray478[local157] = arg8[local157].anInt2041;
						@Pc(289) int local289 = local175.anIntArray499[local194];
						Static48.aClass3_Sub7_Sub15Array2[local157] = arg16.method931(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static300.anIntArray574[local157] = local302;
						if (Static48.aClass3_Sub7_Sub15Array2[local157] != null) {
							local140 |= Static48.aClass3_Sub7_Sub15Array2[local157].method5583(local302);
							local138 |= Static48.aClass3_Sub7_Sub15Array2[local157].method5582(local302);
						}
					} else {
						Static117.anIntArray220[local157] = 0;
						Static238.anIntArray478[local157] = 0;
						Static48.aClass3_Sub7_Sub15Array2[local157] = null;
						Static300.anIntArray574[local157] = -1;
					}
				}
			}
		}
		@Pc(340) int local340 = -1;
		local189 = -1;
		local194 = 0;
		@Pc(346) Class3_Sub7_Sub15 local346 = null;
		@Pc(348) Class3_Sub7_Sub15 local348 = null;
		@Pc(350) int local350 = -1;
		@Pc(352) int local352 = -1;
		@Pc(354) int local354 = 0;
		@Pc(356) Class3_Sub7_Sub15 local356 = null;
		@Pc(358) Class3_Sub7_Sub15 local358 = null;
		if (local148) {
			@Pc(371) int local371;
			@Pc(427) int local427;
			if (arg11 != null) {
				local340 = arg11.anIntArray499[arg15];
				local371 = local340 >>> 16;
				local346 = arg16.method931(local371);
				local340 &= 0xFFFF;
				if (local346 != null) {
					local140 |= local346.method5583(local340);
					local138 |= local346.method5582(local340);
				}
				if ((arg11.aBoolean351 || Static120.aBoolean173) && arg3 != -1 && arg3 < arg11.anIntArray499.length) {
					local194 = arg11.anIntArray501[arg15];
					local189 = arg11.anIntArray499[arg3];
					local427 = local189 >>> 16;
					local189 &= 0xFFFF;
					local348 = local371 == local427 ? local346 : arg16.method931(local427);
					if (local348 != null) {
						local140 |= local348.method5583(local189);
						local138 |= local348.method5582(local189);
					}
				}
			}
			local33 = arg12 | 0x20;
			if (arg4 != null) {
				local350 = arg4.anIntArray499[arg6];
				local371 = local350 >>> 16;
				local350 &= 0xFFFF;
				local356 = arg16.method931(local371);
				if (local356 != null) {
					local140 |= local356.method5583(local350);
					local138 |= local356.method5582(local350);
				}
				if ((arg4.aBoolean351 || Static120.aBoolean173) && arg1 != -1 && arg1 < arg4.anIntArray499.length) {
					local354 = arg4.anIntArray501[arg6];
					local352 = arg4.anIntArray499[arg1];
					local427 = local352 >>> 16;
					local352 &= 0xFFFF;
					local358 = local427 == local371 ? local356 : arg16.method931(local427);
					if (local358 != null) {
						local140 |= local358.method5583(local352);
						local138 |= local358.method5582(local352);
					}
				}
			}
			if (local140) {
				local33 |= 0x80;
			}
			if (local138) {
				local33 |= 0x100;
			}
		}
		@Pc(587) Class139 local587 = Static78.aClass139_13;
		@Pc(595) Class75 local595;
		synchronized (Static78.aClass139_13) {
			local595 = (Class75) Static78.aClass139_13.method3076(local36);
		}
		@Pc(608) Class36 local608 = null;
		if (this.anInt1122 != -1) {
			local608 = arg2.method2628(this.anInt1122);
		}
		@Pc(649) int local649;
		@Pc(655) int local655;
		if (local595 == null || arg14.method4919(local595.method5462(), local33) != 0 || local608 != null && local608.anIntArrayArray6 != null && this.anIntArrayArray8 == null) {
			if (local595 != null) {
				local33 = arg14.method4920(local33, local595.method5462());
			}
			@Pc(647) boolean local647 = false;
			local649 = 0;
			while (true) {
				if (local649 >= 12) {
					if (local647) {
						if (this.aLong25 != -1L) {
							@Pc(707) Class139 local707 = Static78.aClass139_13;
							synchronized (Static78.aClass139_13) {
								local595 = (Class75) Static78.aClass139_13.method3076(this.aLong25);
							}
						}
						if (local595 == null || arg14.method4919(local595.method5462(), local33) != 0 || local608 != null && local608.anIntArrayArray6 != null && this.anIntArrayArray8 == null) {
							return null;
						}
					} else {
						@Pc(746) Class239[] local746 = new Class239[12];
						@Pc(754) int local754;
						for (@Pc(748) int local748 = 0; local748 < 12; local748++) {
							local754 = local39[local748];
							@Pc(772) Class239 local772;
							if ((local754 & 0x40000000) != 0) {
								local772 = arg9.method1641(local754 & 0x3FFFFFFF).method1022(this.aBoolean63);
								if (local772 != null) {
									local746[local748] = local772;
								}
							} else if ((local754 & Integer.MIN_VALUE) != 0) {
								local772 = arg7.method5083(local754 & 0x3FFFFFFF).method3192();
								if (local772 != null) {
									local746[local748] = local772;
								}
							}
						}
						@Pc(833) int local833;
						if (local608 != null && local608.anIntArrayArray6 != null) {
							for (local754 = 0; local754 < local608.anIntArrayArray6.length; local754++) {
								if (local608.anIntArrayArray6[local754] != null && local746[local754] != null) {
									local833 = local608.anIntArrayArray6[local754][0];
									@Pc(840) int local840 = local608.anIntArrayArray6[local754][1];
									@Pc(847) int local847 = local608.anIntArrayArray6[local754][2];
									@Pc(856) int local856 = local608.anIntArrayArray6[local754][3] << 3;
									@Pc(865) int local865 = local608.anIntArrayArray6[local754][4] << 3;
									@Pc(874) int local874 = local608.anIntArrayArray6[local754][5] << 3;
									if (this.anIntArrayArray8 == null) {
										this.anIntArrayArray8 = new int[local608.anIntArrayArray6.length][];
									}
									if (this.anIntArrayArray8[local754] == null) {
										@Pc(896) int[] local896 = this.anIntArrayArray8[local754] = new int[15];
										if (local856 == 0 && local865 == 0 && local874 == 0) {
											local896[12] = -local833;
											local896[13] = -local840;
											local896[14] = -local847;
											local896[0] = local896[4] = local896[8] = 32768;
										} else {
											@Pc(912) int local912 = Class226.anIntArray613[local856];
											@Pc(916) int local916 = Class226.anIntArray614[local856];
											@Pc(920) int local920 = Class226.anIntArray613[local865];
											@Pc(924) int local924 = Class226.anIntArray614[local865];
											@Pc(928) int local928 = Class226.anIntArray613[local874];
											@Pc(932) int local932 = Class226.anIntArray614[local874];
											@Pc(940) int local940 = local916 * local928 + 16384 >> 15;
											@Pc(948) int local948 = local932 * local916 + 16384 >> 15;
											local896[8] = local920 * local912 + 16384 >> 15;
											local896[1] = local940 * local924 + local920 * -local932 + 16384 >> 15;
											local896[3] = local932 * local912 + 16384 >> 15;
											local896[7] = local920 * local940 + -local932 * -local924 + 16384 >> 15;
											local896[6] = -local924 * local928 + local948 * local920 + 16384 >> 15;
											local896[5] = -local916;
											local896[2] = local924 * local912 + 16384 >> 15;
											local896[4] = local928 * local912 + 16384 >> 15;
											local896[0] = local924 * local948 + local928 * local920 + 16384 >> 15;
											local896[13] = -local840 * local896[4] + local896[1] * -local833 + local896[7] * -local847 + 16384 >> 15;
											local896[12] = local896[6] * -local847 + -local833 * local896[0] + -local840 * local896[3] + 16384 >> 15;
											local896[14] = local896[8] * -local847 + local896[5] * -local840 + -local833 * local896[2] + 16384 >> 15;
										}
										local896[11] = local847;
										local896[9] = local833;
										local896[10] = local840;
									}
									if (local856 != 0 || local865 != 0 || local874 != 0) {
										local746[local754].method5559(local856, local865, local874);
									}
									if (local833 != 0 || local840 != 0 || local847 != 0) {
										local746[local754].method5564(local840, local833, local847);
									}
								}
							}
						}
						@Pc(1227) Class239 local1227 = new Class239(local746, local746.length);
						@Pc(1231) int local1231 = local33 | 0x2000;
						local595 = arg14.method4930(local1227, local1231, Static140.anInt2648, 64, 850);
						for (local833 = 0; local833 < 5; local833++) {
							if (Static38.aShortArrayArray2[local833].length > this.anIntArray99[local833]) {
								local595.method5484(Static100.aShortArray40[local833], Static38.aShortArrayArray2[local833][this.anIntArray99[local833]]);
							}
							if (this.anIntArray99[local833] < Static183.aShortArrayArray3[local833].length) {
								local595.method5484(Static191.aShortArray61[local833], Static183.aShortArrayArray3[local833][this.anIntArray99[local833]]);
							}
						}
						local595.method5479(local33);
						@Pc(1302) Class139 local1302 = Static78.aClass139_13;
						synchronized (Static78.aClass139_13) {
							Static78.aClass139_13.method3070(local595, local36);
						}
						this.aLong25 = local36;
					}
					break;
				}
				local655 = local39[local649];
				if ((local655 & 0x40000000) == 0) {
					if ((local655 & Integer.MIN_VALUE) != 0 && !arg7.method5083(local655 & 0x3FFFFFFF).method3191()) {
						local647 = true;
					}
				} else if (!arg9.method1641(local655 & 0x3FFFFFFF).method1019(this.aBoolean63)) {
					local647 = true;
				}
				local649++;
			}
		}
		@Pc(1324) Class75 local1324 = local595.method5473((byte) 4, local33, true);
		if (!local148) {
			return local1324;
		}
		@Pc(1330) int local1330 = 0;
		local649 = 1;
		while (local155 > local1330) {
			if (Static286.aClass3_Sub7_Sub15Array6[local1330] != null) {
				local1324.method5468(local649, this.anIntArrayArray8 == null ? null : this.anIntArrayArray8[local1330], Static300.anIntArray574[local1330], Static48.aClass3_Sub7_Sub15Array2[local1330], false, Static286.aClass3_Sub7_Sub15Array6[local1330], Static238.anIntArray478[local1330] - 1, Static117.anIntArray220[local1330], Static103.anIntArray203[local1330]);
			}
			local649 <<= 0x1;
			local1330++;
		}
		if (local346 != null && local356 != null) {
			local1324.method5450(local354, local352, local189, local346, arg13 - 1, false, arg11.aBooleanArray107, local340, local356, local358, arg0 - 1, local350, local194, local348);
		} else if (local346 != null) {
			local1324.method5489(local340, local346, local194, 0, arg0 - 1, false, local189, local348);
		} else if (local356 != null) {
			local1324.method5489(local350, local356, local354, 0, arg13 - 1, false, local352, local358);
		}
		for (local655 = 0; local655 < local155; local655++) {
			Static286.aClass3_Sub7_Sub15Array6[local655] = null;
			Static48.aClass3_Sub7_Sub15Array2[local655] = null;
			Static193.aClass177Array1[local655] = null;
		}
		return local1324;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZB)V")
	public void method999(@OriginalArg(0) boolean arg0) {
		this.aBoolean63 = arg0;
		this.method995();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!cn;ILclient!np;Lclient!ti;ILclient!ok;IIII)Lclient!f;")
	public Class75 method1000(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(4) Class155 arg2, @OriginalArg(5) Class223 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class177 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local30 = arg5.anIntArray499[arg7];
			local36 = local30 >>> 16;
			@Pc(40) int local40 = local30 & 0xFFFF;
			@Pc(45) Class3_Sub7_Sub15 local45 = arg1.method931(local36);
			if (local45 != null) {
				local13 = local45.method5583(local40) | false;
				local11 = local45.method5582(local40) | false;
				local15 = arg5.aBoolean352 | false;
			}
			if ((arg5.aBoolean351 || Static120.aBoolean173) && arg0 != -1 && arg5.anIntArray499.length > arg0) {
				@Pc(85) int local85 = arg5.anIntArray499[arg0];
				@Pc(89) int local89 = local85 >>> 16;
				@Pc(93) int local93 = local85 & 0xFFFF;
				@Pc(102) Class3_Sub7_Sub15 local102;
				if (local36 == local89) {
					local102 = local45;
				} else {
					local102 = arg1.method931(local93 >>> 16);
				}
				if (local102 != null) {
					local13 |= local102.method5583(local93);
					local11 |= local102.method5582(local93);
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
		@Pc(159) long local159 = (long) arg4 | (long) (arg9 << 16) | (long) arg6 << 32;
		@Pc(161) Class139 local161 = Static136.aClass139_31;
		@Pc(169) Class75 local169;
		synchronized (Static136.aClass139_31) {
			local169 = (Class75) Static136.aClass139_31.method3076(local159);
		}
		if (local169 == null || arg2.method4919(local169.method5462(), local7) != 0) {
			if (local169 != null) {
				local7 = arg2.method4920(local7, local169.method5462());
			}
			@Pc(205) Class239[] local205 = new Class239[3];
			@Pc(207) int local207 = 0;
			if (!arg3.method5083(arg4).method3187() || !arg3.method5083(arg9).method3187() || !arg3.method5083(arg6).method3187()) {
				return null;
			}
			@Pc(235) Class239 local235 = arg3.method5083(arg4).method3194();
			if (local235 != null) {
				local207++;
				local205[0] = local235;
			}
			local235 = arg3.method5083(arg9).method3194();
			if (local235 != null) {
				local205[local207++] = local235;
			}
			local235 = arg3.method5083(arg6).method3194();
			if (local235 != null) {
				local205[local207++] = local235;
			}
			local30 = local7 | 0x2000;
			local235 = new Class239(local205, local207);
			local169 = arg2.method4930(local235, local30, Static140.anInt2648, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray99[local36] < Static38.aShortArrayArray2[local36].length) {
					local169.method5484(Static100.aShortArray40[local36], Static38.aShortArrayArray2[local36][this.anIntArray99[local36]]);
				}
				if (Static183.aShortArrayArray3[local36].length > this.anIntArray99[local36]) {
					local169.method5484(Static191.aShortArray61[local36], Static183.aShortArrayArray3[local36][this.anIntArray99[local36]]);
				}
			}
			local169.method5479(local7);
			@Pc(349) Class139 local349 = Static136.aClass139_31;
			synchronized (Static136.aClass139_31) {
				Static136.aClass139_31.method3070(local169, local159);
			}
		}
		if (arg5 == null) {
			return local169;
		} else {
			local169 = local169.method5473((byte) 4, local7, true);
			return arg5.method4076(arg0, local169, arg8, 1024, arg7);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!fl;Lclient!cn;IILclient!ti;Lclient!fd;ILclient!ok;IILclient!qt;Lclient!np;)Lclient!f;")
	public Class75 method1002(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(5) Class78 arg4, @OriginalArg(7) Class177 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Interface9 arg8, @OriginalArg(11) Class155 arg9) {
		if (this.anInt1124 != -1) {
			return arg0.method1716(this.anInt1124).method1210(arg1, arg8, arg6, arg7, arg5, arg9, arg2);
		}
		@Pc(28) int local28 = 1024;
		@Pc(36) boolean local36;
		@Pc(47) int local47;
		@Pc(105) int local105;
		@Pc(57) int local57;
		@Pc(109) int local109;
		if (arg5 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			local47 = arg5.anIntArray499[arg7];
			local28 = 1056;
			local57 = local47 >>> 16;
			@Pc(62) Class3_Sub7_Sub15 local62 = arg1.method931(local57);
			@Pc(66) int local66 = local47 & 0xFFFF;
			if (local62 != null) {
				local34 = local62.method5583(local66) | false;
				local32 = local62.method5582(local66) | false;
				local36 = arg5.aBoolean352 | false;
			}
			if ((arg5.aBoolean351 || Static120.aBoolean173) && arg2 != -1 && arg2 < arg5.anIntArray499.length) {
				local105 = arg5.anIntArray499[arg2];
				local109 = local105 >>> 16;
				@Pc(123) Class3_Sub7_Sub15 local123 = local109 == local57 ? local62 : arg1.method931(local109);
				@Pc(127) int local127 = local105 & 0xFFFF;
				if (local123 != null) {
					local34 |= local123.method5583(local127);
					local32 |= local123.method5582(local127);
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
		@Pc(163) Class139 local163 = Static136.aClass139_31;
		@Pc(178) Class75 local178;
		synchronized (Static136.aClass139_31) {
			local178 = (Class75) Static136.aClass139_31.method3076(this.aLong24);
		}
		if (local178 == null || arg9.method4919(local178.method5462(), local28) != 0) {
			if (local178 != null) {
				local28 = arg9.method4920(local28, local178.method5462());
			}
			local36 = false;
			for (local47 = 0; local47 < 12; local47++) {
				local105 = this.anIntArray100[local47];
				if ((local105 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local105) != 0 && !arg3.method5083(local105 & 0x3FFFFFFF).method3187()) {
						local36 = true;
					}
				} else if (!arg4.method1641(local105 & 0x3FFFFFFF).method1021(this.aBoolean63)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(261) Class239[] local261 = new Class239[12];
			@Pc(263) int local263 = 0;
			for (@Pc(265) int local265 = 0; local265 < 12; local265++) {
				local57 = this.anIntArray100[local265];
				@Pc(294) Class239 local294;
				if ((local57 & 0x40000000) != 0) {
					local294 = arg4.method1641(local57 & 0x3FFFFFFF).method1011(this.aBoolean63);
					if (local294 != null) {
						local261[local263++] = local294;
					}
				} else if ((Integer.MIN_VALUE & local57) != 0) {
					local294 = arg3.method5083(local57 & 0x3FFFFFFF).method3194();
					if (local294 != null) {
						local261[local263++] = local294;
					}
				}
			}
			@Pc(333) Class239 local333 = new Class239(local261, local263);
			@Pc(337) int local337 = local28 | 0x2000;
			local178 = arg9.method4930(local333, local337, Static140.anInt2648, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (Static38.aShortArrayArray2[local109].length > this.anIntArray99[local109]) {
					local178.method5484(Static100.aShortArray40[local109], Static38.aShortArrayArray2[local109][this.anIntArray99[local109]]);
				}
				if (Static183.aShortArrayArray3[local109].length > this.anIntArray99[local109]) {
					local178.method5484(Static191.aShortArray61[local109], Static183.aShortArrayArray3[local109][this.anIntArray99[local109]]);
				}
			}
			local178.method5479(local28);
			@Pc(412) Class139 local412 = Static136.aClass139_31;
			synchronized (Static136.aClass139_31) {
				Static136.aClass139_31.method3070(local178, this.aLong24);
			}
		}
		if (arg5 == null) {
			return local178;
		} else {
			local178.method5473((byte) 4, local28, true);
			return arg5.method4076(arg2, local178, arg6, 1024, arg7);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ti;II)V")
	public void method1003(@OriginalArg(1) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static56.anIntArray101[arg2];
		if (this.anIntArray100[local13] != 0 && arg0.method5083(arg1) != null) {
			this.anIntArray100[local13] = Integer.MIN_VALUE | arg1;
			this.method995();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)V")
	public void method1006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray99[arg0] = arg1;
		this.method995();
	}
}
