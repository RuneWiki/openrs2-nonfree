import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class73 implements Interface11 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	public int anInt1904;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
	public boolean aBoolean145;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	public int anInt1909;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	public int anInt1915;

	static {
		new Class57("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!wt;I)Z")
	@Override
	public boolean method1547(@OriginalArg(0) Interface11 arg0) {
		if (!(arg0 instanceof Class73)) {
			return false;
		}
		@Pc(17) Class73 local17 = (Class73) arg0;
		if (this.anInt1909 != local17.anInt1909) {
			return false;
		} else if (this.anInt1908 != local17.anInt1908) {
			return false;
		} else if (local17.anInt1915 != this.anInt1915) {
			return false;
		} else if (local17.anInt1903 != this.anInt1903) {
			return false;
		} else if (local17.anInt1905 != this.anInt1905) {
			return false;
		} else if (local17.anInt1904 == this.anInt1904) {
			return this.aBoolean145 == local17.aBoolean145;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)J")
	@Override
	public long method1546() {
		@Pc(5) long[] local5 = Class3_Sub1_Sub11.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt1909 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt1908 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local5[(int) ((local39 ^ (long) this.anInt1908) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt1915 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt1915 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt1915 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local105 >>> 8 ^ local5[(int) ((local105 ^ (long) this.anInt1915) & 0xFFL)];
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt1903) & 0xFFL)];
		@Pc(157) long local157 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt1905 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) (((long) (this.anInt1905 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) ((local174 ^ (long) (this.anInt1905 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local191 >>> 8 ^ local5[(int) (((long) this.anInt1905 ^ local191) & 0xFFL)];
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) (((long) this.anInt1904 ^ local206) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) ((local221 ^ (long) (this.aBoolean145 ? 1 : 0)) & 0xFFL)];
	}
}
