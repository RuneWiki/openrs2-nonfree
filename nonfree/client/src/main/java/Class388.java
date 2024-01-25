import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class388 implements Interface23 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public int anInt10608;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Z")
	public boolean aBoolean806;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public int anInt10613;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt10614;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public int anInt10615;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public int anInt10616;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
	public int anInt10619;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)J")
	@Override
	public long method9179() {
		@Pc(10) long[] local10 = Class2.aLongArray28;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local12 >>> 8 ^ local10[(int) ((local12 ^ (long) this.anInt10619) & 0xFFL)];
		@Pc(44) long local44 = local10[(int) ((local27 ^ (long) (this.anInt10616 >> 8)) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local10[(int) (((long) this.anInt10616 ^ local44) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local10[(int) ((local59 ^ (long) (this.anInt10615 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local10[(int) (((long) (this.anInt10615 >> 16) ^ local76) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local10[(int) (((long) (this.anInt10615 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local110 >>> 8 ^ local10[(int) ((local110 ^ (long) this.anInt10615) & 0xFFL)];
		@Pc(140) long local140 = local10[(int) (((long) this.anInt10613 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local10[(int) (((long) (this.anInt10614 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local10[(int) (((long) (this.anInt10614 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local10[(int) ((local174 ^ (long) (this.anInt10614 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local10[(int) ((local191 ^ (long) this.anInt10614) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local10[(int) (((long) this.anInt10608 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local10[(int) (((long) (this.aBoolean806 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pj;I)Z")
	@Override
	public boolean method9180(@OriginalArg(0) Interface23 arg0) {
		if (!(arg0 instanceof Class388)) {
			return false;
		}
		@Pc(11) Class388 local11 = (Class388) arg0;
		if (local11.anInt10619 != this.anInt10619) {
			return false;
		} else if (this.anInt10616 != local11.anInt10616) {
			return false;
		} else if (this.anInt10615 != local11.anInt10615) {
			return false;
		} else if (local11.anInt10613 != this.anInt10613) {
			return false;
		} else if (local11.anInt10614 != this.anInt10614) {
			return false;
		} else if (local11.anInt10608 == this.anInt10608) {
			return local11.aBoolean806 == this.aBoolean806;
		} else {
			return false;
		}
	}
}
