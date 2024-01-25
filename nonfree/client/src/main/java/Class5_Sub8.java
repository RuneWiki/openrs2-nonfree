import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public abstract class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	private Class5_Sub8() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ms;)I")
	public abstract int method1041(@OriginalArg(0) Class5_Sub17_Sub3 arg0);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
	public abstract void method1042();
}
