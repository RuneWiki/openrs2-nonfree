import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class116 implements Interface3 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public int anInt3480;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public int anInt3481;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt3484;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public int anInt3486;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)J")
	@Override
	public long method3227() {
		@Pc(5) long[] local5 = Class42.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(28) long local28 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt3484) & 0xFFL)];
		@Pc(45) long local45 = local28 >>> 8 ^ local5[(int) ((local28 ^ (long) (this.anInt3480 >> 8)) & 0xFFL)];
		@Pc(60) long local60 = local5[(int) (((long) this.anInt3480 ^ local45) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local60 >>> 8 ^ local5[(int) (((long) (this.anInt3483 >> 24) ^ local60) & 0xFFL)];
		@Pc(94) long local94 = local5[(int) ((local77 ^ (long) (this.anInt3483 >> 16)) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) ((local94 ^ (long) (this.anInt3483 >> 8)) & 0xFFL)];
		@Pc(126) long local126 = local5[(int) (((long) this.anInt3483 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) (((long) this.anInt3485 ^ local126) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt3481 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) (((long) (this.anInt3481 >> 16) ^ local158) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) (((long) (this.anInt3481 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) ((local192 ^ (long) this.anInt3481) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) (((long) this.anInt3486 ^ local207) & 0xFFL)];
		return local5[(int) ((local222 ^ (long) (this.aBoolean251 ? 1 : 0)) & 0xFFL)] ^ local222 >>> 8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!gl;B)Z")
	@Override
	public boolean method3226(@OriginalArg(0) Interface3 arg0) {
		if (!(arg0 instanceof Class116)) {
			return false;
		}
		@Pc(11) Class116 local11 = (Class116) arg0;
		if (local11.anInt3484 != this.anInt3484) {
			return false;
		} else if (local11.anInt3480 != this.anInt3480) {
			return false;
		} else if (local11.anInt3483 != this.anInt3483) {
			return false;
		} else if (this.anInt3485 != local11.anInt3485) {
			return false;
		} else if (this.anInt3481 != local11.anInt3481) {
			return false;
		} else if (this.anInt3486 == local11.anInt3486) {
			return this.aBoolean251 == local11.aBoolean251;
		} else {
			return false;
		}
	}
}
