import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class2_Sub2_Sub10_Sub2 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!pe;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub10_Sub2(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7668() {
		return this.anObject20;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7664() {
		return false;
	}
}
