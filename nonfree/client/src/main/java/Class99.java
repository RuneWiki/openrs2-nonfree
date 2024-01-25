import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class99 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public int anInt2459;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "J")
	public long aLong80;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public int anInt2471;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public int anInt2466 = 0;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt2465 = 0;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!gga;II)V")
	private void method2107(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2460 = arg0.method8363();
		} else if (arg1 == 2) {
			arg0.method8374();
		} else if (arg1 == 3) {
			this.anInt2470 = arg0.method8369();
			this.anInt2474 = arg0.method8369();
			this.anInt2459 = arg0.method8369();
		} else if (arg1 == 4) {
			this.anInt2464 = arg0.method8374();
			this.anInt2471 = arg0.method8369();
		} else if (arg1 == 6) {
			this.anInt2468 = arg0.method8374();
		} else if (arg1 == 8) {
			this.anInt2466 = 1;
		} else if (arg1 == 9) {
			this.anInt2465 = 1;
		} else if (arg1 == 10) {
			this.aBoolean159 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!gga;)V")
	public void method2108(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method2107(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public void method2109() {
		this.anInt2461 = Class6_Sub1_Sub3.anIntArray58[this.anInt2460 << 3];
		@Pc(17) long local17 = (long) this.anInt2470;
		@Pc(27) long local27 = (long) this.anInt2474;
		@Pc(31) long local31 = (long) this.anInt2459;
		this.anInt2475 = (int) Math.sqrt((double) (local17 * local17 + local27 * local27 + local31 * local31));
		if (this.anInt2471 == 0) {
			this.anInt2471 = 1;
		}
		if (this.anInt2464 == 0) {
			this.aLong80 = 2147483647L;
		} else if (this.anInt2464 == 1) {
			this.aLong80 = (long) (this.anInt2475 * 8 / this.anInt2471);
			this.aLong80 *= this.aLong80;
		} else if (this.anInt2464 == 2) {
			this.aLong80 = (long) (this.anInt2475 * 8 / this.anInt2471);
		}
		if (this.aBoolean159) {
			this.anInt2475 *= -1;
		}
	}
}
