import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public int anInt1314;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!r;)I")
	public abstract int method1005(@OriginalArg(0) Class2_Sub9_Sub4 arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public abstract void method1006();
}
