import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class3_Sub3_Sub11_Sub2 extends Class3_Sub3_Sub11 {

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject50;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!bga;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub11_Sub2(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject50 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6453() {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6452() {
		return this.anObject50;
	}
}
