import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class290 implements Interface18 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public int anInt7802;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public int anInt7804;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public int anInt7805;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public int anInt7808;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public int anInt7809;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	public int anInt7811;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!oga;B)Z")
	@Override
	public boolean method6227(@OriginalArg(0) Interface18 arg0) {
		if (!(arg0 instanceof Class290)) {
			return false;
		}
		@Pc(11) Class290 local11 = (Class290) arg0;
		if (local11.anInt7809 != this.anInt7809) {
			return false;
		} else if (this.anInt7808 != local11.anInt7808) {
			return false;
		} else if (this.anInt7802 != local11.anInt7802) {
			return false;
		} else if (local11.anInt7804 != this.anInt7804) {
			return false;
		} else if (local11.anInt7805 != this.anInt7805) {
			return false;
		} else if (local11.anInt7811 == this.anInt7811) {
			return local11.aBoolean589 == this.aBoolean589;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)J")
	@Override
	public long method6226() {
		@Pc(5) long[] local5 = Class209_Sub2_Sub2.aLongArray17;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt7809 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt7808 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt7808 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt7802 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt7802 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt7802 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt7802 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt7804) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt7805 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt7805 >> 16) ^ local152) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) ((local174 ^ (long) (this.anInt7805 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt7805 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) ((local206 ^ (long) this.anInt7811) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean589 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}
}
