import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class214 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public int anInt6393;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public int anInt6395;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public int anInt6396;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	private int anInt6397;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	private int anInt6398;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	private int anInt6399;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	private int anInt6400;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	private int anInt6401;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	private int anInt6394 = 2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	private int[] anIntArray596 = new int[2];

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
	private int[] anIntArray597 = new int[2];

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class214() {
		this.anIntArray596[0] = 0;
		this.anIntArray596[1] = 65535;
		this.anIntArray597[0] = 0;
		this.anIntArray597[1] = 65535;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public void method4903() {
		this.anInt6397 = 0;
		this.anInt6400 = 0;
		this.anInt6398 = 0;
		this.anInt6399 = 0;
		this.anInt6401 = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
	public int method4904(@OriginalArg(0) int arg0) {
		if (this.anInt6401 >= this.anInt6397) {
			this.anInt6399 = this.anIntArray597[this.anInt6400++] << 15;
			if (this.anInt6400 >= this.anInt6394) {
				this.anInt6400 = this.anInt6394 - 1;
			}
			this.anInt6397 = (int) ((double) this.anIntArray596[this.anInt6400] / 65536.0D * (double) arg0);
			if (this.anInt6397 > this.anInt6401) {
				this.anInt6398 = ((this.anIntArray597[this.anInt6400] << 15) - this.anInt6399) / (this.anInt6397 - this.anInt6401);
			}
		}
		this.anInt6399 += this.anInt6398;
		this.anInt6401++;
		return this.anInt6399 - this.anInt6398 >> 15;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ia;)V")
	public void method4905(@OriginalArg(0) Class1_Sub3 arg0) {
		this.anInt6394 = arg0.method1171();
		this.anIntArray596 = new int[this.anInt6394];
		this.anIntArray597 = new int[this.anInt6394];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6394; local16++) {
			this.anIntArray596[local16] = arg0.method1177();
			this.anIntArray597[local16] = arg0.method1177();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!ia;)V")
	public void method4906(@OriginalArg(0) Class1_Sub3 arg0) {
		this.anInt6395 = arg0.method1171();
		this.anInt6393 = arg0.method1188();
		this.anInt6396 = arg0.method1188();
		this.method4905(arg0);
	}
}
