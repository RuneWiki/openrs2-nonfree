import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class328 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public int anInt9621;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public int anInt9623;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public int anInt9624;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	private int anInt9625;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	private int anInt9626;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
	private int anInt9627;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	private int anInt9628;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	private int anInt9629;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int anInt9622 = 2;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "[I")
	private int[] anIntArray585 = new int[2];

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	private int[] anIntArray586 = new int[2];

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class328() {
		this.anIntArray585[0] = 0;
		this.anIntArray585[1] = 65535;
		this.anIntArray586[0] = 0;
		this.anIntArray586[1] = 65535;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	public void method7965() {
		this.anInt9627 = 0;
		this.anInt9629 = 0;
		this.anInt9628 = 0;
		this.anInt9625 = 0;
		this.anInt9626 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tn;)V")
	public void method7966(@OriginalArg(0) Class3_Sub15 arg0) {
		this.anInt9622 = arg0.method8401();
		this.anIntArray585 = new int[this.anInt9622];
		this.anIntArray586 = new int[this.anInt9622];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9622; local16++) {
			this.anIntArray585[local16] = arg0.method8414();
			this.anIntArray586[local16] = arg0.method8414();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lclient!tn;)V")
	public void method7967(@OriginalArg(0) Class3_Sub15 arg0) {
		this.anInt9624 = arg0.method8401();
		this.anInt9621 = arg0.method8402();
		this.anInt9623 = arg0.method8402();
		this.method7966(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	public int method7968(@OriginalArg(0) int arg0) {
		if (this.anInt9626 >= this.anInt9627) {
			this.anInt9625 = this.anIntArray586[this.anInt9629++] << 15;
			if (this.anInt9629 >= this.anInt9622) {
				this.anInt9629 = this.anInt9622 - 1;
			}
			this.anInt9627 = (int) ((double) this.anIntArray585[this.anInt9629] / 65536.0D * (double) arg0);
			if (this.anInt9627 > this.anInt9626) {
				this.anInt9628 = ((this.anIntArray586[this.anInt9629] << 15) - this.anInt9625) / (this.anInt9627 - this.anInt9626);
			}
		}
		this.anInt9625 += this.anInt9628;
		this.anInt9626++;
		return this.anInt9625 - this.anInt9628 >> 15;
	}
}
