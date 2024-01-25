import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class154 implements Interface8 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Z")
	public boolean aBoolean290;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public int anInt4552;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public int anInt4553;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public int anInt4556;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public int anInt4559;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)J")
	@Override
	public long method3512() {
		@Pc(5) long[] local5 = Class163.aLongArray6;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt4559 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt4551 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(59) long local59 = local39 >>> 8 ^ local5[(int) (((long) this.anInt4551 ^ local39) & 0xFFL)];
		@Pc(76) long local76 = local5[(int) ((local59 ^ (long) (this.anInt4554 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) ((local76 ^ (long) (this.anInt4554 >> 16)) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) ((local93 ^ (long) (this.anInt4554 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local5[(int) ((local110 ^ (long) this.anInt4554) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt4553) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) (((long) (this.anInt4556 >> 24) ^ local140) & 0xFFL)];
		@Pc(174) long local174 = local5[(int) (((long) (this.anInt4556 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt4556 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) ((local191 ^ (long) this.anInt4556) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) (((long) this.anInt4552 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) ((local221 ^ (long) (this.aBoolean290 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!mb;)Z")
	@Override
	public boolean method3511(@OriginalArg(1) Interface8 arg0) {
		if (!(arg0 instanceof Class154)) {
			return false;
		}
		@Pc(11) Class154 local11 = (Class154) arg0;
		if (local11.anInt4559 != this.anInt4559) {
			return false;
		} else if (local11.anInt4551 != this.anInt4551) {
			return false;
		} else if (local11.anInt4554 != this.anInt4554) {
			return false;
		} else if (local11.anInt4553 != this.anInt4553) {
			return false;
		} else if (local11.anInt4556 != this.anInt4556) {
			return false;
		} else if (this.anInt4552 == local11.anInt4552) {
			return this.aBoolean290 == local11.aBoolean290;
		} else {
			return false;
		}
	}
}
