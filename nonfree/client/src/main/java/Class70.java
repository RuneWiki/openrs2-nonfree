import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class70 {

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public int anInt2084 = 0;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	public int anInt2100 = -1;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	public int anInt2096 = -1;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
	public int anInt2091 = 0;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public int anInt2102 = -1;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public int anInt2103 = -1;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public int anInt2092 = -1;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public int anInt2090 = -1;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public int anInt2093 = -1;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public int anInt2089 = -1;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	public int anInt2094 = -1;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
	public int anInt2106 = -1;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	public int anInt2098 = -1;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	public int anInt2114 = -1;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
	public int anInt2099 = -1;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
	public int anInt2104 = 0;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
	public int anInt2111 = -1;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	public int anInt2116 = -1;

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public int anInt2117 = 0;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	public int anInt2119 = 0;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
	public int anInt2110 = 0;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	public int anInt2123 = -1;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
	public int anInt2105 = 0;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public int anInt2086 = 0;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	public int anInt2122 = -1;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
	public int anInt2097 = -1;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	public int anInt2120 = -1;

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
	public int anInt2124 = -1;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public int anInt2085 = 0;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
	public int anInt2109 = 0;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	public int anInt2118 = -1;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
	public int anInt2113 = -1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method1831(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2124 = arg0.method4242();
			this.anInt2098 = arg0.method4242();
			if (this.anInt2098 == 65535) {
				this.anInt2098 = -1;
			}
			if (this.anInt2124 == 65535) {
				this.anInt2124 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2097 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt2113 = arg0.method4242();
		} else if (arg1 == 4) {
			this.anInt2122 = arg0.method4242();
		} else if (arg1 == 5) {
			this.anInt2093 = arg0.method4242();
		} else if (arg1 == 6) {
			this.anInt2096 = arg0.method4242();
		} else if (arg1 == 7) {
			this.anInt2116 = arg0.method4242();
		} else if (arg1 == 8) {
			this.anInt2106 = arg0.method4242();
		} else if (arg1 == 9) {
			this.anInt2092 = arg0.method4242();
		} else if (arg1 == 26) {
			this.anInt2086 = (short) (arg0.method4261() * 4);
			this.anInt2084 = (short) (arg0.method4261() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray20 == null) {
				this.anIntArrayArray20 = new int[12][];
			}
			@Pc(389) int local389 = arg0.method4261();
			this.anIntArrayArray20[local389] = new int[6];
			for (@Pc(397) int local397 = 0; local397 < 6; local397++) {
				this.anIntArrayArray20[local389][local397] = arg0.method4255();
			}
		} else if (arg1 == 29) {
			this.anInt2110 = arg0.method4261();
		} else if (arg1 == 30) {
			this.anInt2104 = arg0.method4242();
		} else if (arg1 == 31) {
			this.anInt2109 = arg0.method4261();
		} else if (arg1 == 32) {
			this.anInt2117 = arg0.method4242();
		} else if (arg1 == 33) {
			this.anInt2119 = arg0.method4255();
		} else if (arg1 == 34) {
			this.anInt2105 = arg0.method4261();
		} else if (arg1 == 35) {
			this.anInt2085 = arg0.method4242();
		} else if (arg1 == 36) {
			this.anInt2091 = arg0.method4255();
		} else if (arg1 == 37) {
			this.anInt2090 = arg0.method4261();
		} else if (arg1 == 38) {
			this.anInt2102 = arg0.method4242();
		} else if (arg1 == 39) {
			this.anInt2100 = arg0.method4242();
		} else if (arg1 == 40) {
			this.anInt2103 = arg0.method4242();
		} else if (arg1 == 41) {
			this.anInt2123 = arg0.method4242();
		} else if (arg1 == 42) {
			this.anInt2111 = arg0.method4242();
		} else if (arg1 == 43) {
			arg0.method4242();
		} else if (arg1 == 44) {
			arg0.method4242();
		} else if (arg1 == 45) {
			arg0.method4242();
		} else if (arg1 == 46) {
			this.anInt2120 = arg0.method4242();
		} else if (arg1 == 47) {
			this.anInt2089 = arg0.method4242();
		} else if (arg1 == 48) {
			this.anInt2114 = arg0.method4242();
		} else if (arg1 == 49) {
			this.anInt2118 = arg0.method4242();
		} else if (arg1 == 50) {
			this.anInt2099 = arg0.method4242();
		} else if (arg1 == 51) {
			this.anInt2094 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method1833(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4261();
			if (local9 == 0) {
				return;
			}
			this.method1831(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	public void method1836() {
	}
}
