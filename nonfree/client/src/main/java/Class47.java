import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class47 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2872(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2873(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public abstract int method2875();
}
