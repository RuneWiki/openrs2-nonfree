import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class9 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method194(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
	public abstract int method195();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method196(@OriginalArg(1) Component arg0);
}
