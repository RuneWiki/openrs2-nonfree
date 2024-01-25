import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class81 implements Interface7 {

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
	public int anInt2632;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
	public int anInt2636;

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)J")
	@Override
	public long method2317() {
		@Pc(5) long[] local5 = Class64.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt2636) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt2635 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt2635) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt2630 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt2630 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt2630 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt2630) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt2634 ^ local120) & 0xFFL)];
		@Pc(157) long local157 = local135 >>> 8 ^ local5[(int) (((long) (this.anInt2631 >> 24) ^ local135) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) (((long) (this.anInt2631 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local5[(int) (((long) (this.anInt2631 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt2631) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt2632) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean205 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!gj;I)Z")
	@Override
	public boolean method2318(@OriginalArg(0) Interface7 arg0) {
		if (!(arg0 instanceof Class81)) {
			return false;
		}
		@Pc(11) Class81 local11 = (Class81) arg0;
		if (local11.anInt2636 != this.anInt2636) {
			return false;
		} else if (this.anInt2635 != local11.anInt2635) {
			return false;
		} else if (this.anInt2630 != local11.anInt2630) {
			return false;
		} else if (this.anInt2634 != local11.anInt2634) {
			return false;
		} else if (this.anInt2631 != local11.anInt2631) {
			return false;
		} else if (local11.anInt2632 == this.anInt2632) {
			return this.aBoolean205 == local11.aBoolean205;
		} else {
			return false;
		}
	}
}
