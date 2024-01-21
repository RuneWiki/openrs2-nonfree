import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class51 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2403(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
	public abstract int method2405();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method2406(@OriginalArg(0) Component arg0);
}
