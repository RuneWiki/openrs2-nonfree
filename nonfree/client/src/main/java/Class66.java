import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class66 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
	public abstract int method1900();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1901(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1903(@OriginalArg(0) Component arg0);
}
