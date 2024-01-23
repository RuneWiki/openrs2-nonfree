import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[S")
	public short[] aShortArray23 = new short[128];

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
	public byte[] aByteArray29 = new byte[128];

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
	private int[] anIntArray200 = new int[128];

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[B")
	public byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "[Lclient!ee;")
	public Class1_Sub7_Sub1[] aClass1_Sub7_Sub1Array1 = new Class1_Sub7_Sub1[128];

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "[Lclient!gh;")
	public Class44[] aClass44Array1 = new Class44[128];

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "[B")
	public byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class1_Sub26 local38 = new Class1_Sub26(arg0);
		while (local38.aByteArray52[local38.anInt4021 + local33] != 0) {
			local33++;
		}
		@Pc(55) byte[] local55 = new byte[local33];
		for (@Pc(57) int local57 = 0; local57 < local33; local57++) {
			local55[local57] = local38.method2992();
		}
		local33++;
		local38.anInt4021++;
		@Pc(79) int local79 = local38.anInt4021;
		local38.anInt4021 += local33;
		@Pc(87) int local87;
		for (local87 = 0; local38.aByteArray52[local38.anInt4021 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		for (@Pc(104) int local104 = 0; local104 < local87; local104++) {
			local102[local104] = local38.method2992();
		}
		local87++;
		@Pc(123) int local123 = 0;
		local38.anInt4021++;
		@Pc(132) int local132 = local38.anInt4021;
		local38.anInt4021 += local87;
		while (local38.aByteArray52[local123 + local38.anInt4021] != 0) {
			local123++;
		}
		@Pc(155) byte[] local155 = new byte[local123];
		for (@Pc(157) int local157 = 0; local157 < local123; local157++) {
			local155[local157] = local38.method2992();
		}
		local123++;
		local38.anInt4021++;
		@Pc(183) byte[] local183 = new byte[local123];
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local123 > 1) {
			local183[1] = 1;
			local194 = 2;
			@Pc(196) int local196 = 1;
			for (local198 = 2; local198 < local123; local198++) {
				local204 = local38.method2945();
				if (local204 == 0) {
					local196 = local194++;
				} else {
					if (local196 >= local204) {
						local204--;
					}
					local196 = local204;
				}
				local183[local198] = (byte) local196;
			}
		} else {
			local194 = local123;
		}
		@Pc(240) Class44[] local240 = new Class44[local194];
		for (local198 = 0; local198 < local240.length; local198++) {
			@Pc(252) Class44 local252 = local240[local198] = new Class44();
			@Pc(256) int local256 = local38.method2945();
			if (local256 > 0) {
				local252.aByteArray26 = new byte[local256 * 2];
			}
			local256 = local38.method2945();
			if (local256 > 0) {
				local252.aByteArray27 = new byte[local256 * 2 + 2];
				local252.aByteArray27[1] = 64;
			}
		}
		local204 = local38.method2945();
		@Pc(294) int local294 = 0;
		@Pc(303) byte[] local303 = local204 <= 0 ? null : new byte[local204 * 2];
		local204 = local38.method2945();
		@Pc(319) byte[] local319 = local204 > 0 ? new byte[local204 * 2] : null;
		while (local38.aByteArray52[local294 + local38.anInt4021] != 0) {
			local294++;
		}
		@Pc(336) byte[] local336 = new byte[local294];
		for (@Pc(338) int local338 = 0; local338 < local294; local338++) {
			local336[local338] = local38.method2992();
		}
		local38.anInt4021++;
		local294++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local38.method2945();
			this.aShortArray23[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local38.method2945();
			this.aShortArray23[local383] = (short) (this.aShortArray23[local383] + (local359 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local414 >= local336.length) {
					local410 = -1;
				} else {
					local410 = local336[local414++];
				}
				local412 = local38.method2955();
			}
			local410--;
			this.aShortArray23[local416] = (short) (this.aShortArray23[local416] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray200[local416] = local412;
		}
		local410 = 0;
		local414 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray200[local472] != 0) {
				if (local410 == 0) {
					local470 = local38.aByteArray52[local79++] - 1;
					if (local55.length > local414) {
						local410 = local55[local414++];
					} else {
						local410 = -1;
					}
				}
				this.aByteArray31[local472] = (byte) local470;
				local410--;
			}
		}
		local410 = 0;
		@Pc(525) int local525 = 0;
		local414 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray200[local529] != 0) {
				if (local410 == 0) {
					if (local414 >= local102.length) {
						local410 = -1;
					} else {
						local410 = local102[local414++];
					}
					local525 = local38.aByteArray52[local132++] + 16 << 2;
				}
				this.aByteArray29[local529] = (byte) local525;
				local410--;
			}
		}
		local410 = 0;
		local414 = 0;
		@Pc(583) Class44 local583 = null;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray200[local585] != 0) {
				if (local410 == 0) {
					local583 = local240[local183[local414]];
					if (local414 >= local155.length) {
						local410 = -1;
					} else {
						local410 = local155[local414++];
					}
				}
				local410--;
				this.aClass44Array1[local585] = local583;
			}
		}
		local414 = 0;
		local410 = 0;
		@Pc(635) int local635 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local410 == 0) {
				if (local414 >= local336.length) {
					local410 = -1;
				} else {
					local410 = local336[local414++];
				}
				if (this.anIntArray200[local637] > 0) {
					local635 = local38.method2945() + 1;
				}
			}
			local410--;
			this.aByteArray30[local637] = (byte) local635;
		}
		this.anInt1935 = local38.method2945() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local194; local697++) {
			@Pc(703) Class44 local703 = local240[local697];
			if (local703.aByteArray26 != null) {
				for (local708 = 1; local708 < local703.aByteArray26.length; local708 += 2) {
					local703.aByteArray26[local708] = local38.method2992();
				}
			}
			if (local703.aByteArray27 != null) {
				for (local708 = 3; local708 < local703.aByteArray27.length - 2; local708 += 2) {
					local703.aByteArray27[local708] = local38.method2992();
				}
			}
		}
		@Pc(761) int local761;
		if (local303 != null) {
			for (local761 = 1; local761 < local303.length; local761 += 2) {
				local303[local761] = local38.method2992();
			}
		}
		if (local319 != null) {
			for (local761 = 1; local761 < local319.length; local761 += 2) {
				local319[local761] = local38.method2992();
			}
		}
		@Pc(806) int local806;
		for (local761 = 0; local761 < local194; local761++) {
			@Pc(799) Class44 local799 = local240[local761];
			if (local799.aByteArray27 != null) {
				local359 = 0;
				for (local806 = 2; local806 < local799.aByteArray27.length; local806 += 2) {
					local359 = local38.method2945() + local359 + 1;
					local799.aByteArray27[local806] = (byte) local359;
				}
			}
		}
		@Pc(855) int local855;
		for (local708 = 0; local708 < local194; local708++) {
			@Pc(848) Class44 local848 = local240[local708];
			if (local848.aByteArray26 != null) {
				local359 = 0;
				for (local855 = 2; local855 < local848.aByteArray26.length; local855 += 2) {
					local359 = local359 + local38.method2945() + 1;
					local848.aByteArray26[local855] = (byte) local359;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(956) int local956;
		@Pc(962) byte local962;
		@Pc(982) int local982;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(923) byte local923;
		@Pc(1030) int local1030;
		if (local303 != null) {
			local359 = local38.method2945();
			local303[0] = (byte) local359;
			for (local806 = 2; local806 < local303.length; local806 += 2) {
				local359 -= -local38.method2945() - 1;
				local303[local806] = (byte) local359;
			}
			local923 = local303[0];
			@Pc(927) byte local927 = local303[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray30[local929] = (byte) (this.aByteArray30[local929] * local927 + 32 >> 6);
			}
			local956 = 2;
			while (local956 < local303.length) {
				local962 = local303[local956];
				@Pc(968) byte local968 = local303[local956 + 1];
				local956 += 2;
				local982 = (local962 - local923) * local927 + (local962 - local923) / 2;
				for (local984 = local923; local984 < local962; local984++) {
					local994 = Static89.method1512(local982, local962 - local923);
					this.aByteArray30[local984] = (byte) (local994 * this.aByteArray30[local984] + 32 >> 6);
					local982 += local968 - local927;
				}
				local927 = local968;
				local923 = local962;
			}
			for (local1030 = local923; local1030 < 128; local1030++) {
				this.aByteArray30[local1030] = (byte) (local927 * this.aByteArray30[local1030] + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local319 != null) {
			local359 = local38.method2945();
			local319[0] = (byte) local359;
			for (local806 = 2; local806 < local319.length; local806 += 2) {
				local359 += local38.method2945() + 1;
				local319[local806] = (byte) local359;
			}
			local1098 = local319[1] << 1;
			local923 = local319[0];
			for (local929 = 0; local929 < local923; local929++) {
				local956 = local1098 + (this.aByteArray29[local929] & 0xFF);
				if (local956 < 0) {
					local956 = 0;
				}
				if (local956 > 128) {
					local956 = 128;
				}
				this.aByteArray29[local929] = (byte) local956;
			}
			local956 = 2;
			@Pc(1155) int local1155;
			while (local319.length > local956) {
				local962 = local319[local956];
				local1155 = local319[local956 + 1] << 1;
				local956 += 2;
				local982 = (local962 - local923) / 2 + (local962 - local923) * local1098;
				for (local984 = local923; local984 < local962; local984++) {
					local994 = Static89.method1512(local982, local962 - local923);
					local982 += local1155 - local1098;
					@Pc(1197) int local1197 = (this.aByteArray29[local984] & 0xFF) + local994;
					if (local1197 < 0) {
						local1197 = 0;
					}
					if (local1197 > 128) {
						local1197 = 128;
					}
					this.aByteArray29[local984] = (byte) local1197;
				}
				local1098 = local1155;
				local923 = local962;
			}
			for (local1030 = local923; local1030 < 128; local1030++) {
				local1155 = (this.aByteArray29[local1030] & 0xFF) + local1098;
				if (local1155 < 0) {
					local1155 = 0;
				}
				if (local1155 > 128) {
					local1155 = 128;
				}
				this.aByteArray29[local1030] = (byte) local1155;
			}
		}
		for (local806 = 0; local806 < local194; local806++) {
			local240[local806].anInt1644 = local38.method2945();
		}
		for (local855 = 0; local855 < local194; local855++) {
			@Pc(1287) Class44 local1287 = local240[local855];
			if (local1287.aByteArray26 != null) {
				local1287.anInt1641 = local38.method2945();
			}
			if (local1287.aByteArray27 != null) {
				local1287.anInt1643 = local38.method2945();
			}
			if (local1287.anInt1644 > 0) {
				local1287.anInt1642 = local38.method2945();
			}
		}
		for (local1098 = 0; local1098 < local194; local1098++) {
			local240[local1098].anInt1638 = local38.method2945();
		}
		for (local929 = 0; local929 < local194; local929++) {
			@Pc(1338) Class44 local1338 = local240[local929];
			if (local1338.anInt1638 > 0) {
				local1338.anInt1639 = local38.method2945();
			}
		}
		for (local956 = 0; local956 < local194; local956++) {
			@Pc(1365) Class44 local1365 = local240[local956];
			if (local1365.anInt1639 > 0) {
				local1365.anInt1640 = local38.method2945();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method1510() {
		this.anIntArray200 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([ILclient!bd;[BI)Z")
	public boolean method1515(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class1_Sub7_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray200[local13];
				if (local28 != 0) {
					if (local28 != local11) {
						local11 = local28--;
						if ((local28 & 0x1) == 0) {
							local9 = arg1.method344(local28 >> 2, arg0);
						} else {
							local9 = arg1.method345(local28 >> 2, arg0);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass1_Sub7_Sub1Array1[local13] = local9;
						this.anIntArray200[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
