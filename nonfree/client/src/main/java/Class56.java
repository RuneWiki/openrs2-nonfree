import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class56 implements Interface21 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public int anInt1526;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	public int anInt1527;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
	public int anInt1528;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1530;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)J")
	@Override
	public long method1446() {
		@Pc(5) long[] local5 = Class287.aLongArray14;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt1528 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt1526 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt1526) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt1530 >> 24) ^ local54) & 0xFFL)];
		@Pc(94) long local94 = local5[(int) ((local71 ^ (long) (this.anInt1530 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) (((long) (this.anInt1530 >> 8) ^ local94) & 0xFFL)];
		@Pc(126) long local126 = local5[(int) ((local111 ^ (long) this.anInt1530) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) ((local126 ^ (long) this.anInt1527) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt1524 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt1524 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) (((long) (this.anInt1524 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local5[(int) ((local192 ^ (long) this.anInt1524) & 0xFFL)] ^ local192 >>> 8;
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) ((local207 ^ (long) this.anInt1525) & 0xFFL)];
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean109 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLclient!sea;)Z")
	@Override
	public boolean method1445(@OriginalArg(1) Interface21 arg0) {
		if (!(arg0 instanceof Class56)) {
			return false;
		}
		@Pc(11) Class56 local11 = (Class56) arg0;
		if (this.anInt1528 != local11.anInt1528) {
			return false;
		} else if (local11.anInt1526 != this.anInt1526) {
			return false;
		} else if (this.anInt1530 != local11.anInt1530) {
			return false;
		} else if (this.anInt1527 != local11.anInt1527) {
			return false;
		} else if (local11.anInt1524 != this.anInt1524) {
			return false;
		} else if (local11.anInt1525 == this.anInt1525) {
			return local11.aBoolean109 == this.aBoolean109;
		} else {
			return false;
		}
	}
}
