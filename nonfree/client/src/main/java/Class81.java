import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class81 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public int anInt2486;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt2491;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt2483 = 2;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private int[] anIntArray212 = new int[2];

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	private int[] anIntArray211 = new int[2];

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class81() {
		this.anIntArray212[0] = 0;
		this.anIntArray212[1] = 65535;
		this.anIntArray211[0] = 0;
		this.anIntArray211[1] = 65535;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!daa;)V")
	public void method2243(@OriginalArg(0) Class12_Sub8 arg0) {
		this.anInt2483 = arg0.method5216();
		this.anIntArray212 = new int[this.anInt2483];
		this.anIntArray211 = new int[this.anInt2483];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2483; local16++) {
			this.anIntArray212[local16] = arg0.method5199();
			this.anIntArray211[local16] = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
	public int method2244(@OriginalArg(0) int arg0) {
		if (this.anInt2487 >= this.anInt2488) {
			this.anInt2491 = this.anIntArray211[this.anInt2489++] << 15;
			if (this.anInt2489 >= this.anInt2483) {
				this.anInt2489 = this.anInt2483 - 1;
			}
			this.anInt2488 = (int) ((double) this.anIntArray212[this.anInt2489] / 65536.0D * (double) arg0);
			if (this.anInt2488 > this.anInt2487) {
				this.anInt2490 = ((this.anIntArray211[this.anInt2489] << 15) - this.anInt2491) / (this.anInt2488 - this.anInt2487);
			}
		}
		this.anInt2491 += this.anInt2490;
		this.anInt2487++;
		return this.anInt2491 - this.anInt2490 >> 15;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!daa;)V")
	public void method2245(@OriginalArg(0) Class12_Sub8 arg0) {
		this.anInt2486 = arg0.method5216();
		this.anInt2484 = arg0.method5225();
		this.anInt2485 = arg0.method5225();
		this.method2243(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public void method2246() {
		this.anInt2488 = 0;
		this.anInt2489 = 0;
		this.anInt2490 = 0;
		this.anInt2491 = 0;
		this.anInt2487 = 0;
	}
}
