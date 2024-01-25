import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class6_Sub1_Sub1_Sub2 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject12;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!rl;Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub1_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject12 = arg1;
	}

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2976() {
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2975() {
		return this.anObject12;
	}
}
