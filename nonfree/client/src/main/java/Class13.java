import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class13 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	private int anInt136 = 2;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "[I")
	private int[] anIntArray21 = new int[2];

	@OriginalMember(owner = "client!an", name = "b", descriptor = "[I")
	private int[] anIntArray20 = new int[2];

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class13() {
		this.anIntArray21[0] = 0;
		this.anIntArray21[1] = 65535;
		this.anIntArray20[0] = 0;
		this.anIntArray20[1] = 65535;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	public void method99() {
		this.anInt137 = 0;
		this.anInt138 = 0;
		this.anInt140 = 0;
		this.anInt141 = 0;
		this.anInt139 = 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!gk;)V")
	public void method100(@OriginalArg(0) Class7_Sub14 arg0) {
		this.anInt135 = arg0.method3981();
		this.anInt134 = arg0.method3938();
		this.anInt133 = arg0.method3938();
		this.method102(arg0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	public int method101(@OriginalArg(0) int arg0) {
		if (this.anInt139 >= this.anInt137) {
			this.anInt141 = this.anIntArray20[this.anInt138++] << 15;
			if (this.anInt138 >= this.anInt136) {
				this.anInt138 = this.anInt136 - 1;
			}
			this.anInt137 = (int) ((double) this.anIntArray21[this.anInt138] / 65536.0D * (double) arg0);
			if (this.anInt137 > this.anInt139) {
				this.anInt140 = ((this.anIntArray20[this.anInt138] << 15) - this.anInt141) / (this.anInt137 - this.anInt139);
			}
		}
		this.anInt141 += this.anInt140;
		this.anInt139++;
		return this.anInt141 - this.anInt140 >> 15;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Lclient!gk;)V")
	public void method102(@OriginalArg(0) Class7_Sub14 arg0) {
		this.anInt136 = arg0.method3981();
		this.anIntArray21 = new int[this.anInt136];
		this.anIntArray20 = new int[this.anInt136];
		for (@Pc(16) int local16 = 0; local16 < this.anInt136; local16++) {
			this.anIntArray21[local16] = arg0.method3943();
			this.anIntArray20[local16] = arg0.method3943();
		}
	}
}
