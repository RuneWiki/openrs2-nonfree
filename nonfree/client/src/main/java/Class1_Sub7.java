import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class1_Sub7() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qf;)I")
	public abstract int method601(@OriginalArg(0) Class1_Sub31_Sub2 arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public abstract void method602();
}
