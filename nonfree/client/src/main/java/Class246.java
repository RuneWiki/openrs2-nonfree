import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class246 implements Interface9 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public int anInt7054;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public int anInt7055;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public int anInt7057;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	public int anInt7059;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public int anInt7062;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
	public int anInt7063;

	static {
		new Class114(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)J")
	@Override
	public long method6048() {
		@Pc(5) long[] local5 = Class132.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt7057) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt7059 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt7059) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) ((local54 ^ (long) (this.anInt7063 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt7063 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt7063 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) (((long) this.anInt7063 ^ local105) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt7062) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt7054 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt7054 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(194) long local194 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt7054 >> 8)) & 0xFFL)];
		@Pc(209) long local209 = local194 >>> 8 ^ local5[(int) (((long) this.anInt7054 ^ local194) & 0xFFL)];
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) (((long) this.anInt7055 ^ local209) & 0xFFL)];
		return local5[(int) ((local224 ^ (long) (this.aBoolean467 ? 1 : 0)) & 0xFFL)] ^ local224 >>> 8;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!nba;I)Z")
	@Override
	public boolean method6049(@OriginalArg(0) Interface9 arg0) {
		if (!(arg0 instanceof Class246)) {
			return false;
		}
		@Pc(11) Class246 local11 = (Class246) arg0;
		if (this.anInt7057 != local11.anInt7057) {
			return false;
		} else if (this.anInt7059 != local11.anInt7059) {
			return false;
		} else if (this.anInt7063 != local11.anInt7063) {
			return false;
		} else if (local11.anInt7062 != this.anInt7062) {
			return false;
		} else if (this.anInt7054 != local11.anInt7054) {
			return false;
		} else if (local11.anInt7055 == this.anInt7055) {
			return local11.aBoolean467 == this.aBoolean467;
		} else {
			return false;
		}
	}
}
