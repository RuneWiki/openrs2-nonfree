import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class160 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt4534;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	private int anInt4536;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	private int anInt4537;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private int anInt4538;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	private int anInt4539;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private int anInt4540;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private int anInt4533 = 2;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
	private int[] anIntArray374 = new int[2];

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
	private int[] anIntArray373 = new int[2];

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class160() {
		this.anIntArray374[0] = 0;
		this.anIntArray374[1] = 65535;
		this.anIntArray373[0] = 0;
		this.anIntArray373[1] = 65535;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)I")
	public int method4091(@OriginalArg(0) int arg0) {
		if (this.anInt4538 >= this.anInt4537) {
			this.anInt4540 = this.anIntArray373[this.anInt4536++] << 15;
			if (this.anInt4536 >= this.anInt4533) {
				this.anInt4536 = this.anInt4533 - 1;
			}
			this.anInt4537 = (int) ((double) this.anIntArray374[this.anInt4536] / 65536.0D * (double) arg0);
			if (this.anInt4537 > this.anInt4538) {
				this.anInt4539 = ((this.anIntArray373[this.anInt4536] << 15) - this.anInt4540) / (this.anInt4537 - this.anInt4538);
			}
		}
		this.anInt4540 += this.anInt4539;
		this.anInt4538++;
		return this.anInt4540 - this.anInt4539 >> 15;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	public void method4092() {
		this.anInt4537 = 0;
		this.anInt4536 = 0;
		this.anInt4539 = 0;
		this.anInt4540 = 0;
		this.anInt4538 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!vt;)V")
	public void method4093(@OriginalArg(0) Class2_Sub24 arg0) {
		this.anInt4533 = arg0.method5732();
		this.anIntArray374 = new int[this.anInt4533];
		this.anIntArray373 = new int[this.anInt4533];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4533; local16++) {
			this.anIntArray374[local16] = arg0.method5753();
			this.anIntArray373[local16] = arg0.method5753();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lclient!vt;)V")
	public void method4094(@OriginalArg(0) Class2_Sub24 arg0) {
		this.anInt4535 = arg0.method5732();
		this.anInt4534 = arg0.method5776();
		this.anInt4532 = arg0.method5776();
		this.method4093(arg0);
	}
}
