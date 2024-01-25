import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	private Class6_Sub20() {
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "()V")
	public abstract void method3484();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!fk;)I")
	public abstract int method3485(@OriginalArg(0) Class6_Sub15_Sub1 arg0);
}
