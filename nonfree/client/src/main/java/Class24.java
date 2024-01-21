import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class24 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method692(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method694(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)I")
	public abstract int method699();
}
