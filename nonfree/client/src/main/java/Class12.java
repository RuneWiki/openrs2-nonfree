import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class12 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	public abstract int method266();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method267(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method268(@OriginalArg(0) Component arg0);
}
