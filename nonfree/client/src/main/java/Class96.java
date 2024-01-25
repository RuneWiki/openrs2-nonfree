import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class96 implements Interface18 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public int anInt2248;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt2250;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt2253;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public int anInt2254;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J")
	@Override
	public long method1962() {
		@Pc(5) long[] local5 = Class319.aLongArray15;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt2253 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt2257 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt2257 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt2254 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt2254 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt2254 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt2254 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local5[(int) (((long) this.anInt2248 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt2255 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt2255 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local5[(int) (((long) (this.anInt2255 >> 8) ^ local169) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) (((long) this.anInt2255 ^ local186) & 0xFFL)];
		@Pc(216) long local216 = local201 >>> 8 ^ local5[(int) (((long) this.anInt2250 ^ local201) & 0xFFL)];
		return local5[(int) ((local216 ^ (long) (this.aBoolean147 ? 1 : 0)) & 0xFFL)] ^ local216 >>> 8;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!rl;I)Z")
	@Override
	public boolean method1963(@OriginalArg(0) Interface18 arg0) {
		if (!(arg0 instanceof Class96)) {
			return false;
		}
		@Pc(11) Class96 local11 = (Class96) arg0;
		if (local11.anInt2253 != this.anInt2253) {
			return false;
		} else if (this.anInt2257 != local11.anInt2257) {
			return false;
		} else if (local11.anInt2254 != this.anInt2254) {
			return false;
		} else if (local11.anInt2248 != this.anInt2248) {
			return false;
		} else if (this.anInt2255 != local11.anInt2255) {
			return false;
		} else if (local11.anInt2250 == this.anInt2250) {
			return this.aBoolean147 == local11.aBoolean147;
		} else {
			return false;
		}
	}
}
