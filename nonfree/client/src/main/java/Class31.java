import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class31 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
	public boolean aBoolean46;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public int anInt670 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	public void method581(@OriginalArg(1) boolean arg0) {
		this.aBoolean46 = arg0;
		this.method589();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILclient!ea;ILclient!i;IIII)Lclient!ts;")
	public Class112 method582(@OriginalArg(2) int arg0, @OriginalArg(3) Class55 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class89 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(5) int local5 = 1024;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (arg3 != null) {
			@Pc(9) boolean local9 = false;
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			local5 = 1056;
			local28 = arg3.anIntArray245[arg5];
			local34 = local28 >>> 16;
			@Pc(38) int local38 = local28 & 0xFFFF;
			@Pc(42) Class5_Sub1_Sub9 local42 = Static207.method3801(local34);
			if (local42 != null) {
				local11 = local42.method2462(local38) | false;
				local9 = local42.method2461(local38) | false;
				local13 = arg3.aBoolean184 | false;
			}
			if ((arg3.aBoolean185 || Static85.aBoolean108) && arg6 != -1 && arg6 < arg3.anIntArray245.length) {
				@Pc(86) int local86 = arg3.anIntArray245[arg6];
				@Pc(90) int local90 = local86 >>> 16;
				@Pc(94) int local94 = local86 & 0xFFFF;
				@Pc(107) Class5_Sub1_Sub9 local107;
				if (local90 == local34) {
					local107 = local42;
				} else {
					local107 = Static207.method3801(local94 >>> 16);
				}
				if (local107 != null) {
					local11 |= local107.method2462(local94);
					local9 |= local107.method2461(local94);
				}
			}
			if (local11) {
				local5 = 1184;
			}
			if (local9) {
				local5 |= 0x100;
			}
			if (local13) {
				local5 |= 0x200;
			}
		}
		@Pc(163) long local163 = (long) (arg4 << 16) | (long) arg0 << 32 | (long) arg7;
		@Pc(165) Class109 local165 = Static38.aClass109_11;
		@Pc(173) Class112 local173;
		synchronized (Static38.aClass109_11) {
			local173 = (Class112) Static38.aClass109_11.method2857(local163);
		}
		if (local173 == null || arg1.method5181(local173.method4308(), local5) != 0) {
			if (local173 != null) {
				local5 = arg1.method5165(local5, local173.method4308());
			}
			@Pc(203) Class177[] local203 = new Class177[3];
			@Pc(205) int local205 = 0;
			if (!Static180.method3265(arg7).method1814() || !Static180.method3265(arg4).method1814() || !Static180.method3265(arg0).method1814()) {
				return null;
			}
			@Pc(229) Class177 local229 = Static180.method3265(arg7).method1805();
			if (local229 != null) {
				local205++;
				local203[0] = local229;
			}
			local229 = Static180.method3265(arg4).method1805();
			if (local229 != null) {
				local203[local205++] = local229;
			}
			local229 = Static180.method3265(arg0).method1805();
			if (local229 != null) {
				local203[local205++] = local229;
			}
			local229 = new Class177(local203, local205);
			local28 = local5 | 0x2000;
			local173 = arg1.method5201(local229, local28, Static215.anInt4239, 64, 768);
			for (local34 = 0; local34 < 5; local34++) {
				if (Static352.aShortArrayArray7[local34].length > this.anIntArray73[local34]) {
					local173.method4351(Static47.aShortArray8[local34], Static352.aShortArrayArray7[local34][this.anIntArray73[local34]]);
				}
				if (this.anIntArray73[local34] < Static96.aShortArrayArray3[local34].length) {
					local173.method4351(Static274.aShortArray92[local34], Static96.aShortArrayArray3[local34][this.anIntArray73[local34]]);
				}
			}
			local173.method4339(local5);
			@Pc(342) Class109 local342 = Static38.aClass109_11;
			synchronized (Static38.aClass109_11) {
				Static38.aClass109_11.method2855(local163, local173);
			}
		}
		if (arg3 == null) {
			return local173;
		} else {
			local173 = local173.method4349((byte) 1, local5, true);
			return arg3.method2265(arg2, 1024, local173, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)V")
	public void method586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static15.anIntArray52[arg0];
		if (this.anIntArray72[local15] != 0 && Static180.method3265(arg1) != null) {
			this.anIntArray72[local15] = arg1 | Integer.MIN_VALUE;
			this.method589();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI[III[I)V")
	public void method587(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg3 != this.anInt661) {
			this.anInt661 = arg3;
			this.anIntArrayArray19 = null;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
				for (@Pc(43) int local43 = 0; local43 < Static348.anInt6697; local43++) {
					@Pc(49) Class75 local49 = Static180.method3265(local43);
					if (local49 != null && !local49.aBoolean140 && (arg0 ? Static347.anIntArray630[local39] : Static183.anIntArray363[local39]) == local49.anInt1915) {
						arg2[Static15.anIntArray52[local39]] = local43 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray73 = arg4;
		this.aBoolean46 = arg0;
		this.anInt670 = arg1;
		this.anIntArray72 = arg2;
		this.method589();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray73[arg0] = arg1;
		this.method589();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	private void method589() {
		@Pc(5) long[] local5 = Class4_Sub3_Sub2.aLongArray7;
		this.aLong25 = -1L;
		this.aLong25 = this.aLong25 >>> 8 ^ local5[(int) ((this.aLong25 ^ (long) (this.anInt661 >> 8)) & 0xFFL)];
		this.aLong25 = local5[(int) ((this.aLong25 ^ (long) this.anInt661) & 0xFFL)] ^ this.aLong25 >>> 8;
		for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
			this.aLong25 = local5[(int) ((this.aLong25 ^ (long) (this.anIntArray72[local52] >> 24)) & 0xFFL)] ^ this.aLong25 >>> 8;
			this.aLong25 = this.aLong25 >>> 8 ^ local5[(int) (((long) (this.anIntArray72[local52] >> 16) ^ this.aLong25) & 0xFFL)];
			this.aLong25 = local5[(int) (((long) (this.anIntArray72[local52] >> 8) ^ this.aLong25) & 0xFFL)] ^ this.aLong25 >>> 8;
			this.aLong25 = this.aLong25 >>> 8 ^ local5[(int) (((long) this.anIntArray72[local52] ^ this.aLong25) & 0xFFL)];
		}
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			this.aLong25 = this.aLong25 >>> 8 ^ local5[(int) (((long) this.anIntArray73[local147] ^ this.aLong25) & 0xFFL)];
		}
		this.aLong25 = local5[(int) ((this.aLong25 ^ (long) (this.aBoolean46 ? 1 : 0)) & 0xFFL)] ^ this.aLong25 >>> 8;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIILclient!ea;Lclient!i;I)Lclient!ts;")
	public Class112 method590(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class55 arg2, @OriginalArg(5) Class89 arg3, @OriginalArg(6) int arg4) {
		if (this.anInt670 != -1) {
			return Static22.method442(this.anInt670).method2830(arg4, arg3, arg1, arg0, arg2);
		}
		@Pc(26) int local26 = 1024;
		@Pc(34) boolean local34;
		@Pc(45) int local45;
		@Pc(103) int local103;
		@Pc(55) int local55;
		@Pc(107) int local107;
		if (arg3 != null) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			local34 = false;
			local45 = arg3.anIntArray245[arg1];
			local26 = 1056;
			local55 = local45 >>> 16;
			@Pc(59) Class5_Sub1_Sub9 local59 = Static207.method3801(local55);
			@Pc(63) int local63 = local45 & 0xFFFF;
			if (local59 != null) {
				local32 = local59.method2462(local63) | false;
				local30 = local59.method2461(local63) | false;
				local34 = arg3.aBoolean184 | false;
			}
			if ((arg3.aBoolean185 || Static85.aBoolean108) && arg4 != -1 && arg3.anIntArray245.length > arg4) {
				local103 = arg3.anIntArray245[arg4];
				local107 = local103 >>> 16;
				@Pc(111) int local111 = local103 & 0xFFFF;
				@Pc(124) Class5_Sub1_Sub9 local124 = local55 == local107 ? local59 : Static207.method3801(local107);
				if (local124 != null) {
					local32 |= local124.method2462(local111);
					local30 |= local124.method2461(local111);
				}
			}
			if (local32) {
				local26 = 1184;
			}
			if (local30) {
				local26 |= 0x100;
			}
			if (local34) {
				local26 |= 0x200;
			}
		}
		@Pc(160) Class109 local160 = Static38.aClass109_11;
		@Pc(169) Class112 local169;
		synchronized (Static38.aClass109_11) {
			local169 = (Class112) Static38.aClass109_11.method2857(this.aLong25);
		}
		if (local169 == null || arg2.method5181(local169.method4308(), local26) != 0) {
			if (local169 != null) {
				local26 = arg2.method5165(local26, local169.method4308());
			}
			local34 = false;
			for (local45 = 0; local45 < 12; local45++) {
				local103 = this.anIntArray72[local45];
				if ((local103 & 0x40000000) == 0) {
					if ((local103 & Integer.MIN_VALUE) != 0 && !Static180.method3265(local103 & 0x3FFFFFFF).method1814()) {
						local34 = true;
					}
				} else if (!Static322.method544(local103 & 0x3FFFFFFF).method3455(this.aBoolean46)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(253) Class177[] local253 = new Class177[12];
			@Pc(255) int local255 = 0;
			for (@Pc(257) int local257 = 0; local257 < 12; local257++) {
				local55 = this.anIntArray72[local257];
				@Pc(278) Class177 local278;
				if ((local55 & 0x40000000) != 0) {
					local278 = Static322.method544(local55 & 0x3FFFFFFF).method3443(this.aBoolean46);
					if (local278 != null) {
						local253[local255++] = local278;
					}
				} else if ((local55 & Integer.MIN_VALUE) != 0) {
					local278 = Static180.method3265(local55 & 0x3FFFFFFF).method1805();
					if (local278 != null) {
						local253[local255++] = local278;
					}
				}
			}
			@Pc(316) int local316 = local26 | 0x2000;
			@Pc(322) Class177 local322 = new Class177(local253, local255);
			local169 = arg2.method5201(local322, local316, Static215.anInt4239, 64, 768);
			for (local107 = 0; local107 < 5; local107++) {
				if (this.anIntArray73[local107] < Static352.aShortArrayArray7[local107].length) {
					local169.method4351(Static47.aShortArray8[local107], Static352.aShortArrayArray7[local107][this.anIntArray73[local107]]);
				}
				if (this.anIntArray73[local107] < Static96.aShortArrayArray3[local107].length) {
					local169.method4351(Static274.aShortArray92[local107], Static96.aShortArrayArray3[local107][this.anIntArray73[local107]]);
				}
			}
			local169.method4339(local26);
			@Pc(393) Class109 local393 = Static38.aClass109_11;
			synchronized (Static38.aClass109_11) {
				Static38.aClass109_11.method2855(this.aLong25, local169);
			}
		}
		if (arg3 == null) {
			return local169;
		} else {
			local169.method4349((byte) 1, local26, true);
			return arg3.method2265(arg0, 1024, local169, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lclient!ub;BIILclient!i;ZIIILclient!ea;ILclient!i;)Lclient!ts;")
	public Class112 method591(@OriginalArg(0) int arg0, @OriginalArg(1) Class193[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class89 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class55 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class89 arg10) {
		if (this.anInt670 != -1) {
			return Static22.method442(this.anInt670).method2834(arg3, arg4, arg8, arg5, arg1, arg7, arg0, arg2, arg6, arg10, arg9);
		}
		@Pc(30) int local30 = arg3;
		@Pc(33) long local33 = this.aLong25;
		@Pc(36) int[] local36 = this.anIntArray72;
		if (arg10 != null && (arg10.anInt2451 >= 0 || arg10.anInt2461 >= 0)) {
			local36 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local36[local52] = this.anIntArray72[local52];
			}
			if (arg10.anInt2451 >= 0) {
				if (arg10.anInt2451 == 65535) {
					local36[5] = 0;
					local33 ^= 0xFFFFFFFF00000000L;
				} else {
					local36[5] = arg10.anInt2451 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg10.anInt2461 >= 0) {
				if (arg10.anInt2461 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local36[3] = 0;
				} else {
					local36[3] = arg10.anInt2461 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(147) boolean local147 = arg10 != null || arg4 != null;
		@Pc(154) int local154 = arg1 == null ? 0 : arg1.length;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(172) int local172 = 0; local172 < local154; local172++) {
			Static18.aClass5_Sub1_Sub9Array1[local172] = null;
			if (arg1[local172] != null) {
				@Pc(189) Class89 local189 = Static162.method2849(arg1[local172].anInt6179);
				if (local189.anIntArray245 != null) {
					Static84.aClass89Array5[local172] = local189;
					local147 = true;
					local203 = arg1[local172].anInt6177;
					local208 = arg1[local172].anInt6178;
					@Pc(213) int local213 = local189.anIntArray245[local203];
					Static18.aClass5_Sub1_Sub9Array1[local172] = Static207.method3801(local213 >>> 16);
					@Pc(225) int local225 = local213 & 0xFFFF;
					Static14.anIntArray51[local172] = local225;
					if (Static18.aClass5_Sub1_Sub9Array1[local172] != null) {
						local139 |= Static18.aClass5_Sub1_Sub9Array1[local172].method2462(local225);
						local137 |= Static18.aClass5_Sub1_Sub9Array1[local172].method2461(local225);
					}
					if ((local189.aBoolean185 || Static85.aBoolean108) && local208 != -1 && local208 < local189.anIntArray245.length) {
						Static107.anIntArray442[local172] = local189.anIntArray244[local203];
						Static63.anIntArray495[local172] = arg1[local172].anInt6182;
						@Pc(301) int local301 = local189.anIntArray245[local208];
						Static66.aClass5_Sub1_Sub9Array6[local172] = Static207.method3801(local301 >>> 16);
						@Pc(313) int local313 = local301 & 0xFFFF;
						Static146.anIntArray287[local172] = local313;
						if (Static66.aClass5_Sub1_Sub9Array6[local172] != null) {
							local139 |= Static66.aClass5_Sub1_Sub9Array6[local172].method2462(local313);
							local137 |= Static66.aClass5_Sub1_Sub9Array6[local172].method2461(local313);
						}
					} else {
						Static107.anIntArray442[local172] = 0;
						Static63.anIntArray495[local172] = 0;
						Static66.aClass5_Sub1_Sub9Array6[local172] = null;
						Static146.anIntArray287[local172] = -1;
					}
				}
			}
		}
		@Pc(349) int local349 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(355) Class5_Sub1_Sub9 local355 = null;
		@Pc(357) Class5_Sub1_Sub9 local357 = null;
		@Pc(359) int local359 = -1;
		@Pc(361) int local361 = -1;
		@Pc(363) int local363 = 0;
		@Pc(365) Class5_Sub1_Sub9 local365 = null;
		@Pc(367) Class5_Sub1_Sub9 local367 = null;
		if (local147) {
			@Pc(380) int local380;
			@Pc(436) int local436;
			if (arg10 != null) {
				local349 = arg10.anIntArray245[arg7];
				local380 = local349 >>> 16;
				local355 = Static207.method3801(local380);
				local349 &= 0xFFFF;
				if (local355 != null) {
					local139 |= local355.method2462(local349);
					local137 |= local355.method2461(local349);
				}
				if ((arg10.aBoolean185 || Static85.aBoolean108) && arg6 != -1 && arg6 < arg10.anIntArray245.length) {
					local208 = arg10.anIntArray244[arg7];
					local203 = arg10.anIntArray245[arg6];
					local436 = local203 >>> 16;
					local357 = local436 == local380 ? local355 : Static207.method3801(local436);
					local203 &= 0xFFFF;
					if (local357 != null) {
						local139 |= local357.method2462(local203);
						local137 |= local357.method2461(local203);
					}
				}
			}
			local30 = arg3 | 0x20;
			if (arg4 != null) {
				local359 = arg4.anIntArray245[arg2];
				local380 = local359 >>> 16;
				local365 = Static207.method3801(local380);
				local359 &= 0xFFFF;
				if (local365 != null) {
					local139 |= local365.method2462(local359);
					local137 |= local365.method2461(local359);
				}
				if ((arg4.aBoolean185 || Static85.aBoolean108) && arg0 != -1 && arg4.anIntArray245.length > arg0) {
					local361 = arg4.anIntArray245[arg0];
					local363 = arg4.anIntArray244[arg2];
					local436 = local361 >>> 16;
					local361 &= 0xFFFF;
					local367 = local436 == local380 ? local365 : Static207.method3801(local436);
					if (local367 != null) {
						local139 |= local367.method2462(local361);
						local137 |= local367.method2461(local361);
					}
				}
			}
			if (local139) {
				local30 |= 0x80;
			}
			if (local137) {
				local30 |= 0x100;
			}
		}
		@Pc(580) Class109 local580 = Static174.aClass109_39;
		@Pc(588) Class112 local588;
		synchronized (Static174.aClass109_39) {
			local588 = (Class112) Static174.aClass109_39.method2857(local33);
		}
		@Pc(596) Class88 local596 = null;
		if (this.anInt661 != -1) {
			local596 = Static60.method1859(this.anInt661);
		}
		@Pc(638) int local638;
		@Pc(644) int local644;
		if (local588 == null || arg8.method5181(local588.method4308(), local30) != 0 || local596 != null && local596.anIntArrayArray41 != null && this.anIntArrayArray19 == null) {
			if (local588 != null) {
				local30 = arg8.method5165(local30, local588.method4308());
			}
			@Pc(636) boolean local636 = false;
			local638 = 0;
			while (true) {
				if (local638 >= 12) {
					if (local636) {
						if (this.aLong26 != -1L) {
							@Pc(1277) Class109 local1277 = Static174.aClass109_39;
							synchronized (Static174.aClass109_39) {
								local588 = (Class112) Static174.aClass109_39.method2857(this.aLong26);
							}
						}
						if (local588 == null || arg8.method5181(local588.method4308(), local30) != 0 || local596 != null && local596.anIntArrayArray41 != null && this.anIntArrayArray19 == null) {
							return null;
						}
					} else {
						@Pc(693) Class177[] local693 = new Class177[12];
						@Pc(701) int local701;
						for (@Pc(695) int local695 = 0; local695 < 12; local695++) {
							local701 = local36[local695];
							@Pc(715) Class177 local715;
							if ((local701 & 0x40000000) != 0) {
								local715 = Static322.method544(local701 & 0x3FFFFFFF).method3454(this.aBoolean46);
								if (local715 != null) {
									local693[local695] = local715;
								}
							} else if ((local701 & Integer.MIN_VALUE) != 0) {
								local715 = Static180.method3265(local701 & 0x3FFFFFFF).method1808();
								if (local715 != null) {
									local693[local695] = local715;
								}
							}
						}
						@Pc(775) int local775;
						if (local596 != null && local596.anIntArrayArray41 != null) {
							for (local701 = 0; local701 < local596.anIntArrayArray41.length; local701++) {
								if (local596.anIntArrayArray41[local701] != null && local693[local701] != null) {
									local775 = local596.anIntArrayArray41[local701][0];
									@Pc(782) int local782 = local596.anIntArrayArray41[local701][1];
									@Pc(789) int local789 = local596.anIntArrayArray41[local701][2];
									@Pc(798) int local798 = local596.anIntArrayArray41[local701][3] << 3;
									@Pc(807) int local807 = local596.anIntArrayArray41[local701][4] << 3;
									@Pc(816) int local816 = local596.anIntArrayArray41[local701][5] << 3;
									if (this.anIntArrayArray19 == null) {
										this.anIntArrayArray19 = new int[local596.anIntArrayArray41.length][];
									}
									if (this.anIntArrayArray19[local701] == null) {
										@Pc(838) int[] local838 = this.anIntArrayArray19[local701] = new int[15];
										if (local798 == 0 && local807 == 0 && local816 == 0) {
											local838[0] = local838[4] = local838[8] = 32768;
											local838[14] = -local789;
											local838[13] = -local782;
											local838[12] = -local775;
										} else {
											@Pc(883) int local883 = Class187.anIntArray570[local798];
											@Pc(887) int local887 = Class187.anIntArray571[local798];
											@Pc(891) int local891 = Class187.anIntArray570[local807];
											@Pc(895) int local895 = Class187.anIntArray571[local807];
											@Pc(899) int local899 = Class187.anIntArray570[local816];
											@Pc(903) int local903 = Class187.anIntArray571[local816];
											@Pc(911) int local911 = local899 * local887 + 16384 >> 15;
											@Pc(919) int local919 = local903 * local887 + 16384 >> 15;
											local838[2] = local895 * local883 + 16384 >> 15;
											local838[3] = local883 * local903 + 16384 >> 15;
											local838[8] = local891 * local883 + 16384 >> 15;
											local838[6] = local919 * local891 + -local895 * local899 + 16384 >> 15;
											local838[5] = -local887;
											local838[1] = local891 * -local903 + local895 * local911 + 16384 >> 15;
											local838[0] = local895 * local919 + local891 * local899 + 16384 >> 15;
											local838[4] = local899 * local883 + 16384 >> 15;
											local838[7] = local891 * local911 + -local895 * -local903 + 16384 >> 15;
											local838[12] = -local789 * local838[6] + -local782 * local838[3] + local838[0] * -local775 + 16384 >> 15;
											local838[13] = -local775 * local838[1] + local838[4] * -local782 + -local789 * local838[7] + 16384 >> 15;
											local838[14] = local838[8] * -local789 + -local775 * local838[2] + local838[5] * -local782 + 16384 >> 15;
										}
										local838[9] = local775;
										local838[11] = local789;
										local838[10] = local782;
									}
									if (local798 != 0 || local807 != 0 || local816 != 0) {
										local693[local701].method4848(local807, local798, local816);
									}
									if (local775 != 0 || local782 != 0 || local789 != 0) {
										local693[local701].method4854(local775, local789, local782);
									}
								}
							}
						}
						@Pc(1167) Class177 local1167 = new Class177(local693, local693.length);
						@Pc(1171) int local1171 = local30 | 0x2000;
						local588 = arg8.method5201(local1167, local1171, Static215.anInt4239, 64, 850);
						for (local775 = 0; local775 < 5; local775++) {
							if (Static352.aShortArrayArray7[local775].length > this.anIntArray73[local775]) {
								local588.method4351(Static47.aShortArray8[local775], Static352.aShortArrayArray7[local775][this.anIntArray73[local775]]);
							}
							if (Static96.aShortArrayArray3[local775].length > this.anIntArray73[local775]) {
								local588.method4351(Static274.aShortArray92[local775], Static96.aShortArrayArray3[local775][this.anIntArray73[local775]]);
							}
						}
						local588.method4339(local30);
						@Pc(1248) Class109 local1248 = Static174.aClass109_39;
						synchronized (Static174.aClass109_39) {
							Static174.aClass109_39.method2855(local33, local588);
						}
						this.aLong26 = local33;
					}
					break;
				}
				local644 = local36[local638];
				if ((local644 & 0x40000000) == 0) {
					if ((local644 & Integer.MIN_VALUE) != 0 && !Static180.method3265(local644 & 0x3FFFFFFF).method1812()) {
						local636 = true;
					}
				} else if (!Static322.method544(local644 & 0x3FFFFFFF).method3447(this.aBoolean46)) {
					local636 = true;
				}
				local638++;
			}
		}
		@Pc(1316) Class112 local1316 = local588.method4349((byte) 1, local30, true);
		if (!local147) {
			return local1316;
		}
		@Pc(1322) int local1322 = 0;
		local638 = 1;
		while (local1322 < local154) {
			if (Static18.aClass5_Sub1_Sub9Array1[local1322] != null) {
				local1316.method4322(Static66.aClass5_Sub1_Sub9Array6[local1322], false, Static146.anIntArray287[local1322], Static107.anIntArray442[local1322], Static14.anIntArray51[local1322], Static63.anIntArray495[local1322] - 1, Static18.aClass5_Sub1_Sub9Array1[local1322], this.anIntArrayArray19 == null ? null : this.anIntArrayArray19[local1322], local638);
			}
			local638 <<= 0x1;
			local1322++;
		}
		if (local355 != null && local365 != null) {
			local1316.method4320(local363, local367, local359, local365, local361, local357, local203, local208, arg5 - 1, arg10.aBooleanArray9, false, local349, local355, arg9 - 1);
		} else if (local355 != null) {
			local1316.method4333(local208, false, local349, local203, local355, local357, 0, arg5 - 1);
		} else if (local365 != null) {
			local1316.method4333(local363, false, local359, local361, local365, local367, 0, arg9 - 1);
		}
		for (local644 = 0; local644 < local154; local644++) {
			Static18.aClass5_Sub1_Sub9Array1[local644] = null;
			Static66.aClass5_Sub1_Sub9Array6[local644] = null;
			Static84.aClass89Array5[local644] = null;
		}
		return local1316;
	}
}
