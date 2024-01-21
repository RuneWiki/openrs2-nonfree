import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class55 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public int anInt2375;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public int anInt2376;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public int anInt2378;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt2379;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt2380;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	private int anInt2381;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	private int anInt2382;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt2377 = 2;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
	private int[] anIntArray336 = new int[2];

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
	private int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class55() {
		this.anIntArray336[0] = 0;
		this.anIntArray336[1] = 65535;
		this.anIntArray337[0] = 0;
		this.anIntArray337[1] = 65535;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!pd;)V")
	public void method1492(@OriginalArg(0) Class2_Sub6 arg0) {
		this.anInt2376 = arg0.method665();
		this.anInt2375 = arg0.method629();
		this.anInt2378 = arg0.method629();
		this.method1494(arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method1493() {
		this.anInt2380 = 0;
		this.anInt2379 = 0;
		this.anInt2382 = 0;
		this.anInt2381 = 0;
		this.anInt2383 = 0;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Lclient!pd;)V")
	public void method1494(@OriginalArg(0) Class2_Sub6 arg0) {
		this.anInt2377 = arg0.method665();
		this.anIntArray336 = new int[this.anInt2377];
		this.anIntArray337 = new int[this.anInt2377];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2377; local16++) {
			this.anIntArray336[local16] = arg0.method627();
			this.anIntArray337[local16] = arg0.method627();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
	public int method1495(@OriginalArg(0) int arg0) {
		if (this.anInt2383 >= this.anInt2380) {
			this.anInt2381 = this.anIntArray337[this.anInt2379++] << 15;
			if (this.anInt2379 >= this.anInt2377) {
				this.anInt2379 = this.anInt2377 - 1;
			}
			this.anInt2380 = (int) ((double) this.anIntArray336[this.anInt2379] / 65536.0D * (double) arg0);
			if (this.anInt2380 > this.anInt2383) {
				this.anInt2382 = ((this.anIntArray337[this.anInt2379] << 15) - this.anInt2381) / (this.anInt2380 - this.anInt2383);
			}
		}
		this.anInt2381 += this.anInt2382;
		this.anInt2383++;
		return this.anInt2381 - this.anInt2382 >> 15;
	}
}
