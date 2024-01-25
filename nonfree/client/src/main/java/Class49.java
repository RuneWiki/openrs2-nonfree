import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class49 {

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public int anInt1821;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "J")
	public long aLong61;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public int anInt1830;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public int anInt1834;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public int anInt1820 = 0;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	public int anInt1826 = 0;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method1416(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6433();
			if (local9 == 0) {
				return;
			}
			this.method1420(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method1417() {
		this.anInt1827 = Class145.anIntArray280[this.anInt1831 << 3];
		this.anInt1823 = (int) Math.sqrt((double) (this.anInt1832 * this.anInt1832 + this.anInt1830 * this.anInt1830 + this.anInt1824 * this.anInt1824));
		if (this.anInt1822 == 0) {
			this.anInt1822 = 1;
		}
		if (this.anInt1821 == 0) {
			this.aLong61 = 2147483647L;
		} else if (this.anInt1821 == 1) {
			this.aLong61 = this.anInt1823 * 8 / this.anInt1822;
			this.aLong61 *= this.aLong61;
		} else if (this.anInt1821 == 2) {
			this.aLong61 = this.anInt1823 * 8 / this.anInt1822;
		}
		if (this.aBoolean136) {
			this.anInt1823 *= -1;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method1420(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt1831 = arg1.method6485();
		} else if (arg0 == 2) {
			arg1.method6433();
		} else if (arg0 == 3) {
			this.anInt1830 = arg1.method6442();
			this.anInt1824 = arg1.method6442();
			this.anInt1832 = arg1.method6442();
		} else if (arg0 == 4) {
			this.anInt1821 = arg1.method6433();
			this.anInt1822 = arg1.method6442();
		} else if (arg0 == 6) {
			this.anInt1828 = arg1.method6433();
		} else if (arg0 == 8) {
			this.anInt1826 = 1;
		} else if (arg0 == 9) {
			this.anInt1820 = 1;
		} else if (arg0 == 10) {
			this.aBoolean136 = true;
			return;
		}
	}
}
