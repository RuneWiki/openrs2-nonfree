import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class137 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!kn", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt4183 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt4182 = 0;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "[I")
	public int[] anIntArray317 = null;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public int anInt4187 = -1;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public int anInt4185 = 0;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public int anInt4193 = -1;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public int anInt4188 = -1;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	public int anInt4194 = -1;

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
	public int anInt4199 = 0;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Z")
	public boolean aBoolean329 = true;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
	public int anInt4197 = 0;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
	public int anInt4203 = -1;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
	public int anInt4198 = 0;

	@OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
	public int anInt4210 = -1;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public int anInt4190 = -1;

	@OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
	public int anInt4206 = -1;

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
	public int anInt4201 = -1;

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	public int anInt4213 = -1;

	@OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
	public int anInt4205 = -1;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public int anInt4191 = -1;

	@OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
	public int anInt4208 = -1;

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
	public int anInt4219 = 0;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
	public int anInt4202 = 0;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
	public int anInt4196 = 0;

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
	public int anInt4217 = -1;

	@OriginalMember(owner = "client!kn", name = "T", descriptor = "I")
	public int anInt4221 = 0;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
	public int anInt4216 = -1;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
	public int anInt4215 = 0;

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
	public int anInt4218 = 0;

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
	public int anInt4212 = 0;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
	public int anInt4214 = -1;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt4192 = -1;

	@OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!kn", name = "V", descriptor = "I")
	public int anInt4223 = -1;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
	public int[] anIntArray318 = null;

	@OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
	public int anInt4211 = -1;

	@OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
	public int anInt4226 = -1;

	@OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
	public int anInt4207 = -1;

	@OriginalMember(owner = "client!kn", name = "W", descriptor = "I")
	public int anInt4224 = -1;

	@OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
	public int anInt4222 = -1;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	public int anInt4200 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!bt;Z)V")
	public void method3442(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method3443(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!bt;)V")
	private void method3443(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt4224 = arg1.method6004();
			this.anInt4203 = arg1.method6004();
			if (this.anInt4203 == 65535) {
				this.anInt4203 = -1;
			}
			if (this.anInt4224 == 65535) {
				this.anInt4224 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4216 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt4191 = arg1.method6004();
		} else if (arg0 == 4) {
			this.anInt4188 = arg1.method6004();
		} else if (arg0 == 5) {
			this.anInt4193 = arg1.method6004();
		} else if (arg0 == 6) {
			this.anInt4208 = arg1.method6004();
		} else if (arg0 == 7) {
			this.anInt4213 = arg1.method6004();
		} else if (arg0 == 8) {
			this.anInt4207 = arg1.method6004();
		} else if (arg0 == 9) {
			this.anInt4187 = arg1.method6004();
		} else if (arg0 == 26) {
			this.anInt4218 = (short) (arg1.method6053() * 4);
			this.anInt4199 = (short) (arg1.method6053() * 4);
		} else {
			@Pc(90) int local90;
			@Pc(98) int local98;
			if (arg0 == 27) {
				if (this.anIntArrayArray34 == null) {
					this.anIntArrayArray34 = new int[12][];
				}
				local90 = arg1.method6053();
				this.anIntArrayArray34[local90] = new int[6];
				for (local98 = 0; local98 < 6; local98++) {
					this.anIntArrayArray34[local90][local98] = arg1.method6039();
				}
			} else if (arg0 == 28) {
				this.anIntArray316 = new int[12];
				for (local90 = 0; local90 < 12; local90++) {
					this.anIntArray316[local90] = arg1.method6053();
					if (this.anIntArray316[local90] == 255) {
						this.anIntArray316[local90] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt4185 = arg1.method6053();
			} else if (arg0 == 30) {
				this.anInt4182 = arg1.method6004();
			} else if (arg0 == 31) {
				this.anInt4212 = arg1.method6053();
			} else if (arg0 == 32) {
				this.anInt4215 = arg1.method6004();
			} else if (arg0 == 33) {
				this.anInt4219 = arg1.method6039();
			} else if (arg0 == 34) {
				this.anInt4197 = arg1.method6053();
			} else if (arg0 == 35) {
				this.anInt4196 = arg1.method6004();
			} else if (arg0 == 36) {
				this.anInt4221 = arg1.method6039();
			} else if (arg0 == 37) {
				this.anInt4210 = arg1.method6053();
			} else if (arg0 == 38) {
				this.anInt4206 = arg1.method6004();
			} else if (arg0 == 39) {
				this.anInt4211 = arg1.method6004();
			} else if (arg0 == 40) {
				this.anInt4194 = arg1.method6004();
			} else if (arg0 == 41) {
				this.anInt4201 = arg1.method6004();
			} else if (arg0 == 42) {
				this.anInt4222 = arg1.method6004();
			} else if (arg0 == 43) {
				this.anInt4217 = arg1.method6004();
			} else if (arg0 == 44) {
				this.anInt4223 = arg1.method6004();
			} else if (arg0 == 45) {
				this.anInt4190 = arg1.method6004();
			} else if (arg0 == 46) {
				this.anInt4205 = arg1.method6004();
			} else if (arg0 == 47) {
				this.anInt4214 = arg1.method6004();
			} else if (arg0 == 48) {
				this.anInt4192 = arg1.method6004();
			} else if (arg0 == 49) {
				this.anInt4226 = arg1.method6004();
			} else if (arg0 == 50) {
				this.anInt4200 = arg1.method6004();
			} else if (arg0 == 51) {
				this.anInt4183 = arg1.method6004();
				return;
			} else if (arg0 == 52) {
				local90 = arg1.method6053();
				this.anIntArray317 = new int[local90];
				this.anIntArray318 = new int[local90];
				for (local98 = 0; local98 < local90; local98++) {
					this.anIntArray318[local98] = arg1.method6004();
					@Pc(348) int local348 = arg1.method6053();
					this.anIntArray317[local98] = local348;
					this.anInt4225 += local348;
				}
				return;
			} else if (arg0 == 53) {
				this.aBoolean329 = false;
				return;
			} else if (arg0 == 54) {
				this.anInt4198 = arg1.method6053() << 6;
				this.anInt4202 = arg1.method6053() << 6;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
	public boolean method3444(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4224) {
			return true;
		} else {
			if (this.anIntArray318 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray318.length; local29++) {
					if (arg0 == this.anIntArray318[local29]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I")
	public int method3446() {
		if (this.anInt4224 != -1) {
			return this.anInt4224;
		} else if (this.anIntArray318 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt4225 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray317[local30]; local30++) {
				local28 -= this.anIntArray317[local30];
			}
			return this.anIntArray318[local30];
		}
	}
}
