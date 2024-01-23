import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class78 {

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public int anInt2132 = -1;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public int anInt2137 = -1;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public int anInt2131 = -1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int anInt2130 = 0;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	public int anInt2140 = -1;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	public int anInt2141 = 0;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public int anInt2146 = -1;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public int anInt2133 = -1;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public int anInt2136 = 0;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
	public int anInt2153 = -1;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public int anInt2160 = -1;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public int anInt2154 = -1;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	public int anInt2148 = -1;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public int anInt2143 = -1;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public int anInt2139 = -1;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
	public int anInt2166 = -1;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
	public int anInt2159 = -1;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	public int anInt2164 = 0;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
	public int anInt2161 = -1;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
	public int anInt2158 = -1;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
	public int anInt2152 = -1;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public int anInt2129 = 0;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	public int anInt2165 = 0;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
	public int anInt2145 = -1;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public int anInt2135 = 0;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	public int anInt2144 = -1;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
	public int anInt2150 = -1;

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
	public int anInt2169 = 0;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public int anInt2156 = 0;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
	public int anInt2171 = -1;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	public int anInt2167 = 0;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
	public int anInt2162 = -1;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
	public int anInt2151 = -1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method1783() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!sb;)V")
	public void method1784(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2595();
			if (local5 == 0) {
				return;
			}
			this.method1786(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!sb;II)V")
	private void method1786(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2171 = arg0.method2593();
			this.anInt2140 = arg0.method2593();
			if (this.anInt2140 == 65535) {
				this.anInt2140 = -1;
			}
			if (this.anInt2171 == 65535) {
				this.anInt2171 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2151 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt2148 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt2161 = arg0.method2593();
		} else if (arg1 == 5) {
			this.anInt2166 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt2143 = arg0.method2593();
		} else if (arg1 == 7) {
			this.anInt2162 = arg0.method2593();
		} else if (arg1 == 8) {
			this.anInt2132 = arg0.method2593();
		} else if (arg1 == 9) {
			this.anInt2150 = arg0.method2593();
		} else if (arg1 == 26) {
			this.anInt2141 = (short) (arg0.method2595() * 4);
			this.anInt2165 = (short) (arg0.method2595() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray13 == null) {
				this.anIntArrayArray13 = new int[12][];
			}
			@Pc(132) int local132 = arg0.method2595();
			this.anIntArrayArray13[local132] = new int[6];
			for (@Pc(140) int local140 = 0; local140 < 6; local140++) {
				this.anIntArrayArray13[local132][local140] = arg0.method2623();
			}
		} else if (arg1 == 29) {
			this.anInt2167 = arg0.method2595();
		} else if (arg1 == 30) {
			this.anInt2135 = arg0.method2593();
		} else if (arg1 == 31) {
			this.anInt2156 = arg0.method2595();
		} else if (arg1 == 32) {
			this.anInt2130 = arg0.method2593();
		} else if (arg1 == 33) {
			this.anInt2164 = arg0.method2623();
		} else if (arg1 == 34) {
			this.anInt2169 = arg0.method2595();
		} else if (arg1 == 35) {
			this.anInt2136 = arg0.method2593();
		} else if (arg1 == 36) {
			this.anInt2129 = arg0.method2623();
		} else if (arg1 == 37) {
			this.anInt2152 = arg0.method2595();
		} else if (arg1 == 38) {
			this.anInt2137 = arg0.method2593();
		} else if (arg1 == 39) {
			this.anInt2158 = arg0.method2593();
		} else if (arg1 == 40) {
			this.anInt2160 = arg0.method2593();
		} else if (arg1 == 41) {
			this.anInt2131 = arg0.method2593();
		} else if (arg1 == 42) {
			this.anInt2139 = arg0.method2593();
		} else if (arg1 == 43) {
			arg0.method2593();
		} else if (arg1 == 44) {
			arg0.method2593();
		} else if (arg1 == 45) {
			this.anInt2144 = arg0.method2593();
		} else if (arg1 == 46) {
			this.anInt2146 = arg0.method2593();
		} else if (arg1 == 47) {
			this.anInt2133 = arg0.method2593();
		} else if (arg1 == 48) {
			this.anInt2153 = arg0.method2593();
		} else if (arg1 == 49) {
			this.anInt2159 = arg0.method2593();
		} else if (arg1 == 50) {
			this.anInt2145 = arg0.method2593();
		} else if (arg1 == 51) {
			this.anInt2154 = arg0.method2593();
		}
	}
}
