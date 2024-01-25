import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class67 implements Interface4 {

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	public int anInt1690;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
	public int anInt1692;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
	public int anInt1693;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
	public int anInt1694;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public int anInt1695;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
	public int anInt1696;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)J")
	@Override
	public long method1526() {
		@Pc(5) long[] local5 = Class64_Sub1.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(29) long local29 = local7 >>> 8 ^ local5[(int) (((long) this.anInt1695 ^ local7) & 0xFFL)];
		@Pc(46) long local46 = local5[(int) (((long) (this.anInt1694 >> 8) ^ local29) & 0xFFL)] ^ local29 >>> 8;
		@Pc(61) long local61 = local5[(int) (((long) this.anInt1694 ^ local46) & 0xFFL)] ^ local46 >>> 8;
		@Pc(78) long local78 = local5[(int) (((long) (this.anInt1693 >> 24) ^ local61) & 0xFFL)] ^ local61 >>> 8;
		@Pc(95) long local95 = local5[(int) (((long) (this.anInt1693 >> 16) ^ local78) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt1693 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) ((local112 ^ (long) this.anInt1693) & 0xFFL)];
		@Pc(142) long local142 = local5[(int) ((local127 ^ (long) this.anInt1696) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) ((local142 ^ (long) (this.anInt1690 >> 24)) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local159 >>> 8 ^ local5[(int) (((long) (this.anInt1690 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local5[(int) ((local176 ^ (long) (this.anInt1690 >> 8)) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local5[(int) ((local193 ^ (long) this.anInt1690) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local208 >>> 8 ^ local5[(int) ((local208 ^ (long) this.anInt1692) & 0xFFL)];
		return local223 >>> 8 ^ local5[(int) (((long) (this.aBoolean146 ? 1 : 0) ^ local223) & 0xFFL)];
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ig;I)Z")
	@Override
	public boolean method1527(@OriginalArg(0) Interface4 arg0) {
		if (!(arg0 instanceof Class67)) {
			return false;
		}
		@Pc(19) Class67 local19 = (Class67) arg0;
		if (this.anInt1695 != local19.anInt1695) {
			return false;
		} else if (local19.anInt1694 != this.anInt1694) {
			return false;
		} else if (this.anInt1693 != local19.anInt1693) {
			return false;
		} else if (local19.anInt1696 != this.anInt1696) {
			return false;
		} else if (this.anInt1690 != local19.anInt1690) {
			return false;
		} else if (this.anInt1692 == local19.anInt1692) {
			return this.aBoolean146 == local19.aBoolean146;
		} else {
			return false;
		}
	}
}
