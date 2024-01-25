import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class138 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	public int anInt3970 = 0;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public int anInt3963 = 0;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public int anInt3965 = -1;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
	public int anInt3973 = -1;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	public int anInt3971 = -1;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
	private int anInt3975 = 0;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
	public int anInt3980 = -1;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public int anInt3977 = -1;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "[I")
	public int[] anIntArray222 = null;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public int anInt3978 = 0;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	public int anInt3974 = -1;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public int anInt3962 = -1;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	public int anInt3976 = -1;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
	public int anInt3984 = 0;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
	public int anInt3967 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public int anInt3961 = -1;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	public int anInt3987 = -1;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	public int anInt3972 = -1;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
	public int anInt3989 = 0;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Z")
	public boolean aBoolean330 = true;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public int anInt3964 = 0;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public int anInt3966 = -1;

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public int anInt3990 = -1;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public int anInt3968 = -1;

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
	public int anInt3981 = -1;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "[I")
	public int[] anIntArray223 = null;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	public int anInt3991 = -1;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
	public int anInt3985 = 0;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	public int anInt3988 = -1;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	public int anInt3986 = -1;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	public int anInt3997 = -1;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
	public int anInt3992 = -1;

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
	public int anInt3998 = -1;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
	public int anInt4002 = 0;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	public int anInt3995 = -1;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
	public int anInt3982 = 0;

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
	public int anInt4000 = -1;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	public int anInt3993 = -1;

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
	public int anInt4003 = -1;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	public int anInt3994 = 0;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
	public int anInt4004 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)I")
	public int method3398() {
		if (this.anInt3993 != -1) {
			return this.anInt3993;
		} else if (this.anIntArray222 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt3975);
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray223[local30]; local30++) {
				local28 -= this.anIntArray223[local30];
			}
			return this.anIntArray222[local30];
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!io;I)V")
	public void method3399(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4393();
			if (local17 == 0) {
				return;
			}
			this.method3401(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)Z")
	public boolean method3400(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3993 == arg0) {
			return true;
		} else {
			if (this.anIntArray222 != null) {
				for (@Pc(28) int local28 = 0; local28 < this.anIntArray222.length; local28++) {
					if (this.anIntArray222[local28] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!io;IB)V")
	private void method3401(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3993 = arg0.method4426();
			this.anInt3968 = arg0.method4426();
			if (this.anInt3968 == 65535) {
				this.anInt3968 = -1;
			}
			if (this.anInt3993 == 65535) {
				this.anInt3993 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3966 = arg0.method4426();
		} else if (arg1 == 3) {
			this.anInt3987 = arg0.method4426();
		} else if (arg1 == 4) {
			this.anInt4000 = arg0.method4426();
		} else if (arg1 == 5) {
			this.anInt4003 = arg0.method4426();
		} else if (arg1 == 6) {
			this.anInt3973 = arg0.method4426();
		} else if (arg1 == 7) {
			this.anInt3976 = arg0.method4426();
		} else if (arg1 == 8) {
			this.anInt3981 = arg0.method4426();
		} else if (arg1 == 9) {
			this.anInt3971 = arg0.method4426();
		} else if (arg1 == 26) {
			this.anInt3989 = (short) (arg0.method4393() * 4);
			this.anInt3994 = (short) (arg0.method4393() * 4);
		} else {
			@Pc(107) int local107;
			@Pc(115) int local115;
			if (arg1 == 27) {
				if (this.anIntArrayArray26 == null) {
					this.anIntArrayArray26 = new int[12][];
				}
				local107 = arg0.method4393();
				this.anIntArrayArray26[local107] = new int[6];
				for (local115 = 0; local115 < 6; local115++) {
					this.anIntArrayArray26[local107][local115] = arg0.method4391();
				}
			} else if (arg1 == 28) {
				this.anIntArray224 = new int[12];
				for (local107 = 0; local107 < 12; local107++) {
					this.anIntArray224[local107] = arg0.method4393();
					if (this.anIntArray224[local107] == 255) {
						this.anIntArray224[local107] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt3978 = arg0.method4393();
			} else if (arg1 == 30) {
				this.anInt3964 = arg0.method4426();
			} else if (arg1 == 31) {
				this.anInt3984 = arg0.method4393();
			} else if (arg1 == 32) {
				this.anInt3985 = arg0.method4426();
			} else if (arg1 == 33) {
				this.anInt3963 = arg0.method4391();
			} else if (arg1 == 34) {
				this.anInt3970 = arg0.method4393();
			} else if (arg1 == 35) {
				this.anInt3982 = arg0.method4426();
			} else if (arg1 == 36) {
				this.anInt3967 = arg0.method4391();
			} else if (arg1 == 37) {
				this.anInt3972 = arg0.method4393();
			} else if (arg1 == 38) {
				this.anInt3974 = arg0.method4426();
			} else if (arg1 == 39) {
				this.anInt3961 = arg0.method4426();
			} else if (arg1 == 40) {
				this.anInt3988 = arg0.method4426();
			} else if (arg1 == 41) {
				this.anInt3997 = arg0.method4426();
			} else if (arg1 == 42) {
				this.anInt3995 = arg0.method4426();
			} else if (arg1 == 43) {
				this.anInt3977 = arg0.method4426();
			} else if (arg1 == 44) {
				this.anInt3962 = arg0.method4426();
			} else if (arg1 == 45) {
				this.anInt3986 = arg0.method4426();
			} else if (arg1 == 46) {
				this.anInt3990 = arg0.method4426();
			} else if (arg1 == 47) {
				this.anInt3992 = arg0.method4426();
			} else if (arg1 == 48) {
				this.anInt3965 = arg0.method4426();
			} else if (arg1 == 49) {
				this.anInt3998 = arg0.method4426();
			} else if (arg1 == 50) {
				this.anInt3980 = arg0.method4426();
			} else if (arg1 == 51) {
				this.anInt3991 = arg0.method4426();
			} else if (arg1 == 52) {
				local107 = arg0.method4393();
				this.anIntArray223 = new int[local107];
				this.anIntArray222 = new int[local107];
				for (local115 = 0; local115 < local107; local115++) {
					this.anIntArray222[local115] = arg0.method4426();
					@Pc(382) int local382 = arg0.method4393();
					this.anIntArray223[local115] = local382;
					this.anInt3975 += local382;
				}
			} else if (arg1 == 53) {
				this.aBoolean330 = false;
			} else if (arg1 == 54) {
				this.anInt4002 = arg0.method4393() << 6;
				this.anInt4004 = arg0.method4393() << 6;
			}
		}
	}
}
