import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class47 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	public abstract int method1307();

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1308(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1309(@OriginalArg(0) Component arg0);
}
