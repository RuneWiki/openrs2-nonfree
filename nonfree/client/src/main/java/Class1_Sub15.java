import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lclient!qe;")
	public final Class1_Sub20_Sub1[] aClass1_Sub20_Sub1Array1 = new Class1_Sub20_Sub1[128];

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
	private int[] anIntArray242 = new int[128];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[B")
	public final byte[] aByteArray35 = new byte[128];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[Lclient!lc;")
	public final Class45[] aClass45Array1 = new Class45[128];

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "[B")
	public final byte[] aByteArray36 = new byte[128];

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
	public final int anInt2483;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[S")
	public final short[] aShortArray24 = new short[128];

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[B")
	public final byte[] aByteArray37 = new byte[128];

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub9 local36 = new Class1_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray25[local38 + local36.anInt1592] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method1243();
		}
		local36.anInt1592++;
		local38++;
		@Pc(80) int local80 = local36.anInt1592;
		local36.anInt1592 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray25[local36.anInt1592 + local88] != 0; local88++) {
		}
		@Pc(106) byte[] local106 = new byte[local88];
		for (@Pc(108) int local108 = 0; local108 < local88; local108++) {
			local106[local108] = local36.method1243();
		}
		local36.anInt1592++;
		local88++;
		@Pc(130) int local130 = local36.anInt1592;
		@Pc(132) int local132 = 0;
		local36.anInt1592 += local88;
		while (local36.aByteArray25[local132 + local36.anInt1592] != 0) {
			local132++;
		}
		@Pc(155) byte[] local155 = new byte[local132];
		for (@Pc(157) int local157 = 0; local157 < local132; local157++) {
			local155[local157] = local36.method1243();
		}
		local36.anInt1592++;
		local132++;
		@Pc(183) byte[] local183 = new byte[local132];
		@Pc(190) int local190;
		@Pc(202) int local202;
		@Pc(208) int local208;
		if (local132 <= 1) {
			local190 = local132;
		} else {
			local183[1] = 1;
			@Pc(198) int local198 = 1;
			local190 = 2;
			for (local202 = 2; local202 < local132; local202++) {
				local208 = local36.method1234();
				if (local208 == 0) {
					local198 = local190++;
				} else {
					if (local198 >= local208) {
						local208--;
					}
					local198 = local208;
				}
				local183[local202] = (byte) local198;
			}
		}
		@Pc(241) Class45[] local241 = new Class45[local190];
		for (local202 = 0; local202 < local241.length; local202++) {
			@Pc(253) Class45 local253 = local241[local202] = new Class45();
			@Pc(257) int local257 = local36.method1234();
			if (local257 > 0) {
				local253.aByteArray40 = new byte[local257 * 2];
			}
			local257 = local36.method1234();
			if (local257 > 0) {
				local253.aByteArray39 = new byte[local257 * 2 + 2];
				local253.aByteArray39[1] = 64;
			}
		}
		local208 = local36.method1234();
		@Pc(302) byte[] local302 = local208 <= 0 ? null : new byte[local208 * 2];
		local208 = local36.method1234();
		@Pc(315) byte[] local315 = local208 <= 0 ? null : new byte[local208 * 2];
		@Pc(317) int local317;
		for (local317 = 0; local36.aByteArray25[local317 + local36.anInt1592] != 0; local317++) {
		}
		@Pc(331) byte[] local331 = new byte[local317];
		for (@Pc(333) int local333 = 0; local333 < local317; local333++) {
			local331[local333] = local36.method1243();
		}
		@Pc(351) int local351 = 0;
		local36.anInt1592++;
		local317++;
		for (@Pc(360) int local360 = 0; local360 < 128; local360++) {
			local351 += local36.method1234();
			this.aShortArray24[local360] = (short) local351;
		}
		local351 = 0;
		for (@Pc(382) int local382 = 0; local382 < 128; local382++) {
			local351 += local36.method1234();
			this.aShortArray24[local382] = (short) (this.aShortArray24[local382] + (local351 << 8));
		}
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		for (@Pc(415) int local415 = 0; local415 < 128; local415++) {
			if (local409 == 0) {
				if (local413 < local331.length) {
					local409 = local331[local413++];
				} else {
					local409 = -1;
				}
				local411 = local36.method1250();
			}
			local409--;
			this.aShortArray24[local415] = (short) (this.aShortArray24[local415] + ((local411 - 1 & 0x2) << 14));
			this.anIntArray242[local415] = local411;
		}
		local409 = 0;
		local413 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray242[local472] != 0) {
				if (local409 == 0) {
					local470 = local36.aByteArray25[local80++] - 1;
					if (local413 < local52.length) {
						local409 = local52[local413++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aByteArray37[local472] = (byte) local470;
			}
		}
		local413 = 0;
		@Pc(526) int local526 = 0;
		local409 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray242[local530] != 0) {
				if (local409 == 0) {
					local526 = local36.aByteArray25[local130++] + 16 << 2;
					if (local106.length > local413) {
						local409 = local106[local413++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aByteArray36[local530] = (byte) local526;
			}
		}
		local413 = 0;
		local409 = 0;
		@Pc(589) Class45 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray242[local591] != 0) {
				if (local409 == 0) {
					local589 = local241[local183[local413]];
					if (local413 < local155.length) {
						local409 = local155[local413++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aClass45Array1[local591] = local589;
			}
		}
		local409 = 0;
		@Pc(634) int local634 = 0;
		local413 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local409 == 0) {
				if (local331.length > local413) {
					local409 = local331[local413++];
				} else {
					local409 = -1;
				}
				if (this.anIntArray242[local638] > 0) {
					local634 = local36.method1234() + 1;
				}
			}
			local409--;
			this.aByteArray35[local638] = (byte) local634;
		}
		this.anInt2483 = local36.method1234() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local190; local698++) {
			@Pc(704) Class45 local704 = local241[local698];
			if (local704.aByteArray40 != null) {
				for (local709 = 1; local709 < local704.aByteArray40.length; local709 += 2) {
					local704.aByteArray40[local709] = local36.method1243();
				}
			}
			if (local704.aByteArray39 != null) {
				for (local709 = 3; local709 < local704.aByteArray39.length - 2; local709 += 2) {
					local704.aByteArray39[local709] = local36.method1243();
				}
			}
		}
		@Pc(762) int local762;
		if (local302 != null) {
			for (local762 = 1; local762 < local302.length; local762 += 2) {
				local302[local762] = local36.method1243();
			}
		}
		if (local315 != null) {
			for (local762 = 1; local762 < local315.length; local762 += 2) {
				local315[local762] = local36.method1243();
			}
		}
		@Pc(811) int local811;
		for (local762 = 0; local762 < local190; local762++) {
			@Pc(804) Class45 local804 = local241[local762];
			if (local804.aByteArray39 != null) {
				local351 = 0;
				for (local811 = 2; local811 < local804.aByteArray39.length; local811 += 2) {
					local351 = local36.method1234() + local351 + 1;
					local804.aByteArray39[local811] = (byte) local351;
				}
			}
		}
		@Pc(852) int local852;
		for (local709 = 0; local709 < local190; local709++) {
			@Pc(845) Class45 local845 = local241[local709];
			if (local845.aByteArray40 != null) {
				local351 = 0;
				for (local852 = 2; local852 < local845.aByteArray40.length; local852 += 2) {
					local351 = local351 + local36.method1234() + 1;
					local845.aByteArray40[local852] = (byte) local351;
				}
			}
		}
		@Pc(925) int local925;
		@Pc(948) int local948;
		@Pc(954) byte local954;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(986) int local986;
		@Pc(923) byte local923;
		@Pc(1025) int local1025;
		if (local302 != null) {
			local351 = local36.method1234();
			local302[0] = (byte) local351;
			for (local811 = 2; local811 < local302.length; local811 += 2) {
				local351 = local36.method1234() + local351 + 1;
				local302[local811] = (byte) local351;
			}
			@Pc(919) byte local919 = local302[1];
			local923 = local302[0];
			for (local925 = 0; local925 < local923; local925++) {
				this.aByteArray35[local925] = (byte) (this.aByteArray35[local925] * local919 + 32 >> 6);
			}
			local948 = 2;
			while (local948 < local302.length) {
				local954 = local302[local948];
				@Pc(960) byte local960 = local302[local948 + 1];
				local974 = (local954 - local923) * local919 + (local954 - local923) / 2;
				for (local976 = local923; local976 < local954; local976++) {
					local986 = Static171.method3408(local974, local954 - local923);
					local974 += local960 - local919;
					this.aByteArray35[local976] = (byte) (this.aByteArray35[local976] * local986 + 32 >> 6);
				}
				local919 = local960;
				local948 += 2;
				local923 = local954;
			}
			for (local1025 = local923; local1025 < 128; local1025++) {
				this.aByteArray35[local1025] = (byte) (this.aByteArray35[local1025] * local919 + 32 >> 6);
			}
		}
		@Pc(1085) int local1085;
		if (local315 != null) {
			local351 = local36.method1234();
			local315[0] = (byte) local351;
			for (local811 = 2; local811 < local315.length; local811 += 2) {
				local351 = local351 + local36.method1234() + 1;
				local315[local811] = (byte) local351;
			}
			local1085 = local315[1] << 1;
			local923 = local315[0];
			for (local925 = 0; local925 < local923; local925++) {
				local948 = (this.aByteArray36[local925] & 0xFF) + local1085;
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray36[local925] = (byte) local948;
			}
			local948 = 2;
			@Pc(1161) int local1161;
			while (local315.length > local948) {
				local954 = local315[local948];
				local974 = local1085 * (local954 - local923) + (local954 - local923) / 2;
				local1161 = local315[local948 + 1] << 1;
				for (local976 = local923; local976 < local954; local976++) {
					local986 = Static171.method3408(local974, local954 - local923);
					@Pc(1183) int local1183 = (this.aByteArray36[local976] & 0xFF) + local986;
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray36[local976] = (byte) local1183;
					local974 += local1161 - local1085;
				}
				local948 += 2;
				local923 = local954;
				local1085 = local1161;
			}
			for (local1025 = local923; local1025 < 128; local1025++) {
				local1161 = local1085 + (this.aByteArray36[local1025] & 0xFF);
				if (local1161 < 0) {
					local1161 = 0;
				}
				if (local1161 > 128) {
					local1161 = 128;
				}
				this.aByteArray36[local1025] = (byte) local1161;
			}
		}
		for (local811 = 0; local811 < local190; local811++) {
			local241[local811].anInt2852 = local36.method1234();
		}
		for (local852 = 0; local852 < local190; local852++) {
			@Pc(1281) Class45 local1281 = local241[local852];
			if (local1281.aByteArray40 != null) {
				local1281.anInt2858 = local36.method1234();
			}
			if (local1281.aByteArray39 != null) {
				local1281.anInt2850 = local36.method1234();
			}
			if (local1281.anInt2852 > 0) {
				local1281.anInt2855 = local36.method1234();
			}
		}
		for (local1085 = 0; local1085 < local190; local1085++) {
			local241[local1085].anInt2849 = local36.method1234();
		}
		for (local925 = 0; local925 < local190; local925++) {
			@Pc(1336) Class45 local1336 = local241[local925];
			if (local1336.anInt2849 > 0) {
				local1336.anInt2848 = local36.method1234();
			}
		}
		for (local948 = 0; local948 < local190; local948++) {
			@Pc(1363) Class45 local1363 = local241[local948];
			if (local1363.anInt2848 > 0) {
				local1363.anInt2856 = local36.method1234();
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public void method1830() {
		this.anIntArray242 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([ILclient!ag;I[B)Z")
	public boolean method1835(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub20_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray242[local18];
				if (local30 != 0) {
					if (local14 != local30) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method241(local30 >> 2, arg0);
						} else {
							local16 = arg1.method242(arg0, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub20_Sub1Array1[local18] = local16;
						this.anIntArray242[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
