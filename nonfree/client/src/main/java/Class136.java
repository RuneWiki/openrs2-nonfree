import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class136 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public int anInt4375;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	private int anInt4377;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	private int anInt4378;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private int anInt4379;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	private int anInt4381;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	private int anInt4376 = 2;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
	private int[] anIntArray333 = new int[2];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
	private int[] anIntArray332 = new int[2];

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class136() {
		this.anIntArray333[0] = 0;
		this.anIntArray333[1] = 65535;
		this.anIntArray332[0] = 0;
		this.anIntArray332[1] = 65535;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	public void method3336() {
		this.anInt4380 = 0;
		this.anInt4377 = 0;
		this.anInt4379 = 0;
		this.anInt4378 = 0;
		this.anInt4381 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!aj;)V")
	public void method3337(@OriginalArg(0) Class8_Sub2 arg0) {
		this.anInt4376 = arg0.method2334();
		this.anIntArray333 = new int[this.anInt4376];
		this.anIntArray332 = new int[this.anInt4376];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4376; local16++) {
			this.anIntArray333[local16] = arg0.method2375();
			this.anIntArray332[local16] = arg0.method2375();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	public int method3338(@OriginalArg(0) int arg0) {
		if (this.anInt4381 >= this.anInt4380) {
			this.anInt4378 = this.anIntArray332[this.anInt4377++] << 15;
			if (this.anInt4377 >= this.anInt4376) {
				this.anInt4377 = this.anInt4376 - 1;
			}
			this.anInt4380 = (int) ((double) this.anIntArray333[this.anInt4377] / 65536.0D * (double) arg0);
			if (this.anInt4380 > this.anInt4381) {
				this.anInt4379 = ((this.anIntArray332[this.anInt4377] << 15) - this.anInt4378) / (this.anInt4380 - this.anInt4381);
			}
		}
		this.anInt4378 += this.anInt4379;
		this.anInt4381++;
		return this.anInt4378 - this.anInt4379 >> 15;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!aj;)V")
	public void method3339(@OriginalArg(0) Class8_Sub2 arg0) {
		this.anInt4374 = arg0.method2334();
		this.anInt4375 = arg0.method2352();
		this.anInt4373 = arg0.method2352();
		this.method3337(arg0);
	}
}
