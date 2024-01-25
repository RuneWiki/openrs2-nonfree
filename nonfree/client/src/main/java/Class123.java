import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class Class123 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method3696(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
	public abstract int method3697();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3698(@OriginalArg(1) Component arg0);
}
