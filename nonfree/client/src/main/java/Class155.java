import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class155 implements Interface14 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt4727;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)J")
	@Override
	public long method4268() {
		@Pc(5) long[] local5 = Class2_Sub1_Sub16.aLongArray16;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt4727) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt4723 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt4723 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt4725 >> 24)) & 0xFFL)];
		@Pc(96) long local96 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt4725 >> 16) ^ local71) & 0xFFL)];
		@Pc(113) long local113 = local5[(int) ((local96 ^ (long) (this.anInt4725 >> 8)) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local113 >>> 8 ^ local5[(int) (((long) this.anInt4725 ^ local113) & 0xFFL)];
		@Pc(143) long local143 = local5[(int) ((local128 ^ (long) this.anInt4724) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) (((long) (this.anInt4726 >> 24) ^ local143) & 0xFFL)];
		@Pc(177) long local177 = local5[(int) (((long) (this.anInt4726 >> 16) ^ local160) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local177 >>> 8 ^ local5[(int) (((long) (this.anInt4726 >> 8) ^ local177) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) (((long) this.anInt4726 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local5[(int) (((long) this.anInt4721 ^ local209) & 0xFFL)] ^ local209 >>> 8;
		return local5[(int) (((long) (this.aBoolean366 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!qj;I)Z")
	@Override
	public boolean method4267(@OriginalArg(0) Interface14 arg0) {
		if (!(arg0 instanceof Class155)) {
			return false;
		}
		@Pc(11) Class155 local11 = (Class155) arg0;
		if (local11.anInt4727 != this.anInt4727) {
			return false;
		} else if (local11.anInt4723 != this.anInt4723) {
			return false;
		} else if (this.anInt4725 != local11.anInt4725) {
			return false;
		} else if (local11.anInt4724 != this.anInt4724) {
			return false;
		} else if (this.anInt4726 != local11.anInt4726) {
			return false;
		} else if (this.anInt4721 == local11.anInt4721) {
			return this.aBoolean366 == local11.aBoolean366;
		} else {
			return false;
		}
	}
}
