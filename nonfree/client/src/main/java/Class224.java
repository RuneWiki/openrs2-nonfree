import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class Class224 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)I")
	public abstract int method5332();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method5334(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method5336(@OriginalArg(1) Component arg0);
}
