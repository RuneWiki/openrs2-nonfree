import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class41 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public abstract int method1725();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method1726(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1728(@OriginalArg(0) Component arg0);
}
