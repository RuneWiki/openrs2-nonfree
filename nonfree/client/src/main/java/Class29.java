import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class29 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	private int anInt825 = 2;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
	private int[] anIntArray123 = new int[2];

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
	private int[] anIntArray122 = new int[2];

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class29() {
		this.anIntArray123[0] = 0;
		this.anIntArray123[1] = 65535;
		this.anIntArray122[0] = 0;
		this.anIntArray122[1] = 65535;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!id;)V")
	public void method581(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt824 = arg0.method1837();
		this.anInt823 = arg0.method1817();
		this.anInt822 = arg0.method1817();
		this.method582(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lclient!id;)V")
	public void method582(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt825 = arg0.method1837();
		this.anIntArray123 = new int[this.anInt825];
		this.anIntArray122 = new int[this.anInt825];
		for (@Pc(16) int local16 = 0; local16 < this.anInt825; local16++) {
			this.anIntArray123[local16] = arg0.method1842();
			this.anIntArray122[local16] = arg0.method1842();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
	public int method583(@OriginalArg(0) int arg0) {
		if (this.anInt826 >= this.anInt830) {
			this.anInt827 = this.anIntArray122[this.anInt829++] << 15;
			if (this.anInt829 >= this.anInt825) {
				this.anInt829 = this.anInt825 - 1;
			}
			this.anInt830 = (int) ((double) this.anIntArray123[this.anInt829] / 65536.0D * (double) arg0);
			if (this.anInt830 > this.anInt826) {
				this.anInt828 = ((this.anIntArray122[this.anInt829] << 15) - this.anInt827) / (this.anInt830 - this.anInt826);
			}
		}
		this.anInt827 += this.anInt828;
		this.anInt826++;
		return this.anInt827 - this.anInt828 >> 15;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public void method584() {
		this.anInt830 = 0;
		this.anInt829 = 0;
		this.anInt828 = 0;
		this.anInt827 = 0;
		this.anInt826 = 0;
	}
}
