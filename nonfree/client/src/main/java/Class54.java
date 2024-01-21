import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class54 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1424(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1428(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)I")
	public abstract int method1429();
}
