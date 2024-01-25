import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!er", name = "H", descriptor = "I")
	public final int anInt2996;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub7_Sub4(@OriginalArg(0) int arg0) {
		this.anInt2996 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(B)Z")
	public abstract boolean method2647();

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2648();
}
