import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class163 implements Interface24 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
	public int anInt4565;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	public int anInt4567;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	public int anInt4568;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	public int anInt4569;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
	public int anInt4571;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)J")
	@Override
	public long method3979() {
		@Pc(5) long[] local5 = Class14_Sub7_Sub2.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(30) long local30 = local7 >>> 8 ^ local5[(int) (((long) this.anInt4567 ^ local7) & 0xFFL)];
		@Pc(47) long local47 = local30 >>> 8 ^ local5[(int) ((local30 ^ (long) (this.anInt4571 >> 8)) & 0xFFL)];
		@Pc(62) long local62 = local47 >>> 8 ^ local5[(int) (((long) this.anInt4571 ^ local47) & 0xFFL)];
		@Pc(79) long local79 = local5[(int) ((local62 ^ (long) (this.anInt4569 >> 24)) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local5[(int) ((local79 ^ (long) (this.anInt4569 >> 16)) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local96 >>> 8 ^ local5[(int) ((local96 ^ (long) (this.anInt4569 >> 8)) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local5[(int) ((local113 ^ (long) this.anInt4569) & 0xFFL)];
		@Pc(143) long local143 = local128 >>> 8 ^ local5[(int) (((long) this.anInt4565 ^ local128) & 0xFFL)];
		@Pc(160) long local160 = local5[(int) (((long) (this.anInt4570 >> 24) ^ local143) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) (((long) (this.anInt4570 >> 16) ^ local160) & 0xFFL)];
		@Pc(194) long local194 = local5[(int) (((long) (this.anInt4570 >> 8) ^ local177) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local5[(int) (((long) this.anInt4570 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local5[(int) ((local209 ^ (long) this.anInt4568) & 0xFFL)] ^ local209 >>> 8;
		return local5[(int) (((long) (this.aBoolean349 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!uha;)Z")
	@Override
	public boolean method3978(@OriginalArg(1) Interface24 arg0) {
		if (!(arg0 instanceof Class163)) {
			return false;
		}
		@Pc(18) Class163 local18 = (Class163) arg0;
		if (local18.anInt4567 != this.anInt4567) {
			return false;
		} else if (local18.anInt4571 != this.anInt4571) {
			return false;
		} else if (local18.anInt4569 != this.anInt4569) {
			return false;
		} else if (this.anInt4565 != local18.anInt4565) {
			return false;
		} else if (local18.anInt4570 != this.anInt4570) {
			return false;
		} else if (local18.anInt4568 == this.anInt4568) {
			return this.aBoolean349 == local18.aBoolean349;
		} else {
			return false;
		}
	}
}
