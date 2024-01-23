import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class98 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public int anInt3414;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public int anInt3415;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int anInt3416;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt3418;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt3419;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	private int anInt3420;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	private int anInt3413 = 2;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	private int[] anIntArray347 = new int[2];

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	private int[] anIntArray346 = new int[2];

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class98() {
		this.anIntArray347[0] = 0;
		this.anIntArray347[1] = 65535;
		this.anIntArray346[0] = 0;
		this.anIntArray346[1] = 65535;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!oe;)V")
	public void method2816(@OriginalArg(0) Class2_Sub16 arg0) {
		this.anInt3414 = arg0.method2146();
		this.anInt3416 = arg0.method2145();
		this.anInt3415 = arg0.method2145();
		this.method2817(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!oe;)V")
	public void method2817(@OriginalArg(0) Class2_Sub16 arg0) {
		this.anInt3413 = arg0.method2146();
		this.anIntArray347 = new int[this.anInt3413];
		this.anIntArray346 = new int[this.anInt3413];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3413; local16++) {
			this.anIntArray347[local16] = arg0.method2130();
			this.anIntArray346[local16] = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public void method2818() {
		this.anInt3420 = 0;
		this.anInt3419 = 0;
		this.anInt3421 = 0;
		this.anInt3418 = 0;
		this.anInt3417 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public int method2819(@OriginalArg(0) int arg0) {
		if (this.anInt3417 >= this.anInt3420) {
			this.anInt3418 = this.anIntArray346[this.anInt3419++] << 15;
			if (this.anInt3419 >= this.anInt3413) {
				this.anInt3419 = this.anInt3413 - 1;
			}
			this.anInt3420 = (int) ((double) this.anIntArray347[this.anInt3419] / 65536.0D * (double) arg0);
			if (this.anInt3420 > this.anInt3417) {
				this.anInt3421 = ((this.anIntArray346[this.anInt3419] << 15) - this.anInt3418) / (this.anInt3420 - this.anInt3417);
			}
		}
		this.anInt3418 += this.anInt3421;
		this.anInt3417++;
		return this.anInt3418 - this.anInt3421 >> 15;
	}
}
