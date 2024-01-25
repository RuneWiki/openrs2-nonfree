import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	public int anInt5187;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "[Lclient!te;")
	public Class3_Sub42_Sub1[] aClass3_Sub42_Sub1Array1;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[Lclient!tv;")
	public Class287[] aClass287Array1;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	private Class3_Sub26() {
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "([B)V")
	public Class3_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = new byte[128];
		this.aByteArray49 = new byte[128];
		this.aShortArray96 = new short[128];
		this.aClass287Array1 = new Class287[128];
		this.aClass3_Sub42_Sub1Array1 = new Class3_Sub42_Sub1[128];
		this.anIntArray457 = new int[128];
		this.aByteArray48 = new byte[128];
		@Pc(36) Class3_Sub27 local36 = new Class3_Sub27(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray114[local38 + local36.anInt9191] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method7584();
		}
		local38++;
		local36.anInt9191++;
		@Pc(76) int local76 = local36.anInt9191;
		local36.anInt9191 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray114[local84 + local36.anInt9191] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method7584();
		}
		local84++;
		local36.anInt9191++;
		@Pc(125) int local125 = local36.anInt9191;
		local36.anInt9191 += local84;
		@Pc(133) int local133;
		for (local133 = 0; local36.aByteArray114[local36.anInt9191 + local133] != 0; local133++) {
		}
		@Pc(148) byte[] local148 = new byte[local133];
		for (@Pc(150) int local150 = 0; local150 < local133; local150++) {
			local148[local150] = local36.method7584();
		}
		local36.anInt9191++;
		local133++;
		@Pc(176) byte[] local176 = new byte[local133];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local133 <= 1) {
			local183 = local133;
		} else {
			local176[1] = 1;
			local183 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local133; local195++) {
				local201 = local36.method7548();
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
		@Pc(233) Class287[] local233 = new Class287[local183];
		for (local195 = 0; local195 < local233.length; local195++) {
			@Pc(245) Class287 local245 = local233[local195] = new Class287();
			@Pc(249) int local249 = local36.method7548();
			if (local249 > 0) {
				local245.aByteArray101 = new byte[local249 * 2];
			}
			local249 = local36.method7548();
			if (local249 > 0) {
				local245.aByteArray100 = new byte[local249 * 2 + 2];
				local245.aByteArray100[1] = 64;
			}
		}
		local201 = local36.method7548();
		@Pc(300) byte[] local300 = local201 > 0 ? new byte[local201 * 2] : null;
		local201 = local36.method7548();
		@Pc(316) byte[] local316 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local36.aByteArray114[local36.anInt9191 + local318] != 0; local318++) {
		}
		@Pc(333) byte[] local333 = new byte[local318];
		for (@Pc(335) int local335 = 0; local335 < local318; local335++) {
			local333[local335] = local36.method7584();
		}
		local318++;
		local36.anInt9191++;
		@Pc(360) int local360 = 0;
		for (@Pc(362) int local362 = 0; local362 < 128; local362++) {
			local360 += local36.method7548();
			this.aShortArray96[local362] = (short) local360;
		}
		local360 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local360 += local36.method7548();
			this.aShortArray96[local384] = (short) (this.aShortArray96[local384] + (local360 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local413 >= local333.length) {
					local411 = -1;
				} else {
					local411 = local333[local413++];
				}
				local415 = local36.method7552();
			}
			this.aShortArray96[local417] = (short) (this.aShortArray96[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray457[local417] = local415;
			local411--;
		}
		local413 = 0;
		local411 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray457[local474] != 0) {
				if (local411 == 0) {
					local472 = local36.aByteArray114[local76++] - 1;
					if (local413 >= local52.length) {
						local411 = -1;
					} else {
						local411 = local52[local413++];
					}
				}
				this.aByteArray50[local474] = (byte) local472;
				local411--;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray457[local526] != 0) {
				if (local411 == 0) {
					if (local101.length > local413) {
						local411 = local101[local413++];
					} else {
						local411 = -1;
					}
					local524 = local36.aByteArray114[local125++] + 16 << 2;
				}
				this.aByteArray49[local526] = (byte) local524;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(584) Class287 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray457[local586] != 0) {
				if (local411 == 0) {
					local584 = local233[local176[local413]];
					if (local413 >= local148.length) {
						local411 = -1;
					} else {
						local411 = local148[local413++];
					}
				}
				local411--;
				this.aClass287Array1[local586] = local584;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local411 == 0) {
				if (local413 < local333.length) {
					local411 = local333[local413++];
				} else {
					local411 = -1;
				}
				if (this.anIntArray457[local638] > 0) {
					local636 = local36.method7548() + 1;
				}
			}
			this.aByteArray48[local638] = (byte) local636;
			local411--;
		}
		this.anInt5187 = local36.method7548() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local183; local695++) {
			@Pc(701) Class287 local701 = local233[local695];
			if (local701.aByteArray101 != null) {
				for (local706 = 1; local706 < local701.aByteArray101.length; local706 += 2) {
					local701.aByteArray101[local706] = local36.method7584();
				}
			}
			if (local701.aByteArray100 != null) {
				for (local706 = 3; local706 < local701.aByteArray100.length - 2; local706 += 2) {
					local701.aByteArray100[local706] = local36.method7584();
				}
			}
		}
		@Pc(755) int local755;
		if (local300 != null) {
			for (local755 = 1; local755 < local300.length; local755 += 2) {
				local300[local755] = local36.method7584();
			}
		}
		if (local316 != null) {
			for (local755 = 1; local755 < local316.length; local755 += 2) {
				local316[local755] = local36.method7584();
			}
		}
		@Pc(808) int local808;
		for (local755 = 0; local755 < local183; local755++) {
			@Pc(801) Class287 local801 = local233[local755];
			if (local801.aByteArray100 != null) {
				local360 = 0;
				for (local808 = 2; local808 < local801.aByteArray100.length; local808 += 2) {
					local360 = local36.method7548() + local360 + 1;
					local801.aByteArray100[local808] = (byte) local360;
				}
			}
		}
		@Pc(857) int local857;
		for (local706 = 0; local706 < local183; local706++) {
			@Pc(850) Class287 local850 = local233[local706];
			if (local850.aByteArray101 != null) {
				local360 = 0;
				for (local857 = 2; local857 < local850.aByteArray101.length; local857 += 2) {
					local360 = local360 + local36.method7548() + 1;
					local850.aByteArray101[local857] = (byte) local360;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(984) int local984;
		@Pc(986) int local986;
		@Pc(996) int local996;
		@Pc(925) byte local925;
		@Pc(1040) int local1040;
		if (local300 != null) {
			local360 = local36.method7548();
			local300[0] = (byte) local360;
			for (local808 = 2; local808 < local300.length; local808 += 2) {
				local360 = local36.method7548() + local360 + 1;
				local300[local808] = (byte) local360;
			}
			local925 = local300[0];
			@Pc(929) byte local929 = local300[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray48[local931] = (byte) (local929 * this.aByteArray48[local931] + 32 >> 6);
			}
			for (local958 = 2; local958 < local300.length; local958 += 2) {
				local964 = local300[local958];
				@Pc(970) byte local970 = local300[local958 + 1];
				local984 = (local964 - local925) / 2 + local929 * (local964 - local925);
				for (local986 = local925; local986 < local964; local986++) {
					local996 = Static280.method4816(local964 - local925, local984);
					local984 += local970 - local929;
					this.aByteArray48[local986] = (byte) (this.aByteArray48[local986] * local996 + 32 >> 6);
				}
				local925 = local964;
				local929 = local970;
			}
			for (local1040 = local925; local1040 < 128; local1040++) {
				this.aByteArray48[local1040] = (byte) (local929 * this.aByteArray48[local1040] + 32 >> 6);
			}
		}
		@Pc(1108) int local1108;
		if (local316 != null) {
			local360 = local36.method7548();
			local316[0] = (byte) local360;
			for (local808 = 2; local808 < local316.length; local808 += 2) {
				local360 = local360 + local36.method7548() + 1;
				local316[local808] = (byte) local360;
			}
			local925 = local316[0];
			local1108 = local316[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local958 = (this.aByteArray49[local931] & 0xFF) + local1108;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray49[local931] = (byte) local958;
			}
			@Pc(1161) int local1161;
			for (local958 = 2; local958 < local316.length; local958 += 2) {
				local964 = local316[local958];
				local1161 = local316[local958 + 1] << 1;
				local984 = local1108 * (local964 - local925) + (local964 - local925) / 2;
				for (local986 = local925; local986 < local964; local986++) {
					local996 = Static280.method4816(local964 - local925, local984);
					@Pc(1196) int local1196 = local996 + (this.aByteArray49[local986] & 0xFF);
					if (local1196 < 0) {
						local1196 = 0;
					}
					if (local1196 > 128) {
						local1196 = 128;
					}
					local984 += local1161 - local1108;
					this.aByteArray49[local986] = (byte) local1196;
				}
				local925 = local964;
				local1108 = local1161;
			}
			for (local1040 = local925; local1040 < 128; local1040++) {
				local1161 = (this.aByteArray49[local1040] & 0xFF) + local1108;
				if (local1161 < 0) {
					local1161 = 0;
				}
				if (local1161 > 128) {
					local1161 = 128;
				}
				this.aByteArray49[local1040] = (byte) local1161;
			}
		}
		for (local808 = 0; local808 < local183; local808++) {
			local233[local808].anInt8624 = local36.method7548();
		}
		for (local857 = 0; local857 < local183; local857++) {
			@Pc(1298) Class287 local1298 = local233[local857];
			if (local1298.aByteArray101 != null) {
				local1298.anInt8632 = local36.method7548();
			}
			if (local1298.aByteArray100 != null) {
				local1298.anInt8626 = local36.method7548();
			}
			if (local1298.anInt8624 > 0) {
				local1298.anInt8627 = local36.method7548();
			}
		}
		for (local1108 = 0; local1108 < local183; local1108++) {
			local233[local1108].anInt8631 = local36.method7548();
		}
		for (local931 = 0; local931 < local183; local931++) {
			@Pc(1352) Class287 local1352 = local233[local931];
			if (local1352.anInt8631 > 0) {
				local1352.anInt8625 = local36.method7548();
			}
		}
		for (local958 = 0; local958 < local183; local958++) {
			@Pc(1376) Class287 local1376 = local233[local958];
			if (local1376.anInt8625 > 0) {
				local1376.anInt8623 = local36.method7548();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4352() {
		this.anIntArray457 = null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ts;B[B[I)Z")
	public boolean method4355(@OriginalArg(0) Class286 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class3_Sub42_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg1 == null || arg1[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray457[local19];
				if (local34 != 0) {
					if (local34 != local15) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg0.method7056(local34 >> 2, arg2);
						} else {
							local17 = arg0.method7052(arg2, local34 >> 2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass3_Sub42_Sub1Array1[local19] = local17;
						this.anIntArray457[local19] = 0;
					}
				}
			}
		}
		return local13;
	}
}
