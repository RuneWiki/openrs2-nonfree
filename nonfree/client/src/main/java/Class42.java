import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class42 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private static int anInt814 = 48104;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "B")
	private byte aByte59 = 6;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(BLclient!kb;)V")
	public void method544(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			this.anInt818 = arg1.method383();
			if (arg0 != 8) {
				anInt814 = -267;
			}
			this.anInt816 = arg1.method388();
			this.anInt817 = arg1.method388();
			this.anInt815 = arg1.method383();
			this.anIntArray227 = new int[this.anInt815];
			this.anIntArray228 = new int[this.anInt815];
			for (@Pc(34) int local34 = 0; local34 < this.anInt815; local34++) {
				this.anIntArray227[local34] = arg1.method385();
				this.anIntArray228[local34] = arg1.method385();
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("75384, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public void method545() {
		try {
			this.anInt819 = 0;
			this.anInt820 = 0;
			this.anInt821 = 0;
			this.anInt822 = 0;
			this.anInt823 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20789, " + -81 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(BI)I")
	public int method546(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt823 >= this.anInt819) {
				this.anInt822 = this.anIntArray228[this.anInt820++] << 15;
				if (this.anInt820 >= this.anInt815) {
					this.anInt820 = this.anInt815 - 1;
				}
				this.anInt819 = (int) ((double) this.anIntArray227[this.anInt820] / 65536.0D * (double) arg0);
				if (this.anInt819 > this.anInt823) {
					this.anInt821 = ((this.anIntArray228[this.anInt820] << 15) - this.anInt822) / (this.anInt819 - this.anInt823);
				}
			}
			this.anInt822 += this.anInt821;
			if (this.aByte59 != 6) {
				anInt814 = -399;
			}
			this.anInt823++;
			return this.anInt822 - this.anInt821 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("97993, " + 6 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
