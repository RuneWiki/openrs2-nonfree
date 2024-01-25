import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class88 implements Interface23 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public int anInt3268;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public int anInt3269;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public int anInt3271;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public int anInt3272;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public int anInt3274;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public int anInt3276;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)J")
	@Override
	public long method2731() {
		@Pc(5) long[] local5 = Class377.aLongArray16;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt3271 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt3268 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) (((long) this.anInt3268 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt3272 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt3272 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt3272 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt3272) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt3274 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt3276 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt3276 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt3276 >> 8)) & 0xFFL)];
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) (((long) this.anInt3276 ^ local186) & 0xFFL)];
		@Pc(216) long local216 = local5[(int) ((local201 ^ (long) this.anInt3269) & 0xFFL)] ^ local201 >>> 8;
		return local216 >>> 8 ^ local5[(int) (((long) (this.aBoolean255 ? 1 : 0) ^ local216) & 0xFFL)];
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!sn;)Z")
	@Override
	public boolean method2730(@OriginalArg(1) Interface23 arg0) {
		if (!(arg0 instanceof Class88)) {
			return false;
		}
		@Pc(11) Class88 local11 = (Class88) arg0;
		if (local11.anInt3271 != this.anInt3271) {
			return false;
		} else if (this.anInt3268 != local11.anInt3268) {
			return false;
		} else if (this.anInt3272 != local11.anInt3272) {
			return false;
		} else if (this.anInt3274 != local11.anInt3274) {
			return false;
		} else if (local11.anInt3276 != this.anInt3276) {
			return false;
		} else if (this.anInt3269 == local11.anInt3269) {
			return this.aBoolean255 == local11.aBoolean255;
		} else {
			return false;
		}
	}
}
