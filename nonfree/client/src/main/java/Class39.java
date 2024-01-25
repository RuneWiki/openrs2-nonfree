import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class39 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3512(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method3514(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	public abstract int method3516();
}
