import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "B")
	private byte aByte2 = 89;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt136 = 658;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method42(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt140 = arg0.method472();
			this.anInt138 = arg0.method477();
			this.anInt139 = arg0.method477();
			this.method43(this.aByte2, arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("23306, " + arg0 + ", " + -32477 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!lb;)V")
	public void method43(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt137 = arg1.method472();
			this.anIntArray15 = new int[this.anInt137];
			this.anIntArray16 = new int[this.anInt137];
			if (arg0 == 89) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt137; local19++) {
					this.anIntArray15[local19] = arg1.method474();
					this.anIntArray16[local19] = arg1.method474();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("44030, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method44() {
		try {
			this.anInt141 = 0;
			this.anInt142 = 0;
			this.anInt143 = 0;
			this.anInt144 = 0;
			this.anInt145 = 0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("81170, " + 39192 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt145 >= this.anInt141) {
				this.anInt144 = this.anIntArray16[this.anInt142++] << 15;
				if (this.anInt142 >= this.anInt137) {
					this.anInt142 = this.anInt137 - 1;
				}
				this.anInt141 = (int) ((double) this.anIntArray15[this.anInt142] / 65536.0D * (double) arg0);
				if (this.anInt141 > this.anInt145) {
					this.anInt143 = ((this.anIntArray16[this.anInt142] << 15) - this.anInt144) / (this.anInt141 - this.anInt145);
				}
			}
			this.anInt144 += this.anInt143;
			this.anInt145++;
			return this.anInt144 - this.anInt143 >> 15;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("72612, " + -757 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}
}
