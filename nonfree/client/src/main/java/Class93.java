import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class Class93 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public abstract int method5587();

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5588(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method5590(@OriginalArg(1) Component arg0);
}
