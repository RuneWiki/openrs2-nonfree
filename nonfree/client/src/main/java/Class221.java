import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class221 implements Interface1 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt5975;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt5976;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	public int anInt5977;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	public int anInt5981;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
	public int anInt5982;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public int anInt5983;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)J")
	@Override
	public long method5001() {
		@Pc(5) long[] local5 = Canvas_Sub1.aLongArray6;
		@Pc(15) long local15 = -1L;
		@Pc(30) long local30 = local5[(int) ((local15 ^ (long) this.anInt5983) & 0xFFL)] ^ local15 >>> 8;
		@Pc(47) long local47 = local30 >>> 8 ^ local5[(int) ((local30 ^ (long) (this.anInt5981 >> 8)) & 0xFFL)];
		@Pc(62) long local62 = local5[(int) ((local47 ^ (long) this.anInt5981) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local5[(int) ((local62 ^ (long) (this.anInt5982 >> 24)) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local79 >>> 8 ^ local5[(int) (((long) (this.anInt5982 >> 16) ^ local79) & 0xFFL)];
		@Pc(113) long local113 = local96 >>> 8 ^ local5[(int) (((long) (this.anInt5982 >> 8) ^ local96) & 0xFFL)];
		@Pc(128) long local128 = local5[(int) ((local113 ^ (long) this.anInt5982) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local5[(int) ((local128 ^ (long) this.anInt5976) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local5[(int) ((local143 ^ (long) (this.anInt5975 >> 24)) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) (((long) (this.anInt5975 >> 16) ^ local160) & 0xFFL)];
		@Pc(194) long local194 = local177 >>> 8 ^ local5[(int) (((long) (this.anInt5975 >> 8) ^ local177) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) ((local194 ^ (long) this.anInt5975) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local5[(int) (((long) this.anInt5977 ^ local209) & 0xFFL)] ^ local209 >>> 8;
		return local5[(int) (((long) (this.aBoolean391 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!ah;)Z")
	@Override
	public boolean method5002(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class221)) {
			return false;
		}
		@Pc(19) Class221 local19 = (Class221) arg0;
		if (local19.anInt5983 != this.anInt5983) {
			return false;
		} else if (this.anInt5981 != local19.anInt5981) {
			return false;
		} else if (local19.anInt5982 != this.anInt5982) {
			return false;
		} else if (this.anInt5976 != local19.anInt5976) {
			return false;
		} else if (this.anInt5975 != local19.anInt5975) {
			return false;
		} else if (local19.anInt5977 == this.anInt5977) {
			return this.aBoolean391 == local19.aBoolean391;
		} else {
			return false;
		}
	}
}
