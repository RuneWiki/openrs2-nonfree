import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class334 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
	public int[] anIntArray604;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "[Lclient!uha;")
	private Class177[] aClass177Array1;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "[I")
	public int[] anIntArray607;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public int anInt8910 = -1;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public int anInt8912 = -1;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
	public int[] anIntArray606 = null;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[I")
	public int[] anIntArray605 = null;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	public int anInt8914 = -1;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	private final int anInt8909 = -1;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	public int anInt8922 = -1;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
	public int anInt8931 = -1;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public int anInt8913 = -1;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
	public int anInt8924 = -1;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
	public int anInt8930 = -1;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	public int anInt8942 = -1;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	public int anInt8936 = -1;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	public int anInt8929 = -1;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public int anInt8917 = -1;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
	public int anInt8940 = 0;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	public int anInt8923 = 0;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public int anInt8919 = -1;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	public int anInt8939 = -1;

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
	public int anInt8949 = 0;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
	public int anInt8948 = -1;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
	public int anInt8935 = -1;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
	public int anInt8937 = -1;

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
	public int anInt8946 = 0;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public int anInt8921 = -1;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
	public int anInt8943 = -1;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
	public int anInt8950 = 0;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
	public int anInt8941 = 0;

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
	public int anInt8951 = 0;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
	public int anInt8911 = 0;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
	public int anInt8925 = 0;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public int anInt8926 = -1;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
	public int anInt8932 = -1;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	public int anInt8944 = -1;

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
	public int anInt8955 = 0;

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
	private int anInt8952 = 0;

	@OriginalMember(owner = "client!tf", name = "fb", descriptor = "Z")
	public boolean aBoolean669 = true;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
	public int anInt8954 = -1;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	public int anInt8953 = -1;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
	public int anInt8956 = 0;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	public int anInt8945 = -1;

	@OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
	public int anInt8947 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!ha;)[Lclient!uha;")
	public Class177[] method7492(@OriginalArg(1) Class95 arg0) {
		if (this.aClass177Array1 != null && arg0.anInt8154 == this.anInt8909) {
			return this.aClass177Array1;
		} else if (this.anIntArrayArray58 == null) {
			return null;
		} else {
			this.aClass177Array1 = new Class177[this.anIntArrayArray58.length];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArrayArray58.length; local41++) {
				@Pc(45) int local45 = 0;
				@Pc(47) int local47 = 0;
				@Pc(49) int local49 = 0;
				@Pc(51) int local51 = 0;
				@Pc(53) int local53 = 0;
				@Pc(55) int local55 = 0;
				if (this.anIntArrayArray58[local41] != null) {
					local49 = this.anIntArrayArray58[local41][2];
					local55 = this.anIntArrayArray58[local41][5] << 3;
					local53 = this.anIntArrayArray58[local41][4] << 3;
					local51 = this.anIntArrayArray58[local41][3] << 3;
					local45 = this.anIntArrayArray58[local41][0];
					local47 = this.anIntArrayArray58[local41][1];
				}
				if (local45 != 0 || local47 != 0 || local49 != 0 || local51 != 0 || local53 != 0 || local55 != 0) {
					@Pc(146) Class177 local146 = this.aClass177Array1[local41] = arg0.method7001();
					if (local55 != 0) {
						local146.method7873(local55);
					}
					if (local51 != 0) {
						local146.method7883(local51);
					}
					if (local53 != 0) {
						local146.method7874(local53);
					}
					local146.method7872(local45, local47, local49);
				}
			}
			return this.aClass177Array1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!vj;)V")
	public void method7496(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method7498(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
	public boolean method7497(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt8932) {
			return true;
		} else {
			if (this.anIntArray606 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray606.length; local27++) {
					if (this.anIntArray606[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BILclient!vj;)V")
	private void method7498(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt8932 = arg1.method8546();
			this.anInt8942 = arg1.method8546();
			if (this.anInt8942 == 65535) {
				this.anInt8942 = -1;
			}
			if (this.anInt8932 == 65535) {
				this.anInt8932 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt8943 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt8913 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt8926 = arg1.method8546();
		} else if (arg0 == 5) {
			this.anInt8930 = arg1.method8546();
		} else if (arg0 == 6) {
			this.anInt8919 = arg1.method8546();
		} else if (arg0 == 7) {
			this.anInt8931 = arg1.method8546();
		} else if (arg0 == 8) {
			this.anInt8921 = arg1.method8546();
		} else if (arg0 == 9) {
			this.anInt8945 = arg1.method8546();
		} else if (arg0 == 26) {
			this.anInt8947 = (short) (arg1.method8547() * 4);
			this.anInt8951 = (short) (arg1.method8547() * 4);
		} else {
			@Pc(98) int local98;
			@Pc(322) int local322;
			if (arg0 == 27) {
				if (this.anIntArrayArray58 == null) {
					this.anIntArrayArray58 = new int[12][];
				}
				local98 = arg1.method8547();
				this.anIntArrayArray58[local98] = new int[6];
				for (local322 = 0; local322 < 6; local322++) {
					this.anIntArrayArray58[local98][local322] = arg1.method8526();
				}
			} else if (arg0 == 28) {
				this.anIntArray607 = new int[12];
				for (local98 = 0; local98 < 12; local98++) {
					this.anIntArray607[local98] = arg1.method8547();
					if (this.anIntArray607[local98] == 255) {
						this.anIntArray607[local98] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt8925 = arg1.method8547();
			} else if (arg0 == 30) {
				this.anInt8956 = arg1.method8546();
			} else if (arg0 == 31) {
				this.anInt8946 = arg1.method8547();
			} else if (arg0 == 32) {
				this.anInt8940 = arg1.method8546();
			} else if (arg0 == 33) {
				this.anInt8911 = arg1.method8526();
			} else if (arg0 == 34) {
				this.anInt8949 = arg1.method8547();
			} else if (arg0 == 35) {
				this.anInt8941 = arg1.method8546();
			} else if (arg0 == 36) {
				this.anInt8955 = arg1.method8526();
			} else if (arg0 == 37) {
				this.anInt8944 = arg1.method8547();
			} else if (arg0 == 38) {
				this.anInt8924 = arg1.method8546();
			} else if (arg0 == 39) {
				this.anInt8910 = arg1.method8546();
			} else if (arg0 == 40) {
				this.anInt8935 = arg1.method8546();
			} else if (arg0 == 41) {
				this.anInt8914 = arg1.method8546();
			} else if (arg0 == 42) {
				this.anInt8922 = arg1.method8546();
			} else if (arg0 == 43) {
				this.anInt8953 = arg1.method8546();
			} else if (arg0 == 44) {
				this.anInt8954 = arg1.method8546();
			} else if (arg0 == 45) {
				this.anInt8912 = arg1.method8546();
			} else if (arg0 == 46) {
				this.anInt8948 = arg1.method8546();
			} else if (arg0 == 47) {
				this.anInt8939 = arg1.method8546();
			} else if (arg0 == 48) {
				this.anInt8937 = arg1.method8546();
			} else if (arg0 == 49) {
				this.anInt8936 = arg1.method8546();
			} else if (arg0 == 50) {
				this.anInt8917 = arg1.method8546();
			} else if (arg0 == 51) {
				this.anInt8929 = arg1.method8546();
			} else if (arg0 == 52) {
				local98 = arg1.method8547();
				this.anIntArray606 = new int[local98];
				this.anIntArray605 = new int[local98];
				for (local322 = 0; local322 < local98; local322++) {
					this.anIntArray606[local322] = arg1.method8546();
					@Pc(409) int local409 = arg1.method8547();
					this.anIntArray605[local322] = local409;
					this.anInt8952 += local409;
				}
			} else if (arg0 == 53) {
				this.aBoolean669 = false;
			} else if (arg0 == 54) {
				this.anInt8923 = arg1.method8547() << 6;
				this.anInt8950 = arg1.method8547() << 6;
			} else if (arg0 == 55) {
				if (this.anIntArray604 == null) {
					this.anIntArray604 = new int[12];
				}
				local98 = arg1.method8547();
				this.anIntArray604[local98] = arg1.method8546();
			} else if (arg0 == 56) {
				if (this.anIntArrayArray59 == null) {
					this.anIntArrayArray59 = new int[12][];
				}
				local98 = arg1.method8547();
				this.anIntArrayArray59[local98] = new int[3];
				for (local322 = 0; local322 < 3; local322++) {
					this.anIntArrayArray59[local98][local322] = arg1.method8526();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public int method7500() {
		if (this.anInt8932 != -1) {
			return this.anInt8932;
		} else if (this.anIntArray606 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt8952);
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray605[local31]; local31++) {
				local29 -= this.anIntArray605[local31];
			}
			return this.anIntArray606[local31];
		}
	}
}
