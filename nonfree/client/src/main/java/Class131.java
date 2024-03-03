import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class131 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_145 = new Class145(51, 0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method3692(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method3693(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
	public abstract int method3694();
}
