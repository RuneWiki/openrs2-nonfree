import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class153 implements Interface7 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public int anInt4659;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt4668;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!m;I)Z")
	@Override
	public boolean method4157(@OriginalArg(0) Interface7 arg0) {
		if (!(arg0 instanceof Class153)) {
			return false;
		}
		@Pc(11) Class153 local11 = (Class153) arg0;
		if (this.anInt4668 != local11.anInt4668) {
			return false;
		} else if (local11.anInt4660 != this.anInt4660) {
			return false;
		} else if (local11.anInt4661 != this.anInt4661) {
			return false;
		} else if (local11.anInt4662 != this.anInt4662) {
			return false;
		} else if (local11.anInt4658 != this.anInt4658) {
			return false;
		} else if (this.anInt4659 == local11.anInt4659) {
			return local11.aBoolean380 == this.aBoolean380;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)J")
	@Override
	public long method4158() {
		@Pc(5) long[] local5 = Class4_Sub3_Sub2.aLongArray7;
		@Pc(7) long local7 = -1L;
		@Pc(29) long local29 = local5[(int) (((long) this.anInt4668 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(46) long local46 = local5[(int) (((long) (this.anInt4660 >> 8) ^ local29) & 0xFFL)] ^ local29 >>> 8;
		@Pc(61) long local61 = local46 >>> 8 ^ local5[(int) ((local46 ^ (long) this.anInt4660) & 0xFFL)];
		@Pc(78) long local78 = local5[(int) ((local61 ^ (long) (this.anInt4661 >> 24)) & 0xFFL)] ^ local61 >>> 8;
		@Pc(95) long local95 = local78 >>> 8 ^ local5[(int) ((local78 ^ (long) (this.anInt4661 >> 16)) & 0xFFL)];
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt4661 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local5[(int) ((local112 ^ (long) this.anInt4661) & 0xFFL)] ^ local112 >>> 8;
		@Pc(142) long local142 = local5[(int) ((local127 ^ (long) this.anInt4662) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local142 >>> 8 ^ local5[(int) ((local142 ^ (long) (this.anInt4658 >> 24)) & 0xFFL)];
		@Pc(176) long local176 = local5[(int) ((local159 ^ (long) (this.anInt4658 >> 16)) & 0xFFL)] ^ local159 >>> 8;
		@Pc(193) long local193 = local5[(int) (((long) (this.anInt4658 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local5[(int) ((local193 ^ (long) this.anInt4658) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local208 >>> 8 ^ local5[(int) ((local208 ^ (long) this.anInt4659) & 0xFFL)];
		return local223 >>> 8 ^ local5[(int) (((long) (this.aBoolean380 ? 1 : 0) ^ local223) & 0xFFL)];
	}
}
