import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class217 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
	public boolean aBoolean604;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt6786;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public int anInt6784 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!gr;ILclient!sn;IIILclient!dr;)Lclient!wp;")
	public Class49 method5670(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class184 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class37 arg5) {
		if (this.anInt6784 != -1) {
			return Static90.method1809(this.anInt6784).method4118(arg4, arg0, arg5, arg3, arg1);
		}
		@Pc(24) int local24 = 1024;
		@Pc(32) boolean local32;
		@Pc(49) int local49;
		@Pc(104) int local104;
		@Pc(53) int local53;
		@Pc(108) int local108;
		if (arg0 != null) {
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			local32 = false;
			local24 = 1056;
			local49 = arg0.anIntArray197[arg3];
			local53 = local49 >>> 16;
			@Pc(57) int local57 = local49 & 0xFFFF;
			@Pc(61) Class2_Sub9_Sub2 local61 = Static276.method4760(local53);
			if (local61 != null) {
				local30 = local61.method1315(local57) | false;
				local28 = local61.method1314(local57) | false;
				local32 = arg0.aBoolean233 | false;
			}
			if ((arg0.aBoolean235 || Static263.aBoolean483) && arg1 != -1 && arg1 < arg0.anIntArray197.length) {
				local104 = arg0.anIntArray197[arg1];
				local108 = local104 >>> 16;
				@Pc(117) Class2_Sub9_Sub2 local117 = local53 == local108 ? local61 : Static276.method4760(local108);
				@Pc(121) int local121 = local104 & 0xFFFF;
				if (local117 != null) {
					local30 |= local117.method1315(local121);
					local28 |= local117.method1314(local121);
				}
			}
			if (local30) {
				local24 = 1184;
			}
			if (local28) {
				local24 |= 0x100;
			}
			if (local32) {
				local24 |= 0x200;
			}
		}
		@Pc(157) Class107 local157 = Static258.aClass107_38;
		@Pc(166) Class49 local166;
		synchronized (Static258.aClass107_38) {
			local166 = (Class49) Static258.aClass107_38.method3021(this.aLong217);
		}
		if (local166 == null || arg5.method3686(local166.method5820(), local24) != 0) {
			if (local166 != null) {
				local24 = arg5.method3685(local24, local166.method5820());
			}
			local32 = false;
			for (local49 = 0; local49 < 12; local49++) {
				local104 = this.anIntArray522[local49];
				if ((local104 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local104) != 0 && !Static267.method4684(local104 & 0x3FFFFFFF).method5803()) {
						local32 = true;
					}
				} else if (!arg2.method5040(local104 & 0x3FFFFFFF).method3403(this.aBoolean604)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(258) Class111[] local258 = new Class111[12];
			@Pc(260) int local260 = 0;
			for (@Pc(262) int local262 = 0; local262 < 12; local262++) {
				local53 = this.anIntArray522[local262];
				@Pc(288) Class111 local288;
				if ((local53 & 0x40000000) != 0) {
					local288 = arg2.method5040(local53 & 0x3FFFFFFF).method3399(this.aBoolean604);
					if (local288 != null) {
						local258[local260++] = local288;
					}
				} else if ((local53 & Integer.MIN_VALUE) != 0) {
					local288 = Static267.method4684(local53 & 0x3FFFFFFF).method5807();
					if (local288 != null) {
						local258[local260++] = local288;
					}
				}
			}
			@Pc(323) int local323 = local24 | 0x2000;
			@Pc(329) Class111 local329 = new Class111(local258, local260);
			local166 = arg5.method3667(local329, local323, Static6.anInt88, 64, 768);
			for (local108 = 0; local108 < 5; local108++) {
				if (Static26.aShortArrayArray12[local108].length > this.anIntArray521[local108]) {
					local166.method5850(Static298.aShortArray101[local108], Static26.aShortArrayArray12[local108][this.anIntArray521[local108]]);
				}
				if (Static103.aShortArrayArray11[local108].length > this.anIntArray521[local108]) {
					local166.method5850(Static195.aShortArray78[local108], Static103.aShortArrayArray11[local108][this.anIntArray521[local108]]);
				}
			}
			local166.method5854(local24);
			@Pc(398) Class107 local398 = Static258.aClass107_38;
			synchronized (Static258.aClass107_38) {
				Static258.aClass107_38.method3018(this.aLong217, local166);
			}
		}
		if (arg0 == null) {
			return local166;
		} else {
			local166.method5810((byte) 4, local24, true);
			return arg0.method2272(local166, arg3, arg1, 1024, arg4);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([IIII[IZ)V")
	public void method5671(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		this.anIntArray522 = arg3;
		this.anInt6784 = arg2;
		if (arg1 != this.anInt6786) {
			this.anInt6786 = arg1;
			this.anIntArrayArray56 = null;
		}
		this.aBoolean604 = arg4;
		this.anIntArray521 = arg0;
		this.method5676();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([Lclient!vs;IZLclient!gr;Lclient!sn;Lclient!dr;IIIILclient!gr;III)Lclient!wp;")
	public Class49 method5674(@OriginalArg(0) Class212[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class184 arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class84 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		if (this.anInt6784 != -1) {
			return Static90.method1809(this.anInt6784).method4123(arg1, arg11, arg2, arg7, arg4, arg9, arg6, arg8, arg0, arg10, arg5);
		}
		@Pc(30) int local30 = arg6;
		@Pc(33) long local33 = this.aLong217;
		@Pc(36) int[] local36 = this.anIntArray522;
		if (arg2 != null && (arg2.anInt2447 >= 0 || arg2.anInt2450 >= 0)) {
			local36 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local36[local49] = this.anIntArray522[local49];
			}
			if (arg2.anInt2447 >= 0) {
				if (arg2.anInt2447 == 65535) {
					local36[5] = 0;
					local33 ^= 0xFFFFFFFF00000000L;
				} else {
					local36[5] = arg2.anInt2447 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg2.anInt2450 >= 0) {
				if (arg2.anInt2450 == 65535) {
					local36[3] = 0;
					local33 ^= 0xFFFFFFFFL;
				} else {
					local36[3] = arg2.anInt2450 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(128) boolean local128 = false;
		@Pc(130) boolean local130 = false;
		@Pc(138) boolean local138 = arg2 != null || arg8 != null;
		@Pc(145) int local145 = arg0 == null ? 0 : arg0.length;
		@Pc(178) int local178;
		@Pc(183) int local183;
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			Static21.aClass2_Sub9_Sub2Array8[local147] = null;
			if (arg0[local147] != null) {
				@Pc(164) Class84 local164 = Static91.method1822(arg0[local147].anInt6755);
				if (local164.anIntArray197 != null) {
					Static135.aClass84Array1[local147] = local164;
					local138 = true;
					local178 = arg0[local147].anInt6752;
					local183 = arg0[local147].anInt6757;
					@Pc(188) int local188 = local164.anIntArray197[local178];
					Static21.aClass2_Sub9_Sub2Array8[local147] = Static276.method4760(local188 >>> 16);
					@Pc(200) int local200 = local188 & 0xFFFF;
					Static316.anIntArray486[local147] = local200;
					if (Static21.aClass2_Sub9_Sub2Array8[local147] != null) {
						local130 |= Static21.aClass2_Sub9_Sub2Array8[local147].method1315(local200);
						local128 |= Static21.aClass2_Sub9_Sub2Array8[local147].method1314(local200);
					}
					if ((local164.aBoolean235 || Static263.aBoolean483) && local183 != -1 && local164.anIntArray197.length > local183) {
						Static247.anIntArray403[local147] = local164.anIntArray198[local178];
						Static276.anIntArray440[local147] = arg0[local147].anInt6756;
						@Pc(280) int local280 = local164.anIntArray197[local183];
						Static130.aClass2_Sub9_Sub2Array7[local147] = Static276.method4760(local280 >>> 16);
						@Pc(292) int local292 = local280 & 0xFFFF;
						Static19.anIntArray39[local147] = local292;
						if (Static130.aClass2_Sub9_Sub2Array7[local147] != null) {
							local130 |= Static130.aClass2_Sub9_Sub2Array7[local147].method1315(local292);
							local128 |= Static130.aClass2_Sub9_Sub2Array7[local147].method1314(local292);
						}
					} else {
						Static247.anIntArray403[local147] = 0;
						Static276.anIntArray440[local147] = 0;
						Static130.aClass2_Sub9_Sub2Array7[local147] = null;
						Static19.anIntArray39[local147] = -1;
					}
				}
			}
		}
		@Pc(324) int local324 = -1;
		local178 = -1;
		local183 = 0;
		@Pc(330) Class2_Sub9_Sub2 local330 = null;
		@Pc(332) Class2_Sub9_Sub2 local332 = null;
		@Pc(334) int local334 = -1;
		@Pc(341) int local341 = -1;
		@Pc(343) int local343 = 0;
		@Pc(345) Class2_Sub9_Sub2 local345 = null;
		@Pc(347) Class2_Sub9_Sub2 local347 = null;
		if (local138) {
			@Pc(360) int local360;
			@Pc(412) int local412;
			if (arg2 != null) {
				local324 = arg2.anIntArray197[arg5];
				local360 = local324 >>> 16;
				local324 &= 0xFFFF;
				local330 = Static276.method4760(local360);
				if (local330 != null) {
					local130 |= local330.method1315(local324);
					local128 |= local330.method1314(local324);
				}
				if ((arg2.aBoolean235 || Static263.aBoolean483) && arg10 != -1 && arg10 < arg2.anIntArray197.length) {
					local178 = arg2.anIntArray197[arg10];
					local183 = arg2.anIntArray198[arg5];
					local412 = local178 >>> 16;
					local332 = local412 == local360 ? local330 : Static276.method4760(local412);
					local178 &= 0xFFFF;
					if (local332 != null) {
						local130 |= local332.method1315(local178);
						local128 |= local332.method1314(local178);
					}
				}
			}
			local30 = arg6 | 0x20;
			if (arg8 != null) {
				local334 = arg8.anIntArray197[arg9];
				local360 = local334 >>> 16;
				local345 = Static276.method4760(local360);
				local334 &= 0xFFFF;
				if (local345 != null) {
					local130 |= local345.method1315(local334);
					local128 |= local345.method1314(local334);
				}
				if ((arg8.aBoolean235 || Static263.aBoolean483) && arg11 != -1 && arg11 < arg8.anIntArray197.length) {
					local343 = arg8.anIntArray198[arg9];
					local341 = arg8.anIntArray197[arg11];
					local412 = local341 >>> 16;
					local341 &= 0xFFFF;
					local347 = local360 == local412 ? local345 : Static276.method4760(local412);
					if (local347 != null) {
						local130 |= local347.method1315(local341);
						local128 |= local347.method1314(local341);
					}
				}
			}
			if (local130) {
				local30 |= 0x80;
			}
			if (local128) {
				local30 |= 0x100;
			}
		}
		@Pc(563) Class107 local563 = Static217.aClass107_29;
		@Pc(571) Class49 local571;
		synchronized (Static217.aClass107_29) {
			local571 = (Class49) Static217.aClass107_29.method3021(local33);
		}
		@Pc(579) Class142 local579 = null;
		if (this.anInt6786 != -1) {
			local579 = Static64.method1322(this.anInt6786);
		}
		@Pc(621) int local621;
		@Pc(627) int local627;
		if (local571 == null || arg4.method3686(local571.method5820(), local30) != 0 || local579 != null && local579.anIntArrayArray43 != null && this.anIntArrayArray56 == null) {
			if (local571 != null) {
				local30 = arg4.method3685(local30, local571.method5820());
			}
			@Pc(619) boolean local619 = false;
			local621 = 0;
			while (true) {
				if (local621 >= 12) {
					if (local619) {
						if (this.aLong216 != -1L) {
							@Pc(681) Class107 local681 = Static217.aClass107_29;
							synchronized (Static217.aClass107_29) {
								local571 = (Class49) Static217.aClass107_29.method3021(this.aLong216);
							}
						}
						if (local571 == null || arg4.method3686(local571.method5820(), local30) != 0 || local579 != null && local579.anIntArrayArray43 != null && this.anIntArrayArray56 == null) {
							return null;
						}
					} else {
						@Pc(720) Class111[] local720 = new Class111[12];
						@Pc(728) int local728;
						for (@Pc(722) int local722 = 0; local722 < 12; local722++) {
							local728 = local36[local722];
							@Pc(747) Class111 local747;
							if ((local728 & 0x40000000) != 0) {
								local747 = arg3.method5040(local728 & 0x3FFFFFFF).method3404(this.aBoolean604);
								if (local747 != null) {
									local720[local722] = local747;
								}
							} else if ((Integer.MIN_VALUE & local728) != 0) {
								local747 = Static267.method4684(local728 & 0x3FFFFFFF).method5804();
								if (local747 != null) {
									local720[local722] = local747;
								}
							}
						}
						@Pc(803) int local803;
						if (local579 != null && local579.anIntArrayArray43 != null) {
							for (local728 = 0; local728 < local579.anIntArrayArray43.length; local728++) {
								if (local579.anIntArrayArray43[local728] != null && local720[local728] != null) {
									local803 = local579.anIntArrayArray43[local728][0];
									@Pc(810) int local810 = local579.anIntArrayArray43[local728][1];
									@Pc(817) int local817 = local579.anIntArrayArray43[local728][2];
									@Pc(826) int local826 = local579.anIntArrayArray43[local728][3] << 3;
									@Pc(835) int local835 = local579.anIntArrayArray43[local728][4] << 3;
									@Pc(844) int local844 = local579.anIntArrayArray43[local728][5] << 3;
									if (this.anIntArrayArray56 == null) {
										this.anIntArrayArray56 = new int[local579.anIntArrayArray43.length][];
									}
									if (this.anIntArrayArray56[local728] == null) {
										@Pc(866) int[] local866 = this.anIntArrayArray56[local728] = new int[15];
										if (local826 == 0 && local835 == 0 && local844 == 0) {
											local866[14] = -local817;
											local866[12] = -local803;
											local866[0] = local866[4] = local866[8] = 32768;
											local866[13] = -local810;
										} else {
											@Pc(885) int local885 = Class101.anIntArray235[local826];
											@Pc(889) int local889 = Class101.anIntArray234[local826];
											@Pc(893) int local893 = Class101.anIntArray235[local835];
											@Pc(897) int local897 = Class101.anIntArray234[local835];
											@Pc(901) int local901 = Class101.anIntArray235[local844];
											@Pc(905) int local905 = Class101.anIntArray234[local844];
											@Pc(913) int local913 = local889 * local901 + 16384 >> 15;
											@Pc(921) int local921 = local905 * local889 + 16384 >> 15;
											local866[2] = local885 * local897 + 16384 >> 15;
											local866[8] = local885 * local893 + 16384 >> 15;
											local866[0] = local901 * local893 + local897 * local921 + 16384 >> 15;
											local866[5] = -local889;
											local866[4] = local901 * local885 + 16384 >> 15;
											local866[6] = local921 * local893 + local901 * -local897 + 16384 >> 15;
											local866[1] = local897 * local913 + -local905 * local893 + 16384 >> 15;
											local866[3] = local905 * local885 + 16384 >> 15;
											local866[7] = -local897 * -local905 + local893 * local913 + 16384 >> 15;
											local866[13] = -local817 * local866[7] + -local803 * local866[1] + -local810 * local866[4] + 16384 >> 15;
											local866[14] = local866[2] * -local803 + local866[5] * -local810 + -local817 * local866[8] + 16384 >> 15;
											local866[12] = local866[0] * -local803 + -local810 * local866[3] + local866[6] * -local817 + 16384 >> 15;
										}
										local866[9] = local803;
										local866[11] = local817;
										local866[10] = local810;
									}
									if (local826 != 0 || local835 != 0 || local844 != 0) {
										local720[local728].method3248(local835, local844, local826);
									}
									if (local803 != 0 || local810 != 0 || local817 != 0) {
										local720[local728].method3250(local803, local810, local817);
									}
								}
							}
						}
						@Pc(1201) int local1201 = local30 | 0x2000;
						@Pc(1208) Class111 local1208 = new Class111(local720, local720.length);
						local571 = arg4.method3667(local1208, local1201, Static6.anInt88, 64, 850);
						for (local803 = 0; local803 < 5; local803++) {
							if (Static26.aShortArrayArray12[local803].length > this.anIntArray521[local803]) {
								local571.method5850(Static298.aShortArray101[local803], Static26.aShortArrayArray12[local803][this.anIntArray521[local803]]);
							}
							if (this.anIntArray521[local803] < Static103.aShortArrayArray11[local803].length) {
								local571.method5850(Static195.aShortArray78[local803], Static103.aShortArrayArray11[local803][this.anIntArray521[local803]]);
							}
						}
						local571.method5854(local30);
						@Pc(1275) Class107 local1275 = Static217.aClass107_29;
						synchronized (Static217.aClass107_29) {
							Static217.aClass107_29.method3018(local33, local571);
						}
						this.aLong216 = local33;
					}
					break;
				}
				local627 = local36[local621];
				if ((local627 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local627) != 0 && !Static267.method4684(local627 & 0x3FFFFFFF).method5801()) {
						local619 = true;
					}
				} else if (!arg3.method5040(local627 & 0x3FFFFFFF).method3408(this.aBoolean604)) {
					local619 = true;
				}
				local621++;
			}
		}
		@Pc(1297) Class49 local1297 = local571.method5810((byte) 4, local30, true);
		if (!local138) {
			return local1297;
		}
		@Pc(1303) int local1303 = 0;
		local621 = 1;
		while (local1303 < local145) {
			if (Static21.aClass2_Sub9_Sub2Array8[local1303] != null) {
				local1297.method5813(Static247.anIntArray403[local1303], Static130.aClass2_Sub9_Sub2Array7[local1303], Static21.aClass2_Sub9_Sub2Array8[local1303], this.anIntArrayArray56 == null ? null : this.anIntArrayArray56[local1303], Static316.anIntArray486[local1303], Static19.anIntArray39[local1303], local621, false, Static276.anIntArray440[local1303] - 1);
			}
			local1303++;
			local621 <<= 0x1;
		}
		if (local330 != null && local345 != null) {
			local1297.method5839(local341, local345, false, local334, local343, local347, local324, local330, local178, local183, arg1 - 1, arg2.aBooleanArray8, local332, arg7 - 1);
		} else if (local330 != null) {
			local1297.method5848(local183, local178, 0, local332, arg7 - 1, local330, false, local324);
		} else if (local345 != null) {
			local1297.method5848(local343, local341, 0, local347, arg1 - 1, local345, false, local334);
		}
		for (local627 = 0; local627 < local145; local627++) {
			Static21.aClass2_Sub9_Sub2Array8[local627] = null;
			Static130.aClass2_Sub9_Sub2Array7[local627] = null;
			Static135.aClass84Array1[local627] = null;
		}
		return local1297;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	private void method5676() {
		this.aLong217 = -1L;
		@Pc(10) long[] local10 = Class117.aLongArray5;
		this.aLong217 = this.aLong217 >>> 8 ^ local10[(int) ((this.aLong217 ^ (long) (this.anInt6786 >> 8)) & 0xFFL)];
		this.aLong217 = local10[(int) (((long) this.anInt6786 ^ this.aLong217) & 0xFFL)] ^ this.aLong217 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong217 = this.aLong217 >>> 8 ^ local10[(int) (((long) (this.anIntArray522[local50] >> 24) ^ this.aLong217) & 0xFFL)];
			this.aLong217 = local10[(int) ((this.aLong217 ^ (long) (this.anIntArray522[local50] >> 16)) & 0xFFL)] ^ this.aLong217 >>> 8;
			this.aLong217 = local10[(int) (((long) (this.anIntArray522[local50] >> 8) ^ this.aLong217) & 0xFFL)] ^ this.aLong217 >>> 8;
			this.aLong217 = this.aLong217 >>> 8 ^ local10[(int) (((long) this.anIntArray522[local50] ^ this.aLong217) & 0xFFL)];
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong217 = this.aLong217 >>> 8 ^ local10[(int) (((long) this.anIntArray521[local146] ^ this.aLong217) & 0xFFL)];
		}
		this.aLong217 = local10[(int) ((this.aLong217 ^ (long) (this.aBoolean604 ? 1 : 0)) & 0xFFL)] ^ this.aLong217 >>> 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray521[arg0] = arg1;
		this.method5676();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public void method5678(@OriginalArg(0) boolean arg0) {
		this.aBoolean604 = arg0;
		this.method5676();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!dr;IBIIIILclient!gr;I)Lclient!wp;")
	public Class49 method5682(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class84 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg6.anIntArray197[arg7];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) Class2_Sub9_Sub2 local40 = Static276.method4760(local36);
			@Pc(44) int local44 = local26 & 0xFFFF;
			if (local40 != null) {
				local13 = local40.method1315(local44) | false;
				local11 = local40.method1314(local44) | false;
				local15 = arg6.aBoolean233 | false;
			}
			if ((arg6.aBoolean235 || Static263.aBoolean483) && arg0 != -1 && arg0 < arg6.anIntArray197.length) {
				@Pc(87) int local87 = arg6.anIntArray197[arg0];
				@Pc(91) int local91 = local87 >>> 16;
				@Pc(95) int local95 = local87 & 0xFFFF;
				@Pc(108) Class2_Sub9_Sub2 local108;
				if (local91 == local36) {
					local108 = local40;
				} else {
					local108 = Static276.method4760(local95 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method1315(local95);
					local11 |= local108.method1314(local95);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(163) long local163 = (long) arg4 | (long) (arg5 << 16) | (long) arg3 << 32;
		@Pc(165) Class107 local165 = Static258.aClass107_38;
		@Pc(173) Class49 local173;
		synchronized (Static258.aClass107_38) {
			local173 = (Class49) Static258.aClass107_38.method3021(local163);
		}
		if (local173 == null || arg1.method3686(local173.method5820(), local7) != 0) {
			if (local173 != null) {
				local7 = arg1.method3685(local7, local173.method5820());
			}
			@Pc(200) Class111[] local200 = new Class111[3];
			@Pc(202) int local202 = 0;
			if (!Static267.method4684(arg4).method5803() || !Static267.method4684(arg5).method5803() || !Static267.method4684(arg3).method5803()) {
				return null;
			}
			@Pc(226) Class111 local226 = Static267.method4684(arg4).method5807();
			if (local226 != null) {
				local202++;
				local200[0] = local226;
			}
			local226 = Static267.method4684(arg5).method5807();
			if (local226 != null) {
				local200[local202++] = local226;
			}
			local226 = Static267.method4684(arg3).method5807();
			if (local226 != null) {
				local200[local202++] = local226;
			}
			local26 = local7 | 0x2000;
			local226 = new Class111(local200, local202);
			local173 = arg1.method3667(local226, local26, Static6.anInt88, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static26.aShortArrayArray12[local36].length > this.anIntArray521[local36]) {
					local173.method5850(Static298.aShortArray101[local36], Static26.aShortArrayArray12[local36][this.anIntArray521[local36]]);
				}
				if (Static103.aShortArrayArray11[local36].length > this.anIntArray521[local36]) {
					local173.method5850(Static195.aShortArray78[local36], Static103.aShortArrayArray11[local36][this.anIntArray521[local36]]);
				}
			}
			local173.method5854(local7);
			@Pc(336) Class107 local336 = Static258.aClass107_38;
			synchronized (Static258.aClass107_38) {
				Static258.aClass107_38.method3018(local163, local173);
			}
		}
		if (arg6 == null) {
			return local173;
		} else {
			local173 = local173.method5810((byte) 4, local7, true);
			return arg6.method2272(local173, arg7, arg0, 1024, arg2);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
	public void method5683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static81.anIntArray128[arg0];
		if (this.anIntArray522[local12] != 0 && Static267.method4684(arg1) != null) {
			this.anIntArray522[local12] = arg1 | Integer.MIN_VALUE;
			this.method5676();
		}
	}
}
