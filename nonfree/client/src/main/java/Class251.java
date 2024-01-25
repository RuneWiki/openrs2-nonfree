import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class251 implements Interface10 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public int anInt7096;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public int anInt7097;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public int anInt7098;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public int anInt7099;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
	public boolean aBoolean508;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public int anInt7100;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	public int anInt7104;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!vl;)Z")
	@Override
	public boolean method6111(@OriginalArg(1) Interface10 arg0) {
		if (!(arg0 instanceof Class251)) {
			return false;
		}
		@Pc(11) Class251 local11 = (Class251) arg0;
		if (this.anInt7097 != local11.anInt7097) {
			return false;
		} else if (this.anInt7096 != local11.anInt7096) {
			return false;
		} else if (local11.anInt7098 != this.anInt7098) {
			return false;
		} else if (this.anInt7104 != local11.anInt7104) {
			return false;
		} else if (this.anInt7100 != local11.anInt7100) {
			return false;
		} else if (this.anInt7099 == local11.anInt7099) {
			return this.aBoolean508 == local11.aBoolean508;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)J")
	@Override
	public long method6110() {
		@Pc(5) long[] local5 = Class70.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt7097) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt7096 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt7096) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt7098 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt7098 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt7098 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) (((long) this.anInt7098 ^ local105) & 0xFFL)];
		@Pc(135) long local135 = local5[(int) (((long) this.anInt7104 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt7100 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt7100 >> 16) ^ local152) & 0xFFL)];
		@Pc(186) long local186 = local5[(int) ((local169 ^ (long) (this.anInt7100 >> 8)) & 0xFFL)] ^ local169 >>> 8;
		@Pc(207) long local207 = local5[(int) (((long) this.anInt7100 ^ local186) & 0xFFL)] ^ local186 >>> 8;
		@Pc(222) long local222 = local5[(int) (((long) this.anInt7099 ^ local207) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local5[(int) ((local222 ^ (long) (this.aBoolean508 ? 1 : 0)) & 0xFFL)];
	}
}
