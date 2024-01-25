import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class231 {

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public int anInt6383 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public int anInt6387 = 0;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public int anInt6389 = -1;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt6386 = 0;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt6393 = 0;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public int anInt6396 = -1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt6385 = 0;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public int anInt6392 = -1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public int anInt6395 = 0;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	public int anInt6405 = -1;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public int anInt6403 = 0;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public int anInt6404 = -1;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Z")
	public boolean aBoolean472 = true;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private int anInt6388 = 0;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	public int anInt6399 = -1;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	public int anInt6407 = -1;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	public int anInt6401 = -1;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	public int anInt6402 = -1;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public int anInt6397 = -1;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int anInt6394 = 0;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
	public int anInt6408 = -1;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "[I")
	public int[] anIntArray516 = null;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public int anInt6391 = -1;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public int anInt6398 = 0;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	public int anInt6415 = 0;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public int anInt6410 = -1;

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
	public int anInt6411 = -1;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
	public int anInt6414 = -1;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	public int anInt6406 = -1;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "[I")
	public int[] anIntArray517 = null;

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
	public int anInt6421 = -1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt6390 = -1;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	public int anInt6420 = 0;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public int anInt6417 = 0;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	public int anInt6412 = -1;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public int anInt6416 = -1;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
	public int anInt6419 = -1;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public int anInt6409 = -1;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	public int anInt6422 = -1;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
	public int anInt6423 = -1;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	public int anInt6425 = -1;

	static {
		new Class21("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		new Class21("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	public boolean method5239(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6402 == arg0) {
			return true;
		} else {
			if (this.anIntArray517 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray517.length; local26++) {
					if (this.anIntArray517[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public int method5240() {
		if (this.anInt6402 != -1) {
			return this.anInt6402;
		} else if (this.anIntArray517 == null) {
			return -1;
		} else {
			@Pc(27) int local27 = (int) (Math.random() * (double) this.anInt6388);
			@Pc(29) int local29;
			for (local29 = 0; local27 >= this.anIntArray516[local29]; local29++) {
				local27 -= this.anIntArray516[local29];
			}
			return this.anIntArray517[local29];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method5242(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method5243(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!wn;)V")
	private void method5243(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt6402 = arg1.method4560();
			this.anInt6391 = arg1.method4560();
			if (this.anInt6402 == 65535) {
				this.anInt6402 = -1;
			}
			if (this.anInt6391 == 65535) {
				this.anInt6391 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6422 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt6414 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt6412 = arg1.method4560();
		} else if (arg0 == 5) {
			this.anInt6396 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt6389 = arg1.method4560();
		} else if (arg0 == 7) {
			this.anInt6423 = arg1.method4560();
		} else if (arg0 == 8) {
			this.anInt6404 = arg1.method4560();
		} else if (arg0 == 9) {
			this.anInt6397 = arg1.method4560();
		} else if (arg0 == 26) {
			this.anInt6417 = (short) (arg1.method4614() * 4);
			this.anInt6383 = (short) (arg1.method4614() * 4);
		} else {
			@Pc(351) int local351;
			@Pc(361) int local361;
			if (arg0 == 27) {
				if (this.anIntArrayArray45 == null) {
					this.anIntArrayArray45 = new int[12][];
				}
				local351 = arg1.method4614();
				this.anIntArrayArray45[local351] = new int[6];
				for (local361 = 0; local361 < 6; local361++) {
					this.anIntArrayArray45[local351][local361] = arg1.method4586();
				}
			} else if (arg0 == 28) {
				this.anIntArray515 = new int[12];
				for (local351 = 0; local351 < 12; local351++) {
					this.anIntArray515[local351] = arg1.method4614();
					if (this.anIntArray515[local351] == 255) {
						this.anIntArray515[local351] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6398 = arg1.method4614();
			} else if (arg0 == 30) {
				this.anInt6394 = arg1.method4560();
			} else if (arg0 == 31) {
				this.anInt6415 = arg1.method4614();
			} else if (arg0 == 32) {
				this.anInt6395 = arg1.method4560();
			} else if (arg0 == 33) {
				this.anInt6386 = arg1.method4586();
			} else if (arg0 == 34) {
				this.anInt6385 = arg1.method4614();
			} else if (arg0 == 35) {
				this.anInt6403 = arg1.method4560();
			} else if (arg0 == 36) {
				this.anInt6420 = arg1.method4586();
			} else if (arg0 == 37) {
				this.anInt6406 = arg1.method4614();
			} else if (arg0 == 38) {
				this.anInt6392 = arg1.method4560();
			} else if (arg0 == 39) {
				this.anInt6421 = arg1.method4560();
			} else if (arg0 == 40) {
				this.anInt6407 = arg1.method4560();
			} else if (arg0 == 41) {
				this.anInt6410 = arg1.method4560();
			} else if (arg0 == 42) {
				this.anInt6425 = arg1.method4560();
			} else if (arg0 == 43) {
				this.anInt6405 = arg1.method4560();
			} else if (arg0 == 44) {
				this.anInt6399 = arg1.method4560();
			} else if (arg0 == 45) {
				this.anInt6419 = arg1.method4560();
			} else if (arg0 == 46) {
				this.anInt6390 = arg1.method4560();
			} else if (arg0 == 47) {
				this.anInt6408 = arg1.method4560();
			} else if (arg0 == 48) {
				this.anInt6401 = arg1.method4560();
			} else if (arg0 == 49) {
				this.anInt6416 = arg1.method4560();
			} else if (arg0 == 50) {
				this.anInt6409 = arg1.method4560();
			} else if (arg0 == 51) {
				this.anInt6411 = arg1.method4560();
			} else if (arg0 == 52) {
				local351 = arg1.method4614();
				this.anIntArray517 = new int[local351];
				this.anIntArray516 = new int[local351];
				for (local361 = 0; local361 < local351; local361++) {
					this.anIntArray517[local361] = arg1.method4560();
					@Pc(374) int local374 = arg1.method4614();
					this.anIntArray516[local361] = local374;
					this.anInt6388 += local374;
				}
			} else if (arg0 == 53) {
				this.aBoolean472 = false;
			} else if (arg0 == 54) {
				this.anInt6393 = arg1.method4614() << 6;
				this.anInt6387 = arg1.method4614() << 6;
			}
		}
	}
}
