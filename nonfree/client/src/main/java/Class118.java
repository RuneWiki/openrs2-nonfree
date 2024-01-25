import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class118 implements Interface20 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public int anInt4456;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public int anInt4457;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public int anInt4459;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	public int anInt4465;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
	public int anInt4467;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)J")
	@Override
	public long method3802() {
		@Pc(5) long[] local5 = Class3_Sub1_Sub14_Sub2.aLongArray13;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt4454) & 0xFFL)] ^ local7 >>> 8;
		@Pc(47) long local47 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt4467 >> 8)) & 0xFFL)];
		@Pc(62) long local62 = local5[(int) (((long) this.anInt4467 ^ local47) & 0xFFL)] ^ local47 >>> 8;
		@Pc(79) long local79 = local62 >>> 8 ^ local5[(int) ((local62 ^ (long) (this.anInt4459 >> 24)) & 0xFFL)];
		@Pc(96) long local96 = local5[(int) ((local79 ^ (long) (this.anInt4459 >> 16)) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local5[(int) ((local96 ^ (long) (this.anInt4459 >> 8)) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local5[(int) ((local113 ^ (long) this.anInt4459) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local128 >>> 8 ^ local5[(int) ((local128 ^ (long) this.anInt4456) & 0xFFL)];
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) ((local143 ^ (long) (this.anInt4465 >> 24)) & 0xFFL)];
		@Pc(177) long local177 = local5[(int) (((long) (this.anInt4465 >> 16) ^ local160) & 0xFFL)] ^ local160 >>> 8;
		@Pc(194) long local194 = local177 >>> 8 ^ local5[(int) ((local177 ^ (long) (this.anInt4465 >> 8)) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) ((local194 ^ (long) this.anInt4465) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) (((long) this.anInt4457 ^ local209) & 0xFFL)];
		return local5[(int) ((local224 ^ (long) (this.aBoolean375 ? 1 : 0)) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!qq;I)Z")
	@Override
	public boolean method3801(@OriginalArg(0) Interface20 arg0) {
		if (!(arg0 instanceof Class118)) {
			return false;
		}
		@Pc(17) Class118 local17 = (Class118) arg0;
		if (this.anInt4454 != local17.anInt4454) {
			return false;
		} else if (local17.anInt4467 != this.anInt4467) {
			return false;
		} else if (local17.anInt4459 != this.anInt4459) {
			return false;
		} else if (this.anInt4456 != local17.anInt4456) {
			return false;
		} else if (local17.anInt4465 != this.anInt4465) {
			return false;
		} else if (this.anInt4457 == local17.anInt4457) {
			return this.aBoolean375 == local17.aBoolean375;
		} else {
			return false;
		}
	}
}
