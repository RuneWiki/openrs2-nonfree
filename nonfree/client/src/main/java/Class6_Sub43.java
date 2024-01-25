import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	public int anInt9258;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	private Class6_Sub43() {
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
	public abstract void method7875();

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!aga;)I")
	public abstract int method7876(@OriginalArg(0) Class6_Sub3_Sub1 arg0);
}
