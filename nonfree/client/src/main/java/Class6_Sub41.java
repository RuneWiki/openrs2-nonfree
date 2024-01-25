import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	private Class6_Sub41() {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
	public abstract void method6769();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!la;)I")
	public abstract int method6770(@OriginalArg(0) Class6_Sub4_Sub3 arg0);
}
