import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "()V")
	public abstract void method1594();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!vd;)I")
	public abstract int method1595(@OriginalArg(0) Class2_Sub5_Sub3 arg0);
}
