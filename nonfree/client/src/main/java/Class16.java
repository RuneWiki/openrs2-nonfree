import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class Class16 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method788(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method789(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	public abstract int method790();
}
