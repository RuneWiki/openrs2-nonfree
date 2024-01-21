import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt134 = 471;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method42(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt138 = arg1.method480();
			this.anInt136 = arg1.method485();
			this.anInt137 = arg1.method485();
			this.method43(arg1);
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("17626, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method43(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt135 = arg0.method480();
			this.anIntArray15 = new int[this.anInt135];
			this.anIntArray16 = new int[this.anInt135];
			for (@Pc(26) int local26 = 0; local26 < this.anInt135; local26++) {
				this.anIntArray15[local26] = arg0.method482();
				this.anIntArray16[local26] = arg0.method482();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("55807, " + arg0 + ", " + 6 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method44() {
		try {
			this.anInt139 = 0;
			this.anInt140 = 0;
			this.anInt141 = 0;
			this.anInt142 = 0;
			this.anInt143 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("13693, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt143 >= this.anInt139) {
				this.anInt142 = this.anIntArray16[this.anInt140++] << 15;
				if (this.anInt140 >= this.anInt135) {
					this.anInt140 = this.anInt135 - 1;
				}
				this.anInt139 = (int) ((double) this.anIntArray15[this.anInt140] / 65536.0D * (double) arg1);
				if (this.anInt139 > this.anInt143) {
					this.anInt141 = ((this.anIntArray16[this.anInt140] << 15) - this.anInt142) / (this.anInt139 - this.anInt143);
				}
			}
			this.anInt142 += this.anInt141;
			this.anInt143++;
			@Pc(83) boolean local83 = false;
			return this.anInt142 - this.anInt141 >> 15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("13221, " + arg0 + ", " + arg1 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}
}
