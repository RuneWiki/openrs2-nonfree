import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class Class59 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1022(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I")
	public abstract int method1025();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1030(@OriginalArg(1) Component arg0);
}
