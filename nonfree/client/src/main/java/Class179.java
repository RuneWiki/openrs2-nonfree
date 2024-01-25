import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class179 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public int anInt5583;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public int anInt5584;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	private int anInt5585;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
	private int anInt5587;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	private int anInt5588;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	private int anInt5589;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	private int anInt5582 = 2;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
	private int[] anIntArray542 = new int[2];

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "[I")
	private int[] anIntArray543 = new int[2];

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class179() {
		this.anIntArray542[0] = 0;
		this.anIntArray542[1] = 65535;
		this.anIntArray543[0] = 0;
		this.anIntArray543[1] = 65535;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!nj;)V")
	public void method4883(@OriginalArg(0) Class1_Sub21 arg0) {
		this.anInt5582 = arg0.method5720();
		this.anIntArray542 = new int[this.anInt5582];
		this.anIntArray543 = new int[this.anInt5582];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5582; local16++) {
			this.anIntArray542[local16] = arg0.method5715();
			this.anIntArray543[local16] = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
	public void method4884() {
		this.anInt5588 = 0;
		this.anInt5587 = 0;
		this.anInt5586 = 0;
		this.anInt5585 = 0;
		this.anInt5589 = 0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lclient!nj;)V")
	public void method4885(@OriginalArg(0) Class1_Sub21 arg0) {
		this.anInt5584 = arg0.method5720();
		this.anInt5583 = arg0.method5716();
		this.anInt5581 = arg0.method5716();
		this.method4883(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
	public int method4886(@OriginalArg(0) int arg0) {
		if (this.anInt5589 >= this.anInt5588) {
			this.anInt5585 = this.anIntArray543[this.anInt5587++] << 15;
			if (this.anInt5587 >= this.anInt5582) {
				this.anInt5587 = this.anInt5582 - 1;
			}
			this.anInt5588 = (int) ((double) this.anIntArray542[this.anInt5587] / 65536.0D * (double) arg0);
			if (this.anInt5588 > this.anInt5589) {
				this.anInt5586 = ((this.anIntArray543[this.anInt5587] << 15) - this.anInt5585) / (this.anInt5588 - this.anInt5589);
			}
		}
		this.anInt5585 += this.anInt5586;
		this.anInt5589++;
		return this.anInt5585 - this.anInt5586 >> 15;
	}
}
