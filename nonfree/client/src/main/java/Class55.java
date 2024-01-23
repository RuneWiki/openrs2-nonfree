import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class Class55 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1570(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
	public abstract int method1571();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method1572(@OriginalArg(1) Component arg0);
}
