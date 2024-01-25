import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[Lclient!gv;")
	public Class130[] aClass130Array1;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "[Lclient!fk;")
	public Class6_Sub21_Sub1[] aClass6_Sub21_Sub1Array1;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	private Class6_Sub10() {
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class6_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = new byte[128];
		this.aByteArray13 = new byte[128];
		this.aClass6_Sub21_Sub1Array1 = new Class6_Sub21_Sub1[128];
		this.anIntArray69 = new int[128];
		this.aClass130Array1 = new Class130[128];
		this.aByteArray12 = new byte[128];
		this.aShortArray24 = new short[128];
		@Pc(36) Class6_Sub23 local36 = new Class6_Sub23(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray101[local36.anInt9901 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method8391();
		}
		local38++;
		local36.anInt9901++;
		@Pc(77) int local77 = local36.anInt9901;
		local36.anInt9901 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray101[local36.anInt9901 + local85] != 0; local85++) {
		}
		@Pc(99) byte[] local99 = new byte[local85];
		for (@Pc(101) int local101 = 0; local101 < local85; local101++) {
			local99[local101] = local36.method8391();
		}
		local36.anInt9901++;
		local85++;
		@Pc(127) int local127 = local36.anInt9901;
		local36.anInt9901 += local85;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray101[local135 + local36.anInt9901] != 0; local135++) {
		}
		@Pc(152) byte[] local152 = new byte[local135];
		for (@Pc(154) int local154 = 0; local154 < local135; local154++) {
			local152[local154] = local36.method8391();
		}
		local36.anInt9901++;
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
				local199 = local36.method8374();
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
		@Pc(231) Class130[] local231 = new Class130[local181];
		for (local193 = 0; local193 < local231.length; local193++) {
			@Pc(243) Class130 local243 = local231[local193] = new Class130();
			@Pc(247) int local247 = local36.method8374();
			if (local247 > 0) {
				local243.aByteArray38 = new byte[local247 * 2];
			}
			local247 = local36.method8374();
			if (local247 > 0) {
				local243.aByteArray37 = new byte[local247 * 2 + 2];
				local243.aByteArray37[1] = 64;
			}
		}
		local199 = local36.method8374();
		@Pc(299) byte[] local299 = local199 > 0 ? new byte[local199 * 2] : null;
		local199 = local36.method8374();
		@Pc(315) byte[] local315 = local199 <= 0 ? null : new byte[local199 * 2];
		@Pc(317) int local317;
		for (local317 = 0; local36.aByteArray101[local36.anInt9901 + local317] != 0; local317++) {
		}
		@Pc(331) byte[] local331 = new byte[local317];
		for (@Pc(333) int local333 = 0; local333 < local317; local333++) {
			local331[local333] = local36.method8391();
		}
		local36.anInt9901++;
		local317++;
		@Pc(358) int local358 = 0;
		for (@Pc(360) int local360 = 0; local360 < 128; local360++) {
			local358 += local36.method8374();
			this.aShortArray24[local360] = (short) local358;
		}
		local358 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local358 += local36.method8374();
			this.aShortArray24[local384] = (short) (this.aShortArray24[local384] + (local358 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local331.length > local413) {
					local411 = local331[local413++];
				} else {
					local411 = -1;
				}
				local415 = local36.method8399();
			}
			this.aShortArray24[local417] = (short) (this.aShortArray24[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray69[local417] = local415;
			local411--;
		}
		local411 = 0;
		local413 = 0;
		@Pc(471) int local471 = 0;
		for (@Pc(473) int local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray69[local473] != 0) {
				if (local411 == 0) {
					local471 = local36.aByteArray101[local77++] - 1;
					if (local413 >= local53.length) {
						local411 = -1;
					} else {
						local411 = local53[local413++];
					}
				}
				local411--;
				this.aByteArray11[local473] = (byte) local471;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray69[local534] != 0) {
				if (local411 == 0) {
					if (local99.length > local413) {
						local411 = local99[local413++];
					} else {
						local411 = -1;
					}
					local532 = local36.aByteArray101[local127++] + 16 << 2;
				}
				local411--;
				this.aByteArray12[local534] = (byte) local532;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(589) Class130 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray69[local591] != 0) {
				if (local411 == 0) {
					local589 = local231[local176[local413]];
					if (local152.length <= local413) {
						local411 = -1;
					} else {
						local411 = local152[local413++];
					}
				}
				local411--;
				this.aClass130Array1[local591] = local589;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local411 == 0) {
				if (local413 < local331.length) {
					local411 = local331[local413++];
				} else {
					local411 = -1;
				}
				if (this.anIntArray69[local643] > 0) {
					local641 = local36.method8374() + 1;
				}
			}
			this.aByteArray13[local643] = (byte) local641;
			local411--;
		}
		this.anInt1275 = local36.method8374() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local181; local693++) {
			@Pc(699) Class130 local699 = local231[local693];
			if (local699.aByteArray38 != null) {
				for (local704 = 1; local704 < local699.aByteArray38.length; local704 += 2) {
					local699.aByteArray38[local704] = local36.method8391();
				}
			}
			if (local699.aByteArray37 != null) {
				for (local704 = 3; local704 < local699.aByteArray37.length - 2; local704 += 2) {
					local699.aByteArray37[local704] = local36.method8391();
				}
			}
		}
		@Pc(753) int local753;
		if (local299 != null) {
			for (local753 = 1; local753 < local299.length; local753 += 2) {
				local299[local753] = local36.method8391();
			}
		}
		if (local315 != null) {
			for (local753 = 1; local753 < local315.length; local753 += 2) {
				local315[local753] = local36.method8391();
			}
		}
		@Pc(806) int local806;
		for (local753 = 0; local753 < local181; local753++) {
			@Pc(799) Class130 local799 = local231[local753];
			if (local799.aByteArray37 != null) {
				local358 = 0;
				for (local806 = 2; local806 < local799.aByteArray37.length; local806 += 2) {
					local358 = local358 + local36.method8374() + 1;
					local799.aByteArray37[local806] = (byte) local358;
				}
			}
		}
		@Pc(851) int local851;
		for (local704 = 0; local704 < local181; local704++) {
			@Pc(844) Class130 local844 = local231[local704];
			if (local844.aByteArray38 != null) {
				local358 = 0;
				for (local851 = 2; local851 < local844.aByteArray38.length; local851 += 2) {
					local358 = local358 + local36.method8374() + 1;
					local844.aByteArray38[local851] = (byte) local358;
				}
			}
		}
		@Pc(925) int local925;
		@Pc(948) int local948;
		@Pc(954) byte local954;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(986) int local986;
		@Pc(919) byte local919;
		@Pc(1033) int local1033;
		if (local299 != null) {
			local358 = local36.method8374();
			local299[0] = (byte) local358;
			for (local806 = 2; local806 < local299.length; local806 += 2) {
				local358 = local358 + local36.method8374() + 1;
				local299[local806] = (byte) local358;
			}
			local919 = local299[0];
			@Pc(923) byte local923 = local299[1];
			for (local925 = 0; local925 < local919; local925++) {
				this.aByteArray13[local925] = (byte) (this.aByteArray13[local925] * local923 + 32 >> 6);
			}
			local948 = 2;
			while (local299.length > local948) {
				local954 = local299[local948];
				@Pc(960) byte local960 = local299[local948 + 1];
				local974 = (local954 - local919) * local923 + (local954 - local919) / 2;
				for (local976 = local919; local976 < local954; local976++) {
					local986 = Static546.method7769(local974, local954 - local919);
					local974 += local960 - local923;
					this.aByteArray13[local976] = (byte) (this.aByteArray13[local976] * local986 + 32 >> 6);
				}
				local923 = local960;
				local948 += 2;
				local919 = local954;
			}
			for (local1033 = local919; local1033 < 128; local1033++) {
				this.aByteArray13[local1033] = (byte) (this.aByteArray13[local1033] * local923 + 32 >> 6);
			}
		}
		@Pc(1099) int local1099;
		if (local315 != null) {
			local358 = local36.method8374();
			local315[0] = (byte) local358;
			for (local806 = 2; local806 < local315.length; local806 += 2) {
				local358 += local36.method8374() + 1;
				local315[local806] = (byte) local358;
			}
			local919 = local315[0];
			local1099 = local315[1] << 1;
			for (local925 = 0; local925 < local919; local925++) {
				local948 = local1099 + (this.aByteArray12[local925] & 0xFF);
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray12[local925] = (byte) local948;
			}
			local948 = 2;
			@Pc(1153) int local1153;
			while (local948 < local315.length) {
				local954 = local315[local948];
				local1153 = local315[local948 + 1] << 1;
				local974 = (local954 - local919) / 2 + (local954 - local919) * local1099;
				for (local976 = local919; local976 < local954; local976++) {
					local986 = Static546.method7769(local974, local954 - local919);
					@Pc(1189) int local1189 = (this.aByteArray12[local976] & 0xFF) + local986;
					if (local1189 < 0) {
						local1189 = 0;
					}
					if (local1189 > 128) {
						local1189 = 128;
					}
					local974 += local1153 - local1099;
					this.aByteArray12[local976] = (byte) local1189;
				}
				local1099 = local1153;
				local948 += 2;
				local919 = local954;
			}
			for (local1033 = local919; local1033 < 128; local1033++) {
				local1153 = (this.aByteArray12[local1033] & 0xFF) + local1099;
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray12[local1033] = (byte) local1153;
			}
		}
		for (local806 = 0; local806 < local181; local806++) {
			local231[local806].anInt3462 = local36.method8374();
		}
		for (local851 = 0; local851 < local181; local851++) {
			@Pc(1286) Class130 local1286 = local231[local851];
			if (local1286.aByteArray38 != null) {
				local1286.anInt3468 = local36.method8374();
			}
			if (local1286.aByteArray37 != null) {
				local1286.anInt3463 = local36.method8374();
			}
			if (local1286.anInt3462 > 0) {
				local1286.anInt3465 = local36.method8374();
			}
		}
		for (local1099 = 0; local1099 < local181; local1099++) {
			local231[local1099].anInt3460 = local36.method8374();
		}
		for (local925 = 0; local925 < local181; local925++) {
			@Pc(1340) Class130 local1340 = local231[local925];
			if (local1340.anInt3460 > 0) {
				local1340.anInt3467 = local36.method8374();
			}
		}
		for (local948 = 0; local948 < local181; local948++) {
			@Pc(1363) Class130 local1363 = local231[local948];
			if (local1363.anInt3467 > 0) {
				local1363.anInt3461 = local36.method8374();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method1194() {
		this.anIntArray69 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ig;[B[I)Z")
	public boolean method1197(@OriginalArg(1) Class158 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub21_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray69[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method3605(arg2, local28 >> 2);
						} else {
							local11 = arg0.method3602(arg2, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub21_Sub1Array1[local13] = local11;
						this.anIntArray69[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
