import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class117 {

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public static int anInt3183 = 0;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_134 = new Class89(23, 8);

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_122 = new Class145(40, 7);

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public int anInt3181 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([I[IZIIZ)V", line = 6)
	public void method3181(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aBoolean220 = arg2;
		if (this.anInt3186 != arg4) {
			this.anInt3186 = arg4;
			this.anIntArrayArray24 = null;
		}
		this.anIntArray193 = arg1;
		this.anIntArray194 = arg0;
		this.anInt3181 = arg3;
		this.method3190();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!e;III)V", line = 29)
	public void method3182(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Class2_Sub2_Sub16.anIntArray416[arg1];
		if (this.anIntArray193[local7] != 0 && arg0.method1786(arg2) != null) {
			this.anIntArray193[local7] = Integer.MIN_VALUE | arg2;
			this.method3190();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V", line = 65)
	public void method3184(@OriginalArg(0) boolean arg0) {
		this.aBoolean220 = arg0;
		this.method3190();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!gp;Lclient!wl;ZIILclient!nb;Lclient!ta;Lclient!e;Lclient!wm;ILclient!io;)Lclient!gn;", line = 81)
	public Class31 method3185(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class157 arg4, @OriginalArg(7) Class219 arg5, @OriginalArg(8) Class55 arg6, @OriginalArg(9) Class19 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class107 arg9) {
		if (this.anInt3181 != -1) {
			return arg5.method5571(this.anInt3181).method2090(arg3, arg8, arg0, arg7, arg4, arg2, arg1);
		}
		@Pc(27) int local27 = 1024;
		@Pc(35) boolean local35;
		@Pc(46) int local46;
		@Pc(109) int local109;
		@Pc(56) int local56;
		@Pc(113) int local113;
		if (arg4 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			local46 = arg4.anIntArray262[arg0];
			local27 = 1056;
			local56 = local46 >>> 16;
			@Pc(60) int local60 = local46 & 0xFFFF;
			@Pc(65) Class2_Sub2_Sub13 local65 = arg1.method2370(local56);
			if (local65 != null) {
				local33 = local65.method4238(local60) | false;
				local31 = local65.method4236(local60) | false;
				local35 = arg4.aBoolean263 | false;
			}
			if ((arg4.aBoolean264 || Class213.aBoolean408) && arg8 != -1 && arg8 < arg4.anIntArray262.length) {
				local109 = arg4.anIntArray262[arg8];
				local113 = local109 >>> 16;
				@Pc(117) int local117 = local109 & 0xFFFF;
				@Pc(127) Class2_Sub2_Sub13 local127 = local113 == local56 ? local65 : arg1.method2370(local113);
				if (local127 != null) {
					local33 |= local127.method4238(local117);
					local31 |= local127.method4236(local117);
				}
			}
			if (local33) {
				local27 = 1184;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
		}
		@Pc(163) Class98 local163 = Class230.aClass98_58;
		@Pc(172) Class31 local172;
		synchronized (Class230.aClass98_58) {
			local172 = (Class31) Class230.aClass98_58.method2614(this.aLong107);
		}
		if (local172 == null || arg7.method2865(local172.method3828(), local27) != 0) {
			if (local172 != null) {
				local27 = arg7.method2808(local27, local172.method3828());
			}
			local35 = false;
			for (local46 = 0; local46 < 12; local46++) {
				local109 = this.anIntArray193[local46];
				if ((local109 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local109) != 0 && !arg6.method1786(local109 & 0x3FFFFFFF).method2270()) {
						local35 = true;
					}
				} else if (!arg9.method2761(local109 & 0x3FFFFFFF).method4784(this.aBoolean220)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(260) Class185[] local260 = new Class185[12];
			@Pc(262) int local262 = 0;
			for (@Pc(264) int local264 = 0; local264 < 12; local264++) {
				local56 = this.anIntArray193[local264];
				@Pc(286) Class185 local286;
				if ((local56 & 0x40000000) != 0) {
					local286 = arg9.method2761(local56 & 0x3FFFFFFF).method4779(this.aBoolean220);
					if (local286 != null) {
						local260[local262++] = local286;
					}
				} else if ((Integer.MIN_VALUE & local56) != 0) {
					local286 = arg6.method1786(local56 & 0x3FFFFFFF).method2275();
					if (local286 != null) {
						local260[local262++] = local286;
					}
				}
			}
			@Pc(325) Class185 local325 = new Class185(local260, local262);
			@Pc(329) int local329 = local27 | 0x2000;
			local172 = arg7.method2866(local325, local329, Static216.anInt4193, 64, 768);
			for (local113 = 0; local113 < 5; local113++) {
				if (this.anIntArray194[local113] < Static328.aShortArrayArray7[local113].length) {
					local172.method3839(Static10.aShortArray1[local113], Static328.aShortArrayArray7[local113][this.anIntArray194[local113]]);
				}
				if (Static174.aShortArrayArray6[local113].length > this.anIntArray194[local113]) {
					local172.method3839(Static40.aShortArray19[local113], Static174.aShortArrayArray6[local113][this.anIntArray194[local113]]);
				}
			}
			local172.method3815(local27);
			@Pc(398) Class98 local398 = Class230.aClass98_58;
			synchronized (Class230.aClass98_58) {
				Class230.aClass98_58.method2626(this.aLong107, local172);
			}
		}
		if (arg4 == null) {
			return local172;
		} else {
			local172.method3801((byte) 4, local27, true);
			return arg4.method3987(local172, arg0, 1024, arg3, arg8);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!e;ILclient!nb;IIILclient!gp;Lclient!wm;II)Lclient!gn;", line = 270)
	public Class31 method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(4) Class157 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class85 arg6, @OriginalArg(9) Class19 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg3 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg3.anIntArray262[arg8];
			local36 = local32 >>> 16;
			@Pc(40) int local40 = local32 & 0xFFFF;
			@Pc(45) Class2_Sub2_Sub13 local45 = arg6.method2370(local36);
			if (local45 != null) {
				local13 = local45.method4238(local40) | false;
				local11 = local45.method4236(local40) | false;
				local15 = arg3.aBoolean263 | false;
			}
			if ((arg3.aBoolean264 || Class213.aBoolean408) && arg4 != -1 && arg3.anIntArray262.length > arg4) {
				@Pc(84) int local84 = arg3.anIntArray262[arg4];
				@Pc(88) int local88 = local84 >>> 16;
				@Pc(92) int local92 = local84 & 0xFFFF;
				@Pc(108) Class2_Sub2_Sub13 local108;
				if (local88 == local36) {
					local108 = local45;
				} else {
					local108 = arg6.method2370(local92 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method4238(local92);
					local11 |= local108.method4236(local92);
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
		@Pc(160) long local160 = (long) (arg1 << 16) | (long) arg0 << 32 | (long) arg5;
		@Pc(162) Class98 local162 = Class230.aClass98_58;
		@Pc(170) Class31 local170;
		synchronized (Class230.aClass98_58) {
			local170 = (Class31) Class230.aClass98_58.method2614(local160);
		}
		if (local170 == null || arg7.method2865(local170.method3828(), local7) != 0) {
			if (local170 != null) {
				local7 = arg7.method2808(local7, local170.method3828());
			}
			@Pc(197) Class185[] local197 = new Class185[3];
			@Pc(199) int local199 = 0;
			if (!arg2.method1786(arg5).method2270() || !arg2.method1786(arg1).method2270() || !arg2.method1786(arg0).method2270()) {
				return null;
			}
			@Pc(227) Class185 local227 = arg2.method1786(arg5).method2275();
			if (local227 != null) {
				local199++;
				local197[0] = local227;
			}
			local227 = arg2.method1786(arg1).method2275();
			if (local227 != null) {
				local197[local199++] = local227;
			}
			local227 = arg2.method1786(arg0).method2275();
			if (local227 != null) {
				local197[local199++] = local227;
			}
			local227 = new Class185(local197, local199);
			local32 = local7 | 0x2000;
			local170 = arg7.method2866(local227, local32, Static216.anInt4193, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static328.aShortArrayArray7[local36].length > this.anIntArray194[local36]) {
					local170.method3839(Static10.aShortArray1[local36], Static328.aShortArrayArray7[local36][this.anIntArray194[local36]]);
				}
				if (Static174.aShortArrayArray6[local36].length > this.anIntArray194[local36]) {
					local170.method3839(Static40.aShortArray19[local36], Static174.aShortArrayArray6[local36][this.anIntArray194[local36]]);
				}
			}
			local170.method3815(local7);
			@Pc(347) Class98 local347 = Class230.aClass98_58;
			synchronized (Class230.aClass98_58) {
				Class230.aClass98_58.method2626(local160, local170);
			}
		}
		if (arg3 == null) {
			return local170;
		} else {
			local170 = local170.method3801((byte) 4, local7, true);
			return arg3.method3987(local170, arg8, 1024, arg9, arg4);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 430)
	public void method3188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray194[arg0] = arg1;
		this.method3190();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 454)
	private void method3190() {
		@Pc(7) long[] local7 = Class4.aLongArray1;
		this.aLong107 = -1L;
		this.aLong107 = local7[(int) ((this.aLong107 ^ (long) (this.anInt3186 >> 8)) & 0xFFL)] ^ this.aLong107 >>> 8;
		this.aLong107 = local7[(int) (((long) this.anInt3186 ^ this.aLong107) & 0xFFL)] ^ this.aLong107 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong107 = this.aLong107 >>> 8 ^ local7[(int) ((this.aLong107 ^ (long) (this.anIntArray193[local54] >> 24)) & 0xFFL)];
			this.aLong107 = local7[(int) (((long) (this.anIntArray193[local54] >> 16) ^ this.aLong107) & 0xFFL)] ^ this.aLong107 >>> 8;
			this.aLong107 = local7[(int) (((long) (this.anIntArray193[local54] >> 8) ^ this.aLong107) & 0xFFL)] ^ this.aLong107 >>> 8;
			this.aLong107 = local7[(int) ((this.aLong107 ^ (long) this.anIntArray193[local54]) & 0xFFL)] ^ this.aLong107 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong107 = local7[(int) (((long) this.anIntArray194[local150] ^ this.aLong107) & 0xFFL)] ^ this.aLong107 >>> 8;
		}
		this.aLong107 = this.aLong107 >>> 8 ^ local7[(int) (((long) (this.aBoolean220 ? 1 : 0) ^ this.aLong107) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLclient!ak;Lclient!gp;Lclient!e;Lclient!nb;IIIIZILclient!nb;Lclient!wl;Lclient!io;Lclient!wm;Lclient!ta;[Lclient!bg;I)Lclient!gn;", line = 505)
	public Class31 method3192(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class85 arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class157 arg10, @OriginalArg(13) Interface11 arg11, @OriginalArg(14) Class107 arg12, @OriginalArg(15) Class19 arg13, @OriginalArg(16) Class219 arg14, @OriginalArg(17) Class20[] arg15, @OriginalArg(18) int arg16) {
		if (this.anInt3181 != -1) {
			return arg14.method5571(this.anInt3181).method2088(arg1, arg16, arg4, arg13, arg2, arg6, arg9, arg8, arg10, arg7, arg15, arg0, arg11, arg5);
		}
		@Pc(33) int local33 = arg7;
		@Pc(36) long local36 = this.aLong107;
		@Pc(39) int[] local39 = this.anIntArray193;
		if (arg4 != null && (arg4.anInt4025 >= 0 || arg4.anInt4029 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray193[local52];
			}
			if (arg4.anInt4025 >= 0) {
				if (arg4.anInt4025 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg4.anInt4025 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg4.anInt4029 >= 0) {
				if (arg4.anInt4029 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg4.anInt4029 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg4 != null || arg10 != null;
		@Pc(156) int local156 = arg15 == null ? 0 : arg15.length;
		@Pc(190) int local190;
		@Pc(195) int local195;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local158] = null;
			if (arg15[local158] != null) {
				@Pc(176) Class157 local176 = arg2.method2373(arg15[local158].anInt624);
				if (local176.anIntArray262 != null) {
					Class83.aClass157Array14[local158] = local176;
					local149 = true;
					local190 = arg15[local158].anInt628;
					local195 = arg15[local158].anInt627;
					@Pc(200) int local200 = local176.anIntArray262[local190];
					Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local158] = arg2.method2370(local200 >>> 16);
					@Pc(213) int local213 = local200 & 0xFFFF;
					Class11_Sub2.anIntArray219[local158] = local213;
					if (Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local158] != null) {
						local141 |= Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local158].method4238(local213);
						local139 |= Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local158].method4236(local213);
					}
					if ((local176.aBoolean264 || Class213.aBoolean408) && local195 != -1 && local176.anIntArray262.length > local195) {
						Class198.anIntArray381[local158] = local176.anIntArray261[local190];
						Class211.anIntArray396[local158] = arg15[local158].anInt625;
						@Pc(290) int local290 = local176.anIntArray262[local195];
						Class2_Sub44.aClass2_Sub2_Sub13Array4[local158] = arg2.method2370(local290 >>> 16);
						@Pc(303) int local303 = local290 & 0xFFFF;
						Class225.anIntArray429[local158] = local303;
						if (Class2_Sub44.aClass2_Sub2_Sub13Array4[local158] != null) {
							local141 |= Class2_Sub44.aClass2_Sub2_Sub13Array4[local158].method4238(local303);
							local139 |= Class2_Sub44.aClass2_Sub2_Sub13Array4[local158].method4236(local303);
						}
					} else {
						Class198.anIntArray381[local158] = 0;
						Class211.anIntArray396[local158] = 0;
						Class2_Sub44.aClass2_Sub2_Sub13Array4[local158] = null;
						Class225.anIntArray429[local158] = -1;
					}
				}
			}
		}
		@Pc(339) int local339 = -1;
		local190 = -1;
		local195 = 0;
		@Pc(345) Class2_Sub2_Sub13 local345 = null;
		@Pc(347) Class2_Sub2_Sub13 local347 = null;
		@Pc(349) int local349 = -1;
		@Pc(351) int local351 = -1;
		@Pc(353) int local353 = 0;
		@Pc(355) Class2_Sub2_Sub13 local355 = null;
		@Pc(357) Class2_Sub2_Sub13 local357 = null;
		if (local149) {
			@Pc(370) int local370;
			@Pc(427) int local427;
			if (arg4 != null) {
				local339 = arg4.anIntArray262[arg16];
				local370 = local339 >>> 16;
				local339 &= 0xFFFF;
				local345 = arg2.method2370(local370);
				if (local345 != null) {
					local141 |= local345.method4238(local339);
					local139 |= local345.method4236(local339);
				}
				if ((arg4.aBoolean264 || Class213.aBoolean408) && arg5 != -1 && arg5 < arg4.anIntArray262.length) {
					local195 = arg4.anIntArray261[arg16];
					local190 = arg4.anIntArray262[arg5];
					local427 = local190 >>> 16;
					local347 = local427 == local370 ? local345 : arg2.method2370(local427);
					local190 &= 0xFFFF;
					if (local347 != null) {
						local141 |= local347.method4238(local190);
						local139 |= local347.method4236(local190);
					}
				}
			}
			local33 = arg7 | 0x20;
			if (arg10 != null) {
				local349 = arg10.anIntArray262[arg9];
				local370 = local349 >>> 16;
				local355 = arg2.method2370(local370);
				local349 &= 0xFFFF;
				if (local355 != null) {
					local141 |= local355.method4238(local349);
					local139 |= local355.method4236(local349);
				}
				if ((arg10.aBoolean264 || Class213.aBoolean408) && arg8 != -1 && arg10.anIntArray262.length > arg8) {
					local353 = arg10.anIntArray261[arg9];
					local351 = arg10.anIntArray262[arg8];
					local427 = local351 >>> 16;
					local351 &= 0xFFFF;
					local357 = local370 == local427 ? local355 : arg2.method2370(local427);
					if (local357 != null) {
						local141 |= local357.method4238(local351);
						local139 |= local357.method4236(local351);
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
		@Pc(581) Class98 local581 = Class68.aClass98_9;
		@Pc(589) Class31 local589;
		synchronized (Class68.aClass98_9) {
			local589 = (Class31) Class68.aClass98_9.method2614(local36);
		}
		@Pc(597) Class222 local597 = null;
		if (this.anInt3186 != -1) {
			local597 = arg1.method245(this.anInt3186);
		}
		@Pc(640) int local640;
		@Pc(646) int local646;
		if (local589 == null || arg13.method2865(local589.method3828(), local33) != 0 || local597 != null && local597.anIntArrayArray53 != null && this.anIntArrayArray24 == null) {
			if (local589 != null) {
				local33 = arg13.method2808(local33, local589.method3828());
			}
			@Pc(638) boolean local638 = false;
			local640 = 0;
			while (true) {
				if (local640 >= 12) {
					if (local638) {
						if (this.aLong106 != -1L) {
							@Pc(696) Class98 local696 = Class68.aClass98_9;
							synchronized (Class68.aClass98_9) {
								local589 = (Class31) Class68.aClass98_9.method2614(this.aLong106);
							}
						}
						if (local589 == null || arg13.method2865(local589.method3828(), local33) != 0 || local597 != null && local597.anIntArrayArray53 != null && this.anIntArrayArray24 == null) {
							return null;
						}
					} else {
						@Pc(735) Class185[] local735 = new Class185[12];
						@Pc(743) int local743;
						for (@Pc(737) int local737 = 0; local737 < 12; local737++) {
							local743 = local39[local737];
							@Pc(763) Class185 local763;
							if ((local743 & 0x40000000) != 0) {
								local763 = arg12.method2761(local743 & 0x3FFFFFFF).method4780(this.aBoolean220);
								if (local763 != null) {
									local735[local737] = local763;
								}
							} else if ((local743 & Integer.MIN_VALUE) != 0) {
								local763 = arg3.method1786(local743 & 0x3FFFFFFF).method2277();
								if (local763 != null) {
									local735[local737] = local763;
								}
							}
						}
						@Pc(821) int local821;
						if (local597 != null && local597.anIntArrayArray53 != null) {
							for (local743 = 0; local743 < local597.anIntArrayArray53.length; local743++) {
								if (local597.anIntArrayArray53[local743] != null && local735[local743] != null) {
									local821 = local597.anIntArrayArray53[local743][0];
									@Pc(828) int local828 = local597.anIntArrayArray53[local743][1];
									@Pc(835) int local835 = local597.anIntArrayArray53[local743][2];
									@Pc(844) int local844 = local597.anIntArrayArray53[local743][3] << 3;
									@Pc(853) int local853 = local597.anIntArrayArray53[local743][4] << 3;
									@Pc(862) int local862 = local597.anIntArrayArray53[local743][5] << 3;
									if (this.anIntArrayArray24 == null) {
										this.anIntArrayArray24 = new int[local597.anIntArrayArray53.length][];
									}
									if (this.anIntArrayArray24[local743] == null) {
										@Pc(884) int[] local884 = this.anIntArrayArray24[local743] = new int[15];
										if (local844 == 0 && local853 == 0 && local862 == 0) {
											local884[13] = -local828;
											local884[12] = -local821;
											local884[0] = local884[4] = local884[8] = 32768;
											local884[14] = -local835;
										} else {
											@Pc(894) int local894 = Class19.anIntArray177[local844];
											@Pc(898) int local898 = Class19.anIntArray178[local844];
											@Pc(902) int local902 = Class19.anIntArray177[local853];
											@Pc(906) int local906 = Class19.anIntArray178[local853];
											@Pc(910) int local910 = Class19.anIntArray177[local862];
											@Pc(914) int local914 = Class19.anIntArray178[local862];
											@Pc(922) int local922 = local910 * local898 + 16384 >> 15;
											@Pc(930) int local930 = local898 * local914 + 16384 >> 15;
											local884[1] = local922 * local906 + local902 * -local914 + 16384 >> 15;
											local884[6] = local902 * local930 + local910 * -local906 + 16384 >> 15;
											local884[0] = local910 * local902 + local906 * local930 + 16384 >> 15;
											local884[3] = local894 * local914 + 16384 >> 15;
											local884[2] = local894 * local906 + 16384 >> 15;
											local884[7] = -local906 * -local914 + local922 * local902 + 16384 >> 15;
											local884[8] = local902 * local894 + 16384 >> 15;
											local884[4] = local894 * local910 + 16384 >> 15;
											local884[5] = -local898;
											local884[14] = -local835 * local884[8] + -local821 * local884[2] + local884[5] * -local828 + 16384 >> 15;
											local884[12] = local884[6] * -local835 + local884[0] * -local821 + -local828 * local884[3] + 16384 >> 15;
											local884[13] = local884[1] * -local821 + local884[4] * -local828 + local884[7] * -local835 + 16384 >> 15;
										}
										local884[11] = local835;
										local884[9] = local821;
										local884[10] = local828;
									}
									if (local844 != 0 || local853 != 0 || local862 != 0) {
										local735[local743].method4665(local853, local862, local844);
									}
									if (local821 != 0 || local828 != 0 || local835 != 0) {
										local735[local743].method4657(local821, local835, local828);
									}
								}
							}
						}
						@Pc(1209) Class185 local1209 = new Class185(local735, local735.length);
						@Pc(1213) int local1213 = local33 | 0x2000;
						local589 = arg13.method2866(local1209, local1213, Static216.anInt4193, 64, 850);
						for (local821 = 0; local821 < 5; local821++) {
							if (this.anIntArray194[local821] < Static328.aShortArrayArray7[local821].length) {
								local589.method3839(Static10.aShortArray1[local821], Static328.aShortArrayArray7[local821][this.anIntArray194[local821]]);
							}
							if (Static174.aShortArrayArray6[local821].length > this.anIntArray194[local821]) {
								local589.method3839(Static40.aShortArray19[local821], Static174.aShortArrayArray6[local821][this.anIntArray194[local821]]);
							}
						}
						local589.method3815(local33);
						@Pc(1288) Class98 local1288 = Class68.aClass98_9;
						synchronized (Class68.aClass98_9) {
							Class68.aClass98_9.method2626(local36, local589);
						}
						this.aLong106 = local36;
					}
					break;
				}
				local646 = local39[local640];
				if ((local646 & 0x40000000) == 0) {
					if ((local646 & Integer.MIN_VALUE) != 0 && !arg3.method1786(local646 & 0x3FFFFFFF).method2272()) {
						local638 = true;
					}
				} else if (!arg12.method2761(local646 & 0x3FFFFFFF).method4771(this.aBoolean220)) {
					local638 = true;
				}
				local640++;
			}
		}
		@Pc(1310) Class31 local1310 = local589.method3801((byte) 4, local33, true);
		if (!local149) {
			return local1310;
		}
		@Pc(1316) int local1316 = 0;
		local640 = 1;
		while (local1316 < local156) {
			if (Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local1316] != null) {
				local1310.method3824(Class198.anIntArray381[local1316], Class211.anIntArray396[local1316] - 1, Class2_Sub44.aClass2_Sub2_Sub13Array4[local1316], local640, Class11_Sub2.anIntArray219[local1316], Class225.anIntArray429[local1316], Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local1316], false, this.anIntArrayArray24 == null ? null : this.anIntArrayArray24[local1316]);
			}
			local1316++;
			local640 <<= 0x1;
		}
		if (local345 != null && local355 != null) {
			local1310.method3812(local195, arg0 - 1, arg4.aBooleanArray37, arg6 - 1, false, local349, local351, local190, local355, local347, local353, local357, local345, local339);
		} else if (local345 != null) {
			local1310.method3829(local195, local347, local190, false, arg0 - 1, local339, local345, 0);
		} else if (local355 != null) {
			local1310.method3829(local353, local357, local351, false, arg6 - 1, local349, local355, 0);
		}
		for (local646 = 0; local646 < local156; local646++) {
			Class2_Sub3_Sub6.aClass2_Sub2_Sub13Array2[local646] = null;
			Class2_Sub44.aClass2_Sub2_Sub13Array4[local646] = null;
			Class83.aClass157Array14[local646] = null;
		}
		return local1310;
	}
}
