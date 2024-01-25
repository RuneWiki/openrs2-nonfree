import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class24 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method439(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	public abstract int method442();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method444(@OriginalArg(0) Component arg0);
}
