import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class13 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	private int anInt621 = 2;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
	private int[] anIntArray46 = new int[2];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
	private int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class13() {
		this.anIntArray46[0] = 0;
		this.anIntArray46[1] = 65535;
		this.anIntArray45[0] = 0;
		this.anIntArray45[1] = 65535;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!hc;)V")
	public void method385(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt621 = arg0.method544();
		this.anIntArray46 = new int[this.anInt621];
		this.anIntArray45 = new int[this.anInt621];
		for (@Pc(16) int local16 = 0; local16 < this.anInt621; local16++) {
			this.anIntArray46[local16] = arg0.method546();
			this.anIntArray45[local16] = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	public int method386(@OriginalArg(0) int arg0) {
		if (this.anInt628 >= this.anInt624) {
			this.anInt626 = this.anIntArray45[this.anInt625++] << 15;
			if (this.anInt625 >= this.anInt621) {
				this.anInt625 = this.anInt621 - 1;
			}
			this.anInt624 = (int) ((double) this.anIntArray46[this.anInt625] / 65536.0D * (double) arg0);
			if (this.anInt624 > this.anInt628) {
				this.anInt627 = ((this.anIntArray45[this.anInt625] << 15) - this.anInt626) / (this.anInt624 - this.anInt628);
			}
		}
		this.anInt626 += this.anInt627;
		this.anInt628++;
		return this.anInt626 - this.anInt627 >> 15;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lclient!hc;)V")
	public void method387(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt622 = arg0.method544();
		this.anInt620 = arg0.method499();
		this.anInt623 = arg0.method499();
		this.method385(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
	public void method388() {
		this.anInt624 = 0;
		this.anInt625 = 0;
		this.anInt627 = 0;
		this.anInt626 = 0;
		this.anInt628 = 0;
	}
}
