import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class2_Sub2_Sub6_Sub1 extends Class2_Sub2_Sub6 {

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!wf;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub6_Sub1(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6488() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6485() {
		return false;
	}
}
