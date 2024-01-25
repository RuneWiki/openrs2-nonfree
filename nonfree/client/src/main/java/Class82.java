import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class82 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2003(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
	public abstract int method2005();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2011(@OriginalArg(1) Component arg0);
}
