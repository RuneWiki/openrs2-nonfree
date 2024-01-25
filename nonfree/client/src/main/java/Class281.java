import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class281 implements Interface4 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public int anInt7892;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
	public boolean aBoolean567;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public int anInt7895;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public int anInt7897;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public int anInt7898;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	public int anInt7899;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public int anInt7900;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!cr;I)Z")
	@Override
	public boolean method6839(@OriginalArg(0) Interface4 arg0) {
		if (!(arg0 instanceof Class281)) {
			return false;
		}
		@Pc(11) Class281 local11 = (Class281) arg0;
		if (local11.anInt7900 != this.anInt7900) {
			return false;
		} else if (local11.anInt7897 != this.anInt7897) {
			return false;
		} else if (this.anInt7899 != local11.anInt7899) {
			return false;
		} else if (local11.anInt7895 != this.anInt7895) {
			return false;
		} else if (local11.anInt7892 != this.anInt7892) {
			return false;
		} else if (local11.anInt7898 == this.anInt7898) {
			return this.aBoolean567 == local11.aBoolean567;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)J")
	@Override
	public long method6840() {
		@Pc(5) long[] local5 = Class60.aLongArray16;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local12 >>> 8 ^ local5[(int) (((long) this.anInt7900 ^ local12) & 0xFFL)];
		@Pc(44) long local44 = local5[(int) (((long) (this.anInt7897 >> 8) ^ local27) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local5[(int) ((local44 ^ (long) this.anInt7897) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local5[(int) (((long) (this.anInt7899 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local5[(int) (((long) (this.anInt7899 >> 16) ^ local76) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) ((local93 ^ (long) (this.anInt7899 >> 8)) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) (((long) this.anInt7899 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) ((local125 ^ (long) this.anInt7895) & 0xFFL)];
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt7892 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) ((local157 ^ (long) (this.anInt7892 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt7892 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) (((long) this.anInt7892 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt7898 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) (((long) (this.aBoolean567 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}
}
