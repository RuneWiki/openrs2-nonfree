import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_111 = new Class79("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ha;")
	public static Class2_Sub16 aClass2_Sub16_1 = null;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt5151 = 13156520;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/awt/Component;")
	private final Component aComponent3;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 123)
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 27)
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}
}
