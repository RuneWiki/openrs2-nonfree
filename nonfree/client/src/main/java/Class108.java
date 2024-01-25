import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class108 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public int anInt3345;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt3346;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt3347;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	private int anInt3348;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	private int anInt3349;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	private int anInt3351;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	private int anInt3352;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	private int anInt3344 = 2;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "[I")
	private int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
	private int[] anIntArray199 = new int[2];

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class108() {
		this.anIntArray200[0] = 0;
		this.anIntArray200[1] = 65535;
		this.anIntArray199[0] = 0;
		this.anIntArray199[1] = 65535;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public int method2940(@OriginalArg(0) int arg0) {
		if (this.anInt3349 >= this.anInt3352) {
			this.anInt3348 = this.anIntArray199[this.anInt3350++] << 15;
			if (this.anInt3350 >= this.anInt3344) {
				this.anInt3350 = this.anInt3344 - 1;
			}
			this.anInt3352 = (int) ((double) this.anIntArray200[this.anInt3350] / 65536.0D * (double) arg0);
			if (this.anInt3352 > this.anInt3349) {
				this.anInt3351 = ((this.anIntArray199[this.anInt3350] << 15) - this.anInt3348) / (this.anInt3352 - this.anInt3349);
			}
		}
		this.anInt3348 += this.anInt3351;
		this.anInt3349++;
		return this.anInt3348 - this.anInt3351 >> 15;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
	public void method2941() {
		this.anInt3352 = 0;
		this.anInt3350 = 0;
		this.anInt3351 = 0;
		this.anInt3348 = 0;
		this.anInt3349 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ji;)V")
	public void method2942(@OriginalArg(0) Class6_Sub21 arg0) {
		this.anInt3344 = arg0.method6069();
		this.anIntArray200 = new int[this.anInt3344];
		this.anIntArray199 = new int[this.anInt3344];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3344; local16++) {
			this.anIntArray200[local16] = arg0.method6003();
			this.anIntArray199[local16] = arg0.method6003();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lclient!ji;)V")
	public void method2943(@OriginalArg(0) Class6_Sub21 arg0) {
		this.anInt3345 = arg0.method6069();
		this.anInt3346 = arg0.method6036();
		this.anInt3347 = arg0.method6036();
		this.method2942(arg0);
	}
}
