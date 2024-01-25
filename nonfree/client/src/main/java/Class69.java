import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class69 implements Interface21 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public int anInt1438;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	public int anInt1445;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)J")
	@Override
	public long method1340() {
		@Pc(5) long[] local5 = Class7.aLongArray3;
		@Pc(13) long local13 = -1L;
		@Pc(28) long local28 = local13 >>> 8 ^ local5[(int) ((local13 ^ (long) this.anInt1438) & 0xFFL)];
		@Pc(45) long local45 = local28 >>> 8 ^ local5[(int) (((long) (this.anInt1445 >> 8) ^ local28) & 0xFFL)];
		@Pc(60) long local60 = local5[(int) (((long) this.anInt1445 ^ local45) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local60 >>> 8 ^ local5[(int) (((long) (this.anInt1448 >> 24) ^ local60) & 0xFFL)];
		@Pc(94) long local94 = local77 >>> 8 ^ local5[(int) ((local77 ^ (long) (this.anInt1448 >> 16)) & 0xFFL)];
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) (((long) (this.anInt1448 >> 8) ^ local94) & 0xFFL)];
		@Pc(126) long local126 = local111 >>> 8 ^ local5[(int) ((local111 ^ (long) this.anInt1448) & 0xFFL)];
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) ((local126 ^ (long) this.anInt1440) & 0xFFL)];
		@Pc(158) long local158 = local5[(int) (((long) (this.anInt1441 >> 24) ^ local141) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt1441 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) ((local175 ^ (long) (this.anInt1441 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) (((long) this.anInt1441 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local5[(int) (((long) this.anInt1447 ^ local207) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean121 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!nba;Z)Z")
	@Override
	public boolean method1339(@OriginalArg(0) Interface21 arg0) {
		if (!(arg0 instanceof Class69)) {
			return false;
		}
		@Pc(22) Class69 local22 = (Class69) arg0;
		if (local22.anInt1438 != this.anInt1438) {
			return false;
		} else if (local22.anInt1445 != this.anInt1445) {
			return false;
		} else if (local22.anInt1448 != this.anInt1448) {
			return false;
		} else if (local22.anInt1440 != this.anInt1440) {
			return false;
		} else if (local22.anInt1441 != this.anInt1441) {
			return false;
		} else if (local22.anInt1447 == this.anInt1447) {
			return this.aBoolean121 == local22.aBoolean121;
		} else {
			return false;
		}
	}
}
