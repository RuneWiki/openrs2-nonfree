import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class130 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public int anInt3592;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	private int anInt3596;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	private int anInt3597;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	private int anInt3598;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	private int anInt3599;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	private int anInt3600;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	private int anInt3595 = 2;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "[I")
	private int[] anIntArray265 = new int[2];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
	private int[] anIntArray264 = new int[2];

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class130() {
		this.anIntArray265[0] = 0;
		this.anIntArray265[1] = 65535;
		this.anIntArray264[0] = 0;
		this.anIntArray264[1] = 65535;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
	public int method2818(@OriginalArg(0) int arg0) {
		if (this.anInt3596 >= this.anInt3600) {
			this.anInt3599 = this.anIntArray264[this.anInt3598++] << 15;
			if (this.anInt3598 >= this.anInt3595) {
				this.anInt3598 = this.anInt3595 - 1;
			}
			this.anInt3600 = (int) ((double) this.anIntArray265[this.anInt3598] / 65536.0D * (double) arg0);
			if (this.anInt3600 > this.anInt3596) {
				this.anInt3597 = ((this.anIntArray264[this.anInt3598] << 15) - this.anInt3599) / (this.anInt3600 - this.anInt3596);
			}
		}
		this.anInt3599 += this.anInt3597;
		this.anInt3596++;
		return this.anInt3599 - this.anInt3597 >> 15;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
	public void method2819() {
		this.anInt3600 = 0;
		this.anInt3598 = 0;
		this.anInt3597 = 0;
		this.anInt3599 = 0;
		this.anInt3596 = 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!wm;)V")
	public void method2820(@OriginalArg(0) Class1_Sub19 arg0) {
		this.anInt3595 = arg0.method2915();
		this.anIntArray265 = new int[this.anInt3595];
		this.anIntArray264 = new int[this.anInt3595];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3595; local16++) {
			this.anIntArray265[local16] = arg0.method2896();
			this.anIntArray264[local16] = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(Lclient!wm;)V")
	public void method2821(@OriginalArg(0) Class1_Sub19 arg0) {
		this.anInt3593 = arg0.method2915();
		this.anInt3594 = arg0.method2877();
		this.anInt3592 = arg0.method2877();
		this.method2820(arg0);
	}
}
