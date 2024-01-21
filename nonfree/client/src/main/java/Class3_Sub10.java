import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[S")
	public final short[] aShortArray4;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lclient!r;")
	public final Class3_Sub4_Sub1[] aClass3_Sub4_Sub1Array1 = new Class3_Sub4_Sub1[128];

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	public final int anInt1542;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "[Lclient!hc;")
	public final Class32[] aClass32Array1;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
	private int[] anIntArray107 = new int[128];

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
	public final byte[] aByteArray16 = new byte[128];

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "[B")
	public final byte[] aByteArray17 = new byte[128];

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub10(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aByteArray18 = new byte[128];
		this.aShortArray4 = new short[128];
		this.aClass32Array1 = new Class32[128];
		@Pc(38) Class3_Sub2 local38 = new Class3_Sub2(arg0);
		while (local38.aByteArray7[local38.anInt413 + local21] != 0) {
			local21++;
		}
		@Pc(52) byte[] local52 = new byte[local21];
		for (@Pc(54) int local54 = 0; local54 < local21; local54++) {
			local52[local54] = local38.method265();
		}
		local21++;
		@Pc(69) int local69 = 0;
		local38.anInt413++;
		@Pc(78) int local78 = local38.anInt413;
		local38.anInt413 += local21;
		while (local38.aByteArray7[local69 + local38.anInt413] != 0) {
			local69++;
		}
		@Pc(98) byte[] local98 = new byte[local69];
		for (@Pc(100) int local100 = 0; local100 < local69; local100++) {
			local98[local100] = local38.method265();
		}
		local69++;
		local38.anInt413++;
		@Pc(122) int local122 = local38.anInt413;
		local38.anInt413 += local69;
		@Pc(130) int local130;
		for (local130 = 0; local38.aByteArray7[local38.anInt413 + local130] != 0; local130++) {
		}
		@Pc(147) byte[] local147 = new byte[local130];
		for (@Pc(149) int local149 = 0; local149 < local130; local149++) {
			local147[local149] = local38.method265();
		}
		local130++;
		local38.anInt413++;
		@Pc(171) byte[] local171 = new byte[local130];
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(190) int local190;
		if (local130 > 1) {
			local171[1] = 1;
			local180 = 2;
			@Pc(182) int local182 = 1;
			for (local184 = 2; local184 < local130; local184++) {
				local190 = local38.method270();
				if (local190 == 0) {
					local182 = local180++;
				} else {
					if (local190 <= local182) {
						local190--;
					}
					local182 = local190;
				}
				local171[local184] = (byte) local182;
			}
		} else {
			local180 = local130;
		}
		@Pc(230) Class32[] local230 = new Class32[local180];
		for (local184 = 0; local184 < local230.length; local184++) {
			@Pc(242) Class32 local242 = local230[local184] = new Class32();
			@Pc(246) int local246 = local38.method270();
			if (local246 > 0) {
				local242.aByteArray12 = new byte[local246 * 2];
			}
			local246 = local38.method270();
			if (local246 > 0) {
				local242.aByteArray13 = new byte[local246 * 2 + 2];
				local242.aByteArray13[1] = 64;
			}
		}
		local190 = local38.method270();
		@Pc(294) byte[] local294 = local190 > 0 ? new byte[local190 * 2] : null;
		local190 = local38.method270();
		@Pc(300) int local300 = 0;
		@Pc(312) byte[] local312 = local190 <= 0 ? null : new byte[local190 * 2];
		while (local38.aByteArray7[local300 + local38.anInt413] != 0) {
			local300++;
		}
		@Pc(326) byte[] local326 = new byte[local300];
		for (@Pc(328) int local328 = 0; local328 < local300; local328++) {
			local326[local328] = local38.method265();
		}
		@Pc(342) int local342 = 0;
		local38.anInt413++;
		local300++;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local342 += local38.method270();
			this.aShortArray4[local351] = (short) local342;
		}
		local342 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local342 += local38.method270();
			this.aShortArray4[local373] = (short) (this.aShortArray4[local373] + (local342 << 8));
		}
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		for (@Pc(406) int local406 = 0; local406 < 128; local406++) {
			if (local400 == 0) {
				if (local402 >= local326.length) {
					local400 = -1;
				} else {
					local400 = local326[local402++];
				}
				local404 = local38.method291();
			}
			local400--;
			this.aShortArray4[local406] = (short) (this.aShortArray4[local406] + ((local404 - 1 & 0x2) << 14));
			this.anIntArray107[local406] = local404;
		}
		local400 = 0;
		local402 = 0;
		@Pc(465) int local465 = 0;
		for (@Pc(467) int local467 = 0; local467 < 128; local467++) {
			if (this.anIntArray107[local467] != 0) {
				if (local400 == 0) {
					if (local52.length <= local402) {
						local400 = -1;
					} else {
						local400 = local52[local402++];
					}
					local465 = local38.aByteArray7[local78++] - 1;
				}
				local400--;
				this.aByteArray16[local467] = (byte) local465;
			}
		}
		local402 = 0;
		local400 = 0;
		@Pc(517) int local517 = 0;
		for (@Pc(519) int local519 = 0; local519 < 128; local519++) {
			if (this.anIntArray107[local519] != 0) {
				if (local400 == 0) {
					if (local402 >= local98.length) {
						local400 = -1;
					} else {
						local400 = local98[local402++];
					}
					local517 = local38.aByteArray7[local122++] + 16 << 2;
				}
				this.aByteArray18[local519] = (byte) local517;
				local400--;
			}
		}
		local400 = 0;
		local402 = 0;
		@Pc(573) Class32 local573 = null;
		for (@Pc(575) int local575 = 0; local575 < 128; local575++) {
			if (this.anIntArray107[local575] != 0) {
				if (local400 == 0) {
					local573 = local230[local171[local402]];
					if (local402 < local147.length) {
						local400 = local147[local402++];
					} else {
						local400 = -1;
					}
				}
				local400--;
				this.aClass32Array1[local575] = local573;
			}
		}
		local400 = 0;
		@Pc(623) int local623 = 0;
		local402 = 0;
		for (@Pc(627) int local627 = 0; local627 < 128; local627++) {
			if (local400 == 0) {
				if (local402 >= local326.length) {
					local400 = -1;
				} else {
					local400 = local326[local402++];
				}
				if (this.anIntArray107[local627] > 0) {
					local623 = local38.method270() + 1;
				}
			}
			this.aByteArray17[local627] = (byte) local623;
			local400--;
		}
		this.anInt1542 = local38.method270() + 1;
		@Pc(691) int local691;
		for (@Pc(680) int local680 = 0; local680 < local180; local680++) {
			@Pc(686) Class32 local686 = local230[local680];
			if (local686.aByteArray12 != null) {
				for (local691 = 1; local691 < local686.aByteArray12.length; local691 += 2) {
					local686.aByteArray12[local691] = local38.method265();
				}
			}
			if (local686.aByteArray13 != null) {
				for (local691 = 3; local691 < local686.aByteArray13.length - 2; local691 += 2) {
					local686.aByteArray13[local691] = local38.method265();
				}
			}
		}
		@Pc(740) int local740;
		if (local294 != null) {
			for (local740 = 1; local740 < local294.length; local740 += 2) {
				local294[local740] = local38.method265();
			}
		}
		if (local312 != null) {
			for (local740 = 1; local740 < local312.length; local740 += 2) {
				local312[local740] = local38.method265();
			}
		}
		@Pc(789) int local789;
		for (local740 = 0; local740 < local180; local740++) {
			@Pc(782) Class32 local782 = local230[local740];
			if (local782.aByteArray13 != null) {
				local342 = 0;
				for (local789 = 2; local789 < local782.aByteArray13.length; local789 += 2) {
					local342 = local342 + local38.method270() + 1;
					local782.aByteArray13[local789] = (byte) local342;
				}
			}
		}
		@Pc(838) int local838;
		for (local691 = 0; local691 < local180; local691++) {
			@Pc(831) Class32 local831 = local230[local691];
			if (local831.aByteArray12 != null) {
				local342 = 0;
				for (local838 = 2; local838 < local831.aByteArray12.length; local838 += 2) {
					local342 += local38.method270() + 1;
					local831.aByteArray12[local838] = (byte) local342;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(938) int local938;
		@Pc(950) byte local950;
		@Pc(966) int local966;
		@Pc(968) int local968;
		@Pc(977) int local977;
		@Pc(913) byte local913;
		@Pc(1023) int local1023;
		if (local294 != null) {
			local342 = local38.method270();
			local294[0] = (byte) local342;
			for (local789 = 2; local789 < local294.length; local789 += 2) {
				local342 += local38.method270() + 1;
				local294[local789] = (byte) local342;
			}
			@Pc(909) byte local909 = local294[1];
			local913 = local294[0];
			for (local915 = 0; local915 < local913; local915++) {
				this.aByteArray17[local915] = (byte) (this.aByteArray17[local915] * local909 + 32 >> 6);
			}
			local938 = 2;
			while (local938 < local294.length) {
				@Pc(946) byte local946 = local294[local938 + 1];
				local950 = local294[local938];
				local938 += 2;
				local966 = local909 * (local950 - local913) + (local950 - local913) / 2;
				for (local968 = local913; local968 < local950; local968++) {
					local977 = Static109.method1142(local966, local950 - local913);
					local966 += local946 - local909;
					this.aByteArray17[local968] = (byte) (this.aByteArray17[local968] * local977 + 32 >> 6);
				}
				local909 = local946;
				local913 = local950;
			}
			for (local1023 = local913; local1023 < 128; local1023++) {
				this.aByteArray17[local1023] = (byte) (local909 * this.aByteArray17[local1023] + 32 >> 6);
			}
		}
		@Pc(1084) int local1084;
		if (local312 != null) {
			local342 = local38.method270();
			local312[0] = (byte) local342;
			for (local789 = 2; local789 < local312.length; local789 += 2) {
				local342 -= -local38.method270() - 1;
				local312[local789] = (byte) local342;
			}
			local1084 = local312[1] << 1;
			local913 = local312[0];
			for (local915 = 0; local915 < local913; local915++) {
				local938 = (this.aByteArray18[local915] & 0xFF) + local1084;
				if (local938 < 0) {
					local938 = 0;
				}
				if (local938 > 128) {
					local938 = 128;
				}
				this.aByteArray18[local915] = (byte) local938;
			}
			local938 = 2;
			@Pc(1137) int local1137;
			while (local312.length > local938) {
				local1137 = local312[local938 + 1] << 1;
				local950 = local312[local938];
				local966 = (local950 - local913) * local1084 + (local950 - local913) / 2;
				local938 += 2;
				for (local968 = local913; local968 < local950; local968++) {
					local977 = Static109.method1142(local966, local950 - local913);
					@Pc(1178) int local1178 = (this.aByteArray18[local968] & 0xFF) + local977;
					if (local1178 < 0) {
						local1178 = 0;
					}
					if (local1178 > 128) {
						local1178 = 128;
					}
					local966 += local1137 - local1084;
					this.aByteArray18[local968] = (byte) local1178;
				}
				local1084 = local1137;
				local913 = local950;
			}
			for (local1023 = local913; local1023 < 128; local1023++) {
				local1137 = (this.aByteArray18[local1023] & 0xFF) + local1084;
				if (local1137 < 0) {
					local1137 = 0;
				}
				if (local1137 > 128) {
					local1137 = 128;
				}
				this.aByteArray18[local1023] = (byte) local1137;
			}
		}
		for (local789 = 0; local789 < local180; local789++) {
			local230[local789].anInt1157 = local38.method270();
		}
		for (local838 = 0; local838 < local180; local838++) {
			@Pc(1275) Class32 local1275 = local230[local838];
			if (local1275.aByteArray12 != null) {
				local1275.anInt1153 = local38.method270();
			}
			if (local1275.aByteArray13 != null) {
				local1275.anInt1152 = local38.method270();
			}
			if (local1275.anInt1157 > 0) {
				local1275.anInt1161 = local38.method270();
			}
		}
		for (local1084 = 0; local1084 < local180; local1084++) {
			local230[local1084].anInt1159 = local38.method270();
		}
		for (local915 = 0; local915 < local180; local915++) {
			@Pc(1329) Class32 local1329 = local230[local915];
			if (local1329.anInt1159 > 0) {
				local1329.anInt1151 = local38.method270();
			}
		}
		for (local938 = 0; local938 < local180; local938++) {
			@Pc(1356) Class32 local1356 = local230[local938];
			if (local1356.anInt1151 > 0) {
				local1356.anInt1155 = local38.method270();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public void method1010() {
		this.anIntArray107 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[BLclient!va;[I)Z")
	public boolean method1011(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class3_Sub4_Sub1 local9 = null;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray107[local19];
				if (local34 != 0) {
					if (local34 != local17) {
						local17 = local34--;
						if ((local34 & 0x1) == 0) {
							local9 = arg1.method1928(local34 >> 2, arg2);
						} else {
							local9 = arg1.method1927(local34 >> 2, arg2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass3_Sub4_Sub1Array1[local19] = local9;
						this.anIntArray107[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
