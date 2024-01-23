import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class Class64 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
	public abstract int method1850();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1851(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1852(@OriginalArg(0) Component arg0);
}
