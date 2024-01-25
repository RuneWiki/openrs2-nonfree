import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "[I")
	public static final int[] anIntArray204 = new int[16384];

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "[I")
	public static final int[] anIntArray206 = new int[16384];

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
	public int anInt2471;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "[Lclient!wia;")
	public Class387[] aClass387Array1;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "[Lclient!ks;")
	public Class3_Sub35_Sub1[] aClass3_Sub35_Sub1Array1;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!dw", name = "E", descriptor = "[S")
	public short[] aShortArray29;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray206[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray204[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class3_Sub20() {
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([B)V")
	public Class3_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = new byte[128];
		this.aShortArray29 = new short[128];
		this.aByteArray17 = new byte[128];
		this.aClass387Array1 = new Class387[128];
		this.aClass3_Sub35_Sub1Array1 = new Class3_Sub35_Sub1[128];
		this.aByteArray16 = new byte[128];
		this.anIntArray205 = new int[128];
		@Pc(36) Class3_Sub25 local36 = new Class3_Sub25(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray106[local36.anInt9765 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method8621();
		}
		local38++;
		local36.anInt9765++;
		@Pc(79) int local79 = local36.anInt9765;
		local36.anInt9765 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray106[local87 + local36.anInt9765] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method8621();
		}
		local87++;
		local36.anInt9765++;
		@Pc(129) int local129 = local36.anInt9765;
		local36.anInt9765 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray106[local137 + local36.anInt9765] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method8621();
		}
		local137++;
		local36.anInt9765++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 <= 1) {
			local185 = local137;
		} else {
			local178[1] = 1;
			local185 = 2;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method8632();
				if (local203 == 0) {
					local195 = local185++;
				} else {
					if (local203 <= local195) {
						local203--;
					}
					local195 = local203;
				}
				local178[local197] = (byte) local195;
			}
		}
		@Pc(232) Class387[] local232 = new Class387[local185];
		for (local197 = 0; local197 < local232.length; local197++) {
			@Pc(244) Class387 local244 = local232[local197] = new Class387();
			@Pc(248) int local248 = local36.method8632();
			if (local248 > 0) {
				local244.aByteArray109 = new byte[local248 * 2];
			}
			local248 = local36.method8632();
			if (local248 > 0) {
				local244.aByteArray110 = new byte[local248 * 2 + 2];
				local244.aByteArray110[1] = 64;
			}
		}
		local203 = local36.method8632();
		@Pc(297) byte[] local297 = local203 > 0 ? new byte[local203 * 2] : null;
		local203 = local36.method8632();
		@Pc(313) byte[] local313 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(315) int local315;
		for (local315 = 0; local36.aByteArray106[local36.anInt9765 + local315] != 0; local315++) {
		}
		@Pc(330) byte[] local330 = new byte[local315];
		for (@Pc(332) int local332 = 0; local332 < local315; local332++) {
			local330[local332] = local36.method8621();
		}
		local315++;
		local36.anInt9765++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method8632();
			this.aShortArray29[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local36.method8632();
			this.aShortArray29[local381] = (short) (this.aShortArray29[local381] + (local357 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local408 >= local330.length) {
					local406 = -1;
				} else {
					local406 = local330[local408++];
				}
				local410 = local36.method8626();
			}
			this.aShortArray29[local412] = (short) (this.aShortArray29[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray205[local412] = local410;
			local406--;
		}
		local406 = 0;
		local408 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray205[local466] != 0) {
				if (local406 == 0) {
					local464 = local36.aByteArray106[local79++] - 1;
					if (local408 >= local55.length) {
						local406 = -1;
					} else {
						local406 = local55[local408++];
					}
				}
				local406--;
				this.aByteArray17[local466] = (byte) local464;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray205[local525] != 0) {
				if (local406 == 0) {
					if (local408 < local101.length) {
						local406 = local101[local408++];
					} else {
						local406 = -1;
					}
					local523 = local36.aByteArray106[local129++] + 16 << 2;
				}
				this.aByteArray18[local525] = (byte) local523;
				local406--;
			}
		}
		local406 = 0;
		local408 = 0;
		@Pc(581) Class387 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray205[local583] != 0) {
				if (local406 == 0) {
					local581 = local232[local178[local408]];
					if (local154.length > local408) {
						local406 = local154[local408++];
					} else {
						local406 = -1;
					}
				}
				local406--;
				this.aClass387Array1[local583] = local581;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(634) int local634 = 0;
		for (@Pc(636) int local636 = 0; local636 < 128; local636++) {
			if (local406 == 0) {
				if (local330.length > local408) {
					local406 = local330[local408++];
				} else {
					local406 = -1;
				}
				if (this.anIntArray205[local636] > 0) {
					local634 = local36.method8632() + 1;
				}
			}
			local406--;
			this.aByteArray16[local636] = (byte) local634;
		}
		this.anInt2471 = local36.method8632() + 1;
		@Pc(697) int local697;
		for (@Pc(686) int local686 = 0; local686 < local185; local686++) {
			@Pc(692) Class387 local692 = local232[local686];
			if (local692.aByteArray109 != null) {
				for (local697 = 1; local697 < local692.aByteArray109.length; local697 += 2) {
					local692.aByteArray109[local697] = local36.method8621();
				}
			}
			if (local692.aByteArray110 != null) {
				for (local697 = 3; local697 < local692.aByteArray110.length - 2; local697 += 2) {
					local692.aByteArray110[local697] = local36.method8621();
				}
			}
		}
		@Pc(750) int local750;
		if (local297 != null) {
			for (local750 = 1; local750 < local297.length; local750 += 2) {
				local297[local750] = local36.method8621();
			}
		}
		if (local313 != null) {
			for (local750 = 1; local750 < local313.length; local750 += 2) {
				local313[local750] = local36.method8621();
			}
		}
		@Pc(799) int local799;
		for (local750 = 0; local750 < local185; local750++) {
			@Pc(792) Class387 local792 = local232[local750];
			if (local792.aByteArray110 != null) {
				local357 = 0;
				for (local799 = 2; local799 < local792.aByteArray110.length; local799 += 2) {
					local357 = local36.method8632() + local357 + 1;
					local792.aByteArray110[local799] = (byte) local357;
				}
			}
		}
		@Pc(844) int local844;
		for (local697 = 0; local697 < local185; local697++) {
			@Pc(837) Class387 local837 = local232[local697];
			if (local837.aByteArray109 != null) {
				local357 = 0;
				for (local844 = 2; local844 < local837.aByteArray109.length; local844 += 2) {
					local357 = local36.method8632() + local357 + 1;
					local837.aByteArray109[local844] = (byte) local357;
				}
			}
		}
		@Pc(921) int local921;
		@Pc(948) int local948;
		@Pc(954) byte local954;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(985) int local985;
		@Pc(915) byte local915;
		@Pc(1032) int local1032;
		if (local297 != null) {
			local357 = local36.method8632();
			local297[0] = (byte) local357;
			for (local799 = 2; local799 < local297.length; local799 += 2) {
				local357 += local36.method8632() + 1;
				local297[local799] = (byte) local357;
			}
			local915 = local297[0];
			@Pc(919) byte local919 = local297[1];
			for (local921 = 0; local921 < local915; local921++) {
				this.aByteArray16[local921] = (byte) (local919 * this.aByteArray16[local921] + 32 >> 6);
			}
			for (local948 = 2; local948 < local297.length; local948 += 2) {
				local954 = local297[local948];
				@Pc(960) byte local960 = local297[local948 + 1];
				local974 = (local954 - local915) / 2 + (local954 - local915) * local919;
				for (local976 = local915; local976 < local954; local976++) {
					local985 = Static636.method8871(local954 - local915, local974);
					this.aByteArray16[local976] = (byte) (local985 * this.aByteArray16[local976] + 32 >> 6);
					local974 += local960 - local919;
				}
				local919 = local960;
				local915 = local954;
			}
			for (local1032 = local915; local1032 < 128; local1032++) {
				this.aByteArray16[local1032] = (byte) (local919 * this.aByteArray16[local1032] + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local313 != null) {
			local357 = local36.method8632();
			local313[0] = (byte) local357;
			for (local799 = 2; local799 < local313.length; local799 += 2) {
				local357 += local36.method8632() + 1;
				local313[local799] = (byte) local357;
			}
			local915 = local313[0];
			local1100 = local313[1] << 1;
			for (local921 = 0; local921 < local915; local921++) {
				local948 = local1100 + (this.aByteArray18[local921] & 0xFF);
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray18[local921] = (byte) local948;
			}
			local948 = 2;
			@Pc(1150) int local1150;
			while (local313.length > local948) {
				local954 = local313[local948];
				local1150 = local313[local948 + 1] << 1;
				local974 = (local954 - local915) / 2 + (local954 - local915) * local1100;
				for (local976 = local915; local976 < local954; local976++) {
					local985 = Static636.method8871(local954 - local915, local974);
					@Pc(1183) int local1183 = local985 + (this.aByteArray18[local976] & 0xFF);
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray18[local976] = (byte) local1183;
					local974 += local1150 - local1100;
				}
				local948 += 2;
				local1100 = local1150;
				local915 = local954;
			}
			for (local1032 = local915; local1032 < 128; local1032++) {
				local1150 = (this.aByteArray18[local1032] & 0xFF) + local1100;
				if (local1150 < 0) {
					local1150 = 0;
				}
				if (local1150 > 128) {
					local1150 = 128;
				}
				this.aByteArray18[local1032] = (byte) local1150;
			}
		}
		for (local799 = 0; local799 < local185; local799++) {
			local232[local799].anInt10600 = local36.method8632();
		}
		for (local844 = 0; local844 < local185; local844++) {
			@Pc(1283) Class387 local1283 = local232[local844];
			if (local1283.aByteArray109 != null) {
				local1283.anInt10603 = local36.method8632();
			}
			if (local1283.aByteArray110 != null) {
				local1283.anInt10597 = local36.method8632();
			}
			if (local1283.anInt10600 > 0) {
				local1283.anInt10605 = local36.method8632();
			}
		}
		for (local1100 = 0; local1100 < local185; local1100++) {
			local232[local1100].anInt10599 = local36.method8632();
		}
		for (local921 = 0; local921 < local185; local921++) {
			@Pc(1334) Class387 local1334 = local232[local921];
			if (local1334.anInt10599 > 0) {
				local1334.anInt10601 = local36.method8632();
			}
		}
		for (local948 = 0; local948 < local185; local948++) {
			@Pc(1357) Class387 local1357 = local232[local948];
			if (local1357.anInt10601 > 0) {
				local1357.anInt10598 = local36.method8632();
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B[B[ILclient!mp;)Z")
	public boolean method2269(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class226 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(18) Class3_Sub35_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg0 == null || arg0[local20] != 0) {
				@Pc(35) int local35 = this.anIntArray205[local20];
				if (local35 != 0) {
					if (local35 != local9) {
						local9 = local35--;
						if ((local35 & 0x1) == 0) {
							local18 = arg2.method5484(arg1, local35 >> 2);
						} else {
							local18 = arg2.method5482(arg1, local35 >> 2);
						}
						if (local18 == null) {
							local7 = false;
						}
					}
					if (local18 != null) {
						this.aClass3_Sub35_Sub1Array1[local20] = local18;
						this.anIntArray205[local20] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public void method2270() {
		this.anIntArray205 = null;
	}
}
