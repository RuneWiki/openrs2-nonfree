import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class88 implements Interface11 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	public int anInt1881;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
	public int anInt1883;

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	public int anInt1884;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
	public int anInt1886;

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	public int anInt1887;

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!ek;Z)Z")
	@Override
	public boolean method1737(@OriginalArg(0) Interface11 arg0) {
		if (!(arg0 instanceof Class88)) {
			return false;
		}
		@Pc(11) Class88 local11 = (Class88) arg0;
		if (local11.anInt1881 != this.anInt1881) {
			return false;
		} else if (local11.anInt1884 != this.anInt1884) {
			return false;
		} else if (this.anInt1883 != local11.anInt1883) {
			return false;
		} else if (this.anInt1890 != local11.anInt1890) {
			return false;
		} else if (local11.anInt1887 != this.anInt1887) {
			return false;
		} else if (this.anInt1886 == local11.anInt1886) {
			return this.aBoolean147 == local11.aBoolean147;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)J")
	@Override
	public long method1738() {
		@Pc(5) long[] local5 = Class335.aLongArray16;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt1881 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt1884 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt1884) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt1883 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt1883 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(113) long local113 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt1883 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local5[(int) (((long) this.anInt1883 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local128 >>> 8 ^ local5[(int) (((long) this.anInt1890 ^ local128) & 0xFFL)];
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) (((long) (this.anInt1887 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) ((local160 ^ (long) (this.anInt1887 >> 16)) & 0xFFL)];
		@Pc(194) long local194 = local177 >>> 8 ^ local5[(int) (((long) (this.anInt1887 >> 8) ^ local177) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) (((long) this.anInt1887 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) (((long) this.anInt1886 ^ local209) & 0xFFL)];
		return local5[(int) ((local224 ^ (long) (this.aBoolean147 ? 1 : 0)) & 0xFFL)] ^ local224 >>> 8;
	}
}
