import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class83 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	public int anInt2314;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private int anInt2319;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	private int anInt2322;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Lclient!ub;")
	private Class240 aClass240_9;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "Lclient!nt;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	private int anInt2318 = -1;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public int anInt2308 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2305 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	public int anInt2312 = 0;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public int anInt2313 = -1;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public int anInt2310 = -1;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	public int anInt2333 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public int anInt2320 = -1;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
	private int anInt2334 = -1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	private int anInt2304 = -1;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
	private int anInt2336 = -1;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Z")
	public boolean aBoolean198 = true;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	private int anInt2316 = -1;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	public int anInt2317 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "Z")
	public boolean aBoolean199 = true;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
	public int anInt2339 = -1;

	static {
		new Class256("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class256("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!md;I)V")
	public void method1700(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method1704(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!qa;Z)Lclient!f;")
	public Class76 method1701(@OriginalArg(1) Class26 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt2320 : this.anInt2339;
		@Pc(23) int local23 = arg0.anInt2873 << 29 | local11;
		@Pc(32) Class76 local32 = (Class76) this.aClass173_1.aClass129_46.method3023((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass173_1.aClass188_75.method4296(local11)) {
			@Pc(52) Class89 local52 = Static456.method1764(this.aClass173_1.aClass188_75, local11, 0);
			if (local52 != null) {
				local32 = arg0.method2230(local52);
				this.aClass173_1.aClass129_46.method3029(local32, (long) local23);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1703(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass240_9 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) this.aClass240_9.method5439((long) arg0);
			return local16 == null ? arg1 : local16.aString43;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!md;BI)V")
	private void method1704(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2339 = arg0.method3711();
		} else if (arg1 == 2) {
			this.anInt2320 = arg0.method3711();
		} else if (arg1 == 3) {
			this.aString18 = arg0.method3717();
		} else if (arg1 == 4) {
			this.anInt2335 = arg0.method3748();
		} else if (arg1 == 5) {
			this.anInt2310 = arg0.method3748();
		} else if (arg1 == 6) {
			this.anInt2312 = arg0.method3737();
			return;
		} else {
			@Pc(201) int local201;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean199 = arg0.method3737() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt2336 = arg0.method3711();
					if (this.anInt2336 == 65535) {
						this.anInt2336 = -1;
					}
					this.anInt2334 = arg0.method3711();
					if (this.anInt2334 == 65535) {
						this.anInt2334 = -1;
					}
					this.anInt2322 = arg0.method3731();
					this.anInt2307 = arg0.method3731();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray12[arg1 - 10] = arg0.method3717();
					return;
				}
				@Pc(208) int local208;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean198 = false;
						return;
					}
					if (arg1 != 17) {
						if (arg1 != 18) {
							if (arg1 == 19) {
								this.anInt2313 = arg0.method3711();
								return;
							}
							if (arg1 == 20) {
								this.anInt2304 = arg0.method3711();
								if (this.anInt2304 == 65535) {
									this.anInt2304 = -1;
								}
								this.anInt2318 = arg0.method3711();
								if (this.anInt2318 == 65535) {
									this.anInt2318 = -1;
								}
								this.anInt2323 = arg0.method3731();
								this.anInt2319 = arg0.method3731();
								return;
							}
							if (arg1 == 21) {
								this.anInt2314 = arg0.method3731();
							} else if (arg1 == 22) {
								this.anInt2331 = arg0.method3731();
								return;
							} else if (arg1 == 249) {
								local201 = arg0.method3737();
								if (this.aClass240_9 == null) {
									local208 = Static316.method4530(local201);
									this.aClass240_9 = new Class240(local208);
								}
								for (local208 = 0; local208 < local201; local208++) {
									@Pc(229) boolean local229 = arg0.method3737() == 1;
									@Pc(233) int local233 = arg0.method3748();
									@Pc(242) Class2 local242;
									if (local229) {
										local242 = new Class2_Sub31(arg0.method3717());
									} else {
										local242 = new Class2_Sub16(arg0.method3731());
									}
									this.aClass240_9.method5430((long) local233, local242);
								}
								return;
							}
							return;
						}
						this.anInt2316 = arg0.method3711();
						return;
					}
					this.aString19 = arg0.method3717();
					return;
				}
				local201 = arg0.method3737();
				this.anIntArray133 = new int[local201 * 2];
				for (local208 = 0; local208 < local201 * 2; local208++) {
					this.anIntArray133[local208] = arg0.method3701();
				}
				this.anInt2332 = arg0.method3731();
				this.anInt2309 = arg0.method3731();
				return;
			}
			local201 = arg0.method3737();
			if ((local201 & 0x2) == 2) {
				this.aBoolean196 = true;
			}
			if ((local201 & 0x1) == 0) {
				this.aBoolean197 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)I")
	public int method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_9 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub16 local16 = (Class2_Sub16) this.aClass240_9.method5439((long) arg0);
			return local16 == null ? arg1 : local16.anInt2428;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public void method1707() {
		if (this.anIntArray133 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray133.length; local10 += 2) {
			if (this.anInt2305 > this.anIntArray133[local10]) {
				this.anInt2305 = this.anIntArray133[local10];
			} else if (this.anIntArray133[local10] > this.anInt2333) {
				this.anInt2333 = this.anIntArray133[local10];
			}
			if (this.anIntArray133[local10 + 1] < this.anInt2308) {
				this.anInt2308 = this.anIntArray133[local10 + 1];
			} else if (this.anInt2317 < this.anIntArray133[local10 + 1]) {
				this.anInt2317 = this.anIntArray133[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!rd;)Z")
	public boolean method1708(@OriginalArg(1) Interface11 arg0) {
		@Pc(22) int local22;
		if (this.anInt2334 == -1) {
			if (this.anInt2336 == -1) {
				return true;
			}
			local22 = arg0.method5146(this.anInt2336);
		} else {
			local22 = arg0.method5145(this.anInt2334);
		}
		if (this.anInt2322 > local22 || local22 > this.anInt2307) {
			return false;
		}
		@Pc(65) int local65;
		if (this.anInt2318 == -1) {
			if (this.anInt2304 == -1) {
				return true;
			}
			local65 = arg0.method5146(this.anInt2304);
		} else {
			local65 = arg0.method5145(this.anInt2318);
		}
		return local65 >= this.anInt2323 && this.anInt2319 >= local65;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!qa;I)Lclient!f;")
	public Class76 method1709(@OriginalArg(0) Class26 arg0) {
		@Pc(20) Class76 local20 = (Class76) this.aClass173_1.aClass129_46.method3023((long) (arg0.anInt2873 << 29 | this.anInt2316 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass173_1.aClass188_75.method4296(this.anInt2316);
		@Pc(40) Class89 local40 = Static456.method1764(this.aClass173_1.aClass188_75, this.anInt2316, 0);
		if (local40 != null) {
			local20 = arg0.method2230(local40);
			this.aClass173_1.aClass129_46.method3029(local20, (long) (arg0.anInt2873 << 29 | this.anInt2316 | 0x20000));
		}
		return local20;
	}
}
