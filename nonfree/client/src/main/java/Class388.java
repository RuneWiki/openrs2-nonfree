import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class388 implements Interface13 {

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	public int anInt10816;

	@OriginalMember(owner = "client!via", name = "f", descriptor = "I")
	public int anInt10817;

	@OriginalMember(owner = "client!via", name = "i", descriptor = "I")
	public int anInt10818;

	@OriginalMember(owner = "client!via", name = "h", descriptor = "Z")
	public boolean aBoolean781;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "I")
	public int anInt10821;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "I")
	public int anInt10822;

	@OriginalMember(owner = "client!via", name = "j", descriptor = "I")
	public int anInt10823;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)J")
	@Override
	public long method9027() {
		@Pc(11) long[] local11 = Class3_Sub28_Sub2.aLongArray10;
		@Pc(13) long local13 = -1L;
		@Pc(28) long local28 = local13 >>> 8 ^ local11[(int) (((long) this.anInt10817 ^ local13) & 0xFFL)];
		@Pc(45) long local45 = local28 >>> 8 ^ local11[(int) (((long) (this.anInt10818 >> 8) ^ local28) & 0xFFL)];
		@Pc(60) long local60 = local11[(int) (((long) this.anInt10818 ^ local45) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local11[(int) ((local60 ^ (long) (this.anInt10822 >> 24)) & 0xFFL)] ^ local60 >>> 8;
		@Pc(94) long local94 = local77 >>> 8 ^ local11[(int) (((long) (this.anInt10822 >> 16) ^ local77) & 0xFFL)];
		@Pc(111) long local111 = local11[(int) ((local94 ^ (long) (this.anInt10822 >> 8)) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local111 >>> 8 ^ local11[(int) ((local111 ^ (long) this.anInt10822) & 0xFFL)];
		@Pc(141) long local141 = local11[(int) (((long) this.anInt10821 ^ local126) & 0xFFL)] ^ local126 >>> 8;
		@Pc(158) long local158 = local11[(int) ((local141 ^ (long) (this.anInt10823 >> 24)) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local11[(int) (((long) (this.anInt10823 >> 16) ^ local158) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local11[(int) (((long) (this.anInt10823 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local11[(int) (((long) this.anInt10823 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local11[(int) (((long) this.anInt10816 ^ local207) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local11[(int) (((long) (this.aBoolean781 ? 1 : 0) ^ local222) & 0xFFL)];
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!jh;I)Z")
	@Override
	public boolean method9028(@OriginalArg(0) Interface13 arg0) {
		if (!(arg0 instanceof Class388)) {
			return false;
		}
		@Pc(12) Class388 local12 = (Class388) arg0;
		if (local12.anInt10817 != this.anInt10817) {
			return false;
		} else if (this.anInt10818 != local12.anInt10818) {
			return false;
		} else if (local12.anInt10822 != this.anInt10822) {
			return false;
		} else if (this.anInt10821 != local12.anInt10821) {
			return false;
		} else if (local12.anInt10823 != this.anInt10823) {
			return false;
		} else if (this.anInt10816 == local12.anInt10816) {
			return this.aBoolean781 == local12.aBoolean781;
		} else {
			return false;
		}
	}
}
