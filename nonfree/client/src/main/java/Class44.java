import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class44 implements Interface12 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	public int anInt1133;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public int anInt1136;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	public int anInt1137;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public int anInt1139;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)J")
	@Override
	public long method1040() {
		@Pc(5) long[] local5 = Class217.aLongArray7;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt1139 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt1136 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt1136) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt1134 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt1134 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt1134 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt1134) & 0xFFL)];
		@Pc(135) long local135 = local5[(int) (((long) this.anInt1138 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) ((local135 ^ (long) (this.anInt1137 >> 24)) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt1137 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt1137 >> 8)) & 0xFFL)];
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) (((long) this.anInt1137 ^ local186) & 0xFFL)];
		@Pc(216) long local216 = local5[(int) ((local201 ^ (long) this.anInt1133) & 0xFFL)] ^ local201 >>> 8;
		return local216 >>> 8 ^ local5[(int) (((long) (this.aBoolean70 ? 1 : 0) ^ local216) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ws;)Z")
	@Override
	public boolean method1041(@OriginalArg(1) Interface12 arg0) {
		if (!(arg0 instanceof Class44)) {
			return false;
		}
		@Pc(11) Class44 local11 = (Class44) arg0;
		if (this.anInt1139 != local11.anInt1139) {
			return false;
		} else if (local11.anInt1136 != this.anInt1136) {
			return false;
		} else if (local11.anInt1134 != this.anInt1134) {
			return false;
		} else if (this.anInt1138 != local11.anInt1138) {
			return false;
		} else if (local11.anInt1137 != this.anInt1137) {
			return false;
		} else if (local11.anInt1133 == this.anInt1133) {
			return local11.aBoolean70 == this.aBoolean70;
		} else {
			return false;
		}
	}
}
