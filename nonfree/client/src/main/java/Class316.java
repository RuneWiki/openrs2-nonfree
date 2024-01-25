import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class316 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tl", name = "U", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!tl", name = "ab", descriptor = "[Lclient!q;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public int anInt9119 = -1;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public int anInt9124 = -1;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public int anInt9125 = 0;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public int anInt9133 = 0;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	public int anInt9138 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public int anInt9118 = 0;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public int anInt9121 = -1;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
	public int[] anIntArray495 = null;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	public int anInt9142 = -1;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
	public int anInt9145 = -1;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public int anInt9126 = -1;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	public int anInt9139 = 0;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public int anInt9122 = -1;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	public int anInt9128 = -1;

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
	public int anInt9143 = -1;

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
	public int anInt9155 = -1;

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public int anInt9153 = -1;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	public int anInt9135 = -1;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
	public int[] anIntArray496 = null;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	public int anInt9137 = 0;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	public int anInt9120 = 0;

	@OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
	public int anInt9146 = -1;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	public int anInt9134 = -1;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	private final int anInt9127 = -1;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	public int anInt9123 = 0;

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
	public int anInt9156 = -1;

	@OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
	public int anInt9149 = -1;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	public int anInt9147 = -1;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	public int anInt9144 = 0;

	@OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
	public int anInt9158 = -1;

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
	public int anInt9151 = -1;

	@OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
	public int anInt9161 = 0;

	@OriginalMember(owner = "client!tl", name = "T", descriptor = "Z")
	public boolean aBoolean639 = true;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
	private int anInt9154 = 0;

	@OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
	public int anInt9160 = -1;

	@OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
	public int anInt9163 = 0;

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
	public int anInt9150 = 0;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public int anInt9131 = -1;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
	public int anInt9152 = -1;

	@OriginalMember(owner = "client!tl", name = "cb", descriptor = "I")
	public int anInt9164 = 0;

	@OriginalMember(owner = "client!tl", name = "Y", descriptor = "I")
	public int anInt9162 = -1;

	@OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
	public int anInt9157 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
	public boolean method7457(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt9122) {
			return true;
		} else {
			if (this.anIntArray496 != null) {
				for (@Pc(21) int local21 = 0; local21 < this.anIntArray496.length; local21++) {
					if (this.anIntArray496[local21] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!un;II)V")
	private void method7459(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9122 = arg0.method4936();
			this.anInt9128 = arg0.method4936();
			if (this.anInt9122 == 65535) {
				this.anInt9122 = -1;
			}
			if (this.anInt9128 == 65535) {
				this.anInt9128 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt9149 = arg0.method4936();
		} else if (arg1 == 3) {
			this.anInt9151 = arg0.method4936();
		} else if (arg1 == 4) {
			this.anInt9138 = arg0.method4936();
		} else if (arg1 == 5) {
			this.anInt9162 = arg0.method4936();
		} else if (arg1 == 6) {
			this.anInt9146 = arg0.method4936();
		} else if (arg1 == 7) {
			this.anInt9142 = arg0.method4936();
		} else if (arg1 == 8) {
			this.anInt9121 = arg0.method4936();
		} else if (arg1 == 9) {
			this.anInt9157 = arg0.method4936();
		} else if (arg1 == 26) {
			this.anInt9118 = (short) (arg0.method4905() * 4);
			this.anInt9144 = (short) (arg0.method4905() * 4);
		} else {
			@Pc(277) int local277;
			@Pc(287) int local287;
			if (arg1 == 27) {
				if (this.anIntArrayArray56 == null) {
					this.anIntArrayArray56 = new int[12][];
				}
				local277 = arg0.method4905();
				this.anIntArrayArray56[local277] = new int[6];
				for (local287 = 0; local287 < 6; local287++) {
					this.anIntArrayArray56[local277][local287] = arg0.method4946();
				}
			} else if (arg1 == 28) {
				this.anIntArray494 = new int[12];
				for (local277 = 0; local277 < 12; local277++) {
					this.anIntArray494[local277] = arg0.method4905();
					if (this.anIntArray494[local277] == 255) {
						this.anIntArray494[local277] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt9120 = arg0.method4905();
			} else if (arg1 == 30) {
				this.anInt9161 = arg0.method4936();
			} else if (arg1 == 31) {
				this.anInt9125 = arg0.method4905();
			} else if (arg1 == 32) {
				this.anInt9163 = arg0.method4936();
			} else if (arg1 == 33) {
				this.anInt9139 = arg0.method4946();
			} else if (arg1 == 34) {
				this.anInt9133 = arg0.method4905();
			} else if (arg1 == 35) {
				this.anInt9150 = arg0.method4936();
			} else if (arg1 == 36) {
				this.anInt9164 = arg0.method4946();
			} else if (arg1 == 37) {
				this.anInt9153 = arg0.method4905();
			} else if (arg1 == 38) {
				this.anInt9160 = arg0.method4936();
			} else if (arg1 == 39) {
				this.anInt9145 = arg0.method4936();
			} else if (arg1 == 40) {
				this.anInt9155 = arg0.method4936();
			} else if (arg1 == 41) {
				this.anInt9124 = arg0.method4936();
			} else if (arg1 == 42) {
				this.anInt9119 = arg0.method4936();
			} else if (arg1 == 43) {
				this.anInt9134 = arg0.method4936();
			} else if (arg1 == 44) {
				this.anInt9126 = arg0.method4936();
			} else if (arg1 == 45) {
				this.anInt9147 = arg0.method4936();
			} else if (arg1 == 46) {
				this.anInt9156 = arg0.method4936();
			} else if (arg1 == 47) {
				this.anInt9131 = arg0.method4936();
			} else if (arg1 == 48) {
				this.anInt9152 = arg0.method4936();
			} else if (arg1 == 49) {
				this.anInt9158 = arg0.method4936();
			} else if (arg1 == 50) {
				this.anInt9143 = arg0.method4936();
			} else if (arg1 == 51) {
				this.anInt9135 = arg0.method4936();
			} else if (arg1 == 52) {
				local277 = arg0.method4905();
				this.anIntArray495 = new int[local277];
				this.anIntArray496 = new int[local277];
				for (local287 = 0; local287 < local277; local287++) {
					this.anIntArray496[local287] = arg0.method4936();
					@Pc(300) int local300 = arg0.method4905();
					this.anIntArray495[local287] = local300;
					this.anInt9154 += local300;
				}
			} else if (arg1 == 53) {
				this.aBoolean639 = false;
			} else if (arg1 == 54) {
				this.anInt9137 = arg0.method4905() << 6;
				this.anInt9123 = arg0.method4905() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray497 == null) {
					this.anIntArray497 = new int[12];
				}
				local277 = arg0.method4905();
				this.anIntArray497[local277] = arg0.method4936();
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!r;I)[Lclient!q;")
	public Class8[] method7461(@OriginalArg(0) Class44 arg0) {
		if (this.aClass8Array1 != null && arg0.anInt5872 == this.anInt9127) {
			return this.aClass8Array1;
		} else if (this.anIntArrayArray56 == null) {
			return null;
		} else {
			this.aClass8Array1 = new Class8[this.anIntArrayArray56.length];
			for (@Pc(38) int local38 = 0; local38 < this.anIntArrayArray56.length; local38++) {
				@Pc(42) int local42 = 0;
				@Pc(44) int local44 = 0;
				@Pc(46) int local46 = 0;
				@Pc(48) int local48 = 0;
				@Pc(50) int local50 = 0;
				@Pc(52) int local52 = 0;
				if (this.anIntArrayArray56[local38] != null) {
					local50 = this.anIntArrayArray56[local38][4] << 3;
					local42 = this.anIntArrayArray56[local38][0];
					local44 = this.anIntArrayArray56[local38][1];
					local46 = this.anIntArrayArray56[local38][2];
					local52 = this.anIntArrayArray56[local38][5] << 3;
					local48 = this.anIntArrayArray56[local38][3] << 3;
				}
				if (local42 != 0 || local44 != 0 || local46 != 0 || local48 != 0 || local50 != 0 || local52 != 0) {
					@Pc(134) Class8 local134 = this.aClass8Array1[local38] = arg0.method5025();
					if (local52 != 0) {
						local134.AA(local52);
					}
					if (local48 != 0) {
						local134.w(local48);
					}
					if (local50 != 0) {
						local134.ZA(local50);
					}
					local134.U(local42, local44, local46);
				}
			}
			return this.aClass8Array1;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	public int method7462() {
		if (this.anInt9122 != -1) {
			return this.anInt9122;
		} else if (this.anIntArray496 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt9154);
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray495[local31]; local31++) {
				local29 -= this.anIntArray495[local31];
			}
			return this.anIntArray496[local31];
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!un;)V")
	public void method7463(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method7459(arg0, local5);
		}
	}
}
