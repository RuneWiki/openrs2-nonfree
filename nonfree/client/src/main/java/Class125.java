import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class125 implements Interface9 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public int anInt3568;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public int anInt3569;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public int anInt3572;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	public int anInt3573;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public int anInt3577;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public int anInt3580;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!qa;)Z")
	@Override
	public boolean method2959(@OriginalArg(1) Interface9 arg0) {
		if (!(arg0 instanceof Class125)) {
			return false;
		}
		@Pc(16) Class125 local16 = (Class125) arg0;
		if (local16.anInt3569 != this.anInt3569) {
			return false;
		} else if (local16.anInt3577 != this.anInt3577) {
			return false;
		} else if (local16.anInt3573 != this.anInt3573) {
			return false;
		} else if (local16.anInt3568 != this.anInt3568) {
			return false;
		} else if (this.anInt3580 != local16.anInt3580) {
			return false;
		} else if (local16.anInt3572 == this.anInt3572) {
			return local16.aBoolean231 == this.aBoolean231;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)J")
	@Override
	public long method2958() {
		@Pc(5) long[] local5 = Class6_Sub1.aLongArray10;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt3569) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt3577 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt3577) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt3573 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt3573 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt3573 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt3573) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt3568) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt3580 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt3580 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(194) long local194 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt3580 >> 8) ^ local169) & 0xFFL)];
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) ((local194 ^ (long) this.anInt3580) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) ((local209 ^ (long) this.anInt3572) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) (((long) (this.aBoolean231 ? 1 : 0) ^ local224) & 0xFFL)];
	}
}
