import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class Class29 {

	static {
		new Class106("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2775(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2778(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	public abstract int method2781();
}
