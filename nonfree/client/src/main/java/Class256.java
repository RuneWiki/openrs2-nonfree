import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class256 implements Interface8 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public int anInt7094;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt7095;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public int anInt7097;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public int anInt7098;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public int anInt7099;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public int anInt7100;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!gj;I)Z")
	@Override
	public boolean method5947(@OriginalArg(0) Interface8 arg0) {
		if (!(arg0 instanceof Class256)) {
			return false;
		}
		@Pc(11) Class256 local11 = (Class256) arg0;
		if (this.anInt7097 != local11.anInt7097) {
			return false;
		} else if (this.anInt7100 != local11.anInt7100) {
			return false;
		} else if (this.anInt7099 != local11.anInt7099) {
			return false;
		} else if (this.anInt7095 != local11.anInt7095) {
			return false;
		} else if (this.anInt7098 != local11.anInt7098) {
			return false;
		} else if (local11.anInt7094 == this.anInt7094) {
			return this.aBoolean552 == local11.aBoolean552;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)J")
	@Override
	public long method5948() {
		@Pc(5) long[] local5 = Class223.aLongArray8;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt7097 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt7100 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt7100) & 0xFFL)];
		@Pc(76) long local76 = local5[(int) (((long) (this.anInt7099 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) (((long) (this.anInt7099 >> 16) ^ local76) & 0xFFL)];
		@Pc(110) long local110 = local93 >>> 8 ^ local5[(int) ((local93 ^ (long) (this.anInt7099 >> 8)) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) ((local110 ^ (long) this.anInt7099) & 0xFFL)];
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt7095) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt7098 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local5[(int) (((long) (this.anInt7098 >> 16) ^ local157) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt7098 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt7098 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt7094 ^ local206) & 0xFFL)];
		return local5[(int) ((local221 ^ (long) (this.aBoolean552 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}
}
