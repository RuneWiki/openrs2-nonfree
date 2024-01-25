import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class Class56 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method3754(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method3755(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
	public abstract int method3756();
}
