import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class202 implements Interface5 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	public int anInt5936;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public int anInt5937;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public int anInt5940;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	public int anInt5941;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	public int anInt5942;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!mc;B)Z")
	@Override
	public boolean method5365(@OriginalArg(0) Interface5 arg0) {
		if (!(arg0 instanceof Class202)) {
			return false;
		}
		@Pc(11) Class202 local11 = (Class202) arg0;
		if (this.anInt5942 != local11.anInt5942) {
			return false;
		} else if (local11.anInt5937 != this.anInt5937) {
			return false;
		} else if (this.anInt5941 != local11.anInt5941) {
			return false;
		} else if (local11.anInt5936 != this.anInt5936) {
			return false;
		} else if (this.anInt5940 != local11.anInt5940) {
			return false;
		} else if (local11.anInt5943 == this.anInt5943) {
			return this.aBoolean398 == local11.aBoolean398;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)J")
	@Override
	public long method5366() {
		@Pc(5) long[] local5 = Class6_Sub16.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt5942 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt5937 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt5937 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt5941 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(94) long local94 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt5941 >> 16)) & 0xFFL)];
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) ((local94 ^ (long) (this.anInt5941 >> 8)) & 0xFFL)];
		@Pc(126) long local126 = local111 >>> 8 ^ local5[(int) (((long) this.anInt5941 ^ local111) & 0xFFL)];
		@Pc(141) long local141 = local5[(int) (((long) this.anInt5936 ^ local126) & 0xFFL)] ^ local126 >>> 8;
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) (((long) (this.anInt5940 >> 24) ^ local141) & 0xFFL)];
		@Pc(175) long local175 = local158 >>> 8 ^ local5[(int) ((local158 ^ (long) (this.anInt5940 >> 16)) & 0xFFL)];
		@Pc(192) long local192 = local5[(int) (((long) (this.anInt5940 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) ((local192 ^ (long) this.anInt5940) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) (((long) this.anInt5943 ^ local207) & 0xFFL)];
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean398 ? 1 : 0)) & 0xFFL)];
	}
}
