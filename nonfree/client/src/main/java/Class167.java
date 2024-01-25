import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class167 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public int anInt4507;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public int anInt4511;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public int anInt4513;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	public int anInt4512 = 128;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private int anInt4510 = 0;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public int anInt4514 = -1;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Z")
	public boolean aBoolean338 = true;

	static {
		new Class221(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new Class221("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class221("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!lk;I)V")
	private void method3995(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4510 = arg0.method4235();
			this.method3998(this.anInt4510);
		} else if (arg1 == 2) {
			this.anInt4514 = arg0.method4245();
			if (this.anInt4514 == 65535) {
				this.anInt4514 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt4512 = arg0.method4245();
		} else if (arg1 == 4) {
			this.aBoolean338 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	private void method3998(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt4513 = (int) (local62 * 256.0D);
		this.anInt4507 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt4507 < 0) {
			this.anInt4507 = 0;
		} else if (this.anInt4507 > 255) {
			this.anInt4507 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4506 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt4506 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt4513 < 0) {
			this.anInt4513 = 0;
		} else if (this.anInt4513 > 255) {
			this.anInt4513 = 255;
		}
		if (this.anInt4506 < 1) {
			this.anInt4506 = 1;
		}
		this.anInt4511 = (int) (local60 * (double) this.anInt4506);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!lk;)V")
	public void method3999(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4240();
			if (local12 == 0) {
				return;
			}
			this.method3995(arg0, local12);
		}
	}
}
