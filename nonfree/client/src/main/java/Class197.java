import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class197 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	public int anInt5460;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public int anInt5461;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public int anInt5463;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	private int anInt5464;

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	private int anInt5465;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
	private int anInt5466;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	private int anInt5468;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	private int anInt5462 = 2;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "[I")
	private int[] anIntArray476 = new int[2];

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "[I")
	private int[] anIntArray475 = new int[2];

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class197() {
		this.anIntArray476[0] = 0;
		this.anIntArray476[1] = 65535;
		this.anIntArray475[0] = 0;
		this.anIntArray475[1] = 65535;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I")
	public int method4320(@OriginalArg(0) int arg0) {
		if (this.anInt5468 >= this.anInt5466) {
			this.anInt5464 = this.anIntArray475[this.anInt5465++] << 15;
			if (this.anInt5465 >= this.anInt5462) {
				this.anInt5465 = this.anInt5462 - 1;
			}
			this.anInt5466 = (int) ((double) this.anIntArray476[this.anInt5465] / 65536.0D * (double) arg0);
			if (this.anInt5466 > this.anInt5468) {
				this.anInt5467 = ((this.anIntArray475[this.anInt5465] << 15) - this.anInt5464) / (this.anInt5466 - this.anInt5468);
			}
		}
		this.anInt5464 += this.anInt5467;
		this.anInt5468++;
		return this.anInt5464 - this.anInt5467 >> 15;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "()V")
	public void method4321() {
		this.anInt5466 = 0;
		this.anInt5465 = 0;
		this.anInt5467 = 0;
		this.anInt5464 = 0;
		this.anInt5468 = 0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!sv;)V")
	public void method4322(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt5462 = arg0.method3580();
		this.anIntArray476 = new int[this.anInt5462];
		this.anIntArray475 = new int[this.anInt5462];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5462; local16++) {
			this.anIntArray476[local16] = arg0.method3555();
			this.anIntArray475[local16] = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Lclient!sv;)V")
	public void method4323(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt5460 = arg0.method3580();
		this.anInt5463 = arg0.method3574();
		this.anInt5461 = arg0.method3574();
		this.method4322(arg0);
	}
}
