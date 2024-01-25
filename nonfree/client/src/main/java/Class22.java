import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class22 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	public abstract int method3359();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3360(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method3362(@OriginalArg(1) Component arg0);
}
