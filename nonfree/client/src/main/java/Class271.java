import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class271 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "I")
	public int anInt7536;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public int anInt7538;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	public int anInt7539;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "I")
	private int anInt7540;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "I")
	private int anInt7541;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	private int anInt7543;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	private int anInt7544;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	private int anInt7537 = 2;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "[I")
	private int[] anIntArray592 = new int[2];

	@OriginalMember(owner = "client!su", name = "d", descriptor = "[I")
	private int[] anIntArray593 = new int[2];

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class271() {
		this.anIntArray592[0] = 0;
		this.anIntArray592[1] = 65535;
		this.anIntArray593[0] = 0;
		this.anIntArray593[1] = 65535;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
	public int method6441(@OriginalArg(0) int arg0) {
		if (this.anInt7543 >= this.anInt7541) {
			this.anInt7542 = this.anIntArray593[this.anInt7544++] << 15;
			if (this.anInt7544 >= this.anInt7537) {
				this.anInt7544 = this.anInt7537 - 1;
			}
			this.anInt7541 = (int) ((double) this.anIntArray592[this.anInt7544] / 65536.0D * (double) arg0);
			if (this.anInt7541 > this.anInt7543) {
				this.anInt7540 = ((this.anIntArray593[this.anInt7544] << 15) - this.anInt7542) / (this.anInt7541 - this.anInt7543);
			}
		}
		this.anInt7542 += this.anInt7540;
		this.anInt7543++;
		return this.anInt7542 - this.anInt7540 >> 15;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "()V")
	public void method6442() {
		this.anInt7541 = 0;
		this.anInt7544 = 0;
		this.anInt7540 = 0;
		this.anInt7542 = 0;
		this.anInt7543 = 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!gw;)V")
	public void method6443(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt7537 = arg0.method3043();
		this.anIntArray592 = new int[this.anInt7537];
		this.anIntArray593 = new int[this.anInt7537];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7537; local16++) {
			this.anIntArray592[local16] = arg0.method3056();
			this.anIntArray593[local16] = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(Lclient!gw;)V")
	public void method6444(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt7536 = arg0.method3043();
		this.anInt7538 = arg0.method3037();
		this.anInt7539 = arg0.method3037();
		this.method6443(arg0);
	}
}
