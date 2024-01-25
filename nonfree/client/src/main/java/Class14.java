import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class14 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method209(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
	public abstract int method212();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method213(@OriginalArg(0) Component arg0);
}
