import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class303 {

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "[Lclient!hba;")
	private Class115[] aClass115Array1;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private final int anInt8939 = -1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt8943 = -1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt8940 = -1;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public int anInt8944 = 0;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public int anInt8948 = -1;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	public int anInt8950 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public int anInt8938 = -1;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	public int anInt8959 = 0;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt8941 = 0;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public int anInt8953 = -1;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public int anInt8952 = -1;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "[I")
	public int[] anIntArray463 = null;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	public int anInt8956 = -1;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	public int anInt8958 = -1;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	public int anInt8961 = 0;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	public int anInt8954 = 0;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public int anInt8949 = -1;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	public int anInt8962 = 0;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	private int anInt8947 = 0;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	public int anInt8960 = -1;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public int anInt8957 = -1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt8945 = 0;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public int anInt8964 = -1;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public int anInt8946 = -1;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
	public int anInt8968 = -1;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	public int anInt8969 = -1;

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
	public int anInt8977 = -1;

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
	public int anInt8966 = -1;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	public int anInt8972 = 0;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	public int anInt8974 = 0;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	public int anInt8976 = -1;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public int anInt8971 = 0;

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	public int anInt8979 = -1;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[I")
	public int[] anIntArray464 = null;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
	public int anInt8973 = 0;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	public int anInt8978 = 0;

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
	public int anInt8980 = -1;

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
	public int anInt8983 = -1;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "Z")
	public boolean aBoolean726 = true;

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
	public int anInt8982 = -1;

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
	public int anInt8984 = -1;

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
	public int anInt8981 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ji;)V")
	public void method7362(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8246();
			if (local13 == 0) {
				return;
			}
			this.method7363(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method7363(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8977 = arg0.method8220();
			this.anInt8979 = arg0.method8220();
			if (this.anInt8977 == 65535) {
				this.anInt8977 = -1;
			}
			if (this.anInt8979 == 65535) {
				this.anInt8979 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt8948 = arg0.method8220();
		} else if (arg1 == 3) {
			this.anInt8976 = arg0.method8220();
		} else if (arg1 == 4) {
			this.anInt8957 = arg0.method8220();
		} else if (arg1 == 5) {
			this.anInt8982 = arg0.method8220();
		} else if (arg1 == 6) {
			this.anInt8969 = arg0.method8220();
		} else if (arg1 == 7) {
			this.anInt8943 = arg0.method8220();
		} else if (arg1 == 8) {
			this.anInt8938 = arg0.method8220();
		} else if (arg1 == 9) {
			this.anInt8981 = arg0.method8220();
		} else if (arg1 == 26) {
			this.anInt8944 = (short) (arg0.method8246() * 4);
			this.anInt8961 = (short) (arg0.method8246() * 4);
		} else {
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (arg1 == 27) {
				if (this.anIntArrayArray47 == null) {
					this.anIntArrayArray47 = new int[12][];
				}
				local96 = arg0.method8246();
				this.anIntArrayArray47[local96] = new int[6];
				for (local104 = 0; local104 < 6; local104++) {
					this.anIntArrayArray47[local96][local104] = arg0.method8231();
				}
			} else if (arg1 == 28) {
				this.anIntArray462 = new int[12];
				for (local96 = 0; local96 < 12; local96++) {
					this.anIntArray462[local96] = arg0.method8246();
					if (this.anIntArray462[local96] == 255) {
						this.anIntArray462[local96] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt8978 = arg0.method8246();
			} else if (arg1 == 30) {
				this.anInt8962 = arg0.method8220();
			} else if (arg1 == 31) {
				this.anInt8971 = arg0.method8246();
			} else if (arg1 == 32) {
				this.anInt8973 = arg0.method8220();
			} else if (arg1 == 33) {
				this.anInt8974 = arg0.method8231();
			} else if (arg1 == 34) {
				this.anInt8954 = arg0.method8246();
			} else if (arg1 == 35) {
				this.anInt8959 = arg0.method8220();
			} else if (arg1 == 36) {
				this.anInt8945 = arg0.method8231();
			} else if (arg1 == 37) {
				this.anInt8980 = arg0.method8246();
			} else if (arg1 == 38) {
				this.anInt8956 = arg0.method8220();
			} else if (arg1 == 39) {
				this.anInt8968 = arg0.method8220();
			} else if (arg1 == 40) {
				this.anInt8946 = arg0.method8220();
			} else if (arg1 == 41) {
				this.anInt8940 = arg0.method8220();
			} else if (arg1 == 42) {
				this.anInt8952 = arg0.method8220();
			} else if (arg1 == 43) {
				this.anInt8960 = arg0.method8220();
			} else if (arg1 == 44) {
				this.anInt8953 = arg0.method8220();
			} else if (arg1 == 45) {
				this.anInt8966 = arg0.method8220();
			} else if (arg1 == 46) {
				this.anInt8984 = arg0.method8220();
			} else if (arg1 == 47) {
				this.anInt8983 = arg0.method8220();
			} else if (arg1 == 48) {
				this.anInt8964 = arg0.method8220();
			} else if (arg1 == 49) {
				this.anInt8950 = arg0.method8220();
			} else if (arg1 == 50) {
				this.anInt8958 = arg0.method8220();
			} else if (arg1 == 51) {
				this.anInt8949 = arg0.method8220();
			} else if (arg1 == 52) {
				local96 = arg0.method8246();
				this.anIntArray464 = new int[local96];
				this.anIntArray463 = new int[local96];
				for (local104 = 0; local104 < local96; local104++) {
					this.anIntArray464[local104] = arg0.method8220();
					@Pc(426) int local426 = arg0.method8246();
					this.anIntArray463[local104] = local426;
					this.anInt8947 += local426;
				}
			} else if (arg1 == 53) {
				this.aBoolean726 = false;
				return;
			} else if (arg1 == 54) {
				this.anInt8941 = arg0.method8246() << 6;
				this.anInt8972 = arg0.method8246() << 6;
				return;
			} else if (arg1 == 55) {
				if (this.anIntArray461 == null) {
					this.anIntArray461 = new int[12];
				}
				local96 = arg0.method8246();
				this.anIntArray461[local96] = arg0.method8220();
				return;
			} else if (arg1 == 56) {
				if (this.anIntArrayArray46 == null) {
					this.anIntArrayArray46 = new int[12][];
				}
				local96 = arg0.method8246();
				this.anIntArrayArray46[local96] = new int[3];
				for (local104 = 0; local104 < 3; local104++) {
					this.anIntArrayArray46[local96][local104] = arg0.method8231();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public int method7365() {
		if (this.anInt8977 != -1) {
			return this.anInt8977;
		} else if (this.anIntArray464 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt8947);
			@Pc(33) int local33;
			for (local33 = 0; this.anIntArray463[local33] <= local31; local33++) {
				local31 -= this.anIntArray463[local33];
			}
			return this.anIntArray464[local33];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
	public boolean method7367(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt8977 == arg0) {
			return true;
		} else {
			if (this.anIntArray464 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray464.length; local34++) {
					if (this.anIntArray464[local34] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ha;B)[Lclient!hba;")
	public Class115[] method7368(@OriginalArg(0) Class5 arg0) {
		if (this.aClass115Array1 != null && arg0.anInt7303 == this.anInt8939) {
			return this.aClass115Array1;
		} else if (this.anIntArrayArray47 == null) {
			return null;
		} else {
			this.aClass115Array1 = new Class115[this.anIntArrayArray47.length];
			for (@Pc(37) int local37 = 0; local37 < this.anIntArrayArray47.length; local37++) {
				@Pc(41) int local41 = 0;
				@Pc(43) int local43 = 0;
				@Pc(45) int local45 = 0;
				@Pc(47) int local47 = 0;
				@Pc(49) int local49 = 0;
				@Pc(51) int local51 = 0;
				if (this.anIntArrayArray47[local37] != null) {
					local47 = this.anIntArrayArray47[local37][3] << 3;
					local45 = this.anIntArrayArray47[local37][2];
					local51 = this.anIntArrayArray47[local37][5] << 3;
					local49 = this.anIntArrayArray47[local37][4] << 3;
					local43 = this.anIntArrayArray47[local37][1];
					local41 = this.anIntArrayArray47[local37][0];
				}
				if (local41 != 0 || local43 != 0 || local45 != 0 || local47 != 0 || local49 != 0 || local51 != 0) {
					@Pc(139) Class115 local139 = this.aClass115Array1[local37] = arg0.method6184();
					if (local51 != 0) {
						local139.method6280(local51);
					}
					if (local47 != 0) {
						local139.method6295(local47);
					}
					if (local49 != 0) {
						local139.method6287(local49);
					}
					local139.method6296(local41, local43, local45);
				}
			}
			return this.aClass115Array1;
		}
	}
}
