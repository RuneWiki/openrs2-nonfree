import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class181 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt5571;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt5572;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public int anInt5574;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	private int anInt5575;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private int anInt5576;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	private int anInt5577;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	private int anInt5579;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	private int anInt5573 = 2;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "[I")
	private int[] anIntArray544 = new int[2];

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[I")
	private int[] anIntArray543 = new int[2];

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class181() {
		this.anIntArray544[0] = 0;
		this.anIntArray544[1] = 65535;
		this.anIntArray543[0] = 0;
		this.anIntArray543[1] = 65535;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
	public int method4928(@OriginalArg(0) int arg0) {
		if (this.anInt5575 >= this.anInt5579) {
			this.anInt5577 = this.anIntArray543[this.anInt5576++] << 15;
			if (this.anInt5576 >= this.anInt5573) {
				this.anInt5576 = this.anInt5573 - 1;
			}
			this.anInt5579 = (int) ((double) this.anIntArray544[this.anInt5576] / 65536.0D * (double) arg0);
			if (this.anInt5579 > this.anInt5575) {
				this.anInt5578 = ((this.anIntArray543[this.anInt5576] << 15) - this.anInt5577) / (this.anInt5579 - this.anInt5575);
			}
		}
		this.anInt5577 += this.anInt5578;
		this.anInt5575++;
		return this.anInt5577 - this.anInt5578 >> 15;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!rg;)V")
	public void method4929(@OriginalArg(0) Class5_Sub12 arg0) {
		this.anInt5574 = arg0.method5115();
		this.anInt5572 = arg0.method5067();
		this.anInt5571 = arg0.method5067();
		this.method4931(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
	public void method4930() {
		this.anInt5579 = 0;
		this.anInt5576 = 0;
		this.anInt5578 = 0;
		this.anInt5577 = 0;
		this.anInt5575 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lclient!rg;)V")
	public void method4931(@OriginalArg(0) Class5_Sub12 arg0) {
		this.anInt5573 = arg0.method5115();
		this.anIntArray544 = new int[this.anInt5573];
		this.anIntArray543 = new int[this.anInt5573];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5573; local16++) {
			this.anIntArray544[local16] = arg0.method5106();
			this.anIntArray543[local16] = arg0.method5106();
		}
	}
}
