import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class38 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1563(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1568(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
	public abstract int method1569();
}
