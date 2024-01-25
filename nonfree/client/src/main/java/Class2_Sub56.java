import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wka")
public final class Class2_Sub56 extends Class2 {

	@OriginalMember(owner = "client!wka", name = "w", descriptor = "[Lclient!rb;")
	public Class2_Sub4_Sub1[] aClass2_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!wka", name = "n", descriptor = "[Lclient!fn;")
	public Class124[] aClass124Array1;

	@OriginalMember(owner = "client!wka", name = "s", descriptor = "I")
	public int anInt10899;

	@OriginalMember(owner = "client!wka", name = "m", descriptor = "[B")
	public byte[] aByteArray121;

	@OriginalMember(owner = "client!wka", name = "t", descriptor = "[B")
	public byte[] aByteArray122;

	@OriginalMember(owner = "client!wka", name = "x", descriptor = "[I")
	private int[] anIntArray753;

	@OriginalMember(owner = "client!wka", name = "v", descriptor = "[B")
	public byte[] aByteArray123;

	@OriginalMember(owner = "client!wka", name = "y", descriptor = "[S")
	public short[] aShortArray147;

	@OriginalMember(owner = "client!wka", name = "<init>", descriptor = "()V")
	private Class2_Sub56() {
	}

	@OriginalMember(owner = "client!wka", name = "<init>", descriptor = "([B)V")
	public Class2_Sub56(@OriginalArg(0) byte[] arg0) {
		this.aClass124Array1 = new Class124[128];
		this.aByteArray121 = new byte[128];
		this.aShortArray147 = new short[128];
		this.anIntArray753 = new int[128];
		this.aByteArray122 = new byte[128];
		this.aClass2_Sub4_Sub1Array1 = new Class2_Sub4_Sub1[128];
		this.aByteArray123 = new byte[128];
		@Pc(36) Class2_Sub20 local36 = new Class2_Sub20(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray111[local36.anInt9723 + local38] != 0; local38++) {
		}
		@Pc(54) byte[] local54 = new byte[local38];
		for (@Pc(56) int local56 = 0; local56 < local38; local56++) {
			local54[local56] = local36.method8536();
		}
		local38++;
		local36.anInt9723++;
		@Pc(80) int local80 = local36.anInt9723;
		local36.anInt9723 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray111[local36.anInt9723 + local88] != 0; local88++) {
		}
		@Pc(109) byte[] local109 = new byte[local88];
		for (@Pc(111) int local111 = 0; local111 < local88; local111++) {
			local109[local111] = local36.method8536();
		}
		local88++;
		local36.anInt9723++;
		@Pc(139) int local139 = local36.anInt9723;
		local36.anInt9723 += local88;
		@Pc(147) int local147;
		for (local147 = 0; local36.aByteArray111[local36.anInt9723 + local147] != 0; local147++) {
		}
		@Pc(168) byte[] local168 = new byte[local147];
		for (@Pc(170) int local170 = 0; local170 < local147; local170++) {
			local168[local170] = local36.method8536();
		}
		local147++;
		local36.anInt9723++;
		@Pc(194) byte[] local194 = new byte[local147];
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(217) int local217;
		if (local147 > 1) {
			local194[1] = 1;
			local207 = 2;
			@Pc(209) int local209 = 1;
			for (local211 = 2; local211 < local147; local211++) {
				local217 = local36.method8581(-17416);
				if (local217 == 0) {
					local209 = local207++;
				} else {
					if (local217 <= local209) {
						local217--;
					}
					local209 = local217;
				}
				local194[local211] = (byte) local209;
			}
		} else {
			local207 = local147;
		}
		@Pc(252) Class124[] local252 = new Class124[local207];
		for (local211 = 0; local211 < local252.length; local211++) {
			@Pc(264) Class124 local264 = local252[local211] = new Class124();
			@Pc(268) int local268 = local36.method8581(-17416);
			if (local268 > 0) {
				local264.aByteArray36 = new byte[local268 * 2];
			}
			local268 = local36.method8581(-17416);
			if (local268 > 0) {
				local264.aByteArray35 = new byte[local268 * 2 + 2];
				local264.aByteArray35[1] = 64;
			}
		}
		local217 = local36.method8581(-17416);
		@Pc(321) byte[] local321 = local217 > 0 ? new byte[local217 * 2] : null;
		local217 = local36.method8581(-17416);
		@Pc(338) byte[] local338 = local217 <= 0 ? null : new byte[local217 * 2];
		@Pc(340) int local340;
		for (local340 = 0; local36.aByteArray111[local340 + local36.anInt9723] != 0; local340++) {
		}
		@Pc(359) byte[] local359 = new byte[local340];
		for (@Pc(361) int local361 = 0; local361 < local340; local361++) {
			local359[local361] = local36.method8536();
		}
		local340++;
		local36.anInt9723++;
		@Pc(384) int local384 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local384 += local36.method8581(-17416);
			this.aShortArray147[local386] = (short) local384;
		}
		local384 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			local384 += local36.method8581(-17416);
			this.aShortArray147[local412] = (short) (this.aShortArray147[local412] + (local384 << 8));
		}
		@Pc(441) int local441 = 0;
		@Pc(443) int local443 = 0;
		@Pc(445) int local445 = 0;
		for (@Pc(447) int local447 = 0; local447 < 128; local447++) {
			if (local441 == 0) {
				if (local359.length > local443) {
					local441 = local359[local443++];
				} else {
					local441 = -1;
				}
				local445 = local36.method8545();
			}
			this.aShortArray147[local447] = (short) (this.aShortArray147[local447] + ((local445 - 1 & 0x2) << 14));
			local441--;
			this.anIntArray753[local447] = local445;
		}
		local443 = 0;
		local441 = 0;
		@Pc(511) int local511 = 0;
		for (@Pc(513) int local513 = 0; local513 < 128; local513++) {
			if (this.anIntArray753[local513] != 0) {
				if (local441 == 0) {
					if (local443 >= local54.length) {
						local441 = -1;
					} else {
						local441 = local54[local443++];
					}
					local511 = local36.aByteArray111[local80++] - 1;
				}
				this.aByteArray123[local513] = (byte) local511;
				local441--;
			}
		}
		local441 = 0;
		local443 = 0;
		@Pc(574) int local574 = 0;
		for (@Pc(576) int local576 = 0; local576 < 128; local576++) {
			if (this.anIntArray753[local576] != 0) {
				if (local441 == 0) {
					if (local109.length <= local443) {
						local441 = -1;
					} else {
						local441 = local109[local443++];
					}
					local574 = local36.aByteArray111[local139++] + 16 << 2;
				}
				this.aByteArray122[local576] = (byte) local574;
				local441--;
			}
		}
		local441 = 0;
		local443 = 0;
		@Pc(638) Class124 local638 = null;
		for (@Pc(640) int local640 = 0; local640 < 128; local640++) {
			if (this.anIntArray753[local640] != 0) {
				if (local441 == 0) {
					local638 = local252[local194[local443]];
					if (local168.length <= local443) {
						local441 = -1;
					} else {
						local441 = local168[local443++];
					}
				}
				local441--;
				this.aClass124Array1[local640] = local638;
			}
		}
		local441 = 0;
		local443 = 0;
		@Pc(694) int local694 = 0;
		for (@Pc(696) int local696 = 0; local696 < 128; local696++) {
			if (local441 == 0) {
				if (local443 >= local359.length) {
					local441 = -1;
				} else {
					local441 = local359[local443++];
				}
				if (this.anIntArray753[local696] > 0) {
					local694 = local36.method8581(-17416) + 1;
				}
			}
			local441--;
			this.aByteArray121[local696] = (byte) local694;
		}
		this.anInt10899 = local36.method8581(-17416) + 1;
		@Pc(765) int local765;
		for (@Pc(752) int local752 = 0; local752 < local207; local752++) {
			@Pc(760) Class124 local760 = local252[local752];
			if (local760.aByteArray36 != null) {
				for (local765 = 1; local765 < local760.aByteArray36.length; local765 += 2) {
					local760.aByteArray36[local765] = local36.method8536();
				}
			}
			if (local760.aByteArray35 != null) {
				for (local765 = 3; local765 < local760.aByteArray35.length - 2; local765 += 2) {
					local760.aByteArray35[local765] = local36.method8536();
				}
			}
		}
		@Pc(828) int local828;
		if (local321 != null) {
			for (local828 = 1; local828 < local321.length; local828 += 2) {
				local321[local828] = local36.method8536();
			}
		}
		if (local338 != null) {
			for (local828 = 1; local828 < local338.length; local828 += 2) {
				local338[local828] = local36.method8536();
			}
		}
		@Pc(887) int local887;
		for (local828 = 0; local828 < local207; local828++) {
			@Pc(880) Class124 local880 = local252[local828];
			if (local880.aByteArray35 != null) {
				local384 = 0;
				for (local887 = 2; local887 < local880.aByteArray35.length; local887 += 2) {
					local384 = local36.method8581(-17416) + local384 + 1;
					local880.aByteArray35[local887] = (byte) local384;
				}
			}
		}
		@Pc(930) int local930;
		for (local765 = 0; local765 < local207; local765++) {
			@Pc(923) Class124 local923 = local252[local765];
			if (local923.aByteArray36 != null) {
				local384 = 0;
				for (local930 = 2; local930 < local923.aByteArray36.length; local930 += 2) {
					local384 = local36.method8581(-17416) + local384 + 1;
					local923.aByteArray36[local930] = (byte) local384;
				}
			}
		}
		@Pc(1016) int local1016;
		@Pc(1043) int local1043;
		@Pc(1051) byte local1051;
		@Pc(1071) int local1071;
		@Pc(1073) int local1073;
		@Pc(1085) int local1085;
		@Pc(1010) byte local1010;
		@Pc(1130) int local1130;
		if (local321 != null) {
			local384 = local36.method8581(-17416);
			local321[0] = (byte) local384;
			for (local887 = 2; local887 < local321.length; local887 += 2) {
				local384 = local384 + local36.method8581(-17416) + 1;
				local321[local887] = (byte) local384;
			}
			local1010 = local321[0];
			@Pc(1014) byte local1014 = local321[1];
			for (local1016 = 0; local1016 < local1010; local1016++) {
				this.aByteArray121[local1016] = (byte) (local1014 * this.aByteArray121[local1016] + 32 >> 6);
			}
			for (local1043 = 2; local1043 < local321.length; local1043 += 2) {
				local1051 = local321[local1043];
				@Pc(1057) byte local1057 = local321[local1043 + 1];
				local1071 = (local1051 - local1010) * local1014 + (local1051 - local1010) / 2;
				for (local1073 = local1010; local1073 < local1051; local1073++) {
					local1085 = Static634.method8627(local1051 - local1010, local1071);
					local1071 += local1057 - local1014;
					this.aByteArray121[local1073] = (byte) (local1085 * this.aByteArray121[local1073] + 32 >> 6);
				}
				local1014 = local1057;
				local1010 = local1051;
			}
			for (local1130 = local1010; local1130 < 128; local1130++) {
				this.aByteArray121[local1130] = (byte) (local1014 * this.aByteArray121[local1130] + 32 >> 6);
			}
		}
		@Pc(1199) int local1199;
		if (local338 != null) {
			local384 = local36.method8581(-17416);
			local338[0] = (byte) local384;
			for (local887 = 2; local887 < local338.length; local887 += 2) {
				local384 += local36.method8581(-17416) + 1;
				local338[local887] = (byte) local384;
			}
			local1010 = local338[0];
			local1199 = local338[1] << 1;
			for (local1016 = 0; local1016 < local1010; local1016++) {
				local1043 = local1199 + (this.aByteArray122[local1016] & 0xFF);
				if (local1043 < 0) {
					local1043 = 0;
				}
				if (local1043 > 128) {
					local1043 = 128;
				}
				this.aByteArray122[local1016] = (byte) local1043;
			}
			local1043 = 2;
			@Pc(1251) int local1251;
			while (local338.length > local1043) {
				local1051 = local338[local1043];
				local1251 = local338[local1043 + 1] << 1;
				local1071 = (local1051 - local1010) / 2 + (local1051 - local1010) * local1199;
				for (local1073 = local1010; local1073 < local1051; local1073++) {
					local1085 = Static634.method8627(local1051 - local1010, local1071);
					@Pc(1289) int local1289 = (this.aByteArray122[local1073] & 0xFF) + local1085;
					if (local1289 < 0) {
						local1289 = 0;
					}
					if (local1289 > 128) {
						local1289 = 128;
					}
					this.aByteArray122[local1073] = (byte) local1289;
					local1071 += local1251 - local1199;
				}
				local1010 = local1051;
				local1043 += 2;
				local1199 = local1251;
			}
			for (local1130 = local1010; local1130 < 128; local1130++) {
				local1251 = (this.aByteArray122[local1130] & 0xFF) + local1199;
				if (local1251 < 0) {
					local1251 = 0;
				}
				if (local1251 > 128) {
					local1251 = 128;
				}
				this.aByteArray122[local1130] = (byte) local1251;
			}
		}
		for (local887 = 0; local887 < local207; local887++) {
			local252[local887].anInt3037 = local36.method8581(-17416);
		}
		for (local930 = 0; local930 < local207; local930++) {
			@Pc(1394) Class124 local1394 = local252[local930];
			if (local1394.aByteArray36 != null) {
				local1394.anInt3043 = local36.method8581(-17416);
			}
			if (local1394.aByteArray35 != null) {
				local1394.anInt3036 = local36.method8581(-17416);
			}
			if (local1394.anInt3037 > 0) {
				local1394.anInt3035 = local36.method8581(-17416);
			}
		}
		for (local1199 = 0; local1199 < local207; local1199++) {
			local252[local1199].anInt3046 = local36.method8581(-17416);
		}
		for (local1016 = 0; local1016 < local207; local1016++) {
			@Pc(1462) Class124 local1462 = local252[local1016];
			if (local1462.anInt3046 > 0) {
				local1462.anInt3044 = local36.method8581(-17416);
			}
		}
		for (local1043 = 0; local1043 < local207; local1043++) {
			@Pc(1491) Class124 local1491 = local252[local1043];
			if (local1491.anInt3044 > 0) {
				local1491.anInt3040 = local36.method8581(-17416);
			}
		}
	}

	@OriginalMember(owner = "client!wka", name = "b", descriptor = "(I)V")
	public void method9515() {
		this.anIntArray753 = null;
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(Lclient!aea;I[B[I)Z")
	public boolean method9516(@OriginalArg(0) Class6 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub4_Sub1 local11 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(40) int local40 = this.anIntArray753[local21];
				if (local40 != 0) {
					if (local40 != local9) {
						local9 = local40--;
						if ((local40 & 0x1) == 0) {
							local11 = arg0.method197(arg2, local40 >> 2);
						} else {
							local11 = arg0.method198(arg2, local40 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub4_Sub1Array1[local21] = local11;
						this.anIntArray753[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
