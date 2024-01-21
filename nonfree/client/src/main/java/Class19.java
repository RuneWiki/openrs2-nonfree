import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class19 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method1356(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public abstract int method1357();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1360(@OriginalArg(0) Component arg0);
}
