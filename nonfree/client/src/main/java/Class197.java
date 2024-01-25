import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class197 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public int anInt5622;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt5623;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public int anInt5626;

	static {
		new Class231("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class197() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!hw;)V")
	public Class197(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aByte74 = arg0.method6120();
		this.anInt5623 = arg0.method6148();
		this.anInt5626 = arg0.method6129();
		this.anInt5620 = arg0.method6129();
		this.anInt5625 = arg0.method6129();
		this.anInt5622 = arg0.method6129();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
	public int method4468() {
		return this.aByte74 & 0x7;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method4469() {
		return (this.aByte74 & 0x8) == 8 ? 1 : 0;
	}
}
