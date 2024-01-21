import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "[B")
	public final byte[] aByteArray39 = new byte[128];

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[B")
	public final byte[] aByteArray41 = new byte[128];

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "[Lclient!q;")
	public final Class57[] aClass57Array1 = new Class57[128];

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "[I")
	private int[] anIntArray369 = new int[128];

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "[S")
	public final short[] aShortArray19 = new short[128];

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
	public final int anInt3076;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "[Lclient!nb;")
	public final Class3_Sub5_Sub1[] aClass3_Sub5_Sub1Array1 = new Class3_Sub5_Sub1[128];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
	public Class3_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray40 = new byte[128];
		@Pc(38) Class3_Sub11 local38 = new Class3_Sub11(arg0);
		while (local38.aByteArray13[local38.anInt1562 + local29] != 0) {
			local29++;
		}
		@Pc(52) byte[] local52 = new byte[local29];
		for (@Pc(54) int local54 = 0; local54 < local29; local54++) {
			local52[local54] = local38.method994();
		}
		local38.anInt1562++;
		@Pc(75) int local75 = local38.anInt1562;
		local29++;
		@Pc(78) int local78 = 0;
		local38.anInt1562 += local29;
		while (local38.aByteArray13[local38.anInt1562 + local78] != 0) {
			local78++;
		}
		@Pc(101) byte[] local101 = new byte[local78];
		for (@Pc(103) int local103 = 0; local103 < local78; local103++) {
			local101[local103] = local38.method994();
		}
		local78++;
		local38.anInt1562++;
		@Pc(124) int local124 = 0;
		@Pc(127) int local127 = local38.anInt1562;
		local38.anInt1562 += local78;
		while (local38.aByteArray13[local38.anInt1562 + local124] != 0) {
			local124++;
		}
		@Pc(150) byte[] local150 = new byte[local124];
		for (@Pc(152) int local152 = 0; local152 < local124; local152++) {
			local150[local152] = local38.method994();
		}
		local124++;
		local38.anInt1562++;
		@Pc(178) byte[] local178 = new byte[local124];
		@Pc(187) int local187;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local124 > 1) {
			@Pc(185) int local185 = 1;
			local187 = 2;
			local178[1] = 1;
			for (local193 = 2; local193 < local124; local193++) {
				local199 = local38.method981();
				if (local199 == 0) {
					local185 = local187++;
				} else {
					if (local199 <= local185) {
						local199--;
					}
					local185 = local199;
				}
				local178[local193] = (byte) local185;
			}
		} else {
			local187 = local124;
		}
		@Pc(235) Class57[] local235 = new Class57[local187];
		for (local193 = 0; local193 < local235.length; local193++) {
			@Pc(247) Class57 local247 = local235[local193] = new Class57();
			@Pc(251) int local251 = local38.method981();
			if (local251 > 0) {
				local247.aByteArray32 = new byte[local251 * 2];
			}
			local251 = local38.method981();
			if (local251 > 0) {
				local247.aByteArray31 = new byte[local251 * 2 + 2];
				local247.aByteArray31[1] = 64;
			}
		}
		@Pc(295) int local295 = 0;
		local199 = local38.method981();
		@Pc(311) byte[] local311 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local38.method981();
		@Pc(324) byte[] local324 = local199 > 0 ? new byte[local199 * 2] : null;
		while (local38.aByteArray13[local295 + local38.anInt1562] != 0) {
			local295++;
		}
		@Pc(341) byte[] local341 = new byte[local295];
		for (@Pc(343) int local343 = 0; local343 < local295; local343++) {
			local341[local343] = local38.method994();
		}
		local38.anInt1562++;
		local295++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local38.method981();
			this.aShortArray19[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local364 += local38.method981();
			this.aShortArray19[local390] = (short) (this.aShortArray19[local390] + (local364 << 8));
		}
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		for (@Pc(423) int local423 = 0; local423 < 128; local423++) {
			if (local417 == 0) {
				if (local421 < local341.length) {
					local417 = local341[local421++];
				} else {
					local417 = -1;
				}
				local419 = local38.method993();
			}
			local417--;
			this.aShortArray19[local423] = (short) (this.aShortArray19[local423] + ((local419 - 1 & 0x2) << 14));
			this.anIntArray369[local423] = local419;
		}
		local421 = 0;
		local417 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray369[local479] != 0) {
				if (local417 == 0) {
					if (local52.length <= local421) {
						local417 = -1;
					} else {
						local417 = local52[local421++];
					}
					local477 = local38.aByteArray13[local75++] - 1;
				}
				this.aByteArray40[local479] = (byte) local477;
				local417--;
			}
		}
		local421 = 0;
		local417 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray369[local534] != 0) {
				if (local417 == 0) {
					local532 = local38.aByteArray13[local127++] + 16 << 2;
					if (local101.length <= local421) {
						local417 = -1;
					} else {
						local417 = local101[local421++];
					}
				}
				local417--;
				this.aByteArray41[local534] = (byte) local532;
			}
		}
		local417 = 0;
		local421 = 0;
		@Pc(592) Class57 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray369[local594] != 0) {
				if (local417 == 0) {
					local592 = local235[local178[local421]];
					if (local150.length > local421) {
						local417 = local150[local421++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aClass57Array1[local594] = local592;
			}
		}
		local417 = 0;
		local421 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local417 == 0) {
				if (local341.length > local421) {
					local417 = local341[local421++];
				} else {
					local417 = -1;
				}
				if (this.anIntArray369[local643] > 0) {
					local641 = local38.method981() + 1;
				}
			}
			this.aByteArray39[local643] = (byte) local641;
			local417--;
		}
		this.anInt3076 = local38.method981() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local187; local698++) {
			@Pc(704) Class57 local704 = local235[local698];
			if (local704.aByteArray32 != null) {
				for (local709 = 1; local709 < local704.aByteArray32.length; local709 += 2) {
					local704.aByteArray32[local709] = local38.method994();
				}
			}
			if (local704.aByteArray31 != null) {
				for (local709 = 3; local709 < local704.aByteArray31.length - 2; local709 += 2) {
					local704.aByteArray31[local709] = local38.method994();
				}
			}
		}
		@Pc(766) int local766;
		if (local311 != null) {
			for (local766 = 1; local766 < local311.length; local766 += 2) {
				local311[local766] = local38.method994();
			}
		}
		if (local324 != null) {
			for (local766 = 1; local766 < local324.length; local766 += 2) {
				local324[local766] = local38.method994();
			}
		}
		@Pc(815) int local815;
		for (local766 = 0; local766 < local187; local766++) {
			@Pc(808) Class57 local808 = local235[local766];
			if (local808.aByteArray31 != null) {
				local364 = 0;
				for (local815 = 2; local815 < local808.aByteArray31.length; local815 += 2) {
					local364 = local38.method981() + local364 + 1;
					local808.aByteArray31[local815] = (byte) local364;
				}
			}
		}
		@Pc(864) int local864;
		for (local709 = 0; local709 < local187; local709++) {
			@Pc(857) Class57 local857 = local235[local709];
			if (local857.aByteArray32 != null) {
				local364 = 0;
				for (local864 = 2; local864 < local857.aByteArray32.length; local864 += 2) {
					local364 = local364 + local38.method981() + 1;
					local857.aByteArray32[local864] = (byte) local364;
				}
			}
		}
		@Pc(947) int local947;
		@Pc(970) int local970;
		@Pc(976) byte local976;
		@Pc(996) int local996;
		@Pc(998) int local998;
		@Pc(1007) int local1007;
		@Pc(941) byte local941;
		@Pc(1048) int local1048;
		if (local311 != null) {
			local364 = local38.method981();
			local311[0] = (byte) local364;
			for (local815 = 2; local815 < local311.length; local815 += 2) {
				local364 = local364 + local38.method981() + 1;
				local311[local815] = (byte) local364;
			}
			local941 = local311[0];
			@Pc(945) byte local945 = local311[1];
			for (local947 = 0; local947 < local941; local947++) {
				this.aByteArray39[local947] = (byte) (local945 * this.aByteArray39[local947] + 32 >> 6);
			}
			local970 = 2;
			while (local311.length > local970) {
				local976 = local311[local970];
				@Pc(982) byte local982 = local311[local970 + 1];
				local970 += 2;
				local996 = (local976 - local941) / 2 + local945 * (local976 - local941);
				for (local998 = local941; local998 < local976; local998++) {
					local1007 = Static132.method2268(local996, local976 - local941);
					local996 += local982 - local945;
					this.aByteArray39[local998] = (byte) (local1007 * this.aByteArray39[local998] + 32 >> 6);
				}
				local941 = local976;
				local945 = local982;
			}
			for (local1048 = local941; local1048 < 128; local1048++) {
				this.aByteArray39[local1048] = (byte) (this.aByteArray39[local1048] * local945 + 32 >> 6);
			}
		}
		@Pc(1114) int local1114;
		if (local324 != null) {
			local364 = local38.method981();
			local324[0] = (byte) local364;
			for (local815 = 2; local815 < local324.length; local815 += 2) {
				local364 = local38.method981() + local364 + 1;
				local324[local815] = (byte) local364;
			}
			local1114 = local324[1] << 1;
			local941 = local324[0];
			for (local947 = 0; local947 < local941; local947++) {
				local970 = local1114 + (this.aByteArray41[local947] & 0xFF);
				if (local970 < 0) {
					local970 = 0;
				}
				if (local970 > 128) {
					local970 = 128;
				}
				this.aByteArray41[local947] = (byte) local970;
			}
			local970 = 2;
			@Pc(1175) int local1175;
			while (local324.length > local970) {
				local976 = local324[local970];
				local1175 = local324[local970 + 1] << 1;
				local970 += 2;
				local996 = (local976 - local941) / 2 + local1114 * (local976 - local941);
				for (local998 = local941; local998 < local976; local998++) {
					local1007 = Static132.method2268(local996, local976 - local941);
					@Pc(1211) int local1211 = local1007 + (this.aByteArray41[local998] & 0xFF);
					local996 += local1175 - local1114;
					if (local1211 < 0) {
						local1211 = 0;
					}
					if (local1211 > 128) {
						local1211 = 128;
					}
					this.aByteArray41[local998] = (byte) local1211;
				}
				local941 = local976;
				local1114 = local1175;
			}
			for (local1048 = local941; local1048 < 128; local1048++) {
				local1175 = (this.aByteArray41[local1048] & 0xFF) + local1114;
				if (local1175 < 0) {
					local1175 = 0;
				}
				if (local1175 > 128) {
					local1175 = 128;
				}
				this.aByteArray41[local1048] = (byte) local1175;
			}
		}
		for (local815 = 0; local815 < local187; local815++) {
			local235[local815].anInt2535 = local38.method981();
		}
		for (local864 = 0; local864 < local187; local864++) {
			@Pc(1316) Class57 local1316 = local235[local864];
			if (local1316.aByteArray32 != null) {
				local1316.anInt2534 = local38.method981();
			}
			if (local1316.aByteArray31 != null) {
				local1316.anInt2521 = local38.method981();
			}
			if (local1316.anInt2535 > 0) {
				local1316.anInt2528 = local38.method981();
			}
		}
		for (local1114 = 0; local1114 < local187; local1114++) {
			local235[local1114].anInt2526 = local38.method981();
		}
		for (local947 = 0; local947 < local187; local947++) {
			@Pc(1371) Class57 local1371 = local235[local947];
			if (local1371.anInt2526 > 0) {
				local1371.anInt2520 = local38.method981();
			}
		}
		for (local970 = 0; local970 < local187; local970++) {
			@Pc(1391) Class57 local1391 = local235[local970];
			if (local1391.anInt2520 > 0) {
				local1391.anInt2519 = local38.method981();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BLclient!wc;[IZ)Z")
	public boolean method2098(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class3_Sub5_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray369[local19];
				if (local34 != 0) {
					if (local15 != local34) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg1.method2262(local34 >> 2, arg2);
						} else {
							local17 = arg1.method2261(arg2, local34 >> 2);
						}
						if (local17 == null) {
							local3 = false;
						}
					}
					if (local17 != null) {
						this.aClass3_Sub5_Sub1Array1[local19] = local17;
						this.anIntArray369[local19] = 0;
					}
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method2100() {
		this.anIntArray369 = null;
	}
}
