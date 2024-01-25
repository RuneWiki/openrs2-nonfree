import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class45 implements Interface26 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public int anInt1650;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public int anInt1652;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public int anInt1655;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public int anInt1656;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public int anInt1657;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ut;I)Z")
	@Override
	public boolean method1657(@OriginalArg(0) Interface26 arg0) {
		if (!(arg0 instanceof Class45)) {
			return false;
		}
		@Pc(17) Class45 local17 = (Class45) arg0;
		if (local17.anInt1655 != this.anInt1655) {
			return false;
		} else if (local17.anInt1656 != this.anInt1656) {
			return false;
		} else if (local17.anInt1652 != this.anInt1652) {
			return false;
		} else if (this.anInt1650 != local17.anInt1650) {
			return false;
		} else if (this.anInt1657 != local17.anInt1657) {
			return false;
		} else if (local17.anInt1653 == this.anInt1653) {
			return local17.aBoolean100 == this.aBoolean100;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)J")
	@Override
	public long method1656() {
		@Pc(13) long[] local13 = Class3_Sub6.aLongArray21;
		@Pc(15) long local15 = -1L;
		@Pc(30) long local30 = local13[(int) (((long) this.anInt1655 ^ local15) & 0xFFL)] ^ local15 >>> 8;
		@Pc(47) long local47 = local13[(int) ((local30 ^ (long) (this.anInt1656 >> 8)) & 0xFFL)] ^ local30 >>> 8;
		@Pc(62) long local62 = local47 >>> 8 ^ local13[(int) (((long) this.anInt1656 ^ local47) & 0xFFL)];
		@Pc(79) long local79 = local62 >>> 8 ^ local13[(int) ((local62 ^ (long) (this.anInt1652 >> 24)) & 0xFFL)];
		@Pc(96) long local96 = local13[(int) (((long) (this.anInt1652 >> 16) ^ local79) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local96 >>> 8 ^ local13[(int) ((local96 ^ (long) (this.anInt1652 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local13[(int) (((long) this.anInt1652 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local13[(int) ((local128 ^ (long) this.anInt1650) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local13[(int) (((long) (this.anInt1657 >> 24) ^ local143) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local160 >>> 8 ^ local13[(int) (((long) (this.anInt1657 >> 16) ^ local160) & 0xFFL)];
		@Pc(194) long local194 = local13[(int) ((local177 ^ (long) (this.anInt1657 >> 8)) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local13[(int) (((long) this.anInt1657 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local13[(int) ((local209 ^ (long) this.anInt1653) & 0xFFL)];
		return local224 >>> 8 ^ local13[(int) (((long) (this.aBoolean100 ? 1 : 0) ^ local224) & 0xFFL)];
	}
}
