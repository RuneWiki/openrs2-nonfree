import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class13 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method413(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	public abstract int method414();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method415(@OriginalArg(0) Component arg0);
}
