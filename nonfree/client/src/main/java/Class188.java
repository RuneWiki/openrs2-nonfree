import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class188 implements Interface23 {

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public int anInt4410;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public int anInt4413;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
	public int anInt4415;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	public int anInt4416;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
	public boolean aBoolean386;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)J")
	@Override
	public long method3984() {
		@Pc(13) long[] local13 = Class105_Sub2_Sub2.aLongArray20;
		@Pc(15) long local15 = -1L;
		@Pc(30) long local30 = local15 >>> 8 ^ local13[(int) (((long) this.anInt4412 ^ local15) & 0xFFL)];
		@Pc(47) long local47 = local30 >>> 8 ^ local13[(int) (((long) (this.anInt4416 >> 8) ^ local30) & 0xFFL)];
		@Pc(62) long local62 = local13[(int) ((local47 ^ (long) this.anInt4416) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local62 >>> 8 ^ local13[(int) ((local62 ^ (long) (this.anInt4410 >> 24)) & 0xFFL)];
		@Pc(96) long local96 = local13[(int) ((local79 ^ (long) (this.anInt4410 >> 16)) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local96 >>> 8 ^ local13[(int) ((local96 ^ (long) (this.anInt4410 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local13[(int) (((long) this.anInt4410 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local13[(int) ((local128 ^ (long) this.anInt4411) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local143 >>> 8 ^ local13[(int) (((long) (this.anInt4413 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local160 >>> 8 ^ local13[(int) ((local160 ^ (long) (this.anInt4413 >> 16)) & 0xFFL)];
		@Pc(194) long local194 = local13[(int) ((local177 ^ (long) (this.anInt4413 >> 8)) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local13[(int) (((long) this.anInt4413 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local13[(int) (((long) this.anInt4415 ^ local209) & 0xFFL)];
		return local13[(int) (((long) (this.aBoolean386 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!tm;)Z")
	@Override
	public boolean method3985(@OriginalArg(1) Interface23 arg0) {
		if (!(arg0 instanceof Class188)) {
			return false;
		}
		@Pc(12) Class188 local12 = (Class188) arg0;
		if (local12.anInt4412 != this.anInt4412) {
			return false;
		} else if (this.anInt4416 != local12.anInt4416) {
			return false;
		} else if (local12.anInt4410 != this.anInt4410) {
			return false;
		} else if (this.anInt4411 != local12.anInt4411) {
			return false;
		} else if (local12.anInt4413 != this.anInt4413) {
			return false;
		} else if (local12.anInt4415 == this.anInt4415) {
			return local12.aBoolean386 == this.aBoolean386;
		} else {
			return false;
		}
	}
}
