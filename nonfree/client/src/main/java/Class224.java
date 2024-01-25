import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class224 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
	public int[] anIntArray1158;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
	private int[] anIntArray1159;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
	private int anInt5671;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	public int anInt5666 = -1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!qr;Lclient!qp;I[Lclient!aq;ILclient!vc;Lclient!gd;IIIILclient!vk;ZLclient!pt;ILclient!qp;Lclient!kp;Lclient!dj;B)Lclient!n;")
	public Class66 method4881(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class63 arg5, @OriginalArg(6) Class81 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class236 arg11, @OriginalArg(13) Class196 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class202 arg14, @OriginalArg(16) Class139 arg15, @OriginalArg(17) Class48 arg16) {
		if (this.anInt5666 != -1) {
			return arg16.method951(this.anInt5666).method3083(arg0, arg9, arg15, arg3, arg4, arg14, arg5, arg8, arg2, arg13, arg11, arg1, arg10, arg7);
		}
		@Pc(33) int local33 = arg9;
		@Pc(36) long local36 = this.aLong186;
		@Pc(39) int[] local39 = this.anIntArray1159;
		if (arg1 != null && (arg1.anInt4935 >= 0 || arg1.anInt4944 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray1159[local52];
			}
			if (arg1.anInt4935 >= 0) {
				if (arg1.anInt4935 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg1.anInt4935 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg1.anInt4944 >= 0) {
				if (arg1.anInt4944 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg1.anInt4944 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg1 != null || arg14 != null;
		@Pc(155) int local155 = arg3 == null ? 0 : arg3.length;
		@Pc(194) int local194;
		@Pc(199) int local199;
		for (@Pc(162) int local162 = 0; local162 < local155; local162++) {
			Static121.aClass2_Sub10_Sub12Array4[local162] = null;
			if (arg3[local162] != null) {
				@Pc(180) Class202 local180 = arg11.method5396(arg3[local162].anInt319);
				if (local180.anIntArray974 != null) {
					Static267.aClass202Array2[local162] = local180;
					local148 = true;
					local194 = arg3[local162].anInt318;
					local199 = arg3[local162].anInt320;
					@Pc(204) int local204 = local180.anIntArray974[local194];
					Static121.aClass2_Sub10_Sub12Array4[local162] = arg11.method5395(local204 >>> 16);
					@Pc(217) int local217 = local204 & 0xFFFF;
					Static180.anIntArray1332[local162] = local217;
					if (Static121.aClass2_Sub10_Sub12Array4[local162] != null) {
						local140 |= Static121.aClass2_Sub10_Sub12Array4[local162].method3682(local217);
						local138 |= Static121.aClass2_Sub10_Sub12Array4[local162].method3683(local217);
					}
					if ((local180.aBoolean376 || Static298.aBoolean384) && local199 != -1 && local180.anIntArray974.length > local199) {
						Static262.anIntArray889[local162] = local180.anIntArray973[local194];
						Static289.anIntArray990[local162] = arg3[local162].anInt321;
						@Pc(276) int local276 = local180.anIntArray974[local199];
						Static233.aClass2_Sub10_Sub12Array5[local162] = arg11.method5395(local276 >>> 16);
						@Pc(289) int local289 = local276 & 0xFFFF;
						Static289.anIntArray991[local162] = local289;
						if (Static233.aClass2_Sub10_Sub12Array5[local162] != null) {
							local140 |= Static233.aClass2_Sub10_Sub12Array5[local162].method3682(local289);
							local138 |= Static233.aClass2_Sub10_Sub12Array5[local162].method3683(local289);
						}
					} else {
						Static262.anIntArray889[local162] = 0;
						Static289.anIntArray990[local162] = 0;
						Static233.aClass2_Sub10_Sub12Array5[local162] = null;
						Static289.anIntArray991[local162] = -1;
					}
				}
			}
		}
		@Pc(339) int local339 = -1;
		local194 = -1;
		local199 = 0;
		@Pc(345) Class2_Sub10_Sub12 local345 = null;
		@Pc(347) Class2_Sub10_Sub12 local347 = null;
		@Pc(349) int local349 = -1;
		@Pc(351) int local351 = -1;
		@Pc(353) int local353 = 0;
		@Pc(355) Class2_Sub10_Sub12 local355 = null;
		@Pc(357) Class2_Sub10_Sub12 local357 = null;
		if (local148) {
			@Pc(370) int local370;
			@Pc(426) int local426;
			if (arg1 != null) {
				local339 = arg1.anIntArray974[arg10];
				local370 = local339 >>> 16;
				local345 = arg11.method5395(local370);
				local339 &= 0xFFFF;
				if (local345 != null) {
					local140 |= local345.method3682(local339);
					local138 |= local345.method3683(local339);
				}
				if ((arg1.aBoolean376 || Static298.aBoolean384) && arg13 != -1 && arg1.anIntArray974.length > arg13) {
					local199 = arg1.anIntArray973[arg10];
					local194 = arg1.anIntArray974[arg13];
					local426 = local194 >>> 16;
					local194 &= 0xFFFF;
					local347 = local370 == local426 ? local345 : arg11.method5395(local426);
					if (local347 != null) {
						local140 |= local347.method3682(local194);
						local138 |= local347.method3683(local194);
					}
				}
			}
			local33 = arg9 | 0x20;
			if (arg14 != null) {
				local349 = arg14.anIntArray974[arg7];
				local370 = local349 >>> 16;
				local349 &= 0xFFFF;
				local355 = arg11.method5395(local370);
				if (local355 != null) {
					local140 |= local355.method3682(local349);
					local138 |= local355.method3683(local349);
				}
				if ((arg14.aBoolean376 || Static298.aBoolean384) && arg8 != -1 && arg8 < arg14.anIntArray974.length) {
					local351 = arg14.anIntArray974[arg8];
					local353 = arg14.anIntArray973[arg7];
					local426 = local351 >>> 16;
					local357 = local370 == local426 ? local355 : arg11.method5395(local426);
					local351 &= 0xFFFF;
					if (local357 != null) {
						local140 |= local357.method3682(local351);
						local138 |= local357.method3683(local351);
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
		@Pc(572) Class160 local572 = Static208.aClass160_33;
		@Pc(580) Class66 local580;
		synchronized (Static208.aClass160_33) {
			local580 = (Class66) Static208.aClass160_33.method3599(local36);
		}
		@Pc(588) Class103 local588 = null;
		if (this.anInt5671 != -1) {
			local588 = arg15.method3157(this.anInt5671);
		}
		@Pc(628) int local628;
		@Pc(634) int local634;
		if (local580 == null || arg5.method2051(local580.method5127(), local33) != 0 || local588 != null && local588.anIntArrayArray24 != null && this.anIntArrayArray48 == null) {
			if (local580 != null) {
				local33 = arg5.method2031(local33, local580.method5127());
			}
			@Pc(626) boolean local626 = false;
			local628 = 0;
			while (true) {
				if (local628 >= 12) {
					if (local626) {
						if (this.aLong187 != -1L) {
							@Pc(1250) Class160 local1250 = Static208.aClass160_33;
							synchronized (Static208.aClass160_33) {
								local580 = (Class66) Static208.aClass160_33.method3599(this.aLong187);
							}
						}
						if (local580 == null || arg5.method2051(local580.method5127(), local33) != 0 || local588 != null && local588.anIntArrayArray24 != null && this.anIntArrayArray48 == null) {
							return null;
						}
					} else {
						@Pc(679) Class200[] local679 = new Class200[12];
						@Pc(687) int local687;
						for (@Pc(681) int local681 = 0; local681 < 12; local681++) {
							local687 = local39[local681];
							@Pc(707) Class200 local707;
							if ((local687 & 0x40000000) != 0) {
								local707 = arg6.method2175(local687 & 0x3FFFFFFF).method3948(this.aBoolean416);
								if (local707 != null) {
									local679[local681] = local707;
								}
							} else if ((Integer.MIN_VALUE & local687) != 0) {
								local707 = arg12.method4167(local687 & 0x3FFFFFFF).method4652();
								if (local707 != null) {
									local679[local681] = local707;
								}
							}
						}
						@Pc(763) int local763;
						if (local588 != null && local588.anIntArrayArray24 != null) {
							for (local687 = 0; local687 < local588.anIntArrayArray24.length; local687++) {
								if (local588.anIntArrayArray24[local687] != null && local679[local687] != null) {
									local763 = local588.anIntArrayArray24[local687][0];
									@Pc(770) int local770 = local588.anIntArrayArray24[local687][1];
									@Pc(777) int local777 = local588.anIntArrayArray24[local687][2];
									@Pc(786) int local786 = local588.anIntArrayArray24[local687][3] << 3;
									@Pc(795) int local795 = local588.anIntArrayArray24[local687][4] << 3;
									@Pc(804) int local804 = local588.anIntArrayArray24[local687][5] << 3;
									if (this.anIntArrayArray48 == null) {
										this.anIntArrayArray48 = new int[local588.anIntArrayArray24.length][];
									}
									if (this.anIntArrayArray48[local687] == null) {
										@Pc(826) int[] local826 = this.anIntArrayArray48[local687] = new int[15];
										if (local786 == 0 && local795 == 0 && local804 == 0) {
											local826[0] = local826[4] = local826[8] = 32768;
											local826[13] = -local770;
											local826[12] = -local763;
											local826[14] = -local777;
										} else {
											@Pc(868) int local868 = Class177.anIntArray844[local786];
											@Pc(872) int local872 = Class177.anIntArray843[local786];
											@Pc(876) int local876 = Class177.anIntArray844[local795];
											@Pc(880) int local880 = Class177.anIntArray843[local795];
											@Pc(884) int local884 = Class177.anIntArray844[local804];
											@Pc(888) int local888 = Class177.anIntArray843[local804];
											@Pc(896) int local896 = local884 * local872 + 16384 >> 15;
											@Pc(904) int local904 = local888 * local872 + 16384 >> 15;
											local826[8] = local876 * local868 + 16384 >> 15;
											local826[6] = local876 * local904 + local884 * -local880 + 16384 >> 15;
											local826[5] = -local872;
											local826[3] = local888 * local868 + 16384 >> 15;
											local826[0] = local880 * local904 + local876 * local884 + 16384 >> 15;
											local826[2] = local880 * local868 + 16384 >> 15;
											local826[7] = -local888 * -local880 + local896 * local876 + 16384 >> 15;
											local826[4] = local868 * local884 + 16384 >> 15;
											local826[1] = local880 * local896 + local876 * -local888 + 16384 >> 15;
											local826[12] = -local770 * local826[3] + -local763 * local826[0] + -local777 * local826[6] + 16384 >> 15;
											local826[13] = local826[4] * -local770 + -local763 * local826[1] + -local777 * local826[7] + 16384 >> 15;
											local826[14] = local826[5] * -local770 + -local763 * local826[2] + local826[8] * -local777 + 16384 >> 15;
										}
										local826[11] = local777;
										local826[10] = local770;
										local826[9] = local763;
									}
									if (local786 != 0 || local795 != 0 || local804 != 0) {
										local679[local687].method4265(local804, local795, local786);
									}
									if (local763 != 0 || local770 != 0 || local777 != 0) {
										local679[local687].method4264(local770, local777, local763);
									}
								}
							}
						}
						@Pc(1148) Class200 local1148 = new Class200(local679, local679.length);
						@Pc(1152) int local1152 = local33 | 0x2000;
						local580 = arg5.method1998(local1148, local1152, Static67.anInt1291, 64, 850);
						for (local763 = 0; local763 < 5; local763++) {
							if (this.anIntArray1158[local763] < Static158.aShortArrayArray3[local763].length) {
								local580.method5147(Static216.aShortArray69[local763], Static158.aShortArrayArray3[local763][this.anIntArray1158[local763]]);
							}
							if (Static283.aShortArrayArray7[local763].length > this.anIntArray1158[local763]) {
								local580.method5147(Static325.aShortArray104[local763], Static283.aShortArrayArray7[local763][this.anIntArray1158[local763]]);
							}
						}
						local580.method5118(local33);
						@Pc(1223) Class160 local1223 = Static208.aClass160_33;
						synchronized (Static208.aClass160_33) {
							Static208.aClass160_33.method3602(local36, local580);
						}
						this.aLong187 = local36;
					}
					break;
				}
				local634 = local39[local628];
				if ((local634 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local634) != 0 && !arg12.method4167(local634 & 0x3FFFFFFF).method4648()) {
						local626 = true;
					}
				} else if (!arg6.method2175(local634 & 0x3FFFFFFF).method3942(this.aBoolean416)) {
					local626 = true;
				}
				local628++;
			}
		}
		@Pc(1289) Class66 local1289 = local580.method5119((byte) 4, local33, true);
		if (!local148) {
			return local1289;
		}
		@Pc(1295) int local1295 = 0;
		local628 = 1;
		while (local155 > local1295) {
			if (Static121.aClass2_Sub10_Sub12Array4[local1295] != null) {
				local1289.method5120(Static121.aClass2_Sub10_Sub12Array4[local1295], Static262.anIntArray889[local1295], Static289.anIntArray991[local1295], Static180.anIntArray1332[local1295], Static289.anIntArray990[local1295] - 1, local628, false, this.anIntArrayArray48 == null ? null : this.anIntArrayArray48[local1295], Static233.aClass2_Sub10_Sub12Array5[local1295]);
			}
			local1295++;
			local628 <<= 0x1;
		}
		if (local345 != null && local355 != null) {
			local1289.method5133(local194, local199, local345, local347, local353, false, arg2 - 1, arg4 + -1, local339, local357, local349, local355, arg1.aBooleanArray26, local351);
		} else if (local345 != null) {
			local1289.method5143(local194, false, local339, local347, local199, local345, 0, arg4 - 1);
		} else if (local355 != null) {
			local1289.method5143(local351, false, local349, local357, local353, local355, 0, arg2 - 1);
		}
		for (local634 = 0; local634 < local155; local634++) {
			Static121.aClass2_Sub10_Sub12Array4[local634] = null;
			Static233.aClass2_Sub10_Sub12Array5[local634] = null;
			Static267.aClass202Array2[local634] = null;
		}
		return local1289;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	private void method4883() {
		@Pc(7) long[] local7 = Class209.aLongArray7;
		this.aLong186 = -1L;
		this.aLong186 = local7[(int) (((long) (this.anInt5671 >> 8) ^ this.aLong186) & 0xFFL)] ^ this.aLong186 >>> 8;
		this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) this.anInt5671 ^ this.aLong186) & 0xFFL)];
		for (@Pc(68) int local68 = 0; local68 < 12; local68++) {
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) ((this.aLong186 ^ (long) (this.anIntArray1159[local68] >> 24)) & 0xFFL)];
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) ((this.aLong186 ^ (long) (this.anIntArray1159[local68] >> 16)) & 0xFFL)];
			this.aLong186 = this.aLong186 >>> 8 ^ local7[(int) (((long) (this.anIntArray1159[local68] >> 8) ^ this.aLong186) & 0xFFL)];
			this.aLong186 = local7[(int) ((this.aLong186 ^ (long) this.anIntArray1159[local68]) & 0xFFL)] ^ this.aLong186 >>> 8;
		}
		for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
			this.aLong186 = local7[(int) ((this.aLong186 ^ (long) this.anIntArray1158[local164]) & 0xFFL)] ^ this.aLong186 >>> 8;
		}
		this.aLong186 = local7[(int) ((this.aLong186 ^ (long) (this.aBoolean416 ? 1 : 0)) & 0xFFL)] ^ this.aLong186 >>> 8;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
	public void method4884(@OriginalArg(1) boolean arg0) {
		this.aBoolean416 = arg0;
		this.method4883();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray1158[arg0] = arg1;
		this.method4883();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!qr;Lclient!vk;BIILclient!pt;Lclient!qp;Lclient!dj;Lclient!gd;Lclient!vc;I)Lclient!n;")
	public Class66 method4887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class196 arg4, @OriginalArg(7) Class202 arg5, @OriginalArg(8) Class48 arg6, @OriginalArg(9) Class81 arg7, @OriginalArg(10) Class63 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt5666 != -1) {
			return arg6.method951(this.anInt5666).method3088(arg8, arg1, arg2, arg3, arg5, arg9, arg0);
		}
		@Pc(30) int local30 = 1024;
		@Pc(38) boolean local38;
		@Pc(55) int local55;
		@Pc(111) int local111;
		@Pc(59) int local59;
		@Pc(115) int local115;
		if (arg5 != null) {
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			local38 = false;
			local30 = 1056;
			local55 = arg5.anIntArray974[arg9];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class2_Sub10_Sub12 local68 = arg2.method5395(local59);
			if (local68 != null) {
				local36 = local68.method3682(local63) | false;
				local34 = local68.method3683(local63) | false;
				local38 = arg5.aBoolean373 | false;
			}
			if ((arg5.aBoolean376 || Static298.aBoolean384) && arg0 != -1 && arg0 < arg5.anIntArray974.length) {
				local111 = arg5.anIntArray974[arg0];
				local115 = local111 >>> 16;
				@Pc(119) int local119 = local111 & 0xFFFF;
				@Pc(129) Class2_Sub10_Sub12 local129 = local59 == local115 ? local68 : arg2.method5395(local115);
				if (local129 != null) {
					local36 |= local129.method3682(local119);
					local34 |= local129.method3683(local119);
				}
			}
			if (local36) {
				local30 = 1184;
			}
			if (local34) {
				local30 |= 0x100;
			}
			if (local38) {
				local30 |= 0x200;
			}
		}
		@Pc(170) Class160 local170 = Static238.aClass160_36;
		@Pc(181) Class66 local181;
		synchronized (Static238.aClass160_36) {
			local181 = (Class66) Static238.aClass160_36.method3599(this.aLong186);
		}
		if (local181 == null || arg8.method2051(local181.method5127(), local30) != 0) {
			if (local181 != null) {
				local30 = arg8.method2031(local30, local181.method5127());
			}
			local38 = false;
			for (local55 = 0; local55 < 12; local55++) {
				local111 = this.anIntArray1159[local55];
				if ((local111 & 0x40000000) == 0) {
					if ((local111 & Integer.MIN_VALUE) != 0 && !arg4.method4167(local111 & 0x3FFFFFFF).method4651()) {
						local38 = true;
					}
				} else if (!arg7.method2175(local111 & 0x3FFFFFFF).method3951(this.aBoolean416)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(272) Class200[] local272 = new Class200[12];
			@Pc(274) int local274 = 0;
			for (@Pc(276) int local276 = 0; local276 < 12; local276++) {
				local59 = this.anIntArray1159[local276];
				@Pc(303) Class200 local303;
				if ((local59 & 0x40000000) != 0) {
					local303 = arg7.method2175(local59 & 0x3FFFFFFF).method3937(this.aBoolean416);
					if (local303 != null) {
						local272[local274++] = local303;
					}
				} else if ((Integer.MIN_VALUE & local59) != 0) {
					local303 = arg4.method4167(local59 & 0x3FFFFFFF).method4649();
					if (local303 != null) {
						local272[local274++] = local303;
					}
				}
			}
			@Pc(340) int local340 = local30 | 0x2000;
			@Pc(346) Class200 local346 = new Class200(local272, local274);
			local181 = arg8.method1998(local346, local340, Static67.anInt1291, 64, 768);
			for (local115 = 0; local115 < 5; local115++) {
				if (Static158.aShortArrayArray3[local115].length > this.anIntArray1158[local115]) {
					local181.method5147(Static216.aShortArray69[local115], Static158.aShortArrayArray3[local115][this.anIntArray1158[local115]]);
				}
				if (Static283.aShortArrayArray7[local115].length > this.anIntArray1158[local115]) {
					local181.method5147(Static325.aShortArray104[local115], Static283.aShortArrayArray7[local115][this.anIntArray1158[local115]]);
				}
			}
			local181.method5118(local30);
			@Pc(415) Class160 local415 = Static238.aClass160_36;
			synchronized (Static238.aClass160_36) {
				Static238.aClass160_36.method3602(this.aLong186, local181);
			}
		}
		if (arg5 == null) {
			return local181;
		} else {
			local181.method5119((byte) 4, local30, true);
			return arg5.method4329(arg0, arg3, local181, 1024, arg9);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!pt;I)V")
	public void method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		@Pc(7) int local7 = Static335.anIntArray1168[arg0];
		if (this.anIntArray1159[local7] != 0 && arg2.method4167(arg1) != null) {
			this.anIntArray1159[local7] = Integer.MIN_VALUE | arg1;
			this.method4883();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!vc;Lclient!pt;IILclient!qp;ILclient!vk;IIII)Lclient!n;")
	public Class66 method4890(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class202 arg4, @OriginalArg(7) Class236 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg4 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg4.anIntArray974[arg9];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) int local40 = local26 & 0xFFFF;
			@Pc(45) Class2_Sub10_Sub12 local45 = arg5.method5395(local36);
			if (local45 != null) {
				local13 = local45.method3682(local40) | false;
				local11 = local45.method3683(local40) | false;
				local15 = arg4.aBoolean373 | false;
			}
			if ((arg4.aBoolean376 || Static298.aBoolean384) && arg7 != -1 && arg4.anIntArray974.length > arg7) {
				@Pc(85) int local85 = arg4.anIntArray974[arg7];
				@Pc(89) int local89 = local85 >>> 16;
				@Pc(93) int local93 = local85 & 0xFFFF;
				@Pc(102) Class2_Sub10_Sub12 local102;
				if (local89 == local36) {
					local102 = local45;
				} else {
					local102 = arg5.method5395(local93 >>> 16);
				}
				if (local102 != null) {
					local13 |= local102.method3682(local93);
					local11 |= local102.method3683(local93);
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
		@Pc(157) long local157 = (long) arg0 | (long) (arg3 << 16) | (long) arg8 << 32;
		@Pc(159) Class160 local159 = Static238.aClass160_36;
		@Pc(167) Class66 local167;
		synchronized (Static238.aClass160_36) {
			local167 = (Class66) Static238.aClass160_36.method3599(local157);
		}
		if (local167 == null || arg1.method2051(local167.method5127(), local7) != 0) {
			if (local167 != null) {
				local7 = arg1.method2031(local7, local167.method5127());
			}
			@Pc(194) Class200[] local194 = new Class200[3];
			@Pc(196) int local196 = 0;
			if (!arg2.method4167(arg0).method4651() || !arg2.method4167(arg3).method4651() || !arg2.method4167(arg8).method4651()) {
				return null;
			}
			@Pc(224) Class200 local224 = arg2.method4167(arg0).method4649();
			if (local224 != null) {
				local196++;
				local194[0] = local224;
			}
			local224 = arg2.method4167(arg3).method4649();
			if (local224 != null) {
				local194[local196++] = local224;
			}
			local224 = arg2.method4167(arg8).method4649();
			if (local224 != null) {
				local194[local196++] = local224;
			}
			local26 = local7 | 0x2000;
			local224 = new Class200(local194, local196);
			local167 = arg1.method1998(local224, local26, Static67.anInt1291, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static158.aShortArrayArray3[local36].length > this.anIntArray1158[local36]) {
					local167.method5147(Static216.aShortArray69[local36], Static158.aShortArrayArray3[local36][this.anIntArray1158[local36]]);
				}
				if (this.anIntArray1158[local36] < Static283.aShortArrayArray7[local36].length) {
					local167.method5147(Static325.aShortArray104[local36], Static283.aShortArrayArray7[local36][this.anIntArray1158[local36]]);
				}
			}
			local167.method5118(local7);
			@Pc(336) Class160 local336 = Static238.aClass160_36;
			synchronized (Static238.aClass160_36) {
				Static238.aClass160_36.method3602(local157, local167);
			}
		}
		if (arg4 == null) {
			return local167;
		} else {
			local167 = local167.method5119((byte) 4, local7, true);
			return arg4.method4329(arg7, arg6, local167, 1024, arg9);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([III[IZI)V")
	public void method4891(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5666 = arg1;
		this.anIntArray1158 = arg3;
		this.anIntArray1159 = arg0;
		this.aBoolean416 = arg4;
		if (arg2 != this.anInt5671) {
			this.anIntArrayArray48 = null;
			this.anInt5671 = arg2;
		}
		this.method4883();
	}
}
