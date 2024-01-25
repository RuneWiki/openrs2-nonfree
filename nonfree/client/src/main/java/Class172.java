import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class172 implements Interface21 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	public int anInt5090;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public int anInt5091;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
	public boolean aBoolean405;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public int anInt5093;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public int anInt5094;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public int anInt5096;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public int anInt5097;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!rf;B)Z")
	@Override
	public boolean method4250(@OriginalArg(0) Interface21 arg0) {
		if (!(arg0 instanceof Class172)) {
			return false;
		}
		@Pc(11) Class172 local11 = (Class172) arg0;
		if (local11.anInt5093 != this.anInt5093) {
			return false;
		} else if (local11.anInt5096 != this.anInt5096) {
			return false;
		} else if (this.anInt5094 != local11.anInt5094) {
			return false;
		} else if (local11.anInt5097 != this.anInt5097) {
			return false;
		} else if (this.anInt5090 != local11.anInt5090) {
			return false;
		} else if (local11.anInt5091 == this.anInt5091) {
			return this.aBoolean405 == local11.aBoolean405;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
	@Override
	public long method4251() {
		@Pc(5) long[] local5 = Class365.aLongArray18;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt5093 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt5096 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt5096 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt5094 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(95) long local95 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt5094 >> 16)) & 0xFFL)];
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt5094 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local5[(int) ((local112 ^ (long) this.anInt5094) & 0xFFL)] ^ local112 >>> 8;
		@Pc(142) long local142 = local5[(int) (((long) this.anInt5097 ^ local127) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) ((local142 ^ (long) (this.anInt5090 >> 24)) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local159 >>> 8 ^ local5[(int) (((long) (this.anInt5090 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local5[(int) (((long) (this.anInt5090 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local193 >>> 8 ^ local5[(int) (((long) this.anInt5090 ^ local193) & 0xFFL)];
		@Pc(223) long local223 = local208 >>> 8 ^ local5[(int) (((long) this.anInt5091 ^ local208) & 0xFFL)];
		return local5[(int) ((local223 ^ (long) (this.aBoolean405 ? 1 : 0)) & 0xFFL)] ^ local223 >>> 8;
	}
}
