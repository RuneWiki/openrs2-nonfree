import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class29 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method2106(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
	public abstract int method2109();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method2110(@OriginalArg(1) Component arg0);
}
