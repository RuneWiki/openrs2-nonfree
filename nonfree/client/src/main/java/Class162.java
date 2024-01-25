import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class162 {

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public int anInt4632;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "Lclient!db;")
	public Class47 aClass47_7;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
	public int anInt4630 = -1;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
	public int anInt4628 = 128;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public int anInt4627 = -1;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
	public int anInt4635 = 0;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Z")
	public boolean aBoolean319 = true;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	public int anInt4633 = 16;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
	public int anInt4634 = 127;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
	public int anInt4637 = 8;

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
	public int anInt4636 = -1;

	@OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
	public int anInt4639 = 1190717;

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "Z")
	public boolean aBoolean320 = true;

	static {
		new Class84("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!lh;Z)V")
	public void method3784(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method3786(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public void method3785() {
		if (this.anInt4630 == -1) {
			this.anInt4630 = this.anInt4636;
		}
		this.anInt4637 = this.anInt4637 << 8 | this.anInt4632;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZLclient!lh;)V")
	private void method3786(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt4635 = Static450.method6018(arg1.method4142());
		} else if (arg0 == 2) {
			this.anInt4636 = arg1.method4130();
		} else if (arg0 == 3) {
			this.anInt4636 = arg1.method4093();
			if (this.anInt4636 == 65535) {
				this.anInt4636 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean320 = false;
		} else if (arg0 == 7) {
			this.anInt4627 = Static450.method6018(arg1.method4142());
		} else if (arg0 == 8) {
			this.aClass47_7.anInt1363 = this.anInt4632;
		} else if (arg0 == 9) {
			this.anInt4628 = arg1.method4093() << 0;
		} else if (arg0 == 10) {
			this.aBoolean319 = false;
		} else if (arg0 == 11) {
			this.anInt4637 = arg1.method4130();
		} else if (arg0 == 12) {
			this.aBoolean318 = true;
		} else if (arg0 == 13) {
			this.anInt4639 = arg1.method4142();
		} else if (arg0 == 14) {
			this.anInt4633 = arg1.method4130();
		} else if (arg0 == 15) {
			this.anInt4630 = arg1.method4093();
			if (this.anInt4630 == 65535) {
				this.anInt4630 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt4634 = arg1.method4130();
		}
	}
}
