import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "[Lclient!oga;")
	public Class238[] aClass238Array1;

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
	public int anInt4200;

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!ifa", name = "q", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "[Lclient!ql;")
	public Class1_Sub40_Sub1[] aClass1_Sub40_Sub1Array1;

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	private Class1_Sub19() {
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub40_Sub1Array1 = new Class1_Sub40_Sub1[128];
		this.aByteArray42 = new byte[128];
		this.anIntArray255 = new int[128];
		this.aByteArray41 = new byte[128];
		this.aClass238Array1 = new Class238[128];
		this.aByteArray43 = new byte[128];
		this.aShortArray59 = new short[128];
		@Pc(36) Class1_Sub20 local36 = new Class1_Sub20(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray52[local36.anInt5238 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4432();
		}
		local38++;
		local36.anInt5238++;
		@Pc(79) int local79 = local36.anInt5238;
		local36.anInt5238 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray52[local87 + local36.anInt5238] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method4432();
		}
		local36.anInt5238++;
		local87++;
		@Pc(132) int local132 = local36.anInt5238;
		local36.anInt5238 += local87;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray52[local36.anInt5238 + local140] != 0; local140++) {
		}
		@Pc(158) byte[] local158 = new byte[local140];
		for (@Pc(160) int local160 = 0; local160 < local140; local160++) {
			local158[local160] = local36.method4432();
		}
		local140++;
		local36.anInt5238++;
		@Pc(186) byte[] local186 = new byte[local140];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local140 > 1) {
			local186[1] = 1;
			local195 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local140; local199++) {
				local205 = local36.method4393();
				if (local205 == 0) {
					local197 = local195++;
				} else {
					if (local197 >= local205) {
						local205--;
					}
					local197 = local205;
				}
				local186[local199] = (byte) local197;
			}
		} else {
			local195 = local140;
		}
		@Pc(245) Class238[] local245 = new Class238[local195];
		for (local199 = 0; local199 < local245.length; local199++) {
			@Pc(257) Class238 local257 = local245[local199] = new Class238();
			@Pc(261) int local261 = local36.method4393();
			if (local261 > 0) {
				local257.aByteArray73 = new byte[local261 * 2];
			}
			local261 = local36.method4393();
			if (local261 > 0) {
				local257.aByteArray72 = new byte[local261 * 2 + 2];
				local257.aByteArray72[1] = 64;
			}
		}
		local205 = local36.method4393();
		@Pc(316) byte[] local316 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local36.method4393();
		@Pc(332) byte[] local332 = local205 <= 0 ? null : new byte[local205 * 2];
		@Pc(334) int local334;
		for (local334 = 0; local36.aByteArray52[local334 + local36.anInt5238] != 0; local334++) {
		}
		@Pc(351) byte[] local351 = new byte[local334];
		for (@Pc(353) int local353 = 0; local353 < local334; local353++) {
			local351[local353] = local36.method4432();
		}
		local36.anInt5238++;
		local334++;
		@Pc(378) int local378 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local378 += local36.method4393();
			this.aShortArray59[local380] = (short) local378;
		}
		local378 = 0;
		for (@Pc(402) int local402 = 0; local402 < 128; local402++) {
			local378 += local36.method4393();
			this.aShortArray59[local402] = (short) (this.aShortArray59[local402] + (local378 << 8));
		}
		@Pc(429) int local429 = 0;
		@Pc(431) int local431 = 0;
		@Pc(433) int local433 = 0;
		for (@Pc(435) int local435 = 0; local435 < 128; local435++) {
			if (local429 == 0) {
				if (local431 < local351.length) {
					local429 = local351[local431++];
				} else {
					local429 = -1;
				}
				local433 = local36.method4390();
			}
			this.aShortArray59[local435] = (short) (this.aShortArray59[local435] + ((local433 - 1 & 0x2) << 14));
			this.anIntArray255[local435] = local433;
			local429--;
		}
		local429 = 0;
		local431 = 0;
		@Pc(491) int local491 = 0;
		for (@Pc(493) int local493 = 0; local493 < 128; local493++) {
			if (this.anIntArray255[local493] != 0) {
				if (local429 == 0) {
					local491 = local36.aByteArray52[local79++] - 1;
					if (local431 >= local55.length) {
						local429 = -1;
					} else {
						local429 = local55[local431++];
					}
				}
				this.aByteArray43[local493] = (byte) local491;
				local429--;
			}
		}
		local429 = 0;
		local431 = 0;
		@Pc(549) int local549 = 0;
		for (@Pc(551) int local551 = 0; local551 < 128; local551++) {
			if (this.anIntArray255[local551] != 0) {
				if (local429 == 0) {
					if (local104.length <= local431) {
						local429 = -1;
					} else {
						local429 = local104[local431++];
					}
					local549 = local36.aByteArray52[local132++] + 16 << 2;
				}
				this.aByteArray42[local551] = (byte) local549;
				local429--;
			}
		}
		local429 = 0;
		local431 = 0;
		@Pc(607) Class238 local607 = null;
		for (@Pc(609) int local609 = 0; local609 < 128; local609++) {
			if (this.anIntArray255[local609] != 0) {
				if (local429 == 0) {
					local607 = local245[local186[local431]];
					if (local158.length <= local431) {
						local429 = -1;
					} else {
						local429 = local158[local431++];
					}
				}
				local429--;
				this.aClass238Array1[local609] = local607;
			}
		}
		local431 = 0;
		local429 = 0;
		@Pc(655) int local655 = 0;
		for (@Pc(657) int local657 = 0; local657 < 128; local657++) {
			if (local429 == 0) {
				if (local431 >= local351.length) {
					local429 = -1;
				} else {
					local429 = local351[local431++];
				}
				if (this.anIntArray255[local657] > 0) {
					local655 = local36.method4393() + 1;
				}
			}
			local429--;
			this.aByteArray41[local657] = (byte) local655;
		}
		this.anInt4200 = local36.method4393() + 1;
		@Pc(722) int local722;
		for (@Pc(711) int local711 = 0; local711 < local195; local711++) {
			@Pc(717) Class238 local717 = local245[local711];
			if (local717.aByteArray73 != null) {
				for (local722 = 1; local722 < local717.aByteArray73.length; local722 += 2) {
					local717.aByteArray73[local722] = local36.method4432();
				}
			}
			if (local717.aByteArray72 != null) {
				for (local722 = 3; local722 < local717.aByteArray72.length - 2; local722 += 2) {
					local717.aByteArray72[local722] = local36.method4432();
				}
			}
		}
		@Pc(779) int local779;
		if (local316 != null) {
			for (local779 = 1; local779 < local316.length; local779 += 2) {
				local316[local779] = local36.method4432();
			}
		}
		if (local332 != null) {
			for (local779 = 1; local779 < local332.length; local779 += 2) {
				local332[local779] = local36.method4432();
			}
		}
		@Pc(824) int local824;
		for (local779 = 0; local779 < local195; local779++) {
			@Pc(817) Class238 local817 = local245[local779];
			if (local817.aByteArray72 != null) {
				local378 = 0;
				for (local824 = 2; local824 < local817.aByteArray72.length; local824 += 2) {
					local378 += local36.method4393() + 1;
					local817.aByteArray72[local824] = (byte) local378;
				}
			}
		}
		@Pc(869) int local869;
		for (local722 = 0; local722 < local195; local722++) {
			@Pc(862) Class238 local862 = local245[local722];
			if (local862.aByteArray73 != null) {
				local378 = 0;
				for (local869 = 2; local869 < local862.aByteArray73.length; local869 += 2) {
					local378 = local36.method4393() + local378 + 1;
					local862.aByteArray73[local869] = (byte) local378;
				}
			}
		}
		@Pc(942) int local942;
		@Pc(969) int local969;
		@Pc(975) byte local975;
		@Pc(995) int local995;
		@Pc(997) int local997;
		@Pc(1007) int local1007;
		@Pc(936) byte local936;
		@Pc(1044) int local1044;
		if (local316 != null) {
			local378 = local36.method4393();
			local316[0] = (byte) local378;
			for (local824 = 2; local824 < local316.length; local824 += 2) {
				local378 = local36.method4393() + local378 + 1;
				local316[local824] = (byte) local378;
			}
			local936 = local316[0];
			@Pc(940) byte local940 = local316[1];
			for (local942 = 0; local942 < local936; local942++) {
				this.aByteArray41[local942] = (byte) (this.aByteArray41[local942] * local940 + 32 >> 6);
			}
			for (local969 = 2; local969 < local316.length; local969 += 2) {
				local975 = local316[local969];
				@Pc(981) byte local981 = local316[local969 + 1];
				local995 = local940 * (local975 - local936) + (local975 - local936) / 2;
				for (local997 = local936; local997 < local975; local997++) {
					local1007 = Static359.method5227(local975 - local936, local995);
					this.aByteArray41[local997] = (byte) (local1007 * this.aByteArray41[local997] + 32 >> 6);
					local995 += local981 - local940;
				}
				local936 = local975;
				local940 = local981;
			}
			for (local1044 = local936; local1044 < 128; local1044++) {
				this.aByteArray41[local1044] = (byte) (this.aByteArray41[local1044] * local940 + 32 >> 6);
			}
		}
		@Pc(1112) int local1112;
		if (local332 != null) {
			local378 = local36.method4393();
			local332[0] = (byte) local378;
			for (local824 = 2; local824 < local332.length; local824 += 2) {
				local378 = local36.method4393() + local378 + 1;
				local332[local824] = (byte) local378;
			}
			local936 = local332[0];
			local1112 = local332[1] << 1;
			for (local942 = 0; local942 < local936; local942++) {
				local969 = (this.aByteArray42[local942] & 0xFF) + local1112;
				if (local969 < 0) {
					local969 = 0;
				}
				if (local969 > 128) {
					local969 = 128;
				}
				this.aByteArray42[local942] = (byte) local969;
			}
			local969 = 2;
			@Pc(1163) int local1163;
			while (local969 < local332.length) {
				local975 = local332[local969];
				local1163 = local332[local969 + 1] << 1;
				local995 = (local975 - local936) * local1112 + (local975 - local936) / 2;
				for (local997 = local936; local997 < local975; local997++) {
					local1007 = Static359.method5227(local975 - local936, local995);
					@Pc(1198) int local1198 = local1007 + (this.aByteArray42[local997] & 0xFF);
					if (local1198 < 0) {
						local1198 = 0;
					}
					if (local1198 > 128) {
						local1198 = 128;
					}
					local995 += local1163 - local1112;
					this.aByteArray42[local997] = (byte) local1198;
				}
				local936 = local975;
				local969 += 2;
				local1112 = local1163;
			}
			for (local1044 = local936; local1044 < 128; local1044++) {
				local1163 = local1112 + (this.aByteArray42[local1044] & 0xFF);
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray42[local1044] = (byte) local1163;
			}
		}
		for (local824 = 0; local824 < local195; local824++) {
			local245[local824].anInt6709 = local36.method4393();
		}
		for (local869 = 0; local869 < local195; local869++) {
			@Pc(1305) Class238 local1305 = local245[local869];
			if (local1305.aByteArray73 != null) {
				local1305.anInt6712 = local36.method4393();
			}
			if (local1305.aByteArray72 != null) {
				local1305.anInt6708 = local36.method4393();
			}
			if (local1305.anInt6709 > 0) {
				local1305.anInt6713 = local36.method4393();
			}
		}
		for (local1112 = 0; local1112 < local195; local1112++) {
			local245[local1112].anInt6711 = local36.method4393();
		}
		for (local942 = 0; local942 < local195; local942++) {
			@Pc(1367) Class238 local1367 = local245[local942];
			if (local1367.anInt6711 > 0) {
				local1367.anInt6714 = local36.method4393();
			}
		}
		for (local969 = 0; local969 < local195; local969++) {
			@Pc(1387) Class238 local1387 = local245[local969];
			if (local1387.anInt6714 > 0) {
				local1387.anInt6715 = local36.method4393();
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!pb;[B[I)Z")
	public boolean method3591(@OriginalArg(1) Class249 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub40_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray255[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg0.method5607(local25 >> 2, arg2);
						} else {
							local11 = arg0.method5604(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub40_Sub1Array1[local13] = local11;
						this.anIntArray255[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	public void method3593() {
		this.anIntArray255 = null;
	}
}
