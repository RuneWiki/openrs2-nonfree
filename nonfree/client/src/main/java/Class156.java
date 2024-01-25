import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class156 {

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	public int anInt4438 = -1;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	public int anInt4436 = 0;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	public int anInt4437 = -1;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public int anInt4442 = 0;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
	public int[] anIntArray373 = null;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	public int anInt4433 = -1;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public int anInt4446 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Z")
	public boolean aBoolean324 = true;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
	public int anInt4445 = -1;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public int anInt4447 = 0;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public int anInt4441 = -1;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	public int anInt4452 = -1;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	public int anInt4434 = -1;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
	public int anInt4454 = -1;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	public int anInt4440 = -1;

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
	public int anInt4457 = -1;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	public int anInt4450 = -1;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt4444 = 0;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	public int anInt4451 = 0;

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "I")
	public int anInt4464 = -1;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
	public int anInt4449 = -1;

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
	public int anInt4453 = -1;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public int anInt4443 = -1;

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
	public int anInt4459 = -1;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	public int anInt4448 = 0;

	@OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
	public int anInt4465 = 0;

	@OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
	public int anInt4467 = 0;

	@OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
	public int anInt4460 = -1;

	@OriginalMember(owner = "client!ls", name = "U", descriptor = "I")
	public int anInt4469 = -1;

	@OriginalMember(owner = "client!ls", name = "W", descriptor = "I")
	public int anInt4470 = -1;

	@OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
	public int anInt4462 = 0;

	@OriginalMember(owner = "client!ls", name = "T", descriptor = "I")
	public int anInt4468 = -1;

	@OriginalMember(owner = "client!ls", name = "V", descriptor = "[I")
	public int[] anIntArray375 = null;

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
	public int anInt4458 = -1;

	@OriginalMember(owner = "client!ls", name = "X", descriptor = "I")
	private int anInt4471 = 0;

	@OriginalMember(owner = "client!ls", name = "Y", descriptor = "I")
	public int anInt4472 = 0;

	@OriginalMember(owner = "client!ls", name = "N", descriptor = "I")
	public int anInt4463 = 0;

	@OriginalMember(owner = "client!ls", name = "Z", descriptor = "I")
	public int anInt4473 = -1;

	@OriginalMember(owner = "client!ls", name = "R", descriptor = "I")
	public int anInt4466 = -1;

	@OriginalMember(owner = "client!ls", name = "ab", descriptor = "I")
	public int anInt4474 = -1;

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
	public int anInt4456 = -1;

	static {
		new Class209("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!si;B)V")
	public void method3598(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5495();
			if (local5 == 0) {
				return;
			}
			this.method3604(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Z")
	public boolean method3602(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4450) {
			return true;
		} else {
			if (this.anIntArray375 != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anIntArray375.length; local23++) {
					if (arg0 == this.anIntArray375[local23]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	public int method3603() {
		if (this.anInt4450 != -1) {
			return this.anInt4450;
		} else if (this.anIntArray375 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt4471);
			@Pc(33) int local33;
			for (local33 = 0; local31 >= this.anIntArray373[local33]; local33++) {
				local31 -= this.anIntArray373[local33];
			}
			return this.anIntArray375[local33];
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBLclient!si;)V")
	private void method3604(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt4450 = arg1.method5500();
			this.anInt4458 = arg1.method5500();
			if (this.anInt4458 == 65535) {
				this.anInt4458 = -1;
			}
			if (this.anInt4450 == 65535) {
				this.anInt4450 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4454 = arg1.method5500();
		} else if (arg0 == 3) {
			this.anInt4452 = arg1.method5500();
		} else if (arg0 == 4) {
			this.anInt4470 = arg1.method5500();
		} else if (arg0 == 5) {
			this.anInt4449 = arg1.method5500();
		} else if (arg0 == 6) {
			this.anInt4438 = arg1.method5500();
		} else if (arg0 == 7) {
			this.anInt4469 = arg1.method5500();
		} else if (arg0 == 8) {
			this.anInt4433 = arg1.method5500();
		} else if (arg0 == 9) {
			this.anInt4441 = arg1.method5500();
		} else if (arg0 == 26) {
			this.anInt4463 = (short) (arg1.method5495() * 4);
			this.anInt4442 = (short) (arg1.method5495() * 4);
		} else {
			@Pc(147) int local147;
			@Pc(155) int local155;
			if (arg0 == 27) {
				if (this.anIntArrayArray43 == null) {
					this.anIntArrayArray43 = new int[12][];
				}
				local147 = arg1.method5495();
				this.anIntArrayArray43[local147] = new int[6];
				for (local155 = 0; local155 < 6; local155++) {
					this.anIntArrayArray43[local147][local155] = arg1.method5458();
				}
			} else if (arg0 == 28) {
				this.anIntArray374 = new int[12];
				for (local147 = 0; local147 < 12; local147++) {
					this.anIntArray374[local147] = arg1.method5495();
					if (this.anIntArray374[local147] == 255) {
						this.anIntArray374[local147] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt4465 = arg1.method5495();
			} else if (arg0 == 30) {
				this.anInt4447 = arg1.method5500();
			} else if (arg0 == 31) {
				this.anInt4448 = arg1.method5495();
			} else if (arg0 == 32) {
				this.anInt4446 = arg1.method5500();
			} else if (arg0 == 33) {
				this.anInt4467 = arg1.method5458();
			} else if (arg0 == 34) {
				this.anInt4472 = arg1.method5495();
			} else if (arg0 == 35) {
				this.anInt4444 = arg1.method5500();
			} else if (arg0 == 36) {
				this.anInt4462 = arg1.method5458();
			} else if (arg0 == 37) {
				this.anInt4466 = arg1.method5495();
			} else if (arg0 == 38) {
				this.anInt4460 = arg1.method5500();
			} else if (arg0 == 39) {
				this.anInt4456 = arg1.method5500();
			} else if (arg0 == 40) {
				this.anInt4437 = arg1.method5500();
			} else if (arg0 == 41) {
				this.anInt4459 = arg1.method5500();
			} else if (arg0 == 42) {
				this.anInt4474 = arg1.method5500();
			} else if (arg0 == 43) {
				this.anInt4464 = arg1.method5500();
			} else if (arg0 == 44) {
				this.anInt4457 = arg1.method5500();
			} else if (arg0 == 45) {
				this.anInt4440 = arg1.method5500();
			} else if (arg0 == 46) {
				this.anInt4453 = arg1.method5500();
			} else if (arg0 == 47) {
				this.anInt4473 = arg1.method5500();
			} else if (arg0 == 48) {
				this.anInt4445 = arg1.method5500();
			} else if (arg0 == 49) {
				this.anInt4468 = arg1.method5500();
			} else if (arg0 == 50) {
				this.anInt4443 = arg1.method5500();
			} else if (arg0 == 51) {
				this.anInt4434 = arg1.method5500();
			} else if (arg0 == 52) {
				local147 = arg1.method5495();
				this.anIntArray375 = new int[local147];
				this.anIntArray373 = new int[local147];
				for (local155 = 0; local155 < local147; local155++) {
					this.anIntArray375[local155] = arg1.method5500();
					@Pc(417) int local417 = arg1.method5495();
					this.anIntArray373[local155] = local417;
					this.anInt4471 += local417;
				}
			} else if (arg0 == 53) {
				this.aBoolean324 = false;
			} else if (arg0 == 54) {
				this.anInt4436 = arg1.method5495() << 6;
				this.anInt4451 = arg1.method5495() << 6;
			}
		}
	}
}
