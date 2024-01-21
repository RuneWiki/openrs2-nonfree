import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class16 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method1956(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1960(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public abstract int method1961();
}
