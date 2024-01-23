import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class Class67 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	public abstract int method1968();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1969(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1970(@OriginalArg(1) Component arg0);
}
