import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class42 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1635(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public abstract int method1636();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1639(@OriginalArg(1) Component arg0);
}
