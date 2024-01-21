import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!td", name = "x", descriptor = "[I")
	private int[] anIntArray444 = new int[128];

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[Lclient!la;")
	public final Class47[] aClass47Array1 = new Class47[128];

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[Lclient!pa;")
	public final Class1_Sub14_Sub1[] aClass1_Sub14_Sub1Array1 = new Class1_Sub14_Sub1[128];

	@OriginalMember(owner = "client!td", name = "F", descriptor = "[S")
	public final short[] aShortArray13 = new short[128];

	@OriginalMember(owner = "client!td", name = "L", descriptor = "[B")
	public final byte[] aByteArray29 = new byte[128];

	@OriginalMember(owner = "client!td", name = "M", descriptor = "I")
	public final int anInt2639;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "[B")
	public final byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[B")
	public final byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class1_Sub5 local38 = new Class1_Sub5(arg0);
		while (local38.aByteArray13[local38.anInt792 + local33] != 0) {
			local33++;
		}
		@Pc(53) byte[] local53 = new byte[local33];
		for (@Pc(55) int local55 = 0; local55 < local33; local55++) {
			local53[local55] = local38.method643();
		}
		local38.anInt792++;
		local33++;
		@Pc(77) int local77 = local38.anInt792;
		local38.anInt792 += local33;
		@Pc(85) int local85;
		for (local85 = 0; local38.aByteArray13[local38.anInt792 + local85] != 0; local85++) {
		}
		@Pc(99) byte[] local99 = new byte[local85];
		for (@Pc(101) int local101 = 0; local101 < local85; local101++) {
			local99[local101] = local38.method643();
		}
		local38.anInt792++;
		@Pc(122) int local122 = local38.anInt792;
		local85++;
		local38.anInt792 += local85;
		@Pc(131) int local131;
		for (local131 = 0; local38.aByteArray13[local38.anInt792 + local131] != 0; local131++) {
		}
		@Pc(145) byte[] local145 = new byte[local131];
		for (@Pc(147) int local147 = 0; local147 < local131; local147++) {
			local145[local147] = local38.method643();
		}
		local131++;
		local38.anInt792++;
		@Pc(173) byte[] local173 = new byte[local131];
		@Pc(180) int local180;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local131 <= 1) {
			local180 = local131;
		} else {
			local180 = 2;
			local173[1] = 1;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local131; local192++) {
				local198 = local38.method672();
				if (local198 == 0) {
					local190 = local180++;
				} else {
					if (local198 <= local190) {
						local198--;
					}
					local190 = local198;
				}
				local173[local192] = (byte) local190;
			}
		}
		@Pc(230) Class47[] local230 = new Class47[local180];
		for (local192 = 0; local192 < local230.length; local192++) {
			@Pc(242) Class47 local242 = local230[local192] = new Class47();
			@Pc(246) int local246 = local38.method672();
			if (local246 > 0) {
				local242.aByteArray17 = new byte[local246 * 2];
			}
			local246 = local38.method672();
			if (local246 > 0) {
				local242.aByteArray18 = new byte[local246 * 2 + 2];
				local242.aByteArray18[1] = 64;
			}
		}
		local198 = local38.method672();
		@Pc(301) byte[] local301 = local198 <= 0 ? null : new byte[local198 * 2];
		local198 = local38.method672();
		@Pc(314) byte[] local314 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(316) int local316;
		for (local316 = 0; local38.aByteArray13[local316 + local38.anInt792] != 0; local316++) {
		}
		@Pc(333) byte[] local333 = new byte[local316];
		for (@Pc(335) int local335 = 0; local335 < local316; local335++) {
			local333[local335] = local38.method643();
		}
		local38.anInt792++;
		local316++;
		@Pc(360) int local360 = 0;
		for (@Pc(362) int local362 = 0; local362 < 128; local362++) {
			local360 += local38.method672();
			this.aShortArray13[local362] = (short) local360;
		}
		local360 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local360 += local38.method672();
			this.aShortArray13[local386] = (short) (this.aShortArray13[local386] + (local360 << 8));
		}
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			if (local413 == 0) {
				if (local333.length > local417) {
					local413 = local333[local417++];
				} else {
					local413 = -1;
				}
				local415 = local38.method644();
			}
			this.aShortArray13[local419] = (short) (this.aShortArray13[local419] + ((local415 - 1 & 0x2) << 14));
			local413--;
			this.anIntArray444[local419] = local415;
		}
		local413 = 0;
		@Pc(471) int local471 = 0;
		local417 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray444[local475] != 0) {
				if (local413 == 0) {
					local471 = local38.aByteArray13[local77++] - 1;
					if (local417 < local53.length) {
						local413 = local53[local417++];
					} else {
						local413 = -1;
					}
				}
				this.aByteArray29[local475] = (byte) local471;
				local413--;
			}
		}
		local417 = 0;
		local413 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray444[local534] != 0) {
				if (local413 == 0) {
					if (local417 >= local99.length) {
						local413 = -1;
					} else {
						local413 = local99[local417++];
					}
					local532 = local38.aByteArray13[local122++] + 16 << 2;
				}
				local413--;
				this.aByteArray30[local534] = (byte) local532;
			}
		}
		local413 = 0;
		local417 = 0;
		@Pc(592) Class47 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray444[local594] != 0) {
				if (local413 == 0) {
					local592 = local230[local173[local417]];
					if (local417 < local145.length) {
						local413 = local145[local417++];
					} else {
						local413 = -1;
					}
				}
				this.aClass47Array1[local594] = local592;
				local413--;
			}
		}
		local413 = 0;
		@Pc(640) int local640 = 0;
		local417 = 0;
		for (@Pc(644) int local644 = 0; local644 < 128; local644++) {
			if (local413 == 0) {
				if (local417 >= local333.length) {
					local413 = -1;
				} else {
					local413 = local333[local417++];
				}
				if (this.anIntArray444[local644] > 0) {
					local640 = local38.method672() + 1;
				}
			}
			local413--;
			this.aByteArray31[local644] = (byte) local640;
		}
		this.anInt2639 = local38.method672() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local180; local696++) {
			@Pc(702) Class47 local702 = local230[local696];
			if (local702.aByteArray17 != null) {
				for (local707 = 1; local707 < local702.aByteArray17.length; local707 += 2) {
					local702.aByteArray17[local707] = local38.method643();
				}
			}
			if (local702.aByteArray18 != null) {
				for (local707 = 3; local707 < local702.aByteArray18.length - 2; local707 += 2) {
					local702.aByteArray18[local707] = local38.method643();
				}
			}
		}
		@Pc(756) int local756;
		if (local301 != null) {
			for (local756 = 1; local756 < local301.length; local756 += 2) {
				local301[local756] = local38.method643();
			}
		}
		if (local314 != null) {
			for (local756 = 1; local756 < local314.length; local756 += 2) {
				local314[local756] = local38.method643();
			}
		}
		@Pc(805) int local805;
		for (local756 = 0; local756 < local180; local756++) {
			@Pc(798) Class47 local798 = local230[local756];
			if (local798.aByteArray18 != null) {
				local360 = 0;
				for (local805 = 2; local805 < local798.aByteArray18.length; local805 += 2) {
					local360 = local360 + local38.method672() + 1;
					local798.aByteArray18[local805] = (byte) local360;
				}
			}
		}
		@Pc(855) int local855;
		for (local707 = 0; local707 < local180; local707++) {
			@Pc(848) Class47 local848 = local230[local707];
			if (local848.aByteArray17 != null) {
				local360 = 0;
				for (local855 = 2; local855 < local848.aByteArray17.length; local855 += 2) {
					local360 = local360 + local38.method672() + 1;
					local848.aByteArray17[local855] = (byte) local360;
				}
			}
		}
		@Pc(928) int local928;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(975) int local975;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(922) byte local922;
		@Pc(1034) int local1034;
		if (local301 != null) {
			local360 = local38.method672();
			local301[0] = (byte) local360;
			for (local805 = 2; local805 < local301.length; local805 += 2) {
				local360 = local38.method672() + local360 + 1;
				local301[local805] = (byte) local360;
			}
			local922 = local301[0];
			@Pc(926) byte local926 = local301[1];
			for (local928 = 0; local928 < local922; local928++) {
				this.aByteArray31[local928] = (byte) (this.aByteArray31[local928] * local926 + 32 >> 6);
			}
			local955 = 2;
			while (local301.length > local955) {
				local961 = local301[local955];
				local975 = local926 * (local961 - local922) + (local961 - local922) / 2;
				@Pc(981) byte local981 = local301[local955 + 1];
				local955 += 2;
				for (local984 = local922; local984 < local961; local984++) {
					local994 = Static75.method1230(local961 - local922, local975);
					this.aByteArray31[local984] = (byte) (local994 * this.aByteArray31[local984] + 32 >> 6);
					local975 += local981 - local926;
				}
				local926 = local981;
				local922 = local961;
			}
			for (local1034 = local922; local1034 < 128; local1034++) {
				this.aByteArray31[local1034] = (byte) (this.aByteArray31[local1034] * local926 + 32 >> 6);
			}
		}
		@Pc(1107) int local1107;
		if (local314 != null) {
			local360 = local38.method672();
			local314[0] = (byte) local360;
			for (local805 = 2; local805 < local314.length; local805 += 2) {
				local360 = local360 + local38.method672() + 1;
				local314[local805] = (byte) local360;
			}
			local922 = local314[0];
			local1107 = local314[1] << 1;
			for (local928 = 0; local928 < local922; local928++) {
				local955 = (this.aByteArray30[local928] & 0xFF) + local1107;
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray30[local928] = (byte) local955;
			}
			local955 = 2;
			@Pc(1172) int local1172;
			while (local314.length > local955) {
				local961 = local314[local955];
				local975 = (local961 - local922) / 2 + local1107 * (local961 - local922);
				local1172 = local314[local955 + 1] << 1;
				local955 += 2;
				for (local984 = local922; local984 < local961; local984++) {
					local994 = Static75.method1230(local961 - local922, local975);
					local975 += local1172 - local1107;
					@Pc(1200) int local1200 = local994 + (this.aByteArray30[local984] & 0xFF);
					if (local1200 < 0) {
						local1200 = 0;
					}
					if (local1200 > 128) {
						local1200 = 128;
					}
					this.aByteArray30[local984] = (byte) local1200;
				}
				local1107 = local1172;
				local922 = local961;
			}
			for (local1034 = local922; local1034 < 128; local1034++) {
				local1172 = (this.aByteArray30[local1034] & 0xFF) + local1107;
				if (local1172 < 0) {
					local1172 = 0;
				}
				if (local1172 > 128) {
					local1172 = 128;
				}
				this.aByteArray30[local1034] = (byte) local1172;
			}
		}
		for (local805 = 0; local805 < local180; local805++) {
			local230[local805].anInt1462 = local38.method672();
		}
		for (local855 = 0; local855 < local180; local855++) {
			@Pc(1298) Class47 local1298 = local230[local855];
			if (local1298.aByteArray17 != null) {
				local1298.anInt1457 = local38.method672();
			}
			if (local1298.aByteArray18 != null) {
				local1298.anInt1465 = local38.method672();
			}
			if (local1298.anInt1462 > 0) {
				local1298.anInt1463 = local38.method672();
			}
		}
		for (local1107 = 0; local1107 < local180; local1107++) {
			local230[local1107].anInt1464 = local38.method672();
		}
		for (local928 = 0; local928 < local180; local928++) {
			@Pc(1357) Class47 local1357 = local230[local928];
			if (local1357.anInt1464 > 0) {
				local1357.anInt1456 = local38.method672();
			}
		}
		for (local955 = 0; local955 < local180; local955++) {
			@Pc(1384) Class47 local1384 = local230[local955];
			if (local1384.anInt1456 > 0) {
				local1384.anInt1455 = local38.method672();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public void method1834() {
		this.anIntArray444 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([ILclient!dd;[BI)Z")
	public boolean method1835(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class1_Sub14_Sub1 local11 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg2 == null || arg2[local21] != 0) {
				@Pc(36) int local36 = this.anIntArray444[local21];
				if (local36 != 0) {
					if (local36 != local7) {
						local7 = local36--;
						if ((local36 & 0x1) == 0) {
							local11 = arg1.method560(local36 >> 2, arg0);
						} else {
							local11 = arg1.method554(arg0, local36 >> 2);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub14_Sub1Array1[local21] = local11;
						this.anIntArray444[local21] = 0;
					}
				}
			}
		}
		return local9;
	}
}
