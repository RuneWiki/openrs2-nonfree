import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class62 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
	public abstract int method2133();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2135(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2137(@OriginalArg(0) Component arg0);
}
