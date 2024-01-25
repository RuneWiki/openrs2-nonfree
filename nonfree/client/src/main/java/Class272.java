import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class272 implements Interface12 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	public int anInt7532;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public int anInt7534;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public int anInt7535;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public int anInt7537;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public int anInt7539;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public int anInt7540;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
	public boolean aBoolean512;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J")
	@Override
	public long method5798() {
		@Pc(5) long[] local5 = Class22_Sub6.aLongArray6;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt7537 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt7532 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) (((long) this.anInt7532 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(77) long local77 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt7535 >> 24) ^ local54) & 0xFFL)];
		@Pc(94) long local94 = local77 >>> 8 ^ local5[(int) (((long) (this.anInt7535 >> 16) ^ local77) & 0xFFL)];
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) (((long) (this.anInt7535 >> 8) ^ local94) & 0xFFL)];
		@Pc(126) long local126 = local5[(int) (((long) this.anInt7535 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) (((long) this.anInt7534 ^ local126) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) (((long) (this.anInt7540 >> 24) ^ local141) & 0xFFL)];
		@Pc(175) long local175 = local158 >>> 8 ^ local5[(int) (((long) (this.anInt7540 >> 16) ^ local158) & 0xFFL)];
		@Pc(192) long local192 = local175 >>> 8 ^ local5[(int) (((long) (this.anInt7540 >> 8) ^ local175) & 0xFFL)];
		@Pc(207) long local207 = local5[(int) (((long) this.anInt7540 ^ local192) & 0xFFL)] ^ local192 >>> 8;
		@Pc(222) long local222 = local5[(int) ((local207 ^ (long) this.anInt7539) & 0xFFL)] ^ local207 >>> 8;
		return local5[(int) (((long) (this.aBoolean512 ? 1 : 0) ^ local222) & 0xFFL)] ^ local222 >>> 8;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!rb;I)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Interface12 arg0) {
		if (!(arg0 instanceof Class272)) {
			return false;
		}
		@Pc(17) Class272 local17 = (Class272) arg0;
		if (this.anInt7537 != local17.anInt7537) {
			return false;
		} else if (local17.anInt7532 != this.anInt7532) {
			return false;
		} else if (this.anInt7535 != local17.anInt7535) {
			return false;
		} else if (local17.anInt7534 != this.anInt7534) {
			return false;
		} else if (local17.anInt7540 != this.anInt7540) {
			return false;
		} else if (local17.anInt7539 == this.anInt7539) {
			return local17.aBoolean512 == this.aBoolean512;
		} else {
			return false;
		}
	}
}
