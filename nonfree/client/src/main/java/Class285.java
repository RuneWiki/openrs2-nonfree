import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class285 implements Interface20 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public int anInt8237;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt8238;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public int anInt8239;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt8243;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public int anInt8244;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public int anInt8245;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Z")
	public boolean aBoolean591;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)J")
	@Override
	public long method7005() {
		@Pc(5) long[] local5 = Class153_Sub4.aLongArray22;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt8244) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt8245 >> 8) ^ local22) & 0xFFL)];
		@Pc(59) long local59 = local5[(int) (((long) this.anInt8245 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(76) long local76 = local5[(int) (((long) (this.anInt8237 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) (((long) (this.anInt8237 >> 16) ^ local76) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) ((local93 ^ (long) (this.anInt8237 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local110 >>> 8 ^ local5[(int) ((local110 ^ (long) this.anInt8237) & 0xFFL)];
		@Pc(140) long local140 = local125 >>> 8 ^ local5[(int) ((local125 ^ (long) this.anInt8243) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt8238 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) (((long) (this.anInt8238 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) (((long) (this.anInt8238 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt8238) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt8239 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local5[(int) (((long) (this.aBoolean591 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!pha;)Z")
	@Override
	public boolean method7006(@OriginalArg(1) Interface20 arg0) {
		if (!(arg0 instanceof Class285)) {
			return false;
		}
		@Pc(19) Class285 local19 = (Class285) arg0;
		if (this.anInt8244 != local19.anInt8244) {
			return false;
		} else if (local19.anInt8245 != this.anInt8245) {
			return false;
		} else if (local19.anInt8237 != this.anInt8237) {
			return false;
		} else if (this.anInt8243 != local19.anInt8243) {
			return false;
		} else if (this.anInt8238 != local19.anInt8238) {
			return false;
		} else if (local19.anInt8239 == this.anInt8239) {
			return this.aBoolean591 == local19.aBoolean591;
		} else {
			return false;
		}
	}
}
