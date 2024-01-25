import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class218 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public int anInt5714;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	public int anInt5715;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "J")
	public long aLong172;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	private int anInt5720;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public int anInt5721;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public int anInt5724;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	public int anInt5727;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Z")
	private boolean aBoolean405 = false;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public int anInt5726 = 0;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	public int anInt5730 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method4582() {
		this.anInt5717 = Class100.anIntArray208[this.anInt5720 << 3];
		this.anInt5727 = (int) Math.sqrt((double) (this.anInt5715 * this.anInt5715 + this.anInt5724 * this.anInt5724 + this.anInt5716 * this.anInt5716));
		if (this.anInt5719 == 0) {
			this.anInt5719 = 1;
		}
		if (this.anInt5725 == 0) {
			this.aLong172 = 2147483647L;
		} else if (this.anInt5725 == 1) {
			this.aLong172 = this.anInt5727 * 8 / this.anInt5719;
			this.aLong172 *= this.aLong172;
		} else if (this.anInt5725 == 2) {
			this.aLong172 = this.anInt5727 * 8 / this.anInt5719;
		}
		if (this.aBoolean405) {
			this.anInt5727 *= -1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!fh;IB)V")
	private void method4584(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5720 = arg0.method5028();
		} else if (arg1 == 2) {
			arg0.method5007();
		} else if (arg1 == 3) {
			this.anInt5715 = arg0.method4997();
			this.anInt5724 = arg0.method4997();
			this.anInt5716 = arg0.method4997();
		} else if (arg1 == 4) {
			this.anInt5725 = arg0.method5007();
			this.anInt5719 = arg0.method4997();
		} else if (arg1 == 6) {
			this.anInt5714 = arg0.method5007();
		} else if (arg1 == 8) {
			this.anInt5730 = 1;
		} else if (arg1 == 9) {
			this.anInt5726 = 1;
		} else if (arg1 == 10) {
			this.aBoolean405 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!fh;)V")
	public void method4585(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5007();
			if (local11 == 0) {
				return;
			}
			this.method4584(arg0, local11);
		}
	}
}
