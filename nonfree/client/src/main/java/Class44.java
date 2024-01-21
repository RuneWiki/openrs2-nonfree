import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class44 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method2285(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	public abstract int method2286();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method2287(@OriginalArg(1) Component arg0);
}
