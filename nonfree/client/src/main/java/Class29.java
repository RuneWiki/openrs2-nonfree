import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class29 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method509(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method513(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	public abstract int method514();
}
