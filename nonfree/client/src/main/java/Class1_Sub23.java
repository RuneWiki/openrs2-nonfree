import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "[Lclient!d;")
	public Class1_Sub7_Sub1[] aClass1_Sub7_Sub1Array1 = new Class1_Sub7_Sub1[128];

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "[B")
	public byte[] aByteArray41 = new byte[128];

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "[B")
	public byte[] aByteArray42 = new byte[128];

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "[B")
	public byte[] aByteArray43 = new byte[128];

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
	private int[] anIntArray339 = new int[128];

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	public int anInt4231;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "[S")
	public short[] aShortArray60 = new short[128];

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "[Lclient!wk;")
	public Class193[] aClass193Array1 = new Class193[128];

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([B)V")
	public Class1_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub14 local36 = new Class1_Sub14(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray34[local36.anInt3290 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		@Pc(58) int local58;
		for (local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method2598();
		}
		local36.anInt3290++;
		local38++;
		@Pc(83) int local83 = 0;
		local58 = local36.anInt3290;
		local36.anInt3290 += local38;
		while (local36.aByteArray34[local36.anInt3290 + local83] != 0) {
			local83++;
		}
		@Pc(107) byte[] local107 = new byte[local83];
		@Pc(109) int local109;
		for (local109 = 0; local109 < local83; local109++) {
			local107[local109] = local36.method2598();
		}
		local83++;
		local36.anInt3290++;
		@Pc(134) int local134 = 0;
		local109 = local36.anInt3290;
		local36.anInt3290 += local83;
		while (local36.aByteArray34[local36.anInt3290 + local134] != 0) {
			local134++;
		}
		@Pc(161) byte[] local161 = new byte[local134];
		for (@Pc(163) int local163 = 0; local163 < local134; local163++) {
			local161[local163] = local36.method2598();
		}
		local36.anInt3290++;
		local134++;
		@Pc(189) byte[] local189 = new byte[local134];
		@Pc(194) int local194;
		@Pc(206) int local206;
		if (local134 <= 1) {
			local194 = local134;
		} else {
			local189[1] = 1;
			@Pc(202) int local202 = 1;
			local194 = 2;
			for (local206 = 2; local206 < local134; local206++) {
				@Pc(213) int local213 = local36.method2595();
				if (local213 == 0) {
					local202 = local194++;
				} else {
					if (local202 >= local213) {
						local213--;
					}
					local202 = local213;
				}
				local189[local206] = (byte) local202;
			}
		}
		@Pc(242) Class193[] local242 = new Class193[local194];
		for (local206 = 0; local206 < local242.length; local206++) {
			@Pc(256) Class193 local256 = local242[local206] = new Class193();
			@Pc(260) int local260 = local36.method2595();
			if (local260 > 0) {
				local256.aByteArray76 = new byte[local260 * 2];
			}
			local260 = local36.method2595();
			if (local260 > 0) {
				local256.aByteArray75 = new byte[local260 * 2 + 2];
				local256.aByteArray75[1] = 64;
			}
		}
		local206 = local36.method2595();
		@Pc(305) byte[] local305 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local36.method2595();
		@Pc(321) byte[] local321 = local206 > 0 ? new byte[local206 * 2] : null;
		@Pc(323) int local323;
		for (local323 = 0; local36.aByteArray34[local36.anInt3290 + local323] != 0; local323++) {
		}
		@Pc(340) byte[] local340 = new byte[local323];
		@Pc(342) int local342;
		for (local342 = 0; local342 < local323; local342++) {
			local340[local342] = local36.method2598();
		}
		local323++;
		local36.anInt3290++;
		local342 = 0;
		@Pc(365) int local365;
		for (local365 = 0; local365 < 128; local365++) {
			local342 += local36.method2595();
			this.aShortArray60[local365] = (short) local342;
		}
		local342 = 0;
		for (local365 = 0; local365 < 128; local365++) {
			local342 += local36.method2595();
			this.aShortArray60[local365] = (short) (this.aShortArray60[local365] + (local342 << 8));
		}
		local365 = 0;
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420;
		for (local420 = 0; local420 < 128; local420++) {
			if (local365 == 0) {
				if (local340.length > local416) {
					local365 = local340[local416++];
				} else {
					local365 = -1;
				}
				local418 = local36.method2628();
			}
			local365--;
			this.aShortArray60[local420] = (short) (this.aShortArray60[local420] + ((local418 - 1 & 0x2) << 14));
			this.anIntArray339[local420] = local418;
		}
		local416 = 0;
		local365 = 0;
		local420 = 0;
		@Pc(478) int local478;
		for (local478 = 0; local478 < 128; local478++) {
			if (this.anIntArray339[local478] != 0) {
				if (local365 == 0) {
					if (local416 < local56.length) {
						local365 = local56[local416++];
					} else {
						local365 = -1;
					}
					local420 = local36.aByteArray34[local58++] - 1;
				}
				local365--;
				this.aByteArray43[local478] = (byte) local420;
			}
		}
		local365 = 0;
		local478 = 0;
		local416 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray339[local535] != 0) {
				if (local365 == 0) {
					if (local107.length > local416) {
						local365 = local107[local416++];
					} else {
						local365 = -1;
					}
					local478 = local36.aByteArray34[local109++] + 16 << 2;
				}
				this.aByteArray42[local535] = (byte) local478;
				local365--;
			}
		}
		local416 = 0;
		local365 = 0;
		@Pc(593) Class193 local593 = null;
		@Pc(595) int local595;
		for (local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray339[local595] != 0) {
				if (local365 == 0) {
					local593 = local242[local189[local416]];
					if (local161.length > local416) {
						local365 = local161[local416++];
					} else {
						local365 = -1;
					}
				}
				this.aClass193Array1[local595] = local593;
				local365--;
			}
		}
		local416 = 0;
		local365 = 0;
		local595 = 0;
		@Pc(646) int local646;
		for (local646 = 0; local646 < 128; local646++) {
			if (local365 == 0) {
				if (local340.length <= local416) {
					local365 = -1;
				} else {
					local365 = local340[local416++];
				}
				if (this.anIntArray339[local646] > 0) {
					local595 = local36.method2595() + 1;
				}
			}
			this.aByteArray41[local646] = (byte) local595;
			local365--;
		}
		this.anInt4231 = local36.method2595() + 1;
		@Pc(706) Class193 local706;
		@Pc(713) int local713;
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.aByteArray76 != null) {
				for (local713 = 1; local713 < local706.aByteArray76.length; local713 += 2) {
					local706.aByteArray76[local713] = local36.method2598();
				}
			}
			if (local706.aByteArray75 != null) {
				for (local713 = 3; local713 < local706.aByteArray75.length - 2; local713 += 2) {
					local706.aByteArray75[local713] = local36.method2598();
				}
			}
		}
		if (local305 != null) {
			for (local646 = 1; local646 < local305.length; local646 += 2) {
				local305[local646] = local36.method2598();
			}
		}
		if (local321 != null) {
			for (local646 = 1; local646 < local321.length; local646 += 2) {
				local321[local646] = local36.method2598();
			}
		}
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.aByteArray75 != null) {
				local342 = 0;
				for (local713 = 2; local713 < local706.aByteArray75.length; local713 += 2) {
					local342 = local36.method2595() + local342 + 1;
					local706.aByteArray75[local713] = (byte) local342;
				}
			}
		}
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.aByteArray76 != null) {
				local342 = 0;
				for (local713 = 2; local713 < local706.aByteArray76.length; local713 += 2) {
					local342 = local36.method2595() + local342 + 1;
					local706.aByteArray76[local713] = (byte) local342;
				}
			}
		}
		@Pc(979) byte local979;
		@Pc(999) int local999;
		@Pc(1001) int local1001;
		@Pc(1015) int local1015;
		@Pc(1049) int local1049;
		@Pc(938) byte local938;
		if (local305 != null) {
			local342 = local36.method2595();
			local305[0] = (byte) local342;
			for (local646 = 2; local646 < local305.length; local646 += 2) {
				local342 += local36.method2595() + 1;
				local305[local646] = (byte) local342;
			}
			@Pc(934) byte local934 = local305[1];
			local938 = local305[0];
			for (local713 = 0; local713 < local938; local713++) {
				this.aByteArray41[local713] = (byte) (this.aByteArray41[local713] * local934 + 32 >> 6);
			}
			local713 = 2;
			while (local305.length > local713) {
				local979 = local305[local713];
				@Pc(985) byte local985 = local305[local713 + 1];
				local713 += 2;
				local999 = (local979 - local938) / 2 + local934 * (local979 - local938);
				for (local1001 = local938; local1001 < local979; local1001++) {
					local1015 = Static213.method3386(local999, local979 - local938);
					this.aByteArray41[local1001] = (byte) (this.aByteArray41[local1001] * local1015 + 32 >> 6);
					local999 += local985 - local934;
				}
				local938 = local979;
				local934 = local985;
			}
			for (local1049 = local938; local1049 < 128; local1049++) {
				this.aByteArray41[local1049] = (byte) (this.aByteArray41[local1049] * local934 + 32 >> 6);
			}
		}
		if (local321 != null) {
			local342 = local36.method2595();
			local321[0] = (byte) local342;
			for (local646 = 2; local646 < local321.length; local646 += 2) {
				local342 = local36.method2595() + local342 + 1;
				local321[local646] = (byte) local342;
			}
			local938 = local321[0];
			@Pc(1114) int local1114 = local321[1] << 1;
			for (local713 = 0; local713 < local938; local713++) {
				local1049 = (this.aByteArray42[local713] & 0xFF) + local1114;
				if (local1049 < 0) {
					local1049 = 0;
				}
				if (local1049 > 128) {
					local1049 = 128;
				}
				this.aByteArray42[local713] = (byte) local1049;
			}
			local713 = 2;
			@Pc(1176) int local1176;
			while (local321.length > local713) {
				local979 = local321[local713];
				local1176 = local321[local713 + 1] << 1;
				local713 += 2;
				local999 = (local979 - local938) * local1114 + (local979 - local938) / 2;
				for (local1001 = local938; local1001 < local979; local1001++) {
					local1015 = Static213.method3386(local999, local979 - local938);
					local999 += local1176 - local1114;
					@Pc(1221) int local1221 = (this.aByteArray42[local1001] & 0xFF) + local1015;
					if (local1221 < 0) {
						local1221 = 0;
					}
					if (local1221 > 128) {
						local1221 = 128;
					}
					this.aByteArray42[local1001] = (byte) local1221;
				}
				local1114 = local1176;
				local938 = local979;
			}
			for (local1049 = local938; local1049 < 128; local1049++) {
				local1176 = local1114 + (this.aByteArray42[local1049] & 0xFF);
				if (local1176 < 0) {
					local1176 = 0;
				}
				if (local1176 > 128) {
					local1176 = 128;
				}
				this.aByteArray42[local1049] = (byte) local1176;
			}
		}
		for (local646 = 0; local646 < local194; local646++) {
			local242[local646].anInt5904 = local36.method2595();
		}
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.aByteArray76 != null) {
				local706.anInt5897 = local36.method2595();
			}
			if (local706.aByteArray75 != null) {
				local706.anInt5898 = local36.method2595();
			}
			if (local706.anInt5904 > 0) {
				local706.anInt5905 = local36.method2595();
			}
		}
		for (local646 = 0; local646 < local194; local646++) {
			local242[local646].anInt5903 = local36.method2595();
		}
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.anInt5903 > 0) {
				local706.anInt5902 = local36.method2595();
			}
		}
		for (local646 = 0; local646 < local194; local646++) {
			local706 = local242[local646];
			if (local706.anInt5902 > 0) {
				local706.anInt5901 = local36.method2595();
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BLclient!on;[I)Z")
	public boolean method3397(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class1_Sub7_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(34) int local34 = this.anIntArray339[local18];
				if (local34 != 0) {
					if (local34 != local7) {
						local7 = local34--;
						if ((local34 & 0x1) == 0) {
							local11 = arg1.method3255(local34 >> 2, arg2);
						} else {
							local11 = arg1.method3249(local34 >> 2, arg2);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub7_Sub1Array1[local18] = local11;
						this.anIntArray339[local18] = 0;
					}
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
	public void method3399() {
		this.anIntArray339 = null;
	}
}
