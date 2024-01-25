import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class151 {

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!mp", name = "N", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public int anInt4660 = 0;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	public int anInt4669 = -1;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt4664 = -1;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	public int anInt4670 = 0;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
	public int anInt4672 = -1;

	@OriginalMember(owner = "client!mp", name = "A", descriptor = "Z")
	public boolean aBoolean428 = true;

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
	public int anInt4676 = 0;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	public int anInt4665 = -1;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	public int anInt4674 = 0;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	public int anInt4668 = -1;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
	public int anInt4675 = -1;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public int anInt4661 = -1;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public int anInt4658 = -1;

	@OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
	public int anInt4683 = 0;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
	public int anInt4680 = -1;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt4657 = -1;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public int anInt4667 = -1;

	@OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
	public int anInt4684 = -1;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt4662 = 0;

	@OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
	public int anInt4687 = -1;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
	public int anInt4671 = 0;

	@OriginalMember(owner = "client!mp", name = "E", descriptor = "[I")
	public int[] anIntArray304 = null;

	@OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
	public int anInt4686 = -1;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
	public int anInt4673 = -1;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
	public int anInt4690 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public int anInt4656 = -1;

	@OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
	public int anInt4693 = 0;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
	public int anInt4678 = -1;

	@OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
	public int anInt4681 = -1;

	@OriginalMember(owner = "client!mp", name = "D", descriptor = "I")
	public int anInt4682 = -1;

	@OriginalMember(owner = "client!mp", name = "U", descriptor = "I")
	public int anInt4696 = 0;

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
	public int anInt4689 = -1;

	@OriginalMember(owner = "client!mp", name = "V", descriptor = "I")
	public int anInt4697 = -1;

	@OriginalMember(owner = "client!mp", name = "L", descriptor = "I")
	public int anInt4688 = -1;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "I")
	public int anInt4692 = -1;

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "[I")
	public int[] anIntArray305 = null;

	@OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
	public int anInt4685 = 0;

	@OriginalMember(owner = "client!mp", name = "Z", descriptor = "I")
	public int anInt4700 = 0;

	@OriginalMember(owner = "client!mp", name = "bb", descriptor = "I")
	public int anInt4701 = -1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)I")
	public int method3637() {
		if (this.anInt4661 != -1) {
			return this.anInt4661;
		} else if (this.anIntArray304 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt4691);
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray305[local30] <= local28; local30++) {
				local28 -= this.anIntArray305[local30];
			}
			return this.anIntArray304[local30];
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!iv;)V")
	public void method3638(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2490();
			if (local18 == 0) {
				return;
			}
			this.method3643(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)Z")
	public boolean method3642(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt4661 == arg0) {
			return true;
		} else {
			if (this.anIntArray304 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray304.length; local32++) {
					if (this.anIntArray304[local32] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILclient!iv;)V")
	private void method3643(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt4661 = arg1.method2536();
			this.anInt4697 = arg1.method2536();
			if (this.anInt4697 == 65535) {
				this.anInt4697 = -1;
			}
			if (this.anInt4661 == 65535) {
				this.anInt4661 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt4667 = arg1.method2536();
			return;
		} else if (arg0 == 3) {
			this.anInt4681 = arg1.method2536();
			return;
		} else if (arg0 == 4) {
			this.anInt4675 = arg1.method2536();
		} else if (arg0 == 5) {
			this.anInt4688 = arg1.method2536();
			return;
		} else if (arg0 == 6) {
			this.anInt4669 = arg1.method2536();
			return;
		} else if (arg0 == 7) {
			this.anInt4656 = arg1.method2536();
			return;
		} else if (arg0 == 8) {
			this.anInt4686 = arg1.method2536();
			return;
		} else if (arg0 == 9) {
			this.anInt4665 = arg1.method2536();
			return;
		} else if (arg0 == 26) {
			this.anInt4662 = (short) (arg1.method2490() * 4);
			this.anInt4670 = (short) (arg1.method2490() * 4);
			return;
		} else {
			@Pc(103) int local103;
			@Pc(294) int local294;
			if (arg0 != 27) {
				if (arg0 == 28) {
					this.anIntArray306 = new int[12];
					for (local103 = 0; local103 < 12; local103++) {
						this.anIntArray306[local103] = arg1.method2490();
						if (this.anIntArray306[local103] == 255) {
							this.anIntArray306[local103] = -1;
						}
					}
					return;
				}
				if (arg0 == 29) {
					this.anInt4676 = arg1.method2490();
					return;
				}
				if (arg0 == 30) {
					this.anInt4696 = arg1.method2536();
					return;
				}
				if (arg0 == 31) {
					this.anInt4700 = arg1.method2490();
					return;
				}
				if (arg0 == 32) {
					this.anInt4685 = arg1.method2536();
					return;
				}
				if (arg0 == 33) {
					this.anInt4674 = arg1.method2512();
					return;
				}
				if (arg0 == 34) {
					this.anInt4683 = arg1.method2490();
					return;
				}
				if (arg0 == 35) {
					this.anInt4690 = arg1.method2536();
					return;
				}
				if (arg0 == 36) {
					this.anInt4660 = arg1.method2512();
					return;
				}
				if (arg0 == 37) {
					this.anInt4664 = arg1.method2490();
					return;
				}
				if (arg0 == 38) {
					this.anInt4663 = arg1.method2536();
					return;
				}
				if (arg0 == 39) {
					this.anInt4689 = arg1.method2536();
					return;
				}
				if (arg0 == 40) {
					this.anInt4701 = arg1.method2536();
					return;
				}
				if (arg0 == 41) {
					this.anInt4680 = arg1.method2536();
					return;
				}
				if (arg0 == 42) {
					this.anInt4658 = arg1.method2536();
					return;
				}
				if (arg0 == 43) {
					this.anInt4692 = arg1.method2536();
					return;
				}
				if (arg0 == 44) {
					this.anInt4673 = arg1.method2536();
					return;
				}
				if (arg0 == 45) {
					this.anInt4684 = arg1.method2536();
					return;
				}
				if (arg0 == 46) {
					this.anInt4657 = arg1.method2536();
					return;
				}
				if (arg0 == 47) {
					this.anInt4672 = arg1.method2536();
					return;
				}
				if (arg0 == 48) {
					this.anInt4687 = arg1.method2536();
					return;
				}
				if (arg0 == 49) {
					this.anInt4678 = arg1.method2536();
					return;
				}
				if (arg0 == 50) {
					this.anInt4668 = arg1.method2536();
					return;
				}
				if (arg0 == 51) {
					this.anInt4682 = arg1.method2536();
					return;
				}
				if (arg0 != 52) {
					if (arg0 == 53) {
						this.aBoolean428 = false;
					} else if (arg0 == 54) {
						this.anInt4671 = arg1.method2490() << 6;
						this.anInt4693 = arg1.method2490() << 6;
						return;
					}
					return;
				}
				local103 = arg1.method2490();
				this.anIntArray305 = new int[local103];
				this.anIntArray304 = new int[local103];
				for (local294 = 0; local294 < local103; local294++) {
					this.anIntArray304[local294] = arg1.method2536();
					@Pc(307) int local307 = arg1.method2490();
					this.anIntArray305[local294] = local307;
					this.anInt4691 += local307;
				}
				return;
			}
			if (this.anIntArrayArray38 == null) {
				this.anIntArrayArray38 = new int[12][];
			}
			local103 = arg1.method2490();
			this.anIntArrayArray38[local103] = new int[6];
			for (local294 = 0; local294 < 6; local294++) {
				this.anIntArrayArray38[local103][local294] = arg1.method2512();
			}
			return;
		}
	}
}
