import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class79 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public int anInt3478;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public int anInt3479;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public int anInt3480;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	private int anInt3482;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	private int anInt3483;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	private int anInt3484;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private int anInt3485;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	private int anInt3486;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	private int anInt3481 = 2;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	private int[] anIntArray324 = new int[2];

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
	private int[] anIntArray323 = new int[2];

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class79() {
		this.anIntArray324[0] = 0;
		this.anIntArray324[1] = 65535;
		this.anIntArray323[0] = 0;
		this.anIntArray323[1] = 65535;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
	public int method2401(@OriginalArg(0) int arg0) {
		if (this.anInt3483 >= this.anInt3482) {
			this.anInt3484 = this.anIntArray323[this.anInt3486++] << 15;
			if (this.anInt3486 >= this.anInt3481) {
				this.anInt3486 = this.anInt3481 - 1;
			}
			this.anInt3482 = (int) ((double) this.anIntArray324[this.anInt3486] / 65536.0D * (double) arg0);
			if (this.anInt3482 > this.anInt3483) {
				this.anInt3485 = ((this.anIntArray323[this.anInt3486] << 15) - this.anInt3484) / (this.anInt3482 - this.anInt3483);
			}
		}
		this.anInt3484 += this.anInt3485;
		this.anInt3483++;
		return this.anInt3484 - this.anInt3485 >> 15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ab;)V")
	public void method2402(@OriginalArg(0) Class2_Sub2 arg0) {
		this.anInt3481 = arg0.method1698();
		this.anIntArray324 = new int[this.anInt3481];
		this.anIntArray323 = new int[this.anInt3481];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3481; local16++) {
			this.anIntArray324[local16] = arg0.method1680();
			this.anIntArray323[local16] = arg0.method1680();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!ab;)V")
	public void method2403(@OriginalArg(0) Class2_Sub2 arg0) {
		this.anInt3480 = arg0.method1698();
		this.anInt3478 = arg0.method1690();
		this.anInt3479 = arg0.method1690();
		this.method2402(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method2404() {
		this.anInt3482 = 0;
		this.anInt3486 = 0;
		this.anInt3485 = 0;
		this.anInt3484 = 0;
		this.anInt3483 = 0;
	}
}
