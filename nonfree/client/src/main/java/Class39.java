import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class39 implements Interface3 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public int anInt966;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	public int anInt969;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!fr;B)Z")
	@Override
	public boolean method919(@OriginalArg(0) Interface3 arg0) {
		if (!(arg0 instanceof Class39)) {
			return false;
		}
		@Pc(16) Class39 local16 = (Class39) arg0;
		if (local16.anInt968 != this.anInt968) {
			return false;
		} else if (this.anInt966 != local16.anInt966) {
			return false;
		} else if (this.anInt969 != local16.anInt969) {
			return false;
		} else if (local16.anInt971 != this.anInt971) {
			return false;
		} else if (this.anInt967 != local16.anInt967) {
			return false;
		} else if (local16.anInt964 == this.anInt964) {
			return local16.aBoolean107 == this.aBoolean107;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)J")
	@Override
	public long method920() {
		@Pc(5) long[] local5 = Class109.aLongArray6;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt968) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt966 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt966) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt969 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt969 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt969 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt969) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt971) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt967 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) ((local152 ^ (long) (this.anInt967 >> 16)) & 0xFFL)];
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt967 >> 8)) & 0xFFL)];
		@Pc(209) long local209 = local5[(int) ((local186 ^ (long) this.anInt967) & 0xFFL)] ^ local186 >>> 8;
		@Pc(224) long local224 = local5[(int) ((local209 ^ (long) this.anInt964) & 0xFFL)] ^ local209 >>> 8;
		return local224 >>> 8 ^ local5[(int) (((long) (this.aBoolean107 ? 1 : 0) ^ local224) & 0xFFL)];
	}
}
