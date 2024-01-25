import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class74 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I")
	public abstract int method1682();

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1683(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1685(@OriginalArg(0) Component arg0);
}
