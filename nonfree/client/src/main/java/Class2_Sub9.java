import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	public int anInt1959;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public abstract void method1356();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!b;)I")
	public abstract int method1357(@OriginalArg(0) Class2_Sub2_Sub1 arg0);
}
