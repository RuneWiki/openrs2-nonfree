import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class2_Sub4_Sub24 extends Class2_Sub4 {

	static {
		new Class32("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			Static399.method2490(local14, 0, Static76.anInt1458, Static347.anIntArray1193[arg0]);
		}
		return local14;
	}
}
