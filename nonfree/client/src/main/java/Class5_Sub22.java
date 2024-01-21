import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public int anInt2799;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	public abstract void method2078();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ub;)I")
	public abstract int method2079(@OriginalArg(0) Class5_Sub11_Sub4 arg0);
}
