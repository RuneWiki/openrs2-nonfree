import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class Class53 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1443(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	public abstract int method1447();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1448(@OriginalArg(0) Component arg0);
}
