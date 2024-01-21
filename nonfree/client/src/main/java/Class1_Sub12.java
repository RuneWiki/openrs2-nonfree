import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public int anInt1878;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!lg;)I")
	public abstract int method1346(@OriginalArg(0) Class1_Sub6_Sub1 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public abstract void method1347();
}
