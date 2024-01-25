import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class72 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method2812(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public abstract int method2813();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method2815(@OriginalArg(1) Component arg0);
}
