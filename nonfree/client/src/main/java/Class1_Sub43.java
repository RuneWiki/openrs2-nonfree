import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	private Class1_Sub43() {
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!qn;)I")
	public abstract int method5071(@OriginalArg(0) Class1_Sub7_Sub4 arg0);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public abstract void method5072();
}
