import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class Class36 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1610(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
	public abstract int method1611();

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1612(@OriginalArg(1) Component arg0);
}
