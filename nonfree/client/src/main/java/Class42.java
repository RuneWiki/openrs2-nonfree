import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class42 implements Interface11 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt851;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt854;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	public int anInt862;

	static {
		new Class209("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)J")
	@Override
	public long method732() {
		@Pc(5) long[] local5 = Class2_Sub2_Sub21.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(29) long local29 = local5[(int) ((local7 ^ (long) this.anInt859) & 0xFFL)] ^ local7 >>> 8;
		@Pc(46) long local46 = local29 >>> 8 ^ local5[(int) (((long) (this.anInt854 >> 8) ^ local29) & 0xFFL)];
		@Pc(61) long local61 = local5[(int) ((local46 ^ (long) this.anInt854) & 0xFFL)] ^ local46 >>> 8;
		@Pc(78) long local78 = local61 >>> 8 ^ local5[(int) ((local61 ^ (long) (this.anInt856 >> 24)) & 0xFFL)];
		@Pc(95) long local95 = local5[(int) ((local78 ^ (long) (this.anInt856 >> 16)) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt856 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) (((long) this.anInt856 ^ local112) & 0xFFL)];
		@Pc(142) long local142 = local5[(int) (((long) this.anInt851 ^ local127) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) (((long) (this.anInt855 >> 24) ^ local142) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local5[(int) (((long) (this.anInt855 >> 16) ^ local159) & 0xFFL)] ^ local159 >>> 8;
		@Pc(193) long local193 = local5[(int) (((long) (this.anInt855 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local5[(int) (((long) this.anInt855 ^ local193) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local5[(int) (((long) this.anInt862 ^ local208) & 0xFFL)] ^ local208 >>> 8;
		return local223 >>> 8 ^ local5[(int) ((local223 ^ (long) (this.aBoolean44 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!sl;I)Z")
	@Override
	public boolean method731(@OriginalArg(0) Interface11 arg0) {
		if (!(arg0 instanceof Class42)) {
			return false;
		}
		@Pc(16) Class42 local16 = (Class42) arg0;
		if (local16.anInt859 != this.anInt859) {
			return false;
		} else if (local16.anInt854 != this.anInt854) {
			return false;
		} else if (local16.anInt856 != this.anInt856) {
			return false;
		} else if (local16.anInt851 != this.anInt851) {
			return false;
		} else if (local16.anInt855 != this.anInt855) {
			return false;
		} else if (this.anInt862 == local16.anInt862) {
			return this.aBoolean44 == local16.aBoolean44;
		} else {
			return false;
		}
	}
}
