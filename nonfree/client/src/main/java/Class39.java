import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class39 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	private int anInt2415;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	private int anInt2416;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	private int anInt2417;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	private int anInt2418;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	private int anInt2412 = 2;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
	private int[] anIntArray270 = new int[2];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
	private int[] anIntArray269 = new int[2];

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class39() {
		this.anIntArray270[0] = 0;
		this.anIntArray270[1] = 65535;
		this.anIntArray269[0] = 0;
		this.anIntArray269[1] = 65535;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public void method1912() {
		this.anInt2419 = 0;
		this.anInt2416 = 0;
		this.anInt2418 = 0;
		this.anInt2415 = 0;
		this.anInt2417 = 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!og;)V")
	public void method1913(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt2413 = arg0.method218();
		this.anInt2411 = arg0.method206();
		this.anInt2414 = arg0.method206();
		this.method1915(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
	public int method1914(@OriginalArg(0) int arg0) {
		if (this.anInt2417 >= this.anInt2419) {
			this.anInt2415 = this.anIntArray269[this.anInt2416++] << 15;
			if (this.anInt2416 >= this.anInt2412) {
				this.anInt2416 = this.anInt2412 - 1;
			}
			this.anInt2419 = (int) ((double) this.anIntArray270[this.anInt2416] / 65536.0D * (double) arg0);
			if (this.anInt2419 > this.anInt2417) {
				this.anInt2418 = ((this.anIntArray269[this.anInt2416] << 15) - this.anInt2415) / (this.anInt2419 - this.anInt2417);
			}
		}
		this.anInt2415 += this.anInt2418;
		this.anInt2417++;
		return this.anInt2415 - this.anInt2418 >> 15;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Lclient!og;)V")
	public void method1915(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt2412 = arg0.method218();
		this.anIntArray270 = new int[this.anInt2412];
		this.anIntArray269 = new int[this.anInt2412];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2412; local16++) {
			this.anIntArray270[local16] = arg0.method234();
			this.anIntArray269[local16] = arg0.method234();
		}
	}
}
