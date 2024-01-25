import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class235 implements Interface12 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public int anInt6425;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public int anInt6427;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public int anInt6431;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	public int anInt6433;

	static {
		new Class151(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)J")
	@Override
	public long method4955() {
		@Pc(5) long[] local5 = Class5_Sub1_Sub1.aLongArray9;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt6425) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt6433 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(60) long local60 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt6433) & 0xFFL)];
		@Pc(77) long local77 = local60 >>> 8 ^ local5[(int) (((long) (this.anInt6430 >> 24) ^ local60) & 0xFFL)];
		@Pc(94) long local94 = local5[(int) (((long) (this.anInt6430 >> 16) ^ local77) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) ((local94 ^ (long) (this.anInt6430 >> 8)) & 0xFFL)];
		@Pc(126) long local126 = local5[(int) (((long) this.anInt6430 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) ((local126 ^ (long) this.anInt6428) & 0xFFL)];
		@Pc(158) long local158 = local5[(int) ((local141 ^ (long) (this.anInt6431 >> 24)) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt6431 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local175 >>> 8 ^ local5[(int) ((local175 ^ (long) (this.anInt6431 >> 8)) & 0xFFL)];
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) ((local192 ^ (long) this.anInt6431) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) ((local207 ^ (long) this.anInt6427) & 0xFFL)];
		return local5[(int) ((local222 ^ (long) (this.aBoolean528 ? 1 : 0)) & 0xFFL)] ^ local222 >>> 8;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!vs;I)Z")
	@Override
	public boolean method4954(@OriginalArg(0) Interface12 arg0) {
		if (!(arg0 instanceof Class235)) {
			return false;
		}
		@Pc(11) Class235 local11 = (Class235) arg0;
		if (this.anInt6425 != local11.anInt6425) {
			return false;
		} else if (this.anInt6433 != local11.anInt6433) {
			return false;
		} else if (this.anInt6430 != local11.anInt6430) {
			return false;
		} else if (this.anInt6428 != local11.anInt6428) {
			return false;
		} else if (this.anInt6431 != local11.anInt6431) {
			return false;
		} else if (this.anInt6427 == local11.anInt6427) {
			return local11.aBoolean528 == this.aBoolean528;
		} else {
			return false;
		}
	}
}
