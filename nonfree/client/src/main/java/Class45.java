import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public abstract class Class45 {

	static {
		new Class119("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1288(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	public abstract int method1292();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1294(@OriginalArg(1) Component arg0);
}
