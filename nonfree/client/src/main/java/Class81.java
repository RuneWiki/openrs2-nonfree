import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class81 implements Interface5 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
	public int anInt2038;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt2043;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!eq;B)Z")
	@Override
	public boolean method1678(@OriginalArg(0) Interface5 arg0) {
		if (!(arg0 instanceof Class81)) {
			return false;
		}
		@Pc(16) Class81 local16 = (Class81) arg0;
		if (this.anInt2043 != local16.anInt2043) {
			return false;
		} else if (this.anInt2034 != local16.anInt2034) {
			return false;
		} else if (local16.anInt2041 != this.anInt2041) {
			return false;
		} else if (this.anInt2033 != local16.anInt2033) {
			return false;
		} else if (this.anInt2031 != local16.anInt2031) {
			return false;
		} else if (local16.anInt2038 == this.anInt2038) {
			return local16.aBoolean156 == this.aBoolean156;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)J")
	@Override
	public long method1677() {
		@Pc(5) long[] local5 = Class5_Sub40.aLongArray12;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt2043 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt2034 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(64) long local64 = local39 >>> 8 ^ local5[(int) (((long) this.anInt2034 ^ local39) & 0xFFL)];
		@Pc(81) long local81 = local5[(int) ((local64 ^ (long) (this.anInt2041 >> 24)) & 0xFFL)] ^ local64 >>> 8;
		@Pc(98) long local98 = local81 >>> 8 ^ local5[(int) ((local81 ^ (long) (this.anInt2041 >> 16)) & 0xFFL)];
		@Pc(115) long local115 = local5[(int) (((long) (this.anInt2041 >> 8) ^ local98) & 0xFFL)] ^ local98 >>> 8;
		@Pc(130) long local130 = local5[(int) (((long) this.anInt2041 ^ local115) & 0xFFL)] ^ local115 >>> 8;
		@Pc(145) long local145 = local5[(int) (((long) this.anInt2033 ^ local130) & 0xFFL)] ^ local130 >>> 8;
		@Pc(162) long local162 = local145 >>> 8 ^ local5[(int) (((long) (this.anInt2031 >> 24) ^ local145) & 0xFFL)];
		@Pc(179) long local179 = local162 >>> 8 ^ local5[(int) (((long) (this.anInt2031 >> 16) ^ local162) & 0xFFL)];
		@Pc(196) long local196 = local5[(int) ((local179 ^ (long) (this.anInt2031 >> 8)) & 0xFFL)] ^ local179 >>> 8;
		@Pc(211) long local211 = local5[(int) (((long) this.anInt2031 ^ local196) & 0xFFL)] ^ local196 >>> 8;
		@Pc(226) long local226 = local5[(int) ((local211 ^ (long) this.anInt2038) & 0xFFL)] ^ local211 >>> 8;
		return local5[(int) (((long) (this.aBoolean156 ? 1 : 0) ^ local226) & 0xFFL)] ^ local226 >>> 8;
	}
}
