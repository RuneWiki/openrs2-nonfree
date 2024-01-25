import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class153 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method5540(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5541(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public abstract int method5542();
}
