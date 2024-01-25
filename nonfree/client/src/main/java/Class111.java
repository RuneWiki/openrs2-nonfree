import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class111 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "[Lclient!mp;")
	public Class136[] aClass136Array2;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[Lclient!tr;")
	public Class197[] aClass197Array2;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!jp", name = "N", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!jp", name = "R", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!jp", name = "S", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!jp", name = "T", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!jp", name = "U", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!jp", name = "V", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!jp", name = "X", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
	public int anInt3735 = 0;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "B")
	public byte aByte47 = 0;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public int anInt3738 = 0;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
	public int anInt3739 = 0;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	public int anInt3736 = 0;

	static {
		new Class140("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
	public Class111(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3247(arg0);
		} else {
			this.method3249(arg0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(III)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray282 = new int[arg0];
		this.anIntArray287 = new int[arg1];
		this.aShortArray43 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray33 = new byte[arg2];
			this.aShortArray47 = new short[arg2];
			this.aShortArray45 = new short[arg2];
			this.aByteArray40 = new byte[arg2];
			this.aShortArray41 = new short[arg2];
			this.aShortArray49 = new short[arg2];
			this.aShortArray48 = new short[arg2];
			this.aByteArray41 = new byte[arg2];
			this.aShortArray42 = new short[arg2];
			this.aByteArray36 = new byte[arg2];
			this.aByteArray34 = new byte[arg2];
			this.aByteArray38 = new byte[arg2];
		}
		this.aShortArray40 = new short[arg1];
		this.anIntArray286 = new int[arg0];
		this.aByteArray35 = new byte[arg1];
		this.aByteArray32 = new byte[arg1];
		this.anIntArray285 = new int[arg0];
		this.aShortArray46 = new short[arg1];
		this.anIntArray283 = new int[arg0];
		this.aShortArray44 = new short[arg1];
		this.aByteArray37 = new byte[arg1];
		this.aByteArray39 = new byte[arg1];
		this.aShortArray51 = new short[arg1];
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([Lclient!jp;I)V")
	public Class111(@OriginalArg(0) Class111[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3736 = 0;
		this.anInt3739 = 0;
		this.anInt3738 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte47 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class111 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt3739 += local54.anInt3739;
				this.anInt3738 += local54.anInt3738;
				this.anInt3736 += local54.anInt3736;
				local33 |= local54.aByteArray37 != null;
				if (local54.aClass136Array2 != null) {
					local31 += local54.aClass136Array2.length;
				}
				if (local54.aClass197Array2 != null) {
					local29 += local54.aClass197Array2.length;
				}
				if (local54.aByteArray35 == null) {
					if (this.aByte47 == -1) {
						this.aByte47 = local54.aByte47;
					}
					if (this.aByte47 != local54.aByte47) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray44 != null;
				local39 |= local54.aByteArray32 != null;
				local46 |= local54.anIntArray287 != null;
				local37 |= local54.aByteArray39 != null;
			}
		}
		this.aShortArray46 = new short[this.anInt3739];
		this.aShortArray50 = new short[this.anInt3736];
		if (local46) {
			this.anIntArray287 = new int[this.anInt3739];
		}
		if (local37) {
			this.aByteArray39 = new byte[this.anInt3739];
		}
		if (local29 > 0) {
			this.aClass197Array2 = new Class197[local29];
		}
		if (local41) {
			this.aShortArray44 = new short[this.anInt3739];
		}
		this.anIntArray282 = new int[this.anInt3736];
		this.aShortArray51 = new short[this.anInt3739];
		if (local31 > 0) {
			this.aClass136Array2 = new Class136[local31];
		}
		this.anIntArray283 = new int[this.anInt3736];
		if (local39) {
			this.aByteArray32 = new byte[this.anInt3739];
		}
		if (local33) {
			this.aByteArray37 = new byte[this.anInt3739];
		}
		this.aShortArray40 = new short[this.anInt3739];
		this.anIntArray286 = new int[this.anInt3736];
		if (this.anInt3738 > 0) {
			this.aShortArray48 = new short[this.anInt3738];
			this.aShortArray42 = new short[this.anInt3738];
			this.aByteArray34 = new byte[this.anInt3738];
			this.aByteArray33 = new byte[this.anInt3738];
			this.aByteArray40 = new byte[this.anInt3738];
			this.aShortArray45 = new short[this.anInt3738];
			this.aByteArray41 = new byte[this.anInt3738];
			this.aShortArray47 = new short[this.anInt3738];
			this.aByteArray38 = new byte[this.anInt3738];
			this.aByteArray36 = new byte[this.anInt3738];
			this.aShortArray49 = new short[this.anInt3738];
			this.aShortArray41 = new short[this.anInt3738];
		}
		if (local35) {
			this.aByteArray35 = new byte[this.anInt3739];
		}
		this.anIntArray285 = new int[this.anInt3736];
		this.aShortArray39 = new short[this.anInt3739];
		this.aShortArray43 = new short[this.anInt3739];
		local29 = 0;
		this.anInt3739 = 0;
		local31 = 0;
		this.anInt3736 = 0;
		this.anInt3738 = 0;
		@Pc(560) int local560;
		@Pc(571) int local571;
		for (@Pc(359) int local359 = 0; local359 < arg1; local359++) {
			@Pc(366) short local366 = (short) (0x1 << local359);
			@Pc(370) Class111 local370 = arg0[local359];
			if (local370 != null) {
				for (@Pc(374) int local374 = 0; local374 < local370.anInt3739; local374++) {
					if (local33 && local370.aByteArray37 != null) {
						this.aByteArray37[this.anInt3739] = local370.aByteArray37[local374];
					}
					if (local35) {
						if (local370.aByteArray35 == null) {
							this.aByteArray35[this.anInt3739] = local370.aByte47;
						} else {
							this.aByteArray35[this.anInt3739] = local370.aByteArray35[local374];
						}
					}
					if (local37 && local370.aByteArray39 != null) {
						this.aByteArray39[this.anInt3739] = local370.aByteArray39[local374];
					}
					if (local41) {
						if (local370.aShortArray44 == null) {
							this.aShortArray44[this.anInt3739] = -1;
						} else {
							this.aShortArray44[this.anInt3739] = local370.aShortArray44[local374];
						}
					}
					if (local46) {
						if (local370.anIntArray287 == null) {
							this.anIntArray287[this.anInt3739] = -1;
						} else {
							this.anIntArray287[this.anInt3739] = local370.anIntArray287[local374];
						}
					}
					this.aShortArray43[this.anInt3739] = (short) this.method3256(local370, local370.aShortArray43[local374], local366);
					this.aShortArray51[this.anInt3739] = (short) this.method3256(local370, local370.aShortArray51[local374], local366);
					this.aShortArray40[this.anInt3739] = (short) this.method3256(local370, local370.aShortArray40[local374], local366);
					this.aShortArray39[this.anInt3739] = local366;
					this.aShortArray46[this.anInt3739] = local370.aShortArray46[local374];
					this.anInt3739++;
				}
				@Pc(547) int local547;
				if (local370.aClass197Array2 != null) {
					for (local547 = 0; local547 < local370.aClass197Array2.length; local547++) {
						local560 = this.method3256(local370, local370.aClass197Array2[local547].anInt6245, local366);
						local571 = this.method3256(local370, local370.aClass197Array2[local547].anInt6238, local366);
						@Pc(582) int local582 = this.method3256(local370, local370.aClass197Array2[local547].anInt6243, local366);
						this.aClass197Array2[local29] = new Class197(local370.aClass197Array2[local547].anInt6256, local560, local571, local582, local370.aClass197Array2[local547].aByte67);
						local29++;
					}
				}
				if (local370.aClass136Array2 != null) {
					for (local547 = 0; local547 < local370.aClass136Array2.length; local547++) {
						local560 = this.method3256(local370, local370.aClass136Array2[local547].anInt4531, local366);
						this.aClass136Array2[local31] = new Class136(local370.aClass136Array2[local547].anInt4533, local560);
						local31++;
					}
				}
			}
		}
		this.anInt3735 = this.anInt3736;
		@Pc(665) int local665 = 0;
		for (@Pc(667) int local667 = 0; local667 < arg1; local667++) {
			@Pc(674) short local674 = (short) (0x1 << local667);
			@Pc(678) Class111 local678 = arg0[local667];
			if (local678 != null) {
				for (local560 = 0; local560 < local678.anInt3739; local560++) {
					if (local39) {
						this.aByteArray32[local665++] = (byte) (local678.aByteArray32 == null || local678.aByteArray32[local560] == -1 ? -1 : local678.aByteArray32[local560] + this.anInt3738);
					}
				}
				for (local571 = 0; local571 < local678.anInt3738; local571++) {
					@Pc(734) byte local734 = this.aByteArray41[this.anInt3738] = local678.aByteArray41[local571];
					if (local734 == 0) {
						this.aShortArray42[this.anInt3738] = (short) this.method3256(local678, local678.aShortArray42[local571], local674);
						this.aShortArray45[this.anInt3738] = (short) this.method3256(local678, local678.aShortArray45[local571], local674);
						this.aShortArray41[this.anInt3738] = (short) this.method3256(local678, local678.aShortArray41[local571], local674);
					}
					if (local734 >= 1 && local734 <= 3) {
						this.aShortArray42[this.anInt3738] = local678.aShortArray42[local571];
						this.aShortArray45[this.anInt3738] = local678.aShortArray45[local571];
						this.aShortArray41[this.anInt3738] = local678.aShortArray41[local571];
						this.aShortArray49[this.anInt3738] = local678.aShortArray49[local571];
						this.aShortArray47[this.anInt3738] = local678.aShortArray47[local571];
						this.aShortArray48[this.anInt3738] = local678.aShortArray48[local571];
						this.aByteArray38[this.anInt3738] = local678.aByteArray38[local571];
						this.aByteArray33[this.anInt3738] = local678.aByteArray33[local571];
						this.aByteArray34[this.anInt3738] = local678.aByteArray34[local571];
					}
					if (local734 == 2) {
						this.aByteArray36[this.anInt3738] = local678.aByteArray36[local571];
						this.aByteArray40[this.anInt3738] = local678.aByteArray40[local571];
					}
					this.anInt3738++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)[[I")
	public int[][] method3244() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3739; local12++) {
			@Pc(19) int local19 = this.anIntArray287[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt3739; local79++) {
			@Pc(86) int local86 = this.anIntArray287[local79];
			if (local86 >= 0) {
				local46[local86][local8[local86]++] = local79;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(SSSSBBSBSI)B")
	public byte method3246() {
		if (this.anInt3738 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray41[this.anInt3738] = 3;
		this.aShortArray42[this.anInt3738] = 0;
		this.aShortArray45[this.anInt3738] = 32767;
		this.aShortArray41[this.anInt3738] = 0;
		this.aShortArray49[this.anInt3738] = 1024;
		this.aShortArray47[this.anInt3738] = 1024;
		this.aShortArray48[this.anInt3738] = 1024;
		this.aByteArray38[this.anInt3738] = 0;
		this.aByteArray33[this.anInt3738] = 0;
		this.aByteArray34[this.anInt3738] = 0;
		return (byte) this.anInt3738++;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BZ)V")
	private void method3247(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub12 local10 = new Class2_Sub12(arg0);
		@Pc(15) Class2_Sub12 local15 = new Class2_Sub12(arg0);
		@Pc(20) Class2_Sub12 local20 = new Class2_Sub12(arg0);
		@Pc(25) Class2_Sub12 local25 = new Class2_Sub12(arg0);
		@Pc(30) Class2_Sub12 local30 = new Class2_Sub12(arg0);
		@Pc(35) Class2_Sub12 local35 = new Class2_Sub12(arg0);
		@Pc(40) Class2_Sub12 local40 = new Class2_Sub12(arg0);
		local10.anInt3606 = arg0.length - 23;
		this.anInt3736 = local10.method3104();
		this.anInt3739 = local10.method3104();
		this.anInt3738 = local10.method3124();
		@Pc(65) int local65 = local10.method3124();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(87) int local87 = local10.method3124();
		@Pc(91) int local91 = local10.method3124();
		@Pc(95) int local95 = local10.method3124();
		@Pc(99) int local99 = local10.method3124();
		@Pc(103) int local103 = local10.method3124();
		@Pc(107) int local107 = local10.method3104();
		@Pc(111) int local111 = local10.method3104();
		@Pc(115) int local115 = local10.method3104();
		@Pc(119) int local119 = local10.method3104();
		@Pc(123) int local123 = local10.method3104();
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(142) int local142;
		if (this.anInt3738 > 0) {
			this.aByteArray41 = new byte[this.anInt3738];
			local10.anInt3606 = 0;
			for (local142 = 0; local142 < this.anInt3738; local142++) {
				@Pc(153) byte local153 = this.aByteArray41[local142] = local10.method3122();
				if (local153 == 2) {
					local129++;
				}
				if (local153 == 0) {
					local125++;
				}
				if (local153 >= 1 && local153 <= 3) {
					local127++;
				}
			}
		}
		local142 = this.anInt3738;
		@Pc(181) int local181 = local142;
		local142 += this.anInt3736;
		@Pc(188) int local188 = local142;
		if (local74) {
			local142 += this.anInt3739;
		}
		@Pc(197) int local197 = local142;
		local142 += this.anInt3739;
		@Pc(204) int local204 = local142;
		if (local87 == 255) {
			local142 += this.anInt3739;
		}
		@Pc(214) int local214 = local142;
		if (local95 == 1) {
			local142 += this.anInt3739;
		}
		@Pc(224) int local224 = local142;
		if (local103 == 1) {
			local142 += this.anInt3736;
		}
		@Pc(236) int local236 = local142;
		if (local91 == 1) {
			local142 += this.anInt3739;
		}
		@Pc(246) int local246 = local142;
		local142 += local119;
		@Pc(252) int local252 = local142;
		if (local99 == 1) {
			local142 += this.anInt3739 * 2;
		}
		@Pc(266) int local266 = local142;
		local142 += local123;
		@Pc(272) int local272 = local142;
		local142 += this.anInt3739 * 2;
		@Pc(281) int local281 = local142;
		local142 += local107;
		@Pc(287) int local287 = local142;
		local142 += local111;
		@Pc(293) int local293 = local142;
		local142 += local115;
		@Pc(299) int local299 = local142;
		local142 += local125 * 6;
		@Pc(307) int local307 = local142;
		local142 += local127 * 6;
		@Pc(315) int local315 = local142;
		local142 += local127 * 6;
		@Pc(323) int local323 = local142;
		local142 += local127;
		@Pc(329) int local329 = local142;
		local142 += local127;
		@Pc(335) int local335 = local142;
		local142 += local127 + local129 * 2;
		if (local95 == 1) {
			this.anIntArray287 = new int[this.anInt3739];
		}
		if (local103 == 1) {
			this.anIntArray286 = new int[this.anInt3736];
		}
		this.aShortArray43 = new short[this.anInt3739];
		this.aShortArray46 = new short[this.anInt3739];
		if (local91 == 1) {
			this.aByteArray39 = new byte[this.anInt3739];
		}
		if (local99 == 1 && this.anInt3738 > 0) {
			this.aByteArray32 = new byte[this.anInt3739];
		}
		this.aShortArray40 = new short[this.anInt3739];
		if (local74) {
			this.aByteArray37 = new byte[this.anInt3739];
		}
		local10.anInt3606 = local181;
		if (this.anInt3738 > 0) {
			this.aShortArray42 = new short[this.anInt3738];
			this.aShortArray45 = new short[this.anInt3738];
			if (local127 > 0) {
				this.aShortArray49 = new short[local127];
				this.aShortArray47 = new short[local127];
				this.aByteArray33 = new byte[local127];
				this.aByteArray34 = new byte[local127];
				this.aShortArray48 = new short[local127];
				this.aByteArray38 = new byte[local127];
			}
			if (local129 > 0) {
				this.aByteArray36 = new byte[local129];
				this.aByteArray40 = new byte[local129];
			}
			this.aShortArray41 = new short[this.anInt3738];
		}
		this.anIntArray282 = new int[this.anInt3736];
		if (local99 == 1) {
			this.aShortArray44 = new short[this.anInt3739];
		}
		this.anIntArray285 = new int[this.anInt3736];
		this.aShortArray51 = new short[this.anInt3739];
		if (local87 == 255) {
			this.aByteArray35 = new byte[this.anInt3739];
		} else {
			this.aByte47 = (byte) local87;
		}
		this.anIntArray283 = new int[this.anInt3736];
		local15.anInt3606 = local281;
		local20.anInt3606 = local287;
		local25.anInt3606 = local293;
		local30.anInt3606 = local224;
		@Pc(533) int local533 = 0;
		@Pc(535) int local535 = 0;
		@Pc(537) int local537 = 0;
		@Pc(545) int local545;
		for (@Pc(539) int local539 = 0; local539 < this.anInt3736; local539++) {
			local545 = local10.method3124();
			@Pc(547) int local547 = 0;
			if ((local545 & 0x1) != 0) {
				local547 = local15.method3123();
			}
			@Pc(557) int local557 = 0;
			if ((local545 & 0x2) != 0) {
				local557 = local20.method3123();
			}
			@Pc(567) int local567 = 0;
			if ((local545 & 0x4) != 0) {
				local567 = local25.method3123();
			}
			this.anIntArray283[local539] = local533 + local547;
			this.anIntArray282[local539] = local535 + local557;
			this.anIntArray285[local539] = local567 + local537;
			local537 = this.anIntArray285[local539];
			local533 = this.anIntArray283[local539];
			local535 = this.anIntArray282[local539];
			if (local103 == 1) {
				this.anIntArray286[local539] = local30.method3124();
			}
		}
		local10.anInt3606 = local272;
		local15.anInt3606 = local188;
		local20.anInt3606 = local204;
		local25.anInt3606 = local236;
		local30.anInt3606 = local214;
		local35.anInt3606 = local252;
		local40.anInt3606 = local266;
		for (local545 = 0; local545 < this.anInt3739; local545++) {
			this.aShortArray46[local545] = (short) local10.method3104();
			if (local74) {
				this.aByteArray37[local545] = local15.method3122();
			}
			if (local87 == 255) {
				this.aByteArray35[local545] = local20.method3122();
			}
			if (local91 == 1) {
				this.aByteArray39[local545] = local25.method3122();
			}
			if (local95 == 1) {
				this.anIntArray287[local545] = local30.method3124();
			}
			if (local99 == 1) {
				this.aShortArray44[local545] = (short) (local35.method3104() - 1);
			}
			if (this.aByteArray32 != null) {
				if (this.aShortArray44[local545] == -1) {
					this.aByteArray32[local545] = -1;
				} else {
					this.aByteArray32[local545] = (byte) (local40.method3124() - 1);
				}
			}
		}
		this.anInt3735 = -1;
		local10.anInt3606 = local246;
		local15.anInt3606 = local197;
		@Pc(765) short local765 = 0;
		@Pc(767) short local767 = 0;
		@Pc(769) short local769 = 0;
		@Pc(771) short local771 = 0;
		@Pc(779) int local779;
		for (@Pc(773) int local773 = 0; local773 < this.anInt3739; local773++) {
			local779 = local15.method3124();
			if (local779 == 1) {
				local765 = (short) (local771 + local10.method3123());
				local767 = (short) (local765 + local10.method3123());
				local769 = (short) (local767 + local10.method3123());
				local771 = local769;
				this.aShortArray43[local773] = local765;
				this.aShortArray51[local773] = local767;
				this.aShortArray40[local773] = local769;
				if (local765 > this.anInt3735) {
					this.anInt3735 = local765;
				}
				if (local767 > this.anInt3735) {
					this.anInt3735 = local767;
				}
				if (this.anInt3735 < local769) {
					this.anInt3735 = local769;
				}
			}
			if (local779 == 2) {
				local767 = local769;
				local769 = (short) (local771 + local10.method3123());
				this.aShortArray43[local773] = local765;
				local771 = local769;
				this.aShortArray51[local773] = local767;
				this.aShortArray40[local773] = local769;
				if (this.anInt3735 < local769) {
					this.anInt3735 = local769;
				}
			}
			if (local779 == 3) {
				local765 = local769;
				local769 = (short) (local10.method3123() + local771);
				this.aShortArray43[local773] = local765;
				local771 = local769;
				this.aShortArray51[local773] = local767;
				this.aShortArray40[local773] = local769;
				if (this.anInt3735 < local769) {
					this.anInt3735 = local769;
				}
			}
			if (local779 == 4) {
				@Pc(930) short local930 = local765;
				local765 = local767;
				local767 = local930;
				local769 = (short) (local771 + local10.method3123());
				this.aShortArray43[local773] = local765;
				local771 = local769;
				this.aShortArray51[local773] = local930;
				this.aShortArray40[local773] = local769;
				if (this.anInt3735 < local769) {
					this.anInt3735 = local769;
				}
			}
		}
		this.anInt3735++;
		local10.anInt3606 = local299;
		local15.anInt3606 = local307;
		local20.anInt3606 = local315;
		local25.anInt3606 = local323;
		local30.anInt3606 = local329;
		local35.anInt3606 = local335;
		@Pc(1009) int local1009;
		for (local779 = 0; local779 < this.anInt3738; local779++) {
			local1009 = this.aByteArray41[local779] & 0xFF;
			if (local1009 == 0) {
				this.aShortArray42[local779] = (short) local10.method3104();
				this.aShortArray45[local779] = (short) local10.method3104();
				this.aShortArray41[local779] = (short) local10.method3104();
			}
			if (local1009 == 1) {
				this.aShortArray42[local779] = (short) local15.method3104();
				this.aShortArray45[local779] = (short) local15.method3104();
				this.aShortArray41[local779] = (short) local15.method3104();
				this.aShortArray49[local779] = (short) local20.method3104();
				this.aShortArray47[local779] = (short) local20.method3104();
				this.aShortArray48[local779] = (short) local20.method3104();
				this.aByteArray38[local779] = local25.method3122();
				this.aByteArray33[local779] = local30.method3122();
				this.aByteArray34[local779] = local35.method3122();
			}
			if (local1009 == 2) {
				this.aShortArray42[local779] = (short) local15.method3104();
				this.aShortArray45[local779] = (short) local15.method3104();
				this.aShortArray41[local779] = (short) local15.method3104();
				this.aShortArray49[local779] = (short) local20.method3104();
				this.aShortArray47[local779] = (short) local20.method3104();
				this.aShortArray48[local779] = (short) local20.method3104();
				this.aByteArray38[local779] = local25.method3122();
				this.aByteArray33[local779] = local30.method3122();
				this.aByteArray34[local779] = local35.method3122();
				this.aByteArray36[local779] = local35.method3122();
				this.aByteArray40[local779] = local35.method3122();
			}
			if (local1009 == 3) {
				this.aShortArray42[local779] = (short) local15.method3104();
				this.aShortArray45[local779] = (short) local15.method3104();
				this.aShortArray41[local779] = (short) local15.method3104();
				this.aShortArray49[local779] = (short) local20.method3104();
				this.aShortArray47[local779] = (short) local20.method3104();
				this.aShortArray48[local779] = (short) local20.method3104();
				this.aByteArray38[local779] = local25.method3122();
				this.aByteArray33[local779] = local30.method3122();
				this.aByteArray34[local779] = local35.method3122();
			}
		}
		if (!local83) {
			return;
		}
		local10.anInt3606 = local142;
		local1009 = local10.method3124();
		@Pc(1287) int local1287;
		@Pc(1293) int local1293;
		if (local1009 > 0) {
			this.aClass197Array2 = new Class197[local1009];
			for (local1287 = 0; local1287 < local1009; local1287++) {
				local1293 = local10.method3104();
				@Pc(1297) int local1297 = local10.method3104();
				@Pc(1307) byte local1307;
				if (local87 == 255) {
					local1307 = this.aByteArray35[local1297];
				} else {
					local1307 = (byte) local87;
				}
				this.aClass197Array2[local1287] = new Class197(local1293, this.aShortArray43[local1297], this.aShortArray51[local1297], this.aShortArray40[local1297], local1307);
			}
		}
		local1287 = local10.method3124();
		if (local1287 <= 0) {
			return;
		}
		this.aClass136Array2 = new Class136[local1287];
		for (local1293 = 0; local1293 < local1287; local1293++) {
			this.aClass136Array2[local1293] = new Class136(local10.method3104(), local10.method3104());
		}
		return;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
	public void method3248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class101.anIntArray234[arg1];
			local14 = Class101.anIntArray235[arg1];
			for (local16 = 0; local16 < this.anInt3736; local16++) {
				local34 = this.anIntArray283[local16] * local14 + this.anIntArray282[local16] * local10 >> 15;
				this.anIntArray282[local16] = this.anIntArray282[local16] * local14 - this.anIntArray283[local16] * local10 >> 15;
				this.anIntArray283[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class101.anIntArray234[arg2];
			local14 = Class101.anIntArray235[arg2];
			for (local16 = 0; local16 < this.anInt3736; local16++) {
				local34 = this.anIntArray282[local16] * local14 - this.anIntArray285[local16] * local10 >> 15;
				this.anIntArray285[local16] = this.anIntArray285[local16] * local14 + this.anIntArray282[local16] * local10 >> 15;
				this.anIntArray282[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class101.anIntArray234[arg0];
		local14 = Class101.anIntArray235[arg0];
		for (local16 = 0; local16 < this.anInt3736; local16++) {
			local34 = local10 * this.anIntArray285[local16] + this.anIntArray283[local16] * local14 >> 15;
			this.anIntArray285[local16] = local14 * this.anIntArray285[local16] - local10 * this.anIntArray283[local16] >> 15;
			this.anIntArray283[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "([BZ)V")
	private void method3249(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub12 local14 = new Class2_Sub12(arg0);
		@Pc(19) Class2_Sub12 local19 = new Class2_Sub12(arg0);
		@Pc(24) Class2_Sub12 local24 = new Class2_Sub12(arg0);
		@Pc(29) Class2_Sub12 local29 = new Class2_Sub12(arg0);
		@Pc(34) Class2_Sub12 local34 = new Class2_Sub12(arg0);
		local14.anInt3606 = arg0.length - 18;
		this.anInt3736 = local14.method3104();
		this.anInt3739 = local14.method3104();
		this.anInt3738 = local14.method3124();
		@Pc(59) int local59 = local14.method3124();
		@Pc(63) int local63 = local14.method3124();
		@Pc(67) int local67 = local14.method3124();
		@Pc(71) int local71 = local14.method3124();
		@Pc(75) int local75 = local14.method3124();
		@Pc(79) int local79 = local14.method3104();
		@Pc(83) int local83 = local14.method3104();
		@Pc(87) int local87 = local14.method3104();
		@Pc(91) int local91 = local14.method3104();
		@Pc(100) int local100 = this.anInt3736;
		@Pc(102) int local102 = local100;
		local100 += this.anInt3739;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt3739;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt3739;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt3739;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt3736;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt3739;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt3739 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt3738 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		if (local67 == 1) {
			this.aByteArray39 = new byte[this.anInt3739];
		}
		this.aShortArray46 = new short[this.anInt3739];
		this.aShortArray40 = new short[this.anInt3739];
		this.anIntArray285 = new int[this.anInt3736];
		this.anIntArray283 = new int[this.anInt3736];
		this.aShortArray43 = new short[this.anInt3739];
		if (local63 == 255) {
			this.aByteArray35 = new byte[this.anInt3739];
		} else {
			this.aByte47 = (byte) local63;
		}
		if (local59 == 1) {
			this.aByteArray37 = new byte[this.anInt3739];
			this.aShortArray44 = new short[this.anInt3739];
			this.aByteArray32 = new byte[this.anInt3739];
		}
		if (local75 == 1) {
			this.anIntArray286 = new int[this.anInt3736];
		}
		if (local71 == 1) {
			this.anIntArray287 = new int[this.anInt3739];
		}
		if (this.anInt3738 > 0) {
			this.aByteArray41 = new byte[this.anInt3738];
			this.aShortArray41 = new short[this.anInt3738];
			this.aShortArray45 = new short[this.anInt3738];
			this.aShortArray42 = new short[this.anInt3738];
		}
		this.aShortArray51 = new short[this.anInt3739];
		local14.anInt3606 = 0;
		this.anIntArray282 = new int[this.anInt3736];
		local19.anInt3606 = local189;
		local24.anInt3606 = local195;
		local29.anInt3606 = local100;
		local34.anInt3606 = local143;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt3736; local350++) {
			local356 = local14.method3124();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method3123();
			}
			@Pc(371) int local371 = 0;
			if ((local356 & 0x2) != 0) {
				local371 = local24.method3123();
			}
			@Pc(381) int local381 = 0;
			if ((local356 & 0x4) != 0) {
				local381 = local29.method3123();
			}
			this.anIntArray283[local350] = local344 + local358;
			this.anIntArray282[local350] = local371 + local346;
			this.anIntArray285[local350] = local348 + local381;
			local346 = this.anIntArray282[local350];
			local344 = this.anIntArray283[local350];
			local348 = this.anIntArray285[local350];
			if (local75 == 1) {
				this.anIntArray286[local350] = local34.method3124();
			}
		}
		local14.anInt3606 = local171;
		local19.anInt3606 = local133;
		local24.anInt3606 = local109;
		local29.anInt3606 = local155;
		local34.anInt3606 = local121;
		for (local356 = 0; local356 < this.anInt3739; local356++) {
			this.aShortArray46[local356] = (short) local14.method3104();
			if (local59 == 1) {
				local358 = local19.method3124();
				if ((local358 & 0x1) == 1) {
					local7 = true;
					this.aByteArray37[local356] = 1;
				} else {
					this.aByteArray37[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray32[local356] = (byte) (local358 >> 2);
					this.aShortArray44[local356] = this.aShortArray46[local356];
					this.aShortArray46[local356] = 127;
					if (this.aShortArray44[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray32[local356] = -1;
					this.aShortArray44[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray35[local356] = local24.method3122();
			}
			if (local67 == 1) {
				this.aByteArray39[local356] = local29.method3122();
			}
			if (local71 == 1) {
				this.anIntArray287[local356] = local34.method3124();
			}
		}
		this.anInt3735 = -1;
		local14.anInt3606 = local165;
		local19.anInt3606 = local102;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt3739; local613++) {
			local619 = local19.method3124();
			if (local619 == 1) {
				local605 = (short) (local14.method3123() + local611);
				local607 = (short) (local605 + local14.method3123());
				local609 = (short) (local607 + local14.method3123());
				this.aShortArray43[local613] = local605;
				local611 = local609;
				this.aShortArray51[local613] = local607;
				this.aShortArray40[local613] = local609;
				if (this.anInt3735 < local605) {
					this.anInt3735 = local605;
				}
				if (this.anInt3735 < local607) {
					this.anInt3735 = local607;
				}
				if (local609 > this.anInt3735) {
					this.anInt3735 = local609;
				}
			}
			if (local619 == 2) {
				local607 = local609;
				local609 = (short) (local14.method3123() + local611);
				local611 = local609;
				this.aShortArray43[local613] = local605;
				this.aShortArray51[local613] = local607;
				this.aShortArray40[local613] = local609;
				if (local609 > this.anInt3735) {
					this.anInt3735 = local609;
				}
			}
			if (local619 == 3) {
				local605 = local609;
				local609 = (short) (local14.method3123() + local611);
				local611 = local609;
				this.aShortArray43[local613] = local605;
				this.aShortArray51[local613] = local607;
				this.aShortArray40[local613] = local609;
				if (this.anInt3735 < local609) {
					this.anInt3735 = local609;
				}
			}
			if (local619 == 4) {
				@Pc(774) short local774 = local605;
				local605 = local607;
				local609 = (short) (local611 + local14.method3123());
				local607 = local774;
				local611 = local609;
				this.aShortArray43[local613] = local605;
				this.aShortArray51[local613] = local774;
				this.aShortArray40[local613] = local609;
				if (this.anInt3735 < local609) {
					this.anInt3735 = local609;
				}
			}
		}
		local14.anInt3606 = local180;
		this.anInt3735++;
		for (local619 = 0; local619 < this.anInt3738; local619++) {
			this.aByteArray41[local619] = 0;
			this.aShortArray42[local619] = (short) local14.method3104();
			this.aShortArray45[local619] = (short) local14.method3104();
			this.aShortArray41[local619] = (short) local14.method3104();
		}
		if (this.aByteArray32 != null) {
			@Pc(870) boolean local870 = false;
			for (@Pc(872) int local872 = 0; local872 < this.anInt3739; local872++) {
				@Pc(881) int local881 = this.aByteArray32[local872] & 0xFF;
				if (local881 != 255) {
					if ((this.aShortArray42[local881] & 0xFFFF) == this.aShortArray43[local872] && this.aShortArray51[local872] == (this.aShortArray45[local881] & 0xFFFF) && this.aShortArray40[local872] == (this.aShortArray41[local881] & 0xFFFF)) {
						this.aByteArray32[local872] = -1;
					} else {
						local870 = true;
					}
				}
			}
			if (!local870) {
				this.aByteArray32 = null;
			}
		}
		if (!local9) {
			this.aShortArray44 = null;
		}
		if (!local7) {
			this.aByteArray37 = null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIII)V")
	public void method3250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3736; local13++) {
			this.anIntArray283[local13] += arg0;
			this.anIntArray282[local13] += arg1;
			this.anIntArray285[local13] += arg2;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(SSB)V")
	public void method3251(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray44 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3739; local18++) {
			if (this.aShortArray44[local18] == arg1) {
				this.aShortArray44[local18] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(IIII)I")
	public int method3252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3736; local12++) {
			if (this.anIntArray283[local12] == arg2 && arg1 == this.anIntArray282[local12] && this.anIntArray285[local12] == arg0) {
				return local12;
			}
		}
		this.anIntArray283[this.anInt3736] = arg2;
		this.anIntArray282[this.anInt3736] = arg1;
		this.anIntArray285[this.anInt3736] = arg0;
		this.anInt3735 = this.anInt3736 + 1;
		return this.anInt3736++;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)[[I")
	public int[][] method3253() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt3735; local19++) {
			@Pc(26) int local26 = this.anIntArray286[local19];
			if (local26 >= 0) {
				if (local10 < local26) {
					local10 = local26;
				}
				@Pc(44) int local44 = local8[local26]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt3735; local82++) {
			@Pc(89) int local89 = this.anIntArray286[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(SIISBBBIB)I")
	public int method3254(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7) {
		this.aShortArray43[this.anInt3739] = (short) arg2;
		this.aShortArray51[this.anInt3739] = (short) arg1;
		this.aShortArray40[this.anInt3739] = (short) arg7;
		this.aByteArray37[this.anInt3739] = arg5;
		this.aByteArray32[this.anInt3739] = arg6;
		this.aShortArray46[this.anInt3739] = arg0;
		this.aByteArray39[this.anInt3739] = arg4;
		this.aShortArray44[this.anInt3739] = arg3;
		return this.anInt3739++;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(SZS)V")
	public void method3255(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3739; local7++) {
			if (this.aShortArray46[local7] == arg1) {
				this.aShortArray46[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!jp;IBS)I")
	private int method3256(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray283[arg1];
		@Pc(15) int local15 = arg0.anIntArray282[arg1];
		@Pc(20) int local20 = arg0.anIntArray285[arg1];
		for (@Pc(30) int local30 = 0; local30 < this.anInt3736; local30++) {
			if (this.anIntArray283[local30] == local10 && this.anIntArray282[local30] == local15 && local20 == this.anIntArray285[local30]) {
				this.aShortArray50[local30] |= arg2;
				return local30;
			}
		}
		this.anIntArray283[this.anInt3736] = local10;
		this.anIntArray282[this.anInt3736] = local15;
		this.anIntArray285[this.anInt3736] = local20;
		this.aShortArray50[this.anInt3736] = arg2;
		this.anIntArray286[this.anInt3736] = arg0.anIntArray286 == null ? -1 : arg0.anIntArray286[arg1];
		return this.anInt3736++;
	}
}
