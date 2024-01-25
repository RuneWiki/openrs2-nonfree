import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class3_Sub6_Sub3_Sub2 extends Class3_Sub6_Sub3 {

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub6_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject16 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7027() {
		return this.anObject16;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7028() {
		return false;
	}
}
