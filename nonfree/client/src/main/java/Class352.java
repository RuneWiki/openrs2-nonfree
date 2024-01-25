import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class352 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "J")
	private long aLong263;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Z")
	public boolean aBoolean831;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
	private int anInt9958;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "client!vea", name = "t", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
	public int anInt9971 = -1;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZB)V")
	public void method8173(@OriginalArg(0) boolean arg0) {
		this.aBoolean831 = arg0;
		this.method8174();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	private void method8174() {
		@Pc(7) long[] local7 = Class3_Sub1_Sub14_Sub2.aLongArray13;
		this.aLong263 = -1L;
		this.aLong263 = local7[(int) (((long) (this.anInt9958 >> 8) ^ this.aLong263) & 0xFFL)] ^ this.aLong263 >>> 8;
		this.aLong263 = this.aLong263 >>> 8 ^ local7[(int) ((this.aLong263 ^ (long) this.anInt9958) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong263 = this.aLong263 >>> 8 ^ local7[(int) (((long) (this.anIntArray600[local50] >> 24) ^ this.aLong263) & 0xFFL)];
			this.aLong263 = local7[(int) ((this.aLong263 ^ (long) (this.anIntArray600[local50] >> 16)) & 0xFFL)] ^ this.aLong263 >>> 8;
			this.aLong263 = local7[(int) (((long) (this.anIntArray600[local50] >> 8) ^ this.aLong263) & 0xFFL)] ^ this.aLong263 >>> 8;
			this.aLong263 = local7[(int) ((this.aLong263 ^ (long) this.anIntArray600[local50]) & 0xFFL)] ^ this.aLong263 >>> 8;
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong263 = local7[(int) ((this.aLong263 ^ (long) this.anIntArray599[local146]) & 0xFFL)] ^ this.aLong263 >>> 8;
		}
		this.aLong263 = local7[(int) (((long) (this.aBoolean831 ? 1 : 0) ^ this.aLong263) & 0xFFL)] ^ this.aLong263 >>> 8;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!fg;III)V")
	public void method8175(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static268.anIntArray335[arg2];
		if (arg0.method3258(arg1) != null) {
			this.anIntArray600[local11] = Integer.MIN_VALUE | arg1;
			this.method8174();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "([I[IZIII)V")
	public void method8176(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aBoolean831 = arg2;
		if (arg4 != this.anInt9958) {
			this.anInt9958 = arg4;
		}
		this.anIntArray600 = arg0;
		this.anIntArray599 = arg1;
		this.anInt9971 = arg3;
		this.method8174();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!fg;IILclient!ha;IILclient!naa;ILclient!rj;II)Lclient!ka;")
	public Class128 method8178(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class222 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class290 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(99) int local99;
		@Pc(38) int local38;
		if (arg7 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg7.anIntArray550[arg0];
			local7 = 2080;
			local38 = local30 >>> 16;
			@Pc(43) Class3_Sub1_Sub12 local43 = arg5.method5861(local38);
			@Pc(47) int local47 = local30 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5015(local47) | false;
				local11 = local43.method5017(local47) | false;
				local17 = local43.method5016(local47) | false;
				local15 = arg7.aBoolean739 | false;
			}
			if ((arg7.aBoolean737 || Static433.aBoolean671) && arg9 != -1 && arg7.anIntArray550.length > arg9) {
				local99 = arg7.anIntArray550[arg9];
				@Pc(103) int local103 = local99 >>> 16;
				@Pc(107) int local107 = local99 & 0xFFFF;
				@Pc(117) Class3_Sub1_Sub12 local117;
				if (local38 == local103) {
					local117 = local43;
				} else {
					local117 = arg5.method5861(local107 >>> 16);
				}
				if (local117 != null) {
					local13 |= local117.method5015(local107);
					local11 |= local117.method5017(local107);
					local17 |= local117.method5016(local107);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(182) long local182 = (long) (arg6 << 16) | (long) arg4 << 32 | (long) arg8;
		@Pc(190) Class112 local190 = Static254.aClass112_31;
		@Pc(200) Class128 local200;
		synchronized (Static254.aClass112_31) {
			local200 = (Class128) Static254.aClass112_31.method3640(local182);
		}
		if (local200 == null || arg3.method6220(local200.ua(), local7) != 0) {
			if (local200 != null) {
				local7 = arg3.method6176(local7, local200.ua());
			}
			@Pc(230) Class142[] local230 = new Class142[3];
			local99 = 0;
			if (!arg1.method3258(arg8).method6105() || !arg1.method3258(arg6).method6105() || !arg1.method3258(arg4).method6105()) {
				return null;
			}
			@Pc(268) Class142 local268 = arg1.method3258(arg8).method6106();
			if (local268 != null) {
				local99++;
				local230[0] = local268;
			}
			local268 = arg1.method3258(arg6).method6106();
			if (local268 != null) {
				local230[local99++] = local268;
			}
			local268 = arg1.method3258(arg4).method6106();
			if (local268 != null) {
				local230[local99++] = local268;
			}
			local268 = new Class142(local230, local99);
			@Pc(313) int local313 = local7 | 0x4000;
			local200 = arg3.method6157(local268, local313, Static183.anInt4338, 64, 768);
			for (@Pc(323) int local323 = 0; local323 < 5; local323++) {
				for (local38 = 0; local38 < Static221.aShortArrayArrayArray1.length; local38++) {
					if (Static221.aShortArrayArrayArray1[local38][local323].length > this.anIntArray599[local323]) {
						local200.ia(Static351.aShortArrayArray14[local38][local323], Static221.aShortArrayArrayArray1[local38][local323][this.anIntArray599[local323]]);
					}
				}
			}
			local200.s(local7);
			@Pc(373) Class112 local373 = Static254.aClass112_31;
			synchronized (Static254.aClass112_31) {
				Static254.aClass112_31.method3636(local182, local200);
			}
		}
		if (arg7 == null) {
			return local200;
		} else {
			local200 = local200.method6279((byte) 4, local7, true);
			return arg7.method7171(arg0, local200, arg2, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLclient!fg;ILclient!rj;[III[Lclient!fh;Lclient!ha;Lclient!naa;Lclient!iba;Lclient!rj;ILclient!qr;ZILclient!dk;Lclient!raa;III)Lclient!ka;")
	public Class128 method8179(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class290 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class98[] arg6, @OriginalArg(8) Class33 arg7, @OriginalArg(9) Class222 arg8, @OriginalArg(10) Class139 arg9, @OriginalArg(11) Class290 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class281 arg12, @OriginalArg(15) int arg13, @OriginalArg(16) Interface6 arg14, @OriginalArg(17) Class285 arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) int arg18) {
		if (this.anInt9971 != -1) {
			return arg9.method4345(this.anInt9971).method424(arg14, arg6, arg3, arg13, arg11, arg10, arg1, arg4, arg16, arg2, arg8, arg15, arg5, arg18, arg17, arg7);
		}
		@Pc(35) int local35 = arg1;
		@Pc(38) long local38 = this.aLong263;
		@Pc(41) int[] local41 = this.anIntArray600;
		if (arg2 != null && (arg2.anInt8681 >= 0 || arg2.anInt8695 >= 0)) {
			local41 = new int[12];
			for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
				local41[local57] = this.anIntArray600[local57];
			}
			if (arg2.anInt8681 >= 0) {
				if (arg2.anInt8681 == 65535) {
					local41[5] = 0;
					local38 ^= 0xFFFFFFFF00000000L;
				} else {
					local41[5] = arg2.anInt8681 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg2.anInt8695 >= 0) {
				if (arg2.anInt8695 == 65535) {
					local38 ^= 0xFFFFFFFFL;
					local41[3] = 0;
				} else {
					local41[3] = arg2.anInt8695 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(158) boolean local158 = arg2 != null || arg10 != null;
		@Pc(165) int local165 = arg6 == null ? 0 : arg6.length;
		@Pc(199) int local199;
		@Pc(204) int local204;
		for (@Pc(167) int local167 = 0; local167 < local165; local167++) {
			Static48.aClass3_Sub1_Sub12Array1[local167] = null;
			if (arg6[local167] != null) {
				@Pc(185) Class290 local185 = arg8.method5867(arg6[local167].anInt3718);
				if (local185.anIntArray550 != null) {
					Static499.aClass290Array2[local167] = local185;
					local158 = true;
					local199 = arg6[local167].anInt3711;
					local204 = arg6[local167].anInt3713;
					@Pc(209) int local209 = local185.anIntArray550[local199];
					Static48.aClass3_Sub1_Sub12Array1[local167] = arg8.method5861(local209 >>> 16);
					@Pc(222) int local222 = local209 & 0xFFFF;
					Static353.anIntArray402[local167] = local222;
					if (Static48.aClass3_Sub1_Sub12Array1[local167] != null) {
						local148 |= Static48.aClass3_Sub1_Sub12Array1[local167].method5015(local222);
						local146 |= Static48.aClass3_Sub1_Sub12Array1[local167].method5017(local222);
						local150 |= Static48.aClass3_Sub1_Sub12Array1[local167].method5016(local222);
					}
					if ((local185.aBoolean737 || Static433.aBoolean671) && local204 != -1 && local185.anIntArray550.length > local204) {
						Static223.anIntArray290[local167] = local185.anIntArray548[local199];
						Static175.anIntArray228[local167] = arg6[local167].anInt3714;
						@Pc(308) int local308 = local185.anIntArray550[local204];
						Static393.aClass3_Sub1_Sub12Array3[local167] = arg8.method5861(local308 >>> 16);
						@Pc(321) int local321 = local308 & 0xFFFF;
						Static489.anIntArray547[local167] = local321;
						if (Static393.aClass3_Sub1_Sub12Array3[local167] != null) {
							local148 |= Static393.aClass3_Sub1_Sub12Array3[local167].method5015(local321);
							local146 |= Static393.aClass3_Sub1_Sub12Array3[local167].method5017(local321);
							local150 |= Static393.aClass3_Sub1_Sub12Array3[local167].method5016(local321);
						}
					} else {
						Static223.anIntArray290[local167] = 0;
						Static175.anIntArray228[local167] = 0;
						Static393.aClass3_Sub1_Sub12Array3[local167] = null;
						Static489.anIntArray547[local167] = -1;
					}
				}
			}
		}
		@Pc(362) int local362 = -1;
		local199 = -1;
		local204 = 0;
		@Pc(376) Class3_Sub1_Sub12 local376 = null;
		@Pc(378) Class3_Sub1_Sub12 local378 = null;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = 0;
		@Pc(386) Class3_Sub1_Sub12 local386 = null;
		@Pc(388) Class3_Sub1_Sub12 local388 = null;
		if (local158) {
			local35 = arg1 | 0x20;
			@Pc(405) int local405;
			@Pc(465) int local465;
			if (arg2 != null) {
				local362 = arg2.anIntArray550[arg16];
				local405 = local362 >>> 16;
				local376 = arg8.method5861(local405);
				local362 &= 0xFFFF;
				if (local376 != null) {
					local148 |= local376.method5015(local362);
					local146 |= local376.method5017(local362);
					local150 |= local376.method5016(local362);
				}
				if ((arg2.aBoolean737 || Static433.aBoolean671) && arg13 != -1 && arg2.anIntArray550.length > arg13) {
					local204 = arg2.anIntArray548[arg16];
					local199 = arg2.anIntArray550[arg13];
					local465 = local199 >>> 16;
					local378 = local465 == local405 ? local376 : arg8.method5861(local465);
					local199 &= 0xFFFF;
					if (local378 != null) {
						local148 |= local378.method5015(local199);
						local146 |= local378.method5017(local199);
						local150 |= local378.method5016(local199);
					}
				}
			}
			if (arg10 != null) {
				local380 = arg10.anIntArray550[arg5];
				local405 = local380 >>> 16;
				local380 &= 0xFFFF;
				local386 = arg8.method5861(local405);
				if (local386 != null) {
					local148 |= local386.method5015(local380);
					local146 |= local386.method5017(local380);
					local150 |= local386.method5016(local380);
				}
				if ((arg10.aBoolean737 || Static433.aBoolean671) && arg4 != -1 && arg10.anIntArray550.length > arg4) {
					local384 = arg10.anIntArray548[arg5];
					local382 = arg10.anIntArray550[arg4];
					local465 = local382 >>> 16;
					local388 = local405 == local465 ? local386 : arg8.method5861(local465);
					local382 &= 0xFFFF;
					if (local388 != null) {
						local148 |= local388.method5015(local382);
						local146 |= local388.method5017(local382);
						local150 |= local388.method5016(local382);
					}
				}
			}
			if (local148) {
				local35 |= 0x80;
			}
			if (local146) {
				local35 |= 0x100;
			}
			if (local150) {
				local35 |= 0x400;
			}
		}
		@Pc(630) Class112 local630 = Static107.aClass112_13;
		@Pc(638) Class128 local638;
		synchronized (Static107.aClass112_13) {
			local638 = (Class128) Static107.aClass112_13.method3640(local38);
		}
		@Pc(646) Class232 local646 = null;
		if (this.anInt9958 != -1) {
			local646 = arg15.method7014(this.anInt9958);
		}
		@Pc(680) boolean local680;
		@Pc(682) int local682;
		@Pc(688) int local688;
		@Pc(769) int local769;
		@Pc(775) int local775;
		@Pc(842) int local842;
		if (local638 == null || arg7.method6220(local638.ua(), local35) != 0) {
			if (local638 != null) {
				local35 = arg7.method6176(local35, local638.ua());
			}
			local680 = false;
			for (local682 = 0; local682 < 12; local682++) {
				local688 = local41[local682];
				if ((local688 & 0x40000000) == 0) {
					if ((local688 & Integer.MIN_VALUE) != 0 && !arg0.method3258(local688 & 0x3FFFFFFF).method6101()) {
						local680 = true;
					}
				} else if (!arg12.method6975(local688 & 0x3FFFFFFF).method6068(this.aBoolean831)) {
					local680 = true;
				}
			}
			if (local680) {
				if (this.aLong264 != -1L) {
					@Pc(739) Class112 local739 = Static107.aClass112_13;
					synchronized (Static107.aClass112_13) {
						local638 = (Class128) Static107.aClass112_13.method3640(this.aLong264);
					}
				}
				if (local638 == null || arg7.method6220(local638.ua(), local35) != 0) {
					return null;
				}
			} else {
				@Pc(767) Class142[] local767 = new Class142[12];
				for (local769 = 0; local769 < 12; local769++) {
					local775 = local41[local769];
					@Pc(793) Class142 local793;
					if ((local775 & 0x40000000) != 0) {
						local793 = arg12.method6975(local775 & 0x3FFFFFFF).method6078(this.aBoolean831);
						if (local793 != null) {
							local767[local769] = local793;
						}
					} else if ((Integer.MIN_VALUE & local775) != 0) {
						local793 = arg0.method3258(local775 & 0x3FFFFFFF).method6100();
						if (local793 != null) {
							local767[local769] = local793;
						}
					}
				}
				@Pc(844) int local844;
				if (local646 != null && local646.anIntArrayArray66 != null) {
					for (local775 = 0; local775 < local646.anIntArrayArray66.length; local775++) {
						if (local767[local775] != null) {
							local842 = 0;
							local844 = 0;
							@Pc(846) int local846 = 0;
							@Pc(848) int local848 = 0;
							@Pc(850) int local850 = 0;
							@Pc(852) int local852 = 0;
							if (local646.anIntArrayArray66[local775] != null) {
								local852 = local646.anIntArrayArray66[local775][5] << 3;
								local844 = local646.anIntArrayArray66[local775][1];
								local848 = local646.anIntArrayArray66[local775][3] << 3;
								local850 = local646.anIntArrayArray66[local775][4] << 3;
								local842 = local646.anIntArrayArray66[local775][0];
								local846 = local646.anIntArrayArray66[local775][2];
							}
							if (local848 != 0 || local850 != 0 || local852 != 0) {
								local767[local775].method4366(local848, local852, local850);
							}
							if (local842 != 0 || local844 != 0 || local846 != 0) {
								local767[local775].method4358(local842, local844, local846);
							}
						}
					}
				}
				@Pc(949) int local949 = local35 | 0x4000;
				@Pc(956) Class142 local956 = new Class142(local767, local767.length);
				local638 = arg7.method6157(local956, local949, Static183.anInt4338, 64, 850);
				for (local842 = 0; local842 < 5; local842++) {
					for (local844 = 0; local844 < Static221.aShortArrayArrayArray1.length; local844++) {
						if (Static221.aShortArrayArrayArray1[local844][local842].length > this.anIntArray599[local842]) {
							local638.ia(Static351.aShortArrayArray14[local844][local842], Static221.aShortArrayArrayArray1[local844][local842][this.anIntArray599[local842]]);
						}
					}
				}
				local638.s(local35);
				@Pc(1020) Class112 local1020 = Static107.aClass112_13;
				synchronized (Static107.aClass112_13) {
					Static107.aClass112_13.method3636(local38, local638);
				}
				this.aLong264 = local38;
			}
		}
		@Pc(1042) Class128 local1042 = local638.method6279((byte) 4, local35, true);
		local680 = false;
		if (arg3 != null) {
			for (local682 = 0; local682 < 12; local682++) {
				if (arg3[local682] != -1) {
					local680 = true;
				}
			}
		}
		if (!local158 && !local680) {
			return local1042;
		}
		@Pc(1071) Class47[] local1071 = null;
		if (local646 != null) {
			local1071 = local646.method5993(arg7);
		}
		if (local680 && local1071 != null) {
			for (local688 = 0; local688 < 12; local688++) {
				if (local1071[local688] != null) {
					local1042.method6272(local1071[local688], 0x1 << local688, true);
				}
			}
		}
		local688 = 0;
		local769 = 1;
		while (local688 < local165) {
			if (Static48.aClass3_Sub1_Sub12Array1[local688] != null) {
				local1042.method6282(Static223.anIntArray290[local688], Static353.anIntArray402[local688], null, local769, Static175.anIntArray228[local688] - 1, Static489.anIntArray547[local688], false, Static393.aClass3_Sub1_Sub12Array3[local688], Static48.aClass3_Sub1_Sub12Array1[local688]);
			}
			local769 <<= 0x1;
			local688++;
		}
		if (local680) {
			for (local775 = 0; local775 < 12; local775++) {
				if (arg3[local775] != -1) {
					local842 = arg3[local775] - arg17;
					local842 &= 0x3FFF;
					@Pc(1176) Class47 local1176 = arg7.method6223();
					local1176.method7873(local842);
					local1042.method6272(local1176, 0x1 << local775, false);
				}
			}
		}
		if (local680 && local1071 != null) {
			for (local775 = 0; local775 < 12; local775++) {
				if (local1071[local775] != null) {
					local1042.method6272(local1071[local775], 0x1 << local775, false);
				}
			}
		}
		if (local376 != null && local386 != null) {
			local1042.method6280(local384, arg2.aBooleanArray22, arg18 - 1, local380, local362, local378, local199, local204, local388, arg11 - 1, false, local382, local386, local376);
		} else if (local376 != null) {
			local1042.method6284(0, local204, local378, false, local362, local199, local376, arg18 - 1);
		} else if (local386 != null) {
			local1042.method6284(0, local384, local388, false, local380, local382, local386, arg11 - 1);
		}
		for (local775 = 0; local775 < local165; local775++) {
			Static48.aClass3_Sub1_Sub12Array1[local775] = null;
			Static393.aClass3_Sub1_Sub12Array3[local775] = null;
			Static499.aClass290Array2[local775] = null;
		}
		return local1042;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ha;Lclient!naa;Lclient!dk;Lclient!fg;Lclient!rj;IILclient!qr;Lclient!iba;III)Lclient!ka;")
	public Class128 method8180(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) Class290 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class281 arg6, @OriginalArg(8) Class139 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.anInt9971 != -1) {
			return arg7.method4345(this.anInt9971).method427(arg9, arg0, arg8, arg1, arg2, arg5, arg4);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(118) int local118;
		@Pc(59) int local59;
		@Pc(122) int local122;
		if (arg4 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg4.anIntArray550[arg8];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class3_Sub1_Sub12 local68 = arg1.method5861(local59);
			if (local68 != null) {
				local34 = local68.method5015(local63) | false;
				local32 = local68.method5017(local63) | false;
				local38 = local68.method5016(local63) | false;
				local36 = arg4.aBoolean739 | false;
			}
			if ((arg4.aBoolean737 || Static433.aBoolean671) && arg5 != -1 && arg5 < arg4.anIntArray550.length) {
				local118 = arg4.anIntArray550[arg5];
				local122 = local118 >>> 16;
				@Pc(126) int local126 = local118 & 0xFFFF;
				@Pc(140) Class3_Sub1_Sub12 local140 = local59 == local122 ? local68 : arg1.method5861(local122);
				if (local140 != null) {
					local34 |= local140.method5015(local126);
					local32 |= local140.method5017(local126);
					local38 |= local140.method5016(local126);
				}
			}
			if (local34) {
				local28 = 2208;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
			if (local38) {
				local28 |= 0x400;
			}
		}
		@Pc(189) Class112 local189 = Static254.aClass112_31;
		@Pc(198) Class128 local198;
		synchronized (Static254.aClass112_31) {
			local198 = (Class128) Static254.aClass112_31.method3640(this.aLong263);
		}
		if (local198 == null || arg0.method6220(local198.ua(), local28) != 0) {
			if (local198 != null) {
				local28 = arg0.method6176(local28, local198.ua());
			}
			local36 = false;
			for (@Pc(226) int local226 = 0; local226 < 12; local226++) {
				local49 = this.anIntArray600[local226];
				if ((local49 & 0x40000000) == 0) {
					if ((local49 & Integer.MIN_VALUE) != 0 && !arg3.method3258(local49 & 0x3FFFFFFF).method6105()) {
						local36 = true;
					}
				} else if (!arg6.method6975(local49 & 0x3FFFFFFF).method6069(this.aBoolean831)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(286) Class142[] local286 = new Class142[12];
			local118 = 0;
			for (@Pc(290) int local290 = 0; local290 < 12; local290++) {
				@Pc(297) int local297 = this.anIntArray600[local290];
				@Pc(317) Class142 local317;
				if ((local297 & 0x40000000) != 0) {
					local317 = arg6.method6975(local297 & 0x3FFFFFFF).method6072(this.aBoolean831);
					if (local317 != null) {
						local286[local118++] = local317;
					}
				} else if ((Integer.MIN_VALUE & local297) != 0) {
					local317 = arg3.method3258(local297 & 0x3FFFFFFF).method6106();
					if (local317 != null) {
						local286[local118++] = local317;
					}
				}
			}
			@Pc(361) int local361 = local28 | 0x4000;
			@Pc(367) Class142 local367 = new Class142(local286, local118);
			local198 = arg0.method6157(local367, local361, Static183.anInt4338, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local122 = 0; local122 < Static221.aShortArrayArrayArray1.length; local122++) {
					if (Static221.aShortArrayArrayArray1[local122][local59].length > this.anIntArray599[local59]) {
						local198.ia(Static351.aShortArrayArray14[local122][local59], Static221.aShortArrayArrayArray1[local122][local59][this.anIntArray599[local59]]);
					}
				}
			}
			local198.s(local28);
			@Pc(425) Class112 local425 = Static254.aClass112_31;
			synchronized (Static254.aClass112_31) {
				Static254.aClass112_31.method3636(this.aLong263, local198);
			}
		}
		if (arg4 == null) {
			return local198;
		} else {
			local198.method6279((byte) 4, local28, true);
			return arg4.method7171(arg8, local198, arg9, arg5, 2048);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!qr;IB)V")
	public void method8182(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == -1) {
			this.anIntArray600[arg2] = 0;
		} else if (arg1.method6975(arg0) == null) {
			return;
		} else {
			this.anIntArray600[arg2] = arg0 | 0x40000000;
			this.method8174();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)V")
	public void method8185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray599[arg1] = arg0;
		this.method8174();
	}
}
