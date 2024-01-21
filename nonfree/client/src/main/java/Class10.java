import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class Class10 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method210(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method211(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)I")
	public abstract int method212();
}
