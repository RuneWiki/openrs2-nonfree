import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class142 {

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
	public int anInt4155 = -1;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public int anInt4151 = -1;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
	public int anInt4160 = 0;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	public int anInt4157 = -1;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
	public int anInt4164 = -1;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public int anInt4169 = -1;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public int anInt4159 = -1;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public int anInt4156 = 0;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
	public int anInt4165 = -1;

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
	public int anInt4179 = 0;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
	public int anInt4153 = -1;

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "I")
	public int anInt4175 = -1;

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
	public int anInt4183 = -1;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
	public int anInt4171 = 0;

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "I")
	public int anInt4181 = -1;

	@OriginalMember(owner = "client!lt", name = "P", descriptor = "I")
	public int anInt4189 = 0;

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
	public int anInt4182 = -1;

	@OriginalMember(owner = "client!lt", name = "V", descriptor = "I")
	public int anInt4194 = 0;

	@OriginalMember(owner = "client!lt", name = "U", descriptor = "I")
	public int anInt4193 = -1;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	public int anInt4167 = 0;

	@OriginalMember(owner = "client!lt", name = "T", descriptor = "I")
	public int anInt4192 = 0;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
	public int anInt4163 = -1;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public int anInt4162 = -1;

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "I")
	public int anInt4176 = -1;

	@OriginalMember(owner = "client!lt", name = "Q", descriptor = "[I")
	public int[] anIntArray278 = null;

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "I")
	public int anInt4173 = -1;

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "[I")
	public int[] anIntArray277 = null;

	@OriginalMember(owner = "client!lt", name = "R", descriptor = "I")
	private int anInt4190 = 0;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
	public int anInt4166 = -1;

	@OriginalMember(owner = "client!lt", name = "X", descriptor = "I")
	public int anInt4196 = -1;

	@OriginalMember(owner = "client!lt", name = "S", descriptor = "I")
	public int anInt4191 = -1;

	@OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
	public int anInt4177 = -1;

	@OriginalMember(owner = "client!lt", name = "z", descriptor = "I")
	public int anInt4174 = -1;

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
	public int anInt4178 = 0;

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
	public int anInt4170 = -1;

	@OriginalMember(owner = "client!lt", name = "O", descriptor = "I")
	public int anInt4188 = 0;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
	public int anInt4172 = 0;

	@OriginalMember(owner = "client!lt", name = "W", descriptor = "I")
	public int anInt4195 = -1;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	public int anInt4152 = 0;

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
	public int anInt4186 = -1;

	@OriginalMember(owner = "client!lt", name = "Y", descriptor = "Z")
	public boolean aBoolean300 = true;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBLclient!nj;)V")
	private void method3510(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt4174 = arg1.method4083();
			this.anInt4162 = arg1.method4083();
			if (this.anInt4174 == 65535) {
				this.anInt4174 = -1;
			}
			if (this.anInt4162 == 65535) {
				this.anInt4162 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4175 = arg1.method4083();
		} else if (arg0 == 3) {
			this.anInt4176 = arg1.method4083();
		} else if (arg0 == 4) {
			this.anInt4195 = arg1.method4083();
		} else if (arg0 == 5) {
			this.anInt4181 = arg1.method4083();
		} else if (arg0 == 6) {
			this.anInt4153 = arg1.method4083();
		} else if (arg0 == 7) {
			this.anInt4182 = arg1.method4083();
		} else if (arg0 == 8) {
			this.anInt4191 = arg1.method4083();
		} else if (arg0 == 9) {
			this.anInt4157 = arg1.method4083();
		} else if (arg0 == 26) {
			this.anInt4156 = (short) (arg1.method4096() * 4);
			this.anInt4167 = (short) (arg1.method4096() * 4);
		} else {
			@Pc(124) int local124;
			@Pc(390) int local390;
			if (arg0 == 27) {
				if (this.anIntArrayArray33 == null) {
					this.anIntArrayArray33 = new int[12][];
				}
				local124 = arg1.method4096();
				this.anIntArrayArray33[local124] = new int[6];
				for (local390 = 0; local390 < 6; local390++) {
					this.anIntArrayArray33[local124][local390] = arg1.method4065();
				}
			} else if (arg0 == 28) {
				this.anIntArray276 = new int[12];
				for (local124 = 0; local124 < 12; local124++) {
					this.anIntArray276[local124] = arg1.method4096();
					if (this.anIntArray276[local124] == 255) {
						this.anIntArray276[local124] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt4192 = arg1.method4096();
			} else if (arg0 == 30) {
				this.anInt4171 = arg1.method4083();
			} else if (arg0 == 31) {
				this.anInt4188 = arg1.method4096();
			} else if (arg0 == 32) {
				this.anInt4189 = arg1.method4083();
			} else if (arg0 == 33) {
				this.anInt4178 = arg1.method4065();
			} else if (arg0 == 34) {
				this.anInt4194 = arg1.method4096();
			} else if (arg0 == 35) {
				this.anInt4179 = arg1.method4083();
			} else if (arg0 == 36) {
				this.anInt4172 = arg1.method4065();
			} else if (arg0 == 37) {
				this.anInt4196 = arg1.method4096();
			} else if (arg0 == 38) {
				this.anInt4159 = arg1.method4083();
			} else if (arg0 == 39) {
				this.anInt4163 = arg1.method4083();
			} else if (arg0 == 40) {
				this.anInt4166 = arg1.method4083();
			} else if (arg0 == 41) {
				this.anInt4177 = arg1.method4083();
			} else if (arg0 == 42) {
				this.anInt4170 = arg1.method4083();
			} else if (arg0 == 43) {
				this.anInt4151 = arg1.method4083();
			} else if (arg0 == 44) {
				this.anInt4193 = arg1.method4083();
			} else if (arg0 == 45) {
				this.anInt4165 = arg1.method4083();
			} else if (arg0 == 46) {
				this.anInt4155 = arg1.method4083();
			} else if (arg0 == 47) {
				this.anInt4173 = arg1.method4083();
			} else if (arg0 == 48) {
				this.anInt4164 = arg1.method4083();
			} else if (arg0 == 49) {
				this.anInt4169 = arg1.method4083();
			} else if (arg0 == 50) {
				this.anInt4183 = arg1.method4083();
			} else if (arg0 == 51) {
				this.anInt4186 = arg1.method4083();
			} else if (arg0 == 52) {
				local124 = arg1.method4096();
				this.anIntArray277 = new int[local124];
				this.anIntArray278 = new int[local124];
				for (local390 = 0; local390 < local124; local390++) {
					this.anIntArray278[local390] = arg1.method4083();
					@Pc(403) int local403 = arg1.method4096();
					this.anIntArray277[local390] = local403;
					this.anInt4190 += local403;
				}
			} else if (arg0 == 53) {
				this.aBoolean300 = false;
			} else if (arg0 == 54) {
				this.anInt4160 = arg1.method4096() << 6;
				this.anInt4152 = arg1.method4096() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method3511(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4096();
			if (local13 == 0) {
				return;
			}
			this.method3510(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)I")
	public int method3512() {
		if (this.anInt4174 != -1) {
			return this.anInt4174;
		} else if (this.anIntArray278 == null) {
			return -1;
		} else {
			@Pc(27) int local27 = (int) (Math.random() * (double) this.anInt4190);
			@Pc(29) int local29;
			for (local29 = 0; this.anIntArray277[local29] <= local27; local29++) {
				local27 -= this.anIntArray277[local29];
			}
			return this.anIntArray278[local29];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Z")
	public boolean method3513(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4174) {
			return true;
		} else {
			if (this.anIntArray278 != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anIntArray278.length; local23++) {
					if (this.anIntArray278[local23] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
