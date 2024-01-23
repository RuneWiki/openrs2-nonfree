import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	private int anInt2364;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
	private int anInt2370;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
	private int anInt2376;

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
	private int anInt2375;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
	private int anInt2372;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
	private int anInt2365;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class75_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2375 = (int) (arg7 * 4096.0F);
		this.anInt2373 = (int) (arg6 * 4096.0F);
		this.anInt2365 = this.anInt2372 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method1888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2364 = 4096;
			this.anInt2376 = this.anInt2373 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt2376 = this.anInt2376 * this.anInt2376 >> 12;
			this.anInt2370 = this.anInt2376;
			return;
		}
		this.anInt2364 = this.anInt2375 * this.anInt2376 >> 12;
		if (this.anInt2364 < 0) {
			this.anInt2364 = 0;
		} else if (this.anInt2364 > 4096) {
			this.anInt2364 = 4096;
		}
		this.anInt2376 = this.anInt2373 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt2376 = this.anInt2376 * this.anInt2376 >> 12;
		this.anInt2376 = this.anInt2376 * this.anInt2364 >> 12;
		this.anInt2370 += this.anInt2365 * this.anInt2376 >> 12;
		this.anInt2365 = this.anInt2372 * this.anInt2365 >> 12;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	@Override
	protected final void method1886() {
		this.anInt2370 >>= 0x4;
		if (this.anInt2370 < 0) {
			this.anInt2370 = 0;
		} else if (this.anInt2370 > 255) {
			this.anInt2370 = 255;
		}
		this.anInt2365 = this.anInt2372;
		this.method1898(this.anInt2374++, (byte) this.anInt2370);
		this.anInt2370 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)V")
	protected void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray25[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
	@Override
	protected final void method1892() {
		this.anInt2370 = 0;
		this.anInt2374 = 0;
	}
}
