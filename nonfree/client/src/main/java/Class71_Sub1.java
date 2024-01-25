import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!nq;")
	public final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_1;

	static {
		new Class15("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
		new Class15("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ug;II[B)V")
	public Class71_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass65_Sub2_Sub1_1 = Static375.method4925(arg1, arg3, arg2, arg0);
		this.aClass65_Sub2_Sub1_1.method3589(false, false);
	}
}
