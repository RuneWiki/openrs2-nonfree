import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class301 implements Interface2 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public int anInt8888;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
	public int anInt8890;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public int anInt8892;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	public int anInt8893;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public int anInt8894;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	public int anInt8895;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "Z")
	public boolean aBoolean671;

	static {
		new Class45("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!ada;)Z")
	@Override
	public boolean method7747(@OriginalArg(1) Interface2 arg0) {
		if (!(arg0 instanceof Class301)) {
			return false;
		}
		@Pc(19) Class301 local19 = (Class301) arg0;
		if (this.anInt8893 != local19.anInt8893) {
			return false;
		} else if (local19.anInt8894 != this.anInt8894) {
			return false;
		} else if (this.anInt8892 != local19.anInt8892) {
			return false;
		} else if (local19.anInt8888 != this.anInt8888) {
			return false;
		} else if (this.anInt8895 != local19.anInt8895) {
			return false;
		} else if (this.anInt8890 == local19.anInt8890) {
			return local19.aBoolean671 == this.aBoolean671;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)J")
	@Override
	public long method7746() {
		@Pc(5) long[] local5 = Class97_Sub3.aLongArray15;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt8893) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt8894 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt8894 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt8892 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt8892 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt8892 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt8892) & 0xFFL)];
		@Pc(135) long local135 = local5[(int) (((long) this.anInt8888 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) (((long) (this.anInt8895 >> 24) ^ local135) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) ((local152 ^ (long) (this.anInt8895 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(192) long local192 = local5[(int) ((local175 ^ (long) (this.anInt8895 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) (((long) this.anInt8895 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local5[(int) ((local207 ^ (long) this.anInt8890) & 0xFFL)] ^ local207 >>> 8;
		return local5[(int) ((local222 ^ (long) (this.aBoolean671 ? 1 : 0)) & 0xFFL)] ^ local222 >>> 8;
	}
}
