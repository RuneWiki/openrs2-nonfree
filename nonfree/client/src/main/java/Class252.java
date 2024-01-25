import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class252 {

	@OriginalMember(owner = "client!on", name = "P", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "[I")
	public int[] anIntArray408;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "[Lclient!q;")
	private Class81[] aClass81Array1;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public int anInt7476 = 0;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public int anInt7484 = -1;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public int anInt7479 = -1;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Z")
	public boolean aBoolean550 = true;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public int anInt7475 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "I")
	public int anInt7474 = -1;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public int anInt7478 = -1;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "I")
	public int anInt7497 = -1;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	public int anInt7505 = 0;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	public int anInt7480 = 0;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "I")
	public int anInt7502 = -1;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "I")
	public int anInt7499 = -1;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	public int anInt7481 = 0;

	@OriginalMember(owner = "client!on", name = "L", descriptor = "I")
	public int anInt7509 = 0;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public int anInt7488 = -1;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "I")
	public int anInt7495 = 0;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	public int anInt7492 = -1;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public int anInt7489 = -1;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "I")
	public int anInt7486 = -1;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "I")
	private int anInt7503 = 0;

	@OriginalMember(owner = "client!on", name = "N", descriptor = "I")
	public int anInt7511 = -1;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "I")
	public int anInt7506 = 0;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public int anInt7493 = -1;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "I")
	public int anInt7496 = -1;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	public int anInt7490 = -1;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "I")
	public int anInt7500 = -1;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	public int anInt7512 = -1;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public int anInt7494 = -1;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "I")
	public int anInt7504 = -1;

	@OriginalMember(owner = "client!on", name = "H", descriptor = "[I")
	public int[] anIntArray407 = null;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public int anInt7482 = -1;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public int anInt7483 = 0;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt7485 = 0;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "I")
	public int anInt7508 = -1;

	@OriginalMember(owner = "client!on", name = "U", descriptor = "I")
	public int anInt7514 = 0;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "I")
	private final int anInt7515 = -1;

	@OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
	public int anInt7518 = -1;

	@OriginalMember(owner = "client!on", name = "W", descriptor = "I")
	public int anInt7516 = -1;

	@OriginalMember(owner = "client!on", name = "X", descriptor = "I")
	public int anInt7517 = 0;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "I")
	public int anInt7510 = -1;

	@OriginalMember(owner = "client!on", name = "bb", descriptor = "[I")
	public int[] anIntArray410 = null;

	@OriginalMember(owner = "client!on", name = "Z", descriptor = "I")
	public int anInt7519 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method5902(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7004();
			if (local5 == 0) {
				return;
			}
			this.method5908(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public boolean method5904(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt7499 == arg0) {
			return true;
		} else {
			if (this.anIntArray407 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray407.length; local27++) {
					if (arg0 == this.anIntArray407[local27]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
	public int method5906() {
		if (this.anInt7499 != -1) {
			return this.anInt7499;
		} else if (this.anIntArray407 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt7503 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray410[local30] <= local28; local30++) {
				local28 -= this.anIntArray410[local30];
			}
			return this.anIntArray407[local30];
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!r;B)[Lclient!q;")
	public Class81[] method5907(@OriginalArg(0) Class7 arg0) {
		if (this.aClass81Array1 != null && this.anInt7515 == arg0.anInt10078) {
			return this.aClass81Array1;
		} else if (this.anIntArrayArray38 == null) {
			return null;
		} else {
			this.aClass81Array1 = new Class81[this.anIntArrayArray38.length];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArrayArray38.length; local40++) {
				@Pc(44) int local44 = 0;
				@Pc(46) int local46 = 0;
				@Pc(48) int local48 = 0;
				@Pc(50) int local50 = 0;
				@Pc(52) int local52 = 0;
				@Pc(54) int local54 = 0;
				if (this.anIntArrayArray38[local40] != null) {
					local52 = this.anIntArrayArray38[local40][4] << 3;
					local48 = this.anIntArrayArray38[local40][2];
					local54 = this.anIntArrayArray38[local40][5] << 3;
					local44 = this.anIntArrayArray38[local40][0];
					local46 = this.anIntArrayArray38[local40][1];
					local50 = this.anIntArrayArray38[local40][3] << 3;
				}
				if (local44 != 0 || local46 != 0 || local48 != 0 || local50 != 0 || local52 != 0 || local54 != 0) {
					@Pc(139) Class81 local139 = this.aClass81Array1[local40] = arg0.method7842();
					if (local54 != 0) {
						local139.AA(local54);
					}
					if (local50 != 0) {
						local139.w(local50);
					}
					if (local52 != 0) {
						local139.ZA(local52);
					}
					local139.U(local44, local46, local48);
				}
			}
			return this.aClass81Array1;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ek;IB)V")
	private void method5908(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7499 = arg0.method7054();
			this.anInt7494 = arg0.method7054();
			if (this.anInt7499 == 65535) {
				this.anInt7499 = -1;
			}
			if (this.anInt7494 == 65535) {
				this.anInt7494 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7478 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt7484 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt7492 = arg0.method7054();
		} else if (arg1 == 5) {
			this.anInt7516 = arg0.method7054();
		} else if (arg1 == 6) {
			this.anInt7486 = arg0.method7054();
		} else if (arg1 == 7) {
			this.anInt7504 = arg0.method7054();
		} else if (arg1 == 8) {
			this.anInt7511 = arg0.method7054();
		} else if (arg1 == 9) {
			this.anInt7518 = arg0.method7054();
		} else if (arg1 == 26) {
			this.anInt7475 = (short) (arg0.method7004() * 4);
			this.anInt7481 = (short) (arg0.method7004() * 4);
		} else {
			@Pc(91) int local91;
			@Pc(316) int local316;
			if (arg1 == 27) {
				if (this.anIntArrayArray38 == null) {
					this.anIntArrayArray38 = new int[12][];
				}
				local91 = arg0.method7004();
				this.anIntArrayArray38[local91] = new int[6];
				for (local316 = 0; local316 < 6; local316++) {
					this.anIntArrayArray38[local91][local316] = arg0.method7043();
				}
			} else if (arg1 == 28) {
				this.anIntArray408 = new int[12];
				for (local91 = 0; local91 < 12; local91++) {
					this.anIntArray408[local91] = arg0.method7004();
					if (this.anIntArray408[local91] == 255) {
						this.anIntArray408[local91] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt7476 = arg0.method7004();
			} else if (arg1 == 30) {
				this.anInt7495 = arg0.method7054();
			} else if (arg1 == 31) {
				this.anInt7483 = arg0.method7004();
			} else if (arg1 == 32) {
				this.anInt7514 = arg0.method7054();
			} else if (arg1 == 33) {
				this.anInt7517 = arg0.method7043();
			} else if (arg1 == 34) {
				this.anInt7505 = arg0.method7004();
			} else if (arg1 == 35) {
				this.anInt7485 = arg0.method7054();
			} else if (arg1 == 36) {
				this.anInt7506 = arg0.method7043();
			} else if (arg1 == 37) {
				this.anInt7489 = arg0.method7004();
			} else if (arg1 == 38) {
				this.anInt7490 = arg0.method7054();
			} else if (arg1 == 39) {
				this.anInt7474 = arg0.method7054();
			} else if (arg1 == 40) {
				this.anInt7497 = arg0.method7054();
			} else if (arg1 == 41) {
				this.anInt7493 = arg0.method7054();
			} else if (arg1 == 42) {
				this.anInt7496 = arg0.method7054();
			} else if (arg1 == 43) {
				this.anInt7512 = arg0.method7054();
			} else if (arg1 == 44) {
				this.anInt7479 = arg0.method7054();
			} else if (arg1 == 45) {
				this.anInt7488 = arg0.method7054();
			} else if (arg1 == 46) {
				this.anInt7508 = arg0.method7054();
			} else if (arg1 == 47) {
				this.anInt7482 = arg0.method7054();
			} else if (arg1 == 48) {
				this.anInt7502 = arg0.method7054();
			} else if (arg1 == 49) {
				this.anInt7519 = arg0.method7054();
			} else if (arg1 == 50) {
				this.anInt7510 = arg0.method7054();
			} else if (arg1 == 51) {
				this.anInt7500 = arg0.method7054();
			} else if (arg1 == 52) {
				local91 = arg0.method7004();
				this.anIntArray407 = new int[local91];
				this.anIntArray410 = new int[local91];
				for (local316 = 0; local316 < local91; local316++) {
					this.anIntArray407[local316] = arg0.method7054();
					@Pc(331) int local331 = arg0.method7004();
					this.anIntArray410[local316] = local331;
					this.anInt7503 += local331;
				}
			} else if (arg1 == 53) {
				this.aBoolean550 = false;
			} else if (arg1 == 54) {
				this.anInt7480 = arg0.method7004() << 6;
				this.anInt7509 = arg0.method7004() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray409 == null) {
					this.anIntArray409 = new int[12];
				}
				local91 = arg0.method7004();
				this.anIntArray409[local91] = arg0.method7054();
				return;
			}
		}
	}
}
