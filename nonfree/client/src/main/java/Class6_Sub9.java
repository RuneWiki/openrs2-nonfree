import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public int anInt1026;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	private Class6_Sub9() {
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!rh;)I")
	public abstract int method1048(@OriginalArg(0) Class6_Sub18_Sub4 arg0);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	public abstract void method1049();
}
