import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class5_Sub2_Sub10_Sub1 extends Class5_Sub2_Sub10 {

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!bg;Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub10_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method4853() {
		return false;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4847() {
		return this.anObject6;
	}
}
