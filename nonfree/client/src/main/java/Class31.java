import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class Class31 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2451(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
	public abstract int method2452();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2453(@OriginalArg(1) Component arg0);
}
