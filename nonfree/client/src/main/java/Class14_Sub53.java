import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class14_Sub53 extends Class14 {

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "[S")
	public short[] aShortArray158;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "[B")
	public byte[] aByteArray135;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "[B")
	public byte[] aByteArray136;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "[Lclient!dga;")
	public Class14_Sub14_Sub1[] aClass14_Sub14_Sub1Array1;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "[Lclient!vu;")
	public Class375[] aClass375Array1;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "[I")
	private int[] anIntArray798;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "[B")
	public byte[] aByteArray137;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public int anInt10689;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	private Class14_Sub53() {
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([B)V")
	public Class14_Sub53(@OriginalArg(0) byte[] arg0) {
		this.aShortArray158 = new short[128];
		this.aByteArray135 = new byte[128];
		this.anIntArray798 = new int[128];
		this.aByteArray137 = new byte[128];
		this.aClass14_Sub14_Sub1Array1 = new Class14_Sub14_Sub1[128];
		this.aByteArray136 = new byte[128];
		this.aClass375Array1 = new Class375[128];
		@Pc(36) Class14_Sub29 local36 = new Class14_Sub29(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray84[local36.anInt7264 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5845();
		}
		local36.anInt7264++;
		local38++;
		@Pc(79) int local79 = local36.anInt7264;
		local36.anInt7264 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray84[local87 + local36.anInt7264] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method5845();
		}
		local87++;
		local36.anInt7264++;
		@Pc(129) int local129 = local36.anInt7264;
		local36.anInt7264 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray84[local36.anInt7264 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method5845();
		}
		local36.anInt7264++;
		local137++;
		@Pc(179) byte[] local179 = new byte[local137];
		@Pc(190) int local190;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local137 > 1) {
			local179[1] = 1;
			local190 = 2;
			@Pc(192) int local192 = 1;
			for (local194 = 2; local194 < local137; local194++) {
				local200 = local36.method5866();
				if (local200 == 0) {
					local192 = local190++;
				} else {
					if (local192 >= local200) {
						local200--;
					}
					local192 = local200;
				}
				local179[local194] = (byte) local192;
			}
		} else {
			local190 = local137;
		}
		@Pc(236) Class375[] local236 = new Class375[local190];
		for (local194 = 0; local194 < local236.length; local194++) {
			@Pc(248) Class375 local248 = local236[local194] = new Class375();
			@Pc(252) int local252 = local36.method5866();
			if (local252 > 0) {
				local248.aByteArray138 = new byte[local252 * 2];
			}
			local252 = local36.method5866();
			if (local252 > 0) {
				local248.aByteArray139 = new byte[local252 * 2 + 2];
				local248.aByteArray139[1] = 64;
			}
		}
		local200 = local36.method5866();
		@Pc(307) byte[] local307 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local36.method5866();
		@Pc(320) byte[] local320 = local200 > 0 ? new byte[local200 * 2] : null;
		@Pc(322) int local322;
		for (local322 = 0; local36.aByteArray84[local36.anInt7264 + local322] != 0; local322++) {
		}
		@Pc(337) byte[] local337 = new byte[local322];
		for (@Pc(339) int local339 = 0; local339 < local322; local339++) {
			local337[local339] = local36.method5845();
		}
		local36.anInt7264++;
		local322++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local36.method5866();
			this.aShortArray158[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local364 += local36.method5866();
			this.aShortArray158[local390] = (short) (this.aShortArray158[local390] + (local364 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local417 >= local337.length) {
					local415 = -1;
				} else {
					local415 = local337[local417++];
				}
				local419 = local36.method5889();
			}
			this.aShortArray158[local421] = (short) (this.aShortArray158[local421] + ((local419 - 1 & 0x2) << 14));
			local415--;
			this.anIntArray798[local421] = local419;
		}
		local417 = 0;
		local415 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray798[local477] != 0) {
				if (local415 == 0) {
					local475 = local36.aByteArray84[local79++] - 1;
					if (local55.length > local417) {
						local415 = local55[local417++];
					} else {
						local415 = -1;
					}
				}
				this.aByteArray135[local477] = (byte) local475;
				local415--;
			}
		}
		local417 = 0;
		local415 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray798[local531] != 0) {
				if (local415 == 0) {
					if (local101.length <= local417) {
						local415 = -1;
					} else {
						local415 = local101[local417++];
					}
					local529 = local36.aByteArray84[local129++] + 16 << 2;
				}
				local415--;
				this.aByteArray137[local531] = (byte) local529;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(592) Class375 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray798[local594] != 0) {
				if (local415 == 0) {
					local592 = local236[local179[local417]];
					if (local417 >= local151.length) {
						local415 = -1;
					} else {
						local415 = local151[local417++];
					}
				}
				this.aClass375Array1[local594] = local592;
				local415--;
			}
		}
		local417 = 0;
		local415 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local415 == 0) {
				if (local417 < local337.length) {
					local415 = local337[local417++];
				} else {
					local415 = -1;
				}
				if (this.anIntArray798[local642] > 0) {
					local640 = local36.method5866() + 1;
				}
			}
			this.aByteArray136[local642] = (byte) local640;
			local415--;
		}
		this.anInt10689 = local36.method5866() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local190; local696++) {
			@Pc(702) Class375 local702 = local236[local696];
			if (local702.aByteArray138 != null) {
				for (local707 = 1; local707 < local702.aByteArray138.length; local707 += 2) {
					local702.aByteArray138[local707] = local36.method5845();
				}
			}
			if (local702.aByteArray139 != null) {
				for (local707 = 3; local707 < local702.aByteArray139.length - 2; local707 += 2) {
					local702.aByteArray139[local707] = local36.method5845();
				}
			}
		}
		@Pc(756) int local756;
		if (local307 != null) {
			for (local756 = 1; local756 < local307.length; local756 += 2) {
				local307[local756] = local36.method5845();
			}
		}
		if (local320 != null) {
			for (local756 = 1; local756 < local320.length; local756 += 2) {
				local320[local756] = local36.method5845();
			}
		}
		@Pc(805) int local805;
		for (local756 = 0; local756 < local190; local756++) {
			@Pc(798) Class375 local798 = local236[local756];
			if (local798.aByteArray139 != null) {
				local364 = 0;
				for (local805 = 2; local805 < local798.aByteArray139.length; local805 += 2) {
					local364 += local36.method5866() + 1;
					local798.aByteArray139[local805] = (byte) local364;
				}
			}
		}
		@Pc(855) int local855;
		for (local707 = 0; local707 < local190; local707++) {
			@Pc(848) Class375 local848 = local236[local707];
			if (local848.aByteArray138 != null) {
				local364 = 0;
				for (local855 = 2; local855 < local848.aByteArray138.length; local855 += 2) {
					local364 += local36.method5866() + 1;
					local848.aByteArray138[local855] = (byte) local364;
				}
			}
		}
		@Pc(932) int local932;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(982) int local982;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(926) byte local926;
		@Pc(1040) int local1040;
		if (local307 != null) {
			local364 = local36.method5866();
			local307[0] = (byte) local364;
			for (local805 = 2; local805 < local307.length; local805 += 2) {
				local364 = local364 + local36.method5866() + 1;
				local307[local805] = (byte) local364;
			}
			local926 = local307[0];
			@Pc(930) byte local930 = local307[1];
			for (local932 = 0; local932 < local926; local932++) {
				this.aByteArray136[local932] = (byte) (this.aByteArray136[local932] * local930 + 32 >> 6);
			}
			local955 = 2;
			while (local307.length > local955) {
				local961 = local307[local955];
				@Pc(967) byte local967 = local307[local955 + 1];
				local982 = (local961 - local926) * local930 + (local961 - local926) / 2;
				for (local984 = local926; local984 < local961; local984++) {
					local994 = Static52.method1101(local982, local961 - local926);
					this.aByteArray136[local984] = (byte) (this.aByteArray136[local984] * local994 + 32 >> 6);
					local982 += local967 - local930;
				}
				local955 += 2;
				local926 = local961;
				local930 = local967;
			}
			for (local1040 = local926; local1040 < 128; local1040++) {
				this.aByteArray136[local1040] = (byte) (this.aByteArray136[local1040] * local930 + 32 >> 6);
			}
		}
		@Pc(1108) int local1108;
		if (local320 != null) {
			local364 = local36.method5866();
			local320[0] = (byte) local364;
			for (local805 = 2; local805 < local320.length; local805 += 2) {
				local364 += local36.method5866() + 1;
				local320[local805] = (byte) local364;
			}
			local926 = local320[0];
			local1108 = local320[1] << 1;
			for (local932 = 0; local932 < local926; local932++) {
				local955 = local1108 + (this.aByteArray137[local932] & 0xFF);
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray137[local932] = (byte) local955;
			}
			local955 = 2;
			@Pc(1158) int local1158;
			while (local955 < local320.length) {
				local961 = local320[local955];
				local1158 = local320[local955 + 1] << 1;
				local982 = local1108 * (local961 - local926) + (local961 - local926) / 2;
				for (local984 = local926; local984 < local961; local984++) {
					local994 = Static52.method1101(local982, local961 - local926);
					@Pc(1194) int local1194 = (this.aByteArray137[local984] & 0xFF) + local994;
					if (local1194 < 0) {
						local1194 = 0;
					}
					if (local1194 > 128) {
						local1194 = 128;
					}
					local982 += local1158 - local1108;
					this.aByteArray137[local984] = (byte) local1194;
				}
				local955 += 2;
				local926 = local961;
				local1108 = local1158;
			}
			for (local1040 = local926; local1040 < 128; local1040++) {
				local1158 = local1108 + (this.aByteArray137[local1040] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray137[local1040] = (byte) local1158;
			}
		}
		for (local805 = 0; local805 < local190; local805++) {
			local236[local805].anInt10804 = local36.method5866();
		}
		for (local855 = 0; local855 < local190; local855++) {
			@Pc(1290) Class375 local1290 = local236[local855];
			if (local1290.aByteArray138 != null) {
				local1290.anInt10800 = local36.method5866();
			}
			if (local1290.aByteArray139 != null) {
				local1290.anInt10801 = local36.method5866();
			}
			if (local1290.anInt10804 > 0) {
				local1290.anInt10805 = local36.method5866();
			}
		}
		for (local1108 = 0; local1108 < local190; local1108++) {
			local236[local1108].anInt10799 = local36.method5866();
		}
		for (local932 = 0; local932 < local190; local932++) {
			@Pc(1352) Class375 local1352 = local236[local932];
			if (local1352.anInt10799 > 0) {
				local1352.anInt10806 = local36.method5866();
			}
		}
		for (local955 = 0; local955 < local190; local955++) {
			@Pc(1376) Class375 local1376 = local236[local955];
			if (local1376.anInt10806 > 0) {
				local1376.anInt10798 = local36.method5866();
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z[ILclient!gm;[B)Z")
	public boolean method8915(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class14_Sub14_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray798[local18];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg1.method3001(local33 >> 2, arg0);
						} else {
							local11 = arg1.method2997(local33 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass14_Sub14_Sub1Array1[local18] = local11;
						this.anIntArray798[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public void method8916() {
		this.anIntArray798 = null;
	}
}
