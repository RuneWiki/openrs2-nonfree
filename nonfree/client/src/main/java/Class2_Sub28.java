import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	public int anInt5131;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[Lclient!ar;")
	public Class2_Sub5_Sub1[] aClass2_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "[Lclient!sr;")
	public Class186[] aClass186Array1;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	private Class2_Sub28() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
	public Class2_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aClass186Array1 = new Class186[128];
		this.aByteArray73 = new byte[128];
		this.anIntArray397 = new int[128];
		this.aByteArray71 = new byte[128];
		this.aShortArray94 = new short[128];
		this.aClass2_Sub5_Sub1Array1 = new Class2_Sub5_Sub1[128];
		this.aByteArray72 = new byte[128];
		@Pc(36) Class2_Sub12 local36 = new Class2_Sub12(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray30[local38 + local36.anInt3606] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method3122();
		}
		local36.anInt3606++;
		local38++;
		@Pc(83) int local83 = local36.anInt3606;
		local36.anInt3606 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray30[local91 + local36.anInt3606] != 0; local91++) {
		}
		@Pc(108) byte[] local108 = new byte[local91];
		for (@Pc(110) int local110 = 0; local110 < local91; local110++) {
			local108[local110] = local36.method3122();
		}
		local91++;
		local36.anInt3606++;
		@Pc(136) int local136 = local36.anInt3606;
		local36.anInt3606 += local91;
		@Pc(144) int local144;
		for (local144 = 0; local36.aByteArray30[local36.anInt3606 + local144] != 0; local144++) {
		}
		@Pc(158) byte[] local158 = new byte[local144];
		for (@Pc(160) int local160 = 0; local160 < local144; local160++) {
			local158[local160] = local36.method3122();
		}
		local144++;
		local36.anInt3606++;
		@Pc(182) byte[] local182 = new byte[local144];
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local144 <= 1) {
			local187 = local144;
		} else {
			local182[1] = 1;
			local187 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local144; local199++) {
				local205 = local36.method3124();
				if (local205 == 0) {
					local197 = local187++;
				} else {
					if (local197 >= local205) {
						local205--;
					}
					local197 = local205;
				}
				local182[local199] = (byte) local197;
			}
		}
		@Pc(233) Class186[] local233 = new Class186[local187];
		for (local199 = 0; local199 < local233.length; local199++) {
			@Pc(245) Class186 local245 = local233[local199] = new Class186();
			@Pc(249) int local249 = local36.method3124();
			if (local249 > 0) {
				local245.aByteArray85 = new byte[local249 * 2];
			}
			local249 = local36.method3124();
			if (local249 > 0) {
				local245.aByteArray84 = new byte[local249 * 2 + 2];
				local245.aByteArray84[1] = 64;
			}
		}
		local205 = local36.method3124();
		@Pc(301) byte[] local301 = local205 > 0 ? new byte[local205 * 2] : null;
		local205 = local36.method3124();
		@Pc(314) byte[] local314 = local205 > 0 ? new byte[local205 * 2] : null;
		@Pc(316) int local316;
		for (local316 = 0; local36.aByteArray30[local316 + local36.anInt3606] != 0; local316++) {
		}
		@Pc(330) byte[] local330 = new byte[local316];
		for (@Pc(332) int local332 = 0; local332 < local316; local332++) {
			local330[local332] = local36.method3122();
		}
		local36.anInt3606++;
		local316++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method3124();
			this.aShortArray94[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method3124();
			this.aShortArray94[local377] = (short) (this.aShortArray94[local377] + (local353 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local330.length <= local404) {
					local402 = -1;
				} else {
					local402 = local330[local404++];
				}
				local406 = local36.method3134();
			}
			this.aShortArray94[local408] = (short) (this.aShortArray94[local408] + ((local406 - 1 & 0x2) << 14));
			local402--;
			this.anIntArray397[local408] = local406;
		}
		local402 = 0;
		local404 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray397[local466] != 0) {
				if (local402 == 0) {
					local464 = local36.aByteArray30[local83++] - 1;
					if (local404 >= local55.length) {
						local402 = -1;
					} else {
						local402 = local55[local404++];
					}
				}
				this.aByteArray73[local466] = (byte) local464;
				local402--;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray397[local523] != 0) {
				if (local402 == 0) {
					if (local108.length <= local404) {
						local402 = -1;
					} else {
						local402 = local108[local404++];
					}
					local521 = local36.aByteArray30[local136++] + 16 << 2;
				}
				local402--;
				this.aByteArray72[local523] = (byte) local521;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(574) Class186 local574 = null;
		for (@Pc(576) int local576 = 0; local576 < 128; local576++) {
			if (this.anIntArray397[local576] != 0) {
				if (local402 == 0) {
					local574 = local233[local182[local404]];
					if (local404 < local158.length) {
						local402 = local158[local404++];
					} else {
						local402 = -1;
					}
				}
				this.aClass186Array1[local576] = local574;
				local402--;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(623) int local623 = 0;
		for (@Pc(625) int local625 = 0; local625 < 128; local625++) {
			if (local402 == 0) {
				if (local404 < local330.length) {
					local402 = local330[local404++];
				} else {
					local402 = -1;
				}
				if (this.anIntArray397[local625] > 0) {
					local623 = local36.method3124() + 1;
				}
			}
			this.aByteArray71[local625] = (byte) local623;
			local402--;
		}
		this.anInt5131 = local36.method3124() + 1;
		@Pc(689) int local689;
		for (@Pc(678) int local678 = 0; local678 < local187; local678++) {
			@Pc(684) Class186 local684 = local233[local678];
			if (local684.aByteArray85 != null) {
				for (local689 = 1; local689 < local684.aByteArray85.length; local689 += 2) {
					local684.aByteArray85[local689] = local36.method3122();
				}
			}
			if (local684.aByteArray84 != null) {
				for (local689 = 3; local689 < local684.aByteArray84.length - 2; local689 += 2) {
					local684.aByteArray84[local689] = local36.method3122();
				}
			}
		}
		@Pc(738) int local738;
		if (local301 != null) {
			for (local738 = 1; local738 < local301.length; local738 += 2) {
				local301[local738] = local36.method3122();
			}
		}
		if (local314 != null) {
			for (local738 = 1; local738 < local314.length; local738 += 2) {
				local314[local738] = local36.method3122();
			}
		}
		@Pc(791) int local791;
		for (local738 = 0; local738 < local187; local738++) {
			@Pc(784) Class186 local784 = local233[local738];
			if (local784.aByteArray84 != null) {
				local353 = 0;
				for (local791 = 2; local791 < local784.aByteArray84.length; local791 += 2) {
					local353 = local36.method3124() + local353 + 1;
					local784.aByteArray84[local791] = (byte) local353;
				}
			}
		}
		@Pc(832) int local832;
		for (local689 = 0; local689 < local187; local689++) {
			@Pc(825) Class186 local825 = local233[local689];
			if (local825.aByteArray85 != null) {
				local353 = 0;
				for (local832 = 2; local832 < local825.aByteArray85.length; local832 += 2) {
					local353 = local36.method3124() + local353 + 1;
					local825.aByteArray85[local832] = (byte) local353;
				}
			}
		}
		@Pc(902) int local902;
		@Pc(929) int local929;
		@Pc(935) byte local935;
		@Pc(955) int local955;
		@Pc(957) int local957;
		@Pc(966) int local966;
		@Pc(896) byte local896;
		@Pc(1007) int local1007;
		if (local301 != null) {
			local353 = local36.method3124();
			local301[0] = (byte) local353;
			for (local791 = 2; local791 < local301.length; local791 += 2) {
				local353 = local353 + local36.method3124() + 1;
				local301[local791] = (byte) local353;
			}
			local896 = local301[0];
			@Pc(900) byte local900 = local301[1];
			for (local902 = 0; local902 < local896; local902++) {
				this.aByteArray71[local902] = (byte) (this.aByteArray71[local902] * local900 + 32 >> 6);
			}
			local929 = 2;
			while (local301.length > local929) {
				local935 = local301[local929];
				@Pc(941) byte local941 = local301[local929 + 1];
				local955 = local900 * (local935 - local896) + (local935 - local896) / 2;
				for (local957 = local896; local957 < local935; local957++) {
					local966 = Static121.method2363(local955, local935 - local896);
					local955 += local941 - local900;
					this.aByteArray71[local957] = (byte) (this.aByteArray71[local957] * local966 + 32 >> 6);
				}
				local929 += 2;
				local900 = local941;
				local896 = local935;
			}
			for (local1007 = local896; local1007 < 128; local1007++) {
				this.aByteArray71[local1007] = (byte) (local900 * this.aByteArray71[local1007] + 32 >> 6);
			}
		}
		@Pc(1079) int local1079;
		if (local314 != null) {
			local353 = local36.method3124();
			local314[0] = (byte) local353;
			for (local791 = 2; local791 < local314.length; local791 += 2) {
				local353 = local36.method3124() + local353 + 1;
				local314[local791] = (byte) local353;
			}
			local896 = local314[0];
			local1079 = local314[1] << 1;
			for (local902 = 0; local902 < local896; local902++) {
				local929 = (this.aByteArray72[local902] & 0xFF) + local1079;
				if (local929 < 0) {
					local929 = 0;
				}
				if (local929 > 128) {
					local929 = 128;
				}
				this.aByteArray72[local902] = (byte) local929;
			}
			local929 = 2;
			@Pc(1132) int local1132;
			while (local314.length > local929) {
				local935 = local314[local929];
				local1132 = local314[local929 + 1] << 1;
				local955 = (local935 - local896) / 2 + (local935 - local896) * local1079;
				for (local957 = local896; local957 < local935; local957++) {
					local966 = Static121.method2363(local955, local935 - local896);
					@Pc(1167) int local1167 = (this.aByteArray72[local957] & 0xFF) + local966;
					if (local1167 < 0) {
						local1167 = 0;
					}
					if (local1167 > 128) {
						local1167 = 128;
					}
					this.aByteArray72[local957] = (byte) local1167;
					local955 += local1132 - local1079;
				}
				local896 = local935;
				local929 += 2;
				local1079 = local1132;
			}
			for (local1007 = local896; local1007 < 128; local1007++) {
				local1132 = (this.aByteArray72[local1007] & 0xFF) + local1079;
				if (local1132 < 0) {
					local1132 = 0;
				}
				if (local1132 > 128) {
					local1132 = 128;
				}
				this.aByteArray72[local1007] = (byte) local1132;
			}
		}
		for (local791 = 0; local791 < local187; local791++) {
			local233[local791].anInt6034 = local36.method3124();
		}
		for (local832 = 0; local832 < local187; local832++) {
			@Pc(1270) Class186 local1270 = local233[local832];
			if (local1270.aByteArray85 != null) {
				local1270.anInt6035 = local36.method3124();
			}
			if (local1270.aByteArray84 != null) {
				local1270.anInt6032 = local36.method3124();
			}
			if (local1270.anInt6034 > 0) {
				local1270.anInt6031 = local36.method3124();
			}
		}
		for (local1079 = 0; local1079 < local187; local1079++) {
			local233[local1079].anInt6037 = local36.method3124();
		}
		for (local902 = 0; local902 < local187; local902++) {
			@Pc(1324) Class186 local1324 = local233[local902];
			if (local1324.anInt6037 > 0) {
				local1324.anInt6036 = local36.method3124();
			}
		}
		for (local929 = 0; local929 < local187; local929++) {
			@Pc(1351) Class186 local1351 = local233[local929];
			if (local1351.anInt6036 > 0) {
				local1351.anInt6033 = local36.method3124();
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ga;[B[IB)Z")
	public boolean method4345(@OriginalArg(0) Class76 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class2_Sub5_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray397[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg0.method2074(arg2, local33 >> 2);
						} else {
							local16 = arg0.method2076(arg2, local33 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub5_Sub1Array1[local18] = local16;
						this.anIntArray397[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V")
	public void method4347() {
		this.anIntArray397 = null;
	}
}
