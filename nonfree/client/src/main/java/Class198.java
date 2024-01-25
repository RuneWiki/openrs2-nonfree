import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class198 implements Interface1 {

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public int anInt5437;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	public int anInt5440;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
	public int anInt5441;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)J")
	@Override
	public long method4481() {
		@Pc(13) long[] local13 = Class1_Sub4_Sub12.aLongArray3;
		@Pc(15) long local15 = -1L;
		@Pc(30) long local30 = local13[(int) ((local15 ^ (long) this.anInt5446) & 0xFFL)] ^ local15 >>> 8;
		@Pc(47) long local47 = local30 >>> 8 ^ local13[(int) ((local30 ^ (long) (this.anInt5436 >> 8)) & 0xFFL)];
		@Pc(62) long local62 = local13[(int) (((long) this.anInt5436 ^ local47) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local13[(int) ((local62 ^ (long) (this.anInt5440 >> 24)) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local13[(int) ((local79 ^ (long) (this.anInt5440 >> 16)) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local13[(int) (((long) (this.anInt5440 >> 8) ^ local96) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local113 >>> 8 ^ local13[(int) (((long) this.anInt5440 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local13[(int) ((local128 ^ (long) this.anInt5437) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local13[(int) ((local143 ^ (long) (this.anInt5442 >> 24)) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local13[(int) ((local160 ^ (long) (this.anInt5442 >> 16)) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local177 >>> 8 ^ local13[(int) (((long) (this.anInt5442 >> 8) ^ local177) & 0xFFL)];
		@Pc(209) long local209 = local194 >>> 8 ^ local13[(int) ((local194 ^ (long) this.anInt5442) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local13[(int) ((local209 ^ (long) this.anInt5441) & 0xFFL)];
		return local224 >>> 8 ^ local13[(int) (((long) (this.aBoolean388 ? 1 : 0) ^ local224) & 0xFFL)];
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!cp;)Z")
	@Override
	public boolean method4480(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class198)) {
			return false;
		}
		@Pc(11) Class198 local11 = (Class198) arg0;
		if (this.anInt5446 != local11.anInt5446) {
			return false;
		} else if (this.anInt5436 != local11.anInt5436) {
			return false;
		} else if (this.anInt5440 != local11.anInt5440) {
			return false;
		} else if (local11.anInt5437 != this.anInt5437) {
			return false;
		} else if (local11.anInt5442 != this.anInt5442) {
			return false;
		} else if (local11.anInt5441 == this.anInt5441) {
			return local11.aBoolean388 == this.aBoolean388;
		} else {
			return false;
		}
	}
}
