import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class56 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1307(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public abstract int method1309();

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1310(@OriginalArg(1) Component arg0);
}
