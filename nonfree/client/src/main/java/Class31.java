import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class31 implements Interface11 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!ue;)Z")
	@Override
	public boolean method773(@OriginalArg(1) Interface11 arg0) {
		if (!(arg0 instanceof Class31)) {
			return false;
		}
		@Pc(16) Class31 local16 = (Class31) arg0;
		if (this.anInt1080 != local16.anInt1080) {
			return false;
		} else if (this.anInt1086 != local16.anInt1086) {
			return false;
		} else if (local16.anInt1081 != this.anInt1081) {
			return false;
		} else if (local16.anInt1084 != this.anInt1084) {
			return false;
		} else if (local16.anInt1077 != this.anInt1077) {
			return false;
		} else if (this.anInt1082 == local16.anInt1082) {
			return local16.aBoolean98 == this.aBoolean98;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J")
	@Override
	public long method774() {
		@Pc(5) long[] local5 = Class104.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(30) long local30 = local7 >>> 8 ^ local5[(int) (((long) this.anInt1080 ^ local7) & 0xFFL)];
		@Pc(47) long local47 = local30 >>> 8 ^ local5[(int) ((local30 ^ (long) (this.anInt1086 >> 8)) & 0xFFL)];
		@Pc(62) long local62 = local5[(int) ((local47 ^ (long) this.anInt1086) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local5[(int) (((long) (this.anInt1081 >> 24) ^ local62) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local5[(int) (((long) (this.anInt1081 >> 16) ^ local79) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local96 >>> 8 ^ local5[(int) ((local96 ^ (long) (this.anInt1081 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local5[(int) (((long) this.anInt1081 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local5[(int) ((local128 ^ (long) this.anInt1084) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) (((long) (this.anInt1077 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local5[(int) (((long) (this.anInt1077 >> 16) ^ local160) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local5[(int) (((long) (this.anInt1077 >> 8) ^ local177) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) ((local194 ^ (long) this.anInt1077) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) ((local209 ^ (long) this.anInt1082) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) ((local224 ^ (long) (this.aBoolean98 ? 1 : 0)) & 0xFFL)];
	}
}
