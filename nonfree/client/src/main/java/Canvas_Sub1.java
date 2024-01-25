import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Ljava/awt/Component;")
	private final Component aComponent3;

	static {
		new Class119("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}
}
