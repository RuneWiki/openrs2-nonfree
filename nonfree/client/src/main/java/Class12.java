import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class12 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt259 = -1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!hp;II)V")
	public void method272(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			this.anIntArray8[arg0] = 0;
		} else if (arg1.method3730(arg2) != null) {
			this.anIntArray8[arg0] = arg2 | 0x40000000;
			this.method283();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ao;[Lclient!gea;Lclient!ha;Lclient!daa;IILclient!wg;ILclient!bg;IIIILclient!hp;Lclient!ao;[ILclient!ul;IZILclient!vi;)Lclient!ka;")
	public Class24 method273(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class113[] arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class58 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class373 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class34 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) Class138 arg12, @OriginalArg(14) Class21 arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) Class346 arg15, @OriginalArg(17) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Interface25 arg18) {
		if (this.anInt259 != -1) {
			return arg15.method8199(this.anInt259).method6607(arg11, arg2, (Class30) null, arg10, arg13, arg18, arg7, arg1, arg5, arg4, arg16, arg8, arg9, arg0, arg17, arg14, arg6);
		}
		@Pc(37) int local37 = arg16;
		@Pc(40) long local40 = this.aLong14;
		@Pc(43) int[] local43 = this.anIntArray8;
		if (arg13 != null && (arg13.anInt360 >= 0 || arg13.anInt348 >= 0)) {
			local43 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local43[local56] = this.anIntArray8[local56];
			}
			if (arg13.anInt360 >= 0) {
				if (arg13.anInt360 == 65535) {
					local43[5] = 0;
					local40 ^= 0xFFFFFFFF00000000L;
				} else {
					local43[5] = arg13.anInt360 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg13.anInt348 >= 0) {
				if (arg13.anInt348 == 65535) {
					local43[3] = 0;
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[3] = arg13.anInt348 | 0x40000000;
					local40 ^= (long) local43[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg13 != null || arg0 != null;
		@Pc(159) int local159 = arg1 == null ? 0 : arg1.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static618.aClass6_Sub2_Sub1Array8[local161] = null;
			if (arg1[local161] != null) {
				@Pc(179) Class21 local179 = arg6.method8738(arg1[local161].anInt3650);
				if (local179.anIntArray15 != null) {
					local152 = true;
					Static270.aClass21Array1[local161] = local179;
					local193 = arg1[local161].anInt3647;
					local198 = arg1[local161].anInt3651;
					@Pc(203) int local203 = local179.anIntArray15[local193];
					Static618.aClass6_Sub2_Sub1Array8[local161] = arg6.method8741(local203 >>> 16);
					@Pc(216) int local216 = local203 & 0xFFFF;
					Static259.anIntArray299[local161] = local216;
					if (Static618.aClass6_Sub2_Sub1Array8[local161] != null) {
						local142 |= Static618.aClass6_Sub2_Sub1Array8[local161].method192(local216);
						local140 |= Static618.aClass6_Sub2_Sub1Array8[local161].method190(local216);
						local144 |= Static618.aClass6_Sub2_Sub1Array8[local161].method191(local216);
					}
					if ((local179.aBoolean13 || Static43.aBoolean46) && local198 != -1 && local179.anIntArray15.length > local198) {
						Static31.anIntArray37[local161] = local179.anIntArray17[local193];
						Static646.anIntArray427[local161] = arg1[local161].anInt3649;
						@Pc(287) int local287 = local179.anIntArray15[local198];
						Static578.aClass6_Sub2_Sub1Array7[local161] = arg6.method8741(local287 >>> 16);
						@Pc(300) int local300 = local287 & 0xFFFF;
						Static185.anIntArray227[local161] = local300;
						if (Static578.aClass6_Sub2_Sub1Array7[local161] != null) {
							local142 |= Static578.aClass6_Sub2_Sub1Array7[local161].method192(local300);
							local140 |= Static578.aClass6_Sub2_Sub1Array7[local161].method190(local300);
							local144 |= Static578.aClass6_Sub2_Sub1Array7[local161].method191(local300);
						}
					} else {
						Static31.anIntArray37[local161] = 0;
						Static646.anIntArray427[local161] = 0;
						Static578.aClass6_Sub2_Sub1Array7[local161] = null;
						Static185.anIntArray227[local161] = -1;
					}
				}
			}
		}
		@Pc(359) int local359 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(374) Class6_Sub2_Sub1 local374 = null;
		@Pc(376) Class6_Sub2_Sub1 local376 = null;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = 0;
		@Pc(384) Class6_Sub2_Sub1 local384 = null;
		@Pc(386) Class6_Sub2_Sub1 local386 = null;
		if (local152) {
			@Pc(399) int local399;
			@Pc(459) int local459;
			if (arg13 != null) {
				local359 = arg13.anIntArray15[arg5];
				local399 = local359 >>> 16;
				local374 = arg6.method8741(local399);
				local359 &= 0xFFFF;
				if (local374 != null) {
					local142 |= local374.method192(local359);
					local140 |= local374.method190(local359);
					local144 |= local374.method191(local359);
				}
				if ((arg13.aBoolean13 || Static43.aBoolean46) && arg17 != -1 && arg13.anIntArray15.length > arg17) {
					local193 = arg13.anIntArray15[arg17];
					local198 = arg13.anIntArray17[arg5];
					local459 = local193 >>> 16;
					local193 &= 0xFFFF;
					local376 = local459 == local399 ? local374 : arg6.method8741(local459);
					if (local376 != null) {
						local142 |= local376.method192(local193);
						local140 |= local376.method190(local193);
						local144 |= local376.method191(local193);
					}
				}
			}
			local37 = arg16 | 0x20;
			if (arg0 != null) {
				local378 = arg0.anIntArray15[arg4];
				local399 = local378 >>> 16;
				local384 = arg6.method8741(local399);
				local378 &= 0xFFFF;
				if (local384 != null) {
					local142 |= local384.method192(local378);
					local140 |= local384.method190(local378);
					local144 |= local384.method191(local378);
				}
				if ((arg0.aBoolean13 || Static43.aBoolean46) && arg10 != -1 && arg0.anIntArray15.length > arg10) {
					local380 = arg0.anIntArray15[arg10];
					local382 = arg0.anIntArray17[arg4];
					local459 = local380 >>> 16;
					local386 = local459 == local399 ? local384 : arg6.method8741(local459);
					local380 &= 0xFFFF;
					if (local386 != null) {
						local142 |= local386.method192(local380);
						local140 |= local386.method190(local380);
						local144 |= local386.method191(local380);
					}
				}
			}
			if (local142) {
				local37 |= 0x80;
			}
			if (local140) {
				local37 |= 0x100;
			}
			if (local144) {
				local37 |= 0x400;
			}
		}
		@Pc(628) Class166 local628 = Static3.aClass166_1;
		@Pc(636) Class24 local636;
		synchronized (Static3.aClass166_1) {
			local636 = (Class24) Static3.aClass166_1.method4805(local40);
		}
		@Pc(644) Class201 local644 = null;
		if (this.anInt260 != -1) {
			local644 = arg8.method803(this.anInt260);
		}
		@Pc(675) boolean local675;
		@Pc(677) int local677;
		@Pc(683) int local683;
		@Pc(767) int local767;
		@Pc(773) int local773;
		@Pc(834) int local834;
		if (local636 == null || arg2.method8821(local636.ua(), local37) != 0) {
			if (local636 != null) {
				local37 = arg2.method8820(local37, local636.ua());
			}
			local675 = false;
			local677 = 0;
			while (true) {
				if (local677 >= 12) {
					if (local675) {
						if (this.aLong13 != -1L) {
							@Pc(737) Class166 local737 = Static3.aClass166_1;
							synchronized (Static3.aClass166_1) {
								local636 = (Class24) Static3.aClass166_1.method4805(this.aLong13);
							}
						}
						if (local636 == null || arg2.method8821(local636.ua(), local37) != 0) {
							return null;
						}
					} else {
						@Pc(765) Class64[] local765 = new Class64[12];
						for (local767 = 0; local767 < 12; local767++) {
							local773 = local43[local767];
							@Pc(788) Class64 local788;
							if ((local773 & 0x40000000) != 0) {
								local788 = arg12.method3730(local773 & 0x3FFFFFFF).method8250(this.aBoolean7);
								if (local788 != null) {
									local765[local767] = local788;
								}
							} else if ((local773 & Integer.MIN_VALUE) != 0) {
								local788 = arg3.method1514(local773 & 0x3FFFFFFF).method7442();
								if (local788 != null) {
									local765[local767] = local788;
								}
							}
						}
						@Pc(836) int local836;
						if (local644 != null && local644.anIntArrayArray25 != null) {
							for (local773 = 0; local773 < local644.anIntArrayArray25.length; local773++) {
								if (local765[local773] != null) {
									local834 = 0;
									local836 = 0;
									@Pc(838) int local838 = 0;
									@Pc(840) int local840 = 0;
									@Pc(842) int local842 = 0;
									@Pc(844) int local844 = 0;
									if (local644.anIntArrayArray25[local773] != null) {
										local834 = local644.anIntArrayArray25[local773][0];
										local844 = local644.anIntArrayArray25[local773][5] << 3;
										local836 = local644.anIntArrayArray25[local773][1];
										local840 = local644.anIntArrayArray25[local773][3] << 3;
										local838 = local644.anIntArrayArray25[local773][2];
										local842 = local644.anIntArrayArray25[local773][4] << 3;
									}
									if (local840 != 0 || local842 != 0 || local844 != 0) {
										local765[local773].method1657(local844, local840, local842);
									}
									if (local834 != 0 || local836 != 0 || local838 != 0) {
										local765[local773].method1650(local836, local834, local838);
									}
								}
							}
						}
						@Pc(941) Class64 local941 = new Class64(local765, local765.length);
						@Pc(945) int local945 = local37 | 0x4000;
						local636 = arg2.method8770(local941, local945, Static420.anInt7709, 64, 850);
						for (local834 = 0; local834 < 5; local834++) {
							for (local836 = 0; local836 < Static47.aShortArrayArrayArray1.length; local836++) {
								if (this.anIntArray7[local834] < Static47.aShortArrayArrayArray1[local836][local834].length) {
									local636.ia(Static472.aShortArrayArray18[local836][local834], Static47.aShortArrayArrayArray1[local836][local834][this.anIntArray7[local834]]);
								}
							}
						}
						local636.s(local37);
						@Pc(1013) Class166 local1013 = Static3.aClass166_1;
						synchronized (Static3.aClass166_1) {
							Static3.aClass166_1.method4803(local636, local40);
						}
						this.aLong13 = local40;
					}
					break;
				}
				local683 = local43[local677];
				if ((local683 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local683) != 0 && !arg3.method1514(local683 & 0x3FFFFFFF).method7448()) {
						local675 = true;
					}
				} else if (!arg12.method3730(local683 & 0x3FFFFFFF).method8237(this.aBoolean7)) {
					local675 = true;
				}
				local677++;
			}
		}
		@Pc(1035) Class24 local1035 = local636.method6850((byte) 4, local37, true);
		local675 = false;
		if (arg14 != null) {
			for (local677 = 0; local677 < 12; local677++) {
				if (arg14[local677] != -1) {
					local675 = true;
				}
			}
		}
		if (!local152 && !local675) {
			return local1035;
		}
		@Pc(1065) Class154[] local1065 = null;
		if (local644 != null) {
			local1065 = local644.method5481(arg2);
		}
		if (local675 && local1065 != null) {
			for (local683 = 0; local683 < 12; local683++) {
				if (local1065[local683] != null) {
					local1035.method6848(local1065[local683], 0x1 << local683, true);
				}
			}
		}
		local683 = 0;
		local767 = 1;
		while (local683 < local159) {
			if (Static618.aClass6_Sub2_Sub1Array8[local683] != null) {
				local1035.method6852(Static259.anIntArray299[local683], Static185.anIntArray227[local683], false, Static618.aClass6_Sub2_Sub1Array8[local683], (int[]) null, Static31.anIntArray37[local683], Static646.anIntArray427[local683] - 1, local767, Static578.aClass6_Sub2_Sub1Array7[local683]);
			}
			local767 <<= 0x1;
			local683++;
		}
		if (local675) {
			for (local773 = 0; local773 < 12; local773++) {
				if (arg14[local773] != -1) {
					local834 = arg14[local773] - arg11;
					local834 &= 0x3FFF;
					@Pc(1173) Class154 local1173 = arg2.method8838();
					local1173.method6571(local834);
					local1035.method6848(local1173, 0x1 << local773, false);
				}
			}
		}
		if (local675 && local1065 != null) {
			for (local773 = 0; local773 < 12; local773++) {
				if (local1065[local773] != null) {
					local1035.method6848(local1065[local773], 0x1 << local773, false);
				}
			}
		}
		if (local374 != null && local384 != null) {
			local1035.method6869(arg7 - 1, arg9 + -1, false, local382, local198, local386, local359, local378, local376, local384, arg13.aBooleanArray4, local374, local193, local380);
		} else if (local374 != null) {
			local1035.method6857(local193, local376, local359, local198, local374, false, arg7 - 1, 0);
		} else if (local384 != null) {
			local1035.method6857(local380, local386, local378, local382, local384, false, arg9 - 1, 0);
		}
		for (local773 = 0; local773 < local159; local773++) {
			Static618.aClass6_Sub2_Sub1Array8[local773] = null;
			Static578.aClass6_Sub2_Sub1Array7[local773] = null;
			Static270.aClass21Array1[local773] = null;
		}
		return local1035;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
	public void method274(@OriginalArg(0) boolean arg0) {
		this.aBoolean7 = arg0;
		this.method283();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)V")
	public void method275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray7[arg1] = arg0;
		this.method283();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI[IZ[I)V")
	public void method276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		this.aBoolean7 = arg3;
		this.anIntArray8 = arg2;
		this.anInt259 = arg1;
		this.anIntArray7 = arg4;
		if (arg0 != this.anInt260) {
			this.anInt260 = arg0;
		}
		this.method283();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!daa;Lclient!ao;IILclient!ha;ILclient!wg;II)Lclient!ka;")
	public Class24 method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) Class21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class100 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class373 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg3 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg3.anIntArray15[arg4];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class6_Sub2_Sub1 local47 = arg8.method8741(local38);
			if (local47 != null) {
				local13 = local47.method192(local42) | false;
				local11 = local47.method190(local42) | false;
				local17 = local47.method191(local42) | false;
				local15 = arg3.aBoolean12 | false;
			}
			if ((arg3.aBoolean13 || Static43.aBoolean46) && arg0 != -1 && arg0 < arg3.anIntArray15.length) {
				local97 = arg3.anIntArray15[arg0];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class6_Sub2_Sub1 local115;
				if (local38 == local101) {
					local115 = local47;
				} else {
					local115 = arg8.method8741(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method192(local105);
					local11 |= local115.method190(local105);
					local17 |= local115.method191(local105);
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
		@Pc(178) long local178 = (long) (arg7 << 16) | (long) arg1 << 32 | (long) arg9;
		@Pc(180) Class166 local180 = Static553.aClass166_54;
		@Pc(188) Class24 local188;
		synchronized (Static553.aClass166_54) {
			local188 = (Class24) Static553.aClass166_54.method4805(local178);
		}
		if (local188 == null || arg6.method8821(local188.ua(), local7) != 0) {
			if (local188 != null) {
				local7 = arg6.method8820(local7, local188.ua());
			}
			@Pc(215) Class64[] local215 = new Class64[3];
			local97 = 0;
			if (!arg2.method1514(arg9).method7440() || !arg2.method1514(arg7).method7440() || !arg2.method1514(arg1).method7440()) {
				return null;
			}
			@Pc(247) Class64 local247 = arg2.method1514(arg9).method7446();
			if (local247 != null) {
				local97++;
				local215[0] = local247;
			}
			local247 = arg2.method1514(arg7).method7446();
			if (local247 != null) {
				local215[local97++] = local247;
			}
			local247 = arg2.method1514(arg1).method7446();
			if (local247 != null) {
				local215[local97++] = local247;
			}
			@Pc(288) int local288 = local7 | 0x4000;
			local247 = new Class64(local215, local97);
			local188 = arg6.method8770(local247, local288, Static420.anInt7709, 64, 768);
			for (@Pc(304) int local304 = 0; local304 < 5; local304++) {
				for (local38 = 0; local38 < Static47.aShortArrayArrayArray1.length; local38++) {
					if (Static47.aShortArrayArrayArray1[local38][local304].length > this.anIntArray7[local304]) {
						local188.ia(Static472.aShortArrayArray18[local38][local304], Static47.aShortArrayArrayArray1[local38][local304][this.anIntArray7[local304]]);
					}
				}
			}
			local188.s(local7);
			@Pc(362) Class166 local362 = Static553.aClass166_54;
			synchronized (Static553.aClass166_54) {
				Static553.aClass166_54.method4803(local188, local178);
			}
		}
		if (arg3 == null) {
			return local188;
		} else {
			local188 = local188.method6850((byte) 4, local7, true);
			return arg3.method349(local188, arg5, arg0, 2048, arg4);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!daa;I)V")
	public void method279(@OriginalArg(0) int arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static199.anIntArray239[arg2];
		if (arg1.method1514(arg0) != null) {
			this.anIntArray8[local7] = Integer.MIN_VALUE | arg0;
			this.method283();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!ao;ILclient!ul;Lclient!ha;Lclient!hp;Lclient!daa;Lclient!vi;Lclient!wg;I)Lclient!ka;")
	public Class24 method282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class346 arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) Class138 arg6, @OriginalArg(8) Class58 arg7, @OriginalArg(9) Interface25 arg8, @OriginalArg(10) Class373 arg9) {
		if (this.anInt259 != -1) {
			return arg4.method8199(this.anInt259).method6605((Class30) null, arg0, arg1, arg3, arg5, arg9, arg8, arg2);
		}
		@Pc(29) int local29 = 2048;
		@Pc(42) boolean local42;
		@Pc(57) int local57;
		@Pc(121) int local121;
		@Pc(65) int local65;
		@Pc(125) int local125;
		if (arg2 != null) {
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			local42 = false;
			@Pc(44) boolean local44 = false;
			local57 = arg2.anIntArray15[arg1];
			local29 = 2080;
			local65 = local57 >>> 16;
			@Pc(69) int local69 = local57 & 0xFFFF;
			@Pc(74) Class6_Sub2_Sub1 local74 = arg9.method8741(local65);
			if (local74 != null) {
				local40 = local74.method192(local69) | false;
				local38 = local74.method190(local69) | false;
				local44 = local74.method191(local69) | false;
				local42 = arg2.aBoolean12 | false;
			}
			if ((arg2.aBoolean13 || Static43.aBoolean46) && arg3 != -1 && arg2.anIntArray15.length > arg3) {
				local121 = arg2.anIntArray15[arg3];
				local125 = local121 >>> 16;
				@Pc(129) int local129 = local121 & 0xFFFF;
				@Pc(139) Class6_Sub2_Sub1 local139 = local65 == local125 ? local74 : arg9.method8741(local125);
				if (local139 != null) {
					local40 |= local139.method192(local129);
					local38 |= local139.method190(local129);
					local44 |= local139.method191(local129);
				}
			}
			if (local40) {
				local29 = 2208;
			}
			if (local38) {
				local29 |= 0x100;
			}
			if (local42) {
				local29 |= 0x200;
			}
			if (local44) {
				local29 |= 0x400;
			}
		}
		@Pc(188) Class166 local188 = Static553.aClass166_54;
		@Pc(197) Class24 local197;
		synchronized (Static553.aClass166_54) {
			local197 = (Class24) Static553.aClass166_54.method4805(this.aLong14);
		}
		if (local197 == null || arg5.method8821(local197.ua(), local29) != 0) {
			if (local197 != null) {
				local29 = arg5.method8820(local29, local197.ua());
			}
			local42 = false;
			for (@Pc(225) int local225 = 0; local225 < 12; local225++) {
				local57 = this.anIntArray8[local225];
				if ((local57 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local57) != 0 && !arg7.method1514(local57 & 0x3FFFFFFF).method7440()) {
						local42 = true;
					}
				} else if (!arg6.method3730(local57 & 0x3FFFFFFF).method8247(this.aBoolean7)) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(285) Class64[] local285 = new Class64[12];
			local121 = 0;
			for (@Pc(289) int local289 = 0; local289 < 12; local289++) {
				@Pc(296) int local296 = this.anIntArray8[local289];
				@Pc(311) Class64 local311;
				if ((local296 & 0x40000000) != 0) {
					local311 = arg6.method3730(local296 & 0x3FFFFFFF).method8242(this.aBoolean7);
					if (local311 != null) {
						local285[local121++] = local311;
					}
				} else if ((Integer.MIN_VALUE & local296) != 0) {
					local311 = arg7.method1514(local296 & 0x3FFFFFFF).method7446();
					if (local311 != null) {
						local285[local121++] = local311;
					}
				}
			}
			@Pc(350) int local350 = local29 | 0x4000;
			@Pc(356) Class64 local356 = new Class64(local285, local121);
			local197 = arg5.method8770(local356, local350, Static420.anInt7709, 64, 768);
			for (local65 = 0; local65 < 5; local65++) {
				for (local125 = 0; local125 < Static47.aShortArrayArrayArray1.length; local125++) {
					if (this.anIntArray7[local65] < Static47.aShortArrayArrayArray1[local125][local65].length) {
						local197.ia(Static472.aShortArrayArray18[local125][local65], Static47.aShortArrayArrayArray1[local125][local65][this.anIntArray7[local65]]);
					}
				}
			}
			local197.s(local29);
			@Pc(416) Class166 local416 = Static553.aClass166_54;
			synchronized (Static553.aClass166_54) {
				Static553.aClass166_54.method4803(local197, this.aLong14);
			}
		}
		if (arg2 == null) {
			return local197;
		} else {
			local197.method6850((byte) 4, local29, true);
			return arg2.method349(local197, arg0, arg3, 2048, arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	private void method283() {
		@Pc(7) long[] local7 = Class337.aLongArray15;
		this.aLong14 = -1L;
		this.aLong14 = local7[(int) (((long) (this.anInt260 >> 8) ^ this.aLong14) & 0xFFL)] ^ this.aLong14 >>> 8;
		this.aLong14 = local7[(int) ((this.aLong14 ^ (long) this.anInt260) & 0xFFL)] ^ this.aLong14 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong14 = this.aLong14 >>> 8 ^ local7[(int) ((this.aLong14 ^ (long) (this.anIntArray8[local50] >> 24)) & 0xFFL)];
			this.aLong14 = this.aLong14 >>> 8 ^ local7[(int) (((long) (this.anIntArray8[local50] >> 16) ^ this.aLong14) & 0xFFL)];
			this.aLong14 = local7[(int) ((this.aLong14 ^ (long) (this.anIntArray8[local50] >> 8)) & 0xFFL)] ^ this.aLong14 >>> 8;
			this.aLong14 = local7[(int) ((this.aLong14 ^ (long) this.anIntArray8[local50]) & 0xFFL)] ^ this.aLong14 >>> 8;
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong14 = local7[(int) (((long) this.anIntArray7[local144] ^ this.aLong14) & 0xFFL)] ^ this.aLong14 >>> 8;
		}
		this.aLong14 = local7[(int) (((long) (this.aBoolean7 ? 1 : 0) ^ this.aLong14) & 0xFFL)] ^ this.aLong14 >>> 8;
	}
}
