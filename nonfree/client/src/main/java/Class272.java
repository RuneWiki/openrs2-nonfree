import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class272 implements Interface27 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public int anInt7500;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public int anInt7501;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	public int anInt7504;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public int anInt7507;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Z")
	public boolean aBoolean503;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public int anInt7508;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public int anInt7509;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)J")
	@Override
	public long method6491() {
		@Pc(5) long[] local5 = Class29_Sub8.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt7504) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt7501 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt7501 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt7509 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt7509 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt7509 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt7509) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt7500) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt7507 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt7507 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt7507 >> 8) ^ local169) & 0xFFL)];
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) (((long) this.anInt7507 ^ local186) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) ((local201 ^ (long) this.anInt7508) & 0xFFL)] ^ local201 >>> 8;
		return local5[(int) ((local221 ^ (long) (this.aBoolean503 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!wt;B)Z")
	@Override
	public boolean method6492(@OriginalArg(0) Interface27 arg0) {
		if (!(arg0 instanceof Class272)) {
			return false;
		}
		@Pc(18) Class272 local18 = (Class272) arg0;
		if (local18.anInt7504 != this.anInt7504) {
			return false;
		} else if (this.anInt7501 != local18.anInt7501) {
			return false;
		} else if (local18.anInt7509 != this.anInt7509) {
			return false;
		} else if (this.anInt7500 != local18.anInt7500) {
			return false;
		} else if (local18.anInt7507 != this.anInt7507) {
			return false;
		} else if (this.anInt7508 == local18.anInt7508) {
			return this.aBoolean503 == local18.aBoolean503;
		} else {
			return false;
		}
	}
}
