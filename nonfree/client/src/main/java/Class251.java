import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class251 {

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "F")
	public float aFloat102 = 1.0F;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "F")
	public float aFloat98 = 0.25F;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "F")
	public float aFloat103 = 1.0F;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "F")
	public final float aFloat101;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
	public final int anInt6716;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	public final int anInt6720;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	public final int anInt6719;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "F")
	public final float aFloat99;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public final int anInt6718;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!op;")
	public final Class21 aClass21_4;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
	public final int anInt6721;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public final int anInt6717;

	static {
		new Class221("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Class221("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class251() {
		this.aFloat101 = 1.2F;
		this.anInt6716 = -60;
		this.anInt6720 = 0;
		this.anInt6719 = -50;
		this.aFloat99 = 0.69921875F;
		this.anInt6718 = -50;
		this.aFloat100 = 1.1523438F;
		this.aClass21_4 = Static321.aClass21_2;
		this.anInt6721 = Static125.anInt2377;
		this.anInt6717 = Static16.anInt401;
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class251(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(16) int local16 = arg0.method4240();
		if (Static37.aBoolean52 && Static267.aClass82_6.method4532() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6717 = Static16.anInt401;
			} else {
				this.anInt6717 = arg0.method4239();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat100 = 1.1523438F;
			} else {
				this.aFloat100 = (float) arg0.method4245() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat99 = 0.69921875F;
			} else {
				this.aFloat99 = (float) arg0.method4245() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat101 = 1.2F;
			} else {
				this.aFloat101 = (float) arg0.method4245() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4239();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4245();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4245();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4245();
			}
			this.anInt6717 = Static16.anInt401;
			this.aFloat99 = 0.69921875F;
			this.aFloat100 = 1.1523438F;
			this.aFloat101 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6716 = -60;
			this.anInt6718 = -50;
			this.anInt6719 = -50;
		} else {
			this.anInt6718 = arg0.method4251();
			this.anInt6716 = arg0.method4251();
			this.anInt6719 = arg0.method4251();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6721 = Static125.anInt2377;
		} else {
			this.anInt6721 = arg0.method4239();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6720 = 0;
		} else {
			this.anInt6720 = arg0.method4245();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass21_4 = Static321.aClass21_2;
		} else {
			this.aClass21_4 = Static153.method2578(arg0.method4245(), arg0.method4245(), arg0.method4245(), arg0.method4245(), arg0.method4245(), arg0.method4245());
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method5740(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aFloat102 = (float) (arg0.method4240() * 8) / 255.0F;
		this.aFloat98 = (float) (arg0.method4240() * 8) / 255.0F;
		this.aFloat103 = (float) (arg0.method4240() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!ws;B)Z")
	public boolean method5741(@OriginalArg(0) Class251 arg0) {
		return arg0.anInt6717 == this.anInt6717 && this.aFloat100 == arg0.aFloat100 && this.aFloat99 == arg0.aFloat99 && arg0.aFloat101 == this.aFloat101 && arg0.aFloat98 == this.aFloat98 && arg0.aFloat102 == this.aFloat102 && arg0.aFloat103 == this.aFloat103 && arg0.anInt6721 == this.anInt6721 && arg0.anInt6720 == this.anInt6720 && arg0.aClass21_4 == this.aClass21_4;
	}
}
