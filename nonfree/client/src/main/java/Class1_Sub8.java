import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[B")
	public final byte[] aByteArray7 = new byte[128];

	@OriginalMember(owner = "client!db", name = "x", descriptor = "[S")
	public final short[] aShortArray1 = new short[128];

	@OriginalMember(owner = "client!db", name = "z", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "[Lclient!kc;")
	public final Class41[] aClass41Array1;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
	private int[] anIntArray81 = new int[128];

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[Lclient!m;")
	public final Class1_Sub17_Sub1[] aClass1_Sub17_Sub1Array1 = new Class1_Sub17_Sub1[128];

	@OriginalMember(owner = "client!db", name = "O", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public final int anInt795;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aClass41Array1 = new Class41[128];
		this.aByteArray9 = new byte[128];
		this.aByteArray8 = new byte[128];
		@Pc(38) Class1_Sub19 local38 = new Class1_Sub19(arg0);
		while (local38.aByteArray42[local21 + local38.anInt3111] != 0) {
			local21++;
		}
		@Pc(55) byte[] local55 = new byte[local21];
		for (@Pc(57) int local57 = 0; local57 < local21; local57++) {
			local55[local57] = local38.method2086();
		}
		local38.anInt3111++;
		@Pc(78) int local78 = local38.anInt3111;
		local21++;
		@Pc(81) int local81 = 0;
		local38.anInt3111 += local21;
		while (local38.aByteArray42[local38.anInt3111 + local81] != 0) {
			local81++;
		}
		@Pc(105) byte[] local105 = new byte[local81];
		for (@Pc(107) int local107 = 0; local107 < local81; local107++) {
			local105[local107] = local38.method2086();
		}
		local81++;
		@Pc(126) int local126 = 0;
		local38.anInt3111++;
		@Pc(135) int local135 = local38.anInt3111;
		local38.anInt3111 += local81;
		while (local38.aByteArray42[local38.anInt3111 + local126] != 0) {
			local126++;
		}
		@Pc(156) byte[] local156 = new byte[local126];
		for (@Pc(158) int local158 = 0; local158 < local126; local158++) {
			local156[local158] = local38.method2086();
		}
		local38.anInt3111++;
		local126++;
		@Pc(180) byte[] local180 = new byte[local126];
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local126 <= 1) {
			local187 = local126;
		} else {
			local180[1] = 1;
			local187 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local126; local199++) {
				local205 = local38.method2072();
				if (local205 == 0) {
					local197 = local187++;
				} else {
					if (local197 >= local205) {
						local205--;
					}
					local197 = local205;
				}
				local180[local199] = (byte) local197;
			}
		}
		@Pc(233) Class41[] local233 = new Class41[local187];
		for (local199 = 0; local199 < local233.length; local199++) {
			@Pc(245) Class41 local245 = local233[local199] = new Class41();
			@Pc(249) int local249 = local38.method2072();
			if (local249 > 0) {
				local245.aByteArray28 = new byte[local249 * 2];
			}
			local249 = local38.method2072();
			if (local249 > 0) {
				local245.aByteArray27 = new byte[local249 * 2 + 2];
				local245.aByteArray27[1] = 64;
			}
		}
		local205 = local38.method2072();
		@Pc(294) int local294 = 0;
		@Pc(303) byte[] local303 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local38.method2072();
		@Pc(316) byte[] local316 = local205 <= 0 ? null : new byte[local205 * 2];
		while (local38.aByteArray42[local38.anInt3111 + local294] != 0) {
			local294++;
		}
		@Pc(331) byte[] local331 = new byte[local294];
		for (@Pc(333) int local333 = 0; local333 < local294; local333++) {
			local331[local333] = local38.method2086();
		}
		local294++;
		@Pc(348) int local348 = 0;
		local38.anInt3111++;
		for (@Pc(356) int local356 = 0; local356 < 128; local356++) {
			local348 += local38.method2072();
			this.aShortArray1[local356] = (short) local348;
		}
		local348 = 0;
		for (@Pc(378) int local378 = 0; local378 < 128; local378++) {
			local348 += local38.method2072();
			this.aShortArray1[local378] = (short) (this.aShortArray1[local378] + (local348 << 8));
		}
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		for (@Pc(409) int local409 = 0; local409 < 128; local409++) {
			if (local407 == 0) {
				if (local403 >= local331.length) {
					local407 = -1;
				} else {
					local407 = local331[local403++];
				}
				local405 = local38.method2041();
			}
			this.aShortArray1[local409] = (short) (this.aShortArray1[local409] + ((local405 - 1 & 0x2) << 14));
			local407--;
			this.anIntArray81[local409] = local405;
		}
		local403 = 0;
		local407 = 0;
		@Pc(467) int local467 = 0;
		for (@Pc(469) int local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray81[local469] != 0) {
				if (local407 == 0) {
					local467 = local38.aByteArray42[local78++] - 1;
					if (local403 < local55.length) {
						local407 = local55[local403++];
					} else {
						local407 = -1;
					}
				}
				local407--;
				this.aByteArray9[local469] = (byte) local467;
			}
		}
		local407 = 0;
		@Pc(521) int local521 = 0;
		local403 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray81[local525] != 0) {
				if (local407 == 0) {
					local521 = local38.aByteArray42[local135++] + 16 << 2;
					if (local403 >= local105.length) {
						local407 = -1;
					} else {
						local407 = local105[local403++];
					}
				}
				this.aByteArray7[local525] = (byte) local521;
				local407--;
			}
		}
		local403 = 0;
		local407 = 0;
		@Pc(579) Class41 local579 = null;
		for (@Pc(581) int local581 = 0; local581 < 128; local581++) {
			if (this.anIntArray81[local581] != 0) {
				if (local407 == 0) {
					local579 = local233[local180[local403]];
					if (local403 < local156.length) {
						local407 = local156[local403++];
					} else {
						local407 = -1;
					}
				}
				local407--;
				this.aClass41Array1[local581] = local579;
			}
		}
		local407 = 0;
		local403 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local407 == 0) {
				if (local403 >= local331.length) {
					local407 = -1;
				} else {
					local407 = local331[local403++];
				}
				if (this.anIntArray81[local638] > 0) {
					local636 = local38.method2072() + 1;
				}
			}
			local407--;
			this.aByteArray8[local638] = (byte) local636;
		}
		this.anInt795 = local38.method2072() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local187; local694++) {
			@Pc(700) Class41 local700 = local233[local694];
			if (local700.aByteArray28 != null) {
				for (local705 = 1; local705 < local700.aByteArray28.length; local705 += 2) {
					local700.aByteArray28[local705] = local38.method2086();
				}
			}
			if (local700.aByteArray27 != null) {
				for (local705 = 3; local705 < local700.aByteArray27.length - 2; local705 += 2) {
					local700.aByteArray27[local705] = local38.method2086();
				}
			}
		}
		@Pc(754) int local754;
		if (local303 != null) {
			for (local754 = 1; local754 < local303.length; local754 += 2) {
				local303[local754] = local38.method2086();
			}
		}
		if (local316 != null) {
			for (local754 = 1; local754 < local316.length; local754 += 2) {
				local316[local754] = local38.method2086();
			}
		}
		@Pc(803) int local803;
		for (local754 = 0; local754 < local187; local754++) {
			@Pc(796) Class41 local796 = local233[local754];
			if (local796.aByteArray27 != null) {
				local348 = 0;
				for (local803 = 2; local803 < local796.aByteArray27.length; local803 += 2) {
					local348 = local38.method2072() + local348 + 1;
					local796.aByteArray27[local803] = (byte) local348;
				}
			}
		}
		@Pc(848) int local848;
		for (local705 = 0; local705 < local187; local705++) {
			@Pc(841) Class41 local841 = local233[local705];
			if (local841.aByteArray28 != null) {
				local348 = 0;
				for (local848 = 2; local848 < local841.aByteArray28.length; local848 += 2) {
					local348 = local38.method2072() + local348 + 1;
					local841.aByteArray28[local848] = (byte) local348;
				}
			}
		}
		@Pc(925) int local925;
		@Pc(948) int local948;
		@Pc(960) byte local960;
		@Pc(975) int local975;
		@Pc(977) int local977;
		@Pc(987) int local987;
		@Pc(919) byte local919;
		@Pc(1026) int local1026;
		if (local303 != null) {
			local348 = local38.method2072();
			local303[0] = (byte) local348;
			for (local803 = 2; local803 < local303.length; local803 += 2) {
				local348 += local38.method2072() + 1;
				local303[local803] = (byte) local348;
			}
			local919 = local303[0];
			@Pc(923) byte local923 = local303[1];
			for (local925 = 0; local925 < local919; local925++) {
				this.aByteArray8[local925] = (byte) (local923 * this.aByteArray8[local925] + 32 >> 6);
			}
			local948 = 2;
			while (local303.length > local948) {
				@Pc(956) byte local956 = local303[local948 + 1];
				local960 = local303[local948];
				local948 += 2;
				local975 = local923 * (local960 - local919) + (local960 - local919) / 2;
				for (local977 = local919; local977 < local960; local977++) {
					local987 = Static69.method1190(local975, local960 - local919);
					local975 += local956 - local923;
					this.aByteArray8[local977] = (byte) (local987 * this.aByteArray8[local977] + 32 >> 6);
				}
				local923 = local956;
				local919 = local960;
			}
			for (local1026 = local919; local1026 < 128; local1026++) {
				this.aByteArray8[local1026] = (byte) (this.aByteArray8[local1026] * local923 + 32 >> 6);
			}
		}
		@Pc(1092) int local1092;
		if (local316 != null) {
			local348 = local38.method2072();
			local316[0] = (byte) local348;
			for (local803 = 2; local803 < local316.length; local803 += 2) {
				local348 += local38.method2072() + 1;
				local316[local803] = (byte) local348;
			}
			local1092 = local316[1] << 1;
			local919 = local316[0];
			for (local925 = 0; local925 < local919; local925++) {
				local948 = (this.aByteArray7[local925] & 0xFF) + local1092;
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray7[local925] = (byte) local948;
			}
			local948 = 2;
			@Pc(1145) int local1145;
			while (local948 < local316.length) {
				local1145 = local316[local948 + 1] << 1;
				local960 = local316[local948];
				local948 += 2;
				local975 = (local960 - local919) * local1092 + (local960 - local919) / 2;
				for (local977 = local919; local977 < local960; local977++) {
					local987 = Static69.method1190(local975, local960 - local919);
					local975 += local1145 - local1092;
					@Pc(1192) int local1192 = (this.aByteArray7[local977] & 0xFF) + local987;
					if (local1192 < 0) {
						local1192 = 0;
					}
					if (local1192 > 128) {
						local1192 = 128;
					}
					this.aByteArray7[local977] = (byte) local1192;
				}
				local1092 = local1145;
				local919 = local960;
			}
			for (local1026 = local919; local1026 < 128; local1026++) {
				local1145 = local1092 + (this.aByteArray7[local1026] & 0xFF);
				if (local1145 < 0) {
					local1145 = 0;
				}
				if (local1145 > 128) {
					local1145 = 128;
				}
				this.aByteArray7[local1026] = (byte) local1145;
			}
		}
		for (local803 = 0; local803 < local187; local803++) {
			local233[local803].anInt1721 = local38.method2072();
		}
		for (local848 = 0; local848 < local187; local848++) {
			@Pc(1287) Class41 local1287 = local233[local848];
			if (local1287.aByteArray28 != null) {
				local1287.anInt1726 = local38.method2072();
			}
			if (local1287.aByteArray27 != null) {
				local1287.anInt1732 = local38.method2072();
			}
			if (local1287.anInt1721 > 0) {
				local1287.anInt1728 = local38.method2072();
			}
		}
		for (local1092 = 0; local1092 < local187; local1092++) {
			local233[local1092].anInt1727 = local38.method2072();
		}
		for (local925 = 0; local925 < local187; local925++) {
			@Pc(1341) Class41 local1341 = local233[local925];
			if (local1341.anInt1727 > 0) {
				local1341.anInt1722 = local38.method2072();
			}
		}
		for (local948 = 0; local948 < local187; local948++) {
			@Pc(1368) Class41 local1368 = local233[local948];
			if (local1368.anInt1722 > 0) {
				local1368.anInt1723 = local38.method2072();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public void method462() {
		this.anIntArray81 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!kd;[I[BI)Z")
	public boolean method464(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class1_Sub17_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray81[local13];
				if (local25 != 0) {
					if (local25 != local7) {
						local7 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg0.method1114(local25 >> 2, arg1);
						} else {
							local11 = arg0.method1118(arg1, local25 >> 2);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub17_Sub1Array1[local13] = local11;
						this.anIntArray81[local13] = 0;
					}
				}
			}
		}
		return local9;
	}
}
