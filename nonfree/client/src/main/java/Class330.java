import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class330 implements Interface26 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public int anInt9426;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
	public boolean aBoolean643;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public int anInt9431;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public int anInt9432;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt9433;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	public int anInt9434;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public int anInt9435;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!vm;)Z")
	@Override
	public boolean method8009(@OriginalArg(1) Interface26 arg0) {
		if (!(arg0 instanceof Class330)) {
			return false;
		}
		@Pc(17) Class330 local17 = (Class330) arg0;
		if (this.anInt9431 != local17.anInt9431) {
			return false;
		} else if (this.anInt9435 != local17.anInt9435) {
			return false;
		} else if (this.anInt9432 != local17.anInt9432) {
			return false;
		} else if (this.anInt9426 != local17.anInt9426) {
			return false;
		} else if (local17.anInt9433 != this.anInt9433) {
			return false;
		} else if (this.anInt9434 == local17.anInt9434) {
			return this.aBoolean643 == local17.aBoolean643;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)J")
	@Override
	public long method8008() {
		@Pc(5) long[] local5 = Class337.aLongArray15;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt9431) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt9435 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt9435 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt9432 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt9432 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt9432 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt9432) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt9426 ^ local120) & 0xFFL)];
		@Pc(157) long local157 = local5[(int) ((local135 ^ (long) (this.anInt9433 >> 24)) & 0xFFL)] ^ local135 >>> 8;
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt9433 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) (((long) (this.anInt9433 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) ((local191 ^ (long) this.anInt9433) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) ((local206 ^ (long) this.anInt9434) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean643 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}
}
