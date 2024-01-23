import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class164 {

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public int anInt5185 = 0;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public int anInt5190 = -1;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public int anInt5193 = -1;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public int anInt5192 = -1;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public int anInt5194 = 0;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public int anInt5188 = -1;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public int anInt5186 = -1;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public int anInt5187 = 0;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public int anInt5196 = -1;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public int anInt5201 = 0;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
	public int anInt5206 = -1;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public int anInt5195 = -1;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	public int anInt5210 = -1;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public int anInt5200 = -1;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	public int anInt5211 = -1;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
	public int anInt5217 = 0;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public int anInt5197 = -1;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
	public int anInt5215 = -1;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	public int anInt5207 = -1;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public int anInt5213 = -1;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public int anInt5191 = 0;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public int anInt5198 = 0;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
	public int anInt5222 = -1;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public int anInt5205 = -1;

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
	public int anInt5224 = -1;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public int anInt5204 = 0;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public int anInt5209 = -1;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public int anInt5203 = -1;

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
	public int anInt5221 = -1;

	@OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
	public int anInt5225 = -1;

	@OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
	public int anInt5226 = 0;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
	public int anInt5219 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method4059() {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!cg;II)V")
	private void method4061(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5190 = arg0.method2691();
			this.anInt5224 = arg0.method2691();
			if (this.anInt5190 == 65535) {
				this.anInt5190 = -1;
			}
			if (this.anInt5224 == 65535) {
				this.anInt5224 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt5221 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt5192 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt5209 = arg0.method2691();
		} else if (arg1 == 5) {
			this.anInt5195 = arg0.method2691();
		} else if (arg1 == 6) {
			this.anInt5207 = arg0.method2691();
		} else if (arg1 == 7) {
			this.anInt5215 = arg0.method2691();
		} else if (arg1 == 8) {
			this.anInt5222 = arg0.method2691();
		} else if (arg1 == 9) {
			this.anInt5205 = arg0.method2691();
		} else if (arg1 == 26) {
			this.anInt5198 = (short) (arg0.method2690() * 4);
			this.anInt5226 = (short) (arg0.method2690() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray35 == null) {
				this.anIntArrayArray35 = new int[12][];
			}
			@Pc(118) int local118 = arg0.method2690();
			this.anIntArrayArray35[local118] = new int[6];
			for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
				this.anIntArrayArray35[local118][local126] = arg0.method2632();
			}
		} else if (arg1 == 29) {
			this.anInt5187 = arg0.method2690();
		} else if (arg1 == 30) {
			this.anInt5194 = arg0.method2691();
		} else if (arg1 == 31) {
			this.anInt5219 = arg0.method2690();
		} else if (arg1 == 32) {
			this.anInt5204 = arg0.method2691();
		} else if (arg1 == 33) {
			this.anInt5217 = arg0.method2632();
		} else if (arg1 == 34) {
			this.anInt5191 = arg0.method2690();
		} else if (arg1 == 35) {
			this.anInt5201 = arg0.method2691();
		} else if (arg1 == 36) {
			this.anInt5185 = arg0.method2632();
		} else if (arg1 == 37) {
			this.anInt5200 = arg0.method2690();
		} else if (arg1 == 38) {
			this.anInt5196 = arg0.method2691();
		} else if (arg1 == 39) {
			this.anInt5197 = arg0.method2691();
		} else if (arg1 == 40) {
			this.anInt5193 = arg0.method2691();
		} else if (arg1 == 41) {
			this.anInt5225 = arg0.method2691();
		} else if (arg1 == 42) {
			this.anInt5213 = arg0.method2691();
		} else if (arg1 == 43) {
			arg0.method2691();
		} else if (arg1 == 44) {
			arg0.method2691();
		} else if (arg1 == 45) {
			arg0.method2691();
		} else if (arg1 == 46) {
			this.anInt5188 = arg0.method2691();
		} else if (arg1 == 47) {
			this.anInt5211 = arg0.method2691();
		} else if (arg1 == 48) {
			this.anInt5206 = arg0.method2691();
		} else if (arg1 == 49) {
			this.anInt5203 = arg0.method2691();
		} else if (arg1 == 50) {
			this.anInt5186 = arg0.method2691();
		} else if (arg1 == 51) {
			this.anInt5210 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!cg;)V")
	public void method4063(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2690();
			if (local9 == 0) {
				return;
			}
			this.method4061(arg0, local9);
		}
	}
}
