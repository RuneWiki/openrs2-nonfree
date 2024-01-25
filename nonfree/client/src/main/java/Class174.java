import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class174 implements Interface19 {

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
	public int anInt5770;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
	public int anInt5771;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
	public int anInt5773;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
	public int anInt5777;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)J")
	@Override
	public long method4711() {
		@Pc(10) long[] local10 = Class21_Sub3.aLongArray10;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) (((long) this.anInt5777 ^ local12) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local10[(int) ((local27 ^ (long) (this.anInt5770 >> 8)) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local10[(int) (((long) this.anInt5770 ^ local44) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local10[(int) (((long) (this.anInt5771 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local10[(int) (((long) (this.anInt5771 >> 16) ^ local76) & 0xFFL)];
		@Pc(110) long local110 = local10[(int) (((long) (this.anInt5771 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local110 >>> 8 ^ local10[(int) (((long) this.anInt5771 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local10[(int) (((long) this.anInt5773 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local140 >>> 8 ^ local10[(int) (((long) (this.anInt5772 >> 24) ^ local140) & 0xFFL)];
		@Pc(174) long local174 = local10[(int) (((long) (this.anInt5772 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local174 >>> 8 ^ local10[(int) (((long) (this.anInt5772 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local10[(int) (((long) this.anInt5772 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local10[(int) ((local206 ^ (long) this.anInt5768) & 0xFFL)] ^ local206 >>> 8;
		return local10[(int) ((local221 ^ (long) (this.aBoolean410 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!on;Z)Z")
	@Override
	public boolean method4712(@OriginalArg(0) Interface19 arg0) {
		if (!(arg0 instanceof Class174)) {
			return false;
		}
		@Pc(11) Class174 local11 = (Class174) arg0;
		if (this.anInt5777 != local11.anInt5777) {
			return false;
		} else if (local11.anInt5770 != this.anInt5770) {
			return false;
		} else if (local11.anInt5771 != this.anInt5771) {
			return false;
		} else if (this.anInt5773 != local11.anInt5773) {
			return false;
		} else if (this.anInt5772 != local11.anInt5772) {
			return false;
		} else if (this.anInt5768 == local11.anInt5768) {
			return local11.aBoolean410 == this.aBoolean410;
		} else {
			return false;
		}
	}
}
