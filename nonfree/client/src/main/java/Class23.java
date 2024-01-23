import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class23 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method545(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	public abstract int method546();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method548(@OriginalArg(0) Component arg0);
}
