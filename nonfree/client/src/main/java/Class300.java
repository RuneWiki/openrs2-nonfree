import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class300 implements Interface3 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
	public int anInt8247;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public int anInt8248;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	public int anInt8250;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
	public int anInt8252;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
	public int anInt8253;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
	public int anInt8254;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)J")
	@Override
	public long method6873() {
		@Pc(5) long[] local5 = Class18.aLongArray2;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt8253) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt8248 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt8248) & 0xFFL)] ^ local39 >>> 8;
		@Pc(76) long local76 = local5[(int) ((local54 ^ (long) (this.anInt8250 >> 24)) & 0xFFL)] ^ local54 >>> 8;
		@Pc(93) long local93 = local5[(int) (((long) (this.anInt8250 >> 16) ^ local76) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local5[(int) (((long) (this.anInt8250 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local5[(int) (((long) this.anInt8250 ^ local110) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) (((long) this.anInt8252 ^ local125) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt8247 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) (((long) (this.anInt8247 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt8247 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt8247) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt8254) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) (((long) (this.aBoolean595 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLclient!dc;)Z")
	@Override
	public boolean method6872(@OriginalArg(1) Interface3 arg0) {
		if (!(arg0 instanceof Class300)) {
			return false;
		}
		@Pc(11) Class300 local11 = (Class300) arg0;
		if (this.anInt8253 != local11.anInt8253) {
			return false;
		} else if (local11.anInt8248 != this.anInt8248) {
			return false;
		} else if (this.anInt8250 != local11.anInt8250) {
			return false;
		} else if (this.anInt8252 != local11.anInt8252) {
			return false;
		} else if (local11.anInt8247 != this.anInt8247) {
			return false;
		} else if (local11.anInt8254 == this.anInt8254) {
			return this.aBoolean595 == local11.aBoolean595;
		} else {
			return false;
		}
	}
}
