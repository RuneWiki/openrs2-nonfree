import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	public int anInt1308;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "[Lclient!nga;")
	public Class228[] aClass228Array1;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "[Lclient!ee;")
	public Class3_Sub20_Sub1[] aClass3_Sub20_Sub1Array1;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!caa", name = "r", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	private Class3_Sub12() {
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aClass228Array1 = new Class228[128];
		this.aByteArray11 = new byte[128];
		this.aByteArray12 = new byte[128];
		this.aClass3_Sub20_Sub1Array1 = new Class3_Sub20_Sub1[128];
		this.anIntArray101 = new int[128];
		this.aShortArray28 = new short[128];
		this.aByteArray13 = new byte[128];
		@Pc(36) Class3_Sub11 local36 = new Class3_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray36[local38 + local36.anInt3520] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method3096();
		}
		local38++;
		local36.anInt3520++;
		@Pc(76) int local76 = local36.anInt3520;
		local36.anInt3520 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray36[local36.anInt3520 + local84] != 0; local84++) {
		}
		@Pc(99) byte[] local99 = new byte[local84];
		for (@Pc(101) int local101 = 0; local101 < local84; local101++) {
			local99[local101] = local36.method3096();
		}
		local84++;
		local36.anInt3520++;
		@Pc(123) int local123 = local36.anInt3520;
		local36.anInt3520 += local84;
		@Pc(131) int local131;
		for (local131 = 0; local36.aByteArray36[local131 + local36.anInt3520] != 0; local131++) {
		}
		@Pc(148) byte[] local148 = new byte[local131];
		for (@Pc(150) int local150 = 0; local150 < local131; local150++) {
			local148[local150] = local36.method3096();
		}
		local131++;
		local36.anInt3520++;
		@Pc(176) byte[] local176 = new byte[local131];
		@Pc(189) int local189;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local131 > 1) {
			local176[1] = 1;
			@Pc(187) int local187 = 1;
			local189 = 2;
			for (local191 = 2; local191 < local131; local191++) {
				local197 = local36.method3118();
				if (local197 == 0) {
					local187 = local189++;
				} else {
					if (local197 <= local187) {
						local197--;
					}
					local187 = local197;
				}
				local176[local191] = (byte) local187;
			}
		} else {
			local189 = local131;
		}
		@Pc(229) Class228[] local229 = new Class228[local189];
		for (local191 = 0; local191 < local229.length; local191++) {
			@Pc(241) Class228 local241 = local229[local191] = new Class228();
			@Pc(245) int local245 = local36.method3118();
			if (local245 > 0) {
				local241.aByteArray78 = new byte[local245 * 2];
			}
			local245 = local36.method3118();
			if (local245 > 0) {
				local241.aByteArray79 = new byte[local245 * 2 + 2];
				local241.aByteArray79[1] = 64;
			}
		}
		local197 = local36.method3118();
		@Pc(293) byte[] local293 = local197 <= 0 ? null : new byte[local197 * 2];
		local197 = local36.method3118();
		@Pc(306) byte[] local306 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(308) int local308;
		for (local308 = 0; local36.aByteArray36[local308 + local36.anInt3520] != 0; local308++) {
		}
		@Pc(322) byte[] local322 = new byte[local308];
		for (@Pc(324) int local324 = 0; local324 < local308; local324++) {
			local322[local324] = local36.method3096();
		}
		local308++;
		local36.anInt3520++;
		@Pc(345) int local345 = 0;
		for (@Pc(347) int local347 = 0; local347 < 128; local347++) {
			local345 += local36.method3118();
			this.aShortArray28[local347] = (short) local345;
		}
		local345 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local345 += local36.method3118();
			this.aShortArray28[local369] = (short) (this.aShortArray28[local369] + (local345 << 8));
		}
		@Pc(396) int local396 = 0;
		@Pc(398) int local398 = 0;
		@Pc(400) int local400 = 0;
		for (@Pc(402) int local402 = 0; local402 < 128; local402++) {
			if (local396 == 0) {
				if (local322.length > local398) {
					local396 = local322[local398++];
				} else {
					local396 = -1;
				}
				local400 = local36.method3088();
			}
			this.aShortArray28[local402] = (short) (this.aShortArray28[local402] + ((local400 - 1 & 0x2) << 14));
			local396--;
			this.anIntArray101[local402] = local400;
		}
		local398 = 0;
		local396 = 0;
		@Pc(458) int local458 = 0;
		for (@Pc(460) int local460 = 0; local460 < 128; local460++) {
			if (this.anIntArray101[local460] != 0) {
				if (local396 == 0) {
					local458 = local36.aByteArray36[local76++] - 1;
					if (local52.length <= local398) {
						local396 = -1;
					} else {
						local396 = local52[local398++];
					}
				}
				this.aByteArray11[local460] = (byte) local458;
				local396--;
			}
		}
		local398 = 0;
		local396 = 0;
		@Pc(516) int local516 = 0;
		for (@Pc(518) int local518 = 0; local518 < 128; local518++) {
			if (this.anIntArray101[local518] != 0) {
				if (local396 == 0) {
					if (local398 >= local99.length) {
						local396 = -1;
					} else {
						local396 = local99[local398++];
					}
					local516 = local36.aByteArray36[local123++] + 16 << 2;
				}
				local396--;
				this.aByteArray12[local518] = (byte) local516;
			}
		}
		local398 = 0;
		local396 = 0;
		@Pc(573) Class228 local573 = null;
		for (@Pc(575) int local575 = 0; local575 < 128; local575++) {
			if (this.anIntArray101[local575] != 0) {
				if (local396 == 0) {
					local573 = local229[local176[local398]];
					if (local398 < local148.length) {
						local396 = local148[local398++];
					} else {
						local396 = -1;
					}
				}
				local396--;
				this.aClass228Array1[local575] = local573;
			}
		}
		local396 = 0;
		local398 = 0;
		@Pc(626) int local626 = 0;
		for (@Pc(628) int local628 = 0; local628 < 128; local628++) {
			if (local396 == 0) {
				if (local322.length > local398) {
					local396 = local322[local398++];
				} else {
					local396 = -1;
				}
				if (this.anIntArray101[local628] > 0) {
					local626 = local36.method3118() + 1;
				}
			}
			this.aByteArray13[local628] = (byte) local626;
			local396--;
		}
		this.anInt1308 = local36.method3118() + 1;
		@Pc(691) int local691;
		for (@Pc(680) int local680 = 0; local680 < local189; local680++) {
			@Pc(686) Class228 local686 = local229[local680];
			if (local686.aByteArray78 != null) {
				for (local691 = 1; local691 < local686.aByteArray78.length; local691 += 2) {
					local686.aByteArray78[local691] = local36.method3096();
				}
			}
			if (local686.aByteArray79 != null) {
				for (local691 = 3; local691 < local686.aByteArray79.length - 2; local691 += 2) {
					local686.aByteArray79[local691] = local36.method3096();
				}
			}
		}
		@Pc(744) int local744;
		if (local293 != null) {
			for (local744 = 1; local744 < local293.length; local744 += 2) {
				local293[local744] = local36.method3096();
			}
		}
		if (local306 != null) {
			for (local744 = 1; local744 < local306.length; local744 += 2) {
				local306[local744] = local36.method3096();
			}
		}
		@Pc(797) int local797;
		for (local744 = 0; local744 < local189; local744++) {
			@Pc(790) Class228 local790 = local229[local744];
			if (local790.aByteArray79 != null) {
				local345 = 0;
				for (local797 = 2; local797 < local790.aByteArray79.length; local797 += 2) {
					local345 += local36.method3118() + 1;
					local790.aByteArray79[local797] = (byte) local345;
				}
			}
		}
		@Pc(838) int local838;
		for (local691 = 0; local691 < local189; local691++) {
			@Pc(831) Class228 local831 = local229[local691];
			if (local831.aByteArray78 != null) {
				local345 = 0;
				for (local838 = 2; local838 < local831.aByteArray78.length; local838 += 2) {
					local345 = local345 + local36.method3118() + 1;
					local831.aByteArray78[local838] = (byte) local345;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(938) int local938;
		@Pc(944) byte local944;
		@Pc(964) int local964;
		@Pc(966) int local966;
		@Pc(976) int local976;
		@Pc(909) byte local909;
		@Pc(1019) int local1019;
		if (local293 != null) {
			local345 = local36.method3118();
			local293[0] = (byte) local345;
			for (local797 = 2; local797 < local293.length; local797 += 2) {
				local345 = local36.method3118() + local345 + 1;
				local293[local797] = (byte) local345;
			}
			local909 = local293[0];
			@Pc(913) byte local913 = local293[1];
			for (local915 = 0; local915 < local909; local915++) {
				this.aByteArray13[local915] = (byte) (local913 * this.aByteArray13[local915] + 32 >> 6);
			}
			local938 = 2;
			while (local938 < local293.length) {
				local944 = local293[local938];
				@Pc(950) byte local950 = local293[local938 + 1];
				local964 = (local944 - local909) / 2 + (local944 - local909) * local913;
				for (local966 = local909; local966 < local944; local966++) {
					local976 = Static85.method1845(local964, local944 - local909);
					this.aByteArray13[local966] = (byte) (local976 * this.aByteArray13[local966] + 32 >> 6);
					local964 += local950 - local913;
				}
				local913 = local950;
				local938 += 2;
				local909 = local944;
			}
			for (local1019 = local909; local1019 < 128; local1019++) {
				this.aByteArray13[local1019] = (byte) (local913 * this.aByteArray13[local1019] + 32 >> 6);
			}
		}
		@Pc(1089) int local1089;
		if (local306 != null) {
			local345 = local36.method3118();
			local306[0] = (byte) local345;
			for (local797 = 2; local797 < local306.length; local797 += 2) {
				local345 = local36.method3118() + local345 + 1;
				local306[local797] = (byte) local345;
			}
			local909 = local306[0];
			local1089 = local306[1] << 1;
			for (local915 = 0; local915 < local909; local915++) {
				local938 = (this.aByteArray12[local915] & 0xFF) + local1089;
				if (local938 < 0) {
					local938 = 0;
				}
				if (local938 > 128) {
					local938 = 128;
				}
				this.aByteArray12[local915] = (byte) local938;
			}
			local938 = 2;
			@Pc(1140) int local1140;
			while (local306.length > local938) {
				local944 = local306[local938];
				local1140 = local306[local938 + 1] << 1;
				local964 = (local944 - local909) * local1089 + (local944 - local909) / 2;
				for (local966 = local909; local966 < local944; local966++) {
					local976 = Static85.method1845(local964, local944 - local909);
					@Pc(1175) int local1175 = local976 + (this.aByteArray12[local966] & 0xFF);
					if (local1175 < 0) {
						local1175 = 0;
					}
					if (local1175 > 128) {
						local1175 = 128;
					}
					this.aByteArray12[local966] = (byte) local1175;
					local964 += local1140 - local1089;
				}
				local938 += 2;
				local1089 = local1140;
				local909 = local944;
			}
			for (local1019 = local909; local1019 < 128; local1019++) {
				local1140 = (this.aByteArray12[local1019] & 0xFF) + local1089;
				if (local1140 < 0) {
					local1140 = 0;
				}
				if (local1140 > 128) {
					local1140 = 128;
				}
				this.aByteArray12[local1019] = (byte) local1140;
			}
		}
		for (local797 = 0; local797 < local189; local797++) {
			local229[local797].anInt6134 = local36.method3118();
		}
		for (local838 = 0; local838 < local189; local838++) {
			@Pc(1270) Class228 local1270 = local229[local838];
			if (local1270.aByteArray78 != null) {
				local1270.anInt6133 = local36.method3118();
			}
			if (local1270.aByteArray79 != null) {
				local1270.anInt6137 = local36.method3118();
			}
			if (local1270.anInt6134 > 0) {
				local1270.anInt6131 = local36.method3118();
			}
		}
		for (local1089 = 0; local1089 < local189; local1089++) {
			local229[local1089].anInt6139 = local36.method3118();
		}
		for (local915 = 0; local915 < local189; local915++) {
			@Pc(1321) Class228 local1321 = local229[local915];
			if (local1321.anInt6139 > 0) {
				local1321.anInt6138 = local36.method3118();
			}
		}
		for (local938 = 0; local938 < local189; local938++) {
			@Pc(1344) Class228 local1344 = local229[local938];
			if (local1344.anInt6138 > 0) {
				local1344.anInt6132 = local36.method3118();
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public void method1062() {
		this.anIntArray101 = null;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([BLclient!tu;I[I)Z")
	public boolean method1064(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class326 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub20_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray101[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method6925(arg2, local25 >> 2);
						} else {
							local11 = arg1.method6920(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub20_Sub1Array1[local13] = local11;
						this.anIntArray101[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
