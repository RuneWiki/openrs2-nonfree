import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class61 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public int anInt1613;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "I")
	private int anInt1617;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public int anInt1619;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	public int anInt1620;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public int anInt1622;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "J")
	public long aLong42;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public int anInt1616 = 0;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public int anInt1634 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method1405() {
		this.anInt1623 = Class4.anIntArray6[this.anInt1617 << 3];
		this.anInt1614 = (int) Math.sqrt((double) (this.anInt1626 * this.anInt1626 + this.anInt1613 * this.anInt1613 + this.anInt1620 * this.anInt1620));
		if (this.anInt1628 == 0) {
			this.anInt1628 = 1;
		}
		if (this.anInt1622 == 0) {
			this.aLong42 = 2147483647L;
		} else if (this.anInt1622 == 1) {
			this.aLong42 = this.anInt1614 * 8 / this.anInt1628;
			this.aLong42 *= this.aLong42;
		} else if (this.anInt1622 == 2) {
			this.aLong42 = this.anInt1614 * 8 / this.anInt1628;
		}
		if (this.aBoolean84) {
			this.anInt1614 *= -1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!lh;)V")
	public void method1409(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4130();
			if (local14 == 0) {
				return;
			}
			this.method1411(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!lh;IB)V")
	private void method1411(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1617 = arg0.method4093();
		} else if (arg1 == 2) {
			arg0.method4130();
		} else if (arg1 == 3) {
			this.anInt1620 = arg0.method4087();
			this.anInt1613 = arg0.method4087();
			this.anInt1626 = arg0.method4087();
		} else if (arg1 == 4) {
			this.anInt1622 = arg0.method4130();
			this.anInt1628 = arg0.method4087();
		} else if (arg1 == 6) {
			this.anInt1619 = arg0.method4130();
		} else if (arg1 == 8) {
			this.anInt1634 = 1;
		} else if (arg1 == 9) {
			this.anInt1616 = 1;
		} else if (arg1 == 10) {
			this.aBoolean84 = true;
			return;
		}
	}
}
