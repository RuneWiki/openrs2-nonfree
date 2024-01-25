import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	public int anInt2739;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	private Class1_Sub21() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!se;)I")
	public abstract int method2411(@OriginalArg(0) Class1_Sub6_Sub3 arg0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public abstract void method2412();
}
