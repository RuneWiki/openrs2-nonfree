import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class Class170 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5631(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method5632(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)I")
	public abstract int method5634();
}
