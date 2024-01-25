import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class5_Sub5_Sub3_Sub2 extends Class5_Sub5_Sub3 {

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!eq;Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub3_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject15 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6061() {
		return false;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6059() {
		return this.anObject15;
	}
}
