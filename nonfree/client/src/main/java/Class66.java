import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class66 implements Interface11 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
	public int anInt1836;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
	public int anInt1837;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public int anInt1838;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public int anInt1842;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	public int anInt1843;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public int anInt1844;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)J")
	@Override
	public long method1707() {
		@Pc(12) long[] local12 = Class165.aLongArray8;
		@Pc(14) long local14 = -1L;
		@Pc(29) long local29 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) this.anInt1837) & 0xFFL)];
		@Pc(46) long local46 = local29 >>> 8 ^ local12[(int) ((local29 ^ (long) (this.anInt1844 >> 8)) & 0xFFL)];
		@Pc(61) long local61 = local12[(int) ((local46 ^ (long) this.anInt1844) & 0xFFL)] ^ local46 >>> 8;
		@Pc(78) long local78 = local12[(int) (((long) (this.anInt1836 >> 24) ^ local61) & 0xFFL)] ^ local61 >>> 8;
		@Pc(95) long local95 = local12[(int) (((long) (this.anInt1836 >> 16) ^ local78) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local95 >>> 8 ^ local12[(int) ((local95 ^ (long) (this.anInt1836 >> 8)) & 0xFFL)];
		@Pc(127) long local127 = local112 >>> 8 ^ local12[(int) ((local112 ^ (long) this.anInt1836) & 0xFFL)];
		@Pc(142) long local142 = local127 >>> 8 ^ local12[(int) (((long) this.anInt1842 ^ local127) & 0xFFL)];
		@Pc(159) long local159 = local142 >>> 8 ^ local12[(int) ((local142 ^ (long) (this.anInt1838 >> 24)) & 0xFFL)];
		@Pc(176) long local176 = local159 >>> 8 ^ local12[(int) (((long) (this.anInt1838 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local12[(int) (((long) (this.anInt1838 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local193 >>> 8 ^ local12[(int) (((long) this.anInt1838 ^ local193) & 0xFFL)];
		@Pc(223) long local223 = local208 >>> 8 ^ local12[(int) (((long) this.anInt1843 ^ local208) & 0xFFL)];
		return local12[(int) ((local223 ^ (long) (this.aBoolean113 ? 1 : 0)) & 0xFFL)] ^ local223 >>> 8;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!sv;I)Z")
	@Override
	public boolean method1708(@OriginalArg(0) Interface11 arg0) {
		if (!(arg0 instanceof Class66)) {
			return false;
		}
		@Pc(17) Class66 local17 = (Class66) arg0;
		if (local17.anInt1837 != this.anInt1837) {
			return false;
		} else if (local17.anInt1844 != this.anInt1844) {
			return false;
		} else if (this.anInt1836 != local17.anInt1836) {
			return false;
		} else if (this.anInt1842 != local17.anInt1842) {
			return false;
		} else if (local17.anInt1838 != this.anInt1838) {
			return false;
		} else if (this.anInt1843 == local17.anInt1843) {
			return this.aBoolean113 == local17.aBoolean113;
		} else {
			return false;
		}
	}
}
