import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class313 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	private int anInt9016;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "J")
	private long aLong250;

	static {
		new Class40("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!rf;)V")
	public Class313(@OriginalArg(0) Class253 arg0) {
		this.anInt9016 = 1;
		this.aLong250 = arg0.anInt7456;
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([Lclient!rf;)V")
	public Class313(@OriginalArg(0) Class253[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7298(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	public int method7295() {
		return this.anInt9016;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	private int method7296(@OriginalArg(0) int arg0) {
		return (int) (this.aLong250 >> Static422.anInt7460 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)Lclient!rf;")
	public Class253 method7297(@OriginalArg(0) int arg0) {
		return Static422.method6056()[this.method7296(arg0)];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!rf;I)V")
	private void method7298(@OriginalArg(0) Class253 arg0) {
		this.aLong250 |= arg0.anInt7456 << Static422.anInt7460 * this.anInt9016++;
	}
}
