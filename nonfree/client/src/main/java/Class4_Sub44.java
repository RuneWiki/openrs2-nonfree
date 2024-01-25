import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "[Lclient!hc;")
	public Class133[] aClass133Array1;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	public int anInt9052;

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!tea", name = "u", descriptor = "[Lclient!ep;")
	public Class4_Sub16_Sub1[] aClass4_Sub16_Sub1Array1;

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V")
	private Class4_Sub44() {
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "([B)V")
	public Class4_Sub44(@OriginalArg(0) byte[] arg0) {
		this.aByteArray99 = new byte[128];
		this.aClass4_Sub16_Sub1Array1 = new Class4_Sub16_Sub1[128];
		this.aByteArray100 = new byte[128];
		this.aClass133Array1 = new Class133[128];
		this.aByteArray98 = new byte[128];
		this.anIntArray489 = new int[128];
		this.aShortArray123 = new short[128];
		@Pc(36) Class4_Sub11 local36 = new Class4_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray68[local36.anInt5831 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4925();
		}
		local36.anInt5831++;
		local38++;
		@Pc(79) int local79 = local36.anInt5831;
		local36.anInt5831 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray68[local87 + local36.anInt5831] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method4925();
		}
		local36.anInt5831++;
		local87++;
		@Pc(132) int local132 = local36.anInt5831;
		local36.anInt5831 += local87;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray68[local140 + local36.anInt5831] != 0; local140++) {
		}
		@Pc(154) byte[] local154 = new byte[local140];
		for (@Pc(156) int local156 = 0; local156 < local140; local156++) {
			local154[local156] = local36.method4925();
		}
		local36.anInt5831++;
		local140++;
		@Pc(182) byte[] local182 = new byte[local140];
		@Pc(193) int local193;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local140 > 1) {
			local182[1] = 1;
			local193 = 2;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local140; local197++) {
				local203 = local36.method4905();
				if (local203 == 0) {
					local195 = local193++;
				} else {
					if (local203 <= local195) {
						local203--;
					}
					local195 = local203;
				}
				local182[local197] = (byte) local195;
			}
		} else {
			local193 = local140;
		}
		@Pc(239) Class133[] local239 = new Class133[local193];
		for (local197 = 0; local197 < local239.length; local197++) {
			@Pc(251) Class133 local251 = local239[local197] = new Class133();
			@Pc(255) int local255 = local36.method4905();
			if (local255 > 0) {
				local251.aByteArray48 = new byte[local255 * 2];
			}
			local255 = local36.method4905();
			if (local255 > 0) {
				local251.aByteArray47 = new byte[local255 * 2 + 2];
				local251.aByteArray47[1] = 64;
			}
		}
		local203 = local36.method4905();
		@Pc(306) byte[] local306 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method4905();
		@Pc(322) byte[] local322 = local203 <= 0 ? null : new byte[local203 * 2];
		@Pc(324) int local324;
		for (local324 = 0; local36.aByteArray68[local324 + local36.anInt5831] != 0; local324++) {
		}
		@Pc(338) byte[] local338 = new byte[local324];
		for (@Pc(340) int local340 = 0; local340 < local324; local340++) {
			local338[local340] = local36.method4925();
		}
		local324++;
		local36.anInt5831++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local36.method4905();
			this.aShortArray123[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(385) int local385 = 0; local385 < 128; local385++) {
			local361 += local36.method4905();
			this.aShortArray123[local385] = (short) (this.aShortArray123[local385] + (local361 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local414 < local338.length) {
					local412 = local338[local414++];
				} else {
					local412 = -1;
				}
				local416 = local36.method4921();
			}
			this.aShortArray123[local418] = (short) (this.aShortArray123[local418] + ((local416 - 1 & 0x2) << 14));
			local412--;
			this.anIntArray489[local418] = local416;
		}
		local414 = 0;
		local412 = 0;
		@Pc(474) int local474 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray489[local476] != 0) {
				if (local412 == 0) {
					local474 = local36.aByteArray68[local79++] - 1;
					if (local414 < local55.length) {
						local412 = local55[local414++];
					} else {
						local412 = -1;
					}
				}
				this.aByteArray100[local476] = (byte) local474;
				local412--;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(526) int local526 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray489[local528] != 0) {
				if (local412 == 0) {
					local526 = local36.aByteArray68[local132++] + 16 << 2;
					if (local414 < local104.length) {
						local412 = local104[local414++];
					} else {
						local412 = -1;
					}
				}
				local412--;
				this.aByteArray98[local528] = (byte) local526;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(584) Class133 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray489[local586] != 0) {
				if (local412 == 0) {
					local584 = local239[local182[local414]];
					if (local414 >= local154.length) {
						local412 = -1;
					} else {
						local412 = local154[local414++];
					}
				}
				local412--;
				this.aClass133Array1[local586] = local584;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(632) int local632 = 0;
		for (@Pc(634) int local634 = 0; local634 < 128; local634++) {
			if (local412 == 0) {
				if (local338.length > local414) {
					local412 = local338[local414++];
				} else {
					local412 = -1;
				}
				if (this.anIntArray489[local634] > 0) {
					local632 = local36.method4905() + 1;
				}
			}
			this.aByteArray99[local634] = (byte) local632;
			local412--;
		}
		this.anInt9052 = local36.method4905() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local193; local691++) {
			@Pc(697) Class133 local697 = local239[local691];
			if (local697.aByteArray48 != null) {
				for (local702 = 1; local702 < local697.aByteArray48.length; local702 += 2) {
					local697.aByteArray48[local702] = local36.method4925();
				}
			}
			if (local697.aByteArray47 != null) {
				for (local702 = 3; local702 < local697.aByteArray47.length - 2; local702 += 2) {
					local697.aByteArray47[local702] = local36.method4925();
				}
			}
		}
		@Pc(751) int local751;
		if (local306 != null) {
			for (local751 = 1; local751 < local306.length; local751 += 2) {
				local306[local751] = local36.method4925();
			}
		}
		if (local322 != null) {
			for (local751 = 1; local751 < local322.length; local751 += 2) {
				local322[local751] = local36.method4925();
			}
		}
		@Pc(796) int local796;
		for (local751 = 0; local751 < local193; local751++) {
			@Pc(789) Class133 local789 = local239[local751];
			if (local789.aByteArray47 != null) {
				local361 = 0;
				for (local796 = 2; local796 < local789.aByteArray47.length; local796 += 2) {
					local361 = local361 + local36.method4905() + 1;
					local789.aByteArray47[local796] = (byte) local361;
				}
			}
		}
		@Pc(841) int local841;
		for (local702 = 0; local702 < local193; local702++) {
			@Pc(834) Class133 local834 = local239[local702];
			if (local834.aByteArray48 != null) {
				local361 = 0;
				for (local841 = 2; local841 < local834.aByteArray48.length; local841 += 2) {
					local361 += local36.method4905() + 1;
					local834.aByteArray48[local841] = (byte) local361;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(942) int local942;
		@Pc(948) byte local948;
		@Pc(967) int local967;
		@Pc(969) int local969;
		@Pc(979) int local979;
		@Pc(909) byte local909;
		@Pc(1020) int local1020;
		if (local306 != null) {
			local361 = local36.method4905();
			local306[0] = (byte) local361;
			for (local796 = 2; local796 < local306.length; local796 += 2) {
				local361 = local36.method4905() + local361 + 1;
				local306[local796] = (byte) local361;
			}
			local909 = local306[0];
			@Pc(913) byte local913 = local306[1];
			for (local915 = 0; local915 < local909; local915++) {
				this.aByteArray99[local915] = (byte) (local913 * this.aByteArray99[local915] + 32 >> 6);
			}
			for (local942 = 2; local942 < local306.length; local942 += 2) {
				local948 = local306[local942];
				@Pc(954) byte local954 = local306[local942 + 1];
				local967 = local913 * (local948 - local909) + (local948 - local909) / 2;
				for (local969 = local909; local969 < local948; local969++) {
					local979 = Static175.method3187(local967, local948 - local909);
					this.aByteArray99[local969] = (byte) (local979 * this.aByteArray99[local969] + 32 >> 6);
					local967 += local954 - local913;
				}
				local913 = local954;
				local909 = local948;
			}
			for (local1020 = local909; local1020 < 128; local1020++) {
				this.aByteArray99[local1020] = (byte) (this.aByteArray99[local1020] * local913 + 32 >> 6);
			}
		}
		@Pc(1090) int local1090;
		if (local322 != null) {
			local361 = local36.method4905();
			local322[0] = (byte) local361;
			for (local796 = 2; local796 < local322.length; local796 += 2) {
				local361 = local361 + local36.method4905() + 1;
				local322[local796] = (byte) local361;
			}
			local909 = local322[0];
			local1090 = local322[1] << 1;
			for (local915 = 0; local915 < local909; local915++) {
				local942 = (this.aByteArray98[local915] & 0xFF) + local1090;
				if (local942 < 0) {
					local942 = 0;
				}
				if (local942 > 128) {
					local942 = 128;
				}
				this.aByteArray98[local915] = (byte) local942;
			}
			local942 = 2;
			@Pc(1144) int local1144;
			while (local942 < local322.length) {
				local948 = local322[local942];
				local1144 = local322[local942 + 1] << 1;
				local967 = (local948 - local909) * local1090 + (local948 - local909) / 2;
				for (local969 = local909; local969 < local948; local969++) {
					local979 = Static175.method3187(local967, local948 - local909);
					@Pc(1178) int local1178 = (this.aByteArray98[local969] & 0xFF) + local979;
					if (local1178 < 0) {
						local1178 = 0;
					}
					if (local1178 > 128) {
						local1178 = 128;
					}
					local967 += local1144 - local1090;
					this.aByteArray98[local969] = (byte) local1178;
				}
				local942 += 2;
				local1090 = local1144;
				local909 = local948;
			}
			for (local1020 = local909; local1020 < 128; local1020++) {
				local1144 = (this.aByteArray98[local1020] & 0xFF) + local1090;
				if (local1144 < 0) {
					local1144 = 0;
				}
				if (local1144 > 128) {
					local1144 = 128;
				}
				this.aByteArray98[local1020] = (byte) local1144;
			}
		}
		for (local796 = 0; local796 < local193; local796++) {
			local239[local796].anInt3624 = local36.method4905();
		}
		for (local841 = 0; local841 < local193; local841++) {
			@Pc(1274) Class133 local1274 = local239[local841];
			if (local1274.aByteArray48 != null) {
				local1274.anInt3629 = local36.method4905();
			}
			if (local1274.aByteArray47 != null) {
				local1274.anInt3630 = local36.method4905();
			}
			if (local1274.anInt3624 > 0) {
				local1274.anInt3628 = local36.method4905();
			}
		}
		for (local1090 = 0; local1090 < local193; local1090++) {
			local239[local1090].anInt3625 = local36.method4905();
		}
		for (local915 = 0; local915 < local193; local915++) {
			@Pc(1332) Class133 local1332 = local239[local915];
			if (local1332.anInt3625 > 0) {
				local1332.anInt3626 = local36.method4905();
			}
		}
		for (local942 = 0; local942 < local193; local942++) {
			@Pc(1356) Class133 local1356 = local239[local942];
			if (local1356.anInt3626 > 0) {
				local1356.anInt3631 = local36.method4905();
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([II[BLclient!gd;)Z")
	public boolean method7394(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class113 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub16_Sub1 local11 = null;
		for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
			if (arg1 == null || arg1[local23] != 0) {
				@Pc(38) int local38 = this.anIntArray489[local23];
				if (local38 != 0) {
					if (local38 != local9) {
						local9 = local38--;
						if ((local38 & 0x1) == 0) {
							local11 = arg2.method2943(arg0, local38 >> 2);
						} else {
							local11 = arg2.method2940(local38 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub16_Sub1Array1[local23] = local11;
						this.anIntArray489[local23] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	public void method7396() {
		this.anIntArray489 = null;
	}
}
