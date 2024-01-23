import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "[I")
	private int[] anIntArray260 = new int[128];

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "[B")
	public byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[Lclient!qj;")
	public Class1_Sub4_Sub1[] aClass1_Sub4_Sub1Array1 = new Class1_Sub4_Sub1[128];

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[S")
	public short[] aShortArray45 = new short[128];

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[B")
	public byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "[Lclient!q;")
	public Class127[] aClass127Array1;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		@Pc(25) int local25 = 0;
		this.aClass127Array1 = new Class127[128];
		this.aByteArray29 = new byte[128];
		@Pc(38) Class1_Sub16 local38 = new Class1_Sub16(arg0);
		while (local38.aByteArray39[local25 + local38.anInt3328] != 0) {
			local25++;
		}
		@Pc(55) byte[] local55 = new byte[local25];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local25; local57++) {
			local55[local57] = local38.method2633();
		}
		local38.anInt3328++;
		local25++;
		local57 = local38.anInt3328;
		local38.anInt3328 += local25;
		@Pc(87) int local87;
		for (local87 = 0; local38.aByteArray39[local38.anInt3328 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		@Pc(104) int local104;
		for (local104 = 0; local104 < local87; local104++) {
			local102[local104] = local38.method2633();
		}
		local38.anInt3328++;
		local104 = local38.anInt3328;
		local87++;
		@Pc(128) int local128 = 0;
		local38.anInt3328 += local87;
		while (local38.aByteArray39[local128 + local38.anInt3328] != 0) {
			local128++;
		}
		@Pc(151) byte[] local151 = new byte[local128];
		for (@Pc(153) int local153 = 0; local153 < local128; local153++) {
			local151[local153] = local38.method2633();
		}
		local128++;
		@Pc(169) byte[] local169 = new byte[local128];
		local38.anInt3328++;
		@Pc(184) int local184;
		@Pc(188) int local188;
		if (local128 > 1) {
			local169[1] = 1;
			local184 = 2;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local128; local188++) {
				@Pc(195) int local195 = local38.method2655();
				if (local195 == 0) {
					local186 = local184++;
				} else {
					if (local195 <= local186) {
						local195--;
					}
					local186 = local195;
				}
				local169[local188] = (byte) local186;
			}
		} else {
			local184 = local128;
		}
		@Pc(228) Class127[] local228 = new Class127[local184];
		for (local188 = 0; local188 < local228.length; local188++) {
			@Pc(242) Class127 local242 = local228[local188] = new Class127();
			@Pc(246) int local246 = local38.method2655();
			if (local246 > 0) {
				local242.aByteArray64 = new byte[local246 * 2];
			}
			local246 = local38.method2655();
			if (local246 > 0) {
				local242.aByteArray63 = new byte[local246 * 2 + 2];
				local242.aByteArray63[1] = 64;
			}
		}
		local188 = local38.method2655();
		@Pc(300) byte[] local300 = local188 <= 0 ? null : new byte[local188 * 2];
		local188 = local38.method2655();
		@Pc(314) byte[] local314 = local188 <= 0 ? null : new byte[local188 * 2];
		@Pc(316) int local316;
		for (local316 = 0; local38.aByteArray39[local38.anInt3328 + local316] != 0; local316++) {
		}
		@Pc(330) byte[] local330 = new byte[local316];
		@Pc(332) int local332;
		for (local332 = 0; local332 < local316; local332++) {
			local330[local332] = local38.method2633();
		}
		local38.anInt3328++;
		local316++;
		local332 = 0;
		@Pc(355) int local355;
		for (local355 = 0; local355 < 128; local355++) {
			local332 += local38.method2655();
			this.aShortArray45[local355] = (short) local332;
		}
		local332 = 0;
		for (local355 = 0; local355 < 128; local355++) {
			local332 += local38.method2655();
			this.aShortArray45[local355] = (short) (this.aShortArray45[local355] + (local332 << 8));
		}
		@Pc(406) int local406 = 0;
		local355 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412;
		for (local412 = 0; local412 < 128; local412++) {
			if (local355 == 0) {
				if (local330.length <= local406) {
					local355 = -1;
				} else {
					local355 = local330[local406++];
				}
				local410 = local38.method2622();
			}
			this.aShortArray45[local412] = (short) (this.aShortArray45[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray260[local412] = local410;
			local355--;
		}
		local355 = 0;
		local406 = 0;
		local412 = 0;
		@Pc(475) int local475;
		for (local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray260[local475] != 0) {
				if (local355 == 0) {
					if (local406 < local55.length) {
						local355 = local55[local406++];
					} else {
						local355 = -1;
					}
					local412 = local38.aByteArray39[local57++] - 1;
				}
				this.aByteArray31[local475] = (byte) local412;
				local355--;
			}
		}
		local355 = 0;
		local475 = 0;
		local406 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray260[local529] != 0) {
				if (local355 == 0) {
					local475 = local38.aByteArray39[local104++] + 16 << 2;
					if (local406 < local102.length) {
						local355 = local102[local406++];
					} else {
						local355 = -1;
					}
				}
				local355--;
				this.aByteArray30[local529] = (byte) local475;
			}
		}
		local406 = 0;
		local355 = 0;
		@Pc(584) Class127 local584 = null;
		@Pc(586) int local586;
		for (local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray260[local586] != 0) {
				if (local355 == 0) {
					local584 = local228[local169[local406]];
					if (local151.length > local406) {
						local355 = local151[local406++];
					} else {
						local355 = -1;
					}
				}
				local355--;
				this.aClass127Array1[local586] = local584;
			}
		}
		local355 = 0;
		local406 = 0;
		local586 = 0;
		@Pc(638) int local638;
		for (local638 = 0; local638 < 128; local638++) {
			if (local355 == 0) {
				if (local406 >= local330.length) {
					local355 = -1;
				} else {
					local355 = local330[local406++];
				}
				if (this.anIntArray260[local638] > 0) {
					local586 = local38.method2655() + 1;
				}
			}
			local355--;
			this.aByteArray29[local638] = (byte) local586;
		}
		this.anInt2795 = local38.method2655() + 1;
		@Pc(696) Class127 local696;
		@Pc(702) int local702;
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.aByteArray64 != null) {
				for (local702 = 1; local702 < local696.aByteArray64.length; local702 += 2) {
					local696.aByteArray64[local702] = local38.method2633();
				}
			}
			if (local696.aByteArray63 != null) {
				for (local702 = 3; local702 < local696.aByteArray63.length - 2; local702 += 2) {
					local696.aByteArray63[local702] = local38.method2633();
				}
			}
		}
		if (local300 != null) {
			for (local638 = 1; local638 < local300.length; local638 += 2) {
				local300[local638] = local38.method2633();
			}
		}
		if (local314 != null) {
			for (local638 = 1; local638 < local314.length; local638 += 2) {
				local314[local638] = local38.method2633();
			}
		}
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.aByteArray63 != null) {
				local332 = 0;
				for (local702 = 2; local702 < local696.aByteArray63.length; local702 += 2) {
					local332 = local38.method2655() + local332 + 1;
					local696.aByteArray63[local702] = (byte) local332;
				}
			}
		}
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.aByteArray64 != null) {
				local332 = 0;
				for (local702 = 2; local702 < local696.aByteArray64.length; local702 += 2) {
					local332 = local332 + local38.method2655() + 1;
					local696.aByteArray64[local702] = (byte) local332;
				}
			}
		}
		@Pc(961) byte local961;
		@Pc(983) int local983;
		@Pc(985) int local985;
		@Pc(996) int local996;
		@Pc(1029) int local1029;
		@Pc(920) byte local920;
		if (local300 != null) {
			local332 = local38.method2655();
			local300[0] = (byte) local332;
			for (local638 = 2; local638 < local300.length; local638 += 2) {
				local332 += local38.method2655() + 1;
				local300[local638] = (byte) local332;
			}
			local920 = local300[0];
			@Pc(924) byte local924 = local300[1];
			for (local702 = 0; local702 < local920; local702++) {
				this.aByteArray29[local702] = (byte) (local924 * this.aByteArray29[local702] + 32 >> 6);
			}
			local702 = 2;
			while (local300.length > local702) {
				local961 = local300[local702];
				@Pc(967) byte local967 = local300[local702 + 1];
				local702 += 2;
				local983 = local924 * (local961 - local920) + (local961 - local920) / 2;
				for (local985 = local920; local985 < local961; local985++) {
					local996 = Static73.method1365(local961 - local920, local983);
					this.aByteArray29[local985] = (byte) (local996 * this.aByteArray29[local985] + 32 >> 6);
					local983 += local967 - local924;
				}
				local920 = local961;
				local924 = local967;
			}
			for (local1029 = local920; local1029 < 128; local1029++) {
				this.aByteArray29[local1029] = (byte) (local924 * this.aByteArray29[local1029] + 32 >> 6);
			}
		}
		if (local314 != null) {
			local332 = local38.method2655();
			local314[0] = (byte) local332;
			for (local638 = 2; local638 < local314.length; local638 += 2) {
				local332 = local38.method2655() + local332 + 1;
				local314[local638] = (byte) local332;
			}
			local920 = local314[0];
			@Pc(1098) int local1098 = local314[1] << 1;
			for (local702 = 0; local702 < local920; local702++) {
				local1029 = (this.aByteArray30[local702] & 0xFF) + local1098;
				if (local1029 < 0) {
					local1029 = 0;
				}
				if (local1029 > 128) {
					local1029 = 128;
				}
				this.aByteArray30[local702] = (byte) local1029;
			}
			local702 = 2;
			@Pc(1173) int local1173;
			while (local314.length > local702) {
				local961 = local314[local702];
				local983 = local1098 * (local961 - local920) + (local961 - local920) / 2;
				local1173 = local314[local702 + 1] << 1;
				for (local985 = local920; local985 < local961; local985++) {
					local996 = Static73.method1365(local961 - local920, local983);
					local983 += local1173 - local1098;
					@Pc(1200) int local1200 = local996 + (this.aByteArray30[local985] & 0xFF);
					if (local1200 < 0) {
						local1200 = 0;
					}
					if (local1200 > 128) {
						local1200 = 128;
					}
					this.aByteArray30[local985] = (byte) local1200;
				}
				local920 = local961;
				local702 += 2;
				local1098 = local1173;
			}
			for (local1029 = local920; local1029 < 128; local1029++) {
				local1173 = local1098 + (this.aByteArray30[local1029] & 0xFF);
				if (local1173 < 0) {
					local1173 = 0;
				}
				if (local1173 > 128) {
					local1173 = 128;
				}
				this.aByteArray30[local1029] = (byte) local1173;
			}
		}
		for (local638 = 0; local638 < local184; local638++) {
			local228[local638].anInt4639 = local38.method2655();
		}
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.aByteArray64 != null) {
				local696.anInt4638 = local38.method2655();
			}
			if (local696.aByteArray63 != null) {
				local696.anInt4637 = local38.method2655();
			}
			if (local696.anInt4639 > 0) {
				local696.anInt4641 = local38.method2655();
			}
		}
		for (local638 = 0; local638 < local184; local638++) {
			local228[local638].anInt4644 = local38.method2655();
		}
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.anInt4644 > 0) {
				local696.anInt4645 = local38.method2655();
			}
		}
		for (local638 = 0; local638 < local184; local638++) {
			local696 = local228[local638];
			if (local696.anInt4645 > 0) {
				local696.anInt4642 = local38.method2655();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B[ILclient!di;)Z")
	public boolean method2135(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub4_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(30) int local30 = this.anIntArray260[local13];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg2.method1026(arg1, local30 >> 2);
						} else {
							local11 = arg2.method1023(local30 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub4_Sub1Array1[local13] = local11;
						this.anIntArray260[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method2137() {
		this.anIntArray260 = null;
	}
}
