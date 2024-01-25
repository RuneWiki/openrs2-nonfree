import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class181 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public int anInt4406;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	private int anInt4410;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	private int anInt4411;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	private int anInt4404 = 2;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "[I")
	private int[] anIntArray364 = new int[2];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "[I")
	private int[] anIntArray363 = new int[2];

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class181() {
		this.anIntArray364[0] = 0;
		this.anIntArray364[1] = 65535;
		this.anIntArray363[0] = 0;
		this.anIntArray363[1] = 65535;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!fh;)V")
	public void method3513(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt4404 = arg0.method5007();
		this.anIntArray364 = new int[this.anInt4404];
		this.anIntArray363 = new int[this.anInt4404];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4404; local16++) {
			this.anIntArray364[local16] = arg0.method5028();
			this.anIntArray363[local16] = arg0.method5028();
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Lclient!fh;)V")
	public void method3514(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt4406 = arg0.method5007();
		this.anInt4403 = arg0.method4997();
		this.anInt4405 = arg0.method4997();
		this.method3513(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
	public void method3515() {
		this.anInt4407 = 0;
		this.anInt4409 = 0;
		this.anInt4410 = 0;
		this.anInt4408 = 0;
		this.anInt4411 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	public int method3516(@OriginalArg(0) int arg0) {
		if (this.anInt4411 >= this.anInt4407) {
			this.anInt4408 = this.anIntArray363[this.anInt4409++] << 15;
			if (this.anInt4409 >= this.anInt4404) {
				this.anInt4409 = this.anInt4404 - 1;
			}
			this.anInt4407 = (int) ((double) this.anIntArray364[this.anInt4409] / 65536.0D * (double) arg0);
			if (this.anInt4407 > this.anInt4411) {
				this.anInt4410 = ((this.anIntArray363[this.anInt4409] << 15) - this.anInt4408) / (this.anInt4407 - this.anInt4411);
			}
		}
		this.anInt4408 += this.anInt4410;
		this.anInt4411++;
		return this.anInt4408 - this.anInt4410 >> 15;
	}
}
