import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class18 implements Interface5 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Z")
	public boolean aBoolean13;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public int anInt317;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public int anInt318;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)J")
	@Override
	public long method430() {
		@Pc(5) long[] local5 = Class57.aLongArray22;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt313 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt314 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt314 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt316 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(93) long local93 = local5[(int) (((long) (this.anInt316 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) (((long) (this.anInt316 >> 8) ^ local93) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) (((long) this.anInt316 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt318) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt317 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local5[(int) (((long) (this.anInt317 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) (((long) (this.anInt317 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt317 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt312 ^ local206) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean13 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!fw;)Z")
	@Override
	public boolean method431(@OriginalArg(1) Interface5 arg0) {
		if (!(arg0 instanceof Class18)) {
			return false;
		}
		@Pc(11) Class18 local11 = (Class18) arg0;
		if (local11.anInt313 != this.anInt313) {
			return false;
		} else if (local11.anInt314 != this.anInt314) {
			return false;
		} else if (local11.anInt316 != this.anInt316) {
			return false;
		} else if (local11.anInt318 != this.anInt318) {
			return false;
		} else if (this.anInt317 != local11.anInt317) {
			return false;
		} else if (this.anInt312 == local11.anInt312) {
			return this.aBoolean13 == local11.aBoolean13;
		} else {
			return false;
		}
	}
}
