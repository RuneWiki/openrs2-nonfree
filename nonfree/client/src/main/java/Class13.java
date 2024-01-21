import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class13 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
	public abstract int method1950();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1952(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1955(@OriginalArg(0) Component arg0);
}
