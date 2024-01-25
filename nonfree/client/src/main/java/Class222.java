import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class222 implements Interface9 {

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public int anInt6872;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
	public boolean aBoolean609;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	public int anInt6873;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public int anInt6877;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public int anInt6879;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public int anInt6881;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ur;I)Z")
	@Override
	public boolean method5745(@OriginalArg(0) Interface9 arg0) {
		if (!(arg0 instanceof Class222)) {
			return false;
		}
		@Pc(11) Class222 local11 = (Class222) arg0;
		if (local11.anInt6877 != this.anInt6877) {
			return false;
		} else if (this.anInt6881 != local11.anInt6881) {
			return false;
		} else if (local11.anInt6872 != this.anInt6872) {
			return false;
		} else if (this.anInt6879 != local11.anInt6879) {
			return false;
		} else if (this.anInt6878 != local11.anInt6878) {
			return false;
		} else if (local11.anInt6873 == this.anInt6873) {
			return this.aBoolean609 == local11.aBoolean609;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)J")
	@Override
	public long method5746() {
		@Pc(10) long[] local10 = Class117.aLongArray5;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) ((local12 ^ (long) this.anInt6877) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local10[(int) (((long) (this.anInt6881 >> 8) ^ local27) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local44 >>> 8 ^ local10[(int) ((local44 ^ (long) this.anInt6881) & 0xFFL)];
		@Pc(76) long local76 = local10[(int) (((long) (this.anInt6872 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local10[(int) ((local76 ^ (long) (this.anInt6872 >> 16)) & 0xFFL)];
		@Pc(110) long local110 = local10[(int) ((local93 ^ (long) (this.anInt6872 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local10[(int) (((long) this.anInt6872 ^ local110) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local125 >>> 8 ^ local10[(int) (((long) this.anInt6879 ^ local125) & 0xFFL)];
		@Pc(157) long local157 = local10[(int) (((long) (this.anInt6878 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local10[(int) (((long) (this.anInt6878 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local10[(int) ((local174 ^ (long) (this.anInt6878 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local10[(int) (((long) this.anInt6878 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local10[(int) ((local206 ^ (long) this.anInt6873) & 0xFFL)];
		return local221 >>> 8 ^ local10[(int) ((local221 ^ (long) (this.aBoolean609 ? 1 : 0)) & 0xFFL)];
	}
}
