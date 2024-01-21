import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class100 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt4576;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public int anInt4578;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt4579;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	private int anInt4582;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	private int anInt4583;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt4575 = 2;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
	private int[] anIntArray404 = new int[2];

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	private int[] anIntArray405 = new int[2];

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class100() {
		this.anIntArray404[0] = 0;
		this.anIntArray404[1] = 65535;
		this.anIntArray405[0] = 0;
		this.anIntArray405[1] = 65535;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!fj;)V")
	public void method3461(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt4577 = arg0.method2771();
		this.anInt4576 = arg0.method2793();
		this.anInt4578 = arg0.method2793();
		this.method3464(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	public int method3462(@OriginalArg(0) int arg0) {
		if (this.anInt4583 >= this.anInt4581) {
			this.anInt4579 = this.anIntArray405[this.anInt4580++] << 15;
			if (this.anInt4580 >= this.anInt4575) {
				this.anInt4580 = this.anInt4575 - 1;
			}
			this.anInt4581 = (int) ((double) this.anIntArray404[this.anInt4580] / 65536.0D * (double) arg0);
			if (this.anInt4581 > this.anInt4583) {
				this.anInt4582 = ((this.anIntArray405[this.anInt4580] << 15) - this.anInt4579) / (this.anInt4581 - this.anInt4583);
			}
		}
		this.anInt4579 += this.anInt4582;
		this.anInt4583++;
		return this.anInt4579 - this.anInt4582 >> 15;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method3463() {
		this.anInt4581 = 0;
		this.anInt4580 = 0;
		this.anInt4582 = 0;
		this.anInt4579 = 0;
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!fj;)V")
	public void method3464(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt4575 = arg0.method2771();
		this.anIntArray404 = new int[this.anInt4575];
		this.anIntArray405 = new int[this.anInt4575];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4575; local16++) {
			this.anIntArray404[local16] = arg0.method2765();
			this.anIntArray405[local16] = arg0.method2765();
		}
	}
}
