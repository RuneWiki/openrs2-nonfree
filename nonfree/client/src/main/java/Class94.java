import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class94 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public int anInt2677;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public int anInt2678;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	private int anInt2681;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	private int anInt2683;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	private int anInt2685;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	private int anInt2680 = 2;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
	private int[] anIntArray184 = new int[2];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
	private int[] anIntArray183 = new int[2];

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class94() {
		this.anIntArray184[0] = 0;
		this.anIntArray184[1] = 65535;
		this.anIntArray183[0] = 0;
		this.anIntArray183[1] = 65535;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!wm;)V")
	public void method2283(@OriginalArg(0) Class2_Sub26 arg0) {
		this.anInt2677 = arg0.method4261();
		this.anInt2679 = arg0.method4228();
		this.anInt2678 = arg0.method4228();
		this.method2284(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!wm;)V")
	public void method2284(@OriginalArg(0) Class2_Sub26 arg0) {
		this.anInt2680 = arg0.method4261();
		this.anIntArray184 = new int[this.anInt2680];
		this.anIntArray183 = new int[this.anInt2680];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2680; local16++) {
			this.anIntArray184[local16] = arg0.method4242();
			this.anIntArray183[local16] = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	public int method2285(@OriginalArg(0) int arg0) {
		if (this.anInt2684 >= this.anInt2681) {
			this.anInt2683 = this.anIntArray183[this.anInt2685++] << 15;
			if (this.anInt2685 >= this.anInt2680) {
				this.anInt2685 = this.anInt2680 - 1;
			}
			this.anInt2681 = (int) ((double) this.anIntArray184[this.anInt2685] / 65536.0D * (double) arg0);
			if (this.anInt2681 > this.anInt2684) {
				this.anInt2682 = ((this.anIntArray183[this.anInt2685] << 15) - this.anInt2683) / (this.anInt2681 - this.anInt2684);
			}
		}
		this.anInt2683 += this.anInt2682;
		this.anInt2684++;
		return this.anInt2683 - this.anInt2682 >> 15;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	public void method2286() {
		this.anInt2681 = 0;
		this.anInt2685 = 0;
		this.anInt2682 = 0;
		this.anInt2683 = 0;
		this.anInt2684 = 0;
	}
}
