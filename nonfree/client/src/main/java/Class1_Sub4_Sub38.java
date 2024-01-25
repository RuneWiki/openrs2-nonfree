import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class1_Sub4_Sub38 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
	private int anInt7213 = 0;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
	private int anInt7222 = 4096;

	static {
		new Class119("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7213 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt7222 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(29) int[] local29 = this.method5695(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static395.anInt6592; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = local37 >= this.anInt7213 && local37 <= this.anInt7222 ? 4096 : 0;
			}
		}
		return local11;
	}
}
