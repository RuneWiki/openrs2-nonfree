import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class19 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1630(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
	public abstract int method1633();

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1634(@OriginalArg(1) Component arg0);
}
