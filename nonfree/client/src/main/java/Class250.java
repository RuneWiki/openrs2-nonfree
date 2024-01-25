import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class250 implements Interface27 {

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public int anInt5852;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
	public int anInt5853;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
	public int anInt5855;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	public int anInt5858;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!we;)Z")
	@Override
	public boolean method5130(@OriginalArg(1) Interface27 arg0) {
		if (!(arg0 instanceof Class250)) {
			return false;
		}
		@Pc(11) Class250 local11 = (Class250) arg0;
		if (this.anInt5853 != local11.anInt5853) {
			return false;
		} else if (this.anInt5855 != local11.anInt5855) {
			return false;
		} else if (this.anInt5858 != local11.anInt5858) {
			return false;
		} else if (this.anInt5856 != local11.anInt5856) {
			return false;
		} else if (local11.anInt5854 != this.anInt5854) {
			return false;
		} else if (local11.anInt5852 == this.anInt5852) {
			return this.aBoolean446 == local11.aBoolean446;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)J")
	@Override
	public long method5131() {
		@Pc(5) long[] local5 = Class219.aLongArray8;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt5853 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt5855 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt5855 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt5858 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt5858 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt5858 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt5858) & 0xFFL)];
		@Pc(140) long local140 = local120 >>> 8 ^ local5[(int) (((long) this.anInt5856 ^ local120) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt5854 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt5854 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) ((local174 ^ (long) (this.anInt5854 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) (((long) this.anInt5854 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt5852 ^ local206) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean446 ? 1 : 0) ^ local221) & 0xFFL)];
	}
}
