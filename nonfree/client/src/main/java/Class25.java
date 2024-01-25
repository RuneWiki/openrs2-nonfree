import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class Class25 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5794(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
	public abstract int method5799();

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5800(@OriginalArg(0) Component arg0);
}
