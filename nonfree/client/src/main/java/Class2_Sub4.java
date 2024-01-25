import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!at", name = "n", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "[Lclient!uo;")
	public Class2_Sub41_Sub1[] aClass2_Sub41_Sub1Array1;

	@OriginalMember(owner = "client!at", name = "C", descriptor = "[Lclient!ic;")
	public Class116[] aClass116Array1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	private Class2_Sub4() {
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub41_Sub1Array1 = new Class2_Sub41_Sub1[128];
		this.aShortArray2 = new short[128];
		this.aByteArray11 = new byte[128];
		this.anIntArray28 = new int[128];
		this.aByteArray12 = new byte[128];
		this.aClass116Array1 = new Class116[128];
		this.aByteArray10 = new byte[128];
		@Pc(36) Class2_Sub20 local36 = new Class2_Sub20(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray136[local36.anInt4608 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method3693();
		}
		local38++;
		local36.anInt4608++;
		@Pc(80) int local80 = local36.anInt4608;
		local36.anInt4608 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray136[local36.anInt4608 + local88] != 0; local88++) {
		}
		@Pc(103) byte[] local103 = new byte[local88];
		for (@Pc(105) int local105 = 0; local105 < local88; local105++) {
			local103[local105] = local36.method3693();
		}
		local36.anInt4608++;
		local88++;
		@Pc(131) int local131 = local36.anInt4608;
		local36.anInt4608 += local88;
		@Pc(139) int local139;
		for (local139 = 0; local36.aByteArray136[local36.anInt4608 + local139] != 0; local139++) {
		}
		@Pc(153) byte[] local153 = new byte[local139];
		for (@Pc(155) int local155 = 0; local155 < local139; local155++) {
			local153[local155] = local36.method3693();
		}
		local139++;
		local36.anInt4608++;
		@Pc(181) byte[] local181 = new byte[local139];
		@Pc(192) int local192;
		@Pc(196) int local196;
		@Pc(202) int local202;
		if (local139 > 1) {
			local181[1] = 1;
			local192 = 2;
			@Pc(194) int local194 = 1;
			for (local196 = 2; local196 < local139; local196++) {
				local202 = local36.method3737();
				if (local202 == 0) {
					local194 = local192++;
				} else {
					if (local202 <= local194) {
						local202--;
					}
					local194 = local202;
				}
				local181[local196] = (byte) local194;
			}
		} else {
			local192 = local139;
		}
		@Pc(238) Class116[] local238 = new Class116[local192];
		for (local196 = 0; local196 < local238.length; local196++) {
			@Pc(250) Class116 local250 = local238[local196] = new Class116();
			@Pc(254) int local254 = local36.method3737();
			if (local254 > 0) {
				local250.aByteArray99 = new byte[local254 * 2];
			}
			local254 = local36.method3737();
			if (local254 > 0) {
				local250.aByteArray100 = new byte[local254 * 2 + 2];
				local250.aByteArray100[1] = 64;
			}
		}
		local202 = local36.method3737();
		@Pc(305) byte[] local305 = local202 > 0 ? new byte[local202 * 2] : null;
		local202 = local36.method3737();
		@Pc(321) byte[] local321 = local202 > 0 ? new byte[local202 * 2] : null;
		@Pc(323) int local323;
		for (local323 = 0; local36.aByteArray136[local36.anInt4608 + local323] != 0; local323++) {
		}
		@Pc(341) byte[] local341 = new byte[local323];
		for (@Pc(343) int local343 = 0; local343 < local323; local343++) {
			local341[local343] = local36.method3693();
		}
		local323++;
		local36.anInt4608++;
		@Pc(368) int local368 = 0;
		for (@Pc(370) int local370 = 0; local370 < 128; local370++) {
			local368 += local36.method3737();
			this.aShortArray2[local370] = (short) local368;
		}
		local368 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local368 += local36.method3737();
			this.aShortArray2[local392] = (short) (this.aShortArray2[local392] + (local368 << 8));
		}
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		for (@Pc(425) int local425 = 0; local425 < 128; local425++) {
			if (local419 == 0) {
				if (local421 < local341.length) {
					local419 = local341[local421++];
				} else {
					local419 = -1;
				}
				local423 = local36.method3691();
			}
			this.aShortArray2[local425] = (short) (this.aShortArray2[local425] + ((local423 - 1 & 0x2) << 14));
			this.anIntArray28[local425] = local423;
			local419--;
		}
		local419 = 0;
		local421 = 0;
		@Pc(479) int local479 = 0;
		for (@Pc(481) int local481 = 0; local481 < 128; local481++) {
			if (this.anIntArray28[local481] != 0) {
				if (local419 == 0) {
					local479 = local36.aByteArray136[local80++] - 1;
					if (local421 >= local52.length) {
						local419 = -1;
					} else {
						local419 = local52[local421++];
					}
				}
				local419--;
				this.aByteArray10[local481] = (byte) local479;
			}
		}
		local421 = 0;
		local419 = 0;
		@Pc(531) int local531 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray28[local533] != 0) {
				if (local419 == 0) {
					if (local421 < local103.length) {
						local419 = local103[local421++];
					} else {
						local419 = -1;
					}
					local531 = local36.aByteArray136[local131++] + 16 << 2;
				}
				local419--;
				this.aByteArray12[local533] = (byte) local531;
			}
		}
		local419 = 0;
		local421 = 0;
		@Pc(582) Class116 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray28[local584] != 0) {
				if (local419 == 0) {
					local582 = local238[local181[local421]];
					if (local421 < local153.length) {
						local419 = local153[local421++];
					} else {
						local419 = -1;
					}
				}
				this.aClass116Array1[local584] = local582;
				local419--;
			}
		}
		local421 = 0;
		local419 = 0;
		@Pc(632) int local632 = 0;
		for (@Pc(634) int local634 = 0; local634 < 128; local634++) {
			if (local419 == 0) {
				if (local421 >= local341.length) {
					local419 = -1;
				} else {
					local419 = local341[local421++];
				}
				if (this.anIntArray28[local634] > 0) {
					local632 = local36.method3737() + 1;
				}
			}
			this.aByteArray11[local634] = (byte) local632;
			local419--;
		}
		this.anInt418 = local36.method3737() + 1;
		@Pc(700) int local700;
		for (@Pc(689) int local689 = 0; local689 < local192; local689++) {
			@Pc(695) Class116 local695 = local238[local689];
			if (local695.aByteArray99 != null) {
				for (local700 = 1; local700 < local695.aByteArray99.length; local700 += 2) {
					local695.aByteArray99[local700] = local36.method3693();
				}
			}
			if (local695.aByteArray100 != null) {
				for (local700 = 3; local700 < local695.aByteArray100.length - 2; local700 += 2) {
					local695.aByteArray100[local700] = local36.method3693();
				}
			}
		}
		@Pc(757) int local757;
		if (local305 != null) {
			for (local757 = 1; local757 < local305.length; local757 += 2) {
				local305[local757] = local36.method3693();
			}
		}
		if (local321 != null) {
			for (local757 = 1; local757 < local321.length; local757 += 2) {
				local321[local757] = local36.method3693();
			}
		}
		@Pc(810) int local810;
		for (local757 = 0; local757 < local192; local757++) {
			@Pc(803) Class116 local803 = local238[local757];
			if (local803.aByteArray100 != null) {
				local368 = 0;
				for (local810 = 2; local810 < local803.aByteArray100.length; local810 += 2) {
					local368 = local368 + local36.method3737() + 1;
					local803.aByteArray100[local810] = (byte) local368;
				}
			}
		}
		@Pc(851) int local851;
		for (local700 = 0; local700 < local192; local700++) {
			@Pc(844) Class116 local844 = local238[local700];
			if (local844.aByteArray99 != null) {
				local368 = 0;
				for (local851 = 2; local851 < local844.aByteArray99.length; local851 += 2) {
					local368 += local36.method3737() + 1;
					local844.aByteArray99[local851] = (byte) local368;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(976) int local976;
		@Pc(978) int local978;
		@Pc(987) int local987;
		@Pc(916) byte local916;
		@Pc(1028) int local1028;
		if (local305 != null) {
			local368 = local36.method3737();
			local305[0] = (byte) local368;
			for (local810 = 2; local810 < local305.length; local810 += 2) {
				local368 = local368 + local36.method3737() + 1;
				local305[local810] = (byte) local368;
			}
			local916 = local305[0];
			@Pc(920) byte local920 = local305[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray11[local922] = (byte) (this.aByteArray11[local922] * local920 + 32 >> 6);
			}
			local949 = 2;
			while (local305.length > local949) {
				local955 = local305[local949];
				@Pc(961) byte local961 = local305[local949 + 1];
				local976 = local920 * (local955 - local916) + (local955 - local916) / 2;
				for (local978 = local916; local978 < local955; local978++) {
					local987 = Static299.method4341(local976, local955 - local916);
					this.aByteArray11[local978] = (byte) (local987 * this.aByteArray11[local978] + 32 >> 6);
					local976 += local961 - local920;
				}
				local949 += 2;
				local916 = local955;
				local920 = local961;
			}
			for (local1028 = local916; local1028 < 128; local1028++) {
				this.aByteArray11[local1028] = (byte) (this.aByteArray11[local1028] * local920 + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local321 != null) {
			local368 = local36.method3737();
			local321[0] = (byte) local368;
			for (local810 = 2; local810 < local321.length; local810 += 2) {
				local368 = local368 + local36.method3737() + 1;
				local321[local810] = (byte) local368;
			}
			local916 = local321[0];
			local1098 = local321[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local949 = local1098 + (this.aByteArray12[local922] & 0xFF);
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray12[local922] = (byte) local949;
			}
			local949 = 2;
			@Pc(1152) int local1152;
			while (local321.length > local949) {
				local955 = local321[local949];
				local1152 = local321[local949 + 1] << 1;
				local976 = (local955 - local916) / 2 + local1098 * (local955 - local916);
				for (local978 = local916; local978 < local955; local978++) {
					local987 = Static299.method4341(local976, local955 - local916);
					@Pc(1187) int local1187 = (this.aByteArray12[local978] & 0xFF) + local987;
					if (local1187 < 0) {
						local1187 = 0;
					}
					if (local1187 > 128) {
						local1187 = 128;
					}
					this.aByteArray12[local978] = (byte) local1187;
					local976 += local1152 - local1098;
				}
				local949 += 2;
				local1098 = local1152;
				local916 = local955;
			}
			for (local1028 = local916; local1028 < 128; local1028++) {
				local1152 = local1098 + (this.aByteArray12[local1028] & 0xFF);
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray12[local1028] = (byte) local1152;
			}
		}
		for (local810 = 0; local810 < local192; local810++) {
			local238[local810].anInt3225 = local36.method3737();
		}
		for (local851 = 0; local851 < local192; local851++) {
			@Pc(1293) Class116 local1293 = local238[local851];
			if (local1293.aByteArray99 != null) {
				local1293.anInt3231 = local36.method3737();
			}
			if (local1293.aByteArray100 != null) {
				local1293.anInt3223 = local36.method3737();
			}
			if (local1293.anInt3225 > 0) {
				local1293.anInt3230 = local36.method3737();
			}
		}
		for (local1098 = 0; local1098 < local192; local1098++) {
			local238[local1098].anInt3226 = local36.method3737();
		}
		for (local922 = 0; local922 < local192; local922++) {
			@Pc(1352) Class116 local1352 = local238[local922];
			if (local1352.anInt3226 > 0) {
				local1352.anInt3228 = local36.method3737();
			}
		}
		for (local949 = 0; local949 < local192; local949++) {
			@Pc(1376) Class116 local1376 = local238[local949];
			if (local1376.anInt3228 > 0) {
				local1376.anInt3229 = local36.method3737();
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public void method263() {
		this.anIntArray28 = null;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([B[ILclient!tf;Z)Z")
	public boolean method266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class229 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub41_Sub1 local11 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(31) int local31 = this.anIntArray28[local19];
				if (local31 != 0) {
					if (local31 != local9) {
						local9 = local31--;
						if ((local31 & 0x1) == 0) {
							local11 = arg2.method5267(local31 >> 2, arg1);
						} else {
							local11 = arg2.method5263(local31 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub41_Sub1Array1[local19] = local11;
						this.anIntArray28[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
