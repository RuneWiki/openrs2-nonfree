import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class95 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public int anInt3637;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	public int anInt3638;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	private int anInt3640;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private int anInt3641;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	private int anInt3642;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private int anInt3643;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	private int anInt3635 = 2;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[I")
	private int[] anIntArray322 = new int[2];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	private int[] anIntArray321 = new int[2];

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class95() {
		this.anIntArray322[0] = 0;
		this.anIntArray322[1] = 65535;
		this.anIntArray321[0] = 0;
		this.anIntArray321[1] = 65535;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	public void method2689() {
		this.anInt3641 = 0;
		this.anInt3640 = 0;
		this.anInt3642 = 0;
		this.anInt3639 = 0;
		this.anInt3643 = 0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!vf;)V")
	public void method2690(@OriginalArg(0) Class1_Sub26 arg0) {
		this.anInt3637 = arg0.method2945();
		this.anInt3636 = arg0.method2958();
		this.anInt3638 = arg0.method2958();
		this.method2691(arg0);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Lclient!vf;)V")
	public void method2691(@OriginalArg(0) Class1_Sub26 arg0) {
		this.anInt3635 = arg0.method2945();
		this.anIntArray322 = new int[this.anInt3635];
		this.anIntArray321 = new int[this.anInt3635];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3635; local16++) {
			this.anIntArray322[local16] = arg0.method2964();
			this.anIntArray321[local16] = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	public int method2692(@OriginalArg(0) int arg0) {
		if (this.anInt3643 >= this.anInt3641) {
			this.anInt3639 = this.anIntArray321[this.anInt3640++] << 15;
			if (this.anInt3640 >= this.anInt3635) {
				this.anInt3640 = this.anInt3635 - 1;
			}
			this.anInt3641 = (int) ((double) this.anIntArray322[this.anInt3640] / 65536.0D * (double) arg0);
			if (this.anInt3641 > this.anInt3643) {
				this.anInt3642 = ((this.anIntArray321[this.anInt3640] << 15) - this.anInt3639) / (this.anInt3641 - this.anInt3643);
			}
		}
		this.anInt3639 += this.anInt3642;
		this.anInt3643++;
		return this.anInt3639 - this.anInt3642 >> 15;
	}
}
