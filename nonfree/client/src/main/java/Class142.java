import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class142 {

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
	public int anInt4859 = 0;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
	public int anInt4870 = -1;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	public int anInt4860 = -1;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
	public int anInt4864 = -1;

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	public int anInt4885 = 0;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	public int anInt4889 = -1;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	public int anInt4874 = -1;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
	public int anInt4877 = -1;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
	public int anInt4866 = -1;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	public int anInt4883 = 0;

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
	public int anInt4893 = -1;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	public int anInt4868 = -1;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public int anInt4869 = -1;

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
	public int anInt4886 = -1;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	public int anInt4872 = -1;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "[I")
	public int[] anIntArray356 = null;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
	public int anInt4881 = -1;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
	public int anInt4890 = -1;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public int anInt4871 = -1;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
	public int anInt4899 = -1;

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "[I")
	public int[] anIntArray358 = null;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Z")
	public boolean aBoolean428 = true;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	public int anInt4879 = -1;

	@OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
	public int anInt4894 = 0;

	@OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
	public int anInt4897 = 0;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public int anInt4862 = -1;

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
	public int anInt4891 = -1;

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
	public int anInt4900 = 0;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
	public int anInt4875 = -1;

	@OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
	public int anInt4898 = -1;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	public int anInt4887 = 0;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
	public int anInt4896 = 0;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
	public int anInt4873 = -1;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
	public int anInt4901 = 0;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public int anInt4882 = 0;

	@OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
	public int anInt4902 = -1;

	@OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
	public int anInt4895 = -1;

	@OriginalMember(owner = "client!nq", name = "Y", descriptor = "I")
	private int anInt4903 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public void method4171() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ef;IB)V")
	private void method4172(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4868 = arg0.method3104();
			this.anInt4875 = arg0.method3104();
			if (this.anInt4875 == 65535) {
				this.anInt4875 = -1;
			}
			if (this.anInt4868 == 65535) {
				this.anInt4868 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4879 = arg0.method3104();
		} else if (arg1 == 3) {
			this.anInt4895 = arg0.method3104();
		} else if (arg1 == 4) {
			this.anInt4866 = arg0.method3104();
		} else if (arg1 == 5) {
			this.anInt4893 = arg0.method3104();
		} else if (arg1 == 6) {
			this.anInt4869 = arg0.method3104();
		} else if (arg1 == 7) {
			this.anInt4870 = arg0.method3104();
		} else if (arg1 == 8) {
			this.anInt4873 = arg0.method3104();
		} else if (arg1 == 9) {
			this.anInt4881 = arg0.method3104();
		} else if (arg1 == 26) {
			this.anInt4900 = (short) (arg0.method3124() * 4);
			this.anInt4896 = (short) (arg0.method3124() * 4);
		} else {
			@Pc(95) int local95;
			@Pc(295) int local295;
			if (arg1 == 27) {
				if (this.anIntArrayArray43 == null) {
					this.anIntArrayArray43 = new int[12][];
				}
				local95 = arg0.method3124();
				this.anIntArrayArray43[local95] = new int[6];
				for (local295 = 0; local295 < 6; local295++) {
					this.anIntArrayArray43[local95][local295] = arg0.method3108();
				}
			} else if (arg1 == 28) {
				this.anIntArray357 = new int[12];
				for (local95 = 0; local95 < 12; local95++) {
					this.anIntArray357[local95] = arg0.method3124();
					if (this.anIntArray357[local95] == 255) {
						this.anIntArray357[local95] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4894 = arg0.method3124();
			} else if (arg1 == 30) {
				this.anInt4882 = arg0.method3104();
			} else if (arg1 == 31) {
				this.anInt4859 = arg0.method3124();
			} else if (arg1 == 32) {
				this.anInt4887 = arg0.method3104();
			} else if (arg1 == 33) {
				this.anInt4901 = arg0.method3108();
			} else if (arg1 == 34) {
				this.anInt4897 = arg0.method3124();
			} else if (arg1 == 35) {
				this.anInt4883 = arg0.method3104();
			} else if (arg1 == 36) {
				this.anInt4885 = arg0.method3108();
			} else if (arg1 == 37) {
				this.anInt4899 = arg0.method3124();
			} else if (arg1 == 38) {
				this.anInt4874 = arg0.method3104();
			} else if (arg1 == 39) {
				this.anInt4864 = arg0.method3104();
			} else if (arg1 == 40) {
				this.anInt4872 = arg0.method3104();
			} else if (arg1 == 41) {
				this.anInt4877 = arg0.method3104();
			} else if (arg1 == 42) {
				this.anInt4891 = arg0.method3104();
			} else if (arg1 == 43) {
				arg0.method3104();
			} else if (arg1 == 44) {
				this.anInt4890 = arg0.method3104();
			} else if (arg1 == 45) {
				this.anInt4889 = arg0.method3104();
			} else if (arg1 == 46) {
				this.anInt4898 = arg0.method3104();
			} else if (arg1 == 47) {
				this.anInt4886 = arg0.method3104();
			} else if (arg1 == 48) {
				this.anInt4862 = arg0.method3104();
			} else if (arg1 == 49) {
				this.anInt4902 = arg0.method3104();
			} else if (arg1 == 50) {
				this.anInt4871 = arg0.method3104();
			} else if (arg1 == 51) {
				this.anInt4860 = arg0.method3104();
			} else if (arg1 == 52) {
				local95 = arg0.method3124();
				this.anIntArray358 = new int[local95];
				this.anIntArray356 = new int[local95];
				for (local295 = 0; local295 < local95; local295++) {
					this.anIntArray356[local295] = arg0.method3104();
					@Pc(308) int local308 = arg0.method3124();
					this.anIntArray358[local295] = local308;
					this.anInt4903 += local308;
				}
			} else if (arg1 == 53) {
				this.aBoolean428 = false;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I")
	public int method4173() {
		if (this.anInt4868 != -1) {
			return this.anInt4868;
		} else if (this.anIntArray356 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) (Math.random() * (double) this.anInt4903);
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray358[local32] <= local30; local32++) {
				local30 -= this.anIntArray358[local32];
			}
			return this.anIntArray356[local32];
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!ef;)V")
	public void method4174(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3124();
			if (local9 == 0) {
				return;
			}
			this.method4172(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)Z")
	public boolean method4175(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4868) {
			return true;
		} else {
			if (this.anIntArray356 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray356.length; local26++) {
					if (this.anIntArray356[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
