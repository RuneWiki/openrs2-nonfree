import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class50 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2629(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)I")
	public abstract int method2631();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2634(@OriginalArg(0) Component arg0);
}
