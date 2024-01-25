import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class234 {

	static {
		new Class189(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I")
	public abstract int method5929();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5930(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method5931(@OriginalArg(1) Component arg0);
}
