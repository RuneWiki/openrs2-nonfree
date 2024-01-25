import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class19_Sub1_Sub3_Sub2_Sub2 extends Class19_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!oba", name = "zd", descriptor = "I")
	public int anInt7830;

	@OriginalMember(owner = "client!oba", name = "od", descriptor = "I")
	private int anInt7843;

	@OriginalMember(owner = "client!oba", name = "Sc", descriptor = "Lclient!maa;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!oba", name = "Xc", descriptor = "I")
	public int anInt7852;

	@OriginalMember(owner = "client!oba", name = "cd", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!oba", name = "Vc", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!oba", name = "wd", descriptor = "I")
	public int anInt7835 = -1;

	@OriginalMember(owner = "client!oba", name = "jd", descriptor = "I")
	public int anInt7837 = 0;

	@OriginalMember(owner = "client!oba", name = "bd", descriptor = "Z")
	public boolean aBoolean598 = false;

	@OriginalMember(owner = "client!oba", name = "fd", descriptor = "B")
	private byte aByte122 = 0;

	@OriginalMember(owner = "client!oba", name = "md", descriptor = "I")
	public int anInt7825 = -1;

	@OriginalMember(owner = "client!oba", name = "Fd", descriptor = "Z")
	public boolean aBoolean601 = false;

	@OriginalMember(owner = "client!oba", name = "Mc", descriptor = "Z")
	public boolean aBoolean599 = false;

	@OriginalMember(owner = "client!oba", name = "ed", descriptor = "I")
	public int anInt7836 = 0;

	@OriginalMember(owner = "client!oba", name = "Hd", descriptor = "I")
	public int anInt7850 = -1;

	@OriginalMember(owner = "client!oba", name = "hd", descriptor = "I")
	public int anInt7841 = 0;

	@OriginalMember(owner = "client!oba", name = "Ad", descriptor = "B")
	private byte aByte123 = 0;

	@OriginalMember(owner = "client!oba", name = "Wc", descriptor = "I")
	public int anInt7834 = -1;

	@OriginalMember(owner = "client!oba", name = "Lc", descriptor = "Z")
	public boolean aBoolean602 = false;

	@OriginalMember(owner = "client!oba", name = "ad", descriptor = "Z")
	public boolean aBoolean600 = false;

	@OriginalMember(owner = "client!oba", name = "id", descriptor = "I")
	public int anInt7846 = 255;

	@OriginalMember(owner = "client!oba", name = "Ed", descriptor = "I")
	public int anInt7856 = 0;

	@OriginalMember(owner = "client!oba", name = "gd", descriptor = "B")
	private byte aByte124 = 0;

	@OriginalMember(owner = "client!oba", name = "Uc", descriptor = "I")
	public int anInt7848 = -1;

	@OriginalMember(owner = "client!oba", name = "Kc", descriptor = "I")
	public int anInt7849 = 0;

	@OriginalMember(owner = "client!oba", name = "Yc", descriptor = "I")
	public int anInt7826 = -1;

	@OriginalMember(owner = "client!oba", name = "ud", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!oba", name = "Gd", descriptor = "I")
	public int anInt7827 = -1;

	@OriginalMember(owner = "client!oba", name = "Zc", descriptor = "I")
	public int anInt7853 = -1;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(I)V")
	public Class19_Sub1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class19_Sub1_Sub3_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "(I)I")
	@Override
	public int method6603() {
		return -1;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass236_1 == null || !this.method6621(arg0, 2048)) {
			return null;
		}
		@Pc(31) Class181 local31 = arg0.method7693();
		@Pc(36) int local36 = super.aClass340_7.method8085();
		local31.method6344(local36);
		@Pc(54) Class262 local54 = Static584.aClass262ArrayArrayArray2[super.aByte146][super.anInt11204 >> Static394.anInt7067][super.anInt11211 >> Static394.anInt7067];
		if (local54 == null || local54.aClass19_Sub1_Sub5_1 == null) {
			super.anInt7765 = (int) ((float) super.anInt7765 - (float) super.anInt7765 / 10.0F);
		} else {
			@Pc(84) int local84 = super.anInt7765 - local54.aClass19_Sub1_Sub5_1.aShort128;
			super.anInt7765 = (int) ((float) super.anInt7765 - (float) local84 / 10.0F);
		}
		local31.method6354(super.anInt11204, -super.anInt7765 + super.anInt11208 - 20, super.anInt11211);
		@Pc(111) Class19_Sub8 local111 = null;
		super.aBoolean597 = false;
		if (Static713.aClass3_Sub55_31.aClass15_Sub3_1.method910() == 1) {
			@Pc(124) Class274 local124 = this.method6600();
			if (local124.aBoolean624 && (this.aClass236_1.anInt6856 == -1 || Static631.aClass85_2.method2214(this.aClass236_1.anInt6856).aBoolean20)) {
				@Pc(165) Class100 local165 = super.aClass100_9.method8963() && super.aClass100_9.method8975() ? super.aClass100_9 : null;
				@Pc(185) Class100 local185 = super.aClass100_8.method8963() && (!super.aBoolean595 || local165 == null) ? super.aClass100_8 : null;
				@Pc(211) Class157 local211 = Static563.method7836(arg0, super.anInt7791, super.aClass157Array3[0], local36, local185 == null ? local165 : local185, super.anInt7773, 0, 240, 1, 0, 160, super.anInt7792);
				if (local211 != null) {
					local111 = Static58.method727(super.aClass157Array3.length + 1, true);
					super.aBoolean597 = true;
					arg0.C(false);
					if (Static568.aBoolean784) {
						local211.method5227(local31, local111.aClass19_Sub6Array1[super.aClass157Array3.length], Static705.anInt11029, 0);
					} else {
						local211.method5232(local31, local111.aClass19_Sub6Array1[super.aClass157Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(268) int local268;
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == this) {
			for (local268 = Static672.aClass387Array1.length - 1; local268 >= 0; local268--) {
				@Pc(274) Class387 local274 = Static672.aClass387Array1[local268];
				if (local274 != null && local274.anInt10806 != -1) {
					@Pc(309) int local309;
					if (local274.anInt10809 == 1) {
						@Pc(297) Class3_Sub13 local297 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local274.anInt10811);
						if (local297 != null) {
							@Pc(302) Class19_Sub1_Sub3_Sub2_Sub1 local302 = local297.aClass19_Sub1_Sub3_Sub2_Sub1_2;
							local309 = local302.anInt11204 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
							@Pc(316) int local316 = local302.anInt11211 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
							if (Static568.aBoolean784) {
								this.method6617(local274.anInt10806, local309, arg0, local316, Static705.anInt11029, local31, super.aClass157Array3[0], 92160000);
							} else {
								this.method6614(local309, super.aClass157Array3[0], arg0, local31, local316, local274.anInt10806, 92160000);
							}
						}
					}
					@Pc(370) int local370;
					if (local274.anInt10809 == 2) {
						@Pc(364) int local364 = local274.anInt10805 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
						local370 = local274.anInt10808 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
						local309 = local274.anInt10807 << 9;
						local309 *= local309;
						if (Static568.aBoolean784) {
							this.method6617(local274.anInt10806, local364, arg0, local370, Static705.anInt11029, local31, super.aClass157Array3[0], local309);
						} else {
							this.method6614(local364, super.aClass157Array3[0], arg0, local31, local370, local274.anInt10806, local309);
						}
					}
					if (local274.anInt10809 == 10 && local274.anInt10811 >= 0 && Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1.length > local274.anInt10811) {
						@Pc(444) Class19_Sub1_Sub3_Sub2_Sub2 local444 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local274.anInt10811];
						if (local444 != null) {
							local370 = local444.anInt11204 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
							local309 = local444.anInt11211 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
							if (Static568.aBoolean784) {
								this.method6617(local274.anInt10806, local370, arg0, local309, Static705.anInt11029, local31, super.aClass157Array3[0], 92160000);
							} else {
								this.method6614(local370, super.aClass157Array3[0], arg0, local31, local309, local274.anInt10806, 92160000);
							}
						}
					}
				}
			}
			local31.method6344(local36);
			local31.method6354(super.anInt11204, super.anInt11208, super.anInt11211);
		}
		local31.method6344(local36);
		local31.method6354(super.anInt11204, -super.anInt7765 + super.anInt11208 - 5, super.anInt11211);
		if (local111 == null) {
			local111 = Static58.method727(super.aClass157Array3.length, true);
		}
		this.method6590(false, super.aClass157Array3, local31, arg0);
		if (Static568.aBoolean784) {
			for (local268 = 0; local268 < super.aClass157Array3.length; local268++) {
				if (super.aClass157Array3[local268] != null) {
					super.aClass157Array3[local268].method5227(local31, local111.aClass19_Sub6Array1[local268], Static705.anInt11029, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local268 = 0; local268 < super.aClass157Array3.length; local268++) {
				if (super.aClass157Array3[local268] != null) {
					super.aClass157Array3[local268].method5232(local31, local111.aClass19_Sub6Array1[local268], Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass19_Sub9_7 != null) {
			@Pc(643) Class162 local643 = super.aClass19_Sub9_7.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local643, Static705.anInt11029);
			} else {
				arg0.method7656(local643);
			}
		}
		for (local268 = 0; local268 < super.aClass157Array3.length; local268++) {
			if (super.aClass157Array3[local268] != null) {
				super.aBoolean597 |= super.aClass157Array3[local268].F();
			}
			super.aClass157Array3[local268] = null;
		}
		super.anInt7788 = Static220.anInt4252;
		return local111;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)I")
	@Override
	protected int method6584() {
		return this.anInt7843;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILjava/lang/String;I)V")
	public void method6610(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		this.method6608(arg1, arg2, arg0, Static285.method4300() * Static224.aClass84_1.anInt2476);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IBIB)V")
	public void method6611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt7824 < super.anIntArray430.length - 1) {
			super.anInt7824++;
		}
		for (@Pc(32) int local32 = super.anInt7824; local32 > 0; local32--) {
			super.anIntArray430[local32] = super.anIntArray430[local32 - 1];
			super.lb[local32] = super.lb[local32 - 1];
			super.aByteArray69[local32] = super.aByteArray69[local32 - 1];
		}
		super.anIntArray430[0] = arg0;
		super.aByteArray69[0] = arg2;
		super.lb[0] = arg1;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(Z)Z")
	public boolean method6612() {
		return this.aClass236_1 != null;
	}

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "(B)Lclient!jd;")
	@Override
	public Class184 method6594() {
		if (super.aClass184_3 != null) {
			if (super.aClass184_3.aString88 == null) {
				return null;
			}
			if (Static424.anInt7467 == 0 || Static424.anInt7467 == 3 || Static424.anInt7467 == 1 && Static12.method155(this.aString109)) {
				return super.aClass184_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method6591() {
		return Static224.aClass84_1.aBoolean205;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		if (this.aClass236_1 == null || !super.aBoolean596 && !this.method6621(arg0, 0)) {
			return;
		}
		@Pc(31) Class181 local31 = arg0.method7693();
		local31.method6344(super.aClass340_7.method8085());
		local31.method6354(super.anInt11204, super.anInt11208 - 5, super.anInt11211);
		this.method6590(super.aBoolean596, super.aClass157Array3, local31, arg0);
		for (@Pc(58) int local58 = 0; super.aClass157Array3.length > local58; local58++) {
			super.aClass157Array3[local58] = null;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!ka;BLclient!ha;Lclient!iu;III)V")
	private void method6614(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg4 * arg4;
		if (local11 < 262144 || arg6 < local11) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg0, (double) arg4) * 2607.5945876176133D - (double) super.aClass340_7.method8085()) & 0x3FFF;
		@Pc(67) Class157 local67 = Static479.method7004(arg5, super.anInt7792, arg2, super.anInt7791, super.anInt7773, local40);
		if (local67 != null) {
			arg2.C(false);
			local67.method5232(arg3, (Class19_Sub6) null, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass236_1 == null || !this.method6621(arg1, 131072)) {
			return false;
		}
		@Pc(22) Class181 local22 = arg1.method7693();
		@Pc(27) int local27 = super.aClass340_7.method8085();
		local22.method6344(local27);
		local22.method6354(super.anInt11204, super.anInt11208, super.anInt11211);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass157Array3.length; local42++) {
			if (super.aClass157Array3[local42] != null && (Static568.aBoolean784 ? super.aClass157Array3[local42].method5221(arg2, arg0, local22, true, 0, Static705.anInt11029) : super.aClass157Array3[local42].method5218(arg2, arg0, local22, true, 0))) {
				local40 = true;
				break;
			}
		}
		for (@Pc(95) int local95 = 0; super.aClass157Array3.length > local95; local95++) {
			super.aClass157Array3[local95] = null;
		}
		if (15 != 15) {
			this.anInt7850 = -64;
		}
		return local40;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLclient!rba;)V")
	public void method6615(@OriginalArg(0) byte arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		arg1.anInt6241 = 0;
		@Pc(12) int local12 = arg1.method5322(-28);
		this.aByte122 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean598;
		this.aBoolean598 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method6592();
		this.method6599((local12 >> 3 & 0x7) + 1);
		this.aByte123 = (byte) (local12 >> 6 & 0x3);
		super.anInt11204 += this.method6592() - local44 << 8;
		super.anInt11211 += this.method6592() - local44 << 8;
		this.aByte124 = arg1.method5288();
		this.anInt7835 = arg1.method5288();
		this.anInt7850 = arg1.method5288();
		this.aBoolean602 = arg1.method5288() == 1;
		if (Static364.aClass371_4 == Static487.aClass371_7 && Static651.anInt10450 >= 2) {
			this.aBoolean602 = false;
		}
		@Pc(129) int local129 = -1;
		this.anInt7836 = 0;
		@Pc(137) int[] local137 = new int[Static423.aClass218_2.anIntArray341.length];
		@Pc(142) Class22[] local142 = new Class22[Static423.aClass218_2.anIntArray341.length];
		@Pc(147) Class91[] local147 = new Class91[Static423.aClass218_2.anIntArray341.length];
		@Pc(163) int local163;
		@Pc(180) int local180;
		@Pc(186) int local186;
		@Pc(238) int local238;
		for (@Pc(149) int local149 = 0; local149 < Static423.aClass218_2.anIntArray341.length; local149++) {
			if (Static423.aClass218_2.anIntArray341[local149] != 1) {
				local163 = arg1.method5322(-36);
				if (local163 == 0) {
					local137[local149] = 0;
				} else {
					local180 = arg1.method5322(-116);
					local186 = local180 + (local163 << 8);
					if (local149 == 0 && local186 == 65535) {
						local129 = arg1.method5272();
						this.anInt7836 = arg1.method5322(-122);
						break;
					}
					if (local186 >= 32768) {
						local186 = Static433.anIntArray407[local186 - 32768];
						local137[local149] = local186 | 0x40000000;
						local147[local149] = Static243.aClass406_2.method9394(local186);
						local238 = local147[local149].anInt2690;
						if (local238 != 0) {
							this.anInt7836 = local238;
						}
					} else {
						local137[local149] = Integer.MIN_VALUE | local186 - 256;
					}
				}
			}
		}
		if (local129 == -1) {
			local163 = arg1.method5272();
			local180 = 0;
			for (local186 = 0; local186 < Static423.aClass218_2.anIntArray341.length; local186++) {
				if (Static423.aClass218_2.anIntArray341[local186] == 0) {
					if ((0x1 << local180 & local163) != 0) {
						local142[local186] = Static487.method7091(local147[local186], arg1);
					}
					local180++;
				}
			}
		}
		@Pc(323) int[] local323 = new int[10];
		for (local180 = 0; local180 < 10; local180++) {
			local186 = arg1.method5322(-39);
			if (Static92.aShortArrayArrayArray1.length <= local180 || local186 < 0 || Static92.aShortArrayArrayArray1[local180][0].length <= local186) {
				local186 = 0;
			}
			local323[local180] = local186;
		}
		this.anInt7843 = arg1.method5272();
		this.aString108 = arg1.method5295();
		this.aString109 = this.aString108;
		if (arg0 > -113) {
			return;
		}
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == this) {
			Static508.aString113 = this.aString108;
		}
		this.anInt7841 = arg1.method5322(-50);
		if (local40) {
			this.anInt7849 = arg1.method5272();
			if (this.anInt7849 == 65535) {
				this.anInt7849 = -1;
			}
			this.anInt7834 = -1;
			this.anInt7837 = this.anInt7841;
		} else {
			this.anInt7849 = 0;
			this.anInt7837 = arg1.method5322(-28);
			this.anInt7834 = arg1.method5322(-36);
			if (this.anInt7834 == 255) {
				this.anInt7834 = -1;
			}
		}
		local186 = this.anInt7856;
		this.anInt7856 = arg1.method5322(-55);
		@Pc(475) int local475;
		if (this.anInt7856 == 0) {
			Static46.method626(this);
		} else {
			local238 = this.anInt7848;
			@Pc(472) int local472 = this.anInt7826;
			local475 = this.anInt7853;
			@Pc(478) int local478 = this.anInt7827;
			@Pc(481) int local481 = this.anInt7846;
			this.anInt7848 = arg1.method5272();
			this.anInt7826 = arg1.method5272();
			this.anInt7853 = arg1.method5272();
			this.anInt7827 = arg1.method5272();
			this.anInt7846 = arg1.method5322(-78);
			if (local21 != this.aBoolean598 || local186 != this.anInt7856 || this.anInt7848 != local238 || this.anInt7826 != local472 || this.anInt7853 != local475 || this.anInt7827 != local478 || local481 != this.anInt7846) {
				Static617.method8395(this);
			}
		}
		if (this.aClass236_1 == null) {
			this.aClass236_1 = new Class236();
		}
		local238 = this.aClass236_1.anInt6856;
		@Pc(586) int[] local586 = this.aClass236_1.anIntArray373;
		this.aClass236_1.method5753(this.method6584(), local137, this.aByte122 == 1, local323, local142, local129);
		if (local129 != local238) {
			super.anInt11204 = (super.anIntArray430[0] << 9) + (this.method6592() << 8);
			super.anInt11211 = (super.lb[0] << 9) + (this.method6592() << 8);
		}
		if (super.anInt7796 == Static584.anInt9539 && local586 != null) {
			for (local475 = 0; local475 < local323.length; local475++) {
				if (local586[local475] != local323[local475]) {
					Static243.aClass406_2.method9399();
					break;
				}
			}
		}
		if (super.aClass19_Sub9_7 != null) {
			super.aClass19_Sub9_7.method6769();
		}
		if (!super.aClass100_8.method8963() || !super.aBoolean595) {
			return;
		}
		@Pc(713) Class274 local713 = this.method6600();
		if (!local713.method6903(super.aClass100_8.method8976())) {
			super.aClass100_8.method8962(-1);
			super.aBoolean595 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(III)V")
	public void method6616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray430[0] = arg0;
		super.anInt7822 = 0;
		super.anInt7821 = 0;
		super.anInt7824 = 0;
		super.lb[0] = arg1;
		@Pc(26) int local26 = this.method6592();
		super.anInt11204 = local26 * 256 + super.anIntArray430[0] * 512;
		super.anInt11211 = local26 * 256 + super.lb[0] * 512;
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == this) {
			Static538.method6234();
		}
		if (super.aClass19_Sub9_7 != null) {
			super.aClass19_Sub9_7.method6769();
		}
	}

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILclient!ha;IILclient!iu;Lclient!ka;I)V")
	private void method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) Class157 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg1 * arg1;
		if (local11 < 262144 || arg7 < local11) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D - (double) super.aClass340_7.method8085()) & 0x3FFF;
		@Pc(52) Class157 local52 = Static479.method7004(arg0, super.anInt7792, arg2, super.anInt7791, super.anInt7773, local38);
		if (local52 != null) {
			arg2.C(false);
			local52.method5227(arg5, (Class19_Sub6) null, arg4, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method6618() {
		return this.aString109;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIBI)V")
	public void method6620(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.aClass100_9.method8963() && super.aClass100_9.method8977().anInt770 == 1) {
			super.anIntArray425 = null;
			super.aClass100_9.method8962(-1);
		}
		for (@Pc(41) int local41 = 0; super.aClass385Array3.length > local41; local41++) {
			if (super.aClass385Array3[local41].anInt10760 != -1) {
				@Pc(62) Class310 local62 = Static660.aClass307_2.method7493(super.aClass385Array3[local41].anInt10760);
				if (local62.aBoolean661 && local62.anInt8987 != -1 && Static59.aClass177_1.method4259(local62.anInt8987).anInt770 == 1) {
					super.aClass385Array3[local41].aClass100_11.method8962(-1);
					super.aClass385Array3[local41].anInt10760 = -1;
				}
			}
		}
		this.anInt7825 = -1;
		if (arg2 < 0 || Static362.anInt8653 <= arg2 || arg0 < 0 || Static206.anInt11291 <= arg0) {
			this.method6616(arg2, arg0);
		} else if (super.anIntArray430[0] >= 0 && super.anIntArray430[0] < Static362.anInt8653 && super.lb[0] >= 0 && super.lb[0] < Static206.anInt11291) {
			if (arg1 == 2) {
				Static517.method7375(this, arg2, arg0);
			}
			this.method6611(arg2, arg0, arg1);
		} else {
			this.method6616(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ha;BI)Z")
	private boolean method6621(@OriginalArg(0) Class67 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class274 local11 = this.method6600();
		@Pc(29) Class100 local29 = super.aClass100_9.method8963() && !super.aClass100_9.method8975() ? super.aClass100_9 : null;
		@Pc(54) Class100 local54 = super.aClass100_8.method8963() && !this.aBoolean603 && (!super.aBoolean595 || local29 == null) ? super.aClass100_8 : null;
		@Pc(57) int local57 = local11.anInt8176;
		@Pc(75) int local75 = local11.anInt8179;
		if (local57 != 0 || local75 != 0 || local11.anInt8190 != 0 || local11.anInt8172 != 0) {
			arg1 |= 0x7;
		}
		@Pc(106) int local106 = super.aClass340_7.method8085();
		@Pc(134) boolean local134 = super.aByte118 != 0 && super.anInt7813 <= Static269.anInt4883 && Static269.anInt4883 < super.anInt7808;
		if (local134) {
			arg1 |= 0x80000;
		}
		@Pc(167) Class157 local167 = super.aClass157Array3[0] = this.aClass236_1.method5755(local106, local29, Static577.aClass362_1, Static208.aClass29_2, Static243.aClass406_2, Static255.aClass238_1, arg1, super.aClass100_Sub1_Sub1Array3, Static631.aClass85_2, arg0, local54, Static59.aClass177_1, super.anIntArray429, Static423.aClass218_2);
		@Pc(170) int local170 = Static682.method9020();
		if (Static719.anInt11246 < 96 && local170 > 50) {
			Static700.method9157();
		}
		if (Static364.aClass371_4 != Static487.aClass371_7 && local170 < 50) {
			@Pc(195) int local195 = 50 - local170;
			while (local195 > Static244.anInt4562) {
				Static441.aByteArrayArray10[Static244.anInt4562] = new byte[102400];
				Static244.anInt4562++;
			}
			while (Static244.anInt4562 > local195) {
				Static244.anInt4562--;
				Static441.aByteArrayArray10[Static244.anInt4562] = null;
			}
		} else if (Static487.aClass371_7 != Static364.aClass371_4) {
			Static244.anInt4562 = 0;
			Static441.aByteArrayArray10 = new byte[50][];
		}
		if (local167 == null) {
			return false;
		}
		super.anInt7760 = local167.fa();
		super.anInt7770 = local167.ma();
		this.method6605(local167);
		if (local57 == 0 && local75 == 0) {
			this.method6587(this.method6592() << 9, 0, local106, this.method6592() << 9, 0);
		} else {
			this.method6587(local57, local11.anInt8186, local106, local75, local11.anInt8164);
			if (super.anInt7792 != 0) {
				local167.FA(super.anInt7792);
			}
			if (super.anInt7791 != 0) {
				local167.VA(super.anInt7791);
			}
			if (super.anInt7773 != 0) {
				local167.H(0, super.anInt7773, 0);
			}
		}
		if (local134) {
			local167.method5212(super.aByte120, super.aByte121, super.aByte119, super.aByte118 & 0xFF);
		}
		if (!this.aBoolean603) {
			this.method6586(local57, local75, arg0, local11, local106, local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method6622() {
		@Pc(7) String local7 = "";
		if (Static301.aStringArray18 != null) {
			local7 = local7 + Static301.aStringArray18[this.aByte123];
		}
		@Pc(33) int[] local33;
		if (this.aByte122 == 1 && Static220.anIntArray222 != null) {
			local33 = Static220.anIntArray222;
		} else {
			local33 = Static678.anIntArray619;
		}
		if (local33 != null && local33[this.aByte123] != -1) {
			@Pc(57) Class59 local57 = Static170.aClass191_1.method4685(local33[this.aByte123]);
			if (local57.aChar3 == 's') {
				local7 = local7 + local57.method1295(this.aByte124 & 0xFF);
			} else {
				Static64.method799("gdn1", new Throwable());
				local33[this.aByte123] = -1;
			}
		}
		local7 = local7 + this.aString108;
		if (Static674.aStringArray39 != null) {
			local7 = local7 + Static674.aStringArray39[this.aByte123];
		}
		return local7;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
	@Override
	public int method6592() {
		return this.aClass236_1 == null || this.aClass236_1.anInt6856 == -1 ? super.method6592() : Static631.aClass85_2.method2214(this.aClass236_1.anInt6856).anInt437;
	}
}
