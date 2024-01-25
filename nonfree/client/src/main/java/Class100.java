import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class100 {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[Lclient!rja;")
	private Class306[] aClass306Array1;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	private int anInt2164;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
	public int anInt2158 = -1;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	public void method1897(@OriginalArg(1) boolean arg0) {
		this.aBoolean189 = arg0;
		this.method1904();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public void method1900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray124[arg1] = arg0;
		this.method1904();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!fj;II)V")
	public void method1901(@OriginalArg(1) Class127 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == -1) {
			this.anIntArray123[arg2] = 0;
		} else if (arg0.method2501(arg1) != null) {
			this.anIntArray123[arg2] = arg1 | 0x40000000;
			this.method1904();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!aga;Lclient!md;Lclient!ha;Lclient!hs;Lclient!sp;IILclient!gm;Lclient!hs;Lclient!fj;IZLclient!sn;[IIILclient!sda;IIII)Lclient!ka;")
	public Class164 method1902(@OriginalArg(0) Class10[] arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) Class325 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Interface7 arg7, @OriginalArg(8) Class165 arg8, @OriginalArg(9) Class127 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class324 arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class317 arg15, @OriginalArg(17) int arg16, @OriginalArg(18) int arg17, @OriginalArg(19) int arg18, @OriginalArg(20) int arg19) {
		if (this.anInt2158 != -1) {
			return arg1.method5363(this.anInt2158, 2).method5324(arg13, (Class133) null, arg16, arg8, arg10, arg4, arg19, arg14, arg15, arg17, arg18, arg3, arg5, arg2, arg12, arg0, arg7);
		}
		@Pc(37) int local37 = arg19;
		@Pc(40) long local40 = this.aLong60;
		@Pc(43) int[] local43 = this.anIntArray123;
		@Pc(45) boolean local45 = false;
		@Pc(47) boolean local47 = false;
		if (arg8 != null && (arg8.anInt3904 >= 0 || arg8.anInt3920 >= 0)) {
			local43 = new int[this.anIntArray123.length];
			for (@Pc(72) int local72 = 0; local72 < local43.length; local72++) {
				local43[local72] = this.anIntArray123[local72];
			}
			if (arg8.anInt3904 >= 0) {
				if (arg8.anInt3904 == 65535) {
					local45 = true;
					local40 ^= 0xFFFFFFFF00000000L;
					local43[5] = 0;
				} else {
					local43[5] = arg8.anInt3904 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg8.anInt3920 >= 0) {
				if (arg8.anInt3920 == 65535) {
					local43[3] = 0;
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[3] = arg8.anInt3920 | 0x40000000;
					local40 ^= (long) local43[3];
				}
				local47 = true;
			}
		}
		@Pc(176) boolean local176 = false;
		@Pc(178) boolean local178 = false;
		@Pc(180) boolean local180 = false;
		@Pc(191) boolean local191 = arg8 != null || arg3 != null;
		@Pc(199) int local199 = arg0 == null ? 0 : arg0.length;
		@Pc(235) int local235;
		@Pc(240) int local240;
		for (@Pc(201) int local201 = 0; local201 < local199; local201++) {
			Static434.aClass5_Sub5_Sub15Array2[local201] = null;
			if (arg0[local201] != null) {
				@Pc(221) Class165 local221 = arg15.method7882(arg0[local201].anInt246, 100);
				if (local221.anIntArray226 != null) {
					Static187.aClass165Array1[local201] = local221;
					local191 = true;
					local235 = arg0[local201].anInt244;
					local240 = arg0[local201].anInt243;
					@Pc(245) int local245 = local221.anIntArray226[local235];
					Static434.aClass5_Sub5_Sub15Array2[local201] = arg15.method7883(local245 >>> 16, 64);
					@Pc(258) int local258 = local245 & 0xFFFF;
					Static395.anIntArray383[local201] = local258;
					if (Static434.aClass5_Sub5_Sub15Array2[local201] != null) {
						local178 |= Static434.aClass5_Sub5_Sub15Array2[local201].method4805(local258, -25695);
						local176 |= Static434.aClass5_Sub5_Sub15Array2[local201].method4801(local258, (byte) 93);
						local180 |= Static434.aClass5_Sub5_Sub15Array2[local201].method4799(local258);
					}
					if ((local221.aBoolean303 || Static95.aBoolean147) && local240 != -1 && local221.anIntArray226.length > local240) {
						Static519.anIntArray506[local201] = local221.anIntArray225[local235];
						Static160.anIntArray142[local201] = arg0[local201].anInt240;
						@Pc(356) int local356 = local221.anIntArray226[local240];
						Static39.aClass5_Sub5_Sub15Array1[local201] = arg15.method7883(local356 >>> 16, 64);
						@Pc(369) int local369 = local356 & 0xFFFF;
						Static603.anIntArray555[local201] = local369;
						if (Static39.aClass5_Sub5_Sub15Array1[local201] != null) {
							local178 |= Static39.aClass5_Sub5_Sub15Array1[local201].method4805(local369, -25695);
							local176 |= Static39.aClass5_Sub5_Sub15Array1[local201].method4801(local369, (byte) 93);
							local180 |= Static39.aClass5_Sub5_Sub15Array1[local201].method4799(local369);
						}
					} else {
						Static519.anIntArray506[local201] = 0;
						Static160.anIntArray142[local201] = 0;
						Static39.aClass5_Sub5_Sub15Array1[local201] = null;
						Static603.anIntArray555[local201] = -1;
					}
				}
			}
		}
		@Pc(410) int local410 = -1;
		local235 = -1;
		local240 = 0;
		@Pc(416) Class5_Sub5_Sub15 local416 = null;
		@Pc(418) Class5_Sub5_Sub15 local418 = null;
		@Pc(420) int local420 = -1;
		@Pc(422) int local422 = -1;
		@Pc(424) int local424 = 0;
		@Pc(426) Class5_Sub5_Sub15 local426 = null;
		@Pc(428) Class5_Sub5_Sub15 local428 = null;
		if (local191) {
			@Pc(445) int local445;
			@Pc(511) int local511;
			if (arg8 != null) {
				local410 = arg8.anIntArray226[arg13];
				local445 = local410 >>> 16;
				local410 &= 0xFFFF;
				local416 = arg15.method7883(local445, 64);
				if (local416 != null) {
					local178 |= local416.method4805(local410, -25695);
					local176 |= local416.method4801(local410, (byte) 93);
					local180 |= local416.method4799(local410);
				}
				if ((arg8.aBoolean303 || Static95.aBoolean147) && arg16 != -1 && arg8.anIntArray226.length > arg16) {
					local240 = arg8.anIntArray225[arg13];
					local235 = arg8.anIntArray226[arg16];
					local511 = local235 >>> 16;
					local418 = local445 == local511 ? local416 : arg15.method7883(local511, 64);
					local235 &= 0xFFFF;
					if (local418 != null) {
						local178 |= local418.method4805(local235, -25695);
						local176 |= local418.method4801(local235, (byte) 93);
						local180 |= local418.method4799(local235);
					}
				}
			}
			local37 = arg19 | 0x20;
			if (arg3 != null) {
				local420 = arg3.anIntArray226[arg10];
				local445 = local420 >>> 16;
				local426 = arg15.method7883(local445, 64);
				local420 &= 0xFFFF;
				if (local426 != null) {
					local178 |= local426.method4805(local420, -25695);
					local176 |= local426.method4801(local420, (byte) 93);
					local180 |= local426.method4799(local420);
				}
				if ((arg3.aBoolean303 || Static95.aBoolean147) && arg18 != -1 && arg3.anIntArray226.length > arg18) {
					local422 = arg3.anIntArray226[arg18];
					local424 = arg3.anIntArray225[arg10];
					local511 = local422 >>> 16;
					local428 = local445 == local511 ? local426 : arg15.method7883(local511, 64);
					local422 &= 0xFFFF;
					if (local428 != null) {
						local178 |= local428.method4805(local422, -25695);
						local176 |= local428.method4801(local422, (byte) 93);
						local180 |= local428.method4799(local422);
					}
				}
			}
			if (local178) {
				local37 |= 0x80;
			}
			if (local176) {
				local37 |= 0x100;
			}
			if (local180) {
				local37 |= 0x400;
			}
		}
		@Pc(695) Class391 local695 = Static320.aClass391_27;
		@Pc(703) Class164 local703;
		synchronized (Static320.aClass391_27) {
			local703 = (Class164) Static320.aClass391_27.method9275(local40);
		}
		@Pc(711) Class101 local711 = null;
		if (this.anInt2164 != -1) {
			local711 = arg4.method7979(this.anInt2164);
		}
		@Pc(745) boolean local745;
		@Pc(747) int local747;
		@Pc(755) int local755;
		@Pc(900) int local900;
		@Pc(906) int local906;
		@Pc(1037) int local1037;
		if (local703 == null || arg2.method7670(local703.ua(), local37) != 0) {
			if (local703 != null) {
				local37 = arg2.method7661(local37, local703.ua());
			}
			local745 = false;
			local747 = 0;
			while (true) {
				if (local747 >= local43.length) {
					if (local745) {
						if (this.aLong59 != -1L) {
							@Pc(863) Class391 local863 = Static320.aClass391_27;
							synchronized (Static320.aClass391_27) {
								local703 = (Class164) Static320.aClass391_27.method9275(this.aLong59);
							}
						}
						if (local703 != null && arg2.method7670(local703.ua(), local37) == 0) {
							break;
						}
						return null;
					}
					@Pc(898) Class192[] local898 = new Class192[local43.length];
					for (local900 = 0; local900 < local43.length; local900++) {
						local906 = local43[local900];
						@Pc(908) Class306 local908 = null;
						@Pc(931) boolean local931 = local900 == 5 && local45 || local900 == 3 && local47;
						@Pc(956) Class192 local956;
						if ((local906 & 0x40000000) != 0) {
							if (!local931 && this.aClass306Array1 != null && this.aClass306Array1[local900] != null) {
								local908 = this.aClass306Array1[local900];
							}
							local956 = arg9.method2501(local906 & 0x3FFFFFFF).method4872(local908, this.aBoolean189);
							if (local956 != null) {
								local898[local900] = local956;
							}
						} else if ((local906 & Integer.MIN_VALUE) != 0) {
							local956 = arg11.method7959(local906 & 0x3FFFFFFF).method8676();
							if (local956 != null) {
								local898[local900] = local956;
							}
						}
					}
					@Pc(1039) int local1039;
					if (local711 != null && local711.anIntArrayArray15 != null) {
						for (local906 = 0; local906 < local711.anIntArrayArray15.length; local906++) {
							if (local898[local906] != null) {
								local1037 = 0;
								local1039 = 0;
								@Pc(1041) int local1041 = 0;
								@Pc(1043) int local1043 = 0;
								@Pc(1045) int local1045 = 0;
								@Pc(1047) int local1047 = 0;
								if (local711.anIntArrayArray15[local906] != null) {
									local1045 = local711.anIntArrayArray15[local906][4] << 3;
									local1043 = local711.anIntArrayArray15[local906][3] << 3;
									local1037 = local711.anIntArrayArray15[local906][0];
									local1047 = local711.anIntArrayArray15[local906][5] << 3;
									local1039 = local711.anIntArrayArray15[local906][1];
									local1041 = local711.anIntArrayArray15[local906][2];
								}
								if (local1043 != 0 || local1045 != 0 || local1047 != 0) {
									local898[local906].method4333(local1047, local1045, local1043);
								}
								if (local1037 != 0 || local1039 != 0 || local1041 != 0) {
									local898[local906].method4332(local1039, local1041, local1037);
								}
							}
						}
					}
					@Pc(1153) int local1153 = local37 | 0x4000;
					@Pc(1160) Class192 local1160 = new Class192(local898, local898.length);
					local703 = arg2.method7700(local1160, local1153, Static52.anInt835, 64, 850);
					for (local1037 = 0; local1037 < 5; local1037++) {
						for (local1039 = 0; local1039 < Static114.aShortArrayArrayArray1.length; local1039++) {
							if (this.anIntArray124[local1037] < Static114.aShortArrayArrayArray1[local1039][local1037].length) {
								local703.ia(Static59.aShortArrayArray2[local1039][local1037], Static114.aShortArrayArrayArray1[local1039][local1037][this.anIntArray124[local1037]]);
							}
						}
					}
					if (true) {
						local703.s(local37);
						@Pc(1242) Class391 local1242 = Static320.aClass391_27;
						synchronized (Static320.aClass391_27) {
							Static320.aClass391_27.method9273(local40, local703, 1);
						}
						this.aLong59 = local40;
					}
					break;
				}
				local755 = local43[local747];
				@Pc(757) Class306 local757 = null;
				@Pc(780) boolean local780 = local747 == 5 && local45 || local747 == 3 && local47;
				if ((local755 & 0x40000000) != 0) {
					if (!local780 && this.aClass306Array1 != null && this.aClass306Array1[local747] != null) {
						local757 = this.aClass306Array1[local747];
					}
					if (!arg9.method2501(local755 & 0x3FFFFFFF).method4863(local757, this.aBoolean189)) {
						local745 = true;
					}
				} else if ((Integer.MIN_VALUE & local755) != 0 && !arg11.method7959(local755 & 0x3FFFFFFF).method8671()) {
					local745 = true;
				}
				local747++;
			}
		}
		@Pc(1264) Class164 local1264 = local703.method9072((byte) 4, local37, true);
		local745 = false;
		if (arg12 != null) {
			for (local747 = 0; local747 < arg12.length; local747++) {
				if (arg12[local747] != -1) {
					local745 = true;
				}
			}
		}
		if (!local191 && !local745) {
			return local1264;
		}
		@Pc(1304) Class203[] local1304 = null;
		if (local711 != null) {
			local1304 = local711.method1914(arg2);
		}
		if (local745 && local1304 != null) {
			for (local755 = 0; local755 < arg12.length; local755++) {
				if (local1304[local755] != null) {
					local1264.method9084(local1304[local755], 0x1 << local755, true);
				}
			}
		}
		local755 = 0;
		local900 = 1;
		while (local199 > local755) {
			if (Static434.aClass5_Sub5_Sub15Array2[local755] != null) {
				local1264.method9080(Static519.anIntArray506[local755], (int[]) null, Static603.anIntArray555[local755], local900, false, Static395.anIntArray383[local755], Static39.aClass5_Sub5_Sub15Array1[local755], Static160.anIntArray142[local755] - 1, Static434.aClass5_Sub5_Sub15Array2[local755]);
			}
			local900 <<= 0x1;
			local755++;
		}
		if (arg6 < 38) {
			this.aLong59 = 35L;
		}
		if (local745) {
			for (local906 = 0; local906 < arg12.length; local906++) {
				if (arg12[local906] != -1) {
					local1037 = arg12[local906] - arg14;
					local1037 &= 0x3FFF;
					@Pc(1443) Class203 local1443 = arg2.method7676();
					local1443.method8331(local1037);
					local1264.method9084(local1443, 0x1 << local906, false);
				}
			}
		}
		if (local745 && local1304 != null) {
			for (local906 = 0; local906 < arg12.length; local906++) {
				if (local1304[local906] != null) {
					local1264.method9084(local1304[local906], 0x1 << local906, false);
				}
			}
		}
		if (local416 != null && local426 != null) {
			local1264.method9074(local418, false, local422, local424, local416, local426, arg5 - 1, arg8.aBooleanArray6, local428, local240, local235, arg17 - 1, local410, local420);
		} else if (local416 != null) {
			local1264.method9094(local240, local418, local235, local416, false, local410, arg17 - 1, 0);
		} else if (local426 != null) {
			local1264.method9094(local424, local428, local422, local426, false, local420, arg5 - 1, 0);
		}
		for (local906 = 0; local906 < local199; local906++) {
			Static434.aClass5_Sub5_Sub15Array2[local906] = null;
			Static39.aClass5_Sub5_Sub15Array1[local906] = null;
			Static187.aClass165Array1[local906] = null;
		}
		return local1264;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ha;BLclient!gm;Lclient!fj;Lclient!sn;Lclient!sda;ILclient!hs;Lclient!md;II)Lclient!ka;")
	public Class164 method1903(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Class127 arg3, @OriginalArg(5) Class324 arg4, @OriginalArg(6) Class317 arg5, @OriginalArg(8) Class165 arg6, @OriginalArg(9) Class231 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.anInt2158 != -1) {
			return arg7.method5363(this.anInt2158, 2).method5332(arg1, arg9, arg8, arg2, arg6, arg5, (Class133) null, arg0);
		}
		@Pc(30) int local30 = 2048;
		@Pc(38) boolean local38;
		@Pc(51) int local51;
		@Pc(123) int local123;
		@Pc(61) int local61;
		@Pc(127) int local127;
		if (arg6 != null) {
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			local38 = false;
			@Pc(40) boolean local40 = false;
			local51 = arg6.anIntArray226[arg0];
			local30 = 2080;
			local61 = local51 >>> 16;
			@Pc(65) int local65 = local51 & 0xFFFF;
			@Pc(70) Class5_Sub5_Sub15 local70 = arg5.method7883(local61, 64);
			if (local70 != null) {
				local36 = local70.method4805(local65, -25695) | false;
				local34 = local70.method4801(local65, (byte) 93) | false;
				local40 = local70.method4799(local65) | false;
				local38 = arg6.aBoolean306 | false;
			}
			if ((arg6.aBoolean303 || Static95.aBoolean147) && arg9 != -1 && arg6.anIntArray226.length > arg9) {
				local123 = arg6.anIntArray226[arg9];
				local127 = local123 >>> 16;
				@Pc(138) Class5_Sub5_Sub15 local138 = local127 == local61 ? local70 : arg5.method7883(local127, 64);
				@Pc(142) int local142 = local123 & 0xFFFF;
				if (local138 != null) {
					local36 |= local138.method4805(local142, -25695);
					local34 |= local138.method4801(local142, (byte) 93);
					local40 |= local138.method4799(local142);
				}
			}
			if (local36) {
				local30 = 2208;
			}
			if (local34) {
				local30 |= 0x100;
			}
			if (local38) {
				local30 |= 0x200;
			}
			if (local40) {
				local30 |= 0x400;
			}
		}
		@Pc(191) Class391 local191 = Static32.aClass391_5;
		@Pc(200) Class164 local200;
		synchronized (Static32.aClass391_5) {
			local200 = (Class164) Static32.aClass391_5.method9275(this.aLong60);
		}
		if (local200 == null || arg1.method7670(local200.ua(), local30) != 0) {
			if (local200 != null) {
				local30 = arg1.method7661(local30, local200.ua());
			}
			local38 = false;
			for (@Pc(240) int local240 = 0; local240 < this.anIntArray123.length; local240++) {
				local51 = this.anIntArray123[local240];
				@Pc(251) Class306 local251 = null;
				if ((local51 & 0x40000000) != 0) {
					if (this.aClass306Array1 != null && this.aClass306Array1[local240] != null) {
						local251 = this.aClass306Array1[local240];
					}
					if (!arg3.method2501(local51 & 0x3FFFFFFF).method4874(this.aBoolean189, local251)) {
						local38 = true;
					}
				} else if ((local51 & Integer.MIN_VALUE) != 0 && !arg4.method7959(local51 & 0x3FFFFFFF).method8672()) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(334) Class192[] local334 = new Class192[this.anIntArray123.length];
			local123 = 0;
			for (@Pc(338) int local338 = 0; local338 < this.anIntArray123.length; local338++) {
				@Pc(347) int local347 = this.anIntArray123[local338];
				@Pc(349) Class306 local349 = null;
				@Pc(385) Class192 local385;
				if ((local347 & 0x40000000) != 0) {
					if (this.aClass306Array1 != null && this.aClass306Array1[local338] != null) {
						local349 = this.aClass306Array1[local338];
					}
					local385 = arg3.method2501(local347 & 0x3FFFFFFF).method4870(local349, this.aBoolean189);
					if (local385 != null) {
						local334[local123++] = local385;
					}
				} else if ((local347 & Integer.MIN_VALUE) != 0) {
					local385 = arg4.method7959(local347 & 0x3FFFFFFF).method8674();
					if (local385 != null) {
						local334[local123++] = local385;
					}
				}
			}
			@Pc(428) Class192 local428 = new Class192(local334, local123);
			@Pc(432) int local432 = local30 | 0x4000;
			local200 = arg1.method7700(local428, local432, Static52.anInt835, 64, 768);
			for (local61 = 0; local61 < 5; local61++) {
				for (local127 = 0; local127 < Static114.aShortArrayArrayArray1.length; local127++) {
					if (Static114.aShortArrayArrayArray1[local127][local61].length > this.anIntArray124[local61]) {
						local200.ia(Static59.aShortArrayArray2[local127][local61], Static114.aShortArrayArrayArray1[local127][local61][this.anIntArray124[local61]]);
					}
				}
			}
			local200.s(local30);
			@Pc(506) Class391 local506 = Static32.aClass391_5;
			synchronized (Static32.aClass391_5) {
				Static32.aClass391_5.method9273(this.aLong60, local200, 1);
			}
		}
		if (arg6 == null) {
			return local200;
		} else {
			local200.method9072((byte) 4, local30, true);
			return arg6.method3397(arg9, local200, arg0, arg8, 2048);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	private void method1904() {
		@Pc(7) long[] local7 = Class166.aLongArray10;
		this.aLong60 = -1L;
		this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) ((this.aLong60 ^ (long) (this.anInt2164 >> 8)) & 0xFFL)];
		this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) ((this.aLong60 ^ (long) this.anInt2164) & (long) 255)];
		for (@Pc(51) int local51 = 0; local51 < this.anIntArray123.length; local51++) {
			this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) (((long) (this.anIntArray123[local51] >> 24) ^ this.aLong60) & 0xFFL)];
			this.aLong60 = local7[(int) ((this.aLong60 ^ (long) (this.anIntArray123[local51] >> 16)) & 0xFFL)] ^ this.aLong60 >>> 8;
			this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) (((long) (this.anIntArray123[local51] >> 8) ^ this.aLong60) & 0xFFL)];
			this.aLong60 = local7[(int) ((this.aLong60 ^ (long) this.anIntArray123[local51]) & 0xFFL)] ^ this.aLong60 >>> 8;
		}
		@Pc(160) int local160;
		if (this.aClass306Array1 != null) {
			for (local160 = 0; local160 < this.aClass306Array1.length; local160++) {
				if (this.aClass306Array1[local160] != null) {
					@Pc(180) int[] local180;
					@Pc(186) int[] local186;
					if (this.aBoolean189) {
						local186 = this.aClass306Array1[local160].anIntArray501;
						local180 = this.aClass306Array1[local160].anIntArray502;
					} else {
						local180 = this.aClass306Array1[local160].anIntArray500;
						local186 = this.aClass306Array1[local160].anIntArray499;
					}
					@Pc(204) int local204;
					if (local180 != null) {
						for (local204 = 0; local204 < local180.length; local204++) {
							this.aLong60 = local7[(int) ((this.aLong60 ^ (long) (local180[local204] >> 8)) & 0xFFL)] ^ this.aLong60 >>> 8;
							this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) (((long) local180[local204] ^ this.aLong60) & 0xFFL)];
						}
					}
					if (local186 != null) {
						for (local204 = 0; local204 < local186.length; local204++) {
							this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) (((long) (local186[local204] >> 8) ^ this.aLong60) & 0xFFL)];
							this.aLong60 = local7[(int) (((long) local186[local204] ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
						}
					}
					if (this.aClass306Array1[local160].aShortArray113 != null) {
						for (local204 = 0; local204 < this.aClass306Array1[local160].aShortArray113.length; local204++) {
							this.aLong60 = local7[(int) ((this.aLong60 ^ (long) (this.aClass306Array1[local160].aShortArray113[local204] >> 8)) & 0xFFL)] ^ this.aLong60 >>> 8;
							this.aLong60 = local7[(int) (((long) this.aClass306Array1[local160].aShortArray113[local204] ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
						}
					}
					if (this.aClass306Array1[local160].aShortArray112 != null) {
						for (local204 = 0; local204 < this.aClass306Array1[local160].aShortArray112.length; local204++) {
							this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) (((long) (this.aClass306Array1[local160].aShortArray112[local204] >> 8) ^ this.aLong60) & 0xFFL)];
							this.aLong60 = this.aLong60 >>> 8 ^ local7[(int) ((this.aLong60 ^ (long) this.aClass306Array1[local160].aShortArray112[local204]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local160 = 0; local160 < 5; local160++) {
			this.aLong60 = local7[(int) ((this.aLong60 ^ (long) this.anIntArray124[local160]) & 0xFFL)] ^ this.aLong60 >>> 8;
		}
		this.aLong60 = local7[(int) ((this.aLong60 ^ (long) (this.aBoolean189 ? 1 : 0)) & 0xFFL)] ^ this.aLong60 >>> 8;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ[II[II[Lclient!rja;)V")
	public void method1905(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class306[] arg5) {
		this.aBoolean189 = arg0;
		this.anIntArray124 = arg1;
		this.anInt2158 = arg4;
		this.aClass306Array1 = arg5;
		if (arg2 != this.anInt2164) {
			this.anInt2164 = arg2;
		}
		this.anIntArray123 = arg3;
		this.method1904();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!sn;ILclient!ha;IILclient!sda;Lclient!hs;II)Lclient!ka;")
	public Class164 method1906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class324 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class57 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class317 arg7, @OriginalArg(9) Class165 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(103) int local103;
		@Pc(38) int local38;
		if (arg8 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg8.anIntArray226[arg6];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class5_Sub5_Sub15 local47 = arg7.method7883(local38, 64);
			if (local47 != null) {
				local13 = local47.method4805(local42, -25695) | false;
				local11 = local47.method4801(local42, (byte) 93) | false;
				local17 = local47.method4799(local42) | false;
				local15 = arg8.aBoolean306 | false;
			}
			if ((arg8.aBoolean303 || Static95.aBoolean147) && arg5 != -1 && arg8.anIntArray226.length > arg5) {
				local103 = arg8.anIntArray226[arg5];
				@Pc(107) int local107 = local103 >>> 16;
				@Pc(111) int local111 = local103 & 0xFFFF;
				@Pc(120) Class5_Sub5_Sub15 local120;
				if (local38 == local107) {
					local120 = local47;
				} else {
					local120 = arg7.method7883(local111 >>> 16, 64);
				}
				if (local120 != null) {
					local13 |= local120.method4805(local111, -25695);
					local11 |= local120.method4801(local111, (byte) 93);
					local17 |= local120.method4799(local111);
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
		@Pc(188) long local188 = (long) arg9 | (long) (arg0 << 16) | (long) arg1 << 32;
		@Pc(190) Class391 local190 = Static32.aClass391_5;
		@Pc(198) Class164 local198;
		synchronized (Static32.aClass391_5) {
			local198 = (Class164) Static32.aClass391_5.method9275(local188);
		}
		if (local198 == null || arg4.method7670(local198.ua(), local7) != 0) {
			if (local198 != null) {
				local7 = arg4.method7661(local7, local198.ua());
			}
			@Pc(232) Class192[] local232 = new Class192[3];
			local103 = 0;
			if (!arg2.method7959(arg9).method8672() || !arg2.method7959(arg0).method8672() || !arg2.method7959(arg1).method8672()) {
				return null;
			}
			@Pc(266) Class192 local266 = arg2.method7959(arg9).method8674();
			if (local266 != null) {
				local103++;
				local232[0] = local266;
			}
			local266 = arg2.method7959(arg0).method8674();
			if (local266 != null) {
				local232[local103++] = local266;
			}
			local266 = arg2.method7959(arg1).method8674();
			if (local266 != null) {
				local232[local103++] = local266;
			}
			@Pc(311) int local311 = local7 | 0x4000;
			local266 = new Class192(local232, local103);
			local198 = arg4.method7700(local266, local311, Static52.anInt835, 64, 768);
			for (@Pc(327) int local327 = 0; local327 < 5; local327++) {
				for (local38 = 0; local38 < Static114.aShortArrayArrayArray1.length; local38++) {
					if (this.anIntArray124[local327] < Static114.aShortArrayArrayArray1[local38][local327].length) {
						local198.ia(Static59.aShortArrayArray2[local38][local327], Static114.aShortArrayArrayArray1[local38][local327][this.anIntArray124[local327]]);
					}
				}
			}
			local198.s(local7);
			@Pc(389) Class391 local389 = Static32.aClass391_5;
			synchronized (Static32.aClass391_5) {
				Static32.aClass391_5.method9273(local188, local198, 1);
			}
		}
		if (arg8 == null) {
			return local198;
		} else {
			local198 = local198.method9072((byte) 4, local7, true);
			return arg8.method3397(arg5, local198, arg6, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!sn;I)V")
	public void method1908(@OriginalArg(0) int arg0, @OriginalArg(2) Class324 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static403.anIntArray400[arg2];
		if (arg1.method7959(arg0) != null) {
			this.anIntArray123[local7] = Integer.MIN_VALUE | arg0;
			this.method1904();
		}
	}
}
