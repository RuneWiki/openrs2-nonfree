import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public int anInt1896;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	public abstract void method1550();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!t;)I")
	public abstract int method1551(@OriginalArg(0) Class2_Sub14_Sub4 arg0);
}
