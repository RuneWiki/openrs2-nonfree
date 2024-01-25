import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class91 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "[Lclient!ta;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "[Lclient!qm;")
	public Class191[] aClass191Array1;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!gr", name = "Q", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!gr", name = "R", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!gr", name = "S", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!gr", name = "U", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!gr", name = "W", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!gr", name = "X", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!gr", name = "Y", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt2308 = 0;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "B")
	public byte aByte20 = 0;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt2309 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt2305 = 0;

	@OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
	public int anInt2319 = 0;

	static {
		new Class221("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([B)V")
	public Class91(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2213(arg0);
		} else {
			this.method2202(arg0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(III)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aByteArray37 = new byte[arg2];
			this.aByteArray43 = new byte[arg2];
			this.aByteArray39 = new byte[arg2];
			this.aShortArray51 = new short[arg2];
			this.aShortArray47 = new short[arg2];
			this.aByteArray40 = new byte[arg2];
			this.aShortArray46 = new short[arg2];
			this.aShortArray48 = new short[arg2];
			this.aShortArray52 = new short[arg2];
			this.aByteArray36 = new byte[arg2];
			this.aShortArray50 = new short[arg2];
			this.aByteArray35 = new byte[arg2];
		}
		this.aByteArray41 = new byte[arg1];
		this.aShortArray53 = new short[arg1];
		this.anIntArray267 = new int[arg0];
		this.aShortArray41 = new short[arg1];
		this.anIntArray263 = new int[arg0];
		this.anIntArray264 = new int[arg0];
		this.anIntArray266 = new int[arg0];
		this.aByteArray38 = new byte[arg1];
		this.aByteArray42 = new byte[arg1];
		this.aByteArray34 = new byte[arg1];
		this.aShortArray45 = new short[arg1];
		this.anIntArray265 = new int[arg1];
		this.aShortArray43 = new short[arg1];
		this.aShortArray44 = new short[arg1];
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([Lclient!gr;I)V")
	public Class91(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2308 = 0;
		this.anInt2319 = 0;
		this.anInt2309 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte20 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class91 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt2309 += local54.anInt2309;
				this.anInt2308 += local54.anInt2308;
				this.anInt2319 += local54.anInt2319;
				if (local54.aClass218Array1 != null) {
					local31 += local54.aClass218Array1.length;
				}
				local33 |= local54.aByteArray38 != null;
				if (local54.aClass191Array1 != null) {
					local29 += local54.aClass191Array1.length;
				}
				local41 |= local54.aShortArray44 != null;
				if (local54.aByteArray41 == null) {
					if (this.aByte20 == -1) {
						this.aByte20 = local54.aByte20;
					}
					if (this.aByte20 != local54.aByte20) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local37 |= local54.aByteArray42 != null;
				local39 |= local54.aByteArray34 != null;
				local43 |= local54.anIntArray265 != null;
			}
		}
		this.aShortArray43 = new short[this.anInt2319];
		if (local37) {
			this.aByteArray42 = new byte[this.anInt2319];
		}
		this.aShortArray53 = new short[this.anInt2319];
		if (local35) {
			this.aByteArray41 = new byte[this.anInt2319];
		}
		this.aShortArray45 = new short[this.anInt2319];
		this.aShortArray41 = new short[this.anInt2319];
		this.aShortArray42 = new short[this.anInt2319];
		this.anIntArray264 = new int[this.anInt2308];
		if (local31 > 0) {
			this.aClass218Array1 = new Class218[local31];
		}
		if (local43) {
			this.anIntArray265 = new int[this.anInt2319];
		}
		this.anIntArray266 = new int[this.anInt2308];
		this.aShortArray49 = new short[this.anInt2308];
		if (local33) {
			this.aByteArray38 = new byte[this.anInt2319];
		}
		if (local39) {
			this.aByteArray34 = new byte[this.anInt2319];
		}
		if (local41) {
			this.aShortArray44 = new short[this.anInt2319];
		}
		if (this.anInt2309 > 0) {
			this.aByteArray35 = new byte[this.anInt2309];
			this.aShortArray48 = new short[this.anInt2309];
			this.aShortArray47 = new short[this.anInt2309];
			this.aByteArray43 = new byte[this.anInt2309];
			this.aByteArray37 = new byte[this.anInt2309];
			this.aShortArray52 = new short[this.anInt2309];
			this.aShortArray50 = new short[this.anInt2309];
			this.aByteArray36 = new byte[this.anInt2309];
			this.aByteArray40 = new byte[this.anInt2309];
			this.aByteArray39 = new byte[this.anInt2309];
			this.aShortArray46 = new short[this.anInt2309];
			this.aShortArray51 = new short[this.anInt2309];
		}
		this.anIntArray267 = new int[this.anInt2308];
		if (local29 > 0) {
			this.aClass191Array1 = new Class191[local29];
		}
		this.anIntArray263 = new int[this.anInt2308];
		this.anInt2309 = 0;
		this.anInt2319 = 0;
		this.anInt2308 = 0;
		local29 = 0;
		local31 = 0;
		@Pc(557) int local557;
		@Pc(568) int local568;
		for (@Pc(356) int local356 = 0; local356 < arg1; local356++) {
			@Pc(363) short local363 = (short) (0x1 << local356);
			@Pc(367) Class91 local367 = arg0[local356];
			if (local367 != null) {
				for (@Pc(371) int local371 = 0; local371 < local367.anInt2319; local371++) {
					if (local33 && local367.aByteArray38 != null) {
						this.aByteArray38[this.anInt2319] = local367.aByteArray38[local371];
					}
					if (local35) {
						if (local367.aByteArray41 == null) {
							this.aByteArray41[this.anInt2319] = local367.aByte20;
						} else {
							this.aByteArray41[this.anInt2319] = local367.aByteArray41[local371];
						}
					}
					if (local37 && local367.aByteArray42 != null) {
						this.aByteArray42[this.anInt2319] = local367.aByteArray42[local371];
					}
					if (local41) {
						if (local367.aShortArray44 == null) {
							this.aShortArray44[this.anInt2319] = -1;
						} else {
							this.aShortArray44[this.anInt2319] = local367.aShortArray44[local371];
						}
					}
					if (local43) {
						if (local367.anIntArray265 == null) {
							this.anIntArray265[this.anInt2319] = -1;
						} else {
							this.anIntArray265[this.anInt2319] = local367.anIntArray265[local371];
						}
					}
					this.aShortArray43[this.anInt2319] = (short) this.method2207(local367, local363, local367.aShortArray43[local371]);
					this.aShortArray53[this.anInt2319] = (short) this.method2207(local367, local363, local367.aShortArray53[local371]);
					this.aShortArray45[this.anInt2319] = (short) this.method2207(local367, local363, local367.aShortArray45[local371]);
					this.aShortArray42[this.anInt2319] = local363;
					this.aShortArray41[this.anInt2319] = local367.aShortArray41[local371];
					this.anInt2319++;
				}
				@Pc(544) int local544;
				if (local367.aClass191Array1 != null) {
					for (local544 = 0; local544 < local367.aClass191Array1.length; local544++) {
						local557 = this.method2207(local367, local363, local367.aClass191Array1[local544].anInt5273);
						local568 = this.method2207(local367, local363, local367.aClass191Array1[local544].anInt5275);
						@Pc(579) int local579 = this.method2207(local367, local363, local367.aClass191Array1[local544].anInt5278);
						this.aClass191Array1[local29] = new Class191(local367.aClass191Array1[local544].anInt5268, local557, local568, local579, local367.aClass191Array1[local544].aByte54);
						local29++;
					}
				}
				if (local367.aClass218Array1 != null) {
					for (local544 = 0; local544 < local367.aClass218Array1.length; local544++) {
						local557 = this.method2207(local367, local363, local367.aClass218Array1[local544].anInt5829);
						this.aClass218Array1[local31] = new Class218(local367.aClass218Array1[local544].anInt5832, local557);
						local31++;
					}
				}
			}
		}
		@Pc(662) int local662 = 0;
		this.anInt2305 = this.anInt2308;
		for (@Pc(668) int local668 = 0; local668 < arg1; local668++) {
			@Pc(675) short local675 = (short) (0x1 << local668);
			@Pc(679) Class91 local679 = arg0[local668];
			if (local679 != null) {
				for (local557 = 0; local557 < local679.anInt2319; local557++) {
					if (local39) {
						this.aByteArray34[local662++] = (byte) (local679.aByteArray34 == null || local679.aByteArray34[local557] == -1 ? -1 : this.anInt2309 + local679.aByteArray34[local557]);
					}
				}
				for (local568 = 0; local568 < local679.anInt2309; local568++) {
					@Pc(732) byte local732 = this.aByteArray40[this.anInt2309] = local679.aByteArray40[local568];
					if (local732 == 0) {
						this.aShortArray50[this.anInt2309] = (short) this.method2207(local679, local675, local679.aShortArray50[local568]);
						this.aShortArray47[this.anInt2309] = (short) this.method2207(local679, local675, local679.aShortArray47[local568]);
						this.aShortArray52[this.anInt2309] = (short) this.method2207(local679, local675, local679.aShortArray52[local568]);
					}
					if (local732 >= 1 && local732 <= 3) {
						this.aShortArray50[this.anInt2309] = local679.aShortArray50[local568];
						this.aShortArray47[this.anInt2309] = local679.aShortArray47[local568];
						this.aShortArray52[this.anInt2309] = local679.aShortArray52[local568];
						this.aShortArray51[this.anInt2309] = local679.aShortArray51[local568];
						this.aShortArray48[this.anInt2309] = local679.aShortArray48[local568];
						this.aShortArray46[this.anInt2309] = local679.aShortArray46[local568];
						this.aByteArray35[this.anInt2309] = local679.aByteArray35[local568];
						this.aByteArray36[this.anInt2309] = local679.aByteArray36[local568];
						this.aByteArray39[this.anInt2309] = local679.aByteArray39[local568];
					}
					if (local732 == 2) {
						this.aByteArray43[this.anInt2309] = local679.aByteArray43[local568];
						this.aByteArray37[this.anInt2309] = local679.aByteArray37[local568];
					}
					this.anInt2309++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([BI)V")
	private void method2202(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(13) boolean local13 = false;
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(arg0);
		@Pc(23) Class2_Sub13 local23 = new Class2_Sub13(arg0);
		@Pc(28) Class2_Sub13 local28 = new Class2_Sub13(arg0);
		@Pc(33) Class2_Sub13 local33 = new Class2_Sub13(arg0);
		@Pc(38) Class2_Sub13 local38 = new Class2_Sub13(arg0);
		local18.anInt4788 = arg0.length - 18;
		this.anInt2308 = local18.method4245();
		this.anInt2319 = local18.method4245();
		this.anInt2309 = local18.method4240();
		@Pc(63) int local63 = local18.method4240();
		@Pc(67) int local67 = local18.method4240();
		@Pc(71) int local71 = local18.method4240();
		@Pc(75) int local75 = local18.method4240();
		@Pc(79) int local79 = local18.method4240();
		@Pc(83) int local83 = local18.method4245();
		@Pc(87) int local87 = local18.method4245();
		@Pc(91) int local91 = local18.method4245();
		@Pc(95) int local95 = local18.method4245();
		@Pc(104) int local104 = this.anInt2308;
		@Pc(106) int local106 = local104;
		local104 += this.anInt2319;
		@Pc(113) int local113 = local104;
		if (local67 == 255) {
			local104 += this.anInt2319;
		}
		@Pc(125) int local125 = local104;
		if (local75 == 1) {
			local104 += this.anInt2319;
		}
		@Pc(135) int local135 = local104;
		if (local63 == 1) {
			local104 += this.anInt2319;
		}
		@Pc(147) int local147 = local104;
		if (local79 == 1) {
			local104 += this.anInt2308;
		}
		@Pc(159) int local159 = local104;
		if (local71 == 1) {
			local104 += this.anInt2319;
		}
		@Pc(169) int local169 = local104;
		local104 += local95;
		@Pc(175) int local175 = local104;
		local104 += this.anInt2319 * 2;
		@Pc(184) int local184 = local104;
		local104 += this.anInt2309 * 6;
		@Pc(193) int local193 = local104;
		local104 += local83;
		@Pc(199) int local199 = local104;
		local104 += local87;
		this.anIntArray267 = new int[this.anInt2308];
		this.aShortArray45 = new short[this.anInt2319];
		this.aShortArray41 = new short[this.anInt2319];
		if (local75 == 1) {
			this.anIntArray265 = new int[this.anInt2319];
		}
		this.aShortArray53 = new short[this.anInt2319];
		if (local71 == 1) {
			this.aByteArray42 = new byte[this.anInt2319];
		}
		this.anIntArray264 = new int[this.anInt2308];
		if (this.anInt2309 > 0) {
			this.aShortArray52 = new short[this.anInt2309];
			this.aShortArray50 = new short[this.anInt2309];
			this.aShortArray47 = new short[this.anInt2309];
			this.aByteArray40 = new byte[this.anInt2309];
		}
		this.aShortArray43 = new short[this.anInt2319];
		if (local63 == 1) {
			this.aByteArray38 = new byte[this.anInt2319];
			this.aByteArray34 = new byte[this.anInt2319];
			this.aShortArray44 = new short[this.anInt2319];
		}
		if (local67 == 255) {
			this.aByteArray41 = new byte[this.anInt2319];
		} else {
			this.aByte20 = (byte) local67;
		}
		this.anIntArray266 = new int[this.anInt2308];
		if (local79 == 1) {
			this.anIntArray263 = new int[this.anInt2308];
		}
		local18.anInt4788 = 0;
		local23.anInt4788 = local193;
		local28.anInt4788 = local199;
		local33.anInt4788 = local104;
		local38.anInt4788 = local147;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(352) int local352 = 0; local352 < this.anInt2308; local352++) {
			local358 = local18.method4240();
			local360 = 0;
			if ((local358 & 0x1) != 0) {
				local360 = local23.method4192();
			}
			@Pc(370) int local370 = 0;
			if ((local358 & 0x2) != 0) {
				local370 = local28.method4192();
			}
			@Pc(383) int local383 = 0;
			if ((local358 & 0x4) != 0) {
				local383 = local33.method4192();
			}
			this.anIntArray264[local352] = local360 + local346;
			this.anIntArray266[local352] = local348 + local370;
			this.anIntArray267[local352] = local350 + local383;
			local346 = this.anIntArray264[local352];
			local348 = this.anIntArray266[local352];
			local350 = this.anIntArray267[local352];
			if (local79 == 1) {
				this.anIntArray263[local352] = local38.method4240();
			}
		}
		local18.anInt4788 = local175;
		local23.anInt4788 = local135;
		local28.anInt4788 = local113;
		local33.anInt4788 = local159;
		local38.anInt4788 = local125;
		for (local358 = 0; local358 < this.anInt2319; local358++) {
			this.aShortArray41[local358] = (short) local18.method4245();
			if (local63 == 1) {
				local360 = local23.method4240();
				if ((local360 & 0x1) == 1) {
					local7 = true;
					this.aByteArray38[local358] = 1;
				} else {
					this.aByteArray38[local358] = 0;
				}
				if ((local360 & 0x2) == 2) {
					this.aByteArray34[local358] = (byte) (local360 >> 2);
					this.aShortArray44[local358] = this.aShortArray41[local358];
					this.aShortArray41[local358] = 127;
					if (this.aShortArray44[local358] != -1) {
						local13 = true;
					}
				} else {
					this.aByteArray34[local358] = -1;
					this.aShortArray44[local358] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray41[local358] = local28.method4217();
			}
			if (local71 == 1) {
				this.aByteArray42[local358] = local33.method4217();
			}
			if (local75 == 1) {
				this.anIntArray265[local358] = local38.method4240();
			}
		}
		local18.anInt4788 = local169;
		this.anInt2305 = -1;
		local23.anInt4788 = local106;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(614) int local614;
		for (@Pc(608) int local608 = 0; local608 < this.anInt2319; local608++) {
			local614 = local23.method4240();
			if (local614 == 1) {
				local600 = (short) (local606 + local18.method4192());
				local602 = (short) (local18.method4192() + local600);
				local604 = (short) (local18.method4192() + local602);
				local606 = local604;
				this.aShortArray43[local608] = local600;
				this.aShortArray53[local608] = local602;
				this.aShortArray45[local608] = local604;
				if (local600 > this.anInt2305) {
					this.anInt2305 = local600;
				}
				if (local602 > this.anInt2305) {
					this.anInt2305 = local602;
				}
				if (local604 > this.anInt2305) {
					this.anInt2305 = local604;
				}
			}
			if (local614 == 2) {
				local602 = local604;
				local604 = (short) (local18.method4192() + local606);
				local606 = local604;
				this.aShortArray43[local608] = local600;
				this.aShortArray53[local608] = local602;
				this.aShortArray45[local608] = local604;
				if (this.anInt2305 < local604) {
					this.anInt2305 = local604;
				}
			}
			if (local614 == 3) {
				local600 = local604;
				local604 = (short) (local606 + local18.method4192());
				local606 = local604;
				this.aShortArray43[local608] = local600;
				this.aShortArray53[local608] = local602;
				this.aShortArray45[local608] = local604;
				if (this.anInt2305 < local604) {
					this.anInt2305 = local604;
				}
			}
			if (local614 == 4) {
				@Pc(773) short local773 = local600;
				local600 = local602;
				local604 = (short) (local606 + local18.method4192());
				local602 = local773;
				this.aShortArray43[local608] = local600;
				local606 = local604;
				this.aShortArray53[local608] = local773;
				this.aShortArray45[local608] = local604;
				if (local604 > this.anInt2305) {
					this.anInt2305 = local604;
				}
			}
		}
		local18.anInt4788 = local184;
		this.anInt2305++;
		for (local614 = 0; local614 < this.anInt2309; local614++) {
			this.aByteArray40[local614] = 0;
			this.aShortArray50[local614] = (short) local18.method4245();
			this.aShortArray47[local614] = (short) local18.method4245();
			this.aShortArray52[local614] = (short) local18.method4245();
		}
		if (this.aByteArray34 != null) {
			@Pc(865) boolean local865 = false;
			for (@Pc(867) int local867 = 0; local867 < this.anInt2319; local867++) {
				@Pc(876) int local876 = this.aByteArray34[local867] & 0xFF;
				if (local876 != 255) {
					if (this.aShortArray43[local867] == (this.aShortArray50[local876] & 0xFFFF) && this.aShortArray53[local867] == (this.aShortArray47[local876] & 0xFFFF) && this.aShortArray45[local867] == (this.aShortArray52[local876] & 0xFFFF)) {
						this.aByteArray34[local867] = -1;
					} else {
						local865 = true;
					}
				}
			}
			if (!local865) {
				this.aByteArray34 = null;
			}
		}
		if (!local7) {
			this.aByteArray38 = null;
		}
		if (!local13) {
			this.aShortArray44 = null;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZII)V")
	public void method2203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(32) int local32;
		if (arg2 != 0) {
			local7 = Class104.anIntArray705[arg2];
			local11 = Class104.anIntArray706[arg2];
			for (local13 = 0; local13 < this.anInt2308; local13++) {
				local32 = this.anIntArray266[local13] * local7 + this.anIntArray264[local13] * local11 >> 15;
				this.anIntArray266[local13] = local11 * this.anIntArray266[local13] - this.anIntArray264[local13] * local7 >> 15;
				this.anIntArray264[local13] = local32;
			}
		}
		if (arg1 != 0) {
			local7 = Class104.anIntArray705[arg1];
			local11 = Class104.anIntArray706[arg1];
			for (local13 = 0; local13 < this.anInt2308; local13++) {
				local32 = this.anIntArray266[local13] * local11 - this.anIntArray267[local13] * local7 >> 15;
				this.anIntArray267[local13] = this.anIntArray267[local13] * local11 + this.anIntArray266[local13] * local7 >> 15;
				this.anIntArray266[local13] = local32;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local7 = Class104.anIntArray705[arg0];
		local11 = Class104.anIntArray706[arg0];
		for (local13 = 0; local13 < this.anInt2308; local13++) {
			local32 = local11 * this.anIntArray264[local13] + this.anIntArray267[local13] * local7 >> 15;
			this.anIntArray267[local13] = this.anIntArray267[local13] * local11 - this.anIntArray264[local13] * local7 >> 15;
			this.anIntArray264[local13] = local32;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII)I")
	public int method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2308; local7++) {
			if (arg0 == this.anIntArray264[local7] && this.anIntArray266[local7] == arg2 && this.anIntArray267[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray264[this.anInt2308] = arg0;
		this.anIntArray266[this.anInt2308] = arg2;
		this.anIntArray267[this.anInt2308] = arg1;
		this.anInt2305 = this.anInt2308 + 1;
		return this.anInt2308++;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!gr;SI)I")
	private int method2207(@OriginalArg(1) Class91 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray264[arg2];
		@Pc(15) int local15 = arg0.anIntArray266[arg2];
		@Pc(20) int local20 = arg0.anIntArray267[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2308; local22++) {
			if (this.anIntArray264[local22] == local10 && local15 == this.anIntArray266[local22] && local20 == this.anIntArray267[local22]) {
				this.aShortArray49[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray264[this.anInt2308] = local10;
		this.anIntArray266[this.anInt2308] = local15;
		this.anIntArray267[this.anInt2308] = local20;
		this.aShortArray49[this.anInt2308] = arg1;
		this.anIntArray263[this.anInt2308] = arg0.anIntArray263 == null ? -1 : arg0.anIntArray263[arg2];
		return this.anInt2308++;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)[[I")
	public int[][] method2208() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2319; local12++) {
			@Pc(22) int local22 = this.anIntArray265[local12];
			if (local22 >= 0) {
				@Pc(28) int local28 = local8[local22]++;
				if (local22 > local10) {
					local10 = local22;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt2319; local71++) {
			@Pc(78) int local78 = this.anIntArray265[local71];
			if (local78 >= 0) {
				local50[local78][local8[local78]++] = local71;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBII)V")
	public void method2209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2308; local7++) {
			this.anIntArray264[local7] += arg0;
			this.anIntArray266[local7] += arg2;
			this.anIntArray267[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IISSBBBIB)I")
	public int method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) short arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7) {
		this.aShortArray43[this.anInt2319] = (short) arg7;
		this.aShortArray53[this.anInt2319] = (short) arg1;
		this.aShortArray45[this.anInt2319] = (short) arg0;
		this.aByteArray38[this.anInt2319] = arg4;
		this.aByteArray34[this.anInt2319] = arg6;
		this.aShortArray41[this.anInt2319] = arg3;
		this.aByteArray42[this.anInt2319] = arg5;
		this.aShortArray44[this.anInt2319] = arg2;
		return this.anInt2319++;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(SSSSIBBBSS)B")
	public byte method2211() {
		if (this.anInt2309 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray40[this.anInt2309] = 3;
		this.aShortArray50[this.anInt2309] = 0;
		this.aShortArray47[this.anInt2309] = 32767;
		this.aShortArray52[this.anInt2309] = 0;
		this.aShortArray51[this.anInt2309] = 1024;
		this.aShortArray48[this.anInt2309] = 1024;
		this.aShortArray46[this.anInt2309] = 1024;
		this.aByteArray35[this.anInt2309] = 0;
		this.aByteArray36[this.anInt2309] = 0;
		this.aByteArray39[this.anInt2309] = 0;
		return (byte) this.anInt2309++;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(SSZ)V")
	public void method2212(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt2319; local12++) {
			if (arg0 == this.aShortArray41[local12]) {
				this.aShortArray41[local12] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "([BI)V")
	private void method2213(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg0);
		@Pc(15) Class2_Sub13 local15 = new Class2_Sub13(arg0);
		@Pc(20) Class2_Sub13 local20 = new Class2_Sub13(arg0);
		@Pc(25) Class2_Sub13 local25 = new Class2_Sub13(arg0);
		@Pc(30) Class2_Sub13 local30 = new Class2_Sub13(arg0);
		@Pc(35) Class2_Sub13 local35 = new Class2_Sub13(arg0);
		@Pc(40) Class2_Sub13 local40 = new Class2_Sub13(arg0);
		local10.anInt4788 = arg0.length - 23;
		this.anInt2308 = local10.method4245();
		this.anInt2319 = local10.method4245();
		this.anInt2309 = local10.method4240();
		@Pc(65) int local65 = local10.method4240();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(87) int local87 = local10.method4240();
		@Pc(91) int local91 = local10.method4240();
		@Pc(95) int local95 = local10.method4240();
		@Pc(99) int local99 = local10.method4240();
		@Pc(103) int local103 = local10.method4240();
		@Pc(107) int local107 = local10.method4245();
		@Pc(111) int local111 = local10.method4245();
		@Pc(115) int local115 = local10.method4245();
		@Pc(119) int local119 = local10.method4245();
		@Pc(123) int local123 = local10.method4245();
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(142) int local142;
		if (this.anInt2309 > 0) {
			local10.anInt4788 = 0;
			this.aByteArray40 = new byte[this.anInt2309];
			for (local142 = 0; local142 < this.anInt2309; local142++) {
				@Pc(153) byte local153 = this.aByteArray40[local142] = local10.method4217();
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
		local142 = this.anInt2309;
		@Pc(183) int local183 = local142;
		local142 += this.anInt2308;
		@Pc(190) int local190 = local142;
		if (local74) {
			local142 += this.anInt2319;
		}
		@Pc(199) int local199 = local142;
		local142 += this.anInt2319;
		@Pc(206) int local206 = local142;
		if (local87 == 255) {
			local142 += this.anInt2319;
		}
		@Pc(216) int local216 = local142;
		if (local95 == 1) {
			local142 += this.anInt2319;
		}
		@Pc(226) int local226 = local142;
		if (local103 == 1) {
			local142 += this.anInt2308;
		}
		@Pc(238) int local238 = local142;
		if (local91 == 1) {
			local142 += this.anInt2319;
		}
		@Pc(248) int local248 = local142;
		local142 += local119;
		@Pc(254) int local254 = local142;
		if (local99 == 1) {
			local142 += this.anInt2319 * 2;
		}
		@Pc(266) int local266 = local142;
		local142 += local123;
		@Pc(272) int local272 = local142;
		local142 += this.anInt2319 * 2;
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
		local142 += local129 * 2 + local127;
		this.aShortArray53 = new short[this.anInt2319];
		this.anIntArray267 = new int[this.anInt2308];
		if (local99 == 1) {
			this.aShortArray44 = new short[this.anInt2319];
		}
		local10.anInt4788 = local183;
		this.anIntArray266 = new int[this.anInt2308];
		this.aShortArray41 = new short[this.anInt2319];
		if (local103 == 1) {
			this.anIntArray263 = new int[this.anInt2308];
		}
		this.aShortArray43 = new short[this.anInt2319];
		if (local74) {
			this.aByteArray38 = new byte[this.anInt2319];
		}
		this.anIntArray264 = new int[this.anInt2308];
		if (local87 == 255) {
			this.aByteArray41 = new byte[this.anInt2319];
		} else {
			this.aByte20 = (byte) local87;
		}
		if (local91 == 1) {
			this.aByteArray42 = new byte[this.anInt2319];
		}
		if (this.anInt2309 > 0) {
			this.aShortArray47 = new short[this.anInt2309];
			this.aShortArray52 = new short[this.anInt2309];
			if (local127 > 0) {
				this.aShortArray48 = new short[local127];
				this.aByteArray39 = new byte[local127];
				this.aShortArray46 = new short[local127];
				this.aByteArray36 = new byte[local127];
				this.aByteArray35 = new byte[local127];
				this.aShortArray51 = new short[local127];
			}
			this.aShortArray50 = new short[this.anInt2309];
			if (local129 > 0) {
				this.aByteArray37 = new byte[local129];
				this.aByteArray43 = new byte[local129];
			}
		}
		if (local99 == 1 && this.anInt2309 > 0) {
			this.aByteArray34 = new byte[this.anInt2319];
		}
		if (local95 == 1) {
			this.anIntArray265 = new int[this.anInt2319];
		}
		this.aShortArray45 = new short[this.anInt2319];
		local15.anInt4788 = local281;
		local20.anInt4788 = local287;
		local25.anInt4788 = local293;
		local30.anInt4788 = local226;
		@Pc(529) int local529 = 0;
		@Pc(531) int local531 = 0;
		@Pc(533) int local533 = 0;
		@Pc(541) int local541;
		for (@Pc(535) int local535 = 0; local535 < this.anInt2308; local535++) {
			local541 = local10.method4240();
			@Pc(543) int local543 = 0;
			if ((local541 & 0x1) != 0) {
				local543 = local15.method4192();
			}
			@Pc(553) int local553 = 0;
			if ((local541 & 0x2) != 0) {
				local553 = local20.method4192();
			}
			@Pc(566) int local566 = 0;
			if ((local541 & 0x4) != 0) {
				local566 = local25.method4192();
			}
			this.anIntArray264[local535] = local529 + local543;
			this.anIntArray266[local535] = local553 + local531;
			this.anIntArray267[local535] = local533 + local566;
			local529 = this.anIntArray264[local535];
			local533 = this.anIntArray267[local535];
			local531 = this.anIntArray266[local535];
			if (local103 == 1) {
				this.anIntArray263[local535] = local30.method4240();
			}
		}
		local10.anInt4788 = local272;
		local15.anInt4788 = local190;
		local20.anInt4788 = local206;
		local25.anInt4788 = local238;
		local30.anInt4788 = local216;
		local35.anInt4788 = local254;
		local40.anInt4788 = local266;
		for (local541 = 0; local541 < this.anInt2319; local541++) {
			this.aShortArray41[local541] = (short) local10.method4245();
			if (local74) {
				this.aByteArray38[local541] = local15.method4217();
			}
			if (local87 == 255) {
				this.aByteArray41[local541] = local20.method4217();
			}
			if (local91 == 1) {
				this.aByteArray42[local541] = local25.method4217();
			}
			if (local95 == 1) {
				this.anIntArray265[local541] = local30.method4240();
			}
			if (local99 == 1) {
				this.aShortArray44[local541] = (short) (local35.method4245() - 1);
			}
			if (this.aByteArray34 != null) {
				if (this.aShortArray44[local541] == -1) {
					this.aByteArray34[local541] = -1;
				} else {
					this.aByteArray34[local541] = (byte) (local40.method4240() - 1);
				}
			}
		}
		this.anInt2305 = -1;
		local10.anInt4788 = local248;
		local15.anInt4788 = local199;
		@Pc(766) short local766 = 0;
		@Pc(768) short local768 = 0;
		@Pc(770) short local770 = 0;
		@Pc(772) short local772 = 0;
		@Pc(780) int local780;
		for (@Pc(774) int local774 = 0; local774 < this.anInt2319; local774++) {
			local780 = local15.method4240();
			if (local780 == 1) {
				local766 = (short) (local772 + local10.method4192());
				local768 = (short) (local766 + local10.method4192());
				local770 = (short) (local10.method4192() + local768);
				local772 = local770;
				this.aShortArray43[local774] = local766;
				this.aShortArray53[local774] = local768;
				this.aShortArray45[local774] = local770;
				if (local766 > this.anInt2305) {
					this.anInt2305 = local766;
				}
				if (local768 > this.anInt2305) {
					this.anInt2305 = local768;
				}
				if (this.anInt2305 < local770) {
					this.anInt2305 = local770;
				}
			}
			if (local780 == 2) {
				local768 = local770;
				local770 = (short) (local10.method4192() + local772);
				this.aShortArray43[local774] = local766;
				local772 = local770;
				this.aShortArray53[local774] = local768;
				this.aShortArray45[local774] = local770;
				if (local770 > this.anInt2305) {
					this.anInt2305 = local770;
				}
			}
			if (local780 == 3) {
				local766 = local770;
				local770 = (short) (local772 + local10.method4192());
				local772 = local770;
				this.aShortArray43[local774] = local766;
				this.aShortArray53[local774] = local768;
				this.aShortArray45[local774] = local770;
				if (this.anInt2305 < local770) {
					this.anInt2305 = local770;
				}
			}
			if (local780 == 4) {
				@Pc(937) short local937 = local766;
				local766 = local768;
				local770 = (short) (local772 + local10.method4192());
				local768 = local937;
				this.aShortArray43[local774] = local766;
				local772 = local770;
				this.aShortArray53[local774] = local937;
				this.aShortArray45[local774] = local770;
				if (local770 > this.anInt2305) {
					this.anInt2305 = local770;
				}
			}
		}
		local10.anInt4788 = local299;
		this.anInt2305++;
		local15.anInt4788 = local307;
		local20.anInt4788 = local315;
		local25.anInt4788 = local323;
		local30.anInt4788 = local329;
		local35.anInt4788 = local335;
		@Pc(1020) int local1020;
		for (local780 = 0; local780 < this.anInt2309; local780++) {
			local1020 = this.aByteArray40[local780] & 0xFF;
			if (local1020 == 0) {
				this.aShortArray50[local780] = (short) local10.method4245();
				this.aShortArray47[local780] = (short) local10.method4245();
				this.aShortArray52[local780] = (short) local10.method4245();
			}
			if (local1020 == 1) {
				this.aShortArray50[local780] = (short) local15.method4245();
				this.aShortArray47[local780] = (short) local15.method4245();
				this.aShortArray52[local780] = (short) local15.method4245();
				this.aShortArray51[local780] = (short) local20.method4245();
				this.aShortArray48[local780] = (short) local20.method4245();
				this.aShortArray46[local780] = (short) local20.method4245();
				this.aByteArray35[local780] = local25.method4217();
				this.aByteArray36[local780] = local30.method4217();
				this.aByteArray39[local780] = local35.method4217();
			}
			if (local1020 == 2) {
				this.aShortArray50[local780] = (short) local15.method4245();
				this.aShortArray47[local780] = (short) local15.method4245();
				this.aShortArray52[local780] = (short) local15.method4245();
				this.aShortArray51[local780] = (short) local20.method4245();
				this.aShortArray48[local780] = (short) local20.method4245();
				this.aShortArray46[local780] = (short) local20.method4245();
				this.aByteArray35[local780] = local25.method4217();
				this.aByteArray36[local780] = local30.method4217();
				this.aByteArray39[local780] = local35.method4217();
				this.aByteArray43[local780] = local35.method4217();
				this.aByteArray37[local780] = local35.method4217();
			}
			if (local1020 == 3) {
				this.aShortArray50[local780] = (short) local15.method4245();
				this.aShortArray47[local780] = (short) local15.method4245();
				this.aShortArray52[local780] = (short) local15.method4245();
				this.aShortArray51[local780] = (short) local20.method4245();
				this.aShortArray48[local780] = (short) local20.method4245();
				this.aShortArray46[local780] = (short) local20.method4245();
				this.aByteArray35[local780] = local25.method4217();
				this.aByteArray36[local780] = local30.method4217();
				this.aByteArray39[local780] = local35.method4217();
			}
		}
		if (!local83) {
			return;
		}
		local10.anInt4788 = local142;
		local1020 = local10.method4240();
		@Pc(1315) int local1315;
		@Pc(1321) int local1321;
		if (local1020 > 0) {
			this.aClass191Array1 = new Class191[local1020];
			for (local1315 = 0; local1315 < local1020; local1315++) {
				local1321 = local10.method4245();
				@Pc(1325) int local1325 = local10.method4245();
				@Pc(1331) byte local1331;
				if (local87 == 255) {
					local1331 = this.aByteArray41[local1325];
				} else {
					local1331 = (byte) local87;
				}
				this.aClass191Array1[local1315] = new Class191(local1321, this.aShortArray43[local1325], this.aShortArray53[local1325], this.aShortArray45[local1325], local1331);
			}
		}
		local1315 = local10.method4240();
		if (local1315 <= 0) {
			return;
		}
		this.aClass218Array1 = new Class218[local1315];
		for (local1321 = 0; local1321 < local1315; local1321++) {
			this.aClass218Array1[local1321] = new Class218(local10.method4245(), local10.method4245());
		}
		return;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(SSI)V")
	public void method2214(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray44 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt2319; local11++) {
			if (arg0 == this.aShortArray44[local11]) {
				this.aShortArray44[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)[[I")
	public int[][] method2215() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2305; local17++) {
			@Pc(24) int local24 = this.anIntArray263[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local8[local24]++;
				if (local15 < local24) {
					local15 = local24;
				}
			}
		}
		@Pc(59) int[][] local59 = new int[local15 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local15; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt2305; local84++) {
			@Pc(91) int local91 = this.anIntArray263[local84];
			if (local91 >= 0) {
				local59[local91][local8[local91]++] = local84;
			}
		}
		return local59;
	}
}
