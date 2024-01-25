import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class Class22 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method506(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method507(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	public abstract int method509();
}
