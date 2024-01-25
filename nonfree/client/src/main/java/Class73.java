import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class73 implements Interface8 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public int anInt2220;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public int anInt2221;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt2227;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public int anInt2228;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt2232;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)J")
	@Override
	public long method2205() {
		@Pc(5) long[] local5 = Class14_Sub2_Sub2.aLongArray9;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2227 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt2220 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt2220) & 0xFFL)];
		@Pc(77) long local77 = local5[(int) (((long) (this.anInt2221 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(94) long local94 = local77 >>> 8 ^ local5[(int) ((local77 ^ (long) (this.anInt2221 >> 16)) & 0xFFL)];
		@Pc(111) long local111 = local5[(int) ((local94 ^ (long) (this.anInt2221 >> 8)) & 0xFFL)] ^ local94 >>> 8;
		@Pc(126) long local126 = local5[(int) (((long) this.anInt2221 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) ((local126 ^ (long) this.anInt2228) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt2229 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt2229 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) ((local175 ^ (long) (this.anInt2229 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local5[(int) ((local192 ^ (long) this.anInt2229) & 0xFFL)] ^ local192 >>> 8;
		@Pc(222) long local222 = local207 >>> 8 ^ local5[(int) (((long) this.anInt2232 ^ local207) & 0xFFL)];
		return local222 >>> 8 ^ local5[(int) (((long) (this.aBoolean155 ? 1 : 0) ^ local222) & 0xFFL)];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vh;B)Z")
	@Override
	public boolean method2206(@OriginalArg(0) Interface8 arg0) {
		if (!(arg0 instanceof Class73)) {
			return false;
		}
		@Pc(11) Class73 local11 = (Class73) arg0;
		if (local11.anInt2227 != this.anInt2227) {
			return false;
		} else if (this.anInt2220 != local11.anInt2220) {
			return false;
		} else if (this.anInt2221 != local11.anInt2221) {
			return false;
		} else if (this.anInt2228 != local11.anInt2228) {
			return false;
		} else if (local11.anInt2229 != this.anInt2229) {
			return false;
		} else if (local11.anInt2232 == this.anInt2232) {
			return local11.aBoolean155 == this.aBoolean155;
		} else {
			return false;
		}
	}
}
