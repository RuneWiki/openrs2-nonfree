import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class185 implements Interface20 {

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
	public int anInt4766;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	public int anInt4770;

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	public int anInt4771;

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
	public int anInt4773;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
	public int anInt4774;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	public int anInt4775;

	static {
		new Class354("", 76);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)J")
	@Override
	public long method4044() {
		@Pc(5) long[] local5 = Class166.aLongArray10;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt4770 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt4771 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt4771) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt4775 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt4775 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt4775 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt4775 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt4774) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) ((local135 ^ (long) (this.anInt4766 >> 24)) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt4766 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(194) long local194 = local5[(int) (((long) (this.anInt4766 >> 8) ^ local169) & 0xFFL)] ^ local169 >>> 8;
		@Pc(209) long local209 = local5[(int) (((long) this.anInt4766 ^ local194) & 0xFFL)] ^ local194 >>> 8;
		@Pc(224) long local224 = local209 >>> 8 ^ local5[(int) ((local209 ^ (long) this.anInt4773) & 0xFFL)];
		return local224 >>> 8 ^ local5[(int) (((long) (this.aBoolean377 ? 1 : 0) ^ local224) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!pt;)Z")
	@Override
	public boolean method4045(@OriginalArg(1) Interface20 arg0) {
		if (!(arg0 instanceof Class185)) {
			return false;
		}
		@Pc(12) Class185 local12 = (Class185) arg0;
		if (this.anInt4770 != local12.anInt4770) {
			return false;
		} else if (this.anInt4771 != local12.anInt4771) {
			return false;
		} else if (this.anInt4775 != local12.anInt4775) {
			return false;
		} else if (this.anInt4774 != local12.anInt4774) {
			return false;
		} else if (this.anInt4766 != local12.anInt4766) {
			return false;
		} else if (this.anInt4773 == local12.anInt4773) {
			return local12.aBoolean377 == this.aBoolean377;
		} else {
			return false;
		}
	}
}
