import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
	private int[] anIntArray25 = new int[128];

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[B")
	public final byte[] aByteArray3 = new byte[128];

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "[B")
	public final byte[] aByteArray4 = new byte[128];

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "[S")
	public final short[] aShortArray6 = new short[128];

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "[Lclient!jc;")
	public final Class2_Sub10_Sub1[] aClass2_Sub10_Sub1Array1 = new Class2_Sub10_Sub1[128];

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "[B")
	public final byte[] aByteArray5 = new byte[128];

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	public final int anInt377;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "[Lclient!qc;")
	public final Class67[] aClass67Array1 = new Class67[128];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class2_Sub11 local38 = new Class2_Sub11(arg0);
		while (local38.aByteArray24[local33 + local38.anInt2077] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1463();
		}
		local33++;
		@Pc(73) int local73 = 0;
		local38.anInt2077++;
		@Pc(82) int local82 = local38.anInt2077;
		local38.anInt2077 += local33;
		while (local38.aByteArray24[local38.anInt2077 + local73] != 0) {
			local73++;
		}
		@Pc(105) byte[] local105 = new byte[local73];
		for (@Pc(107) int local107 = 0; local107 < local73; local107++) {
			local105[local107] = local38.method1463();
		}
		local73++;
		local38.anInt2077++;
		@Pc(129) int local129 = local38.anInt2077;
		@Pc(131) int local131 = 0;
		local38.anInt2077 += local73;
		while (local38.aByteArray24[local131 + local38.anInt2077] != 0) {
			local131++;
		}
		@Pc(154) byte[] local154 = new byte[local131];
		for (@Pc(156) int local156 = 0; local156 < local131; local156++) {
			local154[local156] = local38.method1463();
		}
		local38.anInt2077++;
		local131++;
		@Pc(178) byte[] local178 = new byte[local131];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local131 <= 1) {
			local183 = local131;
		} else {
			local178[1] = 1;
			local183 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local131; local195++) {
				local201 = local38.method1461();
				if (local201 == 0) {
					local193 = local183++;
				} else {
					if (local201 <= local193) {
						local201--;
					}
					local193 = local201;
				}
				local178[local195] = (byte) local193;
			}
		}
		@Pc(234) Class67[] local234 = new Class67[local183];
		for (local195 = 0; local195 < local234.length; local195++) {
			@Pc(246) Class67 local246 = local234[local195] = new Class67();
			@Pc(250) int local250 = local38.method1461();
			if (local250 > 0) {
				local246.aByteArray36 = new byte[local250 * 2];
			}
			local250 = local38.method1461();
			if (local250 > 0) {
				local246.aByteArray37 = new byte[local250 * 2 + 2];
				local246.aByteArray37[1] = 64;
			}
		}
		local201 = local38.method1461();
		@Pc(302) byte[] local302 = local201 <= 0 ? null : new byte[local201 * 2];
		@Pc(304) int local304 = 0;
		local201 = local38.method1461();
		@Pc(320) byte[] local320 = local201 <= 0 ? null : new byte[local201 * 2];
		while (local38.aByteArray24[local38.anInt2077 + local304] != 0) {
			local304++;
		}
		@Pc(334) byte[] local334 = new byte[local304];
		for (@Pc(336) int local336 = 0; local336 < local304; local336++) {
			local334[local336] = local38.method1463();
		}
		local304++;
		@Pc(355) int local355 = 0;
		local38.anInt2077++;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local355 += local38.method1461();
			this.aShortArray6[local363] = (short) local355;
		}
		local355 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local355 += local38.method1461();
			this.aShortArray6[local387] = (short) (this.aShortArray6[local387] + (local355 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local414 >= local334.length) {
					local412 = -1;
				} else {
					local412 = local334[local414++];
				}
				local416 = local38.method1437();
			}
			this.aShortArray6[local418] = (short) (this.aShortArray6[local418] + ((local416 - 1 & 0x2) << 14));
			this.anIntArray25[local418] = local416;
			local412--;
		}
		local412 = 0;
		local414 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray25[local472] != 0) {
				if (local412 == 0) {
					if (local52.length > local414) {
						local412 = local52[local414++];
					} else {
						local412 = -1;
					}
					local470 = local38.aByteArray24[local82++] - 1;
				}
				this.aByteArray3[local472] = (byte) local470;
				local412--;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray25[local523] != 0) {
				if (local412 == 0) {
					local521 = local38.aByteArray24[local129++] + 16 << 2;
					if (local414 < local105.length) {
						local412 = local105[local414++];
					} else {
						local412 = -1;
					}
				}
				local412--;
				this.aByteArray5[local523] = (byte) local521;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(577) Class67 local577 = null;
		for (@Pc(579) int local579 = 0; local579 < 128; local579++) {
			if (this.anIntArray25[local579] != 0) {
				if (local412 == 0) {
					local577 = local234[local178[local414]];
					if (local154.length > local414) {
						local412 = local154[local414++];
					} else {
						local412 = -1;
					}
				}
				this.aClass67Array1[local579] = local577;
				local412--;
			}
		}
		local414 = 0;
		@Pc(629) int local629 = 0;
		local412 = 0;
		for (@Pc(633) int local633 = 0; local633 < 128; local633++) {
			if (local412 == 0) {
				if (local414 < local334.length) {
					local412 = local334[local414++];
				} else {
					local412 = -1;
				}
				if (this.anIntArray25[local633] > 0) {
					local629 = local38.method1461() + 1;
				}
			}
			this.aByteArray4[local633] = (byte) local629;
			local412--;
		}
		this.anInt377 = local38.method1461() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local183; local693++) {
			@Pc(699) Class67 local699 = local234[local693];
			if (local699.aByteArray36 != null) {
				for (local704 = 1; local704 < local699.aByteArray36.length; local704 += 2) {
					local699.aByteArray36[local704] = local38.method1463();
				}
			}
			if (local699.aByteArray37 != null) {
				for (local704 = 3; local704 < local699.aByteArray37.length - 2; local704 += 2) {
					local699.aByteArray37[local704] = local38.method1463();
				}
			}
		}
		@Pc(749) int local749;
		if (local302 != null) {
			for (local749 = 1; local749 < local302.length; local749 += 2) {
				local302[local749] = local38.method1463();
			}
		}
		if (local320 != null) {
			for (local749 = 1; local749 < local320.length; local749 += 2) {
				local320[local749] = local38.method1463();
			}
		}
		@Pc(794) int local794;
		for (local749 = 0; local749 < local183; local749++) {
			@Pc(787) Class67 local787 = local234[local749];
			if (local787.aByteArray37 != null) {
				local355 = 0;
				for (local794 = 2; local794 < local787.aByteArray37.length; local794 += 2) {
					local355 -= -local38.method1461() - 1;
					local787.aByteArray37[local794] = (byte) local355;
				}
			}
		}
		@Pc(836) int local836;
		for (local704 = 0; local704 < local183; local704++) {
			@Pc(829) Class67 local829 = local234[local704];
			if (local829.aByteArray36 != null) {
				local355 = 0;
				for (local836 = 2; local836 < local829.aByteArray36.length; local836 += 2) {
					local355 = local355 + local38.method1461() + 1;
					local829.aByteArray36[local836] = (byte) local355;
				}
			}
		}
		@Pc(905) int local905;
		@Pc(928) int local928;
		@Pc(934) byte local934;
		@Pc(953) int local953;
		@Pc(955) int local955;
		@Pc(965) int local965;
		@Pc(899) byte local899;
		@Pc(1012) int local1012;
		if (local302 != null) {
			local355 = local38.method1461();
			local302[0] = (byte) local355;
			for (local794 = 2; local794 < local302.length; local794 += 2) {
				local355 = local38.method1461() + local355 + 1;
				local302[local794] = (byte) local355;
			}
			local899 = local302[0];
			@Pc(903) byte local903 = local302[1];
			for (local905 = 0; local905 < local899; local905++) {
				this.aByteArray4[local905] = (byte) (this.aByteArray4[local905] * local903 + 32 >> 6);
			}
			local928 = 2;
			while (local928 < local302.length) {
				local934 = local302[local928];
				@Pc(940) byte local940 = local302[local928 + 1];
				local953 = (local934 - local899) / 2 + local903 * (local934 - local899);
				for (local955 = local899; local955 < local934; local955++) {
					local965 = Static126.method2070(local934 - local899, local953);
					local953 += local940 - local903;
					this.aByteArray4[local955] = (byte) (local965 * this.aByteArray4[local955] + 32 >> 6);
				}
				local899 = local934;
				local928 += 2;
				local903 = local940;
			}
			for (local1012 = local899; local1012 < 128; local1012++) {
				this.aByteArray4[local1012] = (byte) (this.aByteArray4[local1012] * local903 + 32 >> 6);
			}
		}
		@Pc(1078) int local1078;
		if (local320 != null) {
			local355 = local38.method1461();
			local320[0] = (byte) local355;
			for (local794 = 2; local794 < local320.length; local794 += 2) {
				local355 += local38.method1461() + 1;
				local320[local794] = (byte) local355;
			}
			local899 = local320[0];
			local1078 = local320[1] << 1;
			for (local905 = 0; local905 < local899; local905++) {
				local928 = (this.aByteArray5[local905] & 0xFF) + local1078;
				if (local928 < 0) {
					local928 = 0;
				}
				if (local928 > 128) {
					local928 = 128;
				}
				this.aByteArray5[local905] = (byte) local928;
			}
			local928 = 2;
			@Pc(1141) int local1141;
			while (local928 < local320.length) {
				local934 = local320[local928];
				local953 = (local934 - local899) / 2 + local1078 * (local934 - local899);
				local1141 = local320[local928 + 1] << 1;
				for (local955 = local899; local955 < local934; local955++) {
					local965 = Static126.method2070(local934 - local899, local953);
					@Pc(1162) int local1162 = (this.aByteArray5[local955] & 0xFF) + local965;
					if (local1162 < 0) {
						local1162 = 0;
					}
					if (local1162 > 128) {
						local1162 = 128;
					}
					local953 += local1141 - local1078;
					this.aByteArray5[local955] = (byte) local1162;
				}
				local1078 = local1141;
				local928 += 2;
				local899 = local934;
			}
			for (local1012 = local899; local1012 < 128; local1012++) {
				local1141 = (this.aByteArray5[local1012] & 0xFF) + local1078;
				if (local1141 < 0) {
					local1141 = 0;
				}
				if (local1141 > 128) {
					local1141 = 128;
				}
				this.aByteArray5[local1012] = (byte) local1141;
			}
		}
		for (local794 = 0; local794 < local183; local794++) {
			local234[local794].anInt2913 = local38.method1461();
		}
		for (local836 = 0; local836 < local183; local836++) {
			@Pc(1276) Class67 local1276 = local234[local836];
			if (local1276.aByteArray36 != null) {
				local1276.anInt2912 = local38.method1461();
			}
			if (local1276.aByteArray37 != null) {
				local1276.anInt2909 = local38.method1461();
			}
			if (local1276.anInt2913 > 0) {
				local1276.anInt2914 = local38.method1461();
			}
		}
		for (local1078 = 0; local1078 < local183; local1078++) {
			local234[local1078].anInt2907 = local38.method1461();
		}
		for (local905 = 0; local905 < local183; local905++) {
			@Pc(1331) Class67 local1331 = local234[local905];
			if (local1331.anInt2907 > 0) {
				local1331.anInt2903 = local38.method1461();
			}
		}
		for (local928 = 0; local928 < local183; local928++) {
			@Pc(1354) Class67 local1354 = local234[local928];
			if (local1354.anInt2903 > 0) {
				local1354.anInt2901 = local38.method1461();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IILclient!fc;[B)Z")
	public boolean method217(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class2_Sub10_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray25[local13];
				if (local25 != 0) {
					if (local11 != local25) {
						local11 = local25--;
						if ((local25 & 0x1) == 0) {
							local9 = arg1.method874(local25 >> 2, arg0);
						} else {
							local9 = arg1.method873(arg0, local25 >> 2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass2_Sub10_Sub1Array1[local13] = local9;
						this.anIntArray25[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public void method221() {
		this.anIntArray25 = null;
	}
}
