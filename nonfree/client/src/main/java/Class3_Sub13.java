import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!he;)I")
	public abstract int method1232(@OriginalArg(0) Class3_Sub10_Sub1 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public abstract void method1233();
}
