import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "[I")
	private int[] anIntArray433 = new int[128];

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "[S")
	public short[] aShortArray137 = new short[128];

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "[B")
	public byte[] aByteArray58 = new byte[128];

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "[Lclient!tf;")
	public Class2_Sub9_Sub1[] aClass2_Sub9_Sub1Array1 = new Class2_Sub9_Sub1[128];

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "[B")
	public byte[] aByteArray59 = new byte[128];

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "[Lclient!la;")
	public Class57[] aClass57Array1 = new Class57[128];

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
	public int anInt4181;

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "[B")
	public byte[] aByteArray60 = new byte[128];

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub25(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class2_Sub3 local36 = new Class2_Sub3(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray4[local38 + local36.anInt239] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method186();
		}
		local36.anInt239++;
		local38++;
		@Pc(79) int local79 = local36.anInt239;
		local36.anInt239 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray4[local87 + local36.anInt239] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method186();
		}
		local36.anInt239++;
		local87++;
		@Pc(129) int local129 = local36.anInt239;
		local36.anInt239 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray4[local137 + local36.anInt239] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method186();
		}
		local36.anInt239++;
		local137++;
		@Pc(175) byte[] local175 = new byte[local137];
		@Pc(180) int local180;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local137 > 1) {
			local180 = 2;
			local175[1] = 1;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local137; local188++) {
				local194 = local36.method209();
				if (local194 == 0) {
					local186 = local180++;
				} else {
					if (local194 <= local186) {
						local194--;
					}
					local186 = local194;
				}
				local175[local188] = (byte) local186;
			}
		} else {
			local180 = local137;
		}
		@Pc(226) Class57[] local226 = new Class57[local180];
		for (local188 = 0; local188 < local226.length; local188++) {
			@Pc(238) Class57 local238 = local226[local188] = new Class57();
			@Pc(242) int local242 = local36.method209();
			if (local242 > 0) {
				local238.aByteArray34 = new byte[local242 * 2];
			}
			local242 = local36.method209();
			if (local242 > 0) {
				local238.aByteArray33 = new byte[local242 * 2 + 2];
				local238.aByteArray33[1] = 64;
			}
		}
		local194 = local36.method209();
		@Pc(296) byte[] local296 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local36.method209();
		@Pc(309) byte[] local309 = local194 <= 0 ? null : new byte[local194 * 2];
		@Pc(311) int local311;
		for (local311 = 0; local36.aByteArray4[local311 + local36.anInt239] != 0; local311++) {
		}
		@Pc(328) byte[] local328 = new byte[local311];
		for (@Pc(330) int local330 = 0; local330 < local311; local330++) {
			local328[local330] = local36.method186();
		}
		local36.anInt239++;
		local311++;
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 128; local353++) {
			local351 += local36.method209();
			this.aShortArray137[local353] = (short) local351;
		}
		local351 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local351 += local36.method209();
			this.aShortArray137[local377] = (short) (this.aShortArray137[local377] + (local351 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local328.length <= local406) {
					local402 = -1;
				} else {
					local402 = local328[local406++];
				}
				local404 = local36.method179();
			}
			this.aShortArray137[local408] = (short) (this.aShortArray137[local408] + ((local404 - 1 & 0x2) << 14));
			this.anIntArray433[local408] = local404;
			local402--;
		}
		local402 = 0;
		local406 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray433[local466] != 0) {
				if (local402 == 0) {
					local464 = local36.aByteArray4[local79++] - 1;
					if (local55.length <= local406) {
						local402 = -1;
					} else {
						local402 = local55[local406++];
					}
				}
				local402--;
				this.aByteArray58[local466] = (byte) local464;
			}
		}
		local402 = 0;
		local406 = 0;
		@Pc(518) int local518 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray433[local520] != 0) {
				if (local402 == 0) {
					if (local406 >= local101.length) {
						local402 = -1;
					} else {
						local402 = local101[local406++];
					}
					local518 = local36.aByteArray4[local129++] + 16 << 2;
				}
				this.aByteArray60[local520] = (byte) local518;
				local402--;
			}
		}
		local406 = 0;
		local402 = 0;
		@Pc(574) Class57 local574 = null;
		for (@Pc(576) int local576 = 0; local576 < 128; local576++) {
			if (this.anIntArray433[local576] != 0) {
				if (local402 == 0) {
					local574 = local226[local175[local406]];
					if (local406 >= local151.length) {
						local402 = -1;
					} else {
						local402 = local151[local406++];
					}
				}
				this.aClass57Array1[local576] = local574;
				local402--;
			}
		}
		local406 = 0;
		@Pc(624) int local624 = 0;
		local402 = 0;
		for (@Pc(628) int local628 = 0; local628 < 128; local628++) {
			if (local402 == 0) {
				if (local406 < local328.length) {
					local402 = local328[local406++];
				} else {
					local402 = -1;
				}
				if (this.anIntArray433[local628] > 0) {
					local624 = local36.method209() + 1;
				}
			}
			local402--;
			this.aByteArray59[local628] = (byte) local624;
		}
		this.anInt4181 = local36.method209() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local180; local685++) {
			@Pc(691) Class57 local691 = local226[local685];
			if (local691.aByteArray34 != null) {
				for (local696 = 1; local696 < local691.aByteArray34.length; local696 += 2) {
					local691.aByteArray34[local696] = local36.method186();
				}
			}
			if (local691.aByteArray33 != null) {
				for (local696 = 3; local696 < local691.aByteArray33.length - 2; local696 += 2) {
					local691.aByteArray33[local696] = local36.method186();
				}
			}
		}
		@Pc(753) int local753;
		if (local296 != null) {
			for (local753 = 1; local753 < local296.length; local753 += 2) {
				local296[local753] = local36.method186();
			}
		}
		if (local309 != null) {
			for (local753 = 1; local753 < local309.length; local753 += 2) {
				local309[local753] = local36.method186();
			}
		}
		@Pc(806) int local806;
		for (local753 = 0; local753 < local180; local753++) {
			@Pc(799) Class57 local799 = local226[local753];
			if (local799.aByteArray33 != null) {
				local351 = 0;
				for (local806 = 2; local806 < local799.aByteArray33.length; local806 += 2) {
					local351 = local351 + local36.method209() + 1;
					local799.aByteArray33[local806] = (byte) local351;
				}
			}
		}
		@Pc(855) int local855;
		for (local696 = 0; local696 < local180; local696++) {
			@Pc(848) Class57 local848 = local226[local696];
			if (local848.aByteArray34 != null) {
				local351 = 0;
				for (local855 = 2; local855 < local848.aByteArray34.length; local855 += 2) {
					local351 = local351 + local36.method209() + 1;
					local848.aByteArray34[local855] = (byte) local351;
				}
			}
		}
		@Pc(930) int local930;
		@Pc(957) int local957;
		@Pc(969) byte local969;
		@Pc(984) int local984;
		@Pc(986) int local986;
		@Pc(995) int local995;
		@Pc(924) byte local924;
		@Pc(1031) int local1031;
		if (local296 != null) {
			local351 = local36.method209();
			local296[0] = (byte) local351;
			for (local806 = 2; local806 < local296.length; local806 += 2) {
				local351 = local351 + local36.method209() + 1;
				local296[local806] = (byte) local351;
			}
			local924 = local296[0];
			@Pc(928) byte local928 = local296[1];
			for (local930 = 0; local930 < local924; local930++) {
				this.aByteArray59[local930] = (byte) (this.aByteArray59[local930] * local928 + 32 >> 6);
			}
			local957 = 2;
			while (local296.length > local957) {
				@Pc(965) byte local965 = local296[local957 + 1];
				local969 = local296[local957];
				local957 += 2;
				local984 = (local969 - local924) / 2 + (local969 - local924) * local928;
				for (local986 = local924; local986 < local969; local986++) {
					local995 = Static161.method2615(local969 - local924, local984);
					local984 += local965 - local928;
					this.aByteArray59[local986] = (byte) (this.aByteArray59[local986] * local995 + 32 >> 6);
				}
				local924 = local969;
				local928 = local965;
			}
			for (local1031 = local924; local1031 < 128; local1031++) {
				this.aByteArray59[local1031] = (byte) (local928 * this.aByteArray59[local1031] + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local309 != null) {
			local351 = local36.method209();
			local309[0] = (byte) local351;
			for (local806 = 2; local806 < local309.length; local806 += 2) {
				local351 = local351 + local36.method209() + 1;
				local309[local806] = (byte) local351;
			}
			local924 = local309[0];
			local1100 = local309[1] << 1;
			for (local930 = 0; local930 < local924; local930++) {
				local957 = local1100 + (this.aByteArray60[local930] & 0xFF);
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray60[local930] = (byte) local957;
			}
			local957 = 2;
			@Pc(1153) int local1153;
			while (local309.length > local957) {
				local969 = local309[local957];
				local1153 = local309[local957 + 1] << 1;
				local957 += 2;
				local984 = (local969 - local924) / 2 + (local969 - local924) * local1100;
				for (local986 = local924; local986 < local969; local986++) {
					local995 = Static161.method2615(local969 - local924, local984);
					@Pc(1189) int local1189 = (this.aByteArray60[local986] & 0xFF) + local995;
					if (local1189 < 0) {
						local1189 = 0;
					}
					local984 += local1153 - local1100;
					if (local1189 > 128) {
						local1189 = 128;
					}
					this.aByteArray60[local986] = (byte) local1189;
				}
				local924 = local969;
				local1100 = local1153;
			}
			for (local1031 = local924; local1031 < 128; local1031++) {
				local1153 = local1100 + (this.aByteArray60[local1031] & 0xFF);
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray60[local1031] = (byte) local1153;
			}
		}
		for (local806 = 0; local806 < local180; local806++) {
			local226[local806].anInt2593 = local36.method209();
		}
		for (local855 = 0; local855 < local180; local855++) {
			@Pc(1293) Class57 local1293 = local226[local855];
			if (local1293.aByteArray34 != null) {
				local1293.anInt2600 = local36.method209();
			}
			if (local1293.aByteArray33 != null) {
				local1293.anInt2597 = local36.method209();
			}
			if (local1293.anInt2593 > 0) {
				local1293.anInt2592 = local36.method209();
			}
		}
		for (local1100 = 0; local1100 < local180; local1100++) {
			local226[local1100].anInt2594 = local36.method209();
		}
		for (local930 = 0; local930 < local180; local930++) {
			@Pc(1348) Class57 local1348 = local226[local930];
			if (local1348.anInt2594 > 0) {
				local1348.anInt2596 = local36.method209();
			}
		}
		for (local957 = 0; local957 < local180; local957++) {
			@Pc(1371) Class57 local1371 = local226[local957];
			if (local1371.anInt2596 > 0) {
				local1371.anInt2595 = local36.method209();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([IILclient!nj;[B)Z")
	public boolean method2875(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub9_Sub1 local11 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray433[local19];
				if (local34 != 0) {
					if (local9 != local34) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local11 = arg1.method2164(local34 >> 2, arg0);
						} else {
							local11 = arg1.method2167(arg0, local34 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub9_Sub1Array1[local19] = local11;
						this.anIntArray433[local19] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
	public void method2879() {
		this.anIntArray433 = null;
	}
}
