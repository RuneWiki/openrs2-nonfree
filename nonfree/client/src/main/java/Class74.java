import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class74 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public int anInt3392;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	private int anInt3394;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private int anInt3395;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private int anInt3396;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	private int anInt3397;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	private int anInt3389 = 2;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
	private int[] anIntArray302 = new int[2];

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
	private int[] anIntArray301 = new int[2];

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class74() {
		this.anIntArray302[0] = 0;
		this.anIntArray302[1] = 65535;
		this.anIntArray301[0] = 0;
		this.anIntArray301[1] = 65535;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public int method2230(@OriginalArg(0) int arg0) {
		if (this.anInt3395 >= this.anInt3393) {
			this.anInt3397 = this.anIntArray301[this.anInt3396++] << 15;
			if (this.anInt3396 >= this.anInt3389) {
				this.anInt3396 = this.anInt3389 - 1;
			}
			this.anInt3393 = (int) ((double) this.anIntArray302[this.anInt3396] / 65536.0D * (double) arg0);
			if (this.anInt3393 > this.anInt3395) {
				this.anInt3394 = ((this.anIntArray301[this.anInt3396] << 15) - this.anInt3397) / (this.anInt3393 - this.anInt3395);
			}
		}
		this.anInt3397 += this.anInt3394;
		this.anInt3395++;
		return this.anInt3397 - this.anInt3394 >> 15;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!me;)V")
	public void method2231(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt3392 = arg0.method1402();
		this.anInt3390 = arg0.method1396();
		this.anInt3391 = arg0.method1396();
		this.method2233(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
	public void method2232() {
		this.anInt3393 = 0;
		this.anInt3396 = 0;
		this.anInt3394 = 0;
		this.anInt3397 = 0;
		this.anInt3395 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lclient!me;)V")
	public void method2233(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt3389 = arg0.method1402();
		this.anIntArray302 = new int[this.anInt3389];
		this.anIntArray301 = new int[this.anInt3389];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3389; local16++) {
			this.anIntArray302[local16] = arg0.method1397();
			this.anIntArray301[local16] = arg0.method1397();
		}
	}
}
