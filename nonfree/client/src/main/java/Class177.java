import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class177 implements Interface5 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public int anInt5317;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public int anInt5318;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public int anInt5327;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)J")
	@Override
	public long method4494() {
		@Pc(13) long[] local13 = Class22_Sub5.aLongArray10;
		@Pc(15) long local15 = -1L;
		@Pc(30) long local30 = local13[(int) ((local15 ^ (long) this.anInt5324) & 0xFFL)] ^ local15 >>> 8;
		@Pc(47) long local47 = local30 >>> 8 ^ local13[(int) (((long) (this.anInt5327 >> 8) ^ local30) & 0xFFL)];
		@Pc(62) long local62 = local13[(int) (((long) this.anInt5327 ^ local47) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local13[(int) (((long) (this.anInt5317 >> 24) ^ local62) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local79 >>> 8 ^ local13[(int) ((local79 ^ (long) (this.anInt5317 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local13[(int) ((local96 ^ (long) (this.anInt5317 >> 8)) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local13[(int) ((local113 ^ (long) this.anInt5317) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local13[(int) (((long) this.anInt5316 ^ local128) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local143 >>> 8 ^ local13[(int) (((long) (this.anInt5322 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local13[(int) (((long) (this.anInt5322 >> 16) ^ local160) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local13[(int) (((long) (this.anInt5322 >> 8) ^ local177) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local194 >>> 8 ^ local13[(int) ((local194 ^ (long) this.anInt5322) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local13[(int) (((long) this.anInt5318 ^ local209) & 0xFFL)];
		return local224 >>> 8 ^ local13[(int) ((local224 ^ (long) (this.aBoolean396 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pc;B)Z")
	@Override
	public boolean method4495(@OriginalArg(0) Interface5 arg0) {
		if (!(arg0 instanceof Class177)) {
			return false;
		}
		@Pc(19) Class177 local19 = (Class177) arg0;
		if (this.anInt5324 != local19.anInt5324) {
			return false;
		} else if (local19.anInt5327 != this.anInt5327) {
			return false;
		} else if (this.anInt5317 != local19.anInt5317) {
			return false;
		} else if (local19.anInt5316 != this.anInt5316) {
			return false;
		} else if (this.anInt5322 != local19.anInt5322) {
			return false;
		} else if (local19.anInt5318 == this.anInt5318) {
			return this.aBoolean396 == local19.aBoolean396;
		} else {
			return false;
		}
	}
}
