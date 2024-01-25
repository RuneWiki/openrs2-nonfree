import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class Class110 {

	static {
		new Class142("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	protected Class110() {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
	public abstract boolean method3777(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BBII)V")
	public abstract void method3778(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB[BI)I")
	public abstract int method3779(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public abstract void method3781();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public abstract void method3782();
}
