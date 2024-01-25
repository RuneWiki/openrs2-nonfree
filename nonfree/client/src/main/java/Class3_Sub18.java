import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ru;)I")
	public abstract int method1817(@OriginalArg(0) Class3_Sub1_Sub2 arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	public abstract void method1818();
}
