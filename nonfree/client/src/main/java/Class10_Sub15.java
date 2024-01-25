import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class10_Sub15 extends Class10 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "[Lclient!cc;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "[Lclient!wq;")
	public Class10_Sub25_Sub1[] aClass10_Sub25_Sub1Array1;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	private Class10_Sub15() {
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "([B)V")
	public Class10_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aShortArray17 = new short[128];
		this.aByteArray17 = new byte[128];
		this.aByteArray18 = new byte[128];
		this.aClass10_Sub25_Sub1Array1 = new Class10_Sub25_Sub1[128];
		this.aClass35Array1 = new Class35[128];
		this.aByteArray19 = new byte[128];
		this.anIntArray173 = new int[128];
		@Pc(36) Class10_Sub8 local36 = new Class10_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray44[local36.anInt2989 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method2460();
		}
		local36.anInt2989++;
		local38++;
		@Pc(80) int local80 = local36.anInt2989;
		local36.anInt2989 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray44[local88 + local36.anInt2989] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method2460();
		}
		local36.anInt2989++;
		local88++;
		@Pc(133) int local133 = local36.anInt2989;
		local36.anInt2989 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray44[local141 + local36.anInt2989] != 0; local141++) {
		}
		@Pc(155) byte[] local155 = new byte[local141];
		for (@Pc(157) int local157 = 0; local157 < local141; local157++) {
			local155[local157] = local36.method2460();
		}
		local141++;
		local36.anInt2989++;
		@Pc(183) byte[] local183 = new byte[local141];
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local141 > 1) {
			local183[1] = 1;
			local194 = 2;
			@Pc(196) int local196 = 1;
			for (local198 = 2; local198 < local141; local198++) {
				local204 = local36.method2502();
				if (local204 == 0) {
					local196 = local194++;
				} else {
					if (local196 >= local204) {
						local204--;
					}
					local196 = local204;
				}
				local183[local198] = (byte) local196;
			}
		} else {
			local194 = local141;
		}
		@Pc(241) Class35[] local241 = new Class35[local194];
		for (local198 = 0; local198 < local241.length; local198++) {
			@Pc(253) Class35 local253 = local241[local198] = new Class35();
			@Pc(257) int local257 = local36.method2502();
			if (local257 > 0) {
				local253.aByteArray7 = new byte[local257 * 2];
			}
			local257 = local36.method2502();
			if (local257 > 0) {
				local253.aByteArray8 = new byte[local257 * 2 + 2];
				local253.aByteArray8[1] = 64;
			}
		}
		local204 = local36.method2502();
		@Pc(312) byte[] local312 = local204 > 0 ? new byte[local204 * 2] : null;
		local204 = local36.method2502();
		@Pc(328) byte[] local328 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(330) int local330;
		for (local330 = 0; local36.aByteArray44[local36.anInt2989 + local330] != 0; local330++) {
		}
		@Pc(347) byte[] local347 = new byte[local330];
		for (@Pc(349) int local349 = 0; local349 < local330; local349++) {
			local347[local349] = local36.method2460();
		}
		local330++;
		local36.anInt2989++;
		@Pc(374) int local374 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local374 += local36.method2502();
			this.aShortArray17[local376] = (short) local374;
		}
		local374 = 0;
		for (@Pc(398) int local398 = 0; local398 < 128; local398++) {
			local374 += local36.method2502();
			this.aShortArray17[local398] = (short) (this.aShortArray17[local398] + (local374 << 8));
		}
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		@Pc(427) int local427 = 0;
		for (@Pc(429) int local429 = 0; local429 < 128; local429++) {
			if (local423 == 0) {
				if (local425 >= local347.length) {
					local423 = -1;
				} else {
					local423 = local347[local425++];
				}
				local427 = local36.method2480();
			}
			this.aShortArray17[local429] = (short) (this.aShortArray17[local429] + ((local427 - 1 & 0x2) << 14));
			this.anIntArray173[local429] = local427;
			local423--;
		}
		local425 = 0;
		local423 = 0;
		@Pc(487) int local487 = 0;
		for (@Pc(489) int local489 = 0; local489 < 128; local489++) {
			if (this.anIntArray173[local489] != 0) {
				if (local423 == 0) {
					local487 = local36.aByteArray44[local80++] - 1;
					if (local425 >= local52.length) {
						local423 = -1;
					} else {
						local423 = local52[local425++];
					}
				}
				this.aByteArray19[local489] = (byte) local487;
				local423--;
			}
		}
		local423 = 0;
		local425 = 0;
		@Pc(541) int local541 = 0;
		for (@Pc(543) int local543 = 0; local543 < 128; local543++) {
			if (this.anIntArray173[local543] != 0) {
				if (local423 == 0) {
					local541 = local36.aByteArray44[local133++] + 16 << 2;
					if (local425 < local105.length) {
						local423 = local105[local425++];
					} else {
						local423 = -1;
					}
				}
				this.aByteArray17[local543] = (byte) local541;
				local423--;
			}
		}
		local423 = 0;
		local425 = 0;
		@Pc(598) Class35 local598 = null;
		for (@Pc(600) int local600 = 0; local600 < 128; local600++) {
			if (this.anIntArray173[local600] != 0) {
				if (local423 == 0) {
					local598 = local241[local183[local425]];
					if (local425 < local155.length) {
						local423 = local155[local425++];
					} else {
						local423 = -1;
					}
				}
				this.aClass35Array1[local600] = local598;
				local423--;
			}
		}
		local425 = 0;
		local423 = 0;
		@Pc(646) int local646 = 0;
		for (@Pc(648) int local648 = 0; local648 < 128; local648++) {
			if (local423 == 0) {
				if (local347.length > local425) {
					local423 = local347[local425++];
				} else {
					local423 = -1;
				}
				if (this.anIntArray173[local648] > 0) {
					local646 = local36.method2502() + 1;
				}
			}
			this.aByteArray18[local648] = (byte) local646;
			local423--;
		}
		this.anInt2080 = local36.method2502() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local194; local696++) {
			@Pc(702) Class35 local702 = local241[local696];
			if (local702.aByteArray7 != null) {
				for (local707 = 1; local707 < local702.aByteArray7.length; local707 += 2) {
					local702.aByteArray7[local707] = local36.method2460();
				}
			}
			if (local702.aByteArray8 != null) {
				for (local707 = 3; local707 < local702.aByteArray8.length - 2; local707 += 2) {
					local702.aByteArray8[local707] = local36.method2460();
				}
			}
		}
		@Pc(756) int local756;
		if (local312 != null) {
			for (local756 = 1; local756 < local312.length; local756 += 2) {
				local312[local756] = local36.method2460();
			}
		}
		if (local328 != null) {
			for (local756 = 1; local756 < local328.length; local756 += 2) {
				local328[local756] = local36.method2460();
			}
		}
		@Pc(805) int local805;
		for (local756 = 0; local756 < local194; local756++) {
			@Pc(798) Class35 local798 = local241[local756];
			if (local798.aByteArray8 != null) {
				local374 = 0;
				for (local805 = 2; local805 < local798.aByteArray8.length; local805 += 2) {
					local374 = local374 + local36.method2502() + 1;
					local798.aByteArray8[local805] = (byte) local374;
				}
			}
		}
		@Pc(850) int local850;
		for (local707 = 0; local707 < local194; local707++) {
			@Pc(843) Class35 local843 = local241[local707];
			if (local843.aByteArray7 != null) {
				local374 = 0;
				for (local850 = 2; local850 < local843.aByteArray7.length; local850 += 2) {
					local374 = local374 + local36.method2502() + 1;
					local843.aByteArray7[local850] = (byte) local374;
				}
			}
		}
		@Pc(924) int local924;
		@Pc(947) int local947;
		@Pc(953) byte local953;
		@Pc(973) int local973;
		@Pc(975) int local975;
		@Pc(985) int local985;
		@Pc(918) byte local918;
		@Pc(1028) int local1028;
		if (local312 != null) {
			local374 = local36.method2502();
			local312[0] = (byte) local374;
			for (local805 = 2; local805 < local312.length; local805 += 2) {
				local374 = local374 + local36.method2502() + 1;
				local312[local805] = (byte) local374;
			}
			local918 = local312[0];
			@Pc(922) byte local922 = local312[1];
			for (local924 = 0; local924 < local918; local924++) {
				this.aByteArray18[local924] = (byte) (local922 * this.aByteArray18[local924] + 32 >> 6);
			}
			local947 = 2;
			while (local312.length > local947) {
				local953 = local312[local947];
				@Pc(959) byte local959 = local312[local947 + 1];
				local973 = (local953 - local918) * local922 + (local953 - local918) / 2;
				for (local975 = local918; local975 < local953; local975++) {
					local985 = Static328.method5697(local953 - local918, local973);
					local973 += local959 - local922;
					this.aByteArray18[local975] = (byte) (this.aByteArray18[local975] * local985 + 32 >> 6);
				}
				local922 = local959;
				local947 += 2;
				local918 = local953;
			}
			for (local1028 = local918; local1028 < 128; local1028++) {
				this.aByteArray18[local1028] = (byte) (local922 * this.aByteArray18[local1028] + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local328 != null) {
			local374 = local36.method2502();
			local328[0] = (byte) local374;
			for (local805 = 2; local805 < local328.length; local805 += 2) {
				local374 = local374 + local36.method2502() + 1;
				local328[local805] = (byte) local374;
			}
			local918 = local328[0];
			local1098 = local328[1] << 1;
			for (local924 = 0; local924 < local918; local924++) {
				local947 = local1098 + (this.aByteArray17[local924] & 0xFF);
				if (local947 < 0) {
					local947 = 0;
				}
				if (local947 > 128) {
					local947 = 128;
				}
				this.aByteArray17[local924] = (byte) local947;
			}
			local947 = 2;
			@Pc(1152) int local1152;
			while (local328.length > local947) {
				local953 = local328[local947];
				local1152 = local328[local947 + 1] << 1;
				local973 = (local953 - local918) * local1098 + (local953 - local918) / 2;
				for (local975 = local918; local975 < local953; local975++) {
					local985 = Static328.method5697(local953 - local918, local973);
					@Pc(1187) int local1187 = (this.aByteArray17[local975] & 0xFF) + local985;
					if (local1187 < 0) {
						local1187 = 0;
					}
					if (local1187 > 128) {
						local1187 = 128;
					}
					local973 += local1152 - local1098;
					this.aByteArray17[local975] = (byte) local1187;
				}
				local947 += 2;
				local918 = local953;
				local1098 = local1152;
			}
			for (local1028 = local918; local1028 < 128; local1028++) {
				local1152 = local1098 + (this.aByteArray17[local1028] & 0xFF);
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray17[local1028] = (byte) local1152;
			}
		}
		for (local805 = 0; local805 < local194; local805++) {
			local241[local805].anInt882 = local36.method2502();
		}
		for (local850 = 0; local850 < local194; local850++) {
			@Pc(1284) Class35 local1284 = local241[local850];
			if (local1284.aByteArray7 != null) {
				local1284.anInt886 = local36.method2502();
			}
			if (local1284.aByteArray8 != null) {
				local1284.anInt889 = local36.method2502();
			}
			if (local1284.anInt882 > 0) {
				local1284.anInt883 = local36.method2502();
			}
		}
		for (local1098 = 0; local1098 < local194; local1098++) {
			local241[local1098].anInt887 = local36.method2502();
		}
		for (local924 = 0; local924 < local194; local924++) {
			@Pc(1339) Class35 local1339 = local241[local924];
			if (local1339.anInt887 > 0) {
				local1339.anInt885 = local36.method2502();
			}
		}
		for (local947 = 0; local947 < local194; local947++) {
			@Pc(1359) Class35 local1359 = local241[local947];
			if (local1359.anInt885 > 0) {
				local1359.anInt884 = local36.method2502();
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!wo;B[I[B)Z")
	public boolean method1790(@OriginalArg(0) Class269 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(13) int local13 = 0;
		@Pc(15) Class10_Sub25_Sub1 local15 = null;
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			if (arg2 == null || arg2[local17] != 0) {
				@Pc(29) int local29 = this.anIntArray173[local17];
				if (local29 != 0) {
					if (local29 != local13) {
						local13 = local29--;
						if ((local29 & 0x1) == 0) {
							local15 = arg0.method6020(arg1, local29 >> 2);
						} else {
							local15 = arg0.method6019(arg1, local29 >> 2);
						}
						if (local15 == null) {
							local11 = false;
						}
					}
					if (local15 != null) {
						this.aClass10_Sub25_Sub1Array1[local17] = local15;
						this.anIntArray173[local17] = 0;
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	public void method1794() {
		this.anIntArray173 = null;
	}
}
