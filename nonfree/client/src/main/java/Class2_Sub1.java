import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	public abstract void method16();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qa;)I")
	public abstract int method17(@OriginalArg(0) Class2_Sub10_Sub2 arg0);
}
