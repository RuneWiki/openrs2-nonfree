import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class Class56 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public abstract int method1640();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1642(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1644(@OriginalArg(0) Component arg0);
}
