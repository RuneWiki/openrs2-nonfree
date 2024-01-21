import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class Class6 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method53(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
	public abstract int method54();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method56(@OriginalArg(0) Component arg0);
}
