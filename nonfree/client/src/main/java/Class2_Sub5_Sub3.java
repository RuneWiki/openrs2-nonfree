import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!of", name = "A", descriptor = "I")
	public final int anInt6428;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub5_Sub3(@OriginalArg(0) int arg0) {
		this.anInt6428 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
	public abstract boolean method5417();

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5418();
}
