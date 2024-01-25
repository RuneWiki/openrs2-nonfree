import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class40 implements Interface10 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public int anInt1007;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	public int anInt1010;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ts;I)Z")
	@Override
	public boolean method846(@OriginalArg(0) Interface10 arg0) {
		if (!(arg0 instanceof Class40)) {
			return false;
		}
		@Pc(11) Class40 local11 = (Class40) arg0;
		if (this.anInt1007 != local11.anInt1007) {
			return false;
		} else if (local11.anInt1016 != this.anInt1016) {
			return false;
		} else if (this.anInt1015 != local11.anInt1015) {
			return false;
		} else if (this.anInt1010 != local11.anInt1010) {
			return false;
		} else if (local11.anInt1014 != this.anInt1014) {
			return false;
		} else if (this.anInt1011 == local11.anInt1011) {
			return local11.aBoolean80 == this.aBoolean80;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J")
	@Override
	public long method847() {
		@Pc(5) long[] local5 = Class209.aLongArray7;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local12 >>> 8 ^ local5[(int) ((local12 ^ (long) this.anInt1007) & 0xFFL)];
		@Pc(44) long local44 = local5[(int) (((long) (this.anInt1016 >> 8) ^ local27) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local5[(int) ((local44 ^ (long) this.anInt1016) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local5[(int) ((local59 ^ (long) (this.anInt1015 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) ((local76 ^ (long) (this.anInt1015 >> 16)) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) ((local93 ^ (long) (this.anInt1015 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local5[(int) ((local110 ^ (long) this.anInt1015) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt1010) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt1014 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt1014 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt1014 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) ((local191 ^ (long) this.anInt1014) & 0xFFL)];
		@Pc(221) long local221 = local5[(int) ((local206 ^ (long) this.anInt1011) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean80 ? 1 : 0) ^ local221) & 0xFFL)];
	}
}
