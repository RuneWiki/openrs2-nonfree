import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!l", name = "r", descriptor = "[B")
	public final byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
	private int[] anIntArray290 = new int[128];

	@OriginalMember(owner = "client!l", name = "w", descriptor = "[B")
	public final byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!l", name = "y", descriptor = "[Lclient!we;")
	public final Class98[] aClass98Array1 = new Class98[128];

	@OriginalMember(owner = "client!l", name = "F", descriptor = "[S")
	public final short[] aShortArray35 = new short[128];

	@OriginalMember(owner = "client!l", name = "G", descriptor = "[Lclient!mg;")
	public final Class1_Sub19_Sub1[] aClass1_Sub19_Sub1Array1 = new Class1_Sub19_Sub1[128];

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public final int anInt2554;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		@Pc(34) Class1_Sub14 local34 = new Class1_Sub14(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray29[local36 + local34.anInt2306] != 0; local36++) {
		}
		@Pc(52) byte[] local52 = new byte[local36];
		for (@Pc(54) int local54 = 0; local54 < local36; local54++) {
			local52[local54] = local34.method1720();
		}
		local36++;
		local34.anInt2306++;
		@Pc(74) int local74 = 0;
		@Pc(77) int local77 = local34.anInt2306;
		local34.anInt2306 += local36;
		while (local34.aByteArray29[local74 + local34.anInt2306] != 0) {
			local74++;
		}
		@Pc(96) byte[] local96 = new byte[local74];
		for (@Pc(98) int local98 = 0; local98 < local74; local98++) {
			local96[local98] = local34.method1720();
		}
		local74++;
		@Pc(112) int local112 = 0;
		local34.anInt2306++;
		@Pc(121) int local121 = local34.anInt2306;
		local34.anInt2306 += local74;
		while (local34.aByteArray29[local34.anInt2306 + local112] != 0) {
			local112++;
		}
		@Pc(143) byte[] local143 = new byte[local112];
		for (@Pc(145) int local145 = 0; local145 < local112; local145++) {
			local143[local145] = local34.method1720();
		}
		local112++;
		@Pc(160) byte[] local160 = new byte[local112];
		local34.anInt2306++;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(187) int local187;
		if (local112 <= 1) {
			local171 = local112;
		} else {
			local171 = 2;
			local160[1] = 1;
			@Pc(180) int local180 = 1;
			for (local182 = 2; local182 < local112; local182++) {
				local187 = local34.method1738();
				if (local187 == 0) {
					local180 = local171++;
				} else {
					if (local180 >= local187) {
						local187--;
					}
					local180 = local187;
				}
				local160[local182] = (byte) local180;
			}
		}
		@Pc(215) Class98[] local215 = new Class98[local171];
		for (local182 = 0; local182 < local215.length; local182++) {
			@Pc(226) Class98 local226 = local215[local182] = new Class98();
			@Pc(230) int local230 = local34.method1738();
			if (local230 > 0) {
				local226.aByteArray52 = new byte[local230 * 2];
			}
			local230 = local34.method1738();
			if (local230 > 0) {
				local226.aByteArray53 = new byte[local230 * 2 + 2];
				local226.aByteArray53[1] = 64;
			}
		}
		local187 = local34.method1738();
		@Pc(282) byte[] local282 = local187 > 0 ? new byte[local187 * 2] : null;
		local187 = local34.method1738();
		@Pc(298) byte[] local298 = local187 <= 0 ? null : new byte[local187 * 2];
		@Pc(300) int local300;
		for (local300 = 0; local34.aByteArray29[local300 + local34.anInt2306] != 0; local300++) {
		}
		@Pc(316) byte[] local316 = new byte[local300];
		for (@Pc(318) int local318 = 0; local318 < local300; local318++) {
			local316[local318] = local34.method1720();
		}
		@Pc(331) int local331 = 0;
		local300++;
		local34.anInt2306++;
		for (@Pc(340) int local340 = 0; local340 < 128; local340++) {
			local331 += local34.method1738();
			this.aShortArray35[local340] = (short) local331;
		}
		local331 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local331 += local34.method1738();
			this.aShortArray35[local361] = (short) (this.aShortArray35[local361] + (local331 << 8));
		}
		@Pc(385) int local385 = 0;
		@Pc(387) int local387 = 0;
		@Pc(389) int local389 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			if (local385 == 0) {
				if (local316.length <= local387) {
					local385 = -1;
				} else {
					local385 = local316[local387++];
				}
				local389 = local34.method1701();
			}
			this.aShortArray35[local391] = (short) (this.aShortArray35[local391] + ((local389 - 1 & 0x2) << 14));
			this.anIntArray290[local391] = local389;
			local385--;
		}
		local387 = 0;
		local385 = 0;
		@Pc(441) int local441 = 0;
		for (@Pc(443) int local443 = 0; local443 < 128; local443++) {
			if (this.anIntArray290[local443] != 0) {
				if (local385 == 0) {
					local441 = local34.aByteArray29[local77++] - 1;
					if (local52.length <= local387) {
						local385 = -1;
					} else {
						local385 = local52[local387++];
					}
				}
				this.aByteArray31[local443] = (byte) local441;
				local385--;
			}
		}
		local387 = 0;
		@Pc(493) int local493 = 0;
		local385 = 0;
		for (@Pc(497) int local497 = 0; local497 < 128; local497++) {
			if (this.anIntArray290[local497] != 0) {
				if (local385 == 0) {
					local493 = local34.aByteArray29[local121++] + 16 << 2;
					if (local96.length <= local387) {
						local385 = -1;
					} else {
						local385 = local96[local387++];
					}
				}
				this.aByteArray30[local497] = (byte) local493;
				local385--;
			}
		}
		local385 = 0;
		local387 = 0;
		@Pc(546) Class98 local546 = null;
		for (@Pc(548) int local548 = 0; local548 < 128; local548++) {
			if (this.anIntArray290[local548] != 0) {
				if (local385 == 0) {
					local546 = local215[local160[local387]];
					if (local387 < local143.length) {
						local385 = local143[local387++];
					} else {
						local385 = -1;
					}
				}
				this.aClass98Array1[local548] = local546;
				local385--;
			}
		}
		local387 = 0;
		local385 = 0;
		@Pc(599) int local599 = 0;
		for (@Pc(601) int local601 = 0; local601 < 128; local601++) {
			if (local385 == 0) {
				if (local316.length > local387) {
					local385 = local316[local387++];
				} else {
					local385 = -1;
				}
				if (this.anIntArray290[local601] > 0) {
					local599 = local34.method1738() + 1;
				}
			}
			local385--;
			this.aByteArray32[local601] = (byte) local599;
		}
		this.anInt2554 = local34.method1738() + 1;
		@Pc(657) int local657;
		for (@Pc(647) int local647 = 0; local647 < local171; local647++) {
			@Pc(652) Class98 local652 = local215[local647];
			if (local652.aByteArray52 != null) {
				for (local657 = 1; local657 < local652.aByteArray52.length; local657 += 2) {
					local652.aByteArray52[local657] = local34.method1720();
				}
			}
			if (local652.aByteArray53 != null) {
				for (local657 = 3; local657 < local652.aByteArray53.length - 2; local657 += 2) {
					local652.aByteArray53[local657] = local34.method1720();
				}
			}
		}
		@Pc(708) int local708;
		if (local282 != null) {
			for (local708 = 1; local708 < local282.length; local708 += 2) {
				local282[local708] = local34.method1720();
			}
		}
		if (local298 != null) {
			for (local708 = 1; local708 < local298.length; local708 += 2) {
				local298[local708] = local34.method1720();
			}
		}
		@Pc(758) int local758;
		for (local708 = 0; local708 < local171; local708++) {
			@Pc(751) Class98 local751 = local215[local708];
			if (local751.aByteArray53 != null) {
				local331 = 0;
				for (local758 = 2; local758 < local751.aByteArray53.length; local758 += 2) {
					local331 -= -local34.method1738() - 1;
					local751.aByteArray53[local758] = (byte) local331;
				}
			}
		}
		@Pc(801) int local801;
		for (local657 = 0; local657 < local171; local657++) {
			@Pc(794) Class98 local794 = local215[local657];
			if (local794.aByteArray52 != null) {
				local331 = 0;
				for (local801 = 2; local801 < local794.aByteArray52.length; local801 += 2) {
					local331 = local331 + local34.method1738() + 1;
					local794.aByteArray52[local801] = (byte) local331;
				}
			}
		}
		@Pc(877) int local877;
		@Pc(903) int local903;
		@Pc(908) byte local908;
		@Pc(922) int local922;
		@Pc(930) int local930;
		@Pc(939) int local939;
		@Pc(875) byte local875;
		@Pc(981) int local981;
		if (local282 != null) {
			local331 = local34.method1738();
			local282[0] = (byte) local331;
			for (local758 = 2; local758 < local282.length; local758 += 2) {
				local331 = local34.method1738() + local331 + 1;
				local282[local758] = (byte) local331;
			}
			@Pc(871) byte local871 = local282[1];
			local875 = local282[0];
			for (local877 = 0; local877 < local875; local877++) {
				this.aByteArray32[local877] = (byte) (this.aByteArray32[local877] * local871 + 32 >> 6);
			}
			local903 = 2;
			while (local903 < local282.length) {
				local908 = local282[local903];
				local922 = (local908 - local875) / 2 + (local908 - local875) * local871;
				@Pc(928) byte local928 = local282[local903 + 1];
				for (local930 = local875; local930 < local908; local930++) {
					local939 = Static87.method1467(local908 - local875, local922);
					local922 += local928 - local871;
					this.aByteArray32[local930] = (byte) (this.aByteArray32[local930] * local939 + 32 >> 6);
				}
				local871 = local928;
				local903 += 2;
				local875 = local908;
			}
			for (local981 = local875; local981 < 128; local981++) {
				this.aByteArray32[local981] = (byte) (local871 * this.aByteArray32[local981] + 32 >> 6);
			}
		}
		@Pc(1049) int local1049;
		if (local298 != null) {
			local331 = local34.method1738();
			local298[0] = (byte) local331;
			for (local758 = 2; local758 < local298.length; local758 += 2) {
				local331 = local34.method1738() + local331 + 1;
				local298[local758] = (byte) local331;
			}
			local875 = local298[0];
			local1049 = local298[1] << 1;
			for (local877 = 0; local877 < local875; local877++) {
				local903 = (this.aByteArray30[local877] & 0xFF) + local1049;
				if (local903 < 0) {
					local903 = 0;
				}
				if (local903 > 128) {
					local903 = 128;
				}
				this.aByteArray30[local877] = (byte) local903;
			}
			local903 = 2;
			@Pc(1096) int local1096;
			while (local298.length > local903) {
				local1096 = local298[local903 + 1] << 1;
				local908 = local298[local903];
				local903 += 2;
				local922 = (local908 - local875) * local1049 + (local908 - local875) / 2;
				for (local930 = local875; local930 < local908; local930++) {
					local939 = Static87.method1467(local908 - local875, local922);
					local922 += local1096 - local1049;
					@Pc(1141) int local1141 = local939 + (this.aByteArray30[local930] & 0xFF);
					if (local1141 < 0) {
						local1141 = 0;
					}
					if (local1141 > 128) {
						local1141 = 128;
					}
					this.aByteArray30[local930] = (byte) local1141;
				}
				local875 = local908;
				local1049 = local1096;
			}
			for (local981 = local875; local981 < 128; local981++) {
				local1096 = local1049 + (this.aByteArray30[local981] & 0xFF);
				if (local1096 < 0) {
					local1096 = 0;
				}
				if (local1096 > 128) {
					local1096 = 128;
				}
				this.aByteArray30[local981] = (byte) local1096;
			}
		}
		for (local758 = 0; local758 < local171; local758++) {
			local215[local758].anInt4391 = local34.method1738();
		}
		for (local801 = 0; local801 < local171; local801++) {
			@Pc(1235) Class98 local1235 = local215[local801];
			if (local1235.aByteArray52 != null) {
				local1235.anInt4388 = local34.method1738();
			}
			if (local1235.aByteArray53 != null) {
				local1235.anInt4396 = local34.method1738();
			}
			if (local1235.anInt4391 > 0) {
				local1235.anInt4392 = local34.method1738();
			}
		}
		for (local1049 = 0; local1049 < local171; local1049++) {
			local215[local1049].anInt4394 = local34.method1738();
		}
		for (local877 = 0; local877 < local171; local877++) {
			@Pc(1292) Class98 local1292 = local215[local877];
			if (local1292.anInt4394 > 0) {
				local1292.anInt4397 = local34.method1738();
			}
		}
		for (local903 = 0; local903 < local171; local903++) {
			@Pc(1314) Class98 local1314 = local215[local903];
			if (local1314.anInt4397 > 0) {
				local1314.anInt4393 = local34.method1738();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I[BLclient!kh;I)Z")
	public boolean method1922(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class50 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(13) int local13 = 0;
		@Pc(15) Class1_Sub19_Sub1 local15 = null;
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			if (arg1 == null || arg1[local17] != 0) {
				@Pc(29) int local29 = this.anIntArray290[local17];
				if (local29 != 0) {
					if (local13 != local29) {
						local13 = local29--;
						if ((local29 & 0x1) == 0) {
							local15 = arg2.method1894(arg0, local29 >> 2);
						} else {
							local15 = arg2.method1899(local29 >> 2, arg0);
						}
						if (local15 == null) {
							local7 = false;
						}
					}
					if (local15 != null) {
						this.aClass1_Sub19_Sub1Array1[local17] = local15;
						this.anIntArray290[local17] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public void method1924() {
		this.anIntArray290 = null;
	}
}
