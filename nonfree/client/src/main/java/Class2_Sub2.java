import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public abstract void method110();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ta;)I")
	public abstract int method111(@OriginalArg(0) Class2_Sub10_Sub2 arg0);
}
