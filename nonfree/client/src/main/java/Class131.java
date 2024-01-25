import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class131 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Z")
	public boolean aBoolean285;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	private int anInt4340;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
	public int anInt4335 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!hca;IBI)V")
	public void method3491(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == -1) {
			this.anIntArray195[arg2] = 0;
		} else if (arg0.method3327(arg1) != null) {
			this.anIntArray195[arg2] = arg1 | 0x40000000;
			this.method3500();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!we;ILclient!qg;IILclient!hfa;II[ILclient!r;Lclient!cr;Lclient!qg;Lclient!td;IB[Lclient!ql;ZLclient!hca;Lclient!jb;)Lclient!da;")
	public Class52 method3492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class356 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class270 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Interface7 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) Class31 arg11, @OriginalArg(12) Class60 arg12, @OriginalArg(13) Class270 arg13, @OriginalArg(14) Class313 arg14, @OriginalArg(15) int arg15, @OriginalArg(17) Class271[] arg16, @OriginalArg(19) Class121 arg17, @OriginalArg(20) Class155 arg18) {
		if (this.anInt4335 != -1) {
			return arg12.method1797(this.anInt4335).method5002(arg0, arg13, arg4, arg10, arg5, arg14, arg1, arg6, arg9, arg3, arg8, arg16, arg15, arg7, arg11, arg18);
		}
		@Pc(36) int local36 = arg8;
		@Pc(39) long local39 = this.aLong100;
		@Pc(42) int[] local42 = this.anIntArray195;
		if (arg13 != null && (arg13.anInt7689 >= 0 || arg13.anInt7688 >= 0)) {
			local42 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local42[local58] = this.anIntArray195[local58];
			}
			if (arg13.anInt7689 >= 0) {
				if (arg13.anInt7689 == 65535) {
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg13.anInt7689 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg13.anInt7688 >= 0) {
				if (arg13.anInt7688 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg13.anInt7688 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(156) boolean local156 = arg13 != null || arg4 != null;
		@Pc(163) int local163 = arg16 == null ? 0 : arg16.length;
		@Pc(208) int local208;
		@Pc(213) int local213;
		for (@Pc(165) int local165 = 0; local165 < local163; local165++) {
			Static451.aClass3_Sub7_Sub15Array8[local165] = null;
			if (arg16[local165] != null) {
				@Pc(194) Class270 local194 = arg18.method3820(arg16[local165].anInt7811);
				if (local194.anIntArray443 != null) {
					Static374.aClass270Array2[local165] = local194;
					local156 = true;
					local208 = arg16[local165].anInt7809;
					local213 = arg16[local165].anInt7815;
					@Pc(218) int local218 = local194.anIntArray443[local208];
					Static451.aClass3_Sub7_Sub15Array8[local165] = arg18.method3818(local218 >>> 16);
					@Pc(231) int local231 = local218 & 0xFFFF;
					Static224.anIntArray215[local165] = local231;
					if (Static451.aClass3_Sub7_Sub15Array8[local165] != null) {
						local146 |= Static451.aClass3_Sub7_Sub15Array8[local165].method5745(local231);
						local144 |= Static451.aClass3_Sub7_Sub15Array8[local165].method5743(local231);
						local148 |= Static451.aClass3_Sub7_Sub15Array8[local165].method5741(local231);
					}
					if ((local194.aBoolean534 || Static323.aBoolean412) && local213 != -1 && local194.anIntArray443.length > local213) {
						Static288.anIntArray256[local165] = local194.anIntArray445[local208];
						Static588.anIntArray595[local165] = arg16[local165].anInt7816;
						@Pc(320) int local320 = local194.anIntArray443[local213];
						Static276.aClass3_Sub7_Sub15Array5[local165] = arg18.method3818(local320 >>> 16);
						@Pc(333) int local333 = local320 & 0xFFFF;
						Static539.anIntArray541[local165] = local333;
						if (Static276.aClass3_Sub7_Sub15Array5[local165] != null) {
							local146 |= Static276.aClass3_Sub7_Sub15Array5[local165].method5745(local333);
							local144 |= Static276.aClass3_Sub7_Sub15Array5[local165].method5743(local333);
							local148 |= Static276.aClass3_Sub7_Sub15Array5[local165].method5741(local333);
						}
					} else {
						Static288.anIntArray256[local165] = 0;
						Static588.anIntArray595[local165] = 0;
						Static276.aClass3_Sub7_Sub15Array5[local165] = null;
						Static539.anIntArray541[local165] = -1;
					}
				}
			}
		}
		@Pc(380) int local380 = -1;
		local208 = -1;
		local213 = 0;
		@Pc(386) Class3_Sub7_Sub15 local386 = null;
		@Pc(388) Class3_Sub7_Sub15 local388 = null;
		@Pc(390) int local390 = -1;
		@Pc(392) int local392 = -1;
		@Pc(394) int local394 = 0;
		@Pc(396) Class3_Sub7_Sub15 local396 = null;
		@Pc(398) Class3_Sub7_Sub15 local398 = null;
		if (local156) {
			local36 = arg8 | 0x20;
			@Pc(415) int local415;
			@Pc(478) int local478;
			if (arg13 != null) {
				local380 = arg13.anIntArray443[arg15];
				local415 = local380 >>> 16;
				local380 &= 0xFFFF;
				local386 = arg18.method3818(local415);
				if (local386 != null) {
					local146 |= local386.method5745(local380);
					local144 |= local386.method5743(local380);
					local148 |= local386.method5741(local380);
				}
				if ((arg13.aBoolean534 || Static323.aBoolean412) && arg5 != -1 && arg5 < arg13.anIntArray443.length) {
					local213 = arg13.anIntArray445[arg15];
					local208 = arg13.anIntArray443[arg5];
					local478 = local208 >>> 16;
					local208 &= 0xFFFF;
					local388 = local415 == local478 ? local386 : arg18.method3818(local478);
					if (local388 != null) {
						local146 |= local388.method5745(local208);
						local144 |= local388.method5743(local208);
						local148 |= local388.method5741(local208);
					}
				}
			}
			if (arg4 != null) {
				local390 = arg4.anIntArray443[arg1];
				local415 = local390 >>> 16;
				local396 = arg18.method3818(local415);
				local390 &= 0xFFFF;
				if (local396 != null) {
					local146 |= local396.method5745(local390);
					local144 |= local396.method5743(local390);
					local148 |= local396.method5741(local390);
				}
				if ((arg4.aBoolean534 || Static323.aBoolean412) && arg6 != -1 && arg4.anIntArray443.length > arg6) {
					local394 = arg4.anIntArray445[arg1];
					local392 = arg4.anIntArray443[arg6];
					local478 = local392 >>> 16;
					local398 = local415 == local478 ? local396 : arg18.method3818(local478);
					local392 &= 0xFFFF;
					if (local398 != null) {
						local146 |= local398.method5745(local392);
						local144 |= local398.method5743(local392);
						local148 |= local398.method5741(local392);
					}
				}
			}
			if (local146) {
				local36 |= 0x80;
			}
			if (local144) {
				local36 |= 0x100;
			}
			if (local148) {
				local36 |= 0x400;
			}
		}
		@Pc(657) Class342 local657 = Static254.aClass342_96;
		@Pc(665) Class52 local665;
		synchronized (Static254.aClass342_96) {
			local665 = (Class52) Static254.aClass342_96.method7684(local39);
		}
		@Pc(673) Class122 local673 = null;
		if (this.anInt4340 != -1) {
			local673 = arg14.method6864(this.anInt4340);
		}
		@Pc(708) boolean local708;
		@Pc(710) int local710;
		@Pc(716) int local716;
		@Pc(800) int local800;
		@Pc(806) int local806;
		@Pc(872) int local872;
		if (local665 == null || arg11.method8050(local665.PA(), local36) != 0) {
			if (local665 != null) {
				local36 = arg11.method8039(local36, local665.PA());
			}
			local708 = false;
			for (local710 = 0; local710 < 12; local710++) {
				local716 = local42[local710];
				if ((local716 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local716) != 0 && !arg2.method7917(local716 & 0x3FFFFFFF).method6602()) {
						local708 = true;
					}
				} else if (!arg17.method3327(local716 & 0x3FFFFFFF).method3542(this.aBoolean285)) {
					local708 = true;
				}
			}
			if (local708) {
				if (this.aLong101 != -1L) {
					@Pc(770) Class342 local770 = Static254.aClass342_96;
					synchronized (Static254.aClass342_96) {
						local665 = (Class52) Static254.aClass342_96.method7684(this.aLong101);
					}
				}
				if (local665 == null || arg11.method8050(local665.PA(), local36) != 0) {
					return null;
				}
			} else {
				@Pc(798) Class332[] local798 = new Class332[12];
				for (local800 = 0; local800 < 12; local800++) {
					local806 = local42[local800];
					@Pc(824) Class332 local824;
					if ((local806 & 0x40000000) != 0) {
						local824 = arg17.method3327(local806 & 0x3FFFFFFF).method3541(this.aBoolean285);
						if (local824 != null) {
							local798[local800] = local824;
						}
					} else if ((Integer.MIN_VALUE & local806) != 0) {
						local824 = arg2.method7917(local806 & 0x3FFFFFFF).method6603();
						if (local824 != null) {
							local798[local800] = local824;
						}
					}
				}
				@Pc(874) int local874;
				if (local673 != null && local673.anIntArrayArray35 != null) {
					for (local806 = 0; local806 < local673.anIntArrayArray35.length; local806++) {
						if (local798[local806] != null) {
							local872 = 0;
							local874 = 0;
							@Pc(876) int local876 = 0;
							@Pc(878) int local878 = 0;
							@Pc(880) int local880 = 0;
							@Pc(882) int local882 = 0;
							if (local673.anIntArrayArray35[local806] != null) {
								local882 = local673.anIntArrayArray35[local806][5] << 3;
								local874 = local673.anIntArrayArray35[local806][1];
								local872 = local673.anIntArrayArray35[local806][0];
								local880 = local673.anIntArrayArray35[local806][4] << 3;
								local876 = local673.anIntArrayArray35[local806][2];
								local878 = local673.anIntArrayArray35[local806][3] << 3;
							}
							if (local878 != 0 || local880 != 0 || local882 != 0) {
								local798[local806].method7504(local880, local882, local878);
							}
							if (local872 != 0 || local874 != 0 || local876 != 0) {
								local798[local806].method7493(local874, local872, local876);
							}
						}
					}
				}
				@Pc(989) int local989 = local36 | 0x4000;
				@Pc(996) Class332 local996 = new Class332(local798, local798.length);
				local665 = arg11.method8046(local996, local989, Static73.anInt7677, 64, 850);
				for (local872 = 0; local872 < 5; local872++) {
					for (local874 = 0; local874 < Static276.aShortArrayArrayArray1.length; local874++) {
						if (Static276.aShortArrayArrayArray1[local874][local872].length > this.anIntArray196[local872]) {
							local665.d(Static589.aShortArrayArray13[local874][local872], Static276.aShortArrayArrayArray1[local874][local872][this.anIntArray196[local872]]);
						}
					}
				}
				local665.SA(local36);
				@Pc(1062) Class342 local1062 = Static254.aClass342_96;
				synchronized (Static254.aClass342_96) {
					Static254.aClass342_96.method7683(local665, local39);
				}
				this.aLong101 = local39;
			}
		}
		@Pc(1084) Class52 local1084 = local665.method7618((byte) 4, local36, true);
		local708 = false;
		if (arg10 != null) {
			for (local710 = 0; local710 < 12; local710++) {
				if (arg10[local710] != -1) {
					local708 = true;
				}
			}
		}
		if (!local156 && !local708) {
			return local1084;
		}
		@Pc(1111) Class42[] local1111 = null;
		if (local673 != null) {
			local1111 = local673.method3392(arg11);
		}
		if (local708 && local1111 != null) {
			for (local716 = 0; local716 < 12; local716++) {
				if (local1111[local716] != null) {
					local1084.method7629(local1111[local716], 0x1 << local716, true);
				}
			}
		}
		local716 = 0;
		local800 = 1;
		while (local163 > local716) {
			if (Static451.aClass3_Sub7_Sub15Array8[local716] != null) {
				local1084.method7626(local800, Static588.anIntArray595[local716] - 1, Static539.anIntArray541[local716], Static288.anIntArray256[local716], null, false, Static451.aClass3_Sub7_Sub15Array8[local716], Static224.anIntArray215[local716], Static276.aClass3_Sub7_Sub15Array5[local716]);
			}
			local716++;
			local800 <<= 0x1;
		}
		if (local708) {
			for (local806 = 0; local806 < 12; local806++) {
				if (arg10[local806] != -1) {
					local872 = arg10[local806] - arg0;
					local872 &= 0x3FFF;
					@Pc(1214) Class42 local1214 = arg11.method8031();
					local1214.o(local872);
					local1084.method7629(local1214, 0x1 << local806, false);
				}
			}
		}
		if (local708 && local1111 != null) {
			for (local806 = 0; local806 < 12; local806++) {
				if (local1111[local806] != null) {
					local1084.method7629(local1111[local806], 0x1 << local806, false);
				}
			}
		}
		if (local386 != null && local396 != null) {
			local1084.method7623(local386, local392, arg3 - 1, arg9 + -1, local380, local398, local396, local213, local388, local394, arg13.aBooleanArray25, local390, false, local208);
		} else if (local386 != null) {
			local1084.method7630(false, local208, local388, local213, local380, arg3 - 1, 0, local386);
		} else if (local396 != null) {
			local1084.method7630(false, local392, local398, local394, local390, arg9 - 1, 0, local396);
		}
		for (local806 = 0; local806 < local163; local806++) {
			Static451.aClass3_Sub7_Sub15Array8[local806] = null;
			Static276.aClass3_Sub7_Sub15Array5[local806] = null;
			Static374.aClass270Array2[local806] = null;
		}
		return local1084;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	public void method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray196[arg0] = arg1;
		this.method3500();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!jb;IIILclient!we;Lclient!hfa;Lclient!qg;Lclient!cr;Lclient!hca;Lclient!r;I)Lclient!da;")
	public Class52 method3494(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class356 arg3, @OriginalArg(6) Interface7 arg4, @OriginalArg(7) Class270 arg5, @OriginalArg(8) Class60 arg6, @OriginalArg(9) Class121 arg7, @OriginalArg(10) Class31 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt4335 != -1) {
			return arg6.method1797(this.anInt4335).method5009(arg0, arg9, arg8, arg1, arg2, arg4, arg5);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(114) int local114;
		@Pc(58) int local58;
		@Pc(118) int local118;
		if (arg5 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg5.anIntArray443[arg2];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class3_Sub7_Sub15 local63 = arg0.method3818(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method5745(local67) | false;
				local31 = local63.method5743(local67) | false;
				local37 = local63.method5741(local67) | false;
				local35 = arg5.aBoolean533 | false;
			}
			if ((arg5.aBoolean534 || Static323.aBoolean412) && arg1 != -1 && arg1 < arg5.anIntArray443.length) {
				local114 = arg5.anIntArray443[arg1];
				local118 = local114 >>> 16;
				@Pc(122) int local122 = local114 & 0xFFFF;
				@Pc(136) Class3_Sub7_Sub15 local136 = local58 == local118 ? local63 : arg0.method3818(local118);
				if (local136 != null) {
					local33 |= local136.method5745(local122);
					local31 |= local136.method5743(local122);
					local37 |= local136.method5741(local122);
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
		@Pc(185) Class342 local185 = Static424.aClass342_187;
		@Pc(203) Class52 local203;
		synchronized (Static424.aClass342_187) {
			local203 = (Class52) Static424.aClass342_187.method7684(this.aLong100);
		}
		if (local203 == null || arg8.method8050(local203.PA(), local27) != 0) {
			if (local203 != null) {
				local27 = arg8.method8039(local27, local203.PA());
			}
			local35 = false;
			for (@Pc(231) int local231 = 0; local231 < 12; local231++) {
				local48 = this.anIntArray195[local231];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !arg3.method7917(local48 & 0x3FFFFFFF).method6600()) {
						local35 = true;
					}
				} else if (!arg7.method3327(local48 & 0x3FFFFFFF).method3540(this.aBoolean285)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(289) Class332[] local289 = new Class332[12];
			local114 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray195[local293];
				@Pc(317) Class332 local317;
				if ((local300 & 0x40000000) != 0) {
					local317 = arg7.method3327(local300 & 0x3FFFFFFF).method3551(this.aBoolean285);
					if (local317 != null) {
						local289[local114++] = local317;
					}
				} else if ((Integer.MIN_VALUE & local300) != 0) {
					local317 = arg3.method7917(local300 & 0x3FFFFFFF).method6597();
					if (local317 != null) {
						local289[local114++] = local317;
					}
				}
			}
			@Pc(356) Class332 local356 = new Class332(local289, local114);
			@Pc(360) int local360 = local27 | 0x4000;
			local203 = arg8.method8046(local356, local360, Static73.anInt7677, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local118 = 0; local118 < Static276.aShortArrayArrayArray1.length; local118++) {
					if (this.anIntArray196[local58] < Static276.aShortArrayArrayArray1[local118][local58].length) {
						local203.d(Static589.aShortArrayArray13[local118][local58], Static276.aShortArrayArrayArray1[local118][local58][this.anIntArray196[local58]]);
					}
				}
			}
			local203.SA(local27);
			@Pc(424) Class342 local424 = Static424.aClass342_187;
			synchronized (Static424.aClass342_187) {
				Static424.aClass342_187.method7683(local203, this.aLong100);
			}
		}
		if (arg5 == null) {
			return local203;
		} else {
			local203.method7618((byte) 4, local27, true);
			return arg5.method6005(arg2, local203, arg1, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!qg;IILclient!jb;Lclient!we;IIIIILclient!r;B)Lclient!da;")
	public Class52 method3495(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) Class356 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class31 arg9) {
		@Pc(15) int local15 = 2048;
		@Pc(106) int local106;
		@Pc(46) int local46;
		if (arg0 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			local15 = 2080;
			@Pc(40) int local40 = arg0.anIntArray443[arg2];
			local46 = local40 >>> 16;
			@Pc(50) int local50 = local40 & 0xFFFF;
			@Pc(55) Class3_Sub7_Sub15 local55 = arg3.method3818(local46);
			if (local55 != null) {
				local21 = local55.method5745(local50) | false;
				local19 = local55.method5743(local50) | false;
				local25 = local55.method5741(local50) | false;
				local23 = arg0.aBoolean533 | false;
			}
			if ((arg0.aBoolean534 || Static323.aBoolean412) && arg6 != -1 && arg0.anIntArray443.length > arg6) {
				local106 = arg0.anIntArray443[arg6];
				@Pc(110) int local110 = local106 >>> 16;
				@Pc(114) int local114 = local106 & 0xFFFF;
				@Pc(119) Class3_Sub7_Sub15 local119;
				if (local46 == local110) {
					local119 = local55;
				} else {
					local119 = arg3.method3818(local114 >>> 16);
				}
				if (local119 != null) {
					local21 |= local119.method5745(local114);
					local19 |= local119.method5743(local114);
					local25 |= local119.method5741(local114);
				}
			}
			if (local21) {
				local15 = 2208;
			}
			if (local19) {
				local15 |= 0x100;
			}
			if (local23) {
				local15 |= 0x200;
			}
			if (local25) {
				local15 |= 0x400;
			}
		}
		@Pc(187) long local187 = (long) arg7 << 32 | (long) (arg5 << 16) | (long) arg1;
		@Pc(189) Class342 local189 = Static424.aClass342_187;
		@Pc(197) Class52 local197;
		synchronized (Static424.aClass342_187) {
			local197 = (Class52) Static424.aClass342_187.method7684(local187);
		}
		if (local197 == null || arg9.method8050(local197.PA(), local15) != 0) {
			if (local197 != null) {
				local15 = arg9.method8039(local15, local197.PA());
			}
			@Pc(224) Class332[] local224 = new Class332[3];
			local106 = 0;
			if (!arg4.method7917(arg1).method6600() || !arg4.method7917(arg5).method6600() || !arg4.method7917(arg7).method6600()) {
				return null;
			}
			@Pc(256) Class332 local256 = arg4.method7917(arg1).method6597();
			if (local256 != null) {
				local106++;
				local224[0] = local256;
			}
			local256 = arg4.method7917(arg5).method6597();
			if (local256 != null) {
				local224[local106++] = local256;
			}
			local256 = arg4.method7917(arg7).method6597();
			if (local256 != null) {
				local224[local106++] = local256;
			}
			@Pc(295) int local295 = local15 | 0x4000;
			local256 = new Class332(local224, local106);
			local197 = arg9.method8046(local256, local295, Static73.anInt7677, 64, 768);
			for (@Pc(311) int local311 = 0; local311 < 5; local311++) {
				for (local46 = 0; local46 < Static276.aShortArrayArrayArray1.length; local46++) {
					if (this.anIntArray196[local311] < Static276.aShortArrayArrayArray1[local46][local311].length) {
						local197.d(Static589.aShortArrayArray13[local46][local311], Static276.aShortArrayArrayArray1[local46][local311][this.anIntArray196[local311]]);
					}
				}
			}
			local197.SA(local15);
			@Pc(359) Class342 local359 = Static424.aClass342_187;
			synchronized (Static424.aClass342_187) {
				Static424.aClass342_187.method7683(local197, local187);
			}
		}
		if (arg0 == null) {
			return local197;
		} else {
			local197 = local197.method7618((byte) 4, local15, true);
			return arg0.method6005(arg2, local197, arg6, arg8, 2048);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZ)V")
	public void method3496(@OriginalArg(1) boolean arg0) {
		this.aBoolean285 = arg0;
		this.method3500();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!we;B)V")
	public void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class356 arg2) {
		@Pc(15) int local15 = Static494.anIntArray488[arg0];
		if (arg2.method7917(arg1) != null) {
			this.anIntArray195[local15] = Integer.MIN_VALUE | arg1;
			this.method3500();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	private void method3500() {
		@Pc(15) long[] local15 = Class3_Sub6_Sub8.aLongArray2;
		this.aLong100 = -1L;
		this.aLong100 = local15[(int) (((long) (this.anInt4340 >> 8) ^ this.aLong100) & 0xFFL)] ^ this.aLong100 >>> 8;
		this.aLong100 = this.aLong100 >>> 8 ^ local15[(int) ((this.aLong100 ^ (long) this.anInt4340) & 0xFFL)];
		for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
			this.aLong100 = this.aLong100 >>> 8 ^ local15[(int) ((this.aLong100 ^ (long) (this.anIntArray195[local58] >> 24)) & 0xFFL)];
			this.aLong100 = this.aLong100 >>> 8 ^ local15[(int) ((this.aLong100 ^ (long) (this.anIntArray195[local58] >> 16)) & 0xFFL)];
			this.aLong100 = local15[(int) (((long) (this.anIntArray195[local58] >> 8) ^ this.aLong100) & 0xFFL)] ^ this.aLong100 >>> 8;
			this.aLong100 = local15[(int) ((this.aLong100 ^ (long) this.anIntArray195[local58]) & 0xFFL)] ^ this.aLong100 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong100 = local15[(int) (((long) this.anIntArray196[local152] ^ this.aLong100) & 0xFFL)] ^ this.aLong100 >>> 8;
		}
		this.aLong100 = local15[(int) (((long) (this.aBoolean285 ? 1 : 0) ^ this.aLong100) & 0xFFL)] ^ this.aLong100 >>> 8;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([II[IIZI)V")
	public void method3501(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anIntArray196 = arg2;
		this.anInt4335 = arg1;
		if (this.anInt4340 != arg3) {
			this.anInt4340 = arg3;
		}
		this.anIntArray195 = arg0;
		this.aBoolean285 = arg4;
		this.method3500();
	}
}
