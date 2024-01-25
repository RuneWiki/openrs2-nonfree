import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class Class3_Sub5_Sub10 extends Class3_Sub5 {

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
	public final int anInt5090;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub5_Sub10(@OriginalArg(0) int arg0) {
		this.anInt5090 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4379();

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)Z")
	public abstract boolean method4382();
}
