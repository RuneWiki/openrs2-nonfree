import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public int[] anIntArray2;

	@OriginalMember(owner = "client!a", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt1 = -1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public int anInt10 = 0;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	private int anInt15 = 0;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public int anInt5 = -1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public int anInt9 = -1;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	public int anInt16 = -1;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public int anInt14 = -1;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	public int anInt18 = -1;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public int anInt25 = -1;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	public int anInt22 = -1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public int anInt4 = -1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public int anInt11 = -1;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	public int anInt26 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public int anInt20 = -1;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	public int anInt24 = -1;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	public int anInt28 = -1;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public int anInt19 = -1;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "I")
	public int anInt32 = -1;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	public int anInt36 = -1;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
	public int[] anIntArray3 = null;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "I")
	public int anInt34 = 0;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public int anInt6 = -1;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	public int anInt29 = 0;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "I")
	public int anInt35 = 0;

	@OriginalMember(owner = "client!a", name = "P", descriptor = "I")
	public int anInt37 = -1;

	@OriginalMember(owner = "client!a", name = "S", descriptor = "I")
	public int anInt40 = -1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public int anInt12 = -1;

	@OriginalMember(owner = "client!a", name = "T", descriptor = "I")
	public int anInt41 = 0;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public int anInt21 = 0;

	@OriginalMember(owner = "client!a", name = "X", descriptor = "I")
	public int anInt44 = -1;

	@OriginalMember(owner = "client!a", name = "W", descriptor = "I")
	public int anInt43 = -1;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	public int anInt31 = -1;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
	public int anInt38 = 0;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
	public int[] anIntArray1 = null;

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
	public int anInt47 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public int anInt17 = 0;

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
	public int anInt45 = -1;

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
	public int anInt48 = -1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	public int method2() {
		if (this.anInt19 != -1) {
			return this.anInt19;
		} else if (this.anIntArray1 == null) {
			return -1;
		} else {
			@Pc(20) int local20 = (int) ((double) this.anInt15 * Math.random());
			@Pc(22) int local22;
			for (local22 = 0; this.anIntArray3[local22] <= local20; local22++) {
				local20 -= this.anIntArray3[local22];
			}
			return this.anIntArray1[local22];
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method3(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt19 = arg0.method2588();
			this.anInt40 = arg0.method2588();
			if (this.anInt19 == 65535) {
				this.anInt19 = -1;
			}
			if (this.anInt40 == 65535) {
				this.anInt40 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt11 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt9 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt20 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt32 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt14 = arg0.method2588();
		} else if (arg1 == 7) {
			this.anInt48 = arg0.method2588();
		} else if (arg1 == 8) {
			this.anInt43 = arg0.method2588();
		} else if (arg1 == 9) {
			this.anInt45 = arg0.method2588();
		} else if (arg1 == 26) {
			this.anInt35 = (short) (arg0.method2582() * 4);
			this.anInt3 = (short) (arg0.method2582() * 4);
		} else {
			@Pc(90) int local90;
			@Pc(98) int local98;
			if (arg1 == 27) {
				if (this.anIntArrayArray1 == null) {
					this.anIntArrayArray1 = new int[12][];
				}
				local90 = arg0.method2582();
				this.anIntArrayArray1[local90] = new int[6];
				for (local98 = 0; local98 < 6; local98++) {
					this.anIntArrayArray1[local90][local98] = arg0.method2641();
				}
			} else if (arg1 == 28) {
				this.anIntArray2 = new int[12];
				for (local90 = 0; local90 < 12; local90++) {
					this.anIntArray2[local90] = arg0.method2582();
					if (this.anIntArray2[local90] == 255) {
						this.anIntArray2[local90] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt8 = arg0.method2582();
			} else if (arg1 == 30) {
				this.anInt10 = arg0.method2588();
			} else if (arg1 == 31) {
				this.anInt17 = arg0.method2582();
			} else if (arg1 == 32) {
				this.anInt21 = arg0.method2588();
			} else if (arg1 == 33) {
				this.anInt38 = arg0.method2641();
			} else if (arg1 == 34) {
				this.anInt29 = arg0.method2582();
			} else if (arg1 == 35) {
				this.anInt34 = arg0.method2588();
			} else if (arg1 == 36) {
				this.anInt26 = arg0.method2641();
			} else if (arg1 == 37) {
				this.anInt22 = arg0.method2582();
			} else if (arg1 == 38) {
				this.anInt16 = arg0.method2588();
			} else if (arg1 == 39) {
				this.anInt36 = arg0.method2588();
			} else if (arg1 == 40) {
				this.anInt44 = arg0.method2588();
			} else if (arg1 == 41) {
				this.anInt6 = arg0.method2588();
			} else if (arg1 == 42) {
				this.anInt5 = arg0.method2588();
			} else if (arg1 == 43) {
				this.anInt24 = arg0.method2588();
			} else if (arg1 == 44) {
				this.anInt25 = arg0.method2588();
			} else if (arg1 == 45) {
				this.anInt37 = arg0.method2588();
			} else if (arg1 == 46) {
				this.anInt18 = arg0.method2588();
			} else if (arg1 == 47) {
				this.anInt31 = arg0.method2588();
			} else if (arg1 == 48) {
				this.anInt28 = arg0.method2588();
			} else if (arg1 == 49) {
				this.anInt1 = arg0.method2588();
			} else if (arg1 == 50) {
				this.anInt12 = arg0.method2588();
			} else if (arg1 == 51) {
				this.anInt4 = arg0.method2588();
			} else if (arg1 == 52) {
				local90 = arg0.method2582();
				this.anIntArray3 = new int[local90];
				this.anIntArray1 = new int[local90];
				for (local98 = 0; local98 < local90; local98++) {
					this.anIntArray1[local98] = arg0.method2588();
					@Pc(359) int local359 = arg0.method2582();
					this.anIntArray3[local98] = local359;
					this.anInt15 += local359;
				}
			} else if (arg1 == 53) {
				this.aBoolean1 = false;
			} else if (arg1 == 54) {
				this.anInt47 = arg0.method2582() << 6;
				this.anInt41 = arg0.method2582() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!cu;)V")
	public void method4(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2582();
			if (local7 == 0) {
				return;
			}
			this.method3(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	public boolean method8(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt19 == arg0) {
			return true;
		} else {
			if (this.anIntArray1 != null) {
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray1.length; local31++) {
					if (this.anIntArray1[local31] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
