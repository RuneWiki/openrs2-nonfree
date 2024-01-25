import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class84 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method2110(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2113(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public abstract int method2115();
}
