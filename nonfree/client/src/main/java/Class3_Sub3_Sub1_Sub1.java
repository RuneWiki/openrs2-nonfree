import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class3_Sub3_Sub1_Sub1 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!am", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!s;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4560() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4558() {
		return false;
	}
}
