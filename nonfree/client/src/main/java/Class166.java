import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class166 {

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "[I")
	public int[] anIntArray352;

	@OriginalMember(owner = "client!ju", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
	public int anInt4961 = -1;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "[I")
	public int[] anIntArray351 = null;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	public int anInt4955 = 0;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	public int anInt4958 = -1;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
	public int anInt4965 = -1;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
	public int anInt4970 = -1;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public int anInt4956 = -1;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public int anInt4963 = -1;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
	public int anInt4962 = -1;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "[I")
	public int[] anIntArray350 = null;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
	public int anInt4980 = 0;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	private int anInt4966 = 0;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
	public int anInt4983 = -1;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	public int anInt4971 = -1;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public int anInt4978 = -1;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	public int anInt4959 = -1;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
	public int anInt4969 = 0;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
	public int anInt4975 = -1;

	@OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
	public int anInt4985 = 0;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public int anInt4957 = -1;

	@OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
	public int anInt4989 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	public int anInt4954 = -1;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
	public int anInt4976 = -1;

	@OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
	public int anInt4982 = -1;

	@OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
	public int anInt4988 = 0;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
	public int anInt4960 = 0;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
	public int anInt4979 = -1;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	public int anInt4967 = -1;

	@OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
	public int anInt4990 = 0;

	@OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
	public int anInt4992 = -1;

	@OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
	public int anInt4987 = -1;

	@OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
	public int anInt4995 = 0;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public int anInt4964 = -1;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
	public int anInt4977 = 0;

	@OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
	public int anInt4997 = -1;

	@OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
	public int anInt4991 = 0;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
	public int anInt4973 = -1;

	@OriginalMember(owner = "client!ju", name = "X", descriptor = "I")
	public int anInt4996 = -1;

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
	public int anInt4994 = 0;

	@OriginalMember(owner = "client!ju", name = "ab", descriptor = "I")
	public int anInt4999 = -1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!daa;I)V")
	private void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4961 = arg1.method5199();
			this.anInt4964 = arg1.method5199();
			if (this.anInt4964 == 65535) {
				this.anInt4964 = -1;
			}
			if (this.anInt4961 == 65535) {
				this.anInt4961 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4987 = arg1.method5199();
		} else if (arg0 == 3) {
			this.anInt4971 = arg1.method5199();
		} else if (arg0 == 4) {
			this.anInt4978 = arg1.method5199();
		} else if (arg0 == 5) {
			this.anInt4983 = arg1.method5199();
		} else if (arg0 == 6) {
			this.anInt4962 = arg1.method5199();
		} else if (arg0 == 7) {
			this.anInt4973 = arg1.method5199();
		} else if (arg0 == 8) {
			this.anInt4982 = arg1.method5199();
		} else if (arg0 == 9) {
			this.anInt4992 = arg1.method5199();
		} else if (arg0 == 26) {
			this.anInt4977 = (short) (arg1.method5216() * 4);
			this.anInt4988 = (short) (arg1.method5216() * 4);
		} else {
			@Pc(100) int local100;
			@Pc(108) int local108;
			if (arg0 == 27) {
				if (this.anIntArrayArray48 == null) {
					this.anIntArrayArray48 = new int[12][];
				}
				local100 = arg1.method5216();
				this.anIntArrayArray48[local100] = new int[6];
				for (local108 = 0; local108 < 6; local108++) {
					this.anIntArrayArray48[local100][local108] = arg1.method5217();
				}
			} else if (arg0 == 28) {
				this.anIntArray352 = new int[12];
				for (local100 = 0; local100 < 12; local100++) {
					this.anIntArray352[local100] = arg1.method5216();
					if (this.anIntArray352[local100] == 255) {
						this.anIntArray352[local100] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt4969 = arg1.method5216();
			} else if (arg0 == 30) {
				this.anInt4990 = arg1.method5199();
			} else if (arg0 == 31) {
				this.anInt4985 = arg1.method5216();
			} else if (arg0 == 32) {
				this.anInt4989 = arg1.method5199();
			} else if (arg0 == 33) {
				this.anInt4955 = arg1.method5217();
			} else if (arg0 == 34) {
				this.anInt4994 = arg1.method5216();
			} else if (arg0 == 35) {
				this.anInt4991 = arg1.method5199();
			} else if (arg0 == 36) {
				this.anInt4995 = arg1.method5217();
			} else if (arg0 == 37) {
				this.anInt4976 = arg1.method5216();
			} else if (arg0 == 38) {
				this.anInt4999 = arg1.method5199();
			} else if (arg0 == 39) {
				this.anInt4956 = arg1.method5199();
			} else if (arg0 == 40) {
				this.anInt4996 = arg1.method5199();
			} else if (arg0 == 41) {
				this.anInt4979 = arg1.method5199();
			} else if (arg0 == 42) {
				this.anInt4959 = arg1.method5199();
			} else if (arg0 == 43) {
				this.anInt4954 = arg1.method5199();
			} else if (arg0 == 44) {
				this.anInt4965 = arg1.method5199();
			} else if (arg0 == 45) {
				this.anInt4997 = arg1.method5199();
			} else if (arg0 == 46) {
				this.anInt4970 = arg1.method5199();
			} else if (arg0 == 47) {
				this.anInt4958 = arg1.method5199();
			} else if (arg0 == 48) {
				this.anInt4963 = arg1.method5199();
			} else if (arg0 == 49) {
				this.anInt4957 = arg1.method5199();
			} else if (arg0 == 50) {
				this.anInt4975 = arg1.method5199();
			} else if (arg0 == 51) {
				this.anInt4967 = arg1.method5199();
			} else if (arg0 == 52) {
				local100 = arg1.method5216();
				this.anIntArray350 = new int[local100];
				this.anIntArray351 = new int[local100];
				for (local108 = 0; local108 < local100; local108++) {
					this.anIntArray351[local108] = arg1.method5199();
					@Pc(356) int local356 = arg1.method5216();
					this.anIntArray350[local108] = local356;
					this.anInt4966 += local356;
				}
			} else if (arg0 == 53) {
				this.aBoolean390 = false;
			} else if (arg0 == 54) {
				this.anInt4980 = arg1.method5216() << 6;
				this.anInt4960 = arg1.method5216() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
	public int method4179() {
		if (this.anInt4961 != -1) {
			return this.anInt4961;
		} else if (this.anIntArray351 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) (Math.random() * (double) this.anInt4966);
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray350[local32] <= local30; local32++) {
				local30 -= this.anIntArray350[local32];
			}
			return this.anIntArray351[local32];
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)Z")
	public boolean method4182(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4961) {
			return true;
		} else {
			if (this.anIntArray351 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray351.length; local29++) {
					if (this.anIntArray351[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method4183(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5216();
			if (local17 == 0) {
				return;
			}
			this.method4178(local17, arg0);
		}
	}
}
