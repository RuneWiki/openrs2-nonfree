import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class83 implements Interface2 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public int anInt2515;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public int anInt2520;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)J")
	@Override
	public long method1870() {
		@Pc(5) long[] local5 = Class112.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2520 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt2519 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt2519) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt2517 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt2517 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt2517 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt2517) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt2522 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt2515 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt2515 >> 16) ^ local152) & 0xFFL)];
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt2515 >> 8) ^ local169) & 0xFFL)];
		@Pc(201) long local201 = local5[(int) ((local186 ^ (long) this.anInt2515) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local201 >>> 8 ^ local5[(int) (((long) this.anInt2521 ^ local201) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean191 ? 1 : 0) ^ local216) & 0xFFL)] ^ local216 >>> 8;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!dt;)Z")
	@Override
	public boolean method1869(@OriginalArg(1) Interface2 arg0) {
		if (!(arg0 instanceof Class83)) {
			return false;
		}
		@Pc(11) Class83 local11 = (Class83) arg0;
		if (local11.anInt2520 != this.anInt2520) {
			return false;
		} else if (local11.anInt2519 != this.anInt2519) {
			return false;
		} else if (this.anInt2517 != local11.anInt2517) {
			return false;
		} else if (this.anInt2522 != local11.anInt2522) {
			return false;
		} else if (this.anInt2515 != local11.anInt2515) {
			return false;
		} else if (this.anInt2521 == local11.anInt2521) {
			return this.aBoolean191 == local11.aBoolean191;
		} else {
			return false;
		}
	}
}
