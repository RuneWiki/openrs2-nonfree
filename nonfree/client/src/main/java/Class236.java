import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class236 {

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt6602;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt6605;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt6606;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt6610;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "J")
	public long aLong226;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt6616;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt6618;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt6607 = 0;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt6614 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method5178(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2502();
			if (local7 == 0) {
				return;
			}
			this.method5179(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!nn;BI)V")
	private void method5179(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6615 = arg0.method2485();
		} else if (arg1 == 2) {
			arg0.method2502();
		} else if (arg1 == 3) {
			this.anInt6619 = arg0.method2459();
			this.anInt6605 = arg0.method2459();
			this.anInt6611 = arg0.method2459();
		} else if (arg1 == 4) {
			this.anInt6602 = arg0.method2502();
			this.anInt6610 = arg0.method2459();
		} else if (arg1 == 6) {
			this.anInt6616 = arg0.method2502();
		} else if (arg1 == 8) {
			this.anInt6614 = 1;
		} else if (arg1 == 9) {
			this.anInt6607 = 1;
		} else if (arg1 == 10) {
			this.aBoolean436 = true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method5180() {
		this.anInt6618 = Class250.anIntArray674[this.anInt6615 << 3];
		this.anInt6606 = (int) Math.sqrt((double) (this.anInt6619 * this.anInt6619 + this.anInt6605 * this.anInt6605 + this.anInt6611 * this.anInt6611));
		if (this.anInt6610 == 0) {
			this.anInt6610 = 1;
		}
		if (this.anInt6602 == 0) {
			this.aLong226 = 2147483647L;
		} else if (this.anInt6602 == 1) {
			this.aLong226 = this.anInt6606 * 8 / this.anInt6610;
			this.aLong226 *= this.aLong226;
		} else if (this.anInt6602 == 2) {
			this.aLong226 = this.anInt6606 * 8 / this.anInt6610;
		}
		if (this.aBoolean436) {
			this.anInt6606 *= -1;
		}
	}
}
