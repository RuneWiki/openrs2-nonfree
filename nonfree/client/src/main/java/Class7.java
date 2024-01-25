import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
	public boolean aBoolean24;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public int anInt235 = -1;

	static {
		new Class256("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!eb;I)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static159.anIntArray206[arg2];
		if (this.anIntArray9[local7] != 0 && arg1.method1479(arg0) != null) {
			this.anIntArray9[local7] = arg0 | Integer.MIN_VALUE;
			this.method160();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray10[arg0] = arg1;
		this.method160();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI[II[II)V")
	public void method155(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray10 = arg4;
		this.aBoolean24 = arg0;
		if (this.anInt234 != arg1) {
			this.anInt234 = arg1;
			this.anIntArrayArray1 = null;
		}
		this.anIntArray9 = arg2;
		this.anInt235 = arg3;
		this.method160();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!qa;IIBLclient!dc;Lclient!eb;IIILclient!pp;)Lclient!c;")
	public Class32 method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class46 arg5, @OriginalArg(7) Class61 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class194 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(93) int local93;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg5.anIntArray90[arg7];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(43) Class2_Sub2_Sub7 local43 = arg9.method4376(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method1407(local47) | false;
				local11 = local43.method1411(local47) | false;
				local17 = local43.method1409(local47) | false;
				local15 = arg5.aBoolean150 | false;
			}
			if ((arg5.aBoolean152 || Static431.aBoolean640) && arg1 != -1 && arg1 < arg5.anIntArray90.length) {
				local93 = arg5.anIntArray90[arg1];
				@Pc(97) int local97 = local93 >>> 16;
				@Pc(101) int local101 = local93 & 0xFFFF;
				@Pc(115) Class2_Sub2_Sub7 local115;
				if (local38 == local97) {
					local115 = local43;
				} else {
					local115 = arg9.method4376(local101 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method1407(local101);
					local11 |= local115.method1411(local101);
					local17 |= local115.method1409(local101);
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
		@Pc(178) long local178 = (long) (arg3 << 16) | (long) arg4 << 32 | (long) arg8;
		@Pc(180) Class129 local180 = Static205.aClass129_33;
		@Pc(188) Class32 local188;
		synchronized (Static205.aClass129_33) {
			local188 = (Class32) Static205.aClass129_33.method3023(local178);
		}
		if (local188 == null || arg2.method2259(local188.n(), local7) != 0) {
			if (local188 != null) {
				local7 = arg2.method2285(local7, local188.n());
			}
			@Pc(218) Class266[] local218 = new Class266[3];
			local93 = 0;
			if (!arg6.method1479(arg8).method1733() || !arg6.method1479(arg3).method1733() || !arg6.method1479(arg4).method1733()) {
				return null;
			}
			@Pc(250) Class266 local250 = arg6.method1479(arg8).method1729();
			if (local250 != null) {
				local93++;
				local218[0] = local250;
			}
			local250 = arg6.method1479(arg3).method1729();
			if (local250 != null) {
				local218[local93++] = local250;
			}
			local250 = arg6.method1479(arg4).method1729();
			if (local250 != null) {
				local218[local93++] = local250;
			}
			@Pc(289) int local289 = local7 | 0x4000;
			local250 = new Class266(local218, local93);
			local188 = arg2.method2227(local250, local289, Static237.anInt4617, 64, 768);
			for (@Pc(305) int local305 = 0; local305 < 5; local305++) {
				if (Static174.aShortArrayArray3[local305].length > this.anIntArray10[local305]) {
					local188.N(Static119.aShortArray27[local305], Static174.aShortArrayArray3[local305][this.anIntArray10[local305]]);
				}
				if (this.anIntArray10[local305] < Static339.aShortArrayArray5[local305].length) {
					local188.N(Static32.aShortArray4[local305], Static339.aShortArrayArray5[local305][this.anIntArray10[local305]]);
				}
			}
			local188.u(local7);
			@Pc(368) Class129 local368 = Static205.aClass129_33;
			synchronized (Static205.aClass129_33) {
				Static205.aClass129_33.method3029(local188, local178);
			}
		}
		if (arg5 == null) {
			return local188;
		} else {
			local188 = local188.method5678((byte) 4, local7, true);
			return arg5.method1261(local188, 2048, arg1, arg0, arg7);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
	public void method157(@OriginalArg(0) boolean arg0) {
		this.aBoolean24 = arg0;
		this.method160();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!rd;ILclient!dc;IILclient!dc;ILclient!lk;Lclient!tq;ZI[Lclient!wu;ILclient!kh;Lclient!qa;Lclient!pp;Lclient!eb;II)Lclient!c;")
	public Class32 method158(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class46 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class149 arg7, @OriginalArg(8) Class234 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class268[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class136 arg12, @OriginalArg(14) Class26 arg13, @OriginalArg(15) Class194 arg14, @OriginalArg(16) Class61 arg15, @OriginalArg(17) int arg16) {
		if (this.anInt235 != -1) {
			return arg8.method5362(this.anInt235).method4797(arg10, arg1, arg4, arg5, arg14, arg6, arg11, arg12, arg2, arg16, arg13, arg3, arg0, arg9);
		}
		@Pc(33) int local33 = arg9;
		@Pc(36) long local36 = this.aLong8;
		@Pc(39) int[] local39 = this.anIntArray9;
		if (arg2 != null && (arg2.anInt1762 >= 0 || arg2.anInt1773 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray9[local55];
			}
			if (arg2.anInt1762 >= 0) {
				if (arg2.anInt1762 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg2.anInt1762 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg2.anInt1773 >= 0) {
				if (arg2.anInt1773 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg2.anInt1773 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg2 != null || arg5 != null;
		@Pc(156) int local156 = arg10 == null ? 0 : arg10.length;
		@Pc(190) int local190;
		@Pc(195) int local195;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Static380.aClass2_Sub2_Sub7Array2[local158] = null;
			if (arg10[local158] != null) {
				@Pc(176) Class46 local176 = arg14.method4371(arg10[local158].anInt7848);
				if (local176.anIntArray90 != null) {
					Static336.aClass46Array2[local158] = local176;
					local149 = true;
					local190 = arg10[local158].anInt7839;
					local195 = arg10[local158].anInt7842;
					@Pc(200) int local200 = local176.anIntArray90[local190];
					Static380.aClass2_Sub2_Sub7Array2[local158] = arg14.method4376(local200 >>> 16);
					@Pc(215) int local215 = local200 & 0xFFFF;
					Static310.anIntArray361[local158] = local215;
					if (Static380.aClass2_Sub2_Sub7Array2[local158] != null) {
						local139 |= Static380.aClass2_Sub2_Sub7Array2[local158].method1407(local215);
						local137 |= Static380.aClass2_Sub2_Sub7Array2[local158].method1411(local215);
						local141 |= Static380.aClass2_Sub2_Sub7Array2[local158].method1409(local215);
					}
					if ((local176.aBoolean152 || Static431.aBoolean640) && local195 != -1 && local195 < local176.anIntArray90.length) {
						Static99.anIntArray87[local158] = local176.anIntArray89[local190];
						Static350.anIntArray414[local158] = arg10[local158].anInt7843;
						@Pc(282) int local282 = local176.anIntArray90[local195];
						Static97.aClass2_Sub2_Sub7Array1[local158] = arg14.method4376(local282 >>> 16);
						@Pc(295) int local295 = local282 & 0xFFFF;
						Static115.anIntArray429[local158] = local295;
						if (Static97.aClass2_Sub2_Sub7Array1[local158] != null) {
							local139 |= Static97.aClass2_Sub2_Sub7Array1[local158].method1407(local295);
							local137 |= Static97.aClass2_Sub2_Sub7Array1[local158].method1411(local295);
							local141 |= Static97.aClass2_Sub2_Sub7Array1[local158].method1409(local295);
						}
					} else {
						Static99.anIntArray87[local158] = 0;
						Static350.anIntArray414[local158] = 0;
						Static97.aClass2_Sub2_Sub7Array1[local158] = null;
						Static115.anIntArray429[local158] = -1;
					}
				}
			}
		}
		@Pc(358) int local358 = -1;
		local190 = -1;
		local195 = 0;
		@Pc(364) Class2_Sub2_Sub7 local364 = null;
		@Pc(366) Class2_Sub2_Sub7 local366 = null;
		@Pc(368) int local368 = -1;
		@Pc(370) int local370 = -1;
		@Pc(372) int local372 = 0;
		@Pc(374) Class2_Sub2_Sub7 local374 = null;
		@Pc(376) Class2_Sub2_Sub7 local376 = null;
		if (local149) {
			local33 = arg9 | 0x20;
			@Pc(393) int local393;
			@Pc(459) int local459;
			if (arg2 != null) {
				local358 = arg2.anIntArray90[arg1];
				local393 = local358 >>> 16;
				local364 = arg14.method4376(local393);
				local358 &= 0xFFFF;
				if (local364 != null) {
					local139 |= local364.method1407(local358);
					local137 |= local364.method1411(local358);
					local141 |= local364.method1409(local358);
				}
				if ((arg2.aBoolean152 || Static431.aBoolean640) && arg11 != -1 && arg11 < arg2.anIntArray90.length) {
					local190 = arg2.anIntArray90[arg11];
					local195 = arg2.anIntArray89[arg1];
					local459 = local190 >>> 16;
					local366 = local393 == local459 ? local364 : arg14.method4376(local459);
					local190 &= 0xFFFF;
					if (local366 != null) {
						local139 |= local366.method1407(local190);
						local137 |= local366.method1411(local190);
						local141 |= local366.method1409(local190);
					}
				}
			}
			if (arg5 != null) {
				local368 = arg5.anIntArray90[arg6];
				local393 = local368 >>> 16;
				local374 = arg14.method4376(local393);
				local368 &= 0xFFFF;
				if (local374 != null) {
					local139 |= local374.method1407(local368);
					local137 |= local374.method1411(local368);
					local141 |= local374.method1409(local368);
				}
				if ((arg5.aBoolean152 || Static431.aBoolean640) && arg4 != -1 && arg5.anIntArray90.length > arg4) {
					local372 = arg5.anIntArray89[arg6];
					local370 = arg5.anIntArray90[arg4];
					local459 = local370 >>> 16;
					local376 = local393 == local459 ? local374 : arg14.method4376(local459);
					local370 &= 0xFFFF;
					if (local376 != null) {
						local139 |= local376.method1407(local370);
						local137 |= local376.method1411(local370);
						local141 |= local376.method1409(local370);
					}
				}
			}
			if (local139) {
				local33 |= 0x80;
			}
			if (local137) {
				local33 |= 0x100;
			}
			if (local141) {
				local33 |= 0x400;
			}
		}
		@Pc(630) Class129 local630 = Static115.aClass129_58;
		@Pc(638) Class32 local638;
		synchronized (Static115.aClass129_58) {
			local638 = (Class32) Static115.aClass129_58.method3023(local36);
		}
		@Pc(646) Class12 local646 = null;
		if (this.anInt234 != -1) {
			local646 = arg12.method3178(this.anInt234);
		}
		@Pc(687) int local687;
		@Pc(693) int local693;
		if (local638 == null || arg13.method2259(local638.n(), local33) != 0 || local646 != null && local646.anIntArrayArray2 != null && this.anIntArrayArray1 == null) {
			if (local638 != null) {
				local33 = arg13.method2285(local33, local638.n());
			}
			@Pc(685) boolean local685 = false;
			local687 = 0;
			while (true) {
				if (local687 >= 12) {
					if (local685) {
						if (this.aLong9 != -1L) {
							@Pc(1337) Class129 local1337 = Static115.aClass129_58;
							synchronized (Static115.aClass129_58) {
								local638 = (Class32) Static115.aClass129_58.method3023(this.aLong9);
							}
						}
						if (local638 == null || arg13.method2259(local638.n(), local33) != 0 || local646 != null && local646.anIntArrayArray2 != null && this.anIntArrayArray1 == null) {
							return null;
						}
					} else {
						@Pc(741) Class266[] local741 = new Class266[12];
						@Pc(749) int local749;
						for (@Pc(743) int local743 = 0; local743 < 12; local743++) {
							local749 = local39[local743];
							@Pc(769) Class266 local769;
							if ((local749 & 0x40000000) != 0) {
								local769 = arg7.method3483(local749 & 0x3FFFFFFF).method747(this.aBoolean24);
								if (local769 != null) {
									local741[local743] = local769;
								}
							} else if ((local749 & Integer.MIN_VALUE) != 0) {
								local769 = arg15.method1479(local749 & 0x3FFFFFFF).method1730();
								if (local769 != null) {
									local741[local743] = local769;
								}
							}
						}
						@Pc(827) int local827;
						if (local646 != null && local646.anIntArrayArray2 != null) {
							for (local749 = 0; local749 < local646.anIntArrayArray2.length; local749++) {
								if (local646.anIntArrayArray2[local749] != null && local741[local749] != null) {
									local827 = local646.anIntArrayArray2[local749][0];
									@Pc(834) int local834 = local646.anIntArrayArray2[local749][1];
									@Pc(841) int local841 = local646.anIntArrayArray2[local749][2];
									@Pc(850) int local850 = local646.anIntArrayArray2[local749][3] << 3;
									@Pc(859) int local859 = local646.anIntArrayArray2[local749][4] << 3;
									@Pc(868) int local868 = local646.anIntArrayArray2[local749][5] << 3;
									if (this.anIntArrayArray1 == null) {
										this.anIntArrayArray1 = new int[local646.anIntArrayArray2.length][];
									}
									if (this.anIntArrayArray1[local749] == null) {
										@Pc(890) int[] local890 = this.anIntArrayArray1[local749] = new int[15];
										if (local850 == 0 && local859 == 0 && local868 == 0) {
											local890[12] = -local827;
											local890[13] = -local834;
											local890[0] = local890[4] = local890[8] = 32768;
											local890[14] = -local841;
										} else {
											@Pc(935) int local935 = Class184.anIntArray350[local850];
											@Pc(939) int local939 = Class184.anIntArray349[local850];
											@Pc(943) int local943 = Class184.anIntArray350[local859];
											@Pc(947) int local947 = Class184.anIntArray349[local859];
											@Pc(951) int local951 = Class184.anIntArray350[local868];
											@Pc(955) int local955 = Class184.anIntArray349[local868];
											@Pc(963) int local963 = local951 * local939 + 16384 >> 15;
											@Pc(971) int local971 = local939 * local955 + 16384 >> 15;
											local890[8] = local943 * local935 + 16384 >> 15;
											local890[1] = -local955 * local943 + local963 * local947 + 16384 >> 15;
											local890[0] = local943 * local951 + local947 * local971 + 16384 >> 15;
											local890[2] = local947 * local935 + 16384 >> 15;
											local890[5] = -local939;
											local890[7] = local963 * local943 + -local947 * -local955 + 16384 >> 15;
											local890[6] = local971 * local943 + local951 * -local947 + 16384 >> 15;
											local890[4] = local935 * local951 + 16384 >> 15;
											local890[3] = local935 * local955 + 16384 >> 15;
											local890[13] = -local841 * local890[7] + local890[4] * -local834 + local890[1] * -local827 + 16384 >> 15;
											local890[14] = -local834 * local890[5] + local890[2] * -local827 + -local841 * local890[8] + 16384 >> 15;
											local890[12] = -local834 * local890[3] + -local827 * local890[0] + -local841 * local890[6] + 16384 >> 15;
										}
										local890[11] = local841;
										local890[10] = local834;
										local890[9] = local827;
									}
									if (local850 != 0 || local859 != 0 || local868 != 0) {
										local741[local749].method6060(local859, local850, local868);
									}
									if (local827 != 0 || local834 != 0 || local841 != 0) {
										local741[local749].method6063(local841, local827, local834);
									}
								}
							}
						}
						@Pc(1224) int local1224 = local33 | 0x4000;
						@Pc(1231) Class266 local1231 = new Class266(local741, local741.length);
						local638 = arg13.method2227(local1231, local1224, Static237.anInt4617, 64, 850);
						for (local827 = 0; local827 < 5; local827++) {
							if (Static174.aShortArrayArray3[local827].length > this.anIntArray10[local827]) {
								local638.N(Static119.aShortArray27[local827], Static174.aShortArrayArray3[local827][this.anIntArray10[local827]]);
							}
							if (this.anIntArray10[local827] < Static339.aShortArrayArray5[local827].length) {
								local638.N(Static32.aShortArray4[local827], Static339.aShortArrayArray5[local827][this.anIntArray10[local827]]);
							}
						}
						local638.u(local33);
						@Pc(1308) Class129 local1308 = Static115.aClass129_58;
						synchronized (Static115.aClass129_58) {
							Static115.aClass129_58.method3029(local638, local36);
						}
						this.aLong9 = local36;
					}
					break;
				}
				local693 = local39[local687];
				if ((local693 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local693) != 0 && !arg15.method1479(local693 & 0x3FFFFFFF).method1726()) {
						local685 = true;
					}
				} else if (!arg7.method3483(local693 & 0x3FFFFFFF).method734(this.aBoolean24)) {
					local685 = true;
				}
				local687++;
			}
		}
		@Pc(1379) Class32 local1379 = local638.method5678((byte) 4, local33, true);
		if (!local149) {
			return local1379;
		}
		@Pc(1385) int local1385 = 0;
		local687 = 1;
		while (local1385 < local156) {
			if (Static380.aClass2_Sub2_Sub7Array2[local1385] != null) {
				local1379.method5683(this.anIntArrayArray1 == null ? null : this.anIntArrayArray1[local1385], Static310.anIntArray361[local1385], Static350.anIntArray414[local1385] - 1, false, Static380.aClass2_Sub2_Sub7Array2[local1385], Static97.aClass2_Sub2_Sub7Array1[local1385], local687, Static115.anIntArray429[local1385], Static99.anIntArray87[local1385]);
			}
			local1385++;
			local687 <<= 0x1;
		}
		if (local364 != null && local374 != null) {
			local1379.method5670(arg3 - 1, local190, false, local376, local366, local195, local374, arg2.aBooleanArray8, local358, local372, local364, arg16 - 1, local370, local368);
		} else if (local364 != null) {
			local1379.method5668(0, false, local364, local358, local366, local190, local195, arg16 - 1);
		} else if (local374 != null) {
			local1379.method5668(0, false, local374, local368, local376, local370, local372, arg3 - 1);
		}
		for (local693 = 0; local693 < local156; local693++) {
			Static380.aClass2_Sub2_Sub7Array2[local693] = null;
			Static97.aClass2_Sub2_Sub7Array1[local693] = null;
			Static336.aClass46Array2[local693] = null;
		}
		return local1379;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qa;Lclient!pp;Lclient!dc;IILclient!rd;IILclient!lk;Lclient!tq;Lclient!eb;I)Lclient!c;")
	public Class32 method159(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface11 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class149 arg6, @OriginalArg(9) Class234 arg7, @OriginalArg(10) Class61 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt235 != -1) {
			return arg7.method5362(this.anInt235).method4794(arg9, arg1, arg4, arg0, arg3, arg5, arg2);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(50) int local50;
		@Pc(114) int local114;
		@Pc(58) int local58;
		if (arg2 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local50 = arg2.anIntArray90[arg9];
			local27 = 2080;
			local58 = local50 >>> 16;
			@Pc(62) int local62 = local50 & 0xFFFF;
			@Pc(67) Class2_Sub2_Sub7 local67 = arg1.method4376(local58);
			if (local67 != null) {
				local33 = local67.method1407(local62) | false;
				local31 = local67.method1411(local62) | false;
				local37 = local67.method1409(local62) | false;
				local35 = arg2.aBoolean150 | false;
			}
			if ((arg2.aBoolean152 || Static431.aBoolean640) && arg5 != -1 && arg2.anIntArray90.length > arg5) {
				local114 = arg2.anIntArray90[arg5];
				@Pc(118) int local118 = local114 >>> 16;
				@Pc(122) int local122 = local114 & 0xFFFF;
				@Pc(136) Class2_Sub2_Sub7 local136 = local58 == local118 ? local67 : arg1.method4376(local118);
				if (local136 != null) {
					local33 |= local136.method1407(local122);
					local31 |= local136.method1411(local122);
					local37 |= local136.method1409(local122);
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
		@Pc(191) Class129 local191 = Static205.aClass129_33;
		@Pc(200) Class32 local200;
		synchronized (Static205.aClass129_33) {
			local200 = (Class32) Static205.aClass129_33.method3023(this.aLong8);
		}
		if (local200 == null || arg0.method2259(local200.n(), local27) != 0) {
			if (local200 != null) {
				local27 = arg0.method2285(local27, local200.n());
			}
			local35 = false;
			for (@Pc(228) int local228 = 0; local228 < 12; local228++) {
				local50 = this.anIntArray9[local228];
				if ((local50 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local50) != 0 && !arg8.method1479(local50 & 0x3FFFFFFF).method1733()) {
						local35 = true;
					}
				} else if (!arg6.method3483(local50 & 0x3FFFFFFF).method744(this.aBoolean24)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(285) Class266[] local285 = new Class266[12];
			local114 = 0;
			for (@Pc(289) int local289 = 0; local289 < 12; local289++) {
				@Pc(296) int local296 = this.anIntArray9[local289];
				@Pc(313) Class266 local313;
				if ((local296 & 0x40000000) != 0) {
					local313 = arg6.method3483(local296 & 0x3FFFFFFF).method730(this.aBoolean24);
					if (local313 != null) {
						local285[local114++] = local313;
					}
				} else if ((local296 & Integer.MIN_VALUE) != 0) {
					local313 = arg8.method1479(local296 & 0x3FFFFFFF).method1729();
					if (local313 != null) {
						local285[local114++] = local313;
					}
				}
			}
			@Pc(350) Class266 local350 = new Class266(local285, local114);
			@Pc(354) int local354 = local27 | 0x4000;
			local200 = arg0.method2227(local350, local354, Static237.anInt4617, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static174.aShortArrayArray3[local58].length > this.anIntArray10[local58]) {
					local200.N(Static119.aShortArray27[local58], Static174.aShortArrayArray3[local58][this.anIntArray10[local58]]);
				}
				if (Static339.aShortArrayArray5[local58].length > this.anIntArray10[local58]) {
					local200.N(Static32.aShortArray4[local58], Static339.aShortArrayArray5[local58][this.anIntArray10[local58]]);
				}
			}
			local200.u(local27);
			@Pc(421) Class129 local421 = Static205.aClass129_33;
			synchronized (Static205.aClass129_33) {
				Static205.aClass129_33.method3029(local200, this.aLong8);
			}
		}
		if (arg2 == null) {
			return local200;
		} else {
			local200.method5678((byte) 4, local27, true);
			return arg2.method1261(local200, 2048, arg5, arg3, arg9);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	private void method160() {
		this.aLong8 = -1L;
		@Pc(10) long[] local10 = Class2_Sub2_Sub12_Sub2.aLongArray6;
		this.aLong8 = this.aLong8 >>> 8 ^ local10[(int) ((this.aLong8 ^ (long) (this.anInt234 >> 8)) & 0xFFL)];
		this.aLong8 = local10[(int) (((long) this.anInt234 ^ this.aLong8) & 0xFFL)] ^ this.aLong8 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong8 = local10[(int) (((long) (this.anIntArray9[local50] >> 24) ^ this.aLong8) & 0xFFL)] ^ this.aLong8 >>> 8;
			this.aLong8 = local10[(int) ((this.aLong8 ^ (long) (this.anIntArray9[local50] >> 16)) & 0xFFL)] ^ this.aLong8 >>> 8;
			this.aLong8 = this.aLong8 >>> 8 ^ local10[(int) ((this.aLong8 ^ (long) (this.anIntArray9[local50] >> 8)) & 0xFFL)];
			this.aLong8 = this.aLong8 >>> 8 ^ local10[(int) (((long) this.anIntArray9[local50] ^ this.aLong8) & 0xFFL)];
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong8 = this.aLong8 >>> 8 ^ local10[(int) ((this.aLong8 ^ (long) this.anIntArray10[local144]) & 0xFFL)];
		}
		this.aLong8 = this.aLong8 >>> 8 ^ local10[(int) ((this.aLong8 ^ (long) (this.aBoolean24 ? 1 : 0)) & 0xFFL)];
	}
}
