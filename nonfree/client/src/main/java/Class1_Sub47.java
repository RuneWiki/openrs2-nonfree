import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public int anInt9408;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	private Class1_Sub47() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
	public abstract void method7669();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!bfa;)I")
	public abstract int method7670(@OriginalArg(0) Class1_Sub7_Sub1 arg0);
}
