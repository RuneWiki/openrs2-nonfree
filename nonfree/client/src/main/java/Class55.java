import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class55 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public int anInt1547;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public int anInt1549;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	private int anInt1550;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public int anInt1551;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
	public int anInt1554;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public int anInt1556;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
	public int anInt1558;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "J")
	public long aLong57;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
	public int anInt1562;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public int anInt1552 = 0;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	public int anInt1553 = 0;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public void method1260() {
		this.anInt1554 = Class30.anIntArray37[this.anInt1550 << 3];
		this.anInt1547 = (int) Math.sqrt((double) (this.anInt1549 * this.anInt1549 + this.anInt1562 * this.anInt1562 + this.anInt1551 * this.anInt1551));
		if (this.anInt1556 == 0) {
			this.anInt1556 = 1;
		}
		if (this.anInt1559 == 0) {
			this.aLong57 = 2147483647L;
		} else if (this.anInt1559 == 1) {
			this.aLong57 = this.anInt1547 * 8 / this.anInt1556;
			this.aLong57 *= this.aLong57;
		} else if (this.anInt1559 == 2) {
			this.aLong57 = this.anInt1547 * 8 / this.anInt1556;
		}
		if (this.aBoolean105) {
			this.anInt1547 *= -1;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method1262(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1550 = arg0.method5598();
		} else if (arg1 == 2) {
			arg0.method5539();
		} else if (arg1 == 3) {
			this.anInt1551 = arg0.method5603();
			this.anInt1562 = arg0.method5603();
			this.anInt1549 = arg0.method5603();
		} else if (arg1 == 4) {
			this.anInt1559 = arg0.method5539();
			this.anInt1556 = arg0.method5603();
		} else if (arg1 == 6) {
			this.anInt1558 = arg0.method5539();
		} else if (arg1 == 8) {
			this.anInt1553 = 1;
		} else if (arg1 == 9) {
			this.anInt1552 = 1;
		} else if (arg1 == 10) {
			this.aBoolean105 = true;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method1264(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5539();
			if (local13 == 0) {
				return;
			}
			this.method1262(arg0, local13);
		}
	}
}
