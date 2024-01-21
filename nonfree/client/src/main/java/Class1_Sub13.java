import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "[B")
	public final byte[] aByteArray10 = new byte[128];

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "[S")
	public final short[] aShortArray14 = new short[128];

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "[Lclient!ii;")
	public final Class49[] aClass49Array1 = new Class49[128];

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "[Lclient!qc;")
	public final Class1_Sub22_Sub1[] aClass1_Sub22_Sub1Array1 = new Class1_Sub22_Sub1[128];

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "[B")
	public final byte[] aByteArray11 = new byte[128];

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "[I")
	private int[] anIntArray159 = new int[128];

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "[B")
	public final byte[] aByteArray12 = new byte[128];

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	public final int anInt1965;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub13(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub14 local36 = new Class1_Sub14(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray49[local36.anInt4061 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method3009();
		}
		local36.anInt4061++;
		@Pc(76) int local76 = local36.anInt4061;
		@Pc(78) int local78 = 0;
		local38++;
		local36.anInt4061 += local38;
		while (local36.aByteArray49[local36.anInt4061 + local78] != 0) {
			local78++;
		}
		@Pc(99) byte[] local99 = new byte[local78];
		for (@Pc(101) int local101 = 0; local101 < local78; local101++) {
			local99[local101] = local36.method3009();
		}
		local36.anInt4061++;
		local78++;
		@Pc(123) int local123 = local36.anInt4061;
		@Pc(125) int local125 = 0;
		local36.anInt4061 += local78;
		while (local36.aByteArray49[local36.anInt4061 + local125] != 0) {
			local125++;
		}
		@Pc(149) byte[] local149 = new byte[local125];
		for (@Pc(151) int local151 = 0; local151 < local125; local151++) {
			local149[local151] = local36.method3009();
		}
		local125++;
		@Pc(171) byte[] local171 = new byte[local125];
		local36.anInt4061++;
		@Pc(184) int local184;
		@Pc(196) int local196;
		@Pc(202) int local202;
		if (local125 <= 1) {
			local184 = local125;
		} else {
			local184 = 2;
			local171[1] = 1;
			@Pc(194) int local194 = 1;
			for (local196 = 2; local196 < local125; local196++) {
				local202 = local36.method3010();
				if (local202 == 0) {
					local194 = local184++;
				} else {
					if (local194 >= local202) {
						local202--;
					}
					local194 = local202;
				}
				local171[local196] = (byte) local194;
			}
		}
		@Pc(234) Class49[] local234 = new Class49[local184];
		for (local196 = 0; local196 < local234.length; local196++) {
			@Pc(246) Class49 local246 = local234[local196] = new Class49();
			@Pc(250) int local250 = local36.method3010();
			if (local250 > 0) {
				local246.aByteArray8 = new byte[local250 * 2];
			}
			local250 = local36.method3010();
			if (local250 > 0) {
				local246.aByteArray9 = new byte[local250 * 2 + 2];
				local246.aByteArray9[1] = 64;
			}
		}
		local202 = local36.method3010();
		@Pc(301) byte[] local301 = local202 <= 0 ? null : new byte[local202 * 2];
		local202 = local36.method3010();
		@Pc(317) byte[] local317 = local202 > 0 ? new byte[local202 * 2] : null;
		@Pc(319) int local319;
		for (local319 = 0; local36.aByteArray49[local36.anInt4061 + local319] != 0; local319++) {
		}
		@Pc(333) byte[] local333 = new byte[local319];
		for (@Pc(335) int local335 = 0; local335 < local319; local335++) {
			local333[local335] = local36.method3009();
		}
		local319++;
		local36.anInt4061++;
		@Pc(360) int local360 = 0;
		for (@Pc(362) int local362 = 0; local362 < 128; local362++) {
			local360 += local36.method3010();
			this.aShortArray14[local362] = (short) local360;
		}
		local360 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local360 += local36.method3010();
			this.aShortArray14[local384] = (short) (this.aShortArray14[local384] + (local360 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local413 < local333.length) {
					local411 = local333[local413++];
				} else {
					local411 = -1;
				}
				local415 = local36.method3012();
			}
			this.aShortArray14[local417] = (short) (this.aShortArray14[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray159[local417] = local415;
			local411--;
		}
		local413 = 0;
		local411 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray159[local474] != 0) {
				if (local411 == 0) {
					if (local53.length > local413) {
						local411 = local53[local413++];
					} else {
						local411 = -1;
					}
					local472 = local36.aByteArray49[local76++] - 1;
				}
				this.aByteArray12[local474] = (byte) local472;
				local411--;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(530) int local530 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray159[local532] != 0) {
				if (local411 == 0) {
					local530 = local36.aByteArray49[local123++] + 16 << 2;
					if (local99.length > local413) {
						local411 = local99[local413++];
					} else {
						local411 = -1;
					}
				}
				local411--;
				this.aByteArray10[local532] = (byte) local530;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(590) Class49 local590 = null;
		for (@Pc(592) int local592 = 0; local592 < 128; local592++) {
			if (this.anIntArray159[local592] != 0) {
				if (local411 == 0) {
					local590 = local234[local171[local413]];
					if (local413 < local149.length) {
						local411 = local149[local413++];
					} else {
						local411 = -1;
					}
				}
				this.aClass49Array1[local592] = local590;
				local411--;
			}
		}
		local411 = 0;
		@Pc(635) int local635 = 0;
		local413 = 0;
		for (@Pc(639) int local639 = 0; local639 < 128; local639++) {
			if (local411 == 0) {
				if (local333.length <= local413) {
					local411 = -1;
				} else {
					local411 = local333[local413++];
				}
				if (this.anIntArray159[local639] > 0) {
					local635 = local36.method3010() + 1;
				}
			}
			this.aByteArray11[local639] = (byte) local635;
			local411--;
		}
		this.anInt1965 = local36.method3010() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local184; local694++) {
			@Pc(700) Class49 local700 = local234[local694];
			if (local700.aByteArray8 != null) {
				for (local705 = 1; local705 < local700.aByteArray8.length; local705 += 2) {
					local700.aByteArray8[local705] = local36.method3009();
				}
			}
			if (local700.aByteArray9 != null) {
				for (local705 = 3; local705 < local700.aByteArray9.length - 2; local705 += 2) {
					local700.aByteArray9[local705] = local36.method3009();
				}
			}
		}
		@Pc(758) int local758;
		if (local301 != null) {
			for (local758 = 1; local758 < local301.length; local758 += 2) {
				local301[local758] = local36.method3009();
			}
		}
		if (local317 != null) {
			for (local758 = 1; local758 < local317.length; local758 += 2) {
				local317[local758] = local36.method3009();
			}
		}
		@Pc(807) int local807;
		for (local758 = 0; local758 < local184; local758++) {
			@Pc(800) Class49 local800 = local234[local758];
			if (local800.aByteArray9 != null) {
				local360 = 0;
				for (local807 = 2; local807 < local800.aByteArray9.length; local807 += 2) {
					local360 = local36.method3010() + local360 + 1;
					local800.aByteArray9[local807] = (byte) local360;
				}
			}
		}
		@Pc(852) int local852;
		for (local705 = 0; local705 < local184; local705++) {
			@Pc(845) Class49 local845 = local234[local705];
			if (local845.aByteArray8 != null) {
				local360 = 0;
				for (local852 = 2; local852 < local845.aByteArray8.length; local852 += 2) {
					local360 -= -local36.method3010() - 1;
					local845.aByteArray8[local852] = (byte) local360;
				}
			}
		}
		@Pc(930) int local930;
		@Pc(957) int local957;
		@Pc(963) byte local963;
		@Pc(977) int local977;
		@Pc(986) int local986;
		@Pc(995) int local995;
		@Pc(928) byte local928;
		@Pc(1039) int local1039;
		if (local301 != null) {
			local360 = local36.method3010();
			local301[0] = (byte) local360;
			for (local807 = 2; local807 < local301.length; local807 += 2) {
				local360 = local360 + local36.method3010() + 1;
				local301[local807] = (byte) local360;
			}
			@Pc(924) byte local924 = local301[1];
			local928 = local301[0];
			for (local930 = 0; local930 < local928; local930++) {
				this.aByteArray11[local930] = (byte) (this.aByteArray11[local930] * local924 + 32 >> 6);
			}
			local957 = 2;
			while (local957 < local301.length) {
				local963 = local301[local957];
				local977 = local924 * (local963 - local928) + (local963 - local928) / 2;
				@Pc(983) byte local983 = local301[local957 + 1];
				local957 += 2;
				for (local986 = local928; local986 < local963; local986++) {
					local995 = Static126.method1854(local963 - local928, local977);
					this.aByteArray11[local986] = (byte) (this.aByteArray11[local986] * local995 + 32 >> 6);
					local977 += local983 - local924;
				}
				local928 = local963;
				local924 = local983;
			}
			for (local1039 = local928; local1039 < 128; local1039++) {
				this.aByteArray11[local1039] = (byte) (local924 * this.aByteArray11[local1039] + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local317 != null) {
			local360 = local36.method3010();
			local317[0] = (byte) local360;
			for (local807 = 2; local807 < local317.length; local807 += 2) {
				local360 = local36.method3010() + local360 + 1;
				local317[local807] = (byte) local360;
			}
			local928 = local317[0];
			local1105 = local317[1] << 1;
			for (local930 = 0; local930 < local928; local930++) {
				local957 = local1105 + (this.aByteArray10[local930] & 0xFF);
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray10[local930] = (byte) local957;
			}
			local957 = 2;
			@Pc(1160) int local1160;
			while (local317.length > local957) {
				local963 = local317[local957];
				local1160 = local317[local957 + 1] << 1;
				local957 += 2;
				local977 = (local963 - local928) * local1105 + (local963 - local928) / 2;
				for (local986 = local928; local986 < local963; local986++) {
					local995 = Static126.method1854(local963 - local928, local977);
					local977 += local1160 - local1105;
					@Pc(1202) int local1202 = (this.aByteArray10[local986] & 0xFF) + local995;
					if (local1202 < 0) {
						local1202 = 0;
					}
					if (local1202 > 128) {
						local1202 = 128;
					}
					this.aByteArray10[local986] = (byte) local1202;
				}
				local928 = local963;
				local1105 = local1160;
			}
			for (local1039 = local928; local1039 < 128; local1039++) {
				local1160 = local1105 + (this.aByteArray10[local1039] & 0xFF);
				if (local1160 < 0) {
					local1160 = 0;
				}
				if (local1160 > 128) {
					local1160 = 128;
				}
				this.aByteArray10[local1039] = (byte) local1160;
			}
		}
		for (local807 = 0; local807 < local184; local807++) {
			local234[local807].anInt1858 = local36.method3010();
		}
		for (local852 = 0; local852 < local184; local852++) {
			@Pc(1295) Class49 local1295 = local234[local852];
			if (local1295.aByteArray8 != null) {
				local1295.anInt1868 = local36.method3010();
			}
			if (local1295.aByteArray9 != null) {
				local1295.anInt1859 = local36.method3010();
			}
			if (local1295.anInt1858 > 0) {
				local1295.anInt1866 = local36.method3010();
			}
		}
		for (local1105 = 0; local1105 < local184; local1105++) {
			local234[local1105].anInt1867 = local36.method3010();
		}
		for (local930 = 0; local930 < local184; local930++) {
			@Pc(1346) Class49 local1346 = local234[local930];
			if (local1346.anInt1867 > 0) {
				local1346.anInt1865 = local36.method3010();
			}
		}
		for (local957 = 0; local957 < local184; local957++) {
			@Pc(1370) Class49 local1370 = local234[local957];
			if (local1370.anInt1865 > 0) {
				local1370.anInt1864 = local36.method3010();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public void method1352() {
		this.anIntArray159 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([ILclient!ra;I[B)Z")
	public boolean method1354(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class1_Sub22_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray159[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method2478(arg0, local30 >> 2);
						} else {
							local16 = arg1.method2477(local30 >> 2, arg0);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub22_Sub1Array1[local18] = local16;
						this.anIntArray159[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
