import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
	public boolean aBoolean15;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public int anInt274 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZ)V")
	public void method243(@OriginalArg(1) boolean arg0) {
		this.aBoolean15 = arg0;
		this.method253();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!hi;Lclient!vm;Lclient!ul;ILclient!bw;ZIIZLclient!hi;ILclient!mi;Lclient!qa;I[Lclient!cg;ILclient!ii;Lclient!mm;)Lclient!c;")
	public Class31 method244(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class96 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Interface8 arg10, @OriginalArg(13) Class75 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class34[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class109 arg15, @OriginalArg(18) Class157 arg16) {
		if (this.anInt274 != -1) {
			return arg2.method5684(this.anInt274).method1307(arg7, arg6, arg12, arg1, arg14, arg10, arg5, arg13, arg0, arg11, arg8, arg9, arg3, arg4);
		}
		@Pc(34) int local34 = arg0;
		@Pc(37) long local37 = this.aLong4;
		@Pc(40) int[] local40 = this.anIntArray24;
		if (arg1 != null && (arg1.anInt3317 >= 0 || arg1.anInt3326 >= 0)) {
			local40 = new int[12];
			for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
				local40[local59] = this.anIntArray24[local59];
			}
			if (arg1.anInt3317 >= 0) {
				if (arg1.anInt3317 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg1.anInt3317 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg1.anInt3326 >= 0) {
				if (arg1.anInt3326 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg1.anInt3326 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(150) boolean local150 = arg1 != null || arg8 != null;
		@Pc(157) int local157 = arg13 == null ? 0 : arg13.length;
		@Pc(191) int local191;
		@Pc(196) int local196;
		for (@Pc(159) int local159 = 0; local159 < local157; local159++) {
			Static247.aClass3_Sub3_Sub13Array3[local159] = null;
			if (arg13[local159] != null) {
				@Pc(177) Class96 local177 = arg5.method942(arg13[local159].anInt1238);
				if (local177.anIntArray253 != null) {
					local150 = true;
					Static442.aClass96Array2[local159] = local177;
					local191 = arg13[local159].anInt1230;
					local196 = arg13[local159].anInt1239;
					@Pc(201) int local201 = local177.anIntArray253[local191];
					Static247.aClass3_Sub3_Sub13Array3[local159] = arg5.method934(local201 >>> 16);
					@Pc(214) int local214 = local201 & 0xFFFF;
					Static227.anIntArray435[local159] = local214;
					if (Static247.aClass3_Sub3_Sub13Array3[local159] != null) {
						local140 |= Static247.aClass3_Sub3_Sub13Array3[local159].method3084(local214);
						local138 |= Static247.aClass3_Sub3_Sub13Array3[local159].method3081(local214);
						local142 |= Static247.aClass3_Sub3_Sub13Array3[local159].method3082(local214);
					}
					if ((local177.aBoolean258 || Static426.aBoolean504) && local196 != -1 && local196 < local177.anIntArray253.length) {
						Static356.anIntArray461[local159] = local177.anIntArray254[local191];
						Static245.anIntArray357[local159] = arg13[local159].anInt1234;
						@Pc(281) int local281 = local177.anIntArray253[local196];
						Static55.aClass3_Sub3_Sub13Array1[local159] = arg5.method934(local281 >>> 16);
						@Pc(294) int local294 = local281 & 0xFFFF;
						Static377.anIntArray475[local159] = local294;
						if (Static55.aClass3_Sub3_Sub13Array1[local159] != null) {
							local140 |= Static55.aClass3_Sub3_Sub13Array1[local159].method3084(local294);
							local138 |= Static55.aClass3_Sub3_Sub13Array1[local159].method3081(local294);
							local142 |= Static55.aClass3_Sub3_Sub13Array1[local159].method3082(local294);
						}
					} else {
						Static356.anIntArray461[local159] = 0;
						Static245.anIntArray357[local159] = 0;
						Static55.aClass3_Sub3_Sub13Array1[local159] = null;
						Static377.anIntArray475[local159] = -1;
					}
				}
			}
		}
		@Pc(353) int local353 = -1;
		local191 = -1;
		local196 = 0;
		@Pc(359) Class3_Sub3_Sub13 local359 = null;
		@Pc(361) Class3_Sub3_Sub13 local361 = null;
		@Pc(363) int local363 = -1;
		@Pc(365) int local365 = -1;
		@Pc(367) int local367 = 0;
		@Pc(369) Class3_Sub3_Sub13 local369 = null;
		@Pc(371) Class3_Sub3_Sub13 local371 = null;
		if (local150) {
			@Pc(384) int local384;
			@Pc(444) int local444;
			if (arg1 != null) {
				local353 = arg1.anIntArray253[arg7];
				local384 = local353 >>> 16;
				local353 &= 0xFFFF;
				local359 = arg5.method934(local384);
				if (local359 != null) {
					local140 |= local359.method3084(local353);
					local138 |= local359.method3081(local353);
					local142 |= local359.method3082(local353);
				}
				if ((arg1.aBoolean258 || Static426.aBoolean504) && arg9 != -1 && arg9 < arg1.anIntArray253.length) {
					local191 = arg1.anIntArray253[arg9];
					local196 = arg1.anIntArray254[arg7];
					local444 = local191 >>> 16;
					local361 = local444 == local384 ? local359 : arg5.method934(local444);
					local191 &= 0xFFFF;
					if (local361 != null) {
						local140 |= local361.method3084(local191);
						local138 |= local361.method3081(local191);
						local142 |= local361.method3082(local191);
					}
				}
			}
			local34 = arg0 | 0x20;
			if (arg8 != null) {
				local363 = arg8.anIntArray253[arg12];
				local384 = local363 >>> 16;
				local363 &= 0xFFFF;
				local369 = arg5.method934(local384);
				if (local369 != null) {
					local140 |= local369.method3084(local363);
					local138 |= local369.method3081(local363);
					local142 |= local369.method3082(local363);
				}
				if ((arg8.aBoolean258 || Static426.aBoolean504) && arg6 != -1 && arg8.anIntArray253.length > arg6) {
					local367 = arg8.anIntArray254[arg12];
					local365 = arg8.anIntArray253[arg6];
					local444 = local365 >>> 16;
					local371 = local384 == local444 ? local369 : arg5.method934(local444);
					local365 &= 0xFFFF;
					if (local371 != null) {
						local140 |= local371.method3084(local365);
						local138 |= local371.method3081(local365);
						local142 |= local371.method3082(local365);
					}
				}
			}
			if (local140) {
				local34 |= 0x80;
			}
			if (local138) {
				local34 |= 0x100;
			}
			if (local142) {
				local34 |= 0x400;
			}
		}
		@Pc(616) Class5 local616 = Static122.aClass5_23;
		@Pc(624) Class31 local624;
		synchronized (Static122.aClass5_23) {
			local624 = (Class31) Static122.aClass5_23.method104(local37);
		}
		@Pc(632) Class137 local632 = null;
		if (this.anInt266 != -1) {
			local632 = arg3.method5479(this.anInt266);
		}
		@Pc(673) int local673;
		@Pc(679) int local679;
		if (local624 == null || arg11.method2610(local624.n(), local34) != 0 || local632 != null && local632.anIntArrayArray34 != null && this.anIntArrayArray2 == null) {
			if (local624 != null) {
				local34 = arg11.method2614(local34, local624.n());
			}
			@Pc(671) boolean local671 = false;
			local673 = 0;
			while (true) {
				if (local673 >= 12) {
					if (local671) {
						if (this.aLong3 != -1L) {
							@Pc(730) Class5 local730 = Static122.aClass5_23;
							synchronized (Static122.aClass5_23) {
								local624 = (Class31) Static122.aClass5_23.method104(this.aLong3);
							}
						}
						if (local624 == null || arg11.method2610(local624.n(), local34) != 0 || local632 != null && local632.anIntArrayArray34 != null && this.anIntArrayArray2 == null) {
							return null;
						}
					} else {
						@Pc(766) Class242[] local766 = new Class242[12];
						@Pc(774) int local774;
						for (@Pc(768) int local768 = 0; local768 < 12; local768++) {
							local774 = local40[local768];
							@Pc(794) Class242 local794;
							if ((local774 & 0x40000000) != 0) {
								local794 = arg16.method3832(local774 & 0x3FFFFFFF).method4672(this.aBoolean15);
								if (local794 != null) {
									local766[local768] = local794;
								}
							} else if ((local774 & Integer.MIN_VALUE) != 0) {
								local794 = arg15.method2970(local774 & 0x3FFFFFFF).method4168();
								if (local794 != null) {
									local766[local768] = local794;
								}
							}
						}
						@Pc(852) int local852;
						if (local632 != null && local632.anIntArrayArray34 != null) {
							for (local774 = 0; local774 < local632.anIntArrayArray34.length; local774++) {
								if (local632.anIntArrayArray34[local774] != null && local766[local774] != null) {
									local852 = local632.anIntArrayArray34[local774][0];
									@Pc(859) int local859 = local632.anIntArrayArray34[local774][1];
									@Pc(866) int local866 = local632.anIntArrayArray34[local774][2];
									@Pc(875) int local875 = local632.anIntArrayArray34[local774][3] << 3;
									@Pc(884) int local884 = local632.anIntArrayArray34[local774][4] << 3;
									@Pc(893) int local893 = local632.anIntArrayArray34[local774][5] << 3;
									if (this.anIntArrayArray2 == null) {
										this.anIntArrayArray2 = new int[local632.anIntArrayArray34.length][];
									}
									if (this.anIntArrayArray2[local774] == null) {
										@Pc(915) int[] local915 = this.anIntArrayArray2[local774] = new int[15];
										if (local875 == 0 && local884 == 0 && local893 == 0) {
											local915[0] = local915[4] = local915[8] = 32768;
											local915[12] = -local852;
											local915[14] = -local866;
											local915[13] = -local859;
										} else {
											@Pc(957) int local957 = Applet_Sub1.anIntArray87[local875];
											@Pc(961) int local961 = Applet_Sub1.anIntArray85[local875];
											@Pc(965) int local965 = Applet_Sub1.anIntArray87[local884];
											@Pc(969) int local969 = Applet_Sub1.anIntArray85[local884];
											@Pc(973) int local973 = Applet_Sub1.anIntArray87[local893];
											@Pc(977) int local977 = Applet_Sub1.anIntArray85[local893];
											@Pc(985) int local985 = local961 * local973 + 16384 >> 15;
											@Pc(993) int local993 = local977 * local961 + 16384 >> 15;
											local915[3] = local977 * local957 + 16384 >> 15;
											local915[5] = -local961;
											local915[2] = local957 * local969 + 16384 >> 15;
											local915[4] = local973 * local957 + 16384 >> 15;
											local915[8] = local957 * local965 + 16384 >> 15;
											local915[1] = local965 * -local977 + local985 * local969 + 16384 >> 15;
											local915[6] = local965 * local993 + local973 * -local969 + 16384 >> 15;
											local915[0] = local965 * local973 + local969 * local993 + 16384 >> 15;
											local915[7] = -local969 * -local977 + local965 * local985 + 16384 >> 15;
											local915[14] = -local859 * local915[5] + local915[2] * -local852 + -local866 * local915[8] + 16384 >> 15;
											local915[13] = -local866 * local915[7] + -local852 * local915[1] + local915[4] * -local859 + 16384 >> 15;
											local915[12] = local915[6] * -local866 + local915[0] * -local852 + local915[3] * -local859 + 16384 >> 15;
										}
										local915[10] = local859;
										local915[11] = local866;
										local915[9] = local852;
									}
									if (local875 != 0 || local884 != 0 || local893 != 0) {
										local766[local774].method5551(local875, local884, local893);
									}
									if (local852 != 0 || local859 != 0 || local866 != 0) {
										local766[local774].method5554(local859, local852, local866);
									}
								}
							}
						}
						@Pc(1244) int local1244 = local34 | 0x4000;
						@Pc(1251) Class242 local1251 = new Class242(local766, local766.length);
						local624 = arg11.method2616(local1251, local1244, Static379.anInt2075, 64, 850);
						for (local852 = 0; local852 < 5; local852++) {
							if (this.anIntArray26[local852] < Static427.aShortArrayArray7[local852].length) {
								local624.N(Static97.aShortArray38[local852], Static427.aShortArrayArray7[local852][this.anIntArray26[local852]]);
							}
							if (this.anIntArray26[local852] < Static409.aShortArrayArray6[local852].length) {
								local624.N(Static33.aShortArray3[local852], Static409.aShortArrayArray6[local852][this.anIntArray26[local852]]);
							}
						}
						local624.u(local34);
						@Pc(1328) Class5 local1328 = Static122.aClass5_23;
						synchronized (Static122.aClass5_23) {
							Static122.aClass5_23.method114(local37, local624);
						}
						this.aLong3 = local37;
					}
					break;
				}
				local679 = local40[local673];
				if ((local679 & 0x40000000) == 0) {
					if ((local679 & Integer.MIN_VALUE) != 0 && !arg15.method2970(local679 & 0x3FFFFFFF).method4167()) {
						local671 = true;
					}
				} else if (!arg16.method3832(local679 & 0x3FFFFFFF).method4664(this.aBoolean15)) {
					local671 = true;
				}
				local673++;
			}
		}
		@Pc(1350) Class31 local1350 = local624.method5710((byte) 4, local34, true);
		if (!local150) {
			return local1350;
		}
		@Pc(1356) int local1356 = 0;
		local673 = 1;
		while (local157 > local1356) {
			if (Static247.aClass3_Sub3_Sub13Array3[local1356] != null) {
				local1350.method5713(Static247.aClass3_Sub3_Sub13Array3[local1356], local673, this.anIntArrayArray2 == null ? null : this.anIntArrayArray2[local1356], false, Static356.anIntArray461[local1356], Static227.anIntArray435[local1356], Static377.anIntArray475[local1356], Static245.anIntArray357[local1356] - 1, Static55.aClass3_Sub3_Sub13Array1[local1356]);
			}
			local673 <<= 0x1;
			local1356++;
		}
		if (local359 != null && local369 != null) {
			local1350.method5711(arg14 - 1, arg4 - 1, arg1.aBooleanArray12, local353, local196, local365, local369, false, local361, local371, local363, local191, local367, local359);
		} else if (local359 != null) {
			local1350.method5717(local353, local359, local196, arg4 - 1, 0, local191, local361, false);
		} else if (local369 != null) {
			local1350.method5717(local363, local369, local367, arg14 - 1, 0, local365, local371, false);
		}
		for (local679 = 0; local679 < local157; local679++) {
			Static247.aClass3_Sub3_Sub13Array3[local679] = null;
			Static55.aClass3_Sub3_Sub13Array1[local679] = null;
			Static442.aClass96Array2[local679] = null;
		}
		return local1350;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZIILclient!ii;Lclient!qa;ILclient!hi;ILclient!bw;II)Lclient!c;")
	public Class31 method246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class109 arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class96 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class30 arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = 2048;
		@Pc(102) int local102;
		if (arg6 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			local12 = 2080;
			@Pc(39) int local39 = arg6.anIntArray253[arg2];
			@Pc(43) int local43 = local39 >>> 16;
			@Pc(48) Class3_Sub3_Sub13 local48 = arg8.method934(local43);
			@Pc(52) int local52 = local39 & 0xFFFF;
			if (local48 != null) {
				local18 = local48.method3084(local52) | false;
				local16 = local48.method3081(local52) | false;
				local22 = local48.method3082(local52) | false;
				local20 = arg6.aBoolean255 | false;
			}
			if ((arg6.aBoolean258 || Static426.aBoolean504) && arg1 != -1 && arg6.anIntArray253.length > arg1) {
				local102 = arg6.anIntArray253[arg1];
				@Pc(106) int local106 = local102 >>> 16;
				@Pc(110) int local110 = local102 & 0xFFFF;
				@Pc(120) Class3_Sub3_Sub13 local120;
				if (local43 == local106) {
					local120 = local48;
				} else {
					local120 = arg8.method934(local110 >>> 16);
				}
				if (local120 != null) {
					local18 |= local120.method3084(local110);
					local16 |= local120.method3081(local110);
					local22 |= local120.method3082(local110);
				}
			}
			if (local18) {
				local12 = 2208;
			}
			if (local16) {
				local12 |= 0x100;
			}
			if (local20) {
				local12 |= 0x200;
			}
			if (local22) {
				local12 |= 0x400;
			}
		}
		@Pc(183) long local183 = (long) (arg5 << 16) | (long) arg7 << 32 | (long) arg9;
		@Pc(185) Class5 local185 = Static227.aClass5_49;
		@Pc(193) Class31 local193;
		synchronized (Static227.aClass5_49) {
			local193 = (Class31) Static227.aClass5_49.method104(local183);
		}
		if (local193 == null || arg4.method2610(local193.n(), local12) != 0) {
			if (local193 != null) {
				local12 = arg4.method2614(local12, local193.n());
			}
			@Pc(223) Class242[] local223 = new Class242[3];
			local102 = 0;
			if (!arg3.method2970(arg9).method4170() || !arg3.method2970(arg5).method4170() || !arg3.method2970(arg7).method4170()) {
				return null;
			}
			@Pc(255) Class242 local255 = arg3.method2970(arg9).method4166();
			if (local255 != null) {
				local102++;
				local223[0] = local255;
			}
			local255 = arg3.method2970(arg5).method4166();
			if (local255 != null) {
				local223[local102++] = local255;
			}
			local255 = arg3.method2970(arg7).method4166();
			if (local255 != null) {
				local223[local102++] = local255;
			}
			@Pc(294) int local294 = local12 | 0x4000;
			local255 = new Class242(local223, local102);
			local193 = arg4.method2616(local255, local294, Static379.anInt2075, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (this.anIntArray26[local310] < Static427.aShortArrayArray7[local310].length) {
					local193.N(Static97.aShortArray38[local310], Static427.aShortArrayArray7[local310][this.anIntArray26[local310]]);
				}
				if (this.anIntArray26[local310] < Static409.aShortArrayArray6[local310].length) {
					local193.N(Static33.aShortArray3[local310], Static409.aShortArrayArray6[local310][this.anIntArray26[local310]]);
				}
			}
			local193.u(local12);
			@Pc(369) Class5 local369 = Static227.aClass5_49;
			synchronized (Static227.aClass5_49) {
				Static227.aClass5_49.method114(local183, local193);
			}
		}
		if (arg6 == null) {
			return local193;
		} else {
			local193 = local193.method5710((byte) 4, local12, true);
			return arg6.method2716(arg2, 2048, arg0, local193, arg1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIBZ[II)V")
	public void method248(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.anInt274 = arg1;
		this.anIntArray24 = arg3;
		if (arg4 != this.anInt266) {
			this.anIntArrayArray2 = null;
			this.anInt266 = arg4;
		}
		this.anIntArray26 = arg0;
		this.aBoolean15 = arg2;
		this.method253();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!vm;Lclient!bw;ILclient!mm;ILclient!qa;Lclient!mi;ILclient!hi;ILclient!ii;)Lclient!c;")
	public Class31 method250(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(4) Class157 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(7) Interface8 arg6, @OriginalArg(9) Class96 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class109 arg9) {
		if (this.anInt274 != -1) {
			return arg1.method5684(this.anInt274).method1298(arg6, arg2, arg5, arg4, arg0, arg7, arg8);
		}
		@Pc(29) int local29 = 2048;
		@Pc(37) boolean local37;
		@Pc(56) int local56;
		@Pc(116) int local116;
		@Pc(60) int local60;
		if (arg7 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			@Pc(39) boolean local39 = false;
			local29 = 2080;
			local56 = arg7.anIntArray253[arg8];
			local60 = local56 >>> 16;
			@Pc(64) int local64 = local56 & 0xFFFF;
			@Pc(69) Class3_Sub3_Sub13 local69 = arg2.method934(local60);
			if (local69 != null) {
				local35 = local69.method3084(local64) | false;
				local33 = local69.method3081(local64) | false;
				local39 = local69.method3082(local64) | false;
				local37 = arg7.aBoolean255 | false;
			}
			if ((arg7.aBoolean258 || Static426.aBoolean504) && arg4 != -1 && arg4 < arg7.anIntArray253.length) {
				local116 = arg7.anIntArray253[arg4];
				@Pc(120) int local120 = local116 >>> 16;
				@Pc(124) int local124 = local116 & 0xFFFF;
				@Pc(134) Class3_Sub3_Sub13 local134 = local60 == local120 ? local69 : arg2.method934(local120);
				if (local134 != null) {
					local35 |= local134.method3084(local124);
					local33 |= local134.method3081(local124);
					local39 |= local134.method3082(local124);
				}
			}
			if (local35) {
				local29 = 2208;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
			if (local39) {
				local29 |= 0x400;
			}
		}
		@Pc(185) Class5 local185 = Static227.aClass5_49;
		@Pc(194) Class31 local194;
		synchronized (Static227.aClass5_49) {
			local194 = (Class31) Static227.aClass5_49.method104(this.aLong4);
		}
		if (local194 == null || arg5.method2610(local194.n(), local29) != 0) {
			if (local194 != null) {
				local29 = arg5.method2614(local29, local194.n());
			}
			local37 = false;
			for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
				local56 = this.anIntArray24[local222];
				if ((local56 & 0x40000000) == 0) {
					if ((local56 & Integer.MIN_VALUE) != 0 && !arg9.method2970(local56 & 0x3FFFFFFF).method4170()) {
						local37 = true;
					}
				} else if (!arg3.method3832(local56 & 0x3FFFFFFF).method4668(this.aBoolean15)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(279) Class242[] local279 = new Class242[12];
			local116 = 0;
			for (@Pc(283) int local283 = 0; local283 < 12; local283++) {
				@Pc(290) int local290 = this.anIntArray24[local283];
				@Pc(313) Class242 local313;
				if ((local290 & 0x40000000) != 0) {
					local313 = arg3.method3832(local290 & 0x3FFFFFFF).method4675(this.aBoolean15);
					if (local313 != null) {
						local279[local116++] = local313;
					}
				} else if ((local290 & Integer.MIN_VALUE) != 0) {
					local313 = arg9.method2970(local290 & 0x3FFFFFFF).method4166();
					if (local313 != null) {
						local279[local116++] = local313;
					}
				}
			}
			@Pc(350) Class242 local350 = new Class242(local279, local116);
			@Pc(354) int local354 = local29 | 0x4000;
			local194 = arg5.method2616(local350, local354, Static379.anInt2075, 64, 768);
			for (local60 = 0; local60 < 5; local60++) {
				if (this.anIntArray26[local60] < Static427.aShortArrayArray7[local60].length) {
					local194.N(Static97.aShortArray38[local60], Static427.aShortArrayArray7[local60][this.anIntArray26[local60]]);
				}
				if (this.anIntArray26[local60] < Static409.aShortArrayArray6[local60].length) {
					local194.N(Static33.aShortArray3[local60], Static409.aShortArrayArray6[local60][this.anIntArray26[local60]]);
				}
			}
			local194.u(local29);
			@Pc(423) Class5 local423 = Static227.aClass5_49;
			synchronized (Static227.aClass5_49) {
				Static227.aClass5_49.method114(this.aLong4, local194);
			}
		}
		if (arg7 == null) {
			return local194;
		} else {
			local194.method5710((byte) 4, local29, true);
			return arg7.method2716(arg8, 2048, arg0, local194, arg4);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
	public void method252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray26[arg0] = arg1;
		this.method253();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	private void method253() {
		this.aLong4 = -1L;
		@Pc(8) long[] local8 = Class64_Sub1.aLongArray1;
		this.aLong4 = local8[(int) (((long) (this.anInt266 >> 8) ^ this.aLong4) & 0xFFL)] ^ this.aLong4 >>> 8;
		this.aLong4 = local8[(int) (((long) this.anInt266 ^ this.aLong4) & 0xFFL)] ^ this.aLong4 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
			this.aLong4 = this.aLong4 >>> 8 ^ local8[(int) (((long) (this.anIntArray24[local48] >> 24) ^ this.aLong4) & 0xFFL)];
			this.aLong4 = this.aLong4 >>> 8 ^ local8[(int) ((this.aLong4 ^ (long) (this.anIntArray24[local48] >> 16)) & 0xFFL)];
			this.aLong4 = local8[(int) (((long) (this.anIntArray24[local48] >> 8) ^ this.aLong4) & 0xFFL)] ^ this.aLong4 >>> 8;
			this.aLong4 = this.aLong4 >>> 8 ^ local8[(int) (((long) this.anIntArray24[local48] ^ this.aLong4) & 0xFFL)];
		}
		for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
			this.aLong4 = local8[(int) (((long) this.anIntArray26[local143] ^ this.aLong4) & 0xFFL)] ^ this.aLong4 >>> 8;
		}
		this.aLong4 = local8[(int) (((long) (this.aBoolean15 ? 1 : 0) ^ this.aLong4) & 0xFFL)] ^ this.aLong4 >>> 8;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ii;II)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static65.anIntArray474[arg2];
		if (this.anIntArray24[local7] != 0 && arg1.method2970(arg0) != null) {
			this.anIntArray24[local7] = arg0 | Integer.MIN_VALUE;
			this.method253();
		}
	}
}
