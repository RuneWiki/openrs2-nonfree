import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public int anInt1696;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!cb;)I")
	public abstract int method1228(@OriginalArg(0) Class1_Sub10_Sub1 arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	public abstract void method1229();
}
