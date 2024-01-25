import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class121 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public int anInt3110;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	private int anInt3112;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private int anInt3113;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private int anInt3114;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	private int anInt3115;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	private int anInt3116;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	private int anInt3109 = 2;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
	private int[] anIntArray616 = new int[2];

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	private int[] anIntArray615 = new int[2];

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class121() {
		this.anIntArray616[0] = 0;
		this.anIntArray616[1] = 65535;
		this.anIntArray615[0] = 0;
		this.anIntArray615[1] = 65535;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	public int method2871(@OriginalArg(0) int arg0) {
		if (this.anInt3113 >= this.anInt3116) {
			this.anInt3112 = this.anIntArray615[this.anInt3114++] << 15;
			if (this.anInt3114 >= this.anInt3109) {
				this.anInt3114 = this.anInt3109 - 1;
			}
			this.anInt3116 = (int) ((double) this.anIntArray616[this.anInt3114] / 65536.0D * (double) arg0);
			if (this.anInt3116 > this.anInt3113) {
				this.anInt3115 = ((this.anIntArray615[this.anInt3114] << 15) - this.anInt3112) / (this.anInt3116 - this.anInt3113);
			}
		}
		this.anInt3112 += this.anInt3115;
		this.anInt3113++;
		return this.anInt3112 - this.anInt3115 >> 15;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	public void method2872() {
		this.anInt3116 = 0;
		this.anInt3114 = 0;
		this.anInt3115 = 0;
		this.anInt3112 = 0;
		this.anInt3113 = 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!kk;)V")
	public void method2873(@OriginalArg(0) Class2_Sub16 arg0) {
		this.anInt3110 = arg0.method5350();
		this.anInt3108 = arg0.method5346();
		this.anInt3111 = arg0.method5346();
		this.method2874(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lclient!kk;)V")
	public void method2874(@OriginalArg(0) Class2_Sub16 arg0) {
		this.anInt3109 = arg0.method5350();
		this.anIntArray616 = new int[this.anInt3109];
		this.anIntArray615 = new int[this.anInt3109];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3109; local16++) {
			this.anIntArray616[local16] = arg0.method5312();
			this.anIntArray615[local16] = arg0.method5312();
		}
	}
}
