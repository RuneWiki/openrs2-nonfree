import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	public final int anInt348;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub2_Sub1(@OriginalArg(0) int arg0) {
		this.anInt348 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(Z)Z")
	public abstract boolean method300();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method302();
}
