import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class92 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public int anInt1834;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "J")
	public long aLong47;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public int anInt1836;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public int anInt1837;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	public int anInt1838;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	private int anInt1839;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public int anInt1843;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public int anInt1844;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public int anInt1846;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	public int anInt1848 = 0;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public int anInt1849 = 0;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	public void method1639() {
		this.anInt1834 = Class5_Sub12.anIntArray543[this.anInt1839 << 3];
		@Pc(25) long local25 = (long) this.anInt1844;
		@Pc(29) long local29 = (long) this.anInt1837;
		@Pc(33) long local33 = (long) this.anInt1850;
		this.anInt1836 = (int) Math.sqrt((double) (local33 * local33 + local29 * local29 + local25 * local25));
		if (this.anInt1846 == 0) {
			this.anInt1846 = 1;
		}
		if (this.anInt1843 == 0) {
			this.aLong47 = 2147483647L;
		} else if (this.anInt1843 == 1) {
			this.aLong47 = (long) (this.anInt1836 * 8 / this.anInt1846);
			this.aLong47 *= this.aLong47;
		} else if (this.anInt1843 == 2) {
			this.aLong47 = (long) (this.anInt1836 * 8 / this.anInt1846);
		}
		if (this.aBoolean169) {
			this.anInt1836 *= -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ib;Z)V")
	public void method1641(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8529();
			if (local13 == 0) {
				return;
			}
			this.method1642(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BILclient!ib;)V")
	private void method1642(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt1839 = arg1.method8519();
		} else if (arg0 == 2) {
			arg1.method8529();
		} else if (arg0 == 3) {
			this.anInt1844 = arg1.method8527();
			this.anInt1837 = arg1.method8527();
			this.anInt1850 = arg1.method8527();
		} else if (arg0 == 4) {
			this.anInt1843 = arg1.method8529();
			this.anInt1846 = arg1.method8527();
		} else if (arg0 == 6) {
			this.anInt1838 = arg1.method8529();
		} else if (arg0 == 8) {
			this.anInt1848 = 1;
		} else if (arg0 == 9) {
			this.anInt1849 = 1;
		} else if (arg0 == 10) {
			this.aBoolean169 = true;
		}
	}
}
