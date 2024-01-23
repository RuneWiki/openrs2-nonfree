import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!sc;)I")
	public abstract int method1659(@OriginalArg(0) Class2_Sub21_Sub3 arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	public abstract void method1660();
}
