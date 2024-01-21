import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class79 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int anInt3547;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt3549;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int anInt3550;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	private int anInt3551;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt3552;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	private int anInt3553;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	private int anInt3548 = 2;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	private int[] anIntArray380 = new int[2];

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
	private int[] anIntArray379 = new int[2];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class79() {
		this.anIntArray380[0] = 0;
		this.anIntArray380[1] = 65535;
		this.anIntArray379[0] = 0;
		this.anIntArray379[1] = 65535;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ff;)V")
	public void method2569(@OriginalArg(0) Class3_Sub12 arg0) {
		this.anInt3548 = arg0.method1354();
		this.anIntArray380 = new int[this.anInt3548];
		this.anIntArray379 = new int[this.anInt3548];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3548; local16++) {
			this.anIntArray380[local16] = arg0.method1359();
			this.anIntArray379[local16] = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!ff;)V")
	public void method2570(@OriginalArg(0) Class3_Sub12 arg0) {
		this.anInt3549 = arg0.method1354();
		this.anInt3550 = arg0.method1373();
		this.anInt3547 = arg0.method1373();
		this.method2569(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
	public void method2571() {
		this.anInt3553 = 0;
		this.anInt3552 = 0;
		this.anInt3551 = 0;
		this.anInt3554 = 0;
		this.anInt3555 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public int method2572(@OriginalArg(0) int arg0) {
		if (this.anInt3555 >= this.anInt3553) {
			this.anInt3554 = this.anIntArray379[this.anInt3552++] << 15;
			if (this.anInt3552 >= this.anInt3548) {
				this.anInt3552 = this.anInt3548 - 1;
			}
			this.anInt3553 = (int) ((double) this.anIntArray380[this.anInt3552] / 65536.0D * (double) arg0);
			if (this.anInt3553 > this.anInt3555) {
				this.anInt3551 = ((this.anIntArray379[this.anInt3552] << 15) - this.anInt3554) / (this.anInt3553 - this.anInt3555);
			}
		}
		this.anInt3554 += this.anInt3551;
		this.anInt3555++;
		return this.anInt3554 - this.anInt3551 >> 15;
	}
}
