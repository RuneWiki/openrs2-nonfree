import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "[Lclient!ra;")
	public final Class71[] aClass71Array1 = new Class71[128];

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "[B")
	public final byte[] aByteArray15 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "[Lclient!qe;")
	public final Class2_Sub19_Sub1[] aClass2_Sub19_Sub1Array1 = new Class2_Sub19_Sub1[128];

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "[B")
	public final byte[] aByteArray16 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "[B")
	public final byte[] aByteArray17 = new byte[128];

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
	private int[] anIntArray175 = new int[128];

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	public final int anInt2331;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "[S")
	public final short[] aShortArray15 = new short[128];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class2_Sub13 local36 = new Class2_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray14[local36.anInt2154 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method1394();
		}
		local38++;
		@Pc(77) int local77 = 0;
		local36.anInt2154++;
		@Pc(86) int local86 = local36.anInt2154;
		local36.anInt2154 += local38;
		while (local36.aByteArray14[local36.anInt2154 + local77] != 0) {
			local77++;
		}
		@Pc(107) byte[] local107 = new byte[local77];
		for (@Pc(109) int local109 = 0; local109 < local77; local109++) {
			local107[local109] = local36.method1394();
		}
		local36.anInt2154++;
		@Pc(134) int local134 = local36.anInt2154;
		@Pc(136) int local136 = 0;
		local77++;
		local36.anInt2154 += local77;
		while (local36.aByteArray14[local136 + local36.anInt2154] != 0) {
			local136++;
		}
		@Pc(157) byte[] local157 = new byte[local136];
		for (@Pc(159) int local159 = 0; local159 < local136; local159++) {
			local157[local159] = local36.method1394();
		}
		local136++;
		@Pc(175) byte[] local175 = new byte[local136];
		local36.anInt2154++;
		@Pc(190) int local190;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local136 > 1) {
			local175[1] = 1;
			local190 = 2;
			@Pc(192) int local192 = 1;
			for (local194 = 2; local194 < local136; local194++) {
				local200 = local36.method1402();
				if (local200 == 0) {
					local192 = local190++;
				} else {
					if (local192 >= local200) {
						local200--;
					}
					local192 = local200;
				}
				local175[local194] = (byte) local192;
			}
		} else {
			local190 = local136;
		}
		@Pc(236) Class71[] local236 = new Class71[local190];
		for (local194 = 0; local194 < local236.length; local194++) {
			@Pc(248) Class71 local248 = local236[local194] = new Class71();
			@Pc(252) int local252 = local36.method1402();
			if (local252 > 0) {
				local248.aByteArray40 = new byte[local252 * 2];
			}
			local252 = local36.method1402();
			if (local252 > 0) {
				local248.aByteArray39 = new byte[local252 * 2 + 2];
				local248.aByteArray39[1] = 64;
			}
		}
		local200 = local36.method1402();
		@Pc(303) byte[] local303 = local200 <= 0 ? null : new byte[local200 * 2];
		@Pc(305) int local305 = 0;
		local200 = local36.method1402();
		while (local36.aByteArray14[local36.anInt2154 + local305] != 0) {
			local305++;
		}
		@Pc(327) byte[] local327 = new byte[local305];
		@Pc(339) byte[] local339 = local200 <= 0 ? null : new byte[local200 * 2];
		for (@Pc(341) int local341 = 0; local341 < local305; local341++) {
			local327[local341] = local36.method1394();
		}
		local36.anInt2154++;
		@Pc(361) int local361 = 0;
		local305++;
		for (@Pc(364) int local364 = 0; local364 < 128; local364++) {
			local361 += local36.method1402();
			this.aShortArray15[local364] = (short) local361;
		}
		local361 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local361 += local36.method1402();
			this.aShortArray15[local386] = (short) (this.aShortArray15[local386] + (local361 << 8));
		}
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			if (local417 == 0) {
				if (local415 >= local327.length) {
					local417 = -1;
				} else {
					local417 = local327[local415++];
				}
				local413 = local36.method1427();
			}
			this.aShortArray15[local419] = (short) (this.aShortArray15[local419] + ((local413 - 1 & 0x2) << 14));
			this.anIntArray175[local419] = local413;
			local417--;
		}
		local415 = 0;
		local417 = 0;
		@Pc(480) int local480 = 0;
		for (@Pc(482) int local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray175[local482] != 0) {
				if (local417 == 0) {
					local480 = local36.aByteArray14[local86++] - 1;
					if (local56.length <= local415) {
						local417 = -1;
					} else {
						local417 = local56[local415++];
					}
				}
				local417--;
				this.aByteArray17[local482] = (byte) local480;
			}
		}
		@Pc(525) int local525 = 0;
		local417 = 0;
		local415 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray175[local531] != 0) {
				if (local417 == 0) {
					local525 = local36.aByteArray14[local134++] + 16 << 2;
					if (local415 < local107.length) {
						local417 = local107[local415++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aByteArray16[local531] = (byte) local525;
			}
		}
		@Pc(585) Class71 local585 = null;
		local417 = 0;
		local415 = 0;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray175[local591] != 0) {
				if (local417 == 0) {
					local585 = local236[local175[local415]];
					if (local157.length <= local415) {
						local417 = -1;
					} else {
						local417 = local157[local415++];
					}
				}
				local417--;
				this.aClass71Array1[local591] = local585;
			}
		}
		local417 = 0;
		local415 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local417 == 0) {
				if (local415 < local327.length) {
					local417 = local327[local415++];
				} else {
					local417 = -1;
				}
				if (this.anIntArray175[local643] > 0) {
					local641 = local36.method1402() + 1;
				}
			}
			local417--;
			this.aByteArray15[local643] = (byte) local641;
		}
		this.anInt2331 = local36.method1402() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local190; local695++) {
			@Pc(701) Class71 local701 = local236[local695];
			if (local701.aByteArray40 != null) {
				for (local706 = 1; local706 < local701.aByteArray40.length; local706 += 2) {
					local701.aByteArray40[local706] = local36.method1394();
				}
			}
			if (local701.aByteArray39 != null) {
				for (local706 = 3; local706 < local701.aByteArray39.length - 2; local706 += 2) {
					local701.aByteArray39[local706] = local36.method1394();
				}
			}
		}
		@Pc(755) int local755;
		if (local303 != null) {
			for (local755 = 1; local755 < local303.length; local755 += 2) {
				local303[local755] = local36.method1394();
			}
		}
		if (local339 != null) {
			for (local755 = 1; local755 < local339.length; local755 += 2) {
				local339[local755] = local36.method1394();
			}
		}
		@Pc(804) int local804;
		for (local755 = 0; local755 < local190; local755++) {
			@Pc(797) Class71 local797 = local236[local755];
			if (local797.aByteArray39 != null) {
				local361 = 0;
				for (local804 = 2; local804 < local797.aByteArray39.length; local804 += 2) {
					local361 += local36.method1402() + 1;
					local797.aByteArray39[local804] = (byte) local361;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local190; local706++) {
			@Pc(842) Class71 local842 = local236[local706];
			if (local842.aByteArray40 != null) {
				local361 = 0;
				for (local849 = 2; local849 < local842.aByteArray40.length; local849 += 2) {
					local361 = local361 + local36.method1402() + 1;
					local842.aByteArray40[local849] = (byte) local361;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(986) int local986;
		@Pc(988) int local988;
		@Pc(998) int local998;
		@Pc(925) byte local925;
		@Pc(1038) int local1038;
		if (local303 != null) {
			local361 = local36.method1402();
			local303[0] = (byte) local361;
			for (local804 = 2; local804 < local303.length; local804 += 2) {
				local361 = local361 + local36.method1402() + 1;
				local303[local804] = (byte) local361;
			}
			local925 = local303[0];
			@Pc(929) byte local929 = local303[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray15[local931] = (byte) (this.aByteArray15[local931] * local929 + 32 >> 6);
			}
			local958 = 2;
			while (local303.length > local958) {
				local964 = local303[local958];
				@Pc(970) byte local970 = local303[local958 + 1];
				local958 += 2;
				local986 = local929 * (local964 - local925) + (local964 - local925) / 2;
				for (local988 = local925; local988 < local964; local988++) {
					local998 = Static159.method2554(local964 - local925, local986);
					this.aByteArray15[local988] = (byte) (local998 * this.aByteArray15[local988] + 32 >> 6);
					local986 += local970 - local929;
				}
				local925 = local964;
				local929 = local970;
			}
			for (local1038 = local925; local1038 < 128; local1038++) {
				this.aByteArray15[local1038] = (byte) (local929 * this.aByteArray15[local1038] + 32 >> 6);
			}
		}
		@Pc(1104) int local1104;
		if (local339 != null) {
			local361 = local36.method1402();
			local339[0] = (byte) local361;
			for (local804 = 2; local804 < local339.length; local804 += 2) {
				local361 = local36.method1402() + local361 + 1;
				local339[local804] = (byte) local361;
			}
			local925 = local339[0];
			local1104 = local339[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local958 = (this.aByteArray16[local931] & 0xFF) + local1104;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray16[local931] = (byte) local958;
			}
			local958 = 2;
			@Pc(1151) int local1151;
			while (local339.length > local958) {
				local1151 = local339[local958 + 1] << 1;
				local964 = local339[local958];
				local958 += 2;
				local986 = local1104 * (local964 - local925) + (local964 - local925) / 2;
				for (local988 = local925; local988 < local964; local988++) {
					local998 = Static159.method2554(local964 - local925, local986);
					local986 += local1151 - local1104;
					@Pc(1197) int local1197 = local998 + (this.aByteArray16[local988] & 0xFF);
					if (local1197 < 0) {
						local1197 = 0;
					}
					if (local1197 > 128) {
						local1197 = 128;
					}
					this.aByteArray16[local988] = (byte) local1197;
				}
				local1104 = local1151;
				local925 = local964;
			}
			for (local1038 = local925; local1038 < 128; local1038++) {
				local1151 = local1104 + (this.aByteArray16[local1038] & 0xFF);
				if (local1151 < 0) {
					local1151 = 0;
				}
				if (local1151 > 128) {
					local1151 = 128;
				}
				this.aByteArray16[local1038] = (byte) local1151;
			}
		}
		for (local804 = 0; local804 < local190; local804++) {
			local236[local804].anInt3268 = local36.method1402();
		}
		for (local849 = 0; local849 < local190; local849++) {
			@Pc(1290) Class71 local1290 = local236[local849];
			if (local1290.aByteArray40 != null) {
				local1290.anInt3277 = local36.method1402();
			}
			if (local1290.aByteArray39 != null) {
				local1290.anInt3269 = local36.method1402();
			}
			if (local1290.anInt3268 > 0) {
				local1290.anInt3274 = local36.method1402();
			}
		}
		for (local1104 = 0; local1104 < local190; local1104++) {
			local236[local1104].anInt3271 = local36.method1402();
		}
		for (local931 = 0; local931 < local190; local931++) {
			@Pc(1345) Class71 local1345 = local236[local931];
			if (local1345.anInt3271 > 0) {
				local1345.anInt3272 = local36.method1402();
			}
		}
		for (local958 = 0; local958 < local190; local958++) {
			@Pc(1369) Class71 local1369 = local236[local958];
			if (local1369.anInt3272 > 0) {
				local1369.anInt3266 = local36.method1402();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method1529() {
		this.anIntArray175 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!cc;[BI[I)Z")
	public boolean method1531(@OriginalArg(0) Class13 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(9) int local9 = 0;
		@Pc(21) Class2_Sub19_Sub1 local21 = null;
		for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
			if (arg1 == null || arg1[local23] != 0) {
				@Pc(35) int local35 = this.anIntArray175[local23];
				if (local35 != 0) {
					if (local9 != local35) {
						local9 = local35--;
						if ((local35 & 0x1) == 0) {
							local21 = arg0.method349(arg2, local35 >> 2);
						} else {
							local21 = arg0.method352(arg2, local35 >> 2);
						}
						if (local21 == null) {
							local3 = false;
						}
					}
					if (local21 != null) {
						this.aClass2_Sub19_Sub1Array1[local23] = local21;
						this.anIntArray175[local23] = 0;
					}
				}
			}
		}
		return local3;
	}
}
