import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class234 implements Interface10 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public int anInt6506;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public int anInt6508;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public int anInt6510;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	public int anInt6512;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Z")
	public boolean aBoolean460;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public int anInt6515;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!kw;)Z")
	@Override
	public boolean method5251(@OriginalArg(1) Interface10 arg0) {
		if (!(arg0 instanceof Class234)) {
			return false;
		}
		@Pc(11) Class234 local11 = (Class234) arg0;
		if (local11.anInt6510 != this.anInt6510) {
			return false;
		} else if (this.anInt6508 != local11.anInt6508) {
			return false;
		} else if (this.anInt6512 != local11.anInt6512) {
			return false;
		} else if (this.anInt6511 != local11.anInt6511) {
			return false;
		} else if (local11.anInt6515 != this.anInt6515) {
			return false;
		} else if (local11.anInt6506 == this.anInt6506) {
			return this.aBoolean460 == local11.aBoolean460;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)J")
	@Override
	public long method5252() {
		@Pc(5) long[] local5 = Class3_Sub6_Sub8.aLongArray2;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt6510) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt6508 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt6508) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt6512 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt6512 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt6512 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt6512) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt6511 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt6515 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt6515 >> 16) ^ local152) & 0xFFL)];
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt6515 >> 8) ^ local169) & 0xFFL)];
		@Pc(201) long local201 = local5[(int) ((local186 ^ (long) this.anInt6515) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local5[(int) ((local201 ^ (long) this.anInt6506) & 0xFFL)] ^ local201 >>> 8;
		return local216 >>> 8 ^ local5[(int) (((long) (this.aBoolean460 ? 1 : 0) ^ local216) & 0xFFL)];
	}
}
