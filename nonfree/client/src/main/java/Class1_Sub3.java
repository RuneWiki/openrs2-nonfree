import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "[Lclient!pd;")
	public Class1_Sub19_Sub1[] aClass1_Sub19_Sub1Array1 = new Class1_Sub19_Sub1[128];

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "[I")
	private int[] anIntArray24 = new int[128];

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "[S")
	public short[] aShortArray2 = new short[128];

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "[Lclient!qf;")
	public Class80[] aClass80Array1 = new Class80[128];

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
	public byte[] aByteArray1 = new byte[128];

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "[B")
	public byte[] aByteArray2 = new byte[128];

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "[B")
	public byte[] aByteArray3 = new byte[128];

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub9 local36 = new Class1_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray20[local36.anInt1192 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method891();
		}
		local38++;
		local36.anInt1192++;
		@Pc(83) int local83 = 0;
		@Pc(86) int local86 = local36.anInt1192;
		local36.anInt1192 += local38;
		while (local36.aByteArray20[local36.anInt1192 + local83] != 0) {
			local83++;
		}
		@Pc(106) byte[] local106 = new byte[local83];
		for (@Pc(108) int local108 = 0; local108 < local83; local108++) {
			local106[local108] = local36.method891();
		}
		local36.anInt1192++;
		@Pc(129) int local129 = local36.anInt1192;
		local83++;
		@Pc(132) int local132 = 0;
		local36.anInt1192 += local83;
		while (local36.aByteArray20[local36.anInt1192 + local132] != 0) {
			local132++;
		}
		@Pc(153) byte[] local153 = new byte[local132];
		for (@Pc(155) int local155 = 0; local155 < local132; local155++) {
			local153[local155] = local36.method891();
		}
		local36.anInt1192++;
		local132++;
		@Pc(181) byte[] local181 = new byte[local132];
		@Pc(188) int local188;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local132 > 1) {
			@Pc(186) int local186 = 1;
			local188 = 2;
			local181[1] = 1;
			for (local194 = 2; local194 < local132; local194++) {
				local200 = local36.method895();
				if (local200 == 0) {
					local186 = local188++;
				} else {
					if (local200 <= local186) {
						local200--;
					}
					local186 = local200;
				}
				local181[local194] = (byte) local186;
			}
		} else {
			local188 = local132;
		}
		@Pc(236) Class80[] local236 = new Class80[local188];
		for (local194 = 0; local194 < local236.length; local194++) {
			@Pc(248) Class80 local248 = local236[local194] = new Class80();
			@Pc(252) int local252 = local36.method895();
			if (local252 > 0) {
				local248.aByteArray45 = new byte[local252 * 2];
			}
			local252 = local36.method895();
			if (local252 > 0) {
				local248.aByteArray44 = new byte[local252 * 2 + 2];
				local248.aByteArray44[1] = 64;
			}
		}
		local200 = local36.method895();
		@Pc(303) byte[] local303 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local36.method895();
		@Pc(319) byte[] local319 = local200 <= 0 ? null : new byte[local200 * 2];
		@Pc(321) int local321;
		for (local321 = 0; local36.aByteArray20[local36.anInt1192 + local321] != 0; local321++) {
		}
		@Pc(335) byte[] local335 = new byte[local321];
		for (@Pc(337) int local337 = 0; local337 < local321; local337++) {
			local335[local337] = local36.method891();
		}
		local321++;
		local36.anInt1192++;
		@Pc(362) int local362 = 0;
		for (@Pc(364) int local364 = 0; local364 < 128; local364++) {
			local362 += local36.method895();
			this.aShortArray2[local364] = (short) local362;
		}
		local362 = 0;
		for (@Pc(388) int local388 = 0; local388 < 128; local388++) {
			local362 += local36.method895();
			this.aShortArray2[local388] = (short) (this.aShortArray2[local388] + (local362 << 8));
		}
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			if (local413 == 0) {
				if (local335.length > local415) {
					local413 = local335[local415++];
				} else {
					local413 = -1;
				}
				local417 = local36.method945();
			}
			this.aShortArray2[local419] = (short) (this.aShortArray2[local419] + ((local417 - 1 & 0x2) << 14));
			this.anIntArray24[local419] = local417;
			local413--;
		}
		local413 = 0;
		@Pc(476) int local476 = 0;
		local415 = 0;
		for (@Pc(480) int local480 = 0; local480 < 128; local480++) {
			if (this.anIntArray24[local480] != 0) {
				if (local413 == 0) {
					if (local56.length <= local415) {
						local413 = -1;
					} else {
						local413 = local56[local415++];
					}
					local476 = local36.aByteArray20[local86++] - 1;
				}
				local413--;
				this.aByteArray2[local480] = (byte) local476;
			}
		}
		local415 = 0;
		@Pc(528) int local528 = 0;
		local413 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray24[local532] != 0) {
				if (local413 == 0) {
					if (local415 < local106.length) {
						local413 = local106[local415++];
					} else {
						local413 = -1;
					}
					local528 = local36.aByteArray20[local129++] + 16 << 2;
				}
				this.aByteArray1[local532] = (byte) local528;
				local413--;
			}
		}
		local413 = 0;
		@Pc(589) Class80 local589 = null;
		local415 = 0;
		for (@Pc(593) int local593 = 0; local593 < 128; local593++) {
			if (this.anIntArray24[local593] != 0) {
				if (local413 == 0) {
					local589 = local236[local181[local415]];
					if (local415 < local153.length) {
						local413 = local153[local415++];
					} else {
						local413 = -1;
					}
				}
				local413--;
				this.aClass80Array1[local593] = local589;
			}
		}
		local415 = 0;
		local413 = 0;
		@Pc(638) int local638 = 0;
		for (@Pc(640) int local640 = 0; local640 < 128; local640++) {
			if (local413 == 0) {
				if (local335.length <= local415) {
					local413 = -1;
				} else {
					local413 = local335[local415++];
				}
				if (this.anIntArray24[local640] > 0) {
					local638 = local36.method895() + 1;
				}
			}
			this.aByteArray3[local640] = (byte) local638;
			local413--;
		}
		this.anInt180 = local36.method895() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local188; local691++) {
			@Pc(697) Class80 local697 = local236[local691];
			if (local697.aByteArray45 != null) {
				for (local702 = 1; local702 < local697.aByteArray45.length; local702 += 2) {
					local697.aByteArray45[local702] = local36.method891();
				}
			}
			if (local697.aByteArray44 != null) {
				for (local702 = 3; local702 < local697.aByteArray44.length - 2; local702 += 2) {
					local697.aByteArray44[local702] = local36.method891();
				}
			}
		}
		@Pc(755) int local755;
		if (local303 != null) {
			for (local755 = 1; local755 < local303.length; local755 += 2) {
				local303[local755] = local36.method891();
			}
		}
		if (local319 != null) {
			for (local755 = 1; local755 < local319.length; local755 += 2) {
				local319[local755] = local36.method891();
			}
		}
		@Pc(800) int local800;
		for (local755 = 0; local755 < local188; local755++) {
			@Pc(793) Class80 local793 = local236[local755];
			if (local793.aByteArray44 != null) {
				local362 = 0;
				for (local800 = 2; local800 < local793.aByteArray44.length; local800 += 2) {
					local362 = local362 + local36.method895() + 1;
					local793.aByteArray44[local800] = (byte) local362;
				}
			}
		}
		@Pc(845) int local845;
		for (local702 = 0; local702 < local188; local702++) {
			@Pc(838) Class80 local838 = local236[local702];
			if (local838.aByteArray45 != null) {
				local362 = 0;
				for (local845 = 2; local845 < local838.aByteArray45.length; local845 += 2) {
					local362 += local36.method895() + 1;
					local838.aByteArray45[local845] = (byte) local362;
				}
			}
		}
		@Pc(926) int local926;
		@Pc(949) int local949;
		@Pc(961) byte local961;
		@Pc(975) int local975;
		@Pc(978) int local978;
		@Pc(988) int local988;
		@Pc(920) byte local920;
		@Pc(1030) int local1030;
		if (local303 != null) {
			local362 = local36.method895();
			local303[0] = (byte) local362;
			for (local800 = 2; local800 < local303.length; local800 += 2) {
				local362 = local36.method895() + local362 + 1;
				local303[local800] = (byte) local362;
			}
			local920 = local303[0];
			@Pc(924) byte local924 = local303[1];
			for (local926 = 0; local926 < local920; local926++) {
				this.aByteArray3[local926] = (byte) (local924 * this.aByteArray3[local926] + 32 >> 6);
			}
			local949 = 2;
			while (local303.length > local949) {
				@Pc(957) byte local957 = local303[local949 + 1];
				local961 = local303[local949];
				local975 = (local961 - local920) / 2 + (local961 - local920) * local924;
				local949 += 2;
				for (local978 = local920; local978 < local961; local978++) {
					local988 = Static94.method1630(local961 - local920, local975);
					this.aByteArray3[local978] = (byte) (this.aByteArray3[local978] * local988 + 32 >> 6);
					local975 += local957 - local924;
				}
				local924 = local957;
				local920 = local961;
			}
			for (local1030 = local920; local1030 < 128; local1030++) {
				this.aByteArray3[local1030] = (byte) (local924 * this.aByteArray3[local1030] + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local319 != null) {
			local362 = local36.method895();
			local319[0] = (byte) local362;
			for (local800 = 2; local800 < local319.length; local800 += 2) {
				local362 = local362 + local36.method895() + 1;
				local319[local800] = (byte) local362;
			}
			local1097 = local319[1] << 1;
			local920 = local319[0];
			for (local926 = 0; local926 < local920; local926++) {
				local949 = local1097 + (this.aByteArray1[local926] & 0xFF);
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray1[local926] = (byte) local949;
			}
			local949 = 2;
			@Pc(1165) int local1165;
			while (local319.length > local949) {
				local961 = local319[local949];
				local975 = local1097 * (local961 - local920) + (local961 - local920) / 2;
				local1165 = local319[local949 + 1] << 1;
				for (local978 = local920; local978 < local961; local978++) {
					local988 = Static94.method1630(local961 - local920, local975);
					local975 += local1165 - local1097;
					@Pc(1193) int local1193 = local988 + (this.aByteArray1[local978] & 0xFF);
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					this.aByteArray1[local978] = (byte) local1193;
				}
				local920 = local961;
				local949 += 2;
				local1097 = local1165;
			}
			for (local1030 = local920; local1030 < 128; local1030++) {
				local1165 = (this.aByteArray1[local1030] & 0xFF) + local1097;
				if (local1165 < 0) {
					local1165 = 0;
				}
				if (local1165 > 128) {
					local1165 = 128;
				}
				this.aByteArray1[local1030] = (byte) local1165;
			}
		}
		for (local800 = 0; local800 < local188; local800++) {
			local236[local800].anInt3573 = local36.method895();
		}
		for (local845 = 0; local845 < local188; local845++) {
			@Pc(1290) Class80 local1290 = local236[local845];
			if (local1290.aByteArray45 != null) {
				local1290.anInt3568 = local36.method895();
			}
			if (local1290.aByteArray44 != null) {
				local1290.anInt3562 = local36.method895();
			}
			if (local1290.anInt3573 > 0) {
				local1290.anInt3561 = local36.method895();
			}
		}
		for (local1097 = 0; local1097 < local188; local1097++) {
			local236[local1097].anInt3569 = local36.method895();
		}
		for (local926 = 0; local926 < local188; local926++) {
			@Pc(1345) Class80 local1345 = local236[local926];
			if (local1345.anInt3569 > 0) {
				local1345.anInt3567 = local36.method895();
			}
		}
		for (local949 = 0; local949 < local188; local949++) {
			@Pc(1372) Class80 local1372 = local236[local949];
			if (local1372.anInt3567 > 0) {
				local1372.anInt3564 = local36.method895();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!pa;[B[I)Z")
	public boolean method141(@OriginalArg(1) Class75 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub19_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray24[local18];
				if (local30 != 0) {
					if (local14 != local30) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg0.method2493(local30 >> 2, arg2);
						} else {
							local16 = arg0.method2497(arg2, local30 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub19_Sub1Array1[local18] = local16;
						this.anIntArray24[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
	public void method145() {
		this.anIntArray24 = null;
	}
}
