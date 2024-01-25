import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class164 {

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray130;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public int anInt4667 = 0;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt4670 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt4672 = -1;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Z")
	public boolean aBoolean321 = true;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt4662 = 0;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	public int anInt4682 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt4678 = 0;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt4666 = -1;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "[I")
	public int[] anIntArray374 = null;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt4677 = -1;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public int anInt4685 = -1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public int anInt4669 = -1;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt4679 = -1;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public int anInt4690 = 0;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public int anInt4665 = 0;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public int anInt4680 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt4676 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt4675 = 0;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt4664 = -1;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
	public int anInt4694 = -1;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	public int anInt4688 = -1;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	public int anInt4689 = -1;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
	public int anInt4696 = -1;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	public int anInt4695 = -1;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	public int anInt4697 = -1;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
	public int anInt4701 = -1;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public int anInt4684 = -1;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public int anInt4693 = 0;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	public int anInt4698 = -1;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	public int anInt4692 = -1;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
	public int anInt4702 = 0;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	public int anInt4686 = 0;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public int anInt4703 = 0;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt4673 = -1;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public int anInt4687 = -1;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
	public int anInt4700 = 0;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	public int anInt4704 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt4674 = -1;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "[I")
	public int[] anIntArray375 = null;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	public int anInt4706 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	public int method3817() {
		if (this.anInt4694 != -1) {
			return this.anInt4694;
		} else if (this.anIntArray374 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt4662);
			@Pc(24) int local24;
			for (local24 = 0; this.anIntArray375[local24] <= local22; local24++) {
				local22 -= this.anIntArray375[local24];
			}
			return this.anIntArray374[local24];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!lh;)V")
	public void method3818(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method3820(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method3820(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4694 = arg0.method4093();
			this.anInt4679 = arg0.method4093();
			if (this.anInt4679 == 65535) {
				this.anInt4679 = -1;
			}
			if (this.anInt4694 == 65535) {
				this.anInt4694 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4697 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt4701 = arg0.method4093();
		} else if (arg1 == 4) {
			this.anInt4666 = arg0.method4093();
		} else if (arg1 == 5) {
			this.anInt4669 = arg0.method4093();
		} else if (arg1 == 6) {
			this.anInt4695 = arg0.method4093();
		} else if (arg1 == 7) {
			this.anInt4680 = arg0.method4093();
		} else if (arg1 == 8) {
			this.anInt4698 = arg0.method4093();
		} else if (arg1 == 9) {
			this.anInt4676 = arg0.method4093();
		} else if (arg1 == 26) {
			this.anInt4693 = (short) (arg0.method4130() * 4);
			this.anInt4665 = (short) (arg0.method4130() * 4);
		} else {
			@Pc(107) int local107;
			@Pc(115) int local115;
			if (arg1 == 27) {
				if (this.anIntArrayArray130 == null) {
					this.anIntArrayArray130 = new int[12][];
				}
				local107 = arg0.method4130();
				this.anIntArrayArray130[local107] = new int[6];
				for (local115 = 0; local115 < 6; local115++) {
					this.anIntArrayArray130[local107][local115] = arg0.method4100();
				}
			} else if (arg1 == 28) {
				this.anIntArray373 = new int[12];
				for (local107 = 0; local107 < 12; local107++) {
					this.anIntArray373[local107] = arg0.method4130();
					if (this.anIntArray373[local107] == 255) {
						this.anIntArray373[local107] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4690 = arg0.method4130();
			} else if (arg1 == 30) {
				this.anInt4670 = arg0.method4093();
			} else if (arg1 == 31) {
				this.anInt4675 = arg0.method4130();
			} else if (arg1 == 32) {
				this.anInt4686 = arg0.method4093();
			} else if (arg1 == 33) {
				this.anInt4678 = arg0.method4100();
			} else if (arg1 == 34) {
				this.anInt4703 = arg0.method4130();
			} else if (arg1 == 35) {
				this.anInt4702 = arg0.method4093();
			} else if (arg1 == 36) {
				this.anInt4706 = arg0.method4100();
			} else if (arg1 == 37) {
				this.anInt4663 = arg0.method4130();
			} else if (arg1 == 38) {
				this.anInt4677 = arg0.method4093();
			} else if (arg1 == 39) {
				this.anInt4672 = arg0.method4093();
			} else if (arg1 == 40) {
				this.anInt4684 = arg0.method4093();
			} else if (arg1 == 41) {
				this.anInt4689 = arg0.method4093();
			} else if (arg1 == 42) {
				this.anInt4664 = arg0.method4093();
			} else if (arg1 == 43) {
				this.anInt4674 = arg0.method4093();
			} else if (arg1 == 44) {
				this.anInt4692 = arg0.method4093();
			} else if (arg1 == 45) {
				this.anInt4696 = arg0.method4093();
			} else if (arg1 == 46) {
				this.anInt4704 = arg0.method4093();
			} else if (arg1 == 47) {
				this.anInt4685 = arg0.method4093();
			} else if (arg1 == 48) {
				this.anInt4687 = arg0.method4093();
			} else if (arg1 == 49) {
				this.anInt4673 = arg0.method4093();
			} else if (arg1 == 50) {
				this.anInt4682 = arg0.method4093();
			} else if (arg1 == 51) {
				this.anInt4688 = arg0.method4093();
			} else if (arg1 == 52) {
				local107 = arg0.method4130();
				this.anIntArray374 = new int[local107];
				this.anIntArray375 = new int[local107];
				for (local115 = 0; local115 < local107; local115++) {
					this.anIntArray374[local115] = arg0.method4093();
					@Pc(366) int local366 = arg0.method4130();
					this.anIntArray375[local115] = local366;
					this.anInt4662 += local366;
				}
			} else if (arg1 == 53) {
				this.aBoolean321 = false;
			} else if (arg1 == 54) {
				this.anInt4667 = arg0.method4130() << 6;
				this.anInt4700 = arg0.method4130() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public boolean method3821(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt4694 == arg0) {
			return true;
		} else {
			if (this.anIntArray374 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray374.length; local27++) {
					if (this.anIntArray374[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
