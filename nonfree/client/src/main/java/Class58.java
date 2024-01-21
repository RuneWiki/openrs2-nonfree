import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class58 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	public abstract int method1569();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method1570(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1576(@OriginalArg(0) Component arg0);
}
