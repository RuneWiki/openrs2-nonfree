import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class59 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public int anInt2353;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt2355;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	private int anInt2356;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	private int anInt2357;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	private int anInt2350 = 2;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	private int[] anIntArray279 = new int[2];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
	private int[] anIntArray278 = new int[2];

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class59() {
		this.anIntArray279[0] = 0;
		this.anIntArray279[1] = 65535;
		this.anIntArray278[0] = 0;
		this.anIntArray278[1] = 65535;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	public int method1650(@OriginalArg(0) int arg0) {
		if (this.anInt2356 >= this.anInt2357) {
			this.anInt2354 = this.anIntArray278[this.anInt2355++] << 15;
			if (this.anInt2355 >= this.anInt2350) {
				this.anInt2355 = this.anInt2350 - 1;
			}
			this.anInt2357 = (int) ((double) this.anIntArray279[this.anInt2355] / 65536.0D * (double) arg0);
			if (this.anInt2357 > this.anInt2356) {
				this.anInt2358 = ((this.anIntArray278[this.anInt2355] << 15) - this.anInt2354) / (this.anInt2357 - this.anInt2356);
			}
		}
		this.anInt2354 += this.anInt2358;
		this.anInt2356++;
		return this.anInt2354 - this.anInt2358 >> 15;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!wd;)V")
	public void method1651(@OriginalArg(0) Class2_Sub12 arg0) {
		this.anInt2350 = arg0.method1399();
		this.anIntArray279 = new int[this.anInt2350];
		this.anIntArray278 = new int[this.anInt2350];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2350; local16++) {
			this.anIntArray279[local16] = arg0.method1366();
			this.anIntArray278[local16] = arg0.method1366();
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!wd;)V")
	public void method1652(@OriginalArg(0) Class2_Sub12 arg0) {
		this.anInt2353 = arg0.method1399();
		this.anInt2351 = arg0.method1412();
		this.anInt2352 = arg0.method1412();
		this.method1651(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	public void method1653() {
		this.anInt2357 = 0;
		this.anInt2355 = 0;
		this.anInt2358 = 0;
		this.anInt2354 = 0;
		this.anInt2356 = 0;
	}
}
