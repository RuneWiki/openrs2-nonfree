import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class202 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public int anInt6118;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt6120;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	private int anInt6121;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	private int anInt6122;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	private int anInt6123;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	private int anInt6124;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	private int anInt6125;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	private int anInt6117 = 2;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
	private int[] anIntArray336 = new int[2];

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
	private int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class202() {
		this.anIntArray336[0] = 0;
		this.anIntArray336[1] = 65535;
		this.anIntArray337[0] = 0;
		this.anIntArray337[1] = 65535;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!dc;)V")
	public void method5285(@OriginalArg(0) Class3_Sub9 arg0) {
		this.anInt6119 = arg0.method5633();
		this.anInt6118 = arg0.method5585();
		this.anInt6120 = arg0.method5585();
		this.method5287(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public int method5286(@OriginalArg(0) int arg0) {
		if (this.anInt6123 >= this.anInt6121) {
			this.anInt6124 = this.anIntArray337[this.anInt6122++] << 15;
			if (this.anInt6122 >= this.anInt6117) {
				this.anInt6122 = this.anInt6117 - 1;
			}
			this.anInt6121 = (int) ((double) this.anIntArray336[this.anInt6122] / 65536.0D * (double) arg0);
			if (this.anInt6121 > this.anInt6123) {
				this.anInt6125 = ((this.anIntArray337[this.anInt6122] << 15) - this.anInt6124) / (this.anInt6121 - this.anInt6123);
			}
		}
		this.anInt6124 += this.anInt6125;
		this.anInt6123++;
		return this.anInt6124 - this.anInt6125 >> 15;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!dc;)V")
	public void method5287(@OriginalArg(0) Class3_Sub9 arg0) {
		this.anInt6117 = arg0.method5633();
		this.anIntArray336 = new int[this.anInt6117];
		this.anIntArray337 = new int[this.anInt6117];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6117; local16++) {
			this.anIntArray336[local16] = arg0.method5610();
			this.anIntArray337[local16] = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public void method5288() {
		this.anInt6121 = 0;
		this.anInt6122 = 0;
		this.anInt6125 = 0;
		this.anInt6124 = 0;
		this.anInt6123 = 0;
	}
}
