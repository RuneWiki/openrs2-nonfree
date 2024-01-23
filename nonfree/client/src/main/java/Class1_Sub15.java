import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public int anInt2786;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!pd;)I")
	public abstract int method2124(@OriginalArg(0) Class1_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	public abstract void method2125();
}
