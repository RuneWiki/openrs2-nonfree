import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class132 {

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "[I")
	public int[] anIntArray306 = null;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public int anInt3728 = -1;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	public int anInt3742 = -1;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "[I")
	public int[] anIntArray308 = null;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	public int anInt3733 = 0;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	public int anInt3732 = 0;

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
	public int anInt3747 = -1;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	public int anInt3753 = 0;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
	public int anInt3748 = -1;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	public int anInt3744 = 0;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
	public int anInt3745 = 0;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Z")
	public boolean aBoolean287 = true;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
	public int anInt3756 = -1;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public int anInt3734 = 0;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public int anInt3736 = -1;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
	public int anInt3746 = -1;

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
	public int anInt3739 = 0;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public int anInt3731 = -1;

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	public int anInt3751 = -1;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
	public int anInt3737 = -1;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	public int anInt3741 = 0;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	public int anInt3760 = 0;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
	public int anInt3750 = -1;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
	public int anInt3738 = -1;

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
	public int anInt3759 = -1;

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
	public int anInt3758 = -1;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	public int anInt3766 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public int anInt3727 = 0;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
	public int anInt3754 = -1;

	@OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
	private int anInt3767 = 0;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
	public int anInt3740 = -1;

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
	public int anInt3762 = -1;

	@OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
	public int anInt3763 = -1;

	@OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
	public int anInt3768 = -1;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
	public int anInt3743 = -1;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
	public int anInt3765 = 0;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public int anInt3730 = -1;

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "I")
	public int anInt3770 = -1;

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	public int anInt3769 = 0;

	@OriginalMember(owner = "client!jr", name = "ab", descriptor = "I")
	public int anInt3771 = -1;

	static {
		new Class242("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!tl;)V")
	private void method2828(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt3758 = arg1.method4877();
			this.anInt3748 = arg1.method4877();
			if (this.anInt3748 == 65535) {
				this.anInt3748 = -1;
			}
			if (this.anInt3758 == 65535) {
				this.anInt3758 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3750 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt3740 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt3742 = arg1.method4877();
		} else if (arg0 == 5) {
			this.anInt3738 = arg1.method4877();
		} else if (arg0 == 6) {
			this.anInt3752 = arg1.method4877();
		} else if (arg0 == 7) {
			this.anInt3737 = arg1.method4877();
		} else if (arg0 == 8) {
			this.anInt3759 = arg1.method4877();
		} else if (arg0 == 9) {
			this.anInt3754 = arg1.method4877();
		} else if (arg0 == 26) {
			this.anInt3733 = (short) (arg1.method4864() * 4);
			this.anInt3734 = (short) (arg1.method4864() * 4);
		} else {
			@Pc(69) int local69;
			@Pc(337) int local337;
			if (arg0 == 27) {
				if (this.anIntArrayArray32 == null) {
					this.anIntArrayArray32 = new int[12][];
				}
				local69 = arg1.method4864();
				this.anIntArrayArray32[local69] = new int[6];
				for (local337 = 0; local337 < 6; local337++) {
					this.anIntArrayArray32[local69][local337] = arg1.method4889();
				}
			} else if (arg0 == 28) {
				this.anIntArray307 = new int[12];
				for (local69 = 0; local69 < 12; local69++) {
					this.anIntArray307[local69] = arg1.method4864();
					if (this.anIntArray307[local69] == 255) {
						this.anIntArray307[local69] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt3732 = arg1.method4864();
			} else if (arg0 == 30) {
				this.anInt3739 = arg1.method4877();
			} else if (arg0 == 31) {
				this.anInt3760 = arg1.method4864();
			} else if (arg0 == 32) {
				this.anInt3769 = arg1.method4877();
			} else if (arg0 == 33) {
				this.anInt3741 = arg1.method4889();
			} else if (arg0 == 34) {
				this.anInt3727 = arg1.method4864();
			} else if (arg0 == 35) {
				this.anInt3745 = arg1.method4877();
			} else if (arg0 == 36) {
				this.anInt3744 = arg1.method4889();
			} else if (arg0 == 37) {
				this.anInt3771 = arg1.method4864();
			} else if (arg0 == 38) {
				this.anInt3763 = arg1.method4877();
			} else if (arg0 == 39) {
				this.anInt3747 = arg1.method4877();
			} else if (arg0 == 40) {
				this.anInt3768 = arg1.method4877();
			} else if (arg0 == 41) {
				this.anInt3766 = arg1.method4877();
			} else if (arg0 == 42) {
				this.anInt3756 = arg1.method4877();
			} else if (arg0 == 43) {
				this.anInt3743 = arg1.method4877();
			} else if (arg0 == 44) {
				this.anInt3731 = arg1.method4877();
			} else if (arg0 == 45) {
				this.anInt3746 = arg1.method4877();
			} else if (arg0 == 46) {
				this.anInt3762 = arg1.method4877();
			} else if (arg0 == 47) {
				this.anInt3728 = arg1.method4877();
			} else if (arg0 == 48) {
				this.anInt3736 = arg1.method4877();
			} else if (arg0 == 49) {
				this.anInt3751 = arg1.method4877();
			} else if (arg0 == 50) {
				this.anInt3770 = arg1.method4877();
			} else if (arg0 == 51) {
				this.anInt3730 = arg1.method4877();
			} else if (arg0 == 52) {
				local69 = arg1.method4864();
				this.anIntArray308 = new int[local69];
				this.anIntArray306 = new int[local69];
				for (local337 = 0; local337 < local69; local337++) {
					this.anIntArray306[local337] = arg1.method4877();
					@Pc(350) int local350 = arg1.method4864();
					this.anIntArray308[local337] = local350;
					this.anInt3767 += local350;
				}
			} else if (arg0 == 53) {
				this.aBoolean287 = false;
			} else if (arg0 == 54) {
				this.anInt3753 = arg1.method4864() << 6;
				this.anInt3765 = arg1.method4864() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)I")
	public int method2830() {
		if (this.anInt3758 != -1) {
			return this.anInt3758;
		} else if (this.anIntArray306 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt3767 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray308[local30] <= local28; local30++) {
				local28 -= this.anIntArray308[local30];
			}
			return this.anIntArray306[local30];
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
	public boolean method2832(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3758 == arg0) {
			return true;
		} else {
			if (this.anIntArray306 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray306.length; local27++) {
					if (arg0 == this.anIntArray306[local27]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method2833(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method2828(local5, arg0);
		}
	}
}
