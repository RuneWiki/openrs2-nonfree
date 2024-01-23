import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class90 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
	public abstract int method3355();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method3356(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3358(@OriginalArg(1) Component arg0);
}
