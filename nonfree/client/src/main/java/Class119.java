import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class119 implements Interface7 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	public boolean aBoolean338;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J")
	@Override
	public long method3358() {
		@Pc(11) long[] local11 = Class1_Sub4_Sub7.aLongArray1;
		@Pc(13) long local13 = -1L;
		@Pc(28) long local28 = local11[(int) ((local13 ^ (long) this.anInt3602) & 0xFFL)] ^ local13 >>> 8;
		@Pc(45) long local45 = local11[(int) ((local28 ^ (long) (this.anInt3597 >> 8)) & 0xFFL)] ^ local28 >>> 8;
		@Pc(60) long local60 = local11[(int) ((local45 ^ (long) this.anInt3597) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local60 >>> 8 ^ local11[(int) (((long) (this.anInt3595 >> 24) ^ local60) & 0xFFL)];
		@Pc(94) long local94 = local11[(int) ((local77 ^ (long) (this.anInt3595 >> 16)) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local11[(int) ((local94 ^ (long) (this.anInt3595 >> 8)) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local111 >>> 8 ^ local11[(int) ((local111 ^ (long) this.anInt3595) & 0xFFL)];
		@Pc(141) long local141 = local126 >>> 8 ^ local11[(int) ((local126 ^ (long) this.anInt3600) & 0xFFL)];
		@Pc(158) long local158 = local11[(int) (((long) (this.anInt3596 >> 24) ^ local141) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local158 >>> 8 ^ local11[(int) (((long) (this.anInt3596 >> 16) ^ local158) & 0xFFL)];
		@Pc(192) long local192 = local175 >>> 8 ^ local11[(int) (((long) (this.anInt3596 >> 8) ^ local175) & 0xFFL)];
		@Pc(207) long local207 = local11[(int) ((local192 ^ (long) this.anInt3596) & 0xFFL)] ^ local192 >>> 8;
		@Pc(222) long local222 = local11[(int) ((local207 ^ (long) this.anInt3593) & 0xFFL)] ^ local207 >>> 8;
		return local11[(int) ((local222 ^ (long) (this.aBoolean338 ? 1 : 0)) & 0xFFL)] ^ local222 >>> 8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!uk;)Z")
	@Override
	public boolean method3359(@OriginalArg(1) Interface7 arg0) {
		if (!(arg0 instanceof Class119)) {
			return false;
		}
		@Pc(19) Class119 local19 = (Class119) arg0;
		if (this.anInt3602 != local19.anInt3602) {
			return false;
		} else if (this.anInt3597 != local19.anInt3597) {
			return false;
		} else if (local19.anInt3595 != this.anInt3595) {
			return false;
		} else if (this.anInt3600 != local19.anInt3600) {
			return false;
		} else if (this.anInt3596 != local19.anInt3596) {
			return false;
		} else if (local19.anInt3593 == this.anInt3593) {
			return local19.aBoolean338 == this.aBoolean338;
		} else {
			return false;
		}
	}
}
