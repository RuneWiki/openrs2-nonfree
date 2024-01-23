import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class130 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method3213(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public abstract int method3215();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3217(@OriginalArg(1) Component arg0);
}
