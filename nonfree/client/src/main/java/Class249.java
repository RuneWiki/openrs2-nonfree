import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class249 {

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	private int anInt6784;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "[I")
	public int[] anIntArray566;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "[I")
	private int[] anIntArray567;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "J")
	private long aLong203;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public int anInt6781 = -1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!jp;Lclient!cw;BLclient!ec;Lclient!za;Lclient!wc;Lclient!mt;IIILclient!wn;)Lclient!e;")
	public Class59 method5240(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) Class163 arg4, @OriginalArg(6) Class263 arg5, @OriginalArg(7) Class164 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Interface12 arg9) {
		if (this.anInt6781 != -1) {
			return arg5.method5581(this.anInt6781).method5203(arg7, arg3, arg1, arg8, arg0, arg9, arg4);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(119) int local119;
		@Pc(59) int local59;
		if (arg1 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg1.anIntArray278[arg7];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class2_Sub5_Sub18 local68 = arg3.method1414(local59);
			if (local68 != null) {
				local34 = local68.method5629(local63) | false;
				local32 = local68.method5626(local63) | false;
				local38 = local68.method5630(local63) | false;
				local36 = arg1.aBoolean200 | false;
			}
			if ((arg1.aBoolean201 || Static390.aBoolean492) && arg0 != -1 && arg1.anIntArray278.length > arg0) {
				local119 = arg1.anIntArray278[arg0];
				@Pc(123) int local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(137) Class2_Sub5_Sub18 local137 = local123 == local59 ? local68 : arg3.method1414(local123);
				if (local137 != null) {
					local34 |= local137.method5629(local127);
					local32 |= local137.method5626(local127);
					local38 |= local137.method5630(local127);
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
		@Pc(186) Class132 local186 = Static55.aClass132_7;
		@Pc(195) Class59 local195;
		synchronized (Static55.aClass132_7) {
			local195 = (Class59) Static55.aClass132_7.method2701(this.aLong203);
		}
		if (local195 == null || arg4.method5502(local195.RA(), local28) != 0) {
			if (local195 != null) {
				local28 = arg4.method5514(local28, local195.RA());
			}
			local36 = false;
			for (@Pc(234) int local234 = 0; local234 < 12; local234++) {
				local55 = this.anIntArray567[local234];
				if ((local55 & 0x40000000) == 0) {
					if ((local55 & Integer.MIN_VALUE) != 0 && !arg2.method963(local55 & 0x3FFFFFFF).method2147()) {
						local36 = true;
					}
				} else if (!arg6.method3458(local55 & 0x3FFFFFFF).method4471(this.aBoolean484)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(289) Class205[] local289 = new Class205[12];
			local119 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray567[local293];
				@Pc(320) Class205 local320;
				if ((local300 & 0x40000000) != 0) {
					local320 = arg6.method3458(local300 & 0x3FFFFFFF).method4486(this.aBoolean484);
					if (local320 != null) {
						local289[local119++] = local320;
					}
				} else if ((local300 & Integer.MIN_VALUE) != 0) {
					local320 = arg2.method963(local300 & 0x3FFFFFFF).method2138();
					if (local320 != null) {
						local289[local119++] = local320;
					}
				}
			}
			@Pc(357) int local357 = local28 | 0x4000;
			@Pc(363) Class205 local363 = new Class205(local289, local119);
			local195 = arg4.method5530(local363, local357, Static3.anInt24, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (Static287.aShortArrayArray6[local59].length > this.anIntArray566[local59]) {
					local195.q(Static306.aShortArray54[local59], Static287.aShortArrayArray6[local59][this.anIntArray566[local59]]);
				}
				if (Static104.aShortArrayArray1[local59].length > this.anIntArray566[local59]) {
					local195.q(Static171.aShortArray24[local59], Static104.aShortArrayArray1[local59][this.anIntArray566[local59]]);
				}
			}
			local195.D(local28);
			@Pc(434) Class132 local434 = Static55.aClass132_7;
			synchronized (Static55.aClass132_7) {
				Static55.aClass132_7.method2711(local195, this.aLong203);
			}
		}
		if (arg1 == null) {
			return local195;
		} else {
			local195.method5737((byte) 4, local28, true);
			return arg1.method2647(arg7, 2048, arg8, arg0, local195);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!cw;III)V")
	public void method5241(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static55.anIntArray96[arg2];
		if (this.anIntArray567[local7] != 0 && arg0.method963(arg1) != null) {
			this.anIntArray567[local7] = arg1 | Integer.MIN_VALUE;
			this.method5246();
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)V")
	public void method5243(@OriginalArg(0) boolean arg0) {
		this.aBoolean484 = arg0;
		this.method5246();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILclient!za;Lclient!ec;IIIILclient!jp;BLclient!cw;)Lclient!e;")
	public Class59 method5244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class128 arg8, @OriginalArg(11) Class47 arg9) {
		@Pc(12) int local12 = 2048;
		@Pc(104) int local104;
		if (arg8 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			local12 = 2080;
			@Pc(37) int local37 = arg8.anIntArray278[arg5];
			@Pc(43) int local43 = local37 >>> 16;
			@Pc(47) int local47 = local37 & 0xFFFF;
			@Pc(52) Class2_Sub5_Sub18 local52 = arg4.method1414(local43);
			if (local52 != null) {
				local18 = local52.method5629(local47) | false;
				local16 = local52.method5626(local47) | false;
				local22 = local52.method5630(local47) | false;
				local20 = arg8.aBoolean200 | false;
			}
			if ((arg8.aBoolean201 || Static390.aBoolean492) && arg7 != -1 && arg7 < arg8.anIntArray278.length) {
				local104 = arg8.anIntArray278[arg7];
				@Pc(108) int local108 = local104 >>> 16;
				@Pc(112) int local112 = local104 & 0xFFFF;
				@Pc(126) Class2_Sub5_Sub18 local126;
				if (local108 == local43) {
					local126 = local52;
				} else {
					local126 = arg4.method1414(local112 >>> 16);
				}
				if (local126 != null) {
					local18 |= local126.method5629(local112);
					local16 |= local126.method5626(local112);
					local22 |= local126.method5630(local112);
				}
			}
			if (local18) {
				local12 = 2208;
			}
			if (local16) {
				local12 |= 0x100;
			}
			if (local20) {
				local12 |= 0x200;
			}
			if (local22) {
				local12 |= 0x400;
			}
		}
		@Pc(189) long local189 = (long) arg6 << 32 | (long) (arg1 << 16) | (long) arg0;
		@Pc(191) Class132 local191 = Static55.aClass132_7;
		@Pc(199) Class59 local199;
		synchronized (Static55.aClass132_7) {
			local199 = (Class59) Static55.aClass132_7.method2701(local189);
		}
		if (local199 == null || arg3.method5502(local199.RA(), local12) != 0) {
			if (local199 != null) {
				local12 = arg3.method5514(local12, local199.RA());
			}
			@Pc(229) Class205[] local229 = new Class205[3];
			local104 = 0;
			if (!arg9.method963(arg0).method2147() || !arg9.method963(arg1).method2147() || !arg9.method963(arg6).method2147()) {
				return null;
			}
			@Pc(261) Class205 local261 = arg9.method963(arg0).method2138();
			if (local261 != null) {
				local104++;
				local229[0] = local261;
			}
			local261 = arg9.method963(arg1).method2138();
			if (local261 != null) {
				local229[local104++] = local261;
			}
			local261 = arg9.method963(arg6).method2138();
			if (local261 != null) {
				local229[local104++] = local261;
			}
			local261 = new Class205(local229, local104);
			@Pc(306) int local306 = local12 | 0x4000;
			local199 = arg3.method5530(local261, local306, Static3.anInt24, 64, 768);
			for (@Pc(316) int local316 = 0; local316 < 5; local316++) {
				if (this.anIntArray566[local316] < Static287.aShortArrayArray6[local316].length) {
					local199.q(Static306.aShortArray54[local316], Static287.aShortArrayArray6[local316][this.anIntArray566[local316]]);
				}
				if (Static104.aShortArrayArray1[local316].length > this.anIntArray566[local316]) {
					local199.q(Static171.aShortArray24[local316], Static104.aShortArrayArray1[local316][this.anIntArray566[local316]]);
				}
			}
			local199.D(local12);
			@Pc(371) Class132 local371 = Static55.aClass132_7;
			synchronized (Static55.aClass132_7) {
				Static55.aClass132_7.method2711(local199, local189);
			}
		}
		if (arg8 == null) {
			return local199;
		} else {
			local199 = local199.method5737((byte) 4, local12, true);
			return arg8.method2647(arg5, 2048, arg2, arg7, local199);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([II[IIIZ)V")
	public void method5245(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		this.anIntArray567 = arg0;
		if (this.anInt6784 != arg1) {
			this.anIntArrayArray55 = null;
			this.anInt6784 = arg1;
		}
		this.anIntArray566 = arg2;
		this.aBoolean484 = arg4;
		this.anInt6781 = arg3;
		this.method5246();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	private void method5246() {
		@Pc(7) long[] local7 = Class109_Sub1.aLongArray10;
		this.aLong203 = -1L;
		this.aLong203 = this.aLong203 >>> 8 ^ local7[(int) ((this.aLong203 ^ (long) (this.anInt6784 >> 8)) & 0xFFL)];
		this.aLong203 = this.aLong203 >>> 8 ^ local7[(int) ((this.aLong203 ^ (long) this.anInt6784) & 0xFFL)];
		for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
			this.aLong203 = local7[(int) (((long) (this.anIntArray567[local58] >> 24) ^ this.aLong203) & 0xFFL)] ^ this.aLong203 >>> 8;
			this.aLong203 = local7[(int) ((this.aLong203 ^ (long) (this.anIntArray567[local58] >> 16)) & 0xFFL)] ^ this.aLong203 >>> 8;
			this.aLong203 = local7[(int) (((long) (this.anIntArray567[local58] >> 8) ^ this.aLong203) & 0xFFL)] ^ this.aLong203 >>> 8;
			this.aLong203 = local7[(int) (((long) this.anIntArray567[local58] ^ this.aLong203) & 0xFFL)] ^ this.aLong203 >>> 8;
		}
		for (@Pc(154) int local154 = 0; local154 < 5; local154++) {
			this.aLong203 = local7[(int) (((long) this.anIntArray566[local154] ^ this.aLong203) & 0xFFL)] ^ this.aLong203 >>> 8;
		}
		this.aLong203 = this.aLong203 >>> 8 ^ local7[(int) (((long) (this.aBoolean484 ? 1 : 0) ^ this.aLong203) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!cw;IIILclient!jp;ILclient!jp;Lclient!wn;[Lclient!pp;ILclient!ls;Lclient!wc;ZIILclient!ec;Lclient!za;Lclient!mt;I)Lclient!e;")
	public Class59 method5247(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class128 arg5, @OriginalArg(7) Interface12 arg6, @OriginalArg(8) Class194[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class150 arg9, @OriginalArg(11) Class263 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class62 arg13, @OriginalArg(16) Class163 arg14, @OriginalArg(17) Class164 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt6781 != -1) {
			return arg10.method5581(this.anInt6781).method5198(arg3, arg9, arg11, arg8, arg6, arg4, arg13, arg1, arg5, arg7, arg16, arg14, arg12, arg2);
		}
		@Pc(33) int local33 = arg2;
		@Pc(36) long local36 = this.aLong203;
		@Pc(39) int[] local39 = this.anIntArray567;
		if (arg5 != null && (arg5.anInt3336 >= 0 || arg5.anInt3338 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray567[local58];
			}
			if (arg5.anInt3336 >= 0) {
				if (arg5.anInt3336 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg5.anInt3336 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg5.anInt3338 >= 0) {
				if (arg5.anInt3338 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg5.anInt3338 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(156) boolean local156 = arg5 != null || arg3 != null;
		@Pc(163) int local163 = arg7 == null ? 0 : arg7.length;
		@Pc(197) int local197;
		@Pc(202) int local202;
		for (@Pc(165) int local165 = 0; local165 < local163; local165++) {
			Static422.aClass2_Sub5_Sub18Array6[local165] = null;
			if (arg7[local165] != null) {
				@Pc(183) Class128 local183 = arg13.method1418(arg7[local165].anInt5380);
				if (local183.anIntArray278 != null) {
					Static221.aClass128Array2[local165] = local183;
					local156 = true;
					local197 = arg7[local165].anInt5384;
					local202 = arg7[local165].anInt5376;
					@Pc(207) int local207 = local183.anIntArray278[local197];
					Static422.aClass2_Sub5_Sub18Array6[local165] = arg13.method1414(local207 >>> 16);
					@Pc(220) int local220 = local207 & 0xFFFF;
					Static347.anIntArray514[local165] = local220;
					if (Static422.aClass2_Sub5_Sub18Array6[local165] != null) {
						local146 |= Static422.aClass2_Sub5_Sub18Array6[local165].method5629(local220);
						local144 |= Static422.aClass2_Sub5_Sub18Array6[local165].method5626(local220);
						local148 |= Static422.aClass2_Sub5_Sub18Array6[local165].method5630(local220);
					}
					if ((local183.aBoolean201 || Static390.aBoolean492) && local202 != -1 && local202 < local183.anIntArray278.length) {
						Static381.anIntArray542[local165] = local183.anIntArray276[local197];
						Static250.anIntArray350[local165] = arg7[local165].anInt5382;
						@Pc(314) int local314 = local183.anIntArray278[local202];
						Static201.aClass2_Sub5_Sub18Array2[local165] = arg13.method1414(local314 >>> 16);
						@Pc(327) int local327 = local314 & 0xFFFF;
						Static170.anIntArray233[local165] = local327;
						if (Static201.aClass2_Sub5_Sub18Array2[local165] != null) {
							local146 |= Static201.aClass2_Sub5_Sub18Array2[local165].method5629(local327);
							local144 |= Static201.aClass2_Sub5_Sub18Array2[local165].method5626(local327);
							local148 |= Static201.aClass2_Sub5_Sub18Array2[local165].method5630(local327);
						}
					} else {
						Static381.anIntArray542[local165] = 0;
						Static250.anIntArray350[local165] = 0;
						Static201.aClass2_Sub5_Sub18Array2[local165] = null;
						Static170.anIntArray233[local165] = -1;
					}
				}
			}
		}
		@Pc(372) int local372 = -1;
		local197 = -1;
		local202 = 0;
		@Pc(378) Class2_Sub5_Sub18 local378 = null;
		@Pc(380) Class2_Sub5_Sub18 local380 = null;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = -1;
		@Pc(386) int local386 = 0;
		@Pc(388) Class2_Sub5_Sub18 local388 = null;
		@Pc(390) Class2_Sub5_Sub18 local390 = null;
		if (local156) {
			local33 = arg2 | 0x20;
			@Pc(407) int local407;
			@Pc(470) int local470;
			if (arg5 != null) {
				local372 = arg5.anIntArray278[arg16];
				local407 = local372 >>> 16;
				local378 = arg13.method1414(local407);
				local372 &= 0xFFFF;
				if (local378 != null) {
					local146 |= local378.method5629(local372);
					local144 |= local378.method5626(local372);
					local148 |= local378.method5630(local372);
				}
				if ((arg5.aBoolean201 || Static390.aBoolean492) && arg8 != -1 && arg8 < arg5.anIntArray278.length) {
					local197 = arg5.anIntArray278[arg8];
					local202 = arg5.anIntArray276[arg16];
					local470 = local197 >>> 16;
					local197 &= 0xFFFF;
					local380 = local470 == local407 ? local378 : arg13.method1414(local470);
					if (local380 != null) {
						local146 |= local380.method5629(local197);
						local144 |= local380.method5626(local197);
						local148 |= local380.method5630(local197);
					}
				}
			}
			if (arg3 != null) {
				local382 = arg3.anIntArray278[arg12];
				local407 = local382 >>> 16;
				local382 &= 0xFFFF;
				local388 = arg13.method1414(local407);
				if (local388 != null) {
					local146 |= local388.method5629(local382);
					local144 |= local388.method5626(local382);
					local148 |= local388.method5630(local382);
				}
				if ((arg3.aBoolean201 || Static390.aBoolean492) && arg11 != -1 && arg3.anIntArray278.length > arg11) {
					local384 = arg3.anIntArray278[arg11];
					local386 = arg3.anIntArray276[arg12];
					local470 = local384 >>> 16;
					local384 &= 0xFFFF;
					local390 = local470 == local407 ? local388 : arg13.method1414(local470);
					if (local390 != null) {
						local146 |= local390.method5629(local384);
						local144 |= local390.method5626(local384);
						local148 |= local390.method5630(local384);
					}
				}
			}
			if (local146) {
				local33 |= 0x80;
			}
			if (local144) {
				local33 |= 0x100;
			}
			if (local148) {
				local33 |= 0x400;
			}
		}
		@Pc(644) Class132 local644 = Static192.aClass132_24;
		@Pc(652) Class59 local652;
		synchronized (Static192.aClass132_24) {
			local652 = (Class59) Static192.aClass132_24.method2701(local36);
		}
		@Pc(660) Class173 local660 = null;
		if (this.anInt6784 != -1) {
			local660 = arg9.method3066(this.anInt6784);
		}
		@Pc(705) int local705;
		@Pc(711) int local711;
		if (local652 == null || arg14.method5502(local652.RA(), local33) != 0 || local660 != null && local660.anIntArrayArray32 != null && this.anIntArrayArray55 == null) {
			if (local652 != null) {
				local33 = arg14.method5514(local33, local652.RA());
			}
			@Pc(703) boolean local703 = false;
			local705 = 0;
			while (true) {
				if (local705 >= 12) {
					if (local703) {
						if (this.aLong202 != -1L) {
							@Pc(760) Class132 local760 = Static192.aClass132_24;
							synchronized (Static192.aClass132_24) {
								local652 = (Class59) Static192.aClass132_24.method2701(this.aLong202);
							}
						}
						if (local652 == null || arg14.method5502(local652.RA(), local33) != 0 || local660 != null && local660.anIntArrayArray32 != null && this.anIntArrayArray55 == null) {
							return null;
						}
					} else {
						@Pc(799) Class205[] local799 = new Class205[12];
						@Pc(807) int local807;
						for (@Pc(801) int local801 = 0; local801 < 12; local801++) {
							local807 = local39[local801];
							@Pc(827) Class205 local827;
							if ((local807 & 0x40000000) != 0) {
								local827 = arg15.method3458(local807 & 0x3FFFFFFF).method4472(this.aBoolean484);
								if (local827 != null) {
									local799[local801] = local827;
								}
							} else if ((Integer.MIN_VALUE & local807) != 0) {
								local827 = arg0.method963(local807 & 0x3FFFFFFF).method2143();
								if (local827 != null) {
									local799[local801] = local827;
								}
							}
						}
						@Pc(885) int local885;
						if (local660 != null && local660.anIntArrayArray32 != null) {
							for (local807 = 0; local807 < local660.anIntArrayArray32.length; local807++) {
								if (local660.anIntArrayArray32[local807] != null && local799[local807] != null) {
									local885 = local660.anIntArrayArray32[local807][0];
									@Pc(892) int local892 = local660.anIntArrayArray32[local807][1];
									@Pc(899) int local899 = local660.anIntArrayArray32[local807][2];
									@Pc(908) int local908 = local660.anIntArrayArray32[local807][3] << 3;
									@Pc(917) int local917 = local660.anIntArrayArray32[local807][4] << 3;
									@Pc(926) int local926 = local660.anIntArrayArray32[local807][5] << 3;
									if (this.anIntArrayArray55 == null) {
										this.anIntArrayArray55 = new int[local660.anIntArrayArray32.length][];
									}
									if (this.anIntArrayArray55[local807] == null) {
										@Pc(948) int[] local948 = this.anIntArrayArray55[local807] = new int[15];
										if (local908 == 0 && local917 == 0 && local926 == 0) {
											local948[12] = -local885;
											local948[13] = -local892;
											local948[0] = local948[4] = local948[8] = 32768;
											local948[14] = -local899;
										} else {
											@Pc(993) int local993 = Class155.anIntArray341[local908];
											@Pc(997) int local997 = Class155.anIntArray342[local908];
											@Pc(1001) int local1001 = Class155.anIntArray341[local917];
											@Pc(1005) int local1005 = Class155.anIntArray342[local917];
											@Pc(1009) int local1009 = Class155.anIntArray341[local926];
											@Pc(1013) int local1013 = Class155.anIntArray342[local926];
											@Pc(1021) int local1021 = local1009 * local997 + 16384 >> 15;
											@Pc(1029) int local1029 = local1013 * local997 + 16384 >> 15;
											local948[2] = local993 * local1005 + 16384 >> 15;
											local948[4] = local1009 * local993 + 16384 >> 15;
											local948[3] = local1013 * local993 + 16384 >> 15;
											local948[7] = local1001 * local1021 + -local1013 * -local1005 + 16384 >> 15;
											local948[5] = -local997;
											local948[6] = local1029 * local1001 + local1009 * -local1005 + 16384 >> 15;
											local948[1] = local1005 * local1021 + local1001 * -local1013 + 16384 >> 15;
											local948[0] = local1005 * local1029 + local1001 * local1009 + 16384 >> 15;
											local948[8] = local993 * local1001 + 16384 >> 15;
											local948[13] = -local892 * local948[4] + local948[1] * -local885 + -local899 * local948[7] + 16384 >> 15;
											local948[14] = local948[8] * -local899 + -local885 * local948[2] + local948[5] * -local892 + 16384 >> 15;
											local948[12] = local948[3] * -local892 + -local885 * local948[0] + -local899 * local948[6] + 16384 >> 15;
										}
										local948[11] = local899;
										local948[9] = local885;
										local948[10] = local892;
									}
									if (local908 != 0 || local917 != 0 || local926 != 0) {
										local799[local807].method4452(local908, local926, local917);
									}
									if (local885 != 0 || local892 != 0 || local899 != 0) {
										local799[local807].method4445(local885, local899, local892);
									}
								}
							}
						}
						@Pc(1286) Class205 local1286 = new Class205(local799, local799.length);
						@Pc(1290) int local1290 = local33 | 0x4000;
						local652 = arg14.method5530(local1286, local1290, Static3.anInt24, 64, 850);
						for (local885 = 0; local885 < 5; local885++) {
							if (Static287.aShortArrayArray6[local885].length > this.anIntArray566[local885]) {
								local652.q(Static306.aShortArray54[local885], Static287.aShortArrayArray6[local885][this.anIntArray566[local885]]);
							}
							if (this.anIntArray566[local885] < Static104.aShortArrayArray1[local885].length) {
								local652.q(Static171.aShortArray24[local885], Static104.aShortArrayArray1[local885][this.anIntArray566[local885]]);
							}
						}
						local652.D(local33);
						@Pc(1357) Class132 local1357 = Static192.aClass132_24;
						synchronized (Static192.aClass132_24) {
							Static192.aClass132_24.method2711(local652, local36);
						}
						this.aLong202 = local36;
					}
					break;
				}
				local711 = local39[local705];
				if ((local711 & 0x40000000) == 0) {
					if ((local711 & Integer.MIN_VALUE) != 0 && !arg0.method963(local711 & 0x3FFFFFFF).method2140()) {
						local703 = true;
					}
				} else if (!arg15.method3458(local711 & 0x3FFFFFFF).method4484(this.aBoolean484)) {
					local703 = true;
				}
				local705++;
			}
		}
		@Pc(1381) Class59 local1381 = local652.method5737((byte) 4, local33, true);
		if (!local156) {
			return local1381;
		}
		@Pc(1387) int local1387 = 0;
		local705 = 1;
		while (local1387 < local163) {
			if (Static422.aClass2_Sub5_Sub18Array6[local1387] != null) {
				local1381.method5735(false, Static381.anIntArray542[local1387], this.anIntArrayArray55 == null ? null : this.anIntArrayArray55[local1387], Static250.anIntArray350[local1387] - 1, Static170.anIntArray233[local1387], Static201.aClass2_Sub5_Sub18Array2[local1387], local705, Static422.aClass2_Sub5_Sub18Array6[local1387], Static347.anIntArray514[local1387]);
			}
			local1387++;
			local705 <<= 0x1;
		}
		if (local378 != null && local388 != null) {
			local1381.method5747(false, arg5.aBooleanArray12, local382, local202, arg1 - 1, local388, local390, arg4 - 1, local372, local380, local197, local386, local378, local384);
		} else if (local378 != null) {
			local1381.method5750(local380, arg1 - 1, local197, 0, local378, local202, local372, false);
		} else if (local388 != null) {
			local1381.method5750(local390, arg4 - 1, local384, 0, local388, local386, local382, false);
		}
		for (local711 = 0; local711 < local163; local711++) {
			Static422.aClass2_Sub5_Sub18Array6[local711] = null;
			Static201.aClass2_Sub5_Sub18Array2[local711] = null;
			Static221.aClass128Array2[local711] = null;
		}
		return local1381;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V")
	public void method5249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray566[arg1] = arg0;
		this.method5246();
	}
}
