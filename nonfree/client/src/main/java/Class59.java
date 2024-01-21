import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class59 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public int anInt2479;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	private int anInt2483;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	private int anInt2484;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	private int anInt2481 = 2;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
	private int[] anIntArray235 = new int[2];

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
	private int[] anIntArray234 = new int[2];

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class59() {
		this.anIntArray235[0] = 0;
		this.anIntArray235[1] = 65535;
		this.anIntArray234[0] = 0;
		this.anIntArray234[1] = 65535;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!kd;)V")
	public void method1748(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt2480 = arg0.method1534();
		this.anInt2479 = arg0.method1577();
		this.anInt2482 = arg0.method1577();
		this.method1750(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
	public int method1749(@OriginalArg(0) int arg0) {
		if (this.anInt2487 >= this.anInt2484) {
			this.anInt2486 = this.anIntArray234[this.anInt2485++] << 15;
			if (this.anInt2485 >= this.anInt2481) {
				this.anInt2485 = this.anInt2481 - 1;
			}
			this.anInt2484 = (int) ((double) this.anIntArray235[this.anInt2485] / 65536.0D * (double) arg0);
			if (this.anInt2484 > this.anInt2487) {
				this.anInt2483 = ((this.anIntArray234[this.anInt2485] << 15) - this.anInt2486) / (this.anInt2484 - this.anInt2487);
			}
		}
		this.anInt2486 += this.anInt2483;
		this.anInt2487++;
		return this.anInt2486 - this.anInt2483 >> 15;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!kd;)V")
	public void method1750(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt2481 = arg0.method1534();
		this.anIntArray235 = new int[this.anInt2481];
		this.anIntArray234 = new int[this.anInt2481];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2481; local16++) {
			this.anIntArray235[local16] = arg0.method1557();
			this.anIntArray234[local16] = arg0.method1557();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
	public void method1751() {
		this.anInt2484 = 0;
		this.anInt2485 = 0;
		this.anInt2483 = 0;
		this.anInt2486 = 0;
		this.anInt2487 = 0;
	}
}
