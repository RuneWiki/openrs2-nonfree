import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "[Lclient!gu;")
	public Class6_Sub4_Sub1[] aClass6_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt3417;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "[Lclient!lh;")
	public Class150[] aClass150Array1;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "[I")
	private int[] anIntArray307;

	static {
		new Class231("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	private Class6_Sub19() {
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V")
	public Class6_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray48 = new byte[128];
		this.aShortArray60 = new short[128];
		this.anIntArray307 = new int[128];
		this.aByteArray50 = new byte[128];
		this.aClass6_Sub4_Sub1Array1 = new Class6_Sub4_Sub1[128];
		this.aByteArray49 = new byte[128];
		this.aClass150Array1 = new Class150[128];
		@Pc(36) Class6_Sub15 local36 = new Class6_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray51[local36.anInt3487 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method3116();
		}
		local36.anInt3487++;
		local38++;
		@Pc(79) int local79 = local36.anInt3487;
		local36.anInt3487 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray51[local87 + local36.anInt3487] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method3116();
		}
		local36.anInt3487++;
		local87++;
		@Pc(129) int local129 = local36.anInt3487;
		local36.anInt3487 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray51[local36.anInt3487 + local137] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method3116();
		}
		local137++;
		local36.anInt3487++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(191) int local191;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local137 > 1) {
			local178[1] = 1;
			@Pc(189) int local189 = 1;
			local191 = 2;
			for (local193 = 2; local193 < local137; local193++) {
				local199 = local36.method3111();
				if (local199 == 0) {
					local189 = local191++;
				} else {
					if (local189 >= local199) {
						local199--;
					}
					local189 = local199;
				}
				local178[local193] = (byte) local189;
			}
		} else {
			local191 = local137;
		}
		@Pc(235) Class150[] local235 = new Class150[local191];
		for (local193 = 0; local193 < local235.length; local193++) {
			@Pc(247) Class150 local247 = local235[local193] = new Class150();
			@Pc(251) int local251 = local36.method3111();
			if (local251 > 0) {
				local247.aByteArray54 = new byte[local251 * 2];
			}
			local251 = local36.method3111();
			if (local251 > 0) {
				local247.aByteArray53 = new byte[local251 * 2 + 2];
				local247.aByteArray53[1] = 64;
			}
		}
		local199 = local36.method3111();
		@Pc(305) byte[] local305 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local36.method3111();
		@Pc(318) byte[] local318 = local199 > 0 ? new byte[local199 * 2] : null;
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray51[local320 + local36.anInt3487] != 0; local320++) {
		}
		@Pc(334) byte[] local334 = new byte[local320];
		for (@Pc(336) int local336 = 0; local336 < local320; local336++) {
			local334[local336] = local36.method3116();
		}
		local320++;
		local36.anInt3487++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local36.method3111();
			this.aShortArray60[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(385) int local385 = 0; local385 < 128; local385++) {
			local361 += local36.method3111();
			this.aShortArray60[local385] = (short) (this.aShortArray60[local385] + (local361 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local414 < local334.length) {
					local412 = local334[local414++];
				} else {
					local412 = -1;
				}
				local416 = local36.method3123();
			}
			this.aShortArray60[local418] = (short) (this.aShortArray60[local418] + ((local416 - 1 & 0x2) << 14));
			this.anIntArray307[local418] = local416;
			local412--;
		}
		local414 = 0;
		local412 = 0;
		@Pc(473) int local473 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray307[local475] != 0) {
				if (local412 == 0) {
					local473 = local36.aByteArray51[local79++] - 1;
					if (local414 < local55.length) {
						local412 = local55[local414++];
					} else {
						local412 = -1;
					}
				}
				this.aByteArray50[local475] = (byte) local473;
				local412--;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray307[local531] != 0) {
				if (local412 == 0) {
					if (local414 < local101.length) {
						local412 = local101[local414++];
					} else {
						local412 = -1;
					}
					local529 = local36.aByteArray51[local129++] + 16 << 2;
				}
				this.aByteArray48[local531] = (byte) local529;
				local412--;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(584) Class150 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray307[local586] != 0) {
				if (local412 == 0) {
					local584 = local235[local178[local414]];
					if (local154.length <= local414) {
						local412 = -1;
					} else {
						local412 = local154[local414++];
					}
				}
				local412--;
				this.aClass150Array1[local586] = local584;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(629) int local629 = 0;
		for (@Pc(631) int local631 = 0; local631 < 128; local631++) {
			if (local412 == 0) {
				if (local414 >= local334.length) {
					local412 = -1;
				} else {
					local412 = local334[local414++];
				}
				if (this.anIntArray307[local631] > 0) {
					local629 = local36.method3111() + 1;
				}
			}
			this.aByteArray49[local631] = (byte) local629;
			local412--;
		}
		this.anInt3417 = local36.method3111() + 1;
		@Pc(700) int local700;
		for (@Pc(689) int local689 = 0; local689 < local191; local689++) {
			@Pc(695) Class150 local695 = local235[local689];
			if (local695.aByteArray54 != null) {
				for (local700 = 1; local700 < local695.aByteArray54.length; local700 += 2) {
					local695.aByteArray54[local700] = local36.method3116();
				}
			}
			if (local695.aByteArray53 != null) {
				for (local700 = 3; local700 < local695.aByteArray53.length - 2; local700 += 2) {
					local695.aByteArray53[local700] = local36.method3116();
				}
			}
		}
		@Pc(749) int local749;
		if (local305 != null) {
			for (local749 = 1; local749 < local305.length; local749 += 2) {
				local305[local749] = local36.method3116();
			}
		}
		if (local318 != null) {
			for (local749 = 1; local749 < local318.length; local749 += 2) {
				local318[local749] = local36.method3116();
			}
		}
		@Pc(794) int local794;
		for (local749 = 0; local749 < local191; local749++) {
			@Pc(787) Class150 local787 = local235[local749];
			if (local787.aByteArray53 != null) {
				local361 = 0;
				for (local794 = 2; local794 < local787.aByteArray53.length; local794 += 2) {
					local361 = local361 + local36.method3111() + 1;
					local787.aByteArray53[local794] = (byte) local361;
				}
			}
		}
		@Pc(839) int local839;
		for (local700 = 0; local700 < local191; local700++) {
			@Pc(832) Class150 local832 = local235[local700];
			if (local832.aByteArray54 != null) {
				local361 = 0;
				for (local839 = 2; local839 < local832.aByteArray54.length; local839 += 2) {
					local361 = local361 + local36.method3111() + 1;
					local832.aByteArray54[local839] = (byte) local361;
				}
			}
		}
		@Pc(916) int local916;
		@Pc(943) int local943;
		@Pc(949) byte local949;
		@Pc(969) int local969;
		@Pc(971) int local971;
		@Pc(980) int local980;
		@Pc(910) byte local910;
		@Pc(1021) int local1021;
		if (local305 != null) {
			local361 = local36.method3111();
			local305[0] = (byte) local361;
			for (local794 = 2; local794 < local305.length; local794 += 2) {
				local361 += local36.method3111() + 1;
				local305[local794] = (byte) local361;
			}
			local910 = local305[0];
			@Pc(914) byte local914 = local305[1];
			for (local916 = 0; local916 < local910; local916++) {
				this.aByteArray49[local916] = (byte) (this.aByteArray49[local916] * local914 + 32 >> 6);
			}
			local943 = 2;
			while (local943 < local305.length) {
				local949 = local305[local943];
				@Pc(955) byte local955 = local305[local943 + 1];
				local969 = (local949 - local910) * local914 + (local949 - local910) / 2;
				for (local971 = local910; local971 < local949; local971++) {
					local980 = Static257.method3955(local949 - local910, local969);
					this.aByteArray49[local971] = (byte) (local980 * this.aByteArray49[local971] + 32 >> 6);
					local969 += local955 - local914;
				}
				local910 = local949;
				local943 += 2;
				local914 = local955;
			}
			for (local1021 = local910; local1021 < 128; local1021++) {
				this.aByteArray49[local1021] = (byte) (local914 * this.aByteArray49[local1021] + 32 >> 6);
			}
		}
		@Pc(1093) int local1093;
		if (local318 != null) {
			local361 = local36.method3111();
			local318[0] = (byte) local361;
			for (local794 = 2; local794 < local318.length; local794 += 2) {
				local361 += local36.method3111() + 1;
				local318[local794] = (byte) local361;
			}
			local910 = local318[0];
			local1093 = local318[1] << 1;
			for (local916 = 0; local916 < local910; local916++) {
				local943 = local1093 + (this.aByteArray48[local916] & 0xFF);
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray48[local916] = (byte) local943;
			}
			local943 = 2;
			@Pc(1143) int local1143;
			while (local943 < local318.length) {
				local949 = local318[local943];
				local1143 = local318[local943 + 1] << 1;
				local969 = (local949 - local910) / 2 + local1093 * (local949 - local910);
				for (local971 = local910; local971 < local949; local971++) {
					local980 = Static257.method3955(local949 - local910, local969);
					@Pc(1178) int local1178 = local980 + (this.aByteArray48[local971] & 0xFF);
					if (local1178 < 0) {
						local1178 = 0;
					}
					if (local1178 > 128) {
						local1178 = 128;
					}
					this.aByteArray48[local971] = (byte) local1178;
					local969 += local1143 - local1093;
				}
				local910 = local949;
				local943 += 2;
				local1093 = local1143;
			}
			for (local1021 = local910; local1021 < 128; local1021++) {
				local1143 = local1093 + (this.aByteArray48[local1021] & 0xFF);
				if (local1143 < 0) {
					local1143 = 0;
				}
				if (local1143 > 128) {
					local1143 = 128;
				}
				this.aByteArray48[local1021] = (byte) local1143;
			}
		}
		for (local794 = 0; local794 < local191; local794++) {
			local235[local794].anInt3826 = local36.method3111();
		}
		for (local839 = 0; local839 < local191; local839++) {
			@Pc(1287) Class150 local1287 = local235[local839];
			if (local1287.aByteArray54 != null) {
				local1287.anInt3827 = local36.method3111();
			}
			if (local1287.aByteArray53 != null) {
				local1287.anInt3824 = local36.method3111();
			}
			if (local1287.anInt3826 > 0) {
				local1287.anInt3820 = local36.method3111();
			}
		}
		for (local1093 = 0; local1093 < local191; local1093++) {
			local235[local1093].anInt3828 = local36.method3111();
		}
		for (local916 = 0; local916 < local191; local916++) {
			@Pc(1342) Class150 local1342 = local235[local916];
			if (local1342.anInt3828 > 0) {
				local1342.anInt3822 = local36.method3111();
			}
		}
		for (local943 = 0; local943 < local191; local943++) {
			@Pc(1362) Class150 local1362 = local235[local943];
			if (local1362.anInt3822 > 0) {
				local1362.anInt3819 = local36.method3111();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B[I[BLclient!iv;)Z")
	public boolean method3064(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class124 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub4_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray307[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method2757(arg0, local25 >> 2);
						} else {
							local11 = arg2.method2756(arg0, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub4_Sub1Array1[local13] = local11;
						this.anIntArray307[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)V")
	public void method3065() {
		this.anIntArray307 = null;
	}
}
