import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class225 implements Interface26 {

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
	public int anInt7360;

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
	public int anInt7361;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
	public int anInt7365;

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "Z")
	public boolean aBoolean538;

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "I")
	public int anInt7366;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
	public int anInt7367;

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
	public int anInt7368;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)J")
	@Override
	public long method6252() {
		@Pc(5) long[] local5 = Class2_Sub3_Sub28.aLongArray17;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt7366) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt7367 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt7367) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt7365 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt7365 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt7365 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt7365) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt7368 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) ((local135 ^ (long) (this.anInt7361 >> 24)) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) ((local152 ^ (long) (this.anInt7361 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local5[(int) ((local169 ^ (long) (this.anInt7361 >> 8)) & 0xFFL)] ^ local169 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt7361 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt7360) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean538 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILclient!we;)Z")
	@Override
	public boolean method6253(@OriginalArg(1) Interface26 arg0) {
		if (!(arg0 instanceof Class225)) {
			return false;
		}
		@Pc(11) Class225 local11 = (Class225) arg0;
		if (this.anInt7366 != local11.anInt7366) {
			return false;
		} else if (this.anInt7367 != local11.anInt7367) {
			return false;
		} else if (this.anInt7365 != local11.anInt7365) {
			return false;
		} else if (local11.anInt7368 != this.anInt7368) {
			return false;
		} else if (this.anInt7361 != local11.anInt7361) {
			return false;
		} else if (this.anInt7360 == local11.anInt7360) {
			return local11.aBoolean538 == this.aBoolean538;
		} else {
			return false;
		}
	}
}
