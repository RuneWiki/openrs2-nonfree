import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class16 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	private int anInt820 = 2;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	private int[] anIntArray83 = new int[2];

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	private int[] anIntArray84 = new int[2];

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class16() {
		this.anIntArray83[0] = 0;
		this.anIntArray83[1] = 65535;
		this.anIntArray84[0] = 0;
		this.anIntArray84[1] = 65535;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
	public int method492(@OriginalArg(0) int arg0) {
		if (this.anInt828 >= this.anInt825) {
			this.anInt824 = this.anIntArray84[this.anInt826++] << 15;
			if (this.anInt826 >= this.anInt820) {
				this.anInt826 = this.anInt820 - 1;
			}
			this.anInt825 = (int) ((double) this.anIntArray83[this.anInt826] / 65536.0D * (double) arg0);
			if (this.anInt825 > this.anInt828) {
				this.anInt827 = ((this.anIntArray84[this.anInt826] << 15) - this.anInt824) / (this.anInt825 - this.anInt828);
			}
		}
		this.anInt824 += this.anInt827;
		this.anInt828++;
		return this.anInt824 - this.anInt827 >> 15;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!of;)V")
	public void method493(@OriginalArg(0) Class1_Sub19 arg0) {
		this.anInt823 = arg0.method2072();
		this.anInt822 = arg0.method2046();
		this.anInt821 = arg0.method2046();
		this.method494(arg0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Lclient!of;)V")
	public void method494(@OriginalArg(0) Class1_Sub19 arg0) {
		this.anInt820 = arg0.method2072();
		this.anIntArray83 = new int[this.anInt820];
		this.anIntArray84 = new int[this.anInt820];
		for (@Pc(16) int local16 = 0; local16 < this.anInt820; local16++) {
			this.anIntArray83[local16] = arg0.method2051();
			this.anIntArray84[local16] = arg0.method2051();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public void method495() {
		this.anInt825 = 0;
		this.anInt826 = 0;
		this.anInt827 = 0;
		this.anInt824 = 0;
		this.anInt828 = 0;
	}
}
