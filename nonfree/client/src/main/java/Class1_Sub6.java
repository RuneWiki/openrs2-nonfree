import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[S")
	public short[] aShortArray2 = new short[128];

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[Lclient!jf;")
	public Class76[] aClass76Array1 = new Class76[128];

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[I")
	private int[] anIntArray34 = new int[128];

	@OriginalMember(owner = "client!b", name = "w", descriptor = "[B")
	public byte[] aByteArray4 = new byte[128];

	@OriginalMember(owner = "client!b", name = "x", descriptor = "[Lclient!cc;")
	public Class1_Sub10_Sub1[] aClass1_Sub10_Sub1Array1;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "[B")
	public byte[] aByteArray5 = new byte[128];

	@OriginalMember(owner = "client!b", name = "F", descriptor = "[B")
	public byte[] aByteArray6 = new byte[128];

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	public int anInt280;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aClass1_Sub10_Sub1Array1 = new Class1_Sub10_Sub1[128];
		@Pc(38) Class1_Sub11 local38 = new Class1_Sub11(arg0);
		while (local38.aByteArray47[local29 + local38.anInt3264] != 0) {
			local29++;
		}
		@Pc(55) byte[] local55 = new byte[local29];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local29; local57++) {
			local55[local57] = local38.method2663();
		}
		local29++;
		local38.anInt3264++;
		local57 = local38.anInt3264;
		local38.anInt3264 += local29;
		@Pc(91) int local91;
		for (local91 = 0; local38.aByteArray47[local38.anInt3264 + local91] != 0; local91++) {
		}
		@Pc(106) byte[] local106 = new byte[local91];
		@Pc(108) int local108;
		for (local108 = 0; local108 < local91; local108++) {
			local106[local108] = local38.method2663();
		}
		local38.anInt3264++;
		local91++;
		@Pc(133) int local133 = 0;
		local108 = local38.anInt3264;
		local38.anInt3264 += local91;
		while (local38.aByteArray47[local38.anInt3264 + local133] != 0) {
			local133++;
		}
		@Pc(157) byte[] local157 = new byte[local133];
		for (@Pc(159) int local159 = 0; local159 < local133; local159++) {
			local157[local159] = local38.method2663();
		}
		local133++;
		local38.anInt3264++;
		@Pc(185) byte[] local185 = new byte[local133];
		@Pc(190) int local190;
		@Pc(202) int local202;
		if (local133 <= 1) {
			local190 = local133;
		} else {
			@Pc(194) int local194 = 1;
			local185[1] = 1;
			local190 = 2;
			for (local202 = 2; local202 < local133; local202++) {
				@Pc(209) int local209 = local38.method2690();
				if (local209 == 0) {
					local194 = local190++;
				} else {
					if (local194 >= local209) {
						local209--;
					}
					local194 = local209;
				}
				local185[local202] = (byte) local194;
			}
		}
		@Pc(239) Class76[] local239 = new Class76[local190];
		for (local202 = 0; local202 < local239.length; local202++) {
			@Pc(257) Class76 local257 = local239[local202] = new Class76();
			@Pc(261) int local261 = local38.method2690();
			if (local261 > 0) {
				local257.aByteArray42 = new byte[local261 * 2];
			}
			local261 = local38.method2690();
			if (local261 > 0) {
				local257.aByteArray43 = new byte[local261 * 2 + 2];
				local257.aByteArray43[1] = 64;
			}
		}
		local202 = local38.method2690();
		@Pc(310) byte[] local310 = local202 > 0 ? new byte[local202 * 2] : null;
		local202 = local38.method2690();
		@Pc(324) byte[] local324 = local202 <= 0 ? null : new byte[local202 * 2];
		@Pc(326) int local326;
		for (local326 = 0; local38.aByteArray47[local326 + local38.anInt3264] != 0; local326++) {
		}
		@Pc(343) byte[] local343 = new byte[local326];
		@Pc(345) int local345;
		for (local345 = 0; local345 < local326; local345++) {
			local343[local345] = local38.method2663();
		}
		local326++;
		local38.anInt3264++;
		local345 = 0;
		@Pc(368) int local368;
		for (local368 = 0; local368 < 128; local368++) {
			local345 += local38.method2690();
			this.aShortArray2[local368] = (short) local345;
		}
		local345 = 0;
		for (local368 = 0; local368 < 128; local368++) {
			local345 += local38.method2690();
			this.aShortArray2[local368] = (short) (this.aShortArray2[local368] + (local345 << 8));
		}
		local368 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421;
		for (local421 = 0; local421 < 128; local421++) {
			if (local368 == 0) {
				if (local343.length <= local419) {
					local368 = -1;
				} else {
					local368 = local343[local419++];
				}
				local417 = local38.method2650();
			}
			this.aShortArray2[local421] = (short) (this.aShortArray2[local421] + ((local417 - 1 & 0x2) << 14));
			this.anIntArray34[local421] = local417;
			local368--;
		}
		local419 = 0;
		local368 = 0;
		local421 = 0;
		@Pc(485) int local485;
		for (local485 = 0; local485 < 128; local485++) {
			if (this.anIntArray34[local485] != 0) {
				if (local368 == 0) {
					if (local419 >= local55.length) {
						local368 = -1;
					} else {
						local368 = local55[local419++];
					}
					local421 = local38.aByteArray47[local57++] - 1;
				}
				local368--;
				this.aByteArray5[local485] = (byte) local421;
			}
		}
		local368 = 0;
		local485 = 0;
		local419 = 0;
		for (@Pc(542) int local542 = 0; local542 < 128; local542++) {
			if (this.anIntArray34[local542] != 0) {
				if (local368 == 0) {
					local485 = local38.aByteArray47[local108++] + 16 << 2;
					if (local419 < local106.length) {
						local368 = local106[local419++];
					} else {
						local368 = -1;
					}
				}
				local368--;
				this.aByteArray6[local542] = (byte) local485;
			}
		}
		local419 = 0;
		local368 = 0;
		@Pc(604) Class76 local604 = null;
		@Pc(606) int local606;
		for (local606 = 0; local606 < 128; local606++) {
			if (this.anIntArray34[local606] != 0) {
				if (local368 == 0) {
					local604 = local239[local185[local419]];
					if (local157.length <= local419) {
						local368 = -1;
					} else {
						local368 = local157[local419++];
					}
				}
				local368--;
				this.aClass76Array1[local606] = local604;
			}
		}
		local419 = 0;
		local368 = 0;
		local606 = 0;
		@Pc(661) int local661;
		for (local661 = 0; local661 < 128; local661++) {
			if (local368 == 0) {
				if (local419 >= local343.length) {
					local368 = -1;
				} else {
					local368 = local343[local419++];
				}
				if (this.anIntArray34[local661] > 0) {
					local606 = local38.method2690() + 1;
				}
			}
			this.aByteArray4[local661] = (byte) local606;
			local368--;
		}
		this.anInt280 = local38.method2690() + 1;
		@Pc(723) Class76 local723;
		@Pc(729) int local729;
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.aByteArray42 != null) {
				for (local729 = 1; local729 < local723.aByteArray42.length; local729 += 2) {
					local723.aByteArray42[local729] = local38.method2663();
				}
			}
			if (local723.aByteArray43 != null) {
				for (local729 = 3; local729 < local723.aByteArray43.length - 2; local729 += 2) {
					local723.aByteArray43[local729] = local38.method2663();
				}
			}
		}
		if (local310 != null) {
			for (local661 = 1; local661 < local310.length; local661 += 2) {
				local310[local661] = local38.method2663();
			}
		}
		if (local324 != null) {
			for (local661 = 1; local661 < local324.length; local661 += 2) {
				local324[local661] = local38.method2663();
			}
		}
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.aByteArray43 != null) {
				local345 = 0;
				for (local729 = 2; local729 < local723.aByteArray43.length; local729 += 2) {
					local345 = local345 + local38.method2690() + 1;
					local723.aByteArray43[local729] = (byte) local345;
				}
			}
		}
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.aByteArray42 != null) {
				local345 = 0;
				for (local729 = 2; local729 < local723.aByteArray42.length; local729 += 2) {
					local345 = local38.method2690() + local345 + 1;
					local723.aByteArray42[local729] = (byte) local345;
				}
			}
		}
		@Pc(982) byte local982;
		@Pc(1002) int local1002;
		@Pc(1005) int local1005;
		@Pc(1019) int local1019;
		@Pc(1054) int local1054;
		@Pc(941) byte local941;
		if (local310 != null) {
			local345 = local38.method2690();
			local310[0] = (byte) local345;
			for (local661 = 2; local661 < local310.length; local661 += 2) {
				local345 += local38.method2690() + 1;
				local310[local661] = (byte) local345;
			}
			local941 = local310[0];
			@Pc(945) byte local945 = local310[1];
			for (local729 = 0; local729 < local941; local729++) {
				this.aByteArray4[local729] = (byte) (local945 * this.aByteArray4[local729] + 32 >> 6);
			}
			local729 = 2;
			while (local310.length > local729) {
				local982 = local310[local729];
				@Pc(988) byte local988 = local310[local729 + 1];
				local1002 = (local982 - local941) / 2 + local945 * (local982 - local941);
				local729 += 2;
				for (local1005 = local941; local1005 < local982; local1005++) {
					local1019 = Static43.method748(local982 - local941, local1002);
					this.aByteArray4[local1005] = (byte) (this.aByteArray4[local1005] * local1019 + 32 >> 6);
					local1002 += local988 - local945;
				}
				local945 = local988;
				local941 = local982;
			}
			for (local1054 = local941; local1054 < 128; local1054++) {
				this.aByteArray4[local1054] = (byte) (this.aByteArray4[local1054] * local945 + 32 >> 6);
			}
		}
		if (local324 != null) {
			local345 = local38.method2690();
			local324[0] = (byte) local345;
			for (local661 = 2; local661 < local324.length; local661 += 2) {
				local345 = local345 + local38.method2690() + 1;
				local324[local661] = (byte) local345;
			}
			local941 = local324[0];
			@Pc(1125) int local1125 = local324[1] << 1;
			for (local729 = 0; local729 < local941; local729++) {
				local1054 = (this.aByteArray6[local729] & 0xFF) + local1125;
				if (local1054 < 0) {
					local1054 = 0;
				}
				if (local1054 > 128) {
					local1054 = 128;
				}
				this.aByteArray6[local729] = (byte) local1054;
			}
			local729 = 2;
			@Pc(1183) int local1183;
			while (local324.length > local729) {
				local982 = local324[local729];
				local1183 = local324[local729 + 1] << 1;
				local729 += 2;
				local1002 = (local982 - local941) / 2 + (local982 - local941) * local1125;
				for (local1005 = local941; local1005 < local982; local1005++) {
					local1019 = Static43.method748(local982 - local941, local1002);
					local1002 += local1183 - local1125;
					@Pc(1226) int local1226 = local1019 + (this.aByteArray6[local1005] & 0xFF);
					if (local1226 < 0) {
						local1226 = 0;
					}
					if (local1226 > 128) {
						local1226 = 128;
					}
					this.aByteArray6[local1005] = (byte) local1226;
				}
				local941 = local982;
				local1125 = local1183;
			}
			for (local1054 = local941; local1054 < 128; local1054++) {
				local1183 = local1125 + (this.aByteArray6[local1054] & 0xFF);
				if (local1183 < 0) {
					local1183 = 0;
				}
				if (local1183 > 128) {
					local1183 = 128;
				}
				this.aByteArray6[local1054] = (byte) local1183;
			}
		}
		for (local661 = 0; local661 < local190; local661++) {
			local239[local661].anInt2806 = local38.method2690();
		}
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.aByteArray42 != null) {
				local723.anInt2811 = local38.method2690();
			}
			if (local723.aByteArray43 != null) {
				local723.anInt2809 = local38.method2690();
			}
			if (local723.anInt2806 > 0) {
				local723.anInt2813 = local38.method2690();
			}
		}
		for (local661 = 0; local661 < local190; local661++) {
			local239[local661].anInt2808 = local38.method2690();
		}
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.anInt2808 > 0) {
				local723.anInt2814 = local38.method2690();
			}
		}
		for (local661 = 0; local661 < local190; local661++) {
			local723 = local239[local661];
			if (local723.anInt2814 > 0) {
				local723.anInt2812 = local38.method2690();
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[ILclient!nc;)Z")
	public boolean method291(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class109 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub10_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(30) int local30 = this.anIntArray34[local13];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg2.method2937(arg1, local30 >> 2);
						} else {
							local11 = arg2.method2933(local30 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub10_Sub1Array1[local13] = local11;
						this.anIntArray34[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public void method295() {
		this.anIntArray34 = null;
	}
}
