import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class148 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
	public boolean aBoolean404;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public int anInt4772 = -1;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIILclient!vm;Lclient!lb;IB)Lclient!jn;")
	public Class5 method3914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) Class116 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local30 = arg6.anIntArray330[arg3];
			local36 = local30 >>> 16;
			@Pc(40) int local40 = local30 & 0xFFFF;
			@Pc(46) Class4_Sub1_Sub16 local46 = Static194.method3524(local36);
			if (local46 != null) {
				local13 = local46.method3937(local40) | false;
				local11 = local46.method3938(local40) | false;
				local15 = arg6.aBoolean311 | false;
			}
			if ((arg6.aBoolean310 || Static199.aBoolean564) && arg1 != -1 && arg1 < arg6.anIntArray330.length) {
				@Pc(91) int local91 = arg6.anIntArray330[arg1];
				@Pc(95) int local95 = local91 >>> 16;
				@Pc(99) int local99 = local91 & 0xFFFF;
				@Pc(108) Class4_Sub1_Sub16 local108;
				if (local95 == local36) {
					local108 = local46;
				} else {
					local108 = Static194.method3524(local99 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method3937(local99);
					local11 |= local108.method3938(local99);
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
		@Pc(158) long local158 = (long) (arg4 << 16) | (long) arg0 << 32 | (long) arg2;
		@Pc(160) Class154 local160 = Static108.aClass154_36;
		@Pc(170) Class5 local170;
		synchronized (Static108.aClass154_36) {
			local170 = (Class5) Static108.aClass154_36.method4222(local158);
		}
		if (local170 == null || arg5.method4501(local170.method3992(), local7) != 0) {
			if (local170 != null) {
				local7 = arg5.method4477(local7, local170.method3992());
			}
			@Pc(197) Class153[] local197 = new Class153[3];
			@Pc(199) int local199 = 0;
			if (!Static247.method4272(arg2).method4365() || !Static247.method4272(arg4).method4365() || !Static247.method4272(arg0).method4365()) {
				return null;
			}
			@Pc(229) Class153 local229 = Static247.method4272(arg2).method4371();
			if (local229 != null) {
				local199++;
				local197[0] = local229;
			}
			local229 = Static247.method4272(arg4).method4371();
			if (local229 != null) {
				local197[local199++] = local229;
			}
			local229 = Static247.method4272(arg0).method4371();
			if (local229 != null) {
				local197[local199++] = local229;
			}
			local229 = new Class153(local197, local199);
			local30 = local7 | 0x2000;
			local170 = arg5.method4513(local229, local30, Static288.anInt5842, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray390[local36] < Static335.aShortArrayArray12[local36].length) {
					local170.method4022(Static218.aShortArray72[local36], Static335.aShortArrayArray12[local36][this.anIntArray390[local36]]);
				}
				if (Static101.aShortArrayArray8[local36].length > this.anIntArray390[local36]) {
					local170.method4022(Static311.aShortArray112[local36], Static101.aShortArrayArray8[local36][this.anIntArray390[local36]]);
				}
			}
			local170.method3988(local7);
			@Pc(343) Class154 local343 = Static108.aClass154_36;
			synchronized (Static108.aClass154_36) {
				Static108.aClass154_36.method4221(local158, local170);
			}
		}
		if (arg6 == null) {
			return local170;
		} else {
			local170 = local170.method4018((byte) 1, local7, true);
			return arg6.method3175(local170, 1024, arg1, arg3, arg7);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	public void method3915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray390[arg1] = arg0;
		this.method3921();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!vm;IIIILclient!lb;I)Lclient!jn;")
	public Class5 method3916(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class116 arg4) {
		if (this.anInt4772 != -1) {
			return Static165.method2927(this.anInt4772).method737(arg0, arg1, arg3, arg2, arg4);
		}
		@Pc(25) int local25 = 1024;
		@Pc(33) boolean local33;
		@Pc(46) int local46;
		@Pc(106) int local106;
		@Pc(54) int local54;
		@Pc(110) int local110;
		if (arg4 != null) {
			@Pc(29) boolean local29 = false;
			@Pc(31) boolean local31 = false;
			local33 = false;
			local46 = arg4.anIntArray330[arg1];
			local25 = 1056;
			local54 = local46 >>> 16;
			@Pc(58) int local58 = local46 & 0xFFFF;
			@Pc(62) Class4_Sub1_Sub16 local62 = Static194.method3524(local54);
			if (local62 != null) {
				local31 = local62.method3937(local58) | false;
				local29 = local62.method3938(local58) | false;
				local33 = arg4.aBoolean311 | false;
			}
			if ((arg4.aBoolean310 || Static199.aBoolean564) && arg2 != -1 && arg2 < arg4.anIntArray330.length) {
				local106 = arg4.anIntArray330[arg2];
				local110 = local106 >>> 16;
				@Pc(114) int local114 = local106 & 0xFFFF;
				@Pc(123) Class4_Sub1_Sub16 local123;
				if (local54 == local110) {
					local123 = local62;
				} else {
					local123 = Static194.method3524(local114 >>> 16);
				}
				if (local123 != null) {
					local31 |= local123.method3937(local114);
					local29 |= local123.method3938(local114);
				}
			}
			if (local31) {
				local25 = 1184;
			}
			if (local29) {
				local25 |= 0x100;
			}
			if (local33) {
				local25 |= 0x200;
			}
		}
		@Pc(166) Class154 local166 = Static108.aClass154_36;
		@Pc(183) Class5 local183;
		synchronized (Static108.aClass154_36) {
			local183 = (Class5) Static108.aClass154_36.method4222(this.aLong172);
		}
		if (local183 == null || arg0.method4501(local183.method3992(), local25) != 0) {
			if (local183 != null) {
				local25 = arg0.method4477(local25, local183.method3992());
			}
			local33 = false;
			for (local46 = 0; local46 < 12; local46++) {
				local106 = this.anIntArray391[local46];
				if ((local106 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local106) != 0 && !Static247.method4272(local106 & 0x3FFFFFFF).method4365()) {
						local33 = true;
					}
				} else if (!Static247.method4270(local106 & 0x3FFFFFFF).method3730(this.aBoolean404)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(269) Class153[] local269 = new Class153[12];
			@Pc(271) int local271 = 0;
			for (@Pc(273) int local273 = 0; local273 < 12; local273++) {
				local54 = this.anIntArray391[local273];
				@Pc(294) Class153 local294;
				if ((local54 & 0x40000000) != 0) {
					local294 = Static247.method4270(local54 & 0x3FFFFFFF).method3719(this.aBoolean404);
					if (local294 != null) {
						local269[local271++] = local294;
					}
				} else if ((Integer.MIN_VALUE & local54) != 0) {
					local294 = Static247.method4272(local54 & 0x3FFFFFFF).method4371();
					if (local294 != null) {
						local269[local271++] = local294;
					}
				}
			}
			@Pc(335) Class153 local335 = new Class153(local269, local271);
			@Pc(339) int local339 = local25 | 0x2000;
			local183 = arg0.method4513(local335, local339, Static288.anInt5842, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (this.anIntArray390[local110] < Static335.aShortArrayArray12[local110].length) {
					local183.method4022(Static218.aShortArray72[local110], Static335.aShortArrayArray12[local110][this.anIntArray390[local110]]);
				}
				if (this.anIntArray390[local110] < Static101.aShortArrayArray8[local110].length) {
					local183.method4022(Static311.aShortArray112[local110], Static101.aShortArrayArray8[local110][this.anIntArray390[local110]]);
				}
			}
			local183.method3988(local25);
			@Pc(404) Class154 local404 = Static108.aClass154_36;
			synchronized (Static108.aClass154_36) {
				Static108.aClass154_36.method4221(this.aLong172, local183);
			}
		}
		if (arg4 == null) {
			return local183;
		} else {
			local183.method4018((byte) 1, local25, true);
			return arg4.method3175(local183, 1024, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLclient!lb;IIILclient!vm;Lclient!lb;[Lclient!sc;IIII)Lclient!jn;")
	public Class5 method3919(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) Class116 arg6, @OriginalArg(8) Class186[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt4772 != -1) {
			return Static165.method2927(this.anInt4772).method745(arg2, arg10, arg5, arg1, arg8, arg3, arg9, arg0, arg4, arg7, arg6);
		}
		@Pc(31) int local31 = arg10;
		@Pc(34) long local34 = this.aLong172;
		@Pc(37) int[] local37 = this.anIntArray391;
		if (arg1 != null && (arg1.anInt3752 >= 0 || arg1.anInt3751 >= 0)) {
			local37 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local37[local53] = this.anIntArray391[local53];
			}
			if (arg1.anInt3752 >= 0) {
				if (arg1.anInt3752 == 65535) {
					local34 ^= 0xFFFFFFFF00000000L;
					local37[5] = 0;
				} else {
					local37[5] = arg1.anInt3752 | 0x40000000;
					local34 ^= (long) local37[5] << 32;
				}
			}
			if (arg1.anInt3751 >= 0) {
				if (arg1.anInt3751 == 65535) {
					local37[3] = 0;
					local34 ^= 0xFFFFFFFFL;
				} else {
					local37[3] = arg1.anInt3751 | 0x40000000;
					local34 ^= local37[3];
				}
			}
		}
		@Pc(134) boolean local134 = false;
		@Pc(136) boolean local136 = false;
		@Pc(144) boolean local144 = arg1 != null || arg6 != null;
		@Pc(151) int local151 = arg7 == null ? 0 : arg7.length;
		@Pc(184) int local184;
		@Pc(189) int local189;
		for (@Pc(153) int local153 = 0; local153 < local151; local153++) {
			Static30.aClass4_Sub1_Sub16Array1[local153] = null;
			if (arg7[local153] != null) {
				@Pc(170) Class116 local170 = Static340.method5560(arg7[local153].anInt5820);
				if (local170.anIntArray330 != null) {
					local144 = true;
					Static171.aClass116Array2[local153] = local170;
					local184 = arg7[local153].anInt5819;
					local189 = arg7[local153].anInt5818;
					@Pc(194) int local194 = local170.anIntArray330[local184];
					Static30.aClass4_Sub1_Sub16Array1[local153] = Static194.method3524(local194 >>> 16);
					@Pc(206) int local206 = local194 & 0xFFFF;
					Static295.anIntArray490[local153] = local206;
					if (Static30.aClass4_Sub1_Sub16Array1[local153] != null) {
						local136 |= Static30.aClass4_Sub1_Sub16Array1[local153].method3937(local206);
						local134 |= Static30.aClass4_Sub1_Sub16Array1[local153].method3938(local206);
					}
					if ((local170.aBoolean310 || Static199.aBoolean564) && local189 != -1 && local170.anIntArray330.length > local189) {
						Static114.anIntArray237[local153] = local170.anIntArray329[local184];
						Static96.anIntArray498[local153] = arg7[local153].anInt5825;
						@Pc(265) int local265 = local170.anIntArray330[local189];
						Static39.aClass4_Sub1_Sub16Array2[local153] = Static194.method3524(local265 >>> 16);
						@Pc(277) int local277 = local265 & 0xFFFF;
						Static52.anIntArray126[local153] = local277;
						if (Static39.aClass4_Sub1_Sub16Array2[local153] != null) {
							local136 |= Static39.aClass4_Sub1_Sub16Array2[local153].method3937(local277);
							local134 |= Static39.aClass4_Sub1_Sub16Array2[local153].method3938(local277);
						}
					} else {
						Static114.anIntArray237[local153] = 0;
						Static96.anIntArray498[local153] = 0;
						Static39.aClass4_Sub1_Sub16Array2[local153] = null;
						Static52.anIntArray126[local153] = -1;
					}
				}
			}
		}
		@Pc(331) int local331 = -1;
		local184 = -1;
		local189 = 0;
		@Pc(337) Class4_Sub1_Sub16 local337 = null;
		@Pc(339) Class4_Sub1_Sub16 local339 = null;
		@Pc(341) int local341 = -1;
		@Pc(343) int local343 = -1;
		@Pc(345) int local345 = 0;
		@Pc(347) Class4_Sub1_Sub16 local347 = null;
		@Pc(349) Class4_Sub1_Sub16 local349 = null;
		if (local144) {
			@Pc(362) int local362;
			@Pc(418) int local418;
			if (arg1 != null) {
				local331 = arg1.anIntArray330[arg0];
				local362 = local331 >>> 16;
				local331 &= 0xFFFF;
				local337 = Static194.method3524(local362);
				if (local337 != null) {
					local136 |= local337.method3937(local331);
					local134 |= local337.method3938(local331);
				}
				if ((arg1.aBoolean310 || Static199.aBoolean564) && arg4 != -1 && arg4 < arg1.anIntArray330.length) {
					local184 = arg1.anIntArray330[arg4];
					local189 = arg1.anIntArray329[arg0];
					local418 = local184 >>> 16;
					local184 &= 0xFFFF;
					if (local362 == local418) {
						local339 = local337;
					} else {
						local339 = Static194.method3524(local184 >>> 16);
					}
					if (local339 != null) {
						local136 |= local339.method3937(local184);
						local134 |= local339.method3938(local184);
					}
				}
			}
			local31 = arg10 | 0x20;
			if (arg6 != null) {
				local341 = arg6.anIntArray330[arg3];
				local362 = local341 >>> 16;
				local347 = Static194.method3524(local362);
				local341 &= 0xFFFF;
				if (local347 != null) {
					local136 |= local347.method3937(local341);
					local134 |= local347.method3938(local341);
				}
				if ((arg6.aBoolean310 || Static199.aBoolean564) && arg2 != -1 && arg2 < arg6.anIntArray330.length) {
					local343 = arg6.anIntArray330[arg2];
					local345 = arg6.anIntArray329[arg3];
					local418 = local343 >>> 16;
					local343 &= 0xFFFF;
					if (local362 == local418) {
						local349 = local347;
					} else {
						local349 = Static194.method3524(local343 >>> 16);
					}
					if (local349 != null) {
						local136 |= local349.method3937(local343);
						local134 |= local349.method3938(local343);
					}
				}
			}
			if (local136) {
				local31 |= 0x80;
			}
			if (local134) {
				local31 |= 0x100;
			}
		}
		@Pc(570) Class154 local570 = Static202.aClass154_69;
		@Pc(578) Class5 local578;
		synchronized (Static202.aClass154_69) {
			local578 = (Class5) Static202.aClass154_69.method4222(local34);
		}
		@Pc(586) Class10 local586 = null;
		if (this.anInt4773 != -1) {
			local586 = Static354.method4067(this.anInt4773);
		}
		@Pc(631) int local631;
		@Pc(637) int local637;
		if (local578 == null || arg5.method4501(local578.method3992(), local31) != 0 || local586 != null && local586.anIntArrayArray6 != null && this.anIntArrayArray43 == null) {
			if (local578 != null) {
				local31 = arg5.method4477(local31, local578.method3992());
			}
			@Pc(629) boolean local629 = false;
			local631 = 0;
			while (true) {
				if (local631 >= 12) {
					if (local629) {
						if (this.aLong171 != -1L) {
							@Pc(1275) Class154 local1275 = Static202.aClass154_69;
							synchronized (Static202.aClass154_69) {
								local578 = (Class5) Static202.aClass154_69.method4222(this.aLong171);
							}
						}
						if (local578 == null || arg5.method4501(local578.method3992(), local31) != 0 || local586 != null && local586.anIntArrayArray6 != null && this.anIntArrayArray43 == null) {
							return null;
						}
					} else {
						@Pc(681) Class153[] local681 = new Class153[12];
						@Pc(689) int local689;
						for (@Pc(683) int local683 = 0; local683 < 12; local683++) {
							local689 = local37[local683];
							@Pc(713) Class153 local713;
							if ((local689 & 0x40000000) != 0) {
								local713 = Static247.method4270(local689 & 0x3FFFFFFF).method3725(this.aBoolean404);
								if (local713 != null) {
									local681[local683] = local713;
								}
							} else if ((Integer.MIN_VALUE & local689) != 0) {
								local713 = Static247.method4272(local689 & 0x3FFFFFFF).method4369();
								if (local713 != null) {
									local681[local683] = local713;
								}
							}
						}
						@Pc(768) int local768;
						if (local586 != null && local586.anIntArrayArray6 != null) {
							for (local689 = 0; local689 < local586.anIntArrayArray6.length; local689++) {
								if (local586.anIntArrayArray6[local689] != null && local681[local689] != null) {
									local768 = local586.anIntArrayArray6[local689][0];
									@Pc(775) int local775 = local586.anIntArrayArray6[local689][1];
									@Pc(782) int local782 = local586.anIntArrayArray6[local689][2];
									@Pc(791) int local791 = local586.anIntArrayArray6[local689][3] << 3;
									@Pc(800) int local800 = local586.anIntArrayArray6[local689][4] << 3;
									@Pc(809) int local809 = local586.anIntArrayArray6[local689][5] << 3;
									if (this.anIntArrayArray43 == null) {
										this.anIntArrayArray43 = new int[local586.anIntArrayArray6.length][];
									}
									if (this.anIntArrayArray43[local689] == null) {
										@Pc(831) int[] local831 = this.anIntArrayArray43[local689] = new int[15];
										if (local791 == 0 && local800 == 0 && local809 == 0) {
											local831[13] = -local775;
											local831[0] = local831[4] = local831[8] = 32768;
											local831[14] = -local782;
											local831[12] = -local768;
										} else {
											@Pc(876) int local876 = Class4_Sub4_Sub25.anIntArray383[local791];
											@Pc(880) int local880 = Class4_Sub4_Sub25.anIntArray384[local791];
											@Pc(884) int local884 = Class4_Sub4_Sub25.anIntArray383[local800];
											@Pc(888) int local888 = Class4_Sub4_Sub25.anIntArray384[local800];
											@Pc(892) int local892 = Class4_Sub4_Sub25.anIntArray383[local809];
											@Pc(896) int local896 = Class4_Sub4_Sub25.anIntArray384[local809];
											@Pc(904) int local904 = local892 * local880 + 16384 >> 15;
											@Pc(912) int local912 = local896 * local880 + 16384 >> 15;
											local831[5] = -local880;
											local831[6] = local892 * -local888 + local884 * local912 + 16384 >> 15;
											local831[7] = -local888 * -local896 + local884 * local904 + 16384 >> 15;
											local831[0] = local912 * local888 + local884 * local892 + 16384 >> 15;
											local831[8] = local876 * local884 + 16384 >> 15;
											local831[1] = local904 * local888 + local884 * -local896 + 16384 >> 15;
											local831[3] = local896 * local876 + 16384 >> 15;
											local831[4] = local892 * local876 + 16384 >> 15;
											local831[2] = local888 * local876 + 16384 >> 15;
											local831[14] = -local768 * local831[2] + -local775 * local831[5] + local831[8] * -local782 + 16384 >> 15;
											local831[13] = local831[4] * -local775 + -local768 * local831[1] + -local782 * local831[7] + 16384 >> 15;
											local831[12] = -local775 * local831[3] + -local768 * local831[0] + -local782 * local831[6] + 16384 >> 15;
										}
										local831[10] = local775;
										local831[9] = local768;
										local831[11] = local782;
									}
									if (local791 != 0 || local800 != 0 || local809 != 0) {
										local681[local689].method4166(local791, local809, local800);
									}
									if (local768 != 0 || local775 != 0 || local782 != 0) {
										local681[local689].method4162(local782, local775, local768);
									}
								}
							}
						}
						@Pc(1166) int local1166 = local31 | 0x2000;
						@Pc(1173) Class153 local1173 = new Class153(local681, local681.length);
						local578 = arg5.method4513(local1173, local1166, Static288.anInt5842, 64, 850);
						for (local768 = 0; local768 < 5; local768++) {
							if (this.anIntArray390[local768] < Static335.aShortArrayArray12[local768].length) {
								local578.method4022(Static218.aShortArray72[local768], Static335.aShortArrayArray12[local768][this.anIntArray390[local768]]);
							}
							if (Static101.aShortArrayArray8[local768].length > this.anIntArray390[local768]) {
								local578.method4022(Static311.aShortArray112[local768], Static101.aShortArrayArray8[local768][this.anIntArray390[local768]]);
							}
						}
						local578.method3988(local31);
						@Pc(1248) Class154 local1248 = Static202.aClass154_69;
						synchronized (Static202.aClass154_69) {
							Static202.aClass154_69.method4221(local34, local578);
						}
						this.aLong171 = local34;
					}
					break;
				}
				local637 = local37[local631];
				if ((local637 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local637) != 0 && !Static247.method4272(local637 & 0x3FFFFFFF).method4372()) {
						local629 = true;
					}
				} else if (!Static247.method4270(local637 & 0x3FFFFFFF).method3736(this.aBoolean404)) {
					local629 = true;
				}
				local631++;
			}
		}
		@Pc(1314) Class5 local1314 = local578.method4018((byte) 1, local31, true);
		if (!local144) {
			return local1314;
		}
		@Pc(1320) int local1320 = 0;
		local631 = 1;
		while (local1320 < local151) {
			if (Static30.aClass4_Sub1_Sub16Array1[local1320] != null) {
				local1314.method3994(Static30.aClass4_Sub1_Sub16Array1[local1320], false, Static295.anIntArray490[local1320], Static39.aClass4_Sub1_Sub16Array2[local1320], Static114.anIntArray237[local1320], local631, Static96.anIntArray498[local1320] - 1, Static52.anIntArray126[local1320], this.anIntArrayArray43 == null ? null : this.anIntArrayArray43[local1320]);
			}
			local1320++;
			local631 <<= 0x1;
		}
		if (local337 != null && local347 != null) {
			local1314.method3986(local337, local331, local184, local345, local349, arg9 - 1, local347, local189, local339, false, local341, local343, arg8 - 1, arg1.aBooleanArray21);
		} else if (local337 != null) {
			local1314.method3993(local339, arg9 - 1, local337, 0, false, local331, local189, local184);
		} else if (local347 != null) {
			local1314.method3993(local349, arg8 - 1, local347, 0, false, local341, local345, local343);
		}
		for (local637 = 0; local637 < local151; local637++) {
			Static30.aClass4_Sub1_Sub16Array1[local637] = null;
			Static39.aClass4_Sub1_Sub16Array2[local637] = null;
			Static171.aClass116Array2[local637] = null;
		}
		return local1314;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V")
	public void method3920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static72.anIntArray156[arg0];
		if (this.anIntArray391[local7] != 0 && Static247.method4272(arg1) != null) {
			this.anIntArray391[local7] = Integer.MIN_VALUE | arg1;
			this.method3921();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	private void method3921() {
		@Pc(7) long[] local7 = Class143.aLongArray4;
		this.aLong172 = -1L;
		this.aLong172 = this.aLong172 >>> 8 ^ local7[(int) (((long) (this.anInt4773 >> 8) ^ this.aLong172) & 0xFFL)];
		this.aLong172 = local7[(int) ((this.aLong172 ^ (long) this.anInt4773) & 0xFFL)] ^ this.aLong172 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong172 = this.aLong172 >>> 8 ^ local7[(int) (((long) (this.anIntArray391[local50] >> 24) ^ this.aLong172) & 0xFFL)];
			this.aLong172 = local7[(int) (((long) (this.anIntArray391[local50] >> 16) ^ this.aLong172) & 0xFFL)] ^ this.aLong172 >>> 8;
			this.aLong172 = this.aLong172 >>> 8 ^ local7[(int) (((long) (this.anIntArray391[local50] >> 8) ^ this.aLong172) & 0xFFL)];
			this.aLong172 = this.aLong172 >>> 8 ^ local7[(int) ((this.aLong172 ^ (long) this.anIntArray391[local50]) & 0xFFL)];
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong172 = local7[(int) ((this.aLong172 ^ (long) this.anIntArray390[local144]) & 0xFFL)] ^ this.aLong172 >>> 8;
		}
		this.aLong172 = this.aLong172 >>> 8 ^ local7[(int) (((long) (this.aBoolean404 ? 1 : 0) ^ this.aLong172) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V")
	public void method3923(@OriginalArg(0) boolean arg0) {
		this.aBoolean404 = arg0;
		this.method3921();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([I[IZBII)V")
	public void method3924(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 != this.anInt4773) {
			this.anInt4773 = arg4;
			this.anIntArrayArray43 = null;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static187.anInt4073; local30++) {
					@Pc(36) Class166 local36 = Static247.method4272(local30);
					if (local36 != null && !local36.aBoolean444 && (arg2 ? Static178.anIntArray516[local26] : Static332.anIntArray522[local26]) == local36.anInt5261) {
						arg1[Static72.anIntArray156[local26]] = local30 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray390 = arg0;
		this.anIntArray391 = arg1;
		this.anInt4772 = arg3;
		this.aBoolean404 = arg2;
		this.method3921();
	}
}
