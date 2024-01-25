import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class106 {

	static {
		new Class221("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	protected Class106() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
	public abstract int method3051(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Lclient!po;")
	public abstract Class180 method3052();

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)V")
	public abstract void method3053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)[B")
	public abstract byte[] method3056(@OriginalArg(1) int arg0);
}
