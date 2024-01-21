import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class Class50 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1343(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	public abstract int method1344();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1349(@OriginalArg(1) Component arg0);
}
