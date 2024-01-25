import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class114 implements Interface25 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)J")
	@Override
	public long method2642() {
		@Pc(5) long[] local5 = Class223.aLongArray11;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2883 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt2884 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt2884 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt2878 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt2878 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt2878 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt2878) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt2882 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt2881 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt2881 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt2881 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local186 >>> 8 ^ local5[(int) (((long) this.anInt2881 ^ local186) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt2885 ^ local206) & 0xFFL)];
		return local5[(int) (((long) (this.aBoolean231 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!wf;I)Z")
	@Override
	public boolean method2643(@OriginalArg(0) Interface25 arg0) {
		if (!(arg0 instanceof Class114)) {
			return false;
		}
		@Pc(11) Class114 local11 = (Class114) arg0;
		if (this.anInt2883 != local11.anInt2883) {
			return false;
		} else if (local11.anInt2884 != this.anInt2884) {
			return false;
		} else if (local11.anInt2878 != this.anInt2878) {
			return false;
		} else if (local11.anInt2882 != this.anInt2882) {
			return false;
		} else if (this.anInt2881 != local11.anInt2881) {
			return false;
		} else if (local11.anInt2885 == this.anInt2885) {
			return this.aBoolean231 == local11.aBoolean231;
		} else {
			return false;
		}
	}
}
