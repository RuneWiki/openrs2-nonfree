import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class42 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!kb;Z)V")
	public void method552(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			this.anInt825 = arg0.method391();
			this.anInt823 = arg0.method396();
			this.anInt824 = arg0.method396();
			this.anInt822 = arg0.method391();
			this.anIntArray227 = new int[this.anInt822];
			this.anIntArray228 = new int[this.anInt822];
			for (@Pc(35) int local35 = 0; local35 < this.anInt822; local35++) {
				this.anIntArray227[local35] = arg0.method393();
				this.anIntArray228[local35] = arg0.method393();
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("34323, " + arg0 + ", " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public void method553() {
		try {
			this.anInt826 = 0;
			this.anInt827 = 0;
			this.anInt828 = 0;
			this.anInt829 = 0;
			this.anInt830 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32199, " + 5 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(IB)I")
	public int method554(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt830 >= this.anInt826) {
				this.anInt829 = this.anIntArray228[this.anInt827++] << 15;
				if (this.anInt827 >= this.anInt822) {
					this.anInt827 = this.anInt822 - 1;
				}
				this.anInt826 = (int) ((double) this.anIntArray227[this.anInt827] / 65536.0D * (double) arg0);
				if (this.anInt826 > this.anInt830) {
					this.anInt828 = ((this.anIntArray228[this.anInt827] << 15) - this.anInt829) / (this.anInt826 - this.anInt830);
				}
			}
			this.anInt829 += this.anInt828;
			this.anInt830++;
			return this.anInt829 - this.anInt828 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("38722, " + arg0 + ", " + 47 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
