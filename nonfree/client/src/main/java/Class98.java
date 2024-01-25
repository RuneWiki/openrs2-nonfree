import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class98 implements Interface2 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public int anInt2347;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)J")
	@Override
	public long method1957() {
		@Pc(5) long[] local5 = Class57_Sub2.aLongArray8;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local5[(int) (((long) this.anInt2348 ^ local12) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local5[(int) ((local27 ^ (long) (this.anInt2354 >> 8)) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local44 >>> 8 ^ local5[(int) (((long) this.anInt2354 ^ local44) & 0xFFL)];
		@Pc(76) long local76 = local5[(int) ((local59 ^ (long) (this.anInt2347 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) ((local76 ^ (long) (this.anInt2347 >> 16)) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) (((long) (this.anInt2347 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) (((long) this.anInt2347 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) ((local125 ^ (long) this.anInt2349) & 0xFFL)];
		@Pc(157) long local157 = local5[(int) ((local140 ^ (long) (this.anInt2357 >> 24)) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt2357 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt2357 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt2357 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) (((long) this.anInt2352 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean129 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!cg;B)Z")
	@Override
	public boolean method1958(@OriginalArg(0) Interface2 arg0) {
		if (!(arg0 instanceof Class98)) {
			return false;
		}
		@Pc(11) Class98 local11 = (Class98) arg0;
		if (this.anInt2348 != local11.anInt2348) {
			return false;
		} else if (local11.anInt2354 != this.anInt2354) {
			return false;
		} else if (this.anInt2347 != local11.anInt2347) {
			return false;
		} else if (local11.anInt2349 != this.anInt2349) {
			return false;
		} else if (this.anInt2357 != local11.anInt2357) {
			return false;
		} else if (this.anInt2352 == local11.anInt2352) {
			return this.aBoolean129 == local11.aBoolean129;
		} else {
			return false;
		}
	}
}
