import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class5_Sub42 extends Class5 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lclient!rm;")
	public Class5_Sub5_Sub1[] aClass5_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public int anInt6866;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "[Lclient!wv;")
	public Class272[] aClass272Array1;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "[B")
	public byte[] aByteArray90;

	static {
		new Class198("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	private Class5_Sub42() {
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
	public Class5_Sub42(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = new byte[128];
		this.aByteArray90 = new byte[128];
		this.aShortArray111 = new short[128];
		this.aByteArray87 = new byte[128];
		this.anIntArray468 = new int[128];
		this.aClass5_Sub5_Sub1Array1 = new Class5_Sub5_Sub1[128];
		this.aClass272Array1 = new Class272[128];
		@Pc(36) Class5_Sub15 local36 = new Class5_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray93[local36.anInt7013 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method5600();
		}
		local38++;
		local36.anInt7013++;
		@Pc(84) int local84 = local36.anInt7013;
		local36.anInt7013 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray93[local92 + local36.anInt7013] != 0; local92++) {
		}
		@Pc(109) byte[] local109 = new byte[local92];
		for (@Pc(111) int local111 = 0; local111 < local92; local111++) {
			local109[local111] = local36.method5600();
		}
		local92++;
		local36.anInt7013++;
		@Pc(133) int local133 = local36.anInt7013;
		local36.anInt7013 += local92;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray93[local141 + local36.anInt7013] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method5600();
		}
		local141++;
		local36.anInt7013++;
		@Pc(186) byte[] local186 = new byte[local141];
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local141 > 1) {
			local186[1] = 1;
			@Pc(197) int local197 = 1;
			local199 = 2;
			for (local201 = 2; local201 < local141; local201++) {
				local207 = local36.method5539();
				if (local207 == 0) {
					local197 = local199++;
				} else {
					if (local207 <= local197) {
						local207--;
					}
					local197 = local207;
				}
				local186[local201] = (byte) local197;
			}
		} else {
			local199 = local141;
		}
		@Pc(247) Class272[] local247 = new Class272[local199];
		for (local201 = 0; local201 < local247.length; local201++) {
			@Pc(259) Class272 local259 = local247[local201] = new Class272();
			@Pc(263) int local263 = local36.method5539();
			if (local263 > 0) {
				local259.aByteArray96 = new byte[local263 * 2];
			}
			local263 = local36.method5539();
			if (local263 > 0) {
				local259.aByteArray95 = new byte[local263 * 2 + 2];
				local259.aByteArray95[1] = 64;
			}
		}
		local207 = local36.method5539();
		@Pc(315) byte[] local315 = local207 > 0 ? new byte[local207 * 2] : null;
		local207 = local36.method5539();
		@Pc(328) byte[] local328 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(330) int local330;
		for (local330 = 0; local36.aByteArray93[local36.anInt7013 + local330] != 0; local330++) {
		}
		@Pc(348) byte[] local348 = new byte[local330];
		for (@Pc(350) int local350 = 0; local350 < local330; local350++) {
			local348[local350] = local36.method5600();
		}
		local330++;
		local36.anInt7013++;
		@Pc(371) int local371 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local371 += local36.method5539();
			this.aShortArray111[local373] = (short) local371;
		}
		local371 = 0;
		for (@Pc(395) int local395 = 0; local395 < 128; local395++) {
			local371 += local36.method5539();
			this.aShortArray111[local395] = (short) (this.aShortArray111[local395] + (local371 << 8));
		}
		@Pc(422) int local422 = 0;
		@Pc(424) int local424 = 0;
		@Pc(426) int local426 = 0;
		for (@Pc(428) int local428 = 0; local428 < 128; local428++) {
			if (local422 == 0) {
				if (local348.length > local424) {
					local422 = local348[local424++];
				} else {
					local422 = -1;
				}
				local426 = local36.method5574();
			}
			this.aShortArray111[local428] = (short) (this.aShortArray111[local428] + ((local426 - 1 & 0x2) << 14));
			this.anIntArray468[local428] = local426;
			local422--;
		}
		local422 = 0;
		local424 = 0;
		@Pc(483) int local483 = 0;
		for (@Pc(485) int local485 = 0; local485 < 128; local485++) {
			if (this.anIntArray468[local485] != 0) {
				if (local422 == 0) {
					if (local424 >= local56.length) {
						local422 = -1;
					} else {
						local422 = local56[local424++];
					}
					local483 = local36.aByteArray93[local84++] - 1;
				}
				this.aByteArray90[local485] = (byte) local483;
				local422--;
			}
		}
		local424 = 0;
		local422 = 0;
		@Pc(537) int local537 = 0;
		for (@Pc(539) int local539 = 0; local539 < 128; local539++) {
			if (this.anIntArray468[local539] != 0) {
				if (local422 == 0) {
					if (local424 >= local109.length) {
						local422 = -1;
					} else {
						local422 = local109[local424++];
					}
					local537 = local36.aByteArray93[local133++] + 16 << 2;
				}
				this.aByteArray87[local539] = (byte) local537;
				local422--;
			}
		}
		local422 = 0;
		local424 = 0;
		@Pc(595) Class272 local595 = null;
		for (@Pc(597) int local597 = 0; local597 < 128; local597++) {
			if (this.anIntArray468[local597] != 0) {
				if (local422 == 0) {
					local595 = local247[local186[local424]];
					if (local424 < local158.length) {
						local422 = local158[local424++];
					} else {
						local422 = -1;
					}
				}
				local422--;
				this.aClass272Array1[local597] = local595;
			}
		}
		local424 = 0;
		local422 = 0;
		@Pc(647) int local647 = 0;
		for (@Pc(649) int local649 = 0; local649 < 128; local649++) {
			if (local422 == 0) {
				if (local348.length <= local424) {
					local422 = -1;
				} else {
					local422 = local348[local424++];
				}
				if (this.anIntArray468[local649] > 0) {
					local647 = local36.method5539() + 1;
				}
			}
			local422--;
			this.aByteArray88[local649] = (byte) local647;
		}
		this.anInt6866 = local36.method5539() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local199; local697++) {
			@Pc(703) Class272 local703 = local247[local697];
			if (local703.aByteArray96 != null) {
				for (local708 = 1; local708 < local703.aByteArray96.length; local708 += 2) {
					local703.aByteArray96[local708] = local36.method5600();
				}
			}
			if (local703.aByteArray95 != null) {
				for (local708 = 3; local708 < local703.aByteArray95.length - 2; local708 += 2) {
					local703.aByteArray95[local708] = local36.method5600();
				}
			}
		}
		@Pc(757) int local757;
		if (local315 != null) {
			for (local757 = 1; local757 < local315.length; local757 += 2) {
				local315[local757] = local36.method5600();
			}
		}
		if (local328 != null) {
			for (local757 = 1; local757 < local328.length; local757 += 2) {
				local328[local757] = local36.method5600();
			}
		}
		@Pc(806) int local806;
		for (local757 = 0; local757 < local199; local757++) {
			@Pc(799) Class272 local799 = local247[local757];
			if (local799.aByteArray95 != null) {
				local371 = 0;
				for (local806 = 2; local806 < local799.aByteArray95.length; local806 += 2) {
					local371 = local371 + local36.method5539() + 1;
					local799.aByteArray95[local806] = (byte) local371;
				}
			}
		}
		@Pc(847) int local847;
		for (local708 = 0; local708 < local199; local708++) {
			@Pc(840) Class272 local840 = local247[local708];
			if (local840.aByteArray96 != null) {
				local371 = 0;
				for (local847 = 2; local847 < local840.aByteArray96.length; local847 += 2) {
					local371 += local36.method5539() + 1;
					local840.aByteArray96[local847] = (byte) local371;
				}
			}
		}
		@Pc(920) int local920;
		@Pc(943) int local943;
		@Pc(949) byte local949;
		@Pc(969) int local969;
		@Pc(971) int local971;
		@Pc(981) int local981;
		@Pc(914) byte local914;
		@Pc(1020) int local1020;
		if (local315 != null) {
			local371 = local36.method5539();
			local315[0] = (byte) local371;
			for (local806 = 2; local806 < local315.length; local806 += 2) {
				local371 += local36.method5539() + 1;
				local315[local806] = (byte) local371;
			}
			local914 = local315[0];
			@Pc(918) byte local918 = local315[1];
			for (local920 = 0; local920 < local914; local920++) {
				this.aByteArray88[local920] = (byte) (this.aByteArray88[local920] * local918 + 32 >> 6);
			}
			local943 = 2;
			while (local315.length > local943) {
				local949 = local315[local943];
				@Pc(955) byte local955 = local315[local943 + 1];
				local969 = (local949 - local914) / 2 + (local949 - local914) * local918;
				for (local971 = local914; local971 < local949; local971++) {
					local981 = Static119.method2852(local969, local949 - local914);
					local969 += local955 - local918;
					this.aByteArray88[local971] = (byte) (this.aByteArray88[local971] * local981 + 32 >> 6);
				}
				local943 += 2;
				local918 = local955;
				local914 = local949;
			}
			for (local1020 = local914; local1020 < 128; local1020++) {
				this.aByteArray88[local1020] = (byte) (this.aByteArray88[local1020] * local918 + 32 >> 6);
			}
		}
		@Pc(1088) int local1088;
		if (local328 != null) {
			local371 = local36.method5539();
			local328[0] = (byte) local371;
			for (local806 = 2; local806 < local328.length; local806 += 2) {
				local371 += local36.method5539() + 1;
				local328[local806] = (byte) local371;
			}
			local914 = local328[0];
			local1088 = local328[1] << 1;
			for (local920 = 0; local920 < local914; local920++) {
				local943 = (this.aByteArray87[local920] & 0xFF) + local1088;
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray87[local920] = (byte) local943;
			}
			local943 = 2;
			@Pc(1140) int local1140;
			while (local328.length > local943) {
				local949 = local328[local943];
				local1140 = local328[local943 + 1] << 1;
				local969 = (local949 - local914) * local1088 + (local949 - local914) / 2;
				for (local971 = local914; local971 < local949; local971++) {
					local981 = Static119.method2852(local969, local949 - local914);
					@Pc(1175) int local1175 = local981 + (this.aByteArray87[local971] & 0xFF);
					if (local1175 < 0) {
						local1175 = 0;
					}
					if (local1175 > 128) {
						local1175 = 128;
					}
					local969 += local1140 - local1088;
					this.aByteArray87[local971] = (byte) local1175;
				}
				local943 += 2;
				local914 = local949;
				local1088 = local1140;
			}
			for (local1020 = local914; local1020 < 128; local1020++) {
				local1140 = local1088 + (this.aByteArray87[local1020] & 0xFF);
				if (local1140 < 0) {
					local1140 = 0;
				}
				if (local1140 > 128) {
					local1140 = 128;
				}
				this.aByteArray87[local1020] = (byte) local1140;
			}
		}
		for (local806 = 0; local806 < local199; local806++) {
			local247[local806].anInt7541 = local36.method5539();
		}
		for (local847 = 0; local847 < local199; local847++) {
			@Pc(1281) Class272 local1281 = local247[local847];
			if (local1281.aByteArray96 != null) {
				local1281.anInt7536 = local36.method5539();
			}
			if (local1281.aByteArray95 != null) {
				local1281.anInt7528 = local36.method5539();
			}
			if (local1281.anInt7541 > 0) {
				local1281.anInt7539 = local36.method5539();
			}
		}
		for (local1088 = 0; local1088 < local199; local1088++) {
			local247[local1088].anInt7540 = local36.method5539();
		}
		for (local920 = 0; local920 < local199; local920++) {
			@Pc(1336) Class272 local1336 = local247[local920];
			if (local1336.anInt7540 > 0) {
				local1336.anInt7542 = local36.method5539();
			}
		}
		for (local943 = 0; local943 < local199; local943++) {
			@Pc(1360) Class272 local1360 = local247[local943];
			if (local1360.anInt7542 > 0) {
				local1360.anInt7534 = local36.method5539();
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([I[BLclient!ao;I)Z")
	public boolean method5430(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class5_Sub5_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray468[local18];
				if (local33 != 0) {
					if (local14 != local33) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method269(arg0, local33 >> 2);
						} else {
							local16 = arg2.method271(local33 >> 2, arg0);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass5_Sub5_Sub1Array1[local18] = local16;
						this.anIntArray468[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
	public void method5431() {
		this.anIntArray468 = null;
	}
}
