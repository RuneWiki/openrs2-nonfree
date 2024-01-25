import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class7_Sub4_Sub4_Sub1 extends Class7_Sub4_Sub4 {

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!rb;Ljava/lang/Object;I)V")
	public Class7_Sub4_Sub4_Sub1(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject4 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2643() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2644() {
		return false;
	}
}
