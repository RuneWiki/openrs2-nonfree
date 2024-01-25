import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class166 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
	protected boolean aBoolean559 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class166() {
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!raa;IZILclient!gk;I[I[ZLclient!gk;IZ)V")
	private void method6672(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub42 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class120 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) Class120 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg4 == null || arg5 == 0) {
			for (local14 = 0; local14 < arg8.anInt4456; local14++) {
				@Pc(21) short local21 = arg8.aShortArray44[local14];
				if (arg7 == null || arg7[local21] == arg2 || arg1.anIntArray569[local21] == 0) {
					@Pc(42) short local42 = arg8.aShortArray43[local14];
					if (local42 != -1) {
						this.method6697(arg1.anIntArrayArray49[local42], arg10, arg0, 0, 0, arg9 & arg1.anIntArray570[local42], 0, arg6, 0);
					}
					this.method6697(arg1.anIntArrayArray49[local21], arg10, arg0, arg8.aShortArray47[local14], arg1.anIntArray569[local21], arg1.anIntArray570[local21] & arg9, arg8.aShortArray49[local14], arg6, arg8.aShortArray46[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg1.anInt8914; local109++) {
			@Pc(121) boolean local121 = false;
			if (local14 < arg8.anInt4456 && arg8.aShortArray44[local14] == local109) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (local107 < arg4.anInt4456 && arg4.aShortArray44[local107] == local109) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg7 == null || arg2 == arg7[local109] || arg1.anIntArray569[local109] == 0) {
					@Pc(189) short local189 = 0;
					@Pc(194) int local194 = arg1.anIntArray569[local109];
					if (local194 == 3 || local194 == 10) {
						local189 = 128;
					}
					@Pc(216) short local216;
					@Pc(210) short local210;
					@Pc(214) short local214;
					@Pc(212) short local212;
					@Pc(218) byte local218;
					if (local121) {
						local214 = arg8.aShortArray46[local14];
						local212 = arg8.aShortArray43[local14];
						local210 = arg8.aShortArray47[local14];
						local218 = arg8.aByteArray53[local14];
						local216 = arg8.aShortArray49[local14];
						local14++;
					} else {
						local210 = local189;
						local212 = -1;
						local214 = local189;
						local216 = local189;
						local218 = 0;
					}
					@Pc(254) short local254;
					@Pc(256) short local256;
					@Pc(250) short local250;
					@Pc(252) short local252;
					@Pc(258) byte local258;
					if (local139) {
						local256 = arg4.aShortArray47[local107];
						local250 = arg4.aShortArray46[local107];
						local258 = arg4.aByteArray53[local107];
						local254 = arg4.aShortArray49[local107];
						local252 = arg4.aShortArray43[local107];
						local107++;
					} else {
						local250 = local189;
						local252 = -1;
						local254 = local189;
						local256 = local189;
						local258 = 0;
					}
					if (local212 != -1) {
						this.method6697(arg1.anIntArrayArray49[local212], arg10, arg0, 0, 0, arg9 & arg1.anIntArray570[local212], 0, arg6, 0);
					} else if (local252 != -1) {
						this.method6697(arg1.anIntArrayArray49[local252], arg10, arg0, 0, 0, arg9 & arg1.anIntArray570[local252], 0, arg6, 0);
					}
					@Pc(348) int local348;
					@Pc(352) int local352;
					@Pc(350) int local350;
					if ((local218 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(371) int local371;
						if (local194 == 2) {
							local371 = local254 - local216 & 0x3FFF;
							@Pc(490) int local490 = local256 - local210 & 0x3FFF;
							@Pc(496) int local496 = local250 - local214 & 0x3FFF;
							if (local371 >= 8192) {
								local371 -= 16384;
							}
							if (local490 >= 8192) {
								local490 -= 16384;
							}
							if (local496 >= 8192) {
								local496 -= 16384;
							}
							local348 = local216 + local371 * arg5 / arg3 & 0x3FFF;
							local352 = local490 * arg5 / arg3 + local210 & 0x3FFF;
							local350 = local214 + arg5 * local496 / arg3 & 0x3FFF;
						} else if (local194 == 9) {
							local371 = local254 - local216 & 0x3FFF;
							if (local371 >= 8192) {
								local371 -= 16384;
							}
							local348 = local371 * arg5 / arg3 + local216 & 0x3FFF;
							local350 = 0;
							local352 = 0;
						} else if (local194 == 7) {
							local371 = local254 - local216 & 0x3F;
							if (local371 >= 32) {
								local371 -= 64;
							}
							local348 = local216 + local371 * arg5 / arg3 & 0x3F;
							local352 = arg5 * (local256 - local210) / arg3 + local210;
							local350 = (local250 - local214) * arg5 / arg3 + local214;
						} else {
							local348 = local216 + arg5 * (local254 - local216) / arg3;
							local350 = local214 + (local250 - local214) * arg5 / arg3;
							local352 = arg5 * (local256 - local210) / arg3 + local210;
						}
					} else {
						local348 = local216;
						local350 = local214;
						local352 = local210;
					}
					this.method6697(arg1.anIntArrayArray49[local109], arg10, arg0, local352, local194, arg9 & arg1.anIntArray570[local109], local348, arg6, local350);
				} else {
					if (local139) {
						local107++;
					}
					if (local121) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[IIIILclient!gw;ILclient!gw;ZI)V")
	public final void method6673(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub6_Sub9 arg5, @OriginalArg(8) Class2_Sub6_Sub9 arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method6692();
		if (!this.NA()) {
			this.method6691();
			return;
		}
		@Pc(20) Class120 local20 = arg6.aClass120Array1[arg3];
		@Pc(29) Class2_Sub42 local29 = local20.aClass2_Sub42_1;
		@Pc(31) Class120 local31 = null;
		if (arg5 != null) {
			local31 = arg5.aClass120Array1[arg4];
			if (local31.aClass2_Sub42_1 != local29) {
				local31 = null;
			}
		}
		this.method6672(0, local29, false, arg8, local31, arg0, arg1, null, local20, arg2, arg7);
		this.wa();
		this.method6691();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!eca;")
	public abstract Class87[] method6674();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6675(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bca;Lclient!iw;II)V")
	public abstract void method6678(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bca;IZ)V")
	public abstract void method6680(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!gw;)V")
	public final void method6681(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6_Sub9 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6692();
		if (!this.NA()) {
			this.method6691();
			return;
		}
		@Pc(23) Class120 local23 = arg1.aClass120Array1[arg0];
		@Pc(26) Class2_Sub42 local26 = local23.aClass2_Sub42_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt4456; local28++) {
			@Pc(35) short local35 = local23.aShortArray44[local28];
			if (local26.aBooleanArray22[local35]) {
				if (local23.aShortArray43[local28] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local26.anIntArray569[local35], local23.aShortArray49[local28], local23.aShortArray47[local28], local23.aShortArray46[local28]);
			}
		}
		this.wa();
		this.method6691();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method6682();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6683(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class166 method6684(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bca;Lclient!iw;I)V")
	public abstract void method6685(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!gw;ILclient!gw;ZZII)V")
	public final void method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub6_Sub9 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == -1) {
			return;
		}
		this.method6692();
		if (!this.NA()) {
			this.method6691();
			return;
		}
		@Pc(20) Class120 local20 = arg4.aClass120Array1[arg0];
		@Pc(23) Class2_Sub42 local23 = local20.aClass2_Sub42_1;
		@Pc(25) Class120 local25 = null;
		if (arg2 != null) {
			local25 = arg2.aClass120Array1[arg6];
			if (local23 != local25.aClass2_Sub42_1) {
				local25 = null;
			}
		}
		this.method6672(arg3, local23, false, arg1, local25, arg7, null, null, local20, 65535, arg5);
		this.wa();
		this.method6691();
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method6688();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!nn;")
	public abstract Class227[] method6689();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bca;)V")
	public abstract void method6690(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method6691();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method6692();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!bca;ZII)Z")
	public abstract boolean method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;IBILclient!gw;IIILclient!gw;ZILclient!gw;I[ZI)V")
	public final void method6695(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub6_Sub9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub6_Sub9 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class2_Sub6_Sub9 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg12 == null || arg5 == -1) {
			this.method6687(arg4, arg1, arg0, 0, arg7, arg8, arg9, arg6);
			return;
		}
		this.method6692();
		if (!this.NA()) {
			this.method6691();
			return;
		}
		@Pc(43) Class120 local43 = arg7.aClass120Array1[arg4];
		@Pc(46) Class2_Sub42 local46 = local43.aClass2_Sub42_1;
		@Pc(48) Class120 local48 = null;
		if (arg0 != null) {
			local48 = arg0.aClass120Array1[arg9];
			if (local46 != local48.aClass2_Sub42_1) {
				local48 = null;
			}
		}
		this.method6672(0, local46, false, arg1, local48, arg6, null, arg12, local43, 65535, arg8);
		@Pc(80) Class120 local80 = arg3.aClass120Array1[arg5];
		@Pc(82) Class120 local82 = null;
		if (arg10 != null) {
			local82 = arg10.aClass120Array1[arg13];
			if (local82.aClass2_Sub42_1 != local46) {
				local82 = null;
			}
		}
		this.method6675(0, new int[0], 0, 0, 0, 0, arg8);
		this.method6672(0, local80.aClass2_Sub42_1, true, arg2, local82, arg11, null, arg12, local80, 65535, arg8);
		this.wa();
		this.method6691();
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIILclient!s;I)V")
	protected final void method6696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class65 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(31) int local31 = arg6.method7999(arg2 + local16, local21 + arg7);
		@Pc(35) int local35 = arg0 / 2;
		@Pc(40) int local40 = -arg3 / 2;
		@Pc(51) int local51 = arg6.method7999(local35 + arg2, arg7 - -local40);
		@Pc(56) int local56 = -arg0 / 2;
		@Pc(60) int local60 = arg3 / 2;
		@Pc(71) int local71 = arg6.method7999(arg2 + local56, arg7 - -local60);
		@Pc(75) int local75 = arg0 / 2;
		@Pc(85) int local85 = arg3 / 2;
		@Pc(95) int local95 = arg6.method7999(arg2 + local75, local85 + arg7);
		@Pc(106) int local106 = local31 < local51 ? local31 : local51;
		@Pc(113) int local113 = local95 <= local71 ? local95 : local71;
		@Pc(124) int local124 = local51 < local95 ? local51 : local95;
		@Pc(157) int local157;
		if (arg3 != 0) {
			@Pc(142) int local142 = (int) (Math.atan2((double) (local106 - local113), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local142 != 0) {
				if (arg5 != 0) {
					if (local142 > 8192) {
						local157 = 16384 - arg5;
						if (local157 > local142) {
							local142 = local157;
						}
					} else if (local142 > arg5) {
						local142 = arg5;
					}
				}
				this.FA(local142);
			}
		}
		@Pc(183) int local183 = local31 >= local71 ? local71 : local31;
		if (arg0 != 0) {
			@Pc(202) int local202 = (int) (Math.atan2((double) (local183 - local124), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local202 != 0) {
				if (arg1 != 0) {
					if (local202 > 8192) {
						local157 = 16384 - arg1;
						if (local157 > local202) {
							local202 = local157;
						}
					} else if (arg1 < local202) {
						local202 = arg1;
					}
				}
				this.VA(local202);
			}
		}
		@Pc(237) int local237 = local95 + local31;
		if (local237 > local71 + local51) {
			local237 = local71 + local51;
		}
		local237 = (local237 >> 1) - arg4;
		if (local237 != 0) {
			this.H(0, local237, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IZIIIIBI[II)V")
	private void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(41) int local41;
		if (arg2 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local41 = -arg6;
				arg6 = arg8;
				arg8 = local41;
			} else if (arg4 == 3) {
				local41 = arg6;
				arg6 = arg8;
				arg8 = local41;
			} else if (arg4 == 2) {
				local41 = arg6;
				arg6 = -arg8 & 0x3FFF;
				arg8 = local41 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg6 = -arg6;
				arg8 = -arg8;
			} else if (arg4 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local41 = arg6;
				arg6 = -arg8;
				arg8 = local41;
			} else if (arg4 == 3) {
				local41 = arg6;
				arg6 = arg8;
				arg8 = local41;
			} else if (arg4 == 2) {
				local41 = arg6;
				arg6 = arg8 & 0x3FFF;
				arg8 = -local41 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method6675(arg4, arg0, arg6, arg3, arg8, arg2, arg1);
		} else {
			this.I(arg4, arg0, arg6, arg3, arg8, arg1, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!bca;ZI)Z")
	public abstract boolean method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub6_Sub7 ba(@OriginalArg(0) Class2_Sub6_Sub7 arg0);
}
