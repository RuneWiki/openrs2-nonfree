import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class242 implements Interface1 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public int anInt6869;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	public int anInt6874;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt6879;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!bg;)Z")
	@Override
	public boolean method5432(@OriginalArg(1) Interface1 arg0) {
		if (!(arg0 instanceof Class242)) {
			return false;
		}
		@Pc(11) Class242 local11 = (Class242) arg0;
		if (this.anInt6879 != local11.anInt6879) {
			return false;
		} else if (local11.anInt6876 != this.anInt6876) {
			return false;
		} else if (this.anInt6875 != local11.anInt6875) {
			return false;
		} else if (this.anInt6869 != local11.anInt6869) {
			return false;
		} else if (local11.anInt6874 != this.anInt6874) {
			return false;
		} else if (local11.anInt6880 == this.anInt6880) {
			return local11.aBoolean461 == this.aBoolean461;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J")
	@Override
	public long method5433() {
		@Pc(5) long[] local5 = Class5_Sub2.aLongArray38;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt6879 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt6876 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt6876) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt6875 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(94) long local94 = local5[(int) ((local71 ^ (long) (this.anInt6875 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(111) long local111 = local5[(int) ((local94 ^ (long) (this.anInt6875 >> 8)) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local5[(int) (((long) this.anInt6875 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local5[(int) (((long) this.anInt6869 ^ local126) & 0xFFL)] ^ local126 >>> 8;
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt6874 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local158 >>> 8 ^ local5[(int) (((long) (this.anInt6874 >> 16) ^ local158) & 0xFFL)];
		@Pc(192) long local192 = local5[(int) (((long) (this.anInt6874 >> 8) ^ local175) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) ((local192 ^ (long) this.anInt6874) & 0xFFL)];
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) (((long) this.anInt6880 ^ local207) & 0xFFL)];
		return local5[(int) ((local222 ^ (long) (this.aBoolean461 ? 1 : 0)) & 0xFFL)] ^ local222 >>> 8;
	}
}
