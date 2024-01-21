import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public final int anInt2250;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[B")
	public final byte[] aByteArray34 = new byte[128];

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[Lclient!bf;")
	public final Class7[] aClass7Array1 = new Class7[128];

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "[Lclient!nc;")
	public final Class2_Sub18_Sub1[] aClass2_Sub18_Sub1Array1 = new Class2_Sub18_Sub1[128];

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "[S")
	public final short[] aShortArray31 = new short[128];

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "[I")
	private int[] anIntArray219 = new int[128];

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class2_Sub2 local38 = new Class2_Sub2(arg0);
		while (local38.aByteArray35[local33 + local38.anInt2385] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1707();
		}
		local33++;
		local38.anInt2385++;
		@Pc(80) int local80 = local38.anInt2385;
		@Pc(82) int local82 = 0;
		local38.anInt2385 += local33;
		while (local38.aByteArray35[local38.anInt2385 + local82] != 0) {
			local82++;
		}
		@Pc(105) byte[] local105 = new byte[local82];
		for (@Pc(107) int local107 = 0; local107 < local82; local107++) {
			local105[local107] = local38.method1707();
		}
		local38.anInt2385++;
		local82++;
		@Pc(129) int local129 = local38.anInt2385;
		local38.anInt2385 += local82;
		@Pc(137) int local137;
		for (local137 = 0; local38.aByteArray35[local137 + local38.anInt2385] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local38.method1707();
		}
		local137++;
		local38.anInt2385++;
		@Pc(182) byte[] local182 = new byte[local137];
		@Pc(189) int local189;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local137 <= 1) {
			local189 = local137;
		} else {
			local182[1] = 1;
			local189 = 2;
			@Pc(199) int local199 = 1;
			for (local201 = 2; local201 < local137; local201++) {
				local207 = local38.method1698();
				if (local207 == 0) {
					local199 = local189++;
				} else {
					if (local207 <= local199) {
						local207--;
					}
					local199 = local207;
				}
				local182[local201] = (byte) local199;
			}
		}
		@Pc(239) Class7[] local239 = new Class7[local189];
		for (local201 = 0; local201 < local239.length; local201++) {
			@Pc(251) Class7 local251 = local239[local201] = new Class7();
			@Pc(255) int local255 = local38.method1698();
			if (local255 > 0) {
				local251.aByteArray9 = new byte[local255 * 2];
			}
			local255 = local38.method1698();
			if (local255 > 0) {
				local251.aByteArray8 = new byte[local255 * 2 + 2];
				local251.aByteArray8[1] = 64;
			}
		}
		local207 = local38.method1698();
		@Pc(307) byte[] local307 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(309) int local309 = 0;
		local207 = local38.method1698();
		while (local38.aByteArray35[local38.anInt2385 + local309] != 0) {
			local309++;
		}
		@Pc(337) byte[] local337 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(340) byte[] local340 = new byte[local309];
		for (@Pc(342) int local342 = 0; local342 < local309; local342++) {
			local340[local342] = local38.method1707();
		}
		local309++;
		local38.anInt2385++;
		@Pc(363) int local363 = 0;
		for (@Pc(365) int local365 = 0; local365 < 128; local365++) {
			local363 += local38.method1698();
			this.aShortArray31[local365] = (short) local363;
		}
		local363 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local363 += local38.method1698();
			this.aShortArray31[local389] = (short) (this.aShortArray31[local389] + (local363 << 8));
		}
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		for (@Pc(420) int local420 = 0; local420 < 128; local420++) {
			if (local414 == 0) {
				if (local340.length <= local416) {
					local414 = -1;
				} else {
					local414 = local340[local416++];
				}
				local418 = local38.method1657();
			}
			local414--;
			this.aShortArray31[local420] = (short) (this.aShortArray31[local420] + ((local418 - 1 & 0x2) << 14));
			this.anIntArray219[local420] = local418;
		}
		local416 = 0;
		@Pc(473) int local473 = 0;
		local414 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray219[local477] != 0) {
				if (local414 == 0) {
					if (local52.length > local416) {
						local414 = local52[local416++];
					} else {
						local414 = -1;
					}
					local473 = local38.aByteArray35[local80++] - 1;
				}
				this.aByteArray32[local477] = (byte) local473;
				local414--;
			}
		}
		@Pc(525) int local525 = 0;
		local414 = 0;
		local416 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray219[local531] != 0) {
				if (local414 == 0) {
					if (local105.length > local416) {
						local414 = local105[local416++];
					} else {
						local414 = -1;
					}
					local525 = local38.aByteArray35[local129++] + 16 << 2;
				}
				local414--;
				this.aByteArray33[local531] = (byte) local525;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(589) Class7 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray219[local591] != 0) {
				if (local414 == 0) {
					local589 = local239[local182[local416]];
					if (local416 < local154.length) {
						local414 = local154[local416++];
					} else {
						local414 = -1;
					}
				}
				local414--;
				this.aClass7Array1[local591] = local589;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local414 == 0) {
				if (local340.length <= local416) {
					local414 = -1;
				} else {
					local414 = local340[local416++];
				}
				if (this.anIntArray219[local641] > 0) {
					local639 = local38.method1698() + 1;
				}
			}
			local414--;
			this.aByteArray34[local641] = (byte) local639;
		}
		this.anInt2250 = local38.method1698() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local189; local695++) {
			@Pc(701) Class7 local701 = local239[local695];
			if (local701.aByteArray9 != null) {
				for (local706 = 1; local706 < local701.aByteArray9.length; local706 += 2) {
					local701.aByteArray9[local706] = local38.method1707();
				}
			}
			if (local701.aByteArray8 != null) {
				for (local706 = 3; local706 < local701.aByteArray8.length - 2; local706 += 2) {
					local701.aByteArray8[local706] = local38.method1707();
				}
			}
		}
		@Pc(759) int local759;
		if (local307 != null) {
			for (local759 = 1; local759 < local307.length; local759 += 2) {
				local307[local759] = local38.method1707();
			}
		}
		if (local337 != null) {
			for (local759 = 1; local759 < local337.length; local759 += 2) {
				local337[local759] = local38.method1707();
			}
		}
		@Pc(804) int local804;
		for (local759 = 0; local759 < local189; local759++) {
			@Pc(797) Class7 local797 = local239[local759];
			if (local797.aByteArray8 != null) {
				local363 = 0;
				for (local804 = 2; local804 < local797.aByteArray8.length; local804 += 2) {
					local363 = local38.method1698() + local363 + 1;
					local797.aByteArray8[local804] = (byte) local363;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local189; local706++) {
			@Pc(842) Class7 local842 = local239[local706];
			if (local842.aByteArray9 != null) {
				local363 = 0;
				for (local849 = 2; local849 < local842.aByteArray9.length; local849 += 2) {
					local363 = local38.method1698() + local363 + 1;
					local842.aByteArray9[local849] = (byte) local363;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(945) int local945;
		@Pc(951) byte local951;
		@Pc(965) int local965;
		@Pc(973) int local973;
		@Pc(982) int local982;
		@Pc(916) byte local916;
		@Pc(1025) int local1025;
		if (local307 != null) {
			local363 = local38.method1698();
			local307[0] = (byte) local363;
			for (local804 = 2; local804 < local307.length; local804 += 2) {
				local363 += local38.method1698() + 1;
				local307[local804] = (byte) local363;
			}
			local916 = local307[0];
			@Pc(920) byte local920 = local307[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray34[local922] = (byte) (this.aByteArray34[local922] * local920 + 32 >> 6);
			}
			local945 = 2;
			while (local945 < local307.length) {
				local951 = local307[local945];
				local965 = (local951 - local916) / 2 + local920 * (local951 - local916);
				@Pc(971) byte local971 = local307[local945 + 1];
				for (local973 = local916; local973 < local951; local973++) {
					local982 = Static121.method2001(local951 - local916, local965);
					local965 += local971 - local920;
					this.aByteArray34[local973] = (byte) (this.aByteArray34[local973] * local982 + 32 >> 6);
				}
				local945 += 2;
				local916 = local951;
				local920 = local971;
			}
			for (local1025 = local916; local1025 < 128; local1025++) {
				this.aByteArray34[local1025] = (byte) (local920 * this.aByteArray34[local1025] + 32 >> 6);
			}
		}
		@Pc(1095) int local1095;
		if (local337 != null) {
			local363 = local38.method1698();
			local337[0] = (byte) local363;
			for (local804 = 2; local804 < local337.length; local804 += 2) {
				local363 = local38.method1698() + local363 + 1;
				local337[local804] = (byte) local363;
			}
			local916 = local337[0];
			local1095 = local337[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local945 = (this.aByteArray33[local922] & 0xFF) + local1095;
				if (local945 < 0) {
					local945 = 0;
				}
				if (local945 > 128) {
					local945 = 128;
				}
				this.aByteArray33[local922] = (byte) local945;
			}
			local945 = 2;
			@Pc(1146) int local1146;
			while (local337.length > local945) {
				local951 = local337[local945];
				local1146 = local337[local945 + 1] << 1;
				local945 += 2;
				local965 = (local951 - local916) * local1095 + (local951 - local916) / 2;
				for (local973 = local916; local973 < local951; local973++) {
					local982 = Static121.method2001(local951 - local916, local965);
					local965 += local1146 - local1095;
					@Pc(1190) int local1190 = (this.aByteArray33[local973] & 0xFF) + local982;
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray33[local973] = (byte) local1190;
				}
				local916 = local951;
				local1095 = local1146;
			}
			for (local1025 = local916; local1025 < 128; local1025++) {
				local1146 = local1095 + (this.aByteArray33[local1025] & 0xFF);
				if (local1146 < 0) {
					local1146 = 0;
				}
				if (local1146 > 128) {
					local1146 = 128;
				}
				this.aByteArray33[local1025] = (byte) local1146;
			}
		}
		for (local804 = 0; local804 < local189; local804++) {
			local239[local804].anInt655 = local38.method1698();
		}
		for (local849 = 0; local849 < local189; local849++) {
			@Pc(1281) Class7 local1281 = local239[local849];
			if (local1281.aByteArray9 != null) {
				local1281.anInt657 = local38.method1698();
			}
			if (local1281.aByteArray8 != null) {
				local1281.anInt656 = local38.method1698();
			}
			if (local1281.anInt655 > 0) {
				local1281.anInt660 = local38.method1698();
			}
		}
		for (local1095 = 0; local1095 < local189; local1095++) {
			local239[local1095].anInt661 = local38.method1698();
		}
		for (local922 = 0; local922 < local189; local922++) {
			@Pc(1340) Class7 local1340 = local239[local922];
			if (local1340.anInt661 > 0) {
				local1340.anInt653 = local38.method1698();
			}
		}
		for (local945 = 0; local945 < local189; local945++) {
			@Pc(1364) Class7 local1364 = local239[local945];
			if (local1364.anInt653 > 0) {
				local1364.anInt659 = local38.method1698();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jb;I[B[I)Z")
	public boolean method1577(@OriginalArg(0) Class39 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) int local12 = 0;
		@Pc(14) Class2_Sub18_Sub1 local14 = null;
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray219[local18];
				if (local30 != 0) {
					if (local12 != local30) {
						local12 = local30--;
						if ((local30 & 0x1) == 0) {
							local14 = arg0.method1439(local30 >> 2, arg2);
						} else {
							local14 = arg0.method1438(local30 >> 2, arg2);
						}
						if (local14 == null) {
							local16 = false;
						}
					}
					if (local14 != null) {
						this.aClass2_Sub18_Sub1Array1[local18] = local14;
						this.anIntArray219[local18] = 0;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public void method1580() {
		this.anIntArray219 = null;
	}
}
