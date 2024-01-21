import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class17 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	public abstract int method625();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method629(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method630(@OriginalArg(1) Component arg0);
}
