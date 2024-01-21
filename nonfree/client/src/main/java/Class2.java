import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt150 = -148;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method42(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt154 = arg0.method480();
			this.anInt152 = arg0.method485();
			this.anInt153 = arg0.method485();
			this.method43(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("87577, " + 8 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!lb;)V")
	public void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt151 = arg0.method480();
			this.anIntArray15 = new int[this.anInt151];
			this.anIntArray16 = new int[this.anInt151];
			for (@Pc(20) int local20 = 0; local20 < this.anInt151; local20++) {
				this.anIntArray15[local20] = arg0.method482();
				this.anIntArray16[local20] = arg0.method482();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("10194, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method44() {
		try {
			this.anInt155 = 0;
			this.anInt156 = 0;
			this.anInt157 = 0;
			this.anInt158 = 0;
			this.anInt159 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("50009, " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt159 >= this.anInt155) {
				this.anInt158 = this.anIntArray16[this.anInt156++] << 15;
				if (this.anInt156 >= this.anInt151) {
					this.anInt156 = this.anInt151 - 1;
				}
				this.anInt155 = (int) ((double) this.anIntArray15[this.anInt156] / 65536.0D * (double) arg0);
				if (this.anInt155 > this.anInt159) {
					this.anInt157 = ((this.anIntArray16[this.anInt156] << 15) - this.anInt158) / (this.anInt155 - this.anInt159);
				}
			}
			this.anInt158 += this.anInt157;
			this.anInt159++;
			return this.anInt158 - this.anInt157 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("47515, " + arg0 + ", " + -936 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
