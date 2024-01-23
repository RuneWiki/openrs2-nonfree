import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public int anInt188 = -1;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public int anInt189 = 0;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "I")
	public int anInt197 = -1;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	public int anInt183 = -1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public int anInt190 = -1;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "I")
	public int anInt202 = 0;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public int anInt193 = -1;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	public int anInt196 = -1;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt181 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public int anInt180 = -1;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	public int anInt203 = -1;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	public int anInt198 = 0;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "I")
	public int anInt204 = 0;

	@OriginalMember(owner = "client!am", name = "G", descriptor = "I")
	public int anInt208 = -1;

	@OriginalMember(owner = "client!am", name = "H", descriptor = "I")
	public int anInt209 = -1;

	@OriginalMember(owner = "client!am", name = "K", descriptor = "I")
	public int anInt212 = -1;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	public int anInt194 = 0;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "I")
	public int anInt207 = -1;

	@OriginalMember(owner = "client!am", name = "O", descriptor = "I")
	public int anInt216 = -1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "I")
	public int anInt192 = -1;

	@OriginalMember(owner = "client!am", name = "L", descriptor = "I")
	public int anInt213 = -1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	public int anInt185 = 0;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public int anInt186 = -1;

	@OriginalMember(owner = "client!am", name = "D", descriptor = "I")
	public int anInt206 = -1;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "I")
	public int anInt210 = -1;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public int anInt187 = -1;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "I")
	public int anInt200 = -1;

	@OriginalMember(owner = "client!am", name = "V", descriptor = "I")
	public int anInt219 = 0;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public int anInt191 = -1;

	@OriginalMember(owner = "client!am", name = "U", descriptor = "I")
	public int anInt218 = 0;

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
	public int anInt217 = 0;

	@OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
	public int anInt221 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public void method169() {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method173(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1378();
			if (local9 == 0) {
				return;
			}
			this.method177(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lf;II)V")
	private void method177(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt206 = arg0.method1386();
			this.anInt200 = arg0.method1386();
			if (this.anInt200 == 65535) {
				this.anInt200 = -1;
			}
			if (this.anInt206 == 65535) {
				this.anInt206 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt190 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt197 = arg0.method1386();
		} else if (arg1 == 4) {
			this.anInt192 = arg0.method1386();
		} else if (arg1 == 5) {
			this.anInt181 = arg0.method1386();
		} else if (arg1 == 6) {
			this.anInt187 = arg0.method1386();
		} else if (arg1 == 7) {
			this.anInt193 = arg0.method1386();
		} else if (arg1 == 8) {
			this.anInt191 = arg0.method1386();
		} else if (arg1 == 9) {
			this.anInt212 = arg0.method1386();
		} else if (arg1 == 26) {
			this.anInt204 = (short) (arg0.method1378() * 4);
			this.anInt185 = (short) (arg0.method1378() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray3 == null) {
				this.anIntArrayArray3 = new int[12][];
			}
			@Pc(355) int local355 = arg0.method1378();
			this.anIntArrayArray3[local355] = new int[6];
			for (@Pc(363) int local363 = 0; local363 < 6; local363++) {
				this.anIntArrayArray3[local355][local363] = arg0.method1356();
			}
		} else if (arg1 == 29) {
			this.anInt221 = arg0.method1378();
		} else if (arg1 == 30) {
			this.anInt219 = arg0.method1386();
		} else if (arg1 == 31) {
			this.anInt194 = arg0.method1378();
		} else if (arg1 == 32) {
			this.anInt189 = arg0.method1386();
		} else if (arg1 == 33) {
			this.anInt218 = arg0.method1356();
		} else if (arg1 == 34) {
			this.anInt202 = arg0.method1378();
		} else if (arg1 == 35) {
			this.anInt217 = arg0.method1386();
		} else if (arg1 == 36) {
			this.anInt198 = arg0.method1356();
		} else if (arg1 == 37) {
			this.anInt196 = arg0.method1378();
		} else if (arg1 == 38) {
			this.anInt209 = arg0.method1386();
		} else if (arg1 == 39) {
			this.anInt203 = arg0.method1386();
		} else if (arg1 == 40) {
			this.anInt207 = arg0.method1386();
		} else if (arg1 == 41) {
			this.anInt210 = arg0.method1386();
		} else if (arg1 == 42) {
			this.anInt188 = arg0.method1386();
		} else if (arg1 == 43) {
			arg0.method1386();
		} else if (arg1 == 44) {
			arg0.method1386();
		} else if (arg1 == 45) {
			arg0.method1386();
		} else if (arg1 == 46) {
			this.anInt216 = arg0.method1386();
		} else if (arg1 == 47) {
			this.anInt213 = arg0.method1386();
		} else if (arg1 == 48) {
			this.anInt180 = arg0.method1386();
		} else if (arg1 == 49) {
			this.anInt186 = arg0.method1386();
		} else if (arg1 == 50) {
			this.anInt183 = arg0.method1386();
		} else if (arg1 == 51) {
			this.anInt208 = arg0.method1386();
		}
	}
}
