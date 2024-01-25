import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class5_Sub3_Sub4_Sub2 extends Class5_Sub3_Sub4 {

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject23;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub3_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject23 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8131() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method8129() {
		return this.anObject23;
	}
}
