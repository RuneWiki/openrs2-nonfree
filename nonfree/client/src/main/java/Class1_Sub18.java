import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt2798;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!aj;)I")
	public abstract int method2132(@OriginalArg(0) Class1_Sub3_Sub1 arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public abstract void method2133();
}
