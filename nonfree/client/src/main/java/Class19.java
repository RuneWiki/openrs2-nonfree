import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class Class19 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method1060(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1063(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
	public abstract int method1066();
}
