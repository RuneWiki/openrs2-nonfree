import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class23 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public int anInt714;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	private int anInt713 = 2;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	private int[] anIntArray101 = new int[2];

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	private int[] anIntArray102 = new int[2];

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class23() {
		this.anIntArray101[0] = 0;
		this.anIntArray101[1] = 65535;
		this.anIntArray102[0] = 0;
		this.anIntArray102[1] = 65535;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!qm;)V")
	public void method592(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt713 = arg0.method2199();
		this.anIntArray101 = new int[this.anInt713];
		this.anIntArray102 = new int[this.anInt713];
		for (@Pc(16) int local16 = 0; local16 < this.anInt713; local16++) {
			this.anIntArray101[local16] = arg0.method2244();
			this.anIntArray102[local16] = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public void method593() {
		this.anInt720 = 0;
		this.anInt719 = 0;
		this.anInt716 = 0;
		this.anInt717 = 0;
		this.anInt718 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public int method594(@OriginalArg(0) int arg0) {
		if (this.anInt718 >= this.anInt720) {
			this.anInt717 = this.anIntArray102[this.anInt719++] << 15;
			if (this.anInt719 >= this.anInt713) {
				this.anInt719 = this.anInt713 - 1;
			}
			this.anInt720 = (int) ((double) this.anIntArray101[this.anInt719] / 65536.0D * (double) arg0);
			if (this.anInt720 > this.anInt718) {
				this.anInt716 = ((this.anIntArray102[this.anInt719] << 15) - this.anInt717) / (this.anInt720 - this.anInt718);
			}
		}
		this.anInt717 += this.anInt716;
		this.anInt718++;
		return this.anInt717 - this.anInt716 >> 15;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lclient!qm;)V")
	public void method595(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt715 = arg0.method2199();
		this.anInt712 = arg0.method2194();
		this.anInt714 = arg0.method2194();
		this.method592(arg0);
	}
}
