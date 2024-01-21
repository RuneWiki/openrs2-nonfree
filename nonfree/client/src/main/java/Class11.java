import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class11 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2419(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2421(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)I")
	public abstract int method2427();
}
