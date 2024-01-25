import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class52 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public abstract int method1038();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1043(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1044(@OriginalArg(0) Component arg0);
}
