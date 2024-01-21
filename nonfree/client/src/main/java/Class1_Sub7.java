import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public int anInt1029;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!a;)I")
	public abstract int method768(@OriginalArg(0) Class1_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public abstract void method769();
}
