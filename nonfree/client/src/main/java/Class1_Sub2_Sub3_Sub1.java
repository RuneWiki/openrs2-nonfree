import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method2528() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2525() {
		return this.anObject3;
	}
}
