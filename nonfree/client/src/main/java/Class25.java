import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class25 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2785(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2787(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
	public abstract int method2788();
}
