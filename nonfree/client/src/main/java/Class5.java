import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class Class5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3847(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3848(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	public abstract int method3852();
}
