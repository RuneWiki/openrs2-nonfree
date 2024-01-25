import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class289 implements Interface11 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public int anInt7760;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	public int anInt7762;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public int anInt7763;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public int anInt7764;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public int anInt7765;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public int anInt7766;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!hg;)Z")
	@Override
	public boolean method6429(@OriginalArg(1) Interface11 arg0) {
		if (!(arg0 instanceof Class289)) {
			return false;
		}
		@Pc(11) Class289 local11 = (Class289) arg0;
		if (this.anInt7764 != local11.anInt7764) {
			return false;
		} else if (local11.anInt7763 != this.anInt7763) {
			return false;
		} else if (local11.anInt7760 != this.anInt7760) {
			return false;
		} else if (local11.anInt7765 != this.anInt7765) {
			return false;
		} else if (this.anInt7766 != local11.anInt7766) {
			return false;
		} else if (local11.anInt7762 == this.anInt7762) {
			return local11.aBoolean544 == this.aBoolean544;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)J")
	@Override
	public long method6430() {
		@Pc(5) long[] local5 = Class219.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt7764 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt7763 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt7763) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt7760 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt7760 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(110) long local110 = local5[(int) ((local88 ^ (long) (this.anInt7760 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(125) long local125 = local5[(int) ((local110 ^ (long) this.anInt7760) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) ((local125 ^ (long) this.anInt7765) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt7766 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt7766 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) ((local174 ^ (long) (this.anInt7766 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt7766) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt7762) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) ((local221 ^ (long) (this.aBoolean544 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}
}
