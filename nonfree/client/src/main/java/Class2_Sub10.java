import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "[Lclient!fa;")
	public Class81[] aClass81Array1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!mca;")
	public Class2_Sub31_Sub1[] aClass2_Sub31_Sub1Array1;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	private Class2_Sub10() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray34 = new byte[128];
		this.aByteArray33 = new byte[128];
		this.aByteArray35 = new byte[128];
		this.aShortArray36 = new short[128];
		this.anIntArray80 = new int[128];
		this.aClass81Array1 = new Class81[128];
		this.aClass2_Sub31_Sub1Array1 = new Class2_Sub31_Sub1[128];
		@Pc(36) Class2_Sub29 local36 = new Class2_Sub29(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray96[local36.anInt6132 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method5179();
		}
		local36.anInt6132++;
		local38++;
		@Pc(80) int local80 = local36.anInt6132;
		local36.anInt6132 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray96[local88 + local36.anInt6132] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method5179();
		}
		local88++;
		local36.anInt6132++;
		@Pc(129) int local129 = local36.anInt6132;
		local36.anInt6132 += local88;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray96[local137 + local36.anInt6132] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method5179();
		}
		local36.anInt6132++;
		local137++;
		@Pc(179) byte[] local179 = new byte[local137];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local137 > 1) {
			local179[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local137; local192++) {
				local198 = local36.method5170();
				if (local198 == 0) {
					local190 = local188++;
				} else {
					if (local190 >= local198) {
						local198--;
					}
					local190 = local198;
				}
				local179[local192] = (byte) local190;
			}
		} else {
			local188 = local137;
		}
		@Pc(234) Class81[] local234 = new Class81[local188];
		for (local192 = 0; local192 < local234.length; local192++) {
			@Pc(246) Class81 local246 = local234[local192] = new Class81();
			@Pc(250) int local250 = local36.method5170();
			if (local250 > 0) {
				local246.aByteArray62 = new byte[local250 * 2];
			}
			local250 = local36.method5170();
			if (local250 > 0) {
				local246.aByteArray61 = new byte[local250 * 2 + 2];
				local246.aByteArray61[1] = 64;
			}
		}
		local198 = local36.method5170();
		@Pc(305) byte[] local305 = local198 > 0 ? new byte[local198 * 2] : null;
		local198 = local36.method5170();
		@Pc(318) byte[] local318 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray96[local36.anInt6132 + local320] != 0; local320++) {
		}
		@Pc(335) byte[] local335 = new byte[local320];
		for (@Pc(337) int local337 = 0; local337 < local320; local337++) {
			local335[local337] = local36.method5179();
		}
		local320++;
		local36.anInt6132++;
		@Pc(362) int local362 = 0;
		for (@Pc(364) int local364 = 0; local364 < 128; local364++) {
			local362 += local36.method5170();
			this.aShortArray36[local364] = (short) local362;
		}
		local362 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local362 += local36.method5170();
			this.aShortArray36[local386] = (short) (this.aShortArray36[local386] + (local362 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local335.length > local413) {
					local411 = local335[local413++];
				} else {
					local411 = -1;
				}
				local415 = local36.method5177();
			}
			this.aShortArray36[local417] = (short) (this.aShortArray36[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray80[local417] = local415;
			local411--;
		}
		local411 = 0;
		local413 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray80[local477] != 0) {
				if (local411 == 0) {
					local475 = local36.aByteArray96[local80++] - 1;
					if (local56.length > local413) {
						local411 = local56[local413++];
					} else {
						local411 = -1;
					}
				}
				this.aByteArray35[local477] = (byte) local475;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(530) int local530 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray80[local532] != 0) {
				if (local411 == 0) {
					if (local413 < local105.length) {
						local411 = local105[local413++];
					} else {
						local411 = -1;
					}
					local530 = local36.aByteArray96[local129++] + 16 << 2;
				}
				local411--;
				this.aByteArray34[local532] = (byte) local530;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(587) Class81 local587 = null;
		for (@Pc(589) int local589 = 0; local589 < 128; local589++) {
			if (this.anIntArray80[local589] != 0) {
				if (local411 == 0) {
					local587 = local234[local179[local413]];
					if (local413 < local151.length) {
						local411 = local151[local413++];
					} else {
						local411 = -1;
					}
				}
				local411--;
				this.aClass81Array1[local589] = local587;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local411 == 0) {
				if (local413 >= local335.length) {
					local411 = -1;
				} else {
					local411 = local335[local413++];
				}
				if (this.anIntArray80[local641] > 0) {
					local639 = local36.method5170() + 1;
				}
			}
			local411--;
			this.aByteArray33[local641] = (byte) local639;
		}
		this.anInt953 = local36.method5170() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local188; local698++) {
			@Pc(704) Class81 local704 = local234[local698];
			if (local704.aByteArray62 != null) {
				for (local709 = 1; local709 < local704.aByteArray62.length; local709 += 2) {
					local704.aByteArray62[local709] = local36.method5179();
				}
			}
			if (local704.aByteArray61 != null) {
				for (local709 = 3; local709 < local704.aByteArray61.length - 2; local709 += 2) {
					local704.aByteArray61[local709] = local36.method5179();
				}
			}
		}
		@Pc(754) int local754;
		if (local305 != null) {
			for (local754 = 1; local754 < local305.length; local754 += 2) {
				local305[local754] = local36.method5179();
			}
		}
		if (local318 != null) {
			for (local754 = 1; local754 < local318.length; local754 += 2) {
				local318[local754] = local36.method5179();
			}
		}
		@Pc(803) int local803;
		for (local754 = 0; local754 < local188; local754++) {
			@Pc(796) Class81 local796 = local234[local754];
			if (local796.aByteArray61 != null) {
				local362 = 0;
				for (local803 = 2; local803 < local796.aByteArray61.length; local803 += 2) {
					local362 -= -local36.method5170() - 1;
					local796.aByteArray61[local803] = (byte) local362;
				}
			}
		}
		@Pc(849) int local849;
		for (local709 = 0; local709 < local188; local709++) {
			@Pc(842) Class81 local842 = local234[local709];
			if (local842.aByteArray62 != null) {
				local362 = 0;
				for (local849 = 2; local849 < local842.aByteArray62.length; local849 += 2) {
					local362 = local36.method5170() + local362 + 1;
					local842.aByteArray62[local849] = (byte) local362;
				}
			}
		}
		@Pc(923) int local923;
		@Pc(946) int local946;
		@Pc(952) byte local952;
		@Pc(971) int local971;
		@Pc(973) int local973;
		@Pc(982) int local982;
		@Pc(917) byte local917;
		@Pc(1023) int local1023;
		if (local305 != null) {
			local362 = local36.method5170();
			local305[0] = (byte) local362;
			for (local803 = 2; local803 < local305.length; local803 += 2) {
				local362 = local362 + local36.method5170() + 1;
				local305[local803] = (byte) local362;
			}
			local917 = local305[0];
			@Pc(921) byte local921 = local305[1];
			for (local923 = 0; local923 < local917; local923++) {
				this.aByteArray33[local923] = (byte) (this.aByteArray33[local923] * local921 + 32 >> 6);
			}
			for (local946 = 2; local946 < local305.length; local946 += 2) {
				local952 = local305[local946];
				@Pc(958) byte local958 = local305[local946 + 1];
				local971 = (local952 - local917) / 2 + (local952 - local917) * local921;
				for (local973 = local917; local973 < local952; local973++) {
					local982 = Static425.method5863(local971, local952 - local917);
					local971 += local958 - local921;
					this.aByteArray33[local973] = (byte) (this.aByteArray33[local973] * local982 + 32 >> 6);
				}
				local917 = local952;
				local921 = local958;
			}
			for (local1023 = local917; local1023 < 128; local1023++) {
				this.aByteArray33[local1023] = (byte) (this.aByteArray33[local1023] * local921 + 32 >> 6);
			}
		}
		@Pc(1095) int local1095;
		if (local318 != null) {
			local362 = local36.method5170();
			local318[0] = (byte) local362;
			for (local803 = 2; local803 < local318.length; local803 += 2) {
				local362 = local362 + local36.method5170() + 1;
				local318[local803] = (byte) local362;
			}
			local917 = local318[0];
			local1095 = local318[1] << 1;
			for (local923 = 0; local923 < local917; local923++) {
				local946 = local1095 + (this.aByteArray34[local923] & 0xFF);
				if (local946 < 0) {
					local946 = 0;
				}
				if (local946 > 128) {
					local946 = 128;
				}
				this.aByteArray34[local923] = (byte) local946;
			}
			@Pc(1150) int local1150;
			for (local946 = 2; local946 < local318.length; local946 += 2) {
				local952 = local318[local946];
				local1150 = local318[local946 + 1] << 1;
				local971 = local1095 * (local952 - local917) + (local952 - local917) / 2;
				for (local973 = local917; local973 < local952; local973++) {
					local982 = Static425.method5863(local971, local952 - local917);
					@Pc(1186) int local1186 = (this.aByteArray34[local973] & 0xFF) + local982;
					if (local1186 < 0) {
						local1186 = 0;
					}
					if (local1186 > 128) {
						local1186 = 128;
					}
					local971 += local1150 - local1095;
					this.aByteArray34[local973] = (byte) local1186;
				}
				local917 = local952;
				local1095 = local1150;
			}
			for (local1023 = local917; local1023 < 128; local1023++) {
				local1150 = local1095 + (this.aByteArray34[local1023] & 0xFF);
				if (local1150 < 0) {
					local1150 = 0;
				}
				if (local1150 > 128) {
					local1150 = 128;
				}
				this.aByteArray34[local1023] = (byte) local1150;
			}
		}
		for (local803 = 0; local803 < local188; local803++) {
			local234[local803].anInt2447 = local36.method5170();
		}
		for (local849 = 0; local849 < local188; local849++) {
			@Pc(1281) Class81 local1281 = local234[local849];
			if (local1281.aByteArray62 != null) {
				local1281.anInt2441 = local36.method5170();
			}
			if (local1281.aByteArray61 != null) {
				local1281.anInt2444 = local36.method5170();
			}
			if (local1281.anInt2447 > 0) {
				local1281.anInt2448 = local36.method5170();
			}
		}
		for (local1095 = 0; local1095 < local188; local1095++) {
			local234[local1095].anInt2450 = local36.method5170();
		}
		for (local923 = 0; local923 < local188; local923++) {
			@Pc(1336) Class81 local1336 = local234[local923];
			if (local1336.anInt2450 > 0) {
				local1336.anInt2449 = local36.method5170();
			}
		}
		for (local946 = 0; local946 < local188; local946++) {
			@Pc(1359) Class81 local1359 = local234[local946];
			if (local1359.anInt2449 > 0) {
				local1359.anInt2446 = local36.method5170();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public void method967() {
		this.anIntArray80 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BZLclient!gv;[I)Z")
	public boolean method970(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class108 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub31_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray80[local18];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg1.method2843(arg2, local33 >> 2);
						} else {
							local11 = arg1.method2842(arg2, local33 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub31_Sub1Array1[local18] = local11;
						this.anIntArray80[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
