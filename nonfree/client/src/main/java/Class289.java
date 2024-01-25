import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class289 implements Interface24 {

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
	public int anInt7593;

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Z")
	public boolean aBoolean535;

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
	public int anInt7594;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
	public int anInt7595;

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
	public int anInt7597;

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
	public int anInt7598;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
	public int anInt7599;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!st;I)Z")
	@Override
	public boolean method6326(@OriginalArg(0) Interface24 arg0) {
		if (!(arg0 instanceof Class289)) {
			return false;
		}
		@Pc(11) Class289 local11 = (Class289) arg0;
		if (local11.anInt7599 != this.anInt7599) {
			return false;
		} else if (local11.anInt7595 != this.anInt7595) {
			return false;
		} else if (local11.anInt7593 != this.anInt7593) {
			return false;
		} else if (this.anInt7598 != local11.anInt7598) {
			return false;
		} else if (this.anInt7597 != local11.anInt7597) {
			return false;
		} else if (this.anInt7594 == local11.anInt7594) {
			return this.aBoolean535 == local11.aBoolean535;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)J")
	@Override
	public long method6325() {
		@Pc(5) long[] local5 = Class3_Sub5_Sub21.aLongArray23;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt7599) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt7595 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt7595) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt7593 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt7593 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt7593 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt7593) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt7598 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt7597 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt7597 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local5[(int) (((long) (this.anInt7597 >> 8) ^ local169) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local5[(int) (((long) this.anInt7597 ^ local186) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local5[(int) (((long) this.anInt7594 ^ local201) & 0xFFL)] ^ local201 >>> 8;
		return local216 >>> 8 ^ local5[(int) ((local216 ^ (long) (this.aBoolean535 ? 1 : 0)) & 0xFFL)];
	}
}
