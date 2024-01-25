import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class185 implements Interface6 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	public int anInt4585;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Z")
	public boolean aBoolean342;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
	public int anInt4591;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
	public int anInt4592;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	public int anInt4593;

	static {
		new Class15("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!hf;)Z")
	@Override
	public boolean method3655(@OriginalArg(1) Interface6 arg0) {
		if (!(arg0 instanceof Class185)) {
			return false;
		}
		@Pc(18) Class185 local18 = (Class185) arg0;
		if (local18.anInt4589 != this.anInt4589) {
			return false;
		} else if (local18.anInt4586 != this.anInt4586) {
			return false;
		} else if (local18.anInt4591 != this.anInt4591) {
			return false;
		} else if (local18.anInt4593 != this.anInt4593) {
			return false;
		} else if (local18.anInt4592 != this.anInt4592) {
			return false;
		} else if (local18.anInt4585 == this.anInt4585) {
			return local18.aBoolean342 == this.aBoolean342;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)J")
	@Override
	public long method3656() {
		@Pc(5) long[] local5 = Class8_Sub2_Sub3.aLongArray7;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt4589 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt4586 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt4586 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt4591 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt4591 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt4591 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt4591) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt4593) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt4592 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt4592 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(191) long local191 = local169 >>> 8 ^ local5[(int) (((long) (this.anInt4592 >> 8) ^ local169) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) (((long) this.anInt4592 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt4585 ^ local206) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean342 ? 1 : 0) ^ local221) & 0xFFL)];
	}
}
