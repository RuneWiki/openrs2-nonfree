import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class218 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	private int anInt5432;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public int anInt5430 = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZILclient!mn;)V")
	public void method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class225 arg2) {
		if (arg1 == -1) {
			this.anIntArray369[arg0] = 0;
		} else if (arg2.method4789(arg1) != null) {
			this.anIntArray369[arg0] = arg1 | 0x40000000;
			this.method4617();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)V")
	public void method4613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray370[arg0] = arg1;
		this.method4617();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!aca;Lclient!ec;I[IILclient!qg;ILclient!jn;Lclient!baa;II[Lclient!oi;Lclient!ha;Lclient!mn;IIILclient!ec;ILclient!ffa;Z)Lclient!ka;")
	public Class182 method4614(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class283 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class173 arg7, @OriginalArg(8) Class23 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class250[] arg10, @OriginalArg(12) Class95 arg11, @OriginalArg(13) Class225 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class81 arg16, @OriginalArg(18) int arg17, @OriginalArg(19) Class107 arg18) {
		if (this.anInt5430 != -1) {
			return arg18.method2291(this.anInt5430).method3190(arg3, arg1, arg0, arg13, arg10, arg9, arg15, arg2, arg17, arg7, arg16, arg4, arg6, arg14, arg11, arg5);
		}
		@Pc(36) int local36 = arg14;
		@Pc(39) long local39 = this.aLong150;
		@Pc(42) int[] local42 = this.anIntArray369;
		if (arg1 != null && (arg1.anInt2139 >= 0 || arg1.anInt2154 >= 0)) {
			local42 = new int[12];
			for (@Pc(61) int local61 = 0; local61 < 12; local61++) {
				local42[local61] = this.anIntArray369[local61];
			}
			if (arg1.anInt2139 >= 0) {
				if (arg1.anInt2139 == 65535) {
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg1.anInt2139 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg1.anInt2154 >= 0) {
				if (arg1.anInt2154 == 65535) {
					local39 ^= 0xFFFFFFFFL;
					local42[3] = 0;
				} else {
					local42[3] = arg1.anInt2154 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(151) boolean local151 = false;
		@Pc(159) boolean local159 = arg1 != null || arg16 != null;
		@Pc(166) int local166 = arg10 == null ? 0 : arg10.length;
		@Pc(200) int local200;
		@Pc(205) int local205;
		for (@Pc(168) int local168 = 0; local168 < local166; local168++) {
			Static253.aClass2_Sub2_Sub15Array59[local168] = null;
			if (arg10[local168] != null) {
				@Pc(186) Class81 local186 = arg7.method3791(arg10[local168].anInt6333);
				if (local186.anIntArray149 != null) {
					local159 = true;
					Static329.aClass81Array1[local168] = local186;
					local200 = arg10[local168].anInt6330;
					local205 = arg10[local168].anInt6334;
					@Pc(210) int local210 = local186.anIntArray149[local200];
					Static253.aClass2_Sub2_Sub15Array59[local168] = arg7.method3793(local210 >>> 16);
					@Pc(223) int local223 = local210 & 0xFFFF;
					Static142.anIntArray175[local168] = local223;
					if (Static253.aClass2_Sub2_Sub15Array59[local168] != null) {
						local149 |= Static253.aClass2_Sub2_Sub15Array59[local168].method5015(local223);
						local147 |= Static253.aClass2_Sub2_Sub15Array59[local168].method5014(local223);
						local151 |= Static253.aClass2_Sub2_Sub15Array59[local168].method5012(local223);
					}
					if ((local186.aBoolean158 || Static621.aBoolean729) && local205 != -1 && local186.anIntArray149.length > local205) {
						Static375.anIntArray434[local168] = local186.anIntArray151[local200];
						Static520.anIntArray581[local168] = arg10[local168].anInt6331;
						@Pc(290) int local290 = local186.anIntArray149[local205];
						Static339.aClass2_Sub2_Sub15Array77[local168] = arg7.method3793(local290 >>> 16);
						@Pc(303) int local303 = local290 & 0xFFFF;
						Static128.anIntArray161[local168] = local303;
						if (Static339.aClass2_Sub2_Sub15Array77[local168] != null) {
							local149 |= Static339.aClass2_Sub2_Sub15Array77[local168].method5015(local303);
							local147 |= Static339.aClass2_Sub2_Sub15Array77[local168].method5014(local303);
							local151 |= Static339.aClass2_Sub2_Sub15Array77[local168].method5012(local303);
						}
					} else {
						Static375.anIntArray434[local168] = 0;
						Static520.anIntArray581[local168] = 0;
						Static339.aClass2_Sub2_Sub15Array77[local168] = null;
						Static128.anIntArray161[local168] = -1;
					}
				}
			}
		}
		@Pc(368) int local368 = -1;
		local200 = -1;
		local205 = 0;
		@Pc(374) Class2_Sub2_Sub15 local374 = null;
		@Pc(376) Class2_Sub2_Sub15 local376 = null;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = 0;
		@Pc(384) Class2_Sub2_Sub15 local384 = null;
		@Pc(386) Class2_Sub2_Sub15 local386 = null;
		if (local159) {
			@Pc(399) int local399;
			@Pc(460) int local460;
			if (arg1 != null) {
				local368 = arg1.anIntArray149[arg17];
				local399 = local368 >>> 16;
				local374 = arg7.method3793(local399);
				local368 &= 0xFFFF;
				if (local374 != null) {
					local149 |= local374.method5015(local368);
					local147 |= local374.method5014(local368);
					local151 |= local374.method5012(local368);
				}
				if ((arg1.aBoolean158 || Static621.aBoolean729) && arg6 != -1 && arg6 < arg1.anIntArray149.length) {
					local205 = arg1.anIntArray151[arg17];
					local200 = arg1.anIntArray149[arg6];
					local460 = local200 >>> 16;
					local376 = local460 == local399 ? local374 : arg7.method3793(local460);
					local200 &= 0xFFFF;
					if (local376 != null) {
						local149 |= local376.method5015(local200);
						local147 |= local376.method5014(local200);
						local151 |= local376.method5012(local200);
					}
				}
			}
			local36 = arg14 | 0x20;
			if (arg16 != null) {
				local378 = arg16.anIntArray149[arg15];
				local399 = local378 >>> 16;
				local384 = arg7.method3793(local399);
				local378 &= 0xFFFF;
				if (local384 != null) {
					local149 |= local384.method5015(local378);
					local147 |= local384.method5014(local378);
					local151 |= local384.method5012(local378);
				}
				if ((arg16.aBoolean158 || Static621.aBoolean729) && arg2 != -1 && arg16.anIntArray149.length > arg2) {
					local382 = arg16.anIntArray151[arg15];
					local380 = arg16.anIntArray149[arg2];
					local460 = local380 >>> 16;
					local386 = local399 == local460 ? local384 : arg7.method3793(local460);
					local380 &= 0xFFFF;
					if (local386 != null) {
						local149 |= local386.method5015(local380);
						local147 |= local386.method5014(local380);
						local151 |= local386.method5012(local380);
					}
				}
			}
			if (local149) {
				local36 |= 0x80;
			}
			if (local147) {
				local36 |= 0x100;
			}
			if (local151) {
				local36 |= 0x400;
			}
		}
		@Pc(645) Class32 local645 = Static256.aClass32_44;
		@Pc(655) Class182 local655;
		synchronized (Static256.aClass32_44) {
			local655 = (Class182) Static256.aClass32_44.method630(local39);
		}
		@Pc(663) Class334 local663 = null;
		if (this.anInt5432 != -1) {
			local663 = arg5.method6260(this.anInt5432);
		}
		@Pc(694) boolean local694;
		@Pc(696) int local696;
		@Pc(702) int local702;
		@Pc(781) int local781;
		@Pc(787) int local787;
		@Pc(850) int local850;
		if (local655 == null || arg11.method6963(local655.ua(), local36) != 0) {
			if (local655 != null) {
				local36 = arg11.method7005(local36, local655.ua());
			}
			local694 = false;
			local696 = 0;
			while (true) {
				if (local696 >= 12) {
					if (local694) {
						if (this.aLong149 != -1L) {
							@Pc(751) Class32 local751 = Static256.aClass32_44;
							synchronized (Static256.aClass32_44) {
								local655 = (Class182) Static256.aClass32_44.method630(this.aLong149);
							}
						}
						if (local655 == null || arg11.method6963(local655.ua(), local36) != 0) {
							return null;
						}
					} else {
						@Pc(779) Class186[] local779 = new Class186[12];
						for (local781 = 0; local781 < 12; local781++) {
							local787 = local42[local781];
							@Pc(802) Class186 local802;
							if ((local787 & 0x40000000) != 0) {
								local802 = arg12.method4789(local787 & 0x3FFFFFFF).method683(this.aBoolean389);
								if (local802 != null) {
									local779[local781] = local802;
								}
							} else if ((Integer.MIN_VALUE & local787) != 0) {
								local802 = arg8.method548(local787 & 0x3FFFFFFF).method6846();
								if (local802 != null) {
									local779[local781] = local802;
								}
							}
						}
						@Pc(852) int local852;
						if (local663 != null && local663.anIntArrayArray58 != null) {
							for (local787 = 0; local787 < local663.anIntArrayArray58.length; local787++) {
								if (local779[local787] != null) {
									local850 = 0;
									local852 = 0;
									@Pc(854) int local854 = 0;
									@Pc(856) int local856 = 0;
									@Pc(858) int local858 = 0;
									@Pc(860) int local860 = 0;
									if (local663.anIntArrayArray58[local787] != null) {
										local860 = local663.anIntArrayArray58[local787][5] << 3;
										local854 = local663.anIntArrayArray58[local787][2];
										local852 = local663.anIntArrayArray58[local787][1];
										local858 = local663.anIntArrayArray58[local787][4] << 3;
										local850 = local663.anIntArrayArray58[local787][0];
										local856 = local663.anIntArrayArray58[local787][3] << 3;
									}
									if (local856 != 0 || local858 != 0 || local860 != 0) {
										local779[local787].method4002(local860, local858, local856);
									}
									if (local850 != 0 || local852 != 0 || local854 != 0) {
										local779[local787].method4005(local850, local854, local852);
									}
								}
							}
						}
						@Pc(964) int local964 = local36 | 0x4000;
						@Pc(971) Class186 local971 = new Class186(local779, local779.length);
						local655 = arg11.method6938(local971, local964, Static189.anInt3263, 64, 850);
						for (local850 = 0; local850 < 5; local850++) {
							for (local852 = 0; local852 < Static100.aShortArrayArrayArray5.length; local852++) {
								if (Static100.aShortArrayArrayArray5[local852][local850].length > this.anIntArray370[local850]) {
									local655.ia(Static375.aShortArrayArray23[local852][local850], Static100.aShortArrayArrayArray5[local852][local850][this.anIntArray370[local850]]);
								}
							}
						}
						local655.s(local36);
						@Pc(1039) Class32 local1039 = Static256.aClass32_44;
						synchronized (Static256.aClass32_44) {
							Static256.aClass32_44.method629(local655, local39);
						}
						this.aLong149 = local39;
					}
					break;
				}
				local702 = local42[local696];
				if ((local702 & 0x40000000) == 0) {
					if ((local702 & Integer.MIN_VALUE) != 0 && !arg8.method548(local702 & 0x3FFFFFFF).method6845()) {
						local694 = true;
					}
				} else if (!arg12.method4789(local702 & 0x3FFFFFFF).method700(this.aBoolean389)) {
					local694 = true;
				}
				local696++;
			}
		}
		@Pc(1066) Class182 local1066 = local655.method6208((byte) 4, local36, true);
		local694 = false;
		if (arg3 != null) {
			for (local696 = 0; local696 < 12; local696++) {
				if (arg3[local696] != -1) {
					local694 = true;
				}
			}
		}
		if (!local159 && !local694) {
			return local1066;
		}
		@Pc(1093) Class177[] local1093 = null;
		if (local663 != null) {
			local1093 = local663.method7492(arg11);
		}
		if (local694 && local1093 != null) {
			for (local702 = 0; local702 < 12; local702++) {
				if (local1093[local702] != null) {
					local1066.method6204(local1093[local702], 0x1 << local702, true);
				}
			}
		}
		local702 = 0;
		local781 = 1;
		while (local702 < local166) {
			if (Static253.aClass2_Sub2_Sub15Array59[local702] != null) {
				local1066.method6199(Static375.anIntArray434[local702], local781, Static128.anIntArray161[local702], null, false, Static339.aClass2_Sub2_Sub15Array77[local702], Static253.aClass2_Sub2_Sub15Array59[local702], Static520.anIntArray581[local702] - 1, Static142.anIntArray175[local702]);
			}
			local781 <<= 0x1;
			local702++;
		}
		if (local694) {
			for (local787 = 0; local787 < 12; local787++) {
				if (arg3[local787] != -1) {
					local850 = arg3[local787] - arg13;
					local850 &= 0x3FFF;
					@Pc(1204) Class177 local1204 = arg11.method7001();
					local1204.method7877(local850);
					local1066.method6204(local1204, 0x1 << local787, false);
				}
			}
		}
		if (local694 && local1093 != null) {
			for (local787 = 0; local787 < 12; local787++) {
				if (local1093[local787] != null) {
					local1066.method6204(local1093[local787], 0x1 << local787, false);
				}
			}
		}
		if (local374 != null && local384 != null) {
			local1066.method6202(local200, arg9 - 1, arg4 - 1, local376, local205, local378, local374, local386, local368, false, local380, local382, arg1.aBooleanArray38, local384);
		} else if (local374 != null) {
			local1066.method6200(local374, arg9 - 1, local368, 0, local200, local376, false, local205);
		} else if (local384 != null) {
			local1066.method6200(local384, arg4 - 1, local378, 0, local380, local386, false, local382);
		}
		for (local787 = 0; local787 < local166; local787++) {
			Static253.aClass2_Sub2_Sub15Array59[local787] = null;
			Static339.aClass2_Sub2_Sub15Array77[local787] = null;
			Static329.aClass81Array1[local787] = null;
		}
		return local1066;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZ)V")
	public void method4615(@OriginalArg(1) boolean arg0) {
		this.aBoolean389 = arg0;
		this.method4617();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!jn;IIIIIILclient!baa;ILclient!ec;Lclient!ha;I)Lclient!ka;")
	public Class182 method4616(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class23 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class81 arg8, @OriginalArg(10) Class95 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(95) int local95;
		@Pc(38) int local38;
		if (arg8 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg8.anIntArray149[arg5];
			local7 = 2080;
			local38 = local30 >>> 16;
			@Pc(43) Class2_Sub2_Sub15 local43 = arg0.method3793(local38);
			@Pc(47) int local47 = local30 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5015(local47) | false;
				local11 = local43.method5014(local47) | false;
				local17 = local43.method5012(local47) | false;
				local15 = arg8.aBoolean159 | false;
			}
			if ((arg8.aBoolean158 || Static621.aBoolean729) && arg4 != -1 && arg8.anIntArray149.length > arg4) {
				local95 = arg8.anIntArray149[arg4];
				@Pc(99) int local99 = local95 >>> 16;
				@Pc(103) int local103 = local95 & 0xFFFF;
				@Pc(112) Class2_Sub2_Sub15 local112;
				if (local38 == local99) {
					local112 = local43;
				} else {
					local112 = arg0.method3793(local103 >>> 16);
				}
				if (local112 != null) {
					local13 |= local112.method5015(local103);
					local11 |= local112.method5014(local103);
					local17 |= local112.method5012(local103);
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
		@Pc(182) long local182 = (long) arg3 | (long) (arg2 << 16) | (long) arg7 << 32;
		@Pc(184) Class32 local184 = Static136.aClass32_86;
		@Pc(194) Class182 local194;
		synchronized (Static136.aClass32_86) {
			local194 = (Class182) Static136.aClass32_86.method630(local182);
		}
		if (local194 == null || arg9.method6963(local194.ua(), local7) != 0) {
			if (local194 != null) {
				local7 = arg9.method7005(local7, local194.ua());
			}
			@Pc(230) Class186[] local230 = new Class186[3];
			local95 = 0;
			if (!arg6.method548(arg3).method6840() || !arg6.method548(arg2).method6840() || !arg6.method548(arg7).method6840()) {
				return null;
			}
			@Pc(260) Class186 local260 = arg6.method548(arg3).method6847();
			if (local260 != null) {
				local95++;
				local230[0] = local260;
			}
			local260 = arg6.method548(arg2).method6847();
			if (local260 != null) {
				local230[local95++] = local260;
			}
			local260 = arg6.method548(arg7).method6847();
			if (local260 != null) {
				local230[local95++] = local260;
			}
			local260 = new Class186(local230, local95);
			@Pc(305) int local305 = local7 | 0x4000;
			local194 = arg9.method6938(local260, local305, Static189.anInt3263, 64, 768);
			for (@Pc(315) int local315 = 0; local315 < 5; local315++) {
				for (local38 = 0; local38 < Static100.aShortArrayArrayArray5.length; local38++) {
					if (this.anIntArray370[local315] < Static100.aShortArrayArrayArray5[local38][local315].length) {
						local194.ia(Static375.aShortArrayArray23[local38][local315], Static100.aShortArrayArrayArray5[local38][local315][this.anIntArray370[local315]]);
					}
				}
			}
			local194.s(local7);
			@Pc(363) Class32 local363 = Static136.aClass32_86;
			synchronized (Static136.aClass32_86) {
				Static136.aClass32_86.method629(local194, local182);
			}
		}
		if (arg8 == null) {
			return local194;
		} else {
			local194 = local194.method6208((byte) 4, local7, true);
			return arg8.method1747(local194, 2048, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	private void method4617() {
		this.aLong150 = -1L;
		@Pc(14) long[] local14 = Class250.aLongArray28;
		this.aLong150 = local14[(int) ((this.aLong150 ^ (long) (this.anInt5432 >> 8)) & 0xFFL)] ^ this.aLong150 >>> 8;
		this.aLong150 = local14[(int) (((long) this.anInt5432 ^ this.aLong150) & 0xFFL)] ^ this.aLong150 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong150 = this.aLong150 >>> 8 ^ local14[(int) (((long) (this.anIntArray369[local54] >> 24) ^ this.aLong150) & 0xFFL)];
			this.aLong150 = this.aLong150 >>> 8 ^ local14[(int) (((long) (this.anIntArray369[local54] >> 16) ^ this.aLong150) & 0xFFL)];
			this.aLong150 = local14[(int) ((this.aLong150 ^ (long) (this.anIntArray369[local54] >> 8)) & 0xFFL)] ^ this.aLong150 >>> 8;
			this.aLong150 = this.aLong150 >>> 8 ^ local14[(int) (((long) this.anIntArray369[local54] ^ this.aLong150) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong150 = this.aLong150 >>> 8 ^ local14[(int) ((this.aLong150 ^ (long) this.anIntArray370[local150]) & 0xFFL)];
		}
		this.aLong150 = local14[(int) (((long) (this.aBoolean389 ? 1 : 0) ^ this.aLong150) & 0xFFL)] ^ this.aLong150 >>> 8;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!baa;II)V")
	public void method4618(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static126.anIntArray158[arg2];
		if (arg0.method548(arg1) != null) {
			this.anIntArray369[local7] = arg1 | Integer.MIN_VALUE;
			this.method4617();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II[I[IIZ)V")
	public void method4619(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.anInt5430 = arg3;
		this.anIntArray370 = arg1;
		this.anIntArray369 = arg2;
		this.aBoolean389 = arg4;
		if (arg0 != this.anInt5432) {
			this.anInt5432 = arg0;
		}
		this.method4617();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!baa;Lclient!ha;Lclient!mn;ILclient!aca;IBILclient!ec;ILclient!jn;Lclient!ffa;)Lclient!ka;")
	public Class182 method4620(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class81 arg7, @OriginalArg(10) Class173 arg8, @OriginalArg(11) Class107 arg9) {
		if (this.anInt5430 != -1) {
			return arg9.method2291(this.anInt5430).method3199(arg1, arg4, arg6, arg8, arg5, arg3, arg7);
		}
		@Pc(36) int local36 = 2048;
		@Pc(44) boolean local44;
		@Pc(57) int local57;
		@Pc(122) int local122;
		@Pc(67) int local67;
		@Pc(126) int local126;
		if (arg7 != null) {
			@Pc(40) boolean local40 = false;
			@Pc(42) boolean local42 = false;
			local44 = false;
			@Pc(46) boolean local46 = false;
			local57 = arg7.anIntArray149[arg5];
			local36 = 2080;
			local67 = local57 >>> 16;
			@Pc(72) Class2_Sub2_Sub15 local72 = arg8.method3793(local67);
			@Pc(76) int local76 = local57 & 0xFFFF;
			if (local72 != null) {
				local42 = local72.method5015(local76) | false;
				local40 = local72.method5014(local76) | false;
				local46 = local72.method5012(local76) | false;
				local44 = arg7.aBoolean159 | false;
			}
			if ((arg7.aBoolean158 || Static621.aBoolean729) && arg6 != -1 && arg7.anIntArray149.length > arg6) {
				local122 = arg7.anIntArray149[arg6];
				local126 = local122 >>> 16;
				@Pc(136) Class2_Sub2_Sub15 local136 = local126 == local67 ? local72 : arg8.method3793(local126);
				@Pc(140) int local140 = local122 & 0xFFFF;
				if (local136 != null) {
					local42 |= local136.method5015(local140);
					local40 |= local136.method5014(local140);
					local46 |= local136.method5012(local140);
				}
			}
			if (local42) {
				local36 = 2208;
			}
			if (local40) {
				local36 |= 0x100;
			}
			if (local44) {
				local36 |= 0x200;
			}
			if (local46) {
				local36 |= 0x400;
			}
		}
		@Pc(189) Class32 local189 = Static136.aClass32_86;
		@Pc(198) Class182 local198;
		synchronized (Static136.aClass32_86) {
			local198 = (Class182) Static136.aClass32_86.method630(this.aLong150);
		}
		if (local198 == null || arg1.method6963(local198.ua(), local36) != 0) {
			if (local198 != null) {
				local36 = arg1.method7005(local36, local198.ua());
			}
			local44 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local57 = this.anIntArray369[local229];
				if ((local57 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local57) != 0 && !arg0.method548(local57 & 0x3FFFFFFF).method6840()) {
						local44 = true;
					}
				} else if (!arg2.method4789(local57 & 0x3FFFFFFF).method685(this.aBoolean389)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(289) Class186[] local289 = new Class186[12];
			local122 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(300) int local300 = this.anIntArray369[local293];
				@Pc(317) Class186 local317;
				if ((local300 & 0x40000000) != 0) {
					local317 = arg2.method4789(local300 & 0x3FFFFFFF).method682(this.aBoolean389);
					if (local317 != null) {
						local289[local122++] = local317;
					}
				} else if ((local300 & Integer.MIN_VALUE) != 0) {
					local317 = arg0.method548(local300 & 0x3FFFFFFF).method6847();
					if (local317 != null) {
						local289[local122++] = local317;
					}
				}
			}
			@Pc(354) int local354 = local36 | 0x4000;
			@Pc(360) Class186 local360 = new Class186(local289, local122);
			local198 = arg1.method6938(local360, local354, Static189.anInt3263, 64, 768);
			for (local67 = 0; local67 < 5; local67++) {
				for (local126 = 0; local126 < Static100.aShortArrayArrayArray5.length; local126++) {
					if (Static100.aShortArrayArrayArray5[local126][local67].length > this.anIntArray370[local67]) {
						local198.ia(Static375.aShortArrayArray23[local126][local67], Static100.aShortArrayArrayArray5[local126][local67][this.anIntArray370[local67]]);
					}
				}
			}
			local198.s(local36);
			@Pc(428) Class32 local428 = Static136.aClass32_86;
			synchronized (Static136.aClass32_86) {
				Static136.aClass32_86.method629(local198, this.aLong150);
			}
		}
		if (arg7 == null) {
			return local198;
		} else {
			local198.method6208((byte) 4, local36, true);
			return arg7.method1747(local198, 2048, arg5, arg6, arg3);
		}
	}
}
