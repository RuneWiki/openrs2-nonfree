import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class41 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	public abstract int method1728();

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1729(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1730(@OriginalArg(1) Component arg0);
}
