import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public abstract class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	public final int anInt6250;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt6250 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5221();

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(I)Z")
	public abstract boolean method5222();
}
