import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class Class42 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method1036(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1038(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
	public abstract int method1039();
}
