import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class2_Sub2_Sub10_Sub2 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!kr;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub10_Sub2(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5325() {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5326() {
		return this.anObject7;
	}
}
