import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "[Lclient!rj;")
	public Class292[] aClass292Array1;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "[Lclient!ug;")
	public Class3_Sub48_Sub1[] aClass3_Sub48_Sub1Array1;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	private Class3_Sub9() {
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B)V")
	public Class3_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = new byte[128];
		this.aByteArray18 = new byte[128];
		this.aShortArray11 = new short[128];
		this.aClass3_Sub48_Sub1Array1 = new Class3_Sub48_Sub1[128];
		this.aClass292Array1 = new Class292[128];
		this.aByteArray17 = new byte[128];
		this.anIntArray39 = new int[128];
		@Pc(36) Class3_Sub11 local36 = new Class3_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray62[local36.anInt6128 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5212();
		}
		local36.anInt6128++;
		local38++;
		@Pc(79) int local79 = local36.anInt6128;
		local36.anInt6128 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray62[local36.anInt6128 + local87] != 0; local87++) {
		}
		@Pc(105) byte[] local105 = new byte[local87];
		for (@Pc(107) int local107 = 0; local107 < local87; local107++) {
			local105[local107] = local36.method5212();
		}
		local87++;
		local36.anInt6128++;
		@Pc(129) int local129 = local36.anInt6128;
		local36.anInt6128 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray62[local36.anInt6128 + local137] != 0; local137++) {
		}
		@Pc(152) byte[] local152 = new byte[local137];
		for (@Pc(154) int local154 = 0; local154 < local137; local154++) {
			local152[local154] = local36.method5212();
		}
		local36.anInt6128++;
		local137++;
		@Pc(176) byte[] local176 = new byte[local137];
		@Pc(189) int local189;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local137 > 1) {
			local176[1] = 1;
			@Pc(187) int local187 = 1;
			local189 = 2;
			for (local191 = 2; local191 < local137; local191++) {
				local197 = local36.method5175();
				if (local197 == 0) {
					local187 = local189++;
				} else {
					if (local197 <= local187) {
						local197--;
					}
					local187 = local197;
				}
				local176[local191] = (byte) local187;
			}
		} else {
			local189 = local137;
		}
		@Pc(230) Class292[] local230 = new Class292[local189];
		for (local191 = 0; local191 < local230.length; local191++) {
			@Pc(242) Class292 local242 = local230[local191] = new Class292();
			@Pc(246) int local246 = local36.method5175();
			if (local246 > 0) {
				local242.aByteArray87 = new byte[local246 * 2];
			}
			local246 = local36.method5175();
			if (local246 > 0) {
				local242.aByteArray86 = new byte[local246 * 2 + 2];
				local242.aByteArray86[1] = 64;
			}
		}
		local197 = local36.method5175();
		@Pc(298) byte[] local298 = local197 > 0 ? new byte[local197 * 2] : null;
		local197 = local36.method5175();
		@Pc(311) byte[] local311 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(313) int local313;
		for (local313 = 0; local36.aByteArray62[local313 + local36.anInt6128] != 0; local313++) {
		}
		@Pc(330) byte[] local330 = new byte[local313];
		for (@Pc(332) int local332 = 0; local332 < local313; local332++) {
			local330[local332] = local36.method5212();
		}
		local36.anInt6128++;
		local313++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method5175();
			this.aShortArray11[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local357 += local36.method5175();
			this.aShortArray11[local383] = (short) (this.aShortArray11[local383] + (local357 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local330.length <= local412) {
					local410 = -1;
				} else {
					local410 = local330[local412++];
				}
				local414 = local36.method5207();
			}
			this.aShortArray11[local416] = (short) (this.aShortArray11[local416] + ((local414 - 1 & 0x2) << 14));
			local410--;
			this.anIntArray39[local416] = local414;
		}
		local410 = 0;
		local412 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray39[local477] != 0) {
				if (local410 == 0) {
					local475 = local36.aByteArray62[local79++] - 1;
					if (local55.length <= local412) {
						local410 = -1;
					} else {
						local410 = local55[local412++];
					}
				}
				this.aByteArray16[local477] = (byte) local475;
				local410--;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(526) int local526 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray39[local528] != 0) {
				if (local410 == 0) {
					local526 = local36.aByteArray62[local129++] + 16 << 2;
					if (local105.length > local412) {
						local410 = local105[local412++];
					} else {
						local410 = -1;
					}
				}
				local410--;
				this.aByteArray17[local528] = (byte) local526;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(582) Class292 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray39[local584] != 0) {
				if (local410 == 0) {
					local582 = local230[local176[local412]];
					if (local412 < local152.length) {
						local410 = local152[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aClass292Array1[local584] = local582;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local410 == 0) {
				if (local412 >= local330.length) {
					local410 = -1;
				} else {
					local410 = local330[local412++];
				}
				if (this.anIntArray39[local635] > 0) {
					local633 = local36.method5175() + 1;
				}
			}
			this.aByteArray18[local635] = (byte) local633;
			local410--;
		}
		this.anInt884 = local36.method5175() + 1;
		@Pc(703) int local703;
		for (@Pc(692) int local692 = 0; local692 < local189; local692++) {
			@Pc(698) Class292 local698 = local230[local692];
			if (local698.aByteArray87 != null) {
				for (local703 = 1; local703 < local698.aByteArray87.length; local703 += 2) {
					local698.aByteArray87[local703] = local36.method5212();
				}
			}
			if (local698.aByteArray86 != null) {
				for (local703 = 3; local703 < local698.aByteArray86.length - 2; local703 += 2) {
					local698.aByteArray86[local703] = local36.method5212();
				}
			}
		}
		@Pc(760) int local760;
		if (local298 != null) {
			for (local760 = 1; local760 < local298.length; local760 += 2) {
				local298[local760] = local36.method5212();
			}
		}
		if (local311 != null) {
			for (local760 = 1; local760 < local311.length; local760 += 2) {
				local311[local760] = local36.method5212();
			}
		}
		@Pc(809) int local809;
		for (local760 = 0; local760 < local189; local760++) {
			@Pc(802) Class292 local802 = local230[local760];
			if (local802.aByteArray86 != null) {
				local357 = 0;
				for (local809 = 2; local809 < local802.aByteArray86.length; local809 += 2) {
					local357 = local357 + local36.method5175() + 1;
					local802.aByteArray86[local809] = (byte) local357;
				}
			}
		}
		@Pc(854) int local854;
		for (local703 = 0; local703 < local189; local703++) {
			@Pc(847) Class292 local847 = local230[local703];
			if (local847.aByteArray87 != null) {
				local357 = 0;
				for (local854 = 2; local854 < local847.aByteArray87.length; local854 += 2) {
					local357 = local36.method5175() + local357 + 1;
					local847.aByteArray87[local854] = (byte) local357;
				}
			}
		}
		@Pc(923) int local923;
		@Pc(946) int local946;
		@Pc(952) byte local952;
		@Pc(972) int local972;
		@Pc(974) int local974;
		@Pc(984) int local984;
		@Pc(917) byte local917;
		@Pc(1025) int local1025;
		if (local298 != null) {
			local357 = local36.method5175();
			local298[0] = (byte) local357;
			for (local809 = 2; local809 < local298.length; local809 += 2) {
				local357 = local357 + local36.method5175() + 1;
				local298[local809] = (byte) local357;
			}
			local917 = local298[0];
			@Pc(921) byte local921 = local298[1];
			for (local923 = 0; local923 < local917; local923++) {
				this.aByteArray18[local923] = (byte) (local921 * this.aByteArray18[local923] + 32 >> 6);
			}
			local946 = 2;
			while (local298.length > local946) {
				local952 = local298[local946];
				@Pc(958) byte local958 = local298[local946 + 1];
				local972 = (local952 - local917) / 2 + local921 * (local952 - local917);
				for (local974 = local917; local974 < local952; local974++) {
					local984 = Static538.method7180(local952 - local917, local972);
					local972 += local958 - local921;
					this.aByteArray18[local974] = (byte) (this.aByteArray18[local974] * local984 + 32 >> 6);
				}
				local946 += 2;
				local921 = local958;
				local917 = local952;
			}
			for (local1025 = local917; local1025 < 128; local1025++) {
				this.aByteArray18[local1025] = (byte) (local921 * this.aByteArray18[local1025] + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local311 != null) {
			local357 = local36.method5175();
			local311[0] = (byte) local357;
			for (local809 = 2; local809 < local311.length; local809 += 2) {
				local357 = local357 + local36.method5175() + 1;
				local311[local809] = (byte) local357;
			}
			local917 = local311[0];
			local1097 = local311[1] << 1;
			for (local923 = 0; local923 < local917; local923++) {
				local946 = local1097 + (this.aByteArray17[local923] & 0xFF);
				if (local946 < 0) {
					local946 = 0;
				}
				if (local946 > 128) {
					local946 = 128;
				}
				this.aByteArray17[local923] = (byte) local946;
			}
			local946 = 2;
			@Pc(1145) int local1145;
			while (local946 < local311.length) {
				local952 = local311[local946];
				local1145 = local311[local946 + 1] << 1;
				local972 = (local952 - local917) / 2 + (local952 - local917) * local1097;
				for (local974 = local917; local974 < local952; local974++) {
					local984 = Static538.method7180(local952 - local917, local972);
					@Pc(1179) int local1179 = (this.aByteArray17[local974] & 0xFF) + local984;
					if (local1179 < 0) {
						local1179 = 0;
					}
					if (local1179 > 128) {
						local1179 = 128;
					}
					local972 += local1145 - local1097;
					this.aByteArray17[local974] = (byte) local1179;
				}
				local946 += 2;
				local1097 = local1145;
				local917 = local952;
			}
			for (local1025 = local917; local1025 < 128; local1025++) {
				local1145 = (this.aByteArray17[local1025] & 0xFF) + local1097;
				if (local1145 < 0) {
					local1145 = 0;
				}
				if (local1145 > 128) {
					local1145 = 128;
				}
				this.aByteArray17[local1025] = (byte) local1145;
			}
		}
		for (local809 = 0; local809 < local189; local809++) {
			local230[local809].anInt7724 = local36.method5175();
		}
		for (local854 = 0; local854 < local189; local854++) {
			@Pc(1285) Class292 local1285 = local230[local854];
			if (local1285.aByteArray87 != null) {
				local1285.anInt7718 = local36.method5175();
			}
			if (local1285.aByteArray86 != null) {
				local1285.anInt7721 = local36.method5175();
			}
			if (local1285.anInt7724 > 0) {
				local1285.anInt7722 = local36.method5175();
			}
		}
		for (local1097 = 0; local1097 < local189; local1097++) {
			local230[local1097].anInt7720 = local36.method5175();
		}
		for (local923 = 0; local923 < local189; local923++) {
			@Pc(1343) Class292 local1343 = local230[local923];
			if (local1343.anInt7720 > 0) {
				local1343.anInt7717 = local36.method5175();
			}
		}
		for (local946 = 0; local946 < local189; local946++) {
			@Pc(1370) Class292 local1370 = local230[local946];
			if (local1370.anInt7717 > 0) {
				local1370.anInt7723 = local36.method5175();
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method752() {
		this.anIntArray39 = null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([BLclient!jea;[IB)Z")
	public boolean method754(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(17) Class3_Sub48_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray39[local19];
				if (local34 != 0) {
					if (local9 != local34) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg1.method3795(local34 >> 2, arg2);
						} else {
							local17 = arg1.method3790(arg2, local34 >> 2);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass3_Sub48_Sub1Array1[local19] = local17;
						this.anIntArray39[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
