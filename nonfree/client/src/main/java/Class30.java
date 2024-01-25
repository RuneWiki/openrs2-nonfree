import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class30 implements Interface9 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Z")
	public boolean aBoolean30;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!wa;B)Z")
	@Override
	public boolean method520(@OriginalArg(0) Interface9 arg0) {
		if (!(arg0 instanceof Class30)) {
			return false;
		}
		@Pc(11) Class30 local11 = (Class30) arg0;
		if (local11.anInt496 != this.anInt496) {
			return false;
		} else if (this.anInt497 != local11.anInt497) {
			return false;
		} else if (this.anInt487 != local11.anInt487) {
			return false;
		} else if (local11.anInt488 != this.anInt488) {
			return false;
		} else if (local11.anInt490 != this.anInt490) {
			return false;
		} else if (this.anInt494 == local11.anInt494) {
			return this.aBoolean30 == local11.aBoolean30;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)J")
	@Override
	public long method521() {
		@Pc(5) long[] local5 = Class143.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt496) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt497 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt497 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt487 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(93) long local93 = local5[(int) ((local71 ^ (long) (this.anInt487 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) (((long) (this.anInt487 >> 8) ^ local93) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) ((local110 ^ (long) this.anInt487) & 0xFFL)];
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) ((local125 ^ (long) this.anInt488) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) (((long) (this.anInt490 >> 24) ^ local140) & 0xFFL)];
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt490 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt490 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt490 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt494) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) ((local221 ^ (long) (this.aBoolean30 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}
}
