import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class376 implements Interface20 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	public int anInt10407;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public int anInt10408;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	public int anInt10409;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	public int anInt10410;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "Z")
	public boolean aBoolean888;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
	public int anInt10412;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int anInt10415;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!ofa;)Z")
	@Override
	public boolean method8656(@OriginalArg(1) Interface20 arg0) {
		if (!(arg0 instanceof Class376)) {
			return false;
		}
		@Pc(11) Class376 local11 = (Class376) arg0;
		if (local11.anInt10409 != this.anInt10409) {
			return false;
		} else if (this.anInt10415 != local11.anInt10415) {
			return false;
		} else if (this.anInt10407 != local11.anInt10407) {
			return false;
		} else if (local11.anInt10408 != this.anInt10408) {
			return false;
		} else if (local11.anInt10410 != this.anInt10410) {
			return false;
		} else if (local11.anInt10412 == this.anInt10412) {
			return this.aBoolean888 == local11.aBoolean888;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)J")
	@Override
	public long method8655() {
		@Pc(5) long[] local5 = Class25.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt10409) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt10415 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt10415) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt10407 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt10407 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt10407 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt10407 ^ local105) & 0xFFL)];
		@Pc(151) long local151 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt10408) & 0xFFL)];
		@Pc(168) long local168 = local5[(int) ((local151 ^ (long) (this.anInt10410 >> 24)) & 0xFFL)] ^ local151 >>> 8;
		@Pc(185) long local185 = local5[(int) ((local168 ^ (long) (this.anInt10410 >> 16)) & 0xFFL)] ^ local168 >>> 8;
		@Pc(202) long local202 = local185 >>> 8 ^ local5[(int) ((local185 ^ (long) (this.anInt10410 >> 8)) & 0xFFL)];
		@Pc(217) long local217 = local5[(int) ((local202 ^ (long) this.anInt10410) & 0xFFL)] ^ local202 >>> 8;
		@Pc(232) long local232 = local217 >>> 8 ^ local5[(int) (((long) this.anInt10412 ^ local217) & 0xFFL)];
		return local232 >>> 8 ^ local5[(int) (((long) (this.aBoolean888 ? 1 : 0) ^ local232) & 0xFFL)];
	}
}
