import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public abstract class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
	public int anInt9371;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	private Class2_Sub50() {
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ch;)I")
	public abstract int method7792(@OriginalArg(0) Class2_Sub10_Sub1 arg0);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "()V")
	public abstract void method7793();
}
