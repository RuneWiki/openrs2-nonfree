import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class Class94 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public abstract int method5162();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public abstract void method5163(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method5164(@OriginalArg(0) Component arg0);
}
