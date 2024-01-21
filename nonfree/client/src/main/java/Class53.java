import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class53 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt2486;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	private int anInt2491;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	private int anInt2485 = 2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	private int[] anIntArray397 = new int[2];

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	private int[] anIntArray398 = new int[2];

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class53() {
		this.anIntArray397[0] = 0;
		this.anIntArray397[1] = 65535;
		this.anIntArray398[0] = 0;
		this.anIntArray398[1] = 65535;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!oa;)V")
	public void method1787(@OriginalArg(0) Class2_Sub18 arg0) {
		this.anInt2485 = arg0.method2387();
		this.anIntArray397 = new int[this.anInt2485];
		this.anIntArray398 = new int[this.anInt2485];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2485; local16++) {
			this.anIntArray397[local16] = arg0.method2353();
			this.anIntArray398[local16] = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Lclient!oa;)V")
	public void method1788(@OriginalArg(0) Class2_Sub18 arg0) {
		this.anInt2486 = arg0.method2387();
		this.anInt2483 = arg0.method2382();
		this.anInt2484 = arg0.method2382();
		this.method1787(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	public int method1789(@OriginalArg(0) int arg0) {
		if (this.anInt2487 >= this.anInt2488) {
			this.anInt2489 = this.anIntArray398[this.anInt2491++] << 15;
			if (this.anInt2491 >= this.anInt2485) {
				this.anInt2491 = this.anInt2485 - 1;
			}
			this.anInt2488 = (int) ((double) this.anIntArray397[this.anInt2491] / 65536.0D * (double) arg0);
			if (this.anInt2488 > this.anInt2487) {
				this.anInt2490 = ((this.anIntArray398[this.anInt2491] << 15) - this.anInt2489) / (this.anInt2488 - this.anInt2487);
			}
		}
		this.anInt2489 += this.anInt2490;
		this.anInt2487++;
		return this.anInt2489 - this.anInt2490 >> 15;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	public void method1790() {
		this.anInt2488 = 0;
		this.anInt2491 = 0;
		this.anInt2490 = 0;
		this.anInt2489 = 0;
		this.anInt2487 = 0;
	}
}
