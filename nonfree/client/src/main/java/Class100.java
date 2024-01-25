import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class100 implements Interface1 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public int anInt2840;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public int anInt2846;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
	public boolean aBoolean252;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public int anInt2848;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!c;)Z")
	@Override
	public boolean method2746(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class100)) {
			return false;
		}
		@Pc(19) Class100 local19 = (Class100) arg0;
		if (local19.anInt2848 != this.anInt2848) {
			return false;
		} else if (local19.anInt2847 != this.anInt2847) {
			return false;
		} else if (this.anInt2840 != local19.anInt2840) {
			return false;
		} else if (this.anInt2843 != local19.anInt2843) {
			return false;
		} else if (this.anInt2841 != local19.anInt2841) {
			return false;
		} else if (local19.anInt2846 == this.anInt2846) {
			return this.aBoolean252 == local19.aBoolean252;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J")
	@Override
	public long method2745() {
		@Pc(5) long[] local5 = Class42.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2848 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt2847 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt2847 ^ local39) & 0xFFL)];
		@Pc(79) long local79 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt2840 >> 24) ^ local54) & 0xFFL)];
		@Pc(96) long local96 = local5[(int) ((local79 ^ (long) (this.anInt2840 >> 16)) & 0xFFL)] ^ local79 >>> 8;
		@Pc(113) long local113 = local5[(int) ((local96 ^ (long) (this.anInt2840 >> 8)) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local5[(int) (((long) this.anInt2840 ^ local113) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local5[(int) ((local128 ^ (long) this.anInt2843) & 0xFFL)] ^ local128 >>> 8;
		@Pc(160) long local160 = local5[(int) (((long) (this.anInt2841 >> 24) ^ local143) & 0xFFL)] ^ local143 >>> 8;
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) ((local160 ^ (long) (this.anInt2841 >> 16)) & 0xFFL)];
		@Pc(194) long local194 = local5[(int) ((local177 ^ (long) (this.anInt2841 >> 8)) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) (((long) this.anInt2841 ^ local194) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) (((long) this.anInt2846 ^ local209) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) ((local224 ^ (long) (this.aBoolean252 ? 1 : 0)) & 0xFFL)];
	}
}
