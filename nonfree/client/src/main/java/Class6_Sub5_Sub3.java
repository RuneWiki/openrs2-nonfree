import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class Class6_Sub5_Sub3 extends Class6_Sub5 {

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
	public final int anInt3508;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub5_Sub3(@OriginalArg(0) int arg0) {
		this.anInt3508 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method2977();

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)Z")
	public abstract boolean method2980();
}
