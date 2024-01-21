import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "[B")
	public final byte[] aByteArray8 = new byte[128];

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public final int anInt663;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "[B")
	public final byte[] aByteArray9 = new byte[128];

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "[Lclient!s;")
	public final Class2_Sub4_Sub1[] aClass2_Sub4_Sub1Array1 = new Class2_Sub4_Sub1[128];

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "[S")
	public final short[] aShortArray4 = new short[128];

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "[I")
	private int[] anIntArray77 = new int[128];

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "[Lclient!ld;")
	public final Class47[] aClass47Array1 = new Class47[128];

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "[B")
	public final byte[] aByteArray10 = new byte[128];

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class2_Sub9 local36 = new Class2_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray16[local36.anInt976 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method658();
		}
		local36.anInt976++;
		local38++;
		@Pc(75) int local75 = 0;
		@Pc(78) int local78 = local36.anInt976;
		local36.anInt976 += local38;
		while (local36.aByteArray16[local36.anInt976 + local75] != 0) {
			local75++;
		}
		@Pc(101) byte[] local101 = new byte[local75];
		for (@Pc(103) int local103 = 0; local103 < local75; local103++) {
			local101[local103] = local36.method658();
		}
		local75++;
		local36.anInt976++;
		@Pc(129) int local129 = local36.anInt976;
		local36.anInt976 += local75;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray16[local137 + local36.anInt976] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method658();
		}
		local137++;
		local36.anInt976++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(189) int local189;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local137 > 1) {
			local178[1] = 1;
			@Pc(187) int local187 = 1;
			local189 = 2;
			for (local191 = 2; local191 < local137; local191++) {
				local197 = local36.method640();
				if (local197 == 0) {
					local187 = local189++;
				} else {
					if (local187 >= local197) {
						local197--;
					}
					local187 = local197;
				}
				local178[local191] = (byte) local187;
			}
		} else {
			local189 = local137;
		}
		@Pc(230) Class47[] local230 = new Class47[local189];
		for (local191 = 0; local191 < local230.length; local191++) {
			@Pc(242) Class47 local242 = local230[local191] = new Class47();
			@Pc(246) int local246 = local36.method640();
			if (local246 > 0) {
				local242.aByteArray26 = new byte[local246 * 2];
			}
			local246 = local36.method640();
			if (local246 > 0) {
				local242.aByteArray27 = new byte[local246 * 2 + 2];
				local242.aByteArray27[1] = 64;
			}
		}
		local197 = local36.method640();
		@Pc(304) byte[] local304 = local197 <= 0 ? null : new byte[local197 * 2];
		local197 = local36.method640();
		@Pc(310) int local310 = 0;
		@Pc(322) byte[] local322 = local197 <= 0 ? null : new byte[local197 * 2];
		while (local36.aByteArray16[local36.anInt976 + local310] != 0) {
			local310++;
		}
		@Pc(336) byte[] local336 = new byte[local310];
		for (@Pc(338) int local338 = 0; local338 < local310; local338++) {
			local336[local338] = local36.method658();
		}
		local310++;
		local36.anInt976++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local36.method640();
			this.aShortArray4[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local36.method640();
			this.aShortArray4[local383] = (short) (this.aShortArray4[local383] + (local359 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local410 == 0) {
				if (local412 >= local336.length) {
					local410 = -1;
				} else {
					local410 = local336[local412++];
				}
				local408 = local36.method611();
			}
			local410--;
			this.aShortArray4[local414] = (short) (this.aShortArray4[local414] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray77[local414] = local408;
		}
		local412 = 0;
		local410 = 0;
		@Pc(473) int local473 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray77[local475] != 0) {
				if (local410 == 0) {
					if (local52.length <= local412) {
						local410 = -1;
					} else {
						local410 = local52[local412++];
					}
					local473 = local36.aByteArray16[local78++] - 1;
				}
				local410--;
				this.aByteArray10[local475] = (byte) local473;
			}
		}
		local412 = 0;
		@Pc(527) int local527 = 0;
		local410 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray77[local531] != 0) {
				if (local410 == 0) {
					if (local101.length > local412) {
						local410 = local101[local412++];
					} else {
						local410 = -1;
					}
					local527 = local36.aByteArray16[local129++] + 16 << 2;
				}
				local410--;
				this.aByteArray8[local531] = (byte) local527;
			}
		}
		local412 = 0;
		@Pc(581) Class47 local581 = null;
		local410 = 0;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray77[local585] != 0) {
				if (local410 == 0) {
					local581 = local230[local178[local412]];
					if (local412 < local154.length) {
						local410 = local154[local412++];
					} else {
						local410 = -1;
					}
				}
				local410--;
				this.aClass47Array1[local585] = local581;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local410 == 0) {
				if (local336.length <= local412) {
					local410 = -1;
				} else {
					local410 = local336[local412++];
				}
				if (this.anIntArray77[local642] > 0) {
					local640 = local36.method640() + 1;
				}
			}
			local410--;
			this.aByteArray9[local642] = (byte) local640;
		}
		this.anInt663 = local36.method640() + 1;
		@Pc(711) int local711;
		for (@Pc(700) int local700 = 0; local700 < local189; local700++) {
			@Pc(706) Class47 local706 = local230[local700];
			if (local706.aByteArray26 != null) {
				for (local711 = 1; local711 < local706.aByteArray26.length; local711 += 2) {
					local706.aByteArray26[local711] = local36.method658();
				}
			}
			if (local706.aByteArray27 != null) {
				for (local711 = 3; local711 < local706.aByteArray27.length - 2; local711 += 2) {
					local706.aByteArray27[local711] = local36.method658();
				}
			}
		}
		@Pc(764) int local764;
		if (local304 != null) {
			for (local764 = 1; local764 < local304.length; local764 += 2) {
				local304[local764] = local36.method658();
			}
		}
		if (local322 != null) {
			for (local764 = 1; local764 < local322.length; local764 += 2) {
				local322[local764] = local36.method658();
			}
		}
		@Pc(817) int local817;
		for (local764 = 0; local764 < local189; local764++) {
			@Pc(810) Class47 local810 = local230[local764];
			if (local810.aByteArray27 != null) {
				local359 = 0;
				for (local817 = 2; local817 < local810.aByteArray27.length; local817 += 2) {
					local359 = local36.method640() + local359 + 1;
					local810.aByteArray27[local817] = (byte) local359;
				}
			}
		}
		@Pc(858) int local858;
		for (local711 = 0; local711 < local189; local711++) {
			@Pc(851) Class47 local851 = local230[local711];
			if (local851.aByteArray26 != null) {
				local359 = 0;
				for (local858 = 2; local858 < local851.aByteArray26.length; local858 += 2) {
					local359 = local36.method640() + local359 + 1;
					local851.aByteArray26[local858] = (byte) local359;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(984) int local984;
		@Pc(986) int local986;
		@Pc(996) int local996;
		@Pc(929) byte local929;
		@Pc(1036) int local1036;
		if (local304 != null) {
			local359 = local36.method640();
			local304[0] = (byte) local359;
			for (local817 = 2; local817 < local304.length; local817 += 2) {
				local359 = local36.method640() + local359 + 1;
				local304[local817] = (byte) local359;
			}
			@Pc(925) byte local925 = local304[1];
			local929 = local304[0];
			for (local931 = 0; local931 < local929; local931++) {
				this.aByteArray9[local931] = (byte) (local925 * this.aByteArray9[local931] + 32 >> 6);
			}
			local958 = 2;
			while (local958 < local304.length) {
				local964 = local304[local958];
				@Pc(970) byte local970 = local304[local958 + 1];
				local984 = (local964 - local929) / 2 + (local964 - local929) * local925;
				for (local986 = local929; local986 < local964; local986++) {
					local996 = Static103.method1819(local984, local964 - local929);
					local984 += local970 - local925;
					this.aByteArray9[local986] = (byte) (this.aByteArray9[local986] * local996 + 32 >> 6);
				}
				local925 = local970;
				local958 += 2;
				local929 = local964;
			}
			for (local1036 = local929; local1036 < 128; local1036++) {
				this.aByteArray9[local1036] = (byte) (this.aByteArray9[local1036] * local925 + 32 >> 6);
			}
		}
		@Pc(1109) int local1109;
		if (local322 != null) {
			local359 = local36.method640();
			local322[0] = (byte) local359;
			for (local817 = 2; local817 < local322.length; local817 += 2) {
				local359 += local36.method640() + 1;
				local322[local817] = (byte) local359;
			}
			local929 = local322[0];
			local1109 = local322[1] << 1;
			for (local931 = 0; local931 < local929; local931++) {
				local958 = (this.aByteArray8[local931] & 0xFF) + local1109;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray8[local931] = (byte) local958;
			}
			local958 = 2;
			@Pc(1158) int local1158;
			while (local322.length > local958) {
				local964 = local322[local958];
				local1158 = local322[local958 + 1] << 1;
				local958 += 2;
				local984 = (local964 - local929) / 2 + (local964 - local929) * local1109;
				for (local986 = local929; local986 < local964; local986++) {
					local996 = Static103.method1819(local984, local964 - local929);
					@Pc(1194) int local1194 = local996 + (this.aByteArray8[local986] & 0xFF);
					local984 += local1158 - local1109;
					if (local1194 < 0) {
						local1194 = 0;
					}
					if (local1194 > 128) {
						local1194 = 128;
					}
					this.aByteArray8[local986] = (byte) local1194;
				}
				local1109 = local1158;
				local929 = local964;
			}
			for (local1036 = local929; local1036 < 128; local1036++) {
				local1158 = local1109 + (this.aByteArray8[local1036] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray8[local1036] = (byte) local1158;
			}
		}
		for (local817 = 0; local817 < local189; local817++) {
			local230[local817].anInt1726 = local36.method640();
		}
		for (local858 = 0; local858 < local189; local858++) {
			@Pc(1298) Class47 local1298 = local230[local858];
			if (local1298.aByteArray26 != null) {
				local1298.anInt1728 = local36.method640();
			}
			if (local1298.aByteArray27 != null) {
				local1298.anInt1718 = local36.method640();
			}
			if (local1298.anInt1726 > 0) {
				local1298.anInt1724 = local36.method640();
			}
		}
		for (local1109 = 0; local1109 < local189; local1109++) {
			local230[local1109].anInt1727 = local36.method640();
		}
		for (local931 = 0; local931 < local189; local931++) {
			@Pc(1356) Class47 local1356 = local230[local931];
			if (local1356.anInt1727 > 0) {
				local1356.anInt1717 = local36.method640();
			}
		}
		for (local958 = 0; local958 < local189; local958++) {
			@Pc(1380) Class47 local1380 = local230[local958];
			if (local1380.anInt1717 > 0) {
				local1380.anInt1716 = local36.method640();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public void method423() {
		this.anIntArray77 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BLclient!aa;[I)Z")
	public boolean method425(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(17) Class2_Sub4_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray77[local19];
				if (local34 != 0) {
					if (local9 != local34) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg1.method8(local34 >> 2, arg2);
						} else {
							local17 = arg1.method6(local34 >> 2, arg2);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass2_Sub4_Sub1Array1[local19] = local17;
						this.anIntArray77[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
