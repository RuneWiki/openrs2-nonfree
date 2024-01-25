import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class21 {

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt593 = 0;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	private int anInt596 = 0;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
	public int[] anIntArray49 = null;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public int anInt605 = 0;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt600 = -1;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public int anInt606 = -1;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public int anInt618 = 0;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public int anInt594 = -1;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public int anInt604 = 0;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public int anInt603 = -1;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	public int anInt616 = -1;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public int anInt621 = -1;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	public int anInt611 = -1;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public int anInt599 = -1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	public int anInt609 = -1;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public int anInt624 = 0;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public int anInt612 = -1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public int anInt622 = -1;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public int anInt620 = -1;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public int anInt602 = 0;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public int anInt628 = -1;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public int anInt625 = -1;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	public int anInt619 = -1;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public int anInt635 = -1;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	public int anInt629 = -1;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt617 = 0;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public int anInt607 = -1;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	public int anInt623 = -1;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	public int anInt633 = 0;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public int anInt632 = -1;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
	public int anInt631 = -1;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
	public int anInt636 = -1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public int anInt613 = 0;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
	public int anInt639 = -1;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "[I")
	public int[] anIntArray50 = null;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	public int anInt627 = 0;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	public int anInt634 = 0;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
	public int anInt630 = 0;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public int anInt614 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!hp;I)V")
	public void method572(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method575(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
	public int method573() {
		if (this.anInt636 != -1) {
			return this.anInt636;
		} else if (this.anIntArray49 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt596);
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray50[local31]; local31++) {
				local29 -= this.anIntArray50[local31];
			}
			return this.anIntArray49[local31];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z")
	public boolean method574(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt636 == arg0) {
			return true;
		} else {
			if (this.anIntArray49 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray49.length; local27++) {
					if (this.anIntArray49[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILclient!hp;)V")
	private void method575(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt636 = arg1.method5362();
			this.anInt619 = arg1.method5362();
			if (this.anInt636 == 65535) {
				this.anInt636 = -1;
			}
			if (this.anInt619 == 65535) {
				this.anInt619 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt611 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt603 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt599 = arg1.method5362();
		} else if (arg0 == 5) {
			this.anInt607 = arg1.method5362();
		} else if (arg0 == 6) {
			this.anInt620 = arg1.method5362();
		} else if (arg0 == 7) {
			this.anInt628 = arg1.method5362();
		} else if (arg0 == 8) {
			this.anInt609 = arg1.method5362();
		} else if (arg0 == 9) {
			this.anInt629 = arg1.method5362();
		} else if (arg0 == 26) {
			this.anInt613 = (short) (arg1.method5366() * 4);
			this.anInt593 = (short) (arg1.method5366() * 4);
		} else {
			@Pc(73) int local73;
			@Pc(81) int local81;
			if (arg0 == 27) {
				if (this.anIntArrayArray5 == null) {
					this.anIntArrayArray5 = new int[12][];
				}
				local73 = arg1.method5366();
				this.anIntArrayArray5[local73] = new int[6];
				for (local81 = 0; local81 < 6; local81++) {
					this.anIntArrayArray5[local73][local81] = arg1.method5380();
				}
			} else if (arg0 == 28) {
				this.anIntArray51 = new int[12];
				for (local73 = 0; local73 < 12; local73++) {
					this.anIntArray51[local73] = arg1.method5366();
					if (this.anIntArray51[local73] == 255) {
						this.anIntArray51[local73] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt617 = arg1.method5366();
			} else if (arg0 == 30) {
				this.anInt627 = arg1.method5362();
			} else if (arg0 == 31) {
				this.anInt605 = arg1.method5366();
			} else if (arg0 == 32) {
				this.anInt634 = arg1.method5362();
			} else if (arg0 == 33) {
				this.anInt633 = arg1.method5380();
			} else if (arg0 == 34) {
				this.anInt602 = arg1.method5366();
			} else if (arg0 == 35) {
				this.anInt624 = arg1.method5362();
			} else if (arg0 == 36) {
				this.anInt630 = arg1.method5380();
			} else if (arg0 == 37) {
				this.anInt635 = arg1.method5366();
			} else if (arg0 == 38) {
				this.anInt614 = arg1.method5362();
			} else if (arg0 == 39) {
				this.anInt595 = arg1.method5362();
			} else if (arg0 == 40) {
				this.anInt594 = arg1.method5362();
			} else if (arg0 == 41) {
				this.anInt631 = arg1.method5362();
			} else if (arg0 == 42) {
				this.anInt621 = arg1.method5362();
			} else if (arg0 == 43) {
				this.anInt623 = arg1.method5362();
			} else if (arg0 == 44) {
				this.anInt600 = arg1.method5362();
			} else if (arg0 == 45) {
				this.anInt625 = arg1.method5362();
			} else if (arg0 == 46) {
				this.anInt616 = arg1.method5362();
			} else if (arg0 == 47) {
				this.anInt612 = arg1.method5362();
			} else if (arg0 == 48) {
				this.anInt622 = arg1.method5362();
			} else if (arg0 == 49) {
				this.anInt639 = arg1.method5362();
			} else if (arg0 == 50) {
				this.anInt632 = arg1.method5362();
			} else if (arg0 == 51) {
				this.anInt606 = arg1.method5362();
			} else if (arg0 == 52) {
				local73 = arg1.method5366();
				this.anIntArray50 = new int[local73];
				this.anIntArray49 = new int[local73];
				for (local81 = 0; local81 < local73; local81++) {
					this.anIntArray49[local81] = arg1.method5362();
					@Pc(372) int local372 = arg1.method5366();
					this.anIntArray50[local81] = local372;
					this.anInt596 += local372;
				}
			} else if (arg0 == 53) {
				this.aBoolean27 = false;
			} else if (arg0 == 54) {
				this.anInt604 = arg1.method5366() << 6;
				this.anInt618 = arg1.method5366() << 6;
			}
		}
	}
}
