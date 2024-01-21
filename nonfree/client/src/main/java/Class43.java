import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class Class43 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2070(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	public abstract int method2072();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2074(@OriginalArg(0) Component arg0);
}
