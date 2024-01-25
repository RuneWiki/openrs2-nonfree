import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class10_Sub1_Sub5_Sub1 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!ws;Ljava/lang/Object;I)V")
	public Class10_Sub1_Sub5_Sub1(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3395() {
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3394() {
		return this.anObject5;
	}
}
