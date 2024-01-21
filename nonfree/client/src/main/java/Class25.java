import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class Class25 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	public abstract int method792();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method794(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method796(@OriginalArg(1) Component arg0);
}
