import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class31 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method945(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	public abstract int method947();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method949(@OriginalArg(1) Component arg0);
}
