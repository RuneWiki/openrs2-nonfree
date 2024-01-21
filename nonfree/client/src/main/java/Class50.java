import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class Class50 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1232(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public abstract int method1234();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1237(@OriginalArg(1) Component arg0);
}
