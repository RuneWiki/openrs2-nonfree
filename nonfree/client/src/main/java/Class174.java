import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class174 implements Interface11 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public int anInt4384;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	public int anInt4388;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public int anInt4390;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public int anInt4391;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt4392;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public int anInt4394;

	static {
		new Class169("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)J")
	@Override
	public long method3898() {
		@Pc(5) long[] local5 = Class43_Sub2.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt4394) & 0xFFL)] ^ local7 >>> 8;
		@Pc(44) long local44 = local5[(int) (((long) (this.anInt4390 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(59) long local59 = local44 >>> 8 ^ local5[(int) ((local44 ^ (long) this.anInt4390) & 0xFFL)];
		@Pc(76) long local76 = local59 >>> 8 ^ local5[(int) (((long) (this.anInt4388 >> 24) ^ local59) & 0xFFL)];
		@Pc(93) long local93 = local76 >>> 8 ^ local5[(int) (((long) (this.anInt4388 >> 16) ^ local76) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) (((long) (this.anInt4388 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local5[(int) (((long) this.anInt4388 ^ local110) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt4391) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local5[(int) (((long) (this.anInt4392 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local5[(int) ((local157 ^ (long) (this.anInt4392 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt4392 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt4392) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt4384 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean434 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!vk;)Z")
	@Override
	public boolean method3899(@OriginalArg(1) Interface11 arg0) {
		if (!(arg0 instanceof Class174)) {
			return false;
		}
		@Pc(11) Class174 local11 = (Class174) arg0;
		if (this.anInt4394 != local11.anInt4394) {
			return false;
		} else if (this.anInt4390 != local11.anInt4390) {
			return false;
		} else if (this.anInt4388 != local11.anInt4388) {
			return false;
		} else if (this.anInt4391 != local11.anInt4391) {
			return false;
		} else if (this.anInt4392 != local11.anInt4392) {
			return false;
		} else if (local11.anInt4384 == this.anInt4384) {
			return this.aBoolean434 == local11.aBoolean434;
		} else {
			return false;
		}
	}
}
