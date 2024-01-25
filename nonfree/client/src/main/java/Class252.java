import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class252 implements Interface9 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[I")
	public static final int[] anIntArray560;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public int anInt7409;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public int anInt7410;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
	public boolean aBoolean634;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public int anInt7414;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public int anInt7415;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public int anInt7416;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public int anInt7417;

	static {
		new Class96("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		anIntArray560 = new int[256];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray560[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!qo;I)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Interface9 arg0) {
		if (!(arg0 instanceof Class252)) {
			return false;
		}
		@Pc(11) Class252 local11 = (Class252) arg0;
		if (this.anInt7410 != local11.anInt7410) {
			return false;
		} else if (local11.anInt7409 != this.anInt7409) {
			return false;
		} else if (this.anInt7415 != local11.anInt7415) {
			return false;
		} else if (this.anInt7416 != local11.anInt7416) {
			return false;
		} else if (local11.anInt7414 != this.anInt7414) {
			return false;
		} else if (local11.anInt7417 == this.anInt7417) {
			return local11.aBoolean634 == this.aBoolean634;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	@Override
	public long method5718() {
		@Pc(5) long[] local5 = Class1_Sub25.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt7410 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt7409 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt7409 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt7415 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt7415 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt7415 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) (((long) this.anInt7415 ^ local105) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt7416 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt7414 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local152 >>> 8 ^ local5[(int) ((local152 ^ (long) (this.anInt7414 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local5[(int) ((local174 ^ (long) (this.anInt7414 >> 8)) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local5[(int) ((local191 ^ (long) this.anInt7414) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local5[(int) (((long) this.anInt7417 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean634 ? 1 : 0) ^ local221) & 0xFFL)];
	}
}
