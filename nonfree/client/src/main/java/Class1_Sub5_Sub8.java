import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class Class1_Sub5_Sub8 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
	public final int anInt3594;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub5_Sub8(@OriginalArg(0) int arg0) {
		this.anInt3594 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2923();

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)Z")
	public abstract boolean method2924();
}
