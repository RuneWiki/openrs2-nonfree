import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!le;)I")
	public abstract int method1781(@OriginalArg(0) Class3_Sub3_Sub2 arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public abstract void method1782();
}
