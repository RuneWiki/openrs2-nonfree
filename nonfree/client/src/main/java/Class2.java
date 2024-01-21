import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt141;

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

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt142 = -7404;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!lb;)V")
	public void method42(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt146 = arg0.method480();
			this.anInt144 = arg0.method485();
			this.anInt145 = arg0.method485();
			this.method43(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("56509, " + false + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt143 = arg0.method480();
			this.anIntArray15 = new int[this.anInt143];
			this.anIntArray16 = new int[this.anInt143];
			for (@Pc(24) int local24 = 0; local24 < this.anInt143; local24++) {
				this.anIntArray15[local24] = arg0.method482();
				this.anIntArray16[local24] = arg0.method482();
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("93657, " + -977 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method44() {
		try {
			this.anInt147 = 0;
			this.anInt148 = 0;
			this.anInt149 = 0;
			this.anInt150 = 0;
			this.anInt151 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14758, " + 105 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)I")
	public int method45(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("61037, " + arg0 + ", " + false + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
