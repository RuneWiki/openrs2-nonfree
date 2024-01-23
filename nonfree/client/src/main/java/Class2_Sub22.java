import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[S")
	public short[] aShortArray60 = new short[128];

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[Lclient!lb;")
	public Class2_Sub19_Sub1[] aClass2_Sub19_Sub1Array1 = new Class2_Sub19_Sub1[128];

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	public int anInt4198;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "[I")
	private int[] anIntArray410 = new int[128];

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[B")
	public byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[B")
	public byte[] aByteArray46 = new byte[128];

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[Lclient!wc;")
	public Class192[] aClass192Array1 = new Class192[128];

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class2_Sub22(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray44 = new byte[128];
		@Pc(38) Class2_Sub16 local38 = new Class2_Sub16(arg0);
		while (local38.aByteArray17[local29 + local38.anInt2789] != 0) {
			local29++;
		}
		@Pc(52) byte[] local52 = new byte[local29];
		@Pc(54) int local54;
		for (local54 = 0; local54 < local29; local54++) {
			local52[local54] = local38.method2170();
		}
		local38.anInt2789++;
		local29++;
		@Pc(79) int local79 = 0;
		local54 = local38.anInt2789;
		local38.anInt2789 += local29;
		while (local38.aByteArray17[local79 + local38.anInt2789] != 0) {
			local79++;
		}
		@Pc(103) byte[] local103 = new byte[local79];
		@Pc(105) int local105;
		for (local105 = 0; local105 < local79; local105++) {
			local103[local105] = local38.method2170();
		}
		local79++;
		local38.anInt2789++;
		local105 = local38.anInt2789;
		@Pc(133) int local133 = 0;
		local38.anInt2789 += local79;
		while (local38.aByteArray17[local38.anInt2789 + local133] != 0) {
			local133++;
		}
		@Pc(153) byte[] local153 = new byte[local133];
		for (@Pc(155) int local155 = 0; local155 < local133; local155++) {
			local153[local155] = local38.method2170();
		}
		local133++;
		@Pc(171) byte[] local171 = new byte[local133];
		local38.anInt2789++;
		@Pc(188) int local188;
		@Pc(192) int local192;
		if (local133 > 1) {
			local171[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local133; local192++) {
				@Pc(199) int local199 = local38.method2146();
				if (local199 == 0) {
					local190 = local188++;
				} else {
					if (local199 <= local190) {
						local199--;
					}
					local190 = local199;
				}
				local171[local192] = (byte) local190;
			}
		} else {
			local188 = local133;
		}
		@Pc(229) Class192[] local229 = new Class192[local188];
		for (local192 = 0; local192 < local229.length; local192++) {
			@Pc(243) Class192 local243 = local229[local192] = new Class192();
			@Pc(247) int local247 = local38.method2146();
			if (local247 > 0) {
				local243.aByteArray74 = new byte[local247 * 2];
			}
			local247 = local38.method2146();
			if (local247 > 0) {
				local243.aByteArray73 = new byte[local247 * 2 + 2];
				local243.aByteArray73[1] = 64;
			}
		}
		local192 = local38.method2146();
		@Pc(297) byte[] local297 = local192 <= 0 ? null : new byte[local192 * 2];
		@Pc(299) int local299 = 0;
		local192 = local38.method2146();
		while (local38.aByteArray17[local299 + local38.anInt2789] != 0) {
			local299++;
		}
		@Pc(329) byte[] local329 = local192 > 0 ? new byte[local192 * 2] : null;
		@Pc(332) byte[] local332 = new byte[local299];
		@Pc(334) int local334;
		for (local334 = 0; local334 < local299; local334++) {
			local332[local334] = local38.method2170();
		}
		local38.anInt2789++;
		local299++;
		local334 = 0;
		@Pc(357) int local357;
		for (local357 = 0; local357 < 128; local357++) {
			local334 += local38.method2146();
			this.aShortArray60[local357] = (short) local334;
		}
		local334 = 0;
		for (local357 = 0; local357 < 128; local357++) {
			local334 += local38.method2146();
			this.aShortArray60[local357] = (short) (this.aShortArray60[local357] + (local334 << 8));
		}
		local357 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410;
		for (local410 = 0; local410 < 128; local410++) {
			if (local357 == 0) {
				if (local332.length > local408) {
					local357 = local332[local408++];
				} else {
					local357 = -1;
				}
				local406 = local38.method2138();
			}
			this.aShortArray60[local410] = (short) (this.aShortArray60[local410] + ((local406 - 1 & 0x2) << 14));
			local357--;
			this.anIntArray410[local410] = local406;
		}
		local408 = 0;
		local410 = 0;
		local357 = 0;
		@Pc(465) int local465;
		for (local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray410[local465] != 0) {
				if (local357 == 0) {
					local410 = local38.aByteArray17[local54++] - 1;
					if (local52.length > local408) {
						local357 = local52[local408++];
					} else {
						local357 = -1;
					}
				}
				this.aByteArray44[local465] = (byte) local410;
				local357--;
			}
		}
		local357 = 0;
		local408 = 0;
		local465 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray410[local520] != 0) {
				if (local357 == 0) {
					local465 = local38.aByteArray17[local105++] + 16 << 2;
					if (local408 >= local103.length) {
						local357 = -1;
					} else {
						local357 = local103[local408++];
					}
				}
				this.aByteArray46[local520] = (byte) local465;
				local357--;
			}
		}
		local357 = 0;
		@Pc(578) Class192 local578 = null;
		local408 = 0;
		@Pc(582) int local582;
		for (local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray410[local582] != 0) {
				if (local357 == 0) {
					local578 = local229[local171[local408]];
					if (local153.length > local408) {
						local357 = local153[local408++];
					} else {
						local357 = -1;
					}
				}
				local357--;
				this.aClass192Array1[local582] = local578;
			}
		}
		local357 = 0;
		local582 = 0;
		local408 = 0;
		@Pc(630) int local630;
		for (local630 = 0; local630 < 128; local630++) {
			if (local357 == 0) {
				if (local332.length > local408) {
					local357 = local332[local408++];
				} else {
					local357 = -1;
				}
				if (this.anIntArray410[local630] > 0) {
					local582 = local38.method2146() + 1;
				}
			}
			local357--;
			this.aByteArray45[local630] = (byte) local582;
		}
		this.anInt4198 = local38.method2146() + 1;
		@Pc(700) Class192 local700;
		@Pc(706) int local706;
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.aByteArray74 != null) {
				for (local706 = 1; local706 < local700.aByteArray74.length; local706 += 2) {
					local700.aByteArray74[local706] = local38.method2170();
				}
			}
			if (local700.aByteArray73 != null) {
				for (local706 = 3; local706 < local700.aByteArray73.length - 2; local706 += 2) {
					local700.aByteArray73[local706] = local38.method2170();
				}
			}
		}
		if (local297 != null) {
			for (local630 = 1; local630 < local297.length; local630 += 2) {
				local297[local630] = local38.method2170();
			}
		}
		if (local329 != null) {
			for (local630 = 1; local630 < local329.length; local630 += 2) {
				local329[local630] = local38.method2170();
			}
		}
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.aByteArray73 != null) {
				local334 = 0;
				for (local706 = 2; local706 < local700.aByteArray73.length; local706 += 2) {
					local334 = local38.method2146() + local334 + 1;
					local700.aByteArray73[local706] = (byte) local334;
				}
			}
		}
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.aByteArray74 != null) {
				local334 = 0;
				for (local706 = 2; local706 < local700.aByteArray74.length; local706 += 2) {
					local334 = local334 + local38.method2146() + 1;
					local700.aByteArray74[local706] = (byte) local334;
				}
			}
		}
		@Pc(981) byte local981;
		@Pc(995) int local995;
		@Pc(998) int local998;
		@Pc(1013) int local1013;
		@Pc(1048) int local1048;
		@Pc(934) byte local934;
		if (local297 != null) {
			local334 = local38.method2146();
			local297[0] = (byte) local334;
			for (local630 = 2; local630 < local297.length; local630 += 2) {
				local334 = local38.method2146() + local334 + 1;
				local297[local630] = (byte) local334;
			}
			local934 = local297[0];
			@Pc(938) byte local938 = local297[1];
			for (local706 = 0; local706 < local934; local706++) {
				this.aByteArray45[local706] = (byte) (this.aByteArray45[local706] * local938 + 32 >> 6);
			}
			local706 = 2;
			while (local297.length > local706) {
				@Pc(977) byte local977 = local297[local706 + 1];
				local981 = local297[local706];
				local995 = local938 * (local981 - local934) + (local981 - local934) / 2;
				local706 += 2;
				for (local998 = local934; local998 < local981; local998++) {
					local1013 = Static65.method1193(local995, local981 - local934);
					this.aByteArray45[local998] = (byte) (local1013 * this.aByteArray45[local998] + 32 >> 6);
					local995 += local977 - local938;
				}
				local934 = local981;
				local938 = local977;
			}
			for (local1048 = local934; local1048 < 128; local1048++) {
				this.aByteArray45[local1048] = (byte) (local938 * this.aByteArray45[local1048] + 32 >> 6);
			}
		}
		if (local329 != null) {
			local334 = local38.method2146();
			local329[0] = (byte) local334;
			for (local630 = 2; local630 < local329.length; local630 += 2) {
				local334 = local334 + local38.method2146() + 1;
				local329[local630] = (byte) local334;
			}
			local934 = local329[0];
			@Pc(1118) int local1118 = local329[1] << 1;
			for (local706 = 0; local706 < local934; local706++) {
				local1048 = (this.aByteArray46[local706] & 0xFF) + local1118;
				if (local1048 < 0) {
					local1048 = 0;
				}
				if (local1048 > 128) {
					local1048 = 128;
				}
				this.aByteArray46[local706] = (byte) local1048;
			}
			local706 = 2;
			@Pc(1170) int local1170;
			while (local706 < local329.length) {
				local1170 = local329[local706 + 1] << 1;
				local981 = local329[local706];
				local706 += 2;
				local995 = (local981 - local934) * local1118 + (local981 - local934) / 2;
				for (local998 = local934; local998 < local981; local998++) {
					local1013 = Static65.method1193(local995, local981 - local934);
					local995 += local1170 - local1118;
					@Pc(1219) int local1219 = local1013 + (this.aByteArray46[local998] & 0xFF);
					if (local1219 < 0) {
						local1219 = 0;
					}
					if (local1219 > 128) {
						local1219 = 128;
					}
					this.aByteArray46[local998] = (byte) local1219;
				}
				local934 = local981;
				local1118 = local1170;
			}
			for (local1048 = local934; local1048 < 128; local1048++) {
				local1170 = (this.aByteArray46[local1048] & 0xFF) + local1118;
				if (local1170 < 0) {
					local1170 = 0;
				}
				if (local1170 > 128) {
					local1170 = 128;
				}
				this.aByteArray46[local1048] = (byte) local1170;
			}
		}
		for (local630 = 0; local630 < local188; local630++) {
			local229[local630].anInt5947 = local38.method2146();
		}
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.aByteArray74 != null) {
				local700.anInt5956 = local38.method2146();
			}
			if (local700.aByteArray73 != null) {
				local700.anInt5949 = local38.method2146();
			}
			if (local700.anInt5947 > 0) {
				local700.anInt5951 = local38.method2146();
			}
		}
		for (local630 = 0; local630 < local188; local630++) {
			local229[local630].anInt5948 = local38.method2146();
		}
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.anInt5948 > 0) {
				local700.anInt5952 = local38.method2146();
			}
		}
		for (local630 = 0; local630 < local188; local630++) {
			local700 = local229[local630];
			if (local700.anInt5952 > 0) {
				local700.anInt5955 = local38.method2146();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([I[BBLclient!nb;)Z")
	public boolean method3406(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class118 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub19_Sub1 local17 = null;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(41) int local41 = this.anIntArray410[local21];
				if (local41 != 0) {
					if (local41 != local19) {
						local19 = local41--;
						if ((local41 & 0x1) == 0) {
							local17 = arg2.method3234(local41 >> 2, arg0);
						} else {
							local17 = arg2.method3238(local41 >> 2, arg0);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass2_Sub19_Sub1Array1[local21] = local17;
						this.anIntArray410[local21] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public void method3411() {
		this.anIntArray410 = null;
	}
}
