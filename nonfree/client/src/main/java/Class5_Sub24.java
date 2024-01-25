import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	public int anInt3666;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[Lclient!em;")
	public Class61[] aClass61Array1;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "[Lclient!dg;")
	public Class5_Sub10_Sub1[] aClass5_Sub10_Sub1Array1;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	private Class5_Sub24() {
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
	public Class5_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aClass61Array1 = new Class61[128];
		this.aShortArray53 = new short[128];
		this.aByteArray50 = new byte[128];
		this.anIntArray362 = new int[128];
		this.aClass5_Sub10_Sub1Array1 = new Class5_Sub10_Sub1[128];
		this.aByteArray51 = new byte[128];
		this.aByteArray52 = new byte[128];
		@Pc(36) Class5_Sub12 local36 = new Class5_Sub12(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray90[local38 + local36.anInt5731] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method5098();
		}
		local36.anInt5731++;
		local38++;
		@Pc(76) int local76 = local36.anInt5731;
		local36.anInt5731 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray90[local84 + local36.anInt5731] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method5098();
		}
		local84++;
		local36.anInt5731++;
		@Pc(126) int local126 = local36.anInt5731;
		local36.anInt5731 += local84;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray90[local36.anInt5731 + local134] != 0; local134++) {
		}
		@Pc(149) byte[] local149 = new byte[local134];
		for (@Pc(151) int local151 = 0; local151 < local134; local151++) {
			local149[local151] = local36.method5098();
		}
		local134++;
		local36.anInt5731++;
		@Pc(173) byte[] local173 = new byte[local134];
		@Pc(184) int local184;
		@Pc(186) int local186;
		@Pc(192) int local192;
		if (local134 > 1) {
			local173[1] = 1;
			@Pc(182) int local182 = 1;
			local184 = 2;
			for (local186 = 2; local186 < local134; local186++) {
				local192 = local36.method5115();
				if (local192 == 0) {
					local182 = local184++;
				} else {
					if (local182 >= local192) {
						local192--;
					}
					local182 = local192;
				}
				local173[local186] = (byte) local182;
			}
		} else {
			local184 = local134;
		}
		@Pc(229) Class61[] local229 = new Class61[local184];
		for (local186 = 0; local186 < local229.length; local186++) {
			@Pc(241) Class61 local241 = local229[local186] = new Class61();
			@Pc(245) int local245 = local36.method5115();
			if (local245 > 0) {
				local241.aByteArray16 = new byte[local245 * 2];
			}
			local245 = local36.method5115();
			if (local245 > 0) {
				local241.aByteArray15 = new byte[local245 * 2 + 2];
				local241.aByteArray15[1] = 64;
			}
		}
		local192 = local36.method5115();
		@Pc(297) byte[] local297 = local192 > 0 ? new byte[local192 * 2] : null;
		local192 = local36.method5115();
		@Pc(310) byte[] local310 = local192 > 0 ? new byte[local192 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray90[local312 + local36.anInt5731] != 0; local312++) {
		}
		@Pc(326) byte[] local326 = new byte[local312];
		for (@Pc(328) int local328 = 0; local328 < local312; local328++) {
			local326[local328] = local36.method5098();
		}
		local312++;
		local36.anInt5731++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method5115();
			this.aShortArray53[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method5115();
			this.aShortArray53[local377] = (short) (this.aShortArray53[local377] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local326.length > local406) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				local408 = local36.method5062();
			}
			this.aShortArray53[local410] = (short) (this.aShortArray53[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray362[local410] = local408;
			local404--;
		}
		local404 = 0;
		local406 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray362[local468] != 0) {
				if (local404 == 0) {
					local466 = local36.aByteArray90[local76++] - 1;
					if (local52.length <= local406) {
						local404 = -1;
					} else {
						local404 = local52[local406++];
					}
				}
				local404--;
				this.aByteArray50[local468] = (byte) local466;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray362[local526] != 0) {
				if (local404 == 0) {
					local524 = local36.aByteArray90[local126++] + 16 << 2;
					if (local406 < local98.length) {
						local404 = local98[local406++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aByteArray51[local526] = (byte) local524;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(583) Class61 local583 = null;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray362[local585] != 0) {
				if (local404 == 0) {
					local583 = local229[local173[local406]];
					if (local149.length <= local406) {
						local404 = -1;
					} else {
						local404 = local149[local406++];
					}
				}
				this.aClass61Array1[local585] = local583;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(635) int local635 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local404 == 0) {
				if (local326.length > local406) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				if (this.anIntArray362[local637] > 0) {
					local635 = local36.method5115() + 1;
				}
			}
			local404--;
			this.aByteArray52[local637] = (byte) local635;
		}
		this.anInt3666 = local36.method5115() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local184; local697++) {
			@Pc(703) Class61 local703 = local229[local697];
			if (local703.aByteArray16 != null) {
				for (local708 = 1; local708 < local703.aByteArray16.length; local708 += 2) {
					local703.aByteArray16[local708] = local36.method5098();
				}
			}
			if (local703.aByteArray15 != null) {
				for (local708 = 3; local708 < local703.aByteArray15.length - 2; local708 += 2) {
					local703.aByteArray15[local708] = local36.method5098();
				}
			}
		}
		@Pc(761) int local761;
		if (local297 != null) {
			for (local761 = 1; local761 < local297.length; local761 += 2) {
				local297[local761] = local36.method5098();
			}
		}
		if (local310 != null) {
			for (local761 = 1; local761 < local310.length; local761 += 2) {
				local310[local761] = local36.method5098();
			}
		}
		@Pc(810) int local810;
		for (local761 = 0; local761 < local184; local761++) {
			@Pc(803) Class61 local803 = local229[local761];
			if (local803.aByteArray15 != null) {
				local353 = 0;
				for (local810 = 2; local810 < local803.aByteArray15.length; local810 += 2) {
					local353 = local36.method5115() + local353 + 1;
					local803.aByteArray15[local810] = (byte) local353;
				}
			}
		}
		@Pc(851) int local851;
		for (local708 = 0; local708 < local184; local708++) {
			@Pc(844) Class61 local844 = local229[local708];
			if (local844.aByteArray16 != null) {
				local353 = 0;
				for (local851 = 2; local851 < local844.aByteArray16.length; local851 += 2) {
					local353 = local36.method5115() + local353 + 1;
					local844.aByteArray16[local851] = (byte) local353;
				}
			}
		}
		@Pc(932) int local932;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(981) int local981;
		@Pc(983) int local983;
		@Pc(992) int local992;
		@Pc(926) byte local926;
		@Pc(1030) int local1030;
		if (local297 != null) {
			local353 = local36.method5115();
			local297[0] = (byte) local353;
			for (local810 = 2; local810 < local297.length; local810 += 2) {
				local353 = local36.method5115() + local353 + 1;
				local297[local810] = (byte) local353;
			}
			local926 = local297[0];
			@Pc(930) byte local930 = local297[1];
			for (local932 = 0; local932 < local926; local932++) {
				this.aByteArray52[local932] = (byte) (local930 * this.aByteArray52[local932] + 32 >> 6);
			}
			local955 = 2;
			while (local297.length > local955) {
				local961 = local297[local955];
				@Pc(967) byte local967 = local297[local955 + 1];
				local981 = (local961 - local926) * local930 + (local961 - local926) / 2;
				for (local983 = local926; local983 < local961; local983++) {
					local992 = Static296.method5126(local961 - local926, local981);
					local981 += local967 - local930;
					this.aByteArray52[local983] = (byte) (this.aByteArray52[local983] * local992 + 32 >> 6);
				}
				local926 = local961;
				local955 += 2;
				local930 = local967;
			}
			for (local1030 = local926; local1030 < 128; local1030++) {
				this.aByteArray52[local1030] = (byte) (local930 * this.aByteArray52[local1030] + 32 >> 6);
			}
		}
		@Pc(1094) int local1094;
		if (local310 != null) {
			local353 = local36.method5115();
			local310[0] = (byte) local353;
			for (local810 = 2; local810 < local310.length; local810 += 2) {
				local353 = local36.method5115() + local353 + 1;
				local310[local810] = (byte) local353;
			}
			local926 = local310[0];
			local1094 = local310[1] << 1;
			for (local932 = 0; local932 < local926; local932++) {
				local955 = (this.aByteArray51[local932] & 0xFF) + local1094;
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray51[local932] = (byte) local955;
			}
			@Pc(1148) int local1148;
			for (local955 = 2; local955 < local310.length; local955 += 2) {
				local961 = local310[local955];
				local1148 = local310[local955 + 1] << 1;
				local981 = (local961 - local926) / 2 + local1094 * (local961 - local926);
				for (local983 = local926; local983 < local961; local983++) {
					local992 = Static296.method5126(local961 - local926, local981);
					@Pc(1183) int local1183 = (this.aByteArray51[local983] & 0xFF) + local992;
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray51[local983] = (byte) local1183;
					local981 += local1148 - local1094;
				}
				local926 = local961;
				local1094 = local1148;
			}
			for (local1030 = local926; local1030 < 128; local1030++) {
				local1148 = local1094 + (this.aByteArray51[local1030] & 0xFF);
				if (local1148 < 0) {
					local1148 = 0;
				}
				if (local1148 > 128) {
					local1148 = 128;
				}
				this.aByteArray51[local1030] = (byte) local1148;
			}
		}
		for (local810 = 0; local810 < local184; local810++) {
			local229[local810].anInt1448 = local36.method5115();
		}
		for (local851 = 0; local851 < local184; local851++) {
			@Pc(1287) Class61 local1287 = local229[local851];
			if (local1287.aByteArray16 != null) {
				local1287.anInt1443 = local36.method5115();
			}
			if (local1287.aByteArray15 != null) {
				local1287.anInt1452 = local36.method5115();
			}
			if (local1287.anInt1448 > 0) {
				local1287.anInt1451 = local36.method5115();
			}
		}
		for (local1094 = 0; local1094 < local184; local1094++) {
			local229[local1094].anInt1453 = local36.method5115();
		}
		for (local932 = 0; local932 < local184; local932++) {
			@Pc(1349) Class61 local1349 = local229[local932];
			if (local1349.anInt1453 > 0) {
				local1349.anInt1442 = local36.method5115();
			}
		}
		for (local955 = 0; local955 < local184; local955++) {
			@Pc(1373) Class61 local1373 = local229[local955];
			if (local1373.anInt1442 > 0) {
				local1373.anInt1446 = local36.method5115();
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	public void method3317() {
		this.anIntArray362 = null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!wo;B[B[I)Z")
	public boolean method3320(@OriginalArg(0) Class217 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class5_Sub10_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg1 == null || arg1[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray362[local19];
				if (local34 != 0) {
					if (local15 != local34) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg0.method6029(local34 >> 2, arg2);
						} else {
							local17 = arg0.method6028(local34 >> 2, arg2);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass5_Sub10_Sub1Array1[local19] = local17;
						this.anIntArray362[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
