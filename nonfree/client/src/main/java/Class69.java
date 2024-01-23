import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class Class69 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
	public abstract int method1694();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1697(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method1699(@OriginalArg(0) Component arg0);
}
