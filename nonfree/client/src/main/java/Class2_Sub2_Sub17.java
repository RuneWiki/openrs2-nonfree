import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
	private int anInt2877 = 4096;

	@OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
	private int anInt2883 = 0;

	static {
		new Class93("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt2883 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt2877 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(26) int[] local26 = this.method5876(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static339.anInt6735; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt2883 <= local34 && local34 <= this.anInt2877 ? 4096 : 0;
			}
		}
		return local16;
	}
}
