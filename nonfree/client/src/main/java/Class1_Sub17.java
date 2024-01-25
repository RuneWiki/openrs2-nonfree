import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[Lclient!nv;")
	public Class1_Sub32_Sub1[] aClass1_Sub32_Sub1Array1;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[Lclient!ei;")
	public Class68[] aClass68Array1;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	private Class1_Sub17() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub32_Sub1Array1 = new Class1_Sub32_Sub1[128];
		this.aByteArray47 = new byte[128];
		this.aClass68Array1 = new Class68[128];
		this.aByteArray49 = new byte[128];
		this.aShortArray50 = new short[128];
		this.anIntArray264 = new int[128];
		this.aByteArray48 = new byte[128];
		@Pc(36) Class1_Sub1 local36 = new Class1_Sub1(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray66[local38 + local36.anInt5056] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4112();
		}
		local36.anInt5056++;
		local38++;
		@Pc(83) int local83 = local36.anInt5056;
		local36.anInt5056 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray66[local91 + local36.anInt5056] != 0; local91++) {
		}
		@Pc(108) byte[] local108 = new byte[local91];
		for (@Pc(110) int local110 = 0; local110 < local91; local110++) {
			local108[local110] = local36.method4112();
		}
		local36.anInt5056++;
		local91++;
		@Pc(136) int local136 = local36.anInt5056;
		local36.anInt5056 += local91;
		@Pc(144) int local144;
		for (local144 = 0; local36.aByteArray66[local144 + local36.anInt5056] != 0; local144++) {
		}
		@Pc(158) byte[] local158 = new byte[local144];
		for (@Pc(160) int local160 = 0; local160 < local144; local160++) {
			local158[local160] = local36.method4112();
		}
		local144++;
		local36.anInt5056++;
		@Pc(186) byte[] local186 = new byte[local144];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local144 > 1) {
			local186[1] = 1;
			local195 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local144; local199++) {
				local205 = local36.method4130();
				if (local205 == 0) {
					local197 = local195++;
				} else {
					if (local197 >= local205) {
						local205--;
					}
					local197 = local205;
				}
				local186[local199] = (byte) local197;
			}
		} else {
			local195 = local144;
		}
		@Pc(237) Class68[] local237 = new Class68[local195];
		for (local199 = 0; local199 < local237.length; local199++) {
			@Pc(249) Class68 local249 = local237[local199] = new Class68();
			@Pc(253) int local253 = local36.method4130();
			if (local253 > 0) {
				local249.aByteArray26 = new byte[local253 * 2];
			}
			local253 = local36.method4130();
			if (local253 > 0) {
				local249.aByteArray27 = new byte[local253 * 2 + 2];
				local249.aByteArray27[1] = 64;
			}
		}
		local205 = local36.method4130();
		@Pc(308) byte[] local308 = local205 > 0 ? new byte[local205 * 2] : null;
		local205 = local36.method4130();
		@Pc(324) byte[] local324 = local205 > 0 ? new byte[local205 * 2] : null;
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray66[local326 + local36.anInt5056] != 0; local326++) {
		}
		@Pc(343) byte[] local343 = new byte[local326];
		for (@Pc(345) int local345 = 0; local345 < local326; local345++) {
			local343[local345] = local36.method4112();
		}
		local36.anInt5056++;
		local326++;
		@Pc(366) int local366 = 0;
		for (@Pc(368) int local368 = 0; local368 < 128; local368++) {
			local366 += local36.method4130();
			this.aShortArray50[local368] = (short) local366;
		}
		local366 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local366 += local36.method4130();
			this.aShortArray50[local390] = (short) (this.aShortArray50[local390] + (local366 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local417 < local343.length) {
					local415 = local343[local417++];
				} else {
					local415 = -1;
				}
				local419 = local36.method4108();
			}
			this.aShortArray50[local421] = (short) (this.aShortArray50[local421] + ((local419 - 1 & 0x2) << 14));
			local415--;
			this.anIntArray264[local421] = local419;
		}
		local415 = 0;
		local417 = 0;
		@Pc(478) int local478 = 0;
		for (@Pc(480) int local480 = 0; local480 < 128; local480++) {
			if (this.anIntArray264[local480] != 0) {
				if (local415 == 0) {
					if (local417 < local55.length) {
						local415 = local55[local417++];
					} else {
						local415 = -1;
					}
					local478 = local36.aByteArray66[local83++] - 1;
				}
				local415--;
				this.aByteArray49[local480] = (byte) local478;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(534) int local534 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray264[local536] != 0) {
				if (local415 == 0) {
					if (local108.length > local417) {
						local415 = local108[local417++];
					} else {
						local415 = -1;
					}
					local534 = local36.aByteArray66[local136++] + 16 << 2;
				}
				this.aByteArray48[local536] = (byte) local534;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(588) Class68 local588 = null;
		for (@Pc(590) int local590 = 0; local590 < 128; local590++) {
			if (this.anIntArray264[local590] != 0) {
				if (local415 == 0) {
					local588 = local237[local186[local417]];
					if (local417 < local158.length) {
						local415 = local158[local417++];
					} else {
						local415 = -1;
					}
				}
				local415--;
				this.aClass68Array1[local590] = local588;
			}
		}
		local417 = 0;
		local415 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local415 == 0) {
				if (local417 < local343.length) {
					local415 = local343[local417++];
				} else {
					local415 = -1;
				}
				if (this.anIntArray264[local638] > 0) {
					local636 = local36.method4130() + 1;
				}
			}
			local415--;
			this.aByteArray47[local638] = (byte) local636;
		}
		this.anInt3114 = local36.method4130() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local195; local693++) {
			@Pc(699) Class68 local699 = local237[local693];
			if (local699.aByteArray26 != null) {
				for (local704 = 1; local704 < local699.aByteArray26.length; local704 += 2) {
					local699.aByteArray26[local704] = local36.method4112();
				}
			}
			if (local699.aByteArray27 != null) {
				for (local704 = 3; local704 < local699.aByteArray27.length - 2; local704 += 2) {
					local699.aByteArray27[local704] = local36.method4112();
				}
			}
		}
		@Pc(753) int local753;
		if (local308 != null) {
			for (local753 = 1; local753 < local308.length; local753 += 2) {
				local308[local753] = local36.method4112();
			}
		}
		if (local324 != null) {
			for (local753 = 1; local753 < local324.length; local753 += 2) {
				local324[local753] = local36.method4112();
			}
		}
		@Pc(806) int local806;
		for (local753 = 0; local753 < local195; local753++) {
			@Pc(799) Class68 local799 = local237[local753];
			if (local799.aByteArray27 != null) {
				local366 = 0;
				for (local806 = 2; local806 < local799.aByteArray27.length; local806 += 2) {
					local366 = local36.method4130() + local366 + 1;
					local799.aByteArray27[local806] = (byte) local366;
				}
			}
		}
		@Pc(855) int local855;
		for (local704 = 0; local704 < local195; local704++) {
			@Pc(848) Class68 local848 = local237[local704];
			if (local848.aByteArray26 != null) {
				local366 = 0;
				for (local855 = 2; local855 < local848.aByteArray26.length; local855 += 2) {
					local366 -= -local36.method4130() - 1;
					local848.aByteArray26[local855] = (byte) local366;
				}
			}
		}
		@Pc(924) int local924;
		@Pc(947) int local947;
		@Pc(953) byte local953;
		@Pc(973) int local973;
		@Pc(975) int local975;
		@Pc(984) int local984;
		@Pc(918) byte local918;
		@Pc(1029) int local1029;
		if (local308 != null) {
			local366 = local36.method4130();
			local308[0] = (byte) local366;
			for (local806 = 2; local806 < local308.length; local806 += 2) {
				local366 = local36.method4130() + local366 + 1;
				local308[local806] = (byte) local366;
			}
			local918 = local308[0];
			@Pc(922) byte local922 = local308[1];
			for (local924 = 0; local924 < local918; local924++) {
				this.aByteArray47[local924] = (byte) (local922 * this.aByteArray47[local924] + 32 >> 6);
			}
			for (local947 = 2; local947 < local308.length; local947 += 2) {
				local953 = local308[local947];
				@Pc(959) byte local959 = local308[local947 + 1];
				local973 = (local953 - local918) / 2 + (local953 - local918) * local922;
				for (local975 = local918; local975 < local953; local975++) {
					local984 = Static236.method4585(local953 - local918, local973);
					local973 += local959 - local922;
					this.aByteArray47[local975] = (byte) (local984 * this.aByteArray47[local975] + 32 >> 6);
				}
				local922 = local959;
				local918 = local953;
			}
			for (local1029 = local918; local1029 < 128; local1029++) {
				this.aByteArray47[local1029] = (byte) (this.aByteArray47[local1029] * local922 + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local324 != null) {
			local366 = local36.method4130();
			local324[0] = (byte) local366;
			for (local806 = 2; local806 < local324.length; local806 += 2) {
				local366 += local36.method4130() + 1;
				local324[local806] = (byte) local366;
			}
			local918 = local324[0];
			local1097 = local324[1] << 1;
			for (local924 = 0; local924 < local918; local924++) {
				local947 = (this.aByteArray48[local924] & 0xFF) + local1097;
				if (local947 < 0) {
					local947 = 0;
				}
				if (local947 > 128) {
					local947 = 128;
				}
				this.aByteArray48[local924] = (byte) local947;
			}
			@Pc(1145) int local1145;
			for (local947 = 2; local947 < local324.length; local947 += 2) {
				local953 = local324[local947];
				local1145 = local324[local947 + 1] << 1;
				local973 = (local953 - local918) / 2 + (local953 - local918) * local1097;
				for (local975 = local918; local975 < local953; local975++) {
					local984 = Static236.method4585(local953 - local918, local973);
					@Pc(1179) int local1179 = local984 + (this.aByteArray48[local975] & 0xFF);
					if (local1179 < 0) {
						local1179 = 0;
					}
					if (local1179 > 128) {
						local1179 = 128;
					}
					this.aByteArray48[local975] = (byte) local1179;
					local973 += local1145 - local1097;
				}
				local918 = local953;
				local1097 = local1145;
			}
			for (local1029 = local918; local1029 < 128; local1029++) {
				local1145 = local1097 + (this.aByteArray48[local1029] & 0xFF);
				if (local1145 < 0) {
					local1145 = 0;
				}
				if (local1145 > 128) {
					local1145 = 128;
				}
				this.aByteArray48[local1029] = (byte) local1145;
			}
		}
		for (local806 = 0; local806 < local195; local806++) {
			local237[local806].anInt1732 = local36.method4130();
		}
		for (local855 = 0; local855 < local195; local855++) {
			@Pc(1273) Class68 local1273 = local237[local855];
			if (local1273.aByteArray26 != null) {
				local1273.anInt1729 = local36.method4130();
			}
			if (local1273.aByteArray27 != null) {
				local1273.anInt1735 = local36.method4130();
			}
			if (local1273.anInt1732 > 0) {
				local1273.anInt1734 = local36.method4130();
			}
		}
		for (local1097 = 0; local1097 < local195; local1097++) {
			local237[local1097].anInt1727 = local36.method4130();
		}
		for (local924 = 0; local924 < local195; local924++) {
			@Pc(1335) Class68 local1335 = local237[local924];
			if (local1335.anInt1727 > 0) {
				local1335.anInt1730 = local36.method4130();
			}
		}
		for (local947 = 0; local947 < local195; local947++) {
			@Pc(1362) Class68 local1362 = local237[local947];
			if (local1362.anInt1730 > 0) {
				local1362.anInt1731 = local36.method4130();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[BLclient!tm;I)Z")
	public boolean method2669(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class227 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub32_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray264[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method5315(local33 >> 2, arg0);
						} else {
							local16 = arg2.method5318(arg0, local33 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub32_Sub1Array1[local18] = local16;
						this.anIntArray264[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method2670() {
		this.anIntArray264 = null;
	}
}
