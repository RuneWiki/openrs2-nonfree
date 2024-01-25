import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class228 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt5759;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt5760;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private int anInt5762;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	private int anInt5763;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	private int anInt5764;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt5765;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	private int anInt5761 = 2;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	private int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	private int[] anIntArray338 = new int[2];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class228() {
		this.anIntArray337[0] = 0;
		this.anIntArray337[1] = 65535;
		this.anIntArray338[0] = 0;
		this.anIntArray338[1] = 65535;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method5151() {
		this.anInt5762 = 0;
		this.anInt5764 = 0;
		this.anInt5763 = 0;
		this.anInt5766 = 0;
		this.anInt5765 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!wq;)V")
	public void method5152(@OriginalArg(0) Class5_Sub36 arg0) {
		this.anInt5760 = arg0.method7291();
		this.anInt5758 = arg0.method7268();
		this.anInt5759 = arg0.method7268();
		this.method5153(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!wq;)V")
	public void method5153(@OriginalArg(0) Class5_Sub36 arg0) {
		this.anInt5761 = arg0.method7291();
		this.anIntArray337 = new int[this.anInt5761];
		this.anIntArray338 = new int[this.anInt5761];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5761; local16++) {
			this.anIntArray337[local16] = arg0.method7333();
			this.anIntArray338[local16] = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public int method5154(@OriginalArg(0) int arg0) {
		if (this.anInt5765 >= this.anInt5762) {
			this.anInt5766 = this.anIntArray338[this.anInt5764++] << 15;
			if (this.anInt5764 >= this.anInt5761) {
				this.anInt5764 = this.anInt5761 - 1;
			}
			this.anInt5762 = (int) ((double) this.anIntArray337[this.anInt5764] / 65536.0D * (double) arg0);
			if (this.anInt5762 > this.anInt5765) {
				this.anInt5763 = ((this.anIntArray338[this.anInt5764] << 15) - this.anInt5766) / (this.anInt5762 - this.anInt5765);
			}
		}
		this.anInt5766 += this.anInt5763;
		this.anInt5765++;
		return this.anInt5766 - this.anInt5763 >> 15;
	}
}
