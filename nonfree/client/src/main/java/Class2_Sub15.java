import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "[S")
	public final short[] aShortArray8 = new short[128];

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "[I")
	private int[] anIntArray182 = new int[128];

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "[B")
	public final byte[] aByteArray12 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "[B")
	public final byte[] aByteArray13 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
	public final int anInt1481;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "[B")
	public final byte[] aByteArray14 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "[Lclient!ke;")
	public final Class2_Sub14_Sub1[] aClass2_Sub14_Sub1Array1 = new Class2_Sub14_Sub1[128];

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "[Lclient!td;")
	public final Class72[] aClass72Array1 = new Class72[128];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class2_Sub10 local36 = new Class2_Sub10(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray27[local36.anInt2187 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method1509();
		}
		local38++;
		local36.anInt2187++;
		@Pc(79) int local79 = 0;
		@Pc(82) int local82 = local36.anInt2187;
		local36.anInt2187 += local38;
		while (local36.aByteArray27[local36.anInt2187 + local79] != 0) {
			local79++;
		}
		@Pc(105) byte[] local105 = new byte[local79];
		for (@Pc(107) int local107 = 0; local107 < local79; local107++) {
			local105[local107] = local36.method1509();
		}
		local79++;
		local36.anInt2187++;
		@Pc(129) int local129 = local36.anInt2187;
		local36.anInt2187 += local79;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray27[local36.anInt2187 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method1509();
		}
		local137++;
		local36.anInt2187++;
		@Pc(175) byte[] local175 = new byte[local137];
		@Pc(186) int local186;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local137 > 1) {
			local175[1] = 1;
			@Pc(184) int local184 = 1;
			local186 = 2;
			for (local188 = 2; local188 < local137; local188++) {
				local194 = local36.method1514();
				if (local194 == 0) {
					local184 = local186++;
				} else {
					if (local194 <= local184) {
						local194--;
					}
					local184 = local194;
				}
				local175[local188] = (byte) local184;
			}
		} else {
			local186 = local137;
		}
		@Pc(223) Class72[] local223 = new Class72[local186];
		for (local188 = 0; local188 < local223.length; local188++) {
			@Pc(235) Class72 local235 = local223[local188] = new Class72();
			@Pc(239) int local239 = local36.method1514();
			if (local239 > 0) {
				local235.aByteArray36 = new byte[local239 * 2];
			}
			local239 = local36.method1514();
			if (local239 > 0) {
				local235.aByteArray37 = new byte[local239 * 2 + 2];
				local235.aByteArray37[1] = 64;
			}
		}
		local194 = local36.method1514();
		@Pc(291) byte[] local291 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local36.method1514();
		@Pc(304) byte[] local304 = local194 <= 0 ? null : new byte[local194 * 2];
		@Pc(306) int local306;
		for (local306 = 0; local36.aByteArray27[local36.anInt2187 + local306] != 0; local306++) {
		}
		@Pc(320) byte[] local320 = new byte[local306];
		for (@Pc(322) int local322 = 0; local322 < local306; local322++) {
			local320[local322] = local36.method1509();
		}
		local306++;
		local36.anInt2187++;
		@Pc(347) int local347 = 0;
		for (@Pc(349) int local349 = 0; local349 < 128; local349++) {
			local347 += local36.method1514();
			this.aShortArray8[local349] = (short) local347;
		}
		local347 = 0;
		for (@Pc(371) int local371 = 0; local371 < 128; local371++) {
			local347 += local36.method1514();
			this.aShortArray8[local371] = (short) (this.aShortArray8[local371] + (local347 << 8));
		}
		@Pc(396) int local396 = 0;
		@Pc(398) int local398 = 0;
		@Pc(400) int local400 = 0;
		for (@Pc(402) int local402 = 0; local402 < 128; local402++) {
			if (local396 == 0) {
				if (local320.length > local398) {
					local396 = local320[local398++];
				} else {
					local396 = -1;
				}
				local400 = local36.method1528();
			}
			local396--;
			this.aShortArray8[local402] = (short) (this.aShortArray8[local402] + ((local400 - 1 & 0x2) << 14));
			this.anIntArray182[local402] = local400;
		}
		local398 = 0;
		local396 = 0;
		@Pc(460) int local460 = 0;
		for (@Pc(462) int local462 = 0; local462 < 128; local462++) {
			if (this.anIntArray182[local462] != 0) {
				if (local396 == 0) {
					local460 = local36.aByteArray27[local82++] - 1;
					if (local398 >= local56.length) {
						local396 = -1;
					} else {
						local396 = local56[local398++];
					}
				}
				local396--;
				this.aByteArray12[local462] = (byte) local460;
			}
		}
		local398 = 0;
		@Pc(516) int local516 = 0;
		local396 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray182[local520] != 0) {
				if (local396 == 0) {
					if (local105.length <= local398) {
						local396 = -1;
					} else {
						local396 = local105[local398++];
					}
					local516 = local36.aByteArray27[local129++] + 16 << 2;
				}
				this.aByteArray14[local520] = (byte) local516;
				local396--;
			}
		}
		local398 = 0;
		local396 = 0;
		@Pc(571) Class72 local571 = null;
		for (@Pc(573) int local573 = 0; local573 < 128; local573++) {
			if (this.anIntArray182[local573] != 0) {
				if (local396 == 0) {
					local571 = local223[local175[local398]];
					if (local151.length <= local398) {
						local396 = -1;
					} else {
						local396 = local151[local398++];
					}
				}
				local396--;
				this.aClass72Array1[local573] = local571;
			}
		}
		local398 = 0;
		@Pc(616) int local616 = 0;
		local396 = 0;
		for (@Pc(620) int local620 = 0; local620 < 128; local620++) {
			if (local396 == 0) {
				if (local320.length <= local398) {
					local396 = -1;
				} else {
					local396 = local320[local398++];
				}
				if (this.anIntArray182[local620] > 0) {
					local616 = local36.method1514() + 1;
				}
			}
			this.aByteArray13[local620] = (byte) local616;
			local396--;
		}
		this.anInt1481 = local36.method1514() + 1;
		@Pc(684) int local684;
		for (@Pc(673) int local673 = 0; local673 < local186; local673++) {
			@Pc(679) Class72 local679 = local223[local673];
			if (local679.aByteArray36 != null) {
				for (local684 = 1; local684 < local679.aByteArray36.length; local684 += 2) {
					local679.aByteArray36[local684] = local36.method1509();
				}
			}
			if (local679.aByteArray37 != null) {
				for (local684 = 3; local684 < local679.aByteArray37.length - 2; local684 += 2) {
					local679.aByteArray37[local684] = local36.method1509();
				}
			}
		}
		@Pc(737) int local737;
		if (local291 != null) {
			for (local737 = 1; local737 < local291.length; local737 += 2) {
				local291[local737] = local36.method1509();
			}
		}
		if (local304 != null) {
			for (local737 = 1; local737 < local304.length; local737 += 2) {
				local304[local737] = local36.method1509();
			}
		}
		@Pc(782) int local782;
		for (local737 = 0; local737 < local186; local737++) {
			@Pc(775) Class72 local775 = local223[local737];
			if (local775.aByteArray37 != null) {
				local347 = 0;
				for (local782 = 2; local782 < local775.aByteArray37.length; local782 += 2) {
					local347 += local36.method1514() + 1;
					local775.aByteArray37[local782] = (byte) local347;
				}
			}
		}
		@Pc(832) int local832;
		for (local684 = 0; local684 < local186; local684++) {
			@Pc(825) Class72 local825 = local223[local684];
			if (local825.aByteArray36 != null) {
				local347 = 0;
				for (local832 = 2; local832 < local825.aByteArray36.length; local832 += 2) {
					local347 = local36.method1514() + local347 + 1;
					local825.aByteArray36[local832] = (byte) local347;
				}
			}
		}
		@Pc(909) int local909;
		@Pc(936) int local936;
		@Pc(942) byte local942;
		@Pc(963) int local963;
		@Pc(965) int local965;
		@Pc(975) int local975;
		@Pc(903) byte local903;
		@Pc(1013) int local1013;
		if (local291 != null) {
			local347 = local36.method1514();
			local291[0] = (byte) local347;
			for (local782 = 2; local782 < local291.length; local782 += 2) {
				local347 = local36.method1514() + local347 + 1;
				local291[local782] = (byte) local347;
			}
			local903 = local291[0];
			@Pc(907) byte local907 = local291[1];
			for (local909 = 0; local909 < local903; local909++) {
				this.aByteArray13[local909] = (byte) (local907 * this.aByteArray13[local909] + 32 >> 6);
			}
			local936 = 2;
			while (local291.length > local936) {
				local942 = local291[local936];
				@Pc(948) byte local948 = local291[local936 + 1];
				local936 += 2;
				local963 = (local942 - local903) * local907 + (local942 - local903) / 2;
				for (local965 = local903; local965 < local942; local965++) {
					local975 = Static41.method669(local963, local942 - local903);
					local963 += local948 - local907;
					this.aByteArray13[local965] = (byte) (local975 * this.aByteArray13[local965] + 32 >> 6);
				}
				local903 = local942;
				local907 = local948;
			}
			for (local1013 = local903; local1013 < 128; local1013++) {
				this.aByteArray13[local1013] = (byte) (local907 * this.aByteArray13[local1013] + 32 >> 6);
			}
		}
		@Pc(1078) int local1078;
		if (local304 != null) {
			local347 = local36.method1514();
			local304[0] = (byte) local347;
			for (local782 = 2; local782 < local304.length; local782 += 2) {
				local347 -= -local36.method1514() - 1;
				local304[local782] = (byte) local347;
			}
			local903 = local304[0];
			local1078 = local304[1] << 1;
			for (local909 = 0; local909 < local903; local909++) {
				local936 = (this.aByteArray14[local909] & 0xFF) + local1078;
				if (local936 < 0) {
					local936 = 0;
				}
				if (local936 > 128) {
					local936 = 128;
				}
				this.aByteArray14[local909] = (byte) local936;
			}
			local936 = 2;
			@Pc(1136) int local1136;
			while (local936 < local304.length) {
				local942 = local304[local936];
				local1136 = local304[local936 + 1] << 1;
				local963 = (local942 - local903) / 2 + (local942 - local903) * local1078;
				local936 += 2;
				for (local965 = local903; local965 < local942; local965++) {
					local975 = Static41.method669(local963, local942 - local903);
					@Pc(1172) int local1172 = local975 + (this.aByteArray14[local965] & 0xFF);
					if (local1172 < 0) {
						local1172 = 0;
					}
					local963 += local1136 - local1078;
					if (local1172 > 128) {
						local1172 = 128;
					}
					this.aByteArray14[local965] = (byte) local1172;
				}
				local1078 = local1136;
				local903 = local942;
			}
			for (local1013 = local903; local1013 < 128; local1013++) {
				local1136 = (this.aByteArray14[local1013] & 0xFF) + local1078;
				if (local1136 < 0) {
					local1136 = 0;
				}
				if (local1136 > 128) {
					local1136 = 128;
				}
				this.aByteArray14[local1013] = (byte) local1136;
			}
		}
		for (local782 = 0; local782 < local186; local782++) {
			local223[local782].anInt2456 = local36.method1514();
		}
		for (local832 = 0; local832 < local186; local832++) {
			@Pc(1277) Class72 local1277 = local223[local832];
			if (local1277.aByteArray36 != null) {
				local1277.anInt2454 = local36.method1514();
			}
			if (local1277.aByteArray37 != null) {
				local1277.anInt2461 = local36.method1514();
			}
			if (local1277.anInt2456 > 0) {
				local1277.anInt2451 = local36.method1514();
			}
		}
		for (local1078 = 0; local1078 < local186; local1078++) {
			local223[local1078].anInt2457 = local36.method1514();
		}
		for (local909 = 0; local909 < local186; local909++) {
			@Pc(1335) Class72 local1335 = local223[local909];
			if (local1335.anInt2457 > 0) {
				local1335.anInt2450 = local36.method1514();
			}
		}
		for (local936 = 0; local936 < local186; local936++) {
			@Pc(1359) Class72 local1359 = local223[local936];
			if (local1359.anInt2450 > 0) {
				local1359.anInt2459 = local36.method1514();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public void method1023() {
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([ILclient!id;I[B)Z")
	public boolean method1026(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class2_Sub14_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray182[local18];
				if (local33 != 0) {
					if (local33 != local9) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg1.method871(arg0, local33 >> 2);
						} else {
							local16 = arg1.method872(local33 >> 2, arg0);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub14_Sub1Array1[local18] = local16;
						this.anIntArray182[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
