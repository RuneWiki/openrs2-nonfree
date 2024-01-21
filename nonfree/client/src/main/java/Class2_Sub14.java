import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!w;)I")
	public abstract int method1905(@OriginalArg(0) Class2_Sub3_Sub2 arg0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public abstract void method1906();
}
