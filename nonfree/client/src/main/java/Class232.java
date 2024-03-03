import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class232 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public int anInt6447;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt6448;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int anInt6450;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt6451;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt6455;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	private int anInt6449 = 2;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	private int[] anIntArray445 = new int[2];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
	private int[] anIntArray446 = new int[2];

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 56)
	public Class232() {
		this.anIntArray445[0] = 0;
		this.anIntArray445[1] = 65535;
		this.anIntArray446[0] = 0;
		this.anIntArray446[1] = 65535;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 4)
	public int method5841(@OriginalArg(0) int arg0) {
		if (this.anInt6454 >= this.anInt6451) {
			this.anInt6453 = this.anIntArray446[this.anInt6455++] << 15;
			if (this.anInt6455 >= this.anInt6449) {
				this.anInt6455 = this.anInt6449 - 1;
			}
			this.anInt6451 = (int) ((double) this.anIntArray445[this.anInt6455] / 65536.0D * (double) arg0);
			if (this.anInt6451 > this.anInt6454) {
				this.anInt6452 = ((this.anIntArray446[this.anInt6455] << 15) - this.anInt6453) / (this.anInt6451 - this.anInt6454);
			}
		}
		this.anInt6453 += this.anInt6452;
		this.anInt6454++;
		return this.anInt6453 - this.anInt6452 >> 15;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!bt;)V", line = 21)
	public void method5842(@OriginalArg(0) Class2_Sub4 arg0) {
		this.anInt6447 = arg0.method4816();
		this.anInt6450 = arg0.method4837();
		this.anInt6448 = arg0.method4837();
		this.method5844(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 30)
	public void method5843() {
		this.anInt6451 = 0;
		this.anInt6455 = 0;
		this.anInt6452 = 0;
		this.anInt6453 = 0;
		this.anInt6454 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!bt;)V", line = 40)
	public void method5844(@OriginalArg(0) Class2_Sub4 arg0) {
		this.anInt6449 = arg0.method4816();
		this.anIntArray445 = new int[this.anInt6449];
		this.anIntArray446 = new int[this.anInt6449];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6449; local16++) {
			this.anIntArray445[local16] = arg0.method4830();
			this.anIntArray446[local16] = arg0.method4830();
		}
	}
}
