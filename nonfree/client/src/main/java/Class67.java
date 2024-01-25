import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class Class67 {

	static {
		new Class117("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Lclient!uo;I)V")
	public abstract void method5395(@OriginalArg(0) Class129 arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	public abstract void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)Z")
	public abstract boolean method5399();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!uo;I)Z")
	public abstract boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	public abstract Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0);

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	public abstract void method5403();
}
