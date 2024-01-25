import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class138 implements Interface1 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public int anInt3694;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public int anInt3696;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
	public int anInt3697;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	public int anInt3701;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "Z")
	public boolean aBoolean291;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
	public int anInt3702;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!be;)Z")
	@Override
	public boolean method3304(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class138)) {
			return false;
		}
		@Pc(11) Class138 local11 = (Class138) arg0;
		if (local11.anInt3696 != this.anInt3696) {
			return false;
		} else if (local11.anInt3695 != this.anInt3695) {
			return false;
		} else if (local11.anInt3702 != this.anInt3702) {
			return false;
		} else if (local11.anInt3697 != this.anInt3697) {
			return false;
		} else if (this.anInt3701 != local11.anInt3701) {
			return false;
		} else if (this.anInt3694 == local11.anInt3694) {
			return this.aBoolean291 == local11.aBoolean291;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)J")
	@Override
	public long method3303() {
		@Pc(11) long[] local11 = Class157.aLongArray9;
		@Pc(13) long local13 = -1L;
		@Pc(28) long local28 = local11[(int) ((local13 ^ (long) this.anInt3696) & 0xFFL)] ^ local13 >>> 8;
		@Pc(45) long local45 = local28 >>> 8 ^ local11[(int) ((local28 ^ (long) (this.anInt3695 >> 8)) & 0xFFL)];
		@Pc(60) long local60 = local11[(int) (((long) this.anInt3695 ^ local45) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local11[(int) ((local60 ^ (long) (this.anInt3702 >> 24)) & 0xFFL)] ^ local60 >>> 8;
		@Pc(94) long local94 = local11[(int) (((long) (this.anInt3702 >> 16) ^ local77) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local11[(int) ((local94 ^ (long) (this.anInt3702 >> 8)) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local111 >>> 8 ^ local11[(int) ((local111 ^ (long) this.anInt3702) & 0xFFL)];
		@Pc(141) long local141 = local126 >>> 8 ^ local11[(int) ((local126 ^ (long) this.anInt3697) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local11[(int) ((local141 ^ (long) (this.anInt3701 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local158 >>> 8 ^ local11[(int) ((local158 ^ (long) (this.anInt3701 >> 16)) & 0xFFL)];
		@Pc(192) long local192 = local11[(int) (((long) (this.anInt3701 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local11[(int) (((long) this.anInt3701 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local11[(int) ((local207 ^ (long) this.anInt3694) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local11[(int) (((long) (this.aBoolean291 ? 1 : 0) ^ local222) & 0xFFL)];
	}
}
