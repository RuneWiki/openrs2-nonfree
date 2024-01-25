import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class37 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	public int anInt871 = -1;

	static {
		new Class83("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZLclient!uk;Lclient!ro;Lclient!vs;ILclient!lp;Lclient!in;Lclient!ya;Lclient!du;I)Lclient!t;")
	public Class110 method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class240 arg2, @OriginalArg(4) Class206 arg3, @OriginalArg(5) Interface12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class138 arg6, @OriginalArg(8) Class109 arg7, @OriginalArg(9) Class19 arg8, @OriginalArg(10) Class55 arg9) {
		if (this.anInt871 != -1) {
			return arg2.method5229(this.anInt871).method5584(arg1, arg5, arg6, arg0, arg4, arg8, arg9);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(119) int local119;
		@Pc(59) int local59;
		if (arg6 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg6.anIntArray295[arg0];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class4_Sub1_Sub17 local68 = arg9.method1391(local59);
			if (local68 != null) {
				local34 = local68.method4207(local63) | false;
				local32 = local68.method4214(local63) | false;
				local38 = local68.method4215(local63) | false;
				local36 = arg6.aBoolean406 | false;
			}
			if ((arg6.aBoolean405 || Static127.aBoolean244) && arg1 != -1 && arg1 < arg6.anIntArray295.length) {
				local119 = arg6.anIntArray295[arg1];
				@Pc(123) int local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(141) Class4_Sub1_Sub17 local141 = local59 == local123 ? local68 : arg9.method1391(local123);
				if (local141 != null) {
					local34 |= local141.method4207(local127);
					local32 |= local141.method4214(local127);
					local38 |= local141.method4215(local127);
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
		@Pc(190) Class68 local190 = Static190.aClass68_20;
		@Pc(199) Class110 local199;
		synchronized (Static190.aClass68_20) {
			local199 = (Class110) Static190.aClass68_20.method1787(this.aLong35);
		}
		if (local199 == null || arg8.method4269(local199.P(), local28) != 0) {
			if (local199 != null) {
				local28 = arg8.method4282(local28, local199.P());
			}
			local36 = false;
			for (@Pc(227) int local227 = 0; local227 < 12; local227++) {
				local55 = this.anIntArray51[local227];
				if ((local55 & 0x40000000) == 0) {
					if ((local55 & Integer.MIN_VALUE) != 0 && !arg7.method2758(local55 & 0x3FFFFFFF).method4093()) {
						local36 = true;
					}
				} else if (!arg3.method4703(local55 & 0x3FFFFFFF).method4776(this.aBoolean83)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(281) Class122[] local281 = new Class122[12];
			local119 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				@Pc(292) int local292 = this.anIntArray51[local285];
				@Pc(310) Class122 local310;
				if ((local292 & 0x40000000) != 0) {
					local310 = arg3.method4703(local292 & 0x3FFFFFFF).method4792(this.aBoolean83);
					if (local310 != null) {
						local281[local119++] = local310;
					}
				} else if ((Integer.MIN_VALUE & local292) != 0) {
					local310 = arg7.method2758(local292 & 0x3FFFFFFF).method4099();
					if (local310 != null) {
						local281[local119++] = local310;
					}
				}
			}
			@Pc(352) int local352 = local28 | 0x4000;
			@Pc(358) Class122 local358 = new Class122(local281, local119);
			local199 = arg8.method4254(local358, local352, Static6.anInt62, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (this.anIntArray52[local59] < Static26.aShortArrayArray2[local59].length) {
					local199.BA(Static299.aShortArray179[local59], Static26.aShortArrayArray2[local59][this.anIntArray52[local59]]);
				}
				if (Static15.aShortArrayArray1[local59].length > this.anIntArray52[local59]) {
					local199.BA(Static434.aShortArray252[local59], Static15.aShortArrayArray1[local59][this.anIntArray52[local59]]);
				}
			}
			local199.UA(local28);
			@Pc(433) Class68 local433 = Static190.aClass68_20;
			synchronized (Static190.aClass68_20) {
				Static190.aClass68_20.method1779(this.aLong35, local199);
			}
		}
		if (arg6 == null) {
			return local199;
		} else {
			local199.method4887((byte) 4, local28, true);
			return arg6.method3456(arg5, 2048, arg1, arg0, local199);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public void method831(@OriginalArg(0) boolean arg0) {
		this.aBoolean83 = arg0;
		this.method834();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!in;II)V")
	public void method832(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32 = Static299.anIntArray353[arg2];
		if (this.anIntArray51[local32] != 0 && arg1.method2758(arg0) != null) {
			this.anIntArray51[local32] = arg0 | Integer.MIN_VALUE;
			this.method834();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!v;Lclient!in;Lclient!lp;I[Lclient!nv;Lclient!uk;IILclient!lp;BLclient!du;IILclient!ya;Lclient!ro;ILclient!vs;IZ)Lclient!t;")
	public Class110 method833(@OriginalArg(0) Class249 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class165[] arg4, @OriginalArg(5) Class240 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class138 arg8, @OriginalArg(10) Class55 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class19 arg12, @OriginalArg(14) Class206 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Interface12 arg15, @OriginalArg(17) int arg16) {
		if (this.anInt871 != -1) {
			return arg5.method5229(this.anInt871).method5575(arg14, arg8, arg15, arg6, arg3, arg16, arg11, arg12, arg7, arg10, arg4, arg2, arg9, arg0);
		}
		@Pc(34) int local34 = arg3;
		@Pc(37) long local37 = this.aLong35;
		@Pc(40) int[] local40 = this.anIntArray51;
		if (arg8 != null && (arg8.anInt4408 >= 0 || arg8.anInt4415 >= 0)) {
			local40 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local40[local53] = this.anIntArray51[local53];
			}
			if (arg8.anInt4408 >= 0) {
				if (arg8.anInt4408 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg8.anInt4408 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg8.anInt4415 >= 0) {
				if (arg8.anInt4415 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg8.anInt4415 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(134) boolean local134 = false;
		@Pc(136) boolean local136 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg8 != null || arg2 != null;
		@Pc(159) int local159 = arg4 == null ? 0 : arg4.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static36.aClass4_Sub1_Sub17Array4[local161] = null;
			if (arg4[local161] != null) {
				@Pc(179) Class138 local179 = arg9.method1397(arg4[local161].anInt5139);
				if (local179.anIntArray295 != null) {
					local152 = true;
					Static290.aClass138Array2[local161] = local179;
					local193 = arg4[local161].anInt5138;
					local198 = arg4[local161].anInt5140;
					@Pc(203) int local203 = local179.anIntArray295[local193];
					Static36.aClass4_Sub1_Sub17Array4[local161] = arg9.method1391(local203 >>> 16);
					@Pc(216) int local216 = local203 & 0xFFFF;
					Static254.anIntArray311[local161] = local216;
					if (Static36.aClass4_Sub1_Sub17Array4[local161] != null) {
						local136 |= Static36.aClass4_Sub1_Sub17Array4[local161].method4207(local216);
						local134 |= Static36.aClass4_Sub1_Sub17Array4[local161].method4214(local216);
						local144 |= Static36.aClass4_Sub1_Sub17Array4[local161].method4215(local216);
					}
					if ((local179.aBoolean405 || Static127.aBoolean244) && local198 != -1 && local198 < local179.anIntArray295.length) {
						Static227.anIntArray292[local161] = local179.anIntArray296[local193];
						Static361.anIntArray443[local161] = arg4[local161].anInt5142;
						@Pc(283) int local283 = local179.anIntArray295[local198];
						Static397.aClass4_Sub1_Sub17Array6[local161] = arg9.method1391(local283 >>> 16);
						@Pc(296) int local296 = local283 & 0xFFFF;
						Static54.anIntArray56[local161] = local296;
						if (Static397.aClass4_Sub1_Sub17Array6[local161] != null) {
							local136 |= Static397.aClass4_Sub1_Sub17Array6[local161].method4207(local296);
							local134 |= Static397.aClass4_Sub1_Sub17Array6[local161].method4214(local296);
							local144 |= Static397.aClass4_Sub1_Sub17Array6[local161].method4215(local296);
						}
					} else {
						Static227.anIntArray292[local161] = 0;
						Static361.anIntArray443[local161] = 0;
						Static397.aClass4_Sub1_Sub17Array6[local161] = null;
						Static54.anIntArray56[local161] = -1;
					}
				}
			}
		}
		@Pc(359) int local359 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(365) Class4_Sub1_Sub17 local365 = null;
		@Pc(367) Class4_Sub1_Sub17 local367 = null;
		@Pc(369) int local369 = -1;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = 0;
		@Pc(375) Class4_Sub1_Sub17 local375 = null;
		@Pc(377) Class4_Sub1_Sub17 local377 = null;
		if (local152) {
			@Pc(390) int local390;
			@Pc(450) int local450;
			if (arg8 != null) {
				local359 = arg8.anIntArray295[arg7];
				local390 = local359 >>> 16;
				local365 = arg9.method1391(local390);
				local359 &= 0xFFFF;
				if (local365 != null) {
					local136 |= local365.method4207(local359);
					local134 |= local365.method4214(local359);
					local144 |= local365.method4215(local359);
				}
				if ((arg8.aBoolean405 || Static127.aBoolean244) && arg6 != -1 && arg8.anIntArray295.length > arg6) {
					local198 = arg8.anIntArray296[arg7];
					local193 = arg8.anIntArray295[arg6];
					local450 = local193 >>> 16;
					local367 = local390 == local450 ? local365 : arg9.method1391(local450);
					local193 &= 0xFFFF;
					if (local367 != null) {
						local136 |= local367.method4207(local193);
						local134 |= local367.method4214(local193);
						local144 |= local367.method4215(local193);
					}
				}
			}
			local34 = arg3 | 0x20;
			if (arg2 != null) {
				local369 = arg2.anIntArray295[arg11];
				local390 = local369 >>> 16;
				local375 = arg9.method1391(local390);
				local369 &= 0xFFFF;
				if (local375 != null) {
					local136 |= local375.method4207(local369);
					local134 |= local375.method4214(local369);
					local144 |= local375.method4215(local369);
				}
				if ((arg2.aBoolean405 || Static127.aBoolean244) && arg10 != -1 && arg2.anIntArray295.length > arg10) {
					local371 = arg2.anIntArray295[arg10];
					local373 = arg2.anIntArray296[arg11];
					local450 = local371 >>> 16;
					local371 &= 0xFFFF;
					local377 = local390 == local450 ? local375 : arg9.method1391(local450);
					if (local377 != null) {
						local136 |= local377.method4207(local371);
						local134 |= local377.method4214(local371);
						local144 |= local377.method4215(local371);
					}
				}
			}
			if (local136) {
				local34 |= 0x80;
			}
			if (local134) {
				local34 |= 0x100;
			}
			if (local144) {
				local34 |= 0x400;
			}
		}
		@Pc(619) Class68 local619 = Static442.aClass68_58;
		@Pc(627) Class110 local627;
		synchronized (Static442.aClass68_58) {
			local627 = (Class110) Static442.aClass68_58.method1787(local37);
		}
		@Pc(635) Class151 local635 = null;
		if (this.anInt881 != -1) {
			local635 = arg0.method5325(this.anInt881);
		}
		@Pc(678) int local678;
		@Pc(684) int local684;
		if (local627 == null || arg12.method4269(local627.P(), local34) != 0 || local635 != null && local635.anIntArrayArray38 != null && this.anIntArrayArray9 == null) {
			if (local627 != null) {
				local34 = arg12.method4282(local34, local627.P());
			}
			@Pc(676) boolean local676 = false;
			local678 = 0;
			while (true) {
				if (local678 >= 12) {
					if (local676) {
						if (this.aLong36 != -1L) {
							@Pc(736) Class68 local736 = Static442.aClass68_58;
							synchronized (Static442.aClass68_58) {
								local627 = (Class110) Static442.aClass68_58.method1787(this.aLong36);
							}
						}
						if (local627 == null || arg12.method4269(local627.P(), local34) != 0 || local635 != null && local635.anIntArrayArray38 != null && this.anIntArrayArray9 == null) {
							return null;
						}
					} else {
						@Pc(772) Class122[] local772 = new Class122[12];
						@Pc(780) int local780;
						for (@Pc(774) int local774 = 0; local774 < 12; local774++) {
							local780 = local40[local774];
							@Pc(795) Class122 local795;
							if ((local780 & 0x40000000) != 0) {
								local795 = arg13.method4703(local780 & 0x3FFFFFFF).method4783(this.aBoolean83);
								if (local795 != null) {
									local772[local774] = local795;
								}
							} else if ((local780 & Integer.MIN_VALUE) != 0) {
								local795 = arg1.method2758(local780 & 0x3FFFFFFF).method4096();
								if (local795 != null) {
									local772[local774] = local795;
								}
							}
						}
						@Pc(853) int local853;
						if (local635 != null && local635.anIntArrayArray38 != null) {
							for (local780 = 0; local780 < local635.anIntArrayArray38.length; local780++) {
								if (local635.anIntArrayArray38[local780] != null && local772[local780] != null) {
									local853 = local635.anIntArrayArray38[local780][0];
									@Pc(860) int local860 = local635.anIntArrayArray38[local780][1];
									@Pc(867) int local867 = local635.anIntArrayArray38[local780][2];
									@Pc(876) int local876 = local635.anIntArrayArray38[local780][3] << 3;
									@Pc(885) int local885 = local635.anIntArrayArray38[local780][4] << 3;
									@Pc(894) int local894 = local635.anIntArrayArray38[local780][5] << 3;
									if (this.anIntArrayArray9 == null) {
										this.anIntArrayArray9 = new int[local635.anIntArrayArray38.length][];
									}
									if (this.anIntArrayArray9[local780] == null) {
										@Pc(916) int[] local916 = this.anIntArrayArray9[local780] = new int[15];
										if (local876 == 0 && local885 == 0 && local894 == 0) {
											local916[14] = -local867;
											local916[13] = -local860;
											local916[12] = -local853;
											local916[0] = local916[4] = local916[8] = 32768;
										} else {
											@Pc(932) int local932 = Class50_Sub1.anIntArray224[local876];
											@Pc(936) int local936 = Class50_Sub1.anIntArray225[local876];
											@Pc(940) int local940 = Class50_Sub1.anIntArray224[local885];
											@Pc(944) int local944 = Class50_Sub1.anIntArray225[local885];
											@Pc(948) int local948 = Class50_Sub1.anIntArray224[local894];
											@Pc(952) int local952 = Class50_Sub1.anIntArray225[local894];
											@Pc(960) int local960 = local948 * local936 + 16384 >> 15;
											@Pc(968) int local968 = local936 * local952 + 16384 >> 15;
											local916[8] = local940 * local932 + 16384 >> 15;
											local916[7] = -local952 * -local944 + local960 * local940 + 16384 >> 15;
											local916[2] = local932 * local944 + 16384 >> 15;
											local916[5] = -local936;
											local916[6] = -local944 * local948 + local940 * local968 + 16384 >> 15;
											local916[0] = local940 * local948 + local944 * local968 + 16384 >> 15;
											local916[4] = local932 * local948 + 16384 >> 15;
											local916[3] = local952 * local932 + 16384 >> 15;
											local916[1] = local944 * local960 + local940 * -local952 + 16384 >> 15;
											local916[13] = local916[1] * -local853 + -local860 * local916[4] + -local867 * local916[7] + 16384 >> 15;
											local916[14] = local916[2] * -local853 + local916[5] * -local860 + -local867 * local916[8] + 16384 >> 15;
											local916[12] = -local867 * local916[6] + -local860 * local916[3] + -local853 * local916[0] + 16384 >> 15;
										}
										local916[9] = local853;
										local916[10] = local860;
										local916[11] = local867;
									}
									if (local876 != 0 || local885 != 0 || local894 != 0) {
										local772[local780].method3053(local876, local885, local894);
									}
									if (local853 != 0 || local860 != 0 || local867 != 0) {
										local772[local780].method3041(local860, local853, local867);
									}
								}
							}
						}
						@Pc(1255) int local1255 = local34 | 0x4000;
						@Pc(1262) Class122 local1262 = new Class122(local772, local772.length);
						local627 = arg12.method4254(local1262, local1255, Static6.anInt62, 64, 850);
						for (local853 = 0; local853 < 5; local853++) {
							if (this.anIntArray52[local853] < Static26.aShortArrayArray2[local853].length) {
								local627.BA(Static299.aShortArray179[local853], Static26.aShortArrayArray2[local853][this.anIntArray52[local853]]);
							}
							if (this.anIntArray52[local853] < Static15.aShortArrayArray1[local853].length) {
								local627.BA(Static434.aShortArray252[local853], Static15.aShortArrayArray1[local853][this.anIntArray52[local853]]);
							}
						}
						local627.UA(local34);
						@Pc(1333) Class68 local1333 = Static442.aClass68_58;
						synchronized (Static442.aClass68_58) {
							Static442.aClass68_58.method1779(local37, local627);
						}
						this.aLong36 = local37;
					}
					break;
				}
				local684 = local40[local678];
				if ((local684 & 0x40000000) == 0) {
					if ((local684 & Integer.MIN_VALUE) != 0 && !arg1.method2758(local684 & 0x3FFFFFFF).method4095()) {
						local676 = true;
					}
				} else if (!arg13.method4703(local684 & 0x3FFFFFFF).method4784(this.aBoolean83)) {
					local676 = true;
				}
				local678++;
			}
		}
		@Pc(1355) Class110 local1355 = local627.method4887((byte) 4, local34, true);
		if (!local152) {
			return local1355;
		}
		@Pc(1361) int local1361 = 0;
		local678 = 1;
		while (local159 > local1361) {
			if (Static36.aClass4_Sub1_Sub17Array4[local1361] != null) {
				local1355.method4897(Static54.anIntArray56[local1361], Static397.aClass4_Sub1_Sub17Array6[local1361], this.anIntArrayArray9 == null ? null : this.anIntArrayArray9[local1361], false, Static254.anIntArray311[local1361], Static227.anIntArray292[local1361], Static36.aClass4_Sub1_Sub17Array4[local1361], Static361.anIntArray443[local1361] - 1, local678);
			}
			local1361++;
			local678 <<= 0x1;
		}
		if (local365 != null && local375 != null) {
			local1355.method4899(local359, local198, local377, false, local373, arg14 - 1, local369, local375, local365, local371, arg8.aBooleanArray14, local367, arg16 - 1, local193);
		} else if (local365 != null) {
			local1355.method4883(0, local198, false, local359, local193, local365, local367, arg16 - 1);
		} else if (local375 != null) {
			local1355.method4883(0, local373, false, local369, local371, local375, local377, arg14 - 1);
		}
		for (local684 = 0; local684 < local159; local684++) {
			Static36.aClass4_Sub1_Sub17Array4[local684] = null;
			Static397.aClass4_Sub1_Sub17Array6[local684] = null;
			Static290.aClass138Array2[local684] = null;
		}
		return local1355;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	private void method834() {
		this.aLong35 = -1L;
		@Pc(10) long[] local10 = Class80.aLongArray4;
		this.aLong35 = local10[(int) ((this.aLong35 ^ (long) (this.anInt881 >> 8)) & 0xFFL)] ^ this.aLong35 >>> 8;
		this.aLong35 = this.aLong35 >>> 8 ^ local10[(int) ((this.aLong35 ^ (long) this.anInt881) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong35 = local10[(int) (((long) (this.anIntArray51[local50] >> 24) ^ this.aLong35) & 0xFFL)] ^ this.aLong35 >>> 8;
			this.aLong35 = this.aLong35 >>> 8 ^ local10[(int) ((this.aLong35 ^ (long) (this.anIntArray51[local50] >> 16)) & 0xFFL)];
			this.aLong35 = this.aLong35 >>> 8 ^ local10[(int) ((this.aLong35 ^ (long) (this.anIntArray51[local50] >> 8)) & 0xFFL)];
			this.aLong35 = this.aLong35 >>> 8 ^ local10[(int) ((this.aLong35 ^ (long) this.anIntArray51[local50]) & 0xFFL)];
		}
		for (@Pc(153) int local153 = 0; local153 < 5; local153++) {
			this.aLong35 = local10[(int) ((this.aLong35 ^ (long) this.anIntArray52[local153]) & 0xFFL)] ^ this.aLong35 >>> 8;
		}
		this.aLong35 = this.aLong35 >>> 8 ^ local10[(int) (((long) (this.aBoolean83 ? 1 : 0) ^ this.aLong35) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZBII[I[I)V")
	public void method835(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 != this.anInt881) {
			this.anInt881 = arg2;
			this.anIntArrayArray9 = null;
		}
		this.anIntArray52 = arg4;
		this.aBoolean83 = arg0;
		this.anInt871 = arg1;
		this.anIntArray51 = arg3;
		this.method834();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!lp;ILclient!du;IILclient!in;IIILclient!ya;II)Lclient!t;")
	public Class110 method837(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class19 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(93) int local93;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg0.anIntArray295[arg9];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(43) Class4_Sub1_Sub17 local43 = arg1.method1391(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method4207(local47) | false;
				local11 = local43.method4214(local47) | false;
				local17 = local43.method4215(local47) | false;
				local15 = arg0.aBoolean406 | false;
			}
			if ((arg0.aBoolean405 || Static127.aBoolean244) && arg6 != -1 && arg6 < arg0.anIntArray295.length) {
				local93 = arg0.anIntArray295[arg6];
				@Pc(97) int local97 = local93 >>> 16;
				@Pc(101) int local101 = local93 & 0xFFFF;
				@Pc(115) Class4_Sub1_Sub17 local115;
				if (local38 == local97) {
					local115 = local43;
				} else {
					local115 = arg1.method1391(local101 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method4207(local101);
					local11 |= local115.method4214(local101);
					local17 |= local115.method4215(local101);
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
		@Pc(178) long local178 = (long) arg2 | (long) (arg5 << 16) | (long) arg3 << 32;
		@Pc(180) Class68 local180 = Static190.aClass68_20;
		@Pc(188) Class110 local188;
		synchronized (Static190.aClass68_20) {
			local188 = (Class110) Static190.aClass68_20.method1787(local178);
		}
		if (local188 == null || arg7.method4269(local188.P(), local7) != 0) {
			if (local188 != null) {
				local7 = arg7.method4282(local7, local188.P());
			}
			@Pc(218) Class122[] local218 = new Class122[3];
			local93 = 0;
			if (!arg4.method2758(arg2).method4093() || !arg4.method2758(arg5).method4093() || !arg4.method2758(arg3).method4093()) {
				return null;
			}
			@Pc(248) Class122 local248 = arg4.method2758(arg2).method4099();
			if (local248 != null) {
				local93++;
				local218[0] = local248;
			}
			local248 = arg4.method2758(arg5).method4099();
			if (local248 != null) {
				local218[local93++] = local248;
			}
			local248 = arg4.method2758(arg3).method4099();
			if (local248 != null) {
				local218[local93++] = local248;
			}
			@Pc(287) int local287 = local7 | 0x4000;
			local248 = new Class122(local218, local93);
			local188 = arg7.method4254(local248, local287, Static6.anInt62, 64, 768);
			for (@Pc(303) int local303 = 0; local303 < 5; local303++) {
				if (this.anIntArray52[local303] < Static26.aShortArrayArray2[local303].length) {
					local188.BA(Static299.aShortArray179[local303], Static26.aShortArrayArray2[local303][this.anIntArray52[local303]]);
				}
				if (this.anIntArray52[local303] < Static15.aShortArrayArray1[local303].length) {
					local188.BA(Static434.aShortArray252[local303], Static15.aShortArrayArray1[local303][this.anIntArray52[local303]]);
				}
			}
			local188.UA(local7);
			@Pc(362) Class68 local362 = Static190.aClass68_20;
			synchronized (Static190.aClass68_20) {
				Static190.aClass68_20.method1779(local178, local188);
			}
		}
		if (arg0 == null) {
			return local188;
		} else {
			local188 = local188.method4887((byte) 4, local7, true);
			return arg0.method3456(arg8, 2048, arg6, arg9, local188);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
	public void method838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray52[arg0] = arg1;
		this.method834();
	}
}
