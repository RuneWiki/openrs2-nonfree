import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class111 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3571(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)I")
	public abstract int method3572();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method3574(@OriginalArg(1) Component arg0);
}
