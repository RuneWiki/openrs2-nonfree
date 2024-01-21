import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class80 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public int anInt3348;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public int anInt3349;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public int anInt3350;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	private int anInt3352;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	private int anInt3353;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	private int anInt3354;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	private int anInt3356;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	private int anInt3351 = 2;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
	private int[] anIntArray311 = new int[2];

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
	private int[] anIntArray310 = new int[2];

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class80() {
		this.anIntArray311[0] = 0;
		this.anIntArray311[1] = 65535;
		this.anIntArray310[0] = 0;
		this.anIntArray310[1] = 65535;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
	public int method2597(@OriginalArg(0) int arg0) {
		if (this.anInt3356 >= this.anInt3353) {
			this.anInt3354 = this.anIntArray310[this.anInt3352++] << 15;
			if (this.anInt3352 >= this.anInt3351) {
				this.anInt3352 = this.anInt3351 - 1;
			}
			this.anInt3353 = (int) ((double) this.anIntArray311[this.anInt3352] / 65536.0D * (double) arg0);
			if (this.anInt3353 > this.anInt3356) {
				this.anInt3355 = ((this.anIntArray310[this.anInt3352] << 15) - this.anInt3354) / (this.anInt3353 - this.anInt3356);
			}
		}
		this.anInt3354 += this.anInt3355;
		this.anInt3356++;
		return this.anInt3354 - this.anInt3355 >> 15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method2598() {
		this.anInt3353 = 0;
		this.anInt3352 = 0;
		this.anInt3355 = 0;
		this.anInt3354 = 0;
		this.anInt3356 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ja;)V")
	public void method2599(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt3351 = arg0.method2962();
		this.anIntArray311 = new int[this.anInt3351];
		this.anIntArray310 = new int[this.anInt3351];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3351; local16++) {
			this.anIntArray311[local16] = arg0.method2933();
			this.anIntArray310[local16] = arg0.method2933();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!ja;)V")
	public void method2600(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt3349 = arg0.method2962();
		this.anInt3350 = arg0.method2946();
		this.anInt3348 = arg0.method2946();
		this.method2599(arg0);
	}
}
