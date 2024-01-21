import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	public abstract int method1234();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1236(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1238(@OriginalArg(0) Component arg0);
}
