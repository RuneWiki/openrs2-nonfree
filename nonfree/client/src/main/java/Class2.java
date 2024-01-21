import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt152 = 707;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt156 = arg0.method480();
			this.anInt154 = arg0.method485();
			this.anInt155 = arg0.method485();
			this.method43(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("4407, " + arg0 + ", " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!lb;Z)V")
	public void method43(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt153 = arg0.method480();
			this.anIntArray15 = new int[this.anInt153];
			this.anIntArray16 = new int[this.anInt153];
			for (@Pc(26) int local26 = 0; local26 < this.anInt153; local26++) {
				this.anIntArray15[local26] = arg0.method482();
				this.anIntArray16[local26] = arg0.method482();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("2683, " + arg0 + ", " + true + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method44(@OriginalArg(0) int arg0) {
		try {
			this.anInt157 = 0;
			this.anInt158 = 0;
			this.anInt159 = 0;
			this.anInt160 = 0;
			this.anInt161 = 0;
			if (arg0 >= 0) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("28097, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt161 >= this.anInt157) {
				this.anInt160 = this.anIntArray16[this.anInt158++] << 15;
				if (this.anInt158 >= this.anInt153) {
					this.anInt158 = this.anInt153 - 1;
				}
				this.anInt157 = (int) ((double) this.anIntArray15[this.anInt158] / 65536.0D * (double) arg0);
				if (this.anInt157 > this.anInt161) {
					this.anInt159 = ((this.anIntArray16[this.anInt158] << 15) - this.anInt160) / (this.anInt157 - this.anInt161);
				}
			}
			this.anInt160 += this.anInt159;
			this.anInt161++;
			return this.anInt160 - this.anInt159 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("68895, " + 707 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
