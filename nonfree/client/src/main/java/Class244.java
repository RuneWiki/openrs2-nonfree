import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class244 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
	public int anInt7631;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	public int anInt7632;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
	public int anInt7633;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
	private int anInt7635;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
	private int anInt7636;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
	private int anInt7637;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
	private int anInt7638;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
	private int anInt7639;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
	private int anInt7634 = 2;

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "[I")
	private int[] anIntArray590 = new int[2];

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "[I")
	private int[] anIntArray591 = new int[2];

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class244() {
		this.anIntArray590[0] = 0;
		this.anIntArray590[1] = 65535;
		this.anIntArray591[0] = 0;
		this.anIntArray591[1] = 65535;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!ps;)V")
	public void method6408(@OriginalArg(0) Class2_Sub29 arg0) {
		this.anInt7634 = arg0.method5170();
		this.anIntArray590 = new int[this.anInt7634];
		this.anIntArray591 = new int[this.anInt7634];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7634; local16++) {
			this.anIntArray590[local16] = arg0.method5229();
			this.anIntArray591[local16] = arg0.method5229();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "()V")
	public void method6409() {
		this.anInt7635 = 0;
		this.anInt7638 = 0;
		this.anInt7637 = 0;
		this.anInt7639 = 0;
		this.anInt7636 = 0;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lclient!ps;)V")
	public void method6410(@OriginalArg(0) Class2_Sub29 arg0) {
		this.anInt7631 = arg0.method5170();
		this.anInt7633 = arg0.method5198();
		this.anInt7632 = arg0.method5198();
		this.method6408(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I")
	public int method6411(@OriginalArg(0) int arg0) {
		if (this.anInt7636 >= this.anInt7635) {
			this.anInt7639 = this.anIntArray591[this.anInt7638++] << 15;
			if (this.anInt7638 >= this.anInt7634) {
				this.anInt7638 = this.anInt7634 - 1;
			}
			this.anInt7635 = (int) ((double) this.anIntArray590[this.anInt7638] / 65536.0D * (double) arg0);
			if (this.anInt7635 > this.anInt7636) {
				this.anInt7637 = ((this.anIntArray591[this.anInt7638] << 15) - this.anInt7639) / (this.anInt7635 - this.anInt7636);
			}
		}
		this.anInt7639 += this.anInt7637;
		this.anInt7636++;
		return this.anInt7639 - this.anInt7637 >> 15;
	}
}
