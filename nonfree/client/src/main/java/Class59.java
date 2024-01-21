import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class59 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	public abstract int method1401();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1405(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1410(@OriginalArg(0) Component arg0);
}
