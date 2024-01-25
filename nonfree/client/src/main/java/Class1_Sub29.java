import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[Lclient!ta;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[Lclient!uk;")
	public Class1_Sub31_Sub1[] aClass1_Sub31_Sub1Array1;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
	private int[] anIntArray471;

	static {
		new Class169(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	private Class1_Sub29() {
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
	public Class1_Sub29(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub31_Sub1Array1 = new Class1_Sub31_Sub1[128];
		this.aShortArray82 = new short[128];
		this.aByteArray67 = new byte[128];
		this.aClass218Array1 = new Class218[128];
		this.aByteArray65 = new byte[128];
		this.anIntArray471 = new int[128];
		this.aByteArray66 = new byte[128];
		@Pc(36) Class1_Sub33 local36 = new Class1_Sub33(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray86[local36.lb + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method5188();
		}
		local38++;
		local36.lb++;
		@Pc(84) int local84 = local36.lb;
		local36.lb += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray86[local36.lb + local92] != 0; local92++) {
		}
		@Pc(106) byte[] local106 = new byte[local92];
		for (@Pc(108) int local108 = 0; local108 < local92; local108++) {
			local106[local108] = local36.method5188();
		}
		local92++;
		local36.lb++;
		@Pc(130) int local130 = local36.lb;
		local36.lb += local92;
		@Pc(138) int local138;
		for (local138 = 0; local36.aByteArray86[local138 + local36.lb] != 0; local138++) {
		}
		@Pc(152) byte[] local152 = new byte[local138];
		for (@Pc(154) int local154 = 0; local154 < local138; local154++) {
			local152[local154] = local36.method5188();
		}
		local36.lb++;
		local138++;
		@Pc(176) byte[] local176 = new byte[local138];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local138 <= 1) {
			local183 = local138;
		} else {
			local176[1] = 1;
			local183 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local138; local195++) {
				local201 = local36.method5174();
				if (local201 == 0) {
					local193 = local183++;
				} else {
					if (local201 <= local193) {
						local201--;
					}
					local193 = local201;
				}
				local176[local195] = (byte) local193;
			}
		}
		@Pc(229) Class218[] local229 = new Class218[local183];
		for (local195 = 0; local195 < local229.length; local195++) {
			@Pc(241) Class218 local241 = local229[local195] = new Class218();
			@Pc(245) int local245 = local36.method5174();
			if (local245 > 0) {
				local241.aByteArray81 = new byte[local245 * 2];
			}
			local245 = local36.method5174();
			if (local245 > 0) {
				local241.aByteArray80 = new byte[local245 * 2 + 2];
				local241.aByteArray80[1] = 64;
			}
		}
		local201 = local36.method5174();
		@Pc(293) byte[] local293 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local36.method5174();
		@Pc(309) byte[] local309 = local201 <= 0 ? null : new byte[local201 * 2];
		@Pc(311) int local311;
		for (local311 = 0; local36.aByteArray86[local36.lb + local311] != 0; local311++) {
		}
		@Pc(328) byte[] local328 = new byte[local311];
		for (@Pc(330) int local330 = 0; local330 < local311; local330++) {
			local328[local330] = local36.method5188();
		}
		local36.lb++;
		local311++;
		@Pc(355) int local355 = 0;
		for (@Pc(357) int local357 = 0; local357 < 128; local357++) {
			local355 += local36.method5174();
			this.aShortArray82[local357] = (short) local355;
		}
		local355 = 0;
		for (@Pc(379) int local379 = 0; local379 < 128; local379++) {
			local355 += local36.method5174();
			this.aShortArray82[local379] = (short) (this.aShortArray82[local379] + (local355 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local408 >= local328.length) {
					local406 = -1;
				} else {
					local406 = local328[local408++];
				}
				local410 = local36.method5168();
			}
			this.aShortArray82[local412] = (short) (this.aShortArray82[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray471[local412] = local410;
			local406--;
		}
		local408 = 0;
		local406 = 0;
		@Pc(471) int local471 = 0;
		for (@Pc(473) int local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray471[local473] != 0) {
				if (local406 == 0) {
					local471 = local36.aByteArray86[local84++] - 1;
					if (local408 >= local56.length) {
						local406 = -1;
					} else {
						local406 = local56[local408++];
					}
				}
				this.aByteArray67[local473] = (byte) local471;
				local406--;
			}
		}
		local406 = 0;
		local408 = 0;
		@Pc(527) int local527 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray471[local529] != 0) {
				if (local406 == 0) {
					local527 = local36.aByteArray86[local130++] + 16 << 2;
					if (local408 < local106.length) {
						local406 = local106[local408++];
					} else {
						local406 = -1;
					}
				}
				this.aByteArray65[local529] = (byte) local527;
				local406--;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(585) Class218 local585 = null;
		for (@Pc(587) int local587 = 0; local587 < 128; local587++) {
			if (this.anIntArray471[local587] != 0) {
				if (local406 == 0) {
					local585 = local229[local176[local408]];
					if (local408 >= local152.length) {
						local406 = -1;
					} else {
						local406 = local152[local408++];
					}
				}
				this.aClass218Array1[local587] = local585;
				local406--;
			}
		}
		local406 = 0;
		local408 = 0;
		@Pc(635) int local635 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local406 == 0) {
				if (local408 >= local328.length) {
					local406 = -1;
				} else {
					local406 = local328[local408++];
				}
				if (this.anIntArray471[local637] > 0) {
					local635 = local36.method5174() + 1;
				}
			}
			this.aByteArray66[local637] = (byte) local635;
			local406--;
		}
		this.anInt3770 = local36.method5174() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local183; local695++) {
			@Pc(701) Class218 local701 = local229[local695];
			if (local701.aByteArray81 != null) {
				for (local706 = 1; local706 < local701.aByteArray81.length; local706 += 2) {
					local701.aByteArray81[local706] = local36.method5188();
				}
			}
			if (local701.aByteArray80 != null) {
				for (local706 = 3; local706 < local701.aByteArray80.length - 2; local706 += 2) {
					local701.aByteArray80[local706] = local36.method5188();
				}
			}
		}
		@Pc(755) int local755;
		if (local293 != null) {
			for (local755 = 1; local755 < local293.length; local755 += 2) {
				local293[local755] = local36.method5188();
			}
		}
		if (local309 != null) {
			for (local755 = 1; local755 < local309.length; local755 += 2) {
				local309[local755] = local36.method5188();
			}
		}
		@Pc(804) int local804;
		for (local755 = 0; local755 < local183; local755++) {
			@Pc(797) Class218 local797 = local229[local755];
			if (local797.aByteArray80 != null) {
				local355 = 0;
				for (local804 = 2; local804 < local797.aByteArray80.length; local804 += 2) {
					local355 -= -local36.method5174() - 1;
					local797.aByteArray80[local804] = (byte) local355;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local183; local706++) {
			@Pc(842) Class218 local842 = local229[local706];
			if (local842.aByteArray81 != null) {
				local355 = 0;
				for (local849 = 2; local849 < local842.aByteArray81.length; local849 += 2) {
					local355 = local355 + local36.method5174() + 1;
					local842.aByteArray81[local849] = (byte) local355;
				}
			}
		}
		@Pc(926) int local926;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(975) int local975;
		@Pc(977) int local977;
		@Pc(986) int local986;
		@Pc(920) byte local920;
		@Pc(1031) int local1031;
		if (local293 != null) {
			local355 = local36.method5174();
			local293[0] = (byte) local355;
			for (local804 = 2; local804 < local293.length; local804 += 2) {
				local355 = local36.method5174() + local355 + 1;
				local293[local804] = (byte) local355;
			}
			local920 = local293[0];
			@Pc(924) byte local924 = local293[1];
			for (local926 = 0; local926 < local920; local926++) {
				this.aByteArray66[local926] = (byte) (this.aByteArray66[local926] * local924 + 32 >> 6);
			}
			local949 = 2;
			while (local949 < local293.length) {
				local955 = local293[local949];
				@Pc(961) byte local961 = local293[local949 + 1];
				local975 = (local955 - local920) / 2 + (local955 - local920) * local924;
				for (local977 = local920; local977 < local955; local977++) {
					local986 = Static390.method5536(local975, local955 - local920);
					local975 += local961 - local924;
					this.aByteArray66[local977] = (byte) (this.aByteArray66[local977] * local986 + 32 >> 6);
				}
				local949 += 2;
				local920 = local955;
				local924 = local961;
			}
			for (local1031 = local920; local1031 < 128; local1031++) {
				this.aByteArray66[local1031] = (byte) (local924 * this.aByteArray66[local1031] + 32 >> 6);
			}
		}
		@Pc(1103) int local1103;
		if (local309 != null) {
			local355 = local36.method5174();
			local309[0] = (byte) local355;
			for (local804 = 2; local804 < local309.length; local804 += 2) {
				local355 = local36.method5174() + local355 + 1;
				local309[local804] = (byte) local355;
			}
			local920 = local309[0];
			local1103 = local309[1] << 1;
			for (local926 = 0; local926 < local920; local926++) {
				local949 = (this.aByteArray65[local926] & 0xFF) + local1103;
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray65[local926] = (byte) local949;
			}
			local949 = 2;
			@Pc(1157) int local1157;
			while (local949 < local309.length) {
				local955 = local309[local949];
				local1157 = local309[local949 + 1] << 1;
				local975 = (local955 - local920) / 2 + (local955 - local920) * local1103;
				for (local977 = local920; local977 < local955; local977++) {
					local986 = Static390.method5536(local975, local955 - local920);
					@Pc(1191) int local1191 = (this.aByteArray65[local977] & 0xFF) + local986;
					if (local1191 < 0) {
						local1191 = 0;
					}
					if (local1191 > 128) {
						local1191 = 128;
					}
					local975 += local1157 - local1103;
					this.aByteArray65[local977] = (byte) local1191;
				}
				local949 += 2;
				local920 = local955;
				local1103 = local1157;
			}
			for (local1031 = local920; local1031 < 128; local1031++) {
				local1157 = local1103 + (this.aByteArray65[local1031] & 0xFF);
				if (local1157 < 0) {
					local1157 = 0;
				}
				if (local1157 > 128) {
					local1157 = 128;
				}
				this.aByteArray65[local1031] = (byte) local1157;
			}
		}
		for (local804 = 0; local804 < local183; local804++) {
			local229[local804].anInt5574 = local36.method5174();
		}
		for (local849 = 0; local849 < local183; local849++) {
			@Pc(1292) Class218 local1292 = local229[local849];
			if (local1292.aByteArray81 != null) {
				local1292.anInt5564 = local36.method5174();
			}
			if (local1292.aByteArray80 != null) {
				local1292.anInt5569 = local36.method5174();
			}
			if (local1292.anInt5574 > 0) {
				local1292.anInt5565 = local36.method5174();
			}
		}
		for (local1103 = 0; local1103 < local183; local1103++) {
			local229[local1103].anInt5570 = local36.method5174();
		}
		for (local926 = 0; local926 < local183; local926++) {
			@Pc(1347) Class218 local1347 = local229[local926];
			if (local1347.anInt5570 > 0) {
				local1347.anInt5566 = local36.method5174();
			}
		}
		for (local949 = 0; local949 < local183; local949++) {
			@Pc(1367) Class218 local1367 = local229[local949];
			if (local1367.anInt5566 > 0) {
				local1367.anInt5575 = local36.method5174();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public void method3076() {
		this.anIntArray471 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([IILclient!fj;[B)Z")
	public boolean method3077(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub31_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray471[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method1463(arg0, local25 >> 2);
						} else {
							local11 = arg1.method1459(local25 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub31_Sub1Array1[local13] = local11;
						this.anIntArray471[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
