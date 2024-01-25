import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class169 {

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!jq", name = "J", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public int anInt5159 = -1;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public int anInt5161 = -1;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public int anInt5171 = 0;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public int anInt5163 = -1;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "[I")
	public int[] anIntArray327 = null;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public int anInt5158 = -1;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	public int anInt5162 = -1;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public int anInt5160 = -1;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public int anInt5165 = 0;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
	public int anInt5183 = 0;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public int anInt5176 = 0;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
	public int anInt5179 = 0;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	public int anInt5168 = 0;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public int anInt5173 = -1;

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public int anInt5185 = -1;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
	public int anInt5178 = -1;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt5164 = -1;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	public int anInt5172 = 0;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
	public int anInt5182 = -1;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public int anInt5167 = 0;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	public int anInt5169 = -1;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public int anInt5177 = -1;

	@OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
	public int anInt5193 = -1;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	private int anInt5184 = 0;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt5187 = 0;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
	public int anInt5181 = -1;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
	public int anInt5191 = -1;

	@OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
	public int anInt5194 = -1;

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
	public int anInt5192 = -1;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public int anInt5166 = -1;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
	public int anInt5189 = 0;

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
	public int anInt5188 = 0;

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
	public int anInt5195 = -1;

	@OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
	public int anInt5190 = -1;

	@OriginalMember(owner = "client!jq", name = "S", descriptor = "[I")
	public int[] anIntArray329 = null;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt5170 = -1;

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
	public int anInt5197 = -1;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
	public int anInt5180 = 0;

	@OriginalMember(owner = "client!jq", name = "V", descriptor = "I")
	public int anInt5199 = -1;

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "I")
	public int anInt5198 = -1;

	@OriginalMember(owner = "client!jq", name = "X", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public boolean method4459(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt5182) {
			return true;
		} else {
			if (this.anIntArray329 != null) {
				for (@Pc(28) int local28 = 0; local28 < this.anIntArray329.length; local28++) {
					if (this.anIntArray329[local28] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!iaa;)V")
	public void method4460(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4966();
			if (local11 == 0) {
				return;
			}
			this.method4462(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)I")
	public int method4461() {
		if (this.anInt5182 != -1) {
			return this.anInt5182;
		} else if (this.anIntArray329 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt5184);
			@Pc(33) int local33;
			for (local33 = 0; local31 >= this.anIntArray327[local33]; local33++) {
				local31 -= this.anIntArray327[local33];
			}
			return this.anIntArray329[local33];
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!iaa;B)V")
	private void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5182 = arg1.method4999();
			this.anInt5198 = arg1.method4999();
			if (this.anInt5198 == 65535) {
				this.anInt5198 = -1;
			}
			if (this.anInt5182 == 65535) {
				this.anInt5182 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt5161 = arg1.method4999();
			return;
		} else if (arg0 == 3) {
			this.anInt5160 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt5194 = arg1.method4999();
			return;
		} else if (arg0 == 5) {
			this.anInt5166 = arg1.method4999();
			return;
		} else if (arg0 == 6) {
			this.anInt5181 = arg1.method4999();
			return;
		} else if (arg0 == 7) {
			this.anInt5178 = arg1.method4999();
			return;
		} else if (arg0 == 8) {
			this.anInt5191 = arg1.method4999();
			return;
		} else if (arg0 == 9) {
			this.anInt5164 = arg1.method4999();
			return;
		} else if (arg0 == 26) {
			this.anInt5183 = (short) (arg1.method4966() * 4);
			this.anInt5165 = (short) (arg1.method4966() * 4);
			return;
		} else {
			@Pc(116) int local116;
			@Pc(124) int local124;
			if (arg0 == 27) {
				if (this.anIntArrayArray35 == null) {
					this.anIntArrayArray35 = new int[12][];
				}
				local116 = arg1.method4966();
				this.anIntArrayArray35[local116] = new int[6];
				for (local124 = 0; local124 < 6; local124++) {
					this.anIntArrayArray35[local116][local124] = arg1.method4974();
				}
				return;
			}
			if (arg0 == 28) {
				this.anIntArray328 = new int[12];
				for (local116 = 0; local116 < 12; local116++) {
					this.anIntArray328[local116] = arg1.method4966();
					if (this.anIntArray328[local116] == 255) {
						this.anIntArray328[local116] = -1;
					}
				}
				return;
			}
			if (arg0 == 29) {
				this.anInt5187 = arg1.method4966();
				return;
			}
			if (arg0 == 30) {
				this.anInt5172 = arg1.method4999();
				return;
			}
			if (arg0 == 31) {
				this.anInt5179 = arg1.method4966();
				return;
			}
			if (arg0 == 32) {
				this.anInt5188 = arg1.method4999();
				return;
			}
			if (arg0 == 33) {
				this.anInt5167 = arg1.method4974();
				return;
			}
			if (arg0 == 34) {
				this.anInt5171 = arg1.method4966();
				return;
			}
			if (arg0 == 35) {
				this.anInt5168 = arg1.method4999();
				return;
			}
			if (arg0 == 36) {
				this.anInt5176 = arg1.method4974();
				return;
			}
			if (arg0 == 37) {
				this.anInt5169 = arg1.method4966();
				return;
			}
			if (arg0 == 38) {
				this.anInt5185 = arg1.method4999();
				return;
			}
			if (arg0 == 39) {
				this.anInt5159 = arg1.method4999();
				return;
			}
			if (arg0 == 40) {
				this.anInt5158 = arg1.method4999();
				return;
			}
			if (arg0 == 41) {
				this.anInt5199 = arg1.method4999();
				return;
			}
			if (arg0 == 42) {
				this.anInt5190 = arg1.method4999();
				return;
			}
			if (arg0 == 43) {
				this.anInt5193 = arg1.method4999();
				return;
			}
			if (arg0 == 44) {
				this.anInt5192 = arg1.method4999();
				return;
			}
			if (arg0 == 45) {
				this.anInt5170 = arg1.method4999();
				return;
			}
			if (arg0 == 46) {
				this.anInt5197 = arg1.method4999();
				return;
			}
			if (arg0 == 47) {
				this.anInt5163 = arg1.method4999();
				return;
			}
			if (arg0 == 48) {
				this.anInt5173 = arg1.method4999();
				return;
			}
			if (arg0 == 49) {
				this.anInt5162 = arg1.method4999();
				return;
			}
			if (arg0 == 50) {
				this.anInt5177 = arg1.method4999();
				return;
			}
			if (arg0 == 51) {
				this.anInt5195 = arg1.method4999();
				return;
			}
			if (arg0 != 52) {
				if (arg0 == 53) {
					this.aBoolean389 = false;
				} else if (arg0 == 54) {
					this.anInt5180 = arg1.method4966() << 6;
					this.anInt5189 = arg1.method4966() << 6;
					return;
				}
				return;
			}
			local116 = arg1.method4966();
			this.anIntArray329 = new int[local116];
			this.anIntArray327 = new int[local116];
			for (local124 = 0; local124 < local116; local124++) {
				this.anIntArray329[local124] = arg1.method4999();
				@Pc(352) int local352 = arg1.method4966();
				this.anIntArray327[local124] = local352;
				this.anInt5184 += local352;
			}
			return;
		}
	}
}
