import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	public abstract void method167();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!se;)I")
	public abstract int method168(@OriginalArg(0) Class2_Sub2_Sub4 arg0);
}
