import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class165 implements Interface9 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public int anInt4760;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public int anInt4764;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Z")
	public boolean aBoolean358;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	public int anInt4766;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	public int anInt4769;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!hh;)Z")
	@Override
	public boolean method4165(@OriginalArg(1) Interface9 arg0) {
		if (!(arg0 instanceof Class165)) {
			return false;
		}
		@Pc(11) Class165 local11 = (Class165) arg0;
		if (this.anInt4767 != local11.anInt4767) {
			return false;
		} else if (this.anInt4769 != local11.anInt4769) {
			return false;
		} else if (local11.anInt4760 != this.anInt4760) {
			return false;
		} else if (local11.anInt4764 != this.anInt4764) {
			return false;
		} else if (this.anInt4766 != local11.anInt4766) {
			return false;
		} else if (local11.anInt4768 == this.anInt4768) {
			return this.aBoolean358 == local11.aBoolean358;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)J")
	@Override
	public long method4166() {
		@Pc(5) long[] local5 = Class16_Sub6_Sub1.aLongArray17;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt4767) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt4769 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(62) long local62 = local39 >>> 8 ^ local5[(int) (((long) this.anInt4769 ^ local39) & 0xFFL)];
		@Pc(79) long local79 = local5[(int) ((local62 ^ (long) (this.anInt4760 >> 24)) & 0xFFL)] ^ local62 >>> 8;
		@Pc(96) long local96 = local5[(int) (((long) (this.anInt4760 >> 16) ^ local79) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local96 >>> 8 ^ local5[(int) (((long) (this.anInt4760 >> 8) ^ local96) & 0xFFL)];
		@Pc(128) long local128 = local113 >>> 8 ^ local5[(int) ((local113 ^ (long) this.anInt4760) & 0xFFL)];
		@Pc(143) long local143 = local5[(int) (((long) this.anInt4764 ^ local128) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local5[(int) ((local143 ^ (long) (this.anInt4766 >> 24)) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) (((long) (this.anInt4766 >> 16) ^ local160) & 0xFFL)];
		@Pc(194) long local194 = local5[(int) (((long) (this.anInt4766 >> 8) ^ local177) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) ((local194 ^ (long) this.anInt4766) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) ((local209 ^ (long) this.anInt4768) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) (((long) (this.aBoolean358 ? 1 : 0) ^ local224) & 0xFFL)];
	}
}
