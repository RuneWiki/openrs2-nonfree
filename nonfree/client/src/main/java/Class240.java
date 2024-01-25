import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class240 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
	public int anInt6682;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	public int anInt6683;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	private int anInt6685;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	private int anInt6686;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	private int anInt6687;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
	private int anInt6688;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	private int anInt6689;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
	private int anInt6681 = 2;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "[I")
	private int[] anIntArray416 = new int[2];

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "[I")
	private int[] anIntArray417 = new int[2];

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class240() {
		this.anIntArray416[0] = 0;
		this.anIntArray416[1] = 65535;
		this.anIntArray417[0] = 0;
		this.anIntArray417[1] = 65535;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I")
	public int method5571(@OriginalArg(0) int arg0) {
		if (this.anInt6688 >= this.anInt6689) {
			this.anInt6685 = this.anIntArray417[this.anInt6687++] << 15;
			if (this.anInt6687 >= this.anInt6681) {
				this.anInt6687 = this.anInt6681 - 1;
			}
			this.anInt6689 = (int) ((double) this.anIntArray416[this.anInt6687] / 65536.0D * (double) arg0);
			if (this.anInt6689 > this.anInt6688) {
				this.anInt6686 = ((this.anIntArray417[this.anInt6687] << 15) - this.anInt6685) / (this.anInt6689 - this.anInt6688);
			}
		}
		this.anInt6685 += this.anInt6686;
		this.anInt6688++;
		return this.anInt6685 - this.anInt6686 >> 15;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!fca;)V")
	public void method5572(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt6681 = arg0.method4888();
		this.anIntArray416 = new int[this.anInt6681];
		this.anIntArray417 = new int[this.anInt6681];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6681; local16++) {
			this.anIntArray416[local16] = arg0.method4858();
			this.anIntArray417[local16] = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Lclient!fca;)V")
	public void method5573(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt6684 = arg0.method4888();
		this.anInt6682 = arg0.method4868();
		this.anInt6683 = arg0.method4868();
		this.method5572(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "()V")
	public void method5574() {
		this.anInt6689 = 0;
		this.anInt6687 = 0;
		this.anInt6686 = 0;
		this.anInt6685 = 0;
		this.anInt6688 = 0;
	}
}
