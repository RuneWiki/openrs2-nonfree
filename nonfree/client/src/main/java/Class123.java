import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class123 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "I")
	public int anInt4115 = 0;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "I")
	public int anInt4122 = -1;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public int anInt4113 = -1;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public int anInt4111 = -1;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public int anInt4124 = -1;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public int anInt4125 = 0;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public int anInt4123 = -1;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "I")
	public int anInt4120 = -1;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public int anInt4112 = -1;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "I")
	public int anInt4109 = 0;

	@OriginalMember(owner = "client!no", name = "D", descriptor = "I")
	public int anInt4136 = -1;

	@OriginalMember(owner = "client!no", name = "B", descriptor = "I")
	public int anInt4134 = -1;

	@OriginalMember(owner = "client!no", name = "E", descriptor = "I")
	public int anInt4137 = 0;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public int anInt4119 = -1;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "I")
	public int anInt4131 = -1;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "I")
	public int anInt4132 = -1;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "I")
	public int anInt4130 = 0;

	@OriginalMember(owner = "client!no", name = "A", descriptor = "I")
	public int anInt4133 = -1;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "I")
	public int anInt4118 = -1;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "I")
	public int anInt4129 = -1;

	@OriginalMember(owner = "client!no", name = "F", descriptor = "I")
	public int anInt4138 = 0;

	@OriginalMember(owner = "client!no", name = "G", descriptor = "I")
	public int anInt4139 = -1;

	@OriginalMember(owner = "client!no", name = "J", descriptor = "I")
	public int anInt4141 = 0;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "I")
	public int anInt4127 = -1;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public int anInt4116 = -1;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "I")
	public int anInt4135 = 0;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	public int anInt4128 = -1;

	@OriginalMember(owner = "client!no", name = "L", descriptor = "I")
	public int anInt4143 = -1;

	@OriginalMember(owner = "client!no", name = "K", descriptor = "I")
	public int anInt4142 = -1;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public int anInt4117 = 0;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public int anInt4121 = -1;

	@OriginalMember(owner = "client!no", name = "H", descriptor = "I")
	public int anInt4140 = -1;

	@OriginalMember(owner = "client!no", name = "M", descriptor = "I")
	public int anInt4144 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public void method3362() {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!oe;)V")
	public void method3363(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2146();
			if (local9 == 0) {
				return;
			}
			this.method3364(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!oe;II)V")
	private void method3364(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4136 = arg0.method2130();
			this.anInt4120 = arg0.method2130();
			if (this.anInt4120 == 65535) {
				this.anInt4120 = -1;
			}
			if (this.anInt4136 == 65535) {
				this.anInt4136 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4113 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt4133 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt4142 = arg0.method2130();
		} else if (arg1 == 5) {
			this.anInt4129 = arg0.method2130();
		} else if (arg1 == 6) {
			this.anInt4111 = arg0.method2130();
		} else if (arg1 == 7) {
			this.anInt4140 = arg0.method2130();
		} else if (arg1 == 8) {
			this.anInt4124 = arg0.method2130();
		} else if (arg1 == 9) {
			this.anInt4121 = arg0.method2130();
		} else if (arg1 == 26) {
			this.anInt4135 = (short) (arg0.method2146() * 4);
			this.anInt4109 = (short) (arg0.method2146() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray28 == null) {
				this.anIntArrayArray28 = new int[12][];
			}
			@Pc(326) int local326 = arg0.method2146();
			this.anIntArrayArray28[local326] = new int[6];
			for (@Pc(334) int local334 = 0; local334 < 6; local334++) {
				this.anIntArrayArray28[local326][local334] = arg0.method2191();
			}
		} else if (arg1 == 29) {
			this.anInt4141 = arg0.method2146();
		} else if (arg1 == 30) {
			this.anInt4117 = arg0.method2130();
		} else if (arg1 == 31) {
			this.anInt4130 = arg0.method2146();
		} else if (arg1 == 32) {
			this.anInt4138 = arg0.method2130();
		} else if (arg1 == 33) {
			this.anInt4125 = arg0.method2191();
		} else if (arg1 == 34) {
			this.anInt4144 = arg0.method2146();
		} else if (arg1 == 35) {
			this.anInt4137 = arg0.method2130();
		} else if (arg1 == 36) {
			this.anInt4115 = arg0.method2191();
		} else if (arg1 == 37) {
			this.anInt4132 = arg0.method2146();
		} else if (arg1 == 38) {
			this.anInt4127 = arg0.method2130();
		} else if (arg1 == 39) {
			this.anInt4116 = arg0.method2130();
		} else if (arg1 == 40) {
			this.anInt4128 = arg0.method2130();
		} else if (arg1 == 41) {
			this.anInt4119 = arg0.method2130();
		} else if (arg1 == 42) {
			this.anInt4143 = arg0.method2130();
		} else if (arg1 == 43) {
			arg0.method2130();
		} else if (arg1 == 44) {
			arg0.method2130();
		} else if (arg1 == 45) {
			this.anInt4122 = arg0.method2130();
		} else if (arg1 == 46) {
			this.anInt4134 = arg0.method2130();
		} else if (arg1 == 47) {
			this.anInt4131 = arg0.method2130();
		} else if (arg1 == 48) {
			this.anInt4118 = arg0.method2130();
		} else if (arg1 == 49) {
			this.anInt4123 = arg0.method2130();
		} else if (arg1 == 50) {
			this.anInt4139 = arg0.method2130();
		} else if (arg1 == 51) {
			this.anInt4112 = arg0.method2130();
		}
	}
}
