import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class90 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public int anInt2410;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	private int anInt2411;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt2412;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	private int anInt2413;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private int anInt2414;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private int anInt2415;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	private int anInt2407 = 2;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
	private int[] anIntArray126 = new int[2];

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[I")
	private int[] anIntArray125 = new int[2];

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class90() {
		this.anIntArray126[0] = 0;
		this.anIntArray126[1] = 65535;
		this.anIntArray125[0] = 0;
		this.anIntArray125[1] = 65535;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!nj;)V")
	public void method2087(@OriginalArg(0) Class3_Sub25 arg0) {
		this.anInt2408 = arg0.method4096();
		this.anInt2409 = arg0.method4108();
		this.anInt2410 = arg0.method4108();
		this.method2088(arg0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Lclient!nj;)V")
	public void method2088(@OriginalArg(0) Class3_Sub25 arg0) {
		this.anInt2407 = arg0.method4096();
		this.anIntArray126 = new int[this.anInt2407];
		this.anIntArray125 = new int[this.anInt2407];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2407; local16++) {
			this.anIntArray126[local16] = arg0.method4083();
			this.anIntArray125[local16] = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public void method2089() {
		this.anInt2415 = 0;
		this.anInt2412 = 0;
		this.anInt2414 = 0;
		this.anInt2411 = 0;
		this.anInt2413 = 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
	public int method2090(@OriginalArg(0) int arg0) {
		if (this.anInt2413 >= this.anInt2415) {
			this.anInt2411 = this.anIntArray125[this.anInt2412++] << 15;
			if (this.anInt2412 >= this.anInt2407) {
				this.anInt2412 = this.anInt2407 - 1;
			}
			this.anInt2415 = (int) ((double) this.anIntArray126[this.anInt2412] / 65536.0D * (double) arg0);
			if (this.anInt2415 > this.anInt2413) {
				this.anInt2414 = ((this.anIntArray125[this.anInt2412] << 15) - this.anInt2411) / (this.anInt2415 - this.anInt2413);
			}
		}
		this.anInt2411 += this.anInt2414;
		this.anInt2413++;
		return this.anInt2411 - this.anInt2414 >> 15;
	}
}
