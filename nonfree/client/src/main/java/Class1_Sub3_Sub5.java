import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
	public final int anInt6283;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub3_Sub5(@OriginalArg(0) int arg0) {
		this.anInt6283 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5070();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
	public abstract boolean method5072();
}
