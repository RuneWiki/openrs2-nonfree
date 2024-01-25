import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class131 implements Interface11 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt4121;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public int anInt4124;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	public int anInt4125;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public int anInt4126;

	static {
		new Class175("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)J")
	@Override
	public long method3376() {
		@Pc(10) long[] local10 = Class64_Sub1.aLongArray1;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) ((local12 ^ (long) this.anInt4120) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local27 >>> 8 ^ local10[(int) ((local27 ^ (long) (this.anInt4124 >> 8)) & 0xFFL)];
		@Pc(59) long local59 = local10[(int) (((long) this.anInt4124 ^ local44) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local10[(int) ((local59 ^ (long) (this.anInt4126 >> 24)) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local10[(int) (((long) (this.anInt4126 >> 16) ^ local76) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local10[(int) ((local93 ^ (long) (this.anInt4126 >> 8)) & 0xFFL)];
		@Pc(125) long local125 = local10[(int) (((long) this.anInt4126 ^ local110) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local10[(int) (((long) this.anInt4125 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local10[(int) (((long) (this.anInt4123 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local10[(int) (((long) (this.anInt4123 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local10[(int) (((long) (this.anInt4123 >> 8) ^ local174) & 0xFFL)];
		@Pc(206) long local206 = local10[(int) ((local191 ^ (long) this.anInt4123) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local10[(int) ((local206 ^ (long) this.anInt4121) & 0xFFL)] ^ local206 >>> 8;
		return local10[(int) (((long) (this.aBoolean327 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!s;)Z")
	@Override
	public boolean method3375(@OriginalArg(1) Interface11 arg0) {
		if (!(arg0 instanceof Class131)) {
			return false;
		}
		@Pc(11) Class131 local11 = (Class131) arg0;
		if (this.anInt4120 != local11.anInt4120) {
			return false;
		} else if (this.anInt4124 != local11.anInt4124) {
			return false;
		} else if (this.anInt4126 != local11.anInt4126) {
			return false;
		} else if (this.anInt4125 != local11.anInt4125) {
			return false;
		} else if (this.anInt4123 != local11.anInt4123) {
			return false;
		} else if (local11.anInt4121 == this.anInt4121) {
			return this.aBoolean327 == local11.aBoolean327;
		} else {
			return false;
		}
	}
}
