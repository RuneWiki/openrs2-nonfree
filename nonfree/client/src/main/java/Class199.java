import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class199 implements Interface23 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	public int anInt6098;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	public int anInt6102;

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
	public int anInt6104;

	@OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
	public int anInt6105;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
	public int anInt6106;

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)J")
	@Override
	public long method4951() {
		@Pc(5) long[] local5 = Class5.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(27) long local27 = local5[(int) (((long) this.anInt6098 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(44) long local44 = local27 >>> 8 ^ local5[(int) (((long) (this.anInt6106 >> 8) ^ local27) & 0xFFL)];
		@Pc(59) long local59 = local44 >>> 8 ^ local5[(int) (((long) this.anInt6106 ^ local44) & 0xFFL)];
		@Pc(76) long local76 = local5[(int) ((local59 ^ (long) (this.anInt6104 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) (((long) (this.anInt6104 >> 16) ^ local76) & 0xFFL)];
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) (((long) (this.anInt6104 >> 8) ^ local93) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) (((long) this.anInt6104 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local5[(int) (((long) this.anInt6102 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt6108 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local5[(int) (((long) (this.anInt6108 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt6108 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt6108) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt6105 ^ local206) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) ((local221 ^ (long) (this.aBoolean441 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!wea;I)Z")
	@Override
	public boolean method4950(@OriginalArg(0) Interface23 arg0) {
		if (!(arg0 instanceof Class199)) {
			return false;
		}
		@Pc(16) Class199 local16 = (Class199) arg0;
		if (this.anInt6098 != local16.anInt6098) {
			return false;
		} else if (local16.anInt6106 != this.anInt6106) {
			return false;
		} else if (this.anInt6104 != local16.anInt6104) {
			return false;
		} else if (local16.anInt6102 != this.anInt6102) {
			return false;
		} else if (this.anInt6108 != local16.anInt6108) {
			return false;
		} else if (this.anInt6105 == local16.anInt6105) {
			return local16.aBoolean441 == this.aBoolean441;
		} else {
			return false;
		}
	}
}
