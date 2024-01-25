import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class24 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	private int anInt393 = 2;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "[I")
	private int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "[I")
	private int[] anIntArray46 = new int[2];

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V")
	public Class24() {
		this.anIntArray45[0] = 0;
		this.anIntArray45[1] = 65535;
		this.anIntArray46[0] = 0;
		this.anIntArray46[1] = 65535;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "()V")
	public void method323() {
		this.anInt394 = 0;
		this.anInt396 = 0;
		this.anInt398 = 0;
		this.anInt397 = 0;
		this.anInt395 = 0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!mo;)V")
	public void method324(@OriginalArg(0) Class1_Sub35 arg0) {
		this.anInt393 = arg0.method5750();
		this.anIntArray45 = new int[this.anInt393];
		this.anIntArray46 = new int[this.anInt393];
		for (@Pc(16) int local16 = 0; local16 < this.anInt393; local16++) {
			this.anIntArray45[local16] = arg0.method5771();
			this.anIntArray46[local16] = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
	public int method325(@OriginalArg(0) int arg0) {
		if (this.anInt395 >= this.anInt394) {
			this.anInt397 = this.anIntArray46[this.anInt396++] << 15;
			if (this.anInt396 >= this.anInt393) {
				this.anInt396 = this.anInt393 - 1;
			}
			this.anInt394 = (int) ((double) this.anIntArray45[this.anInt396] / 65536.0D * (double) arg0);
			if (this.anInt394 > this.anInt395) {
				this.anInt398 = ((this.anIntArray46[this.anInt396] << 15) - this.anInt397) / (this.anInt394 - this.anInt395);
			}
		}
		this.anInt397 += this.anInt398;
		this.anInt395++;
		return this.anInt397 - this.anInt398 >> 15;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(Lclient!mo;)V")
	public void method326(@OriginalArg(0) Class1_Sub35 arg0) {
		this.anInt392 = arg0.method5750();
		this.anInt391 = arg0.method5804();
		this.anInt390 = arg0.method5804();
		this.method324(arg0);
	}
}
