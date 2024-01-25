import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class265 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public int anInt7609;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public int anInt7612;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public int anInt7613;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	public int anInt7615;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	public int anInt7616;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	private int anInt7617;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	public int anInt7618;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	public int anInt7622;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt7623;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public int anInt7624;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public int anInt7621 = 0;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public int anInt7610 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method6370() {
		this.anInt7622 = Class3_Sub7_Sub2.anIntArray170[this.anInt7617 << 3];
		@Pc(17) long local17 = (long) this.anInt7624;
		@Pc(21) long local21 = (long) this.anInt7612;
		@Pc(25) long local25 = (long) this.anInt7615;
		this.anInt7616 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt7609 == 0) {
			this.anInt7609 = 1;
		}
		if (this.anInt7623 == 0) {
			this.aLong213 = 2147483647L;
		} else if (this.anInt7623 == 1) {
			this.aLong213 = (long) (this.anInt7616 * 8 / this.anInt7609);
			this.aLong213 *= this.aLong213;
		} else if (this.anInt7623 == 2) {
			this.aLong213 = (long) (this.anInt7616 * 8 / this.anInt7609);
		}
		if (this.aBoolean580) {
			this.anInt7616 *= -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!fca;I)V")
	private void method6371(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt7617 = arg1.method4858();
		} else if (arg0 == 2) {
			arg1.method4888();
		} else if (arg0 == 3) {
			this.anInt7624 = arg1.method4868();
			this.anInt7612 = arg1.method4868();
			this.anInt7615 = arg1.method4868();
		} else if (arg0 == 4) {
			this.anInt7623 = arg1.method4888();
			this.anInt7609 = arg1.method4868();
			return;
		} else if (arg0 == 6) {
			this.anInt7613 = arg1.method4888();
			return;
		} else if (arg0 == 8) {
			this.anInt7621 = 1;
			return;
		} else if (arg0 == 9) {
			this.anInt7610 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean580 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!fca;)V")
	public void method6374(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4888();
			if (local15 == 0) {
				return;
			}
			this.method6371(local15, arg0);
		}
	}
}
