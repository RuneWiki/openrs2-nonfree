import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class314 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Z")
	public boolean aBoolean790;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	private int anInt9431;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public int anInt9420 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!se;BLclient!oa;Lclient!af;Lclient!jq;IILclient!ie;Lclient!bb;Lclient!gf;II)Lclient!ba;")
	public Class21 method7644(@OriginalArg(0) Interface15 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class174 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class157 arg5, @OriginalArg(8) Class23 arg6, @OriginalArg(9) Class118 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.anInt9420 != -1) {
			return arg7.method3029(this.anInt9420).method4183(arg0, arg1, arg3, arg9, arg4, arg8, arg5);
		}
		@Pc(26) int local26 = 2048;
		@Pc(34) boolean local34;
		@Pc(47) int local47;
		@Pc(113) int local113;
		@Pc(57) int local57;
		@Pc(117) int local117;
		if (arg3 != null) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			local34 = false;
			@Pc(36) boolean local36 = false;
			local47 = arg3.anIntArray326[arg9];
			local26 = 2080;
			local57 = local47 >>> 16;
			@Pc(61) int local61 = local47 & 0xFFFF;
			@Pc(66) Class3_Sub4_Sub12 local66 = arg5.method3737(local57);
			if (local66 != null) {
				local32 = local66.method2964(local61) | false;
				local30 = local66.method2966(local61) | false;
				local36 = local66.method2965(local61) | false;
				local34 = arg3.aBoolean468 | false;
			}
			if ((arg3.aBoolean471 || Static4.aBoolean20) && arg8 != -1 && arg3.anIntArray326.length > arg8) {
				local113 = arg3.anIntArray326[arg8];
				local117 = local113 >>> 16;
				@Pc(127) Class3_Sub4_Sub12 local127 = local57 == local117 ? local66 : arg5.method3737(local117);
				@Pc(131) int local131 = local113 & 0xFFFF;
				if (local127 != null) {
					local32 |= local127.method2964(local131);
					local30 |= local127.method2966(local131);
					local36 |= local127.method2965(local131);
				}
			}
			if (local32) {
				local26 = 2208;
			}
			if (local30) {
				local26 |= 0x100;
			}
			if (local34) {
				local26 |= 0x200;
			}
			if (local36) {
				local26 |= 0x400;
			}
		}
		@Pc(180) Class211 local180 = Static204.aClass211_30;
		@Pc(189) Class21 local189;
		synchronized (Static204.aClass211_30) {
			local189 = (Class21) Static204.aClass211_30.method5534(this.aLong233);
		}
		if (local189 == null || arg1.method5321(local189.h(), local26) != 0) {
			if (local189 != null) {
				local26 = arg1.method5315(local26, local189.h());
			}
			local34 = false;
			for (@Pc(220) int local220 = 0; local220 < 12; local220++) {
				local47 = this.anIntArray614[local220];
				if ((local47 & 0x40000000) == 0) {
					if ((local47 & Integer.MIN_VALUE) != 0 && !arg2.method304(local47 & 0x3FFFFFFF).method6754()) {
						local34 = true;
					}
				} else if (!arg6.method901(local47 & 0x3FFFFFFF).method761(this.aBoolean790)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(272) Class96[] local272 = new Class96[12];
			local113 = 0;
			for (@Pc(276) int local276 = 0; local276 < 12; local276++) {
				@Pc(282) int local282 = this.anIntArray614[local276];
				@Pc(300) Class96 local300;
				if ((local282 & 0x40000000) != 0) {
					local300 = arg6.method901(local282 & 0x3FFFFFFF).method767(this.aBoolean790);
					if (local300 != null) {
						local272[local113++] = local300;
					}
				} else if ((local282 & Integer.MIN_VALUE) != 0) {
					local300 = arg2.method304(local282 & 0x3FFFFFFF).method6756();
					if (local300 != null) {
						local272[local113++] = local300;
					}
				}
			}
			@Pc(340) Class96 local340 = new Class96(local272, local113);
			@Pc(344) int local344 = local26 | 0x4000;
			local189 = arg1.method5352(local340, local344, Static92.anInt2296, 64, 768);
			for (local57 = 0; local57 < 5; local57++) {
				for (local117 = 0; local117 < Static152.aShortArrayArrayArray1.length; local117++) {
					if (Static152.aShortArrayArrayArray1[local117][local57].length > this.anIntArray615[local57]) {
						local189.UA(Static545.aShortArrayArray12[local117][local57], Static152.aShortArrayArrayArray1[local117][local57][this.anIntArray615[local57]]);
					}
				}
			}
			local189.ia(local26);
			@Pc(406) Class211 local406 = Static204.aClass211_30;
			synchronized (Static204.aClass211_30) {
				Static204.aClass211_30.method5529(this.aLong233, local189);
			}
		}
		if (arg3 == null) {
			return local189;
		} else {
			local189.method7131((byte) 4, local26, true);
			return arg3.method4546(arg4, arg9, arg8, 2048, local189);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V")
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray615[arg0] = arg1;
		this.method7648();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!jq;Lclient!ie;IIIILclient!oa;ILclient!af;I)Lclient!ba;")
	public Class21 method7646(@OriginalArg(2) Class174 arg0, @OriginalArg(3) Class157 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class15 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class6 arg8, @OriginalArg(11) int arg9) {
		@Pc(5) int local5 = 2048;
		@Pc(95) int local95;
		@Pc(36) int local36;
		if (arg0 != null) {
			@Pc(9) boolean local9 = false;
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local5 = 2080;
			@Pc(32) int local32 = arg0.anIntArray326[arg4];
			local36 = local32 >>> 16;
			@Pc(41) Class3_Sub4_Sub12 local41 = arg1.method3737(local36);
			@Pc(45) int local45 = local32 & 0xFFFF;
			if (local41 != null) {
				local11 = local41.method2964(local45) | false;
				local9 = local41.method2966(local45) | false;
				local15 = local41.method2965(local45) | false;
				local13 = arg0.aBoolean468 | false;
			}
			if ((arg0.aBoolean471 || Static4.aBoolean20) && arg7 != -1 && arg0.anIntArray326.length > arg7) {
				local95 = arg0.anIntArray326[arg7];
				@Pc(99) int local99 = local95 >>> 16;
				@Pc(103) int local103 = local95 & 0xFFFF;
				@Pc(117) Class3_Sub4_Sub12 local117;
				if (local36 == local99) {
					local117 = local41;
				} else {
					local117 = arg1.method3737(local103 >>> 16);
				}
				if (local117 != null) {
					local11 |= local117.method2964(local103);
					local9 |= local117.method2966(local103);
					local15 |= local117.method2965(local103);
				}
			}
			if (local11) {
				local5 = 2208;
			}
			if (local9) {
				local5 |= 0x100;
			}
			if (local13) {
				local5 |= 0x200;
			}
			if (local15) {
				local5 |= 0x400;
			}
		}
		@Pc(180) long local180 = (long) arg3 | (long) (arg2 << 16) | (long) arg5 << 32;
		@Pc(182) Class211 local182 = Static204.aClass211_30;
		@Pc(190) Class21 local190;
		synchronized (Static204.aClass211_30) {
			local190 = (Class21) Static204.aClass211_30.method5534(local180);
		}
		if (local190 == null || arg6.method5321(local190.h(), local5) != 0) {
			if (local190 != null) {
				local5 = arg6.method5315(local5, local190.h());
			}
			@Pc(220) Class96[] local220 = new Class96[3];
			local95 = 0;
			if (!arg8.method304(arg3).method6754() || !arg8.method304(arg2).method6754() || !arg8.method304(arg5).method6754()) {
				return null;
			}
			@Pc(252) Class96 local252 = arg8.method304(arg3).method6756();
			if (local252 != null) {
				local95++;
				local220[0] = local252;
			}
			local252 = arg8.method304(arg2).method6756();
			if (local252 != null) {
				local220[local95++] = local252;
			}
			local252 = arg8.method304(arg5).method6756();
			if (local252 != null) {
				local220[local95++] = local252;
			}
			@Pc(291) int local291 = local5 | 0x4000;
			local252 = new Class96(local220, local95);
			local190 = arg6.method5352(local252, local291, Static92.anInt2296, 64, 768);
			for (@Pc(307) int local307 = 0; local307 < 5; local307++) {
				for (local36 = 0; local36 < Static152.aShortArrayArrayArray1.length; local36++) {
					if (this.anIntArray615[local307] < Static152.aShortArrayArrayArray1[local36][local307].length) {
						local190.UA(Static545.aShortArrayArray12[local36][local307], Static152.aShortArrayArrayArray1[local36][local307][this.anIntArray615[local307]]);
					}
				}
			}
			local190.ia(local5);
			@Pc(363) Class211 local363 = Static204.aClass211_30;
			synchronized (Static204.aClass211_30) {
				Static204.aClass211_30.method5529(local180, local190);
			}
		}
		if (arg0 == null) {
			return local190;
		} else {
			local190 = local190.method7131((byte) 4, local5, true);
			return arg0.method4546(arg9, arg4, arg7, 2048, local190);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI[I[IIB)V")
	public void method7647(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 != this.anInt9431) {
			this.anIntArrayArray78 = null;
			this.anInt9431 = arg4;
		}
		this.anIntArray614 = arg3;
		this.aBoolean790 = arg0;
		this.anIntArray615 = arg2;
		this.anInt9420 = arg1;
		this.method7648();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	private void method7648() {
		this.aLong233 = -1L;
		@Pc(12) long[] local12 = Class64.aLongArray3;
		this.aLong233 = this.aLong233 >>> 8 ^ local12[(int) ((this.aLong233 ^ (long) (this.anInt9431 >> 8)) & 0xFFL)];
		this.aLong233 = local12[(int) ((this.aLong233 ^ (long) this.anInt9431) & 0xFFL)] ^ this.aLong233 >>> 8;
		for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
			this.aLong233 = this.aLong233 >>> 8 ^ local12[(int) ((this.aLong233 ^ (long) (this.anIntArray614[local52] >> 24)) & 0xFFL)];
			this.aLong233 = local12[(int) ((this.aLong233 ^ (long) (this.anIntArray614[local52] >> 16)) & 0xFFL)] ^ this.aLong233 >>> 8;
			this.aLong233 = this.aLong233 >>> 8 ^ local12[(int) ((this.aLong233 ^ (long) (this.anIntArray614[local52] >> 8)) & 0xFFL)];
			this.aLong233 = local12[(int) ((this.aLong233 ^ (long) this.anIntArray614[local52]) & 0xFFL)] ^ this.aLong233 >>> 8;
		}
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			this.aLong233 = this.aLong233 >>> 8 ^ local12[(int) (((long) this.anIntArray615[local147] ^ this.aLong233) & 0xFFL)];
		}
		this.aLong233 = this.aLong233 >>> 8 ^ local12[(int) ((this.aLong233 ^ (long) (this.aBoolean790 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([Lclient!mq;ILclient!jq;Lclient!oa;ILclient!jq;Lclient!se;ILclient!af;Lclient!kv;IILclient!ie;IZIILclient!gf;Lclient!bb;)Lclient!ba;")
	public Class21 method7649(@OriginalArg(0) Class216[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(5) Class174 arg4, @OriginalArg(6) Interface15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6 arg7, @OriginalArg(9) Class188 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class157 arg11, @OriginalArg(13) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class118 arg15, @OriginalArg(18) Class23 arg16) {
		if (this.anInt9420 != -1) {
			return arg15.method3029(this.anInt9420).method4178(arg4, arg6, arg1, arg10, arg13, arg3, arg11, arg2, arg12, arg14, arg5, arg0, arg9, arg8);
		}
		@Pc(32) int local32 = arg6;
		@Pc(35) long local35 = this.aLong233;
		@Pc(38) int[] local38 = this.anIntArray614;
		if (arg2 != null && (arg2.anInt5490 >= 0 || arg2.anInt5484 >= 0)) {
			local38 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local38[local54] = this.anIntArray614[local54];
			}
			if (arg2.anInt5490 >= 0) {
				if (arg2.anInt5490 == 65535) {
					local35 ^= 0xFFFFFFFF00000000L;
					local38[5] = 0;
				} else {
					local38[5] = arg2.anInt5490 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg2.anInt5484 >= 0) {
				if (arg2.anInt5484 == 65535) {
					local38[3] = 0;
					local35 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg2.anInt5484 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(130) boolean local130 = false;
		@Pc(132) boolean local132 = false;
		@Pc(134) boolean local134 = false;
		@Pc(142) boolean local142 = arg2 != null || arg4 != null;
		@Pc(149) int local149 = arg0 == null ? 0 : arg0.length;
		@Pc(184) int local184;
		@Pc(189) int local189;
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			Static186.aClass3_Sub4_Sub12Array2[local151] = null;
			if (arg0[local151] != null) {
				@Pc(170) Class174 local170 = arg11.method3734(arg0[local151].anInt6912);
				if (local170.anIntArray326 != null) {
					local142 = true;
					Static220.aClass174Array1[local151] = local170;
					local184 = arg0[local151].anInt6906;
					local189 = arg0[local151].anInt6904;
					@Pc(194) int local194 = local170.anIntArray326[local184];
					Static186.aClass3_Sub4_Sub12Array2[local151] = arg11.method3737(local194 >>> 16);
					@Pc(207) int local207 = local194 & 0xFFFF;
					Static256.anIntArray330[local151] = local207;
					if (Static186.aClass3_Sub4_Sub12Array2[local151] != null) {
						local132 |= Static186.aClass3_Sub4_Sub12Array2[local151].method2964(local207);
						local130 |= Static186.aClass3_Sub4_Sub12Array2[local151].method2966(local207);
						local134 |= Static186.aClass3_Sub4_Sub12Array2[local151].method2965(local207);
					}
					if ((local170.aBoolean471 || Static4.aBoolean20) && local189 != -1 && local170.anIntArray326.length > local189) {
						Static456.anIntArray527[local151] = local170.anIntArray325[local184];
						Static576.anIntArray660[local151] = arg0[local151].anInt6913;
						@Pc(299) int local299 = local170.anIntArray326[local189];
						Static366.aClass3_Sub4_Sub12Array4[local151] = arg11.method3737(local299 >>> 16);
						@Pc(312) int local312 = local299 & 0xFFFF;
						Static114.anIntArray130[local151] = local312;
						if (Static366.aClass3_Sub4_Sub12Array4[local151] != null) {
							local132 |= Static366.aClass3_Sub4_Sub12Array4[local151].method2964(local312);
							local130 |= Static366.aClass3_Sub4_Sub12Array4[local151].method2966(local312);
							local134 |= Static366.aClass3_Sub4_Sub12Array4[local151].method2965(local312);
						}
					} else {
						Static456.anIntArray527[local151] = 0;
						Static576.anIntArray660[local151] = 0;
						Static366.aClass3_Sub4_Sub12Array4[local151] = null;
						Static114.anIntArray130[local151] = -1;
					}
				}
			}
		}
		@Pc(357) int local357 = -1;
		local184 = -1;
		local189 = 0;
		@Pc(368) Class3_Sub4_Sub12 local368 = null;
		@Pc(370) Class3_Sub4_Sub12 local370 = null;
		@Pc(372) int local372 = -1;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = 0;
		@Pc(378) Class3_Sub4_Sub12 local378 = null;
		@Pc(380) Class3_Sub4_Sub12 local380 = null;
		if (local142) {
			@Pc(393) int local393;
			@Pc(457) int local457;
			if (arg2 != null) {
				local357 = arg2.anIntArray326[arg9];
				local393 = local357 >>> 16;
				local357 &= 0xFFFF;
				local368 = arg11.method3737(local393);
				if (local368 != null) {
					local132 |= local368.method2964(local357);
					local130 |= local368.method2966(local357);
					local134 |= local368.method2965(local357);
				}
				if ((arg2.aBoolean471 || Static4.aBoolean20) && arg12 != -1 && arg12 < arg2.anIntArray326.length) {
					local189 = arg2.anIntArray325[arg9];
					local184 = arg2.anIntArray326[arg12];
					local457 = local184 >>> 16;
					local370 = local393 == local457 ? local368 : arg11.method3737(local457);
					local184 &= 0xFFFF;
					if (local370 != null) {
						local132 |= local370.method2964(local184);
						local130 |= local370.method2966(local184);
						local134 |= local370.method2965(local184);
					}
				}
			}
			local32 = arg6 | 0x20;
			if (arg4 != null) {
				local372 = arg4.anIntArray326[arg1];
				local393 = local372 >>> 16;
				local378 = arg11.method3737(local393);
				local372 &= 0xFFFF;
				if (local378 != null) {
					local132 |= local378.method2964(local372);
					local130 |= local378.method2966(local372);
					local134 |= local378.method2965(local372);
				}
				if ((arg4.aBoolean471 || Static4.aBoolean20) && arg10 != -1 && arg10 < arg4.anIntArray326.length) {
					local374 = arg4.anIntArray326[arg10];
					local376 = arg4.anIntArray325[arg1];
					local457 = local374 >>> 16;
					local374 &= 0xFFFF;
					local380 = local393 == local457 ? local378 : arg11.method3737(local457);
					if (local380 != null) {
						local132 |= local380.method2964(local374);
						local130 |= local380.method2966(local374);
						local134 |= local380.method2965(local374);
					}
				}
			}
			if (local132) {
				local32 |= 0x80;
			}
			if (local130) {
				local32 |= 0x100;
			}
			if (local134) {
				local32 |= 0x400;
			}
		}
		@Pc(641) Class211 local641 = Static232.aClass211_34;
		@Pc(649) Class21 local649;
		synchronized (Static232.aClass211_34) {
			local649 = (Class21) Static232.aClass211_34.method5534(local35);
		}
		@Pc(657) Class171 local657 = null;
		if (this.anInt9431 != -1) {
			local657 = arg8.method4910(this.anInt9431);
		}
		@Pc(698) int local698;
		@Pc(703) int local703;
		if (local649 == null || arg3.method5321(local649.h(), local32) != 0 || local657 != null && local657.anIntArrayArray39 != null && this.anIntArrayArray78 == null) {
			if (local649 != null) {
				local32 = arg3.method5315(local32, local649.h());
			}
			@Pc(696) boolean local696 = false;
			local698 = 0;
			while (true) {
				if (local698 >= 12) {
					if (local696) {
						if (this.aLong232 != -1L) {
							@Pc(1323) Class211 local1323 = Static232.aClass211_34;
							synchronized (Static232.aClass211_34) {
								local649 = (Class21) Static232.aClass211_34.method5534(this.aLong232);
							}
						}
						if (local649 == null || arg3.method5321(local649.h(), local32) != 0 || local657 != null && local657.anIntArrayArray39 != null && this.anIntArrayArray78 == null) {
							return null;
						}
					} else {
						@Pc(753) Class96[] local753 = new Class96[12];
						@Pc(760) int local760;
						for (@Pc(755) int local755 = 0; local755 < 12; local755++) {
							local760 = local38[local755];
							@Pc(777) Class96 local777;
							if ((local760 & 0x40000000) != 0) {
								local777 = arg16.method901(local760 & 0x3FFFFFFF).method770(this.aBoolean790);
								if (local777 != null) {
									local753[local755] = local777;
								}
							} else if ((Integer.MIN_VALUE & local760) != 0) {
								local777 = arg7.method304(local760 & 0x3FFFFFFF).method6751();
								if (local777 != null) {
									local753[local755] = local777;
								}
							}
						}
						@Pc(842) int local842;
						@Pc(835) int local835;
						if (local657 != null && local657.anIntArrayArray39 != null) {
							for (local760 = 0; local760 < local657.anIntArrayArray39.length; local760++) {
								if (local657.anIntArrayArray39[local760] != null && local753[local760] != null) {
									local835 = local657.anIntArrayArray39[local760][0];
									local842 = local657.anIntArrayArray39[local760][1];
									@Pc(849) int local849 = local657.anIntArrayArray39[local760][2];
									@Pc(858) int local858 = local657.anIntArrayArray39[local760][3] << 3;
									@Pc(867) int local867 = local657.anIntArrayArray39[local760][4] << 3;
									@Pc(876) int local876 = local657.anIntArrayArray39[local760][5] << 3;
									if (this.anIntArrayArray78 == null) {
										this.anIntArrayArray78 = new int[local657.anIntArrayArray39.length][];
									}
									if (this.anIntArrayArray78[local760] == null) {
										@Pc(898) int[] local898 = this.anIntArrayArray78[local760] = new int[15];
										if (local858 == 0 && local867 == 0 && local876 == 0) {
											local898[12] = -local835;
											local898[0] = local898[4] = local898[8] = 32768;
											local898[13] = -local842;
											local898[14] = -local849;
										} else {
											@Pc(936) int local936 = Class2_Sub3.anIntArray621[local858];
											@Pc(940) int local940 = Class2_Sub3.anIntArray620[local858];
											@Pc(944) int local944 = Class2_Sub3.anIntArray621[local867];
											@Pc(948) int local948 = Class2_Sub3.anIntArray620[local867];
											@Pc(952) int local952 = Class2_Sub3.anIntArray621[local876];
											@Pc(956) int local956 = Class2_Sub3.anIntArray620[local876];
											@Pc(964) int local964 = local952 * local940 + 8192 >> 14;
											@Pc(972) int local972 = local940 * local956 + 8192 >> 14;
											local898[3] = local956 * local936 + 8192 >> 14;
											local898[7] = local944 * local964 + -local948 * -local956 + 8192 >> 14;
											local898[4] = local952 * local936 + 8192 >> 14;
											local898[8] = local936 * local944 + 8192 >> 14;
											local898[6] = local952 * -local948 + local972 * local944 + 8192 >> 14;
											local898[2] = local936 * local948 + 8192 >> 14;
											local898[5] = -local940;
											local898[1] = local944 * -local956 + local948 * local964 + 8192 >> 14;
											local898[0] = local972 * local948 + local944 * local952 + 8192 >> 14;
											local898[14] = -local835 * local898[2] + local898[5] * -local842 + -local849 * local898[8] + 8192 >> 14;
											local898[13] = -local849 * local898[7] + -local835 * local898[1] + local898[4] * -local842 + 8192 >> 14;
											local898[12] = local898[6] * -local849 + -local842 * local898[3] + -local835 * local898[0] + 8192 >> 14;
										}
										local898[11] = local849;
										local898[10] = local842;
										local898[9] = local835;
									}
									if (local858 != 0 || local867 != 0 || local876 != 0) {
										local753[local760].method2790(local867, local876, local858);
									}
									if (local835 != 0 || local842 != 0 || local849 != 0) {
										local753[local760].method2777(local835, local849, local842);
									}
								}
							}
						}
						@Pc(1229) Class96 local1229 = new Class96(local753, local753.length);
						@Pc(1233) int local1233 = local32 | 0x4000;
						local649 = arg3.method5352(local1229, local1233, Static92.anInt2296, 64, 850);
						for (local835 = 0; local835 < 5; local835++) {
							for (local842 = 0; local842 < Static152.aShortArrayArrayArray1.length; local842++) {
								if (this.anIntArray615[local835] < Static152.aShortArrayArrayArray1[local842][local835].length) {
									local649.UA(Static545.aShortArrayArray12[local842][local835], Static152.aShortArrayArrayArray1[local842][local835][this.anIntArray615[local835]]);
								}
							}
						}
						local649.ia(local32);
						@Pc(1295) Class211 local1295 = Static232.aClass211_34;
						synchronized (Static232.aClass211_34) {
							Static232.aClass211_34.method5529(local35, local649);
						}
						this.aLong232 = local35;
					}
					break;
				}
				local703 = local38[local698];
				if ((local703 & 0x40000000) == 0) {
					if ((local703 & Integer.MIN_VALUE) != 0 && !arg7.method304(local703 & 0x3FFFFFFF).method6752()) {
						local696 = true;
					}
				} else if (!arg16.method901(local703 & 0x3FFFFFFF).method766(this.aBoolean790)) {
					local696 = true;
				}
				local698++;
			}
		}
		@Pc(1362) Class21 local1362 = local649.method7131((byte) 4, local32, true);
		if (!local142) {
			return local1362;
		}
		@Pc(1368) int local1368 = 0;
		local698 = 1;
		while (local1368 < local149) {
			if (Static186.aClass3_Sub4_Sub12Array2[local1368] != null) {
				local1362.method7149(false, Static186.aClass3_Sub4_Sub12Array2[local1368], Static456.anIntArray527[local1368], local698, Static366.aClass3_Sub4_Sub12Array4[local1368], this.anIntArrayArray78 == null ? null : this.anIntArrayArray78[local1368], Static256.anIntArray330[local1368], Static576.anIntArray660[local1368] - 1, Static114.anIntArray130[local1368]);
			}
			local698 <<= 0x1;
			local1368++;
		}
		if (local368 != null && local378 != null) {
			local1362.method7136(false, local376, arg2.aBooleanArray18, arg13 - 1, local372, local370, local380, arg14 - 1, local184, local378, local357, local368, local189, local374);
		} else if (local368 != null) {
			local1362.method7132(false, local370, local184, arg13 - 1, local357, 0, local368, local189);
		} else if (local378 != null) {
			local1362.method7132(false, local380, local374, arg14 - 1, local372, 0, local378, local376);
		}
		for (local703 = 0; local703 < local149; local703++) {
			Static186.aClass3_Sub4_Sub12Array2[local703] = null;
			Static366.aClass3_Sub4_Sub12Array4[local703] = null;
			Static220.aClass174Array1[local703] = null;
		}
		return local1362;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILclient!af;)V")
	public void method7650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2) {
		@Pc(7) int local7 = Static351.anIntArray450[arg1];
		if (arg2.method304(arg0) != null) {
			this.anIntArray614[local7] = Integer.MIN_VALUE | arg0;
			this.method7648();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!bb;I)V")
	public void method7651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2) {
		if (arg0 == -1) {
			this.anIntArray614[arg1] = 0;
		} else if (arg2.method901(arg0) != null) {
			this.anIntArray614[arg1] = arg0 | 0x40000000;
			this.method7648();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V")
	public void method7652(@OriginalArg(1) boolean arg0) {
		this.aBoolean790 = arg0;
		this.method7648();
	}
}
