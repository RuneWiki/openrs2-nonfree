import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	private Class6_Sub19() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!lb;)I")
	public abstract int method2599(@OriginalArg(0) Class6_Sub10_Sub3 arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public abstract void method2600();
}
