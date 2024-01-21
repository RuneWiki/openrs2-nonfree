import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public final int anInt1551;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "[B")
	public final byte[] aByteArray28 = new byte[128];

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "[B")
	public final byte[] aByteArray29 = new byte[128];

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "[Lclient!qf;")
	public final Class5_Sub21_Sub1[] aClass5_Sub21_Sub1Array1 = new Class5_Sub21_Sub1[128];

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "[I")
	private int[] anIntArray232 = new int[128];

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "[S")
	public final short[] aShortArray20 = new short[128];

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "[Lclient!nb;")
	public final Class50[] aClass50Array1 = new Class50[128];

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "[B")
	public final byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class5_Sub10(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class5_Sub14 local38 = new Class5_Sub14(arg0);
		while (local38.aByteArray33[local33 + local38.anInt2199] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1447();
		}
		local33++;
		@Pc(69) int local69 = 0;
		local38.anInt2199++;
		@Pc(78) int local78 = local38.anInt2199;
		local38.anInt2199 += local33;
		while (local38.aByteArray33[local69 + local38.anInt2199] != 0) {
			local69++;
		}
		@Pc(101) byte[] local101 = new byte[local69];
		for (@Pc(103) int local103 = 0; local103 < local69; local103++) {
			local101[local103] = local38.method1447();
		}
		local38.anInt2199++;
		local69++;
		@Pc(125) int local125 = local38.anInt2199;
		@Pc(127) int local127 = 0;
		local38.anInt2199 += local69;
		while (local38.aByteArray33[local127 + local38.anInt2199] != 0) {
			local127++;
		}
		@Pc(147) byte[] local147 = new byte[local127];
		for (@Pc(149) int local149 = 0; local149 < local127; local149++) {
			local147[local149] = local38.method1447();
		}
		local127++;
		local38.anInt2199++;
		@Pc(171) byte[] local171 = new byte[local127];
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(192) int local192;
		if (local127 > 1) {
			local178 = 2;
			local171[1] = 1;
			@Pc(184) int local184 = 1;
			for (local186 = 2; local186 < local127; local186++) {
				local192 = local38.method1471();
				if (local192 == 0) {
					local184 = local178++;
				} else {
					if (local192 <= local184) {
						local192--;
					}
					local184 = local192;
				}
				local171[local186] = (byte) local184;
			}
		} else {
			local178 = local127;
		}
		@Pc(221) Class50[] local221 = new Class50[local178];
		for (local186 = 0; local186 < local221.length; local186++) {
			@Pc(233) Class50 local233 = local221[local186] = new Class50();
			@Pc(237) int local237 = local38.method1471();
			if (local237 > 0) {
				local233.aByteArray35 = new byte[local237 * 2];
			}
			local237 = local38.method1471();
			if (local237 > 0) {
				local233.aByteArray34 = new byte[local237 * 2 + 2];
				local233.aByteArray34[1] = 64;
			}
		}
		local192 = local38.method1471();
		@Pc(288) byte[] local288 = local192 > 0 ? new byte[local192 * 2] : null;
		local192 = local38.method1471();
		@Pc(294) int local294;
		for (local294 = 0; local38.aByteArray33[local294 + local38.anInt2199] != 0; local294++) {
		}
		@Pc(308) byte[] local308 = new byte[local294];
		for (@Pc(310) int local310 = 0; local310 < local294; local310++) {
			local308[local310] = local38.method1447();
		}
		local294++;
		@Pc(329) int local329 = 0;
		@Pc(341) byte[] local341 = local192 > 0 ? new byte[local192 * 2] : null;
		local38.anInt2199++;
		for (@Pc(349) int local349 = 0; local349 < 128; local349++) {
			local329 += local38.method1471();
			this.aShortArray20[local349] = (short) local329;
		}
		local329 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local329 += local38.method1471();
			this.aShortArray20[local373] = (short) (this.aShortArray20[local373] + (local329 << 8));
		}
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		for (@Pc(406) int local406 = 0; local406 < 128; local406++) {
			if (local404 == 0) {
				if (local308.length <= local400) {
					local404 = -1;
				} else {
					local404 = local308[local400++];
				}
				local402 = local38.method1433();
			}
			this.aShortArray20[local406] = (short) (this.aShortArray20[local406] + ((local402 - 1 & 0x2) << 14));
			local404--;
			this.anIntArray232[local406] = local402;
		}
		local404 = 0;
		local400 = 0;
		@Pc(467) int local467 = 0;
		for (@Pc(469) int local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray232[local469] != 0) {
				if (local404 == 0) {
					local467 = local38.aByteArray33[local78++] - 1;
					if (local52.length > local400) {
						local404 = local52[local400++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aByteArray29[local469] = (byte) local467;
			}
		}
		local400 = 0;
		local404 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray232[local525] != 0) {
				if (local404 == 0) {
					local523 = local38.aByteArray33[local125++] + 16 << 2;
					if (local400 < local101.length) {
						local404 = local101[local400++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aByteArray30[local525] = (byte) local523;
			}
		}
		@Pc(579) Class50 local579 = null;
		local400 = 0;
		local404 = 0;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray232[local585] != 0) {
				if (local404 == 0) {
					local579 = local221[local171[local400]];
					if (local147.length > local400) {
						local404 = local147[local400++];
					} else {
						local404 = -1;
					}
				}
				this.aClass50Array1[local585] = local579;
				local404--;
			}
		}
		local404 = 0;
		local400 = 0;
		@Pc(637) int local637 = 0;
		for (@Pc(639) int local639 = 0; local639 < 128; local639++) {
			if (local404 == 0) {
				if (local308.length <= local400) {
					local404 = -1;
				} else {
					local404 = local308[local400++];
				}
				if (this.anIntArray232[local639] > 0) {
					local637 = local38.method1471() + 1;
				}
			}
			this.aByteArray28[local639] = (byte) local637;
			local404--;
		}
		this.anInt1551 = local38.method1471() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local178; local697++) {
			@Pc(703) Class50 local703 = local221[local697];
			if (local703.aByteArray35 != null) {
				for (local708 = 1; local708 < local703.aByteArray35.length; local708 += 2) {
					local703.aByteArray35[local708] = local38.method1447();
				}
			}
			if (local703.aByteArray34 != null) {
				for (local708 = 3; local708 < local703.aByteArray34.length - 2; local708 += 2) {
					local703.aByteArray34[local708] = local38.method1447();
				}
			}
		}
		@Pc(761) int local761;
		if (local288 != null) {
			for (local761 = 1; local761 < local288.length; local761 += 2) {
				local288[local761] = local38.method1447();
			}
		}
		if (local341 != null) {
			for (local761 = 1; local761 < local341.length; local761 += 2) {
				local341[local761] = local38.method1447();
			}
		}
		@Pc(814) int local814;
		for (local761 = 0; local761 < local178; local761++) {
			@Pc(807) Class50 local807 = local221[local761];
			if (local807.aByteArray34 != null) {
				local329 = 0;
				for (local814 = 2; local814 < local807.aByteArray34.length; local814 += 2) {
					local329 = local38.method1471() + local329 + 1;
					local807.aByteArray34[local814] = (byte) local329;
				}
			}
		}
		@Pc(863) int local863;
		for (local708 = 0; local708 < local178; local708++) {
			@Pc(856) Class50 local856 = local221[local708];
			if (local856.aByteArray35 != null) {
				local329 = 0;
				for (local863 = 2; local863 < local856.aByteArray35.length; local863 += 2) {
					local329 = local329 + local38.method1471() + 1;
					local856.aByteArray35[local863] = (byte) local329;
				}
			}
		}
		@Pc(933) int local933;
		@Pc(960) int local960;
		@Pc(972) byte local972;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(999) int local999;
		@Pc(927) byte local927;
		@Pc(1040) int local1040;
		if (local288 != null) {
			local329 = local38.method1471();
			local288[0] = (byte) local329;
			for (local814 = 2; local814 < local288.length; local814 += 2) {
				local329 = local329 + local38.method1471() + 1;
				local288[local814] = (byte) local329;
			}
			local927 = local288[0];
			@Pc(931) byte local931 = local288[1];
			for (local933 = 0; local933 < local927; local933++) {
				this.aByteArray28[local933] = (byte) (local931 * this.aByteArray28[local933] + 32 >> 6);
			}
			local960 = 2;
			while (local960 < local288.length) {
				@Pc(968) byte local968 = local288[local960 + 1];
				local972 = local288[local960];
				local960 += 2;
				local987 = (local972 - local927) * local931 + (local972 - local927) / 2;
				for (local989 = local927; local989 < local972; local989++) {
					local999 = Static2.method8(local987, local972 - local927);
					this.aByteArray28[local989] = (byte) (local999 * this.aByteArray28[local989] + 32 >> 6);
					local987 += local968 - local931;
				}
				local931 = local968;
				local927 = local972;
			}
			for (local1040 = local927; local1040 < 128; local1040++) {
				this.aByteArray28[local1040] = (byte) (local931 * this.aByteArray28[local1040] + 32 >> 6);
			}
		}
		@Pc(1106) int local1106;
		if (local341 != null) {
			local329 = local38.method1471();
			local341[0] = (byte) local329;
			for (local814 = 2; local814 < local341.length; local814 += 2) {
				local329 = local38.method1471() + local329 + 1;
				local341[local814] = (byte) local329;
			}
			local927 = local341[0];
			local1106 = local341[1] << 1;
			for (local933 = 0; local933 < local927; local933++) {
				local960 = (this.aByteArray30[local933] & 0xFF) + local1106;
				if (local960 < 0) {
					local960 = 0;
				}
				if (local960 > 128) {
					local960 = 128;
				}
				this.aByteArray30[local933] = (byte) local960;
			}
			local960 = 2;
			@Pc(1158) int local1158;
			while (local341.length > local960) {
				local972 = local341[local960];
				local1158 = local341[local960 + 1] << 1;
				local960 += 2;
				local987 = (local972 - local927) / 2 + local1106 * (local972 - local927);
				for (local989 = local927; local989 < local972; local989++) {
					local999 = Static2.method8(local987, local972 - local927);
					local987 += local1158 - local1106;
					@Pc(1199) int local1199 = (this.aByteArray30[local989] & 0xFF) + local999;
					if (local1199 < 0) {
						local1199 = 0;
					}
					if (local1199 > 128) {
						local1199 = 128;
					}
					this.aByteArray30[local989] = (byte) local1199;
				}
				local927 = local972;
				local1106 = local1158;
			}
			for (local1040 = local927; local1040 < 128; local1040++) {
				local1158 = local1106 + (this.aByteArray30[local1040] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray30[local1040] = (byte) local1158;
			}
		}
		for (local814 = 0; local814 < local178; local814++) {
			local221[local814].anInt2273 = local38.method1471();
		}
		for (local863 = 0; local863 < local178; local863++) {
			@Pc(1292) Class50 local1292 = local221[local863];
			if (local1292.aByteArray35 != null) {
				local1292.anInt2267 = local38.method1471();
			}
			if (local1292.aByteArray34 != null) {
				local1292.anInt2271 = local38.method1471();
			}
			if (local1292.anInt2273 > 0) {
				local1292.anInt2268 = local38.method1471();
			}
		}
		for (local1106 = 0; local1106 < local178; local1106++) {
			local221[local1106].anInt2269 = local38.method1471();
		}
		for (local933 = 0; local933 < local178; local933++) {
			@Pc(1354) Class50 local1354 = local221[local933];
			if (local1354.anInt2269 > 0) {
				local1354.anInt2277 = local38.method1471();
			}
		}
		for (local960 = 0; local960 < local178; local960++) {
			@Pc(1374) Class50 local1374 = local221[local960];
			if (local1374.anInt2277 > 0) {
				local1374.anInt2270 = local38.method1471();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BLclient!s;[I)Z")
	public boolean method1081(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class5_Sub21_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray232[local18];
				if (local33 != 0) {
					if (local14 != local33) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg1.method1773(local33 >> 2, arg2);
						} else {
							local16 = arg1.method1768(arg2, local33 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass5_Sub21_Sub1Array1[local18] = local16;
						this.anIntArray232[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	public void method1083() {
		this.anIntArray232 = null;
	}
}
