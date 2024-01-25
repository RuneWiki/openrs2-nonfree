import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Lclient!ss;")
	private Class238 aClass238_2;

	@OriginalMember(owner = "client!fq", name = "H", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
	private int anInt2453 = 0;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!hl;")
	private final Class96 aClass96_13 = new Class96(16);

	@OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
	private int anInt2456 = 0;

	@OriginalMember(owner = "client!fq", name = "E", descriptor = "Lclient!gw;")
	private final Class91 aClass91_13 = new Class91();

	@OriginalMember(owner = "client!fq", name = "J", descriptor = "J")
	private long aLong77 = 0L;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	private final int anInt2442;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "Lclient!wf;")
	private final Class269 aClass269_1;

	@OriginalMember(owner = "client!fq", name = "C", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!fq", name = "I", descriptor = "Lclient!gw;")
	private Class91 aClass91_14;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	private final int anInt2444;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	private final int anInt2445;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "Lclient!um;")
	private final Class256 aClass256_1;

	@OriginalMember(owner = "client!fq", name = "B", descriptor = "Lclient!wf;")
	private final Class269 aClass269_2;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!oi;")
	private final Class184 aClass184_1;

	@OriginalMember(owner = "client!fq", name = "K", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "Lclient!wl;")
	private Class4_Sub1_Sub13 aClass4_Sub1_Sub13_1;

	static {
		new Class21("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class21("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILclient!wf;Lclient!wf;Lclient!oi;Lclient!um;IIZ)V")
	public Class79_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class269 arg2, @OriginalArg(3) Class184 arg3, @OriginalArg(4) Class256 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2442 = arg0;
		this.aClass269_1 = arg1;
		if (this.aClass269_1 == null) {
			this.aBoolean167 = false;
		} else {
			this.aBoolean167 = true;
			this.aClass91_14 = new Class91();
		}
		this.anInt2444 = arg6;
		this.anInt2445 = arg5;
		this.aClass256_1 = arg4;
		this.aClass269_2 = arg2;
		this.aClass184_1 = arg3;
		this.aBoolean170 = arg7;
		if (this.aClass269_2 != null) {
			this.aClass4_Sub1_Sub13_1 = this.aClass256_1.method5849(this.anInt2442, this.aClass269_2);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)Lclient!wl;")
	private Class4_Sub1_Sub13 method2226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class4_Sub1_Sub13 local22 = (Class4_Sub1_Sub13) this.aClass96_13.method2797((long) arg0);
		if (local22 != null && arg1 == 0 && !local22.aBoolean543 && local22.aBoolean542) {
			local22.method6330();
			local22 = null;
		}
		if (local22 == null) {
			if (arg1 == 0) {
				if (this.aClass269_1 == null || this.aByteArray27[arg0] == -1) {
					if (this.aClass184_1.method4434()) {
						return null;
					}
					local22 = this.aClass184_1.method4438((byte) 2, true, this.anInt2442, arg0);
				} else {
					local22 = this.aClass256_1.method5849(arg0, this.aClass269_1);
				}
			} else if (arg1 == 1) {
				if (this.aClass269_1 == null) {
					throw new RuntimeException();
				}
				local22 = this.aClass256_1.method5853(this.aClass269_1, arg0);
			} else if (arg1 == 2) {
				if (this.aClass269_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray27[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass184_1.method4440()) {
					return null;
				}
				local22 = this.aClass184_1.method4438((byte) 2, false, this.anInt2442, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass96_13.method2805((long) arg0, local22);
		}
		if (local22.aBoolean542) {
			return null;
		}
		@Pc(165) byte[] local165 = local22.method5988();
		@Pc(192) int local192;
		@Pc(298) Class4_Sub1_Sub13_Sub1 local298;
		if (!(local22 instanceof Class4_Sub1_Sub13_Sub2)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static30.aCRC32_1.reset();
				Static30.aCRC32_1.update(local165, 0, local165.length - 2);
				local192 = (int) Static30.aCRC32_1.getValue();
				if (local192 != this.aClass238_2.anIntArray537[arg0]) {
					throw new RuntimeException();
				}
				this.aClass184_1.anInt5314 = 0;
				this.aClass184_1.anInt5313 = 0;
			} catch (@Pc(358) RuntimeException local358) {
				this.aClass184_1.method4430();
				local22.method6330();
				if (local22.aBoolean543 && !this.aClass184_1.method4434()) {
					local298 = this.aClass184_1.method4438((byte) 2, true, this.anInt2442, arg0);
					this.aClass96_13.method2805((long) arg0, local298);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass238_2.anIntArray534[arg0] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass238_2.anIntArray534[arg0];
			if (this.aClass269_1 != null) {
				this.aClass256_1.method5854(this.aClass269_1, arg0, local165);
				if (this.aByteArray27[arg0] != 1) {
					this.anInt2453++;
					this.aByteArray27[arg0] = 1;
				}
			}
			if (!local22.aBoolean543) {
				local22.method6330();
			}
			return local22;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static30.aCRC32_1.reset();
			Static30.aCRC32_1.update(local165, 0, local165.length - 2);
			local192 = (int) Static30.aCRC32_1.getValue();
			if (this.aClass238_2.anIntArray537[arg0] != local192) {
				throw new RuntimeException();
			}
			@Pc(227) int local227 = (local165[local165.length - 1] & 0xFF) + ((local165[local165.length - 2] & 0xFF) << 8);
			if (local227 != (this.aClass238_2.anIntArray534[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray27[arg0] != 1) {
				this.anInt2453++;
				this.aByteArray27[arg0] = 1;
			}
			if (!local22.aBoolean543) {
				local22.method6330();
			}
			return local22;
		} catch (@Pc(272) Exception local272) {
			this.aByteArray27[arg0] = -1;
			local22.method6330();
			if (local22.aBoolean543 && !this.aClass184_1.method4434()) {
				local298 = this.aClass184_1.method4438((byte) 2, true, this.anInt2442, arg0);
				this.aClass96_13.method2805((long) arg0, local298);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lclient!ss;")
	@Override
	public Class238 method2220() {
		if (this.aClass238_2 != null) {
			return this.aClass238_2;
		}
		if (this.aClass4_Sub1_Sub13_1 == null) {
			if (this.aClass184_1.method4434()) {
				return null;
			}
			this.aClass4_Sub1_Sub13_1 = this.aClass184_1.method4438((byte) 0, true, 255, this.anInt2442);
		}
		if (this.aClass4_Sub1_Sub13_1.aBoolean542) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub1_Sub13_1.method5988();
		if (this.aClass4_Sub1_Sub13_1 instanceof Class4_Sub1_Sub13_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass238_2 = new Class238(local43, this.anInt2445);
				if (this.aClass238_2.anInt6694 != this.anInt2444) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass238_2 = null;
				if (this.aClass184_1.method4434()) {
					this.aClass4_Sub1_Sub13_1 = null;
				} else {
					this.aClass4_Sub1_Sub13_1 = this.aClass184_1.method4438((byte) 0, true, 255, this.anInt2442);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass238_2 = new Class238(local43, this.anInt2445);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass184_1.method4430();
				this.aClass238_2 = null;
				if (this.aClass184_1.method4434()) {
					this.aClass4_Sub1_Sub13_1 = null;
				} else {
					this.aClass4_Sub1_Sub13_1 = this.aClass184_1.method4438((byte) 0, true, 255, this.anInt2442);
				}
				return null;
			}
			if (this.aClass269_2 != null) {
				this.aClass256_1.method5854(this.aClass269_2, this.anInt2442, local43);
			}
		}
		if (this.aClass269_1 != null) {
			this.aByteArray27 = new byte[this.aClass238_2.anInt6698];
			this.anInt2453 = 0;
		}
		this.aClass4_Sub1_Sub13_1 = null;
		return this.aClass238_2;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
	public int method2227() {
		return this.anInt2453;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method2221(@OriginalArg(1) int arg0) {
		if (this.aClass269_1 == null) {
			return;
		}
		for (@Pc(14) Class4 local14 = this.aClass91_13.method2584(); local14 != null; local14 = this.aClass91_13.method2586()) {
			if (local14.aLong228 == (long) arg0) {
				return;
			}
		}
		@Pc(34) Class4 local34 = new Class4();
		local34.aLong228 = arg0;
		this.aClass91_13.method2587(local34);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public void method2228() {
		if (this.aClass91_14 == null || this.method2220() == null) {
			return;
		}
		for (@Pc(21) Class4 local21 = this.aClass91_13.method2584(); local21 != null; local21 = this.aClass91_13.method2586()) {
			@Pc(34) int local34 = (int) local21.aLong228;
			if (local34 < 0 || this.aClass238_2.anInt6698 <= local34 || this.aClass238_2.anIntArray533[local34] == 0) {
				local21.method6330();
			} else {
				if (this.aByteArray27[local34] == 0) {
					this.method2226(local34, 1);
				}
				if (this.aByteArray27[local34] == -1) {
					this.method2226(local34, 2);
				}
				if (this.aByteArray27[local34] == 1) {
					local21.method6330();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
	public void method2229() {
		if (this.aClass91_14 != null) {
			if (this.method2220() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class4 local31;
			@Pc(37) int local37;
			@Pc(126) Class4 local126;
			if (this.aBoolean167) {
				local26 = true;
				for (local31 = this.aClass91_14.method2584(); local31 != null; local31 = this.aClass91_14.method2586()) {
					local37 = (int) local31.aLong228;
					if (this.aByteArray27[local37] == 0) {
						this.method2226(local37, 1);
					}
					if (this.aByteArray27[local37] == 0) {
						local26 = false;
					} else {
						local31.method6330();
					}
				}
				while (this.aClass238_2.anIntArray533.length > this.anInt2456) {
					if (this.aClass238_2.anIntArray533[this.anInt2456] == 0) {
						this.anInt2456++;
					} else {
						if (this.aClass256_1.anInt7282 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray27[this.anInt2456] == 0) {
							this.method2226(this.anInt2456, 1);
						}
						if (this.aByteArray27[this.anInt2456] == 0) {
							local126 = new Class4();
							local126.aLong228 = this.anInt2456;
							local26 = false;
							this.aClass91_14.method2587(local126);
						}
						this.anInt2456++;
					}
				}
				if (local26) {
					this.aBoolean167 = false;
					this.anInt2456 = 0;
				}
			} else if (this.aBoolean169) {
				local26 = true;
				for (local31 = this.aClass91_14.method2584(); local31 != null; local31 = this.aClass91_14.method2586()) {
					local37 = (int) local31.aLong228;
					if (this.aByteArray27[local37] != 1) {
						this.method2226(local37, 2);
					}
					if (this.aByteArray27[local37] == 1) {
						local31.method6330();
					} else {
						local26 = false;
					}
				}
				while (this.aClass238_2.anIntArray533.length > this.anInt2456) {
					if (this.aClass238_2.anIntArray533[this.anInt2456] == 0) {
						this.anInt2456++;
					} else {
						if (this.aClass184_1.method4440()) {
							local26 = false;
							break;
						}
						if (this.aByteArray27[this.anInt2456] != 1) {
							this.method2226(this.anInt2456, 2);
						}
						if (this.aByteArray27[this.anInt2456] != 1) {
							local126 = new Class4();
							local126.aLong228 = this.anInt2456;
							this.aClass91_14.method2587(local126);
							local26 = false;
						}
						this.anInt2456++;
					}
				}
				if (local26) {
					this.anInt2456 = 0;
					this.aBoolean169 = false;
				}
			} else {
				this.aClass91_14 = null;
			}
		}
		if (!this.aBoolean170 || this.aLong77 > Static167.method2929()) {
			return;
		}
		for (@Pc(326) Class4_Sub1_Sub13 local326 = (Class4_Sub1_Sub13) this.aClass96_13.method2798(); local326 != null; local326 = (Class4_Sub1_Sub13) this.aClass96_13.method2796()) {
			if (!local326.aBoolean542) {
				if (local326.aBoolean544) {
					if (!local326.aBoolean543) {
						throw new RuntimeException();
					}
					local326.method6330();
				} else {
					local326.aBoolean544 = true;
				}
			}
		}
		this.aLong77 = Static167.method2929() + 1000L;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2222(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub1_Sub13 local9 = this.method2226(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5988();
			local9.method6330();
			return local17;
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)I")
	public int method2230() {
		return this.aClass238_2 == null ? 0 : this.aClass238_2.anInt6692;
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)I")
	public int method2231() {
		if (this.method2220() == null) {
			return this.aClass4_Sub1_Sub13_1 == null ? 0 : this.aClass4_Sub1_Sub13_1.method5989();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)I")
	public int method2232() {
		if (this.aClass238_2 == null) {
			return 0;
		} else if (this.aBoolean167) {
			@Pc(26) Class4 local26 = this.aClass91_14.method2584();
			return local26 == null ? 0 : (int) local26.aLong228;
		} else {
			return this.aClass238_2.anInt6692;
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)I")
	@Override
	public int method2224(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub1_Sub13 local11 = (Class4_Sub1_Sub13) this.aClass96_13.method2797((long) arg0);
		return local11 == null ? 0 : local11.method5989();
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
	public void method2233() {
		if (this.aClass269_1 != null) {
			this.aBoolean169 = true;
			if (this.aClass91_14 == null) {
				this.aClass91_14 = new Class91();
			}
		}
	}
}
