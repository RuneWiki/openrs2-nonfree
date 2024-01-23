import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class23 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public int anInt460 = 0;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	public int anInt471 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!sb;BI)V")
	private void method456(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt461 = arg0.method2593();
		} else if (arg1 == 2) {
			arg0.method2595();
		} else if (arg1 == 3) {
			this.anInt458 = arg0.method2647();
			this.anInt472 = arg0.method2647();
			this.anInt473 = arg0.method2647();
		} else if (arg1 == 4) {
			this.anInt459 = arg0.method2595();
			this.anInt462 = arg0.method2647();
		} else if (arg1 == 6) {
			this.anInt466 = arg0.method2595();
		} else if (arg1 == 8) {
			this.anInt460 = 1;
		} else if (arg1 == 9) {
			this.anInt471 = 1;
		} else if (arg1 == 10) {
			this.aBoolean31 = true;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!sb;)V")
	public void method457(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2595();
			if (local13 == 0) {
				return;
			}
			this.method456(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	public void method459() {
		this.anInt457 = Class17.anIntArray24[this.anInt461];
		this.anInt467 = (int) Math.sqrt((double) (this.anInt458 * this.anInt458 + this.anInt472 * this.anInt472 + this.anInt473 * this.anInt473));
		if (this.anInt462 == 0) {
			this.anInt462 = 1;
		}
		if (this.anInt459 == 0) {
			this.aLong23 = 2147483647L;
		} else if (this.anInt459 == 1) {
			this.aLong23 = this.anInt467 * 8 / this.anInt462;
			this.aLong23 *= this.aLong23;
		} else if (this.anInt459 == 2) {
			this.aLong23 = this.anInt467 * 8 / this.anInt462;
		}
		if (this.aBoolean31) {
			this.anInt467 *= -1;
		}
	}
}
