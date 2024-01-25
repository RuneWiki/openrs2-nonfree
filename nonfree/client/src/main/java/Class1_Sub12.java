import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	public int anInt2155;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	private Class1_Sub12() {
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!nt;)I")
	public abstract int method1806(@OriginalArg(0) Class1_Sub7_Sub1 arg0);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "()V")
	public abstract void method1807();
}
