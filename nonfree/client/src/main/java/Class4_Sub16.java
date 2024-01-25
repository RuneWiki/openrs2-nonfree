import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[Lclient!un;")
	public Class204[] aClass204Array1;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "[Lclient!bg;")
	public Class4_Sub7_Sub1[] aClass4_Sub7_Sub1Array1;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class4_Sub16() {
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
	public Class4_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aClass204Array1 = new Class204[128];
		this.aClass4_Sub7_Sub1Array1 = new Class4_Sub7_Sub1[128];
		this.aByteArray37 = new byte[128];
		this.aByteArray39 = new byte[128];
		this.anIntArray189 = new int[128];
		this.aShortArray44 = new short[128];
		this.aByteArray38 = new byte[128];
		@Pc(36) Class4_Sub11 local36 = new Class4_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray55[local36.anInt3768 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method3426();
		}
		local36.anInt3768++;
		local38++;
		@Pc(81) int local81 = local36.anInt3768;
		local36.anInt3768 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray55[local89 + local36.anInt3768] != 0; local89++) {
		}
		@Pc(103) byte[] local103 = new byte[local89];
		for (@Pc(105) int local105 = 0; local105 < local89; local105++) {
			local103[local105] = local36.method3426();
		}
		local89++;
		local36.anInt3768++;
		@Pc(127) int local127 = local36.anInt3768;
		local36.anInt3768 += local89;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray55[local36.anInt3768 + local135] != 0; local135++) {
		}
		@Pc(150) byte[] local150 = new byte[local135];
		for (@Pc(152) int local152 = 0; local152 < local135; local152++) {
			local150[local152] = local36.method3426();
		}
		local135++;
		local36.anInt3768++;
		@Pc(174) byte[] local174 = new byte[local135];
		@Pc(185) int local185;
		@Pc(187) int local187;
		@Pc(193) int local193;
		if (local135 > 1) {
			local174[1] = 1;
			@Pc(183) int local183 = 1;
			local185 = 2;
			for (local187 = 2; local187 < local135; local187++) {
				local193 = local36.method3440();
				if (local193 == 0) {
					local183 = local185++;
				} else {
					if (local183 >= local193) {
						local193--;
					}
					local183 = local193;
				}
				local174[local187] = (byte) local183;
			}
		} else {
			local185 = local135;
		}
		@Pc(230) Class204[] local230 = new Class204[local185];
		for (local187 = 0; local187 < local230.length; local187++) {
			@Pc(242) Class204 local242 = local230[local187] = new Class204();
			@Pc(246) int local246 = local36.method3440();
			if (local246 > 0) {
				local242.aByteArray86 = new byte[local246 * 2];
			}
			local246 = local36.method3440();
			if (local246 > 0) {
				local242.aByteArray85 = new byte[local246 * 2 + 2];
				local242.aByteArray85[1] = 64;
			}
		}
		local193 = local36.method3440();
		@Pc(298) byte[] local298 = local193 > 0 ? new byte[local193 * 2] : null;
		local193 = local36.method3440();
		@Pc(311) byte[] local311 = local193 > 0 ? new byte[local193 * 2] : null;
		@Pc(313) int local313;
		for (local313 = 0; local36.aByteArray55[local36.anInt3768 + local313] != 0; local313++) {
		}
		@Pc(330) byte[] local330 = new byte[local313];
		for (@Pc(332) int local332 = 0; local332 < local313; local332++) {
			local330[local332] = local36.method3426();
		}
		local313++;
		local36.anInt3768++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method3440();
			this.aShortArray44[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local36.method3440();
			this.aShortArray44[local381] = (short) (this.aShortArray44[local381] + (local357 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local330.length > local408) {
					local406 = local330[local408++];
				} else {
					local406 = -1;
				}
				local410 = local36.method3448();
			}
			this.aShortArray44[local412] = (short) (this.aShortArray44[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray189[local412] = local410;
			local406--;
		}
		local406 = 0;
		local408 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray189[local471] != 0) {
				if (local406 == 0) {
					if (local408 >= local53.length) {
						local406 = -1;
					} else {
						local406 = local53[local408++];
					}
					local469 = local36.aByteArray55[local81++] - 1;
				}
				this.aByteArray38[local471] = (byte) local469;
				local406--;
			}
		}
		local406 = 0;
		local408 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray189[local525] != 0) {
				if (local406 == 0) {
					local523 = local36.aByteArray55[local127++] + 16 << 2;
					if (local103.length > local408) {
						local406 = local103[local408++];
					} else {
						local406 = -1;
					}
				}
				local406--;
				this.aByteArray39[local525] = (byte) local523;
			}
		}
		local406 = 0;
		local408 = 0;
		@Pc(576) Class204 local576 = null;
		for (@Pc(578) int local578 = 0; local578 < 128; local578++) {
			if (this.anIntArray189[local578] != 0) {
				if (local406 == 0) {
					local576 = local230[local174[local408]];
					if (local150.length <= local408) {
						local406 = -1;
					} else {
						local406 = local150[local408++];
					}
				}
				local406--;
				this.aClass204Array1[local578] = local576;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local406 == 0) {
				if (local330.length > local408) {
					local406 = local330[local408++];
				} else {
					local406 = -1;
				}
				if (this.anIntArray189[local635] > 0) {
					local633 = local36.method3440() + 1;
				}
			}
			local406--;
			this.aByteArray37[local635] = (byte) local633;
		}
		this.anInt2132 = local36.method3440() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local185; local690++) {
			@Pc(696) Class204 local696 = local230[local690];
			if (local696.aByteArray86 != null) {
				for (local701 = 1; local701 < local696.aByteArray86.length; local701 += 2) {
					local696.aByteArray86[local701] = local36.method3426();
				}
			}
			if (local696.aByteArray85 != null) {
				for (local701 = 3; local701 < local696.aByteArray85.length - 2; local701 += 2) {
					local696.aByteArray85[local701] = local36.method3426();
				}
			}
		}
		@Pc(750) int local750;
		if (local298 != null) {
			for (local750 = 1; local750 < local298.length; local750 += 2) {
				local298[local750] = local36.method3426();
			}
		}
		if (local311 != null) {
			for (local750 = 1; local750 < local311.length; local750 += 2) {
				local311[local750] = local36.method3426();
			}
		}
		@Pc(803) int local803;
		for (local750 = 0; local750 < local185; local750++) {
			@Pc(796) Class204 local796 = local230[local750];
			if (local796.aByteArray85 != null) {
				local357 = 0;
				for (local803 = 2; local803 < local796.aByteArray85.length; local803 += 2) {
					local357 = local357 + local36.method3440() + 1;
					local796.aByteArray85[local803] = (byte) local357;
				}
			}
		}
		@Pc(849) int local849;
		for (local701 = 0; local701 < local185; local701++) {
			@Pc(842) Class204 local842 = local230[local701];
			if (local842.aByteArray86 != null) {
				local357 = 0;
				for (local849 = 2; local849 < local842.aByteArray86.length; local849 += 2) {
					local357 = local36.method3440() + local357 + 1;
					local842.aByteArray86[local849] = (byte) local357;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(973) int local973;
		@Pc(975) int local975;
		@Pc(984) int local984;
		@Pc(916) byte local916;
		@Pc(1026) int local1026;
		if (local298 != null) {
			local357 = local36.method3440();
			local298[0] = (byte) local357;
			for (local803 = 2; local803 < local298.length; local803 += 2) {
				local357 = local36.method3440() + local357 + 1;
				local298[local803] = (byte) local357;
			}
			local916 = local298[0];
			@Pc(920) byte local920 = local298[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray37[local922] = (byte) (this.aByteArray37[local922] * local920 + 32 >> 6);
			}
			local949 = 2;
			while (local298.length > local949) {
				local955 = local298[local949];
				@Pc(961) byte local961 = local298[local949 + 1];
				local973 = (local955 - local916) * local920 + (local955 - local916) / 2;
				for (local975 = local916; local975 < local955; local975++) {
					local984 = Static128.method2640(local973, local955 - local916);
					local973 += local961 - local920;
					this.aByteArray37[local975] = (byte) (local984 * this.aByteArray37[local975] + 32 >> 6);
				}
				local949 += 2;
				local916 = local955;
				local920 = local961;
			}
			for (local1026 = local916; local1026 < 128; local1026++) {
				this.aByteArray37[local1026] = (byte) (local920 * this.aByteArray37[local1026] + 32 >> 6);
			}
		}
		@Pc(1094) int local1094;
		if (local311 != null) {
			local357 = local36.method3440();
			local311[0] = (byte) local357;
			for (local803 = 2; local803 < local311.length; local803 += 2) {
				local357 = local36.method3440() + local357 + 1;
				local311[local803] = (byte) local357;
			}
			local916 = local311[0];
			local1094 = local311[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local949 = (this.aByteArray39[local922] & 0xFF) + local1094;
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray39[local922] = (byte) local949;
			}
			@Pc(1148) int local1148;
			for (local949 = 2; local949 < local311.length; local949 += 2) {
				local955 = local311[local949];
				local1148 = local311[local949 + 1] << 1;
				local973 = (local955 - local916) / 2 + (local955 - local916) * local1094;
				for (local975 = local916; local975 < local955; local975++) {
					local984 = Static128.method2640(local973, local955 - local916);
					@Pc(1182) int local1182 = local984 + (this.aByteArray39[local975] & 0xFF);
					if (local1182 < 0) {
						local1182 = 0;
					}
					if (local1182 > 128) {
						local1182 = 128;
					}
					local973 += local1148 - local1094;
					this.aByteArray39[local975] = (byte) local1182;
				}
				local916 = local955;
				local1094 = local1148;
			}
			for (local1026 = local916; local1026 < 128; local1026++) {
				local1148 = (this.aByteArray39[local1026] & 0xFF) + local1094;
				if (local1148 < 0) {
					local1148 = 0;
				}
				if (local1148 > 128) {
					local1148 = 128;
				}
				this.aByteArray39[local1026] = (byte) local1148;
			}
		}
		for (local803 = 0; local803 < local185; local803++) {
			local230[local803].anInt6251 = local36.method3440();
		}
		for (local849 = 0; local849 < local185; local849++) {
			@Pc(1287) Class204 local1287 = local230[local849];
			if (local1287.aByteArray86 != null) {
				local1287.anInt6243 = local36.method3440();
			}
			if (local1287.aByteArray85 != null) {
				local1287.anInt6248 = local36.method3440();
			}
			if (local1287.anInt6251 > 0) {
				local1287.anInt6247 = local36.method3440();
			}
		}
		for (local1094 = 0; local1094 < local185; local1094++) {
			local230[local1094].anInt6246 = local36.method3440();
		}
		for (local922 = 0; local922 < local185; local922++) {
			@Pc(1346) Class204 local1346 = local230[local922];
			if (local1346.anInt6246 > 0) {
				local1346.anInt6250 = local36.method3440();
			}
		}
		for (local949 = 0; local949 < local185; local949++) {
			@Pc(1366) Class204 local1366 = local230[local949];
			if (local1366.anInt6250 > 0) {
				local1366.anInt6249 = local36.method3440();
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[BLclient!ij;[I)Z")
	public boolean method2003(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub7_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray189[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method2845(local28 >> 2, arg2);
						} else {
							local11 = arg1.method2840(arg2, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub7_Sub1Array1[local13] = local11;
						this.anIntArray189[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public void method2006() {
		this.anIntArray189 = null;
	}
}
