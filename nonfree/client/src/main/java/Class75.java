import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class75 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public int anInt2479;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "J")
	public long aLong75;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public int anInt2484 = 0;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public int anInt2488 = 0;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!rt;)V")
	public void method2134(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7548();
			if (local11 == 0) {
				return;
			}
			this.method2135(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!rt;I)V")
	private void method2135(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt2490 = arg1.method7591();
		} else if (arg0 == 2) {
			arg1.method7548();
		} else if (arg0 == 3) {
			this.anInt2487 = arg1.method7549();
			this.anInt2479 = arg1.method7549();
			this.anInt2480 = arg1.method7549();
		} else if (arg0 == 4) {
			this.anInt2491 = arg1.method7548();
			this.anInt2477 = arg1.method7549();
		} else if (arg0 == 6) {
			this.anInt2483 = arg1.method7548();
		} else if (arg0 == 8) {
			this.anInt2484 = 1;
		} else if (arg0 == 9) {
			this.anInt2488 = 1;
		} else if (arg0 == 10) {
			this.aBoolean187 = true;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	public void method2136() {
		this.anInt2482 = Class5.anIntArray760[this.anInt2490 << 3];
		this.anInt2475 = (int) Math.sqrt((double) (this.anInt2480 * this.anInt2480 + this.anInt2487 * this.anInt2487 + this.anInt2479 * this.anInt2479));
		if (this.anInt2477 == 0) {
			this.anInt2477 = 1;
		}
		if (this.anInt2491 == 0) {
			this.aLong75 = 2147483647L;
		} else if (this.anInt2491 == 1) {
			this.aLong75 = this.anInt2475 * 8 / this.anInt2477;
			this.aLong75 *= this.aLong75;
		} else if (this.anInt2491 == 2) {
			this.aLong75 = this.anInt2475 * 8 / this.anInt2477;
		}
		if (this.aBoolean187) {
			this.anInt2475 *= -1;
		}
	}
}
