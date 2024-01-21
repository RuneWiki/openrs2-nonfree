import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[B")
	public final byte[] aByteArray13 = new byte[128];

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "[B")
	public final byte[] aByteArray14 = new byte[128];

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "[I")
	private int[] anIntArray132 = new int[128];

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lclient!p;")
	public final Class8_Sub9_Sub1[] aClass8_Sub9_Sub1Array1 = new Class8_Sub9_Sub1[128];

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "[S")
	public final short[] aShortArray26 = new short[128];

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	public final int anInt979;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "[Lclient!tf;")
	public final Class75[] aClass75Array1 = new Class75[128];

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "[B")
	public final byte[] aByteArray15 = new byte[128];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
	public Class8_Sub8(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class8_Sub20 local38 = new Class8_Sub20(arg0);
		while (local38.aByteArray44[local33 + local38.anInt2853] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1847();
		}
		local33++;
		local38.anInt2853++;
		@Pc(75) int local75 = 0;
		@Pc(78) int local78 = local38.anInt2853;
		local38.anInt2853 += local33;
		while (local38.aByteArray44[local75 + local38.anInt2853] != 0) {
			local75++;
		}
		@Pc(101) byte[] local101 = new byte[local75];
		for (@Pc(103) int local103 = 0; local103 < local75; local103++) {
			local101[local103] = local38.method1847();
		}
		local38.anInt2853++;
		local75++;
		@Pc(128) int local128 = 0;
		@Pc(131) int local131 = local38.anInt2853;
		local38.anInt2853 += local75;
		while (local38.aByteArray44[local128 + local38.anInt2853] != 0) {
			local128++;
		}
		@Pc(154) byte[] local154 = new byte[local128];
		for (@Pc(156) int local156 = 0; local156 < local128; local156++) {
			local154[local156] = local38.method1847();
		}
		local128++;
		@Pc(176) byte[] local176 = new byte[local128];
		local38.anInt2853++;
		@Pc(189) int local189;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local128 <= 1) {
			local189 = local128;
		} else {
			local189 = 2;
			local176[1] = 1;
			@Pc(199) int local199 = 1;
			for (local201 = 2; local201 < local128; local201++) {
				local207 = local38.method1872();
				if (local207 == 0) {
					local199 = local189++;
				} else {
					if (local199 >= local207) {
						local207--;
					}
					local199 = local207;
				}
				local176[local201] = (byte) local199;
			}
		}
		@Pc(236) Class75[] local236 = new Class75[local189];
		for (local201 = 0; local201 < local236.length; local201++) {
			@Pc(248) Class75 local248 = local236[local201] = new Class75();
			@Pc(252) int local252 = local38.method1872();
			if (local252 > 0) {
				local248.aByteArray39 = new byte[local252 * 2];
			}
			local252 = local38.method1872();
			if (local252 > 0) {
				local248.aByteArray40 = new byte[local252 * 2 + 2];
				local248.aByteArray40[1] = 64;
			}
		}
		local207 = local38.method1872();
		@Pc(307) byte[] local307 = local207 <= 0 ? null : new byte[local207 * 2];
		local207 = local38.method1872();
		@Pc(323) byte[] local323 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(325) int local325;
		for (local325 = 0; local38.aByteArray44[local38.anInt2853 + local325] != 0; local325++) {
		}
		@Pc(339) byte[] local339 = new byte[local325];
		for (@Pc(341) int local341 = 0; local341 < local325; local341++) {
			local339[local341] = local38.method1847();
		}
		local38.anInt2853++;
		local325++;
		@Pc(366) int local366 = 0;
		for (@Pc(368) int local368 = 0; local368 < 128; local368++) {
			local366 += local38.method1872();
			this.aShortArray26[local368] = (short) local366;
		}
		local366 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local366 += local38.method1872();
			this.aShortArray26[local392] = (short) (this.aShortArray26[local392] + (local366 << 8));
		}
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		for (@Pc(425) int local425 = 0; local425 < 128; local425++) {
			if (local419 == 0) {
				if (local339.length > local421) {
					local419 = local339[local421++];
				} else {
					local419 = -1;
				}
				local423 = local38.method1857();
			}
			local419--;
			this.aShortArray26[local425] = (short) (this.aShortArray26[local425] + ((local423 - 1 & 0x2) << 14));
			this.anIntArray132[local425] = local423;
		}
		@Pc(476) int local476 = 0;
		local419 = 0;
		local421 = 0;
		for (@Pc(482) int local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray132[local482] != 0) {
				if (local419 == 0) {
					local476 = local38.aByteArray44[local78++] - 1;
					if (local421 < local52.length) {
						local419 = local52[local421++];
					} else {
						local419 = -1;
					}
				}
				this.aByteArray14[local482] = (byte) local476;
				local419--;
			}
		}
		local421 = 0;
		local419 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray132[local534] != 0) {
				if (local419 == 0) {
					if (local101.length <= local421) {
						local419 = -1;
					} else {
						local419 = local101[local421++];
					}
					local532 = local38.aByteArray44[local131++] + 16 << 2;
				}
				this.aByteArray15[local534] = (byte) local532;
				local419--;
			}
		}
		local419 = 0;
		@Pc(591) Class75 local591 = null;
		local421 = 0;
		for (@Pc(595) int local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray132[local595] != 0) {
				if (local419 == 0) {
					local591 = local236[local176[local421]];
					if (local154.length <= local421) {
						local419 = -1;
					} else {
						local419 = local154[local421++];
					}
				}
				local419--;
				this.aClass75Array1[local595] = local591;
			}
		}
		local419 = 0;
		local421 = 0;
		@Pc(638) int local638 = 0;
		for (@Pc(640) int local640 = 0; local640 < 128; local640++) {
			if (local419 == 0) {
				if (local339.length > local421) {
					local419 = local339[local421++];
				} else {
					local419 = -1;
				}
				if (this.anIntArray132[local640] > 0) {
					local638 = local38.method1872() + 1;
				}
			}
			this.aByteArray13[local640] = (byte) local638;
			local419--;
		}
		this.anInt979 = local38.method1872() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local189; local697++) {
			@Pc(703) Class75 local703 = local236[local697];
			if (local703.aByteArray39 != null) {
				for (local708 = 1; local708 < local703.aByteArray39.length; local708 += 2) {
					local703.aByteArray39[local708] = local38.method1847();
				}
			}
			if (local703.aByteArray40 != null) {
				for (local708 = 3; local708 < local703.aByteArray40.length - 2; local708 += 2) {
					local703.aByteArray40[local708] = local38.method1847();
				}
			}
		}
		@Pc(757) int local757;
		if (local307 != null) {
			for (local757 = 1; local757 < local307.length; local757 += 2) {
				local307[local757] = local38.method1847();
			}
		}
		if (local323 != null) {
			for (local757 = 1; local757 < local323.length; local757 += 2) {
				local323[local757] = local38.method1847();
			}
		}
		@Pc(806) int local806;
		for (local757 = 0; local757 < local189; local757++) {
			@Pc(799) Class75 local799 = local236[local757];
			if (local799.aByteArray40 != null) {
				local366 = 0;
				for (local806 = 2; local806 < local799.aByteArray40.length; local806 += 2) {
					local366 = local38.method1872() + local366 + 1;
					local799.aByteArray40[local806] = (byte) local366;
				}
			}
		}
		@Pc(851) int local851;
		for (local708 = 0; local708 < local189; local708++) {
			@Pc(844) Class75 local844 = local236[local708];
			if (local844.aByteArray39 != null) {
				local366 = 0;
				for (local851 = 2; local851 < local844.aByteArray39.length; local851 += 2) {
					local366 = local366 + local38.method1872() + 1;
					local844.aByteArray39[local851] = (byte) local366;
				}
			}
		}
		@Pc(932) int local932;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(976) int local976;
		@Pc(985) int local985;
		@Pc(994) int local994;
		@Pc(930) byte local930;
		@Pc(1030) int local1030;
		if (local307 != null) {
			local366 = local38.method1872();
			local307[0] = (byte) local366;
			for (local806 = 2; local806 < local307.length; local806 += 2) {
				local366 += local38.method1872() + 1;
				local307[local806] = (byte) local366;
			}
			@Pc(926) byte local926 = local307[1];
			local930 = local307[0];
			for (local932 = 0; local932 < local930; local932++) {
				this.aByteArray13[local932] = (byte) (this.aByteArray13[local932] * local926 + 32 >> 6);
			}
			local955 = 2;
			while (local307.length > local955) {
				local961 = local307[local955];
				local976 = (local961 - local930) * local926 + (local961 - local930) / 2;
				@Pc(982) byte local982 = local307[local955 + 1];
				local955 += 2;
				for (local985 = local930; local985 < local961; local985++) {
					local994 = Static66.method1956(local976, local961 - local930);
					this.aByteArray13[local985] = (byte) (this.aByteArray13[local985] * local994 + 32 >> 6);
					local976 += local982 - local926;
				}
				local926 = local982;
				local930 = local961;
			}
			for (local1030 = local930; local1030 < 128; local1030++) {
				this.aByteArray13[local1030] = (byte) (local926 * this.aByteArray13[local1030] + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local323 != null) {
			local366 = local38.method1872();
			local323[0] = (byte) local366;
			for (local806 = 2; local806 < local323.length; local806 += 2) {
				local366 = local38.method1872() + local366 + 1;
				local323[local806] = (byte) local366;
			}
			local930 = local323[0];
			local1100 = local323[1] << 1;
			for (local932 = 0; local932 < local930; local932++) {
				local955 = (this.aByteArray15[local932] & 0xFF) + local1100;
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray15[local932] = (byte) local955;
			}
			local955 = 2;
			@Pc(1158) int local1158;
			while (local323.length > local955) {
				local961 = local323[local955];
				local1158 = local323[local955 + 1] << 1;
				local955 += 2;
				local976 = (local961 - local930) * local1100 + (local961 - local930) / 2;
				for (local985 = local930; local985 < local961; local985++) {
					local994 = Static66.method1956(local976, local961 - local930);
					@Pc(1194) int local1194 = local994 + (this.aByteArray15[local985] & 0xFF);
					local976 += local1158 - local1100;
					if (local1194 < 0) {
						local1194 = 0;
					}
					if (local1194 > 128) {
						local1194 = 128;
					}
					this.aByteArray15[local985] = (byte) local1194;
				}
				local1100 = local1158;
				local930 = local961;
			}
			for (local1030 = local930; local1030 < 128; local1030++) {
				local1158 = (this.aByteArray15[local1030] & 0xFF) + local1100;
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray15[local1030] = (byte) local1158;
			}
		}
		for (local806 = 0; local806 < local189; local806++) {
			local236[local806].anInt2625 = local38.method1872();
		}
		for (local851 = 0; local851 < local189; local851++) {
			@Pc(1299) Class75 local1299 = local236[local851];
			if (local1299.aByteArray39 != null) {
				local1299.anInt2634 = local38.method1872();
			}
			if (local1299.aByteArray40 != null) {
				local1299.anInt2633 = local38.method1872();
			}
			if (local1299.anInt2625 > 0) {
				local1299.anInt2630 = local38.method1872();
			}
		}
		for (local1100 = 0; local1100 < local189; local1100++) {
			local236[local1100].anInt2626 = local38.method1872();
		}
		for (local932 = 0; local932 < local189; local932++) {
			@Pc(1357) Class75 local1357 = local236[local932];
			if (local1357.anInt2626 > 0) {
				local1357.anInt2627 = local38.method1872();
			}
		}
		for (local955 = 0; local955 < local189; local955++) {
			@Pc(1380) Class75 local1380 = local236[local955];
			if (local1380.anInt2627 > 0) {
				local1380.anInt2631 = local38.method1872();
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public void method605() {
		this.anIntArray132 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IZLclient!ed;)Z")
	public boolean method609(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class8_Sub9_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray132[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method532(arg1, local25 >> 2);
						} else {
							local11 = arg2.method529(arg1, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass8_Sub9_Sub1Array1[local13] = local11;
						this.anIntArray132[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
