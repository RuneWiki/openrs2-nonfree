import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public abstract void method393();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ue;)I")
	public abstract int method394(@OriginalArg(0) Class5_Sub7_Sub3 arg0);
}
