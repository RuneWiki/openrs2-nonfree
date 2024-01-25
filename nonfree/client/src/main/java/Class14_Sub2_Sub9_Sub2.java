import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class14_Sub2_Sub9_Sub2 extends Class14_Sub2_Sub9 {

	@OriginalMember(owner = "client!or", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class14_Sub2_Sub9_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4169() {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4168() {
		return this.anObject3;
	}
}
