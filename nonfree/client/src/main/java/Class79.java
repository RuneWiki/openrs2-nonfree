import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class79 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I")
	public abstract int method2204();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2206(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2207(@OriginalArg(0) Component arg0);
}
