import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class Class118 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	public abstract int method4488();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method4489(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method4490(@OriginalArg(0) Component arg0);
}
