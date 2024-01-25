import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class26 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
	public boolean aBoolean22;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public int anInt541 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ[I[IBI)V")
	public void method506(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (this.anInt544 != arg0) {
			this.anIntArrayArray17 = null;
			this.anInt544 = arg0;
		}
		this.anIntArray51 = arg2;
		this.anIntArray52 = arg3;
		this.aBoolean22 = arg1;
		this.anInt541 = arg4;
		this.method507();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	private void method507() {
		@Pc(5) long[] local5 = Class264.aLongArray8;
		this.aLong40 = -1L;
		this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) (((long) (this.anInt544 >> 8) ^ this.aLong40) & 0xFFL)];
		this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) (((long) this.anInt544 ^ this.aLong40) & 0xFFL)];
		for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
			this.aLong40 = local5[(int) (((long) (this.anIntArray51[local48] >> 24) ^ this.aLong40) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = local5[(int) ((this.aLong40 ^ (long) (this.anIntArray51[local48] >> 16)) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) ((this.aLong40 ^ (long) (this.anIntArray51[local48] >> 8)) & 0xFFL)];
			this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) ((this.aLong40 ^ (long) this.anIntArray51[local48]) & 0xFFL)];
		}
		for (@Pc(141) int local141 = 0; local141 < 5; local141++) {
			this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) (((long) this.anIntArray52[local141] ^ this.aLong40) & 0xFFL)];
		}
		this.aLong40 = this.aLong40 >>> 8 ^ local5[(int) ((this.aLong40 ^ (long) (this.aBoolean22 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public void method508(@OriginalArg(0) boolean arg0) {
		this.aBoolean22 = arg0;
		this.method507();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray52[arg1] = arg0;
		this.method507();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!mr;I)V")
	public void method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2) {
		@Pc(7) int local7 = Static20.anIntArray40[arg1];
		if (this.anIntArray51[local7] != 0 && arg2.method3695(arg0) != null) {
			this.anIntArray51[local7] = arg0 | Integer.MIN_VALUE;
			this.method507();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!wp;Lclient!fk;ILclient!rd;Lclient!dk;ILclient!za;Lclient!hg;ILclient!mr;I)Lclient!e;")
	public Class63 method512(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(4) Interface10 arg3, @OriginalArg(5) Class54 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class75 arg6, @OriginalArg(8) Class109 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class174 arg9) {
		if (this.anInt541 != -1) {
			return arg4.method1128(this.anInt541).method1894(arg0, arg5, arg6, arg7, arg2, arg3, arg8);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(113) int local113;
		@Pc(58) int local58;
		if (arg7 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg7.anIntArray240[arg8];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class2_Sub1_Sub12 local63 = arg2.method1871(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method3895(local67) | false;
				local31 = local63.method3890(local67) | false;
				local37 = local63.method3889(local67) | false;
				local35 = arg7.aBoolean173 | false;
			}
			if ((arg7.aBoolean172 || Static83.aBoolean76) && arg5 != -1 && arg7.anIntArray240.length > arg5) {
				local113 = arg7.anIntArray240[arg5];
				@Pc(117) int local117 = local113 >>> 16;
				@Pc(121) int local121 = local113 & 0xFFFF;
				@Pc(135) Class2_Sub1_Sub12 local135 = local117 == local58 ? local63 : arg2.method1871(local117);
				if (local135 != null) {
					local33 |= local135.method3895(local121);
					local31 |= local135.method3890(local121);
					local37 |= local135.method3889(local121);
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
		@Pc(184) Class188 local184 = Static194.aClass188_32;
		@Pc(193) Class63 local193;
		synchronized (Static194.aClass188_32) {
			local193 = (Class63) Static194.aClass188_32.method4158(this.aLong40);
		}
		if (local193 == null || arg6.method6023(local193.RA(), local27) != 0) {
			if (local193 != null) {
				local27 = arg6.method5987(local27, local193.RA());
			}
			local35 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local48 = this.anIntArray51[local229];
				if ((local48 & 0x40000000) == 0) {
					if ((local48 & Integer.MIN_VALUE) != 0 && !arg9.method3695(local48 & 0x3FFFFFFF).method2828()) {
						local35 = true;
					}
				} else if (!arg1.method6193(local48 & 0x3FFFFFFF).method5011(this.aBoolean22)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(284) Class76[] local284 = new Class76[12];
			local113 = 0;
			for (@Pc(288) int local288 = 0; local288 < 12; local288++) {
				@Pc(295) int local295 = this.anIntArray51[local288];
				@Pc(315) Class76 local315;
				if ((local295 & 0x40000000) != 0) {
					local315 = arg1.method6193(local295 & 0x3FFFFFFF).method5006(this.aBoolean22);
					if (local315 != null) {
						local284[local113++] = local315;
					}
				} else if ((local295 & Integer.MIN_VALUE) != 0) {
					local315 = arg9.method3695(local295 & 0x3FFFFFFF).method2826();
					if (local315 != null) {
						local284[local113++] = local315;
					}
				}
			}
			@Pc(354) Class76 local354 = new Class76(local284, local113);
			@Pc(358) int local358 = local27 | 0x4000;
			local193 = arg6.method6016(local354, local358, Static111.anInt1853, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (this.anIntArray52[local58] < Static373.aShortArrayArray6[local58].length) {
					local193.q(Static172.aShortArray46[local58], Static373.aShortArrayArray6[local58][this.anIntArray52[local58]]);
				}
				if (Static388.aShortArrayArray8[local58].length > this.anIntArray52[local58]) {
					local193.q(Static164.aShortArray45[local58], Static388.aShortArrayArray8[local58][this.anIntArray52[local58]]);
				}
			}
			local193.D(local27);
			@Pc(425) Class188 local425 = Static194.aClass188_32;
			synchronized (Static194.aClass188_32) {
				Static194.aClass188_32.method4155(this.aLong40, local193);
			}
		}
		if (arg7 == null) {
			return local193;
		} else {
			local193.method6296((byte) 4, local27, true);
			return arg7.method2297(arg0, 2048, arg5, arg8, local193);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!fk;IIIIIILclient!za;Lclient!mr;IILclient!hg;)Lclient!e;")
	public Class63 method514(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class75 arg7, @OriginalArg(8) Class174 arg8, @OriginalArg(11) Class109 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg9 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg9.anIntArray240[arg6];
			@Pc(38) int local38 = local32 >>> 16;
			@Pc(42) int local42 = local32 & 0xFFFF;
			@Pc(47) Class2_Sub1_Sub12 local47 = arg0.method1871(local38);
			if (local47 != null) {
				local13 = local47.method3895(local42) | false;
				local11 = local47.method3890(local42) | false;
				local17 = local47.method3889(local42) | false;
				local15 = arg9.aBoolean173 | false;
			}
			if ((arg9.aBoolean172 || Static83.aBoolean76) && arg5 != -1 && arg5 < arg9.anIntArray240.length) {
				local100 = arg9.anIntArray240[arg5];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(118) Class2_Sub1_Sub12 local118;
				if (local38 == local104) {
					local118 = local47;
				} else {
					local118 = arg0.method1871(local108 >>> 16);
				}
				if (local118 != null) {
					local13 |= local118.method3895(local108);
					local11 |= local118.method3890(local108);
					local17 |= local118.method3889(local108);
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
		@Pc(183) long local183 = (long) arg1 << 32 | (long) (arg3 << 16) | (long) arg2;
		@Pc(185) Class188 local185 = Static194.aClass188_32;
		@Pc(193) Class63 local193;
		synchronized (Static194.aClass188_32) {
			local193 = (Class63) Static194.aClass188_32.method4158(local183);
		}
		if (local193 == null || arg7.method6023(local193.RA(), local7) != 0) {
			if (local193 != null) {
				local7 = arg7.method5987(local7, local193.RA());
			}
			@Pc(223) Class76[] local223 = new Class76[3];
			local100 = 0;
			if (!arg8.method3695(arg2).method2828() || !arg8.method3695(arg3).method2828() || !arg8.method3695(arg1).method2828()) {
				return null;
			}
			@Pc(255) Class76 local255 = arg8.method3695(arg2).method2826();
			if (local255 != null) {
				local100++;
				local223[0] = local255;
			}
			local255 = arg8.method3695(arg3).method2826();
			if (local255 != null) {
				local223[local100++] = local255;
			}
			local255 = arg8.method3695(arg1).method2826();
			if (local255 != null) {
				local223[local100++] = local255;
			}
			@Pc(294) int local294 = local7 | 0x4000;
			local255 = new Class76(local223, local100);
			local193 = arg7.method6016(local255, local294, Static111.anInt1853, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (this.anIntArray52[local310] < Static373.aShortArrayArray6[local310].length) {
					local193.q(Static172.aShortArray46[local310], Static373.aShortArrayArray6[local310][this.anIntArray52[local310]]);
				}
				if (Static388.aShortArrayArray8[local310].length > this.anIntArray52[local310]) {
					local193.q(Static164.aShortArray45[local310], Static388.aShortArrayArray8[local310][this.anIntArray52[local310]]);
				}
			}
			local193.D(local7);
			@Pc(367) Class188 local367 = Static194.aClass188_32;
			synchronized (Static194.aClass188_32) {
				Static194.aClass188_32.method4155(local183, local193);
			}
		}
		if (arg9 == null) {
			return local193;
		} else {
			local193 = local193.method6296((byte) 4, local7, true);
			return arg9.method2297(arg4, 2048, arg5, arg6, local193);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!hg;Lclient!wp;Lclient!dk;Lclient!hg;BIZLclient!vq;Lclient!za;IIIILclient!mr;II[Lclient!gg;Lclient!fk;Lclient!rd;)Lclient!e;")
	public Class63 method515(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class262 arg5, @OriginalArg(8) Class75 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) Class174 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) Class92[] arg14, @OriginalArg(17) Class80 arg15, @OriginalArg(18) Interface10 arg16) {
		if (this.anInt541 != -1) {
			return arg2.method1128(this.anInt541).method1896(arg0, arg12, arg13, arg3, arg6, arg4, arg7, arg8, arg9, arg5, arg15, arg10, arg16, arg14);
		}
		@Pc(32) int local32 = arg8;
		@Pc(35) long local35 = this.aLong40;
		@Pc(38) int[] local38 = this.anIntArray51;
		if (arg3 != null && (arg3.anInt2775 >= 0 || arg3.anInt2776 >= 0)) {
			local38 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local38[local51] = this.anIntArray51[local51];
			}
			if (arg3.anInt2775 >= 0) {
				if (arg3.anInt2775 == 65535) {
					local38[5] = 0;
					local35 ^= 0xFFFFFFFF00000000L;
				} else {
					local38[5] = arg3.anInt2775 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg3.anInt2776 >= 0) {
				if (arg3.anInt2776 == 65535) {
					local38[3] = 0;
					local35 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg3.anInt2776 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg3 != null || arg0 != null;
		@Pc(156) int local156 = arg14 == null ? 0 : arg14.length;
		@Pc(189) int local189;
		@Pc(194) int local194;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Static378.aClass2_Sub1_Sub12Array8[local158] = null;
			if (arg14[local158] != null) {
				@Pc(175) Class109 local175 = arg15.method1879(arg14[local158].anInt2199);
				if (local175.anIntArray240 != null) {
					local149 = true;
					Static64.aClass109Array1[local158] = local175;
					local189 = arg14[local158].anInt2201;
					local194 = arg14[local158].anInt2197;
					@Pc(199) int local199 = local175.anIntArray240[local189];
					Static378.aClass2_Sub1_Sub12Array8[local158] = arg15.method1871(local199 >>> 16);
					@Pc(212) int local212 = local199 & 0xFFFF;
					Static280.anIntArray420[local158] = local212;
					if (Static378.aClass2_Sub1_Sub12Array8[local158] != null) {
						local139 |= Static378.aClass2_Sub1_Sub12Array8[local158].method3895(local212);
						local137 |= Static378.aClass2_Sub1_Sub12Array8[local158].method3890(local212);
						local141 |= Static378.aClass2_Sub1_Sub12Array8[local158].method3889(local212);
					}
					if ((local175.aBoolean172 || Static83.aBoolean76) && local194 != -1 && local194 < local175.anIntArray240.length) {
						Static358.anIntArray601[local158] = local175.anIntArray238[local189];
						Static302.anIntArray464[local158] = arg14[local158].anInt2193;
						@Pc(297) int local297 = local175.anIntArray240[local194];
						Static343.aClass2_Sub1_Sub12Array4[local158] = arg15.method1871(local297 >>> 16);
						@Pc(310) int local310 = local297 & 0xFFFF;
						Static390.anIntArray545[local158] = local310;
						if (Static343.aClass2_Sub1_Sub12Array4[local158] != null) {
							local139 |= Static343.aClass2_Sub1_Sub12Array4[local158].method3895(local310);
							local137 |= Static343.aClass2_Sub1_Sub12Array4[local158].method3890(local310);
							local141 |= Static343.aClass2_Sub1_Sub12Array4[local158].method3889(local310);
						}
					} else {
						Static358.anIntArray601[local158] = 0;
						Static302.anIntArray464[local158] = 0;
						Static343.aClass2_Sub1_Sub12Array4[local158] = null;
						Static390.anIntArray545[local158] = -1;
					}
				}
			}
		}
		@Pc(351) int local351 = -1;
		local189 = -1;
		local194 = 0;
		@Pc(357) Class2_Sub1_Sub12 local357 = null;
		@Pc(359) Class2_Sub1_Sub12 local359 = null;
		@Pc(361) int local361 = -1;
		@Pc(363) int local363 = -1;
		@Pc(365) int local365 = 0;
		@Pc(367) Class2_Sub1_Sub12 local367 = null;
		@Pc(369) Class2_Sub1_Sub12 local369 = null;
		if (local149) {
			@Pc(382) int local382;
			@Pc(445) int local445;
			if (arg3 != null) {
				local351 = arg3.anIntArray240[arg7];
				local382 = local351 >>> 16;
				local351 &= 0xFFFF;
				local357 = arg15.method1871(local382);
				if (local357 != null) {
					local139 |= local357.method3895(local351);
					local137 |= local357.method3890(local351);
					local141 |= local357.method3889(local351);
				}
				if ((arg3.aBoolean172 || Static83.aBoolean76) && arg9 != -1 && arg9 < arg3.anIntArray240.length) {
					local189 = arg3.anIntArray240[arg9];
					local194 = arg3.anIntArray238[arg7];
					local445 = local189 >>> 16;
					local359 = local382 == local445 ? local357 : arg15.method1871(local445);
					local189 &= 0xFFFF;
					if (local359 != null) {
						local139 |= local359.method3895(local189);
						local137 |= local359.method3890(local189);
						local141 |= local359.method3889(local189);
					}
				}
			}
			local32 = arg8 | 0x20;
			if (arg0 != null) {
				local361 = arg0.anIntArray240[arg4];
				local382 = local361 >>> 16;
				local361 &= 0xFFFF;
				local367 = arg15.method1871(local382);
				if (local367 != null) {
					local139 |= local367.method3895(local361);
					local137 |= local367.method3890(local361);
					local141 |= local367.method3889(local361);
				}
				if ((arg0.aBoolean172 || Static83.aBoolean76) && arg10 != -1 && arg10 < arg0.anIntArray240.length) {
					local365 = arg0.anIntArray238[arg4];
					local363 = arg0.anIntArray240[arg10];
					local445 = local363 >>> 16;
					local363 &= 0xFFFF;
					local369 = local382 == local445 ? local367 : arg15.method1871(local445);
					if (local369 != null) {
						local139 |= local369.method3895(local363);
						local137 |= local369.method3890(local363);
						local141 |= local369.method3889(local363);
					}
				}
			}
			if (local139) {
				local32 |= 0x80;
			}
			if (local137) {
				local32 |= 0x100;
			}
			if (local141) {
				local32 |= 0x400;
			}
		}
		@Pc(617) Class188 local617 = Static270.aClass188_40;
		@Pc(625) Class63 local625;
		synchronized (Static270.aClass188_40) {
			local625 = (Class63) Static270.aClass188_40.method4158(local35);
		}
		@Pc(633) Class101 local633 = null;
		if (this.anInt544 != -1) {
			local633 = arg5.method5913(this.anInt544);
		}
		@Pc(677) int local677;
		@Pc(682) int local682;
		if (local625 == null || arg6.method6023(local625.RA(), local32) != 0 || local633 != null && local633.anIntArrayArray58 != null && this.anIntArrayArray17 == null) {
			if (local625 != null) {
				local32 = arg6.method5987(local32, local625.RA());
			}
			@Pc(675) boolean local675 = false;
			local677 = 0;
			while (true) {
				if (local677 >= 12) {
					if (local675) {
						if (this.aLong41 != -1L) {
							@Pc(1292) Class188 local1292 = Static270.aClass188_40;
							synchronized (Static270.aClass188_40) {
								local625 = (Class63) Static270.aClass188_40.method4158(this.aLong41);
							}
						}
						if (local625 == null || arg6.method6023(local625.RA(), local32) != 0 || local633 != null && local633.anIntArrayArray58 != null && this.anIntArrayArray17 == null) {
							return null;
						}
					} else {
						@Pc(726) Class76[] local726 = new Class76[12];
						@Pc(733) int local733;
						for (@Pc(728) int local728 = 0; local728 < 12; local728++) {
							local733 = local38[local728];
							@Pc(750) Class76 local750;
							if ((local733 & 0x40000000) != 0) {
								local750 = arg1.method6193(local733 & 0x3FFFFFFF).method5008(this.aBoolean22);
								if (local750 != null) {
									local726[local728] = local750;
								}
							} else if ((Integer.MIN_VALUE & local733) != 0) {
								local750 = arg11.method3695(local733 & 0x3FFFFFFF).method2824();
								if (local750 != null) {
									local726[local728] = local750;
								}
							}
						}
						@Pc(805) int local805;
						if (local633 != null && local633.anIntArrayArray58 != null) {
							for (local733 = 0; local733 < local633.anIntArrayArray58.length; local733++) {
								if (local633.anIntArrayArray58[local733] != null && local726[local733] != null) {
									local805 = local633.anIntArrayArray58[local733][0];
									@Pc(812) int local812 = local633.anIntArrayArray58[local733][1];
									@Pc(819) int local819 = local633.anIntArrayArray58[local733][2];
									@Pc(828) int local828 = local633.anIntArrayArray58[local733][3] << 3;
									@Pc(837) int local837 = local633.anIntArrayArray58[local733][4] << 3;
									@Pc(846) int local846 = local633.anIntArrayArray58[local733][5] << 3;
									if (this.anIntArrayArray17 == null) {
										this.anIntArrayArray17 = new int[local633.anIntArrayArray58.length][];
									}
									if (this.anIntArrayArray17[local733] == null) {
										@Pc(868) int[] local868 = this.anIntArrayArray17[local733] = new int[15];
										if (local828 == 0 && local837 == 0 && local846 == 0) {
											local868[13] = -local812;
											local868[12] = -local805;
											local868[0] = local868[4] = local868[8] = 32768;
											local868[14] = -local819;
										} else {
											@Pc(884) int local884 = Class229.anIntArray536[local828];
											@Pc(888) int local888 = Class229.anIntArray537[local828];
											@Pc(892) int local892 = Class229.anIntArray536[local837];
											@Pc(896) int local896 = Class229.anIntArray537[local837];
											@Pc(900) int local900 = Class229.anIntArray536[local846];
											@Pc(904) int local904 = Class229.anIntArray537[local846];
											@Pc(912) int local912 = local900 * local888 + 16384 >> 15;
											@Pc(920) int local920 = local888 * local904 + 16384 >> 15;
											local868[7] = local912 * local892 + -local896 * -local904 + 16384 >> 15;
											local868[2] = local884 * local896 + 16384 >> 15;
											local868[1] = local896 * local912 + local892 * -local904 + 16384 >> 15;
											local868[4] = local884 * local900 + 16384 >> 15;
											local868[0] = local920 * local896 + local900 * local892 + 16384 >> 15;
											local868[3] = local884 * local904 + 16384 >> 15;
											local868[5] = -local888;
											local868[6] = -local896 * local900 + local892 * local920 + 16384 >> 15;
											local868[8] = local884 * local892 + 16384 >> 15;
											local868[14] = local868[8] * -local819 + local868[2] * -local805 + -local812 * local868[5] + 16384 >> 15;
											local868[12] = local868[6] * -local819 + -local805 * local868[0] + local868[3] * -local812 + 16384 >> 15;
											local868[13] = local868[7] * -local819 + -local812 * local868[4] + local868[1] * -local805 + 16384 >> 15;
										}
										local868[9] = local805;
										local868[10] = local812;
										local868[11] = local819;
									}
									if (local828 != 0 || local837 != 0 || local846 != 0) {
										local726[local733].method1774(local837, local828, local846);
									}
									if (local805 != 0 || local812 != 0 || local819 != 0) {
										local726[local733].method1790(local819, local805, local812);
									}
								}
							}
						}
						@Pc(1192) Class76 local1192 = new Class76(local726, local726.length);
						@Pc(1196) int local1196 = local32 | 0x4000;
						local625 = arg6.method6016(local1192, local1196, Static111.anInt1853, 64, 850);
						for (local805 = 0; local805 < 5; local805++) {
							if (Static373.aShortArrayArray6[local805].length > this.anIntArray52[local805]) {
								local625.q(Static172.aShortArray46[local805], Static373.aShortArrayArray6[local805][this.anIntArray52[local805]]);
							}
							if (this.anIntArray52[local805] < Static388.aShortArrayArray8[local805].length) {
								local625.q(Static164.aShortArray45[local805], Static388.aShortArrayArray8[local805][this.anIntArray52[local805]]);
							}
						}
						local625.D(local32);
						@Pc(1266) Class188 local1266 = Static270.aClass188_40;
						synchronized (Static270.aClass188_40) {
							Static270.aClass188_40.method4155(local35, local625);
						}
						this.aLong41 = local35;
					}
					break;
				}
				local682 = local38[local677];
				if ((local682 & 0x40000000) == 0) {
					if ((local682 & Integer.MIN_VALUE) != 0 && !arg11.method3695(local682 & 0x3FFFFFFF).method2822()) {
						local675 = true;
					}
				} else if (!arg1.method6193(local682 & 0x3FFFFFFF).method5009(this.aBoolean22)) {
					local675 = true;
				}
				local677++;
			}
		}
		@Pc(1331) Class63 local1331 = local625.method6296((byte) 4, local32, true);
		if (!local149) {
			return local1331;
		}
		@Pc(1337) int local1337 = 0;
		local677 = 1;
		while (local1337 < local156) {
			if (Static378.aClass2_Sub1_Sub12Array8[local1337] != null) {
				local1331.method6290(Static302.anIntArray464[local1337] - 1, local677, Static378.aClass2_Sub1_Sub12Array8[local1337], this.anIntArrayArray17 == null ? null : this.anIntArrayArray17[local1337], Static343.aClass2_Sub1_Sub12Array4[local1337], false, Static358.anIntArray601[local1337], Static390.anIntArray545[local1337], Static280.anIntArray420[local1337]);
			}
			local1337++;
			local677 <<= 0x1;
		}
		if (local357 != null && local367 != null) {
			local1331.method6283(arg12 - 1, arg13 - 1, false, local189, local365, local351, local367, local369, local361, local359, local357, arg3.aBooleanArray10, local194, local363);
		} else if (local357 != null) {
			local1331.method6299(0, local351, local189, local359, local194, false, arg12 - 1, local357);
		} else if (local367 != null) {
			local1331.method6299(0, local361, local363, local369, local365, false, arg13 - 1, local367);
		}
		for (local682 = 0; local682 < local156; local682++) {
			Static378.aClass2_Sub1_Sub12Array8[local682] = null;
			Static343.aClass2_Sub1_Sub12Array4[local682] = null;
			Static64.aClass109Array1[local682] = null;
		}
		return local1331;
	}
}
