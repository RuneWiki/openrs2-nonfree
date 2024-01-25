import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public final int anInt5401;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt5401 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
	public abstract boolean method4829();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4831();
}
