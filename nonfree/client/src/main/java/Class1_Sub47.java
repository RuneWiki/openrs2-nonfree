import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "[B")
	public byte[] aByteArray110;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "[Lclient!sj;")
	public Class267[] aClass267Array1;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
	private int[] anIntArray736;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public int anInt7993;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "[B")
	public byte[] aByteArray112;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "[Lclient!mr;")
	public Class1_Sub30_Sub1[] aClass1_Sub30_Sub1Array1;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "[S")
	public short[] aShortArray140;

	static {
		new Class45("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
		new Class45("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	private Class1_Sub47() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub47(@OriginalArg(0) byte[] arg0) {
		this.anIntArray736 = new int[128];
		this.aByteArray110 = new byte[128];
		this.aByteArray112 = new byte[128];
		this.aClass1_Sub30_Sub1Array1 = new Class1_Sub30_Sub1[128];
		this.aShortArray140 = new short[128];
		this.aByteArray111 = new byte[128];
		this.aClass267Array1 = new Class267[128];
		@Pc(36) Class1_Sub17 local36 = new Class1_Sub17(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray58[local38 + local36.anInt4872] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4482();
		}
		local36.anInt4872++;
		local38++;
		@Pc(80) int local80 = local36.anInt4872;
		local36.anInt4872 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray58[local88 + local36.anInt4872] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method4482();
		}
		local88++;
		local36.anInt4872++;
		@Pc(133) int local133 = local36.anInt4872;
		local36.anInt4872 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray58[local141 + local36.anInt4872] != 0; local141++) {
		}
		@Pc(155) byte[] local155 = new byte[local141];
		for (@Pc(157) int local157 = 0; local157 < local141; local157++) {
			local155[local157] = local36.method4482();
		}
		local36.anInt4872++;
		local141++;
		@Pc(183) byte[] local183 = new byte[local141];
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local141 <= 1) {
			local188 = local141;
		} else {
			local183[1] = 1;
			@Pc(196) int local196 = 1;
			local188 = 2;
			for (local200 = 2; local200 < local141; local200++) {
				local206 = local36.method4487();
				if (local206 == 0) {
					local196 = local188++;
				} else {
					if (local196 >= local206) {
						local206--;
					}
					local196 = local206;
				}
				local183[local200] = (byte) local196;
			}
		}
		@Pc(238) Class267[] local238 = new Class267[local188];
		for (local200 = 0; local200 < local238.length; local200++) {
			@Pc(250) Class267 local250 = local238[local200] = new Class267();
			@Pc(254) int local254 = local36.method4487();
			if (local254 > 0) {
				local250.aByteArray107 = new byte[local254 * 2];
			}
			local254 = local36.method4487();
			if (local254 > 0) {
				local250.aByteArray108 = new byte[local254 * 2 + 2];
				local250.aByteArray108[1] = 64;
			}
		}
		local206 = local36.method4487();
		@Pc(299) byte[] local299 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local36.method4487();
		@Pc(315) byte[] local315 = local206 <= 0 ? null : new byte[local206 * 2];
		@Pc(317) int local317;
		for (local317 = 0; local36.aByteArray58[local36.anInt4872 + local317] != 0; local317++) {
		}
		@Pc(332) byte[] local332 = new byte[local317];
		for (@Pc(334) int local334 = 0; local334 < local317; local334++) {
			local332[local334] = local36.method4482();
		}
		local317++;
		local36.anInt4872++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local36.method4487();
			this.aShortArray140[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local36.method4487();
			this.aShortArray140[local383] = (short) (this.aShortArray140[local383] + (local359 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local410 >= local332.length) {
					local408 = -1;
				} else {
					local408 = local332[local410++];
				}
				local412 = local36.method4462();
			}
			this.aShortArray140[local414] = (short) (this.aShortArray140[local414] + ((local412 - 1 & 0x2) << 14));
			local408--;
			this.anIntArray736[local414] = local412;
		}
		local408 = 0;
		local410 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray736[local472] != 0) {
				if (local408 == 0) {
					if (local52.length > local410) {
						local408 = local52[local410++];
					} else {
						local408 = -1;
					}
					local470 = local36.aByteArray58[local80++] - 1;
				}
				local408--;
				this.aByteArray111[local472] = (byte) local470;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray736[local526] != 0) {
				if (local408 == 0) {
					local524 = local36.aByteArray58[local133++] + 16 << 2;
					if (local105.length <= local410) {
						local408 = -1;
					} else {
						local408 = local105[local410++];
					}
				}
				local408--;
				this.aByteArray112[local526] = (byte) local524;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(578) Class267 local578 = null;
		for (@Pc(580) int local580 = 0; local580 < 128; local580++) {
			if (this.anIntArray736[local580] != 0) {
				if (local408 == 0) {
					local578 = local238[local183[local410]];
					if (local410 >= local155.length) {
						local408 = -1;
					} else {
						local408 = local155[local410++];
					}
				}
				this.aClass267Array1[local580] = local578;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(630) int local630 = 0;
		for (@Pc(632) int local632 = 0; local632 < 128; local632++) {
			if (local408 == 0) {
				if (local410 >= local332.length) {
					local408 = -1;
				} else {
					local408 = local332[local410++];
				}
				if (this.anIntArray736[local632] > 0) {
					local630 = local36.method4487() + 1;
				}
			}
			this.aByteArray110[local632] = (byte) local630;
			local408--;
		}
		this.anInt7993 = local36.method4487() + 1;
		@Pc(698) int local698;
		for (@Pc(687) int local687 = 0; local687 < local188; local687++) {
			@Pc(693) Class267 local693 = local238[local687];
			if (local693.aByteArray107 != null) {
				for (local698 = 1; local698 < local693.aByteArray107.length; local698 += 2) {
					local693.aByteArray107[local698] = local36.method4482();
				}
			}
			if (local693.aByteArray108 != null) {
				for (local698 = 3; local698 < local693.aByteArray108.length - 2; local698 += 2) {
					local693.aByteArray108[local698] = local36.method4482();
				}
			}
		}
		@Pc(747) int local747;
		if (local299 != null) {
			for (local747 = 1; local747 < local299.length; local747 += 2) {
				local299[local747] = local36.method4482();
			}
		}
		if (local315 != null) {
			for (local747 = 1; local747 < local315.length; local747 += 2) {
				local315[local747] = local36.method4482();
			}
		}
		@Pc(800) int local800;
		for (local747 = 0; local747 < local188; local747++) {
			@Pc(793) Class267 local793 = local238[local747];
			if (local793.aByteArray108 != null) {
				local359 = 0;
				for (local800 = 2; local800 < local793.aByteArray108.length; local800 += 2) {
					local359 = local36.method4487() + local359 + 1;
					local793.aByteArray108[local800] = (byte) local359;
				}
			}
		}
		@Pc(849) int local849;
		for (local698 = 0; local698 < local188; local698++) {
			@Pc(842) Class267 local842 = local238[local698];
			if (local842.aByteArray107 != null) {
				local359 = 0;
				for (local849 = 2; local849 < local842.aByteArray107.length; local849 += 2) {
					local359 = local359 + local36.method4487() + 1;
					local842.aByteArray107[local849] = (byte) local359;
				}
			}
		}
		@Pc(919) int local919;
		@Pc(942) int local942;
		@Pc(948) byte local948;
		@Pc(967) int local967;
		@Pc(969) int local969;
		@Pc(979) int local979;
		@Pc(913) byte local913;
		@Pc(1017) int local1017;
		if (local299 != null) {
			local359 = local36.method4487();
			local299[0] = (byte) local359;
			for (local800 = 2; local800 < local299.length; local800 += 2) {
				local359 += local36.method4487() + 1;
				local299[local800] = (byte) local359;
			}
			local913 = local299[0];
			@Pc(917) byte local917 = local299[1];
			for (local919 = 0; local919 < local913; local919++) {
				this.aByteArray110[local919] = (byte) (local917 * this.aByteArray110[local919] + 32 >> 6);
			}
			local942 = 2;
			while (local942 < local299.length) {
				local948 = local299[local942];
				@Pc(954) byte local954 = local299[local942 + 1];
				local967 = local917 * (local948 - local913) + (local948 - local913) / 2;
				for (local969 = local913; local969 < local948; local969++) {
					local979 = Static437.method4249(local967, local948 - local913);
					this.aByteArray110[local969] = (byte) (this.aByteArray110[local969] * local979 + 32 >> 6);
					local967 += local954 - local917;
				}
				local942 += 2;
				local917 = local954;
				local913 = local948;
			}
			for (local1017 = local913; local1017 < 128; local1017++) {
				this.aByteArray110[local1017] = (byte) (local917 * this.aByteArray110[local1017] + 32 >> 6);
			}
		}
		@Pc(1086) int local1086;
		if (local315 != null) {
			local359 = local36.method4487();
			local315[0] = (byte) local359;
			for (local800 = 2; local800 < local315.length; local800 += 2) {
				local359 = local359 + local36.method4487() + 1;
				local315[local800] = (byte) local359;
			}
			local913 = local315[0];
			local1086 = local315[1] << 1;
			for (local919 = 0; local919 < local913; local919++) {
				local942 = (this.aByteArray112[local919] & 0xFF) + local1086;
				if (local942 < 0) {
					local942 = 0;
				}
				if (local942 > 128) {
					local942 = 128;
				}
				this.aByteArray112[local919] = (byte) local942;
			}
			local942 = 2;
			@Pc(1138) int local1138;
			while (local315.length > local942) {
				local948 = local315[local942];
				local1138 = local315[local942 + 1] << 1;
				local967 = (local948 - local913) / 2 + local1086 * (local948 - local913);
				for (local969 = local913; local969 < local948; local969++) {
					local979 = Static437.method4249(local967, local948 - local913);
					@Pc(1173) int local1173 = (this.aByteArray112[local969] & 0xFF) + local979;
					if (local1173 < 0) {
						local1173 = 0;
					}
					if (local1173 > 128) {
						local1173 = 128;
					}
					this.aByteArray112[local969] = (byte) local1173;
					local967 += local1138 - local1086;
				}
				local1086 = local1138;
				local942 += 2;
				local913 = local948;
			}
			for (local1017 = local913; local1017 < 128; local1017++) {
				local1138 = (this.aByteArray112[local1017] & 0xFF) + local1086;
				if (local1138 < 0) {
					local1138 = 0;
				}
				if (local1138 > 128) {
					local1138 = 128;
				}
				this.aByteArray112[local1017] = (byte) local1138;
			}
		}
		for (local800 = 0; local800 < local188; local800++) {
			local238[local800].anInt7839 = local36.method4487();
		}
		for (local849 = 0; local849 < local188; local849++) {
			@Pc(1276) Class267 local1276 = local238[local849];
			if (local1276.aByteArray107 != null) {
				local1276.anInt7835 = local36.method4487();
			}
			if (local1276.aByteArray108 != null) {
				local1276.anInt7833 = local36.method4487();
			}
			if (local1276.anInt7839 > 0) {
				local1276.anInt7838 = local36.method4487();
			}
		}
		for (local1086 = 0; local1086 < local188; local1086++) {
			local238[local1086].anInt7836 = local36.method4487();
		}
		for (local919 = 0; local919 < local188; local919++) {
			@Pc(1331) Class267 local1331 = local238[local919];
			if (local1331.anInt7836 > 0) {
				local1331.anInt7834 = local36.method4487();
			}
		}
		for (local942 = 0; local942 < local188; local942++) {
			@Pc(1358) Class267 local1358 = local238[local942];
			if (local1358.anInt7834 > 0) {
				local1358.anInt7841 = local36.method4487();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!jca;I[I[B)Z")
	public boolean method7057(@OriginalArg(0) Class148 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class1_Sub30_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray736[local19];
				if (local34 != 0) {
					if (local34 != local15) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg0.method4014(local34 >> 2, arg1);
						} else {
							local17 = arg0.method4017(arg1, local34 >> 2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass1_Sub30_Sub1Array1[local19] = local17;
						this.anIntArray736[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method7058() {
		this.anIntArray736 = null;
	}
}
