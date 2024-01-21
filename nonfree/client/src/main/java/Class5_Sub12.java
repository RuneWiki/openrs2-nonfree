import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[B")
	public final byte[] aByteArray23 = new byte[128];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray258 = new int[128];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[B")
	public final byte[] aByteArray24 = new byte[128];

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public final int anInt1696;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "[Lclient!d;")
	public final Class14[] aClass14Array1 = new Class14[128];

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "[B")
	public final byte[] aByteArray25 = new byte[128];

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "[S")
	public final short[] aShortArray6 = new short[128];

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "[Lclient!e;")
	public final Class5_Sub5_Sub1[] aClass5_Sub5_Sub1Array1 = new Class5_Sub5_Sub1[128];

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class5_Sub12(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class5_Sub9 local36 = new Class5_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray28[local38 + local36.anInt2140] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method1447();
		}
		local38++;
		local36.anInt2140++;
		@Pc(79) int local79 = local36.anInt2140;
		local36.anInt2140 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray28[local87 + local36.anInt2140] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method1447();
		}
		local87++;
		local36.anInt2140++;
		@Pc(128) int local128 = 0;
		@Pc(131) int local131 = local36.anInt2140;
		local36.anInt2140 += local87;
		while (local36.aByteArray28[local128 + local36.anInt2140] != 0) {
			local128++;
		}
		@Pc(154) byte[] local154 = new byte[local128];
		for (@Pc(156) int local156 = 0; local156 < local128; local156++) {
			local154[local156] = local36.method1447();
		}
		local128++;
		local36.anInt2140++;
		@Pc(182) byte[] local182 = new byte[local128];
		@Pc(193) int local193;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local128 > 1) {
			local182[1] = 1;
			local193 = 2;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local128; local197++) {
				local203 = local36.method1408();
				if (local203 == 0) {
					local195 = local193++;
				} else {
					if (local195 >= local203) {
						local203--;
					}
					local195 = local203;
				}
				local182[local197] = (byte) local195;
			}
		} else {
			local193 = local128;
		}
		@Pc(236) Class14[] local236 = new Class14[local193];
		for (local197 = 0; local197 < local236.length; local197++) {
			@Pc(248) Class14 local248 = local236[local197] = new Class14();
			@Pc(252) int local252 = local36.method1408();
			if (local252 > 0) {
				local248.aByteArray12 = new byte[local252 * 2];
			}
			local252 = local36.method1408();
			if (local252 > 0) {
				local248.aByteArray11 = new byte[local252 * 2 + 2];
				local248.aByteArray11[1] = 64;
			}
		}
		local203 = local36.method1408();
		@Pc(300) byte[] local300 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(302) int local302 = 0;
		local203 = local36.method1408();
		while (local36.aByteArray28[local36.anInt2140 + local302] != 0) {
			local302++;
		}
		@Pc(333) byte[] local333 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(336) byte[] local336 = new byte[local302];
		for (@Pc(338) int local338 = 0; local338 < local302; local338++) {
			local336[local338] = local36.method1447();
		}
		local302++;
		@Pc(353) int local353 = 0;
		local36.anInt2140++;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local353 += local36.method1408();
			this.aShortArray6[local361] = (short) local353;
		}
		local353 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local353 += local36.method1408();
			this.aShortArray6[local383] = (short) (this.aShortArray6[local383] + (local353 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local414 >= local336.length) {
					local410 = -1;
				} else {
					local410 = local336[local414++];
				}
				local412 = local36.method1406();
			}
			local410--;
			this.aShortArray6[local416] = (short) (this.aShortArray6[local416] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray258[local416] = local412;
		}
		local410 = 0;
		@Pc(471) int local471 = 0;
		local414 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray258[local475] != 0) {
				if (local410 == 0) {
					if (local55.length <= local414) {
						local410 = -1;
					} else {
						local410 = local55[local414++];
					}
					local471 = local36.aByteArray28[local79++] - 1;
				}
				local410--;
				this.aByteArray24[local475] = (byte) local471;
			}
		}
		local414 = 0;
		local410 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray258[local534] != 0) {
				if (local410 == 0) {
					local532 = local36.aByteArray28[local131++] + 16 << 2;
					if (local414 < local101.length) {
						local410 = local101[local414++];
					} else {
						local410 = -1;
					}
				}
				local410--;
				this.aByteArray25[local534] = (byte) local532;
			}
		}
		local414 = 0;
		local410 = 0;
		@Pc(589) Class14 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray258[local591] != 0) {
				if (local410 == 0) {
					local589 = local236[local182[local414]];
					if (local414 >= local154.length) {
						local410 = -1;
					} else {
						local410 = local154[local414++];
					}
				}
				this.aClass14Array1[local591] = local589;
				local410--;
			}
		}
		local410 = 0;
		local414 = 0;
		@Pc(644) int local644 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local410 == 0) {
				if (local336.length <= local414) {
					local410 = -1;
				} else {
					local410 = local336[local414++];
				}
				if (this.anIntArray258[local646] > 0) {
					local644 = local36.method1408() + 1;
				}
			}
			this.aByteArray23[local646] = (byte) local644;
			local410--;
		}
		this.anInt1696 = local36.method1408() + 1;
		@Pc(711) int local711;
		for (@Pc(700) int local700 = 0; local700 < local193; local700++) {
			@Pc(706) Class14 local706 = local236[local700];
			if (local706.aByteArray12 != null) {
				for (local711 = 1; local711 < local706.aByteArray12.length; local711 += 2) {
					local706.aByteArray12[local711] = local36.method1447();
				}
			}
			if (local706.aByteArray11 != null) {
				for (local711 = 3; local711 < local706.aByteArray11.length - 2; local711 += 2) {
					local706.aByteArray11[local711] = local36.method1447();
				}
			}
		}
		@Pc(760) int local760;
		if (local300 != null) {
			for (local760 = 1; local760 < local300.length; local760 += 2) {
				local300[local760] = local36.method1447();
			}
		}
		if (local333 != null) {
			for (local760 = 1; local760 < local333.length; local760 += 2) {
				local333[local760] = local36.method1447();
			}
		}
		@Pc(805) int local805;
		for (local760 = 0; local760 < local193; local760++) {
			@Pc(798) Class14 local798 = local236[local760];
			if (local798.aByteArray11 != null) {
				local353 = 0;
				for (local805 = 2; local805 < local798.aByteArray11.length; local805 += 2) {
					local353 = local353 + local36.method1408() + 1;
					local798.aByteArray11[local805] = (byte) local353;
				}
			}
		}
		@Pc(851) int local851;
		for (local711 = 0; local711 < local193; local711++) {
			@Pc(844) Class14 local844 = local236[local711];
			if (local844.aByteArray12 != null) {
				local353 = 0;
				for (local851 = 2; local851 < local844.aByteArray12.length; local851 += 2) {
					local353 -= -local36.method1408() - 1;
					local844.aByteArray12[local851] = (byte) local353;
				}
			}
		}
		@Pc(928) int local928;
		@Pc(955) int local955;
		@Pc(967) byte local967;
		@Pc(982) int local982;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(926) byte local926;
		@Pc(1035) int local1035;
		if (local300 != null) {
			local353 = local36.method1408();
			local300[0] = (byte) local353;
			for (local805 = 2; local805 < local300.length; local805 += 2) {
				local353 = local36.method1408() + local353 + 1;
				local300[local805] = (byte) local353;
			}
			@Pc(922) byte local922 = local300[1];
			local926 = local300[0];
			for (local928 = 0; local928 < local926; local928++) {
				this.aByteArray23[local928] = (byte) (this.aByteArray23[local928] * local922 + 32 >> 6);
			}
			local955 = 2;
			while (local300.length > local955) {
				@Pc(963) byte local963 = local300[local955 + 1];
				local967 = local300[local955];
				local982 = local922 * (local967 - local926) + (local967 - local926) / 2;
				for (local984 = local926; local984 < local967; local984++) {
					local994 = Static71.method1388(local967 - local926, local982);
					this.aByteArray23[local984] = (byte) (local994 * this.aByteArray23[local984] + 32 >> 6);
					local982 += local963 - local922;
				}
				local926 = local967;
				local955 += 2;
				local922 = local963;
			}
			for (local1035 = local926; local1035 < 128; local1035++) {
				this.aByteArray23[local1035] = (byte) (local922 * this.aByteArray23[local1035] + 32 >> 6);
			}
		}
		@Pc(1107) int local1107;
		if (local333 != null) {
			local353 = local36.method1408();
			local333[0] = (byte) local353;
			for (local805 = 2; local805 < local333.length; local805 += 2) {
				local353 = local353 + local36.method1408() + 1;
				local333[local805] = (byte) local353;
			}
			local926 = local333[0];
			local1107 = local333[1] << 1;
			for (local928 = 0; local928 < local926; local928++) {
				local955 = local1107 + (this.aByteArray25[local928] & 0xFF);
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray25[local928] = (byte) local955;
			}
			local955 = 2;
			@Pc(1162) int local1162;
			while (local955 < local333.length) {
				local967 = local333[local955];
				local1162 = local333[local955 + 1] << 1;
				local982 = (local967 - local926) / 2 + (local967 - local926) * local1107;
				local955 += 2;
				for (local984 = local926; local984 < local967; local984++) {
					local994 = Static71.method1388(local967 - local926, local982);
					local982 += local1162 - local1107;
					@Pc(1203) int local1203 = local994 + (this.aByteArray25[local984] & 0xFF);
					if (local1203 < 0) {
						local1203 = 0;
					}
					if (local1203 > 128) {
						local1203 = 128;
					}
					this.aByteArray25[local984] = (byte) local1203;
				}
				local1107 = local1162;
				local926 = local967;
			}
			for (local1035 = local926; local1035 < 128; local1035++) {
				local1162 = (this.aByteArray25[local1035] & 0xFF) + local1107;
				if (local1162 < 0) {
					local1162 = 0;
				}
				if (local1162 > 128) {
					local1162 = 128;
				}
				this.aByteArray25[local1035] = (byte) local1162;
			}
		}
		for (local805 = 0; local805 < local193; local805++) {
			local236[local805].anInt529 = local36.method1408();
		}
		for (local851 = 0; local851 < local193; local851++) {
			@Pc(1295) Class14 local1295 = local236[local851];
			if (local1295.aByteArray12 != null) {
				local1295.anInt524 = local36.method1408();
			}
			if (local1295.aByteArray11 != null) {
				local1295.anInt528 = local36.method1408();
			}
			if (local1295.anInt529 > 0) {
				local1295.anInt522 = local36.method1408();
			}
		}
		for (local1107 = 0; local1107 < local193; local1107++) {
			local236[local1107].anInt521 = local36.method1408();
		}
		for (local928 = 0; local928 < local193; local928++) {
			@Pc(1349) Class14 local1349 = local236[local928];
			if (local1349.anInt521 > 0) {
				local1349.anInt526 = local36.method1408();
			}
		}
		for (local955 = 0; local955 < local193; local955++) {
			@Pc(1373) Class14 local1373 = local236[local955];
			if (local1373.anInt526 > 0) {
				local1373.anInt527 = local36.method1408();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
	public void method1170() {
		this.anIntArray258 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!fb;[II[B)Z")
	public boolean method1172(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) int local13 = 0;
		@Pc(15) boolean local15 = true;
		@Pc(17) Class5_Sub5_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray258[local19];
				if (local34 != 0) {
					if (local13 != local34) {
						local13 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg0.method627(local34 >> 2, arg1);
						} else {
							local17 = arg0.method631(arg1, local34 >> 2);
						}
						if (local17 == null) {
							local15 = false;
						}
					}
					if (local17 != null) {
						this.aClass5_Sub5_Sub1Array1[local19] = local17;
						this.anIntArray258[local19] = 0;
					}
				}
			}
		}
		return local15;
	}
}
