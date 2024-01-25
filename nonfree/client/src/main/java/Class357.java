import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class357 implements Interface27 {

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public int anInt9594;

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
	public int anInt9595;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
	public int anInt9596;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
	public int anInt9598;

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
	public int anInt9599;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
	public int anInt9601;

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "Z")
	public boolean aBoolean702;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!wf;I)Z")
	@Override
	public boolean method8036(@OriginalArg(0) Interface27 arg0) {
		if (!(arg0 instanceof Class357)) {
			return false;
		}
		@Pc(11) Class357 local11 = (Class357) arg0;
		if (this.anInt9595 != local11.anInt9595) {
			return false;
		} else if (this.anInt9601 != local11.anInt9601) {
			return false;
		} else if (this.anInt9598 != local11.anInt9598) {
			return false;
		} else if (local11.anInt9599 != this.anInt9599) {
			return false;
		} else if (this.anInt9596 != local11.anInt9596) {
			return false;
		} else if (this.anInt9594 == local11.anInt9594) {
			return this.aBoolean702 == local11.aBoolean702;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)J")
	@Override
	public long method8035() {
		@Pc(5) long[] local5 = Class250.aLongArray28;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt9595 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt9601 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt9601) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt9598 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt9598 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt9598 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt9598) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt9599) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt9596 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(174) long local174 = local152 >>> 8 ^ local5[(int) ((local152 ^ (long) (this.anInt9596 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local5[(int) (((long) (this.anInt9596 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt9596 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) (((long) this.anInt9594 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) ((local221 ^ (long) (this.aBoolean702 ? 1 : 0)) & 0xFFL)];
	}
}
