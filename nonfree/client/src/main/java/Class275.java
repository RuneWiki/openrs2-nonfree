import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class275 implements Interface17 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
	public int anInt7463;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public int anInt7464;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
	public int anInt7465;

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	public int anInt7466;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
	public int anInt7469;

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "Z")
	public boolean aBoolean584;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
	public int anInt7471;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)J")
	@Override
	public long method5937() {
		@Pc(5) long[] local5 = Class203.aLongArray15;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt7463 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt7464 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt7464 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt7465 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt7465 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt7465 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt7465) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt7466) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) (((long) (this.anInt7471 >> 24) ^ local135) & 0xFFL)];
		@Pc(176) long local176 = local5[(int) ((local152 ^ (long) (this.anInt7471 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(193) long local193 = local5[(int) (((long) (this.anInt7471 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local5[(int) (((long) this.anInt7471 ^ local193) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local208 >>> 8 ^ local5[(int) (((long) this.anInt7469 ^ local208) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean584 ? 1 : 0) ^ local223) & 0xFFL)] ^ local223 >>> 8;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!qt;I)Z")
	@Override
	public boolean method5938(@OriginalArg(0) Interface17 arg0) {
		if (!(arg0 instanceof Class275)) {
			return false;
		}
		@Pc(11) Class275 local11 = (Class275) arg0;
		if (this.anInt7463 != local11.anInt7463) {
			return false;
		} else if (this.anInt7464 != local11.anInt7464) {
			return false;
		} else if (local11.anInt7465 != this.anInt7465) {
			return false;
		} else if (this.anInt7466 != local11.anInt7466) {
			return false;
		} else if (this.anInt7471 != local11.anInt7471) {
			return false;
		} else if (local11.anInt7469 == this.anInt7469) {
			return this.aBoolean584 == local11.aBoolean584;
		} else {
			return false;
		}
	}
}
