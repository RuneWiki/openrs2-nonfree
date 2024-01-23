import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class24 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	public abstract int method731();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method733(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method736(@OriginalArg(1) Component arg0);
}
