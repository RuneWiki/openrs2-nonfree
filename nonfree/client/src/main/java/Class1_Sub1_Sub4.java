import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
	public final int anInt2155;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub1_Sub4(@OriginalArg(0) int arg0) {
		this.anInt2155 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method1756();

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Z")
	public abstract boolean method1758();
}
