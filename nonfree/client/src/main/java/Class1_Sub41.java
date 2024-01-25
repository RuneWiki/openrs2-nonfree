import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "[Lclient!jj;")
	public Class1_Sub25_Sub1[] aClass1_Sub25_Sub1Array1;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "[Lclient!rh;")
	public Class210[] aClass210Array1;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	private Class1_Sub41() {
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
	public Class1_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aClass210Array1 = new Class210[128];
		this.aShortArray113 = new short[128];
		this.aClass1_Sub25_Sub1Array1 = new Class1_Sub25_Sub1[128];
		this.aByteArray90 = new byte[128];
		this.aByteArray92 = new byte[128];
		this.aByteArray91 = new byte[128];
		this.anIntArray486 = new int[128];
		@Pc(36) Class1_Sub28 local36 = new Class1_Sub28(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray86[local36.anInt6812 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method5367();
		}
		local38++;
		local36.anInt6812++;
		@Pc(76) int local76 = local36.anInt6812;
		local36.anInt6812 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray86[local84 + local36.anInt6812] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method5367();
		}
		local36.anInt6812++;
		local84++;
		@Pc(122) int local122 = local36.anInt6812;
		local36.anInt6812 += local84;
		@Pc(130) int local130;
		for (local130 = 0; local36.aByteArray86[local36.anInt6812 + local130] != 0; local130++) {
		}
		@Pc(145) byte[] local145 = new byte[local130];
		for (@Pc(147) int local147 = 0; local147 < local130; local147++) {
			local145[local147] = local36.method5367();
		}
		local36.anInt6812++;
		local130++;
		@Pc(169) byte[] local169 = new byte[local130];
		@Pc(176) int local176;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local130 <= 1) {
			local176 = local130;
		} else {
			local169[1] = 1;
			@Pc(184) int local184 = 1;
			local176 = 2;
			for (local188 = 2; local188 < local130; local188++) {
				local194 = local36.method5337();
				if (local194 == 0) {
					local184 = local176++;
				} else {
					if (local184 >= local194) {
						local194--;
					}
					local184 = local194;
				}
				local169[local188] = (byte) local184;
			}
		}
		@Pc(219) Class210[] local219 = new Class210[local176];
		for (local188 = 0; local188 < local219.length; local188++) {
			@Pc(231) Class210 local231 = local219[local188] = new Class210();
			@Pc(235) int local235 = local36.method5337();
			if (local235 > 0) {
				local231.aByteArray72 = new byte[local235 * 2];
			}
			local235 = local36.method5337();
			if (local235 > 0) {
				local231.aByteArray73 = new byte[local235 * 2 + 2];
				local231.aByteArray73[1] = 64;
			}
		}
		local194 = local36.method5337();
		@Pc(280) byte[] local280 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local36.method5337();
		@Pc(296) byte[] local296 = local194 > 0 ? new byte[local194 * 2] : null;
		@Pc(298) int local298;
		for (local298 = 0; local36.aByteArray86[local298 + local36.anInt6812] != 0; local298++) {
		}
		@Pc(312) byte[] local312 = new byte[local298];
		for (@Pc(314) int local314 = 0; local314 < local298; local314++) {
			local312[local314] = local36.method5367();
		}
		local36.anInt6812++;
		local298++;
		@Pc(339) int local339 = 0;
		for (@Pc(341) int local341 = 0; local341 < 128; local341++) {
			local339 += local36.method5337();
			this.aShortArray113[local341] = (short) local339;
		}
		local339 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local339 += local36.method5337();
			this.aShortArray113[local363] = (short) (this.aShortArray113[local363] + (local339 << 8));
		}
		@Pc(388) int local388 = 0;
		@Pc(390) int local390 = 0;
		@Pc(392) int local392 = 0;
		for (@Pc(394) int local394 = 0; local394 < 128; local394++) {
			if (local388 == 0) {
				if (local390 >= local312.length) {
					local388 = -1;
				} else {
					local388 = local312[local390++];
				}
				local392 = local36.method5394();
			}
			this.aShortArray113[local394] = (short) (this.aShortArray113[local394] + ((local392 - 1 & 0x2) << 14));
			local388--;
			this.anIntArray486[local394] = local392;
		}
		local388 = 0;
		local390 = 0;
		@Pc(453) int local453 = 0;
		for (@Pc(455) int local455 = 0; local455 < 128; local455++) {
			if (this.anIntArray486[local455] != 0) {
				if (local388 == 0) {
					if (local52.length <= local390) {
						local388 = -1;
					} else {
						local388 = local52[local390++];
					}
					local453 = local36.aByteArray86[local76++] - 1;
				}
				local388--;
				this.aByteArray90[local455] = (byte) local453;
			}
		}
		local388 = 0;
		local390 = 0;
		@Pc(514) int local514 = 0;
		for (@Pc(516) int local516 = 0; local516 < 128; local516++) {
			if (this.anIntArray486[local516] != 0) {
				if (local388 == 0) {
					local514 = local36.aByteArray86[local122++] + 16 << 2;
					if (local98.length <= local390) {
						local388 = -1;
					} else {
						local388 = local98[local390++];
					}
				}
				this.aByteArray92[local516] = (byte) local514;
				local388--;
			}
		}
		local388 = 0;
		local390 = 0;
		@Pc(570) Class210 local570 = null;
		for (@Pc(572) int local572 = 0; local572 < 128; local572++) {
			if (this.anIntArray486[local572] != 0) {
				if (local388 == 0) {
					local570 = local219[local169[local390]];
					if (local390 < local145.length) {
						local388 = local145[local390++];
					} else {
						local388 = -1;
					}
				}
				local388--;
				this.aClass210Array1[local572] = local570;
			}
		}
		local388 = 0;
		local390 = 0;
		@Pc(625) int local625 = 0;
		for (@Pc(627) int local627 = 0; local627 < 128; local627++) {
			if (local388 == 0) {
				if (local312.length > local390) {
					local388 = local312[local390++];
				} else {
					local388 = -1;
				}
				if (this.anIntArray486[local627] > 0) {
					local625 = local36.method5337() + 1;
				}
			}
			local388--;
			this.aByteArray91[local627] = (byte) local625;
		}
		this.anInt7193 = local36.method5337() + 1;
		@Pc(686) int local686;
		for (@Pc(675) int local675 = 0; local675 < local176; local675++) {
			@Pc(681) Class210 local681 = local219[local675];
			if (local681.aByteArray72 != null) {
				for (local686 = 1; local686 < local681.aByteArray72.length; local686 += 2) {
					local681.aByteArray72[local686] = local36.method5367();
				}
			}
			if (local681.aByteArray73 != null) {
				for (local686 = 3; local686 < local681.aByteArray73.length - 2; local686 += 2) {
					local681.aByteArray73[local686] = local36.method5367();
				}
			}
		}
		@Pc(735) int local735;
		if (local280 != null) {
			for (local735 = 1; local735 < local280.length; local735 += 2) {
				local280[local735] = local36.method5367();
			}
		}
		if (local296 != null) {
			for (local735 = 1; local735 < local296.length; local735 += 2) {
				local296[local735] = local36.method5367();
			}
		}
		@Pc(784) int local784;
		for (local735 = 0; local735 < local176; local735++) {
			@Pc(777) Class210 local777 = local219[local735];
			if (local777.aByteArray73 != null) {
				local339 = 0;
				for (local784 = 2; local784 < local777.aByteArray73.length; local784 += 2) {
					local339 = local36.method5337() + local339 + 1;
					local777.aByteArray73[local784] = (byte) local339;
				}
			}
		}
		@Pc(829) int local829;
		for (local686 = 0; local686 < local176; local686++) {
			@Pc(822) Class210 local822 = local219[local686];
			if (local822.aByteArray72 != null) {
				local339 = 0;
				for (local829 = 2; local829 < local822.aByteArray72.length; local829 += 2) {
					local339 = local36.method5337() + local339 + 1;
					local822.aByteArray72[local829] = (byte) local339;
				}
			}
		}
		@Pc(907) int local907;
		@Pc(934) int local934;
		@Pc(940) byte local940;
		@Pc(961) int local961;
		@Pc(963) int local963;
		@Pc(973) int local973;
		@Pc(901) byte local901;
		@Pc(1013) int local1013;
		if (local280 != null) {
			local339 = local36.method5337();
			local280[0] = (byte) local339;
			for (local784 = 2; local784 < local280.length; local784 += 2) {
				local339 = local339 + local36.method5337() + 1;
				local280[local784] = (byte) local339;
			}
			local901 = local280[0];
			@Pc(905) byte local905 = local280[1];
			for (local907 = 0; local907 < local901; local907++) {
				this.aByteArray91[local907] = (byte) (local905 * this.aByteArray91[local907] + 32 >> 6);
			}
			local934 = 2;
			while (local934 < local280.length) {
				local940 = local280[local934];
				@Pc(946) byte local946 = local280[local934 + 1];
				local961 = (local940 - local901) * local905 + (local940 - local901) / 2;
				for (local963 = local901; local963 < local940; local963++) {
					local973 = Static448.method5873(local961, local940 - local901);
					local961 += local946 - local905;
					this.aByteArray91[local963] = (byte) (local973 * this.aByteArray91[local963] + 32 >> 6);
				}
				local934 += 2;
				local905 = local946;
				local901 = local940;
			}
			for (local1013 = local901; local1013 < 128; local1013++) {
				this.aByteArray91[local1013] = (byte) (local905 * this.aByteArray91[local1013] + 32 >> 6);
			}
		}
		@Pc(1079) int local1079;
		if (local296 != null) {
			local339 = local36.method5337();
			local296[0] = (byte) local339;
			for (local784 = 2; local784 < local296.length; local784 += 2) {
				local339 = local36.method5337() + local339 + 1;
				local296[local784] = (byte) local339;
			}
			local901 = local296[0];
			local1079 = local296[1] << 1;
			for (local907 = 0; local907 < local901; local907++) {
				local934 = (this.aByteArray92[local907] & 0xFF) + local1079;
				if (local934 < 0) {
					local934 = 0;
				}
				if (local934 > 128) {
					local934 = 128;
				}
				this.aByteArray92[local907] = (byte) local934;
			}
			local934 = 2;
			@Pc(1127) int local1127;
			while (local934 < local296.length) {
				local940 = local296[local934];
				local1127 = local296[local934 + 1] << 1;
				local961 = (local940 - local901) * local1079 + (local940 - local901) / 2;
				for (local963 = local901; local963 < local940; local963++) {
					local973 = Static448.method5873(local961, local940 - local901);
					@Pc(1162) int local1162 = (this.aByteArray92[local963] & 0xFF) + local973;
					if (local1162 < 0) {
						local1162 = 0;
					}
					if (local1162 > 128) {
						local1162 = 128;
					}
					this.aByteArray92[local963] = (byte) local1162;
					local961 += local1127 - local1079;
				}
				local934 += 2;
				local1079 = local1127;
				local901 = local940;
			}
			for (local1013 = local901; local1013 < 128; local1013++) {
				local1127 = (this.aByteArray92[local1013] & 0xFF) + local1079;
				if (local1127 < 0) {
					local1127 = 0;
				}
				if (local1127 > 128) {
					local1127 = 128;
				}
				this.aByteArray92[local1013] = (byte) local1127;
			}
		}
		for (local784 = 0; local784 < local176; local784++) {
			local219[local784].anInt5955 = local36.method5337();
		}
		for (local829 = 0; local829 < local176; local829++) {
			@Pc(1269) Class210 local1269 = local219[local829];
			if (local1269.aByteArray72 != null) {
				local1269.anInt5951 = local36.method5337();
			}
			if (local1269.aByteArray73 != null) {
				local1269.anInt5949 = local36.method5337();
			}
			if (local1269.anInt5955 > 0) {
				local1269.anInt5957 = local36.method5337();
			}
		}
		for (local1079 = 0; local1079 < local176; local1079++) {
			local219[local1079].anInt5956 = local36.method5337();
		}
		for (local907 = 0; local907 < local176; local907++) {
			@Pc(1327) Class210 local1327 = local219[local907];
			if (local1327.anInt5956 > 0) {
				local1327.anInt5952 = local36.method5337();
			}
		}
		for (local934 = 0; local934 < local176; local934++) {
			@Pc(1350) Class210 local1350 = local219[local934];
			if (local1350.anInt5952 > 0) {
				local1350.anInt5953 = local36.method5337();
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[BLclient!cg;B)Z")
	public boolean method5636(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class36 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub25_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray486[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method827(arg0, local25 >> 2);
						} else {
							local11 = arg2.method824(local25 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub25_Sub1Array1[local13] = local11;
						this.anIntArray486[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
	public void method5639() {
		this.anIntArray486 = null;
	}
}
