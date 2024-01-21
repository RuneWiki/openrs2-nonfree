import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class Class39 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public abstract int method2485();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2487(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method2490(@OriginalArg(1) Component arg0);
}
