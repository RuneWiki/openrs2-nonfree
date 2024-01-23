import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class79 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public int anInt2194 = 0;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public int anInt2202 = 0;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public int anInt2201 = -1;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	public int anInt2203 = 0;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt2195 = 0;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public int anInt2197 = -1;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public int anInt2196 = -1;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	public int anInt2209 = -1;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
	public int anInt2207 = -1;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public int anInt2212 = -1;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	public int anInt2210 = -1;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
	public int anInt2216 = -1;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	public int anInt2214 = -1;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	public int anInt2208 = -1;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	public int anInt2200 = 0;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public int anInt2199 = -1;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
	public int anInt2205 = -1;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
	public int anInt2211 = -1;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
	public int anInt2222 = -1;

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
	public int anInt2224 = -1;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
	public int anInt2218 = -1;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
	public int anInt2223 = 0;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
	public int anInt2217 = 0;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	public int anInt2215 = -1;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
	public int anInt2225 = -1;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
	public int anInt2228 = -1;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
	public int anInt2227 = -1;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	public int anInt2219 = 0;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	public int anInt2221 = -1;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	public int anInt2230 = -1;

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
	public int anInt2231 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZILclient!jj;)V")
	private void method1818(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt2197 = arg1.method3107();
			this.anInt2224 = arg1.method3107();
			if (this.anInt2224 == 65535) {
				this.anInt2224 = -1;
			}
			if (this.anInt2197 == 65535) {
				this.anInt2197 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2221 = arg1.method3107();
		} else if (arg0 == 3) {
			this.anInt2205 = arg1.method3107();
		} else if (arg0 == 4) {
			this.anInt2196 = arg1.method3107();
		} else if (arg0 == 5) {
			this.anInt2215 = arg1.method3107();
		} else if (arg0 == 6) {
			this.anInt2225 = arg1.method3107();
		} else if (arg0 == 7) {
			this.anInt2207 = arg1.method3107();
		} else if (arg0 == 8) {
			this.anInt2199 = arg1.method3107();
		} else if (arg0 == 9) {
			this.anInt2214 = arg1.method3107();
		} else if (arg0 == 26) {
			this.anInt2223 = (short) (arg1.method3122() * 4);
			this.anInt2202 = (short) (arg1.method3122() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray19 == null) {
				this.anIntArrayArray19 = new int[12][];
			}
			@Pc(103) int local103 = arg1.method3122();
			this.anIntArrayArray19[local103] = new int[6];
			for (@Pc(111) int local111 = 0; local111 < 6; local111++) {
				this.anIntArrayArray19[local103][local111] = arg1.method3064();
			}
		} else if (arg0 == 29) {
			this.anInt2195 = arg1.method3122();
		} else if (arg0 == 30) {
			this.anInt2200 = arg1.method3107();
		} else if (arg0 == 31) {
			this.anInt2203 = arg1.method3122();
		} else if (arg0 == 32) {
			this.anInt2219 = arg1.method3107();
		} else if (arg0 == 33) {
			this.anInt2226 = arg1.method3064();
		} else if (arg0 == 34) {
			this.anInt2231 = arg1.method3122();
		} else if (arg0 == 35) {
			this.anInt2217 = arg1.method3107();
		} else if (arg0 == 36) {
			this.anInt2194 = arg1.method3064();
		} else if (arg0 == 37) {
			this.anInt2208 = arg1.method3122();
		} else if (arg0 == 38) {
			this.anInt2209 = arg1.method3107();
		} else if (arg0 == 39) {
			this.anInt2228 = arg1.method3107();
		} else if (arg0 == 40) {
			this.anInt2212 = arg1.method3107();
		} else if (arg0 == 41) {
			this.anInt2218 = arg1.method3107();
		} else if (arg0 == 42) {
			this.anInt2201 = arg1.method3107();
		} else if (arg0 == 43) {
			arg1.method3107();
		} else if (arg0 == 44) {
			arg1.method3107();
		} else if (arg0 == 45) {
			arg1.method3107();
		} else if (arg0 == 46) {
			this.anInt2211 = arg1.method3107();
		} else if (arg0 == 47) {
			this.anInt2230 = arg1.method3107();
		} else if (arg0 == 48) {
			this.anInt2222 = arg1.method3107();
		} else if (arg0 == 49) {
			this.anInt2216 = arg1.method3107();
		} else if (arg0 == 50) {
			this.anInt2227 = arg1.method3107();
		} else if (arg0 == 51) {
			this.anInt2210 = arg1.method3107();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!jj;)V")
	public void method1821(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3122();
			if (local13 == 0) {
				return;
			}
			this.method1818(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method1822() {
	}
}
