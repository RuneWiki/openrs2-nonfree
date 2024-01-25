import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
	public final int anInt2637;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt2637 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)Z")
	public abstract boolean method2337();

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2341();
}
