import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt2602;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	private Class1_Sub17() {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!jo;)I")
	public abstract int method1894(@OriginalArg(0) Class1_Sub19_Sub2 arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
	public abstract void method1895();
}
