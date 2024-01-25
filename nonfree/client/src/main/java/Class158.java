import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class158 implements Interface17 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
	public int anInt3805;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	public int anInt3807;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!qaa;I)Z")
	@Override
	public boolean method3443(@OriginalArg(0) Interface17 arg0) {
		if (!(arg0 instanceof Class158)) {
			return false;
		}
		@Pc(20) Class158 local20 = (Class158) arg0;
		if (local20.anInt3806 != this.anInt3806) {
			return false;
		} else if (local20.anInt3809 != this.anInt3809) {
			return false;
		} else if (local20.anInt3805 != this.anInt3805) {
			return false;
		} else if (local20.anInt3813 != this.anInt3813) {
			return false;
		} else if (local20.anInt3808 != this.anInt3808) {
			return false;
		} else if (this.anInt3807 == local20.anInt3807) {
			return this.aBoolean237 == local20.aBoolean237;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)J")
	@Override
	public long method3442() {
		@Pc(5) long[] local5 = Class359.aLongArray24;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt3806 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt3809 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt3809 ^ local39) & 0xFFL)];
		@Pc(77) long local77 = local5[(int) (((long) (this.anInt3805 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(94) long local94 = local77 >>> 8 ^ local5[(int) ((local77 ^ (long) (this.anInt3805 >> 16)) & 0xFFL)];
		@Pc(111) long local111 = local5[(int) (((long) (this.anInt3805 >> 8) ^ local94) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local5[(int) ((local111 ^ (long) this.anInt3805) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local5[(int) (((long) this.anInt3813 ^ local126) & 0xFFL)] ^ local126 >>> 8;
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt3808 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt3808 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) ((local175 ^ (long) (this.anInt3808 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) ((local192 ^ (long) this.anInt3808) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) ((local207 ^ (long) this.anInt3807) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean237 ? 1 : 0) ^ local222) & 0xFFL)] ^ local222 >>> 8;
	}
}
