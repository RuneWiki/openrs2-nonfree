import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class160 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public int anInt4427;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public int anInt4428;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public int anInt4429;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	private int anInt4431;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	private int anInt4432;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	private int anInt4433;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	private int anInt4430 = 2;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
	private int[] anIntArray225 = new int[2];

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	private int[] anIntArray226 = new int[2];

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class160() {
		this.anIntArray225[0] = 0;
		this.anIntArray225[1] = 65535;
		this.anIntArray226[0] = 0;
		this.anIntArray226[1] = 65535;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!jc;)V")
	public void method4070(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt4429 = arg0.method3030();
		this.anInt4428 = arg0.method3015();
		this.anInt4427 = arg0.method3015();
		this.method4072(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
	public int method4071(@OriginalArg(0) int arg0) {
		if (this.anInt4432 >= this.anInt4433) {
			this.anInt4434 = this.anIntArray226[this.anInt4431++] << 15;
			if (this.anInt4431 >= this.anInt4430) {
				this.anInt4431 = this.anInt4430 - 1;
			}
			this.anInt4433 = (int) ((double) this.anIntArray225[this.anInt4431] / 65536.0D * (double) arg0);
			if (this.anInt4433 > this.anInt4432) {
				this.anInt4435 = ((this.anIntArray226[this.anInt4431] << 15) - this.anInt4434) / (this.anInt4433 - this.anInt4432);
			}
		}
		this.anInt4434 += this.anInt4435;
		this.anInt4432++;
		return this.anInt4434 - this.anInt4435 >> 15;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!jc;)V")
	public void method4072(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt4430 = arg0.method3030();
		this.anIntArray225 = new int[this.anInt4430];
		this.anIntArray226 = new int[this.anInt4430];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4430; local16++) {
			this.anIntArray225[local16] = arg0.method3018();
			this.anIntArray226[local16] = arg0.method3018();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	public void method4073() {
		this.anInt4433 = 0;
		this.anInt4431 = 0;
		this.anInt4435 = 0;
		this.anInt4434 = 0;
		this.anInt4432 = 0;
	}
}
