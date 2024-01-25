import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
	public int anInt3749;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	private Class5_Sub19() {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!oca;)I")
	public abstract int method3318(@OriginalArg(0) Class5_Sub16_Sub3 arg0);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
	public abstract void method3319();
}
