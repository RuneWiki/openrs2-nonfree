import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class42 {

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!cp", name = "V", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	public int anInt1008 = -1;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public int anInt1007 = -1;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Z")
	public boolean aBoolean59 = true;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[I")
	public int[] anIntArray95 = null;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public int anInt1015 = -1;

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	public int anInt1027 = -1;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
	public int anInt1018 = 0;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	public int anInt1013 = -1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public int anInt1010 = -1;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
	public int anInt1026 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public int anInt1006 = -1;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
	public int anInt1011 = -1;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
	public int anInt1024 = 0;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
	public int anInt1016 = 0;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "[I")
	public int[] anIntArray96 = null;

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
	public int anInt1029 = -1;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	public int anInt1014 = -1;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	public int anInt1038 = -1;

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
	public int anInt1032 = 0;

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
	public int anInt1028 = -1;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	public int anInt1022 = 0;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
	public int anInt1033 = -1;

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
	public int anInt1037 = -1;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	public int anInt1023 = -1;

	@OriginalMember(owner = "client!cp", name = "T", descriptor = "I")
	public int anInt1045 = -1;

	@OriginalMember(owner = "client!cp", name = "S", descriptor = "I")
	private int anInt1044 = 0;

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
	public int anInt1043 = -1;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	public int anInt1020 = 0;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
	public int anInt1040 = 0;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	public int anInt1009 = -1;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
	public int anInt1019 = -1;

	@OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
	public int anInt1030 = 0;

	@OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
	public int anInt1048 = -1;

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
	public int anInt1041 = -1;

	@OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
	public int anInt1047 = 0;

	@OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
	public int anInt1031 = 0;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	public int anInt1017 = -1;

	@OriginalMember(owner = "client!cp", name = "U", descriptor = "I")
	public int anInt1046 = -1;

	@OriginalMember(owner = "client!cp", name = "Z", descriptor = "I")
	public int anInt1049 = 0;

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public int anInt1025 = -1;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	public int anInt1042 = -1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method815(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method818(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)I")
	public int method816() {
		if (this.anInt1008 != -1) {
			return this.anInt1008;
		} else if (this.anIntArray95 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt1044);
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray96[local31]; local31++) {
				local29 -= this.anIntArray96[local31];
			}
			return this.anIntArray95[local31];
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Z")
	public boolean method817(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt1008 == arg0) {
			return true;
		} else {
			if (this.anIntArray95 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray95.length; local29++) {
					if (this.anIntArray95[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!fh;)V")
	private void method818(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt1008 = arg1.method5028();
			this.anInt1014 = arg1.method5028();
			if (this.anInt1014 == 65535) {
				this.anInt1014 = -1;
			}
			if (this.anInt1008 == 65535) {
				this.anInt1008 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt1009 = arg1.method5028();
			return;
		} else if (arg0 == 3) {
			this.anInt1037 = arg1.method5028();
			return;
		} else if (arg0 == 4) {
			this.anInt1048 = arg1.method5028();
		} else if (arg0 == 5) {
			this.anInt1025 = arg1.method5028();
			return;
		} else if (arg0 == 6) {
			this.anInt1010 = arg1.method5028();
			return;
		} else if (arg0 == 7) {
			this.anInt1027 = arg1.method5028();
			return;
		} else if (arg0 == 8) {
			this.anInt1015 = arg1.method5028();
			return;
		} else if (arg0 == 9) {
			this.anInt1029 = arg1.method5028();
			return;
		} else if (arg0 == 26) {
			this.anInt1049 = (short) (arg1.method5007() * 4);
			this.anInt1016 = (short) (arg1.method5007() * 4);
			return;
		} else {
			@Pc(124) int local124;
			@Pc(333) int local333;
			if (arg0 != 27) {
				if (arg0 == 28) {
					this.anIntArray97 = new int[12];
					for (local124 = 0; local124 < 12; local124++) {
						this.anIntArray97[local124] = arg1.method5007();
						if (this.anIntArray97[local124] == 255) {
							this.anIntArray97[local124] = -1;
						}
					}
					return;
				}
				if (arg0 == 29) {
					this.anInt1047 = arg1.method5007();
					return;
				}
				if (arg0 == 30) {
					this.anInt1018 = arg1.method5028();
					return;
				}
				if (arg0 == 31) {
					this.anInt1030 = arg1.method5007();
					return;
				}
				if (arg0 == 32) {
					this.anInt1031 = arg1.method5028();
					return;
				}
				if (arg0 == 33) {
					this.anInt1032 = arg1.method5061();
					return;
				}
				if (arg0 == 34) {
					this.anInt1022 = arg1.method5007();
					return;
				}
				if (arg0 == 35) {
					this.anInt1020 = arg1.method5028();
					return;
				}
				if (arg0 == 36) {
					this.anInt1040 = arg1.method5061();
					return;
				}
				if (arg0 == 37) {
					this.anInt1013 = arg1.method5007();
					return;
				}
				if (arg0 == 38) {
					this.anInt1046 = arg1.method5028();
					return;
				}
				if (arg0 == 39) {
					this.anInt1023 = arg1.method5028();
					return;
				}
				if (arg0 == 40) {
					this.anInt1043 = arg1.method5028();
					return;
				}
				if (arg0 == 41) {
					this.anInt1033 = arg1.method5028();
					return;
				}
				if (arg0 == 42) {
					this.anInt1038 = arg1.method5028();
					return;
				}
				if (arg0 == 43) {
					this.anInt1019 = arg1.method5028();
					return;
				}
				if (arg0 == 44) {
					this.anInt1006 = arg1.method5028();
					return;
				}
				if (arg0 == 45) {
					this.anInt1045 = arg1.method5028();
					return;
				}
				if (arg0 == 46) {
					this.anInt1028 = arg1.method5028();
					return;
				}
				if (arg0 == 47) {
					this.anInt1042 = arg1.method5028();
					return;
				}
				if (arg0 == 48) {
					this.anInt1017 = arg1.method5028();
					return;
				}
				if (arg0 == 49) {
					this.anInt1011 = arg1.method5028();
					return;
				}
				if (arg0 == 50) {
					this.anInt1007 = arg1.method5028();
					return;
				}
				if (arg0 == 51) {
					this.anInt1041 = arg1.method5028();
					return;
				}
				if (arg0 != 52) {
					if (arg0 == 53) {
						this.aBoolean59 = false;
					} else if (arg0 == 54) {
						this.anInt1024 = arg1.method5007() << 6;
						this.anInt1026 = arg1.method5007() << 6;
						return;
					}
					return;
				}
				local124 = arg1.method5007();
				this.anIntArray95 = new int[local124];
				this.anIntArray96 = new int[local124];
				for (local333 = 0; local333 < local124; local333++) {
					this.anIntArray95[local333] = arg1.method5028();
					@Pc(346) int local346 = arg1.method5007();
					this.anIntArray96[local333] = local346;
					this.anInt1044 += local346;
				}
				return;
			}
			if (this.anIntArrayArray14 == null) {
				this.anIntArrayArray14 = new int[12][];
			}
			local124 = arg1.method5007();
			this.anIntArrayArray14[local124] = new int[6];
			for (local333 = 0; local333 < 6; local333++) {
				this.anIntArrayArray14[local124][local333] = arg1.method5061();
			}
			return;
		}
	}
}
