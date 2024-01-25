import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class23 implements Interface1 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
	public boolean aBoolean84;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!aa;)Z")
	@Override
	public boolean method557(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class23)) {
			return false;
		}
		@Pc(11) Class23 local11 = (Class23) arg0;
		if (local11.anInt800 != this.anInt800) {
			return false;
		} else if (local11.anInt802 != this.anInt802) {
			return false;
		} else if (this.anInt799 != local11.anInt799) {
			return false;
		} else if (this.anInt810 != local11.anInt810) {
			return false;
		} else if (local11.anInt805 != this.anInt805) {
			return false;
		} else if (this.anInt806 == local11.anInt806) {
			return this.aBoolean84 == local11.aBoolean84;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)J")
	@Override
	public long method556() {
		@Pc(5) long[] local5 = Class4_Sub4_Sub6.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt800 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt802 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt802 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt799 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(93) long local93 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt799 >> 16) ^ local71) & 0xFFL)];
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) ((local93 ^ (long) (this.anInt799 >> 8)) & 0xFFL)];
		@Pc(125) long local125 = local5[(int) (((long) this.anInt799 ^ local110) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local5[(int) (((long) this.anInt810 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt805 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) ((local157 ^ (long) (this.anInt805 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt805 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) (((long) this.anInt805 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt806 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) (((long) (this.aBoolean84 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}
}
