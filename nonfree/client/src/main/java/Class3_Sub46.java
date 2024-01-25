import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "[Lclient!kca;")
	public Class206[] aClass206Array1;

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "[Lclient!wha;")
	public Class3_Sub34_Sub1[] aClass3_Sub34_Sub1Array1;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
	public int anInt7528;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	private Class3_Sub46() {
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "([B)V")
	public Class3_Sub46(@OriginalArg(0) byte[] arg0) {
		this.aShortArray103 = new short[128];
		this.aClass206Array1 = new Class206[128];
		this.anIntArray558 = new int[128];
		this.aClass3_Sub34_Sub1Array1 = new Class3_Sub34_Sub1[128];
		this.aByteArray76 = new byte[128];
		this.aByteArray74 = new byte[128];
		this.aByteArray75 = new byte[128];
		@Pc(36) Class3_Sub2 local36 = new Class3_Sub2(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray20[local36.anInt2178 + local38] != 0; local38++) {
		}
		@Pc(57) byte[] local57 = new byte[local38];
		for (@Pc(59) int local59 = 0; local59 < local38; local59++) {
			local57[local59] = local36.method2022();
		}
		local36.anInt2178++;
		local38++;
		@Pc(83) int local83 = local36.anInt2178;
		local36.anInt2178 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray20[local36.anInt2178 + local91] != 0; local91++) {
		}
		@Pc(112) byte[] local112 = new byte[local91];
		for (@Pc(114) int local114 = 0; local114 < local91; local114++) {
			local112[local114] = local36.method2022();
		}
		local36.anInt2178++;
		local91++;
		@Pc(138) int local138 = local36.anInt2178;
		local36.anInt2178 += local91;
		@Pc(146) int local146;
		for (local146 = 0; local36.aByteArray20[local36.anInt2178 + local146] != 0; local146++) {
		}
		@Pc(168) byte[] local168 = new byte[local146];
		for (@Pc(170) int local170 = 0; local170 < local146; local170++) {
			local168[local170] = local36.method2022();
		}
		local146++;
		local36.anInt2178++;
		@Pc(198) byte[] local198 = new byte[local146];
		@Pc(211) int local211;
		@Pc(213) int local213;
		@Pc(219) int local219;
		if (local146 > 1) {
			local198[1] = 1;
			@Pc(209) int local209 = 1;
			local211 = 2;
			for (local213 = 2; local213 < local146; local213++) {
				local219 = local36.method2048(255);
				if (local219 == 0) {
					local209 = local211++;
				} else {
					if (local209 >= local219) {
						local219--;
					}
					local209 = local219;
				}
				local198[local213] = (byte) local209;
			}
		} else {
			local211 = local146;
		}
		@Pc(265) Class206[] local265 = new Class206[local211];
		for (local213 = 0; local213 < local265.length; local213++) {
			@Pc(277) Class206 local277 = local265[local213] = new Class206();
			@Pc(281) int local281 = local36.method2048(255);
			if (local281 > 0) {
				local277.aByteArray51 = new byte[local281 * 2];
			}
			local281 = local36.method2048(255);
			if (local281 > 0) {
				local277.aByteArray52 = new byte[local281 * 2 + 2];
				local277.aByteArray52[1] = 64;
			}
		}
		local219 = local36.method2048(255);
		@Pc(341) byte[] local341 = local219 <= 0 ? null : new byte[local219 * 2];
		local219 = local36.method2048(255);
		@Pc(358) byte[] local358 = local219 > 0 ? new byte[local219 * 2] : null;
		@Pc(360) int local360;
		for (local360 = 0; local36.aByteArray20[local360 + local36.anInt2178] != 0; local360++) {
		}
		@Pc(376) byte[] local376 = new byte[local360];
		for (@Pc(378) int local378 = 0; local378 < local360; local378++) {
			local376[local378] = local36.method2022();
		}
		local36.anInt2178++;
		local360++;
		@Pc(401) int local401 = 0;
		for (@Pc(403) int local403 = 0; local403 < 128; local403++) {
			local401 += local36.method2048(255);
			this.aShortArray103[local403] = (short) local401;
		}
		local401 = 0;
		for (@Pc(429) int local429 = 0; local429 < 128; local429++) {
			local401 += local36.method2048(255);
			this.aShortArray103[local429] = (short) (this.aShortArray103[local429] + (local401 << 8));
		}
		@Pc(458) int local458 = 0;
		@Pc(460) int local460 = 0;
		@Pc(462) int local462 = 0;
		for (@Pc(464) int local464 = 0; local464 < 128; local464++) {
			if (local458 == 0) {
				if (local376.length <= local460) {
					local458 = -1;
				} else {
					local458 = local376[local460++];
				}
				local462 = local36.method2015();
			}
			this.aShortArray103[local464] = (short) (this.aShortArray103[local464] + ((local462 - 1 & 0x2) << 14));
			local458--;
			this.anIntArray558[local464] = local462;
		}
		local458 = 0;
		local460 = 0;
		@Pc(528) int local528 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray558[local530] != 0) {
				if (local458 == 0) {
					local528 = local36.aByteArray20[local83++] - 1;
					if (local57.length > local460) {
						local458 = local57[local460++];
					} else {
						local458 = -1;
					}
				}
				this.aByteArray74[local530] = (byte) local528;
				local458--;
			}
		}
		local460 = 0;
		local458 = 0;
		@Pc(592) int local592 = 0;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray558[local594] != 0) {
				if (local458 == 0) {
					if (local112.length > local460) {
						local458 = local112[local460++];
					} else {
						local458 = -1;
					}
					local592 = local36.aByteArray20[local138++] + 16 << 2;
				}
				local458--;
				this.aByteArray75[local594] = (byte) local592;
			}
		}
		local460 = 0;
		local458 = 0;
		@Pc(656) Class206 local656 = null;
		for (@Pc(658) int local658 = 0; local658 < 128; local658++) {
			if (this.anIntArray558[local658] != 0) {
				if (local458 == 0) {
					local656 = local265[local198[local460]];
					if (local460 >= local168.length) {
						local458 = -1;
					} else {
						local458 = local168[local460++];
					}
				}
				this.aClass206Array1[local658] = local656;
				local458--;
			}
		}
		local458 = 0;
		local460 = 0;
		@Pc(705) int local705 = 0;
		for (@Pc(707) int local707 = 0; local707 < 128; local707++) {
			if (local458 == 0) {
				if (local376.length > local460) {
					local458 = local376[local460++];
				} else {
					local458 = -1;
				}
				if (this.anIntArray558[local707] > 0) {
					local705 = local36.method2048(255) + 1;
				}
			}
			local458--;
			this.aByteArray76[local707] = (byte) local705;
		}
		this.anInt7528 = local36.method2048(255) + 1;
		@Pc(777) int local777;
		for (@Pc(764) int local764 = 0; local764 < local211; local764++) {
			@Pc(772) Class206 local772 = local265[local764];
			if (local772.aByteArray51 != null) {
				for (local777 = 1; local777 < local772.aByteArray51.length; local777 += 2) {
					local772.aByteArray51[local777] = local36.method2022();
				}
			}
			if (local772.aByteArray52 != null) {
				for (local777 = 3; local777 < local772.aByteArray52.length - 2; local777 += 2) {
					local772.aByteArray52[local777] = local36.method2022();
				}
			}
		}
		@Pc(832) int local832;
		if (local341 != null) {
			for (local832 = 1; local832 < local341.length; local832 += 2) {
				local341[local832] = local36.method2022();
			}
		}
		if (local358 != null) {
			for (local832 = 1; local832 < local358.length; local832 += 2) {
				local358[local832] = local36.method2022();
			}
		}
		@Pc(891) int local891;
		for (local832 = 0; local832 < local211; local832++) {
			@Pc(884) Class206 local884 = local265[local832];
			if (local884.aByteArray52 != null) {
				local401 = 0;
				for (local891 = 2; local891 < local884.aByteArray52.length; local891 += 2) {
					local401 = local36.method2048(255) + local401 + 1;
					local884.aByteArray52[local891] = (byte) local401;
				}
			}
		}
		@Pc(938) int local938;
		for (local777 = 0; local777 < local211; local777++) {
			@Pc(931) Class206 local931 = local265[local777];
			if (local931.aByteArray51 != null) {
				local401 = 0;
				for (local938 = 2; local938 < local931.aByteArray51.length; local938 += 2) {
					local401 = local401 + local36.method2048(255) + 1;
					local931.aByteArray51[local938] = (byte) local401;
				}
			}
		}
		@Pc(1020) int local1020;
		@Pc(1047) int local1047;
		@Pc(1055) byte local1055;
		@Pc(1075) int local1075;
		@Pc(1077) int local1077;
		@Pc(1088) int local1088;
		@Pc(1014) byte local1014;
		@Pc(1131) int local1131;
		if (local341 != null) {
			local401 = local36.method2048(255);
			local341[0] = (byte) local401;
			for (local891 = 2; local891 < local341.length; local891 += 2) {
				local401 = local401 + local36.method2048(255) + 1;
				local341[local891] = (byte) local401;
			}
			local1014 = local341[0];
			@Pc(1018) byte local1018 = local341[1];
			for (local1020 = 0; local1020 < local1014; local1020++) {
				this.aByteArray76[local1020] = (byte) (local1018 * this.aByteArray76[local1020] + 32 >> 6);
			}
			local1047 = 2;
			while (local341.length > local1047) {
				local1055 = local341[local1047];
				@Pc(1061) byte local1061 = local341[local1047 + 1];
				local1075 = (local1055 - local1014) * local1018 + (local1055 - local1014) / 2;
				for (local1077 = local1014; local1077 < local1055; local1077++) {
					local1088 = Static112.method2181(local1055 - local1014, local1075);
					this.aByteArray76[local1077] = (byte) (this.aByteArray76[local1077] * local1088 + 32 >> 6);
					local1075 += local1061 - local1018;
				}
				local1047 += 2;
				local1014 = local1055;
				local1018 = local1061;
			}
			for (local1131 = local1014; local1131 < 128; local1131++) {
				this.aByteArray76[local1131] = (byte) (local1018 * this.aByteArray76[local1131] + 32 >> 6);
			}
		}
		@Pc(1207) int local1207;
		if (local358 != null) {
			local401 = local36.method2048(255);
			local358[0] = (byte) local401;
			for (local891 = 2; local891 < local358.length; local891 += 2) {
				local401 = local401 + local36.method2048(255) + 1;
				local358[local891] = (byte) local401;
			}
			local1014 = local358[0];
			local1207 = local358[1] << 1;
			for (local1020 = 0; local1020 < local1014; local1020++) {
				local1047 = (this.aByteArray75[local1020] & 0xFF) + local1207;
				if (local1047 < 0) {
					local1047 = 0;
				}
				if (local1047 > 128) {
					local1047 = 128;
				}
				this.aByteArray75[local1020] = (byte) local1047;
			}
			@Pc(1266) int local1266;
			for (local1047 = 2; local1047 < local358.length; local1047 += 2) {
				local1055 = local358[local1047];
				local1266 = local358[local1047 + 1] << 1;
				local1075 = (local1055 - local1014) * local1207 + (local1055 - local1014) / 2;
				for (local1077 = local1014; local1077 < local1055; local1077++) {
					local1088 = Static112.method2181(local1055 - local1014, local1075);
					@Pc(1303) int local1303 = local1088 + (this.aByteArray75[local1077] & 0xFF);
					if (local1303 < 0) {
						local1303 = 0;
					}
					if (local1303 > 128) {
						local1303 = 128;
					}
					this.aByteArray75[local1077] = (byte) local1303;
					local1075 += local1266 - local1207;
				}
				local1014 = local1055;
				local1207 = local1266;
			}
			for (local1131 = local1014; local1131 < 128; local1131++) {
				local1266 = local1207 + (this.aByteArray75[local1131] & 0xFF);
				if (local1266 < 0) {
					local1266 = 0;
				}
				if (local1266 > 128) {
					local1266 = 128;
				}
				this.aByteArray75[local1131] = (byte) local1266;
			}
		}
		for (local891 = 0; local891 < local211; local891++) {
			local265[local891].anInt5391 = local36.method2048(255);
		}
		for (local938 = 0; local938 < local211; local938++) {
			@Pc(1417) Class206 local1417 = local265[local938];
			if (local1417.aByteArray51 != null) {
				local1417.anInt5386 = local36.method2048(255);
			}
			if (local1417.aByteArray52 != null) {
				local1417.anInt5387 = local36.method2048(255);
			}
			if (local1417.anInt5391 > 0) {
				local1417.anInt5390 = local36.method2048(255);
			}
		}
		for (local1207 = 0; local1207 < local211; local1207++) {
			local265[local1207].anInt5384 = local36.method2048(255);
		}
		for (local1020 = 0; local1020 < local211; local1020++) {
			@Pc(1482) Class206 local1482 = local265[local1020];
			if (local1482.anInt5384 > 0) {
				local1482.anInt5389 = local36.method2048(255);
			}
		}
		for (local1047 = 0; local1047 < local211; local1047++) {
			@Pc(1511) Class206 local1511 = local265[local1047];
			if (local1511.anInt5389 > 0) {
				local1511.anInt5385 = local36.method2048(255);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z[BLclient!gh;[I)Z")
	public boolean method6505(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub34_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(32) int local32 = this.anIntArray558[local13];
				if (local32 != 0) {
					if (local9 != local32) {
						local9 = local32--;
						if ((local32 & 0x1) == 0) {
							local11 = arg1.method3118(arg2, local32 >> 2);
						} else {
							local11 = arg1.method3121(arg2, local32 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub34_Sub1Array1[local13] = local11;
						this.anIntArray558[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public void method6506() {
		this.anIntArray558 = null;
	}
}
