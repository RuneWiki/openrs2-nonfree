import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class90 implements Interface3 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public int anInt2175;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)J")
	@Override
	public long method2032() {
		@Pc(5) long[] local5 = Class264.aLongArray8;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2175 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(46) long local46 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt2177 >> 8) ^ local22) & 0xFFL)];
		@Pc(61) long local61 = local5[(int) (((long) this.anInt2177 ^ local46) & 0xFFL)] ^ local46 >>> 8;
		@Pc(78) long local78 = local61 >>> 8 ^ local5[(int) (((long) (this.anInt2174 >> 24) ^ local61) & 0xFFL)];
		@Pc(95) long local95 = local78 >>> 8 ^ local5[(int) ((local78 ^ (long) (this.anInt2174 >> 16)) & 0xFFL)];
		@Pc(112) long local112 = local95 >>> 8 ^ local5[(int) ((local95 ^ (long) (this.anInt2174 >> 8)) & 0xFFL)];
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) (((long) this.anInt2174 ^ local112) & 0xFFL)];
		@Pc(142) long local142 = local5[(int) ((local127 ^ (long) this.anInt2176) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) ((local142 ^ (long) (this.anInt2182 >> 24)) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local5[(int) ((local159 ^ (long) (this.anInt2182 >> 16)) & 0xFFL)] ^ local159 >>> 8;
		@Pc(193) long local193 = local176 >>> 8 ^ local5[(int) (((long) (this.anInt2182 >> 8) ^ local176) & 0xFFL)];
		@Pc(208) long local208 = local193 >>> 8 ^ local5[(int) ((local193 ^ (long) this.anInt2182) & 0xFFL)];
		@Pc(223) long local223 = local208 >>> 8 ^ local5[(int) (((long) this.anInt2180 ^ local208) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean133 ? 1 : 0) ^ local223) & 0xFFL)] ^ local223 >>> 8;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!dd;I)Z")
	@Override
	public boolean method2033(@OriginalArg(0) Interface3 arg0) {
		if (!(arg0 instanceof Class90)) {
			return false;
		}
		@Pc(11) Class90 local11 = (Class90) arg0;
		if (this.anInt2175 != local11.anInt2175) {
			return false;
		} else if (this.anInt2177 != local11.anInt2177) {
			return false;
		} else if (this.anInt2174 != local11.anInt2174) {
			return false;
		} else if (this.anInt2176 != local11.anInt2176) {
			return false;
		} else if (local11.anInt2182 != this.anInt2182) {
			return false;
		} else if (this.anInt2180 == local11.anInt2180) {
			return local11.aBoolean133 == this.aBoolean133;
		} else {
			return false;
		}
	}
}
