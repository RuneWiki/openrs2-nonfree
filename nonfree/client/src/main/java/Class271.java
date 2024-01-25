import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class271 {

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
	private int anInt7489;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "[Lclient!sd;")
	private Class317[] aClass317Array1;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!pfa", name = "p", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
	public int anInt7496 = -1;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIILclient!oia;Lclient!gf;Lclient!gf;Z[Lclient!nw;Lclient!pd;Lclient!gia;ILclient!ha;Lclient!kd;ILclient!vfa;ILclient!fg;[III)Lclient!ka;")
	public Class184 method6479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface19 arg3, @OriginalArg(5) Class119 arg4, @OriginalArg(6) Class119 arg5, @OriginalArg(8) Class245[] arg6, @OriginalArg(9) Class268 arg7, @OriginalArg(10) Class121 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class132 arg10, @OriginalArg(13) Class188 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class368 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class107 arg15, @OriginalArg(18) int[] arg16, @OriginalArg(19) int arg17, @OriginalArg(20) int arg18) {
		if (this.anInt7496 != -1) {
			return arg11.method4262(this.anInt7496).method2040(arg17, (Class236) null, arg5, arg14, arg10, arg18, arg7, arg3, arg4, arg1, arg12, arg6, arg2, arg0, arg13, arg9, arg16);
		}
		@Pc(37) int local37 = arg0;
		@Pc(40) long local40 = this.aLong221;
		@Pc(43) int[] local43 = this.anIntArray502;
		@Pc(45) boolean local45 = false;
		@Pc(47) boolean local47 = false;
		if (arg4 != null && (arg4.anInt3000 >= 0 || arg4.anInt3002 >= 0)) {
			local43 = new int[this.anIntArray502.length];
			for (@Pc(68) int local68 = 0; local68 < local43.length; local68++) {
				local43[local68] = this.anIntArray502[local68];
			}
			if (arg4.anInt3000 >= 0) {
				if (arg4.anInt3000 == 65535) {
					local43[5] = 0;
					local45 = true;
					local40 ^= 0xFFFFFFFF00000000L;
				} else {
					local43[5] = arg4.anInt3000 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg4.anInt3002 >= 0) {
				if (arg4.anInt3002 == 65535) {
					local40 ^= 0xFFFFFFFFL;
					local43[3] = 0;
				} else {
					local43[3] = arg4.anInt3002 | 0x40000000;
					local40 ^= (long) local43[3];
				}
				local47 = true;
			}
		}
		@Pc(162) boolean local162 = false;
		@Pc(164) boolean local164 = false;
		@Pc(166) boolean local166 = false;
		@Pc(174) boolean local174 = arg4 != null || arg5 != null;
		@Pc(181) int local181 = arg6 == null ? 0 : arg6.length;
		@Pc(215) int local215;
		@Pc(220) int local220;
		for (@Pc(183) int local183 = 0; local183 < local181; local183++) {
			Static477.aClass6_Sub4_Sub4Array6[local183] = null;
			if (arg6[local183] != null) {
				@Pc(201) Class119 local201 = arg7.method6469(arg6[local183].anInt6821);
				if (local201.anIntArray167 != null) {
					local174 = true;
					Static617.aClass119Array2[local183] = local201;
					local215 = arg6[local183].anInt6818;
					local220 = arg6[local183].anInt6824;
					@Pc(225) int local225 = local201.anIntArray167[local215];
					Static477.aClass6_Sub4_Sub4Array6[local183] = arg7.method6468(local225 >>> 16);
					@Pc(238) int local238 = local225 & 0xFFFF;
					Static210.anIntArray205[local183] = local238;
					if (Static477.aClass6_Sub4_Sub4Array6[local183] != null) {
						local164 |= Static477.aClass6_Sub4_Sub4Array6[local183].method2427(local238);
						local162 |= Static477.aClass6_Sub4_Sub4Array6[local183].method2430(local238);
						local166 |= Static477.aClass6_Sub4_Sub4Array6[local183].method2428(local238);
					}
					if ((local201.aBoolean187 || Static386.aBoolean433) && local220 != -1 && local220 < local201.anIntArray167.length) {
						Static674.anIntArray653[local183] = local201.anIntArray168[local215];
						Static34.anIntArray50[local183] = arg6[local183].anInt6819;
						@Pc(311) int local311 = local201.anIntArray167[local220];
						Static17.aClass6_Sub4_Sub4Array1[local183] = arg7.method6468(local311 >>> 16);
						@Pc(324) int local324 = local311 & 0xFFFF;
						Static117.anIntArray127[local183] = local324;
						if (Static17.aClass6_Sub4_Sub4Array1[local183] != null) {
							local164 |= Static17.aClass6_Sub4_Sub4Array1[local183].method2427(local324);
							local162 |= Static17.aClass6_Sub4_Sub4Array1[local183].method2430(local324);
							local166 |= Static17.aClass6_Sub4_Sub4Array1[local183].method2428(local324);
						}
					} else {
						Static674.anIntArray653[local183] = 0;
						Static34.anIntArray50[local183] = 0;
						Static17.aClass6_Sub4_Sub4Array1[local183] = null;
						Static117.anIntArray127[local183] = -1;
					}
				}
			}
		}
		@Pc(383) int local383 = -1;
		local215 = -1;
		local220 = 0;
		@Pc(389) Class6_Sub4_Sub4 local389 = null;
		@Pc(391) Class6_Sub4_Sub4 local391 = null;
		@Pc(393) int local393 = -1;
		@Pc(395) int local395 = -1;
		@Pc(397) int local397 = 0;
		@Pc(399) Class6_Sub4_Sub4 local399 = null;
		@Pc(401) Class6_Sub4_Sub4 local401 = null;
		if (local174) {
			@Pc(414) int local414;
			@Pc(476) int local476;
			if (arg4 != null) {
				local383 = arg4.anIntArray167[arg2];
				local414 = local383 >>> 16;
				local389 = arg7.method6468(local414);
				local383 &= 0xFFFF;
				if (local389 != null) {
					local164 |= local389.method2427(local383);
					local162 |= local389.method2430(local383);
					local166 |= local389.method2428(local383);
				}
				if ((arg4.aBoolean187 || Static386.aBoolean433) && arg12 != -1 && arg12 < arg4.anIntArray167.length) {
					local215 = arg4.anIntArray167[arg12];
					local220 = arg4.anIntArray168[arg2];
					local476 = local215 >>> 16;
					local391 = local414 == local476 ? local389 : arg7.method6468(local476);
					local215 &= 0xFFFF;
					if (local391 != null) {
						local164 |= local391.method2427(local215);
						local162 |= local391.method2430(local215);
						local166 |= local391.method2428(local215);
					}
				}
			}
			local37 = arg0 | 0x20;
			if (arg5 != null) {
				local393 = arg5.anIntArray167[arg17];
				local414 = local393 >>> 16;
				local399 = arg7.method6468(local414);
				local393 &= 0xFFFF;
				if (local399 != null) {
					local164 |= local399.method2427(local393);
					local162 |= local399.method2430(local393);
					local166 |= local399.method2428(local393);
				}
				if ((arg5.aBoolean187 || Static386.aBoolean433) && arg9 != -1 && arg9 < arg5.anIntArray167.length) {
					local397 = arg5.anIntArray168[arg17];
					local395 = arg5.anIntArray167[arg9];
					local476 = local395 >>> 16;
					local395 &= 0xFFFF;
					local401 = local414 == local476 ? local399 : arg7.method6468(local476);
					if (local401 != null) {
						local164 |= local401.method2427(local395);
						local162 |= local401.method2430(local395);
						local166 |= local401.method2428(local395);
					}
				}
			}
			if (local164) {
				local37 |= 0x80;
			}
			if (local162) {
				local37 |= 0x100;
			}
			if (local166) {
				local37 |= 0x400;
			}
		}
		@Pc(664) Class10 local664 = Static569.aClass10_54;
		@Pc(672) Class184 local672;
		synchronized (Static569.aClass10_54) {
			local672 = (Class184) Static569.aClass10_54.method373(local40);
		}
		@Pc(680) Class389 local680 = null;
		if (this.anInt7489 != -1) {
			local680 = arg13.method8689(this.anInt7489);
		}
		@Pc(732) boolean local732;
		@Pc(734) int local734;
		@Pc(740) int local740;
		@Pc(827) int local827;
		@Pc(833) int local833;
		@Pc(937) int local937;
		if (local672 == null || arg10.method7509(local672.ua(), local37) != 0) {
			if (local672 != null) {
				local37 = arg10.method7448(local37, local672.ua());
			}
			local732 = false;
			local734 = 0;
			while (true) {
				if (local734 >= local43.length) {
					if (local732) {
						if (this.aLong220 != -1L) {
							@Pc(1146) Class10 local1146 = Static569.aClass10_54;
							synchronized (Static569.aClass10_54) {
								local672 = (Class184) Static569.aClass10_54.method373(this.aLong220);
							}
						}
						if (local672 == null || arg10.method7509(local672.ua(), local37) != 0) {
							return null;
						}
					} else {
						@Pc(825) Class22[] local825 = new Class22[local43.length];
						for (local827 = 0; local827 < local43.length; local827++) {
							local833 = local43[local827];
							@Pc(835) Class317 local835 = null;
							@Pc(853) boolean local853 = local827 == 5 && local45 || local827 == 3 && local47;
							@Pc(872) Class22 local872;
							if ((local833 & 0x40000000) != 0) {
								if (!local853 && this.aClass317Array1 != null && this.aClass317Array1[local827] != null) {
									local835 = this.aClass317Array1[local827];
								}
								local872 = arg8.method2647(local833 & 0x3FFFFFFF).method5140(local835, this.aBoolean501);
								if (local872 != null) {
									local825[local827] = local872;
								}
							} else if ((local833 & Integer.MIN_VALUE) != 0) {
								local872 = arg15.method2175(local833 & 0x3FFFFFFF).method8488();
								if (local872 != null) {
									local825[local827] = local872;
								}
							}
						}
						@Pc(939) int local939;
						if (local680 != null && local680.anIntArrayArray60 != null) {
							for (local833 = 0; local833 < local680.anIntArrayArray60.length; local833++) {
								if (local825[local833] != null) {
									local937 = 0;
									local939 = 0;
									@Pc(941) int local941 = 0;
									@Pc(943) int local943 = 0;
									@Pc(945) int local945 = 0;
									@Pc(947) int local947 = 0;
									if (local680.anIntArrayArray60[local833] != null) {
										local945 = local680.anIntArrayArray60[local833][4] << 3;
										local937 = local680.anIntArrayArray60[local833][0];
										local941 = local680.anIntArrayArray60[local833][2];
										local943 = local680.anIntArrayArray60[local833][3] << 3;
										local939 = local680.anIntArrayArray60[local833][1];
										local947 = local680.anIntArrayArray60[local833][5] << 3;
									}
									if (local943 != 0 || local945 != 0 || local947 != 0) {
										local825[local833].method533(local947, local943, local945);
									}
									if (local937 != 0 || local939 != 0 || local941 != 0) {
										local825[local833].method539(local941, local939, local937);
									}
								}
							}
						}
						@Pc(1051) Class22 local1051 = new Class22(local825, local825.length);
						@Pc(1055) int local1055 = local37 | 0x4000;
						local672 = arg10.method7475(local1051, local1055, Class6_Sub22.lb, 64, 850);
						for (local937 = 0; local937 < 5; local937++) {
							for (local939 = 0; local939 < Static3.aShortArrayArrayArray2.length; local939++) {
								if (Static3.aShortArrayArrayArray2[local939][local937].length > this.anIntArray501[local937]) {
									local672.ia(Static598.aShortArrayArray18[local939][local937], Static3.aShortArrayArrayArray2[local939][local937][this.anIntArray501[local937]]);
								}
							}
						}
						local672.s(local37);
						@Pc(1121) Class10 local1121 = Static569.aClass10_54;
						synchronized (Static569.aClass10_54) {
							Static569.aClass10_54.method366(local672, local40);
						}
						this.aLong220 = local40;
					}
					break;
				}
				local740 = local43[local734];
				@Pc(742) Class317 local742 = null;
				@Pc(760) boolean local760 = local734 == 5 && local45 || local734 == 3 && local47;
				if ((local740 & 0x40000000) != 0) {
					if (!local760 && this.aClass317Array1 != null && this.aClass317Array1[local734] != null) {
						local742 = this.aClass317Array1[local734];
					}
					if (!arg8.method2647(local740 & 0x3FFFFFFF).method5142(local742, this.aBoolean501)) {
						local732 = true;
					}
				} else if ((local740 & Integer.MIN_VALUE) != 0 && !arg15.method2175(local740 & 0x3FFFFFFF).method8486()) {
					local732 = true;
				}
				local734++;
			}
		}
		@Pc(1180) Class184 local1180 = local672.method8660((byte) 4, local37, true);
		local732 = false;
		if (arg16 != null) {
			for (local734 = 0; local734 < arg16.length; local734++) {
				if (arg16[local734] != -1) {
					local732 = true;
				}
			}
		}
		if (!local174 && !local732) {
			return local1180;
		}
		@Pc(1213) Class207[] local1213 = null;
		if (local680 != null) {
			local1213 = local680.method9075(arg10);
		}
		if (local732 && local1213 != null) {
			for (local740 = 0; local740 < arg16.length; local740++) {
				if (local1213[local740] != null) {
					local1180.method8642(local1213[local740], 0x1 << local740, true);
				}
			}
		}
		local740 = 0;
		local827 = 1;
		while (local181 > local740) {
			if (Static477.aClass6_Sub4_Sub4Array6[local740] != null) {
				local1180.method8644(Static210.anIntArray205[local740], (int[]) null, false, Static117.anIntArray127[local740], Static17.aClass6_Sub4_Sub4Array1[local740], local827, Static34.anIntArray50[local740] - 1, Static674.anIntArray653[local740], Static477.aClass6_Sub4_Sub4Array6[local740]);
			}
			local740++;
			local827 <<= 0x1;
		}
		if (local732) {
			for (local833 = 0; local833 < arg16.length; local833++) {
				if (arg16[local833] != -1) {
					local937 = arg16[local833] - arg1;
					local937 &= 0x3FFF;
					@Pc(1320) Class207 local1320 = arg10.method7467();
					local1320.method8200(local937);
					local1180.method8642(local1320, 0x1 << local833, false);
				}
			}
		}
		if (local732 && local1213 != null) {
			for (local833 = 0; local833 < arg16.length; local833++) {
				if (local1213[local833] != null) {
					local1180.method8642(local1213[local833], 0x1 << local833, false);
				}
			}
		}
		if (local389 != null && local399 != null) {
			local1180.method8649(local391, local393, local383, false, arg18 - 1, local401, local399, local220, arg4.aBooleanArray7, local215, local397, arg14 - 1, local389, local395);
		} else if (local389 != null) {
			local1180.method8641(0, local383, local220, local215, local389, arg18 - 1, local391, false);
		} else if (local399 != null) {
			local1180.method8641(0, local393, local397, local395, local399, arg14 - 1, local401, false);
		}
		for (local833 = 0; local833 < local181; local833++) {
			Static477.aClass6_Sub4_Sub4Array6[local833] = null;
			Static17.aClass6_Sub4_Sub4Array1[local833] = null;
			Static617.aClass119Array2[local833] = null;
		}
		return local1180;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
	private void method6480() {
		@Pc(7) long[] local7 = Class29_Sub8.aLongArray5;
		this.aLong221 = -1L;
		this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) (this.anInt7489 >> 8)) & 0xFFL)];
		this.aLong221 = local7[(int) ((this.aLong221 ^ (long) this.anInt7489) & 0xFFL)] ^ this.aLong221 >>> 8;
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray502.length; local56++) {
			this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) (this.anIntArray502[local56] >> 24)) & 0xFFL)];
			this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) (this.anIntArray502[local56] >> 16)) & 0xFFL)];
			this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) (this.anIntArray502[local56] >> 8)) & 0xFFL)];
			this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) this.anIntArray502[local56]) & 0xFFL)];
		}
		@Pc(159) int local159;
		if (this.aClass317Array1 != null) {
			for (local159 = 0; local159 < this.aClass317Array1.length; local159++) {
				if (this.aClass317Array1[local159] != null) {
					@Pc(181) int[] local181;
					@Pc(175) int[] local175;
					if (this.aBoolean501) {
						local175 = this.aClass317Array1[local159].anIntArray584;
						local181 = this.aClass317Array1[local159].anIntArray583;
					} else {
						local175 = this.aClass317Array1[local159].anIntArray585;
						local181 = this.aClass317Array1[local159].anIntArray582;
					}
					@Pc(199) int local199;
					if (local181 != null) {
						for (local199 = 0; local199 < local181.length; local199++) {
							this.aLong221 = local7[(int) ((this.aLong221 ^ (long) (local181[local199] >> 8)) & 0xFFL)] ^ this.aLong221 >>> 8;
							this.aLong221 = local7[(int) (((long) local181[local199] ^ this.aLong221) & 0xFFL)] ^ this.aLong221 >>> 8;
						}
					}
					if (local175 != null) {
						for (local199 = 0; local199 < local175.length; local199++) {
							this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) (((long) (local175[local199] >> 8) ^ this.aLong221) & 0xFFL)];
							this.aLong221 = local7[(int) (((long) local175[local199] ^ this.aLong221) & 0xFFL)] ^ this.aLong221 >>> 8;
						}
					}
					if (this.aClass317Array1[local159].aShortArray129 != null) {
						for (local199 = 0; local199 < this.aClass317Array1[local159].aShortArray129.length; local199++) {
							this.aLong221 = local7[(int) (((long) (this.aClass317Array1[local159].aShortArray129[local199] >> 8) ^ this.aLong221) & 0xFFL)] ^ this.aLong221 >>> 8;
							this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) (((long) this.aClass317Array1[local159].aShortArray129[local199] ^ this.aLong221) & 0xFFL)];
						}
					}
					if (this.aClass317Array1[local159].aShortArray130 != null) {
						for (local199 = 0; local199 < this.aClass317Array1[local159].aShortArray130.length; local199++) {
							this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) (this.aClass317Array1[local159].aShortArray130[local199] >> 8)) & 0xFFL)];
							this.aLong221 = local7[(int) (((long) this.aClass317Array1[local159].aShortArray130[local199] ^ this.aLong221) & 0xFFL)] ^ this.aLong221 >>> 8;
						}
					}
				}
			}
		}
		for (local159 = 0; local159 < 5; local159++) {
			this.aLong221 = this.aLong221 >>> 8 ^ local7[(int) ((this.aLong221 ^ (long) this.anIntArray501[local159]) & 0xFFL)];
		}
		this.aLong221 = local7[(int) ((this.aLong221 ^ (long) (this.aBoolean501 ? 1 : 0)) & 0xFFL)] ^ this.aLong221 >>> 8;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BILclient!gia;I)V")
	public void method6481(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == -1) {
			this.anIntArray502[arg2] = 0;
		} else if (arg1.method2647(arg0) != null) {
			this.anIntArray502[arg2] = arg0 | 0x40000000;
			this.method6480();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!gia;Lclient!gf;Lclient!kd;ILclient!oia;ILclient!fg;Lclient!pd;IIILclient!ha;)Lclient!ka;")
	public Class184 method6482(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface19 arg4, @OriginalArg(6) Class107 arg5, @OriginalArg(7) Class268 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class132 arg9) {
		if (this.anInt7496 != -1) {
			return arg2.method4262(this.anInt7496).method2044(arg7, arg8, arg9, arg3, (Class236) null, arg6, arg1, arg4);
		}
		@Pc(34) int local34 = 2048;
		@Pc(42) boolean local42;
		@Pc(61) int local61;
		@Pc(120) int local120;
		@Pc(65) int local65;
		@Pc(124) int local124;
		if (arg1 != null) {
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			local42 = false;
			@Pc(44) boolean local44 = false;
			local34 = 2080;
			local61 = arg1.anIntArray167[arg3];
			local65 = local61 >>> 16;
			@Pc(69) int local69 = local61 & 0xFFFF;
			@Pc(74) Class6_Sub4_Sub4 local74 = arg6.method6468(local65);
			if (local74 != null) {
				local40 = local74.method2427(local69) | false;
				local38 = local74.method2430(local69) | false;
				local44 = local74.method2428(local69) | false;
				local42 = arg1.aBoolean189 | false;
			}
			if ((arg1.aBoolean187 || Static386.aBoolean433) && arg7 != -1 && arg1.anIntArray167.length > arg7) {
				local120 = arg1.anIntArray167[arg7];
				local124 = local120 >>> 16;
				@Pc(128) int local128 = local120 & 0xFFFF;
				@Pc(142) Class6_Sub4_Sub4 local142 = local65 == local124 ? local74 : arg6.method6468(local124);
				if (local142 != null) {
					local40 |= local142.method2427(local128);
					local38 |= local142.method2430(local128);
					local44 |= local142.method2428(local128);
				}
			}
			if (local40) {
				local34 = 2208;
			}
			if (local38) {
				local34 |= 0x100;
			}
			if (local42) {
				local34 |= 0x200;
			}
			if (local44) {
				local34 |= 0x400;
			}
		}
		@Pc(193) Class10 local193 = Static121.aClass10_7;
		@Pc(204) Class184 local204;
		synchronized (Static121.aClass10_7) {
			local204 = (Class184) Static121.aClass10_7.method373(this.aLong221);
		}
		if (local204 == null || arg9.method7509(local204.ua(), local34) != 0) {
			if (local204 != null) {
				local34 = arg9.method7448(local34, local204.ua());
			}
			local42 = false;
			for (@Pc(232) int local232 = 0; local232 < this.anIntArray502.length; local232++) {
				local61 = this.anIntArray502[local232];
				@Pc(241) Class317 local241 = null;
				if ((local61 & 0x40000000) != 0) {
					if (this.aClass317Array1 != null && this.aClass317Array1[local232] != null) {
						local241 = this.aClass317Array1[local232];
					}
					if (!arg0.method2647(local61 & 0x3FFFFFFF).method5153(local241, this.aBoolean501)) {
						local42 = true;
					}
				} else if ((local61 & Integer.MIN_VALUE) != 0 && !arg5.method2175(local61 & 0x3FFFFFFF).method8482()) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(308) Class22[] local308 = new Class22[this.anIntArray502.length];
			local120 = 0;
			for (@Pc(312) int local312 = 0; local312 < this.anIntArray502.length; local312++) {
				@Pc(319) int local319 = this.anIntArray502[local312];
				@Pc(321) Class317 local321 = null;
				@Pc(350) Class22 local350;
				if ((local319 & 0x40000000) != 0) {
					if (this.aClass317Array1 != null && this.aClass317Array1[local312] != null) {
						local321 = this.aClass317Array1[local312];
					}
					local350 = arg0.method2647(local319 & 0x3FFFFFFF).method5154(local321, this.aBoolean501);
					if (local350 != null) {
						local308[local120++] = local350;
					}
				} else if ((local319 & Integer.MIN_VALUE) != 0) {
					local350 = arg5.method2175(local319 & 0x3FFFFFFF).method8485();
					if (local350 != null) {
						local308[local120++] = local350;
					}
				}
			}
			@Pc(395) int local395 = local34 | 0x4000;
			@Pc(401) Class22 local401 = new Class22(local308, local120);
			local204 = arg9.method7475(local401, local395, Class6_Sub22.lb, 64, 768);
			for (local65 = 0; local65 < 5; local65++) {
				for (local124 = 0; local124 < Static3.aShortArrayArrayArray2.length; local124++) {
					if (Static3.aShortArrayArrayArray2[local124][local65].length > this.anIntArray501[local65]) {
						local204.ia(Static598.aShortArrayArray18[local124][local65], Static3.aShortArrayArrayArray2[local124][local65][this.anIntArray501[local65]]);
					}
				}
			}
			local204.s(local34);
			@Pc(465) Class10 local465 = Static121.aClass10_7;
			synchronized (Static121.aClass10_7) {
				Static121.aClass10_7.method366(local204, this.aLong221);
			}
		}
		if (arg1 == null) {
			return local204;
		} else {
			local204.method8660((byte) 4, local34, true);
			return arg1.method2503(arg7, arg8, arg3, 2048, local204);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BZ)V")
	public void method6483(@OriginalArg(1) boolean arg0) {
		this.aBoolean501 = arg0;
		this.method6480();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I[IIZ[IB[Lclient!sd;)V")
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) Class317[] arg5) {
		this.aClass317Array1 = arg5;
		this.anIntArray502 = arg1;
		this.anIntArray501 = arg4;
		this.anInt7496 = arg2;
		if (arg0 != this.anInt7489) {
			this.anInt7489 = arg0;
		}
		this.aBoolean501 = arg3;
		this.method6480();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!pd;Lclient!ha;IIILclient!fg;ILclient!gf;IIB)Lclient!ka;")
	public Class184 method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class107 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class119 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(98) int local98;
		@Pc(38) int local38;
		if (arg7 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg7.anIntArray167[arg9];
			local38 = local34 >>> 16;
			@Pc(45) Class6_Sub4_Sub4 local45 = arg1.method6468(local38);
			@Pc(49) int local49 = local34 & 0xFFFF;
			if (local45 != null) {
				local13 = local45.method2427(local49) | false;
				local11 = local45.method2430(local49) | false;
				local17 = local45.method2428(local49) | false;
				local15 = arg7.aBoolean189 | false;
			}
			if ((arg7.aBoolean187 || Static386.aBoolean433) && arg3 != -1 && arg7.anIntArray167.length > arg3) {
				local98 = arg7.anIntArray167[arg3];
				@Pc(102) int local102 = local98 >>> 16;
				@Pc(106) int local106 = local98 & 0xFFFF;
				@Pc(111) Class6_Sub4_Sub4 local111;
				if (local38 == local102) {
					local111 = local45;
				} else {
					local111 = arg1.method6468(local106 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method2427(local106);
					local11 |= local111.method2430(local106);
					local17 |= local111.method2428(local106);
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
		@Pc(186) long local186 = (long) arg4 | (long) arg6 << 32 | (long) (arg8 << 16);
		@Pc(188) Class10 local188 = Static121.aClass10_7;
		@Pc(196) Class184 local196;
		synchronized (Static121.aClass10_7) {
			local196 = (Class184) Static121.aClass10_7.method373(local186);
		}
		if (local196 == null || arg2.method7509(local196.ua(), local7) != 0) {
			if (local196 != null) {
				local7 = arg2.method7448(local7, local196.ua());
			}
			@Pc(226) Class22[] local226 = new Class22[3];
			local98 = 0;
			if (!arg5.method2175(arg4).method8482() || !arg5.method2175(arg8).method8482() || !arg5.method2175(arg6).method8482()) {
				return null;
			}
			@Pc(268) Class22 local268 = arg5.method2175(arg4).method8485();
			if (local268 != null) {
				local98++;
				local226[0] = local268;
			}
			local268 = arg5.method2175(arg8).method8485();
			if (local268 != null) {
				local226[local98++] = local268;
			}
			local268 = arg5.method2175(arg6).method8485();
			if (local268 != null) {
				local226[local98++] = local268;
			}
			local268 = new Class22(local226, local98);
			@Pc(315) int local315 = local7 | 0x4000;
			local196 = arg2.method7475(local268, local315, Class6_Sub22.lb, 64, 768);
			for (@Pc(325) int local325 = 0; local325 < 5; local325++) {
				for (local38 = 0; local38 < Static3.aShortArrayArrayArray2.length; local38++) {
					if (this.anIntArray501[local325] < Static3.aShortArrayArrayArray2[local38][local325].length) {
						local196.ia(Static598.aShortArrayArray18[local38][local325], Static3.aShortArrayArrayArray2[local38][local325][this.anIntArray501[local325]]);
					}
				}
			}
			local196.s(local7);
			@Pc(373) Class10 local373 = Static121.aClass10_7;
			synchronized (Static121.aClass10_7) {
				Static121.aClass10_7.method366(local196, local186);
			}
		}
		if (arg7 == null) {
			return local196;
		} else {
			local196 = local196.method8660((byte) 4, local7, true);
			return arg7.method2503(arg3, arg0, arg9, 2048, local196);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)V")
	public void method6487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray501[arg0] = arg1;
		this.method6480();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZILclient!fg;)V")
	public void method6488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class107 arg2) {
		@Pc(7) int local7 = Static474.anIntArray458[arg1];
		if (arg2.method2175(arg0) != null) {
			this.anIntArray502[local7] = Integer.MIN_VALUE | arg0;
			this.method6480();
		}
	}
}
