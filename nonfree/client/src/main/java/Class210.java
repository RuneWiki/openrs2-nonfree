import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class210 implements Interface1 {

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
	public static final int[] anIntArray553 = new int[256];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	public int anInt6575;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	public int anInt6578;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Z")
	public boolean aBoolean439;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public int anInt6579;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	public int anInt6580;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public int anInt6581;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public int anInt6583;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray553[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!bc;I)Z")
	@Override
	public boolean method5552(@OriginalArg(0) Interface1 arg0) {
		if (!(arg0 instanceof Class210)) {
			return false;
		}
		@Pc(11) Class210 local11 = (Class210) arg0;
		if (this.anInt6580 != local11.anInt6580) {
			return false;
		} else if (this.anInt6583 != local11.anInt6583) {
			return false;
		} else if (this.anInt6578 != local11.anInt6578) {
			return false;
		} else if (this.anInt6579 != local11.anInt6579) {
			return false;
		} else if (this.anInt6581 != local11.anInt6581) {
			return false;
		} else if (this.anInt6575 == local11.anInt6575) {
			return this.aBoolean439 == local11.aBoolean439;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)J")
	@Override
	public long method5553() {
		@Pc(5) long[] local5 = Class27.aLongArray2;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt6580 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt6583 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) (((long) this.anInt6583 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt6578 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt6578 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt6578 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt6578) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt6579 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) (((long) (this.anInt6581 >> 24) ^ local135) & 0xFFL)];
		@Pc(177) long local177 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt6581 >> 16) ^ local152) & 0xFFL)];
		@Pc(194) long local194 = local5[(int) (((long) (this.anInt6581 >> 8) ^ local177) & 0xFFL)] ^ local177 >>> 8;
		@Pc(209) long local209 = local5[(int) (((long) this.anInt6581 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) ((local209 ^ (long) this.anInt6575) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) (((long) (this.aBoolean439 ? 1 : 0) ^ local224) & 0xFFL)];
	}
}
