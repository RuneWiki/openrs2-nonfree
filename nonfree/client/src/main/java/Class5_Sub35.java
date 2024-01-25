import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!kca", name = "r", descriptor = "[Lclient!uda;")
	public Class349[] aClass349Array1;

	@OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
	public int anInt5821;

	@OriginalMember(owner = "client!kca", name = "v", descriptor = "[Lclient!nga;")
	public Class5_Sub42_Sub1[] aClass5_Sub42_Sub1Array1;

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!kca", name = "z", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!kca", name = "A", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
	private Class5_Sub35() {
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "([B)V")
	public Class5_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray47 = new byte[128];
		this.aClass5_Sub42_Sub1Array1 = new Class5_Sub42_Sub1[128];
		this.aClass349Array1 = new Class349[128];
		this.aByteArray49 = new byte[128];
		this.aShortArray75 = new short[128];
		this.anIntArray325 = new int[128];
		this.aByteArray48 = new byte[128];
		@Pc(34) Class5_Sub41 local34 = new Class5_Sub41(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray93[local36 + local34.anInt9230] != 0; local36++) {
		}
		@Pc(52) byte[] local52 = new byte[local36];
		for (@Pc(54) int local54 = 0; local54 < local36; local54++) {
			local52[local54] = local34.method7861();
		}
		local36++;
		local34.anInt9230++;
		@Pc(75) int local75 = local34.anInt9230;
		local34.anInt9230 += local36;
		@Pc(83) int local83;
		for (local83 = 0; local34.aByteArray93[local34.anInt9230 + local83] != 0; local83++) {
		}
		@Pc(96) byte[] local96 = new byte[local83];
		for (@Pc(98) int local98 = 0; local98 < local83; local98++) {
			local96[local98] = local34.method7861();
		}
		local34.anInt9230++;
		local83++;
		@Pc(119) int local119 = local34.anInt9230;
		local34.anInt9230 += local83;
		@Pc(127) int local127;
		for (local127 = 0; local34.aByteArray93[local127 + local34.anInt9230] != 0; local127++) {
		}
		@Pc(140) byte[] local140 = new byte[local127];
		for (@Pc(142) int local142 = 0; local142 < local127; local142++) {
			local140[local142] = local34.method7861();
		}
		local127++;
		local34.anInt9230++;
		@Pc(167) byte[] local167 = new byte[local127];
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(185) int local185;
		if (local127 > 1) {
			local167[1] = 1;
			local176 = 2;
			@Pc(178) int local178 = 1;
			for (local180 = 2; local180 < local127; local180++) {
				local185 = local34.method7816();
				if (local185 == 0) {
					local178 = local176++;
				} else {
					if (local185 <= local178) {
						local185--;
					}
					local178 = local185;
				}
				local167[local180] = (byte) local178;
			}
		} else {
			local176 = local127;
		}
		@Pc(215) Class349[] local215 = new Class349[local176];
		for (local180 = 0; local180 < local215.length; local180++) {
			@Pc(226) Class349 local226 = local215[local180] = new Class349();
			@Pc(230) int local230 = local34.method7816();
			if (local230 > 0) {
				local226.aByteArray98 = new byte[local230 * 2];
			}
			local230 = local34.method7816();
			if (local230 > 0) {
				local226.aByteArray99 = new byte[local230 * 2 + 2];
				local226.aByteArray99[1] = 64;
			}
		}
		local185 = local34.method7816();
		@Pc(281) byte[] local281 = local185 <= 0 ? null : new byte[local185 * 2];
		local185 = local34.method7816();
		@Pc(294) byte[] local294 = local185 <= 0 ? null : new byte[local185 * 2];
		@Pc(296) int local296;
		for (local296 = 0; local34.aByteArray93[local34.anInt9230 + local296] != 0; local296++) {
		}
		@Pc(312) byte[] local312 = new byte[local296];
		for (@Pc(314) int local314 = 0; local314 < local296; local314++) {
			local312[local314] = local34.method7861();
		}
		local34.anInt9230++;
		local296++;
		@Pc(338) int local338 = 0;
		for (@Pc(340) int local340 = 0; local340 < 128; local340++) {
			local338 += local34.method7816();
			this.aShortArray75[local340] = (short) local338;
		}
		local338 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local338 += local34.method7816();
			this.aShortArray75[local361] = (short) (this.aShortArray75[local361] + (local338 << 8));
		}
		@Pc(385) int local385 = 0;
		@Pc(387) int local387 = 0;
		@Pc(389) int local389 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			if (local385 == 0) {
				if (local387 >= local312.length) {
					local385 = -1;
				} else {
					local385 = local312[local387++];
				}
				local389 = local34.method7832();
			}
			this.aShortArray75[local391] = (short) (this.aShortArray75[local391] + ((local389 - 1 & 0x2) << 14));
			local385--;
			this.anIntArray325[local391] = local389;
		}
		local387 = 0;
		local385 = 0;
		@Pc(441) int local441 = 0;
		for (@Pc(443) int local443 = 0; local443 < 128; local443++) {
			if (this.anIntArray325[local443] != 0) {
				if (local385 == 0) {
					local441 = local34.aByteArray93[local75++] - 1;
					if (local387 < local52.length) {
						local385 = local52[local387++];
					} else {
						local385 = -1;
					}
				}
				this.aByteArray49[local443] = (byte) local441;
				local385--;
			}
		}
		local387 = 0;
		local385 = 0;
		@Pc(496) int local496 = 0;
		for (@Pc(498) int local498 = 0; local498 < 128; local498++) {
			if (this.anIntArray325[local498] != 0) {
				if (local385 == 0) {
					if (local96.length <= local387) {
						local385 = -1;
					} else {
						local385 = local96[local387++];
					}
					local496 = local34.aByteArray93[local119++] + 16 << 2;
				}
				local385--;
				this.aByteArray48[local498] = (byte) local496;
			}
		}
		local385 = 0;
		local387 = 0;
		@Pc(550) Class349 local550 = null;
		for (@Pc(552) int local552 = 0; local552 < 128; local552++) {
			if (this.anIntArray325[local552] != 0) {
				if (local385 == 0) {
					local550 = local215[local167[local387]];
					if (local140.length > local387) {
						local385 = local140[local387++];
					} else {
						local385 = -1;
					}
				}
				this.aClass349Array1[local552] = local550;
				local385--;
			}
		}
		local387 = 0;
		local385 = 0;
		@Pc(597) int local597 = 0;
		for (@Pc(599) int local599 = 0; local599 < 128; local599++) {
			if (local385 == 0) {
				if (local312.length > local387) {
					local385 = local312[local387++];
				} else {
					local385 = -1;
				}
				if (this.anIntArray325[local599] > 0) {
					local597 = local34.method7816() + 1;
				}
			}
			this.aByteArray47[local599] = (byte) local597;
			local385--;
		}
		this.anInt5821 = local34.method7816() + 1;
		@Pc(655) int local655;
		for (@Pc(645) int local645 = 0; local645 < local176; local645++) {
			@Pc(650) Class349 local650 = local215[local645];
			if (local650.aByteArray98 != null) {
				for (local655 = 1; local655 < local650.aByteArray98.length; local655 += 2) {
					local650.aByteArray98[local655] = local34.method7861();
				}
			}
			if (local650.aByteArray99 != null) {
				for (local655 = 3; local655 < local650.aByteArray99.length - 2; local655 += 2) {
					local650.aByteArray99[local655] = local34.method7861();
				}
			}
		}
		@Pc(702) int local702;
		if (local281 != null) {
			for (local702 = 1; local702 < local281.length; local702 += 2) {
				local281[local702] = local34.method7861();
			}
		}
		if (local294 != null) {
			for (local702 = 1; local702 < local294.length; local702 += 2) {
				local294[local702] = local34.method7861();
			}
		}
		@Pc(752) int local752;
		for (local702 = 0; local702 < local176; local702++) {
			@Pc(745) Class349 local745 = local215[local702];
			if (local745.aByteArray99 != null) {
				local338 = 0;
				for (local752 = 2; local752 < local745.aByteArray99.length; local752 += 2) {
					local338 = local34.method7816() + local338 + 1;
					local745.aByteArray99[local752] = (byte) local338;
				}
			}
		}
		@Pc(791) int local791;
		for (local655 = 0; local655 < local176; local655++) {
			@Pc(784) Class349 local784 = local215[local655];
			if (local784.aByteArray98 != null) {
				local338 = 0;
				for (local791 = 2; local791 < local784.aByteArray98.length; local791 += 2) {
					local338 = local34.method7816() + local338 + 1;
					local784.aByteArray98[local791] = (byte) local338;
				}
			}
		}
		@Pc(866) int local866;
		@Pc(892) int local892;
		@Pc(897) byte local897;
		@Pc(917) int local917;
		@Pc(919) int local919;
		@Pc(928) int local928;
		@Pc(860) byte local860;
		@Pc(972) int local972;
		if (local281 != null) {
			local338 = local34.method7816();
			local281[0] = (byte) local338;
			for (local752 = 2; local752 < local281.length; local752 += 2) {
				local338 = local34.method7816() + local338 + 1;
				local281[local752] = (byte) local338;
			}
			local860 = local281[0];
			@Pc(864) byte local864 = local281[1];
			for (local866 = 0; local866 < local860; local866++) {
				this.aByteArray47[local866] = (byte) (this.aByteArray47[local866] * local864 + 32 >> 6);
			}
			local892 = 2;
			while (local281.length > local892) {
				local897 = local281[local892];
				@Pc(903) byte local903 = local281[local892 + 1];
				local917 = (local897 - local860) * local864 + (local897 - local860) / 2;
				for (local919 = local860; local919 < local897; local919++) {
					local928 = Static153.method2780(local897 - local860, local917);
					local917 += local903 - local864;
					this.aByteArray47[local919] = (byte) (this.aByteArray47[local919] * local928 + 32 >> 6);
				}
				local892 += 2;
				local864 = local903;
				local860 = local897;
			}
			for (local972 = local860; local972 < 128; local972++) {
				this.aByteArray47[local972] = (byte) (local864 * this.aByteArray47[local972] + 32 >> 6);
			}
		}
		@Pc(1040) int local1040;
		if (local294 != null) {
			local338 = local34.method7816();
			local294[0] = (byte) local338;
			for (local752 = 2; local752 < local294.length; local752 += 2) {
				local338 = local338 + local34.method7816() + 1;
				local294[local752] = (byte) local338;
			}
			local860 = local294[0];
			local1040 = local294[1] << 1;
			for (local866 = 0; local866 < local860; local866++) {
				local892 = local1040 + (this.aByteArray48[local866] & 0xFF);
				if (local892 < 0) {
					local892 = 0;
				}
				if (local892 > 128) {
					local892 = 128;
				}
				this.aByteArray48[local866] = (byte) local892;
			}
			local892 = 2;
			@Pc(1095) int local1095;
			while (local294.length > local892) {
				local897 = local294[local892];
				local1095 = local294[local892 + 1] << 1;
				local917 = local1040 * (local897 - local860) + (local897 - local860) / 2;
				for (local919 = local860; local919 < local897; local919++) {
					local928 = Static153.method2780(local897 - local860, local917);
					@Pc(1128) int local1128 = (this.aByteArray48[local919] & 0xFF) + local928;
					if (local1128 < 0) {
						local1128 = 0;
					}
					if (local1128 > 128) {
						local1128 = 128;
					}
					local917 += local1095 - local1040;
					this.aByteArray48[local919] = (byte) local1128;
				}
				local892 += 2;
				local1040 = local1095;
				local860 = local897;
			}
			for (local972 = local860; local972 < 128; local972++) {
				local1095 = (this.aByteArray48[local972] & 0xFF) + local1040;
				if (local1095 < 0) {
					local1095 = 0;
				}
				if (local1095 > 128) {
					local1095 = 128;
				}
				this.aByteArray48[local972] = (byte) local1095;
			}
		}
		for (local752 = 0; local752 < local176; local752++) {
			local215[local752].anInt9722 = local34.method7816();
		}
		for (local791 = 0; local791 < local176; local791++) {
			@Pc(1223) Class349 local1223 = local215[local791];
			if (local1223.aByteArray98 != null) {
				local1223.anInt9716 = local34.method7816();
			}
			if (local1223.aByteArray99 != null) {
				local1223.anInt9720 = local34.method7816();
			}
			if (local1223.anInt9722 > 0) {
				local1223.anInt9721 = local34.method7816();
			}
		}
		for (local1040 = 0; local1040 < local176; local1040++) {
			local215[local1040].anInt9712 = local34.method7816();
		}
		for (local866 = 0; local866 < local176; local866++) {
			@Pc(1279) Class349 local1279 = local215[local866];
			if (local1279.anInt9712 > 0) {
				local1279.anInt9713 = local34.method7816();
			}
		}
		for (local892 = 0; local892 < local176; local892++) {
			@Pc(1302) Class349 local1302 = local215[local892];
			if (local1302.anInt9713 > 0) {
				local1302.anInt9714 = local34.method7816();
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([BLclient!qj;I[I)Z")
	public boolean method4816(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class290 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class5_Sub42_Sub1 local9 = null;
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			if (arg0 == null || arg0[local11] != 0) {
				@Pc(27) int local27 = this.anIntArray325[local11];
				if (local27 != 0) {
					if (local7 != local27) {
						local7 = local27--;
						if ((local27 & 0x1) == 0) {
							local9 = arg1.method6867(local27 >> 2, arg2);
						} else {
							local9 = arg1.method6869(arg2, local27 >> 2);
						}
						if (local9 == null) {
							local5 = false;
						}
					}
					if (local9 != null) {
						this.aClass5_Sub42_Sub1Array1[local11] = local9;
						this.anIntArray325[local11] = 0;
					}
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public void method4818() {
		this.anIntArray325 = null;
	}
}
