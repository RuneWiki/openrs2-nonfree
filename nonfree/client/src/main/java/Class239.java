import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class239 {

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
	private final int[] anIntArray441;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
	private int[] anIntArray440;

	static {
		new Class119("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "([B)V")
	public Class239(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray85 = arg0;
		this.anIntArray441 = new int[local6];
		this.anIntArray440 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray441[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(87) int local87;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local73 != local43) {
							break;
						}
						local87 = 0x1 << 32 - local67;
						if ((local73 & local87) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local73 | local87;
					}
					local61 = local43 | local39;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local20[local67] == local43) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(159) int local159 = Integer.MIN_VALUE >>> local87;
					if ((local43 & local159) == 0) {
						local73++;
					} else {
						if (this.anIntArray440[local73] == 0) {
							this.anIntArray440[local73] = local22;
						}
						local73 = this.anIntArray440[local73];
					}
					if (this.anIntArray440.length <= local73) {
						@Pc(193) int[] local193 = new int[this.anIntArray440.length * 2];
						for (@Pc(195) int local195 = 0; local195 < this.anIntArray440.length; local195++) {
							local193[local195] = this.anIntArray440[local195];
						}
						this.anIntArray440 = local193;
					}
				}
				this.anIntArray440[local73] = ~local24;
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III[BB[B)I")
	public int method5180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg2) {
			@Pc(29) int local29 = arg4[arg2] & 0xFF;
			@Pc(34) int local34 = this.anIntArray441[local29];
			@Pc(39) byte local39 = this.aByteArray85[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local15 >> 3;
			@Pc(60) int local60 = local15 & 0x7;
			local7 &= -local60 >> 31;
			@Pc(78) int local78 = local56 + (local39 + local60 - 1 >> 3);
			@Pc(79) int local79 = local60 + 24;
			arg3[local56] = (byte) (local7 |= local34 >>> local79);
			if (local56 < local78) {
				local56++;
				local60 = local79 - 8;
				arg3[local56] = (byte) (local7 = local34 >>> local60);
				if (local78 > local56) {
					local56++;
					local60 -= 8;
					arg3[local56] = (byte) (local7 = local34 >>> local60);
					if (local56 < local78) {
						local56++;
						local60 -= 8;
						arg3[local56] = (byte) (local7 = local34 >>> local60);
						if (local56 < local78) {
							local60 -= 8;
							local56++;
							arg3[local56] = (byte) (local7 = local34 << -local60);
						}
					}
				}
			}
			local15 += local39;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BIII[B)I")
	public int method5181(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local23 = this.anIntArray440[local23];
			} else {
				local23++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local45;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local83;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local125;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local164;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local199;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(237) int local237;
			if ((local237 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local237;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(275) int local275;
			if ((local275 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local275;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray440[local23];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray440[local23]) < 0) {
				arg0[arg3++] = (byte) ~local310;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}
