import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class6_Sub4_Sub1_Sub1 extends Class6_Sub4_Sub1 {

	@OriginalMember(owner = "client!bea", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!wt;Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub1_Sub1(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5716() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5714() {
		return this.anObject5;
	}
}
