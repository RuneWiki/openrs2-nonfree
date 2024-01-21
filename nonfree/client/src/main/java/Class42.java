import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class42 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(ZLclient!kb;)V")
	public void method552(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			this.anInt829 = arg0.method391();
			this.anInt827 = arg0.method396();
			this.anInt828 = arg0.method396();
			this.anInt826 = arg0.method391();
			this.anIntArray227 = new int[this.anInt826];
			this.anIntArray228 = new int[this.anInt826];
			for (@Pc(38) int local38 = 0; local38 < this.anInt826; local38++) {
				this.anIntArray227[local38] = arg0.method393();
				this.anIntArray228[local38] = arg0.method393();
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("83915, " + false + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public void method553(@OriginalArg(0) int arg0) {
		try {
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anInt832 = 0;
			this.anInt833 = 0;
			if (arg0 >= 8 && arg0 <= 8) {
				this.anInt834 = 0;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("47965, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(ZI)I")
	public int method554(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt834 >= this.anInt830) {
				this.anInt833 = this.anIntArray228[this.anInt831++] << 15;
				if (this.anInt831 >= this.anInt826) {
					this.anInt831 = this.anInt826 - 1;
				}
				this.anInt830 = (int) ((double) this.anIntArray227[this.anInt831] / 65536.0D * (double) arg0);
				if (this.anInt830 > this.anInt834) {
					this.anInt832 = ((this.anIntArray228[this.anInt831] << 15) - this.anInt833) / (this.anInt830 - this.anInt834);
				}
			}
			this.anInt833 += this.anInt832;
			this.anInt834++;
			return this.anInt833 - this.anInt832 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("65731, " + true + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
