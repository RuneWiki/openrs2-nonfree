import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[B")
	public final byte[] aByteArray74 = new byte[128];

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "[Lclient!pd;")
	public final Class1_Sub16_Sub1[] aClass1_Sub16_Sub1Array1 = new Class1_Sub16_Sub1[128];

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "[I")
	private int[] anIntArray337 = new int[128];

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "[B")
	public final byte[] aByteArray75 = new byte[128];

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
	public final int anInt2221;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[S")
	public final short[] aShortArray7;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "[Lclient!uc;")
	public final Class73[] aClass73Array1;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aClass73Array1 = new Class73[128];
		this.aShortArray7 = new short[128];
		this.aByteArray76 = new byte[128];
		@Pc(38) Class1_Sub18 local38 = new Class1_Sub18(arg0);
		while (local38.aByteArray96[local38.anInt3078 + local21] != 0) {
			local21++;
		}
		@Pc(52) byte[] local52 = new byte[local21];
		for (@Pc(54) int local54 = 0; local54 < local21; local54++) {
			local52[local54] = local38.method2178();
		}
		local21++;
		local38.anInt3078++;
		@Pc(75) int local75 = 0;
		@Pc(78) int local78 = local38.anInt3078;
		local38.anInt3078 += local21;
		while (local38.aByteArray96[local38.anInt3078 + local75] != 0) {
			local75++;
		}
		@Pc(102) byte[] local102 = new byte[local75];
		for (@Pc(104) int local104 = 0; local104 < local75; local104++) {
			local102[local104] = local38.method2178();
		}
		local38.anInt3078++;
		local75++;
		@Pc(126) int local126 = local38.anInt3078;
		@Pc(128) int local128 = 0;
		local38.anInt3078 += local75;
		while (local38.aByteArray96[local38.anInt3078 + local128] != 0) {
			local128++;
		}
		@Pc(149) byte[] local149 = new byte[local128];
		for (@Pc(151) int local151 = 0; local151 < local128; local151++) {
			local149[local151] = local38.method2178();
		}
		local128++;
		@Pc(171) byte[] local171 = new byte[local128];
		local38.anInt3078++;
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local128 > 1) {
			local171[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local128; local192++) {
				local198 = local38.method2169();
				if (local198 == 0) {
					local190 = local188++;
				} else {
					if (local198 <= local190) {
						local198--;
					}
					local190 = local198;
				}
				local171[local192] = (byte) local190;
			}
		} else {
			local188 = local128;
		}
		@Pc(231) Class73[] local231 = new Class73[local188];
		for (local192 = 0; local192 < local231.length; local192++) {
			@Pc(243) Class73 local243 = local231[local192] = new Class73();
			@Pc(247) int local247 = local38.method2169();
			if (local247 > 0) {
				local243.aByteArray91 = new byte[local247 * 2];
			}
			local247 = local38.method2169();
			if (local247 > 0) {
				local243.aByteArray92 = new byte[local247 * 2 + 2];
				local243.aByteArray92[1] = 64;
			}
		}
		local198 = local38.method2169();
		@Pc(299) byte[] local299 = local198 > 0 ? new byte[local198 * 2] : null;
		local198 = local38.method2169();
		@Pc(315) byte[] local315 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(317) int local317;
		for (local317 = 0; local38.aByteArray96[local38.anInt3078 + local317] != 0; local317++) {
		}
		@Pc(332) byte[] local332 = new byte[local317];
		for (@Pc(334) int local334 = 0; local334 < local317; local334++) {
			local332[local334] = local38.method2178();
		}
		local38.anInt3078++;
		local317++;
		@Pc(355) int local355 = 0;
		for (@Pc(357) int local357 = 0; local357 < 128; local357++) {
			local355 += local38.method2169();
			this.aShortArray7[local357] = (short) local355;
		}
		local355 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local355 += local38.method2169();
			this.aShortArray7[local381] = (short) (this.aShortArray7[local381] + (local355 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local332.length > local410) {
					local408 = local332[local410++];
				} else {
					local408 = -1;
				}
				local412 = local38.method2172();
			}
			local408--;
			this.aShortArray7[local414] = (short) (this.aShortArray7[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray337[local414] = local412;
		}
		local410 = 0;
		local408 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray337[local472] != 0) {
				if (local408 == 0) {
					if (local410 >= local52.length) {
						local408 = -1;
					} else {
						local408 = local52[local410++];
					}
					local470 = local38.aByteArray96[local78++] - 1;
				}
				this.aByteArray76[local472] = (byte) local470;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray337[local523] != 0) {
				if (local408 == 0) {
					if (local410 < local102.length) {
						local408 = local102[local410++];
					} else {
						local408 = -1;
					}
					local521 = local38.aByteArray96[local126++] + 16 << 2;
				}
				this.aByteArray74[local523] = (byte) local521;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(578) Class73 local578 = null;
		for (@Pc(580) int local580 = 0; local580 < 128; local580++) {
			if (this.anIntArray337[local580] != 0) {
				if (local408 == 0) {
					local578 = local231[local171[local410]];
					if (local410 >= local149.length) {
						local408 = -1;
					} else {
						local408 = local149[local410++];
					}
				}
				local408--;
				this.aClass73Array1[local580] = local578;
			}
		}
		@Pc(625) int local625 = 0;
		local410 = 0;
		local408 = 0;
		for (@Pc(631) int local631 = 0; local631 < 128; local631++) {
			if (local408 == 0) {
				if (local410 >= local332.length) {
					local408 = -1;
				} else {
					local408 = local332[local410++];
				}
				if (this.anIntArray337[local631] > 0) {
					local625 = local38.method2169() + 1;
				}
			}
			local408--;
			this.aByteArray75[local631] = (byte) local625;
		}
		this.anInt2221 = local38.method2169() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local188; local691++) {
			@Pc(697) Class73 local697 = local231[local691];
			if (local697.aByteArray91 != null) {
				for (local702 = 1; local702 < local697.aByteArray91.length; local702 += 2) {
					local697.aByteArray91[local702] = local38.method2178();
				}
			}
			if (local697.aByteArray92 != null) {
				for (local702 = 3; local702 < local697.aByteArray92.length - 2; local702 += 2) {
					local697.aByteArray92[local702] = local38.method2178();
				}
			}
		}
		@Pc(747) int local747;
		if (local299 != null) {
			for (local747 = 1; local747 < local299.length; local747 += 2) {
				local299[local747] = local38.method2178();
			}
		}
		if (local315 != null) {
			for (local747 = 1; local747 < local315.length; local747 += 2) {
				local315[local747] = local38.method2178();
			}
		}
		@Pc(796) int local796;
		for (local747 = 0; local747 < local188; local747++) {
			@Pc(789) Class73 local789 = local231[local747];
			if (local789.aByteArray92 != null) {
				local355 = 0;
				for (local796 = 2; local796 < local789.aByteArray92.length; local796 += 2) {
					local355 = local38.method2169() + local355 + 1;
					local789.aByteArray92[local796] = (byte) local355;
				}
			}
		}
		@Pc(845) int local845;
		for (local702 = 0; local702 < local188; local702++) {
			@Pc(838) Class73 local838 = local231[local702];
			if (local838.aByteArray91 != null) {
				local355 = 0;
				for (local845 = 2; local845 < local838.aByteArray91.length; local845 += 2) {
					local355 = local355 + local38.method2169() + 1;
					local838.aByteArray91[local845] = (byte) local355;
				}
			}
		}
		@Pc(923) int local923;
		@Pc(950) int local950;
		@Pc(956) byte local956;
		@Pc(976) int local976;
		@Pc(978) int local978;
		@Pc(988) int local988;
		@Pc(917) byte local917;
		@Pc(1029) int local1029;
		if (local299 != null) {
			local355 = local38.method2169();
			local299[0] = (byte) local355;
			for (local796 = 2; local796 < local299.length; local796 += 2) {
				local355 = local38.method2169() + local355 + 1;
				local299[local796] = (byte) local355;
			}
			local917 = local299[0];
			@Pc(921) byte local921 = local299[1];
			for (local923 = 0; local923 < local917; local923++) {
				this.aByteArray75[local923] = (byte) (local921 * this.aByteArray75[local923] + 32 >> 6);
			}
			local950 = 2;
			while (local299.length > local950) {
				local956 = local299[local950];
				@Pc(962) byte local962 = local299[local950 + 1];
				local976 = (local956 - local917) / 2 + local921 * (local956 - local917);
				for (local978 = local917; local978 < local956; local978++) {
					local988 = Static68.method1220(local976, local956 - local917);
					local976 += local962 - local921;
					this.aByteArray75[local978] = (byte) (local988 * this.aByteArray75[local978] + 32 >> 6);
				}
				local917 = local956;
				local950 += 2;
				local921 = local962;
			}
			for (local1029 = local917; local1029 < 128; local1029++) {
				this.aByteArray75[local1029] = (byte) (this.aByteArray75[local1029] * local921 + 32 >> 6);
			}
		}
		@Pc(1091) int local1091;
		if (local315 != null) {
			local355 = local38.method2169();
			local315[0] = (byte) local355;
			for (local796 = 2; local796 < local315.length; local796 += 2) {
				local355 += local38.method2169() + 1;
				local315[local796] = (byte) local355;
			}
			local1091 = local315[1] << 1;
			local917 = local315[0];
			for (local923 = 0; local923 < local917; local923++) {
				local950 = local1091 + (this.aByteArray74[local923] & 0xFF);
				if (local950 < 0) {
					local950 = 0;
				}
				if (local950 > 128) {
					local950 = 128;
				}
				this.aByteArray74[local923] = (byte) local950;
			}
			local950 = 2;
			@Pc(1163) int local1163;
			while (local950 < local315.length) {
				local956 = local315[local950];
				local976 = local1091 * (local956 - local917) + (local956 - local917) / 2;
				local1163 = local315[local950 + 1] << 1;
				local950 += 2;
				for (local978 = local917; local978 < local956; local978++) {
					local988 = Static68.method1220(local976, local956 - local917);
					local976 += local1163 - local1091;
					@Pc(1191) int local1191 = (this.aByteArray74[local978] & 0xFF) + local988;
					if (local1191 < 0) {
						local1191 = 0;
					}
					if (local1191 > 128) {
						local1191 = 128;
					}
					this.aByteArray74[local978] = (byte) local1191;
				}
				local1091 = local1163;
				local917 = local956;
			}
			for (local1029 = local917; local1029 < 128; local1029++) {
				local1163 = (this.aByteArray74[local1029] & 0xFF) + local1091;
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray74[local1029] = (byte) local1163;
			}
		}
		for (local796 = 0; local796 < local188; local796++) {
			local231[local796].anInt2935 = local38.method2169();
		}
		for (local845 = 0; local845 < local188; local845++) {
			@Pc(1292) Class73 local1292 = local231[local845];
			if (local1292.aByteArray91 != null) {
				local1292.anInt2948 = local38.method2169();
			}
			if (local1292.aByteArray92 != null) {
				local1292.anInt2933 = local38.method2169();
			}
			if (local1292.anInt2935 > 0) {
				local1292.anInt2944 = local38.method2169();
			}
		}
		for (local1091 = 0; local1091 < local188; local1091++) {
			local231[local1091].anInt2947 = local38.method2169();
		}
		for (local923 = 0; local923 < local188; local923++) {
			@Pc(1354) Class73 local1354 = local231[local923];
			if (local1354.anInt2947 > 0) {
				local1354.anInt2943 = local38.method2169();
			}
		}
		for (local950 = 0; local950 < local188; local950++) {
			@Pc(1377) Class73 local1377 = local231[local950];
			if (local1377.anInt2943 > 0) {
				local1377.anInt2938 = local38.method2169();
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method1584() {
		this.anIntArray337 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([IBLclient!g;[B)Z")
	public boolean method1585(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class21 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub16_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(29) int local29 = this.anIntArray337[local13];
				if (local29 != 0) {
					if (local9 != local29) {
						local9 = local29--;
						if ((local29 & 0x1) == 0) {
							local11 = arg1.method693(arg0, local29 >> 2);
						} else {
							local11 = arg1.method694(arg0, local29 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub16_Sub1Array1[local13] = local11;
						this.anIntArray337[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
