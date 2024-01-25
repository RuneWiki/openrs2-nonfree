import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class348 implements Interface18 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public int anInt8760;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public int anInt8762;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public boolean aBoolean671;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt8763;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public int anInt8765;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public int anInt8766;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt8770;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!so;Z)Z")
	@Override
	public boolean method7299(@OriginalArg(0) Interface18 arg0) {
		if (!(arg0 instanceof Class348)) {
			return false;
		}
		@Pc(11) Class348 local11 = (Class348) arg0;
		if (this.anInt8770 != local11.anInt8770) {
			return false;
		} else if (this.anInt8766 != local11.anInt8766) {
			return false;
		} else if (local11.anInt8762 != this.anInt8762) {
			return false;
		} else if (local11.anInt8763 != this.anInt8763) {
			return false;
		} else if (local11.anInt8760 != this.anInt8760) {
			return false;
		} else if (this.anInt8765 == local11.anInt8765) {
			return local11.aBoolean671 == this.aBoolean671;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
	@Override
	public long method7300() {
		@Pc(5) long[] local5 = Class109.aLongArray6;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt8770) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt8766 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt8766) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt8762 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt8762 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt8762 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt8762 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt8763 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt8760 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) ((local152 ^ (long) (this.anInt8760 >> 16)) & 0xFFL)];
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt8760 >> 8)) & 0xFFL)];
		@Pc(207) long local207 = local186 >>> 8 ^ local5[(int) ((local186 ^ (long) this.anInt8760) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) (((long) this.anInt8765 ^ local207) & 0xFFL)];
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean671 ? 1 : 0)) & 0xFFL)];
	}
}
