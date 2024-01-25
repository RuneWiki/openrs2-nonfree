import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "Lclient!jp;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!go", name = "F", descriptor = "I")
	private int anInt2055 = 0;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "Lclient!tn;")
	private final Class190 aClass190_9 = new Class190(16);

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	private int anInt2064 = 0;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "Lclient!jm;")
	private final Class103 aClass103_51 = new Class103();

	@OriginalMember(owner = "client!go", name = "X", descriptor = "J")
	private long aLong69 = 0L;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	private final int anInt2043;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!nf;")
	private final Class140 aClass140_1;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!go", name = "W", descriptor = "Lclient!jm;")
	private Class103 aClass103_52;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "Lclient!pn;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!go", name = "B", descriptor = "I")
	private final int anInt2053;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "Lclient!ee;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "I")
	private final int anInt2062;

	@OriginalMember(owner = "client!go", name = "Y", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Lclient!nf;")
	private final Class140 aClass140_2;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!ec;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_1;

	static {
		new Class85("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
		new Class85("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(ILclient!nf;Lclient!nf;Lclient!pn;Lclient!ee;IIZ)V")
	public Class82_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) Class56 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2043 = arg0;
		this.aClass140_1 = arg1;
		if (this.aClass140_1 == null) {
			this.aBoolean150 = false;
		} else {
			this.aBoolean150 = true;
			this.aClass103_52 = new Class103();
		}
		this.aClass162_1 = arg3;
		this.anInt2053 = arg6;
		this.aClass56_1 = arg4;
		this.anInt2062 = arg5;
		this.aBoolean152 = arg7;
		this.aClass140_2 = arg2;
		if (this.aClass140_2 != null) {
			this.aClass5_Sub1_Sub4_1 = this.aClass56_1.method1306(this.aClass140_2, this.anInt2043);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZII)Lclient!ec;")
	private Class5_Sub1_Sub4 method1930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub1_Sub4 local13 = (Class5_Sub1_Sub4) this.aClass190_9.method5466((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean468 && local13.aBoolean467) {
			local13.method6005();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass140_1 == null || this.aByteArray21[arg0] == -1) {
					if (this.aClass162_1.method4445()) {
						return null;
					}
					local13 = this.aClass162_1.method4453((byte) 2, true, arg0, this.anInt2043);
				} else {
					local13 = this.aClass56_1.method1306(this.aClass140_1, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass140_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass56_1.method1302(this.aClass140_1, arg0);
			} else if (arg1 == 2) {
				if (this.aClass140_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray21[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass162_1.method4439()) {
					return null;
				}
				local13 = this.aClass162_1.method4453((byte) 2, false, arg0, this.anInt2043);
			} else {
				throw new RuntimeException();
			}
			this.aClass190_9.method5464(local13, (long) arg0);
		}
		if (local13.aBoolean467) {
			return null;
		}
		@Pc(169) byte[] local169 = local13.method5000();
		@Pc(196) int local196;
		@Pc(298) Class5_Sub1_Sub4_Sub1 local298;
		if (!(local13 instanceof Class5_Sub1_Sub4_Sub2)) {
			try {
				if (local169 == null || local169.length <= 2) {
					throw new RuntimeException();
				}
				Static79.aCRC32_1.reset();
				Static79.aCRC32_1.update(local169, 0, local169.length - 2);
				local196 = (int) Static79.aCRC32_1.getValue();
				if (local196 != this.aClass105_1.anIntArray306[arg0]) {
					throw new RuntimeException();
				}
				this.aClass162_1.anInt4988 = 0;
				this.aClass162_1.anInt4989 = 0;
			} catch (@Pc(356) RuntimeException local356) {
				this.aClass162_1.method4442();
				local13.method6005();
				if (local13.aBoolean468 && !this.aClass162_1.method4445()) {
					local298 = this.aClass162_1.method4453((byte) 2, true, arg0, this.anInt2043);
					this.aClass190_9.method5464(local298, (long) arg0);
				}
				return null;
			}
			local169[local169.length - 2] = (byte) (this.aClass105_1.anIntArray307[arg0] >>> 8);
			local169[local169.length - 1] = (byte) this.aClass105_1.anIntArray307[arg0];
			if (this.aClass140_1 != null) {
				this.aClass56_1.method1311(this.aClass140_1, local169, arg0);
				if (this.aByteArray21[arg0] != 1) {
					this.anInt2055++;
					this.aByteArray21[arg0] = 1;
				}
			}
			if (!local13.aBoolean468) {
				local13.method6005();
			}
			return local13;
		}
		try {
			if (local169 == null || local169.length <= 2) {
				throw new RuntimeException();
			}
			Static79.aCRC32_1.reset();
			Static79.aCRC32_1.update(local169, 0, local169.length - 2);
			local196 = (int) Static79.aCRC32_1.getValue();
			if (local196 != this.aClass105_1.anIntArray306[arg0]) {
				throw new RuntimeException();
			}
			@Pc(231) int local231 = ((local169[local169.length - 2] & 0xFF) << 8) + (local169[local169.length - 1] & 0xFF);
			if (local231 != (this.aClass105_1.anIntArray307[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray21[arg0] != 1) {
				this.anInt2055++;
				this.aByteArray21[arg0] = 1;
			}
			if (!local13.aBoolean468) {
				local13.method6005();
			}
			return local13;
		} catch (@Pc(272) Exception local272) {
			this.aByteArray21[arg0] = -1;
			local13.method6005();
			if (local13.aBoolean468 && !this.aClass162_1.method4445()) {
				local298 = this.aClass162_1.method4453((byte) 2, true, arg0, this.anInt2043);
				this.aClass190_9.method5464(local298, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I")
	public int method1931() {
		if (this.aClass105_1 == null) {
			return 0;
		} else if (this.aBoolean150) {
			@Pc(26) Class5 local26 = this.aClass103_52.method2756();
			return local26 == null ? 0 : (int) local26.aLong235;
		} else {
			return this.aClass105_1.anInt3038;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public void method1932() {
		if (this.aClass140_1 != null) {
			this.aBoolean151 = true;
			if (this.aClass103_52 == null) {
				this.aClass103_52 = new Class103();
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(BI)[B")
	@Override
	public byte[] method1926(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub1_Sub4 local9 = this.method1930(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method5000();
			local9.method6005();
			return local25;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)I")
	public int method1933() {
		if (this.method1923() == null) {
			return this.aClass5_Sub1_Sub4_1 == null ? 0 : this.aClass5_Sub1_Sub4_1.method4997();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(II)V")
	@Override
	public void method1928(@OriginalArg(1) int arg0) {
		if (this.aClass140_1 == null) {
			return;
		}
		for (@Pc(14) Class5 local14 = this.aClass103_51.method2756(); local14 != null; local14 = this.aClass103_51.method2748()) {
			if ((long) arg0 == local14.aLong235) {
				return;
			}
		}
		@Pc(39) Class5 local39 = new Class5();
		local39.aLong235 = arg0;
		this.aClass103_51.method2745(local39);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I")
	public int method1934() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.anInt3038;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	@Override
	public int method1920(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub1_Sub4 local16 = (Class5_Sub1_Sub4) this.aClass190_9.method5466((long) arg0);
		return local16 == null ? 0 : local16.method4997();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lclient!jp;")
	@Override
	public Class105 method1923() {
		if (this.aClass105_1 != null) {
			return this.aClass105_1;
		}
		if (this.aClass5_Sub1_Sub4_1 == null) {
			if (this.aClass162_1.method4445()) {
				return null;
			}
			this.aClass5_Sub1_Sub4_1 = this.aClass162_1.method4453((byte) 0, true, this.anInt2043, 255);
		}
		if (this.aClass5_Sub1_Sub4_1.aBoolean467) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass5_Sub1_Sub4_1.method5000();
		if (this.aClass5_Sub1_Sub4_1 instanceof Class5_Sub1_Sub4_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass105_1 = new Class105(local43, this.anInt2062);
				if (this.aClass105_1.anInt3034 != this.anInt2053) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass105_1 = null;
				if (this.aClass162_1.method4445()) {
					this.aClass5_Sub1_Sub4_1 = null;
				} else {
					this.aClass5_Sub1_Sub4_1 = this.aClass162_1.method4453((byte) 0, true, this.anInt2043, 255);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass105_1 = new Class105(local43, this.anInt2062);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass162_1.method4442();
				this.aClass105_1 = null;
				if (this.aClass162_1.method4445()) {
					this.aClass5_Sub1_Sub4_1 = null;
				} else {
					this.aClass5_Sub1_Sub4_1 = this.aClass162_1.method4453((byte) 0, true, this.anInt2043, 255);
				}
				return null;
			}
			if (this.aClass140_2 != null) {
				this.aClass56_1.method1311(this.aClass140_2, local43, this.anInt2043);
			}
		}
		if (this.aClass140_1 != null) {
			this.anInt2055 = 0;
			this.aByteArray21 = new byte[this.aClass105_1.anInt3033];
		}
		this.aClass5_Sub1_Sub4_1 = null;
		return this.aClass105_1;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)I")
	public int method1937() {
		return this.anInt2055;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
	public void method1939() {
		if (this.aClass103_52 == null || this.method1923() == null) {
			return;
		}
		for (@Pc(26) Class5 local26 = this.aClass103_51.method2756(); local26 != null; local26 = this.aClass103_51.method2748()) {
			@Pc(32) int local32 = (int) local26.aLong235;
			if (local32 < 0 || this.aClass105_1.anInt3033 <= local32 || this.aClass105_1.anIntArray302[local32] == 0) {
				local26.method6005();
			} else {
				if (this.aByteArray21[local32] == 0) {
					this.method1930(local32, 1);
				}
				if (this.aByteArray21[local32] == -1) {
					this.method1930(local32, 2);
				}
				if (this.aByteArray21[local32] == 1) {
					local26.method6005();
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
	public void method1940() {
		if (this.aClass103_52 != null) {
			if (this.method1923() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class5 local23;
			@Pc(29) int local29;
			@Pc(114) Class5 local114;
			if (this.aBoolean150) {
				local18 = true;
				for (local23 = this.aClass103_52.method2756(); local23 != null; local23 = this.aClass103_52.method2748()) {
					local29 = (int) local23.aLong235;
					if (this.aByteArray21[local29] == 0) {
						this.method1930(local29, 1);
					}
					if (this.aByteArray21[local29] == 0) {
						local18 = false;
					} else {
						local23.method6005();
					}
				}
				while (this.anInt2064 < this.aClass105_1.anIntArray302.length) {
					if (this.aClass105_1.anIntArray302[this.anInt2064] == 0) {
						this.anInt2064++;
					} else {
						if (this.aClass56_1.anInt1357 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray21[this.anInt2064] == 0) {
							this.method1930(this.anInt2064, 1);
						}
						if (this.aByteArray21[this.anInt2064] == 0) {
							local114 = new Class5();
							local114.aLong235 = this.anInt2064;
							this.aClass103_52.method2745(local114);
							local18 = false;
						}
						this.anInt2064++;
					}
				}
				if (local18) {
					this.anInt2064 = 0;
					this.aBoolean150 = false;
				}
			} else if (this.aBoolean151) {
				local18 = true;
				for (local23 = this.aClass103_52.method2756(); local23 != null; local23 = this.aClass103_52.method2748()) {
					local29 = (int) local23.aLong235;
					if (this.aByteArray21[local29] != 1) {
						this.method1930(local29, 2);
					}
					if (this.aByteArray21[local29] == 1) {
						local23.method6005();
					} else {
						local18 = false;
					}
				}
				while (this.aClass105_1.anIntArray302.length > this.anInt2064) {
					if (this.aClass105_1.anIntArray302[this.anInt2064] == 0) {
						this.anInt2064++;
					} else {
						if (this.aClass162_1.method4439()) {
							local18 = false;
							break;
						}
						if (this.aByteArray21[this.anInt2064] != 1) {
							this.method1930(this.anInt2064, 2);
						}
						if (this.aByteArray21[this.anInt2064] != 1) {
							local114 = new Class5();
							local114.aLong235 = this.anInt2064;
							this.aClass103_52.method2745(local114);
							local18 = false;
						}
						this.anInt2064++;
					}
				}
				if (local18) {
					this.anInt2064 = 0;
					this.aBoolean151 = false;
				}
			} else {
				this.aClass103_52 = null;
			}
		}
		if (!this.aBoolean152 || this.aLong69 > Static340.method5863()) {
			return;
		}
		for (@Pc(318) Class5_Sub1_Sub4 local318 = (Class5_Sub1_Sub4) this.aClass190_9.method5471(); local318 != null; local318 = (Class5_Sub1_Sub4) this.aClass190_9.method5465()) {
			if (!local318.aBoolean467) {
				if (local318.aBoolean466) {
					if (!local318.aBoolean468) {
						throw new RuntimeException();
					}
					local318.method6005();
				} else {
					local318.aBoolean466 = true;
				}
			}
		}
		this.aLong69 = Static340.method5863() + 1000L;
	}
}
