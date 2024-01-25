import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class118 {

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!jn", name = "X", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public int anInt2958 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt2953 = 0;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "[I")
	private int[] anIntArray289 = null;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
	public int anInt2964 = -1;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	public int anInt2956 = -1;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt2957 = -1;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	public int anInt2967 = -1;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	public int anInt2962 = -1;

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
	public int anInt2972 = -1;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
	public int anInt2975 = 0;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public int anInt2955 = -1;

	@OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
	private int anInt2987 = 0;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
	public int anInt2969 = -1;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public int anInt2954 = -1;

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
	public int anInt2986 = 0;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
	public int anInt2966 = -1;

	@OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
	public int anInt2979 = -1;

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
	public int anInt2971 = -1;

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
	public int anInt2970 = -1;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "[I")
	private int[] anIntArray288 = null;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public int anInt2961 = -1;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
	public int anInt2968 = -1;

	@OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
	public int anInt2982 = -1;

	@OriginalMember(owner = "client!jn", name = "V", descriptor = "I")
	public int anInt2992 = 0;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
	public int anInt2973 = 0;

	@OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
	public int anInt2984 = -1;

	@OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
	public int anInt2981 = -1;

	@OriginalMember(owner = "client!jn", name = "R", descriptor = "Z")
	public boolean aBoolean229 = true;

	@OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
	public int anInt2991 = -1;

	@OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
	public int anInt2989 = 0;

	@OriginalMember(owner = "client!jn", name = "T", descriptor = "I")
	public int anInt2990 = -1;

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
	public int anInt2983 = 0;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public int anInt2959 = 0;

	@OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
	public int anInt2988 = -1;

	@OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
	public int anInt2985 = -1;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
	public int anInt2974 = -1;

	@OriginalMember(owner = "client!jn", name = "Y", descriptor = "I")
	public int anInt2994 = 0;

	@OriginalMember(owner = "client!jn", name = "W", descriptor = "I")
	public int anInt2993 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
	public boolean method2553(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2979) {
			return true;
		} else {
			if (this.anIntArray289 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray289.length; local26++) {
					if (this.anIntArray289[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method2554() {
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	public int method2555() {
		if (this.anInt2979 != -1) {
			return this.anInt2979;
		} else if (this.anIntArray289 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt2987);
			@Pc(33) int local33;
			for (local33 = 0; local31 >= this.anIntArray288[local33]; local33++) {
				local31 -= this.anIntArray288[local33];
			}
			return this.anIntArray289[local33];
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method2557(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5720();
			if (local17 == 0) {
				return;
			}
			this.method2558(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!nj;)V")
	private void method2558(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt2979 = arg1.method5715();
			this.anInt2993 = arg1.method5715();
			if (this.anInt2979 == 65535) {
				this.anInt2979 = -1;
			}
			if (this.anInt2993 == 65535) {
				this.anInt2993 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2974 = arg1.method5715();
		} else if (arg0 == 3) {
			this.anInt2984 = arg1.method5715();
		} else if (arg0 == 4) {
			this.anInt2957 = arg1.method5715();
		} else if (arg0 == 5) {
			this.anInt2991 = arg1.method5715();
		} else if (arg0 == 6) {
			this.anInt2967 = arg1.method5715();
		} else if (arg0 == 7) {
			this.anInt2970 = arg1.method5715();
		} else if (arg0 == 8) {
			this.anInt2968 = arg1.method5715();
		} else if (arg0 == 9) {
			this.anInt2969 = arg1.method5715();
		} else if (arg0 == 26) {
			this.anInt2986 = (short) (arg1.method5720() * 4);
			this.anInt2958 = (short) (arg1.method5720() * 4);
		} else {
			@Pc(93) int local93;
			@Pc(101) int local101;
			if (arg0 == 27) {
				if (this.anIntArrayArray26 == null) {
					this.anIntArrayArray26 = new int[12][];
				}
				local93 = arg1.method5720();
				this.anIntArrayArray26[local93] = new int[6];
				for (local101 = 0; local101 < 6; local101++) {
					this.anIntArrayArray26[local93][local101] = arg1.method5691();
				}
			} else if (arg0 == 28) {
				this.anIntArray290 = new int[12];
				for (local93 = 0; local93 < 12; local93++) {
					this.anIntArray290[local93] = arg1.method5720();
					if (this.anIntArray290[local93] == 255) {
						this.anIntArray290[local93] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt2953 = arg1.method5720();
			} else if (arg0 == 30) {
				this.anInt2983 = arg1.method5715();
			} else if (arg0 == 31) {
				this.anInt2973 = arg1.method5720();
			} else if (arg0 == 32) {
				this.anInt2989 = arg1.method5715();
			} else if (arg0 == 33) {
				this.anInt2959 = arg1.method5691();
			} else if (arg0 == 34) {
				this.anInt2994 = arg1.method5720();
			} else if (arg0 == 35) {
				this.anInt2992 = arg1.method5715();
			} else if (arg0 == 36) {
				this.anInt2975 = arg1.method5691();
			} else if (arg0 == 37) {
				this.anInt2954 = arg1.method5720();
			} else if (arg0 == 38) {
				this.anInt2966 = arg1.method5715();
			} else if (arg0 == 39) {
				this.anInt2964 = arg1.method5715();
			} else if (arg0 == 40) {
				this.anInt2990 = arg1.method5715();
			} else if (arg0 == 41) {
				this.anInt2971 = arg1.method5715();
			} else if (arg0 == 42) {
				this.anInt2962 = arg1.method5715();
			} else if (arg0 == 43) {
				arg1.method5715();
			} else if (arg0 == 44) {
				this.anInt2955 = arg1.method5715();
			} else if (arg0 == 45) {
				this.anInt2972 = arg1.method5715();
			} else if (arg0 == 46) {
				this.anInt2985 = arg1.method5715();
			} else if (arg0 == 47) {
				this.anInt2956 = arg1.method5715();
			} else if (arg0 == 48) {
				this.anInt2961 = arg1.method5715();
			} else if (arg0 == 49) {
				this.anInt2988 = arg1.method5715();
			} else if (arg0 == 50) {
				this.anInt2982 = arg1.method5715();
			} else if (arg0 == 51) {
				this.anInt2981 = arg1.method5715();
			} else if (arg0 == 52) {
				local93 = arg1.method5720();
				this.anIntArray288 = new int[local93];
				this.anIntArray289 = new int[local93];
				for (local101 = 0; local101 < local93; local101++) {
					this.anIntArray289[local101] = arg1.method5715();
					@Pc(312) int local312 = arg1.method5720();
					this.anIntArray288[local101] = local312;
					this.anInt2987 += local312;
				}
				return;
			} else if (arg0 == 53) {
				this.aBoolean229 = false;
				return;
			}
		}
	}
}
