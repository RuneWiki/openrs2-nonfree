import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class293 {

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "J")
	private long aLong239;

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "Z")
	public boolean aBoolean627;

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "[Lclient!uga;")
	private Class356[] aClass356Array1;

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "[I")
	private int[] anIntArray531;

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
	private int anInt8254;

	@OriginalMember(owner = "client!qha", name = "v", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
	public int anInt8252 = -1;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!c;IILclient!bn;IIILclient!vf;Lclient!ha;IZ)Lclient!ka;")
	public Class28 method6976(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class373 arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(102) int local102;
		@Pc(47) int local47;
		if (arg1 != null) {
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(24) boolean local24 = false;
			@Pc(26) boolean local26 = false;
			local7 = 2080;
			@Pc(43) int local43 = arg1.anIntArray72[arg6];
			local47 = local43 >>> 16;
			@Pc(51) int local51 = local43 & 0xFFFF;
			@Pc(56) Class3_Sub6_Sub11 local56 = arg7.method8321(local47);
			if (local56 != null) {
				local22 = local56.method4042(local51) | false;
				local20 = local56.method4044(local51) | false;
				local26 = local56.method4037(local51) | false;
				local24 = arg1.aBoolean138 | false;
			}
			if ((arg1.aBoolean139 || Static296.aBoolean620) && arg5 != -1 && arg5 < arg1.anIntArray72.length) {
				local102 = arg1.anIntArray72[arg5];
				@Pc(106) int local106 = local102 >>> 16;
				@Pc(110) int local110 = local102 & 0xFFFF;
				@Pc(115) Class3_Sub6_Sub11 local115;
				if (local106 == local47) {
					local115 = local56;
				} else {
					local115 = arg7.method8321(local110 >>> 16);
				}
				if (local115 != null) {
					local22 |= local115.method4042(local110);
					local20 |= local115.method4044(local110);
					local26 |= local115.method4037(local110);
				}
			}
			if (local22) {
				local7 = 2208;
			}
			if (local20) {
				local7 |= 0x100;
			}
			if (local24) {
				local7 |= 0x200;
			}
			if (local26) {
				local7 |= 0x400;
			}
		}
		@Pc(183) long local183 = (long) (arg3 << 16) | (long) arg0 << 32 | (long) arg2;
		@Pc(185) Class279 local185 = Static488.aClass279_44;
		@Pc(193) Class28 local193;
		synchronized (Static488.aClass279_44) {
			local193 = (Class28) Static488.aClass279_44.method6631(local183);
		}
		if (local193 == null || arg8.method8122(local193.ua(), local7) != 0) {
			if (local193 != null) {
				local7 = arg8.method8198(local7, local193.ua());
			}
			@Pc(223) Class73[] local223 = new Class73[3];
			local102 = 0;
			if (!arg4.method1378(arg2).method8568() || !arg4.method1378(arg3).method8568() || !arg4.method1378(arg0).method8568()) {
				return null;
			}
			@Pc(253) Class73 local253 = arg4.method1378(arg2).method8565();
			if (local253 != null) {
				local102++;
				local223[0] = local253;
			}
			local253 = arg4.method1378(arg3).method8565();
			if (local253 != null) {
				local223[local102++] = local253;
			}
			local253 = arg4.method1378(arg0).method8565();
			if (local253 != null) {
				local223[local102++] = local253;
			}
			@Pc(292) int local292 = local7 | 0x4000;
			local253 = new Class73(local223, local102);
			local193 = arg8.method8137(local253, local292, Static446.anInt7708, 64, 768);
			for (@Pc(308) int local308 = 0; local308 < 5; local308++) {
				for (local47 = 0; local47 < Static580.aShortArrayArrayArray3.length; local47++) {
					if (this.anIntArray533[local308] < Static580.aShortArrayArrayArray3[local47][local308].length) {
						local193.ia(Static398.aShortArrayArray16[local47][local308], Static580.aShortArrayArrayArray3[local47][local308][this.anIntArray533[local308]]);
					}
				}
			}
			local193.s(local7);
			@Pc(362) Class279 local362 = Static488.aClass279_44;
			synchronized (Static488.aClass279_44) {
				Static488.aClass279_44.method6635(local193, local183);
			}
		}
		if (arg1 == null) {
			return local193;
		} else {
			local193 = local193.method6900((byte) 4, local7, true);
			return arg1.method1516(arg6, arg5, arg9, 2048, local193);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZI)V")
	public void method6978(@OriginalArg(0) boolean arg0) {
		this.aBoolean627 = arg0;
		this.method6985();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z[Lclient!uga;I[III[I)V")
	public void method6979(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class356[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		this.aClass356Array1 = arg1;
		if (this.anInt8254 != arg2) {
			this.anInt8254 = arg2;
		}
		this.anIntArray531 = arg5;
		this.anIntArray533 = arg3;
		this.anInt8252 = arg4;
		this.aBoolean627 = arg0;
		this.method6985();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBI)V")
	public void method6980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray533[arg0] = arg1;
		this.method6985();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!vf;II[IIZILclient!c;ILclient!c;Lclient!lw;Lclient!mu;Lclient!vda;IB[Lclient!gea;Lclient!bn;Lclient!ha;Lclient!ds;I)Lclient!ka;")
	public Class28 method6981(@OriginalArg(0) int arg0, @OriginalArg(1) Class373 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class48 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class48 arg9, @OriginalArg(11) Interface15 arg10, @OriginalArg(12) Class241 arg11, @OriginalArg(13) Class371 arg12, @OriginalArg(14) int arg13, @OriginalArg(16) Class140[] arg14, @OriginalArg(17) Class43 arg15, @OriginalArg(18) Class16 arg16, @OriginalArg(19) Class88 arg17, @OriginalArg(20) int arg18) {
		if (this.anInt8252 != -1) {
			return arg11.method5582(this.anInt8252).method63(arg9, arg18, (Class220) null, arg7, arg14, arg2, arg16, arg8, arg6, arg0, arg4, arg10, arg17, arg5, arg3, arg13, arg1);
		}
		@Pc(36) int local36 = arg6;
		@Pc(39) long local39 = this.aLong240;
		@Pc(42) int[] local42 = this.anIntArray531;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		if (arg7 != null && (arg7.anInt1554 >= 0 || arg7.anInt1540 >= 0)) {
			local42 = new int[this.anIntArray531.length];
			for (@Pc(64) int local64 = 0; local64 < local42.length; local64++) {
				local42[local64] = this.anIntArray531[local64];
			}
			if (arg7.anInt1554 >= 0) {
				if (arg7.anInt1554 == 65535) {
					local44 = true;
					local42[5] = 0;
					local39 ^= 0xFFFFFFFF00000000L;
				} else {
					local42[5] = arg7.anInt1554 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg7.anInt1540 >= 0) {
				local46 = true;
				if (arg7.anInt1540 == 65535) {
					local39 ^= 0xFFFFFFFFL;
					local42[3] = 0;
				} else {
					local42[3] = arg7.anInt1540 | 0x40000000;
					local39 ^= (long) local42[3];
				}
			}
		}
		@Pc(159) boolean local159 = false;
		@Pc(161) boolean local161 = false;
		@Pc(163) boolean local163 = false;
		@Pc(171) boolean local171 = arg7 != null || arg9 != null;
		@Pc(178) int local178 = arg14 == null ? 0 : arg14.length;
		@Pc(212) int local212;
		@Pc(217) int local217;
		for (@Pc(180) int local180 = 0; local180 < local178; local180++) {
			Static9.aClass3_Sub6_Sub11Array1[local180] = null;
			if (arg14[local180] != null) {
				@Pc(198) Class48 local198 = arg1.method8323(arg14[local180].anInt3493);
				if (local198.anIntArray72 != null) {
					Static338.aClass48Array2[local180] = local198;
					local171 = true;
					local212 = arg14[local180].anInt3492;
					local217 = arg14[local180].anInt3497;
					@Pc(222) int local222 = local198.anIntArray72[local212];
					Static9.aClass3_Sub6_Sub11Array1[local180] = arg1.method8321(local222 >>> 16);
					@Pc(235) int local235 = local222 & 0xFFFF;
					Static312.anIntArray380[local180] = local235;
					if (Static9.aClass3_Sub6_Sub11Array1[local180] != null) {
						local161 |= Static9.aClass3_Sub6_Sub11Array1[local180].method4042(local235);
						local159 |= Static9.aClass3_Sub6_Sub11Array1[local180].method4044(local235);
						local163 |= Static9.aClass3_Sub6_Sub11Array1[local180].method4037(local235);
					}
					if ((local198.aBoolean139 || Static296.aBoolean620) && local217 != -1 && local217 < local198.anIntArray72.length) {
						Static343.anIntArray396[local180] = local198.anIntArray68[local212];
						Static250.anIntArray309[local180] = arg14[local180].anInt3494;
						@Pc(306) int local306 = local198.anIntArray72[local217];
						Static27.aClass3_Sub6_Sub11Array2[local180] = arg1.method8321(local306 >>> 16);
						@Pc(319) int local319 = local306 & 0xFFFF;
						Static660.anIntArray661[local180] = local319;
						if (Static27.aClass3_Sub6_Sub11Array2[local180] != null) {
							local161 |= Static27.aClass3_Sub6_Sub11Array2[local180].method4042(local319);
							local159 |= Static27.aClass3_Sub6_Sub11Array2[local180].method4044(local319);
							local163 |= Static27.aClass3_Sub6_Sub11Array2[local180].method4037(local319);
						}
					} else {
						Static343.anIntArray396[local180] = 0;
						Static250.anIntArray309[local180] = 0;
						Static27.aClass3_Sub6_Sub11Array2[local180] = null;
						Static660.anIntArray661[local180] = -1;
					}
				}
			}
		}
		@Pc(382) int local382 = -1;
		local212 = -1;
		local217 = 0;
		@Pc(388) Class3_Sub6_Sub11 local388 = null;
		@Pc(390) Class3_Sub6_Sub11 local390 = null;
		@Pc(392) int local392 = -1;
		@Pc(402) int local402 = -1;
		@Pc(404) int local404 = 0;
		@Pc(406) Class3_Sub6_Sub11 local406 = null;
		@Pc(408) Class3_Sub6_Sub11 local408 = null;
		if (local171) {
			local36 = arg6 | 0x20;
			@Pc(425) int local425;
			@Pc(485) int local485;
			if (arg7 != null) {
				local382 = arg7.anIntArray72[arg18];
				local425 = local382 >>> 16;
				local382 &= 0xFFFF;
				local388 = arg1.method8321(local425);
				if (local388 != null) {
					local161 |= local388.method4042(local382);
					local159 |= local388.method4044(local382);
					local163 |= local388.method4037(local382);
				}
				if ((arg7.aBoolean139 || Static296.aBoolean620) && arg2 != -1 && arg7.anIntArray72.length > arg2) {
					local217 = arg7.anIntArray68[arg18];
					local212 = arg7.anIntArray72[arg2];
					local485 = local212 >>> 16;
					local212 &= 0xFFFF;
					local390 = local485 == local425 ? local388 : arg1.method8321(local485);
					if (local390 != null) {
						local161 |= local390.method4042(local212);
						local159 |= local390.method4044(local212);
						local163 |= local390.method4037(local212);
					}
				}
			}
			if (arg9 != null) {
				local392 = arg9.anIntArray72[arg13];
				local425 = local392 >>> 16;
				local392 &= 0xFFFF;
				local406 = arg1.method8321(local425);
				if (local406 != null) {
					local161 |= local406.method4042(local392);
					local159 |= local406.method4044(local392);
					local163 |= local406.method4037(local392);
				}
				if ((arg9.aBoolean139 || Static296.aBoolean620) && arg3 != -1 && arg9.anIntArray72.length > arg3) {
					local402 = arg9.anIntArray72[arg3];
					local404 = arg9.anIntArray68[arg13];
					local485 = local402 >>> 16;
					local402 &= 0xFFFF;
					local408 = local425 == local485 ? local406 : arg1.method8321(local485);
					if (local408 != null) {
						local161 |= local408.method4042(local402);
						local159 |= local408.method4044(local402);
						local163 |= local408.method4037(local402);
					}
				}
			}
			if (local161) {
				local36 |= 0x80;
			}
			if (local159) {
				local36 |= 0x100;
			}
			if (local163) {
				local36 |= 0x400;
			}
		}
		@Pc(657) Class279 local657 = Static104.aClass279_10;
		@Pc(665) Class28 local665;
		synchronized (Static104.aClass279_10) {
			local665 = (Class28) Static104.aClass279_10.method6631(local39);
		}
		@Pc(673) Class351 local673 = null;
		if (this.anInt8254 != -1) {
			local673 = arg17.method2132(this.anInt8254);
		}
		@Pc(707) boolean local707;
		@Pc(709) int local709;
		@Pc(715) int local715;
		@Pc(807) int local807;
		@Pc(813) int local813;
		@Pc(911) int local911;
		if (local665 == null || arg16.method8122(local665.ua(), local36) != 0) {
			if (local665 != null) {
				local36 = arg16.method8198(local36, local665.ua());
			}
			local707 = false;
			local709 = 0;
			while (true) {
				if (local709 >= local42.length) {
					if (local707) {
						if (this.aLong239 != -1L) {
							@Pc(1121) Class279 local1121 = Static104.aClass279_10;
							synchronized (Static104.aClass279_10) {
								local665 = (Class28) Static104.aClass279_10.method6631(this.aLong239);
							}
						}
						if (local665 == null || arg16.method8122(local665.ua(), local36) != 0) {
							return null;
						}
					} else {
						@Pc(805) Class73[] local805 = new Class73[local42.length];
						for (local807 = 0; local807 < local42.length; local807++) {
							local813 = local42[local807];
							@Pc(815) Class356 local815 = null;
							@Pc(831) boolean local831 = local807 == 5 && local44 || local807 == 3 && local46;
							@Pc(862) Class73 local862;
							if ((local813 & 0x40000000) != 0) {
								if (!local831 && this.aClass356Array1 != null && this.aClass356Array1[local807] != null) {
									local815 = this.aClass356Array1[local807];
								}
								local862 = arg12.method8305(local813 & 0x3FFFFFFF).method3195(this.aBoolean627, local815);
								if (local862 != null) {
									local805[local807] = local862;
								}
							} else if ((Integer.MIN_VALUE & local813) != 0) {
								local862 = arg15.method1378(local813 & 0x3FFFFFFF).method8571();
								if (local862 != null) {
									local805[local807] = local862;
								}
							}
						}
						@Pc(913) int local913;
						if (local673 != null && local673.anIntArrayArray99 != null) {
							for (local813 = 0; local813 < local673.anIntArrayArray99.length; local813++) {
								if (local805[local813] != null) {
									local911 = 0;
									local913 = 0;
									@Pc(915) int local915 = 0;
									@Pc(917) int local917 = 0;
									@Pc(919) int local919 = 0;
									@Pc(921) int local921 = 0;
									if (local673.anIntArrayArray99[local813] != null) {
										local911 = local673.anIntArrayArray99[local813][0];
										local913 = local673.anIntArrayArray99[local813][1];
										local921 = local673.anIntArrayArray99[local813][5] << 3;
										local915 = local673.anIntArrayArray99[local813][2];
										local919 = local673.anIntArrayArray99[local813][4] << 3;
										local917 = local673.anIntArrayArray99[local813][3] << 3;
									}
									if (local917 != 0 || local919 != 0 || local921 != 0) {
										local805[local813].method1902(local921, local919, local917);
									}
									if (local911 != 0 || local913 != 0 || local915 != 0) {
										local805[local813].method1898(local913, local915, local911);
									}
								}
							}
						}
						@Pc(1027) int local1027 = local36 | 0x4000;
						@Pc(1034) Class73 local1034 = new Class73(local805, local805.length);
						local665 = arg16.method8137(local1034, local1027, Static446.anInt7708, 64, 850);
						for (local911 = 0; local911 < 5; local911++) {
							for (local913 = 0; local913 < Static580.aShortArrayArrayArray3.length; local913++) {
								if (this.anIntArray533[local911] < Static580.aShortArrayArrayArray3[local913][local911].length) {
									local665.ia(Static398.aShortArrayArray16[local913][local911], Static580.aShortArrayArrayArray3[local913][local911][this.anIntArray533[local911]]);
								}
							}
						}
						local665.s(local36);
						@Pc(1096) Class279 local1096 = Static104.aClass279_10;
						synchronized (Static104.aClass279_10) {
							Static104.aClass279_10.method6635(local665, local39);
						}
						this.aLong239 = local39;
					}
					break;
				}
				local715 = local42[local709];
				@Pc(717) Class356 local717 = null;
				@Pc(735) boolean local735 = local709 == 5 && local44 || local709 == 3 && local46;
				if ((local715 & 0x40000000) != 0) {
					if (!local735 && this.aClass356Array1 != null && this.aClass356Array1[local709] != null) {
						local717 = this.aClass356Array1[local709];
					}
					if (!arg12.method8305(local715 & 0x3FFFFFFF).method3201(local717, this.aBoolean627)) {
						local707 = true;
					}
				} else if ((local715 & Integer.MIN_VALUE) != 0 && !arg15.method1378(local715 & 0x3FFFFFFF).method8570()) {
					local707 = true;
				}
				local709++;
			}
		}
		@Pc(1155) Class28 local1155 = local665.method6900((byte) 4, local36, true);
		local707 = false;
		if (arg4 != null) {
			for (local709 = 0; local709 < arg4.length; local709++) {
				if (arg4[local709] != -1) {
					local707 = true;
				}
			}
		}
		if (!local171 && !local707) {
			return local1155;
		}
		@Pc(1188) Class25[] local1188 = null;
		if (local673 != null) {
			local1188 = local673.method7966(arg16);
		}
		if (local707 && local1188 != null) {
			for (local715 = 0; local715 < arg4.length; local715++) {
				if (local1188[local715] != null) {
					local1155.method6889(local1188[local715], 0x1 << local715, true);
				}
			}
		}
		local715 = 0;
		local807 = 1;
		while (local715 < local178) {
			if (Static9.aClass3_Sub6_Sub11Array1[local715] != null) {
				local1155.method6909(Static343.anIntArray396[local715], Static9.aClass3_Sub6_Sub11Array1[local715], Static250.anIntArray309[local715] - 1, (int[]) null, Static660.anIntArray661[local715], local807, false, Static27.aClass3_Sub6_Sub11Array2[local715], Static312.anIntArray380[local715]);
			}
			local715++;
			local807 <<= 0x1;
		}
		if (local707) {
			for (local813 = 0; local813 < arg4.length; local813++) {
				if (arg4[local813] != -1) {
					local911 = arg4[local813] - arg8;
					local911 &= 0x3FFF;
					@Pc(1295) Class25 local1295 = arg16.method8178();
					local1295.method4289(local911);
					local1155.method6889(local1295, 0x1 << local813, false);
				}
			}
		}
		if (local707 && local1188 != null) {
			for (local813 = 0; local813 < arg4.length; local813++) {
				if (local1188[local813] != null) {
					local1155.method6889(local1188[local813], 0x1 << local813, false);
				}
			}
		}
		if (local388 != null && local406 != null) {
			local1155.method6891(local217, local392, arg7.aBooleanArray6, local408, local212, false, local402, local404, local382, arg5 - 1, local388, arg0 - 1, local390, local406);
		} else if (local388 != null) {
			local1155.method6893(0, false, local217, arg5 - 1, local212, local388, local390, local382);
		} else if (local406 != null) {
			local1155.method6893(0, false, local404, arg0 - 1, local402, local406, local408, local392);
		}
		for (local813 = 0; local813 < local178; local813++) {
			Static9.aClass3_Sub6_Sub11Array1[local813] = null;
			Static27.aClass3_Sub6_Sub11Array2[local813] = null;
			Static338.aClass48Array2[local813] = null;
		}
		return local1155;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIILclient!vda;)V")
	public void method6982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class371 arg2) {
		if (arg1 == -1) {
			this.anIntArray531[arg0] = 0;
		} else if (arg2.method8305(arg1) != null) {
			this.anIntArray531[arg0] = arg1 | 0x40000000;
			this.method6985();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!mu;Lclient!vda;Lclient!bn;ILclient!ha;Lclient!lw;IBLclient!vf;IILclient!c;)Lclient!ka;")
	public Class28 method6983(@OriginalArg(0) Class241 arg0, @OriginalArg(1) Class371 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(4) Class16 arg3, @OriginalArg(5) Interface15 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class373 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class48 arg9) {
		if (this.anInt8252 != -1) {
			return arg0.method5582(this.anInt8252).method60(arg9, arg6, arg3, (Class220) null, arg7, arg5, arg4, arg8);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(114) int local114;
		@Pc(59) int local59;
		@Pc(118) int local118;
		if (arg9 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg9.anIntArray72[arg8];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class3_Sub6_Sub11 local68 = arg6.method8321(local59);
			if (local68 != null) {
				local34 = local68.method4042(local63) | false;
				local32 = local68.method4044(local63) | false;
				local38 = local68.method4037(local63) | false;
				local36 = arg9.aBoolean138 | false;
			}
			if ((arg9.aBoolean139 || Static296.aBoolean620) && arg5 != -1 && arg5 < arg9.anIntArray72.length) {
				local114 = arg9.anIntArray72[arg5];
				local118 = local114 >>> 16;
				@Pc(132) Class3_Sub6_Sub11 local132 = local59 == local118 ? local68 : arg6.method8321(local118);
				@Pc(136) int local136 = local114 & 0xFFFF;
				if (local132 != null) {
					local34 |= local132.method4042(local136);
					local32 |= local132.method4044(local136);
					local38 |= local132.method4037(local136);
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
		@Pc(185) Class279 local185 = Static488.aClass279_44;
		@Pc(194) Class28 local194;
		synchronized (Static488.aClass279_44) {
			local194 = (Class28) Static488.aClass279_44.method6631(this.aLong240);
		}
		if (local194 == null || arg3.method8122(local194.ua(), local28) != 0) {
			if (local194 != null) {
				local28 = arg3.method8198(local28, local194.ua());
			}
			local36 = false;
			for (@Pc(225) int local225 = 0; local225 < this.anIntArray531.length; local225++) {
				local49 = this.anIntArray531[local225];
				@Pc(234) Class356 local234 = null;
				if ((local49 & 0x40000000) != 0) {
					if (this.aClass356Array1 != null && this.aClass356Array1[local225] != null) {
						local234 = this.aClass356Array1[local225];
					}
					if (!arg1.method8305(local49 & 0x3FFFFFFF).method3196(local234, this.aBoolean627)) {
						local36 = true;
					}
				} else if ((local49 & Integer.MIN_VALUE) != 0 && !arg2.method1378(local49 & 0x3FFFFFFF).method8568()) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(296) Class73[] local296 = new Class73[this.anIntArray531.length];
			local114 = 0;
			for (@Pc(300) int local300 = 0; local300 < this.anIntArray531.length; local300++) {
				@Pc(307) int local307 = this.anIntArray531[local300];
				@Pc(309) Class356 local309 = null;
				@Pc(338) Class73 local338;
				if ((local307 & 0x40000000) != 0) {
					if (this.aClass356Array1 != null && this.aClass356Array1[local300] != null) {
						local309 = this.aClass356Array1[local300];
					}
					local338 = arg1.method8305(local307 & 0x3FFFFFFF).method3194(this.aBoolean627, local309);
					if (local338 != null) {
						local296[local114++] = local338;
					}
				} else if ((local307 & Integer.MIN_VALUE) != 0) {
					local338 = arg2.method1378(local307 & 0x3FFFFFFF).method8565();
					if (local338 != null) {
						local296[local114++] = local338;
					}
				}
			}
			@Pc(381) Class73 local381 = new Class73(local296, local114);
			@Pc(385) int local385 = local28 | 0x4000;
			local194 = arg3.method8137(local381, local385, Static446.anInt7708, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local118 = 0; local118 < Static580.aShortArrayArrayArray3.length; local118++) {
					if (this.anIntArray533[local59] < Static580.aShortArrayArrayArray3[local118][local59].length) {
						local194.ia(Static398.aShortArrayArray16[local118][local59], Static580.aShortArrayArrayArray3[local118][local59][this.anIntArray533[local59]]);
					}
				}
			}
			local194.s(local28);
			@Pc(445) Class279 local445 = Static488.aClass279_44;
			synchronized (Static488.aClass279_44) {
				Static488.aClass279_44.method6635(local194, this.aLong240);
			}
		}
		if (arg9 == null) {
			return local194;
		} else {
			local194.method6900((byte) 4, local28, true);
			return arg9.method1516(arg8, arg5, arg7, 2048, local194);
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	private void method6985() {
		@Pc(7) long[] local7 = Class223.aLongArray11;
		this.aLong240 = -1L;
		this.aLong240 = local7[(int) (((long) (this.anInt8254 >> 8) ^ this.aLong240) & 0xFFL)] ^ this.aLong240 >>> 8;
		this.aLong240 = local7[(int) (((long) this.anInt8254 ^ this.aLong240) & 0xFFL)] ^ this.aLong240 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray531.length; local50++) {
			this.aLong240 = local7[(int) (((long) (this.anIntArray531[local50] >> 24) ^ this.aLong240) & 0xFFL)] ^ this.aLong240 >>> 8;
			this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) ((this.aLong240 ^ (long) (this.anIntArray531[local50] >> 16)) & 0xFFL)];
			this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) (((long) (this.anIntArray531[local50] >> 8) ^ this.aLong240) & 0xFFL)];
			this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) (((long) this.anIntArray531[local50] ^ this.aLong240) & 0xFFL)];
		}
		@Pc(153) int local153;
		if (this.aClass356Array1 != null) {
			for (local153 = 0; local153 < this.aClass356Array1.length; local153++) {
				if (this.aClass356Array1[local153] != null) {
					@Pc(175) int[] local175;
					@Pc(169) int[] local169;
					if (this.aBoolean627) {
						local169 = this.aClass356Array1[local153].anIntArray619;
						local175 = this.aClass356Array1[local153].anIntArray617;
					} else {
						local169 = this.aClass356Array1[local153].anIntArray616;
						local175 = this.aClass356Array1[local153].anIntArray618;
					}
					@Pc(193) int local193;
					if (local175 != null) {
						for (local193 = 0; local193 < local175.length; local193++) {
							this.aLong240 = local7[(int) ((this.aLong240 ^ (long) (local175[local193] >> 8)) & 0xFFL)] ^ this.aLong240 >>> 8;
							this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) ((this.aLong240 ^ (long) local175[local193]) & 0xFFL)];
						}
					}
					if (local169 != null) {
						for (local193 = 0; local193 < local169.length; local193++) {
							this.aLong240 = local7[(int) ((this.aLong240 ^ (long) (local169[local193] >> 8)) & 0xFFL)] ^ this.aLong240 >>> 8;
							this.aLong240 = local7[(int) (((long) local169[local193] ^ this.aLong240) & 0xFFL)] ^ this.aLong240 >>> 8;
						}
					}
					if (this.aClass356Array1[local153].aShortArray175 != null) {
						for (local193 = 0; local193 < this.aClass356Array1[local153].aShortArray175.length; local193++) {
							this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) ((this.aLong240 ^ (long) (this.aClass356Array1[local153].aShortArray175[local193] >> 8)) & 0xFFL)];
							this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) ((this.aLong240 ^ (long) this.aClass356Array1[local153].aShortArray175[local193]) & 0xFFL)];
						}
					}
					if (this.aClass356Array1[local153].aShortArray176 != null) {
						for (local193 = 0; local193 < this.aClass356Array1[local153].aShortArray176.length; local193++) {
							this.aLong240 = local7[(int) ((this.aLong240 ^ (long) (this.aClass356Array1[local153].aShortArray176[local193] >> 8)) & 0xFFL)] ^ this.aLong240 >>> 8;
							this.aLong240 = local7[(int) (((long) this.aClass356Array1[local153].aShortArray176[local193] ^ this.aLong240) & 0xFFL)] ^ this.aLong240 >>> 8;
						}
					}
				}
			}
		}
		for (local153 = 0; local153 < 5; local153++) {
			this.aLong240 = local7[(int) ((this.aLong240 ^ (long) this.anIntArray533[local153]) & 0xFFL)] ^ this.aLong240 >>> 8;
		}
		this.aLong240 = this.aLong240 >>> 8 ^ local7[(int) ((this.aLong240 ^ (long) (this.aBoolean627 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!bn;IBI)V")
	public void method6986(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static401.anIntArray428[arg1];
		if (arg0.method1378(arg2) != null) {
			this.anIntArray531[local12] = Integer.MIN_VALUE | arg2;
			this.method6985();
		}
	}
}
