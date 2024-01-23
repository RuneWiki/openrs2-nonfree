import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class98 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public int anInt3505;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public int anInt3506;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	private int anInt3507;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public int anInt3517;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "J")
	public long aLong111;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public int anInt3519;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
	public int anInt3522;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
	public int anInt3523;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	public int anInt3516 = 0;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public int anInt3521 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method2551(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method2553(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method2552() {
		this.anInt3510 = Class146.anIntArray463[this.anInt3507];
		this.anInt3517 = (int) Math.sqrt((double) (this.anInt3523 * this.anInt3523 + this.anInt3519 * this.anInt3519 + this.anInt3505 * this.anInt3505));
		if (this.anInt3522 == 0) {
			this.anInt3522 = 1;
		}
		if (this.anInt3520 == 0) {
			this.aLong111 = 2147483647L;
		} else if (this.anInt3520 == 1) {
			this.aLong111 = this.anInt3517 * 8 / this.anInt3522;
			this.aLong111 *= this.aLong111;
		} else if (this.anInt3520 == 2) {
			this.aLong111 = this.anInt3517 * 8 / this.anInt3522;
		}
		if (this.aBoolean227) {
			this.anInt3517 *= -1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!qm;II)V")
	private void method2553(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3507 = arg0.method2244();
		} else if (arg1 == 2) {
			arg0.method2199();
		} else if (arg1 == 3) {
			this.anInt3519 = arg0.method2194();
			this.anInt3505 = arg0.method2194();
			this.anInt3523 = arg0.method2194();
		} else if (arg1 == 4) {
			this.anInt3520 = arg0.method2199();
			this.anInt3522 = arg0.method2194();
		} else if (arg1 == 6) {
			this.anInt3506 = arg0.method2199();
		} else if (arg1 == 8) {
			this.anInt3516 = 1;
		} else if (arg1 == 9) {
			this.anInt3521 = 1;
		} else if (arg1 == 10) {
			this.aBoolean227 = true;
		}
	}
}
