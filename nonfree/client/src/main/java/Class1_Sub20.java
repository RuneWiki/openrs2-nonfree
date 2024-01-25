import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[Lclient!fj;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[Lclient!eg;")
	public Class1_Sub12_Sub1[] aClass1_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	private Class1_Sub20() {
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray56 = new byte[128];
		this.aByteArray57 = new byte[128];
		this.anIntArray374 = new int[128];
		this.aShortArray45 = new short[128];
		this.aClass1_Sub12_Sub1Array1 = new Class1_Sub12_Sub1[128];
		this.aByteArray55 = new byte[128];
		this.aClass62Array1 = new Class62[128];
		@Pc(36) Class1_Sub7 local36 = new Class1_Sub7(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray58[local38 + local36.anInt3368] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method3130();
		}
		local38++;
		local36.anInt3368++;
		@Pc(76) int local76 = local36.anInt3368;
		local36.anInt3368 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray58[local84 + local36.anInt3368] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method3130();
		}
		local36.anInt3368++;
		local84++;
		@Pc(122) int local122 = local36.anInt3368;
		local36.anInt3368 += local84;
		@Pc(130) int local130;
		for (local130 = 0; local36.aByteArray58[local36.anInt3368 + local130] != 0; local130++) {
		}
		@Pc(148) byte[] local148 = new byte[local130];
		for (@Pc(150) int local150 = 0; local150 < local130; local150++) {
			local148[local150] = local36.method3130();
		}
		local36.anInt3368++;
		local130++;
		@Pc(176) byte[] local176 = new byte[local130];
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local130 > 1) {
			local176[1] = 1;
			local187 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local130; local191++) {
				local197 = local36.method3141();
				if (local197 == 0) {
					local189 = local187++;
				} else {
					if (local189 >= local197) {
						local197--;
					}
					local189 = local197;
				}
				local176[local191] = (byte) local189;
			}
		} else {
			local187 = local130;
		}
		@Pc(229) Class62[] local229 = new Class62[local187];
		for (local191 = 0; local191 < local229.length; local191++) {
			@Pc(241) Class62 local241 = local229[local191] = new Class62();
			@Pc(245) int local245 = local36.method3141();
			if (local245 > 0) {
				local241.aByteArray26 = new byte[local245 * 2];
			}
			local245 = local36.method3141();
			if (local245 > 0) {
				local241.aByteArray25 = new byte[local245 * 2 + 2];
				local241.aByteArray25[1] = 64;
			}
		}
		local197 = local36.method3141();
		@Pc(296) byte[] local296 = local197 <= 0 ? null : new byte[local197 * 2];
		local197 = local36.method3141();
		@Pc(309) byte[] local309 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(311) int local311;
		for (local311 = 0; local36.aByteArray58[local311 + local36.anInt3368] != 0; local311++) {
		}
		@Pc(325) byte[] local325 = new byte[local311];
		for (@Pc(327) int local327 = 0; local327 < local311; local327++) {
			local325[local327] = local36.method3130();
		}
		local311++;
		local36.anInt3368++;
		@Pc(348) int local348 = 0;
		for (@Pc(350) int local350 = 0; local350 < 128; local350++) {
			local348 += local36.method3141();
			this.aShortArray45[local350] = (short) local348;
		}
		local348 = 0;
		for (@Pc(374) int local374 = 0; local374 < 128; local374++) {
			local348 += local36.method3141();
			this.aShortArray45[local374] = (short) (this.aShortArray45[local374] + (local348 << 8));
		}
		@Pc(399) int local399 = 0;
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		for (@Pc(405) int local405 = 0; local405 < 128; local405++) {
			if (local399 == 0) {
				if (local325.length > local401) {
					local399 = local325[local401++];
				} else {
					local399 = -1;
				}
				local403 = local36.method3113();
			}
			this.aShortArray45[local405] = (short) (this.aShortArray45[local405] + ((local403 - 1 & 0x2) << 14));
			this.anIntArray374[local405] = local403;
			local399--;
		}
		local401 = 0;
		local399 = 0;
		@Pc(463) int local463 = 0;
		for (@Pc(465) int local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray374[local465] != 0) {
				if (local399 == 0) {
					local463 = local36.aByteArray58[local76++] - 1;
					if (local52.length > local401) {
						local399 = local52[local401++];
					} else {
						local399 = -1;
					}
				}
				local399--;
				this.aByteArray55[local465] = (byte) local463;
			}
		}
		local399 = 0;
		local401 = 0;
		@Pc(519) int local519 = 0;
		for (@Pc(521) int local521 = 0; local521 < 128; local521++) {
			if (this.anIntArray374[local521] != 0) {
				if (local399 == 0) {
					if (local401 < local98.length) {
						local399 = local98[local401++];
					} else {
						local399 = -1;
					}
					local519 = local36.aByteArray58[local122++] + 16 << 2;
				}
				this.aByteArray56[local521] = (byte) local519;
				local399--;
			}
		}
		local399 = 0;
		local401 = 0;
		@Pc(572) Class62 local572 = null;
		for (@Pc(574) int local574 = 0; local574 < 128; local574++) {
			if (this.anIntArray374[local574] != 0) {
				if (local399 == 0) {
					local572 = local229[local176[local401]];
					if (local148.length > local401) {
						local399 = local148[local401++];
					} else {
						local399 = -1;
					}
				}
				this.aClass62Array1[local574] = local572;
				local399--;
			}
		}
		local401 = 0;
		local399 = 0;
		@Pc(623) int local623 = 0;
		for (@Pc(625) int local625 = 0; local625 < 128; local625++) {
			if (local399 == 0) {
				if (local401 < local325.length) {
					local399 = local325[local401++];
				} else {
					local399 = -1;
				}
				if (this.anIntArray374[local625] > 0) {
					local623 = local36.method3141() + 1;
				}
			}
			local399--;
			this.aByteArray57[local625] = (byte) local623;
		}
		this.anInt3343 = local36.method3141() + 1;
		@Pc(693) int local693;
		for (@Pc(682) int local682 = 0; local682 < local187; local682++) {
			@Pc(688) Class62 local688 = local229[local682];
			if (local688.aByteArray26 != null) {
				for (local693 = 1; local693 < local688.aByteArray26.length; local693 += 2) {
					local688.aByteArray26[local693] = local36.method3130();
				}
			}
			if (local688.aByteArray25 != null) {
				for (local693 = 3; local693 < local688.aByteArray25.length - 2; local693 += 2) {
					local688.aByteArray25[local693] = local36.method3130();
				}
			}
		}
		@Pc(750) int local750;
		if (local296 != null) {
			for (local750 = 1; local750 < local296.length; local750 += 2) {
				local296[local750] = local36.method3130();
			}
		}
		if (local309 != null) {
			for (local750 = 1; local750 < local309.length; local750 += 2) {
				local309[local750] = local36.method3130();
			}
		}
		@Pc(795) int local795;
		for (local750 = 0; local750 < local187; local750++) {
			@Pc(788) Class62 local788 = local229[local750];
			if (local788.aByteArray25 != null) {
				local348 = 0;
				for (local795 = 2; local795 < local788.aByteArray25.length; local795 += 2) {
					local348 = local36.method3141() + local348 + 1;
					local788.aByteArray25[local795] = (byte) local348;
				}
			}
		}
		@Pc(840) int local840;
		for (local693 = 0; local693 < local187; local693++) {
			@Pc(833) Class62 local833 = local229[local693];
			if (local833.aByteArray26 != null) {
				local348 = 0;
				for (local840 = 2; local840 < local833.aByteArray26.length; local840 += 2) {
					local348 = local36.method3141() + local348 + 1;
					local833.aByteArray26[local840] = (byte) local348;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(933) int local933;
		@Pc(939) byte local939;
		@Pc(959) int local959;
		@Pc(961) int local961;
		@Pc(971) int local971;
		@Pc(904) byte local904;
		@Pc(1012) int local1012;
		if (local296 != null) {
			local348 = local36.method3141();
			local296[0] = (byte) local348;
			for (local795 = 2; local795 < local296.length; local795 += 2) {
				local348 = local348 + local36.method3141() + 1;
				local296[local795] = (byte) local348;
			}
			local904 = local296[0];
			@Pc(908) byte local908 = local296[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray57[local910] = (byte) (this.aByteArray57[local910] * local908 + 32 >> 6);
			}
			local933 = 2;
			while (local296.length > local933) {
				local939 = local296[local933];
				@Pc(945) byte local945 = local296[local933 + 1];
				local959 = (local939 - local904) / 2 + (local939 - local904) * local908;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static180.method3541(local939 - local904, local959);
					local959 += local945 - local908;
					this.aByteArray57[local961] = (byte) (local971 * this.aByteArray57[local961] + 32 >> 6);
				}
				local908 = local945;
				local933 += 2;
				local904 = local939;
			}
			for (local1012 = local904; local1012 < 128; local1012++) {
				this.aByteArray57[local1012] = (byte) (local908 * this.aByteArray57[local1012] + 32 >> 6);
			}
		}
		@Pc(1080) int local1080;
		if (local309 != null) {
			local348 = local36.method3141();
			local309[0] = (byte) local348;
			for (local795 = 2; local795 < local309.length; local795 += 2) {
				local348 = local348 + local36.method3141() + 1;
				local309[local795] = (byte) local348;
			}
			local904 = local309[0];
			local1080 = local309[1] << 1;
			for (local910 = 0; local910 < local904; local910++) {
				local933 = (this.aByteArray56[local910] & 0xFF) + local1080;
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray56[local910] = (byte) local933;
			}
			local933 = 2;
			@Pc(1133) int local1133;
			while (local933 < local309.length) {
				local939 = local309[local933];
				local1133 = local309[local933 + 1] << 1;
				local959 = local1080 * (local939 - local904) + (local939 - local904) / 2;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static180.method3541(local939 - local904, local959);
					@Pc(1168) int local1168 = (this.aByteArray56[local961] & 0xFF) + local971;
					if (local1168 < 0) {
						local1168 = 0;
					}
					if (local1168 > 128) {
						local1168 = 128;
					}
					local959 += local1133 - local1080;
					this.aByteArray56[local961] = (byte) local1168;
				}
				local933 += 2;
				local1080 = local1133;
				local904 = local939;
			}
			for (local1012 = local904; local1012 < 128; local1012++) {
				local1133 = local1080 + (this.aByteArray56[local1012] & 0xFF);
				if (local1133 < 0) {
					local1133 = 0;
				}
				if (local1133 > 128) {
					local1133 = 128;
				}
				this.aByteArray56[local1012] = (byte) local1133;
			}
		}
		for (local795 = 0; local795 < local187; local795++) {
			local229[local795].anInt1846 = local36.method3141();
		}
		for (local840 = 0; local840 < local187; local840++) {
			@Pc(1277) Class62 local1277 = local229[local840];
			if (local1277.aByteArray26 != null) {
				local1277.anInt1842 = local36.method3141();
			}
			if (local1277.aByteArray25 != null) {
				local1277.anInt1841 = local36.method3141();
			}
			if (local1277.anInt1846 > 0) {
				local1277.anInt1843 = local36.method3141();
			}
		}
		for (local1080 = 0; local1080 < local187; local1080++) {
			local229[local1080].anInt1849 = local36.method3141();
		}
		for (local910 = 0; local910 < local187; local910++) {
			@Pc(1335) Class62 local1335 = local229[local910];
			if (local1335.anInt1849 > 0) {
				local1335.anInt1848 = local36.method3141();
			}
		}
		for (local933 = 0; local933 < local187; local933++) {
			@Pc(1358) Class62 local1358 = local229[local933];
			if (local1358.anInt1848 > 0) {
				local1358.anInt1851 = local36.method3141();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B[ILclient!tf;)Z")
	public boolean method3077(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class196 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub12_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray374[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method5062(local25 >> 2, arg1);
						} else {
							local11 = arg2.method5060(local25 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub12_Sub1Array1[local13] = local11;
						this.anIntArray374[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	public void method3080() {
		this.anIntArray374 = null;
	}
}
