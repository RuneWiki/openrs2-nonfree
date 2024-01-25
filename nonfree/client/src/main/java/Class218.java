import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class218 implements Interface18 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int anInt6636;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt6638;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public int anInt6639;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public int anInt6643;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
	public boolean aBoolean422;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt6645;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!uk;I)Z")
	@Override
	public boolean method5548(@OriginalArg(0) Interface18 arg0) {
		if (!(arg0 instanceof Class218)) {
			return false;
		}
		@Pc(17) Class218 local17 = (Class218) arg0;
		if (local17.anInt6639 != this.anInt6639) {
			return false;
		} else if (local17.anInt6645 != this.anInt6645) {
			return false;
		} else if (local17.anInt6638 != this.anInt6638) {
			return false;
		} else if (this.anInt6636 != local17.anInt6636) {
			return false;
		} else if (local17.anInt6640 != this.anInt6640) {
			return false;
		} else if (this.anInt6643 == local17.anInt6643) {
			return local17.aBoolean422 == this.aBoolean422;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)J")
	@Override
	public long method5549() {
		@Pc(5) long[] local5 = Class6_Sub1.aLongArray28;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt6639) & 0xFFL)] ^ local7 >>> 8;
		@Pc(47) long local47 = local5[(int) (((long) (this.anInt6645 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(62) long local62 = local47 >>> 8 ^ local5[(int) ((local47 ^ (long) this.anInt6645) & 0xFFL)];
		@Pc(79) long local79 = local5[(int) (((long) (this.anInt6638 >> 24) ^ local62) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local79 >>> 8 ^ local5[(int) (((long) (this.anInt6638 >> 16) ^ local79) & 0xFFL)];
		@Pc(113) long local113 = local96 >>> 8 ^ local5[(int) ((local96 ^ (long) (this.anInt6638 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local5[(int) ((local113 ^ (long) this.anInt6638) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local5[(int) (((long) this.anInt6636 ^ local128) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) (((long) (this.anInt6640 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local5[(int) (((long) (this.anInt6640 >> 16) ^ local160) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local5[(int) ((local177 ^ (long) (this.anInt6640 >> 8)) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) ((local194 ^ (long) this.anInt6640) & 0xFFL)];
		@Pc(224) long local224 = local5[(int) (((long) this.anInt6643 ^ local209) & 0xFFL)] ^ local209 >>> 8;
		return local5[(int) (((long) (this.aBoolean422 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}
}
