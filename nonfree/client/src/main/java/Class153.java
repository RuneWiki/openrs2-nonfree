import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class153 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt4296;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt4297;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public int anInt4298;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	private int anInt4300;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	private int anInt4301;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	private int anInt4302;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	private int anInt4303;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	private int anInt4304;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	private int anInt4299 = 2;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "[I")
	private int[] anIntArray387 = new int[2];

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "[I")
	private int[] anIntArray388 = new int[2];

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class153() {
		this.anIntArray387[0] = 0;
		this.anIntArray387[1] = 65535;
		this.anIntArray388[0] = 0;
		this.anIntArray388[1] = 65535;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!jg;)V")
	public void method3868(@OriginalArg(0) Class14_Sub4 arg0) {
		this.anInt4299 = arg0.method2548();
		this.anIntArray387 = new int[this.anInt4299];
		this.anIntArray388 = new int[this.anInt4299];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4299; local16++) {
			this.anIntArray387[local16] = arg0.method2498();
			this.anIntArray388[local16] = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Lclient!jg;)V")
	public void method3869(@OriginalArg(0) Class14_Sub4 arg0) {
		this.anInt4298 = arg0.method2548();
		this.anInt4297 = arg0.method2510();
		this.anInt4296 = arg0.method2510();
		this.method3868(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	public int method3870(@OriginalArg(0) int arg0) {
		if (this.anInt4301 >= this.anInt4300) {
			this.anInt4302 = this.anIntArray388[this.anInt4303++] << 15;
			if (this.anInt4303 >= this.anInt4299) {
				this.anInt4303 = this.anInt4299 - 1;
			}
			this.anInt4300 = (int) ((double) this.anIntArray387[this.anInt4303] / 65536.0D * (double) arg0);
			if (this.anInt4300 > this.anInt4301) {
				this.anInt4304 = ((this.anIntArray388[this.anInt4303] << 15) - this.anInt4302) / (this.anInt4300 - this.anInt4301);
			}
		}
		this.anInt4302 += this.anInt4304;
		this.anInt4301++;
		return this.anInt4302 - this.anInt4304 >> 15;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
	public void method3871() {
		this.anInt4300 = 0;
		this.anInt4303 = 0;
		this.anInt4304 = 0;
		this.anInt4302 = 0;
		this.anInt4301 = 0;
	}
}
