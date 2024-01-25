import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public int anInt3202;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	private Class5_Sub20() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!of;)I")
	public abstract int method2824(@OriginalArg(0) Class5_Sub17_Sub4 arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public abstract void method2825();
}
