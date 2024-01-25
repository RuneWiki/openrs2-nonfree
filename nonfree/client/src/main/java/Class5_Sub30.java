import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "[Lclient!gu;")
	public Class140[] aClass140Array1;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[Lclient!jg;")
	public Class5_Sub27_Sub1[] aClass5_Sub27_Sub1Array1;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V")
	public Class5_Sub30(@OriginalArg(0) byte[] arg0) {
		this.aClass140Array1 = new Class140[128];
		this.aByteArray59 = new byte[128];
		this.aByteArray57 = new byte[128];
		this.aClass5_Sub27_Sub1Array1 = new Class5_Sub27_Sub1[128];
		this.aShortArray74 = new short[128];
		this.aByteArray58 = new byte[128];
		this.anIntArray315 = new int[128];
		@Pc(36) Class5_Sub36 local36 = new Class5_Sub36(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray89[local38 + local36.anInt8456] != 0; local38++) {
		}
		@Pc(54) byte[] local54 = new byte[local38];
		for (@Pc(56) int local56 = 0; local56 < local38; local56++) {
			local54[local56] = local36.method7318();
		}
		local36.anInt8456++;
		local38++;
		@Pc(84) int local84 = local36.anInt8456;
		local36.anInt8456 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray89[local36.anInt8456 + local92] != 0; local92++) {
		}
		@Pc(110) byte[] local110 = new byte[local92];
		for (@Pc(112) int local112 = 0; local112 < local92; local112++) {
			local110[local112] = local36.method7318();
		}
		local92++;
		local36.anInt8456++;
		@Pc(136) int local136 = local36.anInt8456;
		local36.anInt8456 += local92;
		@Pc(144) int local144;
		for (local144 = 0; local36.aByteArray89[local36.anInt8456 + local144] != 0; local144++) {
		}
		@Pc(165) byte[] local165 = new byte[local144];
		for (@Pc(167) int local167 = 0; local167 < local144; local167++) {
			local165[local167] = local36.method7318();
		}
		local36.anInt8456++;
		local144++;
		@Pc(191) byte[] local191 = new byte[local144];
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(212) int local212;
		if (local144 > 1) {
			local191[1] = 1;
			@Pc(202) int local202 = 1;
			local204 = 2;
			for (local206 = 2; local206 < local144; local206++) {
				local212 = local36.method7291();
				if (local212 == 0) {
					local202 = local204++;
				} else {
					if (local202 >= local212) {
						local212--;
					}
					local202 = local212;
				}
				local191[local206] = (byte) local202;
			}
		} else {
			local204 = local144;
		}
		@Pc(247) Class140[] local247 = new Class140[local204];
		for (local206 = 0; local206 < local247.length; local206++) {
			@Pc(259) Class140 local259 = local247[local206] = new Class140();
			@Pc(263) int local263 = local36.method7291();
			if (local263 > 0) {
				local259.aByteArray35 = new byte[local263 * 2];
			}
			local263 = local36.method7291();
			if (local263 > 0) {
				local259.aByteArray36 = new byte[local263 * 2 + 2];
				local259.aByteArray36[1] = 64;
			}
		}
		local212 = local36.method7291();
		@Pc(326) byte[] local326 = local212 <= 0 ? null : new byte[local212 * 2];
		local212 = local36.method7291();
		@Pc(343) byte[] local343 = local212 <= 0 ? null : new byte[local212 * 2];
		@Pc(345) int local345;
		for (local345 = 0; local36.aByteArray89[local345 + local36.anInt8456] != 0; local345++) {
		}
		@Pc(364) byte[] local364 = new byte[local345];
		for (@Pc(366) int local366 = 0; local366 < local345; local366++) {
			local364[local366] = local36.method7318();
		}
		local36.anInt8456++;
		local345++;
		@Pc(393) int local393 = 0;
		for (@Pc(395) int local395 = 0; local395 < 128; local395++) {
			local393 += local36.method7291();
			this.aShortArray74[local395] = (short) local393;
		}
		local393 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			local393 += local36.method7291();
			this.aShortArray74[local419] = (short) (this.aShortArray74[local419] + (local393 << 8));
		}
		@Pc(446) int local446 = 0;
		@Pc(448) int local448 = 0;
		@Pc(450) int local450 = 0;
		for (@Pc(452) int local452 = 0; local452 < 128; local452++) {
			if (local446 == 0) {
				if (local364.length > local448) {
					local446 = local364[local448++];
				} else {
					local446 = -1;
				}
				local450 = local36.method7294();
			}
			this.aShortArray74[local452] = (short) (this.aShortArray74[local452] + ((local450 - 1 & 0x2) << 14));
			local446--;
			this.anIntArray315[local452] = local450;
		}
		local446 = 0;
		local448 = 0;
		@Pc(513) int local513 = 0;
		for (@Pc(515) int local515 = 0; local515 < 128; local515++) {
			if (this.anIntArray315[local515] != 0) {
				if (local446 == 0) {
					if (local448 < local54.length) {
						local446 = local54[local448++];
					} else {
						local446 = -1;
					}
					local513 = local36.aByteArray89[local84++] - 1;
				}
				this.aByteArray58[local515] = (byte) local513;
				local446--;
			}
		}
		local446 = 0;
		local448 = 0;
		@Pc(573) int local573 = 0;
		for (@Pc(575) int local575 = 0; local575 < 128; local575++) {
			if (this.anIntArray315[local575] != 0) {
				if (local446 == 0) {
					if (local110.length > local448) {
						local446 = local110[local448++];
					} else {
						local446 = -1;
					}
					local573 = local36.aByteArray89[local136++] + 16 << 2;
				}
				this.aByteArray57[local575] = (byte) local573;
				local446--;
			}
		}
		local446 = 0;
		local448 = 0;
		@Pc(635) Class140 local635 = null;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (this.anIntArray315[local637] != 0) {
				if (local446 == 0) {
					local635 = local247[local191[local448]];
					if (local165.length > local448) {
						local446 = local165[local448++];
					} else {
						local446 = -1;
					}
				}
				this.aClass140Array1[local637] = local635;
				local446--;
			}
		}
		local448 = 0;
		local446 = 0;
		@Pc(689) int local689 = 0;
		for (@Pc(691) int local691 = 0; local691 < 128; local691++) {
			if (local446 == 0) {
				if (local448 >= local364.length) {
					local446 = -1;
				} else {
					local446 = local364[local448++];
				}
				if (this.anIntArray315[local691] > 0) {
					local689 = local36.method7291() + 1;
				}
			}
			this.aByteArray59[local691] = (byte) local689;
			local446--;
		}
		this.anInt5321 = local36.method7291() + 1;
		@Pc(768) int local768;
		for (@Pc(755) int local755 = 0; local755 < local204; local755++) {
			@Pc(763) Class140 local763 = local247[local755];
			if (local763.aByteArray35 != null) {
				for (local768 = 1; local768 < local763.aByteArray35.length; local768 += 2) {
					local763.aByteArray35[local768] = local36.method7318();
				}
			}
			if (local763.aByteArray36 != null) {
				for (local768 = 3; local768 < local763.aByteArray36.length - 2; local768 += 2) {
					local763.aByteArray36[local768] = local36.method7318();
				}
			}
		}
		@Pc(823) int local823;
		if (local326 != null) {
			for (local823 = 1; local823 < local326.length; local823 += 2) {
				local326[local823] = local36.method7318();
			}
		}
		if (local343 != null) {
			for (local823 = 1; local823 < local343.length; local823 += 2) {
				local343[local823] = local36.method7318();
			}
		}
		@Pc(882) int local882;
		for (local823 = 0; local823 < local204; local823++) {
			@Pc(875) Class140 local875 = local247[local823];
			if (local875.aByteArray36 != null) {
				local393 = 0;
				for (local882 = 2; local882 < local875.aByteArray36.length; local882 += 2) {
					local393 += local36.method7291() + 1;
					local875.aByteArray36[local882] = (byte) local393;
				}
			}
		}
		@Pc(934) int local934;
		for (local768 = 0; local768 < local204; local768++) {
			@Pc(927) Class140 local927 = local247[local768];
			if (local927.aByteArray35 != null) {
				local393 = 0;
				for (local934 = 2; local934 < local927.aByteArray35.length; local934 += 2) {
					local393 -= -local36.method7291() - 1;
					local927.aByteArray35[local934] = (byte) local393;
				}
			}
		}
		@Pc(1011) int local1011;
		@Pc(1038) int local1038;
		@Pc(1046) byte local1046;
		@Pc(1066) int local1066;
		@Pc(1068) int local1068;
		@Pc(1080) int local1080;
		@Pc(1005) byte local1005;
		@Pc(1122) int local1122;
		if (local326 != null) {
			local393 = local36.method7291();
			local326[0] = (byte) local393;
			for (local882 = 2; local882 < local326.length; local882 += 2) {
				local393 += local36.method7291() + 1;
				local326[local882] = (byte) local393;
			}
			local1005 = local326[0];
			@Pc(1009) byte local1009 = local326[1];
			for (local1011 = 0; local1011 < local1005; local1011++) {
				this.aByteArray59[local1011] = (byte) (this.aByteArray59[local1011] * local1009 + 32 >> 6);
			}
			local1038 = 2;
			while (local326.length > local1038) {
				local1046 = local326[local1038];
				@Pc(1052) byte local1052 = local326[local1038 + 1];
				local1066 = local1009 * (local1046 - local1005) + (local1046 - local1005) / 2;
				for (local1068 = local1005; local1068 < local1046; local1068++) {
					local1080 = Static461.method6503(local1046 - local1005, local1066);
					local1066 += local1052 - local1009;
					this.aByteArray59[local1068] = (byte) (local1080 * this.aByteArray59[local1068] + 32 >> 6);
				}
				local1009 = local1052;
				local1038 += 2;
				local1005 = local1046;
			}
			for (local1122 = local1005; local1122 < 128; local1122++) {
				this.aByteArray59[local1122] = (byte) (local1009 * this.aByteArray59[local1122] + 32 >> 6);
			}
		}
		@Pc(1200) int local1200;
		if (local343 != null) {
			local393 = local36.method7291();
			local343[0] = (byte) local393;
			for (local882 = 2; local882 < local343.length; local882 += 2) {
				local393 = local36.method7291() + local393 + 1;
				local343[local882] = (byte) local393;
			}
			local1005 = local343[0];
			local1200 = local343[1] << 1;
			for (local1011 = 0; local1011 < local1005; local1011++) {
				local1038 = (this.aByteArray57[local1011] & 0xFF) + local1200;
				if (local1038 < 0) {
					local1038 = 0;
				}
				if (local1038 > 128) {
					local1038 = 128;
				}
				this.aByteArray57[local1011] = (byte) local1038;
			}
			local1038 = 2;
			@Pc(1256) int local1256;
			while (local1038 < local343.length) {
				local1046 = local343[local1038];
				local1256 = local343[local1038 + 1] << 1;
				local1066 = local1200 * (local1046 - local1005) + (local1046 - local1005) / 2;
				for (local1068 = local1005; local1068 < local1046; local1068++) {
					local1080 = Static461.method6503(local1046 - local1005, local1066);
					@Pc(1293) int local1293 = local1080 + (this.aByteArray57[local1068] & 0xFF);
					if (local1293 < 0) {
						local1293 = 0;
					}
					if (local1293 > 128) {
						local1293 = 128;
					}
					local1066 += local1256 - local1200;
					this.aByteArray57[local1068] = (byte) local1293;
				}
				local1005 = local1046;
				local1038 += 2;
				local1200 = local1256;
			}
			for (local1122 = local1005; local1122 < 128; local1122++) {
				local1256 = (this.aByteArray57[local1122] & 0xFF) + local1200;
				if (local1256 < 0) {
					local1256 = 0;
				}
				if (local1256 > 128) {
					local1256 = 128;
				}
				this.aByteArray57[local1122] = (byte) local1256;
			}
		}
		for (local882 = 0; local882 < local204; local882++) {
			local247[local882].anInt3604 = local36.method7291();
		}
		for (local934 = 0; local934 < local204; local934++) {
			@Pc(1400) Class140 local1400 = local247[local934];
			if (local1400.aByteArray35 != null) {
				local1400.anInt3608 = local36.method7291();
			}
			if (local1400.aByteArray36 != null) {
				local1400.anInt3603 = local36.method7291();
			}
			if (local1400.anInt3604 > 0) {
				local1400.anInt3607 = local36.method7291();
			}
		}
		for (local1200 = 0; local1200 < local204; local1200++) {
			local247[local1200].anInt3605 = local36.method7291();
		}
		for (local1011 = 0; local1011 < local204; local1011++) {
			@Pc(1472) Class140 local1472 = local247[local1011];
			if (local1472.anInt3605 > 0) {
				local1472.anInt3609 = local36.method7291();
			}
		}
		for (local1038 = 0; local1038 < local204; local1038++) {
			@Pc(1501) Class140 local1501 = local247[local1038];
			if (local1501.anInt3609 > 0) {
				local1501.anInt3611 = local36.method7291();
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BILclient!ke;[I)Z")
	public boolean method4791(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class199 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class5_Sub27_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(37) int local37 = this.anIntArray315[local21];
				if (local37 != 0) {
					if (local17 != local37) {
						local17 = local37--;
						if ((local37 & 0x1) == 0) {
							local19 = arg1.method4648(arg2, local37 >> 2);
						} else {
							local19 = arg1.method4649(arg2, local37 >> 2);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass5_Sub27_Sub1Array1[local21] = local19;
						this.anIntArray315[local21] = 0;
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public void method4792() {
		this.anIntArray315 = null;
	}
}
