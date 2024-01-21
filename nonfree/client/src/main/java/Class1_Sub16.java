import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "[B")
	public final byte[] aByteArray34 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "[Lclient!ih;")
	public final Class1_Sub13_Sub1[] aClass1_Sub13_Sub1Array1 = new Class1_Sub13_Sub1[128];

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public final int anInt3049;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "[B")
	public final byte[] aByteArray35 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "[Lclient!rd;")
	public final Class67[] aClass67Array1 = new Class67[128];

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "[I")
	private int[] anIntArray270 = new int[128];

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "[S")
	public final short[] aShortArray27;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub16(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aShortArray27 = new short[128];
		@Pc(38) Class1_Sub6 local38 = new Class1_Sub6(arg0);
		while (local38.aByteArray3[local29 + local38.anInt839] != 0) {
			local29++;
		}
		@Pc(52) byte[] local52 = new byte[local29];
		for (@Pc(54) int local54 = 0; local54 < local29; local54++) {
			local52[local54] = local38.method548();
		}
		local29++;
		@Pc(73) int local73 = 0;
		local38.anInt839++;
		@Pc(82) int local82 = local38.anInt839;
		local38.anInt839 += local29;
		while (local38.aByteArray3[local73 + local38.anInt839] != 0) {
			local73++;
		}
		@Pc(105) byte[] local105 = new byte[local73];
		for (@Pc(107) int local107 = 0; local107 < local73; local107++) {
			local105[local107] = local38.method548();
		}
		local73++;
		local38.anInt839++;
		@Pc(133) int local133 = local38.anInt839;
		@Pc(135) int local135 = 0;
		local38.anInt839 += local73;
		while (local38.aByteArray3[local135 + local38.anInt839] != 0) {
			local135++;
		}
		@Pc(158) byte[] local158 = new byte[local135];
		for (@Pc(160) int local160 = 0; local160 < local135; local160++) {
			local158[local160] = local38.method548();
		}
		local135++;
		@Pc(176) byte[] local176 = new byte[local135];
		local38.anInt839++;
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local135 <= 1) {
			local187 = local135;
		} else {
			local176[1] = 1;
			local187 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local135; local199++) {
				local205 = local38.method544();
				if (local205 == 0) {
					local197 = local187++;
				} else {
					if (local205 <= local197) {
						local205--;
					}
					local197 = local205;
				}
				local176[local199] = (byte) local197;
			}
		}
		@Pc(233) Class67[] local233 = new Class67[local187];
		for (local199 = 0; local199 < local233.length; local199++) {
			@Pc(245) Class67 local245 = local233[local199] = new Class67();
			@Pc(249) int local249 = local38.method544();
			if (local249 > 0) {
				local245.aByteArray39 = new byte[local249 * 2];
			}
			local249 = local38.method544();
			if (local249 > 0) {
				local245.aByteArray38 = new byte[local249 * 2 + 2];
				local245.aByteArray38[1] = 64;
			}
		}
		local205 = local38.method544();
		@Pc(307) byte[] local307 = local205 <= 0 ? null : new byte[local205 * 2];
		@Pc(309) int local309 = 0;
		local205 = local38.method544();
		while (local38.aByteArray3[local38.anInt839 + local309] != 0) {
			local309++;
		}
		@Pc(328) byte[] local328 = new byte[local309];
		@Pc(337) byte[] local337 = local205 > 0 ? new byte[local205 * 2] : null;
		for (@Pc(339) int local339 = 0; local339 < local309; local339++) {
			local328[local339] = local38.method548();
		}
		local38.anInt839++;
		@Pc(359) int local359 = 0;
		local309++;
		for (@Pc(362) int local362 = 0; local362 < 128; local362++) {
			local359 += local38.method544();
			this.aShortArray27[local362] = (short) local359;
		}
		local359 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local359 += local38.method544();
			this.aShortArray27[local384] = (short) (this.aShortArray27[local384] + (local359 << 8));
		}
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		for (@Pc(415) int local415 = 0; local415 < 128; local415++) {
			if (local409 == 0) {
				if (local411 >= local328.length) {
					local409 = -1;
				} else {
					local409 = local328[local411++];
				}
				local413 = local38.method540();
			}
			this.aShortArray27[local415] = (short) (this.aShortArray27[local415] + ((local413 - 1 & 0x2) << 14));
			local409--;
			this.anIntArray270[local415] = local413;
		}
		@Pc(465) int local465 = 0;
		local411 = 0;
		local409 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray270[local471] != 0) {
				if (local409 == 0) {
					local465 = local38.aByteArray3[local82++] - 1;
					if (local52.length > local411) {
						local409 = local52[local411++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aByteArray33[local471] = (byte) local465;
			}
		}
		local409 = 0;
		local411 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray270[local523] != 0) {
				if (local409 == 0) {
					if (local411 < local105.length) {
						local409 = local105[local411++];
					} else {
						local409 = -1;
					}
					local521 = local38.aByteArray3[local133++] + 16 << 2;
				}
				this.aByteArray34[local523] = (byte) local521;
				local409--;
			}
		}
		local411 = 0;
		local409 = 0;
		@Pc(582) Class67 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray270[local584] != 0) {
				if (local409 == 0) {
					local582 = local233[local176[local411]];
					if (local158.length > local411) {
						local409 = local158[local411++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aClass67Array1[local584] = local582;
			}
		}
		local411 = 0;
		local409 = 0;
		@Pc(631) int local631 = 0;
		for (@Pc(633) int local633 = 0; local633 < 128; local633++) {
			if (local409 == 0) {
				if (local328.length > local411) {
					local409 = local328[local411++];
				} else {
					local409 = -1;
				}
				if (this.anIntArray270[local633] > 0) {
					local631 = local38.method544() + 1;
				}
			}
			local409--;
			this.aByteArray35[local633] = (byte) local631;
		}
		this.anInt3049 = local38.method544() + 1;
		@Pc(699) int local699;
		for (@Pc(688) int local688 = 0; local688 < local187; local688++) {
			@Pc(694) Class67 local694 = local233[local688];
			if (local694.aByteArray39 != null) {
				for (local699 = 1; local699 < local694.aByteArray39.length; local699 += 2) {
					local694.aByteArray39[local699] = local38.method548();
				}
			}
			if (local694.aByteArray38 != null) {
				for (local699 = 3; local699 < local694.aByteArray38.length - 2; local699 += 2) {
					local694.aByteArray38[local699] = local38.method548();
				}
			}
		}
		@Pc(756) int local756;
		if (local307 != null) {
			for (local756 = 1; local756 < local307.length; local756 += 2) {
				local307[local756] = local38.method548();
			}
		}
		if (local337 != null) {
			for (local756 = 1; local756 < local337.length; local756 += 2) {
				local337[local756] = local38.method548();
			}
		}
		@Pc(801) int local801;
		for (local756 = 0; local756 < local187; local756++) {
			@Pc(794) Class67 local794 = local233[local756];
			if (local794.aByteArray38 != null) {
				local359 = 0;
				for (local801 = 2; local801 < local794.aByteArray38.length; local801 += 2) {
					local359 -= -local38.method544() - 1;
					local794.aByteArray38[local801] = (byte) local359;
				}
			}
		}
		@Pc(846) int local846;
		for (local699 = 0; local699 < local187; local699++) {
			@Pc(839) Class67 local839 = local233[local699];
			if (local839.aByteArray39 != null) {
				local359 = 0;
				for (local846 = 2; local846 < local839.aByteArray39.length; local846 += 2) {
					local359 = local359 + local38.method544() + 1;
					local839.aByteArray39[local846] = (byte) local359;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(938) int local938;
		@Pc(944) byte local944;
		@Pc(966) int local966;
		@Pc(968) int local968;
		@Pc(978) int local978;
		@Pc(913) byte local913;
		@Pc(1022) int local1022;
		if (local307 != null) {
			local359 = local38.method544();
			local307[0] = (byte) local359;
			for (local801 = 2; local801 < local307.length; local801 += 2) {
				local359 = local38.method544() + local359 + 1;
				local307[local801] = (byte) local359;
			}
			@Pc(909) byte local909 = local307[1];
			local913 = local307[0];
			for (local915 = 0; local915 < local913; local915++) {
				this.aByteArray35[local915] = (byte) (local909 * this.aByteArray35[local915] + 32 >> 6);
			}
			local938 = 2;
			while (local307.length > local938) {
				local944 = local307[local938];
				@Pc(950) byte local950 = local307[local938 + 1];
				local938 += 2;
				local966 = (local944 - local913) * local909 + (local944 - local913) / 2;
				for (local968 = local913; local968 < local944; local968++) {
					local978 = Static157.method2925(local944 - local913, local966);
					local966 += local950 - local909;
					this.aByteArray35[local968] = (byte) (this.aByteArray35[local968] * local978 + 32 >> 6);
				}
				local909 = local950;
				local913 = local944;
			}
			for (local1022 = local913; local1022 < 128; local1022++) {
				this.aByteArray35[local1022] = (byte) (this.aByteArray35[local1022] * local909 + 32 >> 6);
			}
		}
		@Pc(1088) int local1088;
		if (local337 != null) {
			local359 = local38.method544();
			local337[0] = (byte) local359;
			for (local801 = 2; local801 < local337.length; local801 += 2) {
				local359 = local38.method544() + local359 + 1;
				local337[local801] = (byte) local359;
			}
			local1088 = local337[1] << 1;
			local913 = local337[0];
			for (local915 = 0; local915 < local913; local915++) {
				local938 = local1088 + (this.aByteArray34[local915] & 0xFF);
				if (local938 < 0) {
					local938 = 0;
				}
				if (local938 > 128) {
					local938 = 128;
				}
				this.aByteArray34[local915] = (byte) local938;
			}
			local938 = 2;
			@Pc(1149) int local1149;
			while (local938 < local337.length) {
				local944 = local337[local938];
				local1149 = local337[local938 + 1] << 1;
				local966 = local1088 * (local944 - local913) + (local944 - local913) / 2;
				for (local968 = local913; local968 < local944; local968++) {
					local978 = Static157.method2925(local944 - local913, local966);
					@Pc(1184) int local1184 = local978 + (this.aByteArray34[local968] & 0xFF);
					local966 += local1149 - local1088;
					if (local1184 < 0) {
						local1184 = 0;
					}
					if (local1184 > 128) {
						local1184 = 128;
					}
					this.aByteArray34[local968] = (byte) local1184;
				}
				local938 += 2;
				local1088 = local1149;
				local913 = local944;
			}
			for (local1022 = local913; local1022 < 128; local1022++) {
				local1149 = local1088 + (this.aByteArray34[local1022] & 0xFF);
				if (local1149 < 0) {
					local1149 = 0;
				}
				if (local1149 > 128) {
					local1149 = 128;
				}
				this.aByteArray34[local1022] = (byte) local1149;
			}
		}
		for (local801 = 0; local801 < local187; local801++) {
			local233[local801].anInt3841 = local38.method544();
		}
		for (local846 = 0; local846 < local187; local846++) {
			@Pc(1283) Class67 local1283 = local233[local846];
			if (local1283.aByteArray39 != null) {
				local1283.anInt3835 = local38.method544();
			}
			if (local1283.aByteArray38 != null) {
				local1283.anInt3837 = local38.method544();
			}
			if (local1283.anInt3841 > 0) {
				local1283.anInt3843 = local38.method544();
			}
		}
		for (local1088 = 0; local1088 < local187; local1088++) {
			local233[local1088].anInt3840 = local38.method544();
		}
		for (local915 = 0; local915 < local187; local915++) {
			@Pc(1337) Class67 local1337 = local233[local915];
			if (local1337.anInt3840 > 0) {
				local1337.anInt3838 = local38.method544();
			}
		}
		for (local938 = 0; local938 < local187; local938++) {
			@Pc(1360) Class67 local1360 = local233[local938];
			if (local1360.anInt3838 > 0) {
				local1360.anInt3833 = local38.method544();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IILclient!tb;)Z")
	public boolean method2143(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class73 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub13_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray270[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method2861(local25 >> 2, arg1);
						} else {
							local11 = arg2.method2859(arg1, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub13_Sub1Array1[local13] = local11;
						this.anIntArray270[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method2144() {
		this.anIntArray270 = null;
	}
}
