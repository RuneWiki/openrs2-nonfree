import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class165 {

	@OriginalMember(owner = "client!is", name = "g", descriptor = "[Lclient!kd;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!is", name = "U", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!is", name = "eb", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public int anInt4880 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	private int anInt4873 = 0;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public int anInt4875 = -1;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public int anInt4879 = -1;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt4877 = -1;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public int anInt4878 = -1;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "I")
	public int anInt4899 = -1;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "I")
	public int anInt4881 = -1;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "I")
	public int anInt4882 = 0;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "I")
	public int anInt4886 = 0;

	@OriginalMember(owner = "client!is", name = "v", descriptor = "I")
	public int anInt4889 = -1;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "I")
	public int anInt4902 = -1;

	@OriginalMember(owner = "client!is", name = "M", descriptor = "I")
	public int anInt4905 = -1;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "I")
	public int anInt4898 = 0;

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public int anInt4893 = 0;

	@OriginalMember(owner = "client!is", name = "I", descriptor = "I")
	public int anInt4901 = -1;

	@OriginalMember(owner = "client!is", name = "t", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!is", name = "R", descriptor = "[I")
	public int[] anIntArray335 = null;

	@OriginalMember(owner = "client!is", name = "w", descriptor = "I")
	public int anInt4890 = -1;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public int anInt4876 = 0;

	@OriginalMember(owner = "client!is", name = "T", descriptor = "I")
	public int anInt4910 = -1;

	@OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
	public int anInt4908 = -1;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "I")
	public int anInt4900 = -1;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "I")
	public int anInt4883 = 0;

	@OriginalMember(owner = "client!is", name = "X", descriptor = "I")
	public int anInt4912 = -1;

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	public int anInt4903 = -1;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "I")
	public int anInt4896 = 0;

	@OriginalMember(owner = "client!is", name = "S", descriptor = "I")
	public int anInt4909 = 0;

	@OriginalMember(owner = "client!is", name = "x", descriptor = "I")
	public int anInt4891 = 0;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "I")
	private final int anInt4906 = -1;

	@OriginalMember(owner = "client!is", name = "E", descriptor = "I")
	public int anInt4897 = -1;

	@OriginalMember(owner = "client!is", name = "ab", descriptor = "I")
	public int anInt4915 = -1;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	public int anInt4895 = 0;

	@OriginalMember(owner = "client!is", name = "O", descriptor = "I")
	public int anInt4907 = -1;

	@OriginalMember(owner = "client!is", name = "Y", descriptor = "I")
	public int anInt4913 = -1;

	@OriginalMember(owner = "client!is", name = "P", descriptor = "[I")
	public int[] anIntArray334 = null;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "I")
	public int anInt4894 = 0;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "I")
	public int anInt4887 = -1;

	@OriginalMember(owner = "client!is", name = "db", descriptor = "I")
	public int anInt4918 = -1;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "I")
	public int anInt4888 = -1;

	@OriginalMember(owner = "client!is", name = "bb", descriptor = "I")
	public int anInt4916 = -1;

	@OriginalMember(owner = "client!is", name = "Z", descriptor = "I")
	public int anInt4914 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Z")
	public boolean method4048(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt4890 == arg0) {
			return true;
		} else {
			if (this.anIntArray335 != null) {
				for (@Pc(28) int local28 = 0; local28 < this.anIntArray335.length; local28++) {
					if (this.anIntArray335[local28] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method4050(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6904();
			if (local15 == 0) {
				return;
			}
			this.method4053(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ha;B)[Lclient!kd;")
	public Class6[] method4052(@OriginalArg(0) Class87 arg0) {
		if (this.aClass6Array1 != null && arg0.anInt9444 == this.anInt4906) {
			return this.aClass6Array1;
		} else if (this.anIntArrayArray39 == null) {
			return null;
		} else {
			this.aClass6Array1 = new Class6[this.anIntArrayArray39.length];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray39.length; local31++) {
				@Pc(34) int local34 = 0;
				@Pc(36) int local36 = 0;
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				@Pc(42) int local42 = 0;
				@Pc(44) int local44 = 0;
				if (this.anIntArrayArray39[local31] != null) {
					local38 = this.anIntArrayArray39[local31][2];
					local42 = this.anIntArrayArray39[local31][4] << 3;
					local40 = this.anIntArrayArray39[local31][3] << 3;
					local44 = this.anIntArrayArray39[local31][5] << 3;
					local36 = this.anIntArrayArray39[local31][1];
					local34 = this.anIntArrayArray39[local31][0];
				}
				if (local34 != 0 || local36 != 0 || local38 != 0 || local40 != 0 || local42 != 0 || local44 != 0) {
					@Pc(129) Class6 local129 = this.aClass6Array1[local31] = arg0.method7910();
					if (local44 != 0) {
						local129.method6711(local44);
					}
					if (local40 != 0) {
						local129.method6705(local40);
					}
					if (local42 != 0) {
						local129.method6708(local42);
					}
					local129.method6694(local34, local36, local38);
				}
			}
			return this.aClass6Array1;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ud;I)V")
	private void method4053(@OriginalArg(1) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4890 = arg0.method6884();
			this.anInt4908 = arg0.method6884();
			if (this.anInt4908 == 65535) {
				this.anInt4908 = -1;
			}
			if (this.anInt4890 == 65535) {
				this.anInt4890 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt4899 = arg0.method6884();
			return;
		} else if (arg1 == 3) {
			this.anInt4916 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt4910 = arg0.method6884();
			return;
		} else if (arg1 == 5) {
			this.anInt4902 = arg0.method6884();
			return;
		} else if (arg1 == 6) {
			this.anInt4881 = arg0.method6884();
			return;
		} else if (arg1 == 7) {
			this.anInt4914 = arg0.method6884();
			return;
		} else if (arg1 == 8) {
			this.anInt4875 = arg0.method6884();
			return;
		} else if (arg1 == 9) {
			this.anInt4905 = arg0.method6884();
			return;
		} else if (arg1 == 26) {
			this.anInt4883 = (short) (arg0.method6904() * 4);
			this.anInt4898 = (short) (arg0.method6904() * 4);
			return;
		} else {
			@Pc(131) int local131;
			@Pc(139) int local139;
			if (arg1 == 27) {
				if (this.anIntArrayArray39 == null) {
					this.anIntArrayArray39 = new int[12][];
				}
				local131 = arg0.method6904();
				this.anIntArrayArray39[local131] = new int[6];
				for (local139 = 0; local139 < 6; local139++) {
					this.anIntArrayArray39[local131][local139] = arg0.method6856();
				}
				return;
			}
			if (arg1 == 28) {
				this.anIntArray333 = new int[12];
				for (local131 = 0; local131 < 12; local131++) {
					this.anIntArray333[local131] = arg0.method6904();
					if (this.anIntArray333[local131] == 255) {
						this.anIntArray333[local131] = -1;
					}
				}
				return;
			}
			if (arg1 == 29) {
				this.anInt4895 = arg0.method6904();
				return;
			}
			if (arg1 == 30) {
				this.anInt4880 = arg0.method6884();
				return;
			}
			if (arg1 == 31) {
				this.anInt4893 = arg0.method6904();
				return;
			}
			if (arg1 == 32) {
				this.anInt4876 = arg0.method6884();
				return;
			}
			if (arg1 == 33) {
				this.anInt4891 = arg0.method6856();
				return;
			}
			if (arg1 == 34) {
				this.anInt4882 = arg0.method6904();
				return;
			}
			if (arg1 == 35) {
				this.anInt4886 = arg0.method6884();
				return;
			}
			if (arg1 == 36) {
				this.anInt4896 = arg0.method6856();
				return;
			}
			if (arg1 == 37) {
				this.anInt4912 = arg0.method6904();
				return;
			}
			if (arg1 == 38) {
				this.anInt4903 = arg0.method6884();
				return;
			}
			if (arg1 == 39) {
				this.anInt4915 = arg0.method6884();
				return;
			}
			if (arg1 == 40) {
				this.anInt4888 = arg0.method6884();
				return;
			}
			if (arg1 == 41) {
				this.anInt4913 = arg0.method6884();
				return;
			}
			if (arg1 == 42) {
				this.anInt4918 = arg0.method6884();
				return;
			}
			if (arg1 == 43) {
				this.anInt4877 = arg0.method6884();
				return;
			}
			if (arg1 == 44) {
				this.anInt4878 = arg0.method6884();
				return;
			}
			if (arg1 == 45) {
				this.anInt4907 = arg0.method6884();
				return;
			}
			if (arg1 == 46) {
				this.anInt4897 = arg0.method6884();
				return;
			}
			if (arg1 == 47) {
				this.anInt4879 = arg0.method6884();
				return;
			}
			if (arg1 == 48) {
				this.anInt4900 = arg0.method6884();
				return;
			}
			if (arg1 == 49) {
				this.anInt4887 = arg0.method6884();
				return;
			}
			if (arg1 == 50) {
				this.anInt4889 = arg0.method6884();
				return;
			}
			if (arg1 == 51) {
				this.anInt4901 = arg0.method6884();
				return;
			}
			if (arg1 != 52) {
				if (arg1 != 53) {
					if (arg1 == 54) {
						this.anInt4894 = arg0.method6904() << 6;
						this.anInt4909 = arg0.method6904() << 6;
						return;
					}
					if (arg1 == 55) {
						if (this.anIntArray336 == null) {
							this.anIntArray336 = new int[12];
						}
						local131 = arg0.method6904();
						this.anIntArray336[local131] = arg0.method6884();
					} else if (arg1 == 56) {
						if (this.anIntArrayArray40 == null) {
							this.anIntArrayArray40 = new int[12][];
						}
						local131 = arg0.method6904();
						this.anIntArrayArray40[local131] = new int[3];
						for (local139 = 0; local139 < 3; local139++) {
							this.anIntArrayArray40[local131][local139] = arg0.method6856();
						}
						return;
					}
					return;
				}
				this.aBoolean395 = false;
				return;
			}
			local131 = arg0.method6904();
			this.anIntArray334 = new int[local131];
			this.anIntArray335 = new int[local131];
			for (local139 = 0; local139 < local131; local139++) {
				this.anIntArray335[local139] = arg0.method6884();
				@Pc(489) int local489 = arg0.method6904();
				this.anIntArray334[local139] = local489;
				this.anInt4873 += local489;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
	public int method4056() {
		if (this.anInt4890 != -1) {
			return this.anInt4890;
		} else if (this.anIntArray335 == null) {
			return -1;
		} else {
			@Pc(27) int local27 = (int) (Math.random() * (double) this.anInt4873);
			@Pc(29) int local29;
			for (local29 = 0; local27 >= this.anIntArray334[local29]; local29++) {
				local27 -= this.anIntArray334[local29];
			}
			return this.anIntArray335[local29];
		}
	}
}
