import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class310 implements Interface22 {

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	public int anInt8478;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
	public int anInt8480;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
	public int anInt8481;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
	public int anInt8484;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
	public int anInt8485;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	public int anInt8486;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)J")
	@Override
	public long method7393() {
		@Pc(5) long[] local5 = Class20.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt8481 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt8484 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt8484 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt8478 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt8478 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt8478 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt8478) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt8480) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt8486 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt8486 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local5[(int) (((long) (this.anInt8486 >> 8) ^ local169) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local5[(int) (((long) this.anInt8486 ^ local186) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local5[(int) (((long) this.anInt8485 ^ local201) & 0xFFL)] ^ local201 >>> 8;
		return local5[(int) (((long) (this.aBoolean650 ? 1 : 0) ^ local216) & 0xFFL)] ^ local216 >>> 8;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!rc;)Z")
	@Override
	public boolean method7392(@OriginalArg(1) Interface22 arg0) {
		if (!(arg0 instanceof Class310)) {
			return false;
		}
		@Pc(18) Class310 local18 = (Class310) arg0;
		if (this.anInt8481 != local18.anInt8481) {
			return false;
		} else if (this.anInt8484 != local18.anInt8484) {
			return false;
		} else if (this.anInt8478 != local18.anInt8478) {
			return false;
		} else if (this.anInt8480 != local18.anInt8480) {
			return false;
		} else if (this.anInt8486 != local18.anInt8486) {
			return false;
		} else if (local18.anInt8485 == this.anInt8485) {
			return local18.aBoolean650 == this.aBoolean650;
		} else {
			return false;
		}
	}
}
