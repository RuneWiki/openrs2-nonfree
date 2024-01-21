import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class22 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method612(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
	public abstract int method618();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method620(@OriginalArg(0) Component arg0);
}
