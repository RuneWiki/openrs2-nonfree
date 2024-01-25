import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class19 implements Interface7 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
	public boolean aBoolean30;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt394;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!kb;)Z")
	@Override
	public boolean method353(@OriginalArg(1) Interface7 arg0) {
		if (!(arg0 instanceof Class19)) {
			return false;
		}
		@Pc(11) Class19 local11 = (Class19) arg0;
		if (this.anInt394 != local11.anInt394) {
			return false;
		} else if (this.anInt391 != local11.anInt391) {
			return false;
		} else if (local11.anInt392 != this.anInt392) {
			return false;
		} else if (this.anInt387 != local11.anInt387) {
			return false;
		} else if (this.anInt395 != local11.anInt395) {
			return false;
		} else if (local11.anInt397 == this.anInt397) {
			return local11.aBoolean30 == this.aBoolean30;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
	@Override
	public long method354() {
		@Pc(5) long[] local5 = Class36.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt394) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt391 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt391 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt392 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt392 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt392 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt392 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local5[(int) (((long) this.anInt387 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt395 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt395 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt395 >> 8) ^ local169) & 0xFFL)];
		@Pc(201) long local201 = local5[(int) ((local186 ^ (long) this.anInt395) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local5[(int) ((local201 ^ (long) this.anInt397) & 0xFFL)] ^ local201 >>> 8;
		return local5[(int) ((local216 ^ (long) (this.aBoolean30 ? 1 : 0)) & 0xFFL)] ^ local216 >>> 8;
	}
}
