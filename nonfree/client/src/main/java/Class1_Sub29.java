import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "[I")
	public static int[] anIntArray448 = new int[256];

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "[Lclient!ed;")
	public Class38[] aClass38Array1 = new Class38[128];

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "[S")
	public short[] aShortArray67 = new short[128];

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "[Lclient!ec;")
	public Class1_Sub7_Sub1[] aClass1_Sub7_Sub1Array1;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
	public int anInt5139;

	static {
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(16) int local16 = local13;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1) == 1) {
					local16 = local16 >>> 1 ^ 0xEDB88320;
				} else {
					local16 >>>= 0x1;
				}
			}
			anIntArray448[local13] = local16;
		}
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V")
	public Class1_Sub29(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aClass1_Sub7_Sub1Array1 = new Class1_Sub7_Sub1[128];
		this.aByteArray60 = new byte[128];
		this.aByteArray61 = new byte[128];
		this.anIntArray446 = new int[128];
		this.aByteArray62 = new byte[128];
		@Pc(38) Class1_Sub13 local38 = new Class1_Sub13(arg0);
		while (local38.aByteArray29[local38.anInt2395 + local13] != 0) {
			local13++;
		}
		@Pc(56) byte[] local56 = new byte[local13];
		for (@Pc(58) int local58 = 0; local58 < local13; local58++) {
			local56[local58] = local38.method1756();
		}
		local13++;
		local38.anInt2395++;
		@Pc(80) int local80 = local38.anInt2395;
		local38.anInt2395 += local13;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray29[local38.anInt2395 + local88] != 0; local88++) {
		}
		@Pc(103) byte[] local103 = new byte[local88];
		for (@Pc(105) int local105 = 0; local105 < local88; local105++) {
			local103[local105] = local38.method1756();
		}
		local88++;
		local38.anInt2395++;
		@Pc(131) int local131 = local38.anInt2395;
		local38.anInt2395 += local88;
		@Pc(139) int local139;
		for (local139 = 0; local38.aByteArray29[local139 + local38.anInt2395] != 0; local139++) {
		}
		@Pc(156) byte[] local156 = new byte[local139];
		for (@Pc(158) int local158 = 0; local158 < local139; local158++) {
			local156[local158] = local38.method1756();
		}
		local139++;
		@Pc(174) byte[] local174 = new byte[local139];
		local38.anInt2395++;
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local139 <= 1) {
			local185 = local139;
		} else {
			local185 = 2;
			local174[1] = 1;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local139; local197++) {
				local203 = local38.method1772();
				if (local203 == 0) {
					local195 = local185++;
				} else {
					if (local203 <= local195) {
						local203--;
					}
					local195 = local203;
				}
				local174[local197] = (byte) local195;
			}
		}
		@Pc(228) Class38[] local228 = new Class38[local185];
		for (local197 = 0; local197 < local228.length; local197++) {
			@Pc(240) Class38 local240 = local228[local197] = new Class38();
			@Pc(244) int local244 = local38.method1772();
			if (local244 > 0) {
				local240.aByteArray23 = new byte[local244 * 2];
			}
			local244 = local38.method1772();
			if (local244 > 0) {
				local240.aByteArray22 = new byte[local244 * 2 + 2];
				local240.aByteArray22[1] = 64;
			}
		}
		local203 = local38.method1772();
		@Pc(289) int local289 = 0;
		@Pc(301) byte[] local301 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local38.method1772();
		while (local38.aByteArray29[local289 + local38.anInt2395] != 0) {
			local289++;
		}
		@Pc(322) byte[] local322 = new byte[local289];
		@Pc(334) byte[] local334 = local203 <= 0 ? null : new byte[local203 * 2];
		for (@Pc(336) int local336 = 0; local336 < local289; local336++) {
			local322[local336] = local38.method1756();
		}
		local289++;
		local38.anInt2395++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local38.method1772();
			this.aShortArray67[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local361 += local38.method1772();
			this.aShortArray67[local387] = (short) (this.aShortArray67[local387] + (local361 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local414 >= local322.length) {
					local412 = -1;
				} else {
					local412 = local322[local414++];
				}
				local416 = local38.method1768();
			}
			local412--;
			this.aShortArray67[local418] = (short) (this.aShortArray67[local418] + ((local416 - 1 & 0x2) << 14));
			this.anIntArray446[local418] = local416;
		}
		local412 = 0;
		local414 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray446[local477] != 0) {
				if (local412 == 0) {
					local475 = local38.aByteArray29[local80++] - 1;
					if (local414 >= local56.length) {
						local412 = -1;
					} else {
						local412 = local56[local414++];
					}
				}
				local412--;
				this.aByteArray60[local477] = (byte) local475;
			}
		}
		@Pc(526) int local526 = 0;
		local414 = 0;
		local412 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray446[local532] != 0) {
				if (local412 == 0) {
					if (local414 < local103.length) {
						local412 = local103[local414++];
					} else {
						local412 = -1;
					}
					local526 = local38.aByteArray29[local131++] + 16 << 2;
				}
				this.aByteArray62[local532] = (byte) local526;
				local412--;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(584) Class38 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray446[local586] != 0) {
				if (local412 == 0) {
					local584 = local228[local174[local414]];
					if (local414 < local156.length) {
						local412 = local156[local414++];
					} else {
						local412 = -1;
					}
				}
				local412--;
				this.aClass38Array1[local586] = local584;
			}
		}
		@Pc(637) int local637 = 0;
		local414 = 0;
		local412 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local412 == 0) {
				if (local414 < local322.length) {
					local412 = local322[local414++];
				} else {
					local412 = -1;
				}
				if (this.anIntArray446[local643] > 0) {
					local637 = local38.method1772() + 1;
				}
			}
			local412--;
			this.aByteArray61[local643] = (byte) local637;
		}
		this.anInt5139 = local38.method1772() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local185; local698++) {
			@Pc(704) Class38 local704 = local228[local698];
			if (local704.aByteArray23 != null) {
				for (local709 = 1; local709 < local704.aByteArray23.length; local709 += 2) {
					local704.aByteArray23[local709] = local38.method1756();
				}
			}
			if (local704.aByteArray22 != null) {
				for (local709 = 3; local709 < local704.aByteArray22.length - 2; local709 += 2) {
					local704.aByteArray22[local709] = local38.method1756();
				}
			}
		}
		@Pc(766) int local766;
		if (local301 != null) {
			for (local766 = 1; local766 < local301.length; local766 += 2) {
				local301[local766] = local38.method1756();
			}
		}
		if (local334 != null) {
			for (local766 = 1; local766 < local334.length; local766 += 2) {
				local334[local766] = local38.method1756();
			}
		}
		@Pc(811) int local811;
		for (local766 = 0; local766 < local185; local766++) {
			@Pc(804) Class38 local804 = local228[local766];
			if (local804.aByteArray22 != null) {
				local361 = 0;
				for (local811 = 2; local811 < local804.aByteArray22.length; local811 += 2) {
					local361 = local361 + local38.method1772() + 1;
					local804.aByteArray22[local811] = (byte) local361;
				}
			}
		}
		@Pc(852) int local852;
		for (local709 = 0; local709 < local185; local709++) {
			@Pc(845) Class38 local845 = local228[local709];
			if (local845.aByteArray23 != null) {
				local361 = 0;
				for (local852 = 2; local852 < local845.aByteArray23.length; local852 += 2) {
					local361 = local361 + local38.method1772() + 1;
					local845.aByteArray23[local852] = (byte) local361;
				}
			}
		}
		@Pc(933) int local933;
		@Pc(956) int local956;
		@Pc(962) byte local962;
		@Pc(982) int local982;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(927) byte local927;
		@Pc(1031) int local1031;
		if (local301 != null) {
			local361 = local38.method1772();
			local301[0] = (byte) local361;
			for (local811 = 2; local811 < local301.length; local811 += 2) {
				local361 = local38.method1772() + local361 + 1;
				local301[local811] = (byte) local361;
			}
			local927 = local301[0];
			@Pc(931) byte local931 = local301[1];
			for (local933 = 0; local933 < local927; local933++) {
				this.aByteArray61[local933] = (byte) (local931 * this.aByteArray61[local933] + 32 >> 6);
			}
			for (local956 = 2; local956 < local301.length; local956 += 2) {
				local962 = local301[local956];
				@Pc(968) byte local968 = local301[local956 + 1];
				local982 = (local962 - local927) / 2 + local931 * (local962 - local927);
				for (local984 = local927; local984 < local962; local984++) {
					local994 = Static90.method1896(local962 - local927, local982);
					local982 += local968 - local931;
					this.aByteArray61[local984] = (byte) (this.aByteArray61[local984] * local994 + 32 >> 6);
				}
				local931 = local968;
				local927 = local962;
			}
			for (local1031 = local927; local1031 < 128; local1031++) {
				this.aByteArray61[local1031] = (byte) (this.aByteArray61[local1031] * local931 + 32 >> 6);
			}
		}
		@Pc(1095) int local1095;
		if (local334 != null) {
			local361 = local38.method1772();
			local334[0] = (byte) local361;
			for (local811 = 2; local811 < local334.length; local811 += 2) {
				local361 = local38.method1772() + local361 + 1;
				local334[local811] = (byte) local361;
			}
			local1095 = local334[1] << 1;
			local927 = local334[0];
			for (local933 = 0; local933 < local927; local933++) {
				local956 = (this.aByteArray62[local933] & 0xFF) + local1095;
				if (local956 < 0) {
					local956 = 0;
				}
				if (local956 > 128) {
					local956 = 128;
				}
				this.aByteArray62[local933] = (byte) local956;
			}
			local956 = 2;
			@Pc(1154) int local1154;
			while (local956 < local334.length) {
				local962 = local334[local956];
				local1154 = local334[local956 + 1] << 1;
				local956 += 2;
				local982 = (local962 - local927) * local1095 + (local962 - local927) / 2;
				for (local984 = local927; local984 < local962; local984++) {
					local994 = Static90.method1896(local962 - local927, local982);
					local982 += local1154 - local1095;
					@Pc(1197) int local1197 = (this.aByteArray62[local984] & 0xFF) + local994;
					if (local1197 < 0) {
						local1197 = 0;
					}
					if (local1197 > 128) {
						local1197 = 128;
					}
					this.aByteArray62[local984] = (byte) local1197;
				}
				local1095 = local1154;
				local927 = local962;
			}
			for (local1031 = local927; local1031 < 128; local1031++) {
				local1154 = (this.aByteArray62[local1031] & 0xFF) + local1095;
				if (local1154 < 0) {
					local1154 = 0;
				}
				if (local1154 > 128) {
					local1154 = 128;
				}
				this.aByteArray62[local1031] = (byte) local1154;
			}
		}
		for (local811 = 0; local811 < local185; local811++) {
			local228[local811].anInt1544 = local38.method1772();
		}
		for (local852 = 0; local852 < local185; local852++) {
			@Pc(1292) Class38 local1292 = local228[local852];
			if (local1292.aByteArray23 != null) {
				local1292.anInt1537 = local38.method1772();
			}
			if (local1292.aByteArray22 != null) {
				local1292.anInt1536 = local38.method1772();
			}
			if (local1292.anInt1544 > 0) {
				local1292.anInt1539 = local38.method1772();
			}
		}
		for (local1095 = 0; local1095 < local185; local1095++) {
			local228[local1095].anInt1540 = local38.method1772();
		}
		for (local933 = 0; local933 < local185; local933++) {
			@Pc(1350) Class38 local1350 = local228[local933];
			if (local1350.anInt1540 > 0) {
				local1350.anInt1541 = local38.method1772();
			}
		}
		for (local956 = 0; local956 < local185; local956++) {
			@Pc(1374) Class38 local1374 = local228[local956];
			if (local1374.anInt1541 > 0) {
				local1374.anInt1545 = local38.method1772();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public void method3925() {
		this.anIntArray446 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([BLclient!wg;[IZ)Z")
	public boolean method3927(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class1_Sub7_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray446[local13];
				if (local25 != 0) {
					if (local7 != local25) {
						local7 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method4162(local25 >> 2, arg2);
						} else {
							local11 = arg1.method4161(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub7_Sub1Array1[local13] = local11;
						this.anIntArray446[local13] = 0;
					}
				}
			}
		}
		return local9;
	}
}
