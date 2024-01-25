import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class274 implements Interface5 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	public int anInt8159;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
	public int anInt8160;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
	public int anInt8162;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
	public int anInt8164;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
	public int anInt8165;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public int anInt8166;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "Z")
	public boolean aBoolean583;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BLclient!er;)Z")
	@Override
	public boolean method6357(@OriginalArg(1) Interface5 arg0) {
		if (!(arg0 instanceof Class274)) {
			return false;
		}
		@Pc(11) Class274 local11 = (Class274) arg0;
		if (this.anInt8165 != local11.anInt8165) {
			return false;
		} else if (local11.anInt8166 != this.anInt8166) {
			return false;
		} else if (this.anInt8160 != local11.anInt8160) {
			return false;
		} else if (this.anInt8164 != local11.anInt8164) {
			return false;
		} else if (this.anInt8162 != local11.anInt8162) {
			return false;
		} else if (local11.anInt8159 == this.anInt8159) {
			return this.aBoolean583 == local11.aBoolean583;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)J")
	@Override
	public long method6356() {
		@Pc(5) long[] local5 = Class194.aLongArray7;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt8165 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt8166 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt8166 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt8160 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt8160 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt8160 >> 8) ^ local88) & 0xFFL)];
		@Pc(126) long local126 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt8160) & 0xFFL)];
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) (((long) this.anInt8164 ^ local126) & 0xFFL)];
		@Pc(158) long local158 = local5[(int) (((long) (this.anInt8162 >> 24) ^ local141) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt8162 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local175 >>> 8 ^ local5[(int) ((local175 ^ (long) (this.anInt8162 >> 8)) & 0xFFL)];
		@Pc(207) long local207 = local5[(int) (((long) this.anInt8162 ^ local192) & 0xFFL)] ^ local192 >>> 8;
		@Pc(222) long local222 = local5[(int) ((local207 ^ (long) this.anInt8159) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean583 ? 1 : 0)) & 0xFFL)];
	}
}
