import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class72 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I")
	public abstract int method2197();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2198(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method2201(@OriginalArg(0) Component arg0);
}
