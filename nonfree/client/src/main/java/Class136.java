import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class136 implements Interface3 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Z")
	public boolean aBoolean322;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public int anInt4127;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt4128;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public int anInt4129;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public int anInt4131;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!bga;B)Z")
	@Override
	public boolean method3668(@OriginalArg(0) Interface3 arg0) {
		if (!(arg0 instanceof Class136)) {
			return false;
		}
		@Pc(11) Class136 local11 = (Class136) arg0;
		if (local11.anInt4128 != this.anInt4128) {
			return false;
		} else if (local11.anInt4129 != this.anInt4129) {
			return false;
		} else if (local11.anInt4131 != this.anInt4131) {
			return false;
		} else if (local11.anInt4122 != this.anInt4122) {
			return false;
		} else if (this.anInt4127 != local11.anInt4127) {
			return false;
		} else if (local11.anInt4123 == this.anInt4123) {
			return this.aBoolean322 == local11.aBoolean322;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)J")
	@Override
	public long method3667() {
		@Pc(5) long[] local5 = Class3_Sub49.aLongArray17;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt4128) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt4129 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt4129) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt4131 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(96) long local96 = local5[(int) (((long) (this.anInt4131 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(113) long local113 = local5[(int) ((local96 ^ (long) (this.anInt4131 >> 8)) & 0xFFL)] ^ local96 >>> 8;
		@Pc(128) long local128 = local5[(int) (((long) this.anInt4131 ^ local113) & 0xFFL)] ^ local113 >>> 8;
		@Pc(143) long local143 = local128 >>> 8 ^ local5[(int) (((long) this.anInt4122 ^ local128) & 0xFFL)];
		@Pc(160) long local160 = local143 >>> 8 ^ local5[(int) ((local143 ^ (long) (this.anInt4127 >> 24)) & 0xFFL)];
		@Pc(177) long local177 = local160 >>> 8 ^ local5[(int) (((long) (this.anInt4127 >> 16) ^ local160) & 0xFFL)];
		@Pc(194) long local194 = local177 >>> 8 ^ local5[(int) (((long) (this.anInt4127 >> 8) ^ local177) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) (((long) this.anInt4127 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local5[(int) (((long) this.anInt4123 ^ local209) & 0xFFL)] ^ local209 >>> 8;
		return local5[(int) (((long) (this.aBoolean322 ? 1 : 0) ^ local224) & 0xFFL)] ^ local224 >>> 8;
	}
}
