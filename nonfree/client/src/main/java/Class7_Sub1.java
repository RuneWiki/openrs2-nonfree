import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[Lclient!hl;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "[Lclient!lv;")
	public Class7_Sub31_Sub1[] aClass7_Sub31_Sub1Array1;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	private Class7_Sub1() {
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
	public Class7_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray5 = new byte[128];
		this.aClass106Array1 = new Class106[128];
		this.aShortArray1 = new short[128];
		this.aByteArray4 = new byte[128];
		this.aByteArray3 = new byte[128];
		this.anIntArray3 = new int[128];
		this.aClass7_Sub31_Sub1Array1 = new Class7_Sub31_Sub1[128];
		@Pc(36) Class7_Sub14 local36 = new Class7_Sub14(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray75[local38 + local36.anInt4989] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method3930();
		}
		local38++;
		local36.anInt4989++;
		@Pc(79) int local79 = local36.anInt4989;
		local36.anInt4989 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray75[local87 + local36.anInt4989] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method3930();
		}
		local87++;
		local36.anInt4989++;
		@Pc(128) int local128 = local36.anInt4989;
		local36.anInt4989 += local87;
		@Pc(136) int local136;
		for (local136 = 0; local36.aByteArray75[local136 + local36.anInt4989] != 0; local136++) {
		}
		@Pc(153) byte[] local153 = new byte[local136];
		for (@Pc(155) int local155 = 0; local155 < local136; local155++) {
			local153[local155] = local36.method3930();
		}
		local36.anInt4989++;
		local136++;
		@Pc(177) byte[] local177 = new byte[local136];
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(196) int local196;
		if (local136 > 1) {
			local177[1] = 1;
			@Pc(186) int local186 = 1;
			local188 = 2;
			for (local190 = 2; local190 < local136; local190++) {
				local196 = local36.method3981();
				if (local196 == 0) {
					local186 = local188++;
				} else {
					if (local186 >= local196) {
						local196--;
					}
					local186 = local196;
				}
				local177[local190] = (byte) local186;
			}
		} else {
			local188 = local136;
		}
		@Pc(229) Class106[] local229 = new Class106[local188];
		for (local190 = 0; local190 < local229.length; local190++) {
			@Pc(241) Class106 local241 = local229[local190] = new Class106();
			@Pc(245) int local245 = local36.method3981();
			if (local245 > 0) {
				local241.aByteArray44 = new byte[local245 * 2];
			}
			local245 = local36.method3981();
			if (local245 > 0) {
				local241.aByteArray45 = new byte[local245 * 2 + 2];
				local241.aByteArray45[1] = 64;
			}
		}
		local196 = local36.method3981();
		@Pc(296) byte[] local296 = local196 > 0 ? new byte[local196 * 2] : null;
		local196 = local36.method3981();
		@Pc(309) byte[] local309 = local196 <= 0 ? null : new byte[local196 * 2];
		@Pc(311) int local311;
		for (local311 = 0; local36.aByteArray75[local311 + local36.anInt4989] != 0; local311++) {
		}
		@Pc(328) byte[] local328 = new byte[local311];
		for (@Pc(330) int local330 = 0; local330 < local311; local330++) {
			local328[local330] = local36.method3930();
		}
		local36.anInt4989++;
		local311++;
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 128; local353++) {
			local351 += local36.method3981();
			this.aShortArray1[local353] = (short) local351;
		}
		local351 = 0;
		for (@Pc(375) int local375 = 0; local375 < 128; local375++) {
			local351 += local36.method3981();
			this.aShortArray1[local375] = (short) (this.aShortArray1[local375] + (local351 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local404 >= local328.length) {
					local402 = -1;
				} else {
					local402 = local328[local404++];
				}
				local406 = local36.method3963();
			}
			this.aShortArray1[local408] = (short) (this.aShortArray1[local408] + ((local406 - 1 & 0x2) << 14));
			this.anIntArray3[local408] = local406;
			local402--;
		}
		local404 = 0;
		local402 = 0;
		@Pc(460) int local460 = 0;
		for (@Pc(462) int local462 = 0; local462 < 128; local462++) {
			if (this.anIntArray3[local462] != 0) {
				if (local402 == 0) {
					local460 = local36.aByteArray75[local79++] - 1;
					if (local404 >= local55.length) {
						local402 = -1;
					} else {
						local402 = local55[local404++];
					}
				}
				local402--;
				this.aByteArray4[local462] = (byte) local460;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(514) int local514 = 0;
		for (@Pc(516) int local516 = 0; local516 < 128; local516++) {
			if (this.anIntArray3[local516] != 0) {
				if (local402 == 0) {
					local514 = local36.aByteArray75[local128++] + 16 << 2;
					if (local404 < local104.length) {
						local402 = local104[local404++];
					} else {
						local402 = -1;
					}
				}
				this.aByteArray5[local516] = (byte) local514;
				local402--;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(570) Class106 local570 = null;
		for (@Pc(572) int local572 = 0; local572 < 128; local572++) {
			if (this.anIntArray3[local572] != 0) {
				if (local402 == 0) {
					local570 = local229[local177[local404]];
					if (local404 >= local153.length) {
						local402 = -1;
					} else {
						local402 = local153[local404++];
					}
				}
				this.aClass106Array1[local572] = local570;
				local402--;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(623) int local623 = 0;
		for (@Pc(625) int local625 = 0; local625 < 128; local625++) {
			if (local402 == 0) {
				if (local328.length > local404) {
					local402 = local328[local404++];
				} else {
					local402 = -1;
				}
				if (this.anIntArray3[local625] > 0) {
					local623 = local36.method3981() + 1;
				}
			}
			this.aByteArray3[local625] = (byte) local623;
			local402--;
		}
		this.anInt45 = local36.method3981() + 1;
		@Pc(688) int local688;
		for (@Pc(677) int local677 = 0; local677 < local188; local677++) {
			@Pc(683) Class106 local683 = local229[local677];
			if (local683.aByteArray44 != null) {
				for (local688 = 1; local688 < local683.aByteArray44.length; local688 += 2) {
					local683.aByteArray44[local688] = local36.method3930();
				}
			}
			if (local683.aByteArray45 != null) {
				for (local688 = 3; local688 < local683.aByteArray45.length - 2; local688 += 2) {
					local683.aByteArray45[local688] = local36.method3930();
				}
			}
		}
		@Pc(737) int local737;
		if (local296 != null) {
			for (local737 = 1; local737 < local296.length; local737 += 2) {
				local296[local737] = local36.method3930();
			}
		}
		if (local309 != null) {
			for (local737 = 1; local737 < local309.length; local737 += 2) {
				local309[local737] = local36.method3930();
			}
		}
		@Pc(782) int local782;
		for (local737 = 0; local737 < local188; local737++) {
			@Pc(775) Class106 local775 = local229[local737];
			if (local775.aByteArray45 != null) {
				local351 = 0;
				for (local782 = 2; local782 < local775.aByteArray45.length; local782 += 2) {
					local351 = local36.method3981() + local351 + 1;
					local775.aByteArray45[local782] = (byte) local351;
				}
			}
		}
		@Pc(827) int local827;
		for (local688 = 0; local688 < local188; local688++) {
			@Pc(820) Class106 local820 = local229[local688];
			if (local820.aByteArray44 != null) {
				local351 = 0;
				for (local827 = 2; local827 < local820.aByteArray44.length; local827 += 2) {
					local351 += local36.method3981() + 1;
					local820.aByteArray44[local827] = (byte) local351;
				}
			}
		}
		@Pc(901) int local901;
		@Pc(924) int local924;
		@Pc(930) byte local930;
		@Pc(951) int local951;
		@Pc(953) int local953;
		@Pc(963) int local963;
		@Pc(895) byte local895;
		@Pc(1000) int local1000;
		if (local296 != null) {
			local351 = local36.method3981();
			local296[0] = (byte) local351;
			for (local782 = 2; local782 < local296.length; local782 += 2) {
				local351 += local36.method3981() + 1;
				local296[local782] = (byte) local351;
			}
			local895 = local296[0];
			@Pc(899) byte local899 = local296[1];
			for (local901 = 0; local901 < local895; local901++) {
				this.aByteArray3[local901] = (byte) (this.aByteArray3[local901] * local899 + 32 >> 6);
			}
			for (local924 = 2; local924 < local296.length; local924 += 2) {
				local930 = local296[local924];
				@Pc(936) byte local936 = local296[local924 + 1];
				local951 = local899 * (local930 - local895) + (local930 - local895) / 2;
				for (local953 = local895; local953 < local930; local953++) {
					local963 = Static29.method378(local951, local930 - local895);
					local951 += local936 - local899;
					this.aByteArray3[local953] = (byte) (this.aByteArray3[local953] * local963 + 32 >> 6);
				}
				local899 = local936;
				local895 = local930;
			}
			for (local1000 = local895; local1000 < 128; local1000++) {
				this.aByteArray3[local1000] = (byte) (this.aByteArray3[local1000] * local899 + 32 >> 6);
			}
		}
		@Pc(1070) int local1070;
		if (local309 != null) {
			local351 = local36.method3981();
			local309[0] = (byte) local351;
			for (local782 = 2; local782 < local309.length; local782 += 2) {
				local351 = local36.method3981() + local351 + 1;
				local309[local782] = (byte) local351;
			}
			local895 = local309[0];
			local1070 = local309[1] << 1;
			for (local901 = 0; local901 < local895; local901++) {
				local924 = local1070 + (this.aByteArray5[local901] & 0xFF);
				if (local924 < 0) {
					local924 = 0;
				}
				if (local924 > 128) {
					local924 = 128;
				}
				this.aByteArray5[local901] = (byte) local924;
			}
			local924 = 2;
			@Pc(1120) int local1120;
			while (local309.length > local924) {
				local930 = local309[local924];
				local1120 = local309[local924 + 1] << 1;
				local951 = local1070 * (local930 - local895) + (local930 - local895) / 2;
				for (local953 = local895; local953 < local930; local953++) {
					local963 = Static29.method378(local951, local930 - local895);
					@Pc(1154) int local1154 = local963 + (this.aByteArray5[local953] & 0xFF);
					if (local1154 < 0) {
						local1154 = 0;
					}
					if (local1154 > 128) {
						local1154 = 128;
					}
					this.aByteArray5[local953] = (byte) local1154;
					local951 += local1120 - local1070;
				}
				local895 = local930;
				local924 += 2;
				local1070 = local1120;
			}
			for (local1000 = local895; local1000 < 128; local1000++) {
				local1120 = (this.aByteArray5[local1000] & 0xFF) + local1070;
				if (local1120 < 0) {
					local1120 = 0;
				}
				if (local1120 > 128) {
					local1120 = 128;
				}
				this.aByteArray5[local1000] = (byte) local1120;
			}
		}
		for (local782 = 0; local782 < local188; local782++) {
			local229[local782].anInt2916 = local36.method3981();
		}
		for (local827 = 0; local827 < local188; local827++) {
			@Pc(1258) Class106 local1258 = local229[local827];
			if (local1258.aByteArray44 != null) {
				local1258.anInt2918 = local36.method3981();
			}
			if (local1258.aByteArray45 != null) {
				local1258.anInt2921 = local36.method3981();
			}
			if (local1258.anInt2916 > 0) {
				local1258.anInt2914 = local36.method3981();
			}
		}
		for (local1070 = 0; local1070 < local188; local1070++) {
			local229[local1070].anInt2917 = local36.method3981();
		}
		for (local901 = 0; local901 < local188; local901++) {
			@Pc(1316) Class106 local1316 = local229[local901];
			if (local1316.anInt2917 > 0) {
				local1316.anInt2919 = local36.method3981();
			}
		}
		for (local924 = 0; local924 < local188; local924++) {
			@Pc(1340) Class106 local1340 = local229[local924];
			if (local1340.anInt2919 > 0) {
				local1340.anInt2915 = local36.method3981();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
	public void method40() {
		this.anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[B[ILclient!fg;)Z")
	public boolean method41(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class77 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class7_Sub31_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray3[local18];
				if (local33 != 0) {
					if (local33 != local9) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method1913(arg1, local33 >> 2);
						} else {
							local16 = arg2.method1915(local33 >> 2, arg1);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass7_Sub31_Sub1Array1[local18] = local16;
						this.anIntArray3[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
