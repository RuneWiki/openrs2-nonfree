import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class Class30 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method681(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method685(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
	public abstract int method686();
}
