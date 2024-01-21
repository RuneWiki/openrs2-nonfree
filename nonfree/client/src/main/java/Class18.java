import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class Class18 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
	public abstract int method620();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method621(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method623(@OriginalArg(1) Component arg0);
}
