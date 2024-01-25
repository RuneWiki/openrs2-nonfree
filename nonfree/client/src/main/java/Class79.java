import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class79 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method4264(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	public abstract int method4266();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method4267(@OriginalArg(0) Component arg0);
}
