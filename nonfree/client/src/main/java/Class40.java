import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class40 implements Interface8 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
	public int anInt1237;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	public int anInt1239;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public int anInt1246;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Z")
	public boolean aBoolean88;

	static {
		new Class21("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!tp;I)Z")
	@Override
	public boolean method1151(@OriginalArg(0) Interface8 arg0) {
		if (!(arg0 instanceof Class40)) {
			return false;
		}
		@Pc(11) Class40 local11 = (Class40) arg0;
		if (this.anInt1237 != local11.anInt1237) {
			return false;
		} else if (this.anInt1239 != local11.anInt1239) {
			return false;
		} else if (local11.anInt1246 != this.anInt1246) {
			return false;
		} else if (this.anInt1238 != local11.anInt1238) {
			return false;
		} else if (this.anInt1245 != local11.anInt1245) {
			return false;
		} else if (this.anInt1244 == local11.anInt1244) {
			return this.aBoolean88 == local11.aBoolean88;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)J")
	@Override
	public long method1150() {
		@Pc(5) long[] local5 = Class150.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt1237) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt1239 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt1239) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt1246 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt1246 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt1246 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt1246) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt1238 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) (((long) (this.anInt1245 >> 24) ^ local135) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt1245 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local5[(int) ((local169 ^ (long) (this.anInt1245 >> 8)) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local5[(int) (((long) this.anInt1245 ^ local186) & 0xFFL)] ^ local186 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt1244 ^ local201) & 0xFFL)] ^ local201 >>> 8;
		return local5[(int) ((local221 ^ (long) (this.aBoolean88 ? 1 : 0)) & 0xFFL)] ^ local221 >>> 8;
	}
}
