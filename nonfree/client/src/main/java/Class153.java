import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class153 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public int anInt4473;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public int anInt4474;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public int anInt4476;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	private int anInt4478;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
	private int anInt4479;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	private int anInt4480;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	private int anInt4481;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	private int anInt4475 = 2;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
	private int[] anIntArray295 = new int[2];

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
	private int[] anIntArray296 = new int[2];

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class153() {
		this.anIntArray295[0] = 0;
		this.anIntArray295[1] = 65535;
		this.anIntArray296[0] = 0;
		this.anIntArray296[1] = 65535;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ug;)V")
	public void method3530(@OriginalArg(0) Class1_Sub28 arg0) {
		this.anInt4474 = arg0.method5337();
		this.anInt4476 = arg0.method5355();
		this.anInt4473 = arg0.method5355();
		this.method3531(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lclient!ug;)V")
	public void method3531(@OriginalArg(0) Class1_Sub28 arg0) {
		this.anInt4475 = arg0.method5337();
		this.anIntArray295 = new int[this.anInt4475];
		this.anIntArray296 = new int[this.anInt4475];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4475; local16++) {
			this.anIntArray295[local16] = arg0.method5335();
			this.anIntArray296[local16] = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	public void method3532() {
		this.anInt4477 = 0;
		this.anInt4481 = 0;
		this.anInt4480 = 0;
		this.anInt4479 = 0;
		this.anInt4478 = 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public int method3533(@OriginalArg(0) int arg0) {
		if (this.anInt4478 >= this.anInt4477) {
			this.anInt4479 = this.anIntArray296[this.anInt4481++] << 15;
			if (this.anInt4481 >= this.anInt4475) {
				this.anInt4481 = this.anInt4475 - 1;
			}
			this.anInt4477 = (int) ((double) this.anIntArray295[this.anInt4481] / 65536.0D * (double) arg0);
			if (this.anInt4477 > this.anInt4478) {
				this.anInt4480 = ((this.anIntArray296[this.anInt4481] << 15) - this.anInt4479) / (this.anInt4477 - this.anInt4478);
			}
		}
		this.anInt4479 += this.anInt4480;
		this.anInt4478++;
		return this.anInt4479 - this.anInt4480 >> 15;
	}
}
