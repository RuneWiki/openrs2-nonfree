import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class129 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method4450(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
	public abstract int method4451();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method4453(@OriginalArg(0) Component arg0);
}
