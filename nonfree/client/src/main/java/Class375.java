import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class375 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
	public boolean aBoolean763;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	private int anInt10069;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
	private int[] anIntArray656;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "J")
	private long aLong270;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public int anInt10071 = -1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!pia;IILclient!pga;Lclient!av;IIIIILclient!ha;)Lclient!ka;")
	public Class75 method8534(@OriginalArg(1) Class267 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class264 arg2, @OriginalArg(5) Class22 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class82 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		@Pc(38) int local38;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg0.anIntArray458[arg7];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class3_Sub7_Sub18 local47 = arg2.method6569(local38);
			if (local47 != null) {
				local13 = local47.method7270(local42) | false;
				local11 = local47.method7266(local42) | false;
				local17 = local47.method7267(local42) | false;
				local15 = arg0.aBoolean545 | false;
			}
			if ((arg0.aBoolean543 || Static607.aBoolean749) && arg8 != -1 && arg8 < arg0.anIntArray458.length) {
				local94 = arg0.anIntArray458[arg8];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(111) Class3_Sub7_Sub18 local111;
				if (local98 == local38) {
					local111 = local47;
				} else {
					local111 = arg2.method6569(local102 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method7270(local102);
					local11 |= local111.method7266(local102);
					local17 |= local111.method7267(local102);
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
		@Pc(179) long local179 = (long) arg5 << 32 | (long) (arg6 << 16) | (long) arg1;
		@Pc(181) Class136 local181 = Static309.aClass136_36;
		@Pc(189) Class75 local189;
		synchronized (Static309.aClass136_36) {
			local189 = (Class75) Static309.aClass136_36.method3134(local179);
		}
		if (local189 == null || arg9.method6105(local189.ua(), local7) != 0) {
			if (local189 != null) {
				local7 = arg9.method6169(local7, local189.ua());
			}
			@Pc(227) Class359[] local227 = new Class359[3];
			local94 = 0;
			if (!arg3.method376(arg1).method7369() || !arg3.method376(arg6).method7369() || !arg3.method376(arg5).method7369()) {
				return null;
			}
			@Pc(257) Class359 local257 = arg3.method376(arg1).method7365();
			if (local257 != null) {
				local94++;
				local227[0] = local257;
			}
			local257 = arg3.method376(arg6).method7365();
			if (local257 != null) {
				local227[local94++] = local257;
			}
			local257 = arg3.method376(arg5).method7365();
			if (local257 != null) {
				local227[local94++] = local257;
			}
			@Pc(296) int local296 = local7 | 0x4000;
			local257 = new Class359(local227, local94);
			local189 = arg9.method6176(local257, local296, Static373.anInt6819, 64, 768);
			for (@Pc(312) int local312 = 0; local312 < 5; local312++) {
				for (local38 = 0; local38 < Static461.aShortArrayArrayArray4.length; local38++) {
					if (Static461.aShortArrayArrayArray4[local38][local312].length > this.anIntArray657[local312]) {
						local189.ia(Static603.aShortArrayArray19[local38][local312], Static461.aShortArrayArrayArray4[local38][local312][this.anIntArray657[local312]]);
					}
				}
			}
			local189.s(local7);
			@Pc(366) Class136 local366 = Static309.aClass136_36;
			synchronized (Static309.aClass136_36) {
				Static309.aClass136_36.method3135(local189, local179);
			}
		}
		if (arg0 == null) {
			return local189;
		} else {
			local189 = local189.method6805((byte) 4, local7, true);
			return arg0.method6604(arg7, 2048, arg4, local189, arg8);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!mm;Lclient!go;Lclient!av;Lclient!pga;IILclient!aaa;Lclient!pia;Lclient!ha;BII)Lclient!ka;")
	public Class75 method8536(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2 arg6, @OriginalArg(7) Class267 arg7, @OriginalArg(8) Class82 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt10071 != -1) {
			return arg6.method23(this.anInt10071).method7587(arg9, arg7, arg8, arg4, arg0, arg5, (Class101) null, arg3);
		}
		@Pc(29) int local29 = 2048;
		@Pc(37) boolean local37;
		@Pc(54) int local54;
		@Pc(119) int local119;
		@Pc(60) int local60;
		@Pc(123) int local123;
		if (arg7 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			@Pc(39) boolean local39 = false;
			local29 = 2080;
			local54 = arg7.anIntArray458[arg4];
			local60 = local54 >>> 16;
			@Pc(64) int local64 = local54 & 0xFFFF;
			@Pc(69) Class3_Sub7_Sub18 local69 = arg3.method6569(local60);
			if (local69 != null) {
				local35 = local69.method7270(local64) | false;
				local33 = local69.method7266(local64) | false;
				local39 = local69.method7267(local64) | false;
				local37 = arg7.aBoolean545 | false;
			}
			if ((arg7.aBoolean543 || Static607.aBoolean749) && arg9 != -1 && arg9 < arg7.anIntArray458.length) {
				local119 = arg7.anIntArray458[arg9];
				local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(137) Class3_Sub7_Sub18 local137 = local123 == local60 ? local69 : arg3.method6569(local123);
				if (local137 != null) {
					local35 |= local137.method7270(local127);
					local33 |= local137.method7266(local127);
					local39 |= local137.method7267(local127);
				}
			}
			if (local35) {
				local29 = 2208;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
			if (local39) {
				local29 |= 0x400;
			}
		}
		@Pc(186) Class136 local186 = Static309.aClass136_36;
		@Pc(195) Class75 local195;
		synchronized (Static309.aClass136_36) {
			local195 = (Class75) Static309.aClass136_36.method3134(this.aLong270);
		}
		if (local195 == null || arg8.method6105(local195.ua(), local29) != 0) {
			if (local195 != null) {
				local29 = arg8.method6169(local29, local195.ua());
			}
			local37 = false;
			for (@Pc(226) int local226 = 0; local226 < 12; local226++) {
				local54 = this.anIntArray656[local226];
				if ((local54 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local54) != 0 && !arg2.method376(local54 & 0x3FFFFFFF).method7369()) {
						local37 = true;
					}
				} else if (!arg1.method3062(local54 & 0x3FFFFFFF).method6468(this.aBoolean763)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(283) Class359[] local283 = new Class359[12];
			local119 = 0;
			for (@Pc(287) int local287 = 0; local287 < 12; local287++) {
				@Pc(294) int local294 = this.anIntArray656[local287];
				@Pc(314) Class359 local314;
				if ((local294 & 0x40000000) != 0) {
					local314 = arg1.method3062(local294 & 0x3FFFFFFF).method6451(this.aBoolean763);
					if (local314 != null) {
						local283[local119++] = local314;
					}
				} else if ((local294 & Integer.MIN_VALUE) != 0) {
					local314 = arg2.method376(local294 & 0x3FFFFFFF).method7365();
					if (local314 != null) {
						local283[local119++] = local314;
					}
				}
			}
			@Pc(353) Class359 local353 = new Class359(local283, local119);
			@Pc(357) int local357 = local29 | 0x4000;
			local195 = arg8.method6176(local353, local357, Static373.anInt6819, 64, 768);
			for (local60 = 0; local60 < 5; local60++) {
				for (local123 = 0; local123 < Static461.aShortArrayArrayArray4.length; local123++) {
					if (Static461.aShortArrayArrayArray4[local123][local60].length > this.anIntArray657[local60]) {
						local195.ia(Static603.aShortArrayArray19[local123][local60], Static461.aShortArrayArrayArray4[local123][local60][this.anIntArray657[local60]]);
					}
				}
			}
			local195.s(local29);
			@Pc(419) Class136 local419 = Static309.aClass136_36;
			synchronized (Static309.aClass136_36) {
				Static309.aClass136_36.method3135(local195, this.aLong270);
			}
		}
		if (arg7 == null) {
			return local195;
		} else {
			local195.method6805((byte) 4, local29, true);
			return arg7.method6604(arg4, 2048, arg5, local195, arg9);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
	public void method8537(@OriginalArg(0) boolean arg0) {
		this.aBoolean763 = arg0;
		this.method8543();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!go;Z)V")
	public void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2) {
		if (arg0 == -1) {
			this.anIntArray656[arg1] = 0;
		} else if (arg2.method3062(arg0) != null) {
			this.anIntArray656[arg1] = arg0 | 0x40000000;
			this.method8543();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!av;IBI)V")
	public void method8539(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static511.anIntArray541[arg1];
		if (arg0.method376(arg2) != null) {
			this.anIntArray656[local11] = arg2 | Integer.MIN_VALUE;
			this.method8543();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZ[I[I)V")
	public void method8540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		this.aBoolean763 = arg2;
		if (arg1 != this.anInt10069) {
			this.anInt10069 = arg1;
		}
		this.anIntArray657 = arg3;
		this.anIntArray656 = arg4;
		this.anInt10071 = arg0;
		this.method8543();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!pga;Lclient!pia;Lclient!go;Lclient!ha;IBIILclient!av;I[IILclient!pia;IILclient!gaa;Lclient!aaa;[Lclient!hd;ILclient!mm;Z)Lclient!ka;")
	public Class75 method8541(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class22 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class267 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class119 arg14, @OriginalArg(16) Class2 arg15, @OriginalArg(17) Class140[] arg16, @OriginalArg(18) int arg17, @OriginalArg(19) Interface16 arg18) {
		if (this.anInt10071 != -1) {
			return arg15.method23(this.anInt10071).method7588(arg1, arg13, arg4, arg16, arg14, arg12, arg10, arg9, arg5, arg6, arg0, arg18, arg3, arg17, arg11, (Class101) null, arg8);
		}
		@Pc(36) int local36 = arg5;
		@Pc(39) long local39 = this.aLong270;
		@Pc(42) int[] local42 = this.anIntArray656;
		if (arg1 != null && (arg1.anInt7586 >= 0 || arg1.anInt7574 >= 0)) {
			local42 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local42[local55] = this.anIntArray656[local55];
			}
			if (arg1.anInt7586 >= 0) {
				if (arg1.anInt7586 == 65535) {
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg1.anInt7586 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg1.anInt7574 >= 0) {
				if (arg1.anInt7574 == 65535) {
					local39 ^= 0xFFFFFFFFL;
					local42[3] = 0;
				} else {
					local42[3] = arg1.anInt7574 | 0x40000000;
					local39 ^= (long) local42[3];
				}
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = false;
		@Pc(154) boolean local154 = false;
		@Pc(162) boolean local162 = arg1 != null || arg11 != null;
		@Pc(169) int local169 = arg16 == null ? 0 : arg16.length;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(171) int local171 = 0; local171 < local169; local171++) {
			Static595.aClass3_Sub7_Sub18Array6[local171] = null;
			if (arg16[local171] != null) {
				@Pc(189) Class267 local189 = arg0.method6574(arg16[local171].anInt3758);
				if (local189.anIntArray458 != null) {
					Static531.aClass267Array2[local171] = local189;
					local162 = true;
					local203 = arg16[local171].anInt3756;
					local208 = arg16[local171].anInt3754;
					@Pc(213) int local213 = local189.anIntArray458[local203];
					Static595.aClass3_Sub7_Sub18Array6[local171] = arg0.method6569(local213 >>> 16);
					@Pc(226) int local226 = local213 & 0xFFFF;
					Static310.anIntArray325[local171] = local226;
					if (Static595.aClass3_Sub7_Sub18Array6[local171] != null) {
						local152 |= Static595.aClass3_Sub7_Sub18Array6[local171].method7270(local226);
						local144 |= Static595.aClass3_Sub7_Sub18Array6[local171].method7266(local226);
						local154 |= Static595.aClass3_Sub7_Sub18Array6[local171].method7267(local226);
					}
					if ((local189.aBoolean543 || Static607.aBoolean749) && local208 != -1 && local189.anIntArray458.length > local208) {
						Static18.anIntArray27[local171] = local189.anIntArray456[local203];
						Static377.anIntArray401[local171] = arg16[local171].anInt3755;
						@Pc(313) int local313 = local189.anIntArray458[local208];
						Static411.aClass3_Sub7_Sub18Array4[local171] = arg0.method6569(local313 >>> 16);
						@Pc(326) int local326 = local313 & 0xFFFF;
						Static193.anIntArray679[local171] = local326;
						if (Static411.aClass3_Sub7_Sub18Array4[local171] != null) {
							local152 |= Static411.aClass3_Sub7_Sub18Array4[local171].method7270(local326);
							local144 |= Static411.aClass3_Sub7_Sub18Array4[local171].method7266(local326);
							local154 |= Static411.aClass3_Sub7_Sub18Array4[local171].method7267(local326);
						}
					} else {
						Static18.anIntArray27[local171] = 0;
						Static377.anIntArray401[local171] = 0;
						Static411.aClass3_Sub7_Sub18Array4[local171] = null;
						Static193.anIntArray679[local171] = -1;
					}
				}
			}
		}
		@Pc(367) int local367 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(373) Class3_Sub7_Sub18 local373 = null;
		@Pc(375) Class3_Sub7_Sub18 local375 = null;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = 0;
		@Pc(383) Class3_Sub7_Sub18 local383 = null;
		@Pc(385) Class3_Sub7_Sub18 local385 = null;
		if (local162) {
			@Pc(398) int local398;
			@Pc(457) int local457;
			if (arg1 != null) {
				local367 = arg1.anIntArray458[arg6];
				local398 = local367 >>> 16;
				local373 = arg0.method6569(local398);
				local367 &= 0xFFFF;
				if (local373 != null) {
					local152 |= local373.method7270(local367);
					local144 |= local373.method7266(local367);
					local154 |= local373.method7267(local367);
				}
				if ((arg1.aBoolean543 || Static607.aBoolean749) && arg8 != -1 && arg8 < arg1.anIntArray458.length) {
					local203 = arg1.anIntArray458[arg8];
					local208 = arg1.anIntArray456[arg6];
					local457 = local203 >>> 16;
					local375 = local457 == local398 ? local373 : arg0.method6569(local457);
					local203 &= 0xFFFF;
					if (local375 != null) {
						local152 |= local375.method7270(local203);
						local144 |= local375.method7266(local203);
						local154 |= local375.method7267(local203);
					}
				}
			}
			local36 = arg5 | 0x20;
			if (arg11 != null) {
				local377 = arg11.anIntArray458[arg12];
				local398 = local377 >>> 16;
				local383 = arg0.method6569(local398);
				local377 &= 0xFFFF;
				if (local383 != null) {
					local152 |= local383.method7270(local377);
					local144 |= local383.method7266(local377);
					local154 |= local383.method7267(local377);
				}
				if ((arg11.aBoolean543 || Static607.aBoolean749) && arg10 != -1 && arg10 < arg11.anIntArray458.length) {
					local381 = arg11.anIntArray456[arg12];
					local379 = arg11.anIntArray458[arg10];
					local457 = local379 >>> 16;
					local379 &= 0xFFFF;
					local385 = local457 == local398 ? local383 : arg0.method6569(local457);
					if (local385 != null) {
						local152 |= local385.method7270(local379);
						local144 |= local385.method7266(local379);
						local154 |= local385.method7267(local379);
					}
				}
			}
			if (local152) {
				local36 |= 0x80;
			}
			if (local144) {
				local36 |= 0x100;
			}
			if (local154) {
				local36 |= 0x400;
			}
		}
		@Pc(634) Class136 local634 = Static40.aClass136_9;
		@Pc(642) Class75 local642;
		synchronized (Static40.aClass136_9) {
			local642 = (Class75) Static40.aClass136_9.method3134(local39);
		}
		@Pc(650) Class176 local650 = null;
		if (this.anInt10069 != -1) {
			local650 = arg14.method2845(this.anInt10069);
		}
		@Pc(683) boolean local683;
		@Pc(685) int local685;
		@Pc(691) int local691;
		@Pc(743) int local743;
		@Pc(749) int local749;
		@Pc(817) int local817;
		if (local642 == null || arg3.method6105(local642.ua(), local36) != 0) {
			if (local642 != null) {
				local36 = arg3.method6169(local36, local642.ua());
			}
			local683 = false;
			for (local685 = 0; local685 < 12; local685++) {
				local691 = local42[local685];
				if ((local691 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local691) != 0 && !arg7.method376(local691 & 0x3FFFFFFF).method7362()) {
						local683 = true;
					}
				} else if (!arg2.method3062(local691 & 0x3FFFFFFF).method6452(this.aBoolean763)) {
					local683 = true;
				}
			}
			if (local683) {
				if (this.aLong271 != -1L) {
					@Pc(1029) Class136 local1029 = Static40.aClass136_9;
					synchronized (Static40.aClass136_9) {
						local642 = (Class75) Static40.aClass136_9.method3134(this.aLong271);
					}
				}
				if (local642 == null || arg3.method6105(local642.ua(), local36) != 0) {
					return null;
				}
			} else {
				@Pc(741) Class359[] local741 = new Class359[12];
				for (local743 = 0; local743 < 12; local743++) {
					local749 = local42[local743];
					@Pc(771) Class359 local771;
					if ((local749 & 0x40000000) != 0) {
						local771 = arg2.method3062(local749 & 0x3FFFFFFF).method6454(this.aBoolean763);
						if (local771 != null) {
							local741[local743] = local771;
						}
					} else if ((Integer.MIN_VALUE & local749) != 0) {
						local771 = arg7.method376(local749 & 0x3FFFFFFF).method7367();
						if (local771 != null) {
							local741[local743] = local771;
						}
					}
				}
				@Pc(819) int local819;
				if (local650 != null && local650.anIntArrayArray22 != null) {
					for (local749 = 0; local749 < local650.anIntArrayArray22.length; local749++) {
						if (local741[local749] != null) {
							local817 = 0;
							local819 = 0;
							@Pc(821) int local821 = 0;
							@Pc(823) int local823 = 0;
							@Pc(825) int local825 = 0;
							@Pc(827) int local827 = 0;
							if (local650.anIntArrayArray22[local749] != null) {
								local825 = local650.anIntArrayArray22[local749][4] << 3;
								local821 = local650.anIntArrayArray22[local749][2];
								local823 = local650.anIntArrayArray22[local749][3] << 3;
								local817 = local650.anIntArrayArray22[local749][0];
								local819 = local650.anIntArrayArray22[local749][1];
								local827 = local650.anIntArrayArray22[local749][5] << 3;
							}
							if (local823 != 0 || local825 != 0 || local827 != 0) {
								local741[local749].method8360(local827, local823, local825);
							}
							if (local817 != 0 || local819 != 0 || local821 != 0) {
								local741[local749].method8356(local819, local817, local821);
							}
						}
					}
				}
				@Pc(933) int local933 = local36 | 0x4000;
				@Pc(940) Class359 local940 = new Class359(local741, local741.length);
				local642 = arg3.method6176(local940, local933, Static373.anInt6819, 64, 850);
				for (local817 = 0; local817 < 5; local817++) {
					for (local819 = 0; local819 < Static461.aShortArrayArrayArray4.length; local819++) {
						if (Static461.aShortArrayArrayArray4[local819][local817].length > this.anIntArray657[local817]) {
							local642.ia(Static603.aShortArrayArray19[local819][local817], Static461.aShortArrayArrayArray4[local819][local817][this.anIntArray657[local817]]);
						}
					}
				}
				local642.s(local36);
				@Pc(1002) Class136 local1002 = Static40.aClass136_9;
				synchronized (Static40.aClass136_9) {
					Static40.aClass136_9.method3135(local642, local39);
				}
				this.aLong271 = local39;
			}
		}
		@Pc(1063) Class75 local1063 = local642.method6805((byte) 4, local36, true);
		local683 = false;
		if (arg9 != null) {
			for (local685 = 0; local685 < 12; local685++) {
				if (arg9[local685] != -1) {
					local683 = true;
				}
			}
		}
		if (!local162 && !local683) {
			return local1063;
		}
		@Pc(1091) Class31[] local1091 = null;
		if (local650 != null) {
			local1091 = local650.method4480(arg3);
		}
		if (local683 && local1091 != null) {
			for (local691 = 0; local691 < 12; local691++) {
				if (local1091[local691] != null) {
					local1063.method6798(local1091[local691], 0x1 << local691, true);
				}
			}
		}
		local691 = 0;
		local743 = 1;
		while (local691 < local169) {
			if (Static595.aClass3_Sub7_Sub18Array6[local691] != null) {
				local1063.method6795(local743, Static595.aClass3_Sub7_Sub18Array6[local691], Static411.aClass3_Sub7_Sub18Array4[local691], Static310.anIntArray325[local691], false, Static193.anIntArray679[local691], Static377.anIntArray401[local691] - 1, Static18.anIntArray27[local691], (int[]) null);
			}
			local743 <<= 0x1;
			local691++;
		}
		if (local683) {
			for (local749 = 0; local749 < 12; local749++) {
				if (arg9[local749] != -1) {
					local817 = arg9[local749] - arg4;
					local817 &= 0x3FFF;
					@Pc(1195) Class31 local1195 = arg3.method6170();
					local1195.method7933(local817);
					local1063.method6798(local1195, 0x1 << local749, false);
				}
			}
		}
		if (local683 && local1091 != null) {
			for (local749 = 0; local749 < 12; local749++) {
				if (local1091[local749] != null) {
					local1063.method6798(local1091[local749], 0x1 << local749, false);
				}
			}
		}
		if (local373 != null && local383 != null) {
			local1063.method6807(local383, arg17 - 1, local203, arg13 - 1, local381, local208, local379, local377, local367, local385, local373, false, arg1.aBooleanArray28, local375);
		} else if (local373 != null) {
			local1063.method6786(local373, 0, local375, local367, local208, false, local203, arg17 - 1);
		} else if (local383 != null) {
			local1063.method6786(local383, 0, local385, local377, local381, false, local379, arg13 - 1);
		}
		for (local749 = 0; local749 < local169; local749++) {
			Static595.aClass3_Sub7_Sub18Array6[local749] = null;
			Static411.aClass3_Sub7_Sub18Array4[local749] = null;
			Static531.aClass267Array2[local749] = null;
		}
		return local1063;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method8543() {
		this.aLong270 = -1L;
		@Pc(10) long[] local10 = Class60.aLongArray16;
		this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) ((this.aLong270 ^ (long) (this.anInt10069 >> 8)) & 0xFFL)];
		this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) ((this.aLong270 ^ (long) this.anInt10069) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong270 = local10[(int) (((long) (this.anIntArray656[local50] >> 24) ^ this.aLong270) & 0xFFL)] ^ this.aLong270 >>> 8;
			this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) ((this.aLong270 ^ (long) (this.anIntArray656[local50] >> 16)) & 0xFFL)];
			this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) (((long) (this.anIntArray656[local50] >> 8) ^ this.aLong270) & 0xFFL)];
			this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) (((long) this.anIntArray656[local50] ^ this.aLong270) & 0xFFL)];
		}
		for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
			this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) (((long) this.anIntArray657[local164] ^ this.aLong270) & 0xFFL)];
		}
		this.aLong270 = this.aLong270 >>> 8 ^ local10[(int) (((long) (this.aBoolean763 ? 1 : 0) ^ this.aLong270) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public void method8544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray657[arg0] = arg1;
		this.method8543();
	}
}
