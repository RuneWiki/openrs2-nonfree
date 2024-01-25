import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lclient!nd;")
	public Class3_Sub29_Sub1[] aClass3_Sub29_Sub1Array1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "[Lclient!af;")
	public Class6[] aClass6Array1;

	static {
		new Class57("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	private Class3_Sub37() {
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "([B)V")
	public Class3_Sub37(@OriginalArg(0) byte[] arg0) {
		this.anIntArray580 = new int[128];
		this.aByteArray71 = new byte[128];
		this.aClass6Array1 = new Class6[128];
		this.aByteArray70 = new byte[128];
		this.aShortArray82 = new short[128];
		this.aByteArray69 = new byte[128];
		this.aClass3_Sub29_Sub1Array1 = new Class3_Sub29_Sub1[128];
		@Pc(36) Class3_Sub5 local36 = new Class3_Sub5(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray42[local36.anInt3121 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method2753();
		}
		local38++;
		local36.anInt3121++;
		@Pc(80) int local80 = local36.anInt3121;
		local36.anInt3121 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray42[local36.anInt3121 + local88] != 0; local88++) {
		}
		@Pc(103) byte[] local103 = new byte[local88];
		for (@Pc(105) int local105 = 0; local105 < local88; local105++) {
			local103[local105] = local36.method2753();
		}
		local36.anInt3121++;
		local88++;
		@Pc(127) int local127 = local36.anInt3121;
		local36.anInt3121 += local88;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray42[local36.anInt3121 + local135] != 0; local135++) {
		}
		@Pc(152) byte[] local152 = new byte[local135];
		for (@Pc(154) int local154 = 0; local154 < local135; local154++) {
			local152[local154] = local36.method2753();
		}
		local36.anInt3121++;
		local135++;
		@Pc(176) byte[] local176 = new byte[local135];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local135 <= 1) {
			local181 = local135;
		} else {
			local176[1] = 1;
			@Pc(189) int local189 = 1;
			local181 = 2;
			for (local193 = 2; local193 < local135; local193++) {
				local199 = local36.method2739();
				if (local199 == 0) {
					local189 = local181++;
				} else {
					if (local189 >= local199) {
						local199--;
					}
					local189 = local199;
				}
				local176[local193] = (byte) local189;
			}
		}
		@Pc(224) Class6[] local224 = new Class6[local181];
		for (local193 = 0; local193 < local224.length; local193++) {
			@Pc(236) Class6 local236 = local224[local193] = new Class6();
			@Pc(240) int local240 = local36.method2739();
			if (local240 > 0) {
				local236.aByteArray3 = new byte[local240 * 2];
			}
			local240 = local36.method2739();
			if (local240 > 0) {
				local236.aByteArray2 = new byte[local240 * 2 + 2];
				local236.aByteArray2[1] = 64;
			}
		}
		local199 = local36.method2739();
		@Pc(291) byte[] local291 = local199 > 0 ? new byte[local199 * 2] : null;
		local199 = local36.method2739();
		@Pc(307) byte[] local307 = local199 <= 0 ? null : new byte[local199 * 2];
		@Pc(309) int local309;
		for (local309 = 0; local36.aByteArray42[local309 + local36.anInt3121] != 0; local309++) {
		}
		@Pc(326) byte[] local326 = new byte[local309];
		for (@Pc(328) int local328 = 0; local328 < local309; local328++) {
			local326[local328] = local36.method2753();
		}
		local309++;
		local36.anInt3121++;
		@Pc(349) int local349 = 0;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local349 += local36.method2739();
			this.aShortArray82[local351] = (short) local349;
		}
		local349 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local349 += local36.method2739();
			this.aShortArray82[local373] = (short) (this.aShortArray82[local373] + (local349 << 8));
		}
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		for (@Pc(406) int local406 = 0; local406 < 128; local406++) {
			if (local400 == 0) {
				if (local326.length <= local402) {
					local400 = -1;
				} else {
					local400 = local326[local402++];
				}
				local404 = local36.method2730();
			}
			this.aShortArray82[local406] = (short) (this.aShortArray82[local406] + ((local404 - 1 & 0x2) << 14));
			this.anIntArray580[local406] = local404;
			local400--;
		}
		local402 = 0;
		local400 = 0;
		@Pc(465) int local465 = 0;
		for (@Pc(467) int local467 = 0; local467 < 128; local467++) {
			if (this.anIntArray580[local467] != 0) {
				if (local400 == 0) {
					if (local402 < local52.length) {
						local400 = local52[local402++];
					} else {
						local400 = -1;
					}
					local465 = local36.aByteArray42[local80++] - 1;
				}
				local400--;
				this.aByteArray70[local467] = (byte) local465;
			}
		}
		local402 = 0;
		local400 = 0;
		@Pc(526) int local526 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray580[local528] != 0) {
				if (local400 == 0) {
					if (local402 >= local103.length) {
						local400 = -1;
					} else {
						local400 = local103[local402++];
					}
					local526 = local36.aByteArray42[local127++] + 16 << 2;
				}
				local400--;
				this.aByteArray69[local528] = (byte) local526;
			}
		}
		local400 = 0;
		local402 = 0;
		@Pc(585) Class6 local585 = null;
		for (@Pc(587) int local587 = 0; local587 < 128; local587++) {
			if (this.anIntArray580[local587] != 0) {
				if (local400 == 0) {
					local585 = local224[local176[local402]];
					if (local152.length <= local402) {
						local400 = -1;
					} else {
						local400 = local152[local402++];
					}
				}
				local400--;
				this.aClass6Array1[local587] = local585;
			}
		}
		local402 = 0;
		local400 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local400 == 0) {
				if (local326.length <= local402) {
					local400 = -1;
				} else {
					local400 = local326[local402++];
				}
				if (this.anIntArray580[local641] > 0) {
					local639 = local36.method2739() + 1;
				}
			}
			local400--;
			this.aByteArray71[local641] = (byte) local639;
		}
		this.anInt5234 = local36.method2739() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local181; local696++) {
			@Pc(702) Class6 local702 = local224[local696];
			if (local702.aByteArray3 != null) {
				for (local707 = 1; local707 < local702.aByteArray3.length; local707 += 2) {
					local702.aByteArray3[local707] = local36.method2753();
				}
			}
			if (local702.aByteArray2 != null) {
				for (local707 = 3; local707 < local702.aByteArray2.length - 2; local707 += 2) {
					local702.aByteArray2[local707] = local36.method2753();
				}
			}
		}
		@Pc(752) int local752;
		if (local291 != null) {
			for (local752 = 1; local752 < local291.length; local752 += 2) {
				local291[local752] = local36.method2753();
			}
		}
		if (local307 != null) {
			for (local752 = 1; local752 < local307.length; local752 += 2) {
				local307[local752] = local36.method2753();
			}
		}
		@Pc(801) int local801;
		for (local752 = 0; local752 < local181; local752++) {
			@Pc(794) Class6 local794 = local224[local752];
			if (local794.aByteArray2 != null) {
				local349 = 0;
				for (local801 = 2; local801 < local794.aByteArray2.length; local801 += 2) {
					local349 = local349 + local36.method2739() + 1;
					local794.aByteArray2[local801] = (byte) local349;
				}
			}
		}
		@Pc(847) int local847;
		for (local707 = 0; local707 < local181; local707++) {
			@Pc(840) Class6 local840 = local224[local707];
			if (local840.aByteArray3 != null) {
				local349 = 0;
				for (local847 = 2; local847 < local840.aByteArray3.length; local847 += 2) {
					local349 += local36.method2739() + 1;
					local840.aByteArray3[local847] = (byte) local349;
				}
			}
		}
		@Pc(924) int local924;
		@Pc(947) int local947;
		@Pc(953) byte local953;
		@Pc(972) int local972;
		@Pc(974) int local974;
		@Pc(984) int local984;
		@Pc(918) byte local918;
		@Pc(1023) int local1023;
		if (local291 != null) {
			local349 = local36.method2739();
			local291[0] = (byte) local349;
			for (local801 = 2; local801 < local291.length; local801 += 2) {
				local349 = local36.method2739() + local349 + 1;
				local291[local801] = (byte) local349;
			}
			local918 = local291[0];
			@Pc(922) byte local922 = local291[1];
			for (local924 = 0; local924 < local918; local924++) {
				this.aByteArray71[local924] = (byte) (local922 * this.aByteArray71[local924] + 32 >> 6);
			}
			local947 = 2;
			while (local947 < local291.length) {
				local953 = local291[local947];
				@Pc(959) byte local959 = local291[local947 + 1];
				local972 = (local953 - local918) / 2 + local922 * (local953 - local918);
				for (local974 = local918; local974 < local953; local974++) {
					local984 = Static172.method3207(local953 - local918, local972);
					this.aByteArray71[local974] = (byte) (this.aByteArray71[local974] * local984 + 32 >> 6);
					local972 += local959 - local922;
				}
				local947 += 2;
				local918 = local953;
				local922 = local959;
			}
			for (local1023 = local918; local1023 < 128; local1023++) {
				this.aByteArray71[local1023] = (byte) (this.aByteArray71[local1023] * local922 + 32 >> 6);
			}
		}
		@Pc(1093) int local1093;
		if (local307 != null) {
			local349 = local36.method2739();
			local307[0] = (byte) local349;
			for (local801 = 2; local801 < local307.length; local801 += 2) {
				local349 = local349 + local36.method2739() + 1;
				local307[local801] = (byte) local349;
			}
			local918 = local307[0];
			local1093 = local307[1] << 1;
			for (local924 = 0; local924 < local918; local924++) {
				local947 = (this.aByteArray69[local924] & 0xFF) + local1093;
				if (local947 < 0) {
					local947 = 0;
				}
				if (local947 > 128) {
					local947 = 128;
				}
				this.aByteArray69[local924] = (byte) local947;
			}
			@Pc(1148) int local1148;
			for (local947 = 2; local947 < local307.length; local947 += 2) {
				local953 = local307[local947];
				local1148 = local307[local947 + 1] << 1;
				local972 = (local953 - local918) / 2 + (local953 - local918) * local1093;
				for (local974 = local918; local974 < local953; local974++) {
					local984 = Static172.method3207(local953 - local918, local972);
					@Pc(1183) int local1183 = (this.aByteArray69[local974] & 0xFF) + local984;
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray69[local974] = (byte) local1183;
					local972 += local1148 - local1093;
				}
				local1093 = local1148;
				local918 = local953;
			}
			for (local1023 = local918; local1023 < 128; local1023++) {
				local1148 = (this.aByteArray69[local1023] & 0xFF) + local1093;
				if (local1148 < 0) {
					local1148 = 0;
				}
				if (local1148 > 128) {
					local1148 = 128;
				}
				this.aByteArray69[local1023] = (byte) local1148;
			}
		}
		for (local801 = 0; local801 < local181; local801++) {
			local224[local801].anInt117 = local36.method2739();
		}
		for (local847 = 0; local847 < local181; local847++) {
			@Pc(1286) Class6 local1286 = local224[local847];
			if (local1286.aByteArray3 != null) {
				local1286.anInt122 = local36.method2739();
			}
			if (local1286.aByteArray2 != null) {
				local1286.anInt126 = local36.method2739();
			}
			if (local1286.anInt117 > 0) {
				local1286.anInt123 = local36.method2739();
			}
		}
		for (local1093 = 0; local1093 < local181; local1093++) {
			local224[local1093].anInt120 = local36.method2739();
		}
		for (local924 = 0; local924 < local181; local924++) {
			@Pc(1341) Class6 local1341 = local224[local924];
			if (local1341.anInt120 > 0) {
				local1341.anInt118 = local36.method2739();
			}
		}
		for (local947 = 0; local947 < local181; local947++) {
			@Pc(1368) Class6 local1368 = local224[local947];
			if (local1368.anInt118 > 0) {
				local1368.anInt121 = local36.method2739();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method4679() {
		this.anIntArray580 = null;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B[BLclient!ui;[I)Z")
	public boolean method4680(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class231 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class3_Sub29_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray580[local18];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method5273(local30 >> 2, arg2);
						} else {
							local16 = arg1.method5271(arg2, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass3_Sub29_Sub1Array1[local18] = local16;
						this.anIntArray580[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
