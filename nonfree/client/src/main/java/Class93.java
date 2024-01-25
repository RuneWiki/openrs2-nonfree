import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class93 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public int anInt2577;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	public int anInt2580;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	public int anInt2582;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	public int anInt2583;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	private int anInt2584;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
	public int anInt2585;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public int anInt2586;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	public int anInt2589;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "J")
	public long aLong68;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	public int anInt2593;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	public int anInt2579 = 0;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
	public int anInt2588 = 0;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!so;I)V")
	public void method2154(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method2155(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!so;II)V")
	private void method2155(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2584 = arg0.method5900();
		} else if (arg1 == 2) {
			arg0.method5866();
		} else if (arg1 == 3) {
			this.anInt2586 = arg0.method5878();
			this.anInt2583 = arg0.method5878();
			this.anInt2577 = arg0.method5878();
		} else if (arg1 == 4) {
			this.anInt2580 = arg0.method5866();
			this.anInt2582 = arg0.method5878();
		} else if (arg1 == 6) {
			this.anInt2590 = arg0.method5866();
		} else if (arg1 == 8) {
			this.anInt2579 = 1;
		} else if (arg1 == 9) {
			this.anInt2588 = 1;
		} else if (arg1 == 10) {
			this.aBoolean204 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	public void method2157() {
		this.anInt2585 = Class32.anIntArray77[this.anInt2584 << 3];
		@Pc(17) long local17 = (long) this.anInt2586;
		@Pc(21) long local21 = (long) this.anInt2583;
		@Pc(29) long local29 = (long) this.anInt2577;
		this.anInt2589 = (int) Math.sqrt((double) (local21 * local21 + local17 * local17 + local29 * local29));
		if (this.anInt2582 == 0) {
			this.anInt2582 = 1;
		}
		if (this.anInt2580 == 0) {
			this.aLong68 = 2147483647L;
		} else if (this.anInt2580 == 1) {
			this.aLong68 = (long) (this.anInt2589 * 8 / this.anInt2582);
			this.aLong68 *= this.aLong68;
		} else if (this.anInt2580 == 2) {
			this.aLong68 = (long) (this.anInt2589 * 8 / this.anInt2582);
		}
		if (this.aBoolean204) {
			this.anInt2589 *= -1;
		}
	}
}
