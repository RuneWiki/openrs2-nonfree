import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt141 = 39;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt142 = 633;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt146 = arg0.method480();
			this.anInt144 = arg0.method485();
			this.anInt145 = arg0.method485();
			this.method43(arg0, this.anInt141);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("39517, " + arg0 + ", " + 8 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!lb;I)V")
	public void method43(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt143 = arg0.method480();
			this.anIntArray15 = new int[this.anInt143];
			this.anIntArray16 = new int[this.anInt143];
			if (arg1 <= 0) {
				this.anInt142 = 182;
			}
			for (@Pc(20) int local20 = 0; local20 < this.anInt143; local20++) {
				this.anIntArray15[local20] = arg0.method482();
				this.anIntArray16[local20] = arg0.method482();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("62173, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method44() {
		try {
			this.anInt147 = 0;
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
			this.anInt151 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("33044, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt151 >= this.anInt147) {
				this.anInt150 = this.anIntArray16[this.anInt148++] << 15;
				if (this.anInt148 >= this.anInt143) {
					this.anInt148 = this.anInt143 - 1;
				}
				this.anInt147 = (int) ((double) this.anIntArray15[this.anInt148] / 65536.0D * (double) arg0);
				if (this.anInt147 > this.anInt151) {
					this.anInt149 = ((this.anIntArray16[this.anInt148] << 15) - this.anInt150) / (this.anInt147 - this.anInt151);
				}
			}
			this.anInt150 += this.anInt149;
			this.anInt151++;
			return this.anInt150 - this.anInt149 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("99383, " + -45088 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
