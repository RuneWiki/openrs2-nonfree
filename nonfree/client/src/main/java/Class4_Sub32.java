import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[B")
	public byte[] aByteArray76 = new byte[128];

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "[Lclient!ri;")
	public Class4_Sub5_Sub1[] aClass4_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
	public int anInt5687;

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "[I")
	private int[] anIntArray458 = new int[128];

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "[Lclient!dm;")
	public Class36[] aClass36Array1 = new Class36[128];

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "[S")
	public short[] aShortArray94 = new short[128];

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B)V")
	public Class4_Sub32(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aClass4_Sub5_Sub1Array1 = new Class4_Sub5_Sub1[128];
		this.aByteArray75 = new byte[128];
		this.aByteArray74 = new byte[128];
		@Pc(38) Class4_Sub24 local38 = new Class4_Sub24(arg0);
		while (local38.aByteArray47[local38.anInt3822 + local21] != 0) {
			local21++;
		}
		@Pc(54) byte[] local54 = new byte[local21];
		@Pc(56) int local56;
		for (local56 = 0; local56 < local21; local56++) {
			local54[local56] = local38.method3069();
		}
		local21++;
		local38.anInt3822++;
		local56 = local38.anInt3822;
		@Pc(80) int local80 = 0;
		local38.anInt3822 += local21;
		while (local38.aByteArray47[local38.anInt3822 + local80] != 0) {
			local80++;
		}
		@Pc(101) byte[] local101 = new byte[local80];
		@Pc(103) int local103;
		for (local103 = 0; local103 < local80; local103++) {
			local101[local103] = local38.method3069();
		}
		local38.anInt3822++;
		local103 = local38.anInt3822;
		local80++;
		@Pc(127) int local127 = 0;
		local38.anInt3822 += local80;
		while (local38.aByteArray47[local38.anInt3822 + local127] != 0) {
			local127++;
		}
		@Pc(150) byte[] local150 = new byte[local127];
		for (@Pc(152) int local152 = 0; local152 < local127; local152++) {
			local150[local152] = local38.method3069();
		}
		local38.anInt3822++;
		local127++;
		@Pc(174) byte[] local174 = new byte[local127];
		@Pc(181) int local181;
		@Pc(187) int local187;
		if (local127 > 1) {
			@Pc(179) int local179 = 1;
			local181 = 2;
			local174[1] = 1;
			for (local187 = 2; local187 < local127; local187++) {
				@Pc(194) int local194 = local38.method3110();
				if (local194 == 0) {
					local179 = local181++;
				} else {
					if (local179 >= local194) {
						local194--;
					}
					local179 = local194;
				}
				local174[local187] = (byte) local179;
			}
		} else {
			local181 = local127;
		}
		@Pc(225) Class36[] local225 = new Class36[local181];
		for (local187 = 0; local187 < local225.length; local187++) {
			@Pc(239) Class36 local239 = local225[local187] = new Class36();
			@Pc(243) int local243 = local38.method3110();
			if (local243 > 0) {
				local239.aByteArray15 = new byte[local243 * 2];
			}
			local243 = local38.method3110();
			if (local243 > 0) {
				local239.aByteArray16 = new byte[local243 * 2 + 2];
				local239.aByteArray16[1] = 64;
			}
		}
		local187 = local38.method3110();
		@Pc(294) byte[] local294 = local187 > 0 ? new byte[local187 * 2] : null;
		@Pc(296) int local296 = 0;
		local187 = local38.method3110();
		while (local38.aByteArray47[local38.anInt3822 + local296] != 0) {
			local296++;
		}
		@Pc(317) byte[] local317 = new byte[local296];
		@Pc(319) int local319;
		for (local319 = 0; local319 < local296; local319++) {
			local317[local319] = local38.method3069();
		}
		@Pc(341) byte[] local341 = local187 <= 0 ? null : new byte[local187 * 2];
		local296++;
		local38.anInt3822++;
		local319 = 0;
		@Pc(352) int local352;
		for (local352 = 0; local352 < 128; local352++) {
			local319 += local38.method3110();
			this.aShortArray94[local352] = (short) local319;
		}
		local319 = 0;
		for (local352 = 0; local352 < 128; local352++) {
			local319 += local38.method3110();
			this.aShortArray94[local352] = (short) (this.aShortArray94[local352] + (local319 << 8));
		}
		local352 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409;
		for (local409 = 0; local409 < 128; local409++) {
			if (local352 == 0) {
				if (local317.length > local405) {
					local352 = local317[local405++];
				} else {
					local352 = -1;
				}
				local407 = local38.method3077();
			}
			this.aShortArray94[local409] = (short) (this.aShortArray94[local409] + ((local407 - 1 & 0x2) << 14));
			local352--;
			this.anIntArray458[local409] = local407;
		}
		local409 = 0;
		local352 = 0;
		local405 = 0;
		@Pc(469) int local469;
		for (local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray458[local469] != 0) {
				if (local352 == 0) {
					if (local54.length > local405) {
						local352 = local54[local405++];
					} else {
						local352 = -1;
					}
					local409 = local38.aByteArray47[local56++] - 1;
				}
				local352--;
				this.aByteArray75[local469] = (byte) local409;
			}
		}
		local405 = 0;
		local352 = 0;
		local469 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray458[local525] != 0) {
				if (local352 == 0) {
					if (local405 < local101.length) {
						local352 = local101[local405++];
					} else {
						local352 = -1;
					}
					local469 = local38.aByteArray47[local103++] + 16 << 2;
				}
				this.aByteArray74[local525] = (byte) local469;
				local352--;
			}
		}
		local405 = 0;
		local352 = 0;
		@Pc(584) Class36 local584 = null;
		@Pc(586) int local586;
		for (local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray458[local586] != 0) {
				if (local352 == 0) {
					local584 = local225[local174[local405]];
					if (local150.length <= local405) {
						local352 = -1;
					} else {
						local352 = local150[local405++];
					}
				}
				this.aClass36Array1[local586] = local584;
				local352--;
			}
		}
		local352 = 0;
		local405 = 0;
		local586 = 0;
		@Pc(642) int local642;
		for (local642 = 0; local642 < 128; local642++) {
			if (local352 == 0) {
				if (local317.length > local405) {
					local352 = local317[local405++];
				} else {
					local352 = -1;
				}
				if (this.anIntArray458[local642] > 0) {
					local586 = local38.method3110() + 1;
				}
			}
			local352--;
			this.aByteArray76[local642] = (byte) local586;
		}
		this.anInt5687 = local38.method3110() + 1;
		@Pc(705) Class36 local705;
		@Pc(711) int local711;
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.aByteArray15 != null) {
				for (local711 = 1; local711 < local705.aByteArray15.length; local711 += 2) {
					local705.aByteArray15[local711] = local38.method3069();
				}
			}
			if (local705.aByteArray16 != null) {
				for (local711 = 3; local711 < local705.aByteArray16.length - 2; local711 += 2) {
					local705.aByteArray16[local711] = local38.method3069();
				}
			}
		}
		if (local294 != null) {
			for (local642 = 1; local642 < local294.length; local642 += 2) {
				local294[local642] = local38.method3069();
			}
		}
		if (local341 != null) {
			for (local642 = 1; local642 < local341.length; local642 += 2) {
				local341[local642] = local38.method3069();
			}
		}
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.aByteArray16 != null) {
				local319 = 0;
				for (local711 = 2; local711 < local705.aByteArray16.length; local711 += 2) {
					local319 = local319 + local38.method3110() + 1;
					local705.aByteArray16[local711] = (byte) local319;
				}
			}
		}
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.aByteArray15 != null) {
				local319 = 0;
				for (local711 = 2; local711 < local705.aByteArray15.length; local711 += 2) {
					local319 = local38.method3110() + local319 + 1;
					local705.aByteArray15[local711] = (byte) local319;
				}
			}
		}
		@Pc(965) byte local965;
		@Pc(985) int local985;
		@Pc(988) int local988;
		@Pc(998) int local998;
		@Pc(1031) int local1031;
		@Pc(924) byte local924;
		if (local294 != null) {
			local319 = local38.method3110();
			local294[0] = (byte) local319;
			for (local642 = 2; local642 < local294.length; local642 += 2) {
				local319 = local38.method3110() + local319 + 1;
				local294[local642] = (byte) local319;
			}
			local924 = local294[0];
			@Pc(928) byte local928 = local294[1];
			for (local711 = 0; local711 < local924; local711++) {
				this.aByteArray76[local711] = (byte) (this.aByteArray76[local711] * local928 + 32 >> 6);
			}
			local711 = 2;
			while (local711 < local294.length) {
				local965 = local294[local711];
				@Pc(971) byte local971 = local294[local711 + 1];
				local985 = (local965 - local924) / 2 + local928 * (local965 - local924);
				local711 += 2;
				for (local988 = local924; local988 < local965; local988++) {
					local998 = Static93.method2548(local985, local965 - local924);
					local985 += local971 - local928;
					this.aByteArray76[local988] = (byte) (this.aByteArray76[local988] * local998 + 32 >> 6);
				}
				local928 = local971;
				local924 = local965;
			}
			for (local1031 = local924; local1031 < 128; local1031++) {
				this.aByteArray76[local1031] = (byte) (local928 * this.aByteArray76[local1031] + 32 >> 6);
			}
		}
		if (local341 != null) {
			local319 = local38.method3110();
			local341[0] = (byte) local319;
			for (local642 = 2; local642 < local341.length; local642 += 2) {
				local319 = local319 + local38.method3110() + 1;
				local341[local642] = (byte) local319;
			}
			local924 = local341[0];
			@Pc(1102) int local1102 = local341[1] << 1;
			for (local711 = 0; local711 < local924; local711++) {
				local1031 = (this.aByteArray74[local711] & 0xFF) + local1102;
				if (local1031 < 0) {
					local1031 = 0;
				}
				if (local1031 > 128) {
					local1031 = 128;
				}
				this.aByteArray74[local711] = (byte) local1031;
			}
			local711 = 2;
			@Pc(1155) int local1155;
			while (local341.length > local711) {
				local1155 = local341[local711 + 1] << 1;
				local965 = local341[local711];
				local711 += 2;
				local985 = local1102 * (local965 - local924) + (local965 - local924) / 2;
				for (local988 = local924; local988 < local965; local988++) {
					local998 = Static93.method2548(local985, local965 - local924);
					local985 += local1155 - local1102;
					@Pc(1203) int local1203 = local998 + (this.aByteArray74[local988] & 0xFF);
					if (local1203 < 0) {
						local1203 = 0;
					}
					if (local1203 > 128) {
						local1203 = 128;
					}
					this.aByteArray74[local988] = (byte) local1203;
				}
				local1102 = local1155;
				local924 = local965;
			}
			for (local1031 = local924; local1031 < 128; local1031++) {
				local1155 = (this.aByteArray74[local1031] & 0xFF) + local1102;
				if (local1155 < 0) {
					local1155 = 0;
				}
				if (local1155 > 128) {
					local1155 = 128;
				}
				this.aByteArray74[local1031] = (byte) local1155;
			}
		}
		for (local642 = 0; local642 < local181; local642++) {
			local225[local642].anInt1263 = local38.method3110();
		}
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.aByteArray15 != null) {
				local705.anInt1256 = local38.method3110();
			}
			if (local705.aByteArray16 != null) {
				local705.anInt1257 = local38.method3110();
			}
			if (local705.anInt1263 > 0) {
				local705.anInt1260 = local38.method3110();
			}
		}
		for (local642 = 0; local642 < local181; local642++) {
			local225[local642].anInt1261 = local38.method3110();
		}
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.anInt1261 > 0) {
				local705.anInt1255 = local38.method3110();
			}
		}
		for (local642 = 0; local642 < local181; local642++) {
			local705 = local225[local642];
			if (local705.anInt1255 > 0) {
				local705.anInt1262 = local38.method3110();
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([BLclient!cd;I[I)Z")
	public boolean method4561(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) int local10 = 0;
		@Pc(16) boolean local16 = true;
		@Pc(18) Class4_Sub5_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg0 == null || arg0[local20] != 0) {
				@Pc(37) int local37 = this.anIntArray458[local20];
				if (local37 != 0) {
					if (local10 != local37) {
						local10 = local37--;
						if ((local37 & 0x1) == 0) {
							local18 = arg1.method642(local37 >> 2, arg2);
						} else {
							local18 = arg1.method645(arg2, local37 >> 2);
						}
						if (local18 == null) {
							local16 = false;
						}
					}
					if (local18 != null) {
						this.aClass4_Sub5_Sub1Array1[local20] = local18;
						this.anIntArray458[local20] = 0;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public void method4564() {
		this.anIntArray458 = null;
	}
}
