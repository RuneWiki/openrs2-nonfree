import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class152 implements Interface6 {

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public int anInt4488;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public int anInt4489;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	public int anInt4491;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public int anInt4492;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
	public int anInt4496;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
	@Override
	public long method3904() {
		@Pc(5) long[] local5 = Class173.aLongArray14;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt4488 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt4491 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt4491 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt4487 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt4487 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt4487 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(124) long local124 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt4487) & 0xFFL)];
		@Pc(139) long local139 = local5[(int) (((long) this.anInt4496 ^ local124) & 0xFFL)] ^ local124 >>> 8;
		@Pc(156) long local156 = local5[(int) ((local139 ^ (long) (this.anInt4492 >> 24)) & 0xFFL)] ^ local139 >>> 8;
		@Pc(173) long local173 = local5[(int) ((local156 ^ (long) (this.anInt4492 >> 16)) & 0xFFL)] ^ local156 >>> 8;
		@Pc(190) long local190 = local5[(int) (((long) (this.anInt4492 >> 8) ^ local173) & 0xFFL)] ^ local173 >>> 8;
		@Pc(205) long local205 = local190 >>> 8 ^ local5[(int) (((long) this.anInt4492 ^ local190) & 0xFFL)];
		@Pc(220) long local220 = local5[(int) (((long) this.anInt4489 ^ local205) & 0xFFL)] ^ local205 >>> 8;
		return local5[(int) (((long) (this.aBoolean314 ? 1 : 0) ^ local220) & 0xFFL)] ^ local220 >>> 8;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!maa;I)Z")
	@Override
	public boolean method3903(@OriginalArg(0) Interface6 arg0) {
		if (!(arg0 instanceof Class152)) {
			return false;
		}
		@Pc(11) Class152 local11 = (Class152) arg0;
		if (local11.anInt4488 != this.anInt4488) {
			return false;
		} else if (this.anInt4491 != local11.anInt4491) {
			return false;
		} else if (this.anInt4487 != local11.anInt4487) {
			return false;
		} else if (this.anInt4496 != local11.anInt4496) {
			return false;
		} else if (local11.anInt4492 != this.anInt4492) {
			return false;
		} else if (this.anInt4489 == local11.anInt4489) {
			return this.aBoolean314 == local11.aBoolean314;
		} else {
			return false;
		}
	}
}
