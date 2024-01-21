import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!lb;)V")
	public void method42(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt141 = arg0.method476();
			this.anInt139 = arg0.method481();
			this.anInt140 = arg0.method481();
			this.method43(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("71989, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lb;)V")
	public void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt138 = arg0.method476();
			this.anIntArray15 = new int[this.anInt138];
			this.anIntArray16 = new int[this.anInt138];
			for (@Pc(18) int local18 = 0; local18 < this.anInt138; local18++) {
				this.anIntArray15[local18] = arg0.method478();
				this.anIntArray16[local18] = arg0.method478();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("90209, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method44() {
		try {
			this.anInt142 = 0;
			this.anInt143 = 0;
			this.anInt144 = 0;
			this.anInt145 = 0;
			this.anInt146 = 0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("93961, " + -9520 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public int method45(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt146 >= this.anInt142) {
				this.anInt145 = this.anIntArray16[this.anInt143++] << 15;
				if (this.anInt143 >= this.anInt138) {
					this.anInt143 = this.anInt138 - 1;
				}
				this.anInt142 = (int) ((double) this.anIntArray15[this.anInt143] / 65536.0D * (double) arg0);
				if (this.anInt142 > this.anInt146) {
					this.anInt144 = ((this.anIntArray16[this.anInt143] << 15) - this.anInt145) / (this.anInt142 - this.anInt146);
				}
			}
			this.anInt145 += this.anInt144;
			this.anInt146++;
			return this.anInt145 - this.anInt144 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("76406, " + 0 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
