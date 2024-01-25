import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class2_Sub9() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!cc;)I")
	public abstract int method935(@OriginalArg(0) Class2_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	public abstract void method936();
}
