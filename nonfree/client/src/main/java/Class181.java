import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class181 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public int anInt5774;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public int anInt5775;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public int anInt5777;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int anInt5778;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
	public boolean aBoolean514;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public int anInt5788;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int anInt5779 = 16777215;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public int anInt5786 = 8;

	static {
		new Class93("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!dg;III)V")
	private void method5108(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5786 = arg0.method4464();
		} else if (arg2 == 2) {
			this.aBoolean514 = true;
		} else if (arg2 == 3) {
			this.anInt5777 = arg0.method4460();
			this.anInt5775 = arg0.method4460();
			this.anInt5788 = arg0.method4460();
		} else if (arg2 == 4) {
			this.anInt5778 = arg0.method4421();
		} else if (arg2 == 5) {
			this.anInt5774 = arg0.method4464();
		} else if (arg2 == 6) {
			this.anInt5779 = arg0.method4463();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!dg;II)V")
	public void method5112(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method4421();
			if (local9 == 0) {
				return;
			}
			this.method5108(arg0, arg1, local9);
		}
	}
}
