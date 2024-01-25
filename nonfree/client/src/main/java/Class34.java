import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class34 {

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "Z")
	public boolean aBoolean86;

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "[Lclient!el;")
	private Class99[] aClass99Array1;

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
	private int anInt1241;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
	public int anInt1234 = -1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!eja;ILclient!ak;Lclient!hf;Lclient!cn;Lclient!rf;[ILclient!rf;Lclient!dca;[Lclient!rf;ZLclient!ha;IILclient!ft;Lclient!ll;)Lclient!ka;")
	public Class170 method1154(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) Class73 arg7, @OriginalArg(9) Class45[] arg8, @OriginalArg(11) Class22 arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class124 arg12, @OriginalArg(15) Interface12 arg13) {
		if (this.anInt1234 != -1) {
			return arg1.method619(this.anInt1234).method5036(arg13, arg5, arg9, arg4, arg10, arg11, (Class187) null, arg6, arg8, arg0);
		}
		@Pc(31) int local31 = arg11;
		@Pc(34) long local34 = this.aLong40;
		@Pc(37) int[] local37 = this.anIntArray76;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(72) int local72;
		@Pc(124) int local124;
		if (arg4 != null) {
			@Pc(47) Class149 local47 = arg4.method6579();
			if (local47 != null && (local47.anInt3735 >= 0 || local47.anInt3743 >= 0)) {
				local37 = new int[this.anIntArray76.length];
				for (local72 = 0; local72 < local37.length; local72++) {
					local37[local72] = this.anIntArray76[local72];
				}
				if (local47.anInt3735 >= 0 && arg12.anInt3242 != -1) {
					if (local47.anInt3735 == 65535) {
						local37[arg12.anInt3242] = 0;
						for (local124 = 0; local124 < arg12.anIntArray214.length; local124++) {
							local37[arg12.anIntArray214[local124]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg12.anInt3242] = local47.anInt3735 | 0x40000000;
						for (local124 = 0; local124 < arg12.anIntArray214.length; local124++) {
							local37[arg12.anIntArray214[local124]] = 0;
						}
						local34 ^= (long) local37[arg12.anInt3242] << 32;
					}
					local39 = true;
				}
				if (local47.anInt3743 >= 0 && arg12.anInt3240 != -1) {
					if (local47.anInt3743 == 65535) {
						local37[arg12.anInt3240] = 0;
						for (local124 = 0; local124 < arg12.anIntArray215.length; local124++) {
							local37[arg12.anIntArray215[local124]] = 0;
						}
						local34 ^= 0xFFFFFFFFL;
					} else {
						local37[arg12.anInt3240] = local47.anInt3743 | 0x40000000;
						for (local124 = 0; local124 < arg12.anIntArray215.length; local124++) {
							local37[arg12.anIntArray215[local124]] = 0;
						}
						local34 ^= (long) local37[arg12.anInt3240];
					}
					local41 = true;
				}
			}
		}
		@Pc(290) boolean local290 = false;
		local72 = arg8 == null ? 0 : arg8.length;
		for (local124 = 0; local124 < local72; local124++) {
			if (arg8[local124] != null) {
				local31 |= arg8[local124].method6588();
				local290 = true;
			}
		}
		if (arg4 != null) {
			local290 = true;
			local31 |= arg4.method6588();
		}
		if (arg6 != null) {
			local31 |= arg6.method6588();
			local290 = true;
		}
		@Pc(352) boolean local352 = false;
		if (arg5 != null) {
			for (@Pc(362) int local362 = 0; local362 < arg5.length; local362++) {
				if (arg5[local362] != -1) {
					local352 = true;
					local31 |= 0x20;
				}
			}
		}
		@Pc(385) Class307 local385 = Static91.aClass307_21;
		@Pc(393) Class170 local393;
		synchronized (Static91.aClass307_21) {
			local393 = (Class170) Static91.aClass307_21.method7002(local34);
		}
		@Pc(401) Class226 local401 = null;
		if (this.anInt1241 != -1) {
			local401 = arg0.method2458(this.anInt1241);
		}
		@Pc(437) int local437;
		@Pc(445) int local445;
		@Pc(659) int local659;
		@Pc(665) int local665;
		if (local393 == null || arg9.method9324(local393.ua(), local31) != 0) {
			if (local393 != null) {
				local31 = arg9.method9375(local31, local393.ua());
			}
			@Pc(435) boolean local435 = false;
			local437 = 0;
			while (true) {
				@Pc(463) int local463;
				if (local437 >= local37.length) {
					if (local435) {
						if (this.aLong41 != -1L) {
							@Pc(622) Class307 local622 = Static91.aClass307_21;
							synchronized (Static91.aClass307_21) {
								local393 = (Class170) Static91.aClass307_21.method7002(this.aLong41);
							}
						}
						if (local393 == null || arg9.method9324(local393.ua(), local31) != 0) {
							return null;
						}
					} else {
						@Pc(657) Class145[] local657 = new Class145[local37.length];
						for (local659 = 0; local659 < local37.length; local659++) {
							local665 = local37[local659];
							@Pc(667) Class99 local667 = null;
							@Pc(690) boolean local690 = local659 == 5 && local39 || local659 == 3 && local41;
							@Pc(730) Class145 local730;
							if ((local665 & 0x40000000) != 0) {
								if (!local690 && this.aClass99Array1 != null && this.aClass99Array1[local659] != null) {
									local667 = this.aClass99Array1[local659];
								}
								local730 = arg3.method1887(local665 & 0x3FFFFFFF).method6280(local667, this.aBoolean86);
								if (local730 != null) {
									local657[local659] = local730;
								}
							} else if ((Integer.MIN_VALUE & local665) != 0) {
								local730 = arg7.method1983(local665 & 0x3FFFFFFF).method9590();
								if (local730 != null) {
									local657[local659] = local730;
								}
							}
						}
						@Pc(794) int local794;
						if (local401 != null && local401.anIntArrayArray30 != null) {
							for (local665 = 0; local665 < local401.anIntArrayArray30.length; local665++) {
								if (local657[local665] != null) {
									local463 = 0;
									local794 = 0;
									@Pc(796) int local796 = 0;
									@Pc(798) int local798 = 0;
									@Pc(800) int local800 = 0;
									@Pc(802) int local802 = 0;
									if (local401.anIntArrayArray30[local665] != null) {
										local798 = local401.anIntArrayArray30[local665][3] << 3;
										local796 = local401.anIntArrayArray30[local665][2];
										local802 = local401.anIntArrayArray30[local665][5] << 3;
										local800 = local401.anIntArrayArray30[local665][4] << 3;
										local794 = local401.anIntArrayArray30[local665][1];
										local463 = local401.anIntArrayArray30[local665][0];
									}
									if (local798 != 0 || local800 != 0 || local802 != 0) {
										local657[local665].method3296(local798, local802, local800);
									}
									if (local463 != 0 || local794 != 0 || local796 != 0) {
										local657[local665].method3290(local796, local463, local794);
									}
								}
							}
						}
						@Pc(917) int local917 = local31 | 0x4000;
						@Pc(924) Class145 local924 = new Class145(local657, local657.length);
						local393 = arg9.method9382(local924, local917, Static39.anInt1222, 64, 850);
						for (local463 = 0; local463 < 10; local463++) {
							for (local794 = 0; local794 < Static304.aShortArrayArray1[local463].length; local794++) {
								if (Static596.aShortArrayArrayArray1[local463][local794].length > this.anIntArray77[local463]) {
									local393.ia(Static304.aShortArrayArray1[local463][local794], Static596.aShortArrayArrayArray1[local463][local794][this.anIntArray77[local463]]);
								}
							}
						}
						if (true) {
							local393.s(local31);
							@Pc(1000) Class307 local1000 = Static91.aClass307_21;
							synchronized (Static91.aClass307_21) {
								Static91.aClass307_21.method7000(local393, local34);
							}
							this.aLong41 = local34;
						}
					}
					break;
				}
				local445 = local37[local437];
				@Pc(447) Class99 local447 = null;
				@Pc(449) boolean local449 = false;
				if (local39) {
					if (arg12.anInt3242 == local437) {
						local449 = true;
					} else {
						for (local463 = 0; local463 < arg12.anIntArray214.length; local463++) {
							if (arg12.anIntArray214[local463] == local437) {
								local449 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (arg12.anInt3240 == local437) {
						local449 = true;
					} else {
						for (local463 = 0; local463 < arg12.anIntArray215.length; local463++) {
							if (local437 == arg12.anIntArray215[local463]) {
								local449 = true;
								break;
							}
						}
					}
				}
				if ((local445 & 0x40000000) != 0) {
					if (!local449 && this.aClass99Array1 != null && this.aClass99Array1[local437] != null) {
						local447 = this.aClass99Array1[local437];
					}
					if (!arg3.method1887(local445 & 0x3FFFFFFF).method6284(this.aBoolean86, local447)) {
						local435 = true;
					}
				} else if ((local445 & Integer.MIN_VALUE) != 0 && !arg7.method1983(local445 & 0x3FFFFFFF).method9591()) {
					local435 = true;
				}
				local437++;
			}
		}
		@Pc(1022) Class170 local1022 = local393.method8369((byte) 4, local31, true);
		if (!local290 && !local352) {
			return local1022;
		}
		@Pc(1033) Class58[] local1033 = null;
		if (local401 != null) {
			local1033 = local401.method5086(arg9);
		}
		if (local352 && local1033 != null) {
			for (local437 = 0; local437 < arg5.length; local437++) {
				if (local1033[local437] != null) {
					local1022.method8361(local1033[local437], 0x1 << local437, true);
				}
			}
		}
		local437 = 0;
		local445 = 1;
		while (local72 > local437) {
			if (arg8[local437] != null) {
				arg8[local437].method6578(local445, local1022);
			}
			local445 <<= 0x1;
			local437++;
		}
		if (local352) {
			for (local659 = 0; local659 < arg5.length; local659++) {
				if (arg5[local659] != -1) {
					local665 = arg5[local659] - arg10;
					local665 &= 0x3FFF;
					@Pc(1142) Class58 local1142 = arg9.method9376();
					local1142.method9525(local665);
					local1022.method8361(local1142, 0x1 << local659, false);
				}
			}
		}
		if (local352 && local1033 != null) {
			for (local659 = 0; local659 < arg5.length; local659++) {
				if (local1033[local659] != null) {
					local1022.method8361(local1033[local659], 0x1 << local659, false);
				}
			}
		}
		if (arg4 != null && arg6 != null) {
			Static524.method7015(arg4, local1022, arg6);
		} else if (arg4 != null) {
			arg4.method6574(0, local1022);
		} else if (arg6 != null) {
			arg6.method6574(0, local1022);
		}
		return local1022;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!cn;III)V")
	public void method1155(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == -1) {
			this.anIntArray76[arg2] = 0;
		} else if (arg0.method1887(arg1) != null) {
			this.anIntArray76[arg2] = arg1 | 0x40000000;
			this.method1157();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!rf;Lclient!hf;ILclient!dca;Lclient!ha;IIII)Lclient!ka;")
	public Class170 method1156(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(3) Class73 arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(16) int local16 = arg0 == null ? 2048 : arg0.method6588() | 0x800;
		@Pc(29) long local29 = (long) (arg4 << 16) | (long) arg6 << 32 | (long) arg5;
		@Pc(31) Class307 local31 = Static386.aClass307_61;
		@Pc(41) Class170 local41;
		synchronized (Static386.aClass307_61) {
			local41 = (Class170) Static386.aClass307_61.method7002(local29);
		}
		if (local41 == null || arg3.method9324(local41.ua(), local16) != 0) {
			if (local41 != null) {
				local16 = arg3.method9375(local16, local41.ua());
			}
			@Pc(75) Class145[] local75 = new Class145[3];
			@Pc(77) int local77 = 0;
			if (!arg2.method1983(arg5).method9594() || !arg2.method1983(arg4).method9594() || !arg2.method1983(arg6).method9594()) {
				return null;
			}
			@Pc(111) Class145 local111 = arg2.method1983(arg5).method9592();
			if (local111 != null) {
				local77++;
				local75[0] = local111;
			}
			local111 = arg2.method1983(arg4).method9592();
			if (local111 != null) {
				local75[local77++] = local111;
			}
			local111 = arg2.method1983(arg6).method9592();
			if (local111 != null) {
				local75[local77++] = local111;
			}
			@Pc(156) int local156 = local16 | 0x4000;
			local111 = new Class145(local75, local77);
			local41 = arg3.method9382(local111, local156, Static39.anInt1222, 64, 768);
			for (@Pc(172) int local172 = 0; local172 < 10; local172++) {
				for (@Pc(176) int local176 = 0; local176 < Static304.aShortArrayArray1[local172].length; local176++) {
					if (this.anIntArray77[local172] < Static596.aShortArrayArrayArray1[local172][local176].length) {
						local41.ia(Static304.aShortArrayArray1[local172][local176], Static596.aShortArrayArrayArray1[local172][local176][this.anIntArray77[local172]]);
					}
				}
			}
			local41.s(local16);
			@Pc(240) Class307 local240 = Static386.aClass307_61;
			synchronized (Static386.aClass307_61) {
				Static386.aClass307_61.method7000(local41, local29);
			}
		}
		if (arg0 == null) {
			return local41;
		} else {
			local41 = local41.method8369((byte) 4, local16, true);
			arg0.method6574(0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)V")
	private void method1157() {
		@Pc(7) long[] local7 = Class359.aLongArray24;
		this.aLong40 = -1L;
		this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.anInt1241 >> 8)) & 0xFFL)] ^ this.aLong40 >>> 8;
		this.aLong40 = local7[(int) (((long) this.anInt1241 ^ this.aLong40) & 0xFFL)] ^ this.aLong40 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray76.length; local50++) {
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.anIntArray76[local50] >> 24)) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.anIntArray76[local50] >> 16)) & 0xFFL)] ^ this.aLong40 >>> 8;
			this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) (this.anIntArray76[local50] >> 8)) & 0xFFL)];
			this.aLong40 = local7[(int) (((long) this.anIntArray76[local50] ^ this.aLong40) & 0xFFL)] ^ this.aLong40 >>> 8;
		}
		@Pc(159) int local159;
		if (this.aClass99Array1 != null) {
			for (local159 = 0; local159 < this.aClass99Array1.length; local159++) {
				if (this.aClass99Array1[local159] != null) {
					@Pc(185) int[] local185;
					@Pc(179) int[] local179;
					if (this.aBoolean86) {
						local179 = this.aClass99Array1[local159].anIntArray172;
						local185 = this.aClass99Array1[local159].anIntArray170;
					} else {
						local179 = this.aClass99Array1[local159].anIntArray171;
						local185 = this.aClass99Array1[local159].anIntArray169;
					}
					@Pc(203) int local203;
					if (local185 != null) {
						for (local203 = 0; local203 < local185.length; local203++) {
							this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) (local185[local203] >> 8)) & 0xFFL)];
							this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) local185[local203]) & 0xFFL)];
						}
					}
					if (local179 != null) {
						for (local203 = 0; local203 < local179.length; local203++) {
							this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) (local179[local203] >> 8)) & 0xFFL)];
							this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) ((this.aLong40 ^ (long) local179[local203]) & 0xFFL)];
						}
					}
					if (this.aClass99Array1[local159].aShortArray14 != null) {
						for (local203 = 0; local203 < this.aClass99Array1[local159].aShortArray14.length; local203++) {
							this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.aClass99Array1[local159].aShortArray14[local203] >> 8)) & 0xFFL)] ^ this.aLong40 >>> 8;
							this.aLong40 = local7[(int) ((this.aLong40 ^ (long) this.aClass99Array1[local159].aShortArray14[local203]) & 0xFFL)] ^ this.aLong40 >>> 8;
						}
					}
					if (this.aClass99Array1[local159].aShortArray15 != null) {
						for (local203 = 0; local203 < this.aClass99Array1[local159].aShortArray15.length; local203++) {
							this.aLong40 = local7[(int) ((this.aLong40 ^ (long) (this.aClass99Array1[local159].aShortArray15[local203] >> 8)) & 0xFFL)] ^ this.aLong40 >>> 8;
							this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) (((long) this.aClass99Array1[local159].aShortArray15[local203] ^ this.aLong40) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local159 = 0; local159 < 10; local159++) {
			this.aLong40 = local7[(int) ((this.aLong40 ^ (long) this.anIntArray77[local159]) & 0xFFL)] ^ this.aLong40 >>> 8;
		}
		this.aLong40 = this.aLong40 >>> 8 ^ local7[(int) (((long) (this.aBoolean86 ? 1 : 0) ^ this.aLong40) & 0xFFL)];
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
	public void method1158(@OriginalArg(1) boolean arg0) {
		this.aBoolean86 = arg0;
		this.method1157();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Lclient!el;[IIIZ[II)V")
	public void method1160(@OriginalArg(0) Class99[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass99Array1 = arg0;
		this.anIntArray77 = arg1;
		this.anIntArray76 = arg4;
		if (this.anInt1241 != arg5) {
			this.anInt1241 = arg5;
		}
		this.aBoolean86 = arg3;
		this.anInt1234 = arg2;
		this.method1157();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!ak;Lclient!dca;Lclient!ll;ILclient!rf;Lclient!cn;Lclient!hf;ILclient!ha;)Lclient!ka;")
	public Class170 method1161(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Interface12 arg2, @OriginalArg(4) Class45 arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(6) Class155 arg5, @OriginalArg(8) Class22 arg6) {
		if (this.anInt1234 != -1) {
			return arg0.method619(this.anInt1234).method5037(arg6, arg2, (Class187) null, arg3);
		}
		@Pc(42) int local42 = arg3 == null ? 2048 : arg3.method6588() | 0x800;
		@Pc(44) Class307 local44 = Static386.aClass307_61;
		@Pc(53) Class170 local53;
		synchronized (Static386.aClass307_61) {
			local53 = (Class170) Static386.aClass307_61.method7002(this.aLong40);
		}
		if (local53 == null || arg6.method9324(local53.ua(), local42) != 0) {
			if (local53 != null) {
				local42 = arg6.method9375(local42, local53.ua());
			}
			@Pc(83) boolean local83 = false;
			for (@Pc(85) int local85 = 0; local85 < this.anIntArray76.length; local85++) {
				@Pc(94) int local94 = this.anIntArray76[local85];
				@Pc(96) Class99 local96 = null;
				if ((local94 & 0x40000000) != 0) {
					if (this.aClass99Array1 != null && this.aClass99Array1[local85] != null) {
						local96 = this.aClass99Array1[local85];
					}
					if (!arg4.method1887(local94 & 0x3FFFFFFF).method6291(this.aBoolean86, local96)) {
						local83 = true;
					}
				} else if ((local94 & Integer.MIN_VALUE) != 0 && !arg1.method1983(local94 & 0x3FFFFFFF).method9594()) {
					local83 = true;
				}
			}
			if (local83) {
				return null;
			}
			@Pc(176) Class145[] local176 = new Class145[this.anIntArray76.length];
			@Pc(178) int local178 = 0;
			for (@Pc(180) int local180 = 0; local180 < this.anIntArray76.length; local180++) {
				@Pc(189) int local189 = this.anIntArray76[local180];
				@Pc(191) Class99 local191 = null;
				@Pc(227) Class145 local227;
				if ((local189 & 0x40000000) != 0) {
					if (this.aClass99Array1 != null && this.aClass99Array1[local180] != null) {
						local191 = this.aClass99Array1[local180];
					}
					local227 = arg4.method1887(local189 & 0x3FFFFFFF).method6285(local191, this.aBoolean86);
					if (local227 != null) {
						local176[local178++] = local227;
					}
				} else if ((local189 & Integer.MIN_VALUE) != 0) {
					local227 = arg1.method1983(local189 & 0x3FFFFFFF).method9592();
					if (local227 != null) {
						local176[local178++] = local227;
					}
				}
			}
			@Pc(270) Class145 local270 = new Class145(local176, local178);
			@Pc(274) int local274 = local42 | 0x4000;
			local53 = arg6.method9382(local270, local274, Static39.anInt1222, 64, 768);
			for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
				for (@Pc(290) int local290 = 0; local290 < Static304.aShortArrayArray1[local286].length; local290++) {
					if (Static596.aShortArrayArrayArray1[local286][local290].length > this.anIntArray77[local286]) {
						local53.ia(Static304.aShortArrayArray1[local286][local290], Static596.aShortArrayArrayArray1[local286][local290][this.anIntArray77[local286]]);
					}
				}
			}
			local53.s(local42);
			@Pc(348) Class307 local348 = Static386.aClass307_61;
			synchronized (Static386.aClass307_61) {
				Static386.aClass307_61.method7000(local53, this.aLong40);
			}
		}
		if (arg3 == null) {
			return local53;
		} else {
			@Pc(373) Class170 local373 = local53.method8369((byte) 4, local42, true);
			arg3.method6574(0, local373);
			return local373;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)V")
	public void method1164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray77[arg1] = arg0;
		this.method1157();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!dca;I)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2) {
		@Pc(18) int local18 = Static553.anIntArray614[arg1];
		if (arg2.method1983(arg0) != null) {
			this.anIntArray76[local18] = arg0 | Integer.MIN_VALUE;
			this.method1157();
		}
	}
}
