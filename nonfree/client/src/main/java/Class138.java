import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class138 implements Interface5 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
	public int anInt3805;

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
	public boolean aBoolean280;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)J")
	@Override
	public long method3199() {
		@Pc(10) long[] local10 = Class70.aLongArray1;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local12 >>> 8 ^ local10[(int) (((long) this.anInt3808 ^ local12) & 0xFFL)];
		@Pc(44) long local44 = local10[(int) ((local27 ^ (long) (this.anInt3805 >> 8)) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local44 >>> 8 ^ local10[(int) (((long) this.anInt3805 ^ local44) & 0xFFL)];
		@Pc(76) long local76 = local59 >>> 8 ^ local10[(int) ((local59 ^ (long) (this.anInt3804 >> 24)) & 0xFFL)];
		@Pc(93) long local93 = local10[(int) ((local76 ^ (long) (this.anInt3804 >> 16)) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local10[(int) ((local93 ^ (long) (this.anInt3804 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local10[(int) ((local110 ^ (long) this.anInt3804) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local125 >>> 8 ^ local10[(int) (((long) this.anInt3809 ^ local125) & 0xFFL)];
		@Pc(157) long local157 = local10[(int) ((local140 ^ (long) (this.anInt3802 >> 24)) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local10[(int) (((long) (this.anInt3802 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local10[(int) (((long) (this.anInt3802 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local10[(int) (((long) this.anInt3802 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local10[(int) ((local206 ^ (long) this.anInt3806) & 0xFFL)];
		return local10[(int) ((local221 ^ (long) (this.aBoolean280 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!dr;I)Z")
	@Override
	public boolean method3198(@OriginalArg(0) Interface5 arg0) {
		if (!(arg0 instanceof Class138)) {
			return false;
		}
		@Pc(16) Class138 local16 = (Class138) arg0;
		if (local16.anInt3808 != this.anInt3808) {
			return false;
		} else if (this.anInt3805 != local16.anInt3805) {
			return false;
		} else if (this.anInt3804 != local16.anInt3804) {
			return false;
		} else if (local16.anInt3809 != this.anInt3809) {
			return false;
		} else if (local16.anInt3802 != this.anInt3802) {
			return false;
		} else if (local16.anInt3806 == this.anInt3806) {
			return local16.aBoolean280 == this.aBoolean280;
		} else {
			return false;
		}
	}
}
