import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class3 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I")
	public abstract int method67();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method71(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method75(@OriginalArg(1) Component arg0);
}
