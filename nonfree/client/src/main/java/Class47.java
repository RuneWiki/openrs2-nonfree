import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class47 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)I")
	public abstract int method1165();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method1166(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method1169(@OriginalArg(0) Component arg0);
}
