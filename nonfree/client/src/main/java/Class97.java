import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class97 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	private int anInt2828;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "I")
	public int anInt2827 = -1;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!wb;Lclient!an;ZLclient!vf;Lclient!vk;Lclient!ya;II[Lclient!pe;ILclient!fd;IILclient!kn;Lclient!vf;Lclient!db;III)Lclient!t;")
	public Class91 method2228(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) Interface12 arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class190[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class76 arg9, @OriginalArg(11) int arg10, @OriginalArg(13) Class144 arg11, @OriginalArg(14) Class250 arg12, @OriginalArg(15) Class51 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16) {
		if (this.anInt2827 != -1) {
			return arg9.method1888(this.anInt2827).method1700(arg3, arg15, arg6, arg7, arg13, arg10, arg4, arg14, arg1, arg8, arg16, arg2, arg5, arg12);
		}
		@Pc(34) int local34 = arg14;
		@Pc(37) long local37 = this.aLong82;
		@Pc(40) int[] local40 = this.anIntArray256;
		if (arg12 != null && (arg12.anInt7024 >= 0 || arg12.anInt7020 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray256[local56];
			}
			if (arg12.anInt7024 >= 0) {
				if (arg12.anInt7024 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg12.anInt7024 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg12.anInt7020 >= 0) {
				if (arg12.anInt7020 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg12.anInt7020 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(155) boolean local155 = false;
		@Pc(163) boolean local163 = arg12 != null || arg2 != null;
		@Pc(170) int local170 = arg7 == null ? 0 : arg7.length;
		@Pc(204) int local204;
		@Pc(209) int local209;
		for (@Pc(172) int local172 = 0; local172 < local170; local172++) {
			Static150.aClass2_Sub5_Sub3Array6[local172] = null;
			if (arg7[local172] != null) {
				@Pc(190) Class250 local190 = arg1.method255(arg7[local172].anInt5355);
				if (local190.anIntArray592 != null) {
					Static324.aClass250Array2[local172] = local190;
					local163 = true;
					local204 = arg7[local172].anInt5352;
					local209 = arg7[local172].anInt5357;
					@Pc(214) int local214 = local190.anIntArray592[local204];
					Static150.aClass2_Sub5_Sub3Array6[local172] = arg1.method257(local214 >>> 16);
					@Pc(227) int local227 = local214 & 0xFFFF;
					Static123.anIntArray250[local172] = local227;
					if (Static150.aClass2_Sub5_Sub3Array6[local172] != null) {
						local147 |= Static150.aClass2_Sub5_Sub3Array6[local172].method888(local227);
						local145 |= Static150.aClass2_Sub5_Sub3Array6[local172].method889(local227);
						local155 |= Static150.aClass2_Sub5_Sub3Array6[local172].method885(local227);
					}
					if ((local190.aBoolean466 || Static133.aBoolean221) && local209 != -1 && local209 < local190.anIntArray592.length) {
						Static125.anIntArray251[local172] = local190.anIntArray594[local204];
						Static2.anIntArray9[local172] = arg7[local172].anInt5351;
						@Pc(312) int local312 = local190.anIntArray592[local209];
						Static243.aClass2_Sub5_Sub3Array7[local172] = arg1.method257(local312 >>> 16);
						@Pc(325) int local325 = local312 & 0xFFFF;
						Static255.anIntArray399[local172] = local325;
						if (Static243.aClass2_Sub5_Sub3Array7[local172] != null) {
							local147 |= Static243.aClass2_Sub5_Sub3Array7[local172].method888(local325);
							local145 |= Static243.aClass2_Sub5_Sub3Array7[local172].method889(local325);
							local155 |= Static243.aClass2_Sub5_Sub3Array7[local172].method885(local325);
						}
					} else {
						Static125.anIntArray251[local172] = 0;
						Static2.anIntArray9[local172] = 0;
						Static243.aClass2_Sub5_Sub3Array7[local172] = null;
						Static255.anIntArray399[local172] = -1;
					}
				}
			}
		}
		@Pc(372) int local372 = -1;
		local204 = -1;
		local209 = 0;
		@Pc(378) Class2_Sub5_Sub3 local378 = null;
		@Pc(380) Class2_Sub5_Sub3 local380 = null;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = -1;
		@Pc(386) int local386 = 0;
		@Pc(388) Class2_Sub5_Sub3 local388 = null;
		@Pc(390) Class2_Sub5_Sub3 local390 = null;
		if (local163) {
			local34 = arg14 | 0x20;
			@Pc(407) int local407;
			@Pc(470) int local470;
			if (arg12 != null) {
				local372 = arg12.anIntArray592[arg8];
				local407 = local372 >>> 16;
				local372 &= 0xFFFF;
				local378 = arg1.method257(local407);
				if (local378 != null) {
					local147 |= local378.method888(local372);
					local145 |= local378.method889(local372);
					local155 |= local378.method885(local372);
				}
				if ((arg12.aBoolean466 || Static133.aBoolean221) && arg5 != -1 && arg5 < arg12.anIntArray592.length) {
					local204 = arg12.anIntArray592[arg5];
					local209 = arg12.anIntArray594[arg8];
					local470 = local204 >>> 16;
					local204 &= 0xFFFF;
					local380 = local470 == local407 ? local378 : arg1.method257(local470);
					if (local380 != null) {
						local147 |= local380.method888(local204);
						local145 |= local380.method889(local204);
						local155 |= local380.method885(local204);
					}
				}
			}
			if (arg2 != null) {
				local382 = arg2.anIntArray592[arg16];
				local407 = local382 >>> 16;
				local388 = arg1.method257(local407);
				local382 &= 0xFFFF;
				if (local388 != null) {
					local147 |= local388.method888(local382);
					local145 |= local388.method889(local382);
					local155 |= local388.method885(local382);
				}
				if ((arg2.aBoolean466 || Static133.aBoolean221) && arg6 != -1 && arg6 < arg2.anIntArray592.length) {
					local386 = arg2.anIntArray594[arg16];
					local384 = arg2.anIntArray592[arg6];
					local470 = local384 >>> 16;
					local390 = local407 == local470 ? local388 : arg1.method257(local470);
					local384 &= 0xFFFF;
					if (local390 != null) {
						local147 |= local390.method888(local384);
						local145 |= local390.method889(local384);
						local155 |= local390.method885(local384);
					}
				}
			}
			if (local147) {
				local34 |= 0x80;
			}
			if (local145) {
				local34 |= 0x100;
			}
			if (local155) {
				local34 |= 0x400;
			}
		}
		@Pc(646) Class171 local646 = Static226.aClass171_22;
		@Pc(654) Class91 local654;
		synchronized (Static226.aClass171_22) {
			local654 = (Class91) Static226.aClass171_22.method3941(local37);
		}
		@Pc(662) Class156 local662 = null;
		if (this.anInt2828 != -1) {
			local662 = arg13.method1144(this.anInt2828);
		}
		@Pc(705) int local705;
		@Pc(711) int local711;
		if (local654 == null || arg4.method4429(local654.P(), local34) != 0 || local662 != null && local662.anIntArrayArray43 != null && this.anIntArrayArray26 == null) {
			if (local654 != null) {
				local34 = arg4.method4451(local34, local654.P());
			}
			@Pc(703) boolean local703 = false;
			local705 = 0;
			while (true) {
				if (local705 >= 12) {
					if (local703) {
						if (this.aLong81 != -1L) {
							@Pc(1335) Class171 local1335 = Static226.aClass171_22;
							synchronized (Static226.aClass171_22) {
								local654 = (Class91) Static226.aClass171_22.method3941(this.aLong81);
							}
						}
						if (local654 == null || arg4.method4429(local654.P(), local34) != 0 || local662 != null && local662.anIntArrayArray43 != null && this.anIntArrayArray26 == null) {
							return null;
						}
					} else {
						@Pc(759) Class146[] local759 = new Class146[12];
						@Pc(767) int local767;
						for (@Pc(761) int local761 = 0; local761 < 12; local761++) {
							local767 = local40[local761];
							@Pc(782) Class146 local782;
							if ((local767 & 0x40000000) != 0) {
								local782 = arg11.method3265(local767 & 0x3FFFFFFF).method855(this.aBoolean219);
								if (local782 != null) {
									local759[local761] = local782;
								}
							} else if ((Integer.MIN_VALUE & local767) != 0) {
								local782 = arg0.method5676(local767 & 0x3FFFFFFF).method2097();
								if (local782 != null) {
									local759[local761] = local782;
								}
							}
						}
						@Pc(842) int local842;
						if (local662 != null && local662.anIntArrayArray43 != null) {
							for (local767 = 0; local767 < local662.anIntArrayArray43.length; local767++) {
								if (local662.anIntArrayArray43[local767] != null && local759[local767] != null) {
									local842 = local662.anIntArrayArray43[local767][0];
									@Pc(849) int local849 = local662.anIntArrayArray43[local767][1];
									@Pc(856) int local856 = local662.anIntArrayArray43[local767][2];
									@Pc(865) int local865 = local662.anIntArrayArray43[local767][3] << 3;
									@Pc(874) int local874 = local662.anIntArrayArray43[local767][4] << 3;
									@Pc(883) int local883 = local662.anIntArrayArray43[local767][5] << 3;
									if (this.anIntArrayArray26 == null) {
										this.anIntArrayArray26 = new int[local662.anIntArrayArray43.length][];
									}
									if (this.anIntArrayArray26[local767] == null) {
										@Pc(905) int[] local905 = this.anIntArrayArray26[local767] = new int[15];
										if (local865 == 0 && local874 == 0 && local883 == 0) {
											local905[13] = -local849;
											local905[12] = -local842;
											local905[0] = local905[4] = local905[8] = 32768;
											local905[14] = -local856;
										} else {
											@Pc(918) int local918 = Class162.anIntArray387[local865];
											@Pc(922) int local922 = Class162.anIntArray388[local865];
											@Pc(926) int local926 = Class162.anIntArray387[local874];
											@Pc(930) int local930 = Class162.anIntArray388[local874];
											@Pc(934) int local934 = Class162.anIntArray387[local883];
											@Pc(938) int local938 = Class162.anIntArray388[local883];
											@Pc(946) int local946 = local934 * local922 + 16384 >> 15;
											@Pc(954) int local954 = local922 * local938 + 16384 >> 15;
											local905[2] = local930 * local918 + 16384 >> 15;
											local905[7] = -local938 * -local930 + local926 * local946 + 16384 >> 15;
											local905[3] = local918 * local938 + 16384 >> 15;
											local905[6] = local926 * local954 + -local930 * local934 + 16384 >> 15;
											local905[8] = local918 * local926 + 16384 >> 15;
											local905[1] = local930 * local946 + local926 * -local938 + 16384 >> 15;
											local905[4] = local934 * local918 + 16384 >> 15;
											local905[0] = local934 * local926 + local930 * local954 + 16384 >> 15;
											local905[5] = -local922;
											local905[14] = local905[8] * -local856 + -local849 * local905[5] + -local842 * local905[2] + 16384 >> 15;
											local905[13] = -local856 * local905[7] + -local842 * local905[1] + local905[4] * -local849 + 16384 >> 15;
											local905[12] = local905[6] * -local856 + local905[3] * -local849 + local905[0] * -local842 + 16384 >> 15;
										}
										local905[9] = local842;
										local905[11] = local856;
										local905[10] = local849;
									}
									if (local865 != 0 || local874 != 0 || local883 != 0) {
										local759[local767].method3333(local865, local883, local874);
									}
									if (local842 != 0 || local849 != 0 || local856 != 0) {
										local759[local767].method3334(local856, local849, local842);
									}
								}
							}
						}
						@Pc(1230) int local1230 = local34 | 0x4000;
						@Pc(1237) Class146 local1237 = new Class146(local759, local759.length);
						local654 = arg4.method4414(local1237, local1230, Static77.anInt1732, 64, 850);
						for (local842 = 0; local842 < 5; local842++) {
							if (this.anIntArray255[local842] < Static239.aShortArrayArray5[local842].length) {
								local654.BA(Static256.aShortArray73[local842], Static239.aShortArrayArray5[local842][this.anIntArray255[local842]]);
							}
							if (Static187.aShortArrayArray4[local842].length > this.anIntArray255[local842]) {
								local654.BA(Static347.aShortArray108[local842], Static187.aShortArrayArray4[local842][this.anIntArray255[local842]]);
							}
						}
						local654.UA(local34);
						@Pc(1308) Class171 local1308 = Static226.aClass171_22;
						synchronized (Static226.aClass171_22) {
							Static226.aClass171_22.method3940(local37, local654);
						}
						this.aLong81 = local37;
					}
					break;
				}
				local711 = local40[local705];
				if ((local711 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local711) != 0 && !arg0.method5676(local711 & 0x3FFFFFFF).method2098()) {
						local703 = true;
					}
				} else if (!arg11.method3265(local711 & 0x3FFFFFFF).method868(this.aBoolean219)) {
					local703 = true;
				}
				local705++;
			}
		}
		@Pc(1377) Class91 local1377 = local654.method3285((byte) 4, local34, true);
		if (!local163) {
			return local1377;
		}
		@Pc(1383) int local1383 = 0;
		local705 = 1;
		while (local1383 < local170) {
			if (Static150.aClass2_Sub5_Sub3Array6[local1383] != null) {
				local1377.method3286(Static123.anIntArray250[local1383], Static2.anIntArray9[local1383] - 1, Static150.aClass2_Sub5_Sub3Array6[local1383], Static255.anIntArray399[local1383], Static243.aClass2_Sub5_Sub3Array7[local1383], this.anIntArrayArray26 == null ? null : this.anIntArrayArray26[local1383], local705, Static125.anIntArray251[local1383], false);
			}
			local705 <<= 0x1;
			local1383++;
		}
		if (local378 != null && local388 != null) {
			local1377.method3284(local204, local386, local388, local390, local382, local372, arg10 - 1, false, local378, local380, local209, arg15 - 1, arg12.aBooleanArray25, local384);
		} else if (local378 != null) {
			local1377.method3294(local378, local209, false, local372, local380, local204, arg10 - 1, 0);
		} else if (local388 != null) {
			local1377.method3294(local388, local386, false, local382, local390, local384, arg15 - 1, 0);
		}
		for (local711 = 0; local711 < local170; local711++) {
			Static150.aClass2_Sub5_Sub3Array6[local711] = null;
			Static243.aClass2_Sub5_Sub3Array7[local711] = null;
			Static324.aClass250Array2[local711] = null;
		}
		return local1377;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!wb;)V")
	public void method2229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class259 arg2) {
		@Pc(7) int local7 = Static172.anIntArray305[arg0];
		if (this.anIntArray256[local7] != 0 && arg2.method5676(arg1) != null) {
			this.anIntArray256[local7] = arg1 | Integer.MIN_VALUE;
			this.method2233();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!vf;Lclient!fd;Lclient!vk;Lclient!ya;IILclient!kn;BLclient!wb;ILclient!an;I)Lclient!t;")
	public Class91 method2231(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Interface12 arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class144 arg6, @OriginalArg(8) Class259 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class12 arg9) {
		if (this.anInt2827 != -1) {
			return arg1.method1888(this.anInt2827).method1704(arg0, arg2, arg3, arg9, arg8, arg4, arg5);
		}
		@Pc(33) int local33 = 2048;
		@Pc(41) boolean local41;
		@Pc(54) int local54;
		@Pc(119) int local119;
		@Pc(64) int local64;
		if (arg0 != null) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			local41 = false;
			@Pc(43) boolean local43 = false;
			local54 = arg0.anIntArray592[arg8];
			local33 = 2080;
			local64 = local54 >>> 16;
			@Pc(69) Class2_Sub5_Sub3 local69 = arg9.method257(local64);
			@Pc(73) int local73 = local54 & 0xFFFF;
			if (local69 != null) {
				local39 = local69.method888(local73) | false;
				local37 = local69.method889(local73) | false;
				local43 = local69.method885(local73) | false;
				local41 = arg0.aBoolean464 | false;
			}
			if ((arg0.aBoolean466 || Static133.aBoolean221) && arg5 != -1 && arg0.anIntArray592.length > arg5) {
				local119 = arg0.anIntArray592[arg5];
				@Pc(123) int local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(141) Class2_Sub5_Sub3 local141 = local64 == local123 ? local69 : arg9.method257(local123);
				if (local141 != null) {
					local39 |= local141.method888(local127);
					local37 |= local141.method889(local127);
					local43 |= local141.method885(local127);
				}
			}
			if (local39) {
				local33 = 2208;
			}
			if (local37) {
				local33 |= 0x100;
			}
			if (local41) {
				local33 |= 0x200;
			}
			if (local43) {
				local33 |= 0x400;
			}
		}
		@Pc(190) Class171 local190 = Static224.aClass171_36;
		@Pc(199) Class91 local199;
		synchronized (Static224.aClass171_36) {
			local199 = (Class91) Static224.aClass171_36.method3941(this.aLong82);
		}
		if (local199 == null || arg3.method4429(local199.P(), local33) != 0) {
			if (local199 != null) {
				local33 = arg3.method4451(local33, local199.P());
			}
			local41 = false;
			for (@Pc(230) int local230 = 0; local230 < 12; local230++) {
				local54 = this.anIntArray256[local230];
				if ((local54 & 0x40000000) == 0) {
					if ((local54 & Integer.MIN_VALUE) != 0 && !arg7.method5676(local54 & 0x3FFFFFFF).method2100()) {
						local41 = true;
					}
				} else if (!arg6.method3265(local54 & 0x3FFFFFFF).method864(this.aBoolean219)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(282) Class146[] local282 = new Class146[12];
			local119 = 0;
			for (@Pc(286) int local286 = 0; local286 < 12; local286++) {
				@Pc(293) int local293 = this.anIntArray256[local286];
				@Pc(313) Class146 local313;
				if ((local293 & 0x40000000) != 0) {
					local313 = arg6.method3265(local293 & 0x3FFFFFFF).method865(this.aBoolean219);
					if (local313 != null) {
						local282[local119++] = local313;
					}
				} else if ((Integer.MIN_VALUE & local293) != 0) {
					local313 = arg7.method5676(local293 & 0x3FFFFFFF).method2101();
					if (local313 != null) {
						local282[local119++] = local313;
					}
				}
			}
			@Pc(350) Class146 local350 = new Class146(local282, local119);
			@Pc(354) int local354 = local33 | 0x4000;
			local199 = arg3.method4414(local350, local354, Static77.anInt1732, 64, 768);
			for (local64 = 0; local64 < 5; local64++) {
				if (this.anIntArray255[local64] < Static239.aShortArrayArray5[local64].length) {
					local199.BA(Static256.aShortArray73[local64], Static239.aShortArrayArray5[local64][this.anIntArray255[local64]]);
				}
				if (this.anIntArray255[local64] < Static187.aShortArrayArray4[local64].length) {
					local199.BA(Static347.aShortArray108[local64], Static187.aShortArrayArray4[local64][this.anIntArray255[local64]]);
				}
			}
			local199.UA(local33);
			@Pc(423) Class171 local423 = Static224.aClass171_36;
			synchronized (Static224.aClass171_36) {
				Static224.aClass171_36.method3940(this.aLong82, local199);
			}
		}
		if (arg0 == null) {
			return local199;
		} else {
			local199.method3285((byte) 4, local33, true);
			return arg0.method5542(local199, 2048, arg4, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	private void method2233() {
		@Pc(7) long[] local7 = Class2_Sub2_Sub21.aLongArray5;
		this.aLong82 = -1L;
		this.aLong82 = local7[(int) (((long) (this.anInt2828 >> 8) ^ this.aLong82) & 0xFFL)] ^ this.aLong82 >>> 8;
		this.aLong82 = local7[(int) ((this.aLong82 ^ (long) this.anInt2828) & 0xFFL)] ^ this.aLong82 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong82 = local7[(int) ((this.aLong82 ^ (long) (this.anIntArray256[local50] >> 24)) & 0xFFL)] ^ this.aLong82 >>> 8;
			this.aLong82 = this.aLong82 >>> 8 ^ local7[(int) ((this.aLong82 ^ (long) (this.anIntArray256[local50] >> 16)) & 0xFFL)];
			this.aLong82 = this.aLong82 >>> 8 ^ local7[(int) (((long) (this.anIntArray256[local50] >> 8) ^ this.aLong82) & 0xFFL)];
			this.aLong82 = this.aLong82 >>> 8 ^ local7[(int) (((long) this.anIntArray256[local50] ^ this.aLong82) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong82 = this.aLong82 >>> 8 ^ local7[(int) (((long) this.anIntArray255[local150] ^ this.aLong82) & 0xFFL)];
		}
		this.aLong82 = this.aLong82 >>> 8 ^ local7[(int) (((long) (this.aBoolean219 ? 1 : 0) ^ this.aLong82) & 0xFFL)];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[IZI[IZ)V")
	public void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (arg2 != this.anInt2828) {
			this.anInt2828 = arg2;
			this.anIntArrayArray26 = null;
		}
		this.anInt2827 = arg0;
		this.anIntArray256 = arg3;
		this.aBoolean219 = arg4;
		this.anIntArray255 = arg1;
		this.method2233();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!vf;ILclient!an;ILclient!ya;ILclient!wb;III)Lclient!t;")
	public Class91 method2239(@OriginalArg(1) int arg0, @OriginalArg(2) Class250 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class259 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg1.anIntArray592[arg2];
			@Pc(38) int local38 = local32 >>> 16;
			@Pc(42) int local42 = local32 & 0xFFFF;
			@Pc(47) Class2_Sub5_Sub3 local47 = arg3.method257(local38);
			if (local47 != null) {
				local13 = local47.method888(local42) | false;
				local11 = local47.method889(local42) | false;
				local17 = local47.method885(local42) | false;
				local15 = arg1.aBoolean464 | false;
			}
			if ((arg1.aBoolean466 || Static133.aBoolean221) && arg9 != -1 && arg9 < arg1.anIntArray592.length) {
				local94 = arg1.anIntArray592[arg9];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(111) Class2_Sub5_Sub3 local111;
				if (local38 == local98) {
					local111 = local47;
				} else {
					local111 = arg3.method257(local102 >>> 16);
				}
				if (local111 != null) {
					local13 |= local111.method888(local102);
					local11 |= local111.method889(local102);
					local17 |= local111.method885(local102);
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
		@Pc(179) long local179 = (long) arg8 | (long) arg4 << 32 | (long) (arg0 << 16);
		@Pc(187) Class171 local187 = Static224.aClass171_36;
		@Pc(195) Class91 local195;
		synchronized (Static224.aClass171_36) {
			local195 = (Class91) Static224.aClass171_36.method3941(local179);
		}
		if (local195 == null || arg5.method4429(local195.P(), local7) != 0) {
			if (local195 != null) {
				local7 = arg5.method4451(local7, local195.P());
			}
			@Pc(225) Class146[] local225 = new Class146[3];
			local94 = 0;
			if (!arg7.method5676(arg8).method2100() || !arg7.method5676(arg0).method2100() || !arg7.method5676(arg4).method2100()) {
				return null;
			}
			@Pc(259) Class146 local259 = arg7.method5676(arg8).method2101();
			if (local259 != null) {
				local94++;
				local225[0] = local259;
			}
			local259 = arg7.method5676(arg0).method2101();
			if (local259 != null) {
				local225[local94++] = local259;
			}
			local259 = arg7.method5676(arg4).method2101();
			if (local259 != null) {
				local225[local94++] = local259;
			}
			local259 = new Class146(local225, local94);
			@Pc(304) int local304 = local7 | 0x4000;
			local195 = arg5.method4414(local259, local304, Static77.anInt1732, 64, 768);
			for (@Pc(314) int local314 = 0; local314 < 5; local314++) {
				if (this.anIntArray255[local314] < Static239.aShortArrayArray5[local314].length) {
					local195.BA(Static256.aShortArray73[local314], Static239.aShortArrayArray5[local314][this.anIntArray255[local314]]);
				}
				if (this.anIntArray255[local314] < Static187.aShortArrayArray4[local314].length) {
					local195.BA(Static347.aShortArray108[local314], Static187.aShortArrayArray4[local314][this.anIntArray255[local314]]);
				}
			}
			local195.UA(local7);
			@Pc(375) Class171 local375 = Static224.aClass171_36;
			synchronized (Static224.aClass171_36) {
				Static224.aClass171_36.method3940(local179, local195);
			}
		}
		if (arg1 == null) {
			return local195;
		} else {
			local195 = local195.method3285((byte) 4, local7, true);
			return arg1.method5542(local195, 2048, arg6, arg9, arg2);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
	public void method2241(@OriginalArg(0) boolean arg0) {
		this.aBoolean219 = arg0;
		this.method2233();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZII)V")
	public void method2242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray255[arg0] = arg1;
		this.method2233();
	}
}
