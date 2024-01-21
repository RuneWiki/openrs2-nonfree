import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class61 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1931(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public abstract int method1935();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1938(@OriginalArg(0) Component arg0);
}
