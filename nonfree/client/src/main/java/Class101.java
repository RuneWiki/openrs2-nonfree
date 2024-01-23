import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class101 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public int anInt4652;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public int anInt4654;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	private int anInt4656;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	private int anInt4655 = 2;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
	private int[] anIntArray480 = new int[2];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
	private int[] anIntArray479 = new int[2];

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class101() {
		this.anIntArray480[0] = 0;
		this.anIntArray480[1] = 65535;
		this.anIntArray479[0] = 0;
		this.anIntArray479[1] = 65535;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	public int method3221(@OriginalArg(0) int arg0) {
		if (this.anInt4658 >= this.anInt4657) {
			this.anInt4659 = this.anIntArray479[this.anInt4660++] << 15;
			if (this.anInt4660 >= this.anInt4655) {
				this.anInt4660 = this.anInt4655 - 1;
			}
			this.anInt4657 = (int) ((double) this.anIntArray480[this.anInt4660] / 65536.0D * (double) arg0);
			if (this.anInt4657 > this.anInt4658) {
				this.anInt4656 = ((this.anIntArray479[this.anInt4660] << 15) - this.anInt4659) / (this.anInt4657 - this.anInt4658);
			}
		}
		this.anInt4659 += this.anInt4656;
		this.anInt4658++;
		return this.anInt4659 - this.anInt4656 >> 15;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	public void method3222() {
		this.anInt4657 = 0;
		this.anInt4660 = 0;
		this.anInt4656 = 0;
		this.anInt4659 = 0;
		this.anInt4658 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ea;)V")
	public void method3223(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt4655 = arg0.method209();
		this.anIntArray480 = new int[this.anInt4655];
		this.anIntArray479 = new int[this.anInt4655];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4655; local16++) {
			this.anIntArray480[local16] = arg0.method163();
			this.anIntArray479[local16] = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!ea;)V")
	public void method3224(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt4654 = arg0.method209();
		this.anInt4653 = arg0.method185();
		this.anInt4652 = arg0.method185();
		this.method3223(arg0);
	}
}
