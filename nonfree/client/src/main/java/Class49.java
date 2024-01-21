import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class49 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	public static int[] anIntArray217 = new int[32];

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray217[local16] = local14 - 1;
			local14 += local14;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
	public abstract int method1441();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method1445(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method1446(@OriginalArg(0) Component arg0);
}
