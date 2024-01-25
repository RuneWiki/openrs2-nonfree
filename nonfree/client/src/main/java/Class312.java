import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class312 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt8750;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public int anInt8751;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt8752;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private int anInt8753;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private int anInt8754;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private int anInt8755;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private int anInt8756;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private int anInt8757;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private int anInt8749 = 2;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
	private int[] anIntArray486 = new int[2];

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	private int[] anIntArray487 = new int[2];

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class312() {
		this.anIntArray486[0] = 0;
		this.anIntArray486[1] = 65535;
		this.anIntArray487[0] = 0;
		this.anIntArray487[1] = 65535;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ofa;)V")
	public void method7535(@OriginalArg(0) Class5_Sub22 arg0) {
		this.anInt8750 = arg0.method5966();
		this.anInt8751 = arg0.method5913();
		this.anInt8752 = arg0.method5913();
		this.method7537(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public void method7536() {
		this.anInt8756 = 0;
		this.anInt8754 = 0;
		this.anInt8757 = 0;
		this.anInt8755 = 0;
		this.anInt8753 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!ofa;)V")
	public void method7537(@OriginalArg(0) Class5_Sub22 arg0) {
		this.anInt8749 = arg0.method5966();
		this.anIntArray486 = new int[this.anInt8749];
		this.anIntArray487 = new int[this.anInt8749];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8749; local16++) {
			this.anIntArray486[local16] = arg0.method5968();
			this.anIntArray487[local16] = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public int method7538(@OriginalArg(0) int arg0) {
		if (this.anInt8753 >= this.anInt8756) {
			this.anInt8755 = this.anIntArray487[this.anInt8754++] << 15;
			if (this.anInt8754 >= this.anInt8749) {
				this.anInt8754 = this.anInt8749 - 1;
			}
			this.anInt8756 = (int) ((double) this.anIntArray486[this.anInt8754] / 65536.0D * (double) arg0);
			if (this.anInt8756 > this.anInt8753) {
				this.anInt8757 = ((this.anIntArray487[this.anInt8754] << 15) - this.anInt8755) / (this.anInt8756 - this.anInt8753);
			}
		}
		this.anInt8755 += this.anInt8757;
		this.anInt8753++;
		return this.anInt8755 - this.anInt8757 >> 15;
	}
}
