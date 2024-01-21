import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class Class6 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	public abstract int method558();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method559(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method562(@OriginalArg(1) Component arg0);
}
